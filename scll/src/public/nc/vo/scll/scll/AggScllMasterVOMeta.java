package nc.vo.scll.scll;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggScllMasterVOMeta  extends AbstractBillMeta{
	
	public AggScllMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.scll.scll.ScllMasterVO.class);
            this.addChildren(nc.vo.scll.scll.ScllSlave0VO.class);
    }

}
