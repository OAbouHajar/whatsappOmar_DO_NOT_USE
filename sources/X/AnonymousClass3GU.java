package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.3GU  reason: invalid class name */
public class AnonymousClass3GU implements C19550yc {
    public final C16300so A00;
    public final AnonymousClass4Q7 A01;
    public final C15860rz A02;
    public final C17190ug A03;

    public AnonymousClass3GU(C16300so r1, AnonymousClass4Q7 r2, C15860rz r3, C17190ug r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void APb(String str) {
        this.A01.A00.A00();
    }

    public void AQe(C28371Vv r3, String str) {
        this.A01.A00.A02(C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r11, String str) {
        C28371Vv A0H = r11.A0H();
        C28371Vv.A06(A0H, "list");
        if (A0H.A0M("matched").equals("false")) {
            HashSet A0o = C13680ns.A0o();
            C28371Vv[] r9 = A0H.A03;
            if (r9 != null) {
                for (C28371Vv r3 : r9) {
                    C28371Vv.A06(r3, "item");
                    A0o.add(r3.A0F(this.A00, UserJid.class, "jid"));
                }
            }
            if (TextUtils.equals(A0H.A0N("c_dhash", (String) null), C13680ns.A0B(this.A02).getString("block_list_v2_dhash", (String) null))) {
                Log.w("blocklistv2setprotocolhelper/onSuccess/only dhash mis-match.");
                this.A01.A00(A0H.A0N("dhash", (String) null), A0o, false);
                return;
            }
            Log.w("blocklistv2setprotocolhelper/onSuccess/dhash and c_dhash mis-match.");
            this.A01.A00((String) null, A0o, true);
            return;
        }
        this.A01.A00.A03(C28371Vv.A05(A0H, "dhash"));
    }
}
