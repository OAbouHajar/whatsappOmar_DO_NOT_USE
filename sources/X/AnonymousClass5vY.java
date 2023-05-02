package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.redex.IDxKCallbackShape389S0100000_3_I1;
import com.whatsapp.util.Log;

/* renamed from: X.5vY  reason: invalid class name */
public abstract class AnonymousClass5vY {
    public final Context A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C16440t3 A03;
    public final AnonymousClass160 A04;
    public final C18340wX A05;
    public final C18310wU A06;
    public final C18290wS A07;
    public final C119285wq A08;
    public final C118585uv A09;

    public AnonymousClass5vY(Context context, C14870pt r2, C16040sK r3, C16440t3 r4, AnonymousClass160 r5, C18340wX r6, C18310wU r7, C18290wS r8, C119285wq r9, C118585uv r10) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
        this.A05 = r6;
        this.A08 = r9;
    }

    public void A00() {
        Log.i("PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync");
        C119285wq r9 = this.A08;
        AnonymousClass50C A022 = r9.A02("VISA", "STEP-UP", true);
        if (A022 == null) {
            new C118435ug(this.A00, this.A01, this.A05, this.A06, r9, "STEP-UP").A00(new IDxKCallbackShape389S0100000_3_I1(this, 1), "VISA");
            return;
        }
        A01((AnonymousClass2HJ) null, A022);
    }

    public void A01(AnonymousClass2HJ r5, AnonymousClass50C r6) {
        C118175uG r0;
        C118095u3 r02;
        if (this instanceof C112155i2) {
            C112155i2 r2 = (C112155i2) this;
            if (r5 != null) {
                Log.e(AnonymousClass000.A0h(r5.A08, AnonymousClass000.A0r("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure ")));
                r02 = r2.A04;
            } else {
                String A032 = r2.A03.A03(r6, r2.A05);
                if (TextUtils.isEmpty(A032)) {
                    Log.e("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure");
                    r02 = r2.A04;
                    r5 = C110115dX.A0N();
                } else {
                    Log.i("PAY: BrazilVerifyCardSendAuthCodeAction onProviderKeyFetched success");
                    r2.A03(A032);
                    return;
                }
            }
            r02.A00(r5);
            return;
        }
        C112165i3 r3 = (C112165i3) this;
        if (r5 != null) {
            r0 = r3.A05;
        } else {
            String A033 = r3.A03.A03(r6, r3.A09);
            if (TextUtils.isEmpty(A033)) {
                Log.e("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp/enc otp failure");
                r0 = r3.A05;
                r5 = C110115dX.A0N();
            } else {
                Log.i("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp");
                r3.A03(A033);
                return;
            }
        }
        r0.A00((C35391lr) null, r5);
    }

    public void A02(AnonymousClass2HJ r12, String str) {
        C112165i3 r3 = (C112165i3) this;
        if (r12 != null || str == null) {
            r3.A05.A00((C35391lr) null, r12);
            return;
        }
        r3.A09.A00(str);
        C119285wq r9 = r3.A08;
        AnonymousClass50C A0R = C110115dX.A0R(r9, "ELO", "ADD-CARD");
        if (A0R == null) {
            new C118435ug(r3.A00, r3.A01, r3.A05, r3.A06, r9, "ADD-CARD").A00(new IDxKCallbackShape389S0100000_3_I1(r3, 2), "FB");
            return;
        }
        r3.A03(r3.A03.A02((AnonymousClass3GH) A0R.A00, r3.A09));
    }
}
