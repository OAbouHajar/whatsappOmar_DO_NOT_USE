package com.AssemMods.fakechat.model;

import com.AssemMods.fakechat.utils.AppUtils;
import java.io.Serializable;
import java.util.Date;

public class WhatsAppMessage implements Serializable {
    private static final long serialVersionUID = 602396745690884205L;
    private String mData;
    private boolean mFromMe;
    private int mId;
    private boolean mIsGroup = false;
    private String mKeyId;
    private String mMsgFrom;
    private long mReceivedTs;
    private String mRemoteJid;
    private int mStatus;
    private long mTs;

    public WhatsAppMessage() {
    }

    public WhatsAppMessage(int i2, String str, boolean z2, String str2, int i3, String str3, long j2, long j3, String str4) {
        this.mId = i2;
        this.mRemoteJid = str;
        this.mFromMe = z2;
        this.mKeyId = str2;
        this.mStatus = i3;
        this.mData = str3;
        this.mTs = j2;
        this.mReceivedTs = j3;
        this.mMsgFrom = str4;
    }

    public String getData() {
        return this.mData;
    }

    public boolean getFromMe() {
        return this.mFromMe;
    }

    public int getId() {
        return this.mId;
    }

    public String getKeyId() {
        return this.mKeyId;
    }

    public String getMsgFrom() {
        String str = this.mMsgFrom;
        if (str != null && !str.equals("")) {
            return this.mMsgFrom;
        }
        String str2 = this.mRemoteJid;
        if (str2 == null || str2.equals("")) {
            return getKeyId();
        }
        String str3 = this.mRemoteJid;
        return str3.substring(2, str3.indexOf("@"));
    }

    public long getReceivedTs() {
        return this.mReceivedTs;
    }

    public String getRemoteJid() {
        return this.mRemoteJid;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getTime() {
        Date dateFromTs = AppUtils.getDateFromTs(this.mTs);
        StringBuilder sb = new StringBuilder();
        String str = "0";
        sb.append(dateFromTs.getHours() < 10 ? str : "");
        sb.append(dateFromTs.getHours());
        sb.append(":");
        if (dateFromTs.getMinutes() >= 10) {
            str = "";
        }
        sb.append(str);
        sb.append(dateFromTs.getMinutes());
        return sb.toString();
    }

    public long getTs() {
        return this.mTs;
    }

    public boolean isGroup() {
        return this.mIsGroup;
    }

    public void setData(String str) {
        this.mData = str;
    }

    public void setFromMe(boolean z2) {
        this.mFromMe = z2;
    }

    public void setGroup() {
        this.mIsGroup = true;
    }

    public void setId(int i2) {
        this.mId = i2;
    }

    public void setKeyId(String str) {
        this.mKeyId = str;
    }

    public void setMsgFrom(String str) {
        this.mMsgFrom = str;
    }

    public void setReceivedTs(long j2) {
        this.mReceivedTs = j2;
    }

    public void setRemoteJid(String str) {
        this.mRemoteJid = str;
    }

    public void setStatus(int i2) {
        this.mStatus = i2;
    }

    public void setTs(long j2) {
        this.mTs = j2;
    }
}
