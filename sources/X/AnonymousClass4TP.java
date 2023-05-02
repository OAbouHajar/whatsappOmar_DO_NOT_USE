package X;

import android.app.Activity;
import android.content.Intent;
import com.obwhatsapp.businessdirectory.view.activity.DirectoryBusinessChainingActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4TP  reason: invalid class name */
public class AnonymousClass4TP {
    public final C16040sK A00;
    public final C17180uf A01;

    public AnonymousClass4TP(C16040sK r1, C17180uf r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(Activity activity, C16010sH r6) {
        if (r6.A07() != null && A01(r6) && r6.A0B() != null) {
            C15830rv A07 = r6.A07();
            String A0B = r6.A0B();
            Intent intent = new Intent(activity, DirectoryBusinessChainingActivity.class);
            intent.putExtra("directory_biz_chaining_jid", A07);
            intent.putExtra("directory_biz_chaining_name", A0B);
            activity.startActivity(intent);
        }
    }

    public boolean A01(C16010sH r3) {
        C17180uf r1 = this.A01;
        if (!r1.A02() || !r3.A0H()) {
            return false;
        }
        if (r1.A03()) {
            return true;
        }
        if (r1.A02() && r1.A02.A0C(1764)) {
            return true;
        }
        Jid A08 = r3.A08(UserJid.class);
        return A08 != null && A08.getRawString().startsWith("5511");
    }
}
