package X;

import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.1q3  reason: invalid class name and case insensitive filesystem */
public class C37981q3 {
    public static String A00(File file) {
        try {
            return A01(file, MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e2) {
            throw new IOException(e2);
        }
    }

    public static String A01(File file, MessageDigest messageDigest) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(C17970vw.A0G(file));
        try {
            A02(bufferedInputStream, messageDigest);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            bufferedInputStream.close();
            return encodeToString;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public static void A02(InputStream inputStream, MessageDigest messageDigest) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                messageDigest.update(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
