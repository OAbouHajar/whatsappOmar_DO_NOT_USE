package X;

import android.content.DialogInterface;
import com.facebook.redex.IDxDListenerShape160S0100000_3_I1;
import com.facebook.redex.IDxDListenerShape68S0200000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.jid.UserJid;
import java.security.Signature;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5ze  reason: invalid class name and case insensitive filesystem */
public class C119805ze implements AnonymousClass2J2, C1223569g {
    public final /* synthetic */ AnonymousClass2J2 A00;
    public final /* synthetic */ C111565ga A01;

    public C119805ze(AnonymousClass2J2 r1, C111565ga r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static /* synthetic */ void A00(C119805ze r6) {
        AnonymousClass61I r0 = r6.A01.A05;
        BrazilPaymentActivity brazilPaymentActivity = r0.A04;
        C30671cl r2 = r0.A02;
        BrazilPaymentActivity.A03(r0.A01, r2, r0.A03, brazilPaymentActivity, r0.A05, r0.A06);
    }

    public void A01() {
        C111565ga r1 = this.A01;
        r1.A01.A1C();
        C32241fu A002 = C32241fu.A00(r1.A00);
        A002.A02(R.string.str0ff5);
        A002.A01(R.string.str0ff4);
        C110105dW.A0w(A002, this, 1, R.string.str0e87);
        A002.A07(false);
        A002.A00();
    }

    public void AKJ(AnonymousClass2HJ r2, Integer num) {
        this.A01.A05.AKJ(r2, num);
        AQX(r2, num);
    }

    public Integer AKM() {
        return this.A01.A05.AKM();
    }

    public void AKW(AnonymousClass2HJ r2, Integer num) {
        this.A01.A05.AKW(r2, num);
    }

    public void AKX(Integer num) {
        this.A01.A05.AKX(num);
    }

    public void AMu(int i2, CharSequence charSequence) {
        if (i2 == 7) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C111565ga r5 = this.A01;
            C16440t3 r6 = r5.A02;
            long seconds = timeUnit.toSeconds(r6.A00()) + 30;
            r5.A04.A02(seconds);
            long j2 = (seconds * 1000) + 500;
            if (j2 > r6.A00()) {
                r5.A01.A1M(j2);
            }
        }
        this.A00.AMu(i2, charSequence);
    }

    public void AMv() {
        this.A00.AMv();
    }

    public void AMx(int i2, CharSequence charSequence) {
        this.A00.AMx(i2, charSequence);
    }

    public void AMy(byte[] bArr) {
        C111565ga r2 = this.A01;
        r2.A01.A09 = true;
        r2.A00.Afq(R.string.str0fd2);
    }

    public /* synthetic */ void AMz(Signature signature) {
    }

    public void AQX(AnonymousClass2HJ r13, Integer num) {
        C005702l A002;
        C35281lf A003;
        C111565ga r1 = this.A01;
        r1.A00.Ac1();
        FingerprintBottomSheet fingerprintBottomSheet = r1.A01;
        fingerprintBottomSheet.A09 = false;
        int i2 = r13.A00;
        if (i2 == 1441) {
            fingerprintBottomSheet.A1M(r13.A02 * 1000);
            return;
        }
        AnonymousClass61I r12 = r1.A05;
        BrazilPaymentActivity brazilPaymentActivity = r12.A04;
        brazilPaymentActivity.A0O.A05(brazilPaymentActivity.A00, "error_code", (long) i2);
        int i3 = r13.A00;
        if (i3 == 454) {
            C28371Vv r0 = r13.A05;
            if (!(r0 == null || (A003 = C35281lf.A00(r0)) == null)) {
                brazilPaymentActivity.A0D.A04(C115275pU.A00(brazilPaymentActivity.A07, A003));
            }
            BrazilPaymentActivity.A02(r12.A00, brazilPaymentActivity);
            return;
        }
        if (i3 == 2896003 || i3 == 2896004) {
            AnonymousClass5xP.A02(AnonymousClass5xP.A00(brazilPaymentActivity.A05, (C28401Vy) null, brazilPaymentActivity.A0U, (String) null, false), brazilPaymentActivity.A0L, "incentive_unavailable", "payment_confirm_prompt");
            A002 = brazilPaymentActivity.A08.A00(brazilPaymentActivity, (DialogInterface.OnDismissListener) null, new IDxDListenerShape68S0200000_3_I1(r12.A00, 4, r12), (DialogInterface.OnDismissListener) null, (String) null, r13.A00);
        } else {
            if (i3 == 444 || i3 == 478) {
                brazilPaymentActivity.A0K.A01.A01("FB", "PIN");
            }
            C1200860g r5 = brazilPaymentActivity.A08;
            int i4 = r13.A00;
            C16080sP r3 = brazilPaymentActivity.A03;
            C216114t r2 = brazilPaymentActivity.A08;
            UserJid userJid = brazilPaymentActivity.A0G;
            AnonymousClass00B.A06(userJid);
            String A08 = r3.A08(r2.A01(userJid));
            FingerprintBottomSheet fingerprintBottomSheet2 = r12.A00;
            A002 = r5.A00(brazilPaymentActivity, new IDxDListenerShape68S0200000_3_I1(fingerprintBottomSheet2, 3, r12), new IDxDListenerShape160S0100000_3_I1(fingerprintBottomSheet2, 7), new IDxDListenerShape68S0200000_3_I1(fingerprintBottomSheet2, 2, r12), A08, i4);
        }
        A002.show();
    }

    public void AWR(String str, Integer num) {
        C111565ga r3 = this.A01;
        r3.A00.Ac1();
        FingerprintBottomSheet fingerprintBottomSheet = r3.A01;
        fingerprintBottomSheet.A1H(false);
        fingerprintBottomSheet.A03.setEnabled(false);
        fingerprintBottomSheet.A02.setEnabled(false);
        AnonymousClass61I r32 = r3.A05;
        BrazilPaymentActivity brazilPaymentActivity = r32.A04;
        brazilPaymentActivity.A0O.A0A(num, "pay-precheck", 2);
        String str2 = r32.A05;
        C28401Vy r5 = r32.A01;
        C30671cl r6 = r32.A02;
        String str3 = r32.A06;
        int i2 = 1;
        if (brazilPaymentActivity.A3H(r5, brazilPaymentActivity.A01) == null) {
            i2 = 0;
        }
        brazilPaymentActivity.A3L(r5, r6, r32.A03, str2, str, str3, i2);
        this.A00.AMy((byte[]) null);
    }
}
