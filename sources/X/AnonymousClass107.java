package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.107  reason: invalid class name */
public class AnonymousClass107 {
    public final C16980tz A00;
    public final C19380yL A01;
    public final AnonymousClass013 A02;
    public final C16900tq A03;
    public final C221116r A04;
    public final AnonymousClass11I A05;
    public final C18090w8 A06;
    public final C18290wS A07;
    public final AnonymousClass1Vo A08 = AnonymousClass1Vo.A00("MessagelessPaymentNotification", "notification", "COMMON");
    public final C218315p A09;
    public final C16220sf A0A;
    public final C16320sq A0B;

    public AnonymousClass107(C16980tz r4, C19380yL r5, AnonymousClass013 r6, C16900tq r7, C221116r r8, AnonymousClass11I r9, C18090w8 r10, C18290wS r11, C218315p r12, C16220sf r13, C16320sq r14) {
        this.A00 = r4;
        this.A0B = r14;
        this.A09 = r12;
        this.A02 = r6;
        this.A07 = r11;
        this.A0A = r13;
        this.A05 = r9;
        this.A03 = r7;
        this.A06 = r10;
        this.A01 = r5;
        this.A04 = r8;
    }

    public void A00() {
        AnonymousClass11I r2 = this.A05;
        if (!TextUtils.isEmpty(r2.A02("unread_messageless_transaction_ids"))) {
            r2.A06("unread_messageless_transaction_ids", "");
            this.A01.A03(17, (String) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r19 = this;
            r7 = r19
            X.0w8 r0 = r7.A06
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x001a
            X.0tq r0 = r7.A03
            r0.A04()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x001b
            X.1Vo r1 = r7.A08
            java.lang.String r0 = "message store not yet ready"
            r1.A06(r0)
        L_0x001a:
            return
        L_0x001b:
            monitor-enter(r7)
            X.11I r1 = r7.A05     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = "unread_messageless_transaction_ids"
            java.lang.String r2 = r1.A02(r0)     // Catch:{ all -> 0x0240 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x003c
            X.16r r1 = r7.A04     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = ";"
            java.lang.String[] r0 = r2.split(r0)     // Catch:{ all -> 0x0240 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0240 }
            java.util.List r9 = r1.A0a(r0)     // Catch:{ all -> 0x0240 }
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0240 }
            r9.<init>()     // Catch:{ all -> 0x0240 }
        L_0x0041:
            monitor-exit(r7)
            X.0tz r0 = r7.A00
            android.content.Context r0 = r0.A00
            r18 = r0
            boolean r0 = r9.isEmpty()
            r6 = 17
            if (r0 == 0) goto L_0x005e
            X.0yL r0 = r7.A01
            r2 = 0
            r0.A03(r6, r2)
            X.1Vo r1 = r7.A08
            java.lang.String r0 = "no unread payment notifications"
            r1.A03(r2, r0)
            return
        L_0x005e:
            X.03l r5 = X.C218415q.A00(r18)
            java.lang.String r11 = "status"
            r5.A0I = r11
            r8 = 1
            r5.A03 = r8
            r5.A0D(r8)
            r0 = 4
            r5.A02(r0)
            r4 = 2131232243(0x7f0805f3, float:1.808059E38)
            int r4 = com.obwhatsapp.yo.yo.getNIcon(r4)
            android.app.Notification r3 = r5.A07
            r3.icon = r4
            int r0 = r9.size()
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r12 = 335544320(0x14000000, float:6.4623485E-27)
            r2 = 0
            if (r0 != r8) goto L_0x01b5
            java.lang.Object r1 = r9.get(r2)
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            X.1W2 r0 = r1.A0A
            if (r0 == 0) goto L_0x0192
            X.1lz r14 = r0.A00
            if (r14 == 0) goto L_0x0192
            int r13 = r1.A03
            r0 = 9
            if (r13 != r0) goto L_0x0192
            X.16r r13 = r7.A04
            java.lang.String r0 = r14.A03
            X.1Vt r15 = r13.A0L(r0)
            X.0wS r0 = r7.A07
            r17 = r0
            X.19r r0 = r17.A03()
            X.1yJ r13 = r0.AEd()
            if (r13 == 0) goto L_0x0192
            if (r15 == 0) goto L_0x0192
            X.15p r0 = r7.A09
            java.lang.String r16 = r0.A0I(r1)
            X.0sP r14 = r13.A04
            X.0sG r0 = r13.A03
            com.whatsapp.jid.UserJid r15 = r15.A0D
            X.0sH r0 = r0.A0A(r15)
            java.lang.String r15 = r14.A08(r0)
            android.content.res.Resources r14 = r18.getResources()
            int r13 = r13.A00()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r2] = r15
            java.lang.String r13 = r14.getString(r13, r0)
            X.1yK r14 = new X.1yK
            r0 = r16
            r14.<init>(r0, r13)
        L_0x00de:
            java.lang.CharSequence r13 = r14.A00
            if (r13 == 0) goto L_0x0233
            java.lang.String r0 = r14.A01
            r5.A0A(r0)
            r5.A0B(r13)
            r5.A09(r13)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A09(r13)
            r5.A08(r0)
            X.19r r0 = r17.A03()
            java.lang.Class r13 = r0.AEv()
            android.content.Intent r14 = new android.content.Intent
            r0 = r18
            r14.<init>(r0, r13)
            java.lang.String r13 = r1.A0K
            java.lang.String r0 = "extra_transaction_id"
            android.content.Intent r14 = r14.putExtra(r0, r13)
            X.0rv r15 = r1.A0C
            boolean r13 = r1.A0Q
            java.lang.String r1 = r1.A0L
            X.1Vw r0 = new X.1Vw
            r0.<init>(r15, r1, r13)
            X.AnonymousClass1yL.A00(r14, r0)
            r14.addFlags(r12)
            r0 = r18
            android.app.PendingIntent r0 = X.C42341xd.A00(r0, r2, r14, r10)
        L_0x0126:
            r5.A09 = r0
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r10 < r0) goto L_0x0169
            X.03l r12 = X.C218415q.A00(r18)
            r12.A0I = r11
            r12.A03 = r8
            r1 = 2131889972(0x7f120f34, float:1.9414623E38)
            r0 = r18
            java.lang.String r0 = r0.getString(r1)
            r12.A0A(r0)
            X.013 r13 = r7.A02
            r11 = 2131755243(0x7f1000eb, float:1.914136E38)
            int r0 = r9.size()
            long r0 = (long) r0
            java.lang.Object[] r14 = new java.lang.Object[r8]
            int r8 = r9.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14[r2] = r8
            java.lang.String r0 = r13.A0J(r14, r11, r0)
            r12.A09(r0)
            android.app.Notification r0 = r12.A01()
            r12.A08 = r0
            android.app.Notification r0 = r12.A07
            r0.icon = r4
        L_0x0169:
            java.lang.Class<X.1yM> r1 = X.AnonymousClass1yM.class
            android.content.Intent r2 = new android.content.Intent
            r0 = r18
            r2.<init>(r0, r1)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C42341xd.A01(r0, r6, r2, r1)
            r3.deleteIntent = r0
            r0 = 26
            if (r10 < r0) goto L_0x018c
            X.0sf r0 = r7.A0A
            X.1WS r0 = r0.A03()
            X.1v2 r0 = (X.C41001v2) r0
            java.lang.String r0 = r0.A0C()
            r5.A0J = r0
        L_0x018c:
            android.app.Notification r2 = r5.A01()
            goto L_0x0219
        L_0x0192:
            X.0wS r0 = r7.A07
            r17 = r0
            X.19r r0 = r17.A03()
            X.1yN r14 = r0.ABY()
            if (r14 == 0) goto L_0x0233
            java.lang.String r13 = r14.A01(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x0233
            java.lang.String r0 = r14.A00(r1)
            X.1yK r14 = new X.1yK
            r14.<init>(r0, r13)
            goto L_0x00de
        L_0x01b5:
            r1 = 2131889972(0x7f120f34, float:1.9414623E38)
            r0 = r18
            java.lang.String r0 = r0.getString(r1)
            r5.A0A(r0)
            X.013 r15 = r7.A02
            r14 = 2131755243(0x7f1000eb, float:1.914136E38)
            int r0 = r9.size()
            long r0 = (long) r0
            java.lang.Object[] r13 = new java.lang.Object[r8]
            int r16 = r9.size()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r13[r2] = r16
            java.lang.String r0 = r15.A0J(r13, r14, r0)
            r5.A09(r0)
            java.util.Iterator r1 = r9.iterator()
        L_0x01e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x020e
            java.lang.Object r0 = r1.next()
            X.1Vt r0 = (X.AnonymousClass1Vt) r0
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x01e2
            X.0wS r0 = r7.A07
            X.19r r0 = r0.A03()
            java.lang.Class r13 = r0.AEt()
        L_0x01fe:
            android.content.Intent r1 = new android.content.Intent
            r0 = r18
            r1.<init>(r0, r13)
            r1.addFlags(r12)
            android.app.PendingIntent r0 = X.C42341xd.A00(r0, r2, r1, r10)
            goto L_0x0126
        L_0x020e:
            X.0wS r0 = r7.A07
            X.19r r0 = r0.A03()
            java.lang.Class r13 = r0.AEZ()
            goto L_0x01fe
        L_0x0219:
            X.1Vo r1 = r7.A08     // Catch:{ SecurityException -> 0x0226 }
            java.lang.String r0 = "NotificationManager/notify"
            r1.A06(r0)     // Catch:{ SecurityException -> 0x0226 }
            X.0yL r0 = r7.A01     // Catch:{ SecurityException -> 0x0226 }
            r0.A02(r6, r2)     // Catch:{ SecurityException -> 0x0226 }
            goto L_0x0232
        L_0x0226:
            r1 = move-exception
            java.lang.String r0 = r1.toString()
            boolean r0 = X.C41971wz.A0C(r0)
            if (r0 != 0) goto L_0x001a
            throw r1
        L_0x0232:
            return
        L_0x0233:
            X.1Vo r2 = r7.A08
            java.lang.String r0 = "no available payment notification text"
            r2.A06(r0)
            java.lang.String r0 = r1.A0K
            r7.A02(r0)
            return
        L_0x0240:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass107.A01():void");
    }

    public final synchronized void A02(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A08.A05("removeUnreadMessagelessPaymentTransaction empty transaction id");
        } else {
            AnonymousClass11I r6 = this.A05;
            String A022 = r6.A02("unread_messageless_transaction_ids");
            if (A022 == null) {
                A022 = "";
            }
            HashSet hashSet = new HashSet(Arrays.asList(TextUtils.split(A022, ";")));
            if (hashSet.remove(str)) {
                AnonymousClass1Vo r2 = this.A08;
                StringBuilder sb = new StringBuilder();
                sb.append("removeUnreadMessagelessPaymentTransaction/removed id:");
                sb.append(str);
                r2.A06(sb.toString());
            }
            r6.A06("unread_messageless_transaction_ids", TextUtils.join(";", hashSet));
        }
    }

    public synchronized void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A02((String) it.next());
        }
        if (TextUtils.isEmpty(this.A05.A02("unread_messageless_transaction_ids"))) {
            this.A01.A03(17, (String) null);
        }
    }
}
