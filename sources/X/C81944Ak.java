package X;

import android.text.TextUtils;

/* renamed from: X.4Ak  reason: invalid class name and case insensitive filesystem */
public class C81944Ak {
    public static final String A00;
    public static final String[] A01;

    static {
        String[] strArr = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_message_row_id", "timestamp", "status", "message_add_on_type", "received_timestamp"};
        A01 = strArr;
        A00 = TextUtils.join(",", strArr);
    }
}
