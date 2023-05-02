package X;

import android.content.Context;
import com.obwhatsapp.location.LocationPicker;

/* renamed from: X.32e  reason: invalid class name */
public class AnonymousClass32e extends C55562jx {
    public final /* synthetic */ LocationPicker A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass32e(Context context, AnonymousClass0P5 r2, LocationPicker locationPicker) {
        super(context, r2);
        this.A00 = locationPicker;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r1 != 3) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            com.obwhatsapp.location.LocationPicker r4 = r10.A00
            X.29S r1 = r4.A0N
            boolean r0 = r1.A0v
            r7 = 0
            if (r0 == 0) goto L_0x001a
            android.widget.ImageView r1 = r1.A0T
            r0 = 2131230999(0x7f080117, float:1.8078067E38)
            r1.setImageResource(r0)
            X.29S r0 = r4.A0N
            r0.A0u = r7
        L_0x0015:
            boolean r0 = super.dispatchTouchEvent(r11)
            return r0
        L_0x001a:
            int r1 = r11.getAction()
            if (r1 == 0) goto L_0x0113
            r2 = 120(0x78, double:5.93E-322)
            r8 = 1
            r6 = 8
            r5 = 0
            if (r1 == r8) goto L_0x00d5
            r0 = 2
            if (r1 == r0) goto L_0x002f
            r0 = 3
            if (r1 == r0) goto L_0x00d5
            goto L_0x0015
        L_0x002f:
            X.29S r0 = r4.A0N
            com.obwhatsapp.location.PlaceInfo r0 = r0.A0g
            if (r0 == 0) goto L_0x004b
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0043
            X.0IS r1 = (X.AnonymousClass0IS) r1
            X.0Nk r0 = r4.A05
            r1.A0I(r0)
            r1.A0E()
        L_0x0043:
            X.29S r1 = r4.A0N
            r0 = 0
            r1.A0g = r0
            r1.A0B()
        L_0x004b:
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x0015
            float r9 = r11.getX()
            float r1 = r11.getY()
            float r0 = r4.A00
            float r9 = r9 - r0
            float r9 = r9 * r9
            float r0 = r4.A01
            float r1 = r1 - r0
            float r1 = r1 * r1
            float r9 = r9 + r1
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166462(0x7f0704fe, float:1.794717E38)
            float r0 = r1.getDimension(r0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            r4.A0T = r8
            X.29S r1 = r4.A0N
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x00aa
            android.view.View r0 = r1.A0C
            r0.setVisibility(r7)
            X.29S r0 = r4.A0N
            android.view.View r0 = r0.A0C
            int r0 = r0.getHeight()
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r5, r5, r0, r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            r1.setDuration(r2)
            X.29S r0 = r4.A0N
            android.view.View r0 = r0.A0D
            r0.startAnimation(r1)
            X.29S r0 = r4.A0N
            android.view.View r0 = r0.A0E
            r0.setVisibility(r7)
            X.29S r0 = r4.A0N
            android.view.View r0 = r0.A0B
            r0.setVisibility(r6)
        L_0x00aa:
            X.29S r1 = r4.A0N
            boolean r0 = r1.A0u
            if (r0 == 0) goto L_0x00b5
            android.view.View r0 = r1.A0B
            r0.setVisibility(r6)
        L_0x00b5:
            r0 = 2131364449(0x7f0a0a61, float:1.8348735E38)
            android.view.View r2 = r10.findViewById(r0)
            r0 = 2131364399(0x7f0a0a2f, float:1.8348634E38)
            android.view.View r1 = r10.findViewById(r0)
            if (r2 == 0) goto L_0x00c8
            r2.setVisibility(r6)
        L_0x00c8:
            if (r1 == 0) goto L_0x0015
            X.29S r0 = r4.A0N
            boolean r0 = r0.A0p
            if (r0 == 0) goto L_0x0015
            r1.setVisibility(r6)
            goto L_0x0015
        L_0x00d5:
            r4.A00 = r5
            r4.A01 = r5
            boolean r0 = r4.A0T
            if (r0 == 0) goto L_0x0015
            r4.A0T = r7
            X.29S r0 = r4.A0N
            android.view.View r0 = r0.A0C
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0015
            X.29S r0 = r4.A0N
            android.view.View r0 = r0.A0C
            r0.setVisibility(r6)
            X.29S r0 = r4.A0N
            android.view.View r0 = r0.A0C
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r5, r5, r0, r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            r1.setDuration(r2)
            X.29S r0 = r4.A0N
            android.view.View r0 = r0.A0D
            r0.startAnimation(r1)
            goto L_0x0015
        L_0x0113:
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x0015
            float r0 = r11.getX()
            r4.A00 = r0
            float r0 = r11.getY()
            r4.A01 = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32e.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
