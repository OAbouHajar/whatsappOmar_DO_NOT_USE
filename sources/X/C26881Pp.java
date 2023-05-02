package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1Pp  reason: invalid class name and case insensitive filesystem */
public class C26881Pp {
    public final Context A00;

    public C26881Pp(Context context) {
        this.A00 = context;
    }

    public File A00(String str) {
        if (!TextUtils.isEmpty(str)) {
            File A01 = A01(str);
            if (A01.exists()) {
                A01.delete();
            }
            if (A01.getParentFile() != null) {
                A01.getParentFile().mkdirs();
            }
            return A01;
        }
        throw new IllegalArgumentException("Filename is not specified.");
    }

    public File A01(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(this.A00.getFilesDir(), "migration/import/sandbox");
            File file2 = new File(file, str);
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                return file2;
            }
            StringBuilder sb = new StringBuilder("Invalid file name: ");
            sb.append(str);
            sb.append(", sandbox escaping attempt.");
            throw new IOException(sb.toString());
        }
        throw new IllegalArgumentException("Filename is not specified.");
    }
}
