package X;

import com.facebook.msys.wci.IDxRListenerShape42S0100000_2_I1;
import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zk  reason: invalid class name and case insensitive filesystem */
public class C79353zk extends C31591ei {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass1S0 A03;
    public final /* synthetic */ AnonymousClass1SU A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ Map A0C;
    public final /* synthetic */ byte[] A0D;
    public final /* synthetic */ byte[] A0E;
    public final /* synthetic */ byte[] A0F;

    public C79353zk(AnonymousClass1S0 r2, AnonymousClass1SU r3, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, int i4) {
        this.A04 = r3;
        this.A03 = r2;
        this.A08 = str;
        this.A09 = str2;
        this.A0F = bArr;
        this.A0D = bArr2;
        this.A0A = str3;
        this.A07 = str4;
        this.A06 = str5;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A0E = bArr3;
        this.A05 = str6;
        this.A0C = map;
        this.A0B = list;
    }

    public void A01() {
        IDxRListenerShape42S0100000_2_I1 iDxRListenerShape42S0100000_2_I1 = new IDxRListenerShape42S0100000_2_I1(this, 3);
        String str = this.A08;
        String str2 = this.A09;
        byte[] bArr = this.A0F;
        byte[] bArr2 = this.A0D;
        String str3 = this.A0A;
        String str4 = this.A07;
        String str5 = this.A06;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A00;
        byte[] bArr3 = this.A0E;
        String str6 = this.A05;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        byte[] bArr6 = bArr3;
        Map map = this.A0C;
        IDxRListenerShape42S0100000_2_I1 iDxRListenerShape42S0100000_2_I12 = iDxRListenerShape42S0100000_2_I1;
        String str7 = str4;
        long j2 = (long) i3;
        long j3 = (long) i4;
        long j4 = (long) i2;
        JniBridge.jvidispatchIIIIOOOOOOOOOOOO(j4, j2, j3, str, str2, str3, str7, str5, str6, this.A0B, iDxRListenerShape42S0100000_2_I12, bArr4, bArr5, bArr6, map);
    }
}
