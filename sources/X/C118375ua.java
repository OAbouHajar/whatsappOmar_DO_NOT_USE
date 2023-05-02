package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;

/* renamed from: X.5ua  reason: invalid class name and case insensitive filesystem */
public class C118375ua {
    public final Context A00;
    public final C14870pt A01;
    public final C18260wP A02;
    public final C18340wX A03;
    public final C18310wU A04;
    public final AnonymousClass1Vo A05 = C110105dW.A0Q("PaymentStepUpWebviewAction", "network");

    public C118375ua(Context context, C14870pt r4, C18260wP r5, C18340wX r6, C18310wU r7) {
        this.A00 = context;
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
    }

    public void A00(AnonymousClass693 r14, C35281lf r15, C28371Vv r16) {
        C28371Vv[] r3;
        C35081lL[] r2 = new C35081lL[1];
        char A032 = C35081lL.A03("step_up_id", r15.A02, r2);
        C28371Vv r4 = new C28371Vv("step_up", r2);
        C35081lL[] r32 = new C35081lL[1];
        C35081lL.A02("challenge_id", r15.A00.A01, r32, A032);
        C28371Vv r22 = new C28371Vv("step_up_challenge", r32);
        if (r16 != null) {
            r3 = new C28371Vv[3];
            r3[A032] = r4;
            r3[1] = r22;
            r3[2] = r16;
        } else {
            r3 = new C28371Vv[2];
            r3[A032] = r4;
            r3[1] = r22;
        }
        C35081lL[] r23 = new C35081lL[1];
        C35081lL.A02("action", "get-step-up-webview-url", r23, A032);
        C28371Vv r9 = new C28371Vv("account", r23, r3);
        C18310wU r7 = this.A04;
        Context context = this.A00;
        C14870pt r33 = this.A01;
        r7.A0H(new IDxRCallbackShape20S0200000_3_I1(context, this.A03, r33, r14, this, 13), r9, "get", 0);
    }
}
