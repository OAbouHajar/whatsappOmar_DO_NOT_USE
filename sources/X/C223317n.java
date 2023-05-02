package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;

/* renamed from: X.17n  reason: invalid class name and case insensitive filesystem */
public class C223317n {
    public final C16900tq A00;
    public final AnonymousClass11I A01;

    public C223317n(C16900tq r1, AnonymousClass11I r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final void A00(C16740tZ r8) {
        boolean z2 = false;
        boolean z3 = false;
        if (r8.A13 > 0) {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder("FutureMessageStore/validateMessage/message must have row_id set; key=");
        C28381Vw r2 = r8.A11;
        sb.append(r2);
        AnonymousClass00B.A0C(sb.toString(), z3);
        if (r8.A08() == 1) {
            z2 = true;
        }
        StringBuilder sb2 = new StringBuilder("FutureMessageStore/validateMessage/message in main storage; key=");
        sb2.append(r2);
        AnonymousClass00B.A0C(sb2.toString(), z2);
    }

    public void A01(C38791rQ r13) {
        AnonymousClass11I r6 = this.A01;
        if (r6.A01("future_ready", 0) == 1 || (r13.A13 > 0 && r13.A13 <= r6.A01("migration_message_future_index", 0))) {
            A00(r13);
            C16800tf A02 = this.A00.A02();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("message_row_id", Long.valueOf(r13.A13));
                contentValues.put("version", Integer.valueOf(r13.A01));
                C38611r4.A06(contentValues, "data", r13.A11());
                contentValues.put("future_message_type", Integer.valueOf(r13.A00));
                C16810tg r8 = A02.A02;
                long A022 = r8.A02(contentValues, "message_future");
                boolean z2 = false;
                if (A022 != -1) {
                    if (A022 == r13.A13) {
                        z2 = true;
                    }
                    AnonymousClass00B.A0D("FutureMessageStore/insertOrUpdateFutureMessage/inserted row should have same row_id", z2);
                } else {
                    contentValues.remove("message_row_id");
                    if (r8.A00("message_future", contentValues, "message_row_id = ?", new String[]{String.valueOf(r13.A13)}) != 1) {
                        throw new SQLiteException("Failed to insert / update futureproof message");
                    }
                }
                A02.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }
}
