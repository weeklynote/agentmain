package agent.inst;

import java.io.IOException;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

public class JavaMain {

	public static void main(String[] args) throws AttachNotSupportedException, IOException, AgentLoadException, AgentInitializationException {
		System.out.println(args[0]);
		VirtualMachine vm = VirtualMachine.attach(args[0]);
        vm.loadAgent("/Users/liujin/workspace/AgentInstrumentation/agent.jar");
	}

}
