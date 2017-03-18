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
@Table(name = "tbl_seller_addresses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerAddresses.findAll", query = "SELECT t FROM TblSellerAddresses t")
    , @NamedQuery(name = "TblSellerAddresses.findBySellerAddrId", query = "SELECT t FROM TblSellerAddresses t WHERE t.sellerAddrId = :sellerAddrId")
    , @NamedQuery(name = "TblSellerAddresses.findBySellerId", query = "SELECT t FROM TblSellerAddresses t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblSellerAddresses.findByAddrTypeId", query = "SELECT t FROM TblSellerAddresses t WHERE t.addrTypeId = :addrTypeId")
    , @NamedQuery(name = "TblSellerAddresses.findByAddress1", query = "SELECT t FROM TblSellerAddresses t WHERE t.address1 = :address1")
    , @NamedQuery(name = "TblSellerAddresses.findByAddress2", query = "SELECT t FROM TblSellerAddresses t WHERE t.address2 = :address2")
    , @NamedQuery(name = "TblSellerAddresses.findByVillage", query = "SELECT t FROM TblSellerAddresses t WHERE t.village = :village")
    , @NamedQuery(name = "TblSellerAddresses.findByDistrict", query = "SELECT t FROM TblSellerAddresses t WHERE t.district = :district")
    , @NamedQuery(name = "TblSellerAddresses.findByCity", query = "SELECT t FROM TblSellerAddresses t WHERE t.city = :city")
    , @NamedQuery(name = "TblSellerAddresses.findByState", query = "SELECT t FROM TblSellerAddresses t WHERE t.state = :state")
    , @NamedQuery(name = "TblSellerAddresses.findByZipcode", query = "SELECT t FROM TblSellerAddresses t WHERE t.zipcode = :zipcode")
    , @NamedQuery(name = "TblSellerAddresses.findByMobile", query = "SELECT t FROM TblSellerAddresses t WHERE t.mobile = :mobile")
    , @NamedQuery(name = "TblSellerAddresses.findByIsDefault", query = "SELECT t FROM TblSellerAddresses t WHERE t.isDefault = :isDefault")
    , @NamedQuery(name = "TblSellerAddresses.findByCreatedAt", query = "SELECT t FROM TblSellerAddresses t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TblSellerAddresses.findByUpdatedAt", query = "SELECT t FROM TblSellerAddresses t WHERE t.updatedAt = :updatedAt")
    , @NamedQuery(name = "TblSellerAddresses.findByLastUpdatedBy", query = "SELECT t FROM TblSellerAddresses t WHERE t.lastUpdatedBy = :lastUpdatedBy")
    , @NamedQuery(name = "TblSellerAddresses.findByUserType", query = "SELECT t FROM TblSellerAddresses t WHERE t.userType = :userType")
    , @NamedQuery(name = "TblSellerAddresses.findByStatus", query = "SELECT t FROM TblSellerAddresses t WHERE t.status = :status")
    , @NamedQuery(name = "TblSellerAddresses.findByContactPerson", query = "SELECT t FROM TblSellerAddresses t WHERE t.contactPerson = :contactPerson")})
public class TblSellerAddresses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "seller_addr_id")
    private Long sellerAddrId;
    @Column(name = "seller_id")
    private BigInteger sellerId;
    @Column(name = "addr_type_id")
    private Integer addrTypeId;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "village")
    private String village;
    @Column(name = "district")
    private String district;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "mobile")
    private BigInteger mobile;
    @Column(name = "is_default")
    private Boolean isDefault;
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
    @Column(name = "contact_person")
    private String contactPerson;

    public TblSellerAddresses() {
    }

    public TblSellerAddresses(Long sellerAddrId) {
        this.sellerAddrId = sellerAddrId;
    }

    public TblSellerAddresses(Long sellerAddrId, Date createdAt) {
        this.sellerAddrId = sellerAddrId;
        this.createdAt = createdAt;
    }

    public Long getSellerAddrId() {
        return sellerAddrId;
    }

    public void setSellerAddrId(Long sellerAddrId) {
        this.sellerAddrId = sellerAddrId;
    }

    public BigInteger getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigInteger sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getAddrTypeId() {
        return addrTypeId;
    }

    public void setAddrTypeId(Integer addrTypeId) {
        this.addrTypeId = addrTypeId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        this.mobile = mobile;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sellerAddrId != null ? sellerAddrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellerAddresses)) {
            return false;
        }
        TblSellerAddresses other = (TblSellerAddresses) object;
        if ((this.sellerAddrId == null && other.sellerAddrId != null) || (this.sellerAddrId != null && !this.sellerAddrId.equals(other.sellerAddrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerAddresses[ sellerAddrId=" + sellerAddrId + " ]";
    }
    
}
