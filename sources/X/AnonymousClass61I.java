package X;

import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.61I  reason: invalid class name */
public class AnonymousClass61I implements AnonymousClass69R {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C30671cl A02;
    public final /* synthetic */ AnonymousClass1XP A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public AnonymousClass61I(FingerprintBottomSheet fingerprintBottomSheet, C28401Vy r2, C30671cl r3, AnonymousClass1XP r4, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        this.A04 = brazilPaymentActivity;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = r4;
        this.A00 = fingerprintBottomSheet;
    }

    public void AKJ(AnonymousClass2HJ r3, Integer num) {
        this.A04.A0O.A07(r3, num, "pay-precheck");
    }

    public Integer AKM() {
        return this.A04.A0O.A02("pay-precheck");
    }

    public void AKW(AnonymousClass2HJ r3, Integer num) {
        this.A04.A0O.A07(r3, num, "get-provider-key");
    }

    public void AKX(Integer num) {
        this.A04.A0O.A0A(num, "get-provider-key", 2);
    }
}
