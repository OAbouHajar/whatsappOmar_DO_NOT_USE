package X;

import java.io.File;

/* renamed from: X.10s  reason: invalid class name and case insensitive filesystem */
public class C205810s {
    public final C16980tz A00;

    public C205810s(C16980tz r1) {
        this.A00 = r1;
    }

    public static File[] A00(C16980tz r2) {
        File[] fileArr;
        File file = new File(r2.A00.getCacheDir(), "traces");
        if (!file.exists() || (fileArr = file.listFiles(new C32621gr())) == null) {
            fileArr = new File[0];
        }
        return fileArr.length <= 0 ? new File[0] : fileArr;
    }
}
