package X;

import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.5ez  reason: invalid class name and case insensitive filesystem */
public class C110885ez extends AnonymousClass01X {
    public final C16040sK A00;
    public final AnonymousClass16G A01;
    public final C50262Yq A02;
    public final C17200uh A03;
    public final AnonymousClass01V A04;
    public final C16980tz A05;
    public final AnonymousClass013 A06;
    public final C14710pd A07;
    public final C18090w8 A08;
    public final C218315p A09;
    public final C17110uY A0A;
    public final C25791Ld A0B;
    public final List A0C = AnonymousClass000.A0u();

    public C110885ez(C16040sK r2, AnonymousClass16G r3, C50262Yq r4, C17200uh r5, AnonymousClass01V r6, C16980tz r7, AnonymousClass013 r8, C14710pd r9, C18090w8 r10, C218315p r11, C17110uY r12, C25791Ld r13) {
        this.A07 = r9;
        this.A0A = r12;
        this.A05 = r7;
        this.A09 = r11;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A08 = r10;
        this.A06 = r8;
        this.A0B = r13;
        this.A00 = r2;
        this.A01 = r3;
    }

    public int A0C() {
        return this.A0C.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        ((C111025fD) r2).A07((C116235r3) this.A0C.get(i2));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        switch (i2) {
            case 0:
                return new C113215lg(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0438), this.A03);
            case 1:
            case 12:
                return new C113265ll(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0442), this.A09);
            case 2:
                return new C113245lj(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout043b), this.A02, this.A06, this.A0B);
            case 3:
                return new C113255lk(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0435));
            case 4:
                return new C113225lh(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0441), this.A05);
            case 5:
                return new C113235li(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout043d), this.A06, this.A08);
            case 6:
                return new C113205lf(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout043f), this.A01);
            case 7:
                return new C113195le(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0444));
            case 8:
                return new C113155la(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0439));
            case 9:
                return new C113175lc(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0443));
            case 10:
                return new C113165lb(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout043c));
            case 11:
                return new C113145lZ(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0436));
            case 14:
                return new C113185ld(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0437));
            default:
                throw AnonymousClass000.A0V("PaymentCheckoutOrderDetailsAdapter/onCreateViewHolder/unhandled view type");
        }
    }

    public int getItemViewType(int i2) {
        return ((C116235r3) this.A0C.get(i2)).A00;
    }
}
