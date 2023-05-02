package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0h5  reason: invalid class name and case insensitive filesystem */
public class C10410h5 implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C02790Ey A02;
    public final /* synthetic */ AnonymousClass0WS A03;

    public C10410h5(Rect rect, View view, C02790Ey r3, AnonymousClass0WS r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = view;
        this.A00 = rect;
    }

    public void run() {
        AnonymousClass0WS.A00(this.A01, this.A00);
    }
}
