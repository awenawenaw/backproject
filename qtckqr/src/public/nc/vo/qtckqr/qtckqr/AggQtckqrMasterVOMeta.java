package nc.vo.qtckqr.qtckqr;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggQtckqrMasterVOMeta  extends AbstractBillMeta{
	
	public AggQtckqrMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.qtckqr.qtckqr.QtckqrMasterVO.class);
            this.addChildren(nc.vo.qtckqr.qtckqr.QtckqrSlave0VO.class);
    }

}
