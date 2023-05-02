package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.4az  reason: invalid class name and case insensitive filesystem */
public class C88724az {
    public final AnonymousClass4RG A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C88724az(AnonymousClass4RG r1, String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = r1;
    }

    public static String A00(UserJid userJid) {
        String str = userJid.user;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes(AnonymousClass4BH.A05));
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e2) {
            throw new IOException(e2);
        }
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("EncMetadata{scheme='");
        char A002 = AnonymousClass3K3.A00(this.A02, A0r);
        A0r.append(", dataId='");
        A0r.append(this.A01);
        A0r.append(A002);
        A0r.append(", sourceId='");
        A0r.append(this.A03);
        A0r.append(A002);
        A0r.append(", keyInfo=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}
