package X;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0WB  reason: invalid class name */
public class AnonymousClass0WB {
    public static AnonymousClass0WB A07;
    public static final long A08 = TimeUnit.MINUTES.toMillis(2);
    public long A00;
    public final Lock A01 = new ReentrantLock();
    public volatile StatFs A02 = null;
    public volatile StatFs A03 = null;
    public volatile File A04;
    public volatile File A05;
    public volatile boolean A06 = false;

    public static final StatFs A00(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            if (statFs == null) {
                try {
                    return new StatFs(file.getAbsolutePath());
                } catch (IllegalArgumentException unused) {
                } catch (Throwable th) {
                    C04320Mb.A00(th);
                    throw AnonymousClass000.A0Z();
                }
            } else {
                statFs.restat(file.getAbsolutePath());
                return statFs;
            }
        }
        return null;
    }

    public long A01(AnonymousClass0JE r7) {
        long blockSize;
        long availableBlocks;
        if (!this.A06) {
            Lock lock = this.A01;
            lock.lock();
            try {
                if (!this.A06) {
                    this.A05 = Environment.getDataDirectory();
                    this.A04 = Environment.getExternalStorageDirectory();
                    this.A03 = A00(this.A03, this.A05);
                    this.A02 = A00(this.A02, this.A04);
                    this.A00 = SystemClock.uptimeMillis();
                    this.A06 = true;
                }
            } finally {
                lock.unlock();
            }
        }
        Lock lock2 = this.A01;
        if (lock2.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.A00 > A08) {
                    this.A03 = A00(this.A03, this.A05);
                    this.A02 = A00(this.A02, this.A04);
                    this.A00 = SystemClock.uptimeMillis();
                }
            } finally {
                lock2.unlock();
            }
        }
        StatFs statFs = r7 == AnonymousClass0JE.A00 ? this.A03 : this.A02;
        if (statFs == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = (long) statFs.getBlockSize();
            availableBlocks = (long) statFs.getAvailableBlocks();
        }
        return blockSize * availableBlocks;
    }
}
