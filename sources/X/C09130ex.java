package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0ex  reason: invalid class name and case insensitive filesystem */
public class C09130ex implements FileFilter {
    public final /* synthetic */ AnonymousClass00J A00;

    public C09130ex(AnonymousClass00J r1) {
        this.A00 = r1;
    }

    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
