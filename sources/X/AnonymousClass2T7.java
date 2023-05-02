package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2T7  reason: invalid class name */
public class AnonymousClass2T7 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C14870pt A01;
    public final /* synthetic */ C14580pQ A02;

    public AnonymousClass2T7(View view, C14870pt r2, C14580pQ r3) {
        this.A02 = r3;
        this.A00 = view;
        this.A01 = r2;
    }

    public void onDraw() {
        this.A02.A21(this.A00, this.A01);
    }
}
