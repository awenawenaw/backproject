package nc.vo.dbckd.dbckd;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggDbckdMasterVOMeta  extends AbstractBillMeta{
	
	public AggDbckdMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.dbckd.dbckd.DbckdMasterVO.class);
            this.addChildren(nc.vo.dbckd.dbckd.DbckdSlave0VO.class);
    }

}
