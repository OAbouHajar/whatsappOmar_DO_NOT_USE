package com.whatsapp.util;

import X.AnonymousClass000;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

public class BaseMediaFileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e2) {
            Log.e(AnonymousClass000.A0l(AnonymousClass000.A0r("MMS Os.rename also failed, errno="), e2.errno), e2);
            return e2.errno;
        }
    }
}
