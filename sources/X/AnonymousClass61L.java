package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.61L  reason: invalid class name */
public class AnonymousClass61L implements AnonymousClass692 {
    public final /* synthetic */ C118545ur A00;
    public final /* synthetic */ C116735rr A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public AnonymousClass61L(C118545ur r1, C116735rr r2, Boolean bool, String str, String str2, String str3, String str4) {
        this.A00 = r1;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = bool;
        this.A03 = str4;
        this.A01 = r2;
    }

    public void AVP(AnonymousClass2HJ r4) {
        Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
        C116735rr r0 = this.A01;
        C112855jo.A09(r0.A00, (Map) null, r4.A00);
    }

    public void AVQ(AnonymousClass50C r9) {
        C118545ur r0 = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        AnonymousClass50C r1 = r9;
        r0.A00(r1, this.A01, this.A02, str, str2, str3, this.A03);
    }
}
