package X;

import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.33x  reason: invalid class name */
public class AnonymousClass33x extends AnonymousClass51O {
    public final /* synthetic */ C34591kW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass33x(UserJid userJid, C34591kW r4) {
        super(r4.A02, userJid, r4.A04);
        this.A00 = r4;
    }

    public int A00() {
        return 2;
    }

    public void AYG(C28371Vv r14, String str) {
        C28371Vv[] r2;
        C28371Vv r6 = r14;
        C28371Vv A0J = r14.A0J("status");
        if (A0J == null || (r2 = A0J.A03) == null || r2.length != 1) {
            this.A00.A04.AU1(this.A02);
            return;
        }
        boolean z2 = false;
        C28371Vv r4 = r2[0];
        C28371Vv.A06(r4, "user");
        long A01 = 1000 * C29501aj.A01(r4.A0N("t", (String) null), 0);
        Integer valueOf = Integer.valueOf(C29501aj.A00(r4.A0N("code", (String) null), 200));
        String A0N = r4.A0N("type", (String) null);
        String A0L = r4.A0L();
        if (A0N != null && A0N.equals("fail")) {
            z2 = true;
        } else if (TextUtils.isEmpty(A0L)) {
            A0L = C16980tz.A00(this.A00.A01).getString(R.string.str065c);
        }
        A02(r6, 200, valueOf, A0L, A01, z2);
    }
}
