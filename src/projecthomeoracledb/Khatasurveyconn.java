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
@Table(name = "KHATASURVEYCONN", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Khatasurveyconn.findAll", query = "SELECT k FROM Khatasurveyconn k"),
    @NamedQuery(name = "Khatasurveyconn.findByKhatanum", query = "SELECT k FROM Khatasurveyconn k WHERE k.khatanum = :khatanum"),
    @NamedQuery(name = "Khatasurveyconn.findBySurveyno", query = "SELECT k FROM Khatasurveyconn k WHERE k.surveyno = :surveyno"),
    @NamedQuery(name = "Khatasurveyconn.findByVillage", query = "SELECT k FROM Khatasurveyconn k WHERE k.village = :village")})
public class Khatasurveyconn implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "KHATANUM")
    private BigInteger khatanum;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "SURVEYNO")
    private BigDecimal surveyno;
    @Column(name = "VILLAGE")
    private String village;

    public Khatasurveyconn() {
    }

    public Khatasurveyconn(BigDecimal surveyno) {
        this.surveyno = surveyno;
    }

    public BigInteger getKhatanum() {
        return khatanum;
    }

    public void setKhatanum(BigInteger khatanum) {
        BigInteger oldKhatanum = this.khatanum;
        this.khatanum = khatanum;
        changeSupport.firePropertyChange("khatanum", oldKhatanum, khatanum);
    }

    public BigDecimal getSurveyno() {
        return surveyno;
    }

    public void setSurveyno(BigDecimal surveyno) {
        BigDecimal oldSurveyno = this.surveyno;
        this.surveyno = surveyno;
        changeSupport.firePropertyChange("surveyno", oldSurveyno, surveyno);
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        String oldVillage = this.village;
        this.village = village;
        changeSupport.firePropertyChange("village", oldVillage, village);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyno != null ? surveyno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khatasurveyconn)) {
            return false;
        }
        Khatasurveyconn other = (Khatasurveyconn) object;
        if ((this.surveyno == null && other.surveyno != null) || (this.surveyno != null && !this.surveyno.equals(other.surveyno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projecthomeoracledb.Khatasurveyconn[ surveyno=" + surveyno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
