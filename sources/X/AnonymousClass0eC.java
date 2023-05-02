package X;

import java.util.List;

/* renamed from: X.0eC  reason: invalid class name */
public class AnonymousClass0eC implements C13320lq {
    public float A00;
    public float A01;
    public int A02 = -1;
    public C05410Rd A03 = null;
    public List A04 = AnonymousClass000.A0u();
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = false;
    public final /* synthetic */ AnonymousClass0XJ A08;

    public AnonymousClass0eC(C08730eD r3, AnonymousClass0XJ r4) {
        this.A08 = r4;
        if (r3 != null) {
            r3.A03(this);
            if (this.A05) {
                this.A04.get(-1);
                throw AnonymousClass000.A0W("add");
            }
        }
    }

    public void A58(float f2, float f3, float f4, float f5, float f6, boolean z2, boolean z3) {
        this.A07 = true;
        this.A06 = false;
        C05410Rd r0 = this.A03;
        AnonymousClass0XJ.A0F(this, r0.A02, r0.A03, f2, f3, f4, f5, f6, z2, z3);
        this.A06 = true;
        this.A05 = false;
    }

    public void A7g(float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.A06 || this.A07) {
            C05410Rd r1 = this.A03;
            r1.A00(f2, f3);
            this.A04.add(r1);
            this.A07 = false;
        }
        this.A03 = new C05410Rd(this.A08, f6, f7, f6 - f4, f7 - f5);
        this.A05 = false;
    }

    public void AK9(float f2, float f3) {
        C05410Rd r1 = this.A03;
        r1.A00(f2, f3);
        this.A04.add(r1);
        AnonymousClass0XJ r2 = this.A08;
        C05410Rd r12 = this.A03;
        this.A03 = new C05410Rd(r2, f2, f3, f2 - r12.A02, f3 - r12.A03);
        this.A05 = false;
    }

    public void ALb(float f2, float f3) {
        if (this.A05) {
            C05410Rd r1 = this.A03;
            List list = this.A04;
            r1.A01((C05410Rd) list.get(this.A02));
            list.set(this.A02, this.A03);
            this.A05 = false;
        }
        C05410Rd r12 = this.A03;
        if (r12 != null) {
            this.A04.add(r12);
        }
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = new C05410Rd(this.A08, f2, f3, 0.0f, 0.0f);
        this.A02 = this.A04.size();
    }

    public void AbD(float f2, float f3, float f4, float f5) {
        C05410Rd r1 = this.A03;
        r1.A00(f2, f3);
        this.A04.add(r1);
        this.A03 = new C05410Rd(this.A08, f4, f5, f4 - f2, f5 - f3);
        this.A05 = false;
    }

    public void close() {
        this.A04.add(this.A03);
        AK9(this.A00, this.A01);
        this.A05 = true;
    }
}
