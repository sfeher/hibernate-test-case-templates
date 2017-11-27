/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate.bugs;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Where;

/**
 *
 * @author user
 */
@Entity
@Table(name = "HRP_BBMCHI07")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HrpBbmchi07.findAll", query = "SELECT h FROM HrpBbmchi07 h"),
    @NamedQuery(name = "HrpBbmchi07.findByCompany", query = "SELECT h FROM HrpBbmchi07 h WHERE h.hrpBbmchi07PK.company = :company"),
    @NamedQuery(name = "HrpBbmchi07.findByValtdatum", query = "SELECT h FROM HrpBbmchi07 h WHERE h.hrpBbmchi07PK.valtdatum = :valtdatum"),
    @NamedQuery(name = "HrpBbmchi07.findByFelettesneve", query = "SELECT h FROM HrpBbmchi07 h WHERE h.felettesneve = :felettesneve"),
    @NamedQuery(name = "HrpBbmchi07.findByBbmBbstTorzsszam", query = "SELECT h FROM HrpBbmchi07 h WHERE h.hrpBbmchi07PK.bbmBbstTorzsszam = :bbmBbstTorzsszam"),
    @NamedQuery(name = "HrpBbmchi07.findByFelettestorzsszam", query = "SELECT h FROM HrpBbmchi07 h WHERE h.felettestorzsszam = :felettestorzsszam")})
public class HrpBbmchi07 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HrpBbmchi07PK hrpBbmchi07PK;
    @Basic(optional = false)
    @Column(name = "FELETTESNEVE")
    private String felettesneve;
    @Column(name = "FELETTESTORZSSZAM")
    private Integer felettestorzsszam;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "COMPANY", referencedColumnName = "COMPANY", insertable = false, updatable = false),
        @JoinColumn(name = "BBM_BBST_TORZSSZAM", referencedColumnName = "TORZSSZAM", insertable = false, updatable = false)
    })
    @Where(clause = "VALTDATUM in (select max(VALTDATUM) from HRP_BBMCHI07 F where F.FELETTESTORZSSZAM=FELETTESTORZSSZAM AND F.BBM_BBST_TORZSSZAM=BBM_BBST_TORZSSZAM AND F.COMPANY=COMPANY  group by valtdatum)")   
    private HrpBbstorzs bbstorzs;

    public HrpBbmchi07() {
    }

    public HrpBbmchi07(HrpBbmchi07PK hrpBbmchi07PK) {
        this.hrpBbmchi07PK = hrpBbmchi07PK;
    }

    public HrpBbmchi07(HrpBbmchi07PK hrpBbmchi07PK, String felettesneve) {
        this.hrpBbmchi07PK = hrpBbmchi07PK;
        this.felettesneve = felettesneve;
    }

    public HrpBbmchi07(String company, Date valtdatum, int bbmBbstTorzsszam) {
        this.hrpBbmchi07PK = new HrpBbmchi07PK(company, valtdatum, bbmBbstTorzsszam);
    }

    public HrpBbmchi07PK getHrpBbmchi07PK() {
        return hrpBbmchi07PK;
    }

    public void setHrpBbmchi07PK(HrpBbmchi07PK hrpBbmchi07PK) {
        this.hrpBbmchi07PK = hrpBbmchi07PK;
    }

    public String getFelettesneve() {
        return felettesneve;
    }

    public void setFelettesneve(String felettesneve) {
        this.felettesneve = felettesneve;
    }

    public Integer getFelettestorzsszam() {
        return felettestorzsszam;
    }

    public void setFelettestorzsszam(Integer felettestorzsszam) {
        this.felettestorzsszam = felettestorzsszam;
    }

    public HrpBbstorzs getBbstorzs() {
        return bbstorzs;
    }

    public void setBbstorzs(HrpBbstorzs bbstorzs) {
        this.bbstorzs = bbstorzs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hrpBbmchi07PK != null ? hrpBbmchi07PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HrpBbmchi07)) {
            return false;
        }
        HrpBbmchi07 other = (HrpBbmchi07) object;
        if ((this.hrpBbmchi07PK == null && other.hrpBbmchi07PK != null) || (this.hrpBbmchi07PK != null && !this.hrpBbmchi07PK.equals(other.hrpBbmchi07PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hu.bluesystem.hrportal.model.HrpBbmchi07[ hrpBbmchi07PK=" + hrpBbmchi07PK + " ]";
    }

}
