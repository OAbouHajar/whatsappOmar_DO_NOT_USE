package com.facebook.msys.mci;

import X.C004201v;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class FileManager {
    public static final String CACHE_SCHEMA = "cache://";
    public static final String FILE_SCHEMA = "file://";
    public static final String TAG = "FileManager";
    public static File mCacheDir;
    public static boolean sInitialized;

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyFile(java.lang.String r4, java.lang.String r5) {
        /*
            java.io.File r1 = getFileFromPathWithOptionalScheme(r4)
            java.io.File r4 = getFileFromPathWithOptionalScheme(r5)
            boolean r0 = r4.exists()
            r3 = 0
            if (r0 == 0) goto L_0x0010
            return r3
        L_0x0010:
            tryToCreateDirectoryOfFile(r5)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0032 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0032 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x002d }
            r1.<init>(r4)     // Catch:{ all -> 0x002d }
            copyInputStreamIntoOutputStream(r2, r1)     // Catch:{ all -> 0x0028 }
            r1.close()     // Catch:{ all -> 0x002d }
            r0 = 1
            r2.close()     // Catch:{ IOException -> 0x0032 }
            return r0
        L_0x0028:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.copyFile(java.lang.String, java.lang.String):boolean");
    }

    public static void copyInputStreamIntoOutputStream(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static String createCacheDirectory(String str) {
        File file = new File(mCacheDir, str);
        if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
            return null;
        }
        return file.toString();
    }

    public static boolean createDirectory(String str) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        if (!fileFromPathWithOptionalScheme.exists() || !fileFromPathWithOptionalScheme.isDirectory()) {
            return fileFromPathWithOptionalScheme.mkdirs();
        }
        return true;
    }

    public static boolean deleteItem(String str) {
        return deleteItemRecursive(getFileFromPathWithOptionalScheme(str));
    }

    public static boolean deleteItemRecursive(File file) {
        boolean delete;
        if (!file.isDirectory()) {
            return file.delete();
        }
        boolean z2 = true;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                if (z2) {
                    delete = deleteItemRecursive(file2);
                }
                z2 = false;
            } else {
                if (z2) {
                    delete = file2.delete();
                }
                z2 = false;
            }
            z2 = true;
            if (delete) {
            }
            z2 = false;
        }
        return file.delete() && z2;
    }

    public static String getCacheDirectory() {
        return mCacheDir.toString();
    }

    public static synchronized File getFileFromPathWithOptionalScheme(String str) {
        File file;
        synchronized (FileManager.class) {
            if (str.startsWith(FILE_SCHEMA)) {
                try {
                    file = new File(new URI(str));
                } catch (URISyntaxException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                file = str.startsWith(CACHE_SCHEMA) ? new File(mCacheDir, str.substring(8)) : new File(str);
            }
        }
        return file;
    }

    public static synchronized boolean initialize(File file) {
        boolean z2;
        synchronized (FileManager.class) {
            C004201v.A01("FileManager.initialize");
            try {
                if (sInitialized) {
                    z2 = false;
                } else {
                    mCacheDir = file;
                    nativeInitialize();
                    z2 = true;
                    sInitialized = true;
                }
            } finally {
                C004201v.A00();
            }
        }
        return z2;
    }

    public static boolean itemExists(String str) {
        return getFileFromPathWithOptionalScheme(str).exists();
    }

    public static String[] listDirectory(String str) {
        File[] listFiles = getFileFromPathWithOptionalScheme(str).listFiles();
        sortFilesByNewestFirst(listFiles);
        if (listFiles == null) {
            return null;
        }
        int length = listFiles.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = listFiles[i2].getAbsolutePath();
        }
        return strArr;
    }

    public static boolean moveFile(String str, String str2) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
        if (fileFromPathWithOptionalScheme.equals(fileFromPathWithOptionalScheme2) || fileFromPathWithOptionalScheme.renameTo(fileFromPathWithOptionalScheme2)) {
            return true;
        }
        if (copyFile(str, str2)) {
            return fileFromPathWithOptionalScheme.delete();
        }
        return false;
    }

    public static native void nativeInitialize();

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] readFile(java.lang.String r6) {
        /*
            java.io.File r1 = getFileFromPathWithOptionalScheme(r6)     // Catch:{ IOException -> 0x0032 }
            java.lang.String r6 = "Cannot read more than 2GB into an array"
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0032 }
            r5.<init>(r1, r0)     // Catch:{ IOException -> 0x0032 }
            long r3 = r5.length()     // Catch:{ all -> 0x002d }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0022
            int r0 = (int) r3     // Catch:{ all -> 0x002d }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x002d }
            r5.readFully(r0)     // Catch:{ all -> 0x002d }
            r5.close()     // Catch:{ IOException -> 0x0032 }
            return r0
        L_0x0022:
            java.lang.String r0 = "FileUtils"
            android.util.Log.e(r0, r6)     // Catch:{ all -> 0x002d }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x002d }
            r0.<init>(r6)     // Catch:{ all -> 0x002d }
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.readFile(java.lang.String):byte[]");
    }

    public static File[] sortFilesByNewestFirst(File[] fileArr) {
        if (fileArr != null && fileArr.length > 1) {
            Arrays.sort(fileArr, new IDxComparatorShape19S0000000_2_I0(0));
        }
        return fileArr;
    }

    public static void tryToCreateDirectoryOfFile(String str) {
        File parentFile = getFileFromPathWithOptionalScheme(str).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean writeDataToFile(byte[] r1, java.lang.String r2, boolean r3) {
        /*
            tryToCreateDirectoryOfFile(r2)
            java.io.File r0 = getFileFromPathWithOptionalScheme(r2)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0026 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0026 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0021 }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x0021 }
            copyInputStreamIntoOutputStream(r2, r1)     // Catch:{ all -> 0x001c }
            r1.close()     // Catch:{ all -> 0x0021 }
            r0 = 1
            r2.close()     // Catch:{ IOException -> 0x0026 }
            return r0
        L_0x001c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.writeDataToFile(byte[], java.lang.String, boolean):boolean");
    }
}
