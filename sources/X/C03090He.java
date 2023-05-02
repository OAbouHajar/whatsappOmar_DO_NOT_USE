package X;

import android.view.View;
import com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0He  reason: invalid class name and case insensitive filesystem */
public class C03090He extends ViewDragHelper$Callback {
    public final /* synthetic */ C02410Bu A00;

    public C03090He(C02410Bu r1) {
        this.A00 = r1;
    }

    public int A00(View view) {
        return this.A00.getHeight();
    }

    public int A01(View view, int i2, int i3) {
        return this.A00.A03 != null ? (int) (((float) i3) * 0.15f) : i3;
    }

    public int A02(View view, int i2, int i3) {
        C02410Bu r1 = this.A00;
        if (r1.A0G == null) {
            return i2;
        }
        int height = r1.getHeight();
        C12700kp r4 = null;
        C12700kp r3 = null;
        for (C12700kp r2 : r1.A0G) {
            if (r4 == null) {
                r4 = r2;
            } else {
                int AF6 = r2.AF6(view, height);
                if (AF6 >= r3.AF6(view, height)) {
                    if (AF6 > r4.AF6(view, height)) {
                        r4 = r2;
                    }
                }
            }
            r3 = r2;
        }
        return height - Math.max(r3 == null ? i2 : r3.AF6(view, height), Math.min(r4 == null ? i2 : r4.AF6(view, height), height - i2));
    }

    public void A03(int i2) {
        C12700kp r2;
        C02410Bu r4 = this.A00;
        View view = r4.A02;
        if (view != null && C004601z.A0u(view) && r4.A04 != null && i2 == 0) {
            List emptyList = Collections.emptyList();
            View view2 = r4.A02;
            if (view2 == null || !C004601z.A0u(view2)) {
                r2 = null;
            } else {
                int height = r4.getHeight();
                r2 = r4.A01(view2, emptyList, height - view2.getTop(), height);
            }
            r4.A06 = r2;
            AnonymousClass0A2 r1 = r4.A04.A00;
            r1.A09.A07.A02();
            if (r2 == AnonymousClass0A2.A0H) {
                if (!r1.A0D) {
                    r1.A03(AnonymousClass0JL.SWIPE_AWAY);
                }
                r1.A00();
            }
        }
    }

    public void A04(View view, float f2, float f3) {
        if (view != null) {
            C02410Bu r3 = this.A00;
            int height = r3.getHeight();
            AnonymousClass0V8 r1 = r3.A07;
            r1.A0A.abortAnimation();
            r1.A0A.fling(0, 0, 0, (int) f3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            int finalY = r1.A0A.getFinalY();
            r1.A0A.abortAnimation();
            int top2 = height - (view.getTop() + finalY);
            List list = r3.A08;
            if (list == null) {
                list = Collections.emptyList();
            }
            C12700kp A01 = r3.A01(view, list, top2, height);
            if (A01 != null) {
                r3.A06 = A01;
                int AF6 = height - A01.AF6(view, height);
                try {
                    int i2 = r3.A00;
                    if (r1.A0B) {
                        r1.A07.getXVelocity(r1.A02);
                        r1.A09(AF6, (int) r1.A07.getYVelocity(r1.A02), i2);
                        r3.postInvalidateOnAnimation();
                        return;
                    }
                    throw AnonymousClass000.A0V("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                } catch (NullPointerException unused) {
                }
            }
        }
    }

    public void A05(View view, int i2, int i3, int i4, int i5) {
        C02410Bu r0 = this.A00;
        AnonymousClass0QC r1 = r0.A04;
        if (r1 != null) {
            r1.A00(view, r0.getHeight());
        }
    }
}
