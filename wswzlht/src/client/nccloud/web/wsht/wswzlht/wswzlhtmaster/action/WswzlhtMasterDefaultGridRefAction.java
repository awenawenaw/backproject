
package nccloud.web.wsht.wswzlht.wswzlhtmaster.action;

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
public class WswzlhtMasterDefaultGridRefAction extends DefaultGridRefAction {
	
	public WswzlhtMasterDefaultGridRefAction() {
		super();
		setResourceCode(IOrgResourceCodeConst.ORG);
	}

	@Override
	public RefMeta getRefMeta(RefQueryInfo refQueryInfo) {
		RefMeta refMeta = new RefMeta();		
		setResourceCode(IOrgResourceCodeConst.ORG);
		refMeta.setCodeField("code");
		refMeta.setNameField("");
		
		refMeta.setPkField("pk_wswzlhtmaster");
		refMeta.setTableName("wsht_wswzlhtmaster");
		refMeta.setMutilLangNameRef(true);
		return refMeta;
	}

}
