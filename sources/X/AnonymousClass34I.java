package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

/* renamed from: X.34I  reason: invalid class name */
public abstract class AnonymousClass34I extends C71403kJ {
    public final FrameLayout A00;
    public final LinearLayout A01 = ((LinearLayout) C004601z.A0E(this, R.id.button_frame));
    public final WaImageView A02 = C13690nt.A0R(this, R.id.kept_status);
    public final WaImageView A03 = C13690nt.A0R(this, R.id.starred_status);

    public AnonymousClass34I(Context context) {
        super(context);
        this.A00 = getRatio();
        FrameLayout.inflate(context, R.layout.layout052c, this);
        FrameLayout A08 = C13700nu.A08(this, R.id.overlay);
        this.A00 = A08;
        ImageView A0J = C13680ns.A0J(this, R.id.button_image);
        Drawable A04 = AnonymousClass00T.A04(context, getMark());
        if (A04 != null) {
            int markTintColor = getMarkTintColor();
            A04 = markTintColor != -1 ? AnonymousClass2SR.A04(context, A04, markTintColor) : A04;
            A0J.setImageDrawable(A04);
            A08.setLayoutParams(new FrameLayout.LayoutParams(-1, A04.getIntrinsicHeight() << 1, 80));
            A08.setVisibility(0);
            A0J.setImageDrawable(A04);
        }
    }

    public abstract int getMark();

    public int getMarkTintColor() {
        return -1;
    }

    public abstract float getRatio();

    public void setMessage(C16730tY r3) {
        this.A02 = r3;
        A04(this.A03, this.A02);
    }

    public void setRadius(int i2) {
        this.A00 = i2;
        if (i2 > 0) {
            FrameLayout frameLayout = this.A00;
            frameLayout.setBackground(AnonymousClass00T.A04(getContext(), R.drawable.search_media_thumbnail_rounded_overlay));
            frameLayout.setLayoutParams(C13690nt.A0M());
            ((GradientDrawable) frameLayout.getBackground()).setCornerRadius((float) i2);
        }
    }
}
