package X;

import java.io.File;

/* renamed from: X.1Oc  reason: invalid class name and case insensitive filesystem */
public class C26521Oc implements C23541Cj {
    public final C25981Lw A00;

    public C26521Oc(C25981Lw r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void APJ() {
    }

    public void APK() {
        File[] listFiles;
        C25981Lw r9 = this.A00;
        File A002 = r9.A00();
        if (A002 != null && (listFiles = A002.listFiles()) != null) {
            for (File file : listFiles) {
                if (file.lastModified() + 604800000 <= System.currentTimeMillis()) {
                    AnonymousClass1XI.A0N(file);
                    r9.A06.A00(file);
                    file.getName();
                }
            }
        }
    }
}
