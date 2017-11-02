package agent.inst;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class TargetVM {

	public static void main(String[] args) {
		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
	    int pid = Integer.valueOf(runtimeMXBean.getName().split("@")[0]).intValue();
	    System.out.println(pid);
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
