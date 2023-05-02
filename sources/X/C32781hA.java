package X;

import android.content.Context;
import com.facebook.redex.IDxFFilterShape28S0000000_2_I0;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.1hA  reason: invalid class name and case insensitive filesystem */
public class C32781hA {
    public static final FilenameFilter A07 = new IDxFFilterShape28S0000000_2_I0(0);
    public static final FilenameFilter A08 = new IDxFFilterShape28S0000000_2_I0(1);
    public int A00 = 0;
    public long A01 = 0;
    public C85304Nx A02 = new C85304Nx();
    public File A03;
    public File A04;
    public File A05;
    public final File A06;

    public C32781hA(Context context, File file) {
        if (file.exists() || file.mkdirs()) {
            this.A06 = file;
        } else {
            File file2 = new File(context.getFilesDir(), "profilo");
            this.A06 = file2;
            File file3 = new File(context.getCacheDir(), "profilo");
            if (file3.exists()) {
                file3.renameTo(file2);
            }
            if (!file2.exists() && !file2.mkdirs()) {
                throw new IllegalStateException("Unable to initialize Profilo folder");
            }
        }
        this.A05 = new File(this.A06, "upload");
        this.A03 = new File(this.A06, "crash_dumps");
        this.A04 = new File(this.A06, "mmap_buffer");
    }
}
