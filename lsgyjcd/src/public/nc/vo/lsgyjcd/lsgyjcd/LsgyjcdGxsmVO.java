package nc.vo.lsgyjcd.lsgyjcd;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class LsgyjcdGxsmVO extends SuperVO {

	//构造方法
	public LsgyjcdGxsmVO() {
		super();
	}


    private java.lang.String inspec  ;
    private java.lang.String dept  ;
    private java.lang.String workcenter  ;
    private java.lang.String teams  ;
    private nc.vo.pub.lang.UFDouble preparhours  ;
    private nc.vo.pub.lang.UFDouble processhours  ;
    private nc.vo.pub.lang.UFBoolean istransfer  ;
    private nc.vo.pub.lang.UFBoolean iscomplete  ;
    private java.lang.String processrequire  ;
    private nc.vo.pub.lang.UFDouble qualifiednum  ;
    private nc.vo.pub.lang.UFDouble overshoot  ;
    private nc.vo.pub.lang.UFDouble scrapnum  ;
    private nc.vo.pub.lang.UFDouble actualhour  ;
    private java.lang.String inspector  ;
    private nc.vo.pub.lang.UFDateTime inspecttime  ;
    private java.lang.String detectresult  ;
    private java.lang.String others  ;
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
    private java.lang.String pk_lsgyjcdgxsm  ;
    private java.lang.String rowno  ;
    private java.lang.String srcrowno  ;
    private java.lang.String specifi  ;
    private java.lang.String def20  ;
    private java.lang.Integer dr  ;
    private nc.vo.pub.lang.UFDateTime ts  ;
    private java.lang.String pk_lsgyjcdmaster  ;


	public static final String INSPEC = "inspec";
	public static final String DEPT = "dept";
	public static final String WORKCENTER = "workcenter";
	public static final String TEAMS = "teams";
	public static final String PREPARHOURS = "preparhours";
	public static final String PROCESSHOURS = "processhours";
	public static final String ISTRANSFER = "istransfer";
	public static final String ISCOMPLETE = "iscomplete";
	public static final String PROCESSREQUIRE = "processrequire";
	public static final String QUALIFIEDNUM = "qualifiednum";
	public static final String OVERSHOOT = "overshoot";
	public static final String SCRAPNUM = "scrapnum";
	public static final String ACTUALHOUR = "actualhour";
	public static final String INSPECTOR = "inspector";
	public static final String INSPECTTIME = "inspecttime";
	public static final String DETECTRESULT = "detectresult";
	public static final String OTHERS = "others";
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
	public static final String PK_LSGYJCDGXSM = "pk_lsgyjcdgxsm";
	public static final String ROWNO = "rowno";
	public static final String SRCROWNO = "srcrowno";
	public static final String SPECIFI = "specifi";
	public static final String DEF20 = "def20";
	public static final String DR = "dr";
	public static final String TS = "ts";
	public static final String PK_LSGYJCDMASTER = "pk_lsgyjcdmaster";

	public void setInspec(java.lang.String inspec){
		this.inspec = inspec;
	}

	public java.lang.String getInspec(){
		return this.inspec;
	} 
	
	public void setDept(java.lang.String dept){
		this.dept = dept;
	}

	public java.lang.String getDept(){
		return this.dept;
	} 
	
	public void setWorkcenter(java.lang.String workcenter){
		this.workcenter = workcenter;
	}

	public java.lang.String getWorkcenter(){
		return this.workcenter;
	} 
	
	public void setTeams(java.lang.String teams){
		this.teams = teams;
	}

	public java.lang.String getTeams(){
		return this.teams;
	} 
	
	public void setPreparhours(nc.vo.pub.lang.UFDouble preparhours){
		this.preparhours = preparhours;
	}

	public nc.vo.pub.lang.UFDouble getPreparhours(){
		return this.preparhours;
	} 
	
	public void setProcesshours(nc.vo.pub.lang.UFDouble processhours){
		this.processhours = processhours;
	}

	public nc.vo.pub.lang.UFDouble getProcesshours(){
		return this.processhours;
	} 
	
	public void setIstransfer(nc.vo.pub.lang.UFBoolean istransfer){
		this.istransfer = istransfer;
	}

	public nc.vo.pub.lang.UFBoolean getIstransfer(){
		return this.istransfer;
	} 
	
	public void setIscomplete(nc.vo.pub.lang.UFBoolean iscomplete){
		this.iscomplete = iscomplete;
	}

	public nc.vo.pub.lang.UFBoolean getIscomplete(){
		return this.iscomplete;
	} 
	
	public void setProcessrequire(java.lang.String processrequire){
		this.processrequire = processrequire;
	}

	public java.lang.String getProcessrequire(){
		return this.processrequire;
	} 
	
	public void setQualifiednum(nc.vo.pub.lang.UFDouble qualifiednum){
		this.qualifiednum = qualifiednum;
	}

	public nc.vo.pub.lang.UFDouble getQualifiednum(){
		return this.qualifiednum;
	} 
	
	public void setOvershoot(nc.vo.pub.lang.UFDouble overshoot){
		this.overshoot = overshoot;
	}

	public nc.vo.pub.lang.UFDouble getOvershoot(){
		return this.overshoot;
	} 
	
	public void setScrapnum(nc.vo.pub.lang.UFDouble scrapnum){
		this.scrapnum = scrapnum;
	}

	public nc.vo.pub.lang.UFDouble getScrapnum(){
		return this.scrapnum;
	} 
	
	public void setActualhour(nc.vo.pub.lang.UFDouble actualhour){
		this.actualhour = actualhour;
	}

	public nc.vo.pub.lang.UFDouble getActualhour(){
		return this.actualhour;
	} 
	
	public void setInspector(java.lang.String inspector){
		this.inspector = inspector;
	}

	public java.lang.String getInspector(){
		return this.inspector;
	} 
	
	public void setInspecttime(nc.vo.pub.lang.UFDateTime inspecttime){
		this.inspecttime = inspecttime;
	}

	public nc.vo.pub.lang.UFDateTime getInspecttime(){
		return this.inspecttime;
	} 
	
	public void setDetectresult(java.lang.String detectresult){
		this.detectresult = detectresult;
	}

	public java.lang.String getDetectresult(){
		return this.detectresult;
	} 
	
	public void setOthers(java.lang.String others){
		this.others = others;
	}

	public java.lang.String getOthers(){
		return this.others;
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
	
	public void setPk_lsgyjcdgxsm(java.lang.String pk_lsgyjcdgxsm){
		this.pk_lsgyjcdgxsm = pk_lsgyjcdgxsm;
	}

	public java.lang.String getPk_lsgyjcdgxsm(){
		return this.pk_lsgyjcdgxsm;
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
	
	public void setSpecifi(java.lang.String specifi){
		this.specifi = specifi;
	}

	public java.lang.String getSpecifi(){
		return this.specifi;
	} 
	
	public void setDef20(java.lang.String def20){
		this.def20 = def20;
	}

	public java.lang.String getDef20(){
		return this.def20;
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
	
	
	public void setPk_lsgyjcdmaster(java.lang.String pk_lsgyjcdmaster){
		this.pk_lsgyjcdmaster = pk_lsgyjcdmaster;
	}

	public java.lang.String getPk_lsgyjcdmaster(){
		return this.pk_lsgyjcdmaster;
	} 
	
	
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	@Override
	public java.lang.String getPKFieldName() {
	  return "pk_lsgyjcdgxsm";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	@Override
	public java.lang.String getTableName() {
		return "wsh_lsgyjcdGxsm";
	}
	
	public static java.lang.String getDefaultTableName() {
		return "wsh_lsgyjcdGxsm";
	}    
    
	@Override
	@nc.vo.annotation.MDEntityInfo(beanFullclassName =  "nc.vo.lsgyjcd.lsgyjcd.LsgyjcdGxsmVO" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("lsgyjcd.lsgyjcdGxsm");
  	}
  	
}
