/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthomeoracledb;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "KHATASURVEYCONB", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Khatasurveyconb.findAll", query = "SELECT k FROM Khatasurveyconb k"),
    @NamedQuery(name = "Khatasurveyconb.findByKhatanum", query = "SELECT k FROM Khatasurveyconb k WHERE k.khatanum = :khatanum"),
    @NamedQuery(name = "Khatasurveyconb.findBySurveynum", query = "SELECT k FROM Khatasurveyconb k WHERE k.surveynum = :surveynum"),
    @NamedQuery(name = "Khatasurveyconb.findByVillage", query = "SELECT k FROM Khatasurveyconb k WHERE k.village = :village"),
    @NamedQuery(name = "Khatasurveyconb.findByOldsurveyno", query = "SELECT k FROM Khatasurveyconb k WHERE k.oldsurveyno = :oldsurveyno"),
    @NamedQuery(name = "Khatasurveyconb.findByUniqueno", query = "SELECT k FROM Khatasurveyconb k WHERE k.uniqueno = :uniqueno")})
public class Khatasurveyconb implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "KHATANUM")
    private BigInteger khatanum;
    @Basic(optional = false)
    @Column(name = "SURVEYNUM")
    private BigInteger surveynum;
    @Column(name = "VILLAGE")
    private String village;
    @Column(name = "OLDSURVEYNO")
    private String oldsurveyno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "UNIQUENO")
    private BigDecimal uniqueno;

    public Khatasurveyconb() {
    }

    public Khatasurveyconb(BigDecimal uniqueno) {
        this.uniqueno = uniqueno;
    }

    public Khatasurveyconb(BigDecimal uniqueno, BigInteger surveynum) {
        this.uniqueno = uniqueno;
        this.surveynum = surveynum;
    }

    public BigInteger getKhatanum() {
        return khatanum;
    }

    public void setKhatanum(BigInteger khatanum) {
        BigInteger oldKhatanum = this.khatanum;
        this.khatanum = khatanum;
        changeSupport.firePropertyChange("khatanum", oldKhatanum, khatanum);
    }

    public BigInteger getSurveynum() {
        return surveynum;
    }

    public void setSurveynum(BigInteger surveynum) {
        BigInteger oldSurveynum = this.surveynum;
        this.surveynum = surveynum;
        changeSupport.firePropertyChange("surveynum", oldSurveynum, surveynum);
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        String oldVillage = this.village;
        this.village = village;
        changeSupport.firePropertyChange("village", oldVillage, village);
    }

    public String getOldsurveyno() {
        return oldsurveyno;
    }

    public void setOldsurveyno(String oldsurveyno) {
        String oldOldsurveyno = this.oldsurveyno;
        this.oldsurveyno = oldsurveyno;
        changeSupport.firePropertyChange("oldsurveyno", oldOldsurveyno, oldsurveyno);
    }

    public BigDecimal getUniqueno() {
        return uniqueno;
    }

    public void setUniqueno(BigDecimal uniqueno) {
        BigDecimal oldUniqueno = this.uniqueno;
        this.uniqueno = uniqueno;
        changeSupport.firePropertyChange("uniqueno", oldUniqueno, uniqueno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uniqueno != null ? uniqueno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khatasurveyconb)) {
            return false;
        }
        Khatasurveyconb other = (Khatasurveyconb) object;
        if ((this.uniqueno == null && other.uniqueno != null) || (this.uniqueno != null && !this.uniqueno.equals(other.uniqueno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projecthomeoracledb.Khatasurveyconb[ uniqueno=" + uniqueno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
