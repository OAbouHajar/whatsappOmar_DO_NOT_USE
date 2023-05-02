package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.List;

/* renamed from: X.38a  reason: invalid class name and case insensitive filesystem */
public class C612138a {
    public final /* synthetic */ C42821yj A00;

    public C612138a(C42821yj r1) {
        this.A00 = r1;
    }

    public void A00(C70653hS r17, AnonymousClass4TW r18) {
        C42821yj r1 = this.A00;
        String str = r18.A00;
        if (r1.A1Q.A0V((UserJid) C16010sH.A03(r1.A2l))) {
            AnonymousClass29T.A01((Activity) r1.A22, 106);
        } else {
            C70653hS r5 = r17;
            C40531uH A002 = r1.A2B.A00(r5, r1.A2R);
            C16760tb r4 = C14530pL.A0K(r1).A03;
            List singletonList = Collections.singletonList(r1.A2l.A08(C15830rv.class));
            r4.A09(r5, r1.A2D, (C35541m6) null, A002, r1.A2C.A0D, C40651uT.A05(str), singletonList, Collections.emptyList(), r1.A4Y, false, true);
        }
        r1.A0n(true);
        C41681wN r2 = r1.A2D;
        r2.A0B(r2.A05);
        r1.A0N.setVisibility(8);
    }
}
