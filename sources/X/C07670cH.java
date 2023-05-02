package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0cH  reason: invalid class name and case insensitive filesystem */
public class C07670cH implements C13210le {
    public final /* synthetic */ C02800Fh A00;

    public C07670cH(C02800Fh r1) {
        this.A00 = r1;
    }

    public boolean ASI(MotionEvent motionEvent, RecyclerView recyclerView) {
        int findPointerIndex;
        C02800Fh r3 = this.A00;
        r3.A0H.A00(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r3.A09 = motionEvent.getPointerId(0);
            r3.A02 = motionEvent.getX();
            r3.A03 = motionEvent.getY();
            VelocityTracker velocityTracker = r3.A0F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            r3.A0F = VelocityTracker.obtain();
            if (r3.A0L == null) {
                List list = r3.A0O;
                if (!list.isEmpty()) {
                    View A06 = r3.A06(motionEvent);
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        AnonymousClass0XS r7 = (AnonymousClass0XS) list.get(size);
                        C005602k r6 = r7.A0C;
                        View view = r6.A0H;
                        if (view == A06) {
                            r3.A02 -= r7.A01;
                            r3.A03 -= r7.A02;
                            r3.A0C(r6, true);
                            if (r3.A0S.remove(view)) {
                                C07580c8.A00.A6F(view);
                            }
                            r3.A0B(r6, r7.A0A);
                            r3.A08(motionEvent, r3.A0B, 0);
                        }
                    }
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            r3.A09 = -1;
            r3.A0B((C005602k) null, 0);
        } else {
            int i2 = r3.A09;
            if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                r3.A07(motionEvent, actionMasked, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker2 = r3.A0F;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return r3.A0L != null;
    }

    public void AWB(boolean z2) {
        if (z2) {
            this.A00.A0B((C005602k) null, 0);
        }
    }

    public void AYx(MotionEvent motionEvent, RecyclerView recyclerView) {
        C02800Fh r3 = this.A00;
        r3.A0H.A00(motionEvent);
        VelocityTracker velocityTracker = r3.A0F;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (r3.A09 != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(r3.A09);
            if (findPointerIndex >= 0) {
                r3.A07(motionEvent, actionMasked, findPointerIndex);
            }
            C005602k r1 = r3.A0L;
            if (r1 != null) {
                int i2 = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = r3.A0F;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == r3.A09) {
                                if (actionIndex == 0) {
                                    i2 = 1;
                                }
                                r3.A09 = motionEvent.getPointerId(i2);
                                r3.A08(motionEvent, r3.A0B, actionIndex);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (findPointerIndex >= 0) {
                        r3.A08(motionEvent, r3.A0B, findPointerIndex);
                        r3.A0A(r1);
                        RecyclerView recyclerView2 = r3.A0M;
                        Runnable runnable = r3.A0R;
                        recyclerView2.removeCallbacks(runnable);
                        runnable.run();
                        r3.A0M.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                r3.A0B((C005602k) null, 0);
                r3.A09 = -1;
            }
        }
    }
}
