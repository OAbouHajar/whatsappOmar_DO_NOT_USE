package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3T1  reason: invalid class name */
public abstract class AnonymousClass3T1 extends C005602k {
    public final WaImageButton A00;
    public final WaTextView A01;

    public AnonymousClass3T1(View view) {
        super(view);
        this.A00 = (WaImageButton) C004601z.A0E(view, R.id.category_icon);
        this.A01 = C13680ns.A0S(view, R.id.category_name);
    }

    public void A07(int i2) {
        int A03 = AnonymousClass090.A03(0.08f, i2, -16777216);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i2, A03});
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(2);
        gradientDrawable.setGradientCenter(-1.0f, 0.5f);
        WaImageButton waImageButton = this.A00;
        gradientDrawable.setSize(waImageButton.getWidth(), waImageButton.getHeight());
        waImageButton.setBackground(AnonymousClass2SR.A03(this.A0H.getContext(), gradientDrawable));
    }
}
