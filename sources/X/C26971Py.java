package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.1Py  reason: invalid class name and case insensitive filesystem */
public class C26971Py {
    public final C16920ts A00;
    public final C216314v A01;
    public final C16900tq A02;
    public final C222617g A03;

    public C26971Py(C16920ts r1, C216314v r2, C16900tq r3, C222617g r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static Cursor A00(C16800tf r4, byte b2, long j2) {
        C16810tg r42 = r4.A02;
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass23Q.A00(b2));
        sb.append(" WHERE message_add_on._id = ? AND message_add_on.message_add_on_type = ?");
        return r42.A08(sb.toString(), new String[]{String.valueOf(j2), String.valueOf(b2)});
    }

    public static Cursor A01(C16800tf r4, byte b2, long j2) {
        String[] strArr = {String.valueOf(j2), String.valueOf(b2)};
        C16810tg r2 = r4.A02;
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass23Q.A00(b2));
        sb.append(" WHERE message_add_on.parent_message_row_id = ? AND message_add_on.message_add_on_type = ?");
        return r2.A08(sb.toString(), strArr);
    }

    public static Cursor A02(C16800tf r5, byte b2, long j2, long j3, boolean z2) {
        String[] strArr = new String[4];
        strArr[0] = String.valueOf(j2);
        strArr[1] = String.valueOf(b2);
        strArr[2] = String.valueOf(j3);
        strArr[3] = z2 ? "1" : "0";
        C16810tg r52 = r5.A02;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AnonymousClass23Q.A00(b2));
        sb2.append(" WHERE message_add_on.parent_message_row_id = ? AND message_add_on.message_add_on_type = ?");
        sb.append(sb2.toString());
        sb.append(" AND ");
        sb.append("message_add_on");
        sb.append(".");
        sb.append("sender_jid_row_id");
        sb.append(" = ? AND ");
        sb.append("message_add_on");
        sb.append(".");
        sb.append("from_me");
        sb.append(" = ? ");
        return r52.A08(sb.toString(), strArr);
    }

    public long A03(C38541qx r8) {
        C16800tf A022 = this.A02.A02();
        try {
            ContentValues contentValues = new ContentValues(12);
            C16920ts r1 = this.A00;
            C28381Vw r2 = r8.A11;
            C15830rv r0 = r2.A00;
            AnonymousClass00B.A06(r0);
            contentValues.put("chat_row_id", Long.valueOf(r1.A02(r0)));
            contentValues.put("from_me", Boolean.valueOf(r2.A02));
            contentValues.put("key_id", r2.A01);
            C15830rv A0B = r8.A0B();
            contentValues.put("sender_jid_row_id", Long.valueOf(A0B != null ? this.A01.A01(A0B) : -1));
            contentValues.put("parent_message_row_id", Long.valueOf(r8.A00));
            contentValues.put("timestamp", Long.valueOf(r8.A0I));
            contentValues.put("status", Integer.valueOf(r8.A0C));
            contentValues.put("message_add_on_type", Byte.valueOf(r8.A10));
            contentValues.put("received_timestamp", Long.valueOf(r8.A0G));
            long A032 = A022.A02.A03(contentValues, "message_add_on");
            r8.A13 = A032;
            A022.close();
            return A032;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Cursor A04(C16800tf r4, C28381Vw r5) {
        C16920ts r1 = this.A00;
        C15830rv r0 = r5.A00;
        AnonymousClass00B.A06(r0);
        return r4.A02.A08(AnonymousClass23Q.A04, new String[]{String.valueOf(r1.A02(r0)), r5.A01, String.valueOf(r5.A02 ? 1 : 0)});
    }

    public C38541qx A05(Cursor cursor, HashMap hashMap) {
        String str;
        int A002 = C33931jQ.A00("from_me", hashMap);
        int A003 = C33931jQ.A00("key_id", hashMap);
        int A004 = C33931jQ.A00("chat_row_id", hashMap);
        boolean z2 = true;
        if (cursor.getInt(A002) != 1) {
            z2 = false;
        }
        String string = cursor.getString(A003);
        C15830rv A05 = this.A00.A05(cursor.getLong(A004));
        if (A05 == null) {
            str = "MessageAddOnStore/createFMessageFromCursor unexpected jid for MessageAddOn";
        } else {
            C28381Vw r8 = new C28381Vw(A05, string, z2);
            int A005 = C33931jQ.A00("timestamp", hashMap);
            int A006 = C33931jQ.A00("received_timestamp", hashMap);
            int A007 = C33931jQ.A00("message_add_on_type", hashMap);
            long j2 = cursor.getLong(A005);
            long j3 = cursor.getLong(A006);
            if (j3 == 0) {
                j3 = j2;
            }
            C16740tZ A012 = this.A03.A01(r8, (byte) cursor.getInt(A007), j2);
            if (!(A012 instanceof C38541qx)) {
                str = "MessageAddOnStore/createFMessageFromCursor read fMessage with not supported messageAddOnType";
            } else {
                if (!r8.A02) {
                    A012.A0G = j3;
                }
                return (C38541qx) A012;
            }
        }
        Log.e(str);
        return null;
    }

    public void A06(long j2) {
        C16800tf A022 = this.A02.A02();
        try {
            A022.A02.A01("message_add_on", "_id = ?", new String[]{String.valueOf(j2)});
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.util.Set r11, int r12) {
        /*
            r10 = this;
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "status"
            r5.put(r0, r1)
            java.lang.String r4 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            X.0tq r0 = r10.A02
            X.0tf r3 = r0.A02()
            X.1cj r9 = r3.A00()     // Catch:{ all -> 0x0068 }
            java.util.Iterator r8 = r11.iterator()     // Catch:{ all -> 0x0063 }
        L_0x001f:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0059
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x0063 }
            X.1Vw r7 = (X.C28381Vw) r7     // Catch:{ all -> 0x0063 }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0063 }
            r6 = 0
            X.0ts r1 = r10.A00     // Catch:{ all -> 0x0063 }
            X.0rv r0 = r7.A00     // Catch:{ all -> 0x0063 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0063 }
            long r0 = r1.A02(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0063 }
            r2[r6] = r0     // Catch:{ all -> 0x0063 }
            r1 = 1
            boolean r0 = r7.A02     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "1"
        L_0x0047:
            r2[r1] = r0     // Catch:{ all -> 0x0063 }
            r1 = 2
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0063 }
            r2[r1] = r0     // Catch:{ all -> 0x0063 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "message_add_on"
            r1.A00(r0, r5, r4, r2)     // Catch:{ all -> 0x0063 }
            goto L_0x001f
        L_0x0056:
            java.lang.String r0 = "0"
            goto L_0x0047
        L_0x0059:
            r9.A00()     // Catch:{ all -> 0x0063 }
            r9.close()     // Catch:{ all -> 0x0068 }
            r3.close()
            return
        L_0x0063:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26971Py.A07(java.util.Set, int):void");
    }
}
