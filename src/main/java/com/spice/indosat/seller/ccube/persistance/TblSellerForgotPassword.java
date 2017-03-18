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
@Table(name = "tbl_seller_forgot_password")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerForgotPassword.findAll", query = "SELECT t FROM TblSellerForgotPassword t")
    , @NamedQuery(name = "TblSellerForgotPassword.findByFId", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.fId = :fId")
    , @NamedQuery(name = "TblSellerForgotPassword.findBySellerId", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblSellerForgotPassword.findByOtp", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.otp = :otp")
    , @NamedQuery(name = "TblSellerForgotPassword.findByCreateAt", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.createAt = :createAt")
    , @NamedQuery(name = "TblSellerForgotPassword.findByExpOtpAt", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.expOtpAt = :expOtpAt")
    , @NamedQuery(name = "TblSellerForgotPassword.findByOtpType", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.otpType = :otpType")
    , @NamedQuery(name = "TblSellerForgotPassword.findByOtpUsed", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.otpUsed = :otpUsed")
    , @NamedQuery(name = "TblSellerForgotPassword.findByToken", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.token = :token")
    , @NamedQuery(name = "TblSellerForgotPassword.findByTokenExpAt", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.tokenExpAt = :tokenExpAt")
    , @NamedQuery(name = "TblSellerForgotPassword.findByTokenUsed", query = "SELECT t FROM TblSellerForgotPassword t WHERE t.tokenUsed = :tokenUsed")})
public class TblSellerForgotPassword implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "f_id")
    private Long fId;
    @Column(name = "seller_id")
    private BigInteger sellerId;
    @Column(name = "otp")
    private Integer otp;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "exp_otp_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expOtpAt;
    @Column(name = "otp_type")
    private Integer otpType;
    @Column(name = "otp_used")
    private Boolean otpUsed;
    @Column(name = "token")
    private String token;
    @Column(name = "token_exp_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tokenExpAt;
    @Column(name = "token_used")
    private Boolean tokenUsed;

    public TblSellerForgotPassword() {
    }

    public TblSellerForgotPassword(Long fId) {
        this.fId = fId;
    }

    public Long getFId() {
        return fId;
    }

    public void setFId(Long fId) {
        this.fId = fId;
    }

    public BigInteger getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigInteger sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getExpOtpAt() {
        return expOtpAt;
    }

    public void setExpOtpAt(Date expOtpAt) {
        this.expOtpAt = expOtpAt;
    }

    public Integer getOtpType() {
        return otpType;
    }

    public void setOtpType(Integer otpType) {
        this.otpType = otpType;
    }

    public Boolean getOtpUsed() {
        return otpUsed;
    }

    public void setOtpUsed(Boolean otpUsed) {
        this.otpUsed = otpUsed;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getTokenExpAt() {
        return tokenExpAt;
    }

    public void setTokenExpAt(Date tokenExpAt) {
        this.tokenExpAt = tokenExpAt;
    }

    public Boolean getTokenUsed() {
        return tokenUsed;
    }

    public void setTokenUsed(Boolean tokenUsed) {
        this.tokenUsed = tokenUsed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fId != null ? fId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellerForgotPassword)) {
            return false;
        }
        TblSellerForgotPassword other = (TblSellerForgotPassword) object;
        if ((this.fId == null && other.fId != null) || (this.fId != null && !this.fId.equals(other.fId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerForgotPassword[ fId=" + fId + " ]";
    }
    
}
