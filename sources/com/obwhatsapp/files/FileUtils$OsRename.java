package com.obwhatsapp.files;

import X.AnonymousClass000;
import android.system.ErrnoException;
import android.system.Os;
import com.whatsapp.util.Log;
import java.io.File;

public class FileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e2) {
            StringBuilder A0r = AnonymousClass000.A0r("MMS Os.rename also failed, from=");
            A0r.append(file.getAbsolutePath());
            A0r.append(" to=");
            A0r.append(file2.getAbsolutePath());
            A0r.append(" errno=");
            Log.e(AnonymousClass000.A0l(A0r, e2.errno), e2);
            return e2.errno;
        }
    }
}
