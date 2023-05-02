package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxSCallerShape402S0100000_2_I1;
import com.google.android.exoplayer2.Timeline;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4XK  reason: invalid class name */
public final class AnonymousClass4XK {
    public AnonymousClass5TE A00 = new C97374pt(new Random(), new int[0]);
    public AnonymousClass5LZ A01;
    public boolean A02;
    public final AnonymousClass5L8 A03;
    public final AnonymousClass4JT A04;
    public final C30231bz A05;
    public final HashMap A06;
    public final IdentityHashMap A07 = new IdentityHashMap();
    public final List A08 = AnonymousClass000.A0u();
    public final Map A09 = AnonymousClass000.A0x();
    public final Set A0A;

    public AnonymousClass4XK(Handler handler, AnonymousClass5L8 r7, C96224nz r8) {
        this.A03 = r7;
        C30231bz r1 = new C30231bz((C30271c3) null, new CopyOnWriteArrayList(), 0);
        this.A05 = r1;
        AnonymousClass4JT r2 = new AnonymousClass4JT((C30271c3) null, new CopyOnWriteArrayList(), 0);
        this.A04 = r2;
        this.A06 = AnonymousClass000.A0x();
        this.A0A = C13680ns.A0o();
        r1.A02.add(new AnonymousClass4GG(handler, r8));
        r2.A02.add(new AnonymousClass4G7(handler, r8));
    }

    public Timeline A00() {
        List list = this.A08;
        if (list.isEmpty()) {
            return Timeline.A00;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            C96204nx r0 = (C96204nx) list.get(i3);
            r0.A00 = i2;
            i2 += r0.A02.A01.A01();
        }
        return new AnonymousClass3UE(this.A00, list);
    }

    public Timeline A01(AnonymousClass5TE r7, List list, int i2) {
        int i3;
        List list2;
        if (!list.isEmpty()) {
            this.A00 = r7;
            for (int i4 = i2; i4 < list.size() + i2; i4++) {
                C96204nx r3 = (C96204nx) list.get(i4 - i2);
                if (i4 > 0) {
                    C96204nx r1 = (C96204nx) this.A08.get(i4 - 1);
                    i3 = r1.A00 + r1.A02.A01.A01();
                } else {
                    i3 = 0;
                }
                r3.A00 = i3;
                r3.A01 = false;
                r3.A04.clear();
                int A012 = r3.A02.A01.A01();
                int i5 = i4;
                while (true) {
                    list2 = this.A08;
                    if (i5 >= list2.size()) {
                        break;
                    }
                    ((C96204nx) list2.get(i5)).A00 += A012;
                    i5++;
                }
                list2.add(i4, r3);
                this.A09.put(r3.A03, r3);
                if (this.A02) {
                    A05(r3);
                    if (this.A07.isEmpty()) {
                        this.A0A.add(r3);
                    } else {
                        AnonymousClass4JR r0 = (AnonymousClass4JR) this.A06.get(r3);
                        if (r0 != null) {
                            r0.A01.A7x(r0.A00);
                        }
                    }
                }
            }
        }
        return A00();
    }

    public final void A02() {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            C96204nx r1 = (C96204nx) it.next();
            if (r1.A04.isEmpty()) {
                AnonymousClass4JR r0 = (AnonymousClass4JR) this.A06.get(r1);
                if (r0 != null) {
                    r0.A01.A7x(r0.A00);
                }
                it.remove();
            }
        }
    }

    public final void A03(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            List list = this.A08;
            C96204nx r4 = (C96204nx) list.remove(i4);
            this.A09.remove(r4.A03);
            int i5 = -r4.A02.A01.A01();
            for (int i6 = i4; i6 < list.size(); i6++) {
                ((C96204nx) list.get(i6)).A00 += i5;
            }
            r4.A01 = true;
            if (this.A02) {
                A04(r4);
            }
        }
    }

    public final void A04(C96204nx r4) {
        if (r4.A01 && r4.A04.isEmpty()) {
            AnonymousClass4JR r2 = (AnonymousClass4JR) this.A06.remove(r4);
            AnonymousClass2PW r1 = r2.A01;
            r1.Abm(r2.A00);
            r1.Abw(r2.A02);
            this.A0A.remove(r4);
        }
    }

    public final void A05(C96204nx r7) {
        AnonymousClass3VN r4 = r7.A02;
        IDxSCallerShape402S0100000_2_I1 iDxSCallerShape402S0100000_2_I1 = new IDxSCallerShape402S0100000_2_I1(this, 0);
        C97304pj r5 = new C97304pj(r7, this);
        this.A06.put(r7, new AnonymousClass4JR(iDxSCallerShape402S0100000_2_I1, r4, r5));
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        r4.A03.A02.add(new AnonymousClass4GG(new Handler(myLooper, (Handler.Callback) null), r5));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        r4.A02.A02.add(new AnonymousClass4G7(new Handler(myLooper2, (Handler.Callback) null), r5));
        r4.Aan(iDxSCallerShape402S0100000_2_I1, this.A01);
    }

    public void A06(C15070qH r5) {
        IdentityHashMap identityHashMap = this.A07;
        C96204nx r2 = (C96204nx) identityHashMap.remove(r5);
        r2.A02.Abl(r5);
        r2.A04.remove(((C97284ph) r5).A05);
        if (!identityHashMap.isEmpty()) {
            A02();
        }
        A04(r2);
    }
}
