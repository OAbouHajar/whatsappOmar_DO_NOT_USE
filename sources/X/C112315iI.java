package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;

/* renamed from: X.5iI  reason: invalid class name and case insensitive filesystem */
public class C112315iI extends C116635rh {
    public final Context A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C18260wP A03;
    public final AnonymousClass173 A04;
    public final C14710pd A05;
    public final C17190ug A06;
    public final AnonymousClass60V A07;
    public final AnonymousClass175 A08;
    public final C18340wX A09;
    public final C18310wU A0A;
    public final C18290wS A0B;
    public final C118805vH A0C;
    public final AnonymousClass61W A0D;
    public final C112715ix A0E;
    public final String A0F;

    public C112315iI(Context context, C14870pt r3, C16040sK r4, C18260wP r5, AnonymousClass173 r6, C14710pd r7, C17190ug r8, C119365wy r9, AnonymousClass60V r10, AnonymousClass175 r11, C18340wX r12, C18310wU r13, C18290wS r14, C118805vH r15, AnonymousClass61W r16, C112715ix r17, C18280wR r18) {
        super(r9.A04, r13);
        this.A00 = context;
        this.A05 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A06 = r8;
        this.A0B = r14;
        this.A0F = r18.A01();
        this.A08 = r11;
        this.A0A = r13;
        this.A0C = r15;
        this.A04 = r6;
        this.A0D = r16;
        this.A03 = r5;
        this.A09 = r12;
        this.A07 = r10;
        this.A0E = r17;
    }

    public void A00(C35301lh r5, C35301lh r6, AnonymousClass1TV r7, String str, String str2) {
        ArrayList A0u = AnonymousClass000.A0u();
        C110105dW.A1P("action", "upi-edit-default-credential", A0u);
        C110105dW.A1P("vpa", C110115dX.A0e(r5), A0u);
        if (!TextUtils.isEmpty(str)) {
            C110105dW.A1P("vpa-id", str, A0u);
        }
        C110105dW.A1P("upi-bank-info", (String) C110105dW.A0d(r6), A0u);
        C110105dW.A1P("device-id", this.A0F, A0u);
        C110105dW.A1P("credential-id", str2, A0u);
        C110105dW.A1P(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, Integer.toString(1), A0u);
        this.A0A.A0B(r7, C110105dW.A0V(A0u));
    }

    public final void A01(C35301lh r4, C35301lh r5, AnonymousClass1TV r6, String str, String str2) {
        ArrayList A0u = AnonymousClass000.A0u();
        C110105dW.A1P("action", "upi-remove-credential", A0u);
        C110105dW.A1P("vpa", C110115dX.A0e(r4), A0u);
        if (!TextUtils.isEmpty(str)) {
            C110105dW.A1P("vpa-id", str, A0u);
        }
        C110105dW.A1P("upi-bank-info", (String) C110105dW.A0d(r5), A0u);
        C110105dW.A1P("device-id", this.A0F, A0u);
        C110105dW.A1P("credential-id", str2, A0u);
        this.A0A.A0A(r6, C110105dW.A0V(A0u));
    }
}
