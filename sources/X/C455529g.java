package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.facebook.redex.IDxLAdapterShape4S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.29g  reason: invalid class name and case insensitive filesystem */
public abstract class C455529g {
    public static final boolean A00;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 22) {
            z2 = true;
        }
        A00 = z2;
    }

    public static Bundle A04(Activity activity, View view) {
        if (view == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        A09(activity.getWindow().getDecorView(), arrayList);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Bundle bundle = new Bundle();
        bundle.putInt("x", iArr[0]);
        bundle.putInt("y", iArr[1]);
        bundle.putInt("width", view.getWidth());
        bundle.putInt("height", view.getHeight());
        bundle.putStringArrayList("visible_shared_elements", arrayList);
        return bundle;
    }

    public static Bundle A05(Activity activity, View view, String str) {
        if (!A00 || view == null) {
            return null;
        }
        return AnonymousClass09N.A01(activity, view, str).A03();
    }

    public static View A06(View view, String str) {
        if (str.equals(C004601z.A0L(view))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View A06 = A06(viewGroup.getChildAt(i2), str);
                if (A06 != null) {
                    return A06;
                }
            }
        }
        return null;
    }

    public static void A07(Context context, Intent intent, View view) {
        Activity A01 = AnonymousClass22N.A01(context, C000900k.class);
        if (A01 != null) {
            intent.putExtra("animation_bundle", A04(A01, view));
        }
    }

    public static void A08(Context context, Intent intent, View view, C54602hp r5, String str) {
        C000900k r1 = (C000900k) AnonymousClass22N.A01(context, C000900k.class);
        if (!A00 || r1 == null) {
            context.startActivity(intent);
            if (r1 != null) {
                r1.overridePendingTransition(0, 0);
                return;
            }
            return;
        }
        C455429f.A02(intent, view, r1, r5, str);
    }

    public static void A09(View view, Collection collection) {
        if (!TextUtils.isEmpty(C004601z.A0L(view))) {
            collection.add(C004601z.A0L(view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                A09(viewGroup.getChildAt(i2), collection);
            }
        }
    }

    public void A0A() {
        MediaViewBaseFragment mediaViewBaseFragment = ((AnonymousClass33A) this).A06;
        if (mediaViewBaseFragment.A1B() != null) {
            mediaViewBaseFragment.A0D().overridePendingTransition(0, 0);
        }
    }

    public void A0B(Bundle bundle) {
        AnonymousClass33A r6 = (AnonymousClass33A) this;
        MediaViewBaseFragment mediaViewBaseFragment = r6.A06;
        if (mediaViewBaseFragment.A1B() == null) {
            mediaViewBaseFragment.A1F();
            return;
        }
        C54662hw r3 = mediaViewBaseFragment.A09;
        Object A1D = mediaViewBaseFragment.A1D(r3.getCurrentItem());
        if (mediaViewBaseFragment.A03().getConfiguration().orientation != r6.A03 || A1D == null || !A1D.equals(mediaViewBaseFragment.A1C())) {
            r3.setPivotX((float) (r3.getWidth() / 2));
            r3.setPivotY((float) (r3.getHeight() / 2));
            r6.A02 = 0;
            r6.A04 = 0;
        }
        r3.animate().setDuration(240).scaleX(r6.A01).scaleY(r6.A00).translationX((float) r6.A02).translationY((float) r6.A04).alpha(0.0f).setListener(new IDxLAdapterShape4S0100000_2_I1(r6, 7));
        ObjectAnimator ofInt = ObjectAnimator.ofInt(r6.A05, "alpha", new int[]{MotionEventCompat.ACTION_MASK, 0});
        ofInt.setDuration(240);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public void A0C(Bundle bundle, AnonymousClass29A r12) {
        AnonymousClass33A r5 = (AnonymousClass33A) this;
        MediaViewBaseFragment mediaViewBaseFragment = r5.A06;
        C54662hw r3 = mediaViewBaseFragment.A09;
        int i2 = bundle.getInt("x", 0);
        int i3 = bundle.getInt("y", 0);
        int i4 = bundle.getInt("width", 0);
        int i5 = bundle.getInt("height", 0);
        C005402i x2 = ((C000900k) mediaViewBaseFragment.A0D()).x();
        AnonymousClass00B.A06(x2);
        x2.A06();
        mediaViewBaseFragment.A0G = false;
        View findViewById = mediaViewBaseFragment.A06().findViewById(R.id.background);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        r5.A05 = colorDrawable;
        findViewById.setBackground(colorDrawable);
        r3.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3D9(r3, r12, r5, i2, i3, i4, i5));
    }
}
