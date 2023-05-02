package X;

/* renamed from: X.1Vr  reason: invalid class name and case insensitive filesystem */
public class C28341Vr {
    public int A00 = 1;
    public int A01 = 0;
    public int A02 = 1;
    public int A03 = 0;
    public C40111ta A04 = null;
    public C40111ta A05 = null;
    public String A06 = null;
    public String A07 = null;
    public boolean A08 = false;

    public C28341Vr() {
    }

    public C28341Vr(C28351Vs r3) {
        this.A03 = r3.A03;
        this.A01 = r3.A01;
        this.A07 = r3.A07;
        this.A06 = r3.A06;
        this.A05 = r3.A05;
        this.A04 = r3.A04;
        this.A08 = r3.A08;
        this.A02 = r3.A02;
        this.A00 = r3.A00;
    }

    public C28341Vr(C40111ta r3, C40111ta r4, String str, String str2, int i2, int i3, int i4, int i5) {
        this.A03 = i2;
        this.A01 = i3;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r3;
        this.A04 = r4;
        this.A02 = i4;
        this.A00 = i5;
    }

    public static C28341Vr A00(C28331Vq r2) {
        C28341Vr r1 = new C28341Vr();
        r1.A01 = r2.A03;
        r1.A06 = r2.A08;
        r1.A04 = r2.A00();
        r1.A00 = C32441gM.A00(r2);
        return r1;
    }

    public C28351Vs A01() {
        int i2 = this.A03;
        int i3 = this.A01;
        String str = this.A07;
        String str2 = this.A06;
        return new C28351Vs(this.A05, this.A04, str, str2, i2, i3, this.A02, this.A00, this.A08);
    }
}
