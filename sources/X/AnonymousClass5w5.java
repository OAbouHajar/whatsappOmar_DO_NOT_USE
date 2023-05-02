package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.math.BigInteger;

/* renamed from: X.5w5  reason: invalid class name */
public class AnonymousClass5w5 {
    public final JniBridge A00;

    public AnonymousClass5w5(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }

    public static String A00(BigInteger bigInteger) {
        if (bigInteger != null) {
            try {
                byte[] byteArray = bigInteger.toByteArray();
                int length = byteArray.length;
                if (length >= 4) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    for (int i2 = length - 1; i2 >= length - 4; i2--) {
                        A0o.append(String.format("%02X", new Object[]{Byte.valueOf(byteArray[i2])}));
                    }
                    return A0o.toString();
                }
            } catch (Exception e2) {
                Log.e(AnonymousClass000.A0g("PAY: JweCompactSerializer/getCertID: ", e2));
                return null;
            }
        }
        return null;
    }
}
