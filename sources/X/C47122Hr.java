package X;

import com.facebook.msys.wci.IDxRListenerShape41S0100000_2_I0;
import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hr  reason: invalid class name and case insensitive filesystem */
public class C47122Hr extends C31591ei {
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
    public final /* synthetic */ byte[] A0B;

    public C47122Hr(AnonymousClass1S0 r1, AnonymousClass1SU r2, String str, String str2, String str3, String str4, String str5, List list, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A0B = bArr;
        this.A0A = bArr2;
        this.A09 = bArr3;
        this.A02 = str4;
        this.A03 = str5;
        this.A08 = map;
        this.A07 = list;
    }

    public void A01() {
        IDxRListenerShape41S0100000_2_I0 iDxRListenerShape41S0100000_2_I0 = new IDxRListenerShape41S0100000_2_I0(this, 1);
        String str = this.A06;
        String str2 = this.A04;
        String str3 = this.A05;
        byte[] bArr = this.A0B;
        byte[] bArr2 = this.A0A;
        byte[] bArr3 = this.A09;
        JniBridge.jvidispatchIOOOOOOOOOOOO(str, str2, str3, this.A02, this.A03, this.A07, iDxRListenerShape41S0100000_2_I0, bArr, bArr2, bArr3, (Object) null, this.A08);
    }
}
