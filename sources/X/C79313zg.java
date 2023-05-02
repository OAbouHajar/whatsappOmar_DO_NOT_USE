package X;

import com.facebook.msys.wci.IDxRListenerShape42S0100000_2_I1;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.3zg  reason: invalid class name and case insensitive filesystem */
public class C79313zg extends C31591ei {
    public final /* synthetic */ AnonymousClass1S0 A00;
    public final /* synthetic */ AnonymousClass1SU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public C79313zg(AnonymousClass1S0 r1, AnonymousClass1SU r2, String str, String str2, byte[] bArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = bArr;
    }

    public void A01() {
        JniBridge.jvidispatchIOOOO(1, this.A02, this.A03, new IDxRListenerShape42S0100000_2_I1(this, 6), this.A04);
    }
}
