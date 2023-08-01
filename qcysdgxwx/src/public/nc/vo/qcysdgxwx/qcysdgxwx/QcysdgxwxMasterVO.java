package nc.vo.qcysdgxwx.qcysdgxwx;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class QcysdgxwxMasterVO extends SuperVO {

	//构造方法
	public QcysdgxwxMasterVO() {
		super();
	}


    private java.lang.String material_code  ;
    private java.lang.String material_name  ;
    private java.lang.String invstd  ;
    private java.lang.String source_code  ;
    private nc.vo.pub.lang.UFDouble qty  ;
    private java.lang.String source_desc  ;
    private java.lang.String reform_sourcecode  ;
    private nc.vo.pub.lang.UFBoolean iskeycomponents  ;
    private java.lang.String reality_materialcode  ;
    private java.lang.String test_code  ;
    private nc.vo.pub.lang.UFDouble process_qty  ;
    private nc.vo.pub.lang.UFDateTime plancomplete_time  ;
    private java.lang.String replace_materialcode  ;
    private java.lang.String design_materialcode  ;
    private java.lang.String standard_code  ;
    private java.lang.String stove_batch  ;
    private java.lang.String mo_code  ;
    private nc.vo.pub.lang.UFBoolean issplit  ;
    private java.lang.String process_desc  ;
    private java.lang.String checkflag  ;
    private java.lang.String department  ;
    private java.lang.String workcenter  ;
    private nc.vo.pub.lang.UFDouble prepare_hours  ;
    private nc.vo.pub.lang.UFDouble work_hours  ;
    private java.lang.String vendor  ;
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
    private java.lang.String pk_qcysdmaster  ;
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
    private java.lang.String plancode  ;
    private java.lang.String taskcode  ;
    private java.lang.String file_no  ;
    private java.lang.String pro_batch  ;
    private java.lang.String spec  ;
    private java.lang.String mo_batch  ;
    private java.lang.String pk_material  ;
    private java.lang.Integer dr  ;
    private nc.vo.pub.lang.UFDateTime ts  ;


	public static final String MATERIAL_CODE = "material_code";
	public static final String MATERIAL_NAME = "material_name";
	public static final String INVSTD = "invstd";
	public static final String SOURCE_CODE = "source_code";
	public static final String QTY = "qty";
	public static final String SOURCE_DESC = "source_desc";
	public static final String REFORM_SOURCECODE = "reform_sourcecode";
	public static final String ISKEYCOMPONENTS = "iskeycomponents";
	public static final String REALITY_MATERIALCODE = "reality_materialcode";
	public static final String TEST_CODE = "test_code";
	public static final String PROCESS_QTY = "process_qty";
	public static final String PLANCOMPLETE_TIME = "plancomplete_time";
	public static final String REPLACE_MATERIALCODE = "replace_materialcode";
	public static final String DESIGN_MATERIALCODE = "design_materialcode";
	public static final String STANDARD_CODE = "standard_code";
	public static final String STOVE_BATCH = "stove_batch";
	public static final String MO_CODE = "mo_code";
	public static final String ISSPLIT = "issplit";
	public static final String PROCESS_DESC = "process_desc";
	public static final String CHECKFLAG = "checkflag";
	public static final String DEPARTMENT = "department";
	public static final String WORKCENTER = "workcenter";
	public static final String PREPARE_HOURS = "prepare_hours";
	public static final String WORK_HOURS = "work_hours";
	public static final String VENDOR = "vendor";
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
	public static final String PK_QCYSDMASTER = "pk_qcysdmaster";
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
	public static final String PLANCODE = "plancode";
	public static final String TASKCODE = "taskcode";
	public static final String FILE_NO = "file_no";
	public static final String PRO_BATCH = "pro_batch";
	public static final String SPEC = "spec";
	public static final String MO_BATCH = "mo_batch";
	public static final String PK_MATERIAL = "pk_material";
	public static final String DR = "dr";
	public static final String TS = "ts";

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
	
	public void setSource_code(java.lang.String source_code){
		this.source_code = source_code;
	}

	public java.lang.String getSource_code(){
		return this.source_code;
	} 
	
	public void setQty(nc.vo.pub.lang.UFDouble qty){
		this.qty = qty;
	}

	public nc.vo.pub.lang.UFDouble getQty(){
		return this.qty;
	} 
	
	public void setSource_desc(java.lang.String source_desc){
		this.source_desc = source_desc;
	}

	public java.lang.String getSource_desc(){
		return this.source_desc;
	} 
	
	public void setReform_sourcecode(java.lang.String reform_sourcecode){
		this.reform_sourcecode = reform_sourcecode;
	}

	public java.lang.String getReform_sourcecode(){
		return this.reform_sourcecode;
	} 
	
	public void setIskeycomponents(nc.vo.pub.lang.UFBoolean iskeycomponents){
		this.iskeycomponents = iskeycomponents;
	}

	public nc.vo.pub.lang.UFBoolean getIskeycomponents(){
		return this.iskeycomponents;
	} 
	
	public void setReality_materialcode(java.lang.String reality_materialcode){
		this.reality_materialcode = reality_materialcode;
	}

	public java.lang.String getReality_materialcode(){
		return this.reality_materialcode;
	} 
	
	public void setTest_code(java.lang.String test_code){
		this.test_code = test_code;
	}

	public java.lang.String getTest_code(){
		return this.test_code;
	} 
	
	public void setProcess_qty(nc.vo.pub.lang.UFDouble process_qty){
		this.process_qty = process_qty;
	}

	public nc.vo.pub.lang.UFDouble getProcess_qty(){
		return this.process_qty;
	} 
	
	public void setPlancomplete_time(nc.vo.pub.lang.UFDateTime plancomplete_time){
		this.plancomplete_time = plancomplete_time;
	}

	public nc.vo.pub.lang.UFDateTime getPlancomplete_time(){
		return this.plancomplete_time;
	} 
	
	public void setReplace_materialcode(java.lang.String replace_materialcode){
		this.replace_materialcode = replace_materialcode;
	}

	public java.lang.String getReplace_materialcode(){
		return this.replace_materialcode;
	} 
	
	public void setDesign_materialcode(java.lang.String design_materialcode){
		this.design_materialcode = design_materialcode;
	}

	public java.lang.String getDesign_materialcode(){
		return this.design_materialcode;
	} 
	
	public void setStandard_code(java.lang.String standard_code){
		this.standard_code = standard_code;
	}

	public java.lang.String getStandard_code(){
		return this.standard_code;
	} 
	
	public void setStove_batch(java.lang.String stove_batch){
		this.stove_batch = stove_batch;
	}

	public java.lang.String getStove_batch(){
		return this.stove_batch;
	} 
	
	public void setMo_code(java.lang.String mo_code){
		this.mo_code = mo_code;
	}

	public java.lang.String getMo_code(){
		return this.mo_code;
	} 
	
	public void setIssplit(nc.vo.pub.lang.UFBoolean issplit){
		this.issplit = issplit;
	}

	public nc.vo.pub.lang.UFBoolean getIssplit(){
		return this.issplit;
	} 
	
	public void setProcess_desc(java.lang.String process_desc){
		this.process_desc = process_desc;
	}

	public java.lang.String getProcess_desc(){
		return this.process_desc;
	} 
	
	public void setCheckflag(java.lang.String checkflag){
		this.checkflag = checkflag;
	}

	public java.lang.String getCheckflag(){
		return this.checkflag;
	} 
	
	public void setDepartment(java.lang.String department){
		this.department = department;
	}

	public java.lang.String getDepartment(){
		return this.department;
	} 
	
	public void setWorkcenter(java.lang.String workcenter){
		this.workcenter = workcenter;
	}

	public java.lang.String getWorkcenter(){
		return this.workcenter;
	} 
	
	public void setPrepare_hours(nc.vo.pub.lang.UFDouble prepare_hours){
		this.prepare_hours = prepare_hours;
	}

	public nc.vo.pub.lang.UFDouble getPrepare_hours(){
		return this.prepare_hours;
	} 
	
	public void setWork_hours(nc.vo.pub.lang.UFDouble work_hours){
		this.work_hours = work_hours;
	}

	public nc.vo.pub.lang.UFDouble getWork_hours(){
		return this.work_hours;
	} 
	
	public void setVendor(java.lang.String vendor){
		this.vendor = vendor;
	}

	public java.lang.String getVendor(){
		return this.vendor;
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
	
	public void setPk_qcysdmaster(java.lang.String pk_qcysdmaster){
		this.pk_qcysdmaster = pk_qcysdmaster;
	}

	public java.lang.String getPk_qcysdmaster(){
		return this.pk_qcysdmaster;
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
	
	public void setPlancode(java.lang.String plancode){
		this.plancode = plancode;
	}

	public java.lang.String getPlancode(){
		return this.plancode;
	} 
	
	public void setTaskcode(java.lang.String taskcode){
		this.taskcode = taskcode;
	}

	public java.lang.String getTaskcode(){
		return this.taskcode;
	} 
	
	public void setFile_no(java.lang.String file_no){
		this.file_no = file_no;
	}

	public java.lang.String getFile_no(){
		return this.file_no;
	} 
	
	public void setPro_batch(java.lang.String pro_batch){
		this.pro_batch = pro_batch;
	}

	public java.lang.String getPro_batch(){
		return this.pro_batch;
	} 
	
	public void setSpec(java.lang.String spec){
		this.spec = spec;
	}

	public java.lang.String getSpec(){
		return this.spec;
	} 
	
	public void setMo_batch(java.lang.String mo_batch){
		this.mo_batch = mo_batch;
	}

	public java.lang.String getMo_batch(){
		return this.mo_batch;
	} 
	
	public void setPk_material(java.lang.String pk_material){
		this.pk_material = pk_material;
	}

	public java.lang.String getPk_material(){
		return this.pk_material;
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
	  return "pk_qcysdmaster";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	@Override
	public java.lang.String getTableName() {
		return "wsh_qcysdgxwxmaster";
	}
	
	public static java.lang.String getDefaultTableName() {
		return "wsh_qcysdgxwxmaster";
	}    
    
	@Override
	@nc.vo.annotation.MDEntityInfo(beanFullclassName =  "nc.vo.qcysdgxwx.qcysdgxwx.QcysdgxwxMasterVO" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("qcysdgxwx.qcysdgxwxMaster");
  	}
  	
}
