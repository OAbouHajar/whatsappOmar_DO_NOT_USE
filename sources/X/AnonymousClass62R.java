package X;

import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;

/* renamed from: X.62R  reason: invalid class name */
public final /* synthetic */ class AnonymousClass62R implements C1220968g {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public /* synthetic */ AnonymousClass62R(AnonymousClass1Z7 r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }

    public final void ARQ(int i2) {
        AnonymousClass1Z7 r1 = this.A00;
        if (i2 == 0) {
            r1.A00("on_success");
        } else {
            C112855jo.A09(r1, (Map) null, i2);
        }
    }
}
