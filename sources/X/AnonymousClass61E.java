package X;

import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;

/* renamed from: X.61E  reason: invalid class name */
public class AnonymousClass61E implements AnonymousClass690 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1Z7 A01;
    public final /* synthetic */ BrazilPayBloksActivity A02;
    public final /* synthetic */ Map A03;

    public AnonymousClass61E(AnonymousClass1Z7 r1, BrazilPayBloksActivity brazilPayBloksActivity, Map map, int i2) {
        this.A02 = brazilPayBloksActivity;
        this.A01 = r1;
        this.A00 = i2;
        this.A03 = map;
    }

    public void ASW(AnonymousClass2HJ r6) {
        int i2;
        int i3 = r6.A00;
        if (i3 != 1448 || (i2 = this.A00) >= 1) {
            C112855jo.A09(this.A01, (Map) null, i3);
            return;
        }
        this.A02.A3E(this.A01, this.A03, i2 + 1);
    }

    public void ASX(C35451lx r3) {
        if ("COMPLETED".equals(r3.A02)) {
            AnonymousClass175 r1 = this.A02.A09;
            r1.A08(r1.A01("kyc"));
            this.A01.A00("on_success");
        }
    }
}
