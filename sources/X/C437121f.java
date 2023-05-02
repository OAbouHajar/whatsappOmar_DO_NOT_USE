package X;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

@Deprecated
/* renamed from: X.21f  reason: invalid class name and case insensitive filesystem */
public abstract class C437121f {
    public static final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public Context A00() {
        return ((C57912sB) this).A05;
    }

    public Looper A01() {
        return ((C57912sB) this).A06;
    }

    public C438121p A02(C438121p r6) {
        C57912sB r4 = (C57912sB) this;
        C437721l r2 = r6.A01;
        boolean containsKey = r4.A0G.containsKey(r6.A00);
        String str = r2.A02;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C13710nw.A03(sb.toString(), containsKey);
        Lock lock = r4.A0J;
        lock.lock();
        try {
            C15590rW r0 = r4.A01;
            if (r0 == null) {
                r4.A0I.add(r6);
            } else {
                r0.AiW(r6);
            }
            return r6;
        } finally {
            lock.unlock();
        }
    }

    public C438121p A03(C438121p r7) {
        C57912sB r5 = (C57912sB) this;
        C437721l r2 = r7.A01;
        boolean containsKey = r5.A0G.containsKey(r7.A00);
        String str = r2.A02;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C13710nw.A03(sb.toString(), containsKey);
        Lock lock = r5.A0J;
        lock.lock();
        try {
            C15590rW r1 = r5.A01;
            if (r1 != null) {
                if (r5.A0K) {
                    Queue queue = r5.A0I;
                    queue.add(r7);
                    while (!queue.isEmpty()) {
                        C438121p r22 = (C438121p) queue.remove();
                        C87954Zi r12 = r5.A0B;
                        r12.A01.add(r22);
                        r22.zai.set(r12.A00);
                        r22.A02(Status.A07);
                    }
                } else {
                    r7 = r1.AiZ(r7);
                }
                return r7;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            lock.unlock();
        }
    }

    public void A04() {
        boolean z2;
        C57912sB r6 = (C57912sB) this;
        Lock lock = r6.A0J;
        lock.lock();
        try {
            Set set = r6.A0B.A01;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
                basePendingResult.zai.set((Object) null);
                synchronized (basePendingResult.zae) {
                    if (((C437121f) basePendingResult.zac.get()) == null || !basePendingResult.zaq) {
                        basePendingResult.cancel();
                    }
                    synchronized (basePendingResult.zae) {
                        z2 = basePendingResult.zam;
                    }
                }
                if (z2) {
                    set.remove(basePendingResult);
                }
            }
            C15590rW r0 = r6.A01;
            if (r0 != null) {
                r0.Aif();
            }
            Set<C84114Jh> set2 = r6.A09.A00;
            for (C84114Jh r1 : set2) {
                r1.A02 = null;
                r1.A01 = null;
            }
            set2.clear();
            Queue<C438121p> queue = r6.A0I;
            for (C438121p r2 : queue) {
                r2.zai.set((Object) null);
                r2.cancel();
            }
            queue.clear();
            if (r6.A01 != null) {
                r6.A0B();
                AnonymousClass3CK r12 = r6.A0E;
                r12.A08 = false;
                r12.A07.incrementAndGet();
            }
        } finally {
            lock.unlock();
        }
    }

    public void A05() {
        if (this instanceof C57912sB) {
            C15590rW r0 = ((C57912sB) this).A01;
            if (r0 != null) {
                r0.Aih();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public boolean A06() {
        C15590rW r0 = ((C57912sB) this).A01;
        return r0 != null && r0.Aii();
    }

    public boolean A07(C107765Li r3) {
        if (this instanceof C57912sB) {
            C15590rW r0 = ((C57912sB) this).A01;
            return r0 != null && r0.Aij(r3);
        }
        throw new UnsupportedOperationException();
    }

    public abstract void A08();
}
