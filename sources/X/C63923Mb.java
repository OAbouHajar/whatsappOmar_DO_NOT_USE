package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.obwhatsapp.WaEditText;

/* renamed from: X.3Mb  reason: invalid class name and case insensitive filesystem */
public class C63923Mb extends GestureDetector.SimpleOnGestureListener {
    public int A00 = -1;
    public final /* synthetic */ ScrollView A01;
    public final /* synthetic */ WaEditText A02;

    public C63923Mb(ScrollView scrollView, WaEditText waEditText) {
        this.A02 = waEditText;
        this.A01 = scrollView;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.A01.requestDisallowInterceptTouchEvent(true);
        return super.onDown(motionEvent);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        int i2 = this.A00;
        WaEditText waEditText = this.A02;
        this.A00 = waEditText.getScrollY();
        waEditText.scrollBy((int) (f2 + 0.5f), (int) (0.5f + f3));
        if ((f3 >= 0.0f || waEditText.getScrollY() > 0) && (f3 <= 0.0f || i2 != this.A00)) {
            return true;
        }
        this.A01.requestDisallowInterceptTouchEvent(false);
        this.A00 = -1;
        return true;
    }
}
