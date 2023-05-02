package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.3Bk  reason: invalid class name and case insensitive filesystem */
public class C62043Bk {
    public static int A00(C37831po r4) {
        return (r4.A0G != null || !r4.A0C.A03) ? r4.A00 == 5 ? R.color.color07f2 : R.color.color07f4 : R.color.color07f5;
    }

    public static AnimationSet A01(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.anim0042);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), R.anim.anim0025);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(view.getContext(), R.anim.anim003c);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(loadAnimation);
        animationSet.addAnimation(loadAnimation3);
        animationSet.addAnimation(loadAnimation2);
        animationSet.setRepeatMode(1);
        animationSet.setRepeatCount(-1);
        animationSet.setStartOffset(750);
        animationSet.setAnimationListener(new IDxLAdapterShape12S0200000_2_I1(view, 0, animationSet));
        return animationSet;
    }

    public static String A02(String str, boolean z2) {
        return C13700nu.A0G(new Uri.Builder().scheme("https").authority("call.whatsapp.com").appendPath(z2 ? "video" : "voice").appendPath(str));
    }

    public static void A03(Context context, View view) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.attr0572, typedValue, true);
        shapeDrawable.getPaint().setColor(typedValue.data);
        view.setBackground(shapeDrawable);
    }

    public static void A04(View view, String str, String str2) {
        C004601z.A0j(view, new AnonymousClass3P9(view, str, str2, false));
    }

    public static void A05(View view, boolean z2) {
        view.setEnabled(z2);
        float f2 = 0.4f;
        if (z2) {
            f2 = 1.0f;
        }
        view.setAlpha(f2);
    }
}
