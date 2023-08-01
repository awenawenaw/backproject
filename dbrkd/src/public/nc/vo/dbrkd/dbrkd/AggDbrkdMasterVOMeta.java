package nc.vo.dbrkd.dbrkd;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggDbrkdMasterVOMeta  extends AbstractBillMeta{
	
	public AggDbrkdMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.dbrkd.dbrkd.DbrkdMasterVO.class);
            this.addChildren(nc.vo.dbrkd.dbrkd.DbrkdSlave0VO.class);
    }

}
