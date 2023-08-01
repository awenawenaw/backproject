package nc.vo.gxth.gxth;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggGxthMasterVOMeta  extends AbstractBillMeta{
	
	public AggGxthMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.gxth.gxth.GxthMasterVO.class);
            this.addChildren(nc.vo.gxth.gxth.GxthSlave0VO.class);
    }

}
