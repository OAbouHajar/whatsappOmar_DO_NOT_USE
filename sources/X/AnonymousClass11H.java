package X;

import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape0S1301100_I0;
import com.whatsapp.util.Log;

/* renamed from: X.11H  reason: invalid class name */
public class AnonymousClass11H {
    public final AnonymousClass126 A00;
    public final C16920ts A01;
    public final C15810rt A02;
    public final C216314v A03;
    public final C19650ym A04;
    public final C16900tq A05;

    public AnonymousClass11H(AnonymousClass126 r1, C16920ts r2, C15810rt r3, C216314v r4, C19650ym r5, C16900tq r6) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A04 = r5;
    }

    public void A00(C15830rv r4, String str) {
        StringBuilder sb = new StringBuilder("msgstore/updategroupchatsubject/");
        sb.append(r4);
        Log.i(sb.toString());
        this.A00.A01(new RunnableRunnableShape0S1200000_I0(r4, str, this, 19), 37);
    }

    public void A01(C16050sL r12, C34141jl r13, String str, int i2, long j2) {
        StringBuilder sb = new StringBuilder("msgstore/updategroupchat/");
        sb.append(r12);
        sb.append(" creation=");
        long j3 = j2;
        sb.append(j3);
        sb.append(" groupType='");
        sb.append(i2);
        sb.append("'");
        Log.i(sb.toString());
        this.A00.A01(new RunnableRunnableShape0S1301100_I0(this, r12, r13, str, i2, 1, j3), 38);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0076 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.C15840rx r8, X.C15830rv r9, java.lang.Long r10) {
        /*
            r7 = this;
            X.0tq r0 = r7.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x0081, Error | RuntimeException -> 0x007c }
            X.0tf r6 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0081, Error | RuntimeException -> 0x007c }
            X.1cj r5 = r6.A00()     // Catch:{ all -> 0x0077 }
            X.0ts r4 = r7.A01     // Catch:{ all -> 0x0072 }
            monitor-enter(r8)     // Catch:{ all -> 0x0072 }
            r0 = 3
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x006f }
            r3.<init>(r0)     // Catch:{ all -> 0x006f }
            if (r10 == 0) goto L_0x001a
            java.lang.String r0 = "created_timestamp"
            r3.put(r0, r10)     // Catch:{ all -> 0x006f }
        L_0x001a:
            java.lang.String r1 = "subject"
            java.lang.String r0 = r8.A0d     // Catch:{ all -> 0x006f }
            r3.put(r1, r0)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "group_type"
            int r0 = r8.A01     // Catch:{ all -> 0x006f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x006f }
            r3.put(r1, r0)     // Catch:{ all -> 0x006f }
            X.1jl r0 = r8.A0a     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = "growth_lock_level"
            int r0 = r0.A00     // Catch:{ all -> 0x006f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x006f }
            r3.put(r1, r0)     // Catch:{ all -> 0x006f }
            java.lang.String r2 = "growth_lock_expiration_ts"
            X.1jl r0 = r8.A0a     // Catch:{ all -> 0x006f }
            long r0 = r0.A01     // Catch:{ all -> 0x006f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x006f }
            r3.put(r2, r0)     // Catch:{ all -> 0x006f }
        L_0x0049:
            monitor-exit(r8)     // Catch:{ all -> 0x0072 }
            boolean r0 = r4.A0I(r3, r8)     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0064
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r1.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "msgstore/addmsg/chatlist/insert/failed jid="
            r1.append(r0)     // Catch:{ all -> 0x0072 }
            r1.append(r9)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0072 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0072 }
        L_0x0064:
            r5.A00()     // Catch:{ all -> 0x0072 }
            r0 = 1
            r5.close()     // Catch:{ all -> 0x0077 }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0081, Error | RuntimeException -> 0x007c }
            return r0
        L_0x006f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0081, Error | RuntimeException -> 0x007c }
        L_0x007c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0081:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r7.A04
            r0.A02()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11H.A02(X.0rx, X.0rv, java.lang.Long):boolean");
    }

    public boolean A03(C15830rv r4, int i2) {
        C15840rx A06 = this.A02.A06(r4);
        if (A06 == null) {
            StringBuilder sb = new StringBuilder("groupchatstore/updateGroupChatInfoGroupTypeIfExist/chat does not exist: ");
            sb.append(r4);
            Log.i(sb.toString());
            return false;
        }
        Log.i("groupchatstore/updateGroupChatInfoGroupTypeInBackgroundIfExist/update group type");
        A06.A01 = i2;
        return A02(A06, r4, (Long) null);
    }
}
