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
@Table(name = "tbl_seller_more_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerMoreDetails.findAll", query = "SELECT t FROM TblSellerMoreDetails t")
    , @NamedQuery(name = "TblSellerMoreDetails.findByMoreDetailsId", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.moreDetailsId = :moreDetailsId")
    , @NamedQuery(name = "TblSellerMoreDetails.findBySellerId", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblSellerMoreDetails.findByFieldName", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.fieldName = :fieldName")
    , @NamedQuery(name = "TblSellerMoreDetails.findByFieldValue", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.fieldValue = :fieldValue")
    , @NamedQuery(name = "TblSellerMoreDetails.findByImageUrl", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.imageUrl = :imageUrl")
    , @NamedQuery(name = "TblSellerMoreDetails.findByCreatedAt", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TblSellerMoreDetails.findByUpdatedAt", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.updatedAt = :updatedAt")
    , @NamedQuery(name = "TblSellerMoreDetails.findByLastUpdatedBy", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.lastUpdatedBy = :lastUpdatedBy")
    , @NamedQuery(name = "TblSellerMoreDetails.findByUserType", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.userType = :userType")
    , @NamedQuery(name = "TblSellerMoreDetails.findByStatus", query = "SELECT t FROM TblSellerMoreDetails t WHERE t.status = :status")})
public class TblSellerMoreDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "more_details_id")
    private Long moreDetailsId;
    @Column(name = "seller_id")
    private BigInteger sellerId;
    @Column(name = "field_name")
    private String fieldName;
    @Column(name = "field_value")
    private String fieldValue;
    @Column(name = "image_url")
    private String imageUrl;
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

    public TblSellerMoreDetails() {
    }

    public TblSellerMoreDetails(Long moreDetailsId) {
        this.moreDetailsId = moreDetailsId;
    }

    public TblSellerMoreDetails(Long moreDetailsId, Date createdAt) {
        this.moreDetailsId = moreDetailsId;
        this.createdAt = createdAt;
    }

    public Long getMoreDetailsId() {
        return moreDetailsId;
    }

    public void setMoreDetailsId(Long moreDetailsId) {
        this.moreDetailsId = moreDetailsId;
    }

    public BigInteger getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigInteger sellerId) {
        this.sellerId = sellerId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
        hash += (moreDetailsId != null ? moreDetailsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellerMoreDetails)) {
            return false;
        }
        TblSellerMoreDetails other = (TblSellerMoreDetails) object;
        if ((this.moreDetailsId == null && other.moreDetailsId != null) || (this.moreDetailsId != null && !this.moreDetailsId.equals(other.moreDetailsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerMoreDetails[ moreDetailsId=" + moreDetailsId + " ]";
    }
    
}
