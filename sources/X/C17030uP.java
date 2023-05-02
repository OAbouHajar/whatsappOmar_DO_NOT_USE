package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0uP  reason: invalid class name and case insensitive filesystem */
public class C17030uP {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C16040sK A01;
    public final C15900s5 A02;
    public final C40091tY A03 = new C40091tY();
    public final C16000sG A04;
    public final C224818c A05;
    public final C17140ub A06;
    public final C208211s A07;
    public final AnonymousClass16P A08;
    public final Object A09 = new Object();
    public final Map A0A = Collections.synchronizedMap(new HashMap());

    public C17030uP(C16040sK r3, C15900s5 r4, C16000sG r5, C224818c r6, C17140ub r7, C208211s r8, AnonymousClass16P r9) {
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A08 = r9;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:28|29|30|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0053 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0042=Splitter:B:18:0x0042, B:23:0x004a=Splitter:B:23:0x004a} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0053=Splitter:B:31:0x0053, B:25:0x004b=Splitter:B:25:0x004b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28331Vq A00(com.whatsapp.jid.UserJid r10) {
        /*
            r9 = this;
            X.0sK r0 = r9.A01
            boolean r0 = r0.A0I(r10)
            if (r0 == 0) goto L_0x0056
            X.18c r0 = r9.A05     // Catch:{ all -> 0x0054 }
            r5 = 0
            if (r10 != 0) goto L_0x0013
            java.lang.String r0 = "contact-mgr-db/cannot get verified name details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0054 }
            return r5
        L_0x0013:
            X.11X r0 = r0.A00     // Catch:{ all -> 0x0054 }
            X.0tf r2 = r0.get()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "wa_vnames"
            java.lang.String[] r7 = X.C224818c.A0B     // Catch:{ all -> 0x004f }
            java.lang.String r4 = "jid = ?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x004f }
            r1 = 0
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x004f }
            r8[r1] = r0     // Catch:{ all -> 0x004f }
            java.lang.String r6 = "CONTACT_VNAMES"
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004b
            boolean r0 = r1.isClosed()     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0042
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0042
            X.1Vq r5 = X.C40101tZ.A00(r1)     // Catch:{ all -> 0x0046 }
        L_0x0042:
            r1.close()     // Catch:{ all -> 0x004f }
            goto L_0x004b
        L_0x0046:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004b:
            r2.close()     // Catch:{ all -> 0x0054 }
            return r5
        L_0x004f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            throw r0
        L_0x0056:
            if (r10 == 0) goto L_0x0061
            X.0sG r0 = r9.A04
            X.0sH r0 = r0.A0A(r10)
            X.1Vq r5 = r0.A0C
            return r5
        L_0x0061:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17030uP.A00(com.whatsapp.jid.UserJid):X.1Vq");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.whatsapp.jid.UserJid r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A09
            monitor-enter(r4)
            X.18c r3 = r5.A05     // Catch:{ all -> 0x0050 }
            X.11X r0 = r3.A00     // Catch:{ IllegalArgumentException -> 0x0026 }
            X.0tf r2 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0026 }
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x0021 }
            r3.A0G(r1, r6)     // Catch:{ all -> 0x001c }
            r1.A00()     // Catch:{ all -> 0x001c }
            r1.close()     // Catch:{ all -> 0x0021 }
            r2.close()     // Catch:{ IllegalArgumentException -> 0x0026 }
            goto L_0x0038
        L_0x001c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0026 }
        L_0x0026:
            r2 = move-exception
            java.lang.String r1 = "contact-mgr-db/unable to delete vname details "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r0.<init>(r1)     // Catch:{ all -> 0x0050 }
            r0.append(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0050 }
            X.AnonymousClass00B.A09(r0, r2)     // Catch:{ all -> 0x0050 }
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            java.util.Map r0 = r5.A0A
            r0.remove(r6)
            X.0sG r0 = r5.A04
            r0.A0J()
            android.os.Handler r2 = r5.A00
            r1 = 45
            com.facebook.redex.RunnableRunnableShape13S0200000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape13S0200000_I1_1
            r0.<init>(r5, r1, r6)
            r2.post(r0)
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17030uP.A01(com.whatsapp.jid.UserJid):void");
    }

    public boolean A02(UserJid userJid) {
        C16010sH A082;
        if (userJid == null || (A082 = this.A04.A08(userJid)) == null) {
            return false;
        }
        return A082.A0I();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0084 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(com.whatsapp.jid.UserJid r13, X.C40111ta r14, int r15, boolean r16) {
        /*
            r12 = this;
            java.lang.Object r4 = r12.A09
            monitor-enter(r4)
            X.1Vq r0 = r12.A00(r13)     // Catch:{ all -> 0x00c2 }
            r5 = 0
            if (r0 == 0) goto L_0x000d
            int r6 = r0.A03     // Catch:{ all -> 0x00c2 }
            goto L_0x000e
        L_0x000d:
            r6 = 0
        L_0x000e:
            r9 = 0
            if (r0 == 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r0 = 0
            goto L_0x0018
        L_0x0016:
            long r0 = r0.A04     // Catch:{ all -> 0x00c2 }
        L_0x0018:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00c2 }
            r7.<init>()     // Catch:{ all -> 0x00c2 }
            if (r6 == r15) goto L_0x0029
            java.lang.String r3 = "verified_level"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x00c2 }
            r7.put(r3, r2)     // Catch:{ all -> 0x00c2 }
        L_0x0029:
            if (r14 == 0) goto L_0x005a
            long r2 = r14.privacyModeTs     // Catch:{ all -> 0x00c2 }
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0039
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x005a
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
        L_0x0039:
            java.lang.String r1 = "host_storage"
            int r0 = r14.hostStorage     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c2 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "actual_actors"
            int r0 = r14.actualActors     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c2 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = "privacy_mode_ts"
            long r0 = r14.privacyModeTs     // Catch:{ all -> 0x00c2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c2 }
            r7.put(r2, r0)     // Catch:{ all -> 0x00c2 }
        L_0x005a:
            int r0 = r7.size()     // Catch:{ all -> 0x00c2 }
            if (r0 <= 0) goto L_0x00c0
            r5 = 1
            X.18c r3 = r12.A05     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = ", "
            X.11X r0 = r3.A00     // Catch:{ IllegalArgumentException -> 0x0085 }
            X.0tf r10 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0085 }
            java.lang.String r11 = "wa_vnames"
            java.lang.String r9 = "jid = ?"
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x0080 }
            r1 = 0
            java.lang.String r0 = X.C16030sJ.A03(r13)     // Catch:{ all -> 0x0080 }
            r2[r1] = r0     // Catch:{ all -> 0x0080 }
            X.AnonymousClass15L.A01(r7, r10, r11, r9, r2)     // Catch:{ all -> 0x0080 }
            r10.close()     // Catch:{ IllegalArgumentException -> 0x0085 }
            goto L_0x00a2
        L_0x0080:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0084 }
        L_0x0084:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0085 }
        L_0x0085:
            r2 = move-exception
            java.lang.String r0 = "wadbhelper/update-multi-fields/unable to update fields"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c2 }
            r1.append(r13)     // Catch:{ all -> 0x00c2 }
            r1.append(r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00c2 }
            r1.append(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c2 }
            X.AnonymousClass00B.A09(r0, r2)     // Catch:{ all -> 0x00c2 }
        L_0x00a2:
            X.1iU r1 = r3.A02     // Catch:{ all -> 0x00c2 }
            java.util.ArrayList r0 = r3.A0B(r13)     // Catch:{ all -> 0x00c2 }
            r1.A04(r0)     // Catch:{ all -> 0x00c2 }
            if (r16 == 0) goto L_0x00b4
            if (r6 == r15) goto L_0x00b4
            X.0sG r0 = r12.A04     // Catch:{ all -> 0x00c2 }
            r0.A0J()     // Catch:{ all -> 0x00c2 }
        L_0x00b4:
            android.os.Handler r2 = r12.A00     // Catch:{ all -> 0x00c2 }
            r1 = 46
            com.facebook.redex.RunnableRunnableShape13S0200000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape13S0200000_I1_1     // Catch:{ all -> 0x00c2 }
            r0.<init>(r12, r1, r13)     // Catch:{ all -> 0x00c2 }
            r2.post(r0)     // Catch:{ all -> 0x00c2 }
        L_0x00c0:
            monitor-exit(r4)     // Catch:{ all -> 0x00c2 }
            return r5
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17030uP.A03(com.whatsapp.jid.UserJid, X.1ta, int, boolean):boolean");
    }

    public boolean A04(UserJid userJid, C40111ta r6, byte[] bArr, int i2) {
        boolean z2;
        synchronized (this.A09) {
            A05(userJid, r6, bArr, i2);
            C28331Vq A002 = A00(userJid);
            AnonymousClass00B.A06(A002);
            if (A002.A02 == 0) {
                this.A00.post(new RunnableRunnableShape13S0200000_I1_1(this, 44, userJid));
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x015f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0164 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(com.whatsapp.jid.UserJid r22, X.C40111ta r23, byte[] r24, int r25) {
        /*
            r21 = this;
            r3 = 0
            r4 = r22
            if (r22 == 0) goto L_0x01fd
            r5 = r21
            X.1tb r0 = X.C40121tb.A04     // Catch:{ 1bD -> 0x01a1, IllegalArgumentException -> 0x018a }
            r1 = r24
            X.1Wm r2 = X.C28541Wm.A0E(r0, r1)     // Catch:{ 1bD -> 0x01a1, IllegalArgumentException -> 0x018a }
            X.1tb r2 = (X.C40121tb) r2     // Catch:{ 1bD -> 0x01a1, IllegalArgumentException -> 0x018a }
            int r0 = r2.A00     // Catch:{ 1bD -> 0x01a1, IllegalArgumentException -> 0x018a }
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x01a8
            X.1Ww r0 = r2.A01     // Catch:{ 1bD -> 0x01a1, IllegalArgumentException -> 0x018a }
            byte[] r1 = r0.A04()     // Catch:{ 1bD -> 0x01a1, IllegalArgumentException -> 0x018a }
            X.1tc r0 = X.C40131tc.A06     // Catch:{ 1bD -> 0x01a1, IllegalArgumentException -> 0x018a }
            X.1Wm r2 = X.C28541Wm.A0E(r0, r1)     // Catch:{ 1bD -> 0x01a1, IllegalArgumentException -> 0x018a }
            X.1tc r2 = (X.C40131tc) r2     // Catch:{ 1bD -> 0x01a1, IllegalArgumentException -> 0x018a }
            if (r2 == 0) goto L_0x01a8
            java.lang.Object r6 = r5.A09
            monitor-enter(r6)
            X.0sG r0 = r5.A04     // Catch:{ all -> 0x0187 }
            r0.A0A(r4)     // Catch:{ all -> 0x0187 }
            X.1Vq r11 = r5.A00(r4)     // Catch:{ all -> 0x0187 }
            r9 = r23
            r20 = r25
            if (r11 == 0) goto L_0x004f
            long r7 = r11.A05     // Catch:{ all -> 0x0187 }
            long r0 = r2.A02     // Catch:{ all -> 0x0187 }
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x004f
            int r0 = r11.A02     // Catch:{ all -> 0x0187 }
            if (r0 > 0) goto L_0x004f
            r0 = r20
            boolean r3 = r5.A03(r4, r9, r0, r3)     // Catch:{ all -> 0x0187 }
        L_0x004c:
            monitor-exit(r6)     // Catch:{ all -> 0x0187 }
            goto L_0x01ba
        L_0x004f:
            java.util.ArrayList r17 = new java.util.ArrayList     // Catch:{ all -> 0x0187 }
            r17.<init>()     // Catch:{ all -> 0x0187 }
            X.1XE r0 = r2.A03     // Catch:{ all -> 0x0187 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0187 }
        L_0x005a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x0187 }
            X.1te r7 = (X.C40151te) r7     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x0187 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x005a
            java.lang.String r1 = r7.A02     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0187 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0187 }
        L_0x007a:
            java.util.Locale r3 = new java.util.Locale     // Catch:{ all -> 0x0187 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x0187 }
            X.01Q r1 = new X.01Q     // Catch:{ all -> 0x0187 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0187 }
            r0 = r17
            r0.add(r1)     // Catch:{ all -> 0x0187 }
            goto L_0x005a
        L_0x008c:
            java.lang.String r0 = ""
            goto L_0x007a
        L_0x008f:
            X.18c r7 = r5.A05     // Catch:{ all -> 0x0187 }
            long r0 = r2.A02     // Catch:{ all -> 0x0187 }
            r18 = r0
            java.lang.String r14 = r2.A04     // Catch:{ all -> 0x0187 }
            java.lang.String r1 = r2.A05     // Catch:{ all -> 0x0187 }
            java.lang.String r13 = "verified_name"
            java.lang.String r12 = "jid"
            r3 = 0
            X.11X r0 = r7.A00     // Catch:{ IllegalArgumentException -> 0x0165 }
            X.0tf r11 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0165 }
            X.1cj r10 = r11.A01()     // Catch:{ all -> 0x0160 }
            r7.A0G(r10, r4)     // Catch:{ all -> 0x015b }
            java.lang.String r8 = r4.getRawString()     // Catch:{ all -> 0x015b }
            r16 = 0
            r0 = 7
            if (r23 == 0) goto L_0x00b9
            r16 = 1
            r0 = 10
        L_0x00b9:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x015b }
            r2.<init>(r0)     // Catch:{ all -> 0x015b }
            r2.put(r12, r8)     // Catch:{ all -> 0x015b }
            java.lang.String r15 = "serial"
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x015b }
            r2.put(r15, r0)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "issuer"
            r2.put(r0, r14)     // Catch:{ all -> 0x015b }
            r2.put(r13, r1)     // Catch:{ all -> 0x015b }
            java.lang.String r1 = "verified_level"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x015b }
            r2.put(r1, r0)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "cert_blob"
            r2.put(r0, r3)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "identity_unconfirmed_since"
            r2.put(r0, r3)     // Catch:{ all -> 0x015b }
            if (r16 == 0) goto L_0x010a
            java.lang.String r1 = "host_storage"
            int r0 = r9.hostStorage     // Catch:{ all -> 0x015b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x015b }
            r2.put(r1, r0)     // Catch:{ all -> 0x015b }
            java.lang.String r1 = "actual_actors"
            int r0 = r9.actualActors     // Catch:{ all -> 0x015b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x015b }
            r2.put(r1, r0)     // Catch:{ all -> 0x015b }
            java.lang.String r14 = "privacy_mode_ts"
            long r0 = r9.privacyModeTs     // Catch:{ all -> 0x015b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x015b }
            r2.put(r14, r0)     // Catch:{ all -> 0x015b }
        L_0x010a:
            java.lang.String r0 = "wa_vnames"
            X.AnonymousClass15L.A00(r2, r11, r0)     // Catch:{ all -> 0x015b }
            r2.clear()     // Catch:{ all -> 0x015b }
            java.util.Iterator r15 = r17.iterator()     // Catch:{ all -> 0x015b }
        L_0x0117:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x015b }
            X.01Q r14 = (X.AnonymousClass01Q) r14     // Catch:{ all -> 0x015b }
            r2.put(r12, r8)     // Catch:{ all -> 0x015b }
            java.lang.String r1 = "lg"
            java.lang.Object r9 = r14.A00     // Catch:{ all -> 0x015b }
            java.util.Locale r9 = (java.util.Locale) r9     // Catch:{ all -> 0x015b }
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = r9.getLanguage()     // Catch:{ all -> 0x015b }
            r2.put(r1, r0)     // Catch:{ all -> 0x015b }
            java.lang.String r1 = "lc"
            java.lang.String r0 = r9.getCountry()     // Catch:{ all -> 0x015b }
            r2.put(r1, r0)     // Catch:{ all -> 0x015b }
            java.lang.Object r0 = r14.A01     // Catch:{ all -> 0x015b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x015b }
            r2.put(r13, r0)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "wa_vnames_localized"
            X.AnonymousClass15L.A00(r2, r11, r0)     // Catch:{ all -> 0x015b }
            goto L_0x0117
        L_0x014d:
            java.util.ArrayList r3 = r7.A0B(r4)     // Catch:{ all -> 0x015b }
            r10.A00()     // Catch:{ all -> 0x015b }
            r10.close()     // Catch:{ all -> 0x0160 }
            r11.close()     // Catch:{ IllegalArgumentException -> 0x0165 }
            goto L_0x0177
        L_0x015b:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x015f }
        L_0x015f:
            throw r0     // Catch:{ all -> 0x0160 }
        L_0x0160:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0164 }
        L_0x0164:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0165 }
        L_0x0165:
            r2 = move-exception
            java.lang.String r1 = "contact-mgr-db/unable to store vname details "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r0.<init>(r1)     // Catch:{ all -> 0x0187 }
            r0.append(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0187 }
            X.AnonymousClass00B.A09(r0, r2)     // Catch:{ all -> 0x0187 }
        L_0x0177:
            if (r3 == 0) goto L_0x0184
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x0184
            X.1iU r0 = r7.A02     // Catch:{ all -> 0x0187 }
            r0.A04(r3)     // Catch:{ all -> 0x0187 }
        L_0x0184:
            r3 = 1
            goto L_0x004c
        L_0x0187:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0187 }
            throw r0
        L_0x018a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "vname failed to get identity entry for jid = "
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            r1.append(r4)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d2 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x01d2 }
            goto L_0x01a8
        L_0x01a1:
            r1 = move-exception
            java.lang.String r0 = "vname invalidproto:"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01d2 }
        L_0x01a8:
            java.lang.String r1 = "vname certificate details could no be found or validated for jid "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01ba:
            java.util.Map r2 = r5.A0A
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r4, r0)
            X.1tY r1 = r5.A03
            X.1td r0 = new X.1td
            r0.<init>(r4)
            r1.A04()
            return r3
        L_0x01d2:
            r3 = move-exception
            java.lang.String r1 = "vname certificate details could no be found or validated for jid "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.util.Map r2 = r5.A0A
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r4, r0)
            X.1tY r1 = r5.A03
            X.1td r0 = new X.1td
            r0.<init>(r4)
            r1.A04()
            throw r3
        L_0x01fd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17030uP.A05(com.whatsapp.jid.UserJid, X.1ta, byte[], int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A06(com.whatsapp.jid.UserJid r11) {
        /*
            r10 = this;
            X.18c r0 = r10.A05
            java.lang.String r2 = "cert_blob"
            X.11X r0 = r0.A00
            X.0tf r3 = r0.get()
            java.lang.String r4 = "wa_vnames"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            r1 = 0
            r8[r1] = r2     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "jid = ?"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0049 }
            r9[r1] = r0     // Catch:{ all -> 0x0049 }
            r6 = 0
            java.lang.String r7 = "CONTACT_VNAMES_CERT_BLOB"
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0040
            boolean r0 = r1.isClosed()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0040
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0040
            int r0 = r1.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x003b }
            byte[] r6 = r1.getBlob(r0)     // Catch:{ all -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0040:
            if (r1 == 0) goto L_0x0045
        L_0x0042:
            r1.close()     // Catch:{ all -> 0x0049 }
        L_0x0045:
            r3.close()
            return r6
        L_0x0049:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17030uP.A06(com.whatsapp.jid.UserJid):byte[]");
    }
}
