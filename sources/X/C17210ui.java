package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.0ui  reason: invalid class name and case insensitive filesystem */
public class C17210ui {
    public int A00;
    public String A01;
    public Random A02;
    public final C17180uf A03;
    public final C16490t9 A04;

    public C17210ui(C17180uf r1, C16490t9 r2) {
        this.A04 = r2;
        this.A03 = r1;
    }

    public void A00(int i2) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = Integer.valueOf(i2);
        r1.A0E = 2;
        r1.A03 = 0;
        A06(r1);
    }

    public void A01(int i2) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = Integer.valueOf(i2);
        A06(r1);
    }

    public void A02(int i2, int i3) {
        C74883rG r2 = new C74883rG();
        this.A00 = i2;
        if (i3 == 3 || i3 == 5 || i3 == 7) {
            Random random = this.A02;
            if (random == null) {
                random = new Random();
                this.A02 = random;
            }
            this.A01 = Long.toHexString(random.nextLong());
        }
        r2.A01 = 0L;
        r2.A00 = Integer.valueOf(i3);
        r2.A02 = this.A01;
        this.A04.A06(r2);
    }

    public void A03(int i2, int i3) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = Integer.valueOf(i2);
        r1.A0E = Integer.valueOf(i3);
        r1.A03 = 1;
        A06(r1);
    }

    public void A04(int i2, long j2, int i3) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = 8;
        r1.A0V = Long.valueOf(j2);
        r1.A06 = Integer.valueOf(i2);
        if (i3 == 0) {
            i3 = 2;
        }
        r1.A0C = Integer.valueOf(i3);
        A06(r1);
    }

    public void A05(int i2, long j2, int i3) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = 7;
        r1.A0R = Long.valueOf(j2);
        r1.A06 = Integer.valueOf(i2);
        if (i3 == 0) {
            i3 = 2;
        }
        r1.A0C = Integer.valueOf(i3);
        A06(r1);
    }

    public final void A06(C29151a7 r3) {
        r3.A0a = this.A01;
        r3.A09 = Integer.valueOf(this.A00);
        r3.A0O = 0L;
        this.A04.A06(r3);
    }

    public final void A07(C29151a7 r3) {
        r3.A0a = this.A01;
        r3.A09 = Integer.valueOf(this.A00);
        r3.A0O = 1L;
        this.A04.A06(r3);
    }

    public void A08(Double d2, Integer num, String str, String str2, double d3, int i2, int i3) {
        if (!TextUtils.isEmpty(str2) && num != null) {
            C75513sH r2 = new C75513sH();
            r2.A05 = str2;
            r2.A04 = Long.valueOf((long) i2);
            r2.A02 = num;
            r2.A03 = Integer.valueOf(i3);
            r2.A06 = str;
            r2.A01 = Double.valueOf(d3);
            r2.A00 = d2;
            this.A04.A06(r2);
        }
    }

    public void A09(Integer num, int i2) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = Integer.valueOf(i2);
        r1.A06 = num;
        A06(r1);
    }

    public void A0A(Integer num, int i2, int i3) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = Integer.valueOf(i2);
        r1.A0A = Integer.valueOf(i3);
        r1.A06 = num;
        A06(r1);
    }

    public void A0B(Integer num, int i2, int i3) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = Integer.valueOf(i2);
        r1.A0C = Integer.valueOf(i3);
        r1.A06 = num;
        A06(r1);
    }

    public void A0C(Integer num, Integer num2, Integer num3, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, int i2) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = Integer.valueOf(i2);
        r1.A0K = l2;
        r1.A0I = l3;
        r1.A0J = l4;
        r1.A0M = l5;
        r1.A0N = 1L;
        r1.A06 = num3;
        r1.A0P = l6;
        r1.A0T = l7;
        r1.A0H = l8;
        if (str != null) {
            r1.A0G = Long.valueOf((long) str.length());
            r1.A0L = Long.valueOf((long) str.trim().split("\\s+").length);
        }
        if (this.A03.A05()) {
            r1.A01 = num2;
            r1.A02 = num;
        }
        A06(r1);
    }

    public void A0D(Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        C75773sh r2 = new C75773sh();
        r2.A09 = this.A01;
        r2.A00 = 0;
        r2.A06 = str;
        r2.A05 = num == null ? null : Long.valueOf(num.longValue());
        if (num2 != null) {
            r2.A03 = Long.valueOf(num2.longValue());
        }
        if (num3 != null) {
            r2.A04 = Long.valueOf(num3.longValue());
        }
        r2.A08 = str2;
        r2.A07 = str3;
        this.A04.A06(r2);
    }

    public void A0E(Integer num, Integer num2, String str, String str2, int i2, int i3, int i4, int i5, long j2, long j3, long j4) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = 12;
        r1.A0T = Long.valueOf(j2);
        r1.A06 = Integer.valueOf(i2);
        r1.A02 = num;
        r1.A0b = str;
        r1.A0c = str2;
        r1.A0P = Long.valueOf(j3);
        r1.A0S = Long.valueOf(j4);
        r1.A01 = num2;
        r1.A04 = Integer.valueOf(i3);
        r1.A05 = Integer.valueOf(i5);
        if (i4 == 0) {
            i4 = 2;
        }
        r1.A0C = Integer.valueOf(i4);
        A06(r1);
    }

    public void A0F(String str, String str2, int i2, int i3, int i4, int i5, long j2, long j3, long j4) {
        C29151a7 r1 = new C29151a7();
        r1.A0B = 38;
        r1.A0T = Long.valueOf(j2);
        r1.A0b = str;
        r1.A0c = str2;
        r1.A0P = Long.valueOf(j3);
        r1.A0S = Long.valueOf(j4);
        r1.A06 = Integer.valueOf(i2);
        r1.A04 = Integer.valueOf(i3);
        r1.A05 = Integer.valueOf(i5);
        if (i4 == 0) {
            i4 = 2;
        }
        r1.A0C = Integer.valueOf(i4);
        A06(r1);
    }

    public void A0G(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A04.A06((C16470t7) it.next());
            }
        }
    }
}
