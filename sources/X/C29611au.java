package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.1au  reason: invalid class name and case insensitive filesystem */
public class C29611au implements FilenameFilter {
    public final /* synthetic */ C29591as A00;

    public C29611au(C29591as r1) {
        this.A00 = r1;
    }

    public boolean accept(File file, String str) {
        return C29591as.A01.matcher(str).matches();
    }
}
