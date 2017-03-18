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
@Table(name = "tbl_seller_pickup_tracking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerPickupTracking.findAll", query = "SELECT t FROM TblSellerPickupTracking t")
    , @NamedQuery(name = "TblSellerPickupTracking.findByReceivedAckId", query = "SELECT t FROM TblSellerPickupTracking t WHERE t.receivedAckId = :receivedAckId")
    , @NamedQuery(name = "TblSellerPickupTracking.findByPickupReqId", query = "SELECT t FROM TblSellerPickupTracking t WHERE t.pickupReqId = :pickupReqId")
    , @NamedQuery(name = "TblSellerPickupTracking.findByArrivedAt", query = "SELECT t FROM TblSellerPickupTracking t WHERE t.arrivedAt = :arrivedAt")
    , @NamedQuery(name = "TblSellerPickupTracking.findByArrivedFacType", query = "SELECT t FROM TblSellerPickupTracking t WHERE t.arrivedFacType = :arrivedFacType")
    , @NamedQuery(name = "TblSellerPickupTracking.findByReceivedBy", query = "SELECT t FROM TblSellerPickupTracking t WHERE t.receivedBy = :receivedBy")
    , @NamedQuery(name = "TblSellerPickupTracking.findByReceivedAt", query = "SELECT t FROM TblSellerPickupTracking t WHERE t.receivedAt = :receivedAt")})
public class TblSellerPickupTracking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "received_ack_id")
    private Long receivedAckId;
    @Column(name = "pickup_req_id")
    private BigInteger pickupReqId;
    @Column(name = "arrived_at")
    private Integer arrivedAt;
    @Column(name = "arrived_fac_type")
    private String arrivedFacType;
    @Column(name = "received_by")
    private BigInteger receivedBy;
    @Basic(optional = false)
    @Column(name = "received_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedAt;

    public TblSellerPickupTracking() {
    }

    public TblSellerPickupTracking(Long receivedAckId) {
        this.receivedAckId = receivedAckId;
    }

    public TblSellerPickupTracking(Long receivedAckId, Date receivedAt) {
        this.receivedAckId = receivedAckId;
        this.receivedAt = receivedAt;
    }

    public Long getReceivedAckId() {
        return receivedAckId;
    }

    public void setReceivedAckId(Long receivedAckId) {
        this.receivedAckId = receivedAckId;
    }

    public BigInteger getPickupReqId() {
        return pickupReqId;
    }

    public void setPickupReqId(BigInteger pickupReqId) {
        this.pickupReqId = pickupReqId;
    }

    public Integer getArrivedAt() {
        return arrivedAt;
    }

    public void setArrivedAt(Integer arrivedAt) {
        this.arrivedAt = arrivedAt;
    }

    public String getArrivedFacType() {
        return arrivedFacType;
    }

    public void setArrivedFacType(String arrivedFacType) {
        this.arrivedFacType = arrivedFacType;
    }

    public BigInteger getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(BigInteger receivedBy) {
        this.receivedBy = receivedBy;
    }

    public Date getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(Date receivedAt) {
        this.receivedAt = receivedAt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (receivedAckId != null ? receivedAckId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellerPickupTracking)) {
            return false;
        }
        TblSellerPickupTracking other = (TblSellerPickupTracking) object;
        if ((this.receivedAckId == null && other.receivedAckId != null) || (this.receivedAckId != null && !this.receivedAckId.equals(other.receivedAckId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerPickupTracking[ receivedAckId=" + receivedAckId + " ]";
    }
    
}
