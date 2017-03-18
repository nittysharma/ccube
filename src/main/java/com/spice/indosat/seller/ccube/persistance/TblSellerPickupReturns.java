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
import javax.persistence.Lob;
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
@Table(name = "tbl_seller_pickup_returns")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerPickupReturns.findAll", query = "SELECT t FROM TblSellerPickupReturns t")
    , @NamedQuery(name = "TblSellerPickupReturns.findByRowId", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.rowId = :rowId")
    , @NamedQuery(name = "TblSellerPickupReturns.findByGrnNo", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.grnNo = :grnNo")
    , @NamedQuery(name = "TblSellerPickupReturns.findByPickupReqId", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.pickupReqId = :pickupReqId")
    , @NamedQuery(name = "TblSellerPickupReturns.findByPId", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.pId = :pId")
    , @NamedQuery(name = "TblSellerPickupReturns.findBySku", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.sku = :sku")
    , @NamedQuery(name = "TblSellerPickupReturns.findByPreqId", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.preqId = :preqId")
    , @NamedQuery(name = "TblSellerPickupReturns.findByQuantity", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.quantity = :quantity")
    , @NamedQuery(name = "TblSellerPickupReturns.findByCreatedAt", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TblSellerPickupReturns.findByUpdatedAt", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.updatedAt = :updatedAt")
    , @NamedQuery(name = "TblSellerPickupReturns.findByLastUpdatedBy", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.lastUpdatedBy = :lastUpdatedBy")
    , @NamedQuery(name = "TblSellerPickupReturns.findByUserType", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.userType = :userType")
    , @NamedQuery(name = "TblSellerPickupReturns.findByStatus", query = "SELECT t FROM TblSellerPickupReturns t WHERE t.status = :status")})
public class TblSellerPickupReturns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "row_id")
    private Long rowId;
    @Column(name = "grn_no")
    private BigInteger grnNo;
    @Column(name = "pickup_req_id")
    private BigInteger pickupReqId;
    @Column(name = "p_id")
    private BigInteger pId;
    @Column(name = "sku")
    private String sku;
    @Column(name = "preq_id")
    private BigInteger preqId;
    @Column(name = "quantity")
    private Integer quantity;
    @Lob
    @Column(name = "reason")
    private String reason;
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
    @Column(name = "status")
    private Integer status;

    public TblSellerPickupReturns() {
    }

    public TblSellerPickupReturns(Long rowId) {
        this.rowId = rowId;
    }

    public TblSellerPickupReturns(Long rowId, Date createdAt, Date updatedAt) {
        this.rowId = rowId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public BigInteger getGrnNo() {
        return grnNo;
    }

    public void setGrnNo(BigInteger grnNo) {
        this.grnNo = grnNo;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        if (!(object instanceof TblSellerPickupReturns)) {
            return false;
        }
        TblSellerPickupReturns other = (TblSellerPickupReturns) object;
        if ((this.rowId == null && other.rowId != null) || (this.rowId != null && !this.rowId.equals(other.rowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerPickupReturns[ rowId=" + rowId + " ]";
    }
    
}
