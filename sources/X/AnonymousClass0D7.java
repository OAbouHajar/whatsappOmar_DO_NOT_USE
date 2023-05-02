package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: X.0D7  reason: invalid class name */
public class AnonymousClass0D7 extends ContentFrameLayout {
    public final /* synthetic */ AnonymousClass06G A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0D7(Context context, AnonymousClass06G r3) {
        super(context, (AttributeSet) null);
        this.A00 = r3;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A00.A0W(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                AnonymousClass06G r2 = this.A00;
                r2.A0T(r2.A0L(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(AnonymousClass06L.A01(getContext(), i2));
    }
}
