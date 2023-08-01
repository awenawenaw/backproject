package nc.vo.htgjzb.htgjzb;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggHtgjzbMasterVOMeta extends AbstractBillMeta {

    public AggHtgjzbMasterVOMeta() {
        this.init();
    }

    private void init() {
        this.setParent(nc.vo.htgjzb.htgjzb.HtgjzbMasterVO.class);
        this.addChildren(nc.vo.htgjzb.htgjzb.Xdfxx.class);
        this.addChildren(nc.vo.htgjzb.htgjzb.xXmxx.class);
        this.addChildren(nc.vo.htgjzb.htgjzb.Ysxx.class);
        this.addChildren(nc.vo.htgjzb.htgjzb.Jhskxx.class);
        this.addChildren(nc.vo.htgjzb.htgjzb.Sjskxx.class);
        this.addChildren(nc.vo.htgjzb.htgjzb.Jhfkxx.class);
        this.addChildren(nc.vo.htgjzb.htgjzb.Sjfkxx.class);
        this.addChildren(nc.vo.htgjzb.htgjzb.Htwbxx.class);
    }

}
