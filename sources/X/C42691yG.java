package X;

import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1yG  reason: invalid class name and case insensitive filesystem */
public class C42691yG {
    public final C16000sG A00;
    public final C16080sP A01;
    public final C16980tz A02;

    public C42691yG(C16000sG r1, C16080sP r2, C16980tz r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String A00(AnonymousClass1Vt r6, String str) {
        String str2;
        AnonymousClass1W2 r0;
        UserJid userJid = r6.A0D;
        if ((userJid == null || (str2 = this.A01.A0E(this.A00.A0A(userJid))) == null) && ((r0 = r6.A0A) == null || TextUtils.isEmpty(r0.A0I()) || (str2 = r6.A0A.A0I()) == null)) {
            str2 = this.A02.A00.getString(R.string.str188e);
        }
        return this.A02.A00.getString(R.string.str10a0, new Object[]{str2, str});
    }
}
