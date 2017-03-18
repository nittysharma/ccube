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
@Table(name = "tbl_inbox")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblInbox.findAll", query = "SELECT t FROM TblInbox t")
    , @NamedQuery(name = "TblInbox.findByMsgId", query = "SELECT t FROM TblInbox t WHERE t.msgId = :msgId")
    , @NamedQuery(name = "TblInbox.findByFromName", query = "SELECT t FROM TblInbox t WHERE t.fromName = :fromName")
    , @NamedQuery(name = "TblInbox.findByFromId", query = "SELECT t FROM TblInbox t WHERE t.fromId = :fromId")
    , @NamedQuery(name = "TblInbox.findByToId", query = "SELECT t FROM TblInbox t WHERE t.toId = :toId")
    , @NamedQuery(name = "TblInbox.findByMsgTime", query = "SELECT t FROM TblInbox t WHERE t.msgTime = :msgTime")
    , @NamedQuery(name = "TblInbox.findByStatus", query = "SELECT t FROM TblInbox t WHERE t.status = :status")})
public class TblInbox implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "msg_id")
    private Long msgId;
    @Column(name = "from_name")
    private String fromName;
    @Column(name = "from_id")
    private BigInteger fromId;
    @Column(name = "to_id")
    private BigInteger toId;
    @Lob
    @Column(name = "msg")
    private String msg;
    @Basic(optional = false)
    @Column(name = "msg_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msgTime;
    @Column(name = "status")
    private Integer status;

    public TblInbox() {
    }

    public TblInbox(Long msgId) {
        this.msgId = msgId;
    }

    public TblInbox(Long msgId, Date msgTime) {
        this.msgId = msgId;
        this.msgTime = msgTime;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public BigInteger getFromId() {
        return fromId;
    }

    public void setFromId(BigInteger fromId) {
        this.fromId = fromId;
    }

    public BigInteger getToId() {
        return toId;
    }

    public void setToId(BigInteger toId) {
        this.toId = toId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
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
        hash += (msgId != null ? msgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblInbox)) {
            return false;
        }
        TblInbox other = (TblInbox) object;
        if ((this.msgId == null && other.msgId != null) || (this.msgId != null && !this.msgId.equals(other.msgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.spice.indosat.seller.ccube.persistance.TblInbox[ msgId=" + msgId + " ]";
    }
    
}
