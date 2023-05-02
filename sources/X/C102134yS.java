package X;

import android.graphics.Bitmap;

/* renamed from: X.4yS  reason: invalid class name and case insensitive filesystem */
public class C102134yS implements AnonymousClass2OV {
    public final /* synthetic */ AnonymousClass2BF A00;
    public final /* synthetic */ C54612hq A01;
    public final /* synthetic */ C54502hd A02;
    public final /* synthetic */ C64713Rj A03;

    public C102134yS(AnonymousClass2BF r1, C54612hq r2, C54502hd r3, C64713Rj r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }

    public String AGT() {
        return C61883Au.A02(this.A00);
    }

    public Bitmap AKB() {
        if (this.A02.getTag() != this) {
            return null;
        }
        C64713Rj r2 = this.A03;
        int i2 = r2.A06;
        if (i2 == -1) {
            i2 = r2.A05;
        }
        if (i2 == -1) {
            return null;
        }
        Bitmap Agi = this.A00.Agi(this.A01.A05.A03);
        return Agi == null ? C816349d.A00 : Agi;
    }
}
