package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.redex.IDxCallbackShape188S0100000_2_I1;

/* renamed from: X.4c8  reason: invalid class name and case insensitive filesystem */
public class C89414c8 {
    public static C89414c8 A04;
    public C84234Jt A00;
    public C84234Jt A01;
    public final Handler A02 = new Handler(Looper.getMainLooper(), new IDxCallbackShape188S0100000_2_I1(this, 1));
    public final Object A03 = C13690nt.A0Y();

    public static C89414c8 A00() {
        C89414c8 r0 = A04;
        if (r0 != null) {
            return r0;
        }
        C89414c8 r02 = new C89414c8();
        A04 = r02;
        return r02;
    }

    public final void A01() {
        C84234Jt r0 = this.A01;
        if (r0 != null) {
            this.A00 = r0;
            this.A01 = null;
            AnonymousClass5MJ r02 = (AnonymousClass5MJ) r0.A02.get();
            if (r02 != null) {
                Handler handler = C15540rI.A08;
                handler.sendMessage(handler.obtainMessage(0, ((C98954tF) r02).A00));
                return;
            }
            this.A00 = null;
        }
    }

    public void A02(AnonymousClass5MJ r4) {
        synchronized (this.A03) {
            if (A05(r4)) {
                C84234Jt r1 = this.A00;
                if (!r1.A01) {
                    r1.A01 = true;
                    this.A02.removeCallbacksAndMessages(r1);
                }
            }
        }
    }

    public void A03(AnonymousClass5MJ r4) {
        synchronized (this.A03) {
            if (A05(r4)) {
                C84234Jt r1 = this.A00;
                if (r1.A01) {
                    r1.A01 = false;
                    A04(r1);
                }
            }
        }
    }

    public final void A04(C84234Jt r6) {
        int i2 = r6.A00;
        if (i2 != -2) {
            if (i2 <= 0) {
                int i3 = i2;
                i2 = 2750;
                if (i3 == -1) {
                    i2 = 1500;
                }
            }
            Handler handler = this.A02;
            handler.removeCallbacksAndMessages(r6);
            handler.sendMessageDelayed(Message.obtain(handler, 0, r6), (long) i2);
        }
    }

    public final boolean A05(AnonymousClass5MJ r3) {
        C84234Jt r0 = this.A00;
        return (r0 == null || r3 == null || r0.A02.get() != r3) ? false : true;
    }

    public final boolean A06(C84234Jt r5, int i2) {
        AnonymousClass5MJ r1 = (AnonymousClass5MJ) r5.A02.get();
        if (r1 == null) {
            return false;
        }
        this.A02.removeCallbacksAndMessages(r5);
        Handler handler = C15540rI.A08;
        handler.sendMessage(handler.obtainMessage(1, i2, 0, ((C98954tF) r1).A00));
        return true;
    }
}
