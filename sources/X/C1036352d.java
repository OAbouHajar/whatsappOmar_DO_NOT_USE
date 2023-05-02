package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.52d  reason: invalid class name and case insensitive filesystem */
public class C1036352d implements AnonymousClass25V {
    public final int A00;
    public final int A01;

    public C1036352d(Context context) {
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.dimen0799);
        this.A00 = AnonymousClass00T.A00(context, C434920f.A09(context) ? R.color.color0742 : R.color.color0741);
    }

    public static int A00(C16740tZ r2) {
        byte b2 = r2.A10;
        if (!(b2 == 1 || b2 == 3)) {
            return b2 != 15 ? (b2 == 23 || b2 == 37) ? R.drawable.ic_thumbnail_status_unavailable : R.drawable.circle_shade_big : R.drawable.ic_status_revoked;
        }
    }

    public int AG6() {
        return this.A01;
    }

    public /* synthetic */ void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r5) {
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
            bitmap.setPixel(0, 0, this.A00);
        }
        ((ImageView) view).setImageBitmap(bitmap);
    }

    public void Afm(View view) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(R.drawable.circle_shade_big);
        }
    }
}
