package X;

import android.app.Activity;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.obwhatsapp.R;

/* renamed from: X.3Ax  reason: invalid class name and case insensitive filesystem */
public class C61913Ax {
    public static final boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2 == 23) goto L_0x000b;
     */
    static {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r2 < r0) goto L_0x000b
            r1 = 23
            r0 = 1
            if (r2 != r1) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61913Ax.<clinit>():void");
    }

    public static void A00(Activity activity) {
        if (A00) {
            Window window = activity.getWindow();
            window.requestFeature(13);
            Slide slide = new Slide(5);
            slide.excludeTarget(16908335, true);
            slide.excludeTarget(16908336, true);
            slide.setInterpolator(new DecelerateInterpolator());
            window.setEnterTransition(slide);
            window.setReturnTransition(slide);
        }
    }

    public static void A01(Bundle bundle, C14530pL r13, C54602hp r14) {
        if (C455529g.A00) {
            Window window = r13.getWindow();
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            ChangeBounds changeBounds = new ChangeBounds();
            ChangeBounds changeBounds2 = new ChangeBounds();
            changeBounds.excludeTarget(r14.A00(R.string.str1dd3), true);
            changeBounds.excludeTarget(r14.A00(R.string.str1dd2), true);
            changeBounds2.excludeTarget(r14.A00(R.string.str1dd3), true);
            changeBounds2.excludeTarget(r14.A00(R.string.str1dd2), true);
            C56532no r1 = new C56532no(r13, r14, true);
            C56532no r6 = new C56532no(r13, r14, false);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setDuration(220);
            transitionSet.setInterpolator(accelerateDecelerateInterpolator);
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(r1);
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.setInterpolator(accelerateDecelerateInterpolator);
            transitionSet2.setDuration(240);
            transitionSet2.addTransition(changeBounds2);
            transitionSet2.addTransition(r6);
            window.setSharedElementEnterTransition(transitionSet);
            window.setSharedElementReturnTransition(transitionSet2);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade.setDuration(220);
            fade2.setDuration(240);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
            if (bundle == null) {
                r13.A0b();
            }
        }
    }
}
