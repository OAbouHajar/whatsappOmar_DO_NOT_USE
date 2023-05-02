package X;

import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;

/* renamed from: X.4Rd  reason: invalid class name and case insensitive filesystem */
public class C86084Rd {
    public CharSequence A00 = "";
    public Runnable A01;
    public final C14870pt A02;
    public final C26161Mo A03;

    public C86084Rd(C14870pt r2, C26161Mo r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    public void A00(CharSequence charSequence, int i2) {
        CharSequence charSequence2 = this.A00;
        AnonymousClass3K2.A1H(charSequence2, charSequence);
        if (charSequence2.length() <= 20 || charSequence.length() <= 20) {
            Runnable runnable = this.A01;
            if (runnable != null) {
                this.A02.A0J(runnable);
            }
            this.A00 = charSequence;
            RunnableRunnableShape15S0200000_I1_3 runnableRunnableShape15S0200000_I1_3 = new RunnableRunnableShape15S0200000_I1_3(this, 12, charSequence);
            this.A01 = runnableRunnableShape15S0200000_I1_3;
            this.A02.A0L(runnableRunnableShape15S0200000_I1_3, (long) i2);
        }
    }
}
