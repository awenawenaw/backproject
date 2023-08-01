package nc.vo.htgjzb.htgjzb;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.htgjzb.htgjzb.HtgjzbMasterVO;

/**
 * 单子表/单表头/单表体聚合VO
 * <p>
 * 创建日期:
 *
 * @author
 * @version NCPrj ??
 */
@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.htgjzb.htgjzb.HtgjzbMasterVO")
public class AggHtgjzbMasterVO extends AbstractBill {

    private static final long serialVersionUID = 1309613813878961316L;

    @Override
    public IBillMeta getMetaData() {
        IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(AggHtgjzbMasterVOMeta.class);
        return billMeta;
    }

    @Override
    public HtgjzbMasterVO getParentVO() {
        return (HtgjzbMasterVO) this.getParent();
    }

    @Override
    public String getPrimaryKey() {
        return super.getPrimaryKey();
    }

}
