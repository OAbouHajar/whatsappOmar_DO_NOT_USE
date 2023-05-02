package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.0rl  reason: invalid class name and case insensitive filesystem */
public final class C15730rl implements C15650rc, C15670re, C15740rm {
    public int A00 = 0;
    public C15700rh A01 = null;
    public boolean A02;
    public final int A03;
    public final C15750rn A04;
    public final C86834Ui A05;
    public final C612338c A06;
    public final C15600rX A07;
    public final List A08 = new ArrayList();
    public final Map A09 = new HashMap();
    public final Queue A0A = new LinkedList();
    public final Set A0B = new HashSet();
    public final /* synthetic */ AnonymousClass3CL A0C;

    public C15730rl(AnonymousClass2f2 r13, AnonymousClass3CL r14) {
        this.A0C = r14;
        Handler handler = r14.A06;
        Looper looper = handler.getLooper();
        C84594Ld A002 = r13.A00();
        C003001i r11 = A002.A00;
        AnonymousClass4O1 r6 = new AnonymousClass4O1(A002.A01, A002.A02, A002.A03, (Map) null, r11);
        AnonymousClass3WP r1 = r13.A04.A00;
        C13710nw.A01(r1);
        C15750rn A003 = r1.A00(r13.A01, looper, this, this, r6, r13.A03);
        String str = r13.A09;
        if (str != null && (A003 instanceof C15770rp)) {
            ((C15770rp) A003).A0R = str;
        }
        this.A04 = A003;
        this.A05 = r13.A06;
        this.A06 = new C612338c();
        this.A03 = r13.A00;
        if (A003.AcM()) {
            Context context = r14.A05;
            C84594Ld A004 = r13.A00();
            C003001i r112 = A004.A00;
            this.A07 = new C15600rX(context, handler, new AnonymousClass4O1(A004.A01, A004.A02, A004.A03, (Map) null, r112));
        }
    }

    public final void A00() {
        Queue queue = this.A0A;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C89334bz r1 = (C89334bz) arrayList.get(i2);
            if (this.A04.isConnected()) {
                if (A0C(r1)) {
                    queue.remove(r1);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void A01() {
        Handler handler = this.A0C.A06;
        C13710nw.A00(handler);
        this.A01 = null;
        A06(C15700rh.A04);
        if (this.A02) {
            C86834Ui r1 = this.A05;
            handler.removeMessages(11, r1);
            handler.removeMessages(9, r1);
            this.A02 = false;
        }
        Iterator it = this.A09.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("zaa");
        }
        A00();
        A02();
    }

    public final void A02() {
        AnonymousClass3CL r4 = this.A0C;
        Handler handler = r4.A06;
        C86834Ui r1 = this.A05;
        handler.removeMessages(12, r1);
        handler.sendMessageDelayed(handler.obtainMessage(12, r1), r4.A00);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.5UT, X.0rn] */
    public final void A03() {
        AnonymousClass3CL r5 = this.A0C;
        C13710nw.A00(r5.A06);
        C15750rn r4 = this.A04;
        if (!r4.isConnected() && !r4.AIg()) {
            try {
                int A002 = r5.A08.A00(r5.A05, r4);
                if (A002 != 0) {
                    C15700rh r7 = new C15700rh(A002, (PendingIntent) null);
                    String name = r4.getClass().getName();
                    String obj = r7.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    A07(r7, (Exception) null);
                    return;
                }
                AnonymousClass3ED r3 = new AnonymousClass3ED(r4, this.A05, r5);
                if (r4.AcM()) {
                    C15600rX r8 = this.A07;
                    C13710nw.A01(r8);
                    AnonymousClass5UT r0 = r8.A01;
                    if (r0 != null) {
                        r0.A80();
                    }
                    AnonymousClass4O1 r10 = r8.A05;
                    r10.A00 = Integer.valueOf(System.identityHashCode(r8));
                    AnonymousClass3WP r52 = r8.A04;
                    Context context = r8.A02;
                    Handler handler = r8.A03;
                    r8.A01 = r52.A00(context, handler.getLooper(), r8, r8, r10, r10.A01);
                    r8.A00 = r3;
                    Set set = r8.A06;
                    if (set == null || set.isEmpty()) {
                        handler.post(new RunnableRunnableShape1S0100000_I0((Object) r8, 10));
                    } else {
                        C15770rp r1 = (C15770rp) r8.A01;
                        r1.A6Y(new C98014qx(r1));
                    }
                }
                try {
                    r4.A6Y(r3);
                } catch (SecurityException e2) {
                    A07(new C15700rh(10), e2);
                }
            } catch (IllegalStateException e3) {
                A07(new C15700rh(10), e3);
            }
        }
    }

    public final void A04() {
        C13710nw.A00(this.A0C.A06);
        Status status = AnonymousClass3CL.A0G;
        A08(status);
        this.A06.A00(status, false);
        for (C86314Sd r2 : (C86314Sd[]) this.A09.keySet().toArray(new C86314Sd[0])) {
            A0A(new C57932sD(r2, new C14370p3()));
        }
        A06(new C15700rh(4));
        if (this.A04.isConnected()) {
            C15720rk r3 = new C15720rk(this);
            r3.A00.A0C.A06.post(new RunnableRunnableShape1S0100000_I0((Object) r3, 9));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r8) {
        /*
            r7 = this;
            X.3CL r5 = r7.A0C
            android.os.Handler r4 = r5.A06
            X.C13710nw.A00(r4)
            r0 = 0
            r7.A01 = r0
            r0 = 1
            r7.A02 = r0
            X.38c r6 = r7.A06
            X.0rn r0 = r7.A04
            X.0rp r0 = (X.C15770rp) r0
            java.lang.String r2 = r0.A0S
            java.lang.String r0 = "The connection to Google Play services was lost"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r3 = 1
            if (r8 != r3) goto L_0x0078
            java.lang.String r0 = " due to service disconnection."
        L_0x0021:
            r1.append(r0)
        L_0x0024:
            if (r2 == 0) goto L_0x002e
            java.lang.String r0 = " Last reason for disconnect: "
            r1.append(r0)
            r1.append(r2)
        L_0x002e:
            r2 = 20
            java.lang.String r1 = r1.toString()
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            r6.A00(r0, r3)
            X.4Ui r3 = r7.A05
            r0 = 9
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.sendMessageDelayed(r2, r0)
            r0 = 11
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r4.sendMessageDelayed(r2, r0)
            X.4al r0 = r5.A08
            android.util.SparseIntArray r0 = r0.A01
            r0.clear()
            java.util.Map r0 = r7.A09
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007e
            r1.next()
            java.lang.String r1 = "zac"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0078:
            r0 = 3
            if (r8 != r0) goto L_0x0024
            java.lang.String r0 = " due to dead object exception."
            goto L_0x0021
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15730rl.A05(int):void");
    }

    public final void A06(C15700rh r4) {
        Set set = this.A0B;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            if (AnonymousClass45A.A00(r4, C15700rh.A04)) {
                C15770rp r1 = (C15770rp) this.A04;
                if (!r1.isConnected() || r1.A0B == null) {
                    throw new RuntimeException("Failed to connect when checking package");
                }
            }
            throw new NullPointerException("zac");
        }
        set.clear();
    }

    public final void A07(C15700rh r9, Exception exc) {
        Status A002;
        AnonymousClass5UT r0;
        AnonymousClass3CL r5 = this.A0C;
        Handler handler = r5.A06;
        C13710nw.A00(handler);
        C15600rX r02 = this.A07;
        if (!(r02 == null || (r0 = r02.A01) == null)) {
            r0.A80();
        }
        C13710nw.A00(handler);
        this.A01 = null;
        r5.A08.A01.clear();
        A06(r9);
        if ((this.A04 instanceof C65833Wt) && r9.A01 != 24) {
            r5.A04 = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
        }
        int i2 = r9.A01;
        if (i2 == 4) {
            A002 = AnonymousClass3CL.A0H;
        } else {
            Queue queue = this.A0A;
            if (queue.isEmpty()) {
                this.A01 = r9;
                return;
            } else if (exc != null) {
                C13710nw.A00(handler);
                A09((Status) null, exc, false);
                return;
            } else {
                boolean z2 = r5.A0E;
                C86834Ui r1 = this.A05;
                if (z2) {
                    A09(AnonymousClass3CL.A00(r9, r1), (Exception) null, true);
                    if (!queue.isEmpty() && !A0B(r9) && !r5.A07(r9, this.A03)) {
                        if (i2 == 18) {
                            this.A02 = true;
                        }
                        if (this.A02) {
                            handler.sendMessageDelayed(Message.obtain(handler, 9, r1), 5000);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                A002 = AnonymousClass3CL.A00(r9, r1);
            }
        }
        A08(A002);
    }

    public final void A08(Status status) {
        C13710nw.A00(this.A0C.A06);
        A09(status, (Exception) null, false);
    }

    public final void A09(Status status, Exception exc, boolean z2) {
        C13710nw.A00(this.A0C.A06);
        boolean z3 = false;
        boolean z4 = true;
        if (status != null) {
            z4 = false;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z4 != z3) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                C89334bz r2 = (C89334bz) it.next();
                if (!z2 || r2.A00 == 2) {
                    if (status != null) {
                        r2.A01(status);
                    } else {
                        r2.A04(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void A0A(C89334bz r3) {
        C13710nw.A00(this.A0C.A06);
        if (!this.A04.isConnected()) {
            this.A0A.add(r3);
            C15700rh r1 = this.A01;
            if (r1 == null || !r1.A00()) {
                A03();
            } else {
                A07(r1, (Exception) null);
            }
        } else if (A0C(r3)) {
            A02();
        } else {
            this.A0A.add(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B(X.C15700rh r7) {
        /*
            r6 = this;
            java.lang.Object r5 = X.AnonymousClass3CL.A0I
            monitor-enter(r5)
            X.3CL r2 = r6.A0C     // Catch:{ all -> 0x0037 }
            X.2sC r0 = r2.A01     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0034
            java.util.Set r1 = r2.A0A     // Catch:{ all -> 0x0037 }
            X.4Ui r0 = r6.A05     // Catch:{ all -> 0x0037 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0034
            X.2sC r4 = r2.A01     // Catch:{ all -> 0x0037 }
            int r0 = r6.A03     // Catch:{ all -> 0x0037 }
            X.4GU r3 = new X.4GU     // Catch:{ all -> 0x0037 }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x0037 }
            java.util.concurrent.atomic.AtomicReference r1 = r4.A04     // Catch:{ all -> 0x0037 }
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r3)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0031
            android.os.Handler r2 = r4.A00     // Catch:{ all -> 0x0037 }
            r1 = 16
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r0 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ all -> 0x0037 }
            r0.<init>(r4, r1, r3)     // Catch:{ all -> 0x0037 }
            r2.post(r0)     // Catch:{ all -> 0x0037 }
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            r0 = 1
            return r0
        L_0x0034:
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            r0 = 0
            return r0
        L_0x0037:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15730rl.A0B(X.0rh):boolean");
    }

    public final boolean A0C(C89334bz r20) {
        C65743Wk r7;
        AnonymousClass3Y2[] A062;
        int length;
        C89334bz r12 = r20;
        if (!(r12 instanceof C65743Wk) || (A062 = r7.A06(this)) == null || (length = A062.length) == 0) {
            C612338c r2 = this.A06;
            C15750rn r1 = this.A04;
            r12.A02(r2, r1.AcM());
            try {
                r12.A03(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                C15770rp r13 = (C15770rp) r1;
                r13.A0S = "DeadObjectException thrown while running ApiCallRunner.";
                r13.A80();
                return true;
            }
        } else {
            C15750rn r9 = this.A04;
            C66113Xv r0 = ((C15770rp) r9).A0Q;
            AnonymousClass3Y2[] r14 = r0 == null ? null : r0.A03;
            int i2 = 0;
            if (r14 == null) {
                r14 = new AnonymousClass3Y2[0];
            }
            AnonymousClass00N r4 = new AnonymousClass00N(r13);
            for (AnonymousClass3Y2 r15 : r14) {
                String str = r15.A02;
                long j2 = r15.A01;
                if (j2 == -1) {
                    j2 = (long) r15.A00;
                }
                r4.put(str, Long.valueOf(j2));
            }
            do {
                AnonymousClass3Y2 r3 = A062[i2];
                Number number = (Number) r4.get(r3.A02);
                if (number != null) {
                    long longValue = number.longValue();
                    long j3 = r3.A01;
                    if (j3 == -1) {
                        j3 = (long) r3.A00;
                    }
                    if (longValue >= j3) {
                        i2++;
                    }
                }
                String name = r9.getClass().getName();
                String str2 = r3.A02;
                long j4 = r3.A01;
                if (j4 == -1) {
                    j4 = (long) r3.A00;
                }
                StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str2).length());
                sb.append(name);
                sb.append(" could not execute call because it requires feature (");
                sb.append(str2);
                sb.append(", ");
                sb.append(j4);
                sb.append(").");
                Log.w("GoogleApiManager", sb.toString());
                AnonymousClass3CL r42 = this.A0C;
                if (!r42.A0E || !r7.A05(this)) {
                    (r7 = (C65743Wk) r12).A04(new AnonymousClass5BB(r3));
                    return true;
                }
                AnonymousClass4VW r72 = new AnonymousClass4VW(r3, this.A05);
                List list = this.A08;
                int indexOf = list.indexOf(r72);
                if (indexOf >= 0) {
                    Object obj = list.get(indexOf);
                    Handler handler = r42.A06;
                    handler.removeMessages(15, obj);
                    handler.sendMessageDelayed(Message.obtain(handler, 15, obj), 5000);
                    return false;
                }
                list.add(r72);
                Handler handler2 = r42.A06;
                handler2.sendMessageDelayed(Message.obtain(handler2, 15, r72), 5000);
                handler2.sendMessageDelayed(Message.obtain(handler2, 16, r72), 120000);
                C15700rh r16 = new C15700rh(2, (PendingIntent) null);
                if (A0B(r16)) {
                    return false;
                }
                r42.A07(r16, this.A03);
                return false;
            } while (i2 < length);
            C612338c r22 = this.A06;
            C15750rn r17 = this.A04;
            r12.A02(r22, r17.AcM());
            r12.A03(this);
            return true;
        }
    }

    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A06;
        if (myLooper == handler.getLooper()) {
            A01();
        } else {
            handler.post(new RunnableRunnableShape1S0100000_I0((Object) this, 8));
        }
    }

    public final void onConnectionFailed(C15700rh r2) {
        A07(r2, (Exception) null);
    }

    public final void onConnectionSuspended(int i2) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A06;
        if (myLooper == handler.getLooper()) {
            A05(i2);
        } else {
            handler.post(new RunnableRunnableShape0S0101000_I0((Object) this, i2, 0));
        }
    }
}
