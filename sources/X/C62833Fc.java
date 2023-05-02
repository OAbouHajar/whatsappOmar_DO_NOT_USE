package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.3Fc  reason: invalid class name and case insensitive filesystem */
public class C62833Fc implements AnonymousClass2OW {
    public Context A00;
    public AnonymousClass329 A01;
    public final int A02;
    public final Drawable A03;
    public final C34711kk A04;
    public final C62823Fb A05;

    public C62833Fc(C34711kk r3, C62823Fb r4, AnonymousClass329 r5) {
        Context context = r5.getContext();
        this.A00 = context;
        this.A05 = r4;
        this.A01 = r5;
        this.A04 = r3;
        int A002 = AnonymousClass00T.A00(context, R.color.color00ef);
        this.A02 = A002;
        this.A03 = new ColorDrawable(A002);
    }

    public void A5K() {
        AnonymousClass329 r1 = this.A01;
        r1.setBackgroundColor(this.A02);
        r1.setImageDrawable((Drawable) null);
    }

    public /* synthetic */ void AQs() {
    }

    public void AY3(Bitmap bitmap, boolean z2) {
        AnonymousClass329 r4 = this.A01;
        Object tag = r4.getTag();
        C62823Fb r3 = this.A05;
        if (tag == r3) {
            if (bitmap == C816349d.A00) {
                r4.setScaleType(ImageView.ScaleType.CENTER);
                r4.setBackgroundColor(this.A02);
                r4.setImageResource(R.drawable.ic_missing_thumbnail_picture);
            } else {
                r4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                r4.setBackgroundResource(0);
                if (!z2) {
                    Drawable[] drawableArr = new Drawable[2];
                    drawableArr[0] = this.A03;
                    C13680ns.A1E(r4, new BitmapDrawable(this.A00.getResources(), bitmap), drawableArr);
                } else {
                    r4.setImageBitmap(bitmap);
                }
            }
            this.A04.A03(r3.AGT(), bitmap);
        }
    }
}
