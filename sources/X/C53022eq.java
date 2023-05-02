package X;

import android.text.TextUtils;

/* renamed from: X.2eq  reason: invalid class name and case insensitive filesystem */
public class C53022eq {
    public static final String A00;
    public static final String[] A01;

    static {
        String[] strArr = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_chat_row_id", "parent_from_me", "parent_key_id", "parent_sender_jid_row_id", "timestamp", "orphan_message_data"};
        A01 = strArr;
        A00 = TextUtils.join(",", strArr);
    }
}
