package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.4mu  reason: invalid class name and case insensitive filesystem */
public class C95604mu implements C12180jy {
    public long A00;
    public C83214Fu A01;
    public final C12860l5 A02;
    public final AnonymousClass44f A03;
    public final AnonymousClass4X4 A04;
    public final AnonymousClass4X4 A05;
    public final AnonymousClass5NV A06;
    public final Map A07 = new WeakHashMap();

    public C95604mu(C12860l5 r3, AnonymousClass44f r4, AnonymousClass5NV r5) {
        this.A06 = r5;
        this.A05 = new AnonymousClass4X4(new C95704n7(this, r5));
        this.A04 = new AnonymousClass4X4(new C95704n7(this, r5));
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = (C83214Fu) r3.get();
        this.A00 = SystemClock.uptimeMillis();
    }

    public static void A00(C85004Ms r2) {
        C82064Bb r0;
        if (r2 != null && (r0 = r2.A03) != null) {
            Object obj = r2.A04;
            C87404Wq r1 = r0.A00;
            synchronized (r1) {
                r1.A03.remove(obj);
            }
        }
    }

    public final synchronized C09110ev A01(C85004Ms r4) {
        C09110ev A002;
        synchronized (this) {
            AnonymousClass0T3.A01(AnonymousClass000.A1P(r4.A01 ? 1 : 0));
            r4.A00++;
            A002 = C09110ev.A00(new C95674n1(r4, this), r4.A02.A04());
        }
        return A002;
    }

    public final synchronized C09110ev A02(C85004Ms r2) {
        return (!r2.A01 || r2.A00 != 0) ? null : r2.A02;
    }

    public final void A03() {
        ArrayList arrayList;
        Object next;
        synchronized (this) {
            AnonymousClass4X4 r6 = this.A04;
            int A002 = r6.A00();
            AnonymousClass4X4 r5 = this.A05;
            int A062 = AnonymousClass3K4.A06(256, A002 - r5.A00(), Integer.MAX_VALUE);
            int A063 = AnonymousClass3K4.A06(this.A01.A00, r6.A01() - r5.A01(), Integer.MAX_VALUE);
            int max = Math.max(A062, 0);
            int max2 = Math.max(A063, 0);
            if (r5.A00() > max || r5.A01() > max2) {
                arrayList = AnonymousClass000.A0u();
                while (true) {
                    if (r5.A00() > max || r5.A01() > max2) {
                        synchronized (r5) {
                            LinkedHashMap linkedHashMap = r5.A02;
                            next = linkedHashMap.isEmpty() ? null : AnonymousClass3K4.A0e(linkedHashMap).next();
                        }
                        r5.A02(next);
                        arrayList.add(r6.A02(next));
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            A05((C85004Ms) it.next());
                        }
                    }
                }
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C09110ev A022 = A02((C85004Ms) it2.next());
                if (A022 != null) {
                    A022.close();
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                A00((C85004Ms) it3.next());
            }
        }
    }

    public final synchronized void A04() {
        if (this.A00 + this.A01.A01 <= SystemClock.uptimeMillis()) {
            this.A00 = SystemClock.uptimeMillis();
            this.A01 = (C83214Fu) this.A02.get();
        }
    }

    public final synchronized void A05(C85004Ms r3) {
        AnonymousClass0T3.A01(AnonymousClass000.A1P(r3.A01 ? 1 : 0));
        r3.A01 = true;
    }
}
