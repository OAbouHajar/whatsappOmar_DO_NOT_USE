package X;

import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape1S0400000_I1;

/* renamed from: X.2nl  reason: invalid class name and case insensitive filesystem */
public final class C56502nl extends LinkMovementMethod {
    public boolean A00;
    public final Handler A01 = AnonymousClass000.A0L();

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        TextView textView2 = textView;
        C18450wi.A0H(textView, 0);
        C18450wi.A0H(spannable, 1);
        MotionEvent motionEvent2 = motionEvent;
        C18450wi.A0H(motionEvent, 2);
        int action = motionEvent.getAction();
        if (action == 3) {
            this.A01.removeCallbacksAndMessages((Object) null);
        } else if (action == 0 || action == 1) {
            float x2 = (motionEvent.getX() - ((float) textView.getTotalPaddingLeft())) + ((float) textView.getScrollX());
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((motionEvent.getY() - ((float) textView.getTotalPaddingTop())) + ((float) textView.getScrollY()))), x2);
            AnonymousClass5RO[] r7 = (AnonymousClass5RO[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, AnonymousClass5RO.class);
            if (!(r7 == null || r7.length == 0)) {
                if (action == 1) {
                    this.A01.removeCallbacksAndMessages((Object) null);
                    if (!this.A00) {
                        r7[0].AOZ(motionEvent, textView);
                    }
                    this.A00 = false;
                    return true;
                }
                this.A01.postDelayed(new RunnableRunnableShape1S0400000_I1(this, r7, textView2, motionEvent2, 0), 500);
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
