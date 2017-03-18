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
@Table(name = "tbl_prod_request")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblProdRequest.findAll", query = "SELECT t FROM TblProdRequest t")
    , @NamedQuery(name = "TblProdRequest.findByPreqId", query = "SELECT t FROM TblProdRequest t WHERE t.preqId = :preqId")
    , @NamedQuery(name = "TblProdRequest.findBySellerId", query = "SELECT t FROM TblProdRequest t WHERE t.sellerId = :sellerId")
    , @NamedQuery(name = "TblProdRequest.findBySku", query = "SELECT t FROM TblProdRequest t WHERE t.sku = :sku")
    , @NamedQuery(name = "TblProdRequest.findByBrandName", query = "SELECT t FROM TblProdRequest t WHERE t.brandName = :brandName")
    , @NamedQuery(name = "TblProdRequest.findByProdTitle", query = "SELECT t FROM TblProdRequest t WHERE t.prodTitle = :prodTitle")
    , @NamedQuery(name = "TblProdRequest.findByMainCatId", query = "SELECT t FROM TblProdRequest t WHERE t.mainCatId = :mainCatId")
    , @NamedQuery(name = "TblProdRequest.findByCatId", query = "SELECT t FROM TblProdRequest t WHERE t.catId = :catId")
    , @NamedQuery(name = "TblProdRequest.findByMrp", query = "SELECT t FROM TblProdRequest t WHERE t.mrp = :mrp")
    , @NamedQuery(name = "TblProdRequest.findBySellingPrice", query = "SELECT t FROM TblProdRequest t WHERE t.sellingPrice = :sellingPrice")
    , @NamedQuery(name = "TblProdRequest.findByWeight", query = "SELECT t FROM TblProdRequest t WHERE t.weight = :weight")
    , @NamedQuery(name = "TblProdRequest.findByPkgLength", query = "SELECT t FROM TblProdRequest t WHERE t.pkgLength = :pkgLength")
    , @NamedQuery(name = "TblProdRequest.findByPkgBreadth", query = "SELECT t FROM TblProdRequest t WHERE t.pkgBreadth = :pkgBreadth")
    , @NamedQuery(name = "TblProdRequest.findByPkgHeight", query = "SELECT t FROM TblProdRequest t WHERE t.pkgHeight = :pkgHeight")
    , @NamedQuery(name = "TblProdRequest.findByPkgDimensionUnit", query = "SELECT t FROM TblProdRequest t WHERE t.pkgDimensionUnit = :pkgDimensionUnit")
    , @NamedQuery(name = "TblProdRequest.findByPkgVolWeight", query = "SELECT t FROM TblProdRequest t WHERE t.pkgVolWeight = :pkgVolWeight")
    , @NamedQuery(name = "TblProdRequest.findByCreatedAt", query = "SELECT t FROM TblProdRequest t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TblProdRequest.findByUpdatedAt", query = "SELECT t FROM TblProdRequest t WHERE t.updatedAt = :updatedAt")
    , @NamedQuery(name = "TblProdRequest.findByLastUpdatedBy", query = "SELECT t FROM TblProdRequest t WHERE t.lastUpdatedBy = :lastUpdatedBy")
    , @NamedQuery(name = "TblProdRequest.findByUserType", query = "SELECT t FROM TblProdRequest t WHERE t.userType = :userType")
    , @NamedQuery(name = "TblProdRequest.findByStatus", query = "SELECT t FROM TblProdRequest t WHERE t.status = :status")})
public class TblProdRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "preq_id")
    private Long preqId;
    @Column(name = "seller_id")
    private BigInteger sellerId;
    @Column(name = "sku")
    private String sku;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "prod_title")
    private String prodTitle;
    @Column(name = "main_cat_id")
    private Integer mainCatId;
    @Column(name = "cat_id")
    private Integer catId;
    @Column(name = "mrp")
    private BigInteger mrp;
    @Column(name = "selling_price")
    private BigInteger sellingPrice;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "weight")
    private Float weight;
    @Column(name = "pkg_length")
    private Float pkgLength;
    @Column(name = "pkg_breadth")
    private Float pkgBreadth;
    @Column(name = "pkg_height")
    private Float pkgHeight;
    @Column(name = "pkg_dimension_unit")
    private String pkgDimensionUnit;
    @Column(name = "pkg_vol_weight")
    private Float pkgVolWeight;
    @Lob
    @Column(name = "prod_desc")
    private String prodDesc;
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
    @Lob
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "status")
    private Integer status;

    public TblProdRequest() {
    }

    public TblProdRequest(Long preqId) {
        this.preqId = preqId;
    }

    public TblProdRequest(Long preqId, Date createdAt) {
        this.preqId = preqId;
        this.createdAt = createdAt;
    }

    public Long getPreqId() {
        return preqId;
    }

    public void setPreqId(Long preqId) {
        this.preqId = preqId;
    }

    public BigInteger getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigInteger sellerId) {
        this.sellerId = sellerId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProdTitle() {
        return prodTitle;
    }

    public void setProdTitle(String prodTitle) {
        this.prodTitle = prodTitle;
    }

    public Integer getMainCatId() {
        return mainCatId;
    }

    public void setMainCatId(Integer mainCatId) {
        this.mainCatId = mainCatId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public BigInteger getMrp() {
        return mrp;
    }

    public void setMrp(BigInteger mrp) {
        this.mrp = mrp;
    }

    public BigInteger getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigInteger sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getPkgLength() {
        return pkgLength;
    }

    public void setPkgLength(Float pkgLength) {
        this.pkgLength = pkgLength;
    }

    public Float getPkgBreadth() {
        return pkgBreadth;
    }

    public void setPkgBreadth(Float pkgBreadth) {
        this.pkgBreadth = pkgBreadth;
    }

    public Float getPkgHeight() {
        return pkgHeight;
    }

    public void setPkgHeight(Float pkgHeight) {
        this.pkgHeight = pkgHeight;
    }

    public String getPkgDimensionUnit() {
        return pkgDimensionUnit;
    }

    public void setPkgDimensionUnit(String pkgDimensionUnit) {
        this.pkgDimensionUnit = pkgDimensionUnit;
    }

    public Float getPkgVolWeight() {
        return pkgVolWeight;
    }

    public void setPkgVolWeight(Float pkgVolWeight) {
        this.pkgVolWeight = pkgVolWeight;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        hash += (preqId != null ? preqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProdRequest)) {
            return false;
        }
        TblProdRequest other = (TblProdRequest) object;
        if ((this.preqId == null && other.preqId != null) || (this.preqId != null && !this.preqId.equals(other.preqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblProdRequest[ preqId=" + preqId + " ]";
    }
    
}
