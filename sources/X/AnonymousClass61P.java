package X;

import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.61P  reason: invalid class name */
public class AnonymousClass61P implements AnonymousClass694 {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public AnonymousClass61P(AnonymousClass1Z7 r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }

    public void AQY(AnonymousClass5wP r3) {
        AnonymousClass2HJ r0 = r3.A00;
        if (r0 == null) {
            r0 = C110115dX.A0N();
        }
        if (r0.A00 == 25554) {
            this.A01.A39(this.A00);
        } else {
            this.A00.A00("on_failure");
        }
    }

    public void AWP(Object obj) {
        this.A01.A39(this.A00);
    }
}
