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
@Table(name = "ACCOUNTDETAIL", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Accountdetail.findAll", query = "SELECT a FROM Accountdetail a"),
    @NamedQuery(name = "Accountdetail.findByAccno", query = "SELECT a FROM Accountdetail a WHERE a.accno = :accno"),
    @NamedQuery(name = "Accountdetail.findByAccifsc", query = "SELECT a FROM Accountdetail a WHERE a.accifsc = :accifsc"),
    @NamedQuery(name = "Accountdetail.findByBankname", query = "SELECT a FROM Accountdetail a WHERE a.bankname = :bankname"),
    @NamedQuery(name = "Accountdetail.findByAccholder", query = "SELECT a FROM Accountdetail a WHERE a.accholder = :accholder"),
    @NamedQuery(name = "Accountdetail.findByUsid", query = "SELECT a FROM Accountdetail a WHERE a.usid = :usid"),
    @NamedQuery(name = "Accountdetail.findByDebitcard", query = "SELECT a FROM Accountdetail a WHERE a.debitcard = :debitcard"),
    @NamedQuery(name = "Accountdetail.findByBasebranch", query = "SELECT a FROM Accountdetail a WHERE a.basebranch = :basebranch"),
    @NamedQuery(name = "Accountdetail.findByMicr", query = "SELECT a FROM Accountdetail a WHERE a.micr = :micr")})
public class Accountdetail implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCNO")
    private String accno;
    @Column(name = "ACCIFSC")
    private String accifsc;
    @Column(name = "BANKNAME")
    private String bankname;
    @Column(name = "ACCHOLDER")
    private String accholder;
    @Column(name = "USID")
    private String usid;
    @Column(name = "DEBITCARD")
    private String debitcard;
    @Column(name = "BASEBRANCH")
    private String basebranch;
    @Column(name = "MICR")
    private String micr;

    public Accountdetail() {
    }

    public Accountdetail(String accno) {
        this.accno = accno;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        String oldAccno = this.accno;
        this.accno = accno;
        changeSupport.firePropertyChange("accno", oldAccno, accno);
    }

    public String getAccifsc() {
        return accifsc;
    }

    public void setAccifsc(String accifsc) {
        String oldAccifsc = this.accifsc;
        this.accifsc = accifsc;
        changeSupport.firePropertyChange("accifsc", oldAccifsc, accifsc);
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        String oldBankname = this.bankname;
        this.bankname = bankname;
        changeSupport.firePropertyChange("bankname", oldBankname, bankname);
    }

    public String getAccholder() {
        return accholder;
    }

    public void setAccholder(String accholder) {
        String oldAccholder = this.accholder;
        this.accholder = accholder;
        changeSupport.firePropertyChange("accholder", oldAccholder, accholder);
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        String oldUsid = this.usid;
        this.usid = usid;
        changeSupport.firePropertyChange("usid", oldUsid, usid);
    }

    public String getDebitcard() {
        return debitcard;
    }

    public void setDebitcard(String debitcard) {
        String oldDebitcard = this.debitcard;
        this.debitcard = debitcard;
        changeSupport.firePropertyChange("debitcard", oldDebitcard, debitcard);
    }

    public String getBasebranch() {
        return basebranch;
    }

    public void setBasebranch(String basebranch) {
        String oldBasebranch = this.basebranch;
        this.basebranch = basebranch;
        changeSupport.firePropertyChange("basebranch", oldBasebranch, basebranch);
    }

    public String getMicr() {
        return micr;
    }

    public void setMicr(String micr) {
        String oldMicr = this.micr;
        this.micr = micr;
        changeSupport.firePropertyChange("micr", oldMicr, micr);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accno != null ? accno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accountdetail)) {
            return false;
        }
        Accountdetail other = (Accountdetail) object;
        if ((this.accno == null && other.accno != null) || (this.accno != null && !this.accno.equals(other.accno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projecthomeoracledb.Accountdetail[ accno=" + accno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
