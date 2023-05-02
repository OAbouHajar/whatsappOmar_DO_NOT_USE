package com.AssemMods.fakechat.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.AssemMods.fakechat.model.Chat;
import com.AssemMods.fakechat.model.WhatsAppMessage;
import com.AssemMods.fakechat.utils.AppUtils;
import com.AssemMods.fakechat.utils.ChatSorter;
import com.obwhatsapp.yo.yo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DB {
    public static final String WHATSAPP_AVATARS_PATH = (yo.APP_DATA + "files/Avatars/");
    private static final String WHATSAPP_MSGSTORE_DB_PATH = (yo.APP_DATA + "databases/msgstore.db");
    private static final String WHATSAPP_WA_DB_PATH = (yo.APP_DATA + "databases/wa.db");
    private SQLiteDatabase msgstore;
    private SQLiteDatabase wa;

    private boolean checkSortTimestamp() {
        try {
            this.msgstore.rawQuery("SELECT sort_timestamp FROM chat_view", (String[]) null).close();
            return true;
        } catch (SQLiteException e2) {
            return false;
        }
    }

    private void closeDatabases() {
        this.msgstore.close();
        this.wa.close();
    }

    private WhatsAppMessage createMessage(Chat chat, Cursor cursor) {
        boolean z2 = false;
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage();
        String string = cursor.getString(0);
        if (string != null && !string.equals("")) {
            whatsAppMessage.setData(string);
        } else if (cursor.getString(4) != null) {
            String string2 = cursor.getString(4);
            if (string2.endsWith(".jpg") || string2.endsWith(".png")) {
                whatsAppMessage.setData("media: image");
            } else if (string2.endsWith(".amr") || string2.endsWith(".mp3")) {
                whatsAppMessage.setData("media: audio");
            } else if (string2.endsWith(".mp4") || string2.endsWith("3gp")) {
                whatsAppMessage.setData("media: video");
            } else if (string2.contains(".")) {
                whatsAppMessage.setData("media: contact");
            } else {
                whatsAppMessage.setData("media: unknown");
            }
        }
        whatsAppMessage.setTs(cursor.getLong(2));
        whatsAppMessage.setId(cursor.getInt(3));
        if (cursor.getInt(1) == 1) {
            z2 = true;
        }
        whatsAppMessage.setFromMe(z2);
        if (cursor.getInt(1) == 1) {
            whatsAppMessage.setMsgFrom("You");
        } else if (chat.isGroup()) {
            String contactName = getContactName(cursor.getString(5));
            if (contactName == null) {
                return null;
            }
            whatsAppMessage.setMsgFrom(contactName);
        } else {
            whatsAppMessage.setMsgFrom(chat.getName());
        }
        whatsAppMessage.setKeyId(cursor.getString(6));
        if (!chat.isGroup()) {
            return whatsAppMessage;
        }
        whatsAppMessage.setGroup();
        return whatsAppMessage;
    }

    private String getContactName(String str) {
        try {
            Cursor rawQuery = this.wa.rawQuery("SELECT display_name FROM wa_contacts WHERE jid = ?", new String[]{str});
            rawQuery.moveToNext();
            if (!rawQuery.isAfterLast()) {
                if (rawQuery.getString(0) != null) {
                    String string = rawQuery.getString(0);
                    rawQuery.close();
                    return string;
                }
            }
            rawQuery.close();
            return "+" + str.substring(0, str.indexOf(64));
        } catch (SQLiteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private boolean openDatabases() {
        try {
            this.msgstore = SQLiteDatabase.openDatabase(WHATSAPP_MSGSTORE_DB_PATH, (SQLiteDatabase.CursorFactory) null, 0);
            this.wa = SQLiteDatabase.openDatabase(WHATSAPP_WA_DB_PATH, (SQLiteDatabase.CursorFactory) null, 0);
            return true;
        } catch (SQLiteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static DB startDB() {
        try {
            DB db = new DB();
            if (!db.openDatabases()) {
                return null;
            }
            AppUtils.thereIsSortTimestamp = db.checkSortTimestamp();
            return db;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void addMessage(WhatsAppMessage whatsAppMessage) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key_remote_jid", whatsAppMessage.getRemoteJid());
        contentValues.put("key_from_me", Boolean.valueOf(whatsAppMessage.getFromMe()));
        contentValues.put("key_id", whatsAppMessage.getKeyId());
        contentValues.put("status", Integer.valueOf(whatsAppMessage.getStatus()));
        contentValues.put("needs_push", 0);
        contentValues.put("data", whatsAppMessage.getData());
        contentValues.put("timestamp", Long.valueOf(whatsAppMessage.getTs()));
        contentValues.put("media_url", "");
        contentValues.put("media_mime_type", "");
        contentValues.put("media_wa_type", "0");
        contentValues.put("media_size", 0);
        contentValues.put("media_name", "");
        Double valueOf = Double.valueOf(0.0d);
        contentValues.put("latitude", valueOf);
        contentValues.put("longitude", valueOf);
        contentValues.put("thumb_image", "");
        contentValues.put("remote_resource", "");
        contentValues.put("received_timestamp", Long.valueOf(whatsAppMessage.getReceivedTs()));
        contentValues.put("send_timestamp", -1);
        contentValues.put("receipt_server_timestamp", -1);
        contentValues.put("receipt_device_timestamp", -1);
        contentValues.put("raw_data", 0);
        contentValues.put("media_hash", "");
        contentValues.put("recipient_count", 0);
        contentValues.put("media_duration", 0);
        contentValues.put("origin", 0);
        this.msgstore.insert("messages", (String) null, contentValues);
    }

    public void close() {
        closeDatabases();
    }

    public void deleteMessage(int i2) {
        SQLiteDatabase sQLiteDatabase = this.msgstore;
        sQLiteDatabase.delete("messages", "_id=" + i2, (String[]) null);
    }

    public List<Chat> getContacts() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = AppUtils.thereIsSortTimestamp ? this.msgstore.rawQuery("SELECT raw_string_jid FROM chat_view ORDER BY sort_timestamp DESC", (String[]) null) : this.msgstore.rawQuery("SELECT raw_string_jid FROM chat_view", (String[]) null);
        while (rawQuery.moveToNext()) {
            String string = rawQuery.getString(0);
            Chat chat = new Chat(string);
            if (!string.endsWith(".net")) {
                chat.setGroup(true);
            }
            String contactName = getContactName(string);
            if (contactName == null) {
                rawQuery.close();
                return null;
            }
            chat.setName(contactName);
            Cursor rawQuery2 = this.msgstore.rawQuery("SELECT data, key_from_me, timestamp, _id, media_name, remote_resource, key_id FROM messages WHERE key_remote_jid = ? ORDER BY timestamp DESC LIMIT 1", new String[]{chat.getJid()});
            rawQuery2.moveToNext();
            if (!rawQuery2.isAfterLast()) {
                WhatsAppMessage createMessage = createMessage(chat, rawQuery2);
                if (createMessage == null) {
                    rawQuery.close();
                    return null;
                }
                chat.setLastMessage(createMessage);
                arrayList.add(chat);
            }
            rawQuery2.close();
        }
        rawQuery.close();
        if (AppUtils.thereIsSortTimestamp) {
            return arrayList;
        }
        Collections.sort(arrayList, new ChatSorter());
        return arrayList;
    }

    public List<WhatsAppMessage> getConversation(Chat chat) {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.msgstore.rawQuery("SELECT data, key_from_me, timestamp, _id, media_name, remote_resource, key_id FROM messages WHERE key_remote_jid = ? ORDER BY timestamp DESC LIMIT 100", new String[]{chat.getJid()});
        while (rawQuery.moveToNext()) {
            if (rawQuery.getString(0) != null) {
                WhatsAppMessage createMessage = createMessage(chat, rawQuery);
                if (createMessage == null) {
                    rawQuery.close();
                    return null;
                }
                arrayList.add(0, createMessage);
            }
        }
        rawQuery.close();
        return arrayList;
    }

    public void modifyMessage(int i2, String str, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", str);
        contentValues.put("timestamp", Long.valueOf(j2));
        SQLiteDatabase sQLiteDatabase = this.msgstore;
        sQLiteDatabase.update("messages", contentValues, "_id=" + i2, (String[]) null);
    }
}
