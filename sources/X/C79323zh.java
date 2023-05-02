package X;

import com.facebook.msys.wci.IDxRListenerShape42S0100000_2_I1;
import com.whatsapp.wamsys.JniBridge;
import java.util.Map;

/* renamed from: X.3zh  reason: invalid class name and case insensitive filesystem */
public class C79323zh extends C31591ei {
    public final /* synthetic */ AnonymousClass1S0 A00;
    public final /* synthetic */ AnonymousClass1SU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ byte[] A06;

    public C79323zh(AnonymousClass1S0 r1, AnonymousClass1SU r2, String str, String str2, String str3, Map map, byte[] bArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A06 = bArr;
        this.A05 = map;
    }

    public void A01() {
        JniBridge.jvidispatchIOOOOOO(this.A03, this.A04, this.A02, new IDxRListenerShape42S0100000_2_I1(this, 5), this.A06, this.A05);
    }
}
