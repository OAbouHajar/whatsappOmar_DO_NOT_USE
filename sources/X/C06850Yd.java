package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.0Yd  reason: invalid class name and case insensitive filesystem */
public final class C06850Yd implements View.OnAttachStateChangeListener {
    public final C07940ck A00;
    public final WeakReference A01;

    public C06850Yd(Activity activity, C07940ck r3) {
        this.A00 = r3;
        this.A01 = new WeakReference(activity);
    }

    public void onViewAttachedToWindow(View view) {
        C18450wi.A0H(view, 0);
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.A01.get();
        IBinder A002 = AnonymousClass0MG.A00(activity);
        if (activity != null && A002 != null) {
            this.A00.A02(activity, A002);
        }
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
