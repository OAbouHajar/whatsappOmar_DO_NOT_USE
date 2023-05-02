package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.3G5  reason: invalid class name */
public class AnonymousClass3G5 implements C109435Sc {
    public final C63423Ic A00;
    public final AnonymousClass3G6 A01;

    public AnonymousClass3G5(C17130ua r9, C14710pd r10, C20330zs r11, C30741cs r12, C38321qb r13, C109445Sd r14, AnonymousClass1XK r15, C38101qF r16, C19040xf r17, String str, String str2) {
        AnonymousClass3G6 r0 = new AnonymousClass3G6(r14, r15, str, str2);
        this.A01 = r0;
        this.A00 = new C63423Ic(r9, r10, r11, r12, new AnonymousClass4ID(r0, r16), r13, r17);
    }

    public void A63() {
        this.A00.A63();
    }

    public AnonymousClass258 A8D() {
        String A0h;
        AnonymousClass258 A8D = this.A00.A8D();
        C31701et r4 = A8D.A00;
        if (r4.A01 == 0) {
            AnonymousClass3G6 r0 = this.A01;
            String str = r0.A03;
            MessageDigest messageDigest = r0.A04;
            if (messageDigest == null) {
                A0h = C13680ns.A0h("MMS download failed in verifyFileSha256 with Exception; plainFileHash=", str);
            } else if (!Arrays.equals(messageDigest.digest(), Base64.decode(str, 0))) {
                StringBuilder A0r = AnonymousClass000.A0r("MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=");
                A0r.append(str);
                A0r.append("; calculatedHash=");
                A0h = AnonymousClass000.A0h(Base64.encodeToString(messageDigest.digest(), 2), A0r);
            }
            Log.w(A0h);
            Log.e("encrypteddownloadtransfer/download/hash verification fail");
            return new AnonymousClass258(new C31701et(7, r4.A03, r4.A04));
        }
        return A8D;
    }

    public void cancel() {
        this.A00.cancel();
    }
}
