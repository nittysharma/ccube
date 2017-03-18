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
@Table(name = "tbl_seller_payment_settlement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerPaymentSettlement.findAll", query = "SELECT t FROM TblSellerPaymentSettlement t")
    , @NamedQuery(name = "TblSellerPaymentSettlement.findById", query = "SELECT t FROM TblSellerPaymentSettlement t WHERE t.id = :id")
    , @NamedQuery(name = "TblSellerPaymentSettlement.findBySellerId", query = "SELECT t FROM TblSellerPaymentSettlement t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblSellerPaymentSettlement.findByOrderPackageTrackingId", query = "SELECT t FROM TblSellerPaymentSettlement t WHERE t.orderPackageTrackingId = :orderPackageTrackingId")
    , @NamedQuery(name = "TblSellerPaymentSettlement.findByPaymentSettledBy", query = "SELECT t FROM TblSellerPaymentSettlement t WHERE t.paymentSettledBy = :paymentSettledBy")
    , @NamedQuery(name = "TblSellerPaymentSettlement.findByPaymentSettledAt", query = "SELECT t FROM TblSellerPaymentSettlement t WHERE t.paymentSettledAt = :paymentSettledAt")
    , @NamedQuery(name = "TblSellerPaymentSettlement.findByStatus", query = "SELECT t FROM TblSellerPaymentSettlement t WHERE t.status = :status")
    , @NamedQuery(name = "TblSellerPaymentSettlement.findByPaymentAmount", query = "SELECT t FROM TblSellerPaymentSettlement t WHERE t.paymentAmount = :paymentAmount")
    , @NamedQuery(name = "TblSellerPaymentSettlement.findByPaymentRefId", query = "SELECT t FROM TblSellerPaymentSettlement t WHERE t.paymentRefId = :paymentRefId")
    , @NamedQuery(name = "TblSellerPaymentSettlement.findByComment", query = "SELECT t FROM TblSellerPaymentSettlement t WHERE t.comment = :comment")})
public class TblSellerPaymentSettlement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "seller_id")
    private BigInteger sellerId;
    @Column(name = "order_package_tracking_id")
    private BigInteger orderPackageTrackingId;
    @Column(name = "payment_settled_by")
    private BigInteger paymentSettledBy;
    @Column(name = "payment_settled_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentSettledAt;
    @Column(name = "status")
    private Integer status;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "payment_amount")
    private Double paymentAmount;
    @Column(name = "payment_ref_id")
    private String paymentRefId;
    @Column(name = "comment")
    private String comment;

    public TblSellerPaymentSettlement() {
    }

    public TblSellerPaymentSettlement(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigInteger sellerId) {
        this.sellerId = sellerId;
    }

    public BigInteger getOrderPackageTrackingId() {
        return orderPackageTrackingId;
    }

    public void setOrderPackageTrackingId(BigInteger orderPackageTrackingId) {
        this.orderPackageTrackingId = orderPackageTrackingId;
    }

    public BigInteger getPaymentSettledBy() {
        return paymentSettledBy;
    }

    public void setPaymentSettledBy(BigInteger paymentSettledBy) {
        this.paymentSettledBy = paymentSettledBy;
    }

    public Date getPaymentSettledAt() {
        return paymentSettledAt;
    }

    public void setPaymentSettledAt(Date paymentSettledAt) {
        this.paymentSettledAt = paymentSettledAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentRefId() {
        return paymentRefId;
    }

    public void setPaymentRefId(String paymentRefId) {
        this.paymentRefId = paymentRefId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        if (!(object instanceof TblSellerPaymentSettlement)) {
            return false;
        }
        TblSellerPaymentSettlement other = (TblSellerPaymentSettlement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerPaymentSettlement[ id=" + id + " ]";
    }
    
}
