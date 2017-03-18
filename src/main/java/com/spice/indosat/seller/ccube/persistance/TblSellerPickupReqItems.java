/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spice.indosat.seller.ccube.persistance;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "tbl_seller_pickup_req_items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerPickupReqItems.findAll", query = "SELECT t FROM TblSellerPickupReqItems t")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByRowId", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.rowId = :rowId")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByPickupReqId", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.pickupReqId = :pickupReqId")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByPId", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.pId = :pId")
    , @NamedQuery(name = "TblSellerPickupReqItems.findBySku", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.sku = :sku")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByPreqId", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.preqId = :preqId")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByTotalQty", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.totalQty = :totalQty")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByApprovedQty", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.approvedQty = :approvedQty")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByRejectedQty", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.rejectedQty = :rejectedQty")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByCreatedAt", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByUpdatedAt", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.updatedAt = :updatedAt")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByLastUpdatedBy", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.lastUpdatedBy = :lastUpdatedBy")
    , @NamedQuery(name = "TblSellerPickupReqItems.findByUserType", query = "SELECT t FROM TblSellerPickupReqItems t WHERE t.userType = :userType")})
public class TblSellerPickupReqItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "row_id")
    private Integer rowId;
    @Column(name = "pickup_req_id")
    private BigInteger pickupReqId;
    @Column(name = "p_id")
    private BigInteger pId;
    @Column(name = "sku")
    private String sku;
    @Column(name = "preq_id")
    private BigInteger preqId;
    @Column(name = "total_qty")
    private BigInteger totalQty;
    @Column(name = "approved_qty")
    private BigInteger approvedQty;
    @Column(name = "rejected_qty")
    private BigInteger rejectedQty;
    @Basic(optional = false)
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "last_updated_by")
    private BigInteger lastUpdatedBy;
    @Column(name = "user_type")
    private String userType;

    public TblSellerPickupReqItems() {
    }

    public TblSellerPickupReqItems(Integer rowId) {
        this.rowId = rowId;
    }

    public TblSellerPickupReqItems(Integer rowId, Date createdAt, Date updatedAt) {
        this.rowId = rowId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public BigInteger getPickupReqId() {
        return pickupReqId;
    }

    public void setPickupReqId(BigInteger pickupReqId) {
        this.pickupReqId = pickupReqId;
    }

    public BigInteger getPId() {
        return pId;
    }

    public void setPId(BigInteger pId) {
        this.pId = pId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigInteger getPreqId() {
        return preqId;
    }

    public void setPreqId(BigInteger preqId) {
        this.preqId = preqId;
    }

    public BigInteger getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(BigInteger totalQty) {
        this.totalQty = totalQty;
    }

    public BigInteger getApprovedQty() {
        return approvedQty;
    }

    public void setApprovedQty(BigInteger approvedQty) {
        this.approvedQty = approvedQty;
    }

    public BigInteger getRejectedQty() {
        return rejectedQty;
    }

    public void setRejectedQty(BigInteger rejectedQty) {
        this.rejectedQty = rejectedQty;
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

    public BigInteger getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rowId != null ? rowId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellerPickupReqItems)) {
            return false;
        }
        TblSellerPickupReqItems other = (TblSellerPickupReqItems) object;
        if ((this.rowId == null && other.rowId != null) || (this.rowId != null && !this.rowId.equals(other.rowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerPickupReqItems[ rowId=" + rowId + " ]";
    }
    
}
