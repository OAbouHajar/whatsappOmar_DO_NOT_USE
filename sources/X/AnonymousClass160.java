package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.160  reason: invalid class name */
public class AnonymousClass160 {
    public C39861tB A00;
    public AnonymousClass1GS A01;
    public final C16300so A02;
    public final C16440t3 A03;
    public final C16980tz A04;
    public final AnonymousClass173 A05;
    public final C206911f A06;
    public final C14710pd A07;
    public volatile boolean A08;

    public AnonymousClass160(C16300so r1, C16440t3 r2, C16980tz r3, AnonymousClass173 r4, C206911f r5, C14710pd r6) {
        AnonymousClass00B.A06(r3);
        this.A04 = r3;
        this.A07 = r6;
        this.A02 = r1;
        AnonymousClass00B.A06(r2);
        this.A03 = r2;
        this.A06 = r5;
        this.A05 = r4;
    }

    public static C30671cl A00(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30671cl r1 = (C30671cl) it.next();
            if (str.equals(r1.A0A)) {
                return r1;
            }
        }
        return null;
    }

    public static C30671cl A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30671cl r2 = (C30671cl) it.next();
            if (r2.A01 == 2) {
                return r2;
            }
        }
        return null;
    }

    public static final String A02(int[] iArr, int i2) {
        int length;
        if (iArr == null || (length = iArr.length) == 0 || i2 == 0) {
            return null;
        }
        String[] strArr = new String[length];
        int i3 = 0;
        do {
            StringBuilder sb = new StringBuilder("consumer_status & ");
            int i4 = i2 << 2;
            sb.append(15 << i4);
            sb.append(" = ");
            sb.append((long) (iArr[i3] << i4));
            strArr[i3] = sb.toString();
            i3++;
        } while (i3 < length);
        return TextUtils.join(" OR ", strArr);
    }

    public static final void A03(Cursor cursor, C35511m3 r4, UserJid userJid) {
        r4.A05 = userJid;
        boolean z2 = true;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("merchant")) != 1) {
            z2 = false;
        }
        r4.A0A(z2);
        r4.A06().A00 = cursor.getLong(cursor.getColumnIndexOrThrow("consumer_status"));
        r4.A08(cursor.getInt(cursor.getColumnIndexOrThrow("default_payment_type")));
        r4.A04(cursor.getString(cursor.getColumnIndexOrThrow("country_data")));
    }

    public static boolean A04(List list) {
        int A042;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C30671cl r2 = (C30671cl) it.next();
                if (r2 != null) {
                    if (TextUtils.isEmpty(r2.A0A) || (A042 = r2.A04()) == 0) {
                        Log.w("PAY: PaymentsHelper sanitizePaymentMethods got empty credential id or account type");
                        return false;
                    } else if (C39841t9.A03(r2.A09)) {
                        r2.A09(C30671cl.A02(A042));
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C35511m3 A05(com.whatsapp.jid.UserJid r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.String r7 = "jid=?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0070 }
            r1 = 0
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x0070 }
            r8[r1] = r0     // Catch:{ all -> 0x0070 }
            X.1GS r1 = r12.A01     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = X.C24561Gk.A04(r13)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = X.C39851tA.A02(r0)     // Catch:{ all -> 0x0070 }
            X.1cm r0 = X.C30681cm.A01(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0070 }
            r3 = 0
            X.19s r0 = r1.AFz(r0, r3)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x005a
            X.1m3 r3 = r0.AI5()     // Catch:{ all -> 0x0070 }
            if (r3 == 0) goto L_0x005a
            X.1tB r0 = r12.A00     // Catch:{ all -> 0x0070 }
            X.0tf r2 = r0.get()     // Catch:{ all -> 0x0070 }
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0052 }
            java.lang.String r5 = "contacts"
            java.lang.String[] r6 = X.C39871tC.A00     // Catch:{ all -> 0x0052 }
            r9 = 0
            r11 = r9
            r10 = r9
            android.database.Cursor r1 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0052 }
        L_0x003d:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            A03(r1, r3, r13)     // Catch:{ all -> 0x004b }
            goto L_0x003d
        L_0x0047:
            r1.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0057
        L_0x004b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0057:
            r2.close()     // Catch:{ all -> 0x0070 }
        L_0x005a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r1.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "PAY: PaymentStore readContactInfo returned: "
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            r1.append(r3)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0070 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0070 }
            monitor-exit(r12)
            return r3
        L_0x0070:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A05(com.whatsapp.jid.UserJid):X.1m3");
    }

    public C30671cl A06() {
        for (C30671cl r2 : A0B()) {
            if (r2.A01 == 2) {
                return r2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: X.1tE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.1tG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: X.1tG} */
    /* JADX WARNING: type inference failed for: r2v15, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v17, types: [java.util.LinkedHashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C30671cl A07(android.database.Cursor r30) {
        /*
            r29 = this;
            java.lang.String r0 = "country"
            r5 = r30
            int r0 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r4 = r5.getString(r0)
            java.lang.String r0 = "type"
            int r0 = r5.getColumnIndexOrThrow(r0)
            int r18 = r5.getInt(r0)
            java.lang.String r0 = "credential_id"
            int r0 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r15 = r5.getString(r0)
            X.1cm r14 = X.C30681cm.A00(r4)
            java.lang.String r0 = "country_data"
            int r0 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r3 = r5.getString(r0)
            java.lang.String r0 = "readable_name"
            int r0 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r11 = r5.getString(r0)
            java.lang.String r0 = "issuer_name"
            int r0 = r5.getColumnIndexOrThrow(r0)
            java.lang.String r10 = r5.getString(r0)
            java.lang.String r0 = "subtype"
            int r0 = r5.getColumnIndexOrThrow(r0)
            int r23 = r5.getInt(r0)
            java.lang.String r0 = "creation_ts"
            int r0 = r5.getColumnIndexOrThrow(r0)
            int r0 = r5.getInt(r0)
            long r0 = (long) r0
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            java.lang.String r2 = "updated_ts"
            int r2 = r5.getColumnIndexOrThrow(r2)
            int r2 = r5.getInt(r2)
            long r6 = (long) r2
            long r6 = r6 * r12
            java.lang.String r2 = "debit_mode"
            int r2 = r5.getColumnIndexOrThrow(r2)
            int r19 = r5.getInt(r2)
            java.lang.String r2 = "credit_mode"
            int r2 = r5.getColumnIndexOrThrow(r2)
            int r20 = r5.getInt(r2)
            java.lang.String r2 = "p2m_debit_mode"
            int r2 = r5.getColumnIndexOrThrow(r2)
            int r21 = r5.getInt(r2)
            java.lang.String r2 = "p2m_credit_mode"
            int r2 = r5.getColumnIndexOrThrow(r2)
            int r22 = r5.getInt(r2)
            java.lang.String r2 = "icon"
            int r2 = r5.getColumnIndexOrThrow(r2)
            byte[] r9 = r5.getBlob(r2)
            r2 = 0
            r8 = r29
            switch(r18) {
                case 1: goto L_0x00a2;
                case 2: goto L_0x00cf;
                case 3: goto L_0x00fd;
                case 4: goto L_0x00a2;
                case 5: goto L_0x0150;
                case 6: goto L_0x00a2;
                case 7: goto L_0x00a2;
                case 8: goto L_0x00a2;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            return r2
        L_0x00a2:
            X.1GS r5 = r8.A01
            X.19s r4 = r5.AFz(r4, r2)
            if (r4 == 0) goto L_0x00cd
            X.1tE r2 = r4.AI4()
            if (r2 == 0) goto L_0x00cd
            r2.A04(r3)
            X.1lh r3 = r2.A08
            if (r3 != 0) goto L_0x00ca
            r3 = 0
        L_0x00b8:
            java.lang.String r3 = (java.lang.String) r3
        L_0x00ba:
            X.1lr r13 = new X.1lr
            r17 = r11
            r16 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r13.A05 = r0
            r13.A08 = r2
            r13.A0D = r9
            return r13
        L_0x00ca:
            java.lang.Object r3 = r3.A00
            goto L_0x00b8
        L_0x00cd:
            r3 = 0
            goto L_0x00ba
        L_0x00cf:
            X.1GS r5 = r8.A01
            X.19s r4 = r5.AFz(r4, r2)
            if (r4 == 0) goto L_0x00e0
            X.1tG r2 = r4.AI3()
            if (r2 == 0) goto L_0x00e0
            r2.A04(r3)
        L_0x00e0:
            X.1m4 r3 = new X.1m4
            r16 = r3
            r17 = r14
            r18 = r19
            r19 = r20
            r20 = r0
            r22 = r6
            r16.<init>(r17, r18, r19, r20, r22)
            r3.A0A = r15
            r3.A09(r11)
            r3.A0B = r10
            r3.A0D = r9
            r3.A08 = r2
            return r3
        L_0x00fd:
            java.lang.String r0 = "balance_1000"
            int r0 = r5.getColumnIndexOrThrow(r0)
            long r0 = r5.getLong(r0)
            java.math.BigDecimal r6 = new java.math.BigDecimal
            r6.<init>(r0)
            r0 = -3
            java.math.BigDecimal r25 = r6.scaleByPowerOfTen(r0)
            java.lang.String r0 = "balance_ts"
            int r0 = r5.getColumnIndexOrThrow(r0)
            int r1 = r5.getInt(r0)
            X.1GS r0 = r8.A01
            X.19s r0 = r0.AFz(r4, r2)
            if (r0 == 0) goto L_0x014e
            X.1tH r0 = r0.AI8()
            if (r0 == 0) goto L_0x0130
            r0.A04(r3)
            java.util.LinkedHashSet r2 = r0.A08()
        L_0x0130:
            X.1lp r3 = new X.1lp
            r21 = r3
            r22 = r14
            r23 = r15
            r24 = r11
            r26 = r2
            r27 = r19
            r28 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r3.A08 = r0
            r3.A0B = r10
            long r0 = (long) r1
            long r0 = r0 * r12
            r3.A00 = r0
            r3.A0D = r9
            return r3
        L_0x014e:
            r0 = r2
            goto L_0x0130
        L_0x0150:
            X.1GS r0 = r8.A01
            X.19s r0 = r0.AFz(r4, r2)
            if (r0 == 0) goto L_0x0182
            X.1tI r4 = r0.AI6()
            if (r4 == 0) goto L_0x0185
            r4.A04(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x016d
            java.util.List r0 = r8.A0D()
            r4.A0C = r0
        L_0x016d:
            java.lang.String r3 = r4.A08
            boolean r1 = r4.A0D
            boolean r0 = r4.A0E
            java.lang.String r2 = r4.A07
        L_0x0175:
            X.1lw r5 = new X.1lw
            r6 = r14
            r7 = r4
            r8 = r15
            r9 = r2
            r10 = r3
            r12 = r1
            r13 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x0182:
            r3 = r2
            r4 = r2
            goto L_0x0186
        L_0x0185:
            r3 = r2
        L_0x0186:
            r1 = 0
            r0 = 0
            goto L_0x0175
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A07(android.database.Cursor):X.1cl");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0034 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0034=Splitter:B:16:0x0034, B:8:0x0027=Splitter:B:8:0x0027} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30671cl A08(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r6 = "credential_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]
            r0 = 0
            r7[r0] = r12
            X.1tB r0 = r11.A00
            X.0tf r2 = r0.get()
            X.0tg r3 = r2.A02     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "methods"
            java.lang.String[] r5 = X.C39881tD.A00     // Catch:{ all -> 0x0035 }
            r8 = 0
            r10 = r8
            r9 = r8
            android.database.Cursor r1 = r3.A09(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0035 }
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0026
            X.1cl r0 = r11.A07(r1)     // Catch:{ all -> 0x002e }
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r1.close()     // Catch:{ all -> 0x0035 }
            r2.close()
            return r0
        L_0x002e:
            r0 = move-exception
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A08(java.lang.String):X.1cl");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A09() {
        /*
            r12 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.1tB r0 = r12.A00
            X.0tf r2 = r0.get()
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "methods"
            java.lang.String[] r6 = X.C39881tD.A00     // Catch:{ all -> 0x0046 }
            java.lang.String r7 = "type = ?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0046 }
            r1 = 0
            r0 = 5
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0046 }
            r8[r1] = r0     // Catch:{ all -> 0x0046 }
            r9 = 0
            r11 = r9
            r10 = r9
            android.database.Cursor r1 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0046 }
        L_0x0026:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0038
            X.1cl r0 = r12.A07(r1)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0026
            X.1lw r0 = (X.C35441lw) r0     // Catch:{ all -> 0x003f }
            r3.add(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0026
        L_0x0038:
            r1.close()     // Catch:{ all -> 0x0046 }
            r2.close()
            return r3
        L_0x003f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A09():java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0A() {
        /*
            r12 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.1tB r0 = r12.A00
            X.0tf r2 = r0.get()
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = "methods"
            java.lang.String[] r6 = X.C39881tD.A00     // Catch:{ all -> 0x0039 }
            r7 = 0
            java.lang.String r10 = "debit_mode DESC"
            r9 = r7
            r11 = r7
            r8 = r7
            android.database.Cursor r1 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0039 }
        L_0x001b:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002b
            X.1cl r0 = r12.A07(r1)     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x001b
            r3.add(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x001b
        L_0x002b:
            r1.close()     // Catch:{ all -> 0x0039 }
            r2.close()
            return r3
        L_0x0032:
            r0 = move-exception
            if (r1 == 0) goto L_0x0038
            r1.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A0A():java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0B() {
        /*
            r12 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.1tB r0 = r12.A00
            X.0tf r2 = r0.get()
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = "methods"
            java.lang.String[] r6 = X.C39881tD.A00     // Catch:{ all -> 0x0045 }
            java.lang.String r7 = "type != ?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0045 }
            r1 = 0
            r0 = 5
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0045 }
            r8[r1] = r0     // Catch:{ all -> 0x0045 }
            r9 = 0
            java.lang.String r10 = "debit_mode DESC"
            r11 = r9
            android.database.Cursor r1 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0045 }
        L_0x0027:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0037
            X.1cl r0 = r12.A07(r1)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0027
            r3.add(r0)     // Catch:{ all -> 0x003e }
            goto L_0x0027
        L_0x0037:
            r1.close()     // Catch:{ all -> 0x0045 }
            r2.close()
            return r3
        L_0x003e:
            r0 = move-exception
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A0B():java.util.List");
    }

    public synchronized List A0C() {
        return A0E((int[]) null, 0);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List A0D() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.1tB r0 = r2.A00     // Catch:{ all -> 0x0015 }
            X.0tf r1 = r0.get()     // Catch:{ all -> 0x0015 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0010 }
            r1.close()     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)
            return r0
        L_0x0010:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0014 }
        L_0x0014:
            throw r0     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A0D():java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|35|36|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List A0E(int[] r15, int r16) {
        /*
            r14 = this;
            r4 = r14
            monitor-enter(r4)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00a3 }
            r5.<init>()     // Catch:{ all -> 0x00a3 }
            X.1tB r0 = r14.A00     // Catch:{ all -> 0x00a3 }
            X.0tf r1 = r0.get()     // Catch:{ all -> 0x00a3 }
            X.0tg r6 = r1.A02     // Catch:{ all -> 0x009e }
            java.lang.String r7 = "contacts"
            java.lang.String[] r8 = X.C39871tC.A00     // Catch:{ all -> 0x009e }
            r0 = r16
            java.lang.String r9 = A02(r15, r0)     // Catch:{ all -> 0x009e }
            r10 = 0
            r12 = r10
            r13 = r10
            r11 = r10
            android.database.Cursor r3 = r6.A09(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x009e }
        L_0x0021:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0097 }
            r7 = 0
            if (r0 == 0) goto L_0x0078
            java.lang.String r8 = "jid"
            int r0 = r3.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0097 }
            com.whatsapp.jid.UserJid r6 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0055
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r2.<init>()     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "PAY: PaymentTransactionStore/readContactInfos: Skipping Jid because it is not valid: "
            r2.append(r0)     // Catch:{ all -> 0x0097 }
            int r0 = r3.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0097 }
            r2.append(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0097 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0097 }
            goto L_0x0021
        L_0x0055:
            X.1GS r2 = r14.A01     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = X.C24561Gk.A04(r6)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = X.C39851tA.A02(r0)     // Catch:{ all -> 0x0097 }
            X.1cm r0 = X.C30681cm.A01(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0097 }
            X.19s r0 = r2.AFz(r0, r10)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x006f
            X.1m3 r7 = r0.AI5()     // Catch:{ all -> 0x0097 }
        L_0x006f:
            if (r7 == 0) goto L_0x0021
            A03(r3, r7, r6)     // Catch:{ all -> 0x0097 }
            r5.add(r7)     // Catch:{ all -> 0x0097 }
            goto L_0x0021
        L_0x0078:
            r3.close()     // Catch:{ all -> 0x009e }
            r1.close()     // Catch:{ all -> 0x00a3 }
            if (r15 == 0) goto L_0x0095
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00a3 }
            r3.<init>()     // Catch:{ all -> 0x00a3 }
            int r2 = r15.length     // Catch:{ all -> 0x00a3 }
            r1 = 0
        L_0x0087:
            if (r1 >= r2) goto L_0x0095
            r0 = r15[r1]     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            r3.add(r0)     // Catch:{ all -> 0x00a3 }
            int r1 = r1 + 1
            goto L_0x0087
        L_0x0095:
            monitor-exit(r4)
            return r5
        L_0x0097:
            r0 = move-exception
            if (r3 == 0) goto L_0x009d
            r3.close()     // Catch:{ all -> 0x009d }
        L_0x009d:
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A0E(int[], int):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.AnonymousClass1W2 r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r7 = "tmp_id=?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]
            r0 = 0
            r8[r0] = r14
            X.1tB r0 = r12.A00
            X.0tf r3 = r0.get()
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x005b }
            java.lang.String r5 = "tmp_transactions"
            java.lang.String[] r6 = X.C39941tJ.A00     // Catch:{ all -> 0x005b }
            r9 = 0
            r11 = r9
            r10 = r9
            android.database.Cursor r6 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005b }
        L_0x001d:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "tmp_metadata"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = r6.getString(r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "tmp_ts"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0054 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0054 }
            long r1 = (long) r0     // Catch:{ all -> 0x0054 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r4
            r13.A0V(r14)     // Catch:{ all -> 0x0054 }
            r13.A04(r7)     // Catch:{ all -> 0x0054 }
            r4 = -1
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
            r13.A0Q(r1)     // Catch:{ all -> 0x0054 }
            goto L_0x001d
        L_0x004d:
            r6.close()     // Catch:{ all -> 0x005b }
            r3.close()
            return
        L_0x0054:
            r0 = move-exception
            if (r6 == 0) goto L_0x005a
            r6.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A0F(X.1W2, java.lang.String):void");
    }

    public synchronized void A0G(UserJid userJid) {
        C35511m3 A052;
        if (this.A01 != null) {
            String str = C30681cm.A01(C39851tA.A02(C24561Gk.A04(userJid))).A03;
            if (!TextUtils.isEmpty(str) && !str.equals("UNSET") && (A052 = A05(userJid)) != null && A052.A05 != null) {
                A052.A01 = this.A03.A00() + TimeUnit.DAYS.toMillis(1);
                A0I(A052);
            }
        }
    }

    public boolean A0H() {
        boolean z2;
        C16800tf A022 = this.A00.A02();
        try {
            int A012 = A022.A02.A01("methods", (String) null, (String[]) null);
            if (A012 >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentStore removeAllPaymentMethods deleted num rows: ");
                sb.append(A012);
                Log.i(sb.toString());
                z2 = true;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PAY: PaymentStore removeAllPaymentMethods could not delete all rows: ");
                sb2.append(A012);
                Log.w(sb2.toString());
                z2 = false;
            }
            A022.close();
            return z2;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:40|41|42|43|44) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00dc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0I(X.C35511m3 r18) {
        /*
            r17 = this;
            r16 = r17
            monitor-enter(r16)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00e2 }
            r6.<init>()     // Catch:{ all -> 0x00e2 }
            r0 = r18
            r6.add(r0)     // Catch:{ all -> 0x00e2 }
            r0 = r16
            X.1tB r0 = r0.A00     // Catch:{ all -> 0x00e2 }
            X.0tf r9 = r0.A02()     // Catch:{ all -> 0x00e2 }
            X.1cj r15 = r9.A00()     // Catch:{ all -> 0x00dd }
            java.lang.String r10 = "contacts"
            java.util.Iterator r14 = r6.iterator()     // Catch:{ all -> 0x00d8 }
            r3 = 0
        L_0x0021:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x00d8 }
            r5 = 1
            r13 = 0
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r7 = r14.next()     // Catch:{ all -> 0x00d8 }
            X.1m3 r7 = (X.C35511m3) r7     // Catch:{ all -> 0x00d8 }
            com.whatsapp.jid.UserJid r11 = r7.A05     // Catch:{ all -> 0x00d8 }
            if (r11 == 0) goto L_0x0021
            r0 = r16
            X.1m3 r2 = r0.A05(r11)     // Catch:{ all -> 0x00d8 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x00d8 }
            r8.<init>()     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x00d8 }
            r8.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "country_data"
            java.lang.String r0 = r7.A03()     // Catch:{ all -> 0x00d8 }
            r8.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r12 = "merchant"
            boolean r1 = r7.A0B()     // Catch:{ all -> 0x00d8 }
            r0 = 0
            if (r1 == 0) goto L_0x005a
            r0 = 1
        L_0x005a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r8.put(r12, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r12 = "consumer_status"
            X.1t8 r0 = r7.A06()     // Catch:{ all -> 0x00d8 }
            long r0 = r0.A00     // Catch:{ all -> 0x00d8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r8.put(r12, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "default_payment_type"
            int r0 = r7.A05()     // Catch:{ all -> 0x00d8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r8.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            if (r2 == 0) goto L_0x0095
            com.whatsapp.jid.UserJid r0 = r2.A05     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0095
            X.0tg r7 = r9.A02     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "jid=?"
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x00d8 }
            r1[r13] = r0     // Catch:{ all -> 0x00d8 }
            int r0 = r7.A00(r10, r8, r2, r1)     // Catch:{ all -> 0x00d8 }
            long r7 = (long) r0     // Catch:{ all -> 0x00d8 }
            goto L_0x009b
        L_0x0095:
            X.0tg r0 = r9.A02     // Catch:{ all -> 0x00d8 }
            long r7 = r0.A02(r8, r10)     // Catch:{ all -> 0x00d8 }
        L_0x009b:
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a2
            r5 = 0
        L_0x00a2:
            long r0 = (long) r5     // Catch:{ all -> 0x00d8 }
            long r3 = r3 + r0
            goto L_0x0021
        L_0x00a6:
            r15.A00()     // Catch:{ all -> 0x00d8 }
            r15.close()     // Catch:{ all -> 0x00dd }
            r9.close()     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "PAY: PaymentStore storeContacts stored: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e2 }
            r1.append(r3)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = " rows with contacts size: "
            r1.append(r0)     // Catch:{ all -> 0x00e2 }
            int r0 = r6.size()     // Catch:{ all -> 0x00e2 }
            r1.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e2 }
            int r0 = r6.size()     // Catch:{ all -> 0x00e2 }
            long r1 = (long) r0     // Catch:{ all -> 0x00e2 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d6
            r5 = 0
        L_0x00d6:
            monitor-exit(r16)
            return r5
        L_0x00d8:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A0I(X.1m3):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r4 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011d, code lost:
        if (r1 != false) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0J(com.whatsapp.jid.UserJid r13, java.lang.Boolean r14, java.lang.String r15, java.util.HashMap r16, java.util.HashMap r17) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.lang.String r0 = X.C24561Gk.A04(r13)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = X.C39851tA.A02(r0)     // Catch:{ all -> 0x0124 }
            X.1cm r0 = X.C30681cm.A01(r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0124 }
            X.1GS r0 = r12.A01     // Catch:{ all -> 0x0124 }
            r11 = 0
            if (r0 == 0) goto L_0x0122
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0122
            java.lang.String r0 = "UNSET"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0122
            X.1m3 r4 = r12.A05(r13)     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x002c
            com.whatsapp.jid.UserJid r0 = r4.A05     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x004e
        L_0x002c:
            X.1GS r2 = r12.A01     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = X.C24561Gk.A04(r13)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = X.C39851tA.A02(r0)     // Catch:{ all -> 0x0124 }
            X.1cm r0 = X.C30681cm.A01(r0)     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0124 }
            r0 = 0
            X.19s r0 = r2.AFz(r1, r0)     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x004c
            X.1m3 r4 = r0.AI5()     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x0122
            r4.A05 = r13     // Catch:{ all -> 0x0124 }
            goto L_0x004e
        L_0x004c:
            if (r4 == 0) goto L_0x0122
        L_0x004e:
            r11 = 1
            if (r14 == 0) goto L_0x006d
            boolean r0 = r4.A07     // Catch:{ all -> 0x0124 }
            boolean r1 = r14.booleanValue()     // Catch:{ all -> 0x0124 }
            if (r0 != r1) goto L_0x0061
            java.lang.String r0 = r4.A06     // Catch:{ all -> 0x0124 }
            boolean r0 = X.C34901l3.A00(r0, r15)     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x006d
        L_0x0061:
            r4.A0A(r1)     // Catch:{ all -> 0x0124 }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x006f
            r4.A06 = r15     // Catch:{ all -> 0x0124 }
            goto L_0x006f
        L_0x006d:
            r1 = 0
            goto L_0x0070
        L_0x006f:
            r1 = 1
        L_0x0070:
            if (r16 == 0) goto L_0x00c9
            boolean r0 = r16.isEmpty()     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x00c9
            java.util.Set r0 = r16.entrySet()     // Catch:{ all -> 0x0124 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0124 }
        L_0x0080:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0124 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0124 }
            java.lang.Object r6 = r0.getKey()     // Catch:{ all -> 0x0124 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0124 }
            int r1 = r6.intValue()     // Catch:{ all -> 0x0124 }
            java.lang.Object r9 = r0.getValue()     // Catch:{ all -> 0x0124 }
            X.01Q r9 = (X.AnonymousClass01Q) r9     // Catch:{ all -> 0x0124 }
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0124 }
            int r8 = X.C35511m3.A01(r0)     // Catch:{ all -> 0x0124 }
            X.1t8 r7 = r4.A06()     // Catch:{ all -> 0x0124 }
            int r5 = r1 << 2
            r2 = 15
            long r2 = r2 << r5
            r0 = -1
            long r2 = r2 ^ r0
            long r0 = r7.A00     // Catch:{ all -> 0x0124 }
            long r2 = r2 & r0
            int r8 = r8 << r5
            long r0 = (long) r8     // Catch:{ all -> 0x0124 }
            long r0 = r0 | r2
            r7.A00 = r0     // Catch:{ all -> 0x0124 }
            java.lang.Object r1 = r9.A01     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0124 }
            X.1t8 r0 = r4.A06()     // Catch:{ all -> 0x0124 }
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0124 }
            r0.put(r6, r1)     // Catch:{ all -> 0x0124 }
            goto L_0x0080
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            if (r17 == 0) goto L_0x011c
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x011c
            java.util.Set r0 = r17.entrySet()     // Catch:{ all -> 0x0124 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0124 }
        L_0x00d9:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0124 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0124 }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x0124 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0124 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0124 }
            X.01Q r2 = (X.AnonymousClass01Q) r2     // Catch:{ all -> 0x0124 }
            java.lang.Object r1 = r2.A00     // Catch:{ all -> 0x0124 }
            if (r1 == 0) goto L_0x00d9
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0124 }
            X.1tK r0 = r4.A03     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0102
            X.1tK r0 = new X.1tK     // Catch:{ all -> 0x0124 }
            r0.<init>()     // Catch:{ all -> 0x0124 }
            r4.A03 = r0     // Catch:{ all -> 0x0124 }
        L_0x0102:
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x0124 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0124 }
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0124 }
            X.1tK r0 = r4.A03     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x0116
            X.1tK r0 = new X.1tK     // Catch:{ all -> 0x0124 }
            r0.<init>()     // Catch:{ all -> 0x0124 }
            r4.A03 = r0     // Catch:{ all -> 0x0124 }
        L_0x0116:
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0124 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0124 }
            goto L_0x00d9
        L_0x011c:
            r11 = r1
            if (r1 == 0) goto L_0x0122
        L_0x011f:
            r12.A0I(r4)     // Catch:{ all -> 0x0124 }
        L_0x0122:
            monitor-exit(r12)
            return r11
        L_0x0124:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A0J(com.whatsapp.jid.UserJid, java.lang.Boolean, java.lang.String, java.util.HashMap, java.util.HashMap):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01fa */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6 A[Catch:{ all -> 0x01f6, all -> 0x01fa, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d5 A[Catch:{ all -> 0x01f6, all -> 0x01fa, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0137 A[Catch:{ all -> 0x01f6, all -> 0x01fa, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0156 A[Catch:{ all -> 0x01f6, all -> 0x01fa, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015f A[Catch:{ all -> 0x01f6, all -> 0x01fa, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0168 A[Catch:{ all -> 0x01f6, all -> 0x01fa, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0176 A[Catch:{ all -> 0x01f6, all -> 0x01fa, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0180 A[Catch:{ all -> 0x01f6, all -> 0x01fa, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a3 A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:65:0x01b4=Splitter:B:65:0x01b4, B:87:0x01fa=Splitter:B:87:0x01fa} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(java.util.List r31) {
        /*
            r30 = this;
            r24 = 0
            r29 = r31
            int r0 = r29.size()
            if (r0 > 0) goto L_0x001e
            java.lang.String r0 = "PAY: PaymentStore storePaymentMethods got newMethods: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r29
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r24
        L_0x001e:
            r0 = r30
            java.util.List r23 = r0.A0A()
            X.1tB r0 = r0.A00
            X.0tf r12 = r0.A02()
            X.1cj r22 = r12.A00()     // Catch:{ all -> 0x01fb }
            java.util.Iterator r21 = r29.iterator()     // Catch:{ all -> 0x01f6 }
            r20 = 0
        L_0x0034:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r13 = r21.next()     // Catch:{ all -> 0x01f6 }
            X.1cl r13 = (X.C30671cl) r13     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r13.A0A     // Catch:{ all -> 0x01f6 }
            r19 = r0
            X.1cm r0 = r13.A07     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x01f6 }
            r28 = r0
            X.1lh r14 = r13.A09     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r13.A0B     // Catch:{ all -> 0x01f6 }
            r27 = r0
            long r4 = r13.A05     // Catch:{ all -> 0x01f6 }
            long r2 = r13.A06     // Catch:{ all -> 0x01f6 }
            X.1tF r0 = r13.A08     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r11 = r0.A03()     // Catch:{ all -> 0x01f6 }
            goto L_0x005e
        L_0x005d:
            r11 = 0
        L_0x005e:
            if (r19 == 0) goto L_0x0181
            if (r14 == 0) goto L_0x0181
            int r10 = r13.A04()     // Catch:{ all -> 0x01f6 }
            int r0 = r13.A01     // Catch:{ all -> 0x01f6 }
            r26 = r0
            int r0 = r13.A00     // Catch:{ all -> 0x01f6 }
            r25 = r0
            r1 = 3
            r17 = 0
            r0 = 1
            if (r10 == r0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            r0 = r13
            X.1lr r0 = (X.C35391lr) r0     // Catch:{ all -> 0x01f6 }
            int r9 = r0.A01     // Catch:{ all -> 0x01f6 }
            r6 = 0
            goto L_0x008f
        L_0x007d:
            if (r10 == r1) goto L_0x0091
            r0 = 4
            if (r10 == r0) goto L_0x0075
            r0 = 6
            if (r10 == r0) goto L_0x0075
            r0 = 7
            if (r10 == r0) goto L_0x0075
            r0 = 8
            if (r10 == r0) goto L_0x0075
            r6 = 0
            r9 = 0
        L_0x008f:
            r8 = 0
            goto L_0x00a5
        L_0x0091:
            r1 = r13
            X.1lp r1 = (X.C35371lp) r1     // Catch:{ all -> 0x01f6 }
            X.1Vy r0 = r1.A01     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x0132
            boolean r0 = r0.A02()     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x0132
            X.1Vy r0 = r1.A01     // Catch:{ all -> 0x01f6 }
            java.math.BigDecimal r8 = r0.A00     // Catch:{ all -> 0x01f6 }
        L_0x00a2:
            long r6 = r1.A00     // Catch:{ all -> 0x01f6 }
            r9 = 0
        L_0x00a5:
            r1 = r19
            r0 = r23
            X.1cl r16 = A00(r1, r0)     // Catch:{ all -> 0x01f6 }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x01f6 }
            r1.<init>()     // Catch:{ all -> 0x01f6 }
            java.lang.String r15 = "credential_id"
            r0 = r19
            r1.put(r15, r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r15 = "country"
            r0 = r28
            r1.put(r15, r0)     // Catch:{ all -> 0x01f6 }
            boolean r0 = X.C39841t9.A03(r14)     // Catch:{ all -> 0x01f6 }
            if (r0 != 0) goto L_0x00cf
            java.lang.Object r14 = r14.A00     // Catch:{ all -> 0x01f6 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "readable_name"
            r1.put(r0, r14)     // Catch:{ all -> 0x01f6 }
        L_0x00cf:
            boolean r0 = android.text.TextUtils.isEmpty(r27)     // Catch:{ all -> 0x01f6 }
            if (r0 != 0) goto L_0x00dc
            java.lang.String r14 = "issuer_name"
            r0 = r27
            r1.put(r14, r0)     // Catch:{ all -> 0x01f6 }
        L_0x00dc:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "type"
            r1.put(r0, r14)     // Catch:{ all -> 0x01f6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "subtype"
            r1.put(r0, r9)     // Catch:{ all -> 0x01f6 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r14
            int r0 = (int) r4     // Catch:{ all -> 0x01f6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "creation_ts"
            r1.put(r0, r4)     // Catch:{ all -> 0x01f6 }
            long r2 = r2 / r14
            int r0 = (int) r2     // Catch:{ all -> 0x01f6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "updated_ts"
            r1.put(r0, r2)     // Catch:{ all -> 0x01f6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "debit_mode"
            r1.put(r0, r2)     // Catch:{ all -> 0x01f6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "credit_mode"
            r1.put(r0, r2)     // Catch:{ all -> 0x01f6 }
            int r0 = r13.A03     // Catch:{ all -> 0x01f6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "p2m_debit_mode"
            r1.put(r0, r2)     // Catch:{ all -> 0x01f6 }
            int r0 = r13.A02     // Catch:{ all -> 0x01f6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "p2m_credit_mode"
            r1.put(r0, r2)     // Catch:{ all -> 0x01f6 }
            goto L_0x0135
        L_0x0132:
            r8 = 0
            goto L_0x00a2
        L_0x0135:
            if (r8 == 0) goto L_0x0154
            r0 = 3
            java.math.BigDecimal r0 = r8.scaleByPowerOfTen(r0)     // Catch:{ all -> 0x01f6 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x01f6 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "balance_1000"
            r1.put(r0, r2)     // Catch:{ all -> 0x01f6 }
            long r6 = r6 / r14
            int r0 = (int) r6     // Catch:{ all -> 0x01f6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = "balance_ts"
            r1.put(r0, r2)     // Catch:{ all -> 0x01f6 }
        L_0x0154:
            if (r11 == 0) goto L_0x015b
            java.lang.String r0 = "country_data"
            r1.put(r0, r11)     // Catch:{ all -> 0x01f6 }
        L_0x015b:
            byte[] r2 = r13.A0D     // Catch:{ all -> 0x01f6 }
            if (r2 == 0) goto L_0x0164
            java.lang.String r0 = "icon"
            r1.put(r0, r2)     // Catch:{ all -> 0x01f6 }
        L_0x0164:
            X.0tg r4 = r12.A02     // Catch:{ all -> 0x01f6 }
            if (r16 == 0) goto L_0x0176
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x01f6 }
            r3[r24] = r19     // Catch:{ all -> 0x01f6 }
            java.lang.String r2 = "methods"
            java.lang.String r0 = "credential_id=?"
            int r2 = r4.A00(r2, r1, r0, r3)     // Catch:{ all -> 0x01f6 }
            goto L_0x017e
        L_0x0176:
            java.lang.String r0 = "methods"
            long r0 = r4.A02(r1, r0)     // Catch:{ all -> 0x01f6 }
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
        L_0x017e:
            if (r2 < 0) goto L_0x01a3
            goto L_0x0183
        L_0x0181:
            r2 = 0
            goto L_0x0195
        L_0x0183:
            r2 = 1
            java.lang.String r1 = "PAY: PaymentStore storePaymentMethods stored account type: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f6 }
            r0.append(r10)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01f6 }
        L_0x0195:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x01b4
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f6 }
            r20 = r20 | r0
            goto L_0x0034
        L_0x01a3:
            java.lang.String r1 = "PAY: PaymentStore storePaymentMethods could not store: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f6 }
            r0.append(r10)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f6 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01f6 }
        L_0x01b4:
            r22.close()     // Catch:{ all -> 0x01fb }
            r12.close()
            return r24
        L_0x01bb:
            java.util.Iterator r7 = r23.iterator()     // Catch:{ all -> 0x01f6 }
        L_0x01bf:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01f6 }
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x01f6 }
            X.1cl r6 = (X.C30671cl) r6     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = r6.A0A     // Catch:{ all -> 0x01f6 }
            r0 = r29
            X.1cl r0 = A00(r1, r0)     // Catch:{ all -> 0x01f6 }
            if (r0 != 0) goto L_0x01bf
            X.0tg r5 = r12.A02     // Catch:{ all -> 0x01f6 }
            java.lang.String r4 = "methods"
            java.lang.String r3 = "credential_id=?"
            r2 = 1
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r6.A0A     // Catch:{ all -> 0x01f6 }
            r1[r24] = r0     // Catch:{ all -> 0x01f6 }
            int r0 = r5.A01(r4, r3, r1)     // Catch:{ all -> 0x01f6 }
            if (r0 > 0) goto L_0x01e9
            r2 = 0
        L_0x01e9:
            r20 = r20 | r2
            goto L_0x01bf
        L_0x01ec:
            r22.A00()     // Catch:{ all -> 0x01f6 }
            r22.close()     // Catch:{ all -> 0x01fb }
            r12.close()
            return r20
        L_0x01f6:
            r0 = move-exception
            r22.close()     // Catch:{ all -> 0x01fa }
        L_0x01fa:
            throw r0     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x01ff }
        L_0x01ff:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass160.A0K(java.util.List):boolean");
    }
}
