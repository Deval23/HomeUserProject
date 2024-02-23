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
@Table(name = "USERDETAIL", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Userdetail_1.findAll", query = "SELECT u FROM Userdetail_1 u"),
    @NamedQuery(name = "Userdetail_1.findByUsid", query = "SELECT u FROM Userdetail_1 u WHERE u.usid = :usid"),
    @NamedQuery(name = "Userdetail_1.findByUfname", query = "SELECT u FROM Userdetail_1 u WHERE u.ufname = :ufname"),
    @NamedQuery(name = "Userdetail_1.findByUlname", query = "SELECT u FROM Userdetail_1 u WHERE u.ulname = :ulname"),
    @NamedQuery(name = "Userdetail_1.findByUpan", query = "SELECT u FROM Userdetail_1 u WHERE u.upan = :upan"),
    @NamedQuery(name = "Userdetail_1.findByUadhar", query = "SELECT u FROM Userdetail_1 u WHERE u.uadhar = :uadhar"),
    @NamedQuery(name = "Userdetail_1.findByUcontact", query = "SELECT u FROM Userdetail_1 u WHERE u.ucontact = :ucontact")})
public class Userdetail_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USID")
    private String usid;
    @Column(name = "UFNAME")
    private String ufname;
    @Column(name = "ULNAME")
    private String ulname;
    @Column(name = "UPAN")
    private String upan;
    @Column(name = "UADHAR")
    private String uadhar;
    @Column(name = "UCONTACT")
    private String ucontact;

    public Userdetail_1() {
    }

    public Userdetail_1(String usid) {
        this.usid = usid;
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        String oldUsid = this.usid;
        this.usid = usid;
        changeSupport.firePropertyChange("usid", oldUsid, usid);
    }

    public String getUfname() {
        return ufname;
    }

    public void setUfname(String ufname) {
        String oldUfname = this.ufname;
        this.ufname = ufname;
        changeSupport.firePropertyChange("ufname", oldUfname, ufname);
    }

    public String getUlname() {
        return ulname;
    }

    public void setUlname(String ulname) {
        String oldUlname = this.ulname;
        this.ulname = ulname;
        changeSupport.firePropertyChange("ulname", oldUlname, ulname);
    }

    public String getUpan() {
        return upan;
    }

    public void setUpan(String upan) {
        String oldUpan = this.upan;
        this.upan = upan;
        changeSupport.firePropertyChange("upan", oldUpan, upan);
    }

    public String getUadhar() {
        return uadhar;
    }

    public void setUadhar(String uadhar) {
        String oldUadhar = this.uadhar;
        this.uadhar = uadhar;
        changeSupport.firePropertyChange("uadhar", oldUadhar, uadhar);
    }

    public String getUcontact() {
        return ucontact;
    }

    public void setUcontact(String ucontact) {
        String oldUcontact = this.ucontact;
        this.ucontact = ucontact;
        changeSupport.firePropertyChange("ucontact", oldUcontact, ucontact);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usid != null ? usid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userdetail_1)) {
            return false;
        }
        Userdetail_1 other = (Userdetail_1) object;
        if ((this.usid == null && other.usid != null) || (this.usid != null && !this.usid.equals(other.usid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projecthomeoracledb.Userdetail_1[ usid=" + usid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
