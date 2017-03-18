/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spice.indosat.seller.ccube.persistance;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nitin.kumar1
 */
@Entity
@Table(name = "tbl_seller_addr_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSellerAddrType.findAll", query = "SELECT t FROM TblSellerAddrType t")
    , @NamedQuery(name = "TblSellerAddrType.findByAddrTypeId", query = "SELECT t FROM TblSellerAddrType t WHERE t.addrTypeId = :addrTypeId")
    , @NamedQuery(name = "TblSellerAddrType.findByAddrTypeDesc", query = "SELECT t FROM TblSellerAddrType t WHERE t.addrTypeDesc = :addrTypeDesc")})
public class TblSellerAddrType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "addr_type_id")
    private Integer addrTypeId;
    @Column(name = "addr_type_desc")
    private String addrTypeDesc;

    public TblSellerAddrType() {
    }

    public TblSellerAddrType(Integer addrTypeId) {
        this.addrTypeId = addrTypeId;
    }

    public Integer getAddrTypeId() {
        return addrTypeId;
    }

    public void setAddrTypeId(Integer addrTypeId) {
        this.addrTypeId = addrTypeId;
    }

    public String getAddrTypeDesc() {
        return addrTypeDesc;
    }

    public void setAddrTypeDesc(String addrTypeDesc) {
        this.addrTypeDesc = addrTypeDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addrTypeId != null ? addrTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSellerAddrType)) {
            return false;
        }
        TblSellerAddrType other = (TblSellerAddrType) object;
        if ((this.addrTypeId == null && other.addrTypeId != null) || (this.addrTypeId != null && !this.addrTypeId.equals(other.addrTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblSellerAddrType[ addrTypeId=" + addrTypeId + " ]";
    }
    
}
