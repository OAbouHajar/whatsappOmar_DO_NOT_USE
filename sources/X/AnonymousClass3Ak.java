package X;

import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.facebook.simplejni.NativeHolder;
import com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException;
import com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$UnrecoverableErrorException;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Ak  reason: invalid class name */
public class AnonymousClass3Ak {
    public final int A00;
    public final int A01;
    public final C16300so A02;
    public final C16040sK A03;
    public final C18020w1 A04;
    public final C208211s A05;
    public final AnonymousClass16P A06;
    public final C16070sO A07;
    public final AnonymousClass137 A08;
    public final C27731Sx A09;
    public final C14710pd A0A;
    public final Jid A0B;
    public final C86404So A0C;
    public final AnonymousClass3B8 A0D;
    public final C48792Pd A0E;
    public final C33211iD A0F;
    public final C16740tZ A0G;
    public final C28381Vw A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final Map A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final byte[] A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0058, code lost:
        if (r11.A0E(r1, 1885) == false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3Ak(X.C16300so r3, X.C16040sK r4, X.C18020w1 r5, X.C208211s r6, X.AnonymousClass16P r7, X.C16070sO r8, X.AnonymousClass137 r9, X.C27731Sx r10, X.C14710pd r11, X.C86404So r12, X.AnonymousClass3B8 r13, X.C48792Pd r14, X.C33211iD r15, X.C16740tZ r16, X.C28381Vw r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.Map r21, byte[] r22, int r23, int r24, boolean r25) {
        /*
            r2 = this;
            r2.<init>()
            r2.A0A = r11
            r2.A02 = r3
            r2.A03 = r4
            r2.A04 = r5
            r2.A06 = r7
            r2.A0D = r13
            r2.A05 = r6
            r2.A08 = r9
            r2.A09 = r10
            r2.A07 = r8
            r2.A0E = r14
            r1 = r18
            com.whatsapp.jid.Jid r0 = com.whatsapp.jid.Jid.getNullable(r1)
            r2.A0B = r0
            r2.A0K = r1
            r0 = r19
            r2.A0J = r0
            r0 = r17
            r2.A0H = r0
            r0 = r16
            r2.A0G = r0
            r2.A0F = r15
            r0 = r22
            r2.A0O = r0
            r0 = r21
            r2.A0L = r0
            r0 = r20
            r2.A0I = r0
            r2.A0C = r12
            r0 = r23
            r2.A01 = r0
            r0 = r24
            r2.A00 = r0
            r0 = 2232(0x8b8, float:3.128E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r11.A0E(r1, r0)
            if (r0 == 0) goto L_0x005a
            r0 = 1885(0x75d, float:2.641E-42)
            boolean r1 = r11.A0E(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            r2.A0N = r0
            r0 = r25
            r2.A0M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ak.<init>(X.0so, X.0sK, X.0w1, X.11s, X.16P, X.0sO, X.137, X.1Sx, X.0pd, X.4So, X.3B8, X.2Pd, X.1iD, X.0tZ, X.1Vw, java.lang.String, java.lang.String, java.lang.String, java.util.Map, byte[], int, int, boolean):void");
    }

    public static C30821d1 A00(C36381nS r4) {
        if (r4 == null || r4.A01 != 0) {
            return null;
        }
        return new C30821d1(r4.A02, 2, C809546g.A00(r4.A00));
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C36381nS A01() {
        /*
            r24 = this;
            r4 = r24
            X.1Vw r0 = r4.A0H
            X.0rv r3 = r0.A00
            boolean r0 = r3 instanceof X.C16060sN
            if (r0 == 0) goto L_0x003e
            X.0sN r3 = (X.C16060sN) r3
        L_0x000c:
            X.AnonymousClass00B.A06(r3)
            boolean r1 = r4.A0M
            X.0sK r0 = r4.A03
            if (r1 == 0) goto L_0x0038
            X.1ZY r9 = r0.A02()
        L_0x0019:
            X.AnonymousClass00B.A06(r9)
            X.1Yb r0 = X.C28851Ya.A02(r9)
            java.lang.String r5 = r4.A0K
            X.1dH r8 = new X.1dH
            r8.<init>(r0, r5)
            X.11s r2 = r4.A05
            X.1iD r0 = r4.A0F
            byte[] r23 = r0.A02()
            X.0xT r0 = r2.A0I
            java.util.concurrent.locks.Lock r16 = r0.A03(r8)
            if (r16 != 0) goto L_0x0046
            goto L_0x0040
        L_0x0038:
            r0.A0B()
            X.1Za r9 = r0.A04
            goto L_0x0019
        L_0x003e:
            r3 = 0
            goto L_0x000c
        L_0x0040:
            X.16P r0 = r2.A0H     // Catch:{ all -> 0x015a }
            r0.A00()     // Catch:{ all -> 0x015a }
            goto L_0x0049
        L_0x0046:
            r16.lock()     // Catch:{ all -> 0x015a }
        L_0x0049:
            X.0pd r6 = r2.A0L     // Catch:{ all -> 0x015a }
            r1 = 189(0xbd, float:2.65E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x015a }
            boolean r0 = r6.A0E(r0, r1)     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x00fe
            X.1mp r0 = r2.A01     // Catch:{ all -> 0x015a }
            com.whatsapp.wamsys.JniBridge r7 = r0.A03     // Catch:{ all -> 0x015a }
            java.lang.String r15 = r8.A01     // Catch:{ all -> 0x015a }
            X.1Yb r6 = r8.A00     // Catch:{ all -> 0x015a }
            java.lang.String r21 = X.C31811f4.A01(r6)     // Catch:{ all -> 0x015a }
            int r0 = r6.A00     // Catch:{ all -> 0x015a }
            long r13 = (long) r0     // Catch:{ all -> 0x015a }
            java.util.concurrent.atomic.AtomicReference r0 = r7.wajContext     // Catch:{ all -> 0x015a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x015a }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ all -> 0x015a }
            r10 = 1
            r17 = 1
            r18 = r13
            r20 = r15
            r22 = r0
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOO(r17, r18, r20, r21, r22)     // Catch:{ all -> 0x015a }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x015a }
            X.4Bk r0 = new X.4Bk     // Catch:{ all -> 0x015a }
            r0.<init>(r1)     // Catch:{ all -> 0x015a }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x015a }
            com.facebook.simplejni.NativeHolder r12 = r0.A00     // Catch:{ all -> 0x015a }
            r0 = 54
            long r0 = (long) r0     // Catch:{ all -> 0x015a }
            r11 = 0
            java.lang.Object r11 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r11, r0, r12)     // Catch:{ all -> 0x015a }
            byte[] r11 = (byte[]) r11     // Catch:{ all -> 0x015a }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x015a }
            r0 = 56
            long r0 = (long) r0     // Catch:{ all -> 0x015a }
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r10, r0, r12)     // Catch:{ all -> 0x015a }
            int r10 = (int) r0     // Catch:{ all -> 0x015a }
            X.1n0 r0 = new X.1n0     // Catch:{ all -> 0x015a }
            r0.<init>(r11, r10)     // Catch:{ all -> 0x015a }
            int r10 = r0.A00     // Catch:{ all -> 0x015a }
            if (r10 == 0) goto L_0x00b6
            java.lang.String r0 = "wamsys/encryptForGroup createSenderKeyDistributionMessage returned status="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x015a }
            r1.append(r10)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "; address="
            java.lang.String r0 = X.AnonymousClass000.A0e(r8, r0, r1)     // Catch:{ all -> 0x015a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x015a }
        L_0x00b6:
            java.lang.String r21 = X.C31811f4.A01(r6)     // Catch:{ all -> 0x015a }
            java.util.concurrent.atomic.AtomicReference r0 = r7.wajContext     // Catch:{ all -> 0x015a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x015a }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ all -> 0x015a }
            r7 = 0
            r17 = 0
            r22 = r0
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOO(r17, r18, r20, r21, r22, r23)     // Catch:{ all -> 0x015a }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x015a }
            X.1nR r0 = new X.1nR     // Catch:{ all -> 0x015a }
            r0.<init>(r1)     // Catch:{ all -> 0x015a }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x015a }
            com.facebook.simplejni.NativeHolder r6 = r0.A00     // Catch:{ all -> 0x015a }
            r0 = 49
            long r0 = (long) r0     // Catch:{ all -> 0x015a }
            java.lang.Object r7 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r7, r0, r6)     // Catch:{ all -> 0x015a }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x015a }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x015a }
            r0 = 50
            long r0 = (long) r0     // Catch:{ all -> 0x015a }
            r8 = 1
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r8, r0, r6)     // Catch:{ all -> 0x015a }
            int r8 = (int) r0     // Catch:{ all -> 0x015a }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x015a }
            r0 = 51
            long r0 = (long) r0     // Catch:{ all -> 0x015a }
            r10 = 1
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r10, r0, r6)     // Catch:{ all -> 0x015a }
            int r6 = (int) r0     // Catch:{ all -> 0x015a }
            X.1nS r11 = new X.1nS     // Catch:{ all -> 0x015a }
            r11.<init>(r7, r8, r6)     // Catch:{ all -> 0x015a }
            goto L_0x0173
        L_0x00fe:
            X.1mo r0 = r2.A00     // Catch:{ all -> 0x015a }
            X.16P r11 = r0.A02     // Catch:{ all -> 0x015a }
            boolean r1 = r11.A01()     // Catch:{ all -> 0x015a }
            X.1mn r0 = r0.A00     // Catch:{ all -> 0x015a }
            X.1mu r7 = r0.A02     // Catch:{ all -> 0x015a }
            X.1mv r6 = new X.1mv     // Catch:{ all -> 0x015a }
            r6.<init>(r7)     // Catch:{ all -> 0x015a }
            X.1mw r0 = X.C31811f4.A02(r8)     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x0120
            java.lang.Object r1 = X.C36071mx.A02     // Catch:{ all -> 0x015a }
            monitor-enter(r1)     // Catch:{ all -> 0x015a }
            r6.A00(r0)     // Catch:{ all -> 0x011d }
            monitor-exit(r1)     // Catch:{ all -> 0x011d }
            goto L_0x0123
        L_0x011d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x011d }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x0120:
            r6.A00(r0)     // Catch:{ all -> 0x015a }
        L_0x0123:
            X.1mw r0 = X.C31811f4.A02(r8)     // Catch:{ all -> 0x015a }
            X.1mx r10 = new X.1mx     // Catch:{ all -> 0x015a }
            r10.<init>(r7, r0)     // Catch:{ all -> 0x015a }
            r8 = 0
            r7 = 0
            byte[] r1 = X.C35981mo.A03(r23)     // Catch:{ 1nJ -> 0x0152, 1n4 -> 0x014f }
            boolean r0 = r11.A01()     // Catch:{ 1nJ -> 0x0152, 1n4 -> 0x014f }
            if (r0 == 0) goto L_0x0144
            java.lang.Object r6 = X.C36071mx.A02     // Catch:{ 1nJ -> 0x0152, 1n4 -> 0x014f }
            monitor-enter(r6)     // Catch:{ 1nJ -> 0x0152, 1n4 -> 0x014f }
            byte[] r1 = r10.A01(r1)     // Catch:{ all -> 0x0141 }
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            goto L_0x0148
        L_0x0141:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            throw r0     // Catch:{ 1nJ -> 0x0152, 1n4 -> 0x014f }
        L_0x0144:
            byte[] r1 = r10.A01(r1)     // Catch:{ 1nJ -> 0x0152, 1n4 -> 0x014f }
        L_0x0148:
            r0 = 3
            X.1nS r11 = new X.1nS     // Catch:{ 1nJ -> 0x0152, 1n4 -> 0x014f }
            r11.<init>(r1, r0, r7)     // Catch:{ 1nJ -> 0x0152, 1n4 -> 0x014f }
            goto L_0x0173
        L_0x014f:
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            goto L_0x0154
        L_0x0152:
            r0 = -1002(0xfffffffffffffc16, float:NaN)
        L_0x0154:
            X.1nS r11 = new X.1nS     // Catch:{ all -> 0x015a }
            r11.<init>(r8, r7, r0)     // Catch:{ all -> 0x015a }
            goto L_0x0173
        L_0x015a:
            r0 = move-exception
            if (r16 == 0) goto L_0x0172
            r16.unlock()
            throw r0
        L_0x0161:
            if (r1 == 0) goto L_0x01c4
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r1 == r0) goto L_0x01c4
            java.lang.String r0 = "Error when calling signalCoordinator.encryptForGroup(); status="
            java.lang.String r1 = X.C13680ns.A0c(r1, r0)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
        L_0x0172:
            throw r0
        L_0x0173:
            if (r16 == 0) goto L_0x0178
            r16.unlock()
        L_0x0178:
            X.0w1 r10 = r4.A04
            X.0tZ r8 = r4.A0G
            r12 = 0
            int r7 = r4.A01
            int r1 = r11.A01
            r6 = 1
            if (r1 != 0) goto L_0x01c5
            r16 = 0
        L_0x0186:
            int r0 = r4.A00
            r14 = r8
            r15 = r7
            r17 = r0
            r13 = r3
            r10.A0C(r11, r12, r13, r14, r15, r16, r17)
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r1 != r0) goto L_0x0161
            java.lang.String r0 = "sende2emessagejob/group cipher has invalid sender key"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r4.A0I
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Yb r1 = X.C28851Ya.A02(r9)
            X.1dH r0 = new X.1dH
            r0.<init>(r1, r5)
            boolean r0 = r2.A0g(r0, r6)
            if (r0 == 0) goto L_0x01bb
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A0H(r3, r0)
        L_0x01bb:
            X.0sO r1 = r4.A07
            X.1cE r0 = X.C16070sO.A00(r1, r3)
            r1.A04(r0)
        L_0x01c4:
            return r11
        L_0x01c5:
            X.4So r0 = r4.A0C
            int r0 = r0.A01(r9)
            int r16 = r0 + 1
            goto L_0x0186
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ak.A01():X.1nS");
    }

    public final C36381nS A02(DeviceJid deviceJid) {
        if (deviceJid.device == 0 || this.A0E.A00().contains(deviceJid)) {
            C28381Vw r3 = this.A0H;
            UserJid of = UserJid.of(r3.A00);
            AnonymousClass3B8 r4 = this.A0D;
            C33211iD r2 = this.A0F;
            String str = this.A0J;
            if (TextUtils.isEmpty(str)) {
                str = this.A0K;
            }
            C33211iD A022 = r4.A02(deviceJid, r2, r3, str);
            if (of == null) {
                of = deviceJid.getUserJid();
            }
            AnonymousClass27R A042 = r4.A02.A04(of);
            if (A042 != null) {
                C28581Wr A0U = C33211iD.A0o.A0U();
                A0U.A04(A022);
                C33221iE r0 = (C33221iE) A0U;
                C41061vA.A0B(A042, r0);
                A022 = (C33211iD) r0.A02();
            }
            int A032 = this.A0A.A03(C16620tM.A02, 1723);
            if (A032 != -1) {
                A022 = AnonymousClass3B8.A00(A022, A032);
            }
            return A03(deviceJid, A022, this.A0G);
        }
        StringBuilder A0r = AnonymousClass000.A0r("sende2emessagejob/");
        A0r.append(deviceJid);
        Log.w(AnonymousClass000.A0h(" identity has changed, dropping the message", A0r));
        return null;
    }

    public final C36381nS A03(DeviceJid deviceJid, C33211iD r11, C16740tZ r12) {
        DeviceJid deviceJid2 = deviceJid;
        C36381nS A092 = this.A05.A09(C28851Ya.A02(deviceJid), r11.A02());
        if (deviceJid.device == 0 || this.A0E.A00().contains(deviceJid)) {
            this.A04.A0C(A092, deviceJid2, this.A0B, r12, this.A01, A092.A01 == 0 ? 0 : this.A0C.A01(deviceJid) + 1, this.A00);
            return A092;
        }
        StringBuilder A0r = AnonymousClass000.A0r("sende2emessagejob/");
        A0r.append(deviceJid);
        Log.w(AnonymousClass000.A0h(" identity has changed, ignoring encryption failure", A0r));
        return null;
    }

    public C36101n0 A04() {
        DeviceJid deviceJid;
        boolean z2 = this.A0M;
        C16040sK r0 = this.A03;
        if (z2) {
            deviceJid = r0.A02();
        } else {
            r0.A0B();
            deviceJid = r0.A04;
        }
        AnonymousClass00B.A06(deviceJid);
        return this.A05.A0C(new C30981dH(C28851Ya.A02(deviceJid), this.A0K));
    }

    public C33211iD A05(C36101n0 r6, AnonymousClass27R r7, String str) {
        byte[] bArr = r6.A01;
        AnonymousClass00B.A06(bArr);
        C33211iD r3 = C33211iD.A0o;
        C58472tY r0 = ((C33211iD) r3.A0U().A00).A0h;
        if (r0 == null) {
            r0 = C58472tY.A03;
        }
        C69623fL r2 = (C69623fL) r0.A0U();
        r2.A06(this.A0K);
        r2.A05(C28631Ww.A01(bArr, 0, bArr.length));
        C33221iE r02 = (C33221iE) r3.A0U();
        r02.A0B(r2);
        C41061vA.A0B(r7, r02);
        C33211iD r1 = (C33211iD) r02.A02();
        return str != null ? AnonymousClass3B8.A01(r1, (String) null, str) : r1;
    }

    public final String A06(Collection collection) {
        HashSet A0o = C13680ns.A0o();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid userJid = ((DeviceJid) it.next()).getUserJid();
            if (!this.A03.A0I(userJid)) {
                A0o.add(userJid.getPrimaryDevice());
            }
        }
        return C37431p9.A00(A0o);
    }

    public Map A07(Collection collection) {
        HashMap A0x = AnonymousClass000.A0x();
        if (!collection.isEmpty()) {
            if (this.A0N) {
                A0A(collection, A0x);
            } else {
                AnonymousClass16P r2 = this.A06;
                r2.A00.submit(new RunnableRunnableShape3S0300000_I1(this, collection, A0x, 30)).get();
                return A0x;
            }
        }
        return A0x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r6 != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A08(java.util.Map r18) {
        /*
            r17 = this;
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            java.util.HashMap r6 = X.AnonymousClass000.A0x()
            r4 = r17
            boolean r0 = r4.A0N
            r5 = r18
            if (r0 == 0) goto L_0x008d
            r4.A0B(r5, r6)
        L_0x0014:
            java.util.Iterator r8 = X.C13690nt.A0j(r6)
            r2 = 0
            r1 = r2
        L_0x001a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.util.Map$Entry r6 = X.AnonymousClass000.A0z(r8)
            java.lang.Object r0 = r6.getKey()
            X.1Yb r0 = (X.C28861Yb) r0
            com.whatsapp.jid.DeviceJid r11 = X.C28851Ya.A03(r0)
            X.AnonymousClass00B.A06(r11)
            java.lang.Object r10 = r6.getValue()
            X.1nS r10 = (X.C36381nS) r10
            int r7 = r10.A01
            if (r7 == 0) goto L_0x008b
            if (r1 != 0) goto L_0x0043
            X.2Pd r0 = r4.A0E
            java.util.Collection r1 = r0.A00()
        L_0x0043:
            boolean r6 = r1.contains(r11)
            if (r6 == 0) goto L_0x005b
        L_0x0049:
            X.0w1 r9 = r4.A04
            X.0tZ r13 = r4.A0G
            com.whatsapp.jid.Jid r12 = r4.A0B
            int r14 = r4.A01
            if (r7 != 0) goto L_0x0082
            r15 = 0
        L_0x0054:
            int r0 = r4.A00
            r16 = r0
            r9.A0C(r10, r11, r12, r13, r14, r15, r16)
        L_0x005b:
            X.1d1 r0 = A00(r10)
            if (r0 == 0) goto L_0x0065
            r3.put(r11, r0)
            goto L_0x001a
        L_0x0065:
            byte r0 = r11.device
            if (r0 != 0) goto L_0x0077
            if (r6 == 0) goto L_0x0077
            X.4So r0 = r4.A0C
            int r0 = r0.A00(r11)
            com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r1 = new com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException
            r1.<init>(r11, r0)
            throw r1
        L_0x0077:
            java.lang.String r0 = "sende2emessagejob/encryptMessages/dropping message due to encryption failure for "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r11)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x001a
        L_0x0082:
            X.4So r0 = r4.A0C
            int r0 = r0.A01(r11)
            int r15 = r0 + 1
            goto L_0x0054
        L_0x008b:
            r6 = 1
            goto L_0x0049
        L_0x008d:
            X.16P r2 = r4.A06
            r0 = 31
            com.facebook.redex.RunnableRunnableShape3S0300000_I1 r1 = new com.facebook.redex.RunnableRunnableShape3S0300000_I1
            r1.<init>(r4, r5, r6, r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00
            java.util.concurrent.Future r0 = r0.submit(r1)
            r0.get()
            goto L_0x0014
        L_0x00a1:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "sende2emessagejob/encryptMessages/no encrypted messages due to encryption failures"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 4
            com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r1 = new com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException
            r1.<init>(r2, r0)
            throw r1
        L_0x00ba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ak.A08(java.util.Map):java.util.Map");
    }

    public final void A09(C34841kx r21, Collection collection, Map map) {
        C16040sK r6 = this.A03;
        r6.A0B();
        AnonymousClass1ZT r9 = r6.A05;
        AnonymousClass00B.A06(r9);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            Map map2 = map;
            if (!map2.containsKey(deviceJid)) {
                Object obj = null;
                if (!r6.A0J(deviceJid)) {
                    UserJid userJid = deviceJid.getUserJid();
                    AnonymousClass1WV r0 = (AnonymousClass1WV) this.A0L.get(userJid.getPrimaryDevice().getRawString());
                    if (r0 != null) {
                        byte[] bArr = this.A0O;
                        int i2 = r0.expiration;
                        C82124Bh r02 = new C82124Bh((NativeHolder) JniBridge.jvidispatchOII((long) i2, C13690nt.A09(r0.ephemeralSettingTimestamp)));
                        String rawString = userJid.getRawString();
                        String rawString2 = r9.getRawString();
                        NativeHolder nativeHolder = r02.A00;
                        obj = JniBridge.jvidispatchOOOOOOO(0, rawString, rawString2, (Object) null, nativeHolder, bArr, r21.getRawString());
                        if (obj == null) {
                            Log.e("sende2emessagejob/failed to encrypt broadcast setting");
                            throw new E2eMessageEncryptor$EncryptionFailException(deviceJid, this.A0C.A00(deviceJid));
                        }
                    } else {
                        Log.e("sende2emessagejob/missing broadcast setting");
                        throw new E2eMessageEncryptor$UnrecoverableErrorException(deviceJid);
                    }
                }
                map2.put(deviceJid, obj);
            }
        }
    }

    public final void A0A(Collection collection, Map map) {
        collection.retainAll(this.A0E.A00());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            C28381Vw r3 = this.A0H;
            UserJid of = UserJid.of(r3.A00);
            AnonymousClass3B8 r5 = this.A0D;
            C33211iD r2 = this.A0F;
            String str = this.A0J;
            if (TextUtils.isEmpty(str)) {
                str = this.A0K;
            }
            C33211iD A022 = r5.A02(deviceJid, r2, r3, str);
            if (of == null) {
                of = deviceJid.getUserJid();
            }
            AnonymousClass27R A042 = r5.A02.A04(of);
            if (A042 != null) {
                C28581Wr A0U = C33211iD.A0o.A0U();
                A0U.A04(A022);
                C33221iE r0 = (C33221iE) A0U;
                C41061vA.A0B(A042, r0);
                A022 = (C33211iD) r0.A02();
            }
            int A032 = this.A0A.A03(C16620tM.A02, 1723);
            if (A032 != -1) {
                A022 = AnonymousClass3B8.A00(A022, A032);
            }
            C30821d1 A002 = A00(A03(deviceJid, A022, this.A0G));
            if (A002 != null) {
                map.put(deviceJid, A002);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(java.util.Map r6, java.util.Map r7) {
        /*
            r5 = this;
            java.util.HashMap r4 = X.AnonymousClass000.A0x()
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r6)
        L_0x0008:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.util.Map$Entry r2 = X.AnonymousClass000.A0z(r3)
            java.lang.Object r0 = r2.getKey()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.1Yb r1 = X.C28851Ya.A02(r0)
            java.lang.Object r0 = r2.getValue()
            X.1Wn r0 = (X.C28551Wn) r0
            byte[] r0 = r0.A02()
            r4.put(r1, r0)
            goto L_0x0008
        L_0x002a:
            X.11s r3 = r5.A05
            X.0xT r0 = r3.A0I
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x003a
            java.util.Map r0 = r3.A0L(r4)
        L_0x0036:
            r7.putAll(r0)
            return
        L_0x003a:
            X.01d r0 = r3.A0K
            X.0tf r2 = r0.A02()
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x0057 }
            java.util.Map r0 = r3.A0L(r4)     // Catch:{ all -> 0x0052 }
            r1.A00()     // Catch:{ all -> 0x0052 }
            r1.close()     // Catch:{ all -> 0x0057 }
            r2.close()
            goto L_0x0036
        L_0x0052:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ak.A0B(java.util.Map, java.util.Map):void");
    }
}
