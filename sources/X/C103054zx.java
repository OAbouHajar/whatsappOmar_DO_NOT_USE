package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

/* renamed from: X.4zx  reason: invalid class name and case insensitive filesystem */
public abstract class C103054zx implements C109375Rw {
    public final int A00;

    public C103054zx(int i2) {
        this.A00 = i2;
    }

    public View AGw(Context context) {
        WaImageView waImageView = new WaImageView(context);
        waImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        waImageView.setImageResource(this.A00);
        C018808t.A01(PorterDuff.Mode.SRC_IN, waImageView);
        C018808t.A00(ColorStateList.valueOf(AnonymousClass00T.A00(context, R.color.color0599)), waImageView);
        return waImageView;
    }
}
