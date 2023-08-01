package nc.vo.qcysdgxwx.qcysdgxwx;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggQcysdgxwxMasterVOMeta  extends AbstractBillMeta{
	
	public AggQcysdgxwxMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.qcysdgxwx.qcysdgxwx.QcysdgxwxMasterVO.class);
    }

}
