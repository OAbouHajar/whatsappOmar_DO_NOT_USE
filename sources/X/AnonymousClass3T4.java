package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3T4  reason: invalid class name */
public class AnonymousClass3T4 extends RecyclerView {
    public AnonymousClass05M A00;
    public boolean A01 = true;

    public AnonymousClass3T4(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A01 && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.A01 && super.onTouchEvent(motionEvent);
    }

    public void setIsScrollEnabled(boolean z2) {
        boolean z3 = this.A01;
        if (z3 != z2) {
            this.A01 = z2;
            if (z3) {
                this.A00 = C004601z.A0F(this);
            }
            if (this.A01) {
                C004601z.A0j(this, this.A00);
                this.A00 = null;
                return;
            }
            C004601z.A0j(this, new AnonymousClass3T7(this, this));
        }
    }
}
