package X;

import android.content.Context;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1GY  reason: invalid class name */
public class AnonymousClass1GY {
    public final C17130ua A00;
    public final C16980tz A01;
    public final C16510tB A02;

    public AnonymousClass1GY(C17130ua r1, C16980tz r2, C16510tB r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public C83894Il A00() {
        File A022 = A02(false);
        if (!A022.exists() || !new File(A022, "thumbnails").exists()) {
            return null;
        }
        return new C83894Il(A03("dark"), A03("light"));
    }

    public File A01(String str) {
        File A022 = A02(false);
        if (A022.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".jpg");
            File file = new File(A022, sb.toString());
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    public File A02(boolean z2) {
        File cacheDir;
        String str;
        Context context = this.A01.A00;
        if (!z2) {
            cacheDir = context.getFilesDir();
            str = "downloadable/wallpaper";
        } else {
            cacheDir = context.getCacheDir();
            str = "downloadable/wallpaper_tmp";
        }
        return new File(cacheDir, str);
    }

    public final List A03(String str) {
        File[] listFiles;
        File A022 = A02(false);
        if (A022.exists()) {
            File file = new File(A022, "thumbnails");
            if (file.exists()) {
                File file2 = new File(file, str);
                if (file2.exists() && (listFiles = file2.listFiles()) != null) {
                    Arrays.sort(listFiles, new IDxComparatorShape19S0000000_2_I0(38));
                    return Arrays.asList(listFiles);
                }
            }
        }
        return new ArrayList();
    }
}
