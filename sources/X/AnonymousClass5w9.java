package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.5w9  reason: invalid class name */
public final class AnonymousClass5w9 {
    public static final ArrayList A01;
    public final C28371Vv A00;

    static {
        String[] strArr = new String[2];
        strArr[0] = "false";
        A01 = AnonymousClass3K2.A0q("true", strArr, 1);
    }

    public AnonymousClass5w9(UserJid userJid, AnonymousClass2BJ r6, String str) {
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ.A00(A0X, "xmlns", "w:pay");
        C32461gQ A0Z = C110105dW.A0Z(A0X);
        C32461gQ.A00(A0Z, "action", "upi-get-vpa");
        if (C32271fx.A0C(userJid, "account->user")) {
            A0Z.A02(new C35081lL((Jid) userJid, "user"));
        }
        A0Z.A09(str, "is_first_send", A01);
        this.A00 = C110105dW.A0S(A0Z, A0X, r6);
    }
}
