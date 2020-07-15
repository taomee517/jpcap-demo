package com.net.jpcap.entity;


import com.net.jpcap.classify.PacketType;

import java.util.Date;

/**
 * @author 罗涛
 * @title PacketInfo
 * @date 2020/7/14 19:37
 */
public class PacketInfo {
    private Date msgTime;
    private int length;
    private String srcMac;
    private String destMac;
    private String srcIp;
    private String descIp;
    private PacketType type;
    private int srcPort;
    private int destPort;
    private String content;


    public Date getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getSrcMac() {
        return srcMac;
    }

    public void setSrcMac(String srcMac) {
        this.srcMac = srcMac;
    }

    public String getDestMac() {
        return destMac;
    }

    public void setDestMac(String destMac) {
        this.destMac = destMac;
    }

    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public String getDescIp() {
        return descIp;
    }

    public void setDescIp(String descIp) {
        this.descIp = descIp;
    }

    public PacketType getType() {
        return type;
    }

    public void setType(PacketType type) {
        this.type = type;
    }

    public int getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(int srcPort) {
        this.srcPort = srcPort;
    }

    public int getDestPort() {
        return destPort;
    }

    public void setDestPort(int destPort) {
        this.destPort = destPort;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
