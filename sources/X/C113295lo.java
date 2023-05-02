package X;

import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.5lo  reason: invalid class name and case insensitive filesystem */
public class C113295lo extends C119345ww {
    public final C18290wS A00;
    public final C16320sq A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C113295lo(X.C14870pt r21, X.C16040sK r22, X.C14530pL r23, X.C18260wP r24, X.C16440t3 r25, X.C18080w7 r26, X.AnonymousClass175 r27, X.AnonymousClass109 r28, X.C18340wX r29, X.C18300wT r30, X.C18310wU r31, X.AnonymousClass5xE r32, X.C18290wS r33, X.C118365uZ r34, X.C119285wq r35, X.C1222969a r36, X.AnonymousClass5xG r37, X.C118915vc r38, X.AnonymousClass69C r39, X.C16320sq r40) {
        /*
            r20 = this;
            r13 = r32
            r12 = r31
            r11 = r30
            r10 = r29
            r9 = r28
            r8 = r27
            r7 = r26
            r6 = r25
            r19 = r39
            r18 = r38
            r17 = r37
            r5 = r24
            r16 = r36
            r4 = r23
            r15 = r35
            r3 = r22
            r14 = r34
            r2 = r21
            r1 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r40
            r1.A01 = r0
            r0 = r33
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113295lo.<init>(X.0pt, X.0sK, X.0pL, X.0wP, X.0t3, X.0w7, X.175, X.109, X.0wX, X.0wT, X.0wU, X.5xE, X.0wS, X.5uZ, X.5wq, X.69a, X.5xG, X.5vc, X.69C, X.0sq):void");
    }

    public void A05(AnonymousClass2KI r7) {
        C35271le r2;
        List list = this.A02;
        String str = r7.A06;
        list.add(str);
        C35281lf r0 = r7.A03;
        this.A00 = r0;
        if (r0 != null && (r2 = r0.A00) != null && r2.A00.equals("WEBVIEW")) {
            if (((C35261ld) r2).A00) {
                this.A01.Ack(new C114365ne(this.A06, this.A00, new C116745rs(this, str)), new C001300o[0]);
            } else {
                A06((PinBottomSheetDialogFragment) null, (C28371Vv) null);
            }
        }
    }
}
