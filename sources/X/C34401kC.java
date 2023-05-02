package X;

import android.text.TextUtils;

/* renamed from: X.1kC  reason: invalid class name and case insensitive filesystem */
public class C34401kC {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder sb = new StringBuilder("INSERT INTO wa_contacts SELECT ");
        sb.append(TextUtils.join(", ", new String[]{"_id", "jid", "is_whatsapp_user", "status", "status_timestamp", "number", "raw_contact_id", "display_name", "phone_type", "phone_label", "unseen_msg_count", "photo_ts", "thumb_ts", "photo_id_timestamp", "given_name", "family_name", "wa_name", "sort_name"}));
        sb.append(" FROM ");
        sb.append("old_wa_contacts");
        A01 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO wa_contacts SELECT ");
        sb2.append(TextUtils.join(", ", new String[]{"_id", "jid", "is_whatsapp_user", "status", "status_timestamp", "number", "raw_contact_id", "display_name", "phone_type", "phone_label", "unseen_msg_count", "photo_ts", "thumb_ts", "photo_id_timestamp", "given_name", "family_name", "wa_name", "sort_name", "nickname", "company", "title", "status_autodownload_disabled", "keep_timestamp", "is_spam_reported"}));
        sb2.append(" FROM ");
        sb2.append("old_wa_contacts");
        A00 = sb2.toString();
    }
}
