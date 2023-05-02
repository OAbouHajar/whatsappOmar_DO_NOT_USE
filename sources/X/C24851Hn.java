package X;

import android.util.LruCache;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Hn  reason: invalid class name and case insensitive filesystem */
public class C24851Hn {
    public final LruCache A00 = new LruCache(3);
    public final AnonymousClass1O8 A01;

    public C24851Hn(AnonymousClass1O8 r3) {
        this.A01 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0078=Splitter:B:21:0x0078, B:13:0x006b=Splitter:B:13:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2IP A00(com.whatsapp.jid.UserJid r18) {
        /*
            r17 = this;
            r2 = r17
            X.1O8 r3 = r2.A01
            r8 = 0
            r10 = r18
            X.0tq r0 = r3.A02     // Catch:{ Exception -> 0x007e }
            X.0tf r1 = r0.get()     // Catch:{ Exception -> 0x007e }
            X.0tg r7 = r1.A02     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = "SELECT jid_row_id,data,source,biz_count,has_user_sent_last_message,last_interaction FROM conversion_tuples WHERE jid_row_id = ? "
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0079 }
            X.14v r0 = r3.A01     // Catch:{ all -> 0x0079 }
            long r3 = r0.A01(r10)     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0079 }
            r0 = 0
            r5[r0] = r3     // Catch:{ all -> 0x0079 }
            android.database.Cursor r3 = r7.A08(r6, r5)     // Catch:{ all -> 0x0079 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "data"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r11 = r3.getString(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "source"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r12 = r3.getString(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "biz_count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0072 }
            int r13 = r3.getInt(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "has_user_sent_last_message"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0072 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0072 }
            r16 = 0
            if (r0 <= 0) goto L_0x005a
            r16 = 1
        L_0x005a:
            java.lang.String r0 = "last_interaction"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0072 }
            long r14 = r3.getLong(r0)     // Catch:{ all -> 0x0072 }
            X.2IP r9 = new X.2IP     // Catch:{ all -> 0x0072 }
            r9.<init>(r10, r11, r12, r13, r14, r16)     // Catch:{ all -> 0x0072 }
            goto L_0x006b
        L_0x006a:
            r9 = r8
        L_0x006b:
            r3.close()     // Catch:{ all -> 0x0079 }
            r1.close()     // Catch:{ Exception -> 0x007e }
            goto L_0x0085
        L_0x0072:
            r0 = move-exception
            if (r3 == 0) goto L_0x0078
            r3.close()     // Catch:{ all -> 0x0078 }
        L_0x0078:
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x007d }
        L_0x007d:
            throw r0     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            r1 = move-exception
            java.lang.String r0 = "conversionTupleMessageStore/getConversionTuple error accessing db"
            com.whatsapp.util.Log.e(r0, r1)
            r9 = r8
        L_0x0085:
            android.util.LruCache r0 = r2.A00
            if (r9 == 0) goto L_0x008d
            r0.put(r10, r9)
            return r9
        L_0x008d:
            r0.remove(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24851Hn.A00(com.whatsapp.jid.UserJid):X.2IP");
    }

    public void A01(UserJid userJid) {
        AnonymousClass1O8 r5 = this.A01;
        C16800tf A02 = r5.A02.A02();
        try {
            r5.A00(A02.A02, (int) r5.A01.A01(userJid));
            A02.close();
            this.A00.remove(userJid);
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
