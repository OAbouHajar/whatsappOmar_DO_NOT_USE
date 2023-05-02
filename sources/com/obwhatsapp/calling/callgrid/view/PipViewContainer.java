package com.obwhatsapp.calling.callgrid.view;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass027;
import X.AnonymousClass26C;
import X.AnonymousClass26E;
import X.AnonymousClass26F;
import X.AnonymousClass26d;
import X.AnonymousClass49O;
import X.AnonymousClass5MW;
import X.AnonymousClass5MX;
import X.C101014wZ;
import X.C101024wa;
import X.C37921px;
import X.C50032Xj;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C84814Lz;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.voipcalling.VoipActivityV2;

public class PipViewContainer extends FrameLayout implements AnonymousClass006 {
    public ValueAnimator A00;
    public Point A01;
    public Pair A02;
    public AnonymousClass26d A03;
    public AnonymousClass26E A04;
    public AnonymousClass5MX A05;
    public C50032Xj A06;
    public AnonymousClass013 A07;
    public C52662eE A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final int A0C;
    public final boolean A0D;

    public PipViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public PipViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PipViewContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A09) {
            this.A09 = true;
            C52652eD r1 = (C52652eD) ((C52642eC) generatedComponent());
            this.A07 = (AnonymousClass013) r1.A07.AR8.get();
            this.A03 = (AnonymousClass26d) r1.A05.A09.get();
        }
        this.A0B = context.getResources().getDimensionPixelSize(R.dimen.dimen0127);
        this.A0C = context.getResources().getDimensionPixelSize(R.dimen.dimen0129);
        this.A0D = !AnonymousClass49O.A00;
        setOnTouchListener(new AnonymousClass26C(this));
    }

    public static /* synthetic */ void A00(PipViewContainer pipViewContainer, boolean z2) {
        AnonymousClass5MW r0;
        AnonymousClass5MX r02 = pipViewContainer.A05;
        if (r02 != null && (r0 = ((C101024wa) r02).A00.A02) != null) {
            VoipActivityV2 voipActivityV2 = ((C101014wZ) r0).A00;
            voipActivityV2.A22 = z2;
            if (z2 && voipActivityV2.A1d != null) {
                voipActivityV2.A3S();
            }
        }
    }

    public final C84814Lz A01(Point point, Point point2, C50032Xj r9) {
        int i2 = this.A0B;
        return new C84814Lz(i2, (point.x - point2.x) - i2, r9.A04 + i2, (((point.y - point2.y) - i2) - r9.A02) - (r9.A01 == 0 ? 0 : getResources().getDimensionPixelSize(r9.A01)));
    }

    public final void A02() {
        int i2;
        float f2;
        float f3;
        Point point;
        int i3;
        int i4;
        int i5;
        C50032Xj r10 = this.A06;
        if (r10 != null) {
            Point point2 = this.A01;
            if (point2 == null) {
                point = new Point(0, 0);
            } else {
                int i6 = r10.A05;
                if (i6 <= 0 || (i2 = r10.A03) <= 0) {
                    i6 = point2.x;
                    r10.A05 = i6;
                    i2 = point2.y;
                    r10.A03 = i2;
                }
                int min = Math.min(i6, i2);
                int max = Math.max(i6, i2);
                int i7 = point2.x;
                int i8 = point2.y;
                int min2 = Math.min(i7, i8);
                int max2 = Math.max(i7, i8);
                int i9 = i7;
                if (i6 < i2) {
                    i9 = i8;
                }
                if (i6 >= i2) {
                    i7 = i8;
                }
                float f4 = (float) max2;
                float f5 = (float) min2;
                int i10 = (f4 > (2.5f * f5) ? 1 : (f4 == (2.5f * f5) ? 0 : -1));
                float f6 = r10.A00;
                if (i10 > 0) {
                    f2 = f6 * f4;
                    f3 = (float) max;
                } else {
                    f2 = f6 * f5;
                    f3 = (float) min;
                }
                float f7 = (float) min;
                float f8 = (float) max;
                float min3 = Math.min(Math.min(f2 / f3, (((float) i7) * 0.5f) / f7), (((float) i9) * 0.5f) / f8);
                int i11 = (int) (f7 * min3);
                int i12 = (int) (f8 * min3);
                if (i6 >= i2) {
                    point = new Point(i12, i11);
                }
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i13 = point.x;
            marginLayoutParams.width = i13;
            int i14 = point.y;
            marginLayoutParams.height = i14;
            Point point3 = this.A01;
            boolean z2 = false;
            if (point3 != null) {
                C50032Xj r1 = this.A06;
                if (r1.A06) {
                    int i15 = this.A0C;
                    i3 = (point3.x - i13) - i15;
                    i5 = (point3.y - i14) - i15;
                    i4 = 0;
                } else {
                    C84814Lz A012 = A01(point3, point, r1);
                    C50032Xj r12 = this.A06;
                    if (r12.A08) {
                        i3 = A012.A00;
                        i4 = A012.A02;
                    } else {
                        i3 = A012.A02;
                        i4 = A012.A00;
                    }
                    i5 = r12.A07 ? A012.A01 : A012.A03;
                }
                marginLayoutParams.setMargins(i3, i5, i4, 0);
            }
            setLayoutParams(marginLayoutParams);
            if (marginLayoutParams.height < marginLayoutParams.width) {
                z2 = true;
            }
            if (z2 != this.A0A) {
                this.A0A = z2;
                AnonymousClass26E r0 = this.A04;
                if (r0 != null) {
                    A04(r0.A06);
                }
            }
        }
    }

    public final void A03() {
        AnonymousClass5MX r1;
        Pair pair = this.A02;
        if (pair != null && (r1 = this.A05) != null) {
            boolean booleanValue = ((Boolean) pair.first).booleanValue();
            boolean booleanValue2 = ((Boolean) pair.second).booleanValue();
            CallGridViewModel callGridViewModel = ((C101024wa) r1).A00.A05;
            AnonymousClass00B.A06(callGridViewModel);
            AnonymousClass027 r2 = callGridViewModel.A0C;
            Object A012 = r2.A01();
            AnonymousClass00B.A06(A012);
            C50032Xj r12 = (C50032Xj) A012;
            if (!(r12.A08 == booleanValue && r12.A07 == booleanValue2)) {
                r12.A07 = booleanValue2;
                r12.A08 = booleanValue;
                r2.A0B(r12);
            }
            this.A02 = null;
        }
    }

    public final void A04(C37921px r4) {
        int i2;
        AnonymousClass26E r1 = this.A04;
        if (r1 != null && r1.A06()) {
            r1.A08();
        }
        this.A04 = null;
        removeAllViews();
        AnonymousClass26d r2 = this.A03;
        boolean z2 = this.A0A;
        if (!r4.A0F || r4.A07) {
            i2 = 7;
            if (z2) {
                i2 = 8;
            }
        } else {
            i2 = 1;
        }
        AnonymousClass26E r12 = (AnonymousClass26E) r2.A00(this, i2);
        this.A04 = r12;
        if (r12 instanceof AnonymousClass26F) {
            ((AnonymousClass26F) r12).A0H();
        }
        addView(this.A04.A0H, new ViewGroup.LayoutParams(-1, -1));
        this.A04.A0G(r4);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A08;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public Rect getGlobalVisibleRect() {
        Rect rect;
        AnonymousClass26E r2 = this.A04;
        if (r2 != null) {
            if (r2.A06()) {
                r2.A0H.getGlobalVisibleRect(rect);
            }
            return rect;
        }
        rect = new Rect();
        return rect;
    }

    public boolean getIsLandscapeVideo() {
        return this.A0A;
    }

    public AnonymousClass26E getPipViewHolder() {
        return this.A04;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setPipListener(AnonymousClass5MX r1) {
        this.A05 = r1;
    }
}
