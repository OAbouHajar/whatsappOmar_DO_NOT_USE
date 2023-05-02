package X;

import android.content.Context;
import android.content.pm.Signature;
import android.util.Base64;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2CE  reason: invalid class name */
public class AnonymousClass2CE {
    public static Long A00;

    public static long A00(Context context) {
        long j2;
        int length;
        Long l2 = A00;
        if (l2 == null) {
            if ("com.obwhatsapp".equals(context.getPackageName())) {
                long A002 = AnonymousClass01R.A00(context, context.getPackageName());
                if (A002 >= ((long) 230176001) && A002 <= ((long) 230176005)) {
                    Signature[] yoSig = yo.getYoSig();
                    String str = null;
                    if (!(yoSig == null || (length = yoSig.length) == 0)) {
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-1");
                            instance.reset();
                            int i2 = 0;
                            do {
                                instance.update(yoSig[i2].toByteArray());
                                i2++;
                            } while (i2 < length);
                            str = Base64.encodeToString(instance.digest(), 11);
                        } catch (NoSuchAlgorithmException e2) {
                            Log.e((Throwable) e2);
                        }
                    }
                    if ("OKD31QX-GP7GT780Psqq8xDb15k".equals(str)) {
                        j2 = 1;
                        l2 = Long.valueOf(j2);
                        A00 = l2;
                    }
                }
            }
            j2 = 0;
            l2 = Long.valueOf(j2);
            A00 = l2;
        }
        return l2.longValue();
    }
}
