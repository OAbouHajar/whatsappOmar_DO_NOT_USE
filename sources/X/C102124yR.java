package X;

import android.graphics.Bitmap;

/* renamed from: X.4yR  reason: invalid class name and case insensitive filesystem */
public class C102124yR implements AnonymousClass2OV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2BF A01;
    public final /* synthetic */ C606034k A02;

    public C102124yR(AnonymousClass2BF r1, C606034k r2, int i2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i2;
    }

    public String AGT() {
        return "MY_PHOTOS_VIEW_HOLDER_TAG";
    }

    public Bitmap AKB() {
        if (this.A02.A05.getTag() != this) {
            return null;
        }
        Bitmap Agi = this.A01.Agi(this.A00);
        return Agi == null ? C816349d.A00 : Agi;
    }
}
