package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass09P;
import X.AnonymousClass35I;
import X.AnonymousClass3BH;
import X.AnonymousClass5RN;
import X.C005602k;
import X.C02800Fh;
import X.C41841wk;
import X.C53802gK;
import X.C56962pX;
import android.os.Handler;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;

public class IDxTListenerShape63S0200000_2_I1 implements View.OnTouchListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxTListenerShape63S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        switch (this.A02) {
            case 0:
                AnonymousClass3BH r4 = (AnonymousClass3BH) this.A00;
                Handler handler = (Handler) this.A01;
                int action = motionEvent.getAction();
                if (action == 0) {
                    AnonymousClass5RN r0 = r4.A02;
                    if (r0 == null) {
                        return true;
                    }
                    r0.ANC();
                    handler.sendEmptyMessageDelayed(0, (long) AnonymousClass3BH.A0X);
                    return true;
                } else if (action != 1 && action != 3) {
                    return false;
                } else {
                    handler.removeMessages(0);
                    return true;
                }
            case 1:
                C56962pX r2 = (C56962pX) this.A00;
                View view2 = (View) this.A01;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                float x2 = motionEvent.getX();
                C53802gK r42 = r2.A02;
                if (x2 >= ((float) r42.getLeft()) && motionEvent.getX() <= ((float) r42.getRight()) && motionEvent.getY() >= ((float) view2.getTop()) && motionEvent.getY() <= ((float) view2.getBottom())) {
                    return false;
                }
                r2.dismiss();
                return true;
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                ((AnonymousClass09P) this.A00).A00(motionEvent);
                if ((motionEvent.getAction() & MotionEventCompat.ACTION_MASK) != 1) {
                    return false;
                }
                viewGroup.requestDisallowInterceptTouchEvent(false);
                return false;
            case 3:
                ((AnonymousClass09P) this.A01).A00(motionEvent);
                return true;
            case 4:
                C41841wk r22 = (C41841wk) this.A00;
                View view3 = (View) this.A01;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    r22.A04();
                    return true;
                } else if (action2 == 1) {
                    view3.performClick();
                    return false;
                } else if (action2 != 3) {
                    return false;
                } else {
                    r22.A05();
                    return false;
                }
            default:
                AnonymousClass35I r1 = (AnonymousClass35I) this.A00;
                C005602k r3 = (C005602k) this.A01;
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                C02800Fh r43 = r1.A00.A01;
                if (!AnonymousClass000.A1O(r43.A0I.A00(r3, r43.A0M) & 16711680)) {
                    str = "Start drag has been called but dragging is not enabled";
                } else if (r3.A0H.getParent() != r43.A0M) {
                    str = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.";
                } else {
                    VelocityTracker velocityTracker = r43.A0F;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    r43.A0F = VelocityTracker.obtain();
                    r43.A01 = 0.0f;
                    r43.A00 = 0.0f;
                    r43.A0B(r3, 2);
                    return false;
                }
                Log.e("ItemTouchHelper", str);
                return false;
        }
    }
}
