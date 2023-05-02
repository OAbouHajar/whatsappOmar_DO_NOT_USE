package X;

import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;
import com.obwhatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.29f  reason: invalid class name and case insensitive filesystem */
public class C455429f extends C455529g {
    public final C54602hp A00;
    public final MediaViewBaseFragment A01;

    public C455429f(C54602hp r1, MediaViewBaseFragment mediaViewBaseFragment) {
        this.A00 = r1;
        this.A01 = mediaViewBaseFragment;
    }

    public static AnonymousClass050 A00(View view, C000900k r2, AnonymousClass02C r3, C54602hp r4, String str) {
        Object obj;
        ArrayList A012 = A01(view, r2, r4, str);
        AnonymousClass050 r1 = new AnonymousClass050(r3);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            AnonymousClass01Q r0 = (AnonymousClass01Q) it.next();
            Object obj2 = r0.A00;
            if (!(obj2 == null || (obj = r0.A01) == null)) {
                View view2 = (View) obj2;
                String str2 = (String) obj;
                if (AnonymousClass0Vo.A00 != null || AnonymousClass0Vo.A01 != null) {
                    String A0L = C004601z.A0L(view2);
                    if (A0L != null) {
                        if (r1.A0C == null) {
                            r1.A0C = new ArrayList();
                            r1.A0D = new ArrayList();
                        } else if (r1.A0D.contains(str2)) {
                            StringBuilder sb = new StringBuilder("A shared element with the target name '");
                            sb.append(str2);
                            sb.append("' has already been added to the transaction.");
                            throw new IllegalArgumentException(sb.toString());
                        } else if (r1.A0C.contains(A0L)) {
                            StringBuilder sb2 = new StringBuilder("A shared element with the source name '");
                            sb2.append(A0L);
                            sb2.append("' has already been added to the transaction.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        r1.A0C.add(A0L);
                        r1.A0D.add(str2);
                    } else {
                        throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                    }
                }
            }
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a7, code lost:
        if (r2 == 0) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ad, code lost:
        if (r6 != r11.getHeight()) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00af, code lost:
        X.C004601z.A0i(r11, new android.graphics.Rect(0, r2, r11.getWidth(), r6));
        r11.postDelayed(new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10((java.lang.Object) r11, 5), (long) r12.getResources().getInteger(17694721));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d0, code lost:
        r3.addAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d3, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(android.view.View r11, X.C000900k r12, X.C54602hp r13, java.lang.String r14) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.C004601z.A0n(r11, r14)
            java.lang.String r1 = r11.getTransitionName()
            X.01Q r0 = new X.01Q
            r0.<init>(r11, r1)
            r3.add(r0)
            r0 = 16908335(0x102002f, float:2.387736E-38)
            android.view.View r2 = r12.findViewById(r0)
            if (r2 == 0) goto L_0x002b
            java.lang.String r1 = "statusBar"
            X.C004601z.A0n(r2, r1)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x002b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r11.getHeight()
            r8 = 2
            int[] r7 = new int[r8]
            r11.getLocationOnScreen(r7)
            r0 = 2131366759(0x7f0a1367, float:1.835342E38)
            android.view.View r5 = r12.findViewById(r0)
            r10 = 1
            if (r5 == 0) goto L_0x007f
            r0 = 2131893714(0x7f121dd2, float:1.9422212E38)
            java.lang.String r1 = r13.A00(r0)
            X.C004601z.A0n(r5, r1)
            X.01Q r0 = new X.01Q
            r0.<init>(r5, r1)
            r4.add(r0)
            int[] r9 = new int[r8]
            r5.getLocationOnScreen(r9)
            r2 = r7[r10]
            int r0 = r11.getHeight()
            int r2 = r2 + r0
            r1 = r9[r10]
            int r0 = r5.getHeight()
            int r1 = r1 + r0
            if (r2 <= r1) goto L_0x007f
            r2 = r7[r10]
            int r0 = r11.getHeight()
            int r2 = r2 + r0
            r1 = r9[r10]
            int r0 = r5.getHeight()
            int r1 = r1 + r0
            int r2 = r2 - r1
            int r6 = r11.getHeight()
            int r6 = r6 - r2
        L_0x007f:
            r0 = 2131366760(0x7f0a1368, float:1.8353423E38)
            android.view.View r2 = r12.findViewById(r0)
            r5 = 0
            if (r2 == 0) goto L_0x00d4
            r0 = 2131893715(0x7f121dd3, float:1.9422214E38)
            java.lang.String r1 = r13.A00(r0)
            X.C004601z.A0n(r2, r1)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r4.add(r0)
            int[] r1 = new int[r8]
            r2.getLocationOnScreen(r1)
            r0 = r7[r10]
            r2 = r1[r10]
            if (r0 >= r2) goto L_0x00d4
            int r2 = r2 - r0
            if (r2 != 0) goto L_0x00af
        L_0x00a9:
            int r0 = r11.getHeight()
            if (r6 == r0) goto L_0x00d0
        L_0x00af:
            int r1 = r11.getWidth()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5, r2, r1, r6)
            X.C004601z.A0i(r11, r0)
            r0 = 5
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r2 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10
            r2.<init>((java.lang.Object) r11, (int) r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 17694721(0x10e0001, float:2.6081284E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r11.postDelayed(r2, r0)
        L_0x00d0:
            r3.addAll(r4)
            return r3
        L_0x00d4:
            r2 = 0
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455429f.A01(android.view.View, X.00k, X.2hp, java.lang.String):java.util.ArrayList");
    }

    public static void A02(Intent intent, View view, C000900k r4, C54602hp r5, String str) {
        AnonymousClass09N A02 = AnonymousClass09N.A02(r4, (AnonymousClass01Q[]) A01(view, r4, r5, str).toArray(new AnonymousClass01Q[0]));
        r4.setExitSharedElementCallback(new C56222n6(r4));
        r4.startActivity(intent, A02.A03());
    }

    public void A0A() {
    }

    public void A0B(Bundle bundle) {
        PhotoView A19;
        MediaViewBaseFragment mediaViewBaseFragment = this.A01;
        Object A1D = mediaViewBaseFragment.A1D(mediaViewBaseFragment.A09.getCurrentItem());
        if (A1D != null) {
            int childCount = mediaViewBaseFragment.A09.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = mediaViewBaseFragment.A09.getChildAt(i2);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (viewGroup.getChildCount() > 0 && (A19 = mediaViewBaseFragment.A19(viewGroup)) != null) {
                        C004601z.A0n(A19, A1D.equals(viewGroup.getTag()) ? C47612Jr.A04(A1D.toString()) : null);
                    }
                }
            }
            if (mediaViewBaseFragment.A1C() != null && !A1D.equals(mediaViewBaseFragment.A1C())) {
                mediaViewBaseFragment.A0D().A0i(new C64393Oz(bundle, this));
            }
            if (mediaViewBaseFragment.A1R()) {
                mediaViewBaseFragment.A0D().A0Z();
                return;
            }
        }
        mediaViewBaseFragment.A1F();
    }

    public void A0C(Bundle bundle, AnonymousClass29A r12) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A01;
        mediaViewBaseFragment.A03.setVisibility(4);
        mediaViewBaseFragment.A1O(false, 0);
        mediaViewBaseFragment.A06.setVisibility(0);
        mediaViewBaseFragment.A0G = false;
        View decorView = mediaViewBaseFragment.A0D().getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape190S0100000_2_I0(decorView, 7));
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        C54602hp r5 = this.A00;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(linearInterpolator);
        changeBounds.excludeTarget(r5.A00(R.string.str1dd3), true);
        changeBounds.excludeTarget(r5.A00(R.string.str1dd2), true);
        ChangeTransform changeTransform = new ChangeTransform();
        changeTransform.setInterpolator(linearInterpolator);
        ChangeImageTransform changeImageTransform = new ChangeImageTransform();
        changeImageTransform.setInterpolator(linearInterpolator);
        C56532no r2 = new C56532no(mediaViewBaseFragment.A02(), r5, true);
        r2.setInterpolator(linearInterpolator);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setInterpolator(linearInterpolator);
        transitionSet.setDuration(220);
        transitionSet.addTransition(changeBounds);
        transitionSet.addTransition(changeTransform);
        transitionSet.addTransition(changeImageTransform);
        transitionSet.addTransition(r2);
        C56532no r22 = new C56532no(mediaViewBaseFragment.A02(), r5, false);
        r22.setInterpolator(linearInterpolator);
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.setInterpolator(linearInterpolator);
        transitionSet2.setDuration(220);
        transitionSet2.addTransition(changeBounds);
        transitionSet2.addTransition(changeTransform);
        transitionSet2.addTransition(changeImageTransform);
        transitionSet2.addTransition(r22);
        Fade fade = new Fade();
        fade.excludeTarget(16908335, true);
        fade.excludeTarget(16908336, true);
        Fade fade2 = new Fade();
        fade2.excludeTarget(16908335, true);
        fade2.excludeTarget(16908336, true);
        if (mediaViewBaseFragment.A1R()) {
            C001000l A0D = mediaViewBaseFragment.A0D();
            Window window = A0D.getWindow();
            A0D.A0b();
            window.setSharedElementEnterTransition(transitionSet);
            window.setSharedElementReturnTransition(transitionSet2);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
            transitionSet.addListener(new C70753hf(mediaViewBaseFragment, r12));
            transitionSet2.addListener(new C70693hZ(r12));
            return;
        }
        mediaViewBaseFragment.A08().A0A = transitionSet;
        mediaViewBaseFragment.A08().A0B = transitionSet2;
        mediaViewBaseFragment.A08().A07 = fade;
        mediaViewBaseFragment.A08().A09 = fade2;
        fade.addListener(new C70753hf(mediaViewBaseFragment, r12));
        fade2.addListener(new C70693hZ(r12));
    }
}
