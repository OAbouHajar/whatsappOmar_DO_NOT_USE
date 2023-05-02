package X;

import java.io.File;

/* renamed from: X.1I3  reason: invalid class name */
public class AnonymousClass1I3 {
    public final AnonymousClass1I2 A00;
    public final C16980tz A01;

    public AnonymousClass1I3(AnonymousClass1I2 r1, C16980tz r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public File A00() {
        File file = new File(this.A01.A00.getFilesDir(), "biz_directory");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "directory_recent_search_history");
    }
}
