
package nc.impl.wsh.qtcksq.qtcksqmaster;

import nc.ui.pub.print.IDataSource;
import nccloud.pubitf.platform.print.AbstractPrintService;
import nccloud.pubitf.platform.print.IPrintInfo;
import nccloud.pubitf.platform.print.vo.PrintInfo;

public class AggQtcksqMasterVOPrintServiceImpl extends AbstractPrintService {
	
	@Override
    public IDataSource[] getDataSources(IPrintInfo info) {
        PrintInfo printinfo = (PrintInfo) info;
        String[] ids = printinfo.getIds();
        AggQtcksqMasterVOPrintDataSource ds = new AggQtcksqMasterVOPrintDataSource(ids);
       	return new IDataSource[] { ds };
       
    }
}