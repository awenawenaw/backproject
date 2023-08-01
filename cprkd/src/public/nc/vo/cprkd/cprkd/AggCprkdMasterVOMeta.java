package nc.vo.cprkd.cprkd;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggCprkdMasterVOMeta  extends AbstractBillMeta{
	
	public AggCprkdMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.cprkd.cprkd.CprkdMasterVO.class);
    }

}
