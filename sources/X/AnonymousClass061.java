package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* renamed from: X.061  reason: invalid class name */
public class AnonymousClass061 extends AnonymousClass062 implements C001500q, C001700s, C001800t, AnonymousClass063 {
    public final Activity A00;
    public final Context A01;
    public final Handler A02;
    public final AnonymousClass02C A03 = new AnonymousClass064();
    public final /* synthetic */ C001000l A04;

    public AnonymousClass061(C001000l r3) {
        this.A04 = r3;
        Handler handler = new Handler();
        this.A00 = r3;
        this.A01 = r3;
        this.A02 = handler;
    }

    public View A00(int i2) {
        return this.A04.findViewById(i2);
    }

    public boolean A01() {
        Window window = this.A04.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public AnonymousClass05R A9m() {
        return this.A04.A03;
    }

    public AnonymousClass05Q AE3() {
        return this.A04.A04;
    }

    public C010505a AGy() {
        return this.A04.AGy();
    }

    public void AMh(AnonymousClass01A r2, AnonymousClass02C r3) {
        this.A04.A1R(r2);
    }

    public C009704q getLifecycle() {
        return this.A04.A04;
    }
}
