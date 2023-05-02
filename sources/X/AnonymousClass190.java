package X;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: X.190  reason: invalid class name */
public class AnonymousClass190 {
    public final C16900tq A00;

    public AnonymousClass190(C16900tq r1) {
        this.A00 = r1;
    }

    public void A00(C38651rC r6, long j2) {
        C16800tf A02 = this.A00.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(j2));
            if (!TextUtils.isEmpty(r6.A01)) {
                contentValues.put("parent_group_jid", r6.A01);
            }
            if (!TextUtils.isEmpty(r6.A00)) {
                contentValues.put("group_subject", r6.A00);
            }
            A02.A02.A06(contentValues, "message_quoted_blank_reply", 5);
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
