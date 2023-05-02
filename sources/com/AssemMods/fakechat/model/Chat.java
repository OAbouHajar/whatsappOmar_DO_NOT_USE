package com.AssemMods.fakechat.model;

import java.util.List;

public class Chat {
    private boolean mIsGroup = false;
    private String mJid;
    private WhatsAppMessage mLastMessage;
    private List<WhatsAppMessage> mMessages = null;
    private String mName;

    public Chat(String str) {
        this.mJid = str;
    }

    public String getJid() {
        return this.mJid;
    }

    public WhatsAppMessage getLastMessage() {
        return this.mLastMessage;
    }

    public WhatsAppMessage getMessage(int i2) {
        return this.mMessages.get(i2);
    }

    public int getMessageId(int i2) {
        return this.mMessages.get(i2).getId();
    }

    public long getMessageNextTs(int i2) {
        try {
            return this.mMessages.get(i2 + 1).getTs();
        } catch (IndexOutOfBoundsException e2) {
            return -1;
        }
    }

    public long getMessagePreviousTs(int i2) {
        try {
            return this.mMessages.get(i2 - 1).getTs();
        } catch (IndexOutOfBoundsException e2) {
            return -1;
        }
    }

    public List<WhatsAppMessage> getMessages() {
        return this.mMessages;
    }

    public String getName() {
        return this.mName;
    }

    public boolean isGroup() {
        return this.mIsGroup;
    }

    public void setGroup(boolean z2) {
        this.mIsGroup = z2;
    }

    public void setLastMessage(WhatsAppMessage whatsAppMessage) {
        this.mLastMessage = whatsAppMessage;
    }

    public void setMessages(List<WhatsAppMessage> list) {
        this.mMessages = list;
    }

    public void setName(String str) {
        this.mName = str;
    }
}
