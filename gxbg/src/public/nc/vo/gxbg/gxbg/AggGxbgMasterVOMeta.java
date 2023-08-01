package nc.vo.gxbg.gxbg;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggGxbgMasterVOMeta  extends AbstractBillMeta{
	
	public AggGxbgMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.gxbg.gxbg.GxbgMasterVO.class);
    }

}
