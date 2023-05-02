package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

/* renamed from: X.62f  reason: invalid class name and case insensitive filesystem */
public class C1205862f implements AnonymousClass25V {
    public final /* synthetic */ C113245lj A00;

    public C1205862f(C113245lj r1) {
        this.A00 = r1;
    }

    public int AG6() {
        return this.A00.A0H.getResources().getDimensionPixelSize(R.dimen.dimen05d3);
    }

    public void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r4) {
        if (bitmap != null) {
            this.A00.A00.setImageBitmap(bitmap);
        } else {
            Afm(view);
        }
    }

    public void Afm(View view) {
        C113245lj r3 = this.A00;
        Drawable A02 = AnonymousClass2SR.A02(r3.A0H.getContext(), R.drawable.cart, R.color.color05a4);
        WaImageView waImageView = r3.A00;
        waImageView.setImageDrawable(A02);
        waImageView.setScaleX(0.5f);
        waImageView.setScaleY(0.5f);
    }
}
