package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1;
import com.whatsapp.util.Log;

/* renamed from: X.5wf  reason: invalid class name and case insensitive filesystem */
public class C119175wf {
    public static final long[] A0L = {3, 2, 15};
    public int A00;
    public HandlerThread A01;
    public C1222768y A02;
    public C110235dj A03;
    public String A04;
    public String A05;
    public final C14870pt A06;
    public final C16980tz A07;
    public final AnonymousClass173 A08;
    public final C14710pd A09;
    public final C17190ug A0A;
    public final C119365wy A0B;
    public final AnonymousClass60V A0C;
    public final C18340wX A0D;
    public final AnonymousClass4XO A0E;
    public final C18290wS A0F;
    public final AnonymousClass61W A0G;
    public final C112715ix A0H;
    public final C119295wr A0I;
    public final C18280wR A0J;
    public final C16320sq A0K;

    public C119175wf(C14870pt r9, C16980tz r10, AnonymousClass173 r11, C14710pd r12, C17190ug r13, C111805hR r14, C119365wy r15, AnonymousClass60V r16, C18340wX r17, C18290wS r18, C1222768y r19, AnonymousClass61W r20, C112715ix r21, C119295wr r22, C18280wR r23, C16320sq r24) {
        this.A09 = r12;
        this.A06 = r9;
        this.A07 = r10;
        this.A0K = r24;
        this.A0A = r13;
        C18280wR r6 = r23;
        this.A0J = r6;
        this.A0F = r18;
        this.A0B = r15;
        this.A08 = r11;
        this.A0D = r17;
        AnonymousClass60V r4 = r16;
        this.A0C = r4;
        this.A0I = r22;
        this.A0G = r20;
        this.A0H = r21;
        this.A0E = r15.A04;
        this.A02 = r19;
        C111805hR r2 = r14;
        this.A04 = r15.A06(r14);
        this.A05 = r15.A07(r14);
        HandlerThread handlerThread = new HandlerThread("PAY: device binding iq sender");
        this.A01 = handlerThread;
        handlerThread.start();
        String str = this.A04;
        Looper looper = this.A01.getLooper();
        this.A03 = new C110235dj(looper, r2, r15, r4, this, r6, str);
    }

    public void A00() {
        Log.i("PAY: IndiaUpiGetBankAccountsAction: delayedDeviceVerifIqHandlerMessage");
        this.A00++;
        C110235dj r5 = this.A03;
        r5.removeMessages(0);
        int i2 = this.A00 - 1;
        long[] jArr = A0L;
        r5.sendEmptyMessageDelayed(0, (i2 < jArr.length ? jArr[i2] : ((long) i2) * 5) * 1000);
    }

    public void A01(C111805hR r24) {
        Log.i("PAY: sendGetBankAccounts called");
        AnonymousClass4XO r12 = this.A0E;
        r12.A04("upi-get-accounts");
        C17190ug r11 = this.A0A;
        String A022 = r11.A02();
        AnonymousClass60V r3 = this.A0C;
        C111805hR r5 = r24;
        String A082 = !TextUtils.isEmpty(r3.A08()) ? r3.A08() : this.A0B.A06(r5);
        String A012 = this.A0J.A01();
        Long valueOf = Long.valueOf(Long.parseLong(r5.A0C));
        String str = r5.A0A;
        AnonymousClass2BJ r7 = new AnonymousClass2BJ(A022);
        C112715ix r8 = null;
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-get-accounts");
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        if (C32271fx.A0B(valueOf, -9007199254740991L, false)) {
            C110115dX.A13(A0Y, "code", valueOf.longValue());
        }
        if (C32271fx.A0D(A082, 1, 10, false)) {
            C32461gQ.A00(A0Y, "provider-type", A082);
        }
        if (str != null && C110105dW.A1W(str, 0, true)) {
            C32461gQ.A00(A0Y, "bank-ref-id", str);
        }
        C28371Vv A0S = C110105dW.A0S(A0Y, A0X, r7);
        boolean A0C2 = this.A09.A0C(2227);
        String str2 = "in_upi_get_accounts_tag";
        if (A0C2) {
            this.A0H.A04(185478423, str2);
        }
        AnonymousClass61W r1 = this.A0G;
        r1.A06((AnonymousClass2HJ) null, 18, 0);
        Context context = this.A07.A00;
        C14870pt r15 = this.A06;
        C18340wX r0 = this.A0D;
        if (A0C2) {
            r8 = this.A0H;
        } else {
            str2 = null;
        }
        C18340wX r16 = r0;
        C110105dW.A1G(r11, new IDxNCallbackShape95S0100000_3_I1(context, r15, r16, r12, this, r1, r8, str2, 3), A0S, A022);
    }
}
