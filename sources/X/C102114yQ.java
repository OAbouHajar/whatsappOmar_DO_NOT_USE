package X;

import android.graphics.Bitmap;

/* renamed from: X.4yQ  reason: invalid class name and case insensitive filesystem */
public class C102114yQ implements AnonymousClass2OV {
    public final /* synthetic */ AnonymousClass2BF A00;
    public final /* synthetic */ AnonymousClass4S6 A01;
    public final /* synthetic */ C57742rg A02;

    public C102114yQ(AnonymousClass2BF r1, AnonymousClass4S6 r2, C57742rg r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String AGT() {
        return this.A01.A00();
    }

    public Bitmap AKB() {
        C57742rg r2 = this.A02;
        if (r2.A02.getTag() != this) {
            return null;
        }
        Bitmap Agi = this.A00.Agi(r2.A05.A02);
        return Agi == null ? C816349d.A00 : Agi;
    }
}
