package X;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

/* renamed from: X.54a  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1041254a implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.toLowerCase(Locale.US).endsWith(".dmp");
    }
}
