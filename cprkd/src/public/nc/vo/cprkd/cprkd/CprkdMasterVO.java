package nc.vo.cprkd.cprkd;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class CprkdMasterVO extends SuperVO {

	//构造方法
	public CprkdMasterVO() {
		super();
	}


    private java.lang.String pk_cprkdmaster  ;
    private java.lang.String pk_org  ;
    private java.lang.String pk_group  ;
    private java.lang.String code  ;
    private java.lang.String pk_org_v  ;
    private nc.vo.pub.lang.UFDateTime maketime  ;
    private nc.vo.pub.lang.UFDateTime lastmaketime  ;
    private java.lang.String creator  ;
    private nc.vo.pub.lang.UFDateTime creationtime  ;
    private java.lang.String modifier  ;
    private nc.vo.pub.lang.UFDateTime modifiedtime  ;
    private java.lang.String rowno  ;
    private java.lang.String srcrowno  ;
    private java.lang.String name  ;
    private java.lang.String gyjcdbarcode  ;
    private java.lang.String mobillcode  ;
    private java.lang.String inwhperson  ;
    private nc.vo.pub.lang.UFDateTime inwhtime  ;
    private java.lang.String gyjcdcode  ;
    private java.lang.String material  ;
    private java.lang.String materialname  ;
    private java.lang.String invstd  ;
    private java.lang.String warehouse  ;
    private java.lang.String position  ;
    private nc.vo.pub.lang.UFDouble inqty  ;
    private java.lang.String batchno  ;
    private java.lang.String certifino  ;
    private java.lang.String vdef1  ;
    private java.lang.String vdef2  ;
    private java.lang.String vdef3  ;
    private java.lang.String vdef4  ;
    private java.lang.String vdef5  ;
    private java.lang.String vdef6  ;
    private java.lang.String vdef7  ;
    private java.lang.String vdef8  ;
    private java.lang.String vdef9  ;
    private java.lang.String vdef10  ;
    private java.lang.String vdef11  ;
    private java.lang.String vdef12  ;
    private java.lang.String vdef13  ;
    private java.lang.String vdef14  ;
    private java.lang.String vdef15  ;
    private java.lang.String vdef16  ;
    private java.lang.String vdef17  ;
    private java.lang.String vdef18  ;
    private java.lang.String vdef19  ;
    private java.lang.String vdef20  ;
    private java.lang.Integer dr  ;
    private nc.vo.pub.lang.UFDateTime ts  ;


	public static final String PK_CPRKDMASTER = "pk_cprkdmaster";
	public static final String PK_ORG = "pk_org";
	public static final String PK_GROUP = "pk_group";
	public static final String CODE = "code";
	public static final String PK_ORG_V = "pk_org_v";
	public static final String MAKETIME = "maketime";
	public static final String LASTMAKETIME = "lastmaketime";
	public static final String CREATOR = "creator";
	public static final String CREATIONTIME = "creationtime";
	public static final String MODIFIER = "modifier";
	public static final String MODIFIEDTIME = "modifiedtime";
	public static final String ROWNO = "rowno";
	public static final String SRCROWNO = "srcrowno";
	public static final String NAME = "name";
	public static final String GYJCDBARCODE = "gyjcdbarcode";
	public static final String MOBILLCODE = "mobillcode";
	public static final String INWHPERSON = "inwhperson";
	public static final String INWHTIME = "inwhtime";
	public static final String GYJCDCODE = "gyjcdcode";
	public static final String MATERIAL = "material";
	public static final String MATERIALNAME = "materialname";
	public static final String INVSTD = "invstd";
	public static final String WAREHOUSE = "warehouse";
	public static final String POSITION = "position";
	public static final String INQTY = "inqty";
	public static final String BATCHNO = "batchno";
	public static final String CERTIFINO = "certifino";
	public static final String VDEF1 = "vdef1";
	public static final String VDEF2 = "vdef2";
	public static final String VDEF3 = "vdef3";
	public static final String VDEF4 = "vdef4";
	public static final String VDEF5 = "vdef5";
	public static final String VDEF6 = "vdef6";
	public static final String VDEF7 = "vdef7";
	public static final String VDEF8 = "vdef8";
	public static final String VDEF9 = "vdef9";
	public static final String VDEF10 = "vdef10";
	public static final String VDEF11 = "vdef11";
	public static final String VDEF12 = "vdef12";
	public static final String VDEF13 = "vdef13";
	public static final String VDEF14 = "vdef14";
	public static final String VDEF15 = "vdef15";
	public static final String VDEF16 = "vdef16";
	public static final String VDEF17 = "vdef17";
	public static final String VDEF18 = "vdef18";
	public static final String VDEF19 = "vdef19";
	public static final String VDEF20 = "vdef20";
	public static final String DR = "dr";
	public static final String TS = "ts";

	public void setPk_cprkdmaster(java.lang.String pk_cprkdmaster){
		this.pk_cprkdmaster = pk_cprkdmaster;
	}

	public java.lang.String getPk_cprkdmaster(){
		return this.pk_cprkdmaster;
	} 
	
	public void setPk_org(java.lang.String pk_org){
		this.pk_org = pk_org;
	}

	public java.lang.String getPk_org(){
		return this.pk_org;
	} 
	
	public void setPk_group(java.lang.String pk_group){
		this.pk_group = pk_group;
	}

	public java.lang.String getPk_group(){
		return this.pk_group;
	} 
	
	public void setCode(java.lang.String code){
		this.code = code;
	}

	public java.lang.String getCode(){
		return this.code;
	} 
	
	public void setPk_org_v(java.lang.String pk_org_v){
		this.pk_org_v = pk_org_v;
	}

	public java.lang.String getPk_org_v(){
		return this.pk_org_v;
	} 
	
	public void setMaketime(nc.vo.pub.lang.UFDateTime maketime){
		this.maketime = maketime;
	}

	public nc.vo.pub.lang.UFDateTime getMaketime(){
		return this.maketime;
	} 
	
	public void setLastmaketime(nc.vo.pub.lang.UFDateTime lastmaketime){
		this.lastmaketime = lastmaketime;
	}

	public nc.vo.pub.lang.UFDateTime getLastmaketime(){
		return this.lastmaketime;
	} 
	
	public void setCreator(java.lang.String creator){
		this.creator = creator;
	}

	public java.lang.String getCreator(){
		return this.creator;
	} 
	
	public void setCreationtime(nc.vo.pub.lang.UFDateTime creationtime){
		this.creationtime = creationtime;
	}

	public nc.vo.pub.lang.UFDateTime getCreationtime(){
		return this.creationtime;
	} 
	
	public void setModifier(java.lang.String modifier){
		this.modifier = modifier;
	}

	public java.lang.String getModifier(){
		return this.modifier;
	} 
	
	public void setModifiedtime(nc.vo.pub.lang.UFDateTime modifiedtime){
		this.modifiedtime = modifiedtime;
	}

	public nc.vo.pub.lang.UFDateTime getModifiedtime(){
		return this.modifiedtime;
	} 
	
	public void setRowno(java.lang.String rowno){
		this.rowno = rowno;
	}

	public java.lang.String getRowno(){
		return this.rowno;
	} 
	
	public void setSrcrowno(java.lang.String srcrowno){
		this.srcrowno = srcrowno;
	}

	public java.lang.String getSrcrowno(){
		return this.srcrowno;
	} 
	
	public void setName(java.lang.String name){
		this.name = name;
	}

	public java.lang.String getName(){
		return this.name;
	} 
	
	public void setGyjcdbarcode(java.lang.String gyjcdbarcode){
		this.gyjcdbarcode = gyjcdbarcode;
	}

	public java.lang.String getGyjcdbarcode(){
		return this.gyjcdbarcode;
	} 
	
	public void setMobillcode(java.lang.String mobillcode){
		this.mobillcode = mobillcode;
	}

	public java.lang.String getMobillcode(){
		return this.mobillcode;
	} 
	
	public void setInwhperson(java.lang.String inwhperson){
		this.inwhperson = inwhperson;
	}

	public java.lang.String getInwhperson(){
		return this.inwhperson;
	} 
	
	public void setInwhtime(nc.vo.pub.lang.UFDateTime inwhtime){
		this.inwhtime = inwhtime;
	}

	public nc.vo.pub.lang.UFDateTime getInwhtime(){
		return this.inwhtime;
	} 
	
	public void setGyjcdcode(java.lang.String gyjcdcode){
		this.gyjcdcode = gyjcdcode;
	}

	public java.lang.String getGyjcdcode(){
		return this.gyjcdcode;
	} 
	
	public void setMaterial(java.lang.String material){
		this.material = material;
	}

	public java.lang.String getMaterial(){
		return this.material;
	} 
	
	public void setMaterialname(java.lang.String materialname){
		this.materialname = materialname;
	}

	public java.lang.String getMaterialname(){
		return this.materialname;
	} 
	
	public void setInvstd(java.lang.String invstd){
		this.invstd = invstd;
	}

	public java.lang.String getInvstd(){
		return this.invstd;
	} 
	
	public void setWarehouse(java.lang.String warehouse){
		this.warehouse = warehouse;
	}

	public java.lang.String getWarehouse(){
		return this.warehouse;
	} 
	
	public void setPosition(java.lang.String position){
		this.position = position;
	}

	public java.lang.String getPosition(){
		return this.position;
	} 
	
	public void setInqty(nc.vo.pub.lang.UFDouble inqty){
		this.inqty = inqty;
	}

	public nc.vo.pub.lang.UFDouble getInqty(){
		return this.inqty;
	} 
	
	public void setBatchno(java.lang.String batchno){
		this.batchno = batchno;
	}

	public java.lang.String getBatchno(){
		return this.batchno;
	} 
	
	public void setCertifino(java.lang.String certifino){
		this.certifino = certifino;
	}

	public java.lang.String getCertifino(){
		return this.certifino;
	} 
	
	public void setVdef1(java.lang.String vdef1){
		this.vdef1 = vdef1;
	}

	public java.lang.String getVdef1(){
		return this.vdef1;
	} 
	
	public void setVdef2(java.lang.String vdef2){
		this.vdef2 = vdef2;
	}

	public java.lang.String getVdef2(){
		return this.vdef2;
	} 
	
	public void setVdef3(java.lang.String vdef3){
		this.vdef3 = vdef3;
	}

	public java.lang.String getVdef3(){
		return this.vdef3;
	} 
	
	public void setVdef4(java.lang.String vdef4){
		this.vdef4 = vdef4;
	}

	public java.lang.String getVdef4(){
		return this.vdef4;
	} 
	
	public void setVdef5(java.lang.String vdef5){
		this.vdef5 = vdef5;
	}

	public java.lang.String getVdef5(){
		return this.vdef5;
	} 
	
	public void setVdef6(java.lang.String vdef6){
		this.vdef6 = vdef6;
	}

	public java.lang.String getVdef6(){
		return this.vdef6;
	} 
	
	public void setVdef7(java.lang.String vdef7){
		this.vdef7 = vdef7;
	}

	public java.lang.String getVdef7(){
		return this.vdef7;
	} 
	
	public void setVdef8(java.lang.String vdef8){
		this.vdef8 = vdef8;
	}

	public java.lang.String getVdef8(){
		return this.vdef8;
	} 
	
	public void setVdef9(java.lang.String vdef9){
		this.vdef9 = vdef9;
	}

	public java.lang.String getVdef9(){
		return this.vdef9;
	} 
	
	public void setVdef10(java.lang.String vdef10){
		this.vdef10 = vdef10;
	}

	public java.lang.String getVdef10(){
		return this.vdef10;
	} 
	
	public void setVdef11(java.lang.String vdef11){
		this.vdef11 = vdef11;
	}

	public java.lang.String getVdef11(){
		return this.vdef11;
	} 
	
	public void setVdef12(java.lang.String vdef12){
		this.vdef12 = vdef12;
	}

	public java.lang.String getVdef12(){
		return this.vdef12;
	} 
	
	public void setVdef13(java.lang.String vdef13){
		this.vdef13 = vdef13;
	}

	public java.lang.String getVdef13(){
		return this.vdef13;
	} 
	
	public void setVdef14(java.lang.String vdef14){
		this.vdef14 = vdef14;
	}

	public java.lang.String getVdef14(){
		return this.vdef14;
	} 
	
	public void setVdef15(java.lang.String vdef15){
		this.vdef15 = vdef15;
	}

	public java.lang.String getVdef15(){
		return this.vdef15;
	} 
	
	public void setVdef16(java.lang.String vdef16){
		this.vdef16 = vdef16;
	}

	public java.lang.String getVdef16(){
		return this.vdef16;
	} 
	
	public void setVdef17(java.lang.String vdef17){
		this.vdef17 = vdef17;
	}

	public java.lang.String getVdef17(){
		return this.vdef17;
	} 
	
	public void setVdef18(java.lang.String vdef18){
		this.vdef18 = vdef18;
	}

	public java.lang.String getVdef18(){
		return this.vdef18;
	} 
	
	public void setVdef19(java.lang.String vdef19){
		this.vdef19 = vdef19;
	}

	public java.lang.String getVdef19(){
		return this.vdef19;
	} 
	
	public void setVdef20(java.lang.String vdef20){
		this.vdef20 = vdef20;
	}

	public java.lang.String getVdef20(){
		return this.vdef20;
	} 
	
	public void setDr(java.lang.Integer dr){
		this.dr = dr;
	}

	public java.lang.Integer getDr(){
		return this.dr;
	} 
	
	public void setTs(nc.vo.pub.lang.UFDateTime ts){
		this.ts = ts;
	}

	public nc.vo.pub.lang.UFDateTime getTs(){
		return this.ts;
	} 
	
	
	
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	@Override
	public java.lang.String getPKFieldName() {
	  return "pk_cprkdmaster";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	@Override
	public java.lang.String getTableName() {
		return "wsh_cprkdmaster";
	}
	
	public static java.lang.String getDefaultTableName() {
		return "wsh_cprkdmaster";
	}    
    
	@Override
	@nc.vo.annotation.MDEntityInfo(beanFullclassName =  "nc.vo.cprkd.cprkd.CprkdMasterVO" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("cprkd.cprkdMaster");
  	}
  	
}
