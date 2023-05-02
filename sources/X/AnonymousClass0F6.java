package X;

import android.content.DialogInterface;
import android.os.Looper;
import android.support.v4.view.MotionEventCompat;
import java.util.concurrent.Executor;

/* renamed from: X.0F6  reason: invalid class name */
public class AnonymousClass0F6 extends C003401n {
    public int A00 = 0;
    public int A01 = 0;
    public DialogInterface.OnClickListener A02;
    public AnonymousClass0PY A03;
    public C05340Qi A04;
    public AnonymousClass0Wh A05;
    public C05030Oy A06;
    public AnonymousClass0OL A07;
    public AnonymousClass027 A08;
    public AnonymousClass027 A09;
    public AnonymousClass027 A0A;
    public AnonymousClass027 A0B;
    public AnonymousClass027 A0C;
    public AnonymousClass027 A0D;
    public AnonymousClass027 A0E;
    public AnonymousClass027 A0F;
    public CharSequence A0G;
    public Executor A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;

    public static void A01(AnonymousClass027 r2, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            r2.A0B(obj);
        } else {
            r2.A09(obj);
        }
    }

    public int A05() {
        C05030Oy r2 = this.A06;
        if (r2 == null) {
            return 0;
        }
        AnonymousClass0Wh r0 = this.A05;
        int i2 = r2.A00;
        if (i2 != 0) {
            return i2;
        }
        int i3 = MotionEventCompat.ACTION_MASK;
        if (r0 != null) {
            i3 = 15;
        }
        return r2.A05 ? i3 | 32768 : i3;
    }

    public void A06(int i2) {
        AnonymousClass027 r1 = this.A0C;
        if (r1 == null) {
            r1 = new AnonymousClass027();
            this.A0C = r1;
        }
        A01(r1, Integer.valueOf(i2));
    }

    public void A07(CharSequence charSequence) {
        AnonymousClass027 r0 = this.A0B;
        if (r0 == null) {
            r0 = new AnonymousClass027();
            this.A0B = r0;
        }
        A01(r0, charSequence);
    }

    public void A08(boolean z2) {
        AnonymousClass027 r1 = this.A0F;
        if (r1 == null) {
            r1 = new AnonymousClass027();
            this.A0F = r1;
        }
        A01(r1, Boolean.valueOf(z2));
    }
}
