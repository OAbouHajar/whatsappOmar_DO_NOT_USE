package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: X.3Nh  reason: invalid class name and case insensitive filesystem */
public class C64223Nh extends WebView {
    public final /* synthetic */ AnonymousClass3O1 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64223Nh(Context context, AnonymousClass3O1 r3) {
        super(context, (AttributeSet) null);
        this.A00 = r3;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public boolean performClick() {
        super.performClick();
        return false;
    }
}
