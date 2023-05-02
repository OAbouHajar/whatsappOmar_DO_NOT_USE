package X;

import android.text.TextUtils;

/* renamed from: X.4Ah  reason: invalid class name and case insensitive filesystem */
public class C81914Ah {
    public static final String A00;
    public static final String[] A01;

    static {
        String[] strArr = {"keep_in_chat_state", "sender_timestamp", "keep_count", "actor_device_jid_row_id"};
        A01 = strArr;
        A00 = TextUtils.join(",", strArr);
    }
}
