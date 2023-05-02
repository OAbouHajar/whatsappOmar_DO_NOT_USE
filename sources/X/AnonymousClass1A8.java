package X;

import android.os.Handler;
import android.os.Message;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.1A8  reason: invalid class name */
public class AnonymousClass1A8 {
    public final C16040sK A00;
    public final C16760tb A01;
    public final C18930xU A02;
    public final AnonymousClass10K A03;

    public AnonymousClass1A8(C16040sK r1, C16760tb r2, C18930xU r3, AnonymousClass10K r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void A00(String str) {
        C18930xU r3 = this.A02;
        C33661iw r0 = (C33661iw) r3.A0T.A02("setting_pushName");
        Set emptySet = r0 == null ? Collections.emptySet() : r3.A0I(Collections.singletonList(new C37081oa((AnonymousClass1WK) null, (String) null, str, r0.A01.A00())));
        this.A00.A0F(str);
        AnonymousClass10K r1 = this.A03;
        if (r1.A02()) {
            r1.A01("user_push_name", str);
        }
        r3.A0V(emptySet);
        C16760tb r12 = this.A01;
        if (r12.A0B.A05) {
            r12.A1D.A09(Message.obtain((Handler) null, 0, 3, 0, str), false);
        }
    }
}
