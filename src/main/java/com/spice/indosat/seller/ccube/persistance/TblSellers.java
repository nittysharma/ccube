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
@Table(name = "tbl_sellers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellers.findAll", query = "SELECT t FROM TblSellers t")
    , @NamedQuery(name = "TblSellers.findBySellerId", query = "SELECT t FROM TblSellers t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblSellers.findByEmail", query = "SELECT t FROM TblSellers t WHERE t.email = :email")
    , @NamedQuery(name = "TblSellers.findByPassword", query = "SELECT t FROM TblSellers t WHERE t.password = :password")
    , @NamedQuery(name = "TblSellers.findByFirstName", query = "SELECT t FROM TblSellers t WHERE t.firstName = :firstName")
    , @NamedQuery(name = "TblSellers.findByLastName", query = "SELECT t FROM TblSellers t WHERE t.lastName = :lastName")
    , @NamedQuery(name = "TblSellers.findByGender", query = "SELECT t FROM TblSellers t WHERE t.gender = :gender")
    , @NamedQuery(name = "TblSellers.findByBirthdate", query = "SELECT t FROM TblSellers t WHERE t.birthdate = :birthdate")
    , @NamedQuery(name = "TblSellers.findByMobile", query = "SELECT t FROM TblSellers t WHERE t.mobile = :mobile")
    , @NamedQuery(name = "TblSellers.findByTelephone", query = "SELECT t FROM TblSellers t WHERE t.telephone = :telephone")
    , @NamedQuery(name = "TblSellers.findByCompanyName", query = "SELECT t FROM TblSellers t WHERE t.companyName = :companyName")
    , @NamedQuery(name = "TblSellers.findByAddress1", query = "SELECT t FROM TblSellers t WHERE t.address1 = :address1")
    , @NamedQuery(name = "TblSellers.findByAddress2", query = "SELECT t FROM TblSellers t WHERE t.address2 = :address2")
    , @NamedQuery(name = "TblSellers.findByVillage", query = "SELECT t FROM TblSellers t WHERE t.village = :village")
    , @NamedQuery(name = "TblSellers.findByDistrict", query = "SELECT t FROM TblSellers t WHERE t.district = :district")
    , @NamedQuery(name = "TblSellers.findByCity", query = "SELECT t FROM TblSellers t WHERE t.city = :city")
    , @NamedQuery(name = "TblSellers.findByState", query = "SELECT t FROM TblSellers t WHERE t.state = :state")
    , @NamedQuery(name = "TblSellers.findByZipcode", query = "SELECT t FROM TblSellers t WHERE t.zipcode = :zipcode")
    , @NamedQuery(name = "TblSellers.findByCreationDate", query = "SELECT t FROM TblSellers t WHERE t.creationDate = :creationDate")
    , @NamedQuery(name = "TblSellers.findByActivationDate", query = "SELECT t FROM TblSellers t WHERE t.activationDate = :activationDate")
    , @NamedQuery(name = "TblSellers.findByProfileLastUpdated", query = "SELECT t FROM TblSellers t WHERE t.profileLastUpdated = :profileLastUpdated")
    , @NamedQuery(name = "TblSellers.findByEmailVerified", query = "SELECT t FROM TblSellers t WHERE t.emailVerified = :emailVerified")
    , @NamedQuery(name = "TblSellers.findByMobileVerified", query = "SELECT t FROM TblSellers t WHERE t.mobileVerified = :mobileVerified")
    , @NamedQuery(name = "TblSellers.findByAccStatus", query = "SELECT t FROM TblSellers t WHERE t.accStatus = :accStatus")
    , @NamedQuery(name = "TblSellers.findByAuthority", query = "SELECT t FROM TblSellers t WHERE t.authority = :authority")
    , @NamedQuery(name = "TblSellers.findByIdType", query = "SELECT t FROM TblSellers t WHERE t.idType = :idType")
    , @NamedQuery(name = "TblSellers.findByIdValue", query = "SELECT t FROM TblSellers t WHERE t.idValue = :idValue")
    , @NamedQuery(name = "TblSellers.findByTaxType", query = "SELECT t FROM TblSellers t WHERE t.taxType = :taxType")
    , @NamedQuery(name = "TblSellers.findByTaxValue", query = "SELECT t FROM TblSellers t WHERE t.taxValue = :taxValue")
    , @NamedQuery(name = "TblSellers.findByOwnerName", query = "SELECT t FROM TblSellers t WHERE t.ownerName = :ownerName")})
public class TblSellers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "seller_id")
    private Long sellerId;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "birthdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthdate;
    @Column(name = "mobile")
    private BigInteger mobile;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "company_name")
    private String companyName;
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
    @Basic(optional = false)
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Column(name = "activation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activationDate;
    @Column(name = "profile_last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date profileLastUpdated;
    @Basic(optional = false)
    @Column(name = "email_verified")
    private boolean emailVerified;
    @Basic(optional = false)
    @Column(name = "mobile_verified")
    private boolean mobileVerified;
    @Lob
    @Column(name = "comment")
    private String comment;
    @Column(name = "acc_status")
    private Integer accStatus;
    @Column(name = "authority")
    private String authority;
    @Column(name = "id_type")
    private String idType;
    @Column(name = "id_value")
    private String idValue;
    @Column(name = "tax_type")
    private String taxType;
    @Column(name = "tax_value")
    private String taxValue;
    @Column(name = "owner_name")
    private String ownerName;

    public TblSellers() {
    }

    public TblSellers(Long sellerId) {
        this.sellerId = sellerId;
    }

    public TblSellers(Long sellerId, Date creationDate, boolean emailVerified, boolean mobileVerified) {
        this.sellerId = sellerId;
        this.creationDate = creationDate;
        this.emailVerified = emailVerified;
        this.mobileVerified = mobileVerified;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    public Date getProfileLastUpdated() {
        return profileLastUpdated;
    }

    public void setProfileLastUpdated(Date profileLastUpdated) {
        this.profileLastUpdated = profileLastUpdated;
    }

    public boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public boolean getMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(boolean mobileVerified) {
        this.mobileVerified = mobileVerified;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(Integer accStatus) {
        this.accStatus = accStatus;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(String taxValue) {
        this.taxValue = taxValue;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sellerId != null ? sellerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellers)) {
            return false;
        }
        TblSellers other = (TblSellers) object;
        if ((this.sellerId == null && other.sellerId != null) || (this.sellerId != null && !this.sellerId.equals(other.sellerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellers[ sellerId=" + sellerId + " ]";
    }
    
}
