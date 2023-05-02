package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5ec  reason: invalid class name and case insensitive filesystem */
public class C110665ec extends C003401n {
    public C001300o A00;
    public AnonymousClass026 A01 = new AnonymousClass026();
    public AnonymousClass026 A02 = new AnonymousClass026();
    public AnonymousClass027 A03 = C13690nt.A0O();
    public final C14870pt A04;
    public final C15900s5 A05;
    public final C18260wP A06;
    public final C16440t3 A07;
    public final C16980tz A08;
    public final C15860rz A09;
    public final C16290sm A0A;
    public final C17190ug A0B;
    public final AnonymousClass60V A0C;
    public final C18340wX A0D;
    public final C18310wU A0E;
    public final AnonymousClass174 A0F;
    public final C18290wS A0G;

    public C110665ec(C001300o r5, C14870pt r6, C15900s5 r7, C18260wP r8, C16440t3 r9, C16980tz r10, C15860rz r11, C16290sm r12, C17190ug r13, AnonymousClass60V r14, C18340wX r15, C18310wU r16, AnonymousClass174 r17, C18290wS r18) {
        this.A00 = r5;
        this.A07 = r9;
        this.A04 = r6;
        this.A08 = r10;
        this.A05 = r7;
        this.A0B = r13;
        this.A0G = r18;
        this.A09 = r11;
        this.A0E = r16;
        this.A0F = r17;
        this.A06 = r8;
        this.A0D = r15;
        this.A0C = r14;
        this.A0A = r12;
        this.A02.A0B(new C116865s4(0, -1));
        this.A01.A0B(new C119395xh());
        this.A01.A0D(this.A03, C110115dX.A07(this, 65));
    }

    public static void A01(C110665ec r2, int i2, int i3) {
        r2.A02.A0B(new C116865s4(i2, i3));
    }

    public C119395xh A05() {
        Object A012 = this.A01.A01();
        AnonymousClass00B.A06(A012);
        return (C119395xh) A012;
    }

    public final void A06(int i2) {
        int i3 = i2;
        if (this.A05.A05(C15910s6.A0n)) {
            A01(this, 2, -1);
            AnonymousClass60V r6 = this.A0C;
            synchronized (r6) {
                String[] strArr = {"signedQrCode", "signedQrCodeTs"};
                try {
                    C18300wT r5 = r6.A03;
                    String A042 = r5.A04();
                    if (!TextUtils.isEmpty(A042)) {
                        JSONObject A0K = C13700nu.A0K(A042);
                        int i4 = 0;
                        do {
                            A0K.remove(strArr[i4]);
                            i4++;
                        } while (i4 < 2);
                        C110105dW.A1J(r5, A0K);
                    }
                } catch (JSONException e2) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteFromPaymentInfo for keys threw: ", e2);
                }
            }
            C119395xh A052 = A05();
            A052.A0I = null;
            A052.A04 = "02";
            this.A01.A0B(A052);
            Context context = this.A08.A00;
            C14870pt r10 = this.A04;
            AnonymousClass4XO r13 = new AnonymousClass4XO();
            C112175i4 r8 = new C112175i4(context, r10, this.A0B, this.A0D, r13, this.A0E);
            String A062 = A05().A06();
            AnonymousClass5u8 r9 = new AnonymousClass5u8(this, i3);
            C17190ug r102 = r8.A02;
            String A022 = r102.A02();
            AnonymousClass2BJ r62 = new AnonymousClass2BJ(A022);
            C32461gQ A0X = C110105dW.A0X();
            C32461gQ.A00(A0X, "xmlns", "w:pay");
            C32461gQ A0Z = C110105dW.A0Z(A0X);
            C32461gQ.A00(A0Z, "action", "upi-sign-qr-code");
            if (C110115dX.A1B(A062, 1, false)) {
                C32461gQ.A00(A0Z, "qr-code", A062);
            }
            r102.A0A(new IDxNCallbackShape21S0200000_3_I1(r8.A00, r8.A01, r8.A03, C116635rh.A02(r8, "upi-sign-qr-code"), r8, r9), C110105dW.A0S(A0Z, A0X, r62), A022, 204, 0);
            return;
        }
        A01(this, 0, i3);
        return;
    }

    public final void A07(String str, int i2) {
        C116865s4 r1;
        AnonymousClass026 r5 = this.A01;
        C119395xh r4 = (C119395xh) r5.A01();
        if (str.equals(r4.A0A)) {
            r1 = new C116865s4(3, i2);
        } else {
            AnonymousClass174 r12 = this.A0F;
            C28401Vy ADn = r12.A00().ADn();
            C28401Vy A0B2 = C110115dX.A0B(r12.A00(), str);
            if (A0B2 == null || A0B2.A00.compareTo(ADn.A00) < 0) {
                r4.A0A = null;
                r5.A0B(r4);
                r1 = new C116865s4(0, i2);
            } else {
                r4.A0A = str;
                r5.A0B(r4);
                A06(i2);
                return;
            }
        }
        this.A02.A0B(r1);
    }
}
