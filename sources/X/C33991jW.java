package X;

import android.text.TextUtils;

/* renamed from: X.1jW  reason: invalid class name and case insensitive filesystem */
public class C33991jW {
    public static final String[] A00 = {""};

    public static void A00(C16810tg r4) {
        if (TextUtils.isEmpty(C33961jT.A00(r4, "table", "message_ftsv2"))) {
            r4.A0B("CREATE VIRTUAL TABLE message_ftsv2 USING FTS4(content, fts_jid, fts_namespace)");
            C33971jU.A02(r4, "fts_index_start", "FtsTable", 0);
        }
    }
}
