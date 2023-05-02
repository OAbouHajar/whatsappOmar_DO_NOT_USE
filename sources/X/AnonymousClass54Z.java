package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.54Z  reason: invalid class name */
public final /* synthetic */ class AnonymousClass54Z implements FileFilter {
    public final boolean accept(File file) {
        String name = file.getName();
        if (!name.startsWith("cpu")) {
            return false;
        }
        for (int i2 = 3; i2 < name.length(); i2++) {
            if (name.charAt(i2) < '0' || name.charAt(i2) > '9') {
                return false;
            }
        }
        return true;
    }
}
