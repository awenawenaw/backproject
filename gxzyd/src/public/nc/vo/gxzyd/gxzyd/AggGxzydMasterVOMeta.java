package nc.vo.gxzyd.gxzyd;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggGxzydMasterVOMeta  extends AbstractBillMeta{
	
	public AggGxzydMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.gxzyd.gxzyd.GxzydMasterVO.class);
    }

}
