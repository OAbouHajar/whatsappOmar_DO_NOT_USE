package X;

import android.app.Activity;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0cn  reason: invalid class name and case insensitive filesystem */
public final class C07970cn implements C13100lT {
    public static final ReentrantLock A02 = new ReentrantLock();
    public static volatile C07970cn A03;
    public C13090lS A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public C07970cn(C13090lS r3) {
        this.A00 = r3;
        C13090lS r1 = this.A00;
        if (r1 != null) {
            r1.Adv(new C07920ci(this));
        }
    }

    public final void A00(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (C18450wi.A0R(((C04870Og) it.next()).A01, activity)) {
                    return;
                }
            }
        }
        C13090lS r0 = this.A00;
        if (r0 != null) {
            r0.AZn(activity);
        }
    }

    public final boolean A01(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (C18450wi.A0R(((C04870Og) it.next()).A01, activity)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void Abc(Activity activity, AnonymousClass04N r7, Executor executor) {
        Object obj;
        C05370Qr r2;
        C18450wi.A0H(activity, 0);
        ReentrantLock reentrantLock = A02;
        reentrantLock.lock();
        try {
            C13090lS r22 = this.A00;
            if (r22 == null) {
                r7.accept(new C05370Qr(AnonymousClass1JA.A0P()));
            } else {
                boolean A012 = A01(activity);
                C04870Og r3 = new C04870Og(activity, r7, executor);
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                copyOnWriteArrayList.add(r3);
                if (!A012) {
                    C07940ck r23 = (C07940ck) r22;
                    IBinder A002 = AnonymousClass0MG.A00(activity);
                    if (A002 != null) {
                        r23.A02(activity, A002);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new C06850Yd(activity, r23));
                    }
                } else {
                    Iterator it = copyOnWriteArrayList.iterator();
                    do {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        obj = it.next();
                    } while (!activity.equals(((C04870Og) obj).A01));
                    C04870Og r1 = (C04870Og) obj;
                    if (!(r1 == null || (r2 = r1.A00) == null)) {
                        r3.A00 = r2;
                        r3.A03.execute(new C09930gJ(r3, r2));
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void AhC(AnonymousClass04N r7) {
        C18450wi.A0H(r7, 0);
        synchronized (A02) {
            if (this.A00 != null) {
                ArrayList A0u = AnonymousClass000.A0u();
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C04870Og r1 = (C04870Og) it.next();
                    if (r1.A02 == r7) {
                        A0u.add(r1);
                    }
                }
                copyOnWriteArrayList.removeAll(A0u);
                Iterator it2 = A0u.iterator();
                while (it2.hasNext()) {
                    A00(((C04870Og) it2.next()).A01);
                }
            }
        }
    }
}
