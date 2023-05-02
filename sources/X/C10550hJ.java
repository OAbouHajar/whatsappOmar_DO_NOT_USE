package X;

import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: X.0hJ  reason: invalid class name and case insensitive filesystem */
public class C10550hJ implements Runnable {
    public final /* synthetic */ C06960Yp A00;

    public C10550hJ(C06960Yp r1) {
        this.A00 = r1;
    }

    public void run() {
        View childAt;
        C06960Yp r5 = this.A00;
        if (r5.A03) {
            if (r5.A06) {
                r5.A06 = false;
                AnonymousClass0Q1 r7 = r5.A0F;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                r7.A06 = currentAnimationTimeMillis;
                r7.A07 = -1;
                r7.A05 = currentAnimationTimeMillis;
                r7.A00 = 0.5f;
            }
            AnonymousClass0Q1 r9 = r5.A0F;
            if ((r9.A07 <= 0 || AnimationUtils.currentAnimationTimeMillis() <= r9.A07 + ((long) r9.A02)) && r5.A02()) {
                if (r5.A05) {
                    r5.A05 = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    r5.A0C.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (r9.A05 != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float A002 = r9.A00(currentAnimationTimeMillis2);
                    r9.A05 = currentAnimationTimeMillis2;
                    int i2 = (int) (((float) (currentAnimationTimeMillis2 - r9.A05)) * ((-4.0f * A002 * A002) + (A002 * 4.0f)) * r9.A01);
                    ListView listView = r5.A0E;
                    if (Build.VERSION.SDK_INT >= 19) {
                        C05700Sq.A00(listView, i2);
                    } else {
                        int firstVisiblePosition = listView.getFirstVisiblePosition();
                        if (!(firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null)) {
                            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i2);
                        }
                    }
                    r5.A0C.postOnAnimation(this);
                    return;
                }
                throw AnonymousClass000.A0a("Cannot compute scroll delta before calling start()");
            }
            r5.A03 = false;
        }
    }
}
