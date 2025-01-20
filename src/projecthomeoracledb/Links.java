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
@Table(name = "LINKS", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Links.findAll", query = "SELECT l FROM Links l"),
    @NamedQuery(name = "Links.findBySrno", query = "SELECT l FROM Links l WHERE l.srno = :srno"),
    @NamedQuery(name = "Links.findByInstitution", query = "SELECT l FROM Links l WHERE l.institution = :institution"),
    @NamedQuery(name = "Links.findByWeblink", query = "SELECT l FROM Links l WHERE l.weblink = :weblink")})
public class Links implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "SRNO")
    private BigDecimal srno;
    @Column(name = "INSTITUTION")
    private String institution;
    @Column(name = "WEBLINK")
    private String weblink;

    public Links() {
    }

    public Links(BigDecimal srno) {
        this.srno = srno;
    }

    public BigDecimal getSrno() {
        return srno;
    }

    public void setSrno(BigDecimal srno) {
        BigDecimal oldSrno = this.srno;
        this.srno = srno;
        changeSupport.firePropertyChange("srno", oldSrno, srno);
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        String oldInstitution = this.institution;
        this.institution = institution;
        changeSupport.firePropertyChange("institution", oldInstitution, institution);
    }

    public String getWeblink() {
        return weblink;
    }

    public void setWeblink(String weblink) {
        String oldWeblink = this.weblink;
        this.weblink = weblink;
        changeSupport.firePropertyChange("weblink", oldWeblink, weblink);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srno != null ? srno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Links)) {
            return false;
        }
        Links other = (Links) object;
        if ((this.srno == null && other.srno != null) || (this.srno != null && !this.srno.equals(other.srno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projecthomeoracledb.Links[ srno=" + srno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
