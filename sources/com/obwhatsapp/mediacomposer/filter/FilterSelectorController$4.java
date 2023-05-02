package com.obwhatsapp.mediacomposer.filter;

import X.C30141bo;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class FilterSelectorController$4 extends BottomSheetBehavior {
    public boolean A00;
    public final /* synthetic */ C30141bo A01;

    public FilterSelectorController$4(C30141bo r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r1.A03.A00(r5) != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r0 != null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(android.view.MotionEvent r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7) {
        /*
            r4 = this;
            boolean r0 = r4.A00
            r3 = 0
            if (r0 != 0) goto L_0x000c
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            return r3
        L_0x000c:
            int r1 = r5.getPointerCount()
            r0 = 2
            if (r1 >= r0) goto L_0x000b
            X.1bo r0 = r4.A01
            X.29E r0 = r0.A0V
            com.obwhatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.2Ra r1 = r0.A0D
            X.2Rb r0 = r1.A0J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x000b
            X.3CW r1 = r1.A0M
            X.38u r0 = r1.A04
            X.29l r0 = r0.A01
            if (r0 != 0) goto L_0x0032
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r1.A03
            X.29l r0 = r0.A00(r5)
            r2 = 0
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            X.4EW r0 = r1.A08
            X.29l r0 = r0.A00
            if (r0 != 0) goto L_0x0042
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r1.A03
            X.29l r0 = r0.A01(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r1 = 1
        L_0x0043:
            if (r2 != 0) goto L_0x000b
            if (r1 != 0) goto L_0x000b
            boolean r0 = super.A0B(r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.filter.FilterSelectorController$4.A0B(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0C(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A01.A0O.A00(motionEvent)) {
            return true;
        }
        try {
            return this.A00 && super.A0C(motionEvent, view, coordinatorLayout);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
        this.A00 = true;
        return super.A0F(view, coordinatorLayout, i2);
    }
}
