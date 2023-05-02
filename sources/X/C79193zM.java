package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.facebook.redex.IDxCallbackShape188S0100000_2_I1;

/* renamed from: X.3zM  reason: invalid class name and case insensitive filesystem */
public class C79193zM extends AnonymousClass29D {
    public final Handler A00 = new Handler(Looper.getMainLooper(), new IDxCallbackShape188S0100000_2_I1(this, 4));
    public final View A01;
    public final AnonymousClass4WP A02 = new AnonymousClass4WP(4500);

    public C79193zM(View view) {
        this.A01 = view;
    }

    public int A03() {
        return (int) this.A02.A00();
    }

    public int A04() {
        return (int) this.A02.A00;
    }

    public Bitmap A05() {
        return null;
    }

    public View A06() {
        return this.A01;
    }

    public void A07() {
        this.A02.A02();
        this.A00.removeMessages(0);
    }

    public void A08() {
        AnonymousClass4WP r2 = this.A02;
        r2.A01();
        Handler handler = this.A00;
        handler.removeMessages(0);
        handler.sendEmptyMessageDelayed(0, (long) (((int) r2.A00) - ((int) r2.A00())));
    }

    public void A09() {
        this.A02.A02();
        this.A00.removeMessages(0);
    }

    public void A0A(int i2) {
        AnonymousClass4WP r2 = this.A02;
        r2.A01 = (long) i2;
        r2.A02 = SystemClock.elapsedRealtime();
        Handler handler = this.A00;
        handler.removeMessages(0);
        handler.sendEmptyMessageDelayed(0, (long) (((int) r2.A00) - ((int) r2.A00())));
    }

    public void A0B(boolean z2) {
    }

    public boolean A0C() {
        return this.A02.A03;
    }

    public boolean A0D() {
        return true;
    }

    public boolean A0E() {
        return false;
    }
}
