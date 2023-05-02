package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0d3  reason: invalid class name and case insensitive filesystem */
public class C08100d3 implements C13220lf, C12580kd, C13110lU {
    public static final String A09 = C06530Wm.A01("GreedyScheduler");
    public AnonymousClass0U3 A00;
    public Boolean A01;
    public boolean A02;
    public final Context A03;
    public final AnonymousClass0Rl A04 = new AnonymousClass0Rl();
    public final AnonymousClass022 A05;
    public final C13120lV A06;
    public final Object A07;
    public final Set A08 = new HashSet();

    public C08100d3(Context context, AnonymousClass0Pz r4, AnonymousClass022 r5, AnonymousClass0U8 r6) {
        this.A03 = context;
        this.A05 = r5;
        this.A06 = new AnonymousClass0d6(this, r6);
        this.A00 = new AnonymousClass0U3(r4.A03, this);
        this.A07 = new Object();
    }

    public void A61(String str) {
        Runnable runnable;
        Boolean bool = this.A01;
        if (bool == null) {
            bool = Boolean.valueOf(C06330Vh.A01(this.A03, this.A05.A02));
            this.A01 = bool;
        }
        if (!bool.booleanValue()) {
            C06530Wm.A00();
            Log.i(A09, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.A02) {
            this.A05.A03.A02(this);
            this.A02 = true;
        }
        C06530Wm.A00().A02(A09, AnonymousClass000.A0h(str, AnonymousClass000.A0r("Cancelling work ID ")));
        AnonymousClass0U3 r2 = this.A00;
        if (!(r2 == null || (runnable = (Runnable) r2.A02.remove(str)) == null)) {
            ((C08040cw) r2.A00).A00.removeCallbacks(runnable);
        }
        for (AnonymousClass0NV A082 : this.A04.A02(str)) {
            this.A05.A08(A082);
        }
    }

    public boolean AHZ() {
        return false;
    }

    public void AMN(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0R5 A002 = AnonymousClass0MO.A00((C007303i) it.next());
            AnonymousClass0Rl r3 = this.A04;
            if (!r3.A03(A002)) {
                C06530Wm.A00().A02(A09, AnonymousClass000.A0g("Constraints met: Scheduling work ID ", A002));
                AnonymousClass022 r4 = this.A05;
                r4.A06.A8p(new C10350gz((AnonymousClass0OP) null, r3.A01(A002), r4));
            }
        }
    }

    public void AMO(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0R5 A002 = AnonymousClass0MO.A00((C007303i) it.next());
            C06530Wm.A00().A02(A09, AnonymousClass000.A0g("Constraints not met: Cancelling work ID ", A002));
            AnonymousClass0NV A003 = this.A04.A00(A002);
            if (A003 != null) {
                this.A05.A08(A003);
            }
        }
    }

    public void AQm(AnonymousClass0R5 r8, boolean z2) {
        this.A04.A00(r8);
        synchronized (this.A07) {
            Set set = this.A08;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C007303i r4 = (C007303i) it.next();
                if (AnonymousClass0MO.A00(r4).equals(r8)) {
                    C06530Wm.A00().A02(A09, AnonymousClass000.A0e(r8, "Stopping tracking for ", AnonymousClass000.A0o()));
                    set.remove(r4);
                    this.A06.Ac9(set);
                    break;
                }
            }
        }
    }

    public void Ad3(C007303i... r14) {
        C06530Wm A002;
        String str;
        StringBuilder A0r;
        String str2;
        Boolean bool = this.A01;
        if (bool == null) {
            bool = Boolean.valueOf(C06330Vh.A01(this.A03, this.A05.A02));
            this.A01 = bool;
        }
        if (!bool.booleanValue()) {
            C06530Wm.A00();
            Log.i(A09, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.A02) {
            this.A05.A03.A02(this);
            this.A02 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C007303i r10 : r14) {
            AnonymousClass0R5 A003 = AnonymousClass0MO.A00(r10);
            AnonymousClass0Rl r9 = this.A04;
            if (!r9.A03(A003)) {
                long A022 = r10.A02();
                long currentTimeMillis = System.currentTimeMillis();
                if (r10.A0E == AnonymousClass0KV.ENQUEUED) {
                    if (currentTimeMillis < A022) {
                        AnonymousClass0U3 r92 = this.A00;
                        if (r92 != null) {
                            Map map = r92.A02;
                            String str3 = r10.A0J;
                            Runnable runnable = (Runnable) map.remove(str3);
                            if (runnable != null) {
                                ((C08040cw) r92.A00).A00.removeCallbacks(runnable);
                            }
                            C09990gP r4 = new C09990gP(r92, r10);
                            map.put(str3, r4);
                            ((C08040cw) r92.A00).A00.postDelayed(r4, r10.A02() - System.currentTimeMillis());
                        }
                    } else if (r10.A03()) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 23) {
                            AnonymousClass042 r1 = r10.A0A;
                            if (r1.A00()) {
                                A002 = C06530Wm.A00();
                                str = A09;
                                A0r = AnonymousClass000.A0r("Ignoring ");
                                A0r.append(r10);
                                str2 = ". Requires device idle.";
                            } else if (i2 >= 24 && (!r1.A03.isEmpty())) {
                                A002 = C06530Wm.A00();
                                str = A09;
                                A0r = AnonymousClass000.A0r("Ignoring ");
                                A0r.append(r10);
                                str2 = ". Requires ContentUri triggers.";
                            }
                            A002.A02(str, AnonymousClass000.A0h(str2, A0r));
                        }
                        hashSet.add(r10);
                        hashSet2.add(r10.A0J);
                    } else if (!r9.A03(AnonymousClass0MO.A00(r10))) {
                        C06530Wm.A00().A02(A09, AnonymousClass000.A0h(r10.A0J, AnonymousClass000.A0r("Starting work for ")));
                        AnonymousClass022 r42 = this.A05;
                        r42.A06.A8p(new C10350gz((AnonymousClass0OP) null, r9.A01(AnonymousClass0MO.A00(r10)), r42));
                    }
                }
            }
        }
        synchronized (this.A07) {
            if (!hashSet.isEmpty()) {
                String join = TextUtils.join(",", hashSet2);
                C06530Wm A004 = C06530Wm.A00();
                String str4 = A09;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Starting tracking for ");
                A004.A02(str4, AnonymousClass000.A0h(join, A0o));
                Set set = this.A08;
                set.addAll(hashSet);
                this.A06.Ac9(set);
            }
        }
    }
}
