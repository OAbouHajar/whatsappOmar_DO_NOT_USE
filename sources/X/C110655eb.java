package X;

import android.content.Context;
import com.facebook.redex.IDxBCallbackShape114S0200000_3_I1;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.5eb  reason: invalid class name and case insensitive filesystem */
public class C110655eb extends C003401n {
    public AnonymousClass027 A00 = new AnonymousClass027(AnonymousClass000.A0u());
    public C35441lw A01;
    public AnonymousClass1Vo A02 = C110105dW.A0Q("MerchantDetailsViewModel", "merchant-settings");
    public C30801cy A03;
    public C30801cy A04 = new C30801cy();
    public List A05;
    public List A06 = AnonymousClass000.A0u();
    public final C001300o A07;
    public final C16300so A08;
    public final C14870pt A09;
    public final C14870pt A0A;
    public final C16040sK A0B;
    public final C18260wP A0C;
    public final C16440t3 A0D;
    public final C16980tz A0E;
    public final C16460t6 A0F;
    public final C221116r A0G;
    public final AnonymousClass173 A0H;
    public final AnonymousClass160 A0I;
    public final C17190ug A0J;
    public final AnonymousClass5x7 A0K;
    public final C18340wX A0L;
    public final AnonymousClass17O A0M;
    public final C18300wT A0N;
    public final C18310wU A0O;
    public final C18320wV A0P;
    public final C18290wS A0Q;
    public final C18290wS A0R;
    public final C119285wq A0S;
    public final C18280wR A0T;
    public final C16320sq A0U;
    public final C16320sq A0V;

    public C110655eb(C001300o r4, C16300so r5, C14870pt r6, C16040sK r7, C18260wP r8, C16440t3 r9, C16980tz r10, C16460t6 r11, C221116r r12, AnonymousClass173 r13, AnonymousClass160 r14, C17190ug r15, AnonymousClass5x7 r16, C18340wX r17, AnonymousClass17O r18, C18300wT r19, C18310wU r20, C18320wV r21, C18290wS r22, C119285wq r23, C18280wR r24, C16320sq r25) {
        this.A07 = r4;
        this.A09 = r6;
        C16320sq r1 = r25;
        this.A0U = r1;
        this.A0I = r14;
        C18290wS r2 = r22;
        this.A0Q = r2;
        this.A0G = r12;
        this.A03 = new C30801cy();
        this.A0D = r9;
        this.A0A = r6;
        this.A08 = r5;
        this.A0B = r7;
        this.A0J = r15;
        this.A0E = r10;
        this.A0V = r1;
        this.A0T = r24;
        this.A0R = r2;
        this.A0F = r11;
        this.A0K = r16;
        this.A0N = r19;
        this.A0O = r20;
        this.A0H = r13;
        this.A0P = r21;
        this.A0C = r8;
        this.A0L = r17;
        this.A0S = r23;
        this.A0M = r18;
    }

    public static C30801cy A01(C110655eb r2) {
        C117655tL r1 = new C117655tL(5);
        r1.A08 = false;
        C30801cy r0 = r2.A03;
        r0.A0B(r1);
        return r0;
    }

    public final void A05(C111825hT r10, String str) {
        C117655tL r1 = new C117655tL(5);
        r1.A08 = true;
        r1.A02 = R.string.str1062;
        this.A03.A0B(r1);
        Context context = this.A0E.A00;
        C14870pt r3 = this.A0A;
        new C118445uh(context, this.A08, r3, this.A0H, this.A0J, this.A0L, new IDxBCallbackShape114S0200000_3_I1(r10, 1, this), str).A00();
    }
}
