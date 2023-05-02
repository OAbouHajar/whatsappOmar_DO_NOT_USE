package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.obwhatsapp.R;

/* renamed from: X.1Ai  reason: invalid class name and case insensitive filesystem */
public class C23061Ai {
    public final AnonymousClass01V A00;

    public C23061Ai(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public static boolean A00(View view) {
        Rect rect = new Rect();
        view.getRootView().getWindowVisibleDisplayFrame(rect);
        WindowManager A02 = AnonymousClass01V.A02(view.getContext());
        AnonymousClass00B.A06(A02);
        return A02.getDefaultDisplay().getHeight() - rect.bottom >= view.getRootView().getResources().getDimensionPixelSize(R.dimen.dimen0443);
    }

    public void A01(View view) {
        InputMethodManager A0Q = this.A00.A0Q();
        AnonymousClass00B.A06(A0Q);
        A0Q.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void A02(View view) {
        InputMethodManager A0Q = this.A00.A0Q();
        AnonymousClass00B.A06(A0Q);
        A0Q.showSoftInput(view, 0);
    }
}
