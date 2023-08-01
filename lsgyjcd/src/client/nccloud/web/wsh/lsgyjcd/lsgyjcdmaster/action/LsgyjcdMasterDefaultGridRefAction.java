
package nccloud.web.wsh.lsgyjcd.lsgyjcdmaster.action;

import nc.itf.org.IOrgResourceCodeConst;
import nccloud.framework.web.processor.refgrid.RefQueryInfo;
import nccloud.framework.web.ui.meta.RefMeta;
import nccloud.web.refer.DefaultGridRefAction;

/**
 * 
 * 默认表格参照
 * 
 * @author zx
 * 
 */
public class LsgyjcdMasterDefaultGridRefAction extends DefaultGridRefAction {
	
	public LsgyjcdMasterDefaultGridRefAction() {
		super();
		setResourceCode(IOrgResourceCodeConst.ORG);
	}

	@Override
	public RefMeta getRefMeta(RefQueryInfo refQueryInfo) {
		RefMeta refMeta = new RefMeta();		
		setResourceCode(IOrgResourceCodeConst.ORG);
		refMeta.setCodeField("code");
		refMeta.setNameField("name");
		
		refMeta.setPkField("pk_lsgyjcdmaster");
		refMeta.setTableName("wsh_lsgyjcdmaster");
		refMeta.setMutilLangNameRef(true);
		return refMeta;
	}

}
