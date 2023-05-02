package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.4yX  reason: invalid class name and case insensitive filesystem */
public class C102184yX implements AnonymousClass2OW {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass2OV A01;
    public final /* synthetic */ C606034k A02;
    public final /* synthetic */ String A03;

    public C102184yX(Context context, AnonymousClass2OV r2, C606034k r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = str;
    }

    public void A5K() {
    }

    public /* synthetic */ void AQs() {
    }

    public void AY3(Bitmap bitmap, boolean z2) {
        C606034k r2 = this.A02;
        AnonymousClass3OQ r3 = r2.A05;
        if (r3.getTag() == this.A01 && bitmap != C816349d.A00) {
            r2.A01 = true;
            r3.A00(new BitmapDrawable(this.A00.getResources(), bitmap), (Drawable) null, this.A03);
        }
    }
}
