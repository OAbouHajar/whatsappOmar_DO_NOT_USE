package X;

import com.facebook.msys.wci.IDxRListenerShape42S0100000_2_I1;
import com.whatsapp.wamsys.JniBridge;
import java.util.Map;

/* renamed from: X.3zi  reason: invalid class name and case insensitive filesystem */
public class C79333zi extends C31591ei {
    public final /* synthetic */ AnonymousClass1S0 A00;
    public final /* synthetic */ AnonymousClass1SU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;
    public final /* synthetic */ byte[] A08;
    public final /* synthetic */ byte[] A09;

    public C79333zi(AnonymousClass1S0 r1, AnonymousClass1SU r2, String str, String str2, String str3, String str4, String str5, Map map, byte[] bArr, byte[] bArr2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = str;
        this.A05 = str2;
        this.A09 = bArr;
        this.A08 = bArr2;
        this.A03 = str3;
        this.A06 = str4;
        this.A02 = str5;
        this.A07 = map;
    }

    public void A01() {
        IDxRListenerShape42S0100000_2_I1 iDxRListenerShape42S0100000_2_I1 = new IDxRListenerShape42S0100000_2_I1(this, 2);
        JniBridge.jvidispatchIOOOOOOOOO(4, this.A04, this.A05, this.A03, this.A06, this.A02, iDxRListenerShape42S0100000_2_I1, this.A09, this.A08, this.A07);
    }
}
