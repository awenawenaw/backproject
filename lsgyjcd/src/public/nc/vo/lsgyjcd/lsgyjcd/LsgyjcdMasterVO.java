package nc.vo.lsgyjcd.lsgyjcd;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class LsgyjcdMasterVO extends SuperVO {

	//构造方法
	public LsgyjcdMasterVO() {
		super();
	}


    private java.lang.String pk_lsgyjcdmaster  ;
    private java.lang.String probatchnum  ;
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
    private java.lang.String name  ;
    private java.lang.String srccode  ;
    private java.lang.String tastcode  ;
    private java.lang.String techdocnum  ;
    private java.lang.String modelno  ;
    private java.lang.String probatch  ;
    private java.lang.String material  ;
    private java.lang.String drawno  ;
    private java.lang.String sourceno  ;
    private nc.vo.pub.lang.UFDouble num  ;
    private java.lang.String sourcedes  ;
    private java.lang.String soorder  ;
    private nc.vo.pub.lang.UFBoolean iskey  ;
    private java.lang.String realmaterial  ;
    private java.lang.String testno  ;
    private nc.vo.pub.lang.UFDouble procenum  ;
    private nc.vo.pub.lang.UFDateTime plantime  ;
    private java.lang.String daikeno  ;
    private java.lang.String designmat  ;
    private java.lang.String certifino  ;
    private java.lang.String furnaceno  ;
    private java.lang.String mobillcode  ;
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


	public static final String PK_LSGYJCDMASTER = "pk_lsgyjcdmaster";
	public static final String PROBATCHNUM = "probatchnum";
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
	public static final String NAME = "name";
	public static final String SRCCODE = "srccode";
	public static final String TASTCODE = "tastcode";
	public static final String TECHDOCNUM = "techdocnum";
	public static final String MODELNO = "modelno";
	public static final String PROBATCH = "probatch";
	public static final String MATERIAL = "material";
	public static final String DRAWNO = "drawno";
	public static final String SOURCENO = "sourceno";
	public static final String NUM = "num";
	public static final String SOURCEDES = "sourcedes";
	public static final String SOORDER = "soorder";
	public static final String ISKEY = "iskey";
	public static final String REALMATERIAL = "realmaterial";
	public static final String TESTNO = "testno";
	public static final String PROCENUM = "procenum";
	public static final String PLANTIME = "plantime";
	public static final String DAIKENO = "daikeno";
	public static final String DESIGNMAT = "designmat";
	public static final String CERTIFINO = "certifino";
	public static final String FURNACENO = "furnaceno";
	public static final String MOBILLCODE = "mobillcode";
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

	public void setPk_lsgyjcdmaster(java.lang.String pk_lsgyjcdmaster){
		this.pk_lsgyjcdmaster = pk_lsgyjcdmaster;
	}

	public java.lang.String getPk_lsgyjcdmaster(){
		return this.pk_lsgyjcdmaster;
	} 
	
	public void setProbatchnum(java.lang.String probatchnum){
		this.probatchnum = probatchnum;
	}

	public java.lang.String getProbatchnum(){
		return this.probatchnum;
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
	
	public void setName(java.lang.String name){
		this.name = name;
	}

	public java.lang.String getName(){
		return this.name;
	} 
	
	public void setSrccode(java.lang.String srccode){
		this.srccode = srccode;
	}

	public java.lang.String getSrccode(){
		return this.srccode;
	} 
	
	public void setTastcode(java.lang.String tastcode){
		this.tastcode = tastcode;
	}

	public java.lang.String getTastcode(){
		return this.tastcode;
	} 
	
	public void setTechdocnum(java.lang.String techdocnum){
		this.techdocnum = techdocnum;
	}

	public java.lang.String getTechdocnum(){
		return this.techdocnum;
	} 
	
	public void setModelno(java.lang.String modelno){
		this.modelno = modelno;
	}

	public java.lang.String getModelno(){
		return this.modelno;
	} 
	
	public void setProbatch(java.lang.String probatch){
		this.probatch = probatch;
	}

	public java.lang.String getProbatch(){
		return this.probatch;
	} 
	
	public void setMaterial(java.lang.String material){
		this.material = material;
	}

	public java.lang.String getMaterial(){
		return this.material;
	} 
	
	public void setDrawno(java.lang.String drawno){
		this.drawno = drawno;
	}

	public java.lang.String getDrawno(){
		return this.drawno;
	} 
	
	public void setSourceno(java.lang.String sourceno){
		this.sourceno = sourceno;
	}

	public java.lang.String getSourceno(){
		return this.sourceno;
	} 
	
	public void setNum(nc.vo.pub.lang.UFDouble num){
		this.num = num;
	}

	public nc.vo.pub.lang.UFDouble getNum(){
		return this.num;
	} 
	
	public void setSourcedes(java.lang.String sourcedes){
		this.sourcedes = sourcedes;
	}

	public java.lang.String getSourcedes(){
		return this.sourcedes;
	} 
	
	public void setSoorder(java.lang.String soorder){
		this.soorder = soorder;
	}

	public java.lang.String getSoorder(){
		return this.soorder;
	} 
	
	public void setIskey(nc.vo.pub.lang.UFBoolean iskey){
		this.iskey = iskey;
	}

	public nc.vo.pub.lang.UFBoolean getIskey(){
		return this.iskey;
	} 
	
	public void setRealmaterial(java.lang.String realmaterial){
		this.realmaterial = realmaterial;
	}

	public java.lang.String getRealmaterial(){
		return this.realmaterial;
	} 
	
	public void setTestno(java.lang.String testno){
		this.testno = testno;
	}

	public java.lang.String getTestno(){
		return this.testno;
	} 
	
	public void setProcenum(nc.vo.pub.lang.UFDouble procenum){
		this.procenum = procenum;
	}

	public nc.vo.pub.lang.UFDouble getProcenum(){
		return this.procenum;
	} 
	
	public void setPlantime(nc.vo.pub.lang.UFDateTime plantime){
		this.plantime = plantime;
	}

	public nc.vo.pub.lang.UFDateTime getPlantime(){
		return this.plantime;
	} 
	
	public void setDaikeno(java.lang.String daikeno){
		this.daikeno = daikeno;
	}

	public java.lang.String getDaikeno(){
		return this.daikeno;
	} 
	
	public void setDesignmat(java.lang.String designmat){
		this.designmat = designmat;
	}

	public java.lang.String getDesignmat(){
		return this.designmat;
	} 
	
	public void setCertifino(java.lang.String certifino){
		this.certifino = certifino;
	}

	public java.lang.String getCertifino(){
		return this.certifino;
	} 
	
	public void setFurnaceno(java.lang.String furnaceno){
		this.furnaceno = furnaceno;
	}

	public java.lang.String getFurnaceno(){
		return this.furnaceno;
	} 
	
	public void setMobillcode(java.lang.String mobillcode){
		this.mobillcode = mobillcode;
	}

	public java.lang.String getMobillcode(){
		return this.mobillcode;
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
	  return "pk_lsgyjcdmaster";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	@Override
	public java.lang.String getTableName() {
		return "wsh_lsgyjcdmaster";
	}
	
	public static java.lang.String getDefaultTableName() {
		return "wsh_lsgyjcdmaster";
	}    
    
	@Override
	@nc.vo.annotation.MDEntityInfo(beanFullclassName =  "nc.vo.lsgyjcd.lsgyjcd.LsgyjcdMasterVO" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("lsgyjcd.lsgyjcdMaster");
  	}
  	
}
