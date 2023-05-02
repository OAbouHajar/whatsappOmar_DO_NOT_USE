package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.52X  reason: invalid class name */
public class AnonymousClass52X implements AnonymousClass25V {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C25801Le A01;
    public final /* synthetic */ C16740tZ A02;

    public AnonymousClass52X(ImageView imageView, C25801Le r2, C16740tZ r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = imageView;
    }

    public int AG6() {
        return this.A01.A0H.A03(this.A00.getContext());
    }

    public /* synthetic */ void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r5) {
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            C16740tZ r1 = this.A02;
            if (!(r1 instanceof C38841rV) && !(r1 instanceof C38641rB)) {
                ImageView imageView = this.A00;
                imageView.setVisibility(0);
                imageView.setImageBitmap(bitmap);
                return;
            }
        }
        this.A00.setVisibility(8);
    }

    public void Afm(View view) {
        this.A00.setImageDrawable(new ColorDrawable(-7829368));
    }
}
