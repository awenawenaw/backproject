package nccloud.web.wsh.lsgyjcd.lsgyjcdmaster.action;

import nccloud.web.platform.print.AbstractPrintAction;

public class PrintLsgyjcdMasterVOAction extends AbstractPrintAction{

	@Override
	public String getPrintServiceModule() {
		return "wsh";
	}
	
	@Override
	public String getPrintServiceName() {
		return "nc.impl.wsh.lsgyjcd.lsgyjcdmaster.AggLsgyjcdMasterVOPrintServiceImpl";
	}
}