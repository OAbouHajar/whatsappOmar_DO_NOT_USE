package X;

import com.whatsapp.util.Log;

/* renamed from: X.506  reason: invalid class name */
public final class AnonymousClass506 implements AnonymousClass692 {
    public final /* synthetic */ AnonymousClass39C A00;
    public final /* synthetic */ AnonymousClass1IM A01;
    public final /* synthetic */ String A02;

    public AnonymousClass506(AnonymousClass39C r1, AnonymousClass1IM r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public void AVP(AnonymousClass2HJ r6) {
        Log.e("PAY: FcsPaymentsDataEncryptionResource getProviderEncryptionKeyAsync iq returned null");
        this.A01.A04(new AnonymousClass2HJ(), (AnonymousClass50C) null, this.A00, this.A02);
    }

    public void AVQ(AnonymousClass50C r5) {
        C18450wi.A0H(r5, 0);
        this.A01.A04((AnonymousClass2HJ) null, r5, this.A00, this.A02);
    }
}
