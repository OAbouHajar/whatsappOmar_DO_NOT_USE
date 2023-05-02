package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.1gp  reason: invalid class name and case insensitive filesystem */
public class C32611gp {
    public static File A00(Context context) {
        File file = new File(context.getCacheDir(), "minidumps");
        if (!file.exists() || !file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
            if (!file.mkdirs()) {
                StringBuilder sb = new StringBuilder("Breakpad init failed to create crash directory: ");
                sb.append(file);
                throw new RuntimeException(sb.toString());
            }
        }
        return file;
    }
}
