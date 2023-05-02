package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.617  reason: invalid class name */
public class AnonymousClass617 implements C1222668x {
    public final /* synthetic */ C35301lh A00;
    public final /* synthetic */ C112325iJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ HashMap A07;

    public AnonymousClass617(C35301lh r1, C112325iJ r2, String str, String str2, String str3, String str4, String str5, HashMap hashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A07 = hashMap;
        this.A05 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = str5;
    }

    public void AP5(C111765hN r11) {
        C112325iJ r0 = this.A01;
        C35301lh r1 = r11.A02;
        AnonymousClass00B.A06(r1);
        String str = r11.A03;
        r0.A01(r1, this.A00, str, this.A02, this.A05, this.A03, this.A04, this.A06, this.A07);
    }

    public void AQW(AnonymousClass2HJ r2) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to set pin");
        C1222868z r0 = this.A01.A00;
        if (r0 != null) {
            r0.AX5(r2);
        }
    }
}
