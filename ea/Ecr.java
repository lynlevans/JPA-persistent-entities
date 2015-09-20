package eaf.core.entities.ea;

// Generated Feb 21, 2011 4:00:22 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import eaf.core.common.GlobalVars;
import eaf.core.entities.PersistentEntity;
import eaf.core.entities.pub.EafTransaction;
import eaf.core.entities.pub.Org;
import eaf.core.entities.pub.Poc;
import eaf.core.web.pageMarkup;

/**
 * Ecr generated by hbm2java
 */
public class Ecr extends PersistentEntity implements java.io.Serializable {

    private Ecrlc           currentEcrlc;

    private EafTransaction  currentTlog;
    private Set<EafDocs>    eafDocs     = new HashSet<EafDocs>(0);
    private String          ecrAqtnType;
    private Set<EcrCiAssoc> ecrCiAssocs = new HashSet<EcrCiAssoc>(0);
    private String          ecrDesc;
    private String          ecrEstcost;
    private int             ecrId;

    private Set<Ecrlc>      ecrlcs      = new HashSet<Ecrlc>(0);
    private int             ecrNumber;

    private Org             ecrOrg;
    private String          ecrPlandesc;
    private String          ecrPrioritydesc;
    private BusinessEntity  ecrProject;
    private Date            ecrReqcompdt;
    // private String owner;
    // private Date datetime;
    // private int archive;
    private String          ecrShrttitle;
    private String          ecrSoldesc;

    private EcrTypeCd       ecrTypeCd;
    private BusinessEntity  infosys;
    private BusinessEntity  node;
    private Poc             origPoc;
    private BusinessEntity  system;
    private Poc             techPoc;

    public Ecr() {

    }

    public Ecr(final GlobalVars gVars) {
        super(gVars);
    }

    /**
     * Execute load at construction.
     */
    public Ecr(final int ecrId) {
        load(ecrId);
    }

    public Ecr(final int ecrId, final BusinessEntity infosys, final Org ecrOrg, final Poc techPoc,
            final BusinessEntity node, final Poc origPoc, final EcrTypeCd ecrTypeCd, final BusinessEntity system,
            final String ecrShrttitle, final int ecrNumber, final Date ecrReqcompdt, final String ecrDesc,
            final String ecrPlandesc, final String ecrSoldesc, final String ecrEstcost,
            final BusinessEntity ecrProject, final String ecrPrioritydesc, final String ecrAqtnType,
            final LinkedHashSet<Ecrlc> ecrlcs, final Set<EcrCiAssoc> ecrCiAssocs, final Set<EafDocs> eafDocs) {
        this.ecrId = ecrId;
        this.infosys = infosys;
        this.ecrOrg = ecrOrg;
        this.techPoc = techPoc;
        this.node = node;
        this.origPoc = origPoc;
        this.ecrTypeCd = ecrTypeCd;
        this.system = system;
        // this.owner = owner;
        // this.datetime = datetime;
        // this.archive = archive;
        this.ecrShrttitle = ecrShrttitle;
        this.ecrNumber = ecrNumber;
        this.ecrReqcompdt = ecrReqcompdt;
        this.ecrDesc = ecrDesc;
        this.ecrPlandesc = ecrPlandesc;
        this.ecrSoldesc = ecrSoldesc;
        this.ecrEstcost = ecrEstcost;
        this.ecrProject = ecrProject;
        this.ecrPrioritydesc = ecrPrioritydesc;
        this.ecrAqtnType = ecrAqtnType;
        this.ecrlcs = ecrlcs;
        this.ecrCiAssocs = ecrCiAssocs;
        this.eafDocs = eafDocs;

    }

    public Ecr(final int ecrId, final BusinessEntity infosys, final Org ecrOrg, final Poc origPoc,
            final EcrTypeCd ecrTypeCd, final String ecrShrttitle, final int ecrNumber, final Date ecrReqcompdt,
            final String ecrDesc) {
        this.ecrId = ecrId;
        this.infosys = infosys;
        this.ecrOrg = ecrOrg;
        this.origPoc = origPoc;
        this.ecrTypeCd = ecrTypeCd;
        this.ecrShrttitle = ecrShrttitle;
        this.ecrNumber = ecrNumber;
        this.ecrReqcompdt = ecrReqcompdt;
        this.ecrDesc = ecrDesc;

    }

    public void fetchCurrentEcrlc() {
        currentEcrlc = new Ecrlc();
        currentEcrlc.setApp("ea");

        currentEcrlc.load("ecrlcId", "(select max(t.ecrlcId) from Ecrlc t where t.ecrId = " + Integer.toString(ecrId)
                + ")");
        // currentEcrlc.load("ecrlcId",
        // "(select max(t.ecrlcId) from Ecrlc t where t.ecrId = 1)");
    }

    public Ecrlc getCurrentEcrlc() {
        return currentEcrlc;
    }

    public EafTransaction getCurrentTlog() {
        return currentTlog;
    }

    public Set<EafDocs> getEafDocs() {
        return this.eafDocs;
    }

    public String getEcrAqtnType() {
        return this.ecrAqtnType;
    }

    public Set<EcrCiAssoc> getEcrCiAssocs() {
        return this.ecrCiAssocs;
    }

    public String getEcrDesc() {
        return this.ecrDesc;
    }

    public String getEcrEstcost() {
        return this.ecrEstcost;
    }

    public int getEcrId() {
        return this.ecrId;
    }

    public Set<Ecrlc> getEcrlcs() {
        return this.ecrlcs;
    }

    public int getEcrNumber() {
        return this.ecrNumber;
    }

    public Org getEcrOrg() {
        return this.ecrOrg;
    }

    public String getEcrPlandesc() {
        return this.ecrPlandesc;
    }

    public String getEcrPrioritydesc() {
        return this.ecrPrioritydesc;
    }

    public BusinessEntity getEcrProject() {
        return ecrProject;
    }

    public Date getEcrReqcompdt() {
        return this.ecrReqcompdt;
    }

    public String getEcrShrttitle() {
        return this.ecrShrttitle;
    }

    public String getEcrSoldesc() {
        return this.ecrSoldesc;
    }

    public EcrTypeCd getEcrTypeCd() {
        return this.ecrTypeCd;
    }

    @Override
    public Integer getId() {
        return getEcrId();
    }

    public BusinessEntity getInfosys() {
        return this.infosys;
    }

    @Override
    public String getName() {
        return getEcrShrttitle();
    }

    public BusinessEntity getNode() {
        return this.node;
    }

    public Poc getOrigPoc() {
        return this.origPoc;
    }

    public BusinessEntity getSystem() {
        return this.system;
    }

    public Poc getTechPoc() {
        return this.techPoc;
    }

    @Override
    public String getThisLink() {

        // currentEcrlc = new Ecrlc();
        // currentEcrlc.setApp("ea");
        //
        // currentEcrlc.load("ecrlcId",
        // "(select max(t.ecrlcId) from Ecrlc t where t.ecrId = " +
        // Integer.toString(ecrId) + ")");

        fetchCurrentEcrlc();

        final StringBuilder title = new StringBuilder();
        title.append("ECR # ");
        title.append(Integer.toString(ecrNumber));
        title.append(" ~ ");
        title.append(ecrShrttitle);
        title.append(pageMarkup.br());
        title.append(currentEcrlc.getEcrlcStatus());
        title.append(" ");
        title.append(currentEcrlc.getEcrlcSubstatus());
        title.append(" @ Priority ");
        title.append(Integer.toString(currentEcrlc.getEcrlcPriority()));
        title.append(" With ");
        title.append(currentEcrlc.getEcrlcLoe());
        title.append(" LOE ~ ");

        if (currentEcrlc.getExecPoc() != null) {
            title.append(currentEcrlc.getExecPoc().getPocFullNm());
            title.append(" executing.");
        } else {
            title.append(" unassigned.");
        }

        return title.toString();
    }

    public void setCurrentEcrlc(final Ecrlc incCurrentEcrlc) {
        currentEcrlc = incCurrentEcrlc;
    }

    public void setCurrentTlog(final EafTransaction incCurrentTlog) {
        currentTlog = incCurrentTlog;
    }

    public void setEafDocs(final Set<EafDocs> incEafDocs) {
        this.eafDocs = incEafDocs;
    }

    // public Integer getEcrProjectId() {
    // return this.ecrProjectId;
    // }
    //
    // public void setEcrProjectId(final Integer incEcrProjectId) {
    // this.ecrProjectId = incEcrProjectId;
    // }

    public void setEcrAqtnType(final String incEcrAqtnType) {
        this.ecrAqtnType = incEcrAqtnType;
    }

    public void setEcrCiAssocs(final Set<EcrCiAssoc> incEcrCiAssocs) {
        this.ecrCiAssocs = incEcrCiAssocs;
    }

    public void setEcrDesc(final String incEcrDesc) {
        this.ecrDesc = incEcrDesc;
    }

    public void setEcrEstcost(final String incEcrEstcost) {
        this.ecrEstcost = incEcrEstcost;
    }

    public void setEcrId(final int incEcrId) {
        this.ecrId = incEcrId;
    }

    public void setEcrlcs(final Set<Ecrlc> incEcrlcs) {
        this.ecrlcs = incEcrlcs;
    }

    public void setEcrNumber(final int incEcrNumber) {
        this.ecrNumber = incEcrNumber;
    }

    public void setEcrOrg(final Org incOrg) {
        this.ecrOrg = incOrg;
    }

    public void setEcrPlandesc(final String incEcrPlandesc) {
        this.ecrPlandesc = incEcrPlandesc;
    }

    public void setEcrPrioritydesc(final String incEcrPrioritydesc) {
        this.ecrPrioritydesc = incEcrPrioritydesc;
    }

    public void setEcrProject(final BusinessEntity incEcrProject) {
        ecrProject = incEcrProject;
    }

    public void setEcrReqcompdt(final Date incEcrReqcompdt) {
        this.ecrReqcompdt = incEcrReqcompdt;
    }

    public void setEcrShrttitle(final String incEcrShrttitle) {
        this.ecrShrttitle = incEcrShrttitle;
    }

    public void setEcrSoldesc(final String incEcrSoldesc) {
        this.ecrSoldesc = incEcrSoldesc;
    }

    public void setEcrTypeCd(final EcrTypeCd incEcrTypeCd) {
        this.ecrTypeCd = incEcrTypeCd;
    }

    @Override
    public void setId(final Object incId) {
        setEcrId(((Integer) incId).intValue());
    }

    public void setInfosys(final BusinessEntity incInfosys) {
        this.infosys = incInfosys;
    }

    @Override
    public void setName(final String incName) {
        setEcrShrttitle(incName);
    }

    public void setNode(final BusinessEntity incNode) {
        this.node = incNode;
    }

    public void setOrigPoc(final Poc incOrigPoc) {
        this.origPoc = incOrigPoc;
    }

    public void setSystem(final BusinessEntity incSystem) {
        this.system = incSystem;
    }

    public void setTechPoc(final Poc incTechPoc) {
        this.techPoc = incTechPoc;
    }
    public String getViewUrl(){
        return "EAJAVA/tracking/ecr/view?currentid=" + ecrId;
    }
}
