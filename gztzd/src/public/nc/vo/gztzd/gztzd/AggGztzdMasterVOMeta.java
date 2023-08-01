package nc.vo.gztzd.gztzd;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggGztzdMasterVOMeta  extends AbstractBillMeta{
	
	public AggGztzdMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.gztzd.gztzd.GztzdMasterVO.class);
            this.addChildren(nc.vo.gztzd.gztzd.GztzdSlave0VO.class);
    }

}
