
package nccloud.web.pmbd.htgjzb.htgjzbmaster.action;

import nc.itf.org.IOrgResourceCodeConst;
import nccloud.framework.web.processor.refgrid.RefQueryInfo;
import nccloud.framework.web.ui.meta.RefMeta;
import nccloud.web.refer.DefaultGridRefAction;

/**
 * 默认表格参照
 *
 * @author zx
 */
public class HtgjzbMasterDefaultGridRefAction extends DefaultGridRefAction {

    public HtgjzbMasterDefaultGridRefAction() {
        super();
        setResourceCode(IOrgResourceCodeConst.ORG);
    }

    @Override
    public RefMeta getRefMeta(RefQueryInfo refQueryInfo) {
        RefMeta refMeta = new RefMeta();
        setResourceCode(IOrgResourceCodeConst.ORG);
        refMeta.setCodeField("code");
        refMeta.setNameField("");

        refMeta.setPkField("pk_htgjzbmaster");
        refMeta.setTableName("pmbd_htgjzbmaster");
        refMeta.setMutilLangNameRef(true);
        return refMeta;
    }

}
