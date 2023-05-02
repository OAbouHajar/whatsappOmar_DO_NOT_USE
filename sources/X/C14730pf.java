package X;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.whatsapp.util.Log;

/* renamed from: X.0pf  reason: invalid class name and case insensitive filesystem */
public class C14730pf {
    public static boolean A00() {
        try {
            return Environment.isExternalStorageRemovable();
        } catch (Exception e2) {
            Log.w("StorageUtils/checkifremovable/error ", e2);
            return true;
        }
    }

    public long A01() {
        long j2;
        long j3;
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                j2 = statFs.getAvailableBlocksLong();
                j3 = statFs.getBlockSizeLong();
            } else {
                j2 = (long) statFs.getAvailableBlocks();
                j3 = (long) statFs.getBlockSize();
            }
            return j2 * j3;
        } catch (ArithmeticException | IllegalArgumentException e2) {
            Log.w("StorageUtils/avail-external-storage/error/", e2);
            return 0;
        }
    }

    public long A02() {
        long availableBlocks;
        long blockSize;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            availableBlocks = statFs.getAvailableBlocksLong();
            blockSize = statFs.getBlockSizeLong();
        } else {
            availableBlocks = (long) statFs.getAvailableBlocks();
            blockSize = (long) statFs.getBlockSize();
        }
        return availableBlocks * blockSize;
    }

    public long A03() {
        long j2;
        long j3;
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                j2 = statFs.getBlockCountLong();
                j3 = statFs.getBlockSizeLong();
            } else {
                j2 = (long) statFs.getBlockCount();
                j3 = (long) statFs.getBlockSize();
            }
            return j2 * j3;
        } catch (IllegalArgumentException e2) {
            Log.w("StorageUtils/total-external-storage/error/illegal-arg", e2);
            return 0;
        }
    }

    public long A04() {
        long blockCount;
        long blockSize;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            blockCount = statFs.getBlockCountLong();
            blockSize = statFs.getBlockSizeLong();
        } else {
            blockCount = (long) statFs.getBlockCount();
            blockSize = (long) statFs.getBlockSize();
        }
        return blockCount * blockSize;
    }
}
