package nccloud.web.wsh.qtcksq.qtcksqmaster.action;

import nccloud.web.platform.print.AbstractPrintAction;

public class PrintQtcksqMasterVOAction extends AbstractPrintAction{

	@Override
	public String getPrintServiceModule() {
		return "wsh";
	}
	
	@Override
	public String getPrintServiceName() {
		return "nc.impl.wsh.qtcksq.qtcksqmaster.AggQtcksqMasterVOPrintServiceImpl";
	}
}