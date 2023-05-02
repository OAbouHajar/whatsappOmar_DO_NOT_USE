package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: X.0Uk  reason: invalid class name and case insensitive filesystem */
public class C06140Uk {
    public final AnonymousClass0NX A00;

    public C06140Uk(AnonymousClass0NX r1) {
        this.A00 = r1;
    }

    public static String A00(AnonymousClass0KY r3, String str, boolean z2) {
        String str2;
        StringBuilder A0r = AnonymousClass000.A0r("lottie_cache_");
        A0r.append(str.replaceAll("\\W+", ""));
        if (z2) {
            str2 = AnonymousClass000.A0h(r3.extension, AnonymousClass000.A0r(".temp"));
        } else {
            str2 = r3.extension;
        }
        return AnonymousClass000.A0h(str2, A0r);
    }

    public final File A01() {
        File file = new File(this.A00.A00.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File A02(AnonymousClass0KY r6, InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        File file = new File(A01(), A00(r6, str, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
