
package nc.impl.wsh.gxzyd.gxzydmaster;

import nc.ui.pub.print.IDataSource;
import nccloud.pubitf.platform.print.AbstractPrintService;
import nccloud.pubitf.platform.print.IPrintInfo;
import nccloud.pubitf.platform.print.vo.PrintInfo;

public class AggGxzydMasterVOPrintServiceImpl extends AbstractPrintService {
	
	@Override
    public IDataSource[] getDataSources(IPrintInfo info) {
        PrintInfo printinfo = (PrintInfo) info;
        String[] ids = printinfo.getIds();
        AggGxzydMasterVOPrintDataSource ds = new AggGxzydMasterVOPrintDataSource(ids);
       	return new IDataSource[] { ds };
       
    }
}