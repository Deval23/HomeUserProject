/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthomeoracledb;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Deval Nayak
 */
@Entity
@Table(name = "ELECON", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Elecon.findAll", query = "SELECT e FROM Elecon e"),
    @NamedQuery(name = "Elecon.findByElecon", query = "SELECT e FROM Elecon e WHERE e.elecon = :elecon"),
    @NamedQuery(name = "Elecon.findByEleconname", query = "SELECT e FROM Elecon e WHERE e.eleconname = :eleconname"),
    @NamedQuery(name = "Elecon.findByMeternum", query = "SELECT e FROM Elecon e WHERE e.meternum = :meternum"),
    @NamedQuery(name = "Elecon.findByLocation", query = "SELECT e FROM Elecon e WHERE e.location = :location"),
    @NamedQuery(name = "Elecon.findByUsid", query = "SELECT e FROM Elecon e WHERE e.usid = :usid")})
public class Elecon implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ELECON")
    private String elecon;
    @Column(name = "ELECONNAME")
    private String eleconname;
    @Column(name = "METERNUM")
    private String meternum;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "USID")
    private String usid;

    public Elecon() {
    }

    public Elecon(String elecon) {
        this.elecon = elecon;
    }

    public String getElecon() {
        return elecon;
    }

    public void setElecon(String elecon) {
        String oldElecon = this.elecon;
        this.elecon = elecon;
        changeSupport.firePropertyChange("elecon", oldElecon, elecon);
    }

    public String getEleconname() {
        return eleconname;
    }

    public void setEleconname(String eleconname) {
        String oldEleconname = this.eleconname;
        this.eleconname = eleconname;
        changeSupport.firePropertyChange("eleconname", oldEleconname, eleconname);
    }

    public String getMeternum() {
        return meternum;
    }

    public void setMeternum(String meternum) {
        String oldMeternum = this.meternum;
        this.meternum = meternum;
        changeSupport.firePropertyChange("meternum", oldMeternum, meternum);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        String oldUsid = this.usid;
        this.usid = usid;
        changeSupport.firePropertyChange("usid", oldUsid, usid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (elecon != null ? elecon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elecon)) {
            return false;
        }
        Elecon other = (Elecon) object;
        if ((this.elecon == null && other.elecon != null) || (this.elecon != null && !this.elecon.equals(other.elecon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projecthomeoracledb.Elecon[ elecon=" + elecon + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
