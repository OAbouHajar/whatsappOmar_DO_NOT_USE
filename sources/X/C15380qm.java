package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.0qm  reason: invalid class name and case insensitive filesystem */
public class C15380qm {
    public static long A00(File file) {
        int length;
        long j2 = 0;
        if (file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            if (file.isDirectory()) {
                try {
                    File[] listFiles = file.listFiles();
                    if (!(listFiles == null || (length = listFiles.length) == 0)) {
                        int i2 = 0;
                        do {
                            j2 += A00(listFiles[i2]);
                            i2++;
                        } while (i2 < length);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return j2;
    }

    public static C15390qn A01(File file) {
        int length;
        if (file.exists()) {
            File file2 = file;
            try {
                if (file.getParent() != null) {
                    file2 = new File(file.getParentFile().getCanonicalFile(), file.getName());
                }
                if (!file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
                }
            } catch (IOException unused) {
            }
            if (!file.isDirectory()) {
                return A02(file, false);
            }
            C15390qn A02 = A02(file, true);
            if (!file.isDirectory()) {
                return A02;
            }
            try {
                File[] listFiles = file.listFiles();
                if (listFiles == null || (length = listFiles.length) == 0) {
                    return A02;
                }
                long j2 = A02.A00;
                long j3 = A02.A02;
                long j4 = A02.A01;
                int i2 = 0;
                do {
                    C15390qn A01 = A01(listFiles[i2]);
                    j2 += A01.A00;
                    j3 += A01.A02;
                    j4 += A01.A01;
                    i2++;
                } while (i2 < length);
                return new C15390qn(j2, j3, j4);
            } catch (Exception unused2) {
                return A02;
            }
        }
        return new C15390qn(0, 0, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:10|11|12|13|14|(5:16|(1:18)|(1:23)|24|25)) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r0 == 0) goto L_0x005d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ExcHandler: ErrnoException | NoSuchMethodError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C15390qn A02(java.io.File r14, boolean r15) {
        /*
            long r0 = r14.length()
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0014
            r12 = 1
            r10 = 0
            X.0qn r7 = new X.0qn
            r7.<init>(r8, r10, r12)
            return r7
        L_0x0014:
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0027
            r14 = 1
            X.0qn r7 = new X.0qn
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r9 = r7
            r9.<init>(r10, r12, r14)
            return r7
        L_0x0027:
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r6 = -1
            if (r3 < r2) goto L_0x004d
            java.lang.String r2 = r14.getCanonicalPath()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            java.lang.String r2 = r14.getAbsolutePath()     // Catch:{ ErrnoException | NoSuchMethodError -> 0x004d, ErrnoException | NoSuchMethodError -> 0x004d }
        L_0x0038:
            android.system.StructStat r2 = android.system.Os.lstat(r2)     // Catch:{ ErrnoException | NoSuchMethodError -> 0x004d, ErrnoException | NoSuchMethodError -> 0x004d }
            long r2 = r2.st_blocks     // Catch:{ ErrnoException | NoSuchMethodError -> 0x004d, ErrnoException | NoSuchMethodError -> 0x004d }
            r4 = 512(0x200, double:2.53E-321)
            long r2 = r2 * r4
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x004d
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x005d
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x005d
        L_0x004d:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = (float) r0
            float r3 = r3 * r2
            r2 = 1166016512(0x45800000, float:4096.0)
            float r3 = r3 / r2
            double r2 = (double) r3
            double r4 = java.lang.Math.ceil(r2)
            long r2 = (long) r4
            r4 = 4096(0x1000, double:2.0237E-320)
            long r2 = r2 * r4
        L_0x005d:
            if (r15 == 0) goto L_0x0061
            r0 = 0
        L_0x0061:
            r12 = 1
            X.0qn r7 = new X.0qn
            r8 = r0
            r10 = r2
            r7.<init>(r8, r10, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15380qm.A02(java.io.File, boolean):X.0qn");
    }
}
