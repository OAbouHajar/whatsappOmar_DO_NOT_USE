package X;

import com.whatsapp.util.Log;

/* renamed from: X.615  reason: invalid class name */
public class AnonymousClass615 implements C1222668x {
    public final /* synthetic */ C111805hR A00;
    public final /* synthetic */ AnonymousClass68R A01;
    public final /* synthetic */ C112305iH A02;

    public AnonymousClass615(C111805hR r1, AnonymousClass68R r2, C112305iH r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void AP5(C111765hN r6) {
        C112305iH r4 = this.A02;
        C35301lh r3 = r6.A02;
        AnonymousClass00B.A06(r3);
        r4.A00(r3, this.A00, this.A01, r6.A03);
    }

    public void AQW(AnonymousClass2HJ r2) {
        Log.w("PAY: IndiaUpiOtpAction: could not fetch VPA information to request OTP");
        AnonymousClass68R r0 = this.A01;
        if (r0 != null) {
            r0.AWD(r2);
        }
    }
}
