package X;

import com.facebook.msys.wci.IDxRListenerShape42S0100000_2_I1;
import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zj  reason: invalid class name and case insensitive filesystem */
public class C79343zj extends C31591ei {
    public final /* synthetic */ AnonymousClass1S0 A00;
    public final /* synthetic */ AnonymousClass1SU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ Map A08;
    public final /* synthetic */ byte[] A09;
    public final /* synthetic */ byte[] A0A;

    public C79343zj(AnonymousClass1S0 r1, AnonymousClass1SU r2, String str, String str2, String str3, String str4, String str5, List list, Map map, byte[] bArr, byte[] bArr2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = str;
        this.A05 = str2;
        this.A0A = bArr;
        this.A09 = bArr2;
        this.A06 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A08 = map;
        this.A07 = list;
    }

    public void A01() {
        IDxRListenerShape42S0100000_2_I1 iDxRListenerShape42S0100000_2_I1 = new IDxRListenerShape42S0100000_2_I1(this, 4);
        String str = this.A04;
        String str2 = this.A05;
        byte[] bArr = this.A0A;
        byte[] bArr2 = this.A09;
        JniBridge.jvidispatchIOOOOOOOOOO(str, str2, this.A06, this.A03, this.A02, this.A07, iDxRListenerShape42S0100000_2_I1, bArr, bArr2, this.A08);
    }
}
