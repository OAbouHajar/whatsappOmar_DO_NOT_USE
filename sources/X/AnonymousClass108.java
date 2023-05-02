package X;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.108  reason: invalid class name */
public class AnonymousClass108 {
    public final C16980tz A00;
    public final C19380yL A01;
    public final AnonymousClass013 A02;
    public final C16900tq A03;
    public final AnonymousClass11I A04;
    public final AnonymousClass160 A05;
    public final C18090w8 A06;
    public final C18290wS A07;
    public final AnonymousClass1Vo A08 = AnonymousClass1Vo.A00("PaymentMethodUpdateNotification", "notification", "COMMON");
    public final C16220sf A09;
    public final C16320sq A0A;

    public AnonymousClass108(C16980tz r4, C19380yL r5, AnonymousClass013 r6, C16900tq r7, AnonymousClass11I r8, AnonymousClass160 r9, C18090w8 r10, C18290wS r11, C16220sf r12, C16320sq r13) {
        this.A00 = r4;
        this.A0A = r13;
        this.A05 = r9;
        this.A02 = r6;
        this.A07 = r11;
        this.A09 = r12;
        this.A04 = r8;
        this.A03 = r7;
        this.A06 = r10;
        this.A01 = r5;
    }

    public void A00() {
        AnonymousClass11I r2 = this.A04;
        if (!TextUtils.isEmpty(r2.A02("unread_payment_method_credential_ids"))) {
            r2.A06("unread_payment_method_credential_ids", "");
            this.A01.A03(22, (String) null);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:77|78|79|80|81) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0259 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x025e */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r17 = this;
            r7 = r17
            X.0w8 r1 = r7.A06
            r0 = 0
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x001b
            X.0tq r0 = r7.A03
            r0.A04()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x001c
            X.1Vo r1 = r7.A08
            java.lang.String r0 = "message store not yet ready"
        L_0x0018:
            r1.A06(r0)
        L_0x001b:
            return
        L_0x001c:
            monitor-enter(r7)
            X.11I r1 = r7.A04     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "unread_payment_method_credential_ids"
            java.lang.String r6 = r1.A02(r0)     // Catch:{ all -> 0x0260 }
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0260 }
            if (r2 == 0) goto L_0x0033
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0260 }
            r11.<init>()     // Catch:{ all -> 0x0260 }
            goto L_0x00df
        L_0x0033:
            java.lang.String r2 = ";"
            java.lang.String[] r2 = android.text.TextUtils.split(r6, r2)     // Catch:{ all -> 0x0260 }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ all -> 0x0260 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0260 }
            r5.<init>()     // Catch:{ all -> 0x0260 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0260 }
        L_0x0046:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0260 }
            if (r2 == 0) goto L_0x005f
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0260 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0260 }
            java.lang.String r2 = ":"
            java.lang.String[] r3 = android.text.TextUtils.split(r3, r2)     // Catch:{ all -> 0x0260 }
            r2 = 0
            r2 = r3[r2]     // Catch:{ all -> 0x0260 }
            r5.add(r2)     // Catch:{ all -> 0x0260 }
            goto L_0x0046
        L_0x005f:
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0260 }
            if (r2 != 0) goto L_0x00da
            X.160 r4 = r7.A05     // Catch:{ all -> 0x0260 }
            boolean r2 = r4.A08     // Catch:{ all -> 0x0260 }
            if (r2 == 0) goto L_0x00da
            java.lang.String r2 = "credential_id IN (\""
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0260 }
            r3.<init>(r2)     // Catch:{ all -> 0x0260 }
            java.lang.String r2 = "\",\""
            java.lang.String r2 = android.text.TextUtils.join(r2, r5)     // Catch:{ all -> 0x0260 }
            r3.append(r2)     // Catch:{ all -> 0x0260 }
            java.lang.String r2 = "\")"
            r3.append(r2)     // Catch:{ all -> 0x0260 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x0260 }
            X.1tB r2 = r4.A00     // Catch:{ all -> 0x0260 }
            X.0tf r3 = r2.get()     // Catch:{ all -> 0x0260 }
            X.0tg r8 = r3.A02     // Catch:{ all -> 0x025a }
            java.lang.String r9 = "methods"
            java.lang.String[] r10 = X.C39881tD.A00     // Catch:{ all -> 0x025a }
            r12 = 0
            java.lang.String r15 = "100"
            r14 = r12
            r13 = r12
            android.database.Cursor r5 = r8.A09(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x025a }
            if (r5 == 0) goto L_0x00d1
            int r2 = r5.getCount()     // Catch:{ all -> 0x0255 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0255 }
            r11.<init>(r2)     // Catch:{ all -> 0x0255 }
        L_0x00a4:
            boolean r2 = r5.moveToNext()     // Catch:{ all -> 0x0255 }
            if (r2 == 0) goto L_0x00b2
            X.1cl r2 = r4.A07(r5)     // Catch:{ all -> 0x0255 }
            r11.add(r2)     // Catch:{ all -> 0x0255 }
            goto L_0x00a4
        L_0x00b2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0255 }
            r4.<init>()     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "PAY: PaymentTransactionStore readPaymentMethodByCredentialIds returned: "
            r4.append(r2)     // Catch:{ all -> 0x0255 }
            int r2 = r11.size()     // Catch:{ all -> 0x0255 }
            r4.append(r2)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0255 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0255 }
            r5.close()     // Catch:{ all -> 0x025a }
            r3.close()     // Catch:{ all -> 0x0260 }
            goto L_0x00df
        L_0x00d1:
            r3.close()     // Catch:{ all -> 0x0260 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0260 }
            r11.<init>()     // Catch:{ all -> 0x0260 }
            goto L_0x00df
        L_0x00da:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0260 }
            r11.<init>()     // Catch:{ all -> 0x0260 }
        L_0x00df:
            monitor-exit(r7)
            X.0tz r2 = r7.A00
            android.content.Context r10 = r2.A00
            X.0wS r2 = r7.A07
            X.19r r2 = r2.A03()
            X.2KG r9 = r2.AEj()
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L_0x0247
            if (r9 == 0) goto L_0x0247
            X.03l r8 = X.C218415q.A00(r10)
            java.lang.String r12 = "status"
            r8.A0I = r12
            r6 = 1
            r8.A03 = r6
            r8.A0D(r6)
            r2 = 4
            r8.A02(r2)
            r5 = 2131232243(0x7f0805f3, float:1.808059E38)
            int r5 = com.obwhatsapp.yo.yo.getNIcon(r5)
            android.app.Notification r4 = r8.A07
            r4.icon = r5
            int r13 = r11.size()
            r3 = 0
            r2 = 0
            if (r13 != r6) goto L_0x0175
            java.lang.Object r13 = r11.get(r3)
            X.1cl r13 = (X.C30671cl) r13
            java.lang.String r14 = r13.A0A
            java.lang.String r1 = r1.A02(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r1, r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r15 = r0.iterator()
        L_0x013c:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r1 = r15.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ":"
            java.lang.String[] r1 = android.text.TextUtils.split(r1, r0)
            r0 = r1[r3]
            boolean r0 = android.text.TextUtils.equals(r0, r14)
            if (r0 == 0) goto L_0x013c
            r15 = r1[r6]
        L_0x0158:
            java.lang.String r1 = r9.A03(r13, r15)
            java.lang.String r14 = r9.A02(r13, r15)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0199
            X.1Vo r1 = r7.A08
            java.lang.String r0 = "no available payment notification text"
            r1.A06(r0)
            java.lang.String r0 = r13.A0A
            r7.A02(r0)
            return
        L_0x0173:
            r15 = r2
            goto L_0x0158
        L_0x0175:
            int r13 = r11.size()
            X.013 r0 = r7.A02
            r16 = r0
            r15 = 2131755246(0x7f1000ee, float:1.9141366E38)
            long r0 = (long) r13
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r3] = r13
            r13 = r16
            java.lang.String r0 = r13.A0J(r14, r15, r0)
            r8.A09(r0)
            android.app.PendingIntent r0 = r9.A00(r10, r2, r2)
            r8.A09 = r0
            goto L_0x01c0
        L_0x0199:
            r8.A0B(r1)
            r8.A09(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A09(r1)
            r8.A08(r0)
            android.app.PendingIntent r0 = r9.A00(r10, r13, r15)
            r8.A09 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x01c0
            r1 = 2131231640(0x7f080398, float:1.8079367E38)
            android.app.PendingIntent r0 = r9.A00(r10, r13, r15)
            r8.A04(r1, r14, r0)
        L_0x01c0:
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r14 < r0) goto L_0x0207
            X.03l r13 = X.C218415q.A00(r10)
            r13.A0I = r12
            r13.A03 = r6
            X.013 r15 = r7.A02
            r12 = 2131755246(0x7f1000ee, float:1.9141366E38)
            int r0 = r11.size()
            long r0 = (long) r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r16 = r6
            int r6 = r11.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r16[r3] = r6
            r3 = r16
            java.lang.String r0 = r15.A0J(r3, r12, r0)
            r13.A09(r0)
            r3 = 2131231640(0x7f080398, float:1.8079367E38)
            java.lang.String r1 = r9.A02(r2, r2)
            android.app.PendingIntent r0 = r9.A00(r10, r2, r2)
            r13.A04(r3, r1, r0)
            android.app.Notification r0 = r13.A01()
            r13.A08 = r0
            android.app.Notification r0 = r13.A07
            r0.icon = r5
        L_0x0207:
            java.lang.Class<X.2KH> r0 = X.AnonymousClass2KH.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r10, r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r3 = 22
            android.app.PendingIntent r0 = X.C42341xd.A01(r10, r3, r1, r0)
            r4.deleteIntent = r0
            r0 = 26
            if (r14 < r0) goto L_0x022a
            X.0sf r0 = r7.A09
            X.1WS r0 = r0.A03()
            X.1v2 r0 = (X.C41001v2) r0
            java.lang.String r0 = r0.A0C()
            r8.A0J = r0
        L_0x022a:
            android.app.Notification r2 = r8.A01()
            X.1Vo r1 = r7.A08     // Catch:{ SecurityException -> 0x023b }
            java.lang.String r0 = "NotificationManager/notify"
            r1.A06(r0)     // Catch:{ SecurityException -> 0x023b }
            X.0yL r0 = r7.A01     // Catch:{ SecurityException -> 0x023b }
            r0.A02(r3, r2)     // Catch:{ SecurityException -> 0x023b }
            goto L_0x025f
        L_0x023b:
            r1 = move-exception
            java.lang.String r0 = r1.toString()
            boolean r0 = X.C41971wz.A0C(r0)
            if (r0 != 0) goto L_0x001b
            throw r1
        L_0x0247:
            X.0yL r2 = r7.A01
            r1 = 22
            r0 = 0
            r2.A03(r1, r0)
            X.1Vo r1 = r7.A08
            java.lang.String r0 = "no unread payment notifications"
            goto L_0x0018
        L_0x0255:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0259 }
        L_0x0259:
            throw r0     // Catch:{ all -> 0x025a }
        L_0x025a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x025e }
        L_0x025e:
            throw r0     // Catch:{ all -> 0x0260 }
        L_0x025f:
            return
        L_0x0260:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass108.A01():void");
    }

    public final synchronized void A02(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A08.A05("removeUnreadPaymentMethodUpdate empty credentialId");
        } else {
            AnonymousClass11I r8 = this.A04;
            String A022 = r8.A02("unread_payment_method_credential_ids");
            if (A022 == null) {
                A022 = "";
            }
            String[] split = TextUtils.split(A022, ";");
            HashSet hashSet = new HashSet();
            for (String str2 : split) {
                if (!TextUtils.equals(TextUtils.split(str2, ":")[0], str)) {
                    hashSet.add(str2);
                } else {
                    AnonymousClass1Vo r2 = this.A08;
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeUnreadPaymentMethodUpdate/removed credentialId:");
                    sb.append(str);
                    r2.A06(sb.toString());
                }
            }
            r8.A06("unread_payment_method_credential_ids", TextUtils.join(";", hashSet));
        }
    }

    public synchronized void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A02((String) it.next());
        }
        if (TextUtils.isEmpty(this.A04.A02("unread_payment_method_credential_ids"))) {
            this.A01.A03(22, (String) null);
        }
    }
}
