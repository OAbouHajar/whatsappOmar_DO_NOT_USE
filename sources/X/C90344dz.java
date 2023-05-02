package X;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.obwhatsapp.R;

/* renamed from: X.4dz  reason: invalid class name and case insensitive filesystem */
public class C90344dz {
    public static final int[] A00 = {16843848};

    public static void A00(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void A01(View view, float f2) {
        int integer = view.getResources().getInteger(R.integer.integer0002);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = (long) integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.attr04bb, -R.attr.attr04bc}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j2));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f2}).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void A02(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        TypedArray A002 = C53382fc.A00(context, attributeSet, A00, new int[0], 0, R.style.style0410);
        try {
            if (A002.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, A002.getResourceId(0, 0)));
            }
        } finally {
            A002.recycle();
        }
    }
}
