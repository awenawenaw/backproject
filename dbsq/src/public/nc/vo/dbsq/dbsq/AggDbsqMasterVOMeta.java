package nc.vo.dbsq.dbsq;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggDbsqMasterVOMeta  extends AbstractBillMeta{
	
	public AggDbsqMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.dbsq.dbsq.DbsqMasterVO.class);
            this.addChildren(nc.vo.dbsq.dbsq.DbsqSlave0VO.class);
    }

}
