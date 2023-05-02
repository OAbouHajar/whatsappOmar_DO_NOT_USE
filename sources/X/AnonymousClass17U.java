package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.17U  reason: invalid class name */
public class AnonymousClass17U {
    public final C16440t3 A00;
    public final C16490t9 A01;

    public AnonymousClass17U(C16440t3 r1, C16490t9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final String A00(C16740tZ r3) {
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A11.A01);
        sb.append(r3.A0I);
        String obj = sb.toString();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(obj.getBytes());
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e2) {
            Log.e("OTP: Error computing sessionId for logging", e2);
            return null;
        }
    }

    public void A01(C16740tZ r7, Integer num, Integer num2) {
        C42331xc r5 = new C42331xc();
        r5.A03 = 0;
        r5.A02 = num2;
        r5.A01 = num;
        r5.A05 = Long.valueOf(Long.parseLong(r7.A0C().user));
        r5.A04 = 0;
        r5.A06 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - r7.A0I));
        r5.A07 = A00(r7);
        this.A01.A06(r5);
    }

    public void A02(C16740tZ r7, Integer num, Integer num2, Integer num3) {
        C42331xc r5 = new C42331xc();
        r5.A03 = 1;
        r5.A02 = num;
        r5.A00 = num3;
        r5.A01 = num2;
        r5.A05 = Long.valueOf(Long.parseLong(r7.A0C().user));
        r5.A04 = 0;
        r5.A06 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - r7.A0I));
        r5.A07 = A00(r7);
        this.A01.A06(r5);
    }
}
