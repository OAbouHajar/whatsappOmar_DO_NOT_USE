package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.5iW  reason: invalid class name and case insensitive filesystem */
public class C112455iW extends C112485iZ {
    public final /* synthetic */ C119175wf A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112455iW(Context context, C14870pt r13, C18340wX r14, AnonymousClass4XO r15, C119175wf r16, AnonymousClass61W r17, C112715ix r18, String str, String str2, String str3) {
        super(context, r13, r14, r15, r17, r18, "upi-bind-device", str, 20);
        this.A00 = r16;
        this.A01 = str2;
        this.A02 = str3;
    }

    public void A03(AnonymousClass2HJ r2) {
        super.A03(r2);
        Log.i(AnonymousClass000.A0g("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", r2));
        A06(r2);
    }

    public void A04(AnonymousClass2HJ r2) {
        super.A04(r2);
        Log.i(AnonymousClass000.A0g("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", r2));
        A06(r2);
    }

    public void A05(C28371Vv r7) {
        super.A05(r7);
        C119175wf r5 = this.A00;
        String A03 = r5.A0I.A03();
        AnonymousClass60V r0 = r5.A0C;
        String str = this.A01;
        String str2 = this.A02;
        r0.A0K(str, str2, A03);
        StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: ");
        Log.i(AnonymousClass000.A0h(C112485iZ.A02(str, str2, A03, A0r), A0r));
        C1222768y r1 = r5.A02;
        if (r1 != null) {
            r1.APe((AnonymousClass2HJ) null);
        }
    }

    public final void A06(AnonymousClass2HJ r7) {
        C119175wf r5 = this.A00;
        if (r5.A02 != null) {
            if (r7.A00 == 11453) {
                String A03 = r5.A0I.A03();
                AnonymousClass60V r0 = r5.A0C;
                String str = this.A01;
                String str2 = this.A02;
                r0.A0K(str, str2, A03);
                StringBuilder A0r = AnonymousClass000.A0r("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ");
                Log.i(AnonymousClass000.A0h(C112485iZ.A02(str, str2, A03, A0r), A0r));
            }
            r5.A02.APe(r7);
        }
    }
}
