package nc.vo.zclht.zclht;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggZclhtMasterVOMeta  extends AbstractBillMeta{
	
	public AggZclhtMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.zclht.zclht.ZclhtMasterVO.class);
            this.addChildren(nc.vo.zclht.zclht.Zclhtxdfxx.class);
            this.addChildren(nc.vo.zclht.zclht.ZclhtXmxx.class);
            this.addChildren(nc.vo.zclht.zclht.ZclhtYsxx.class);
            this.addChildren(nc.vo.zclht.zclht.ZclhtJhskxx.class);
            this.addChildren(nc.vo.zclht.zclht.ZclhtSjskxx.class);
            this.addChildren(nc.vo.zclht.zclht.ZclhtJhfkxx.class);
            this.addChildren(nc.vo.zclht.zclht.ZclhtSjfkxx.class);
            this.addChildren(nc.vo.zclht.zclht.ZclhtHtwbxx.class);
    }

}
