package X;

import com.facebook.msys.wci.IDxRListenerShape40S0100000_1_I0;
import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Hd  reason: invalid class name and case insensitive filesystem */
public class C47012Hd extends C31591ei {
    public final /* synthetic */ AnonymousClass1S0 A00;
    public final /* synthetic */ AnonymousClass1SU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ byte[] A07;
    public final /* synthetic */ byte[] A08;
    public final /* synthetic */ byte[] A09;

    public C47012Hd(AnonymousClass1S0 r1, AnonymousClass1SU r2, String str, String str2, String str3, List list, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A09 = bArr;
        this.A07 = bArr2;
        this.A08 = bArr3;
        this.A02 = str3;
        this.A06 = map;
        this.A05 = list;
    }

    public void A01() {
        IDxRListenerShape40S0100000_1_I0 iDxRListenerShape40S0100000_1_I0 = new IDxRListenerShape40S0100000_1_I0(this, 0);
        String str = this.A03;
        String str2 = this.A04;
        byte[] bArr = this.A09;
        byte[] bArr2 = this.A07;
        byte[] bArr3 = this.A08;
        JniBridge.jvidispatchIOOOOOOOOO(0, str, str2, this.A02, this.A05, iDxRListenerShape40S0100000_1_I0, bArr, bArr2, bArr3, this.A06);
    }
}
