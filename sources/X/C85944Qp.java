package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Qp  reason: invalid class name and case insensitive filesystem */
public class C85944Qp {
    public final C16440t3 A00;
    public final C18200wJ A01;

    public C85944Qp(C16440t3 r1, C18200wJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public AnonymousClass21U A00(UserJid userJid, String str, String str2, String str3) {
        UserJid userJid2 = userJid;
        String str4 = str;
        String str5 = str2;
        if (userJid != null && str != null && str2 != null) {
            return new AnonymousClass21V(userJid2, str5, str4, "", -1, System.currentTimeMillis());
        }
        if (!TextUtils.isEmpty(str3) && str3.contains("ctwa")) {
            if (userJid == null) {
                this.A01.A00(2);
            }
            if (str == null) {
                this.A01.A01(userJid, 4);
            }
            if (str2 == null) {
                this.A01.A01(userJid, 5);
            }
        }
        return new C47352Ip();
    }
}
