/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hibernate.bugs;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sfeher
 */
@Entity
@Table(name = "HRP_BBSTORZS")
@XmlRootElement

public class HrpBbstorzs implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HrpBbstorzsPK hrpBbstorzsPK;
    @Basic(optional = false)
    @Column(name = "TAX_NR")
    private String taxNr;
    @Basic(optional = false)
    @Column(name = "NEV")
    private String nev;
    @Column(name = "LEANYNEV")
    private String leanynev;
    @Basic(optional = false)
    @Column(name = "BBSIR_IRSZAM")
    private int bbsirIrszam;
    @Basic(optional = false)
    @Column(name = "UTCANEV")
    private String utcanev;
    @Basic(optional = false)
    @Column(name = "KOZTNEVE")
    private String koztneve;
    @Basic(optional = false)
    @Column(name = "HAZSZHSZAM")
    private String hazszhszam;
    @Column(name = "KERULET")
    private String kerulet;
    @Column(name = "EPULET")
    private String epulet;
    @Column(name = "LEPCSOHAZ")
    private String lepcsohaz;
    @Column(name = "EMELET")
    private String emelet;
    @Column(name = "AJTO")
    private String ajto;
    @Column(name = "BANKSZAMLA")
    private String bankszamla;
    @Lob
    @Column(name = "KEP")
    private byte[] kep;
    @Column(name = "E_MAIL")
    private String eMail;
    @Column(name = "TELEFON")
    private String telefon;
    @Column(name = "BALESET_ESETEN_NEV")
    private String balesetEsetenNev;
    @Column(name = "BALESET_ESETEN_TEL")
    private String balesetEsetenTel;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private String status;
    @Basic(optional = false)
    @Column(name = "CRU")
    private String cru;
    @Basic(optional = false)
    @Column(name = "CRD")
    @Temporal(TemporalType.DATE)
    private Date crd;
    @Column(name = "LMU")
    private String lmu;
    @Column(name = "LMD")
    @Temporal(TemporalType.DATE)
    private Date lmd;
    @Basic(optional = false)
    @Column(name = "CALLER_ID")
    private String callerId;
    @Column(name = "KARTYASZAM")
    private String kartyaszam;
    @Column(name = "TAJSZAM")
    private Integer tajszam;
    @Column(name = "BBM_BBSIR_IRSZAM")
    private Integer bbmBbsirIrszam;
    @Column(name = "BBM_UTCANEV")
    private String bbmUtcanev;
    @Column(name = "BBM_KOZTNEVE")
    private String bbmKoztneve;
    @Column(name = "BBM_HAZSZ")
    private String bbmHazsz;
    @Column(name = "BBM_KERULET")
    private String bbmKerulet;
    @Column(name = "BBM_EPULET")
    private String bbmEpulet;
    @Column(name = "BBM_LEPCSOHAZ")
    private String bbmLepcsohaz;
    @Column(name = "BBM_EMELET")
    private String bbmEmelet;
    @Column(name = "BBM_AJTO")
    private String bbmAjto;
    @Column(name = "ALKMINOSEG")
    private Integer alkminoseg;
    @Column(name = "BERFORMA")
    private Integer berforma;
    @Column(name = "FIZETESIIDO")
    private Integer fizetesiido;
    @Column(name = "BELEPESKELT")
    @Temporal(TemporalType.DATE)
    private Date belepeskelt;
    @Column(name = "KILEPESKELT")
    @Temporal(TemporalType.DATE)
    private Date kilepeskelt;
    @Column(name = "SZERVEGYSEG")
    private Integer szervegyseg;
    @Column(name = "KIFHELY")
    private Integer kifhely;
    @Column(name = "ALLCSOP")
    private Integer allcsop;
    @Column(name = "GAZDEGYSEG")
    private Integer gazdegyseg;
    @Column(name = "EGYEBKOD")
    private Integer egyebkod;
    @Column(name = "FOJOGVISZONY")
    private Integer fojogviszony;
    @Column(name = "ANYJANEVE")
    private String anyjaneve;
    @Column(name = "NEME")
    private String neme;
    @Column(name = "SZULETESIHELY")
    private String szuletesihely;
    @Column(name = "SZULETESIIDO")
    @Temporal(TemporalType.DATE)
    private Date szuletesiido;
    @Column(name = "MUNMSZJOG")
    private Integer munmszjog;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BESOROLAS")
    private BigDecimal besorolas;
    @Column(name = "MUNKAKOR")
    private String munkakor;
    
    @OneToMany(mappedBy = "bbstorzs")
//    @JoinTable(name = "HRP_BBMCHI07")
//    @JoinColumns({
//    @JoinColumn(name = "COMPANY", referencedColumnName = "COMPANY", insertable = false, updatable = false),
//    @JoinColumn(name = "BBM_BBST_TORZSSZAM", referencedColumnName = "TORZSSZAM", insertable = false, updatable = false)})            
//    @WhereJoinTable(clause = "VALTDATUM in (select max(VALTDATUM) from HRP_BBMCHI07 F where F.FELETTESTORZSSZAM=FELETTESTORZSSZAM AND F.BBM_BBST_TORZSSZAM=BBM_BBST_TORZSSZAM AND F.COMPANY=COMPANY  group by valtdatum)")  


//    @JoinColumns({
//    @JoinColumn(name = "COMPANY", referencedColumnName = "COMPANY", insertable = false, updatable = false),
//    @JoinColumn(name = "BBM_BBST_TORZSSZAM", referencedColumnName = "TORZSSZAM", insertable = false, updatable = false)})             
//            @JoinFormula(
//"(HRP_BBMCHI07.COMPANY = COMPANY AND HRP_BBMCHI07.BBM_BBST_TORZSSZAM = TORZSSZAM AND VALTDATUM in (select max(VALTDATUM) from HRP_BBMCHI07 F where F.FELETTESTORZSSZAM=FELETTESTORZSSZAM AND F.BBM_BBST_TORZSSZAM=BBM_BBST_TORZSSZAM AND F.COMPANY=COMPANY group by valtdatum))" 
//)
    //@Where(clause = " VALTDATUM in (select max(F.VALTDATUM) from HRP_BBMCHI07 F where F.FELETTESTORZSSZAM=FELETTESTORZSSZAM AND F.BBM_BBST_TORZSSZAM=BBM_BBST_TORZSSZAM AND F.COMPANY=COMPANY)")
    //@Filter(name = "FELETTES_FILTER", condition = "VALTDATUM = (select max(VALTDATUM) from HRP_BBMCHI07 F where F.FELETTESTORZSSZAM=FELETTESTORZSSZAM AND F.BBM_BBST_TORZSSZAM=BBM_BBST_TORZSSZAM AND F.COMPANY=COMPANY")
   //@Fetch(FetchMode.SELECT) 
    List<HrpBbmchi07> felettes;     
    
        //@Filter(name = "filter",condition = "VALTDATUM = (select max(F.VALTDATUM) from HRP_BBMCHI07 F where F.FELETTESTORZSSZAM=FELETTESTORZSSZAM AND F.BBM_BBST_TORZSSZAM=BBM_BBST_TORZSSZAM AND F.COMPANY=COMPANY group by f.VALTDATUM)")
    //@FilterJoinTable(name = "filter", condition = "VALTDATUM = (select max(F.VALTDATUM) from HRP_BBMCHI07 F where F.FELETTESTORZSSZAM=FELETTESTORZSSZAM AND F.BBM_BBST_TORZSSZAM=BBM_BBST_TORZSSZAM AND F.COMPANY=COMPANY")
    
//    @Fetch(FetchMode.SELECT) 

    
    public HrpBbstorzs() {
    }

    public HrpBbstorzs(HrpBbstorzsPK hrpBbstorzsPK) {
        this.hrpBbstorzsPK = hrpBbstorzsPK;
    }

    public HrpBbstorzs(HrpBbstorzsPK hrpBbstorzsPK, String taxNr, String nev, int bbsirIrszam, String utcanev, String koztneve, String hazszhszam, String status, String cru, Date crd, String callerId) {
        this.hrpBbstorzsPK = hrpBbstorzsPK;
        this.taxNr = taxNr;
        this.nev = nev;
        this.bbsirIrszam = bbsirIrszam;
        this.utcanev = utcanev;
        this.koztneve = koztneve;
        this.hazszhszam = hazszhszam;
        this.status = status;
        this.cru = cru;
        this.crd = crd;
        this.callerId = callerId;
    }

    public HrpBbstorzs(String company, int torzsszam) {
        this.hrpBbstorzsPK = new HrpBbstorzsPK(company, torzsszam);
    }

    public HrpBbstorzsPK getHrpBbstorzsPK() {
        return hrpBbstorzsPK;
    }

    public void setHrpBbstorzsPK(HrpBbstorzsPK hrpBbstorzsPK) {
        this.hrpBbstorzsPK = hrpBbstorzsPK;
    }

    public String getTaxNr() {
        return taxNr;
    }

    public void setTaxNr(String taxNr) {
        this.taxNr = taxNr;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getLeanynev() {
        return leanynev;
    }

    public void setLeanynev(String leanynev) {
        this.leanynev = leanynev;
    }

    public int getBbsirIrszam() {
        return bbsirIrszam;
    }

    public void setBbsirIrszam(int bbsirIrszam) {
        this.bbsirIrszam = bbsirIrszam;
    }

    public String getUtcanev() {
        return utcanev;
    }

    public void setUtcanev(String utcanev) {
        this.utcanev = utcanev;
    }

    public String getKoztneve() {
        return koztneve;
    }

    public void setKoztneve(String koztneve) {
        this.koztneve = koztneve;
    }

    public String getHazszhszam() {
        return hazszhszam;
    }

    public void setHazszhszam(String hazszhszam) {
        this.hazszhszam = hazszhszam;
    }

    public String getKerulet() {
        return kerulet;
    }

    public void setKerulet(String kerulet) {
        this.kerulet = kerulet;
    }

    public String getEpulet() {
        return epulet;
    }

    public void setEpulet(String epulet) {
        this.epulet = epulet;
    }

    public String getLepcsohaz() {
        return lepcsohaz;
    }

    public void setLepcsohaz(String lepcsohaz) {
        this.lepcsohaz = lepcsohaz;
    }

    public String getEmelet() {
        return emelet;
    }

    public void setEmelet(String emelet) {
        this.emelet = emelet;
    }

    public String getAjto() {
        return ajto;
    }

    public void setAjto(String ajto) {
        this.ajto = ajto;
    }

    public String getBankszamla() {
        return bankszamla;
    }

    public void setBankszamla(String bankszamla) {
        this.bankszamla = bankszamla;
    }

    public byte[] getKep() {
        return kep;
    }

    public void setKep(byte[] kep) {
        this.kep = kep;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getBalesetEsetenNev() {
        return balesetEsetenNev;
    }

    public void setBalesetEsetenNev(String balesetEsetenNev) {
        this.balesetEsetenNev = balesetEsetenNev;
    }

    public String getBalesetEsetenTel() {
        return balesetEsetenTel;
    }

    public void setBalesetEsetenTel(String balesetEsetenTel) {
        this.balesetEsetenTel = balesetEsetenTel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCru() {
        return cru;
    }

    public void setCru(String cru) {
        this.cru = cru;
    }

    public Date getCrd() {
        return crd;
    }

    public void setCrd(Date crd) {
        this.crd = crd;
    }

    public String getLmu() {
        return lmu;
    }

    public void setLmu(String lmu) {
        this.lmu = lmu;
    }

    public Date getLmd() {
        return lmd;
    }

    public void setLmd(Date lmd) {
        this.lmd = lmd;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getKartyaszam() {
        return kartyaszam;
    }

    public void setKartyaszam(String kartyaszam) {
        this.kartyaszam = kartyaszam;
    }

    public Integer getTajszam() {
        return tajszam;
    }

    public void setTajszam(Integer tajszam) {
        this.tajszam = tajszam;
    }

    public Integer getBbmBbsirIrszam() {
        return bbmBbsirIrszam;
    }

    public void setBbmBbsirIrszam(Integer bbmBbsirIrszam) {
        this.bbmBbsirIrszam = bbmBbsirIrszam;
    }

    public String getBbmUtcanev() {
        return bbmUtcanev;
    }

    public void setBbmUtcanev(String bbmUtcanev) {
        this.bbmUtcanev = bbmUtcanev;
    }

    public String getBbmKoztneve() {
        return bbmKoztneve;
    }

    public void setBbmKoztneve(String bbmKoztneve) {
        this.bbmKoztneve = bbmKoztneve;
    }

    public String getBbmHazsz() {
        return bbmHazsz;
    }

    public void setBbmHazsz(String bbmHazsz) {
        this.bbmHazsz = bbmHazsz;
    }

    public String getBbmKerulet() {
        return bbmKerulet;
    }

    public void setBbmKerulet(String bbmKerulet) {
        this.bbmKerulet = bbmKerulet;
    }

    public String getBbmEpulet() {
        return bbmEpulet;
    }

    public void setBbmEpulet(String bbmEpulet) {
        this.bbmEpulet = bbmEpulet;
    }

    public String getBbmLepcsohaz() {
        return bbmLepcsohaz;
    }

    public void setBbmLepcsohaz(String bbmLepcsohaz) {
        this.bbmLepcsohaz = bbmLepcsohaz;
    }

    public String getBbmEmelet() {
        return bbmEmelet;
    }

    public void setBbmEmelet(String bbmEmelet) {
        this.bbmEmelet = bbmEmelet;
    }

    public String getBbmAjto() {
        return bbmAjto;
    }

    public void setBbmAjto(String bbmAjto) {
        this.bbmAjto = bbmAjto;
    }

    public Integer getAlkminoseg() {
        return alkminoseg;
    }

    public void setAlkminoseg(Integer alkminoseg) {
        this.alkminoseg = alkminoseg;
    }

    public Integer getBerforma() {
        return berforma;
    }

    public void setBerforma(Integer berforma) {
        this.berforma = berforma;
    }

    public Integer getFizetesiido() {
        return fizetesiido;
    }

    public void setFizetesiido(Integer fizetesiido) {
        this.fizetesiido = fizetesiido;
    }

    public Date getBelepeskelt() {
        return belepeskelt;
    }

    public void setBelepeskelt(Date belepeskelt) {
        this.belepeskelt = belepeskelt;
    }

    public Date getKilepeskelt() {
        return kilepeskelt;
    }

    public void setKilepeskelt(Date kilepeskelt) {
        this.kilepeskelt = kilepeskelt;
    }

    public Integer getSzervegyseg() {
        return szervegyseg;
    }

    public void setSzervegyseg(Integer szervegyseg) {
        this.szervegyseg = szervegyseg;
    }

    public Integer getKifhely() {
        return kifhely;
    }

    public void setKifhely(Integer kifhely) {
        this.kifhely = kifhely;
    }

    public Integer getAllcsop() {
        return allcsop;
    }

    public void setAllcsop(Integer allcsop) {
        this.allcsop = allcsop;
    }

    public Integer getGazdegyseg() {
        return gazdegyseg;
    }

    public void setGazdegyseg(Integer gazdegyseg) {
        this.gazdegyseg = gazdegyseg;
    }

    public Integer getEgyebkod() {
        return egyebkod;
    }

    public void setEgyebkod(Integer egyebkod) {
        this.egyebkod = egyebkod;
    }

    public Integer getFojogviszony() {
        return fojogviszony;
    }

    public void setFojogviszony(Integer fojogviszony) {
        this.fojogviszony = fojogviszony;
    }

    public String getAnyjaneve() {
        return anyjaneve;
    }

    public void setAnyjaneve(String anyjaneve) {
        this.anyjaneve = anyjaneve;
    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public String getSzuletesihely() {
        return szuletesihely;
    }

    public void setSzuletesihely(String szuletesihely) {
        this.szuletesihely = szuletesihely;
    }

    public Date getSzuletesiido() {
        return szuletesiido;
    }

    public void setSzuletesiido(Date szuletesiido) {
        this.szuletesiido = szuletesiido;
    }

    public Integer getMunmszjog() {
        return munmszjog;
    }

    public void setMunmszjog(Integer munmszjog) {
        this.munmszjog = munmszjog;
    }

    public BigDecimal getBesorolas() {
        return besorolas;
    }

    public void setBesorolas(BigDecimal besorolas) {
        this.besorolas = besorolas;
    }

    public String getMunkakor() {
        return munkakor;
    }

    public void setMunkakor(String munkakor) {
        this.munkakor = munkakor;
    }


    public void setFelettesList(List<HrpBbmchi07> felettes) {
        this.felettes = felettes;
    }

    public List<HrpBbmchi07> getFelettes() {
        return felettes;
    }



    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hrpBbstorzsPK != null ? hrpBbstorzsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HrpBbstorzs)) {
            return false;
        }
        HrpBbstorzs other = (HrpBbstorzs) object;
        if ((this.hrpBbstorzsPK == null && other.hrpBbstorzsPK != null) || (this.hrpBbstorzsPK != null && !this.hrpBbstorzsPK.equals(other.hrpBbstorzsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hu.bluesystem.hrportal.model.HrpBbstorzs[ hrpBbstorzsPK=" + hrpBbstorzsPK + " ]";
    }
    
}
