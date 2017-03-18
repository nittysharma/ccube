/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spice.indosat.seller.ccube.persistance;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nitin.kumar1
 */
@Entity
@Table(name = "tbl_seller_gcm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerGcm.findAll", query = "SELECT t FROM TblSellerGcm t")
    , @NamedQuery(name = "TblSellerGcm.findById", query = "SELECT t FROM TblSellerGcm t WHERE t.id = :id")
    , @NamedQuery(name = "TblSellerGcm.findBySellerId", query = "SELECT t FROM TblSellerGcm t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblSellerGcm.findByGcmId", query = "SELECT t FROM TblSellerGcm t WHERE t.gcmId = :gcmId")
    , @NamedQuery(name = "TblSellerGcm.findByOs", query = "SELECT t FROM TblSellerGcm t WHERE t.os = :os")
    , @NamedQuery(name = "TblSellerGcm.findByCreatedAt", query = "SELECT t FROM TblSellerGcm t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TblSellerGcm.findByUpdatedAt", query = "SELECT t FROM TblSellerGcm t WHERE t.updatedAt = :updatedAt")})
public class TblSellerGcm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "seller_id")
    private long sellerId;
    @Basic(optional = false)
    @Column(name = "gcm_id")
    private String gcmId;
    @Basic(optional = false)
    @Column(name = "os")
    private String os;
    @Basic(optional = false)
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public TblSellerGcm() {
    }

    public TblSellerGcm(Long id) {
        this.id = id;
    }

    public TblSellerGcm(Long id, long sellerId, String gcmId, String os, Date createdAt, Date updatedAt) {
        this.id = id;
        this.sellerId = sellerId;
        this.gcmId = gcmId;
        this.os = os;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public String getGcmId() {
        return gcmId;
    }

    public void setGcmId(String gcmId) {
        this.gcmId = gcmId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (!(object instanceof TblSellerGcm)) {
            return false;
        }
        TblSellerGcm other = (TblSellerGcm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerGcm[ id=" + id + " ]";
    }
    
}
