package X;

import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.39G  reason: invalid class name */
public class AnonymousClass39G {
    public boolean A00;
    public final Handler A01;
    public final Vibrator A02;
    public final View A03;
    public final AnonymousClass3L6 A04;
    public final Runnable A05;
    public final Runnable A06;

    public AnonymousClass39G(Handler handler, View view, AnonymousClass01V r7, AnonymousClass013 r8, AnonymousClass3L6 r9) {
        this.A03 = view;
        this.A04 = r9;
        this.A01 = handler;
        view.setBackground(new C447725m(r9, r8));
        this.A06 = new C1045055q(view, 0.0f, 1.0f, 0);
        this.A05 = new C1045055q(view, 1.0f, 0.0f, 4);
        this.A02 = r7.A0K();
        A00();
    }

    public final void A00() {
        AnonymousClass3L6 r2 = this.A04;
        r2.A00 = C13680ns.A0D(this.A03).getColor(R.color.color0795);
        r2.invalidateSelf();
    }

    public final boolean A01(float f2, float f3) {
        View view = this.A03;
        return f2 >= ((float) view.getLeft()) && f2 <= ((float) view.getRight()) && f3 >= ((float) view.getTop()) && f3 <= ((float) view.getBottom());
    }
}
