package X;

import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.129  reason: invalid class name */
public class AnonymousClass129 {
    public final C16040sK A00;
    public final AnonymousClass01Y A01;
    public final C16980tz A02;
    public final C27421Rr A03;
    public final C16460t6 A04;
    public final C17580vJ A05;
    public final AnonymousClass15H A06;
    public final C17190ug A07;
    public final AnonymousClass122 A08;
    public final C16320sq A09;

    public AnonymousClass129(C16040sK r1, AnonymousClass01Y r2, C16980tz r3, C27421Rr r4, C16460t6 r5, C17580vJ r6, AnonymousClass15H r7, C17190ug r8, AnonymousClass122 r9, C16320sq r10) {
        this.A02 = r3;
        this.A09 = r10;
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A08 = r9;
        this.A06 = r7;
        this.A03 = r4;
    }

    public void A00() {
        Log.i("ChangeNumberManager/deleteChangeNumberContacts");
        new File(this.A02.A00.getFilesDir(), "change_number_contacts.json").delete();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r9 = this;
            java.lang.String r0 = "changenumbermanager/sendchangenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sK r0 = r9.A00
            com.obwhatsapp.Me r5 = r0.A01()
            X.AnonymousClass00B.A06(r5)
            java.lang.String r3 = r5.jabber_id
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tz r0 = r9.A02
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "change_number_contacts.json"
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
            boolean r0 = r2.exists()
            r4 = 0
            if (r0 == 0) goto L_0x00a3
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0091 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0091 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0091 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0091 }
            android.util.JsonReader r7 = new android.util.JsonReader     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0091 }
            r7.<init>(r0)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0091 }
            r7.beginObject()     // Catch:{ all -> 0x0087 }
            r8 = r4
            r6 = r4
        L_0x003f:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r1 = r7.nextName()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "notify_jids"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "old_jid"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r8 = r7.nextString()     // Catch:{ all -> 0x0087 }
            goto L_0x003f
        L_0x005e:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0087 }
            r6.<init>()     // Catch:{ all -> 0x0087 }
            r7.beginArray()     // Catch:{ all -> 0x0087 }
        L_0x0066:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r7.nextString()     // Catch:{ all -> 0x0087 }
            r6.add(r0)     // Catch:{ all -> 0x0087 }
            goto L_0x0066
        L_0x0074:
            if (r8 == 0) goto L_0x007e
            if (r6 == 0) goto L_0x007e
            X.2Gc r2 = new X.2Gc     // Catch:{ all -> 0x0087 }
            r2.<init>(r8, r6)     // Catch:{ all -> 0x0087 }
            goto L_0x007f
        L_0x007e:
            r2 = r4
        L_0x007f:
            r7.close()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0083 }
            goto L_0x0098
        L_0x0083:
            r1 = move-exception
            goto L_0x0093
        L_0x0085:
            r1 = move-exception
            goto L_0x008e
        L_0x0087:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x008b }
        L_0x008b:
            throw r0     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0091 }
        L_0x008c:
            r1 = move-exception
            r2 = r4
        L_0x008e:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/notFoundJson "
            goto L_0x0095
        L_0x0091:
            r1 = move-exception
            r2 = r4
        L_0x0093:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/ioErrorJson "
        L_0x0095:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0098:
            if (r2 == 0) goto L_0x00a3
            java.lang.String r0 = r2.A00
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00a3
            r4 = r2
        L_0x00a3:
            X.01Y r0 = r9.A01
            java.util.Set r3 = r0.A08()
            if (r4 == 0) goto L_0x00cb
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.util.ArrayList r0 = r4.A01
            java.util.List r2 = X.C16030sJ.A08(r1, r0)
            java.util.Iterator r1 = r2.iterator()
        L_0x00b7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00b7
            r1.remove()
            goto L_0x00b7
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            X.0ug r4 = r9.A07
            java.lang.String r0 = r5.jabber_id
            X.2Gd r3 = new X.2Gd
            r3.<init>(r0, r2)
            r2 = 0
            r1 = 0
            r0 = 61
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r0, r1, r3)
            r4.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass129.A01():void");
    }

    public final void A02(UserJid userJid, UserJid userJid2, long j2) {
        AnonymousClass122 r2 = this.A08;
        C224718b r1 = r2.A03;
        UserJid userJid3 = userJid;
        C28381Vw A022 = r1.A02(userJid3, true);
        C16300so r9 = r2.A00;
        long j3 = j2;
        AnonymousClass1WT r8 = new AnonymousClass1WT(r9, A022, 28, j3);
        r8.A01 = userJid3;
        UserJid userJid4 = userJid2;
        r8.A00 = userJid4;
        AnonymousClass1WT r14 = new AnonymousClass1WT(r9, r1.A02(userJid4, true), 28, j3);
        r14.A01 = userJid3;
        r14.A00 = userJid4;
        C16460t6 r0 = this.A04;
        r0.A0W(r8);
        r0.A0W(r14);
        C27421Rr r5 = this.A03;
        C15810rt r4 = r5.A03;
        C15840rx A062 = r4.A06(userJid3);
        if (A062 != null) {
            r5.A00.A01(new RunnableRunnableShape1S0300000_I0_1(r5, A062, r8, 2), 18);
        }
        C15840rx A063 = r4.A06(userJid4);
        if (A063 != null) {
            r5.A00.A01(new RunnableRunnableShape1S0300000_I0_1(r5, A063, r14, 2), 18);
        }
    }

    public boolean A03() {
        return this.A00.A01() != null;
    }
}
