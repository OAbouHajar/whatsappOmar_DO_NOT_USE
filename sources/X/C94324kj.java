package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.4kj  reason: invalid class name and case insensitive filesystem */
public class C94324kj implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ViewGroup A00;

    public C94324kj(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A00;
        AnonymousClass3K2.A0z(viewGroup, this);
        Drawable background = viewGroup.getBackground();
        if (background instanceof AnonymousClass3LG) {
            AnonymousClass3LG.A00(((AnonymousClass3LG) background).A01, viewGroup);
        }
    }
}
