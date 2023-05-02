package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.616  reason: invalid class name */
public class AnonymousClass616 implements C1222668x {
    public final /* synthetic */ C35301lh A00;
    public final /* synthetic */ C112325iJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ HashMap A04;

    public AnonymousClass616(C35301lh r1, C112325iJ r2, String str, String str2, HashMap hashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A04 = hashMap;
        this.A03 = str2;
    }

    public void AP5(C111765hN r8) {
        C112325iJ r0 = this.A01;
        C35301lh r1 = r8.A02;
        AnonymousClass00B.A06(r1);
        String str = r8.A03;
        r0.A02(r1, this.A00, str, this.A02, this.A03, this.A04);
    }

    public void AQW(AnonymousClass2HJ r2) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to change pin");
        C1222868z r0 = this.A01.A00;
        if (r0 != null) {
            r0.AX5(r2);
        }
    }
}
