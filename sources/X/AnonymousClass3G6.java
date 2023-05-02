package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.3G6  reason: invalid class name */
public class AnonymousClass3G6 implements C109445Sd {
    public final C109445Sd A00;
    public final AnonymousClass1XK A01;
    public final String A02;
    public final String A03;
    public final MessageDigest A04;
    public final MessageDigest A05;

    public AnonymousClass3G6(C109445Sd r3, AnonymousClass1XK r4, String str, String str2) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2;
        this.A00 = r3;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r4;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e2) {
            Log.e("encryptedstreamdownload/digest error", e2);
            messageDigest = null;
        }
        this.A05 = messageDigest;
        try {
            messageDigest2 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e3) {
            Log.e("encryptedstreamdownload/digest error", e3);
            messageDigest2 = null;
        }
        this.A04 = messageDigest2;
    }

    public long AE2() {
        return 0;
    }

    public OutputStream Aa6(C37801pl r7) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2 = this.A05;
        if (messageDigest2 == null || (messageDigest = this.A04) == null) {
            throw new C803143j(1);
        }
        return new DigestOutputStream(new C611737w(new C101754xp(this.A01).A7u(Base64.decode(this.A02, 0)), new DigestOutputStream(this.A00.Aa6(r7), messageDigest), r7.getContentLength()), messageDigest2);
    }

    public void AhW() {
    }
}
