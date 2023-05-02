package X;

import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.whatsapp.util.Log;

/* renamed from: X.18C  reason: invalid class name */
public class AnonymousClass18C {
    public final C18860xN A00;
    public final C14710pd A01;
    public final C18870xO A02;
    public final AnonymousClass1WA A03;

    public AnonymousClass18C(C18860xN r3, C14710pd r4, C18870xO r5, C16320sq r6) {
        this.A01 = r4;
        this.A03 = new AnonymousClass1WA(r6, true);
        this.A00 = r3;
        this.A02 = r5;
    }

    public void A00(C16740tZ r3) {
        C16870tm A0F;
        if (AnonymousClass01E.A01()) {
            Log.w("thumbs are loaded on ui thread", new Throwable());
        }
        if (r3.A0F() != null) {
            A01(r3.A0F());
        }
        C16740tZ A0D = r3.A0D();
        if (A0D != null && (A0F = A0D.A0F()) != null && !A0F.A05()) {
            A0F.A01(A0F.A06());
        }
    }

    public void A01(C16870tm r3) {
        if (!r3.A05()) {
            byte[] A06 = r3.A06();
            if (A06 == null) {
                A06 = this.A00.A09(r3.A04);
            }
            r3.A01(A06);
        }
    }

    public void A02(C16870tm r4, Runnable runnable) {
        if (r4.A05()) {
            runnable.run();
        } else {
            this.A03.execute(new RunnableRunnableShape2S0300000_I0_2(this, r4, runnable, 0));
        }
    }

    public boolean A03(C16740tZ r2) {
        if (r2 != null) {
            return (r2.A0F() != null && !r2.A0F().A05()) || A03(r2.A0D());
        }
        return false;
    }
}
