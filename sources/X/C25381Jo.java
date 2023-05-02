package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1Jo  reason: invalid class name and case insensitive filesystem */
public final class C25381Jo {
    public final C17150uc A00;

    public C25381Jo(C17150uc r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public final String A00(String str, String str2, String str3) {
        C18450wi.A0H(str, 0);
        AnonymousClass16K r2 = this.A00.A08;
        byte[] decode = Base64.decode(str2, 2);
        byte[] decode2 = Base64.decode(str, 2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(decode, 0, decode.length, "AES");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(str3, 2));
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return new String(instance.doFinal(decode2));
        } catch (GeneralSecurityException e2) {
            Log.w(C18450wi.A06("ExtensionsConnectionManagerdecryptGalaxyFlowData/issue while decrypting data/", e2.getMessage()));
            r2.A00.AcB("extensions-decryption-failed-exception", e2.getMessage(), true);
            return null;
        }
    }

    public final void A01(C439622f r11, UserJid userJid, String str, String str2, String str3, boolean z2) {
        UserJid userJid2 = userJid;
        C18450wi.A0H(userJid, 0);
        C17150uc r1 = this.A00;
        C439622f r3 = r11;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        boolean z3 = z2;
        if (r1.A0A(userJid)) {
            r1.A08.A01(r11, userJid, str, str2, str3, z3);
        } else {
            r1.A03(new C100254vL(r3, userJid2, this, str4, str5, str6, z3), userJid);
        }
    }
}
