package X;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.UserJid;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.1Gj  reason: invalid class name and case insensitive filesystem */
public final class C24551Gj {
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public final C16040sK A00;
    public final C223417o A01;
    public final C16320sq A02;

    public C24551Gj(C16040sK r1, C223417o r2, C16320sq r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static byte[] A00(UserJid userJid, UserJid userJid2, C16740tZ r5) {
        String str = r5.A11.A01;
        byte[] bArr = r5.A1F;
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(userJid.getRawString());
        sb.append(userJid2.getRawString());
        sb.append("Rcat");
        return C40771uf.A00(sb.toString().getBytes(A03), bArr, 32);
    }

    public final AnonymousClass4Vk A01(C16740tZ r4) {
        UserJid userJid;
        UserJid userJid2;
        byte[] A002;
        C28381Vw r2 = r4.A11;
        if (r2.A02) {
            C16040sK r0 = this.A00;
            r0.A0B();
            userJid = r0.A05;
            C15830rv r22 = r2.A00;
            userJid2 = r22 instanceof UserJid ? (UserJid) r22 : null;
        } else {
            C15830rv r1 = r2.A00;
            userJid = r1 instanceof UserJid ? (UserJid) r1 : null;
            C16040sK r02 = this.A00;
            r02.A0B();
            userJid2 = r02.A05;
        }
        String encodeToString = (userJid == null || userJid2 == null || (A002 = A00(userJid, userJid2, r4)) == null) ? null : Base64.encodeToString(A002, 2);
        String str = r4 instanceof C30581cc ? ((C30581cc) r4).A03 : null;
        if (encodeToString == null || str == null) {
            return null;
        }
        return new AnonymousClass4Vk(encodeToString, str);
    }

    public byte[] A02(UserJid userJid, C30581cc r6) {
        String A0I = r6.A0I();
        C16040sK r0 = this.A00;
        r0.A0B();
        AnonymousClass1ZT r3 = r0.A05;
        if (!TextUtils.isEmpty(A0I) && C30921dB.A04(r6) && r3 != null) {
            byte[] bytes = A0I.getBytes(A03);
            byte[] A002 = A00(r3, userJid, r6);
            if (A002 != null) {
                try {
                    return Arrays.copyOf(C40481uC.A00(bytes, A002), 8);
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to calculate hmac-sha256", e2);
                }
            }
        }
        return null;
    }
}
