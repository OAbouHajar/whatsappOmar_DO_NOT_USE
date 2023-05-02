package X;

import android.graphics.Path;

/* renamed from: X.0eB  reason: invalid class name and case insensitive filesystem */
public class C08720eB implements C13320lq {
    public float A00;
    public float A01;
    public Path A02 = AnonymousClass000.A0I();
    public final /* synthetic */ AnonymousClass0XJ A03;

    public C08720eB(C08730eD r2, AnonymousClass0XJ r3) {
        this.A03 = r3;
        if (r2 != null) {
            r2.A03(this);
        }
    }

    public void A58(float f2, float f3, float f4, float f5, float f6, boolean z2, boolean z3) {
        AnonymousClass0XJ.A0F(this, this.A00, this.A01, f2, f3, f4, f5, f6, z2, z3);
        this.A00 = f5;
        this.A01 = f6;
    }

    public void A7g(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A02.cubicTo(f2, f3, f4, f5, f6, f7);
        this.A00 = f6;
        this.A01 = f7;
    }

    public void AK9(float f2, float f3) {
        this.A02.lineTo(f2, f3);
        this.A00 = f2;
        this.A01 = f3;
    }

    public void ALb(float f2, float f3) {
        this.A02.moveTo(f2, f3);
        this.A00 = f2;
        this.A01 = f3;
    }

    public void AbD(float f2, float f3, float f4, float f5) {
        this.A02.quadTo(f2, f3, f4, f5);
        this.A00 = f4;
        this.A01 = f5;
    }

    public void close() {
        this.A02.close();
    }
}
