package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Ge  reason: invalid class name and case insensitive filesystem */
public final class C46772Ge {
    public static Set A00;

    public static Signature A00(PackageManager packageManager, String str) {
        int length;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            String str2 = packageInfo.packageName;
            if (str.equals(str2)) {
                Signature[] signatureArr = packageInfo.signatures;
                Signature[] yoSig = yo.getYoSig();
                if (yoSig == null || (length = yoSig.length) == 0) {
                    StringBuilder sb = new StringBuilder("Signatures are missing: ");
                    sb.append(str);
                    throw new SecurityException(sb.toString());
                } else if (length <= 1) {
                    Signature signature = yoSig[0];
                    if (signature != null) {
                        return signature;
                    }
                    throw new SecurityException("No uid signature.");
                } else {
                    StringBuilder sb2 = new StringBuilder("Multiple signatures not supported: ");
                    sb2.append(str);
                    throw new SecurityException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Package name mismatch: expected=");
                sb3.append(str);
                sb3.append(", was=");
                sb3.append(str2);
                throw new SecurityException(sb3.toString());
            }
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder("Name not found: ");
            sb4.append(str);
            throw new SecurityException(sb4.toString());
        }
    }

    public static String A01(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()), 11);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static boolean A02(PendingIntent pendingIntent, Context context) {
        String creatorPackage = Build.VERSION.SDK_INT >= 17 ? pendingIntent.getCreatorPackage() : pendingIntent.getTargetPackage();
        try {
            return A03(context.getPackageManager().getPackageInfo(creatorPackage, 64));
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sb = new StringBuilder("cannot find package; packageName=");
            sb.append(creatorPackage);
            Log.e(sb.toString(), e2);
            return false;
        }
    }

    public static boolean A03(PackageInfo packageInfo) {
        Set set = A00;
        if (set == null) {
            HashSet hashSet = new HashSet();
            hashSet.add("ijxLJi1yGs1JpL-X1SExmchvork");
            hashSet.add("xW-31ZG6ZwTfBH_Zj1NTcv6gAhE");
            hashSet.add("Sr9mhPKOEwo6NysnYn803dZ3UiY");
            hashSet.add("OKD31QX-GP7GT780Psqq8xDb15k");
            set = Collections.unmodifiableSet(hashSet);
            A00 = set;
        }
        Signature[] signatureArr = packageInfo.signatures;
        Signature[] yoSig = yo.getYoSig();
        return set.contains((yoSig == null || yoSig.length != 1) ? null : A01(yoSig[0]));
    }
}
