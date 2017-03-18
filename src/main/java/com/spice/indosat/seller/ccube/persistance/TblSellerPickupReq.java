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
@Table(name = "tbl_seller_pickup_req")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerPickupReq.findAll", query = "SELECT t FROM TblSellerPickupReq t")
    , @NamedQuery(name = "TblSellerPickupReq.findByPickupReqId", query = "SELECT t FROM TblSellerPickupReq t WHERE t.pickupReqId = :pickupReqId")
    , @NamedQuery(name = "TblSellerPickupReq.findBySellerId", query = "SELECT t FROM TblSellerPickupReq t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblSellerPickupReq.findByPickupType", query = "SELECT t FROM TblSellerPickupReq t WHERE t.pickupType = :pickupType")
    , @NamedQuery(name = "TblSellerPickupReq.findByScheduledAt", query = "SELECT t FROM TblSellerPickupReq t WHERE t.scheduledAt = :scheduledAt")
    , @NamedQuery(name = "TblSellerPickupReq.findBySourceAddr", query = "SELECT t FROM TblSellerPickupReq t WHERE t.sourceAddr = :sourceAddr")
    , @NamedQuery(name = "TblSellerPickupReq.findBySourceAddrType", query = "SELECT t FROM TblSellerPickupReq t WHERE t.sourceAddrType = :sourceAddrType")
    , @NamedQuery(name = "TblSellerPickupReq.findByDestFId", query = "SELECT t FROM TblSellerPickupReq t WHERE t.destFId = :destFId")
    , @NamedQuery(name = "TblSellerPickupReq.findByDestFIdType", query = "SELECT t FROM TblSellerPickupReq t WHERE t.destFIdType = :destFIdType")
    , @NamedQuery(name = "TblSellerPickupReq.findByTotalItem", query = "SELECT t FROM TblSellerPickupReq t WHERE t.totalItem = :totalItem")
    , @NamedQuery(name = "TblSellerPickupReq.findByCreatedAt", query = "SELECT t FROM TblSellerPickupReq t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TblSellerPickupReq.findByUpdatedAt", query = "SELECT t FROM TblSellerPickupReq t WHERE t.updatedAt = :updatedAt")
    , @NamedQuery(name = "TblSellerPickupReq.findByLastUpdatedBy", query = "SELECT t FROM TblSellerPickupReq t WHERE t.lastUpdatedBy = :lastUpdatedBy")
    , @NamedQuery(name = "TblSellerPickupReq.findByUserType", query = "SELECT t FROM TblSellerPickupReq t WHERE t.userType = :userType")
    , @NamedQuery(name = "TblSellerPickupReq.findByStatus", query = "SELECT t FROM TblSellerPickupReq t WHERE t.status = :status")
    , @NamedQuery(name = "TblSellerPickupReq.findByReason", query = "SELECT t FROM TblSellerPickupReq t WHERE t.reason = :reason")})
public class TblSellerPickupReq implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pickup_req_id")
    private Long pickupReqId;
    @Column(name = "seller_id")
    private BigInteger sellerId;
    @Column(name = "pickup_type")
    private Integer pickupType;
    @Column(name = "scheduled_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduledAt;
    @Column(name = "source_addr")
    private BigInteger sourceAddr;
    @Column(name = "source_addr_type")
    private Integer sourceAddrType;
    @Column(name = "dest_f_id")
    private Integer destFId;
    @Column(name = "dest_f_id_type")
    private String destFIdType;
    @Column(name = "total_item")
    private BigInteger totalItem;
    @Basic(optional = false)
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "last_updated_by")
    private BigInteger lastUpdatedBy;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "status")
    private Integer status;
    @Column(name = "reason")
    private String reason;

    public TblSellerPickupReq() {
    }

    public TblSellerPickupReq(Long pickupReqId) {
        this.pickupReqId = pickupReqId;
    }

    public TblSellerPickupReq(Long pickupReqId, Date createdAt) {
        this.pickupReqId = pickupReqId;
        this.createdAt = createdAt;
    }

    public Long getPickupReqId() {
        return pickupReqId;
    }

    public void setPickupReqId(Long pickupReqId) {
        this.pickupReqId = pickupReqId;
    }

    public BigInteger getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigInteger sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getPickupType() {
        return pickupType;
    }

    public void setPickupType(Integer pickupType) {
        this.pickupType = pickupType;
    }

    public Date getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(Date scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public BigInteger getSourceAddr() {
        return sourceAddr;
    }

    public void setSourceAddr(BigInteger sourceAddr) {
        this.sourceAddr = sourceAddr;
    }

    public Integer getSourceAddrType() {
        return sourceAddrType;
    }

    public void setSourceAddrType(Integer sourceAddrType) {
        this.sourceAddrType = sourceAddrType;
    }

    public Integer getDestFId() {
        return destFId;
    }

    public void setDestFId(Integer destFId) {
        this.destFId = destFId;
    }

    public String getDestFIdType() {
        return destFIdType;
    }

    public void setDestFIdType(String destFIdType) {
        this.destFIdType = destFIdType;
    }

    public BigInteger getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(BigInteger totalItem) {
        this.totalItem = totalItem;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pickupReqId != null ? pickupReqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellerPickupReq)) {
            return false;
        }
        TblSellerPickupReq other = (TblSellerPickupReq) object;
        if ((this.pickupReqId == null && other.pickupReqId != null) || (this.pickupReqId != null && !this.pickupReqId.equals(other.pickupReqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerPickupReq[ pickupReqId=" + pickupReqId + " ]";
    }
    
}
