/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hibernate.bugs;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author sfeher
 */
@Embeddable
public class HrpBbstorzsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COMPANY")
    private String company;
    @Basic(optional = false)
    @Column(name = "TORZSSZAM")
    private int torzsszam;

    public HrpBbstorzsPK() {
    }

    public HrpBbstorzsPK(String company, int torzsszam) {
        this.company = company;
        this.torzsszam = torzsszam;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getTorzsszam() {
        return torzsszam;
    }

    public void setTorzsszam(int torzsszam) {
        this.torzsszam = torzsszam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (company != null ? company.hashCode() : 0);
        hash += (int) torzsszam;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HrpBbstorzsPK)) {
            return false;
        }
        HrpBbstorzsPK other = (HrpBbstorzsPK) object;
        if ((this.company == null && other.company != null) || (this.company != null && !this.company.equals(other.company))) {
            return false;
        }
        if (this.torzsszam != other.torzsszam) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hu.bluesystem.hrportal.model.HrpBbstorzsPK[ company=" + company + ", torzsszam=" + torzsszam + " ]";
    }
    
}
