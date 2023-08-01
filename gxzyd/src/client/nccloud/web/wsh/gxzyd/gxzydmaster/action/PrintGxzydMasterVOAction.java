package nccloud.web.wsh.gxzyd.gxzydmaster.action;

import nccloud.web.platform.print.AbstractPrintAction;

public class PrintGxzydMasterVOAction extends AbstractPrintAction{

	@Override
	public String getPrintServiceModule() {
		return "wsh";
	}
	
	@Override
	public String getPrintServiceName() {
		return "nc.impl.wsh.gxzyd.gxzydmaster.AggGxzydMasterVOPrintServiceImpl";
	}
}