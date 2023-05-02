package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3OQ  reason: invalid class name */
public class AnonymousClass3OQ extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;

    public AnonymousClass3OQ(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.layout0614, this);
        this.A04 = C13680ns.A0L(this, R.id.wallpaper_category_title);
        this.A03 = C13680ns.A0J(this, R.id.wallpaper_category_preview);
        this.A02 = C13680ns.A0J(this, R.id.wallpaper_category_preview_icon);
    }

    public void A00(Drawable drawable, Drawable drawable2, String str) {
        int i2;
        this.A04.setText(str);
        this.A03.setImageDrawable(drawable);
        ImageView imageView = this.A02;
        if (drawable2 == null) {
            i2 = 8;
        } else {
            imageView.setImageDrawable(drawable2);
            i2 = 0;
        }
        imageView.setVisibility(i2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setPreviewScaleType(ImageView.ScaleType scaleType) {
        this.A03.setScaleType(scaleType);
    }
}
