package nc.vo.wsh.xsckd;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggXsckdMasterVOMeta  extends AbstractBillMeta{
	
	public AggXsckdMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.wsh.xsckd.XsckdMasterVO.class);
            this.addChildren(nc.vo.wsh.xsckd.XsckdSlave0VO.class);
    }

}
