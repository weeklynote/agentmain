package agent.inst;

import java.lang.instrument.Instrumentation;

public class AgentInstrumentation {

    public static void agentmain(String agentArgs, Instrumentation inst) {
        System.out.println("Hello, I'm agent");
        Class<?>[] cls = inst.getAllLoadedClasses();
        for(Class<?> c : cls){
        	System.out.println("Loaded class is " + c.getSimpleName());
        }    
    }
}
