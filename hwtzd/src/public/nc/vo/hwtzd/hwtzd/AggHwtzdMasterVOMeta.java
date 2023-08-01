package nc.vo.hwtzd.hwtzd;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggHwtzdMasterVOMeta  extends AbstractBillMeta{
	
	public AggHwtzdMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.hwtzd.hwtzd.HwtzdMasterVO.class);
            this.addChildren(nc.vo.hwtzd.hwtzd.HwtzdSlave0VO.class);
    }

}
