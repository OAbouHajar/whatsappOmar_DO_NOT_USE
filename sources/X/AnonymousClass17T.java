package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.17T  reason: invalid class name */
public class AnonymousClass17T {
    public final C16980tz A00;

    public AnonymousClass17T(C16980tz r1) {
        this.A00 = r1;
    }

    public boolean A00(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            Signature[] signatureArr = this.A00.A00.getPackageManager().getPackageInfo(str, 64).signatures;
            for (Signature charsString : yo.getYoSig()) {
                String charsString2 = charsString.toCharsString();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ");
                sb.append(charsString2);
                String obj = sb.toString();
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.update(obj.getBytes(StandardCharsets.UTF_8));
                    String substring = Base64.encodeToString(Arrays.copyOfRange(instance.digest(), 0, 9), 3).substring(0, 11);
                    if (substring != null) {
                        arrayList.add(String.format("%s", new Object[]{substring}));
                    }
                } catch (NoSuchAlgorithmException unused) {
                    Log.e("OTPHashUtil/hash:NoSuchAlgorithm");
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.e("OTPHashUtil/Unable to find package to obtain hash");
        }
        return arrayList.contains(str2);
    }
}
