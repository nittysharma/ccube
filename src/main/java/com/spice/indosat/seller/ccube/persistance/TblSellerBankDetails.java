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
@Table(name = "tbl_seller_bank_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerBankDetails.findAll", query = "SELECT t FROM TblSellerBankDetails t")
    , @NamedQuery(name = "TblSellerBankDetails.findByBankDetailsId", query = "SELECT t FROM TblSellerBankDetails t WHERE t.bankDetailsId = :bankDetailsId")
    , @NamedQuery(name = "TblSellerBankDetails.findBySellerId", query = "SELECT t FROM TblSellerBankDetails t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblSellerBankDetails.findByAccHolderName", query = "SELECT t FROM TblSellerBankDetails t WHERE t.accHolderName = :accHolderName")
    , @NamedQuery(name = "TblSellerBankDetails.findByAccNo", query = "SELECT t FROM TblSellerBankDetails t WHERE t.accNo = :accNo")
    , @NamedQuery(name = "TblSellerBankDetails.findByBankName", query = "SELECT t FROM TblSellerBankDetails t WHERE t.bankName = :bankName")
    , @NamedQuery(name = "TblSellerBankDetails.findByCancelledChequeImgUrl", query = "SELECT t FROM TblSellerBankDetails t WHERE t.cancelledChequeImgUrl = :cancelledChequeImgUrl")
    , @NamedQuery(name = "TblSellerBankDetails.findByCreatedAt", query = "SELECT t FROM TblSellerBankDetails t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TblSellerBankDetails.findByUpdatedAt", query = "SELECT t FROM TblSellerBankDetails t WHERE t.updatedAt = :updatedAt")
    , @NamedQuery(name = "TblSellerBankDetails.findByLastUpdatedBy", query = "SELECT t FROM TblSellerBankDetails t WHERE t.lastUpdatedBy = :lastUpdatedBy")
    , @NamedQuery(name = "TblSellerBankDetails.findByUserType", query = "SELECT t FROM TblSellerBankDetails t WHERE t.userType = :userType")
    , @NamedQuery(name = "TblSellerBankDetails.findByStatus", query = "SELECT t FROM TblSellerBankDetails t WHERE t.status = :status")})
public class TblSellerBankDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bank_details_id")
    private Long bankDetailsId;
    @Column(name = "seller_id")
    private BigInteger sellerId;
    @Column(name = "acc_holder_name")
    private String accHolderName;
    @Column(name = "acc_no")
    private String accNo;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "cancelled_cheque_img_url")
    private String cancelledChequeImgUrl;
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

    public TblSellerBankDetails() {
    }

    public TblSellerBankDetails(Long bankDetailsId) {
        this.bankDetailsId = bankDetailsId;
    }

    public TblSellerBankDetails(Long bankDetailsId, Date createdAt) {
        this.bankDetailsId = bankDetailsId;
        this.createdAt = createdAt;
    }

    public Long getBankDetailsId() {
        return bankDetailsId;
    }

    public void setBankDetailsId(Long bankDetailsId) {
        this.bankDetailsId = bankDetailsId;
    }

    public BigInteger getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigInteger sellerId) {
        this.sellerId = sellerId;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCancelledChequeImgUrl() {
        return cancelledChequeImgUrl;
    }

    public void setCancelledChequeImgUrl(String cancelledChequeImgUrl) {
        this.cancelledChequeImgUrl = cancelledChequeImgUrl;
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
        hash += (bankDetailsId != null ? bankDetailsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellerBankDetails)) {
            return false;
        }
        TblSellerBankDetails other = (TblSellerBankDetails) object;
        if ((this.bankDetailsId == null && other.bankDetailsId != null) || (this.bankDetailsId != null && !this.bankDetailsId.equals(other.bankDetailsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerBankDetails[ bankDetailsId=" + bankDetailsId + " ]";
    }
    
}
