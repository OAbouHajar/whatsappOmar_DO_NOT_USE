package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.34j  reason: invalid class name and case insensitive filesystem */
public class C605934j extends AnonymousClass3T0 {
    public final AnonymousClass3OQ A00;

    public C605934j(AnonymousClass4FA r1, AnonymousClass3OQ r2) {
        super(r2, r1);
        this.A00 = r2;
    }

    public void A08(Integer num) {
        String str;
        int i2;
        GradientDrawable gradientDrawable;
        Context context = this.A0H.getContext();
        int intValue = num.intValue();
        Drawable drawable = null;
        if (intValue == 0) {
            str = context.getString(R.string.str1b41);
            i2 = R.drawable.ic_wallpaper_thumb_bright;
            gradientDrawable = C13690nt.A0C(context, i2);
        } else if (intValue == 1) {
            str = context.getString(R.string.str1b42);
            i2 = R.drawable.ic_wallpaper_thumb_dark;
            gradientDrawable = C13690nt.A0C(context, i2);
        } else if (intValue == 2) {
            str = context.getString(R.string.str1663);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setSize(1, 1);
            gradientDrawable2.setColor(AnonymousClass00T.A00(context, R.color.color0820));
            gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable2, AnonymousClass2SR.A06(C13690nt.A0C(context, R.drawable.whatsapp_doodle), AnonymousClass00T.A00(context, R.color.color083d))});
        } else if (intValue == 3) {
            str = context.getString(R.string.str1b43);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setSize(1, 1);
            gradientDrawable3.setColor(AnonymousClass00T.A00(context, R.color.color00bf));
            drawable = AnonymousClass2SR.A02(context, R.drawable.ic_attachment_gallery, R.color.color090b);
            gradientDrawable = gradientDrawable3;
        } else {
            throw AnonymousClass000.A0a(AnonymousClass000.A0g("Unknown categoryType: ", num));
        }
        AnonymousClass3OQ r1 = this.A00;
        r1.A00(gradientDrawable, drawable, str);
        r1.setPreviewScaleType(intValue == 2 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP);
    }
}
