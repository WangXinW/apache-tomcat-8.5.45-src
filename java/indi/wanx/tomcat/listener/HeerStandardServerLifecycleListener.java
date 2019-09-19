package indi.wanx.tomcat.listener;

import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;

public class HeerStandardServerLifecycleListener implements LifecycleListener{

	@Override
	public void lifecycleEvent(LifecycleEvent paramLifecycleEvent) {
		String type = "";
		if (null != paramLifecycleEvent && null != paramLifecycleEvent.getType()) {
			type = paramLifecycleEvent.getType();
		}
		System.out.println("#################HeerStandardServerLifecycleListener:Tomcat " + type);
	}

}
