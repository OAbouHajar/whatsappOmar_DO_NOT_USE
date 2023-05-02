package com.google.android.material.bottomsheet;

import X.AnonymousClass055;
import X.AnonymousClass06y;
import X.AnonymousClass0Bo;
import X.AnonymousClass0VE;
import X.AnonymousClass3PC;
import X.AnonymousClass3PG;
import X.C004601z;
import X.C54882iQ;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.obwhatsapp.bottomsheet.LockableBottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Map;

public class BottomSheetBehavior extends AnonymousClass06y {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = 4;
    public VelocityTracker A0C;
    public AnonymousClass0VE A0D;
    public C54882iQ A0E;
    public WeakReference A0F;
    public WeakReference A0G;
    public Map A0H;
    public boolean A0I = true;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final AnonymousClass055 A0P = new AnonymousClass3PG(this);

    public BottomSheetBehavior() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r0 = r0.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomSheetBehavior(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r5.<init>(r6, r7)
            r4 = 1
            r5.A0I = r4
            r0 = 4
            r5.A0B = r0
            X.3PG r0 = new X.3PG
            r0.<init>(r5)
            r5.A0P = r0
            int[] r0 = X.C53362fa.A02
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r7, r0)
            r2 = 2
            android.util.TypedValue r0 = r3.peekValue(r2)
            r1 = -1
            if (r0 == 0) goto L_0x0049
            int r0 = r0.data
            if (r0 != r1) goto L_0x0049
        L_0x0022:
            r5.A0L(r0)
            r1 = 0
            boolean r0 = r3.getBoolean(r4, r1)
            r5.A0J = r0
            boolean r0 = r3.getBoolean(r1, r4)
            r5.A0O(r0)
            r0 = 3
            boolean r0 = r3.getBoolean(r0, r1)
            r5.A0N = r0
            r3.recycle()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r6)
            int r0 = r0.getScaledMaximumFlingVelocity()
            float r0 = (float) r0
            r5.A00 = r0
            return
        L_0x0049:
            int r0 = r3.getDimensionPixelSize(r2, r1)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static BottomSheetBehavior A00(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof AnonymousClass0Bo) {
            AnonymousClass06y r1 = ((AnonymousClass0Bo) layoutParams).A0A;
            if (r1 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) r1;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public Parcelable A07(View view, CoordinatorLayout coordinatorLayout) {
        return new AnonymousClass3PC((Parcelable) View.BaseSavedState.EMPTY_STATE, this.A0B);
    }

    public void A08(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
        int i2 = ((AnonymousClass3PC) parcelable).A00;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.A0B = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r1 < java.lang.Math.abs(r3 - r2)) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r1 < java.lang.Math.abs(r3 - r2)) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(android.view.View r8, android.view.View r9, androidx.coordinatorlayout.widget.CoordinatorLayout r10, int r11) {
        /*
            r7 = this;
            int r1 = r8.getTop()
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x00a9
            int r5 = r7.A03
        L_0x000a:
            r6 = 3
            if (r1 != r5) goto L_0x0011
            r7.A0K(r6)
        L_0x0010:
            return
        L_0x0011:
            java.lang.ref.WeakReference r0 = r7.A0F
            java.lang.Object r0 = r0.get()
            if (r9 != r0) goto L_0x0010
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0010
            int r0 = r7.A06
            r4 = 0
            if (r0 > 0) goto L_0x0034
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x0064
            android.view.VelocityTracker r2 = r7.A0C
            if (r2 != 0) goto L_0x0054
            r0 = 0
        L_0x002b:
            boolean r0 = r7.A0P(r8, r0)
            if (r0 == 0) goto L_0x0064
            int r5 = r7.A08
            r6 = 5
        L_0x0034:
            X.0VE r1 = r7.A0D
            int r0 = r8.getLeft()
            boolean r0 = r1.A0H(r8, r0, r5)
            if (r0 == 0) goto L_0x0050
            r0 = 2
            r7.A0K(r0)
            r1 = 2
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r0.<init>((android.view.View) r8, (com.google.android.material.bottomsheet.BottomSheetBehavior) r7, (int) r6, (int) r1)
            r8.postOnAnimation(r0)
        L_0x004d:
            r7.A0L = r4
            return
        L_0x0050:
            r7.A0K(r6)
            goto L_0x004d
        L_0x0054:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r7.A00
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r7.A0C
            int r0 = r7.A01
            float r0 = r1.getYVelocity(r0)
            goto L_0x002b
        L_0x0064:
            int r0 = r7.A06
            if (r0 != 0) goto L_0x00a5
            int r3 = r8.getTop()
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x0082
            int r5 = r7.A03
            int r0 = r3 - r5
            int r1 = java.lang.Math.abs(r0)
            int r2 = r7.A02
            int r3 = r3 - r2
            int r0 = java.lang.Math.abs(r3)
            if (r1 >= r0) goto L_0x00a3
            goto L_0x0034
        L_0x0082:
            int r5 = r7.A04
            if (r3 >= r5) goto L_0x0092
            int r0 = r7.A02
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r3 >= r0) goto L_0x00a1
            r5 = 0
            goto L_0x0034
        L_0x0092:
            int r0 = r3 - r5
            int r1 = java.lang.Math.abs(r0)
            int r2 = r7.A02
            int r3 = r3 - r2
            int r0 = java.lang.Math.abs(r3)
            if (r1 >= r0) goto L_0x00a3
        L_0x00a1:
            r6 = 6
            goto L_0x0034
        L_0x00a3:
            r5 = r2
            goto L_0x00a7
        L_0x00a5:
            int r5 = r7.A02
        L_0x00a7:
            r6 = 4
            goto L_0x0034
        L_0x00a9:
            r5 = 0
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A09(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):void");
    }

    public void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i2, int i3, int i4) {
        int i5;
        if (i4 != 1 && view2 == this.A0F.get()) {
            int top2 = view.getTop();
            int i6 = top2 - i3;
            if (i3 > 0) {
                int i7 = this.A0I ? this.A03 : 0;
                if (i6 < i7) {
                    int i8 = top2 - i7;
                    iArr[1] = i8;
                    C004601z.A0b(view, -i8);
                    i5 = 3;
                }
                iArr[1] = i3;
                C004601z.A0b(view, -i3);
                A0K(1);
                A0J(view.getTop());
                this.A06 = i3;
                this.A0L = true;
            }
            if (i3 < 0 && !view2.canScrollVertically(-1)) {
                int i9 = this.A02;
                if (i6 > i9 && !this.A0J) {
                    int i10 = top2 - i9;
                    iArr[1] = i10;
                    C004601z.A0b(view, -i10);
                    i5 = 4;
                }
                iArr[1] = i3;
                C004601z.A0b(view, -i3);
                A0K(1);
            }
            A0J(view.getTop());
            this.A06 = i3;
            this.A0L = true;
            A0K(i5);
            A0J(view.getTop());
            this.A06 = i3;
            this.A0L = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r11.A0I(r10, r1, r8.A05) != false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(android.view.MotionEvent r9, android.view.View r10, androidx.coordinatorlayout.widget.CoordinatorLayout r11) {
        /*
            r8 = this;
            boolean r0 = r10.isShown()
            r2 = 0
            r4 = 1
            if (r0 != 0) goto L_0x000b
            r8.A0K = r4
        L_0x000a:
            return r2
        L_0x000b:
            int r5 = r9.getActionMasked()
            if (r5 != 0) goto L_0x001e
            r0 = -1
            r8.A01 = r0
            android.view.VelocityTracker r0 = r8.A0C
            if (r0 == 0) goto L_0x001e
            r0.recycle()
            r0 = 0
            r8.A0C = r0
        L_0x001e:
            android.view.VelocityTracker r0 = r8.A0C
            if (r0 != 0) goto L_0x0028
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r8.A0C = r0
        L_0x0028:
            r0.addMovement(r9)
            r3 = 0
            r6 = -1
            if (r5 == 0) goto L_0x004e
            if (r5 == r4) goto L_0x0043
            r0 = 3
            if (r5 == r0) goto L_0x0043
        L_0x0034:
            boolean r0 = r8.A0K
            if (r0 != 0) goto L_0x0089
            X.0VE r0 = r8.A0D
            if (r0 == 0) goto L_0x0089
            boolean r0 = r0.A0E(r9)
            if (r0 == 0) goto L_0x0089
            return r4
        L_0x0043:
            r8.A0O = r2
            r8.A01 = r6
            boolean r0 = r8.A0K
            if (r0 == 0) goto L_0x0034
            r8.A0K = r2
            return r2
        L_0x004e:
            float r0 = r9.getX()
            int r1 = (int) r0
            float r0 = r9.getY()
            int r7 = (int) r0
            r8.A05 = r7
            java.lang.ref.WeakReference r0 = r8.A0F
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0078
            boolean r0 = r11.A0I(r0, r1, r7)
            if (r0 == 0) goto L_0x0078
            int r0 = r9.getActionIndex()
            int r0 = r9.getPointerId(r0)
            r8.A01 = r0
            r8.A0O = r4
        L_0x0078:
            int r0 = r8.A01
            if (r0 != r6) goto L_0x0085
            int r0 = r8.A05
            boolean r1 = r11.A0I(r10, r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            r8.A0K = r0
            goto L_0x0034
        L_0x0089:
            java.lang.ref.WeakReference r0 = r8.A0F
            if (r0 == 0) goto L_0x0093
            java.lang.Object r3 = r0.get()
            android.view.View r3 = (android.view.View) r3
        L_0x0093:
            r0 = 2
            if (r5 != r0) goto L_0x000a
            if (r3 == 0) goto L_0x000a
            boolean r0 = r8.A0K
            if (r0 != 0) goto L_0x000a
            int r0 = r8.A0B
            if (r0 == r4) goto L_0x000a
            float r0 = r9.getX()
            int r1 = (int) r0
            float r0 = r9.getY()
            int r0 = (int) r0
            boolean r0 = r11.A0I(r3, r1, r0)
            if (r0 != 0) goto L_0x000a
            X.0VE r0 = r8.A0D
            if (r0 == 0) goto L_0x000a
            int r0 = r8.A05
            float r1 = (float) r0
            float r0 = r9.getY()
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            X.0VE r0 = r8.A0D
            int r0 = r0.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x000a
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0B(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0C(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A0B == 1 && actionMasked == 0) {
            return true;
        }
        AnonymousClass0VE r0 = this.A0D;
        if (r0 != null) {
            r0.A07(motionEvent);
        }
        if (actionMasked == 0) {
            this.A01 = -1;
            VelocityTracker velocityTracker = this.A0C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A0C = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A0C;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A0C = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (actionMasked == 2 && !this.A0K) {
            float abs = Math.abs(((float) this.A05) - motionEvent.getY());
            AnonymousClass0VE r1 = this.A0D;
            if (abs > ((float) r1.A06)) {
                r1.A09(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0K;
    }

    public boolean A0D(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i2, int i3) {
        boolean z2;
        if (this instanceof LockableBottomSheetBehavior) {
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) this;
            z2 = false;
            if (!lockableBottomSheetBehavior.A00) {
                return false;
            }
            lockableBottomSheetBehavior.A06 = 0;
            lockableBottomSheetBehavior.A0L = false;
        } else {
            z2 = false;
            this.A06 = 0;
            this.A0L = false;
        }
        if ((i2 & 2) != 0) {
            return true;
        }
        return z2;
    }

    public boolean A0E(View view, View view2, CoordinatorLayout coordinatorLayout, float f2, float f3) {
        return view2 == this.A0F.get() && this.A0B != 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(android.view.View r11, androidx.coordinatorlayout.widget.CoordinatorLayout r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r12.getFitsSystemWindows()
            r3 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r11.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0010
            r11.setFitsSystemWindows(r3)
        L_0x0010:
            int r5 = r11.getTop()
            r12.A0D(r11, r13)
            int r0 = r12.getHeight()
            r10.A08 = r0
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x00b5
            int r2 = r10.A0A
            if (r2 != 0) goto L_0x0032
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165896(0x7f0702c8, float:1.7946022E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r10.A0A = r2
        L_0x0032:
            int r1 = r10.A08
            int r0 = r12.getWidth()
            int r0 = r0 * 9
            int r0 = r0 >> 4
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r2, r1)
        L_0x0041:
            r10.A07 = r0
            r2 = 0
            int r1 = r10.A08
            int r0 = r11.getHeight()
            int r1 = r1 - r0
            int r9 = java.lang.Math.max(r2, r1)
            r10.A03 = r9
            int r8 = r10.A08
            r7 = 2
            int r6 = r8 / r7
            r10.A04 = r6
            boolean r4 = r10.A0I
            int r0 = r10.A07
            int r2 = r8 - r0
            if (r4 == 0) goto L_0x0064
            int r2 = java.lang.Math.max(r2, r9)
        L_0x0064:
            r10.A02 = r2
            int r1 = r10.A0B
            r0 = 3
            if (r1 != r0) goto L_0x0095
            if (r4 != 0) goto L_0x006e
            r9 = 0
        L_0x006e:
            X.C004601z.A0b(r11, r9)
        L_0x0071:
            X.0VE r0 = r10.A0D
            if (r0 != 0) goto L_0x0082
            X.055 r2 = r10.A0P
            android.content.Context r1 = r12.getContext()
            X.0VE r0 = new X.0VE
            r0.<init>(r1, r12, r2)
            r10.A0D = r0
        L_0x0082:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r11)
            r10.A0G = r0
            android.view.View r1 = r10.A0I(r11)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r10.A0F = r0
            return r3
        L_0x0095:
            r0 = 6
            if (r1 != r0) goto L_0x009a
            r9 = r6
            goto L_0x006e
        L_0x009a:
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x00a3
            r0 = 5
            if (r1 != r0) goto L_0x00a3
            r9 = r8
            goto L_0x006e
        L_0x00a3:
            r0 = 4
            if (r1 != r0) goto L_0x00a8
            r9 = r2
            goto L_0x006e
        L_0x00a8:
            if (r1 == r3) goto L_0x00ac
            if (r1 != r7) goto L_0x0071
        L_0x00ac:
            int r0 = r11.getTop()
            int r5 = r5 - r0
            X.C004601z.A0b(r11, r5)
            goto L_0x0071
        L_0x00b5:
            int r0 = r10.A09
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0F(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public View A0I(View view) {
        if (C004601z.A0v(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View A0I2 = A0I(viewGroup.getChildAt(i2));
                if (A0I2 != null) {
                    return A0I2;
                }
            }
        }
        return null;
    }

    public void A0J(int i2) {
        C54882iQ r3;
        float f2;
        View view = (View) this.A0G.get();
        if (view != null && (r3 = this.A0E) != null) {
            int i3 = this.A02;
            float f3 = (float) (i3 - i2);
            if (i2 > i3) {
                f2 = (float) (this.A08 - i3);
            } else {
                f2 = (float) (i3 - (this.A0I ? this.A03 : 0));
            }
            r3.A01(view, f3 / f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(int r8) {
        /*
            r7 = this;
            int r0 = r7.A0B
            if (r0 == r8) goto L_0x008a
            r7.A0B = r8
            r0 = 6
            if (r8 == r0) goto L_0x0072
            r0 = 3
            if (r8 == r0) goto L_0x0072
            r0 = 5
            if (r8 == r0) goto L_0x0012
            r0 = 4
            if (r8 != r0) goto L_0x0079
        L_0x0012:
            r6 = 0
        L_0x0013:
            java.lang.ref.WeakReference r0 = r7.A0G
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r5 = r0.getParent()
            boolean r0 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 == 0) goto L_0x0079
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r4 = r5.getChildCount()
            if (r6 == 0) goto L_0x0038
            java.util.Map r0 = r7.A0H
            if (r0 != 0) goto L_0x0079
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r4)
            r7.A0H = r0
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 >= r4) goto L_0x0074
            android.view.View r2 = r5.getChildAt(r3)
            java.lang.ref.WeakReference r0 = r7.A0G
            java.lang.Object r0 = r0.get()
            if (r2 == r0) goto L_0x0062
            java.util.Map r1 = r7.A0H
            if (r6 != 0) goto L_0x0065
            if (r1 == 0) goto L_0x0062
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0062
            java.util.Map r0 = r7.A0H
            java.lang.Object r0 = r0.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L_0x005f:
            X.C004601z.A0d(r2, r0)
        L_0x0062:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x0065:
            int r0 = r2.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
            r0 = 4
            goto L_0x005f
        L_0x0072:
            r6 = 1
            goto L_0x0013
        L_0x0074:
            if (r6 != 0) goto L_0x0079
            r0 = 0
            r7.A0H = r0
        L_0x0079:
            java.lang.ref.WeakReference r0 = r7.A0G
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x008a
            X.2iQ r0 = r7.A0E
            if (r0 == 0) goto L_0x008a
            r0.A02(r1, r8)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0K(int):void");
    }

    public final void A0L(int i2) {
        WeakReference weakReference;
        View view;
        boolean z2 = this.A0M;
        if (i2 == -1) {
            if (!z2) {
                this.A0M = true;
            } else {
                return;
            }
        } else if (z2 || this.A09 != i2) {
            this.A0M = false;
            this.A09 = Math.max(0, i2);
            this.A02 = this.A08 - i2;
        } else {
            return;
        }
        if (this.A0B == 4 && (weakReference = this.A0G) != null && (view = (View) weakReference.get()) != null) {
            view.requestLayout();
        }
    }

    public final void A0M(int i2) {
        if (i2 != this.A0B) {
            WeakReference weakReference = this.A0G;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !C004601z.A0t(view)) {
                        A0N(view, i2);
                    } else {
                        view.post(new RunnableRunnableShape0S0201000_I0(view, this, i2, 1));
                    }
                }
            } else if (i2 == 4 || i2 == 3 || (this.A0J && i2 == 5)) {
                this.A0B = i2;
            }
        }
    }

    public void A0N(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.A02;
        } else if (i2 == 3) {
            i3 = this.A0I ? this.A03 : 0;
        } else if (!this.A0J || i2 != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i3 = this.A08;
        }
        if (this.A0D.A0H(view, view.getLeft(), i3)) {
            A0K(2);
            view.postOnAnimation(new RunnableRunnableShape0S0201000_I0(view, this, i2, 2));
            return;
        }
        A0K(i2);
    }

    public void A0O(boolean z2) {
        if (this.A0I != z2) {
            this.A0I = z2;
            if (this.A0G != null) {
                int i2 = this.A08 - this.A07;
                if (z2) {
                    i2 = Math.max(i2, this.A03);
                }
                this.A02 = i2;
            }
            A0K((!z2 || this.A0B != 6) ? this.A0B : 3);
        }
    }

    public boolean A0P(View view, float f2) {
        if (!this.A0N) {
            return view.getTop() >= this.A02 && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.A02)) / ((float) this.A09) > 0.5f;
        }
        return true;
    }
}
