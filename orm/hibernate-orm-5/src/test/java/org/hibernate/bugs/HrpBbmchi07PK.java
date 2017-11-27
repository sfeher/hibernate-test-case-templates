/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate.bugs;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Embeddable
public class HrpBbmchi07PK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COMPANY")
    private String company;
    @Basic(optional = false)
    @Column(name = "VALTDATUM")
    @Temporal(TemporalType.DATE)
    private Date valtdatum;
    @Basic(optional = false)

    @Column(name = "BBM_BBST_TORZSSZAM")
    private int bbmBbstTorzsszam;

    public HrpBbmchi07PK() {
    }

    public HrpBbmchi07PK(String company, Date valtdatum, int bbmBbstTorzsszam) {
        this.company = company;
        this.valtdatum = valtdatum;
        this.bbmBbstTorzsszam = bbmBbstTorzsszam;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getValtdatum() {
        return valtdatum;
    }

    public void setValtdatum(Date valtdatum) {
        this.valtdatum = valtdatum;
    }

    public int getBbmBbstTorzsszam() {
        return bbmBbstTorzsszam;
    }

    public void setBbmBbstTorzsszam(int bbmBbstTorzsszam) {
        this.bbmBbstTorzsszam = bbmBbstTorzsszam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (company != null ? company.hashCode() : 0);
        hash += (valtdatum != null ? valtdatum.hashCode() : 0);
        hash += (int) bbmBbstTorzsszam;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HrpBbmchi07PK)) {
            return false;
        }
        HrpBbmchi07PK other = (HrpBbmchi07PK) object;
        if ((this.company == null && other.company != null) || (this.company != null && !this.company.equals(other.company))) {
            return false;
        }
        if ((this.valtdatum == null && other.valtdatum != null) || (this.valtdatum != null && !this.valtdatum.equals(other.valtdatum))) {
            return false;
        }
        if (this.bbmBbstTorzsszam != other.bbmBbstTorzsszam) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hu.bluesystem.hrportal.model.HrpBbmchi07PK[ company=" + company + ", valtdatum=" + valtdatum + ", bbmBbstTorzsszam=" + bbmBbstTorzsszam + " ]";
    }
    
}
