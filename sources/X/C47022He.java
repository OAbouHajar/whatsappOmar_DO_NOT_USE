package X;

import com.facebook.msys.wci.IDxRListenerShape41S0100000_2_I0;
import com.whatsapp.wamsys.JniBridge;
import java.util.Map;

/* renamed from: X.2He  reason: invalid class name and case insensitive filesystem */
public class C47022He extends C31591ei {
    public final /* synthetic */ AnonymousClass1S0 A00;
    public final /* synthetic */ AnonymousClass1SU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    public C47022He(AnonymousClass1S0 r1, AnonymousClass1SU r2, String str, String str2, Map map) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = map;
    }

    public void A01() {
        JniBridge.jvidispatchIOOOO(0, this.A02, this.A03, new IDxRListenerShape41S0100000_2_I0(this, 0), this.A04);
    }
}
