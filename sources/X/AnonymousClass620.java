package X;

import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.620  reason: invalid class name */
public abstract class AnonymousClass620 implements C228619o {
    public final C226718v A00;
    public final C14710pd A01;
    public final AnonymousClass174 A02;
    public final Map A03;
    public final Map A04;
    public final AtomicInteger A05 = new AtomicInteger();

    public AnonymousClass620(C226718v r2, C14710pd r3, AnonymousClass174 r4) {
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = AnonymousClass000.A0x();
        this.A03 = AnonymousClass000.A0x();
    }

    public final C31081dR A00(Integer num, String str) {
        if (!this.A01.A0C(1546)) {
            return null;
        }
        return (C31081dR) (num == null ? this.A04.get(str) : this.A04.get(AnonymousClass000.A0f(num, AnonymousClass000.A0q(str))));
    }

    public final C31081dR A01(Integer num, String str, int i2) {
        if (num != null) {
            str = AnonymousClass000.A0f(num, AnonymousClass000.A0q(str));
        }
        C31081dR A002 = A00((Integer) null, str);
        if (A002 != null) {
            return A002;
        }
        C31091dS r1 = new C31091dS(i2);
        C31081dR A003 = this.A00.A00(r1, str);
        r1.A03 = true;
        this.A04.put(str, A003);
        return A003;
    }

    public Integer A02(String str) {
        if (!this.A01.A0C(1546)) {
            return null;
        }
        int andIncrement = this.A05.getAndIncrement();
        String A0l = AnonymousClass000.A0l(AnonymousClass000.A0q(str), andIncrement);
        Integer valueOf = Integer.valueOf(andIncrement);
        A01(valueOf, str, 185470120).A04(andIncrement, "unknown", false);
        A09(valueOf, A0l, "iq_action", str);
        C30681cm A012 = this.A02.A01();
        if (A012 != null) {
            A09(valueOf, A0l, "country", A012.A03);
        }
        return valueOf;
    }

    public Integer A03(String str, int i2) {
        if (!this.A01.A0C(1546)) {
            return null;
        }
        int andIncrement = this.A05.getAndIncrement();
        if (str == null) {
            str = "unknown";
        }
        Integer valueOf = Integer.valueOf(andIncrement);
        C31081dR A012 = A01(valueOf, "p2p_flow_tag", i2);
        A012.A04(andIncrement, str, false);
        A012.A07.AKp("entry_point", str, A012.A06.A05, andIncrement);
        C30681cm A013 = this.A02.A01();
        if (A013 != null) {
            String str2 = A013.A03;
            C31081dR A002 = A00(valueOf, "p2p_flow_tag");
            if (A002 != null) {
                A002.A07.AKp("country", str2, A002.A06.A05, andIncrement);
            }
        }
        AL3("new_payment", andIncrement);
        return valueOf;
    }

    public void A04(int i2, String str) {
        if (this.A01.A0C(1546)) {
            A01((Integer) null, str, i2).A0D("unknown", -1);
            C30681cm A012 = this.A02.A01();
            if (A012 != null) {
                A09((Integer) null, str, "country", A012.A03);
            }
        }
    }

    public void A05(int i2, String str, long j2) {
        int i3 = i2;
        C31081dR A002 = A00(Integer.valueOf(i2), "p2p_flow_tag");
        if (A002 != null) {
            A002.A07.AKo(str, A002.A06.A05, i3, j2);
        }
    }

    public void A06(int i2, short s2) {
        C31081dR A002 = A00(Integer.valueOf(i2), "p2p_flow_tag");
        if (A002 != null) {
            Map map = this.A03;
            String A0e = C13690nt.A0e(AnonymousClass000.A0l(AnonymousClass000.A0q("p2p_flow_tag"), i2), map);
            if (A0e != null) {
                A002.A01(i2, A0e);
                map.remove(AnonymousClass000.A0l(AnonymousClass000.A0q("p2p_flow_tag"), i2));
            }
            A002.A05(i2, s2);
            this.A04.remove(AnonymousClass000.A0l(AnonymousClass000.A0q("p2p_flow_tag"), i2));
        }
    }

    public void A07(AnonymousClass2HJ r10, Integer num, String str) {
        if (num != null) {
            if (r10 == null) {
                r10 = C110115dX.A0N();
            }
            long j2 = (long) r10.A00;
            C31081dR A002 = A00((Integer) null, AnonymousClass000.A0f(num, AnonymousClass000.A0q(str)));
            if (A002 != null) {
                A002.A07.AKo("error_code", A002.A06.A05, num.intValue(), j2);
            }
            A0A(num, str, 3);
        }
    }

    public void A08(AnonymousClass2HJ r7, String str) {
        if (r7 == null) {
            r7 = C110115dX.A0N();
        }
        long j2 = (long) r7.A00;
        C31081dR A002 = A00((Integer) null, str);
        if (A002 != null) {
            A002.A07.AKh(A002.A06.A05, "error_code", j2);
        }
        C31081dR A003 = A00((Integer) null, str);
        if (A003 != null) {
            A003.A0C(3);
            this.A04.remove(str);
        }
    }

    public void A09(Integer num, String str, String str2, String str3) {
        C31081dR A002 = A00((Integer) null, str);
        if (A002 == null) {
            return;
        }
        if (num == null) {
            A002.A0A(str2, str3, false);
            return;
        }
        A002.A07.AKp(str2, str3, A002.A06.A05, num.intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = X.AnonymousClass000.A0f(r4, X.AnonymousClass000.A0q(r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(java.lang.Integer r4, java.lang.String r5, short r6) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x001d
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r5)
            java.lang.String r2 = X.AnonymousClass000.A0f(r4, r0)
            r0 = 0
            X.1dR r1 = r3.A00(r0, r2)
            if (r1 == 0) goto L_0x001d
            int r0 = r4.intValue()
            r1.A05(r0, r6)
            java.util.Map r0 = r3.A04
            r0.remove(r2)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass620.A0A(java.lang.Integer, java.lang.String, short):void");
    }

    public void AL3(String str, int i2) {
        C31081dR A002 = A00(Integer.valueOf(i2), "p2p_flow_tag");
        if (A002 != null) {
            Map map = this.A03;
            String A0e = C13690nt.A0e(AnonymousClass000.A0l(AnonymousClass000.A0q("p2p_flow_tag"), i2), map);
            if (A0e != null) {
                if (A0e.equals(str)) {
                    Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("P2pFlowPerfTrackerManager.markerFlowPoint used the same qpl flow point twice: ")));
                    return;
                }
                A002.A01(i2, A0e);
            }
            A002.A02(i2, str);
            map.put(AnonymousClass000.A0l(AnonymousClass000.A0q("p2p_flow_tag"), i2), str);
        }
    }
}
