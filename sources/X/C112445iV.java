package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.5iV  reason: invalid class name and case insensitive filesystem */
public class C112445iV extends C112485iZ {
    public final /* synthetic */ C35301lh A00;
    public final /* synthetic */ AnonymousClass68L A01;
    public final /* synthetic */ C112285iF A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112445iV(Context context, C14870pt r8, C35301lh r9, AnonymousClass68L r10, C18340wX r11, AnonymousClass4XO r12, C112285iF r13, Integer num, boolean z2) {
        super(context, r8, r11, r12, "upi-get-vpa-name");
        this.A02 = r13;
        this.A01 = r10;
        this.A04 = z2;
        this.A03 = num;
        this.A00 = r9;
    }

    public void A03(AnonymousClass2HJ r15) {
        this.A02.A06.A07(r15, this.A03, "upi-get-vpa-name");
        this.A01.AWU((UserJid) null, (C35301lh) null, (C35301lh) null, (C35301lh) null, r15, (String) null, (String) null, (String) null, false, false, false, this.A04, false);
    }

    public void A04(AnonymousClass2HJ r15) {
        this.A02.A06.A07(r15, this.A03, "upi-get-vpa-name");
        this.A01.AWU((UserJid) null, (C35301lh) null, (C35301lh) null, (C35301lh) null, r15, (String) null, (String) null, (String) null, false, false, false, this.A04, false);
    }

    public void A05(C28371Vv r20) {
        Class<String> cls = String.class;
        C28371Vv A0X = C110115dX.A0X(r20);
        if (A0X != null) {
            C111775hO r1 = new C111775hO();
            C112285iF r5 = this.A02;
            r1.A01(r5.A02, A0X, 7);
            C35301lh A0J = C110105dW.A0J(C110105dW.A0L(), cls, r1.A0H(), "upiHandle");
            if (TextUtils.isEmpty(r1.A07())) {
                r5.A04.A00(A0J, r1.A0N());
            }
            r5.A06.A0A(this.A03, "upi-get-vpa-name", 2);
            AnonymousClass68L r52 = this.A01;
            boolean A0O = r1.A0O();
            boolean A0M = r1.A0M();
            C35301lh A0J2 = C110105dW.A0J(C110105dW.A0L(), cls, r1.A0J(), "accountHolderName");
            String A0I = r1.A0I();
            r52.AWU(UserJid.getNullable(r1.A07()), A0J2, A0J, this.A00, (AnonymousClass2HJ) null, A0I, r1.A0C(), r1.A09(), A0O, A0M, r1.A0N(), this.A04, r1.A0K());
            return;
        }
        Log.e("PAY: IndiaUpiPayNonWaVpaAction verifyPaymentVpa: missing account node");
        this.A02.A06.A07((AnonymousClass2HJ) null, this.A03, "upi-get-vpa-name");
        this.A01.AWU((UserJid) null, (C35301lh) null, (C35301lh) null, (C35301lh) null, (AnonymousClass2HJ) null, (String) null, (String) null, (String) null, false, false, false, this.A04, false);
    }
}
