package X;

import android.content.Context;
import com.facebook.redex.IDxFFilterShape28S0000000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Nq  reason: invalid class name and case insensitive filesystem */
public class C26421Nq implements C23541Cj {
    public final C16980tz A00;

    public C26421Nq(C16980tz r1) {
        this.A00 = r1;
    }

    public void APJ() {
        Context context = this.A00.A00;
        File filesDir = context.getFilesDir();
        String[] list = filesDir.list(new IDxFFilterShape28S0000000_2_I0(3));
        if (list != null) {
            for (String str : list) {
                String[] split = str.substring(0, str.lastIndexOf(".pack")).split("_");
                int length = split.length;
                if (length > 1) {
                    try {
                        if (Long.parseLong(split[length - 1]) != new File(context.getPackageCodePath()).lastModified() / 1000) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("translations/cleanupOldPackFiles Clearing old pack file: ");
                            sb.append(str);
                            Log.i(sb.toString());
                            if (!new File(filesDir, str).delete()) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("translations/cleanupOldPackFiles Could not delete old pack file: ");
                                sb2.append(str);
                                Log.e(sb2.toString());
                            }
                        }
                    } catch (NumberFormatException unused) {
                        StringBuilder sb3 = new StringBuilder("translations/cleanupOldPackFiles Pack file name did not contain version info: ");
                        sb3.append(str);
                        Log.w(sb3.toString());
                    }
                }
            }
        }
    }

    public /* synthetic */ void APK() {
    }
}
