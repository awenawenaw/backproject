package nc.vo.srlht.srlht;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggSrlhtMasterVOMeta  extends AbstractBillMeta{
	
	public AggSrlhtMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.srlht.srlht.SrlhtMasterVO.class);
            this.addChildren(nc.vo.srlht.srlht.SrlhtXdfxx.class);
            this.addChildren(nc.vo.srlht.srlht.SrlhtXmxx.class);
            this.addChildren(nc.vo.srlht.srlht.SrlhtYsxx.class);
            this.addChildren(nc.vo.srlht.srlht.SrlhtJhskxx.class);
            this.addChildren(nc.vo.srlht.srlht.SrlhtSjskxx.class);
            this.addChildren(nc.vo.srlht.srlht.SrlhtJhfkxx.class);
            this.addChildren(nc.vo.srlht.srlht.SrlhtSjfkxx.class);
            this.addChildren(nc.vo.srlht.srlht.Htwbxx.class);
    }

}
