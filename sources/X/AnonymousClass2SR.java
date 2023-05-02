package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.2SR  reason: invalid class name */
public class AnonymousClass2SR {
    public static Drawable A00(Context context, int i2) {
        return A02(context, i2, R.color.color055a);
    }

    public static Drawable A01(Context context, int i2) {
        Drawable A04 = AnonymousClass00T.A04(context, i2);
        AnonymousClass00B.A06(A04);
        return A04;
    }

    public static Drawable A02(Context context, int i2, int i3) {
        Integer num;
        Drawable A04 = AnonymousClass00T.A04(context, i2);
        AnonymousClass00B.A06(A04);
        Drawable mutate = A04.mutate();
        try {
            num = Integer.valueOf(AnonymousClass00T.A00(context, i3));
        } catch (Resources.NotFoundException unused) {
            num = null;
        }
        return (num == null || num.intValue() == 0) ? mutate : A06(mutate, AnonymousClass00T.A00(context, i3));
    }

    public static Drawable A03(Context context, Drawable drawable) {
        ColorStateList A03 = AnonymousClass00T.A03(context, R.color.color06aa);
        if (Build.VERSION.SDK_INT >= 21 && A03 != null) {
            return new RippleDrawable(A03, drawable, (Drawable) null);
        }
        if (!(drawable instanceof AnonymousClass07X)) {
            drawable = C018208n.A03(drawable);
        }
        C018208n.A07(PorterDuff.Mode.MULTIPLY, drawable);
        C018208n.A04(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{AnonymousClass00T.A00(context, R.color.color06a7), AnonymousClass00T.A00(context, R.color.color0578)}), drawable);
        return drawable;
    }

    public static Drawable A04(Context context, Drawable drawable, int i2) {
        return A06(drawable, AnonymousClass00T.A00(context, i2));
    }

    public static Drawable A05(Resources resources, View view, View view2) {
        view.setBackgroundColor(resources.getColor(R.color.color04d7));
        return A02(view2.getContext(), R.drawable.camera, R.color.color04d8);
    }

    public static Drawable A06(Drawable drawable, int i2) {
        if (i2 == 0) {
            return drawable;
        }
        Drawable A03 = C018208n.A03(drawable);
        C018208n.A0A(A03, i2);
        return A03;
    }

    public static void A07(Context context, ImageView imageView, int i2) {
        A08(imageView, AnonymousClass00T.A00(context, i2));
    }

    public static void A08(ImageView imageView, int i2) {
        C018808t.A01(PorterDuff.Mode.SRC_IN, imageView);
        C018808t.A00(i2 == 0 ? null : ColorStateList.valueOf(i2), imageView);
    }

    public static void A09(TextView textView, int i2) {
        if (i2 != 0) {
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
                }
            }
        }
    }
}
