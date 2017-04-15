/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coaas.cdql.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ali
 */
@Entity
@Table(name = "QUERYRESPONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Queryrespons.findAll", query = "SELECT q FROM Queryrespons q"),
    @NamedQuery(name = "Queryrespons.findById", query = "SELECT q FROM Queryrespons q WHERE q.id = :id"),
    @NamedQuery(name = "Queryrespons.findByK", query = "SELECT q FROM Queryrespons q WHERE q.k = :k"),
    @NamedQuery(name = "Queryrespons.findByV", query = "SELECT q FROM Queryrespons q WHERE q.v = :v")})
public class Queryrespons implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "K")
    private String k;
    @Size(max = 255)
    @Column(name = "V")
    private String v;
    @JoinColumn(name = "QUERY_ID", referencedColumnName = "QUERYID")
    @ManyToOne
    private Query queryId;

    public Queryrespons() {
    }

    public Queryrespons(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public Query getQueryId() {
        return queryId;
    }

    public void setQueryId(Query queryId) {
        this.queryId = queryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Queryrespons)) {
            return false;
        }
        Queryrespons other = (Queryrespons) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cdql.db.entities.Queryrespons[ id=" + id + " ]";
    }
    
}
