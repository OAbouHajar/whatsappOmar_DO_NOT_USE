package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.lang.ref.SoftReference;

/* renamed from: X.3z0  reason: invalid class name and case insensitive filesystem */
public class C78983z0 extends C16690tT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ C35361lo A03;
    public final /* synthetic */ C209512f A04;
    public final /* synthetic */ String A05;

    public C78983z0(ImageView imageView, C35361lo r2, C209512f r3, String str, int i2, int i3) {
        this.A04 = r3;
        this.A05 = str;
        this.A03 = r2;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = imageView;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C209512f r0 = this.A04;
        return r0.A01.A03(this.A03.A02(r0.A00.A0A()), this.A05, this.A01, this.A00);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ImageView imageView = this.A02;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), bitmap);
            this.A04.A03.put(this.A05, new SoftReference(bitmapDrawable));
            imageView.setImageDrawable(bitmapDrawable);
        }
    }
}
