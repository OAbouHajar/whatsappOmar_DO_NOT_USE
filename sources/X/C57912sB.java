package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2sB  reason: invalid class name and case insensitive filesystem */
public final class C57912sB extends C437121f implements AnonymousClass5SQ {
    public C63573Ke A00;
    public C15590rW A01 = null;
    public Integer A02 = null;
    public Set A03 = C13680ns.A0o();
    public final int A04;
    public final Context A05;
    public final Looper A06;
    public final C57892s9 A07;
    public final AnonymousClass3WP A08;
    public final AnonymousClass4C0 A09 = new AnonymousClass4C0();
    public final C66303Yv A0A;
    public final C87954Zi A0B;
    public final AnonymousClass4O1 A0C;
    public final C108425Nx A0D;
    public final AnonymousClass3CK A0E;
    public final ArrayList A0F;
    public final Map A0G;
    public final Map A0H;
    public final Queue A0I = new LinkedList();
    public final Lock A0J;
    public volatile boolean A0K;

    public C57912sB(Context context, Looper looper, C57892s9 r11, AnonymousClass3WP r12, AnonymousClass4O1 r13, ArrayList arrayList, List list, List list2, Map map, Map map2, Lock lock) {
        C98054r1 r1 = new C98054r1(this);
        this.A0D = r1;
        this.A05 = context;
        this.A0J = lock;
        this.A0E = new AnonymousClass3CK(looper, r1);
        this.A06 = looper;
        this.A0A = new C66303Yv(looper, this);
        this.A07 = r11;
        this.A04 = -1;
        this.A0H = map;
        this.A0G = map2;
        this.A0F = arrayList;
        this.A0B = new C87954Zi();
        for (Object next : list) {
            AnonymousClass3CK r5 = this.A0E;
            C13710nw.A01(next);
            synchronized (r5.A03) {
                ArrayList arrayList2 = r5.A05;
                if (arrayList2.contains(next)) {
                    String valueOf = String.valueOf(next);
                    StringBuilder A0g = C13690nt.A0g(valueOf.length() + 62);
                    A0g.append("registerConnectionCallbacks(): listener ");
                    A0g.append(valueOf);
                    Log.w("GmsClientEvents", AnonymousClass000.A0h(" is already registered", A0g));
                } else {
                    arrayList2.add(next);
                }
            }
            if (r5.A02.isConnected()) {
                Handler handler = r5.A01;
                handler.sendMessage(handler.obtainMessage(1, next));
            }
        }
        for (Object next2 : list2) {
            AnonymousClass3CK r0 = this.A0E;
            C13710nw.A01(next2);
            synchronized (r0.A03) {
                ArrayList arrayList3 = r0.A06;
                if (arrayList3.contains(next2)) {
                    String valueOf2 = String.valueOf(next2);
                    StringBuilder A0g2 = C13690nt.A0g(valueOf2.length() + 67);
                    A0g2.append("registerConnectionFailedListener(): listener ");
                    A0g2.append(valueOf2);
                    Log.w("GmsClientEvents", AnonymousClass000.A0h(" is already registered", A0g2));
                } else {
                    arrayList3.add(next2);
                }
            }
        }
        this.A0C = r13;
        this.A08 = r12;
    }

    public static /* bridge */ /* synthetic */ void A00(C57912sB r2) {
        Lock lock = r2.A0J;
        lock.lock();
        try {
            if (r2.A0K) {
                r2.A0A();
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f A[Catch:{ all -> 0x0229, all -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089 A[Catch:{ all -> 0x0229, all -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8 A[Catch:{ all -> 0x0229, all -> 0x0236 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r29 = this;
            r12 = r29
            java.util.concurrent.locks.Lock r0 = r12.A0J
            r27 = r0
            r27.lock()
            int r0 = r12.A04     // Catch:{ all -> 0x0236 }
            r3 = 2
            r5 = 0
            r2 = 1
            if (r0 < 0) goto L_0x001c
            java.lang.Integer r0 = r12.A02     // Catch:{ all -> 0x0236 }
            boolean r1 = X.AnonymousClass000.A1V(r0)
            java.lang.String r0 = "Sign-in mode should have been set explicitly by auto-manage."
            X.C13710nw.A04(r0, r1)     // Catch:{ all -> 0x0236 }
            goto L_0x0055
        L_0x001c:
            java.lang.Integer r0 = r12.A02     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x0042
            java.util.Map r0 = r12.A0G     // Catch:{ all -> 0x0236 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0236 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0236 }
            r1 = 0
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0236 }
            X.0rn r0 = (X.C15750rn) r0     // Catch:{ all -> 0x0236 }
            boolean r0 = r0.AcM()     // Catch:{ all -> 0x0236 }
            r1 = r1 | r0
            goto L_0x002b
        L_0x003d:
            r0 = 3
            if (r1 == 0) goto L_0x004f
            r0 = 1
            goto L_0x004f
        L_0x0042:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0236 }
            if (r0 != r3) goto L_0x0055
            java.lang.String r0 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0236 }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x0236 }
        L_0x004f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0236 }
            r12.A02 = r0     // Catch:{ all -> 0x0236 }
        L_0x0055:
            java.lang.Integer r0 = r12.A02     // Catch:{ all -> 0x0236 }
            X.C13710nw.A01(r0)     // Catch:{ all -> 0x0236 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0236 }
            r27.lock()     // Catch:{ all -> 0x0236 }
            r4 = 3
            if (r0 == r4) goto L_0x006a
            if (r0 == r2) goto L_0x006a
            if (r0 == r3) goto L_0x006b
            r3 = r0
            goto L_0x006c
        L_0x006a:
            r3 = r0
        L_0x006b:
            r5 = 1
        L_0x006c:
            r0 = 33
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = "Illegal sign-in mode: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r3)     // Catch:{ all -> 0x0229 }
            X.C13710nw.A03(r0, r5)     // Catch:{ all -> 0x0229 }
            java.lang.Integer r0 = r12.A02     // Catch:{ all -> 0x0229 }
            if (r0 != 0) goto L_0x00a8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0229 }
            r12.A02 = r0     // Catch:{ all -> 0x0229 }
        L_0x0085:
            X.0rW r0 = r12.A01     // Catch:{ all -> 0x0229 }
            if (r0 != 0) goto L_0x01d4
            java.util.Map r4 = r12.A0G     // Catch:{ all -> 0x0229 }
            java.util.Iterator r6 = X.C13680ns.A0q(r4)     // Catch:{ all -> 0x0229 }
            r5 = 0
            r3 = 0
        L_0x0091:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0229 }
            X.0rn r1 = (X.C15750rn) r1     // Catch:{ all -> 0x0229 }
            boolean r0 = r1.AcM()     // Catch:{ all -> 0x0229 }
            r5 = r5 | r0
            boolean r0 = r1.Aav()     // Catch:{ all -> 0x0229 }
            r3 = r3 | r0
            goto L_0x0091
        L_0x00a8:
            int r1 = r0.intValue()     // Catch:{ all -> 0x0229 }
            if (r1 == r3) goto L_0x0085
            goto L_0x01d8
        L_0x00b0:
            java.lang.Integer r0 = r12.A02     // Catch:{ all -> 0x0229 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0229 }
            if (r1 == r2) goto L_0x0181
            r0 = 2
            if (r1 != r0) goto L_0x018d
            if (r5 == 0) goto L_0x018d
            android.content.Context r0 = r12.A05     // Catch:{ all -> 0x0229 }
            r28 = r0
            android.os.Looper r15 = r12.A06     // Catch:{ all -> 0x0229 }
            X.2s9 r14 = r12.A07     // Catch:{ all -> 0x0229 }
            X.4O1 r13 = r12.A0C     // Catch:{ all -> 0x0229 }
            java.util.Map r1 = r12.A0H     // Catch:{ all -> 0x0229 }
            X.3WP r11 = r12.A08     // Catch:{ all -> 0x0229 }
            java.util.ArrayList r10 = r12.A0F     // Catch:{ all -> 0x0229 }
            X.00N r9 = new X.00N     // Catch:{ all -> 0x0229 }
            r9.<init>()     // Catch:{ all -> 0x0229 }
            X.00N r8 = new X.00N     // Catch:{ all -> 0x0229 }
            r8.<init>()     // Catch:{ all -> 0x0229 }
            java.util.Iterator r6 = X.AnonymousClass000.A0y(r4)     // Catch:{ all -> 0x0229 }
            r18 = 0
        L_0x00dd:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x0107
            java.util.Map$Entry r5 = X.AnonymousClass000.A0z(r6)     // Catch:{ all -> 0x0229 }
            java.lang.Object r4 = r5.getValue()     // Catch:{ all -> 0x0229 }
            X.0rn r4 = (X.C15750rn) r4     // Catch:{ all -> 0x0229 }
            boolean r0 = r4.Aav()     // Catch:{ all -> 0x0229 }
            if (r2 != r0) goto L_0x00f5
            r18 = r4
        L_0x00f5:
            boolean r3 = r4.AcM()     // Catch:{ all -> 0x0229 }
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x0229 }
            if (r3 == 0) goto L_0x0103
            r9.put(r0, r4)     // Catch:{ all -> 0x0229 }
            goto L_0x00dd
        L_0x0103:
            r8.put(r0, r4)     // Catch:{ all -> 0x0229 }
            goto L_0x00dd
        L_0x0107:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0229 }
            r2 = r0 ^ 1
            java.lang.String r0 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            X.C13710nw.A04(r0, r2)     // Catch:{ all -> 0x0229 }
            X.00N r7 = new X.00N     // Catch:{ all -> 0x0229 }
            r7.<init>()     // Catch:{ all -> 0x0229 }
            X.00N r6 = new X.00N     // Catch:{ all -> 0x0229 }
            r6.<init>()     // Catch:{ all -> 0x0229 }
            java.util.Iterator r4 = X.C13700nu.A0I(r1)     // Catch:{ all -> 0x0229 }
        L_0x0120:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x0152
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0229 }
            X.21l r2 = (X.C437721l) r2     // Catch:{ all -> 0x0229 }
            X.458 r3 = r2.A01     // Catch:{ all -> 0x0229 }
            boolean r0 = r9.containsKey(r3)     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0229 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x0120
        L_0x013c:
            boolean r0 = r8.containsKey(r3)     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0229 }
            r6.put(r2, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x0120
        L_0x014a:
            java.lang.String r0 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0229 }
            goto L_0x0228
        L_0x0152:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0229 }
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0229 }
            int r3 = r10.size()     // Catch:{ all -> 0x0229 }
            r2 = 0
        L_0x015f:
            if (r2 >= r3) goto L_0x01b6
            java.lang.Object r1 = r10.get(r2)     // Catch:{ all -> 0x0229 }
            X.4qj r1 = (X.C97874qj) r1     // Catch:{ all -> 0x0229 }
            X.21l r0 = r1.A01     // Catch:{ all -> 0x0229 }
            boolean r0 = r7.containsKey(r0)     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x0173
            r5.add(r1)     // Catch:{ all -> 0x0229 }
            goto L_0x017e
        L_0x0173:
            X.21l r0 = r1.A01     // Catch:{ all -> 0x0229 }
            boolean r0 = r6.containsKey(r0)     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x0222
            r4.add(r1)     // Catch:{ all -> 0x0229 }
        L_0x017e:
            int r2 = r2 + 1
            goto L_0x015f
        L_0x0181:
            if (r5 == 0) goto L_0x01af
            if (r3 == 0) goto L_0x018d
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0229 }
            goto L_0x0228
        L_0x018d:
            android.content.Context r8 = r12.A05     // Catch:{ all -> 0x0229 }
            android.os.Looper r6 = r12.A06     // Catch:{ all -> 0x0229 }
            X.2s9 r5 = r12.A07     // Catch:{ all -> 0x0229 }
            X.4O1 r3 = r12.A0C     // Catch:{ all -> 0x0229 }
            java.util.Map r2 = r12.A0H     // Catch:{ all -> 0x0229 }
            X.3WP r1 = r12.A08     // Catch:{ all -> 0x0229 }
            java.util.ArrayList r0 = r12.A0F     // Catch:{ all -> 0x0229 }
            X.3EC r7 = new X.3EC     // Catch:{ all -> 0x0229 }
            r9 = r6
            r10 = r5
            r11 = r1
            r13 = r12
            r14 = r3
            r15 = r0
            r16 = r4
            r17 = r2
            r18 = r27
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0229 }
            r12.A01 = r7     // Catch:{ all -> 0x0229 }
            goto L_0x01d4
        L_0x01af:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0229 }
            goto L_0x0228
        L_0x01b6:
            X.0rV r0 = new X.0rV     // Catch:{ all -> 0x0229 }
            r22 = r4
            r23 = r9
            r24 = r8
            r25 = r7
            r26 = r6
            r19 = r12
            r20 = r13
            r21 = r5
            r16 = r14
            r17 = r11
            r13 = r0
            r14 = r28
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0229 }
            r12.A01 = r0     // Catch:{ all -> 0x0229 }
        L_0x01d4:
            r12.A0A()     // Catch:{ all -> 0x0229 }
            goto L_0x022f
        L_0x01d8:
            if (r3 == r2) goto L_0x01e8
            r0 = 2
            if (r3 == r0) goto L_0x01e5
            if (r3 == r4) goto L_0x01e2
            java.lang.String r3 = "UNKNOWN"
            goto L_0x01ea
        L_0x01e2:
            java.lang.String r3 = "SIGN_IN_MODE_NONE"
            goto L_0x01ea
        L_0x01e5:
            java.lang.String r3 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x01ea
        L_0x01e8:
            java.lang.String r3 = "SIGN_IN_MODE_REQUIRED"
        L_0x01ea:
            if (r1 == r2) goto L_0x01f8
            r0 = 2
            if (r1 == r0) goto L_0x01f5
            if (r1 == r4) goto L_0x01f2
            goto L_0x01fb
        L_0x01f2:
            java.lang.String r2 = "SIGN_IN_MODE_NONE"
            goto L_0x01fd
        L_0x01f5:
            java.lang.String r2 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x01fd
        L_0x01f8:
            java.lang.String r2 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x01fd
        L_0x01fb:
            java.lang.String r2 = "UNKNOWN"
        L_0x01fd:
            int r0 = r3.length()     // Catch:{ all -> 0x0229 }
            int r1 = r0 + 51
            int r0 = r2.length()     // Catch:{ all -> 0x0229 }
            int r1 = r1 + r0
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r1)     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = "Cannot use sign-in mode: "
            r1.append(r0)     // Catch:{ all -> 0x0229 }
            r1.append(r3)     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = ". Mode was already set to "
            r1.append(r0)     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ all -> 0x0229 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0229 }
            goto L_0x0228
        L_0x0222:
            java.lang.String r0 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x0229 }
        L_0x0228:
            throw r0     // Catch:{ all -> 0x0229 }
        L_0x0229:
            r0 = move-exception
            r27.unlock()     // Catch:{ all -> 0x0236 }
            goto L_0x004e
        L_0x022f:
            r27.unlock()     // Catch:{ all -> 0x0236 }
            r27.unlock()
            return
        L_0x0236:
            r0 = move-exception
            r27.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57912sB.A08():void");
    }

    public final String A09() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append("").append("mContext=").println(this.A05);
        printWriter.append("").append("mResuming=").print(this.A0K);
        printWriter.append(" mWorkQueue.size()=").print(this.A0I.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A0B.A01.size());
        C15590rW r0 = this.A01;
        if (r0 != null) {
            r0.Aig("", (FileDescriptor) null, printWriter, (String[]) null);
        }
        return stringWriter.toString();
    }

    public final void A0A() {
        this.A0E.A08 = true;
        C15590rW r0 = this.A01;
        C13710nw.A01(r0);
        r0.Aie();
    }

    public final boolean A0B() {
        boolean z2 = false;
        if (this.A0K) {
            this.A0K = false;
            C66303Yv r1 = this.A0A;
            r1.removeMessages(2);
            z2 = true;
            r1.removeMessages(1);
            C63573Ke r0 = this.A00;
            if (r0 != null) {
                r0.A00();
                this.A00 = null;
            }
        }
        return z2;
    }

    public final void AiO(C15700rh r9) {
        AtomicInteger atomicInteger;
        Context context = this.A05;
        int i2 = r9.A01;
        if (i2 != 18 && (i2 != 1 || !C15040qE.A03(context))) {
            A0B();
        }
        if (!this.A0K) {
            AnonymousClass3CK r7 = this.A0E;
            Handler handler = r7.A01;
            if (Looper.myLooper() == handler.getLooper()) {
                handler.removeMessages(1);
                synchronized (r7.A03) {
                    ArrayList arrayList = r7.A06;
                    ArrayList A0n = C13680ns.A0n(arrayList);
                    atomicInteger = r7.A07;
                    int i3 = atomicInteger.get();
                    Iterator it = A0n.iterator();
                    while (it.hasNext()) {
                        C15670re r1 = (C15670re) it.next();
                        if (!r7.A08 || atomicInteger.get() != i3) {
                            break;
                        } else if (arrayList.contains(r1)) {
                            r1.onConnectionFailed(r9);
                        }
                    }
                }
                r7.A08 = false;
                atomicInteger.incrementAndGet();
                return;
            }
            throw AnonymousClass000.A0V("onConnectionFailure must only be called on the Handler thread");
        }
    }

    public final void AiQ(Bundle bundle) {
        IllegalStateException illegalStateException;
        while (true) {
            Queue queue = this.A0I;
            if (queue.isEmpty()) {
                break;
            }
            A03((C438121p) queue.remove());
        }
        AnonymousClass3CK r6 = this.A0E;
        Handler handler = r6.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            synchronized (r6.A03) {
                if (!r6.A00) {
                    handler.removeMessages(1);
                    r6.A00 = true;
                    ArrayList arrayList = r6.A04;
                    if (arrayList.isEmpty()) {
                        ArrayList A0n = C13680ns.A0n(r6.A05);
                        AtomicInteger atomicInteger = r6.A07;
                        int i2 = atomicInteger.get();
                        Iterator it = A0n.iterator();
                        while (it.hasNext()) {
                            C15650rc r1 = (C15650rc) it.next();
                            if (!r6.A08 || !r6.A02.isConnected() || atomicInteger.get() != i2) {
                                break;
                            } else if (!arrayList.contains(r1)) {
                                r1.onConnected(bundle);
                            }
                        }
                        arrayList.clear();
                        r6.A00 = false;
                    } else {
                        illegalStateException = new IllegalStateException();
                    }
                } else {
                    illegalStateException = new IllegalStateException();
                }
                throw illegalStateException;
            }
            return;
        }
        throw AnonymousClass000.A0V("onConnectionSuccess must only be called on the Handler thread");
    }

    public final void AiT(int i2, boolean z2) {
        AtomicInteger atomicInteger;
        if (i2 == 1) {
            if (!this.A0K) {
                this.A0K = true;
                if (this.A00 == null) {
                    try {
                        Context applicationContext = this.A05.getApplicationContext();
                        C65723Wi r3 = new C65723Wi(this);
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        C63573Ke r1 = new C63573Ke(r3);
                        applicationContext.registerReceiver(r1, intentFilter);
                        r1.A00 = applicationContext;
                        if (!C15040qE.A03(applicationContext)) {
                            r3.A00();
                            r1.A00();
                            r1 = null;
                        }
                        this.A00 = r1;
                    } catch (SecurityException unused) {
                    }
                }
                C66303Yv r32 = this.A0A;
                r32.sendMessageDelayed(r32.obtainMessage(1), 120000);
                r32.sendMessageDelayed(r32.obtainMessage(2), 5000);
            }
            i2 = 1;
        }
        for (BasePendingResult forceFailureUnlessReady : (BasePendingResult[]) this.A0B.A01.toArray(new BasePendingResult[0])) {
            forceFailureUnlessReady.forceFailureUnlessReady(C87954Zi.A02);
        }
        AnonymousClass3CK r6 = this.A0E;
        Handler handler = r6.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            handler.removeMessages(1);
            synchronized (r6.A03) {
                r6.A00 = true;
                ArrayList arrayList = r6.A05;
                ArrayList A0n = C13680ns.A0n(arrayList);
                atomicInteger = r6.A07;
                int i3 = atomicInteger.get();
                Iterator it = A0n.iterator();
                while (it.hasNext()) {
                    C15650rc r12 = (C15650rc) it.next();
                    if (!r6.A08 || atomicInteger.get() != i3) {
                        break;
                    } else if (arrayList.contains(r12)) {
                        r12.onConnectionSuspended(i2);
                    }
                }
                r6.A04.clear();
                r6.A00 = false;
            }
            r6.A08 = false;
            atomicInteger.incrementAndGet();
            if (i2 == 2) {
                A0A();
                return;
            }
            return;
        }
        throw AnonymousClass000.A0V("onUnintentionalDisconnection must only be called on the Handler thread");
    }
}
