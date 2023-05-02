package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.payments.IDxRCallbackShape8S0300000_3_I1;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.5wX  reason: invalid class name */
public class AnonymousClass5wX {
    public final Context A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C18260wP A03;
    public final C16440t3 A04;
    public final C35431lv A05;
    public final C35431lv A06;
    public final C35421lu A07;
    public final C14710pd A08;
    public final UserJid A09;
    public final UserJid A0A;
    public final C18340wX A0B;
    public final C18310wU A0C;
    public final C18290wS A0D;
    public final C18290wS A0E;
    public final C118365uZ A0F;
    public final C118435ug A0G;
    public final C119285wq A0H;
    public final AnonymousClass1Vo A0I = C110105dW.A0Q("PaymentPrecheckAction", "network");
    public final C118585uv A0J;
    public final AnonymousClass1GO A0K;
    public final C53312fV A0L;
    public final AnonymousClass5xG A0M;
    public final C118915vc A0N;
    public final AnonymousClass5wR A0O;
    public final C18280wR A0P;
    public final C16320sq A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;

    public AnonymousClass5wX(Context context, C14870pt r11, C16040sK r12, C18260wP r13, C16440t3 r14, C35431lv r15, C35431lv r16, C35421lu r17, C14710pd r18, UserJid userJid, C18340wX r20, C18310wU r21, C18290wS r22, C118365uZ r23, C119285wq r24, C118585uv r25, AnonymousClass1GO r26, C53312fV r27, AnonymousClass5xG r28, C118915vc r29, C18280wR r30, C16320sq r31, String str, String str2, String str3, String str4, String str5) {
        this.A04 = r14;
        this.A08 = r18;
        this.A00 = context;
        this.A01 = r11;
        this.A02 = r12;
        this.A0Q = r31;
        this.A0F = r23;
        this.A0P = r30;
        C18290wS r1 = r22;
        this.A0D = r1;
        this.A0N = r29;
        C18310wU r6 = r21;
        this.A0C = r6;
        this.A0K = r26;
        this.A03 = r13;
        C18340wX r5 = r20;
        this.A0B = r5;
        this.A0M = r28;
        C119285wq r7 = r24;
        this.A0H = r7;
        this.A0O = new AnonymousClass5wR(r12, r14, r6);
        this.A0G = new C118435ug(context, r11, r5, r6, r7, "PIN");
        this.A0R = str;
        r12.A0B();
        this.A0A = r12.A05;
        this.A09 = userJid;
        this.A05 = r15;
        this.A06 = r16;
        this.A0U = str4;
        this.A0L = r27;
        this.A0S = str3;
        this.A0T = str2;
        this.A07 = r17;
        this.A0E = r1;
        this.A0J = r25;
        this.A0V = str5;
    }

    public static /* synthetic */ void A00(AnonymousClass5wX r10, C1223569g r11, C28371Vv r12, String str) {
        ArrayList A0u = AnonymousClass000.A0u();
        C110105dW.A1P("action", "pay-precheck", A0u);
        C110105dW.A1P("country", "BR", A0u);
        C110105dW.A1P("credential-id", r10.A0R, A0u);
        C110105dW.A1P("nonce", str, A0u);
        A0u.add(new C35081lL((Jid) r10.A09, "receiver"));
        C110105dW.A1P("device-id", r10.A0P.A01(), A0u);
        String str2 = r10.A0U;
        C110105dW.A1P("transaction-type", str2, A0u);
        if (r10.A08.A0C(1746) && (!"p2m".equals(str2) || r10.A07 == null)) {
            C110105dW.A1P("payment_initiator", "buyer", A0u);
        }
        C53312fV r0 = r10.A0L;
        if (r0 != null) {
            A0u.add(new C35081lL("offer_id", r0.A01));
        }
        String str3 = r10.A0S;
        if (!TextUtils.isEmpty(str3)) {
            C110105dW.A1P("payment-rails", str3, A0u);
        }
        String str4 = r10.A0T;
        if (!TextUtils.isEmpty(str4)) {
            C110105dW.A1P("request-id", str4, A0u);
        }
        C28391Vx A022 = r10.A0D.A02("BR");
        C228919r AEp = A022 != null ? A022.AEp(((C35491m1) r10.A05.A01).A04) : null;
        C28371Vv r7 = new C28371Vv(AEp.ADq(r10.A05), "amount", new C35081lL[0]);
        C28371Vv r5 = new C28371Vv(AEp.ADq(r10.A06), "total-amount", new C35081lL[0]);
        C35421lu r4 = r10.A07;
        C28371Vv[] r1 = r4 == null ? new C28371Vv[]{r12, r7, r5} : new C28371Vv[]{r12, r7, r5, r4.A00()};
        C1223569g r122 = r11;
        r10.A0C.A0H(new IDxRCallbackShape8S0300000_3_I1(r10.A00, r10.A0B, r10.A01, r10, r11.AKM(), r122, 2), C110105dW.A0W(A0u, r1), "set", AnonymousClass1NO.A0L);
    }

    public final void A01(AnonymousClass024 r13, C119805ze r14, C117915tl r15) {
        C16440t3 r1 = this.A04;
        String A0f = C110105dW.A0f(this.A02, r1);
        long A032 = C110105dW.A03(r1);
        Object[] objArr = new Object[6];
        objArr[0] = C24561Gk.A03(this.A09);
        C35431lv r3 = this.A05;
        objArr[1] = Integer.valueOf(r3.A00());
        objArr[2] = 1000;
        objArr[3] = ((C35491m1) r3.A01).A04;
        AnonymousClass3K4.A12(Long.valueOf(A032), A0f, objArr);
        byte[] A002 = AnonymousClass5wV.A00(objArr);
        AnonymousClass5xG r32 = this.A0M;
        C119785zc r5 = new C119785zc(this, r14, r15, A0f, A032);
        AnonymousClass04m A003 = AnonymousClass5xG.A00();
        if (A003 != null) {
            r32.A00.A04(new C110525eL(r5, r32, A002), A003, r13);
            return;
        }
        r32.A02.A06("sign: cryptoObject is null");
        r32.A03();
        r14.A01();
    }
}
