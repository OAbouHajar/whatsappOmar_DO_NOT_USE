package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0rV  reason: invalid class name and case insensitive filesystem */
public final class C15580rV implements C15590rW {
    public int A00 = 0;
    public Bundle A01;
    public C15700rh A02 = null;
    public C15700rh A03 = null;
    public boolean A04 = false;
    public final Context A05;
    public final Looper A06;
    public final C15750rn A07;
    public final C57912sB A08;
    public final AnonymousClass3EC A09;
    public final AnonymousClass3EC A0A;
    public final Map A0B;
    public final Set A0C = Collections.newSetFromMap(new WeakHashMap());
    public final Lock A0D;

    public C15580rV(Context context, Looper looper, AnonymousClass3AP r31, AnonymousClass3WP r32, C15750rn r33, C57912sB r34, AnonymousClass4O1 r35, ArrayList arrayList, ArrayList arrayList2, Map map, Map map2, Map map3, Map map4, Lock lock) {
        Context context2 = context;
        this.A05 = context2;
        C57912sB r9 = r34;
        this.A08 = r9;
        Lock lock2 = lock;
        this.A0D = lock2;
        Looper looper2 = looper;
        this.A06 = looper2;
        this.A07 = r33;
        AnonymousClass3AP r7 = r31;
        Map map5 = map2;
        this.A09 = new AnonymousClass3EC(context2, looper2, r7, (AnonymousClass3WP) null, r9, new C97974qt(this), (AnonymousClass4O1) null, arrayList2, map5, map4, lock2);
        Map map6 = map;
        this.A0A = new AnonymousClass3EC(context2, looper2, r7, r32, r9, new C97984qu(this), r35, arrayList, map6, map3, lock2);
        AnonymousClass00N r4 = new AnonymousClass00N();
        for (Object put : map5.keySet()) {
            r4.put(put, this.A09);
        }
        for (Object put2 : map6.keySet()) {
            r4.put(put2, this.A0A);
        }
        this.A0B = Collections.unmodifiableMap(r4);
    }

    public static /* bridge */ /* synthetic */ void A00(C15580rV r4) {
        C15700rh r2 = r4.A02;
        if (r2 != null) {
            int i2 = r2.A01;
            C15700rh r3 = r4.A03;
            if (i2 == 0) {
                if (r3 != null) {
                    int i3 = r3.A01;
                    boolean z2 = false;
                    if (i3 == 0) {
                        z2 = true;
                    }
                    if (z2 || i3 == 4) {
                        int i4 = r4.A00;
                        if (i4 != 1) {
                            if (i4 != 2) {
                                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                                r4.A00 = 0;
                            }
                            C57912sB r1 = r4.A08;
                            C13710nw.A01(r1);
                            r1.AiQ(r4.A01);
                        }
                        r4.A01();
                        r4.A00 = 0;
                    } else if (r4.A00 == 1) {
                        r4.A01();
                    } else {
                        r4.A02(r3);
                        r4.A09.Aif();
                    }
                }
            } else if (r3 != null) {
                int i5 = r3.A01;
                AnonymousClass3EC r0 = r4.A0A;
                if (i5 == 0) {
                    r0.Aif();
                    r2 = r4.A02;
                    C13710nw.A01(r2);
                } else if (r0.A00 < r4.A09.A00) {
                    r2 = r3;
                }
                r4.A02(r2);
            }
        }
    }

    public final void A01() {
        Set<C107765Li> set = this.A0C;
        for (C107765Li r0 : set) {
            ((AnonymousClass3QF) r0).A01.release();
        }
        set.clear();
    }

    public final void A02(C15700rh r4) {
        int i2 = this.A00;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A08.AiO(r4);
        }
        A01();
        this.A00 = 0;
    }

    public final C438121p AiW(C438121p r10) {
        Object obj = this.A0B.get(r10.A00);
        C13710nw.A02(obj, "GoogleApiClient is not configured to use the API required for this call.");
        AnonymousClass3EC r2 = this.A0A;
        if (obj.equals(r2)) {
            C15700rh r0 = this.A03;
            if (r0 != null && r0.A01 == 4) {
                C15750rn r1 = this.A07;
                r10.A02(new Status(r1 == null ? null : PendingIntent.getActivity(this.A05, System.identityHashCode(this.A08), r1.AG4(), C815348s.A00 | 134217728), (C15700rh) null, (String) null, 1, 4));
                return r10;
            }
        } else {
            r2 = this.A09;
        }
        r2.AiW(r10);
        return r10;
    }

    public final C438121p AiZ(C438121p r10) {
        Object obj = this.A0B.get(r10.A00);
        C13710nw.A02(obj, "GoogleApiClient is not configured to use the API required for this call.");
        AnonymousClass3EC r2 = this.A0A;
        if (obj.equals(r2)) {
            C15700rh r0 = this.A03;
            if (r0 != null && r0.A01 == 4) {
                C15750rn r1 = this.A07;
                r10.A02(new Status(r1 == null ? null : PendingIntent.getActivity(this.A05, System.identityHashCode(this.A08), r1.AG4(), C815348s.A00 | 134217728), (C15700rh) null, (String) null, 1, 4));
                return r10;
            }
        } else {
            r2 = this.A09;
        }
        return r2.AiZ(r10);
    }

    public final void Aie() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A09.Aie();
        this.A0A.Aie();
    }

    public final void Aif() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A09.Aif();
        this.A0A.Aif();
        A01();
    }

    public final void Aig(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("").append("authClient").println(":");
        this.A0A.Aig(String.valueOf("").concat("  "), (FileDescriptor) null, printWriter, (String[]) null);
        printWriter.append("").append("anonClient").println(":");
        this.A09.Aig(String.valueOf("").concat("  "), (FileDescriptor) null, printWriter, (String[]) null);
    }

    public final void Aih() {
        Lock lock = this.A0D;
        lock.lock();
        try {
            lock.lock();
            boolean z2 = false;
            if (this.A00 == 2) {
                z2 = true;
            }
            lock.unlock();
            this.A0A.Aif();
            this.A03 = new C15700rh(4);
            if (z2) {
                new AnonymousClass3M2(this.A06).post(new RunnableRunnableShape1S0100000_I0((Object) this, 11));
            } else {
                A01();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5.A00 == 1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Aii() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r4 = r5.A0D
            r4.lock()
            X.3EC r0 = r5.A09     // Catch:{ all -> 0x002a }
            X.0qD r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.AnonymousClass3EA     // Catch:{ all -> 0x002a }
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0026
            X.3EC r0 = r5.A0A     // Catch:{ all -> 0x002a }
            X.0qD r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.AnonymousClass3EA     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0025
            X.0rh r0 = r5.A03     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0021
            int r1 = r0.A01     // Catch:{ all -> 0x002a }
            r0 = 4
            if (r1 != r0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r0 = r5.A00     // Catch:{ all -> 0x002a }
            if (r0 != r2) goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            r4.unlock()
            return r3
        L_0x002a:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15580rV.Aii():boolean");
    }

    public final boolean Aij(C107765Li r5) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            lock.lock();
            boolean z2 = false;
            if (this.A00 == 2) {
                z2 = true;
            }
            if (z2 || Aii()) {
                AnonymousClass3EC r2 = this.A0A;
                if (!(r2.A0E instanceof AnonymousClass3EA)) {
                    this.A0C.add(r5);
                    if (this.A00 == 0) {
                        this.A00 = 1;
                    }
                    this.A03 = null;
                    r2.Aie();
                    return true;
                }
            }
            lock.unlock();
            return false;
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }
}
