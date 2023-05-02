package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.obwhatsapp.R;
import java.util.AbstractMap;

/* renamed from: X.0q0  reason: invalid class name and case insensitive filesystem */
public class C14920q0 {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final AnonymousClass017 A04;
    public final Runnable A05;
    public final boolean A06;

    public C14920q0(AnonymousClass017 r3, long j2, boolean z2) {
        this.A02 = j2;
        this.A06 = z2;
        this.A00 = false;
        this.A01 = true;
        this.A04 = r3;
        this.A05 = new RunnableRunnableShape1S0100000_I0((Object) this, 22);
    }

    public static C14920q0 A00(AnonymousClass017 r5, long j2, boolean z2) {
        C14920q0 r4 = new C14920q0(r5, j2, z2);
        r4.A01 = false;
        r4.A03.postDelayed(r4.A05, r4.A02);
        return r4;
    }

    public void A01() {
        this.A00 = true;
        this.A03.removeCallbacks(this.A05);
        AnonymousClass017 r1 = this.A04;
        C14990q7 r2 = (C14990q7) r1.A04.get();
        if (r2 != null) {
            ((AbstractMap) r2.A02(R.id.bk_context_key_timers)).remove(r1.A03);
        }
    }

    public void A02() {
        if (!this.A00) {
            if (!this.A01) {
                A03();
            }
            this.A01 = false;
            this.A03.postDelayed(this.A05, this.A02);
        }
    }

    public void A03() {
        this.A01 = true;
        this.A03.removeCallbacks(this.A05);
    }
}
