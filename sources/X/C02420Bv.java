package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import com.facebook.redex.IDxAListenerShape352S0100000_I1;
import com.facebook.redex.IDxAnimationShape17S0100000_I1;

/* renamed from: X.0Bv  reason: invalid class name and case insensitive filesystem */
public class C02420Bv extends ViewGroup implements C019008w, AnonymousClass02T {
    public static final int[] A0Z = {16842766};
    public float A00;
    public float A01;
    public float A02 = -1.0f;
    public float A03;
    public int A04 = -1;
    public int A05;
    public int A06 = -1;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public View A0E;
    public Animation.AnimationListener A0F = new IDxAListenerShape352S0100000_I1(this, 0);
    public Animation A0G;
    public Animation A0H;
    public Animation A0I;
    public Animation A0J;
    public AnonymousClass0CL A0K;
    public C02210Ag A0L;
    public C11990jf A0M;
    public C12520kX A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = false;
    public final Animation A0S = new IDxAnimationShape17S0100000_I1(this, 2);
    public final Animation A0T = new IDxAnimationShape17S0100000_I1(this, 3);
    public final DecelerateInterpolator A0U;
    public final AnonymousClass0XH A0V;
    public final C04770Nw A0W;
    public final int[] A0X = new int[2];
    public final int[] A0Y = new int[2];

    public C02420Bv(Context context) {
        super(context, (AttributeSet) null);
        this.A0D = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A0A = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.A0U = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A05 = (int) (displayMetrics.density * 40.0f);
        this.A0K = new AnonymousClass0CL(getContext());
        C02210Ag r1 = new C02210Ag(getContext());
        this.A0L = r1;
        r1.A00(1);
        this.A0K.setImageDrawable(this.A0L);
        this.A0K.setVisibility(8);
        addView(this.A0K);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.A0C = i2;
        this.A02 = (float) i2;
        this.A0W = new C04770Nw();
        this.A0V = new AnonymousClass0XH(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.A05;
        this.A07 = i3;
        this.A0B = i3;
        setTargetOffsetTopAndBottom(AnonymousClass000.A06(1.0f, i3, this.A09) - this.A0K.getTop());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, A0Z);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public static boolean A00(ListView listView) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C05700Sq.A01(listView, -1);
        }
        if (listView.getChildCount() == 0) {
            return false;
        }
        return listView.getFirstVisiblePosition() > 0 || listView.getChildAt(0).getTop() < listView.getListPaddingTop();
    }

    private void setColorViewAlpha(int i2) {
        this.A0K.getBackground().setAlpha(i2);
        this.A0L.setAlpha(i2);
    }

    public void A01() {
        AnonymousClass0CL r2 = this.A0K;
        r2.clearAnimation();
        this.A0L.stop();
        r2.setVisibility(8);
        setColorViewAlpha(MotionEventCompat.ACTION_MASK);
        setTargetOffsetTopAndBottom(this.A0B - this.A07);
        this.A07 = r2.getTop();
    }

    public final void A02() {
        if (this.A0E == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.A0K)) {
                    this.A0E = childAt;
                    return;
                }
            }
        }
    }

    public final void A03(float f2) {
        if (f2 > this.A02) {
            A06(true, true);
            return;
        }
        this.A0R = false;
        C02210Ag r5 = this.A0L;
        AnonymousClass0PF r4 = r5.A05;
        r4.A04 = 0.0f;
        r4.A01 = 0.0f;
        r5.invalidateSelf();
        IDxAListenerShape352S0100000_I1 iDxAListenerShape352S0100000_I1 = new IDxAListenerShape352S0100000_I1(this, 1);
        this.A09 = this.A07;
        Animation animation = this.A0T;
        animation.reset();
        animation.setDuration(200);
        animation.setInterpolator(this.A0U);
        AnonymousClass0CL r0 = this.A0K;
        r0.A01 = iDxAListenerShape352S0100000_I1;
        r0.clearAnimation();
        r0.startAnimation(animation);
        if (r4.A0F) {
            r4.A0F = false;
        }
        r5.invalidateSelf();
    }

    public final void A04(float f2) {
        Animation animation;
        Animation animation2;
        C02210Ag r8 = this.A0L;
        AnonymousClass0PF r5 = r8.A05;
        if (!r5.A0F) {
            r5.A0F = true;
        }
        r8.invalidateSelf();
        float f3 = this.A02;
        float min = Math.min(1.0f, Math.abs(f2 / f3));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - f3;
        int i2 = this.A08;
        if (i2 <= 0) {
            i2 = this.A0C;
        }
        float f4 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f4 * 2.0f) / f4) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.A0B + ((int) ((f4 * min) + (f4 * pow * 2.0f)));
        AnonymousClass0CL r7 = this.A0K;
        if (r7.getVisibility() != 0) {
            r7.setVisibility(0);
        }
        r7.setScaleX(1.0f);
        r7.setScaleY(1.0f);
        int i4 = (f2 > this.A02 ? 1 : (f2 == this.A02 ? 0 : -1));
        int i5 = r5.A09;
        if (i4 < 0) {
            if (i5 > 76 && ((animation2 = this.A0H) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                C02450By r2 = new C02450By(this, r5.A09, 76);
                r2.setDuration(300);
                r7.A01 = null;
                r7.clearAnimation();
                r7.startAnimation(r2);
                this.A0H = r2;
            }
        } else if (i5 < 255 && ((animation = this.A0G) == null || !animation.hasStarted() || animation.hasEnded())) {
            C02450By r22 = new C02450By(this, r5.A09, MotionEventCompat.ACTION_MASK);
            r22.setDuration(300);
            r7.A01 = null;
            r7.clearAnimation();
            r7.startAnimation(r22);
            this.A0G = r22;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        r5.A04 = 0.0f;
        r5.A01 = min2;
        r8.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        if (min3 != r5.A00) {
            r5.A00 = min3;
        }
        r8.invalidateSelf();
        r5.A03 = (((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f;
        r8.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.A07);
    }

    public final void A05(float f2) {
        float f3 = this.A00;
        float f4 = (float) this.A0D;
        if (f2 - f3 > f4 && !this.A0O) {
            this.A01 = f3 + f4;
            this.A0O = true;
            this.A0L.setAlpha(76);
        }
    }

    public final void A06(boolean z2, boolean z3) {
        if (this.A0R != z2) {
            this.A0Q = z3;
            A02();
            this.A0R = z2;
            if (z2) {
                int i2 = this.A07;
                Animation.AnimationListener animationListener = this.A0F;
                this.A09 = i2;
                Animation animation = this.A0S;
                animation.reset();
                animation.setDuration(200);
                animation.setInterpolator(this.A0U);
                if (animationListener != null) {
                    this.A0K.A01 = animationListener;
                }
                AnonymousClass0CL r0 = this.A0K;
                r0.clearAnimation();
                r0.startAnimation(animation);
                return;
            }
            Animation.AnimationListener animationListener2 = this.A0F;
            IDxAnimationShape17S0100000_I1 iDxAnimationShape17S0100000_I1 = new IDxAnimationShape17S0100000_I1(this, 1);
            this.A0J = iDxAnimationShape17S0100000_I1;
            iDxAnimationShape17S0100000_I1.setDuration(150);
            AnonymousClass0CL r1 = this.A0K;
            r1.A01 = animationListener2;
            r1.clearAnimation();
            r1.startAnimation(this.A0J);
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.A0V.A02(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.A0V.A01(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.A0V.A04(iArr, iArr2, i2, i3, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.A0V.A05(iArr, (int[]) null, i2, i3, i4, i5, 0);
    }

    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.A06;
        return i4 >= 0 ? i3 == i2 + -1 ? i4 : i3 >= i4 ? i3 + 1 : i3 : i3;
    }

    public int getNestedScrollAxes() {
        C04770Nw r0 = this.A0W;
        return r0.A01 | r0.A00;
    }

    public int getProgressCircleDiameter() {
        return this.A05;
    }

    public int getProgressViewEndOffset() {
        return this.A0C;
    }

    public int getProgressViewStartOffset() {
        return this.A0B;
    }

    public boolean hasNestedScrollingParent() {
        return AnonymousClass000.A1V(this.A0V.A01);
    }

    public boolean isNestedScrollingEnabled() {
        return this.A0V.A02;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A01();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        A02();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            View view = this.A0E;
            if (!(view instanceof ListView ? A00((ListView) view) : view.canScrollVertically(-1)) && !this.A0R && !this.A0P) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int i2 = this.A04;
                            if (i2 == -1) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                                return false;
                            }
                            int findPointerIndex = motionEvent.findPointerIndex(i2);
                            if (findPointerIndex >= 0) {
                                A05(motionEvent.getY(findPointerIndex));
                            }
                        } else if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.A04) {
                                    this.A04 = motionEvent.getPointerId(AnonymousClass000.A1P(actionIndex) ? 1 : 0);
                                }
                            }
                        }
                    }
                    this.A0O = false;
                    this.A04 = -1;
                } else {
                    setTargetOffsetTopAndBottom(this.A0B - this.A0K.getTop());
                    int pointerId = motionEvent.getPointerId(0);
                    this.A04 = pointerId;
                    this.A0O = false;
                    int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                    if (findPointerIndex2 >= 0) {
                        this.A00 = motionEvent.getY(findPointerIndex2);
                    }
                }
                return this.A0O;
            }
        }
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.A0E == null) {
                A02();
            }
            View view = this.A0E;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                AnonymousClass0CL r5 = this.A0K;
                int measuredWidth2 = r5.getMeasuredWidth();
                int measuredHeight2 = r5.getMeasuredHeight();
                int i6 = measuredWidth >> 1;
                int i7 = measuredWidth2 >> 1;
                int i8 = this.A07;
                r5.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A0E == null) {
            A02();
        }
        View view = this.A0E;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            AnonymousClass0CL r2 = this.A0K;
            r2.measure(View.MeasureSpec.makeMeasureSpec(this.A05, 1073741824), View.MeasureSpec.makeMeasureSpec(this.A05, 1073741824));
            this.A06 = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == r2) {
                    this.A06 = i4;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return this.A0V.A01(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        float f2;
        if (i3 > 0) {
            float f3 = this.A03;
            if (f3 > 0.0f) {
                float f4 = (float) i3;
                if (f4 > f3) {
                    iArr[1] = i3 - ((int) f3);
                    this.A03 = 0.0f;
                    f2 = 0.0f;
                } else {
                    f2 = f3 - f4;
                    this.A03 = f2;
                    iArr[1] = i3;
                }
                A04(f2);
            }
        }
        int[] iArr2 = this.A0Y;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int[] iArr = this.A0X;
        dispatchNestedScroll(i2, i3, i4, i5, iArr);
        int i6 = i5 + iArr[1];
        if (i6 < 0) {
            View view2 = this.A0E;
            if (!(view2 instanceof ListView ? A00((ListView) view2) : view2.canScrollVertically(-1))) {
                float abs = this.A03 + ((float) Math.abs(i6));
                this.A03 = abs;
                A04(abs);
            }
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.A0W.A01 = i2;
        startNestedScroll(i2 & 2);
        this.A03 = 0.0f;
        this.A0P = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return isEnabled() && !this.A0R && (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.A0W.A01 = 0;
        this.A0P = false;
        float f2 = this.A03;
        if (f2 > 0.0f) {
            A03(f2);
            this.A03 = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        String str2;
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            View view = this.A0E;
            if (!(view instanceof ListView ? A00((ListView) view) : view.canScrollVertically(-1)) && !this.A0R && !this.A0P) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.A04);
                            if (findPointerIndex < 0) {
                                str = "SwipeRefreshLayout";
                                str2 = "Got ACTION_MOVE event but have an invalid active pointer id.";
                            } else {
                                float y2 = motionEvent.getY(findPointerIndex);
                                A05(y2);
                                if (this.A0O) {
                                    float f2 = (y2 - this.A01) * 0.5f;
                                    if (f2 > 0.0f) {
                                        A04(f2);
                                        return true;
                                    }
                                }
                            }
                        } else if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                actionIndex = motionEvent.getActionIndex();
                                if (actionIndex < 0) {
                                    str = "SwipeRefreshLayout";
                                    str2 = "Got ACTION_POINTER_DOWN event but have an invalid action index.";
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex2 = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex2) == this.A04) {
                                    actionIndex = AnonymousClass000.A1P(actionIndex2);
                                }
                            }
                            this.A04 = motionEvent.getPointerId(actionIndex);
                        }
                        return true;
                    }
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.A04);
                    if (findPointerIndex2 < 0) {
                        str = "SwipeRefreshLayout";
                        str2 = "Got ACTION_UP event but don't have an active pointer id.";
                    } else {
                        if (this.A0O) {
                            this.A0O = false;
                            A03((motionEvent.getY(findPointerIndex2) - this.A01) * 0.5f);
                        }
                        this.A04 = -1;
                    }
                    Log.e(str, str2);
                    return false;
                }
                this.A04 = motionEvent.getPointerId(0);
                this.A0O = false;
                return true;
            }
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.A0E instanceof AbsListView)) {
            View view = this.A0E;
            if (view == null || C004601z.A0v(view)) {
                super.requestDisallowInterceptTouchEvent(z2);
            }
        }
    }

    public void setAnimationProgress(float f2) {
        AnonymousClass0CL r0 = this.A0K;
        r0.setScaleX(f2);
        r0.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        A02();
        C02210Ag r3 = this.A0L;
        AnonymousClass0PF r2 = r3.A05;
        r2.A0G = iArr;
        r2.A0C = 0;
        int i2 = iArr[0];
        r2.A0D = i2;
        r2.A0C = 0;
        r2.A0D = i2;
        r3.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = AnonymousClass00T.A00(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.A02 = (float) i2;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            A01();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        AnonymousClass0XH r1 = this.A0V;
        if (r1.A02) {
            C004601z.A0V(r1.A04);
        }
        r1.A02 = z2;
    }

    public void setOnChildScrollUpCallback(C11990jf r1) {
        this.A0M = r1;
    }

    public void setOnRefreshListener(C12520kX r1) {
        this.A0N = r1;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.A0K.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(AnonymousClass00T.A00(getContext(), i2));
    }

    public void setRefreshing(boolean z2) {
        if (!z2 || this.A0R == z2) {
            A06(z2, false);
            return;
        }
        this.A0R = z2;
        setTargetOffsetTopAndBottom((this.A0C + this.A0B) - this.A07);
        this.A0Q = false;
        Animation.AnimationListener animationListener = this.A0F;
        AnonymousClass0CL r3 = this.A0K;
        r3.setVisibility(0);
        this.A0L.setAlpha(MotionEventCompat.ACTION_MASK);
        IDxAnimationShape17S0100000_I1 iDxAnimationShape17S0100000_I1 = new IDxAnimationShape17S0100000_I1(this, 0);
        this.A0I = iDxAnimationShape17S0100000_I1;
        iDxAnimationShape17S0100000_I1.setDuration((long) this.A0A);
        if (animationListener != null) {
            r3.A01 = animationListener;
        }
        r3.clearAnimation();
        r3.startAnimation(this.A0I);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            float f2 = 40.0f;
            if (i2 == 0) {
                f2 = 56.0f;
            }
            this.A05 = (int) (displayMetrics.density * f2);
            AnonymousClass0CL r1 = this.A0K;
            r1.setImageDrawable((Drawable) null);
            C02210Ag r0 = this.A0L;
            r0.A00(i2);
            r1.setImageDrawable(r0);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.A08 = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        AnonymousClass0CL r0 = this.A0K;
        r0.bringToFront();
        C004601z.A0b(r0, i2);
        this.A07 = r0.getTop();
    }

    public boolean startNestedScroll(int i2) {
        return this.A0V.A03(i2, 0);
    }

    public void stopNestedScroll() {
        this.A0V.A00(0);
    }
}
