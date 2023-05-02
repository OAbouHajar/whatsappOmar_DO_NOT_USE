package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import java.lang.ref.WeakReference;

/* renamed from: X.36T  reason: invalid class name */
public class AnonymousClass36T extends C16690tT {
    public final float A00;
    public final int A01;
    public final C17160ud A02;
    public final AnonymousClass152 A03;
    public final C16010sH A04;
    public final C17240ul A05;
    public final WeakReference A06;

    public AnonymousClass36T(ImageView imageView, C17160ud r4, AnonymousClass152 r5, C16010sH r6, C17240ul r7) {
        this.A02 = r4;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = C13680ns.A0D(imageView).getDimensionPixelSize(R.dimen.dimen025e);
        this.A00 = this.A05.A0m(C16050sL.A03(r6.A0E)) ? -2.14748365E9f : yo.setSQPC(C13680ns.A0D(imageView).getDimension(R.dimen.dimen0748));
        this.A06 = C13690nt.A0h(imageView);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        View view = (View) this.A06.get();
        if (view == null) {
            return null;
        }
        return this.A03.A00(view.getContext(), this.A04, this.A00, this.A01);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A06.get();
        if (imageView != null) {
            if (bitmap == null) {
                C17160ud r2 = this.A02;
                bitmap = r2.A03(imageView.getContext(), r2.A01(this.A04));
            }
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }
}
