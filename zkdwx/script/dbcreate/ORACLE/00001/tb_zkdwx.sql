 create table WSH_ZKDWXMASTER (def30 varchar2(101) null /*自定义项30*/,
def29 varchar2(101) null /*自定义项29*/,
def28 varchar2(101) null /*自定义项28*/,
def27 varchar2(101) null /*自定义项27*/,
def26 varchar2(101) null /*自定义项26*/,
def25 varchar2(101) null /*自定义项25*/,
def24 varchar2(101) null /*自定义项24*/,
def23 varchar2(101) null /*自定义项23*/,
def22 varchar2(101) null /*自定义项22*/,
def21 varchar2(101) null /*自定义项21*/,
def20 varchar2(101) null /*自定义项20*/,
def19 varchar2(101) null /*自定义项19*/,
def18 varchar2(101) null /*自定义项18*/,
def17 varchar2(101) null /*自定义项17*/,
def16 varchar2(101) null /*自定义项16*/,
def15 varchar2(101) null /*自定义项15*/,
def14 varchar2(101) null /*自定义项14*/,
def13 varchar2(101) null /*自定义项13*/,
def12 varchar2(101) null /*自定义项12*/,
def11 varchar2(101) null /*自定义项11*/,
def10 varchar2(101) null /*自定义项10*/,
def9 varchar2(101) null /*自定义项9*/,
def8 varchar2(101) null /*自定义项8*/,
def7 varchar2(101) null /*自定义项7*/,
def6 varchar2(101) null /*自定义项6*/,
def5 varchar2(101) null /*自定义项5*/,
def4 varchar2(101) null /*自定义项4*/,
def3 varchar2(101) null /*自定义项3*/,
def2 varchar2(101) null /*自定义项2*/,
def1 varchar2(101) null /*自定义项1*/,
djzt varchar2(50) null /*单据状态*/,
ydhdata char(19) null /*应到货日期*/,
yfhdata char(19) null /*应发货日期*/,
rk_cept varchar2(20) null /*入库部门*/,
rk_psndoc varchar2(20) null /*入库业务员*/,
ck_cept varchar2(20) null /*出库部门*/,
ck_psndoc varchar2(20) null /*出库业务员*/,
zklx varchar2(50) null /*转库类型*/,
rk_stordoc varchar2(20) null /*入库仓库*/,
ck_stordoc varchar2(20) null /*出库仓库*/,
modifiedtime char(19) null /*最后修改时间1*/,
modifier varchar2(20) null /*最后修改人*/,
creationtime char(19) null /*创建时间*/,
creator varchar2(20) null /*创建人*/,
lastmaketime char(19) null /*最后修改时间*/,
maketime char(19) null /*制单时间*/,
pk_org_v varchar2(20) null /*组织多版本*/,
code varchar2(50) null /*单据号*/,
pk_group varchar2(20) null /*pk_group*/,
pk_org varchar2(20) null /*组织*/,
pk_zkdwxmaster char(20) not null /*主键*/,
ts char(19) default to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') null /*null*/,
dr integer null /*null*/,
 constraint WSH_ZKDWXMASTER_PK  primary key (pk_zkdwxmaster)
)

/

 create table WSH_ZKDWXSLAVE0 (def30 varchar2(101) null /*自定义项30*/,
def29 varchar2(101) null /*自定义项29*/,
def28 varchar2(101) null /*自定义项28*/,
def27 varchar2(101) null /*自定义项27*/,
def26 varchar2(101) null /*自定义项26*/,
def25 varchar2(101) null /*自定义项25*/,
def24 varchar2(101) null /*自定义项24*/,
def23 varchar2(101) null /*自定义项23*/,
def22 varchar2(101) null /*自定义项22*/,
def21 varchar2(101) null /*自定义项21*/,
def20 varchar2(101) null /*自定义项20*/,
def19 varchar2(101) null /*自定义项19*/,
def18 varchar2(101) null /*自定义项18*/,
def17 varchar2(101) null /*自定义项17*/,
def16 varchar2(101) null /*自定义项16*/,
def15 varchar2(101) null /*自定义项15*/,
def14 varchar2(101) null /*自定义项14*/,
def13 varchar2(101) null /*自定义项13*/,
def12 varchar2(101) null /*自定义项12*/,
def11 varchar2(101) null /*自定义项11*/,
def10 varchar2(101) null /*自定义项10*/,
def9 varchar2(101) null /*自定义项9*/,
def8 varchar2(101) null /*自定义项8*/,
def7 varchar2(101) null /*自定义项7*/,
def6 varchar2(101) null /*自定义项6*/,
def5 varchar2(101) null /*自定义项5*/,
def4 varchar2(101) null /*自定义项4*/,
def3 varchar2(101) null /*自定义项3*/,
def2 varchar2(101) null /*自定义项2*/,
def1 varchar2(101) null /*自定义项1*/,
dj number(28,8) null /*单价*/,
eps varchar2(20) null /*项目*/,
rack varchar2(20) null /*货位*/,
yznum number(28,8) null /*应转数量*/,
pch varchar2(50) null /*批次号*/,
measdoc varchar2(20) null /*单位*/,
materialtype varchar2(50) null /*型号*/,
material varchar2(50) null /*规格*/,
materal_name varchar2(50) null /*物料名称*/,
material_code varchar2(20) null /*物料编码*/,
srcrowno varchar2(50) null /*来源行号*/,
rowno varchar2(50) null /*行号*/,
pk_zkdwxslave0 char(20) not null /*主键*/,
pk_zkdwxmaster char(20) not null /*上层单据主键*/,
ts char(19) default to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') null /*null*/,
dr integer null /*null*/,
 constraint WSH_ZKDWXSLAVE0_PK  primary key (pk_zkdwxslave0)
)

/

