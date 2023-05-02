package X;

import android.os.Build;
import android.util.Log;
import com.facebook.soloader.SysUtil$LollipopSysdeps;
import com.facebook.soloader.SysUtil$MarshmallowSysdeps;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.1dy  reason: invalid class name and case insensitive filesystem */
public final class C31331dy {
    public static void A00(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A00 : listFiles) {
                    A00(A00);
                }
            } else {
                return;
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            StringBuilder sb = new StringBuilder("Enable write permission failed: ");
            sb.append(parentFile);
            Log.e("SysUtil", sb.toString());
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sb2 = new StringBuilder("Could not delete file ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
    }

    public static void A01(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A01 : listFiles) {
                    A01(A01);
                }
                return;
            }
            StringBuilder sb = new StringBuilder("cannot list directory ");
            sb.append(file);
            throw new IOException(sb.toString());
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    public static String[] A02() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return SysUtil$MarshmallowSysdeps.getSupportedAbis();
        }
        if (i2 >= 21) {
            return SysUtil$LollipopSysdeps.getSupportedAbis();
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }
}
