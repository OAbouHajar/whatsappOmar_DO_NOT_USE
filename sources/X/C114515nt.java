package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.5nt  reason: invalid class name and case insensitive filesystem */
public class C114515nt extends C16690tT {
    public final AnonymousClass69M A00;
    public final C18280wR A01;
    public final String A02;
    public final String A03;
    public final C116525rW A04;

    public C114515nt(AnonymousClass69M r1, C18280wR r2, String str, String str2, C116525rW r5) {
        this.A01 = r2;
        this.A02 = str;
        this.A04 = r5;
        this.A03 = str2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C116525rW r1 = this.A04;
        String str = this.A03;
        String A012 = this.A01.A01();
        String str2 = this.A02;
        r1.A00.A09("onboarding", "registerApp called", new C40001tP[]{new C40001tP("app_id", "com.obwhatsapp"), new C40001tP("mobile", str), new C40001tP("device_id", A012)});
        String encodeToString = Base64.encodeToString(AnonymousClass5xS.A03(Base64.decode(str2, 0), AnonymousClass5xS.A01(C116525rW.A01.A01())), 0);
        StringBuilder A0q = AnonymousClass000.A0q("com.obwhatsapp");
        C110115dX.A15(A0q, "|", str);
        return Boolean.valueOf(Base64.encodeToString(AnonymousClass5xS.A02(AnonymousClass000.A0h(A012, A0q)), 0).equalsIgnoreCase(encodeToString));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Boolean bool = (Boolean) obj;
        AnonymousClass69M r1 = this.A00;
        if (r1 != null) {
            Log.i(AnonymousClass000.A0g("PAY: IndiaUpiSetupCoordinator/registered: ", bool));
            r1.AVv(bool.booleanValue());
        }
        C118535uq.A0D = null;
    }
}
