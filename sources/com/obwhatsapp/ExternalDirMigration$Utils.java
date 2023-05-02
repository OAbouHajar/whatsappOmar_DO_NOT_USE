package com.obwhatsapp;

import android.system.ErrnoException;
import android.system.OsConstants;
import com.whatsapp.util.StatResult;
import java.io.File;
import java.io.IOException;

public final class ExternalDirMigration$Utils {
    public static StatResult lstatOpenFile(File file) {
        try {
            return StatResult.lstatOpenFile(file.getPath());
        } catch (ErrnoException e2) {
            if (e2.errno == OsConstants.ENOENT) {
                return null;
            }
            throw new IOException(e2);
        } catch (Exception e3) {
            throw new IOException(e3);
        }
    }
}
