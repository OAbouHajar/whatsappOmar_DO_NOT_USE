package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.1aP  reason: invalid class name and case insensitive filesystem */
public class C29301aP {
    public static byte[] A00(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] A08 = C30311c8.A08(fileInputStream);
            fileInputStream.close();
            return A08;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
