package X;

import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.4uZ  reason: invalid class name and case insensitive filesystem */
public class C99774uZ implements AnonymousClass5SS {
    public View A00;
    public final AnonymousClass1VI A01;
    public final C16440t3 A02;
    public final C16980tz A03;
    public final C15860rz A04;
    public final C14710pd A05;
    public final AnonymousClass1N4 A06;
    public final AnonymousClass47R A07;
    public final AnonymousClass1BW A08;

    public C99774uZ(AnonymousClass1VI r1, C16440t3 r2, C16980tz r3, C15860rz r4, C14710pd r5, AnonymousClass1N4 r6, AnonymousClass47R r7, AnonymousClass1BW r8) {
        this.A02 = r2;
        this.A05 = r5;
        this.A03 = r3;
        this.A07 = r7;
        this.A01 = r1;
        this.A04 = r4;
        this.A08 = r8;
        this.A06 = r6;
    }

    public void AHm() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void AhG() {
        if (this.A00 == null) {
            AnonymousClass1VI r2 = this.A01;
            View A0H = C13680ns.A0H(C13680ns.A0G(r2), r2, R.layout.layout024c);
            this.A00 = A0H;
            A0H.setBackgroundResource(R.drawable.selector_orange_gradient);
            r2.addView(this.A00);
        }
        if (this.A00 == null) {
            AnonymousClass1VI r22 = this.A01;
            View A0H2 = C13680ns.A0H(C13680ns.A0G(r22), r22, R.layout.layout024c);
            this.A00 = A0H2;
            A0H2.setBackgroundResource(R.drawable.selector_orange_gradient);
        }
        this.A00.setVisibility(8);
    }
}
