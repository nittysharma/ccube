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
@Table(name = "tbl_seller_otp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerOtp.findAll", query = "SELECT t FROM TblSellerOtp t")
    , @NamedQuery(name = "TblSellerOtp.findByOtpId", query = "SELECT t FROM TblSellerOtp t WHERE t.otpId = :otpId")
    , @NamedQuery(name = "TblSellerOtp.findBySellerId", query = "SELECT t FROM TblSellerOtp t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblSellerOtp.findByMobile", query = "SELECT t FROM TblSellerOtp t WHERE t.mobile = :mobile")
    , @NamedQuery(name = "TblSellerOtp.findByMobileOtp", query = "SELECT t FROM TblSellerOtp t WHERE t.mobileOtp = :mobileOtp")
    , @NamedQuery(name = "TblSellerOtp.findByEmailId", query = "SELECT t FROM TblSellerOtp t WHERE t.emailId = :emailId")
    , @NamedQuery(name = "TblSellerOtp.findByEmailOtp", query = "SELECT t FROM TblSellerOtp t WHERE t.emailOtp = :emailOtp")
    , @NamedQuery(name = "TblSellerOtp.findByCreatedAt", query = "SELECT t FROM TblSellerOtp t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TblSellerOtp.findByMOtpExpireTime", query = "SELECT t FROM TblSellerOtp t WHERE t.mOtpExpireTime = :mOtpExpireTime")
    , @NamedQuery(name = "TblSellerOtp.findByEOtpExpireTime", query = "SELECT t FROM TblSellerOtp t WHERE t.eOtpExpireTime = :eOtpExpireTime")})
public class TblSellerOtp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "otp_id")
    private Long otpId;
    @Column(name = "seller_id")
    private BigInteger sellerId;
    @Column(name = "mobile")
    private BigInteger mobile;
    @Column(name = "mobile_otp")
    private Integer mobileOtp;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "email_otp")
    private Integer emailOtp;
    @Basic(optional = false)
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "m_otp_expire_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mOtpExpireTime;
    @Column(name = "e_otp_expire_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eOtpExpireTime;

    public TblSellerOtp() {
    }

    public TblSellerOtp(Long otpId) {
        this.otpId = otpId;
    }

    public TblSellerOtp(Long otpId, Date createdAt) {
        this.otpId = otpId;
        this.createdAt = createdAt;
    }

    public Long getOtpId() {
        return otpId;
    }

    public void setOtpId(Long otpId) {
        this.otpId = otpId;
    }

    public BigInteger getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigInteger sellerId) {
        this.sellerId = sellerId;
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        this.mobile = mobile;
    }

    public Integer getMobileOtp() {
        return mobileOtp;
    }

    public void setMobileOtp(Integer mobileOtp) {
        this.mobileOtp = mobileOtp;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getEmailOtp() {
        return emailOtp;
    }

    public void setEmailOtp(Integer emailOtp) {
        this.emailOtp = emailOtp;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getMOtpExpireTime() {
        return mOtpExpireTime;
    }

    public void setMOtpExpireTime(Date mOtpExpireTime) {
        this.mOtpExpireTime = mOtpExpireTime;
    }

    public Date getEOtpExpireTime() {
        return eOtpExpireTime;
    }

    public void setEOtpExpireTime(Date eOtpExpireTime) {
        this.eOtpExpireTime = eOtpExpireTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (otpId != null ? otpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellerOtp)) {
            return false;
        }
        TblSellerOtp other = (TblSellerOtp) object;
        if ((this.otpId == null && other.otpId != null) || (this.otpId != null && !this.otpId.equals(other.otpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerOtp[ otpId=" + otpId + " ]";
    }
    
}
