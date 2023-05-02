package com.AssemMods.fakechat.utils;

import com.AssemMods.fakechat.model.Chat;
import java.util.Comparator;

public class ChatSorter implements Comparator<Chat> {
    public int compare(Chat chat, Chat chat2) {
        if (chat.getLastMessage() == null) {
            return -1;
        }
        return (chat2.getLastMessage() != null && chat.getLastMessage().getTs() > chat2.getLastMessage().getTs()) ? -1 : 1;
    }
}
