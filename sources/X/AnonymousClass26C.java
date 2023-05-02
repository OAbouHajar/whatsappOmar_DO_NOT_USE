package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape0S0204000_2_I0;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.calling.callgrid.view.PipViewContainer;
import com.whatsapp.util.Log;

/* renamed from: X.26C  reason: invalid class name */
public class AnonymousClass26C implements View.OnTouchListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public C84814Lz A0E;
    public Runnable A0F;
    public boolean A0G;
    public final double A0H;
    public final int A0I = ViewConfiguration.getLongPressTimeout();
    public final /* synthetic */ PipViewContainer A0J;

    public AnonymousClass26C(PipViewContainer pipViewContainer) {
        this.A0J = pipViewContainer;
        int i2 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i3 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A0H = Math.sqrt((double) ((i2 * i2) + (i3 * i3)));
        this.A0F = new RunnableRunnableShape4S0100000_I0_3(this, 45);
    }

    public final boolean A00() {
        AnonymousClass26E r0 = this.A0J.A04;
        return r0 != null && r0.A06() && ((double) this.A08) < this.A0H / 60.0d;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        float f2;
        float rawX;
        View view2 = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                this.A0G = false;
                if (this.A0E == null) {
                    str = "PipViewContainer/onTouch ACTION_UP dispatched before ACTION_DOWN, ignore";
                } else {
                    view2.removeCallbacks(this.A0F);
                    if (A00()) {
                        PipViewContainer pipViewContainer = this.A0J;
                        pipViewContainer.A04.A0H.performClick();
                        PipViewContainer.A00(pipViewContainer, false);
                        pipViewContainer.A02();
                        return true;
                    }
                    float f3 = this.A04;
                    float f4 = this.A05;
                    float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
                    float f5 = sqrt;
                    double d2 = this.A0H;
                    boolean z2 = false;
                    if (((double) sqrt) > d2 / 1.0d) {
                        z2 = true;
                    }
                    float rawX2 = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    if (z2) {
                        double d3 = (double) ((this.A04 / f5) * 64.0f);
                        double d4 = (double) ((this.A05 / f5) * 64.0f);
                        while (rawX2 >= 0.0f && rawX2 <= ((float) this.A07) && rawY >= 0.0f && rawY <= ((float) this.A06)) {
                            rawX2 = (float) (((double) rawX2) + d3);
                            rawY = (float) (((double) rawY) + d4);
                        }
                    }
                    PipViewContainer pipViewContainer2 = this.A0J;
                    AnonymousClass013 r3 = pipViewContainer2.A07;
                    boolean z3 = !r3.A0T();
                    float f6 = (float) (this.A07 / 2);
                    boolean z4 = !z3 ? rawX2 <= f6 : rawX2 >= f6;
                    boolean z5 = false;
                    if (rawY >= ((float) (this.A06 / 2))) {
                        z5 = true;
                    }
                    pipViewContainer2.A02 = new Pair(Boolean.valueOf(z4), Boolean.valueOf(z5));
                    C50032Xj r7 = pipViewContainer2.A06;
                    AnonymousClass00B.A06(r7);
                    Point point = pipViewContainer2.A01;
                    AnonymousClass00B.A06(point);
                    C84814Lz A012 = pipViewContainer2.A01(point, new Point(this.A0C, this.A0B), r7);
                    Point point2 = new Point(z4 ? A012.A00 : A012.A02, z5 ? A012.A01 : A012.A03);
                    int i2 = point2.x - (r3.A0T() ^ true ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin);
                    int i3 = point2.y - marginLayoutParams.topMargin;
                    double sqrt2 = Math.sqrt((double) ((i2 * i2) + (i3 * i3)));
                    long max = (long) Math.max(200, (int) ((500.0d * sqrt2) / d2));
                    StringBuilder sb = new StringBuilder("PipViewContainer/onTouch ACTION_UP xVelocity: ");
                    sb.append(this.A04);
                    sb.append(", yVelocity: ");
                    sb.append(this.A05);
                    sb.append(", velocity: ");
                    sb.append(f5);
                    sb.append(", fling: ");
                    sb.append(z2);
                    sb.append(", finalRawX: ");
                    sb.append(rawX2);
                    sb.append(", finalRawY: ");
                    sb.append(rawY);
                    sb.append(", screen length: (");
                    sb.append(d2);
                    sb.append("), container size: ");
                    sb.append(this.A07);
                    sb.append("x");
                    sb.append(this.A06);
                    sb.append(", pipAtRight: ");
                    sb.append(z4);
                    sb.append(", pipAtBottom: ");
                    sb.append(z5);
                    sb.append(", moving distance: ");
                    sb.append(sqrt2);
                    sb.append(", duration: ");
                    sb.append(max);
                    Log.i(sb.toString());
                    StringBuilder sb2 = new StringBuilder("PipViewContainer/animatePiPView with duration: ");
                    sb2.append(max);
                    sb2.append(", xOffset: ");
                    sb2.append(i2);
                    sb2.append(", yOffset: ");
                    sb2.append(i3);
                    Log.i(sb2.toString());
                    if (max <= 0 || !pipViewContainer2.A0D) {
                        pipViewContainer2.A03();
                        return true;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    pipViewContainer2.A00 = ofFloat;
                    ofFloat.setDuration(max);
                    pipViewContainer2.A00.addUpdateListener(new IDxUListenerShape0S0204000_2_I0(view2, pipViewContainer2, i2, i3));
                    pipViewContainer2.A00.addListener(new IDxLAdapterShape3S0100000_2_I0(pipViewContainer2, 7));
                    pipViewContainer2.A00.start();
                    return true;
                }
            } else if (action != 2) {
                if (action != 3) {
                    return true;
                }
                view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                this.A0G = false;
                view2.removeCallbacks(this.A0F);
                return true;
            } else if (this.A0E == null) {
                str = "PipViewContainer/onTouch ACTION_MOVE dispatched before ACTION_DOWN, ignore";
            } else {
                int i4 = this.A09;
                AnonymousClass013 r4 = this.A0J.A07;
                if (!r4.A0T()) {
                    f2 = motionEvent.getRawX();
                    rawX = this.A00;
                } else {
                    f2 = this.A00;
                    rawX = motionEvent.getRawX();
                }
                int rawY2 = this.A0A + ((int) (motionEvent.getRawY() - this.A01));
                C84814Lz r6 = this.A0E;
                int max2 = Math.max(r6.A02, Math.min(r6.A00, i4 + ((int) (f2 - rawX))));
                int max3 = Math.max(r6.A03, Math.min(r6.A01, rawY2));
                motionEvent.getEventTime();
                motionEvent.getRawX();
                motionEvent.getRawY();
                View view3 = view2;
                C45902Bo.A09(view3, r4, max2, max3, r4.A0T() ^ true ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin, marginLayoutParams.bottomMargin);
                this.A08 = Math.max(Math.max(Math.abs(max2 - this.A09), Math.abs(max3 - this.A0A)), this.A08);
                if (!A00() && !this.A0G) {
                    this.A0G = true;
                    view2.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100).start();
                    view3.removeCallbacks(this.A0F);
                }
                long eventTime = motionEvent.getEventTime() - this.A0D;
                if (eventTime > 0) {
                    float f7 = (float) eventTime;
                    this.A04 = ((motionEvent.getRawX() - this.A02) * 1000.0f) / f7;
                    this.A05 = ((motionEvent.getRawY() - this.A03) * 1000.0f) / f7;
                }
                this.A02 = motionEvent.getRawX();
                this.A03 = motionEvent.getRawY();
                this.A0D = motionEvent.getEventTime();
                return true;
            }
            Log.i(str);
            return true;
        }
        view2.postDelayed(this.A0F, (long) this.A0I);
        PipViewContainer pipViewContainer3 = this.A0J;
        Point point3 = pipViewContainer3.A01;
        AnonymousClass00B.A06(point3);
        this.A07 = point3.x;
        AnonymousClass00B.A06(point3);
        this.A06 = point3.y;
        this.A00 = motionEvent.getRawX();
        this.A01 = motionEvent.getRawY();
        this.A09 = pipViewContainer3.A07.A0T() ^ true ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        this.A0A = marginLayoutParams.topMargin;
        this.A0C = view2.getWidth();
        this.A0B = view2.getHeight();
        PipViewContainer.A00(pipViewContainer3, true);
        this.A08 = 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) pipViewContainer3.getLayoutParams();
        Point point4 = new Point(marginLayoutParams2.width, marginLayoutParams2.height);
        C50032Xj r32 = pipViewContainer3.A06;
        AnonymousClass00B.A06(r32);
        Point point5 = pipViewContainer3.A01;
        AnonymousClass00B.A06(point5);
        this.A0E = pipViewContainer3.A01(point5, point4, r32);
        this.A05 = 0.0f;
        this.A04 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A0D = 0;
        StringBuilder sb3 = new StringBuilder("PipViewContainer/onTouch ACTION_DOWN downX: ");
        sb3.append(this.A00);
        sb3.append(", downY: ");
        sb3.append(this.A01);
        sb3.append(", leftMargin: ");
        sb3.append(this.A09);
        sb3.append(", topMargin: ");
        sb3.append(this.A0A);
        Log.i(sb3.toString());
        return true;
    }
}
