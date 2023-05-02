package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2iT  reason: invalid class name and case insensitive filesystem */
public class C54912iT extends View {
    public final int[] A00 = new int[2];
    public final int[] A01 = new int[2];
    public final /* synthetic */ C29251aI A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54912iT(Context context, C29251aI r4) {
        super(context);
        this.A02 = r4;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C29251aI r5 = this.A02;
        View view = r5.A08;
        if (view == null) {
            return super.onTouchEvent(motionEvent);
        }
        int[] iArr = this.A00;
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.A01;
        getLocationOnScreen(iArr2);
        if (!r5.A0w) {
            motionEvent.offsetLocation((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
        }
        return r5.A08.dispatchTouchEvent(motionEvent);
    }
}
