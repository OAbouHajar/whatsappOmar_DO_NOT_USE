package X;

/* renamed from: X.1As  reason: invalid class name and case insensitive filesystem */
public class C23161As {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public final C16440t3 A07;
    public final C16490t9 A08;
    public final C19500yX A09;
    public final boolean A0A;
    public final boolean A0B;

    public C23161As(C16440t3 r3, C14710pd r4, C16490t9 r5, C19500yX r6) {
        this.A07 = r3;
        this.A08 = r5;
        this.A09 = r6;
        C16620tM r1 = C16620tM.A02;
        this.A0A = r4.A0E(r1, 125);
        this.A0B = r4.A0E(r1, 980);
    }

    public final void A00(int i2, int i3) {
        String str;
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf == null || (str = valueOf.toString()) == null) {
            str = "";
        }
        this.A09.AKi(i2, "camera_facing", str);
    }

    public final void A01(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_end");
        String obj = sb.toString();
        if (this.A0B) {
            this.A09.AL5(i2, obj);
        }
    }

    public final void A02(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_start");
        String obj = sb.toString();
        if (this.A0B) {
            this.A09.AL5(i2, obj);
        }
    }

    public final void A03(Integer num, int i2, int i3) {
        C19500yX r2 = this.A09;
        r2.AKi(i2, "camera_api", num.intValue() == 0 ? "api_1" : "api_2");
        r2.AKi(i2, "camera_type", i3 == 1 ? "camera_core" : "wa");
    }

    public final void A04(String str, String str2) {
        if (this.A0B) {
            C19500yX r2 = this.A09;
            if (!r2.AJC(554251647)) {
                r2.ALH(554251647, "startup_type", str);
                r2.AKi(554251647, "origin", str2);
            }
        }
    }

    public void A05(short s2) {
        if (this.A0B) {
            this.A09.AKz(554251647, s2);
        }
    }
}
