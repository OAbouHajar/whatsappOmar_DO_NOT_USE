package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.52Y  reason: invalid class name */
public class AnonymousClass52Y implements AnonymousClass25V {
    public final int A00;
    public final ImageView A01;
    public final C25791Ld A02;

    public AnonymousClass52Y(ImageView imageView, C25791Ld r2, int i2) {
        this.A02 = r2;
        this.A01 = imageView;
        this.A00 = i2;
    }

    public int AG6() {
        return this.A02.A03(this.A01.getContext());
    }

    public /* synthetic */ void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r5) {
        ImageView imageView = this.A01;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(this.A00);
        }
    }

    public void Afm(View view) {
        this.A01.setImageDrawable(new ColorDrawable(-7829368));
    }
}
