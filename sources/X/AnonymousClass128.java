package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.128  reason: invalid class name */
public class AnonymousClass128 {
    public final C16180sb A00;
    public final C115945qZ A01;
    public final C16440t3 A02;
    public final C16980tz A03;
    public final AnonymousClass126 A04;
    public final C16920ts A05;
    public final C16460t6 A06;
    public final AnonymousClass17E A07;
    public final C216314v A08;
    public final C16480t8 A09;
    public final C002501a A0A;
    public final C19150xq A0B;
    public final C19650ym A0C;
    public final C16900tq A0D;
    public final AnonymousClass11I A0E;
    public final AnonymousClass184 A0F;
    public final AnonymousClass11G A0G;
    public final C17020u3 A0H;
    public final AtomicBoolean A0I = new AtomicBoolean(false);

    public AnonymousClass128(C16180sb r3, C115945qZ r4, C16440t3 r5, C16980tz r6, AnonymousClass126 r7, C16920ts r8, C16460t6 r9, AnonymousClass17E r10, C216314v r11, C16480t8 r12, C002501a r13, C19150xq r14, C19650ym r15, C16900tq r16, AnonymousClass11I r17, AnonymousClass184 r18, AnonymousClass11G r19, C17020u3 r20) {
        this.A02 = r5;
        this.A08 = r11;
        this.A05 = r8;
        this.A03 = r6;
        this.A00 = r3;
        this.A0G = r19;
        this.A07 = r10;
        this.A0A = r13;
        this.A06 = r9;
        this.A0B = r14;
        this.A09 = r12;
        this.A0E = r17;
        this.A04 = r7;
        this.A0D = r16;
        this.A0F = r18;
        this.A0H = r20;
        this.A01 = r4;
        this.A0C = r15;
    }

    public C16740tZ A00(UserJid userJid) {
        C16740tZ r0;
        C16740tZ r02;
        C30991dI A062 = this.A0G.A06(userJid);
        if (A062 == null) {
            StringBuilder sb = new StringBuilder("statusmsgstore/getlaststatusmessage/no status for ");
            sb.append(userJid);
            Log.w(sb.toString());
            return null;
        }
        synchronized (A062) {
            r0 = A062.A08;
        }
        if (r0 == null) {
            C16740tZ A0F2 = this.A06.A0F(A062.A03());
            synchronized (A062) {
                A062.A08 = A0F2;
            }
        }
        synchronized (A062) {
            r02 = A062.A08;
        }
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d4, code lost:
        if (X.C42881yp.A02(r12.A0C, 4) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fa, code lost:
        if (r1.A01(r2) != false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
        if (r12.A0I > r21) goto L_0x0122;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0151 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x0151=Splitter:B:67:0x0151, B:59:0x0144=Splitter:B:59:0x0144} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(com.whatsapp.jid.UserJid r24) {
        /*
            r23 = this;
            X.AnonymousClass00B.A00()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = r23
            X.0tq r0 = r7.A0D
            X.0tf r4 = r0.get()
            r9 = 0
            r8 = 1
            r11 = r24
            if (r24 != 0) goto L_0x002b
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = X.C42931yw.A01     // Catch:{ all -> 0x0152 }
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ all -> 0x0152 }
            X.0ts r0 = r7.A05     // Catch:{ all -> 0x0152 }
            X.1kq r10 = X.C34771kq.A00     // Catch:{ all -> 0x0152 }
            long r0 = r0.A02(r10)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0152 }
            r2[r9] = r0     // Catch:{ all -> 0x0152 }
            goto L_0x0047
        L_0x002b:
            X.1jg r0 = X.C34091jg.A00     // Catch:{ all -> 0x0152 }
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x004e
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = X.C42931yw.A04     // Catch:{ all -> 0x0152 }
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ all -> 0x0152 }
            X.0ts r0 = r7.A05     // Catch:{ all -> 0x0152 }
            X.1kq r10 = X.C34771kq.A00     // Catch:{ all -> 0x0152 }
            long r0 = r0.A02(r10)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0152 }
            r2[r9] = r0     // Catch:{ all -> 0x0152 }
        L_0x0047:
            android.database.Cursor r5 = r5.A08(r3, r2)     // Catch:{ all -> 0x0152 }
            if (r24 == 0) goto L_0x0083
            goto L_0x0077
        L_0x004e:
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = X.C42931yw.A03     // Catch:{ all -> 0x0152 }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0152 }
            X.0ts r0 = r7.A05     // Catch:{ all -> 0x0152 }
            X.1kq r10 = X.C34771kq.A00     // Catch:{ all -> 0x0152 }
            long r0 = r0.A02(r10)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0152 }
            r2[r9] = r0     // Catch:{ all -> 0x0152 }
            X.14v r0 = r7.A08     // Catch:{ all -> 0x0152 }
            long r0 = r0.A01(r11)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0152 }
            r2[r8] = r0     // Catch:{ all -> 0x0152 }
            r1 = 2
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0152 }
            r2[r1] = r0     // Catch:{ all -> 0x0152 }
            goto L_0x0047
        L_0x0077:
            X.11G r0 = r7.A0G     // Catch:{ all -> 0x014b }
            X.1dI r0 = r0.A06(r11)     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0083
            if (r5 == 0) goto L_0x0147
            goto L_0x0144
        L_0x0083:
            X.0t3 r0 = r7.A02     // Catch:{ all -> 0x014b }
            long r2 = r0.A00()     // Catch:{ all -> 0x014b }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r21 = r2 - r0
            X.11I r12 = r7.A0E     // Catch:{ all -> 0x014b }
            java.lang.String r8 = "status_psa_exipration_time"
            r0 = 0
            long r19 = r12.A01(r8, r0)     // Catch:{ all -> 0x014b }
            java.lang.String r8 = "status_psa_viewed_time"
            long r17 = r12.A01(r8, r0)     // Catch:{ all -> 0x014b }
            r16 = 0
        L_0x00a2:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x012b
            X.0t6 r0 = r7.A06     // Catch:{ all -> 0x014b }
            X.0tZ r12 = r0.A0G(r5, r10)     // Catch:{ all -> 0x014b }
            if (r12 != 0) goto L_0x00c6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r1.<init>()     // Catch:{ all -> 0x014b }
            java.lang.String r0 = "statusmsgstore/status-null-message for "
            r1.append(r0)     // Catch:{ all -> 0x014b }
            r1.append(r11)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x014b }
            goto L_0x00a2
        L_0x00c6:
            boolean r0 = X.C38621r6.A0o(r12)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x00d6
            r1 = 4
            int r0 = r12.A0C     // Catch:{ all -> 0x014b }
            boolean r1 = X.C42881yp.A02(r0, r1)     // Catch:{ all -> 0x014b }
            r0 = 1
            if (r1 != 0) goto L_0x00d7
        L_0x00d6:
            r0 = 0
        L_0x00d7:
            if (r0 != 0) goto L_0x00a2
            boolean r0 = X.C41061vA.A0I(r12)     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x00a2
            X.0rv r0 = r12.A0B()     // Catch:{ all -> 0x014b }
            boolean r0 = X.C16030sJ.A0P(r0)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x011c
            X.184 r0 = r7.A0F     // Catch:{ all -> 0x014b }
            X.1kX r1 = r0.A00(r12)     // Catch:{ all -> 0x014b }
            boolean r0 = r1.A00()     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x00fc
            boolean r0 = r1.A01(r2)     // Catch:{ all -> 0x014b }
            r15 = 1
            if (r0 == 0) goto L_0x00fd
        L_0x00fc:
            r15 = 0
        L_0x00fd:
            boolean r0 = r1.A00()     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x010a
            long r0 = r12.A0I     // Catch:{ all -> 0x014b }
            int r8 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r8 > 0) goto L_0x0116
            goto L_0x010c
        L_0x010a:
            r0 = 0
            goto L_0x0117
        L_0x010c:
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x0116
            r13 = 0
            int r0 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x010a
        L_0x0116:
            r0 = 1
        L_0x0117:
            if (r0 != 0) goto L_0x0122
            if (r15 == 0) goto L_0x0127
            goto L_0x0122
        L_0x011c:
            long r0 = r12.A0I     // Catch:{ all -> 0x014b }
            int r8 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r8 <= 0) goto L_0x0127
        L_0x0122:
            r6.add(r12)     // Catch:{ all -> 0x014b }
            goto L_0x00a2
        L_0x0127:
            r16 = 1
            goto L_0x00a2
        L_0x012b:
            if (r16 == 0) goto L_0x0144
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A0I     // Catch:{ all -> 0x014b }
            r0 = 1
            boolean r0 = r1.compareAndSet(r9, r0)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x0144
            X.126 r2 = r7.A04     // Catch:{ all -> 0x014b }
            r0 = 40
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x014b }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x014b }
            r0 = 41
            r2.A01(r1, r0)     // Catch:{ all -> 0x014b }
        L_0x0144:
            r5.close()     // Catch:{ all -> 0x0152 }
        L_0x0147:
            r4.close()
            return r6
        L_0x014b:
            r0 = move-exception
            if (r5 == 0) goto L_0x0151
            r5.close()     // Catch:{ all -> 0x0151 }
        L_0x0151:
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0156 }
        L_0x0156:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass128.A01(com.whatsapp.jid.UserJid):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0599, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0163, code lost:
        if (X.C41061vA.A0I(r12) == false) goto L_0x0165;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x0560 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:190:0x0565 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:205:0x059d */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0093 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0159 A[Catch:{ all -> 0x0599 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016f A[Catch:{ all -> 0x0599 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0194 A[Catch:{ all -> 0x0599 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d A[Catch:{ all -> 0x0599 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ca A[Catch:{ all -> 0x0599 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(boolean r38) {
        /*
            r37 = this;
            X.AnonymousClass00B.A00()
            java.util.HashSet r21 = new java.util.HashSet
            r21.<init>()
            r11 = r37
            X.0t3 r0 = r11.A02
            r36 = r0
            long r16 = r36.A00()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r16 = r16 - r0
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r30 = r38
            r0 = r30
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1Zf r20 = new X.1Zf
            r0 = r20
            r0.<init>((java.lang.String) r1)
            X.0tq r0 = r11.A0D
            r35 = r0
            X.0tf r29 = r35.A02()
            X.1cj r28 = r29.A00()     // Catch:{ all -> 0x059e }
            r0 = r29
            X.0tg r0 = r0.A02     // Catch:{ all -> 0x0599 }
            r34 = r0
            java.lang.String r3 = X.C42931yw.A01     // Catch:{ all -> 0x0599 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0599 }
            X.0ts r0 = r11.A05     // Catch:{ all -> 0x0599 }
            r33 = r0
            X.1kq r27 = X.C34771kq.A00     // Catch:{ all -> 0x0599 }
            r1 = r0
            r0 = r27
            long r0 = r1.A02(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0599 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0599 }
            r0 = r34
            android.database.Cursor r13 = r0.A08(r3, r2)     // Catch:{ all -> 0x0599 }
            java.lang.String r26 = "statusmsgstore/deleteoldstatuses/cursor-null"
            if (r13 != 0) goto L_0x006f
            com.whatsapp.util.Log.e((java.lang.String) r26)     // Catch:{ all -> 0x0599 }
            r28.close()     // Catch:{ all -> 0x059e }
            goto L_0x0595
        L_0x006f:
            X.11I r0 = r11.A0E     // Catch:{ all -> 0x0599 }
            r32 = r0
            java.lang.String r3 = "status_psa_viewed_time"
            r1 = 0
            long r6 = r0.A01(r3, r1)     // Catch:{ all -> 0x0599 }
            java.lang.String r3 = "status_psa_exipration_time"
            long r4 = r0.A01(r3, r1)     // Catch:{ all -> 0x0599 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0599 }
            r10.<init>()     // Catch:{ all -> 0x0599 }
            java.util.ArrayList r25 = new java.util.ArrayList     // Catch:{ all -> 0x0599 }
            r25.<init>()     // Catch:{ all -> 0x0599 }
            r2 = 0
            r9 = 0
            r8 = 0
            r24 = 0
        L_0x0093:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0599 }
            java.lang.String r23 = " deleted:"
            if (r0 == 0) goto L_0x023a
            int r9 = r9 + 1
            X.0t6 r0 = r11.A06     // Catch:{ all -> 0x0599 }
            r31 = r0
            r1 = r0
            r0 = r27
            X.0tZ r12 = r1.A0G(r13, r0)     // Catch:{ all -> 0x0599 }
            if (r12 != 0) goto L_0x00b1
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/no message"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0599 }
            goto L_0x0093
        L_0x00b1:
            X.0rv r0 = r12.A0B()     // Catch:{ all -> 0x0599 }
            boolean r0 = X.C16030sJ.A0P(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r14 = " "
            if (r0 == 0) goto L_0x0144
            X.184 r0 = r11.A0F     // Catch:{ all -> 0x0599 }
            X.1kX r15 = r0.A00(r12)     // Catch:{ all -> 0x0599 }
            boolean r0 = r15.A00()     // Catch:{ all -> 0x0599 }
            java.lang.String r22 = "statusmsgstore/deleteoldstatuses/psamessage "
            if (r0 != 0) goto L_0x00d8
            long r0 = r36.A00()     // Catch:{ all -> 0x0599 }
            boolean r0 = r15.A01(r0)     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x017a
            goto L_0x0165
        L_0x00d8:
            long r18 = r36.A00()     // Catch:{ all -> 0x0599 }
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ed
            r18 = 0
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ed
            long r0 = r12.A0I     // Catch:{ all -> 0x0599 }
            int r15 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x00ed
            goto L_0x0165
        L_0x00ed:
            long r0 = r12.A0I     // Catch:{ all -> 0x0599 }
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 >= 0) goto L_0x017a
            X.11G r1 = r11.A0G     // Catch:{ all -> 0x0599 }
            X.0rv r0 = r12.A0B()     // Catch:{ all -> 0x0599 }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x0599 }
            X.1dI r0 = r1.A06(r0)     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x017a
            int r0 = r0.A02()     // Catch:{ all -> 0x0599 }
            if (r0 != 0) goto L_0x017a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0599 }
            r15.<init>()     // Catch:{ all -> 0x0599 }
            r0 = r22
            r15.append(r0)     // Catch:{ all -> 0x0599 }
            X.1Vw r0 = r12.A11     // Catch:{ all -> 0x0599 }
            r15.append(r0)     // Catch:{ all -> 0x0599 }
            r15.append(r14)     // Catch:{ all -> 0x0599 }
            byte r0 = r12.A10     // Catch:{ all -> 0x0599 }
            r15.append(r0)     // Catch:{ all -> 0x0599 }
            r15.append(r14)     // Catch:{ all -> 0x0599 }
            int r0 = r12.A0C     // Catch:{ all -> 0x0599 }
            r15.append(r0)     // Catch:{ all -> 0x0599 }
            r15.append(r14)     // Catch:{ all -> 0x0599 }
            long r0 = r12.A0I     // Catch:{ all -> 0x0599 }
            r15.append(r0)     // Catch:{ all -> 0x0599 }
            r15.append(r14)     // Catch:{ all -> 0x0599 }
            r15.append(r4)     // Catch:{ all -> 0x0599 }
            r15.append(r14)     // Catch:{ all -> 0x0599 }
            r15.append(r6)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x0599 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0599 }
            goto L_0x0165
        L_0x0144:
            X.1Vw r0 = r12.A11     // Catch:{ all -> 0x0599 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x0153
            long r0 = r12.A0H     // Catch:{ all -> 0x0599 }
            r18 = 0
            int r14 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r14 <= 0) goto L_0x0153
            goto L_0x0155
        L_0x0153:
            long r0 = r12.A0I     // Catch:{ all -> 0x0599 }
        L_0x0155:
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x016f
            boolean r0 = X.C38621r6.A0o(r12)     // Catch:{ all -> 0x0599 }
            if (r0 != 0) goto L_0x0167
            boolean r0 = X.C41061vA.A0I(r12)     // Catch:{ all -> 0x0599 }
            if (r0 != 0) goto L_0x0167
        L_0x0165:
            r24 = 1
        L_0x0167:
            r0 = r25
            r0.add(r12)     // Catch:{ all -> 0x0599 }
            int r8 = r8 + 1
            goto L_0x01c2
        L_0x016f:
            r18 = 0
            int r14 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r14 == 0) goto L_0x0179
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x017a
        L_0x0179:
            r2 = r0
        L_0x017a:
            boolean r0 = X.C38621r6.A0o(r12)     // Catch:{ all -> 0x0599 }
            if (r0 != 0) goto L_0x01c2
            boolean r0 = X.C41061vA.A0I(r12)     // Catch:{ all -> 0x0599 }
            if (r0 != 0) goto L_0x01c2
            X.0rv r1 = r12.A0B()     // Catch:{ all -> 0x0599 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0599 }
            java.lang.Object r0 = r10.get(r1)     // Catch:{ all -> 0x0599 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0599 }
            if (r0 != 0) goto L_0x019d
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0599 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0599 }
            goto L_0x01aa
        L_0x019d:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0599 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0599 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0599 }
        L_0x01aa:
            if (r38 == 0) goto L_0x01c2
            boolean r0 = r12 instanceof X.C16730tY     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x01c2
            r0 = r12
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ all -> 0x0599 }
            X.0ta r1 = r0.A02     // Catch:{ all -> 0x0599 }
            if (r1 == 0) goto L_0x01c2
            java.io.File r0 = r1.A0F     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x01c2
            java.io.File r1 = r1.A0F     // Catch:{ all -> 0x0599 }
            r0 = r21
            r0.add(r1)     // Catch:{ all -> 0x0599 }
        L_0x01c2:
            int r1 = r25.size()     // Catch:{ all -> 0x0599 }
            r0 = 256(0x100, float:3.59E-43)
            if (r1 < r0) goto L_0x0093
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0599 }
            r1.<init>()     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/delete total:"
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            r1.append(r9)     // Catch:{ all -> 0x0599 }
            r0 = r23
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            r1.append(r8)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = " current batch:"
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            int r0 = r25.size()     // Catch:{ all -> 0x0599 }
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0599 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0599 }
            r13.close()     // Catch:{ all -> 0x0599 }
            java.util.Iterator r15 = r25.iterator()     // Catch:{ all -> 0x0599 }
        L_0x01fa:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x020e
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x0599 }
            X.0tZ r14 = (X.C16740tZ) r14     // Catch:{ all -> 0x0599 }
            r13 = 0
            r1 = 1
            r0 = r31
            r0.A0g(r14, r1, r13)     // Catch:{ all -> 0x0599 }
            goto L_0x01fa
        L_0x020e:
            r25.clear()     // Catch:{ all -> 0x0599 }
            java.lang.String r14 = X.C42931yw.A02     // Catch:{ all -> 0x0599 }
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x0599 }
            r1 = r33
            r0 = r27
            long r0 = r1.A02(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0599 }
            r0 = 0
            r13[r0] = r1     // Catch:{ all -> 0x0599 }
            long r0 = r12.A14     // Catch:{ all -> 0x0599 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0599 }
            r0 = 1
            r13[r0] = r1     // Catch:{ all -> 0x0599 }
            r0 = r34
            android.database.Cursor r13 = r0.A08(r14, r13)     // Catch:{ all -> 0x0599 }
            if (r13 != 0) goto L_0x0093
            com.whatsapp.util.Log.e((java.lang.String) r26)     // Catch:{ all -> 0x0599 }
            goto L_0x023d
        L_0x023a:
            r13.close()     // Catch:{ all -> 0x0599 }
        L_0x023d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0599 }
            r4.<init>()     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses time limit:"
            r4.append(r0)     // Catch:{ all -> 0x0599 }
            r0 = r16
            r4.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = " total:"
            r4.append(r0)     // Catch:{ all -> 0x0599 }
            r4.append(r9)     // Catch:{ all -> 0x0599 }
            r0 = r23
            r4.append(r0)     // Catch:{ all -> 0x0599 }
            r4.append(r8)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = " last batch:"
            r4.append(r0)     // Catch:{ all -> 0x0599 }
            int r0 = r25.size()     // Catch:{ all -> 0x0599 }
            r4.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0599 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0599 }
            java.util.Iterator r6 = r25.iterator()     // Catch:{ all -> 0x0599 }
        L_0x0274:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x0288
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0599 }
            X.0tZ r5 = (X.C16740tZ) r5     // Catch:{ all -> 0x0599 }
            X.0t6 r4 = r11.A06     // Catch:{ all -> 0x0599 }
            r1 = 1
            r0 = 0
            r4.A0g(r5, r1, r0)     // Catch:{ all -> 0x0599 }
            goto L_0x0274
        L_0x0288:
            java.lang.String r1 = "earliest_status_time"
            r0 = r32
            r0.A05(r1, r2)     // Catch:{ all -> 0x0599 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0599 }
            r1.<init>()     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses new earliest time:"
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            r1.append(r2)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = " active jids:"
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            int r0 = r10.size()     // Catch:{ all -> 0x0599 }
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0599 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0599 }
            java.util.Set r0 = r10.entrySet()     // Catch:{ all -> 0x0599 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0599 }
        L_0x02b8:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x0378
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0599 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x0599 }
            java.lang.Object r2 = r5.getKey()     // Catch:{ all -> 0x0599 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x0599 }
            X.11G r4 = r11.A0G     // Catch:{ all -> 0x0599 }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r2)     // Catch:{ all -> 0x0599 }
            X.1dI r3 = r4.A06(r0)     // Catch:{ all -> 0x0599 }
            if (r3 == 0) goto L_0x034d
            int r1 = r3.A01()     // Catch:{ all -> 0x0599 }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x0599 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0599 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0599 }
            if (r1 == r0) goto L_0x02b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0599 }
            r1.<init>()     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses inconsistency for "
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            r1.append(r2)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = " old count:"
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            int r0 = r3.A01()     // Catch:{ all -> 0x0599 }
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            int r0 = r3.A02()     // Catch:{ all -> 0x0599 }
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = ") new:"
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x0599 }
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0599 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0599 }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x0599 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0599 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0599 }
            r3.A08(r0)     // Catch:{ all -> 0x0599 }
            int r1 = r3.A02()     // Catch:{ all -> 0x0599 }
            int r0 = r3.A01()     // Catch:{ all -> 0x0599 }
            if (r1 <= r0) goto L_0x033e
            int r0 = r3.A01()     // Catch:{ all -> 0x0599 }
            monitor-enter(r3)     // Catch:{ all -> 0x0599 }
            r3.A01 = r0     // Catch:{ all -> 0x0375 }
            monitor-exit(r3)     // Catch:{ all -> 0x0599 }
        L_0x033e:
            int r1 = r3.A02()     // Catch:{ all -> 0x0599 }
            int r0 = r3.A01()     // Catch:{ all -> 0x0599 }
            r4.A0E(r2, r1, r0)     // Catch:{ all -> 0x0599 }
            r24 = 1
            goto L_0x02b8
        L_0x034d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0599 }
            r1.<init>()     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses no status info for "
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            r1.append(r2)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = " with "
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x0599 }
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = " statuses"
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0599 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0599 }
            goto L_0x02b8
        L_0x0375:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0599 }
            throw r0     // Catch:{ all -> 0x0599 }
        L_0x0378:
            X.11G r4 = r11.A0G     // Catch:{ all -> 0x0599 }
            r4.A0B()     // Catch:{ all -> 0x0599 }
            java.util.concurrent.ConcurrentHashMap r0 = r4.A08     // Catch:{ all -> 0x0599 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0599 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0599 }
            r5.<init>()     // Catch:{ all -> 0x0599 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0599 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0599 }
        L_0x0390:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x03bd
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0599 }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x0599 }
            boolean r0 = r10.containsKey(r2)     // Catch:{ all -> 0x0599 }
            if (r0 != 0) goto L_0x0390
            r5.add(r2)     // Catch:{ all -> 0x0599 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0599 }
            r1.<init>()     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses delete inactive "
            r1.append(r0)     // Catch:{ all -> 0x0599 }
            r1.append(r2)     // Catch:{ all -> 0x0599 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0599 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0599 }
            r24 = 1
            goto L_0x0390
        L_0x03bd:
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x0599 }
        L_0x03c1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x03d1
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0599 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0599 }
            r4.A03(r0)     // Catch:{ all -> 0x0599 }
            goto L_0x03c1
        L_0x03d1:
            r28.A00()     // Catch:{ all -> 0x0599 }
            r28.close()     // Catch:{ all -> 0x059e }
            r29.close()
            if (r38 == 0) goto L_0x056e
            X.0sb r5 = r11.A00
            X.1jH r0 = r5.A05()
            java.io.File r1 = r0.A0M
            r0 = 0
            X.C16180sb.A04(r1, r0)
            java.io.File[] r4 = r1.listFiles()
            if (r4 == 0) goto L_0x056e
            X.0tf r18 = r35.A02()
            int r3 = r4.length     // Catch:{ all -> 0x0566 }
            r2 = 0
        L_0x03f4:
            if (r2 >= r3) goto L_0x056b
            r6 = r4[r2]     // Catch:{ all -> 0x0566 }
            r0 = r21
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x0566 }
            if (r0 != 0) goto L_0x0558
            long r7 = r6.lastModified()     // Catch:{ all -> 0x0566 }
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0558
            X.0t8 r7 = r11.A09     // Catch:{ all -> 0x0566 }
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x0566 }
            java.lang.String r1 = X.C37981q3.A00(r6)     // Catch:{ IOException -> 0x0417 }
            r0 = 0
            java.util.Collection r10 = r7.A0C(r0, r6, r1)     // Catch:{ all -> 0x0566 }
            goto L_0x0421
        L_0x0417:
            r1 = move-exception
            java.lang.String r0 = "mediamessagestore/getMediaMessagesForFile/could not get file hash;"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0566 }
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0566 }
        L_0x0421:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0566 }
            java.lang.String r9 = "statusmsgstore/deleteoldstatuses/cleanup/failed to delete "
            if (r0 == 0) goto L_0x046d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0566 }
            r7.<init>()     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/cleanup/ delete "
            r7.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0566 }
            r7.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = " "
            r7.append(r0)     // Catch:{ all -> 0x0566 }
            long r0 = r6.lastModified()     // Catch:{ all -> 0x0566 }
            r7.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0566 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0566 }
            boolean r0 = r6.delete()     // Catch:{ all -> 0x0566 }
            if (r0 != 0) goto L_0x0558
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0566 }
            r1.<init>()     // Catch:{ all -> 0x0566 }
            r1.append(r9)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0566 }
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0566 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0566 }
            goto L_0x0558
        L_0x046d:
            java.util.Iterator r0 = r10.iterator()     // Catch:{ all -> 0x0566 }
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x0566 }
            X.0tZ r8 = (X.C16740tZ) r8     // Catch:{ all -> 0x0566 }
            X.0u3 r7 = r11.A0H     // Catch:{ all -> 0x0566 }
            byte r1 = r8.A10     // Catch:{ all -> 0x0566 }
            int r0 = r8.A08     // Catch:{ all -> 0x0566 }
            X.1XK r1 = X.C31831f6.A01(r1, r0)     // Catch:{ all -> 0x0566 }
            int r0 = r8.A08     // Catch:{ all -> 0x0566 }
            java.io.File r7 = X.C17970vw.A0B(r5, r7, r1, r6, r0)     // Catch:{ all -> 0x0566 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0566 }
            r1.<init>()     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/cleanup "
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0566 }
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = " found in "
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            int r0 = r10.size()     // Catch:{ all -> 0x0566 }
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = " message(s), rename to "
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ all -> 0x0566 }
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0566 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0566 }
            X.0tB r0 = r5.A04     // Catch:{ IOException -> 0x0533 }
            X.AnonymousClass1XI.A0B(r0, r6, r7)     // Catch:{ IOException -> 0x0533 }
            X.1cj r15 = r18.A00()     // Catch:{ all -> 0x0566 }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ all -> 0x0561 }
        L_0x04c5:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0561 }
            if (r0 == 0) goto L_0x04e4
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x0561 }
            X.0tZ r1 = (X.C16740tZ) r1     // Catch:{ all -> 0x0561 }
            boolean r0 = r1 instanceof X.C16730tY     // Catch:{ all -> 0x0561 }
            if (r0 == 0) goto L_0x04c5
            r0 = r1
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ all -> 0x0561 }
            X.0ta r0 = r0.A02     // Catch:{ all -> 0x0561 }
            if (r0 == 0) goto L_0x04c5
            r0.A0F = r7     // Catch:{ all -> 0x0561 }
            X.0t6 r0 = r11.A06     // Catch:{ all -> 0x0561 }
            r0.A0a(r1)     // Catch:{ all -> 0x0561 }
            goto L_0x04c5
        L_0x04e4:
            X.01a r0 = r11.A0A     // Catch:{ all -> 0x0561 }
            java.lang.String r14 = r6.getAbsolutePath()     // Catch:{ all -> 0x0561 }
            java.lang.String r1 = r7.getAbsolutePath()     // Catch:{ all -> 0x0561 }
            X.0tq r0 = r0.A01     // Catch:{ all -> 0x0561 }
            X.0tf r12 = r0.A02()     // Catch:{ all -> 0x0561 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x055c }
            r13.<init>()     // Catch:{ all -> 0x055c }
            java.lang.String r0 = "path"
            r13.put(r0, r1)     // Catch:{ all -> 0x055c }
            X.0tg r10 = r12.A02     // Catch:{ all -> 0x055c }
            java.lang.String r8 = "media_refs"
            java.lang.String r7 = "path = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x055c }
            r0 = 0
            r1[r0] = r14     // Catch:{ all -> 0x055c }
            r10.A00(r8, r13, r7, r1)     // Catch:{ all -> 0x055c }
            r12.close()     // Catch:{ all -> 0x0561 }
            r15.A00()     // Catch:{ all -> 0x0561 }
            r15.close()     // Catch:{ all -> 0x0566 }
            boolean r0 = r6.delete()     // Catch:{ all -> 0x0566 }
            if (r0 != 0) goto L_0x0558
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0566 }
            r1.<init>()     // Catch:{ all -> 0x0566 }
            r1.append(r9)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0566 }
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0566 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0566 }
            goto L_0x0558
        L_0x0533:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0566 }
            r1.<init>()     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/cleanup/failed to copy from "
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0566 }
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ all -> 0x0566 }
            r1.append(r0)     // Catch:{ all -> 0x0566 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0566 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0566 }
        L_0x0558:
            int r2 = r2 + 1
            goto L_0x03f4
        L_0x055c:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0560 }
        L_0x0560:
            throw r0     // Catch:{ all -> 0x0561 }
        L_0x0561:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x0565 }
        L_0x0565:
            throw r0     // Catch:{ all -> 0x0566 }
        L_0x0566:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x05a2 }
            throw r0
        L_0x056b:
            r18.close()
        L_0x056e:
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses time spent:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            long r0 = r20.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r24 == 0) goto L_0x0598
            X.17E r0 = r11.A07
            android.os.Handler r2 = r0.A01
            r1 = 42
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r0.<init>(r11, r1)
            r2.post(r0)
            return
        L_0x0595:
            r29.close()
        L_0x0598:
            return
        L_0x0599:
            r0 = move-exception
            r28.close()     // Catch:{ all -> 0x059d }
        L_0x059d:
            throw r0     // Catch:{ all -> 0x059e }
        L_0x059e:
            r0 = move-exception
            r29.close()     // Catch:{ all -> 0x05a2 }
        L_0x05a2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass128.A02(boolean):void");
    }
}
