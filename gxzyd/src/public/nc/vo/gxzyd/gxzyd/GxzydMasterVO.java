package nc.vo.gxzyd.gxzyd;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class GxzydMasterVO extends SuperVO {

	//构造方法
	public GxzydMasterVO() {
		super();
	}


    private java.lang.String pk_gxzydmaster  ;
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
    private java.lang.String processbarcode  ;
    private java.lang.String mocode  ;
    private java.lang.String pk_material  ;
    private java.lang.String material_code  ;
    private java.lang.String material_name  ;
    private java.lang.String invstd  ;
    private java.lang.String invunit  ;
    private java.lang.String batch_no  ;
    private nc.vo.pub.lang.UFDouble tranoutqty  ;
    private nc.vo.pub.lang.UFDouble receiveqty  ;
    private java.lang.String position  ;
    private java.lang.String replaceinvcode  ;
    private java.lang.String spec  ;
    private java.lang.String tranoutorg  ;
    private java.lang.String tranoutperson  ;
    private java.lang.String traninorg  ;
    private java.lang.String receiveperson  ;
    private java.lang.String processcode  ;
    private nc.vo.pub.lang.UFDateTime confirmtime  ;
    private java.lang.String transferprocess  ;
    private java.lang.String nextprocess  ;
    private java.lang.String def1  ;
    private java.lang.String def2  ;
    private java.lang.String def3  ;
    private java.lang.String def4  ;
    private java.lang.String def5  ;
    private java.lang.String def6  ;
    private java.lang.String def7  ;
    private java.lang.String def8  ;
    private java.lang.String def9  ;
    private java.lang.String def10  ;
    private java.lang.String def11  ;
    private java.lang.String def12  ;
    private java.lang.String def13  ;
    private java.lang.String def14  ;
    private java.lang.String def15  ;
    private java.lang.String def16  ;
    private java.lang.String def17  ;
    private java.lang.String def18  ;
    private java.lang.String def19  ;
    private java.lang.String def20  ;
    private java.lang.String def21  ;
    private java.lang.String def22  ;
    private java.lang.String def23  ;
    private java.lang.String def24  ;
    private java.lang.String def25  ;
    private java.lang.String def26  ;
    private java.lang.String def27  ;
    private java.lang.String def28  ;
    private java.lang.String def29  ;
    private java.lang.String def30  ;
    private java.lang.Integer dr  ;
    private nc.vo.pub.lang.UFDateTime ts  ;


	public static final String PK_GXZYDMASTER = "pk_gxzydmaster";
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
	public static final String PROCESSBARCODE = "processbarcode";
	public static final String MOCODE = "mocode";
	public static final String PK_MATERIAL = "pk_material";
	public static final String MATERIAL_CODE = "material_code";
	public static final String MATERIAL_NAME = "material_name";
	public static final String INVSTD = "invstd";
	public static final String INVUNIT = "invunit";
	public static final String BATCH_NO = "batch_no";
	public static final String TRANOUTQTY = "tranoutqty";
	public static final String RECEIVEQTY = "receiveqty";
	public static final String POSITION = "position";
	public static final String REPLACEINVCODE = "replaceinvcode";
	public static final String SPEC = "spec";
	public static final String TRANOUTORG = "tranoutorg";
	public static final String TRANOUTPERSON = "tranoutperson";
	public static final String TRANINORG = "traninorg";
	public static final String RECEIVEPERSON = "receiveperson";
	public static final String PROCESSCODE = "processcode";
	public static final String CONFIRMTIME = "confirmtime";
	public static final String TRANSFERPROCESS = "transferprocess";
	public static final String NEXTPROCESS = "nextprocess";
	public static final String DEF1 = "def1";
	public static final String DEF2 = "def2";
	public static final String DEF3 = "def3";
	public static final String DEF4 = "def4";
	public static final String DEF5 = "def5";
	public static final String DEF6 = "def6";
	public static final String DEF7 = "def7";
	public static final String DEF8 = "def8";
	public static final String DEF9 = "def9";
	public static final String DEF10 = "def10";
	public static final String DEF11 = "def11";
	public static final String DEF12 = "def12";
	public static final String DEF13 = "def13";
	public static final String DEF14 = "def14";
	public static final String DEF15 = "def15";
	public static final String DEF16 = "def16";
	public static final String DEF17 = "def17";
	public static final String DEF18 = "def18";
	public static final String DEF19 = "def19";
	public static final String DEF20 = "def20";
	public static final String DEF21 = "def21";
	public static final String DEF22 = "def22";
	public static final String DEF23 = "def23";
	public static final String DEF24 = "def24";
	public static final String DEF25 = "def25";
	public static final String DEF26 = "def26";
	public static final String DEF27 = "def27";
	public static final String DEF28 = "def28";
	public static final String DEF29 = "def29";
	public static final String DEF30 = "def30";
	public static final String DR = "dr";
	public static final String TS = "ts";

	public void setPk_gxzydmaster(java.lang.String pk_gxzydmaster){
		this.pk_gxzydmaster = pk_gxzydmaster;
	}

	public java.lang.String getPk_gxzydmaster(){
		return this.pk_gxzydmaster;
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
	
	public void setProcessbarcode(java.lang.String processbarcode){
		this.processbarcode = processbarcode;
	}

	public java.lang.String getProcessbarcode(){
		return this.processbarcode;
	} 
	
	public void setMocode(java.lang.String mocode){
		this.mocode = mocode;
	}

	public java.lang.String getMocode(){
		return this.mocode;
	} 
	
	public void setPk_material(java.lang.String pk_material){
		this.pk_material = pk_material;
	}

	public java.lang.String getPk_material(){
		return this.pk_material;
	} 
	
	public void setMaterial_code(java.lang.String material_code){
		this.material_code = material_code;
	}

	public java.lang.String getMaterial_code(){
		return this.material_code;
	} 
	
	public void setMaterial_name(java.lang.String material_name){
		this.material_name = material_name;
	}

	public java.lang.String getMaterial_name(){
		return this.material_name;
	} 
	
	public void setInvstd(java.lang.String invstd){
		this.invstd = invstd;
	}

	public java.lang.String getInvstd(){
		return this.invstd;
	} 
	
	public void setInvunit(java.lang.String invunit){
		this.invunit = invunit;
	}

	public java.lang.String getInvunit(){
		return this.invunit;
	} 
	
	public void setBatch_no(java.lang.String batch_no){
		this.batch_no = batch_no;
	}

	public java.lang.String getBatch_no(){
		return this.batch_no;
	} 
	
	public void setTranoutqty(nc.vo.pub.lang.UFDouble tranoutqty){
		this.tranoutqty = tranoutqty;
	}

	public nc.vo.pub.lang.UFDouble getTranoutqty(){
		return this.tranoutqty;
	} 
	
	public void setReceiveqty(nc.vo.pub.lang.UFDouble receiveqty){
		this.receiveqty = receiveqty;
	}

	public nc.vo.pub.lang.UFDouble getReceiveqty(){
		return this.receiveqty;
	} 
	
	public void setPosition(java.lang.String position){
		this.position = position;
	}

	public java.lang.String getPosition(){
		return this.position;
	} 
	
	public void setReplaceinvcode(java.lang.String replaceinvcode){
		this.replaceinvcode = replaceinvcode;
	}

	public java.lang.String getReplaceinvcode(){
		return this.replaceinvcode;
	} 
	
	public void setSpec(java.lang.String spec){
		this.spec = spec;
	}

	public java.lang.String getSpec(){
		return this.spec;
	} 
	
	public void setTranoutorg(java.lang.String tranoutorg){
		this.tranoutorg = tranoutorg;
	}

	public java.lang.String getTranoutorg(){
		return this.tranoutorg;
	} 
	
	public void setTranoutperson(java.lang.String tranoutperson){
		this.tranoutperson = tranoutperson;
	}

	public java.lang.String getTranoutperson(){
		return this.tranoutperson;
	} 
	
	public void setTraninorg(java.lang.String traninorg){
		this.traninorg = traninorg;
	}

	public java.lang.String getTraninorg(){
		return this.traninorg;
	} 
	
	public void setReceiveperson(java.lang.String receiveperson){
		this.receiveperson = receiveperson;
	}

	public java.lang.String getReceiveperson(){
		return this.receiveperson;
	} 
	
	public void setProcesscode(java.lang.String processcode){
		this.processcode = processcode;
	}

	public java.lang.String getProcesscode(){
		return this.processcode;
	} 
	
	public void setConfirmtime(nc.vo.pub.lang.UFDateTime confirmtime){
		this.confirmtime = confirmtime;
	}

	public nc.vo.pub.lang.UFDateTime getConfirmtime(){
		return this.confirmtime;
	} 
	
	public void setTransferprocess(java.lang.String transferprocess){
		this.transferprocess = transferprocess;
	}

	public java.lang.String getTransferprocess(){
		return this.transferprocess;
	} 
	
	public void setNextprocess(java.lang.String nextprocess){
		this.nextprocess = nextprocess;
	}

	public java.lang.String getNextprocess(){
		return this.nextprocess;
	} 
	
	public void setDef1(java.lang.String def1){
		this.def1 = def1;
	}

	public java.lang.String getDef1(){
		return this.def1;
	} 
	
	public void setDef2(java.lang.String def2){
		this.def2 = def2;
	}

	public java.lang.String getDef2(){
		return this.def2;
	} 
	
	public void setDef3(java.lang.String def3){
		this.def3 = def3;
	}

	public java.lang.String getDef3(){
		return this.def3;
	} 
	
	public void setDef4(java.lang.String def4){
		this.def4 = def4;
	}

	public java.lang.String getDef4(){
		return this.def4;
	} 
	
	public void setDef5(java.lang.String def5){
		this.def5 = def5;
	}

	public java.lang.String getDef5(){
		return this.def5;
	} 
	
	public void setDef6(java.lang.String def6){
		this.def6 = def6;
	}

	public java.lang.String getDef6(){
		return this.def6;
	} 
	
	public void setDef7(java.lang.String def7){
		this.def7 = def7;
	}

	public java.lang.String getDef7(){
		return this.def7;
	} 
	
	public void setDef8(java.lang.String def8){
		this.def8 = def8;
	}

	public java.lang.String getDef8(){
		return this.def8;
	} 
	
	public void setDef9(java.lang.String def9){
		this.def9 = def9;
	}

	public java.lang.String getDef9(){
		return this.def9;
	} 
	
	public void setDef10(java.lang.String def10){
		this.def10 = def10;
	}

	public java.lang.String getDef10(){
		return this.def10;
	} 
	
	public void setDef11(java.lang.String def11){
		this.def11 = def11;
	}

	public java.lang.String getDef11(){
		return this.def11;
	} 
	
	public void setDef12(java.lang.String def12){
		this.def12 = def12;
	}

	public java.lang.String getDef12(){
		return this.def12;
	} 
	
	public void setDef13(java.lang.String def13){
		this.def13 = def13;
	}

	public java.lang.String getDef13(){
		return this.def13;
	} 
	
	public void setDef14(java.lang.String def14){
		this.def14 = def14;
	}

	public java.lang.String getDef14(){
		return this.def14;
	} 
	
	public void setDef15(java.lang.String def15){
		this.def15 = def15;
	}

	public java.lang.String getDef15(){
		return this.def15;
	} 
	
	public void setDef16(java.lang.String def16){
		this.def16 = def16;
	}

	public java.lang.String getDef16(){
		return this.def16;
	} 
	
	public void setDef17(java.lang.String def17){
		this.def17 = def17;
	}

	public java.lang.String getDef17(){
		return this.def17;
	} 
	
	public void setDef18(java.lang.String def18){
		this.def18 = def18;
	}

	public java.lang.String getDef18(){
		return this.def18;
	} 
	
	public void setDef19(java.lang.String def19){
		this.def19 = def19;
	}

	public java.lang.String getDef19(){
		return this.def19;
	} 
	
	public void setDef20(java.lang.String def20){
		this.def20 = def20;
	}

	public java.lang.String getDef20(){
		return this.def20;
	} 
	
	public void setDef21(java.lang.String def21){
		this.def21 = def21;
	}

	public java.lang.String getDef21(){
		return this.def21;
	} 
	
	public void setDef22(java.lang.String def22){
		this.def22 = def22;
	}

	public java.lang.String getDef22(){
		return this.def22;
	} 
	
	public void setDef23(java.lang.String def23){
		this.def23 = def23;
	}

	public java.lang.String getDef23(){
		return this.def23;
	} 
	
	public void setDef24(java.lang.String def24){
		this.def24 = def24;
	}

	public java.lang.String getDef24(){
		return this.def24;
	} 
	
	public void setDef25(java.lang.String def25){
		this.def25 = def25;
	}

	public java.lang.String getDef25(){
		return this.def25;
	} 
	
	public void setDef26(java.lang.String def26){
		this.def26 = def26;
	}

	public java.lang.String getDef26(){
		return this.def26;
	} 
	
	public void setDef27(java.lang.String def27){
		this.def27 = def27;
	}

	public java.lang.String getDef27(){
		return this.def27;
	} 
	
	public void setDef28(java.lang.String def28){
		this.def28 = def28;
	}

	public java.lang.String getDef28(){
		return this.def28;
	} 
	
	public void setDef29(java.lang.String def29){
		this.def29 = def29;
	}

	public java.lang.String getDef29(){
		return this.def29;
	} 
	
	public void setDef30(java.lang.String def30){
		this.def30 = def30;
	}

	public java.lang.String getDef30(){
		return this.def30;
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
	  return "pk_gxzydmaster";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	@Override
	public java.lang.String getTableName() {
		return "wsh_gxzydmaster";
	}
	
	public static java.lang.String getDefaultTableName() {
		return "wsh_gxzydmaster";
	}    
    
	@Override
	@nc.vo.annotation.MDEntityInfo(beanFullclassName =  "nc.vo.gxzyd.gxzyd.GxzydMasterVO" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("gxzyd.gxzydMaster");
  	}
  	
}
