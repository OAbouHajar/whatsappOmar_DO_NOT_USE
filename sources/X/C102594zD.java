package X;

import android.graphics.Bitmap;

/* renamed from: X.4zD  reason: invalid class name and case insensitive filesystem */
public class C102594zD implements C51282bN {
    public final C28381Vw A00;
    public final /* synthetic */ C16740tZ A01;
    public final /* synthetic */ AnonymousClass1ZP A02;
    public final /* synthetic */ Bitmap[] A03;

    public C102594zD(C16740tZ r1, C28381Vw r2, AnonymousClass1ZP r3, Bitmap[] bitmapArr) {
        this.A02 = r3;
        this.A03 = bitmapArr;
        this.A01 = r1;
        this.A00 = r2;
    }

    public void AUM(AnonymousClass1ZR r9, boolean z2) {
        C28381Vw r5 = this.A00;
        AnonymousClass1ZP r1 = this.A02;
        if (r5 == r1.A0A) {
            int i2 = r1.A06;
            Bitmap[] bitmapArr = this.A03;
            r1.A09(r9, r9.A0A, this.A01, r5, bitmapArr, i2);
        }
    }
}
