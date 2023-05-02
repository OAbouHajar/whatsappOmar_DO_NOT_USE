package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.1gy  reason: invalid class name and case insensitive filesystem */
public class C32691gy implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Runnable A02;

    public C32691gy(Handler handler, View view, Runnable runnable) {
        this.A00 = handler;
        this.A02 = runnable;
        this.A01 = view;
    }

    public boolean onPreDraw() {
        Handler handler = this.A00;
        Message obtain = Message.obtain(handler, this.A02);
        AnonymousClass45i.A00(obtain);
        handler.sendMessageAtFrontOfQueue(obtain);
        this.A01.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
