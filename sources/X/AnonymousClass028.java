package X;

import androidx.lifecycle.LiveData$LifecycleBoundObserver;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.028  reason: invalid class name */
public abstract class AnonymousClass028 {
    public static final Object A0A = new Object();
    public int A00;
    public int A01;
    public AnonymousClass03P A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Object A06;
    public final Runnable A07;
    public volatile Object A08;
    public volatile Object A09;

    public AnonymousClass028() {
        this.A06 = new Object();
        this.A02 = new AnonymousClass03P();
        this.A00 = 0;
        Object obj = A0A;
        this.A09 = obj;
        this.A07 = new AnonymousClass03Q(this);
        this.A08 = obj;
        this.A01 = -1;
    }

    public AnonymousClass028(Object obj) {
        this.A06 = new Object();
        this.A02 = new AnonymousClass03P();
        this.A00 = 0;
        this.A09 = A0A;
        this.A07 = new AnonymousClass03Q(this);
        this.A08 = obj;
        this.A01 = 0;
    }

    public static void A00(String str) {
        if (!C011905t.A00().A03()) {
            StringBuilder sb = new StringBuilder("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    public Object A01() {
        Object obj = this.A08;
        if (obj == A0A) {
            return null;
        }
        return obj;
    }

    public void A02() {
    }

    public void A03() {
    }

    public void A04(C001300o r4) {
        A00("removeObservers");
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((AnonymousClass07G) entry.getValue()).A03(r4)) {
                A08((AnonymousClass023) entry.getKey());
            }
        }
    }

    public void A05(AnonymousClass07G r5) {
        if (this.A05) {
            this.A04 = true;
            return;
        }
        this.A05 = true;
        do {
            this.A04 = false;
            if (r5 == null) {
                AnonymousClass03P r0 = this.A02;
                C011505o r2 = new C011505o(r0);
                r0.A03.put(r2, Boolean.FALSE);
                while (r2.hasNext()) {
                    A06((AnonymousClass07G) ((Map.Entry) r2.next()).getValue());
                    if (this.A04) {
                        break;
                    }
                }
            } else {
                A06(r5);
                r5 = null;
            }
        } while (this.A04);
        this.A05 = false;
    }

    public final void A06(AnonymousClass07G r3) {
        if (!r3.A01) {
            return;
        }
        if (!r3.A02()) {
            r3.A01(false);
            return;
        }
        int i2 = r3.A00;
        int i3 = this.A01;
        if (i2 < i3) {
            r3.A00 = i3;
            r3.A02.AOH(this.A08);
        }
    }

    public void A07(AnonymousClass023 r4) {
        A00("observeForever");
        AnonymousClass0F1 r2 = new AnonymousClass0F1(this, r4);
        Object A022 = this.A02.A02(r4, r2);
        if (A022 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (A022 == null) {
            r2.A01(true);
        }
    }

    public void A08(AnonymousClass023 r3) {
        A00("removeObserver");
        AnonymousClass07G r1 = (AnonymousClass07G) this.A02.A01(r3);
        if (r1 != null) {
            r1.A00();
            r1.A01(false);
        }
    }

    public void A09(Object obj) {
        boolean z2;
        synchronized (this.A06) {
            z2 = false;
            if (this.A09 == A0A) {
                z2 = true;
            }
            this.A09 = obj;
        }
        if (z2) {
            C011905t.A00().A02(this.A07);
        }
    }

    public void A0A(C001300o r3, AnonymousClass023 r4) {
        A00("observe");
        if (((C009604p) r3.getLifecycle()).A02 != C011005f.DESTROYED) {
            LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(r3, this, r4);
            AnonymousClass07G r0 = (AnonymousClass07G) this.A02.A02(r4, liveData$LifecycleBoundObserver);
            if (r0 == null) {
                r3.getLifecycle().A00(liveData$LifecycleBoundObserver);
            } else if (!r0.A03(r3)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        }
    }

    public void A0B(Object obj) {
        A00("setValue");
        this.A01++;
        this.A08 = obj;
        A05((AnonymousClass07G) null);
    }
}
