package X;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;

/* renamed from: X.3CS  reason: invalid class name */
public class AnonymousClass3CS implements TextWatcher {
    public Runnable A00;
    public final long A01;
    public final Handler A02 = AnonymousClass000.A0L();
    public final C14990q7 A03;
    public final C31201dg A04;
    public final C99134tX A05;

    public AnonymousClass3CS(C14990q7 r2, C31201dg r3, C99134tX r4, long j2) {
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
        this.A01 = j2;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.A05.A05 = charSequence.toString();
        C31201dg r7 = this.A04;
        C14930q1 A0H = r7.A0H(56);
        if (A0H != null) {
            long j2 = this.A01;
            if (j2 <= 0) {
                C14940q2 r2 = new C14940q2();
                r2.A03(charSequence.toString(), 0);
                C29701b3.A01(this.A03, r7, new C14950q3(r2.A00), A0H);
                return;
            }
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A02.removeCallbacks(runnable);
            }
            RunnableRunnableShape3S0300000_I1 runnableRunnableShape3S0300000_I1 = new RunnableRunnableShape3S0300000_I1(this, A0H, charSequence, 9);
            this.A00 = runnableRunnableShape3S0300000_I1;
            this.A02.postDelayed(runnableRunnableShape3S0300000_I1, j2);
        }
    }
}
