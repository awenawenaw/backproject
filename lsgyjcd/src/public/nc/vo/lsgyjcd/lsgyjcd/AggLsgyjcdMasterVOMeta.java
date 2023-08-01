package nc.vo.lsgyjcd.lsgyjcd;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggLsgyjcdMasterVOMeta  extends AbstractBillMeta{
	
	public AggLsgyjcdMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.lsgyjcd.lsgyjcd.LsgyjcdMasterVO.class);
            this.addChildren(nc.vo.lsgyjcd.lsgyjcd.LsgyjcdGxsmVO.class);
    }

}
