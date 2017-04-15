/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coaas.cdql.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ali
 */
@Entity
@Table(name = "QUERY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Query.findAll", query = "SELECT q FROM Query q"),
    @NamedQuery(name = "Query.findByQueryid", query = "SELECT q FROM Query q WHERE q.queryid = :queryid"),
    @NamedQuery(name = "Query.findByQuery", query = "SELECT q FROM Query q WHERE q.query = :query"),
    @NamedQuery(name = "Query.findByQuerystatus", query = "SELECT q FROM Query q WHERE q.querystatus = :querystatus")})
public class Query implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "QUERYID")
    private Integer queryid;
    @Lob @Basic(fetch=FetchType.EAGER)
    @Column(name = "QUERY")
    private String query;
    @Lob @Basic(fetch=FetchType.EAGER)
    @Column(name = "RESULT")
    private String result;
    @Size(max = 255)
    @Column(name = "QUERYSTATUS")
    private String querystatus;
    @OneToMany(mappedBy = "queryId")
    private List<Queryrespons> queryresponsList;

    public Query() {
    }

    public Query(Integer queryid) {
        this.queryid = queryid;
    }

    public Integer getQueryid() {
        return queryid;
    }

    public void setQueryid(Integer queryid) {
        this.queryid = queryid;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getQuerystatus() {
        return querystatus;
    }

    public void setQuerystatus(String querystatus) {
        this.querystatus = querystatus;
    }

    @XmlTransient
    public List<Queryrespons> getQueryresponsList() {
        return queryresponsList;
    }

    public void setQueryresponsList(List<Queryrespons> queryresponsList) {
        this.queryresponsList = queryresponsList;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (queryid != null ? queryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Query)) {
            return false;
        }
        Query other = (Query) object;
        if ((this.queryid == null && other.queryid != null) || (this.queryid != null && !this.queryid.equals(other.queryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cdql.db.entities.Query[ queryid=" + queryid + " ]";
    }
    
}
