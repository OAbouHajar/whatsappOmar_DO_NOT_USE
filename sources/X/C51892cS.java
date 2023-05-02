package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.obwhatsapp.HomeActivity;

/* renamed from: X.2cS  reason: invalid class name and case insensitive filesystem */
public class C51892cS implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ HomeActivity A01;

    public C51892cS(View view, HomeActivity homeActivity) {
        this.A01 = homeActivity;
        this.A00 = view;
    }

    public boolean onPreDraw() {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
