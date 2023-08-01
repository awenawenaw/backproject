package nc.vo.clqr.clqr;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggClqrMasterVOMeta  extends AbstractBillMeta{
	
	public AggClqrMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.clqr.clqr.ClqrMasterVO.class);
            this.addChildren(nc.vo.clqr.clqr.ClqrSlave0VO.class);
    }

}
