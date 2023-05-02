package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.commons.io.FileUtils;

/* renamed from: X.1XI  reason: invalid class name */
public final class AnonymousClass1XI {
    public static long A00(AnonymousClass024 r8, File file) {
        if (r8 != null) {
            r8.A02();
        }
        if (!file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        long j2 = 0;
        while (linkedList.peek() != null) {
            if (r8 != null) {
                r8.A02();
            }
            Object poll = linkedList.poll();
            AnonymousClass00B.A06(poll);
            File[] listFiles = ((File) poll).listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (r8 != null) {
                        r8.A02();
                    }
                    if (file2.exists()) {
                        if (file2.isDirectory()) {
                            linkedList.add(file2);
                        } else {
                            j2 += file2.length();
                        }
                    }
                }
            }
        }
        return j2;
    }

    public static Uri A01(Context context, File file) {
        return Build.VERSION.SDK_INT < 23 ? Uri.fromFile(file) : FileProvider.A00(context, file, AnonymousClass01S.A05);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0098 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0127 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x012c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0151 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0156 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A02(X.AnonymousClass12X r14, java.io.File r15, int r16, int r17) {
        /*
            r2 = 0
            java.lang.String r0 = "file-utils/truncate-from-end compressedFile:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r15)
            java.lang.String r0 = " compressedInputFileSizeLimit:"
            r1.append(r0)
            r3 = r16
            r1.append(r3)
            java.lang.String r0 = " bufferSize:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " uncompressedTruncatedFileSize:"
            r1.append(r0)
            r11 = r17
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 0
            if (r15 != 0) goto L_0x003e
            java.lang.String r0 = "file-utils/truncate-from-end/no-compressed-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r4)
        L_0x003d:
            return r1
        L_0x003e:
            long r5 = r15.length()
            long r1 = (long) r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
            java.lang.String r0 = "file-utils/truncate-from-end/too-small-no-truncation-required"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r15)
            return r1
        L_0x0054:
            r15.length()
            r13 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r0 = "uncompressed-crashlog"
            java.io.File r3 = java.io.File.createTempFile(r0, r4)     // Catch:{ IOException -> 0x0167, all -> 0x0191 }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ SyncFailedException -> 0x0157 }
            r5.<init>(r3, r0)     // Catch:{ SyncFailedException -> 0x0157 }
            byte[] r12 = new byte[r13]     // Catch:{ all -> 0x0152 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0152 }
            r2.<init>(r15)     // Catch:{ all -> 0x0152 }
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x014d }
            r6.<init>(r2, r13)     // Catch:{ all -> 0x014d }
            r3.getAbsolutePath()     // Catch:{ all -> 0x0094 }
        L_0x0077:
            r1 = 0
            r10 = 0
        L_0x0079:
            if (r10 >= r11) goto L_0x008c
            int r0 = r17 - r10
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x0094 }
            int r0 = r6.read(r12, r1, r0)     // Catch:{ all -> 0x0094 }
            if (r0 <= 0) goto L_0x008c
            r5.write(r12, r1, r0)     // Catch:{ all -> 0x0094 }
            int r10 = r10 + r0
            goto L_0x0079
        L_0x008c:
            r0 = 0
            r5.seek(r0)     // Catch:{ all -> 0x0094 }
            if (r10 == r11) goto L_0x0077
            goto L_0x0099
        L_0x0094:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0098 }
        L_0x0098:
            throw r0     // Catch:{ all -> 0x014d }
        L_0x0099:
            r6.close()     // Catch:{ all -> 0x014d }
            r2.close()     // Catch:{ all -> 0x0152 }
            java.io.FileDescriptor r2 = r5.getFD()     // Catch:{ all -> 0x0152 }
            r2.sync()     // Catch:{ all -> 0x0152 }
            java.lang.String r6 = r15.getName()     // Catch:{ IOException -> 0x012d }
            X.1XH r2 = r14.A00     // Catch:{ IOException -> 0x012d }
            r2.A01()     // Catch:{ IOException -> 0x012d }
            java.io.File r2 = r2.A03     // Catch:{ IOException -> 0x012d }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x012d }
            r9.<init>(r2, r6)     // Catch:{ IOException -> 0x012d }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x012d }
            r2.<init>(r9)     // Catch:{ IOException -> 0x012d }
            java.util.zip.GZIPOutputStream r8 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0128 }
            r8.<init>(r2)     // Catch:{ all -> 0x0128 }
            long r6 = (long) r10     // Catch:{ all -> 0x0128 }
            r5.seek(r6)     // Catch:{ all -> 0x0123 }
            int r15 = r17 - r10
            r6 = 0
            r14 = 0
        L_0x00c8:
            if (r14 >= r15) goto L_0x00db
            int r7 = r15 - r14
            int r7 = java.lang.Math.min(r13, r7)     // Catch:{ all -> 0x0123 }
            int r7 = r5.read(r12, r6, r7)     // Catch:{ all -> 0x0123 }
            if (r7 <= 0) goto L_0x00db
            r8.write(r12, r6, r7)     // Catch:{ all -> 0x0123 }
            int r14 = r14 + r7
            goto L_0x00c8
        L_0x00db:
            r5.seek(r0)     // Catch:{ all -> 0x0123 }
            r1 = 0
        L_0x00df:
            if (r1 >= r10) goto L_0x00f2
            int r0 = r10 - r1
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x0123 }
            int r0 = r5.read(r12, r6, r0)     // Catch:{ all -> 0x0123 }
            if (r0 <= 0) goto L_0x00f2
            r8.write(r12, r6, r0)     // Catch:{ all -> 0x0123 }
            int r1 = r1 + r0
            goto L_0x00df
        L_0x00f2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
            r6.<init>()     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "file-utils/truncate-from-end uncompressedSize:"
            r6.append(r0)     // Catch:{ all -> 0x0123 }
            r6.append(r11)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = " compressedSize:"
            r6.append(r0)     // Catch:{ all -> 0x0123 }
            long r0 = r9.length()     // Catch:{ all -> 0x0123 }
            r6.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0123 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0123 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0123 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0123 }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x0123 }
            r8.close()     // Catch:{ all -> 0x0128 }
            r2.close()     // Catch:{ IOException -> 0x012d }
            r5.close()     // Catch:{ SyncFailedException -> 0x0157 }
            goto L_0x018a
        L_0x0123:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0127 }
        L_0x0127:
            throw r0     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x012c }
        L_0x012c:
            throw r0     // Catch:{ IOException -> 0x012d }
        L_0x012d:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0152 }
            r1.<init>()     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = "file-utils/unable to create compressed file"
            r1.append(r0)     // Catch:{ all -> 0x0152 }
            r1.append(r2)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0152 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0152 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0152 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0152 }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x0152 }
            r5.close()     // Catch:{ SyncFailedException -> 0x0157 }
            goto L_0x0186
        L_0x014d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0151 }
        L_0x0151:
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0156 }
        L_0x0156:
            throw r0     // Catch:{ SyncFailedException -> 0x0157 }
        L_0x0157:
            r1 = move-exception
            java.lang.String r0 = "file-utils/truncate-from-end"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0165 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x0165 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ IOException -> 0x0165 }
            r1.<init>(r0, r4)     // Catch:{ IOException -> 0x0165 }
            goto L_0x0184
        L_0x0165:
            r2 = move-exception
            goto L_0x0169
        L_0x0167:
            r2 = move-exception
            r3 = r4
        L_0x0169:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018e }
            r1.<init>()     // Catch:{ all -> 0x018e }
            java.lang.String r0 = "fileutils/unable to create tempfile/"
            r1.append(r0)     // Catch:{ all -> 0x018e }
            r1.append(r2)     // Catch:{ all -> 0x018e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x018e }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x018e }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x018e }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x018e }
        L_0x0184:
            if (r3 == 0) goto L_0x003d
        L_0x0186:
            r3.delete()
            return r1
        L_0x018a:
            r3.delete()
            return r0
        L_0x018e:
            r0 = move-exception
            r4 = r3
            goto L_0x0192
        L_0x0191:
            r0 = move-exception
        L_0x0192:
            if (r4 == 0) goto L_0x0197
            r4.delete()
        L_0x0197:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XI.A02(X.12X, java.io.File, int, int):android.util.Pair");
    }

    public static File A03(Uri uri) {
        if (uri.getPath() == null || (uri.getScheme() != null && !"file".equals(uri.getScheme()))) {
            return null;
        }
        return new File(uri.getPath());
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009a A[SYNTHETIC, Splitter:B:42:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5 A[SYNTHETIC, Splitter:B:47:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ec A[SYNTHETIC, Splitter:B:66:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f6 A[SYNTHETIC, Splitter:B:71:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0113 A[SYNTHETIC, Splitter:B:76:0x0113] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A04(java.io.File r13, java.io.File r14, java.lang.String r15) {
        /*
            java.lang.String r3 = "compress/close/fail "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r0 = ".gz"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r7 = new java.io.File
            r7.<init>(r14, r0)
            boolean r0 = r7.exists()
            r12 = 0
            if (r0 == 0) goto L_0x002b
            boolean r0 = r7.delete()
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "compress/fail"
        L_0x0027:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r12
        L_0x002b:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x00e0 }
            r4.<init>(r7)     // Catch:{ FileNotFoundException -> 0x008c, all -> 0x00e0 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ FileNotFoundException -> 0x0090, all -> 0x00dd }
            r6.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0090, all -> 0x00dd }
            r9 = 32768(0x8000, float:4.5918E-41)
            byte[] r8 = new byte[r9]     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x00e9 }
            long r10 = r13.length()     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x00e9 }
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0060
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x00e9 }
            r0.<init>(r13)     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x00e9 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x00e9 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x00e9 }
            r2 = 0
            int r1 = r5.read(r8, r2, r9)     // Catch:{ FileNotFoundException -> 0x005e }
        L_0x0053:
            r0 = -1
            if (r1 == r0) goto L_0x0061
            r6.write(r8, r2, r1)     // Catch:{ FileNotFoundException -> 0x005e }
            int r1 = r5.read(r8, r2, r9)     // Catch:{ FileNotFoundException -> 0x005e }
            goto L_0x0053
        L_0x005e:
            r1 = move-exception
            goto L_0x0093
        L_0x0060:
            r5 = r12
        L_0x0061:
            if (r5 == 0) goto L_0x006c
            r5.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x006c
        L_0x0067:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r7 = r12
        L_0x006c:
            r6.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x00c3
        L_0x0070:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7 = r12
            goto L_0x00c3
        L_0x0089:
            r1 = move-exception
            r5 = r12
            goto L_0x0093
        L_0x008c:
            r1 = move-exception
            r4 = r12
            r6 = r12
            goto L_0x0092
        L_0x0090:
            r1 = move-exception
            r6 = r12
        L_0x0092:
            r5 = r12
        L_0x0093:
            java.lang.String r0 = "compress/fail "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r5 == 0) goto L_0x00a3
            r5.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x00a3
        L_0x009e:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r7 = r12
        L_0x00a3:
            if (r6 == 0) goto L_0x00c1
            r6.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00c1
        L_0x00a9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7 = r12
        L_0x00c1:
            if (r4 == 0) goto L_0x00e5
        L_0x00c3:
            r4.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00e4
        L_0x00c7:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0027
        L_0x00dd:
            r2 = move-exception
            r6 = r12
            goto L_0x00ea
        L_0x00e0:
            r2 = move-exception
            r4 = r12
            r6 = r12
            goto L_0x00ea
        L_0x00e4:
            return r7
        L_0x00e5:
            return r7
        L_0x00e6:
            r2 = move-exception
            r12 = r5
            goto L_0x00ea
        L_0x00e9:
            r2 = move-exception
        L_0x00ea:
            if (r12 == 0) goto L_0x00f4
            r12.close()     // Catch:{ IOException -> 0x00f0 }
            goto L_0x00f4
        L_0x00f0:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x00f4:
            if (r6 == 0) goto L_0x0111
            r6.close()     // Catch:{ IOException -> 0x00fa }
            goto L_0x0111
        L_0x00fa:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0111:
            if (r4 == 0) goto L_0x012e
            r4.close()     // Catch:{ IOException -> 0x0117 }
            throw r2
        L_0x0117:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x012e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XI.A04(java.io.File, java.io.File, java.lang.String):java.io.File");
    }

    public static File A05(String str, String str2) {
        try {
            File file = new File(str, str2);
            if (file.getCanonicalPath().startsWith(str)) {
                return file;
            }
            return null;
        } catch (IOException unused) {
        }
    }

    public static String A06(File file) {
        try {
            int parseInt = Integer.parseInt(String.valueOf(file.length() / FileUtils.ONE_KB));
            if (parseInt <= 100) {
                return new String(C29301aP.A00(file));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("FileUtils/readFile/File size is too big to read into string ");
            sb.append(parseInt);
            sb.append("KB. Max allowed is 100KB");
            Log.e(sb.toString());
            return null;
        } catch (IOException e2) {
            Log.e("FileUtils/readFile/ioerror", e2);
            return null;
        } catch (NumberFormatException e3) {
            Log.e("FileUtils/readFile/error in getting file size", e3);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A07(java.io.File r11, java.security.MessageDigest r12, long r13) {
        /*
            boolean r0 = r11.exists()
            r3 = 0
            if (r0 == 0) goto L_0x0056
            long r1 = r11.length()
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0056
            r12.reset()
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r10]
            r7 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r11)
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0051 }
            r6.<init>(r5)     // Catch:{ all -> 0x0051 }
            r4 = 0
            r3 = 0
        L_0x0024:
            r0 = -1
            if (r3 == r0) goto L_0x003d
            int r3 = r6.read(r9, r4, r10)     // Catch:{ all -> 0x004c }
            if (r3 <= 0) goto L_0x0024
            long r1 = (long) r3     // Catch:{ all -> 0x004c }
            long r1 = r1 + r7
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
            r12.update(r9, r4, r3)     // Catch:{ all -> 0x004c }
            r7 = r1
            goto L_0x0024
        L_0x0038:
            long r13 = r13 - r7
            int r0 = (int) r13     // Catch:{ all -> 0x004c }
            r12.update(r9, r4, r0)     // Catch:{ all -> 0x004c }
        L_0x003d:
            byte[] r0 = r12.digest()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = X.C004101u.A05(r0)     // Catch:{ all -> 0x004c }
            r6.close()     // Catch:{ all -> 0x0051 }
            r5.close()
            return r0
        L_0x004c:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XI.A07(java.io.File, java.security.MessageDigest, long):java.lang.String");
    }

    public static String A08(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (str.lastIndexOf(File.separator) > lastIndexOf || lastIndexOf < 0) ? "" : str.substring(lastIndexOf + 1);
    }

    public static String A09(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf2 > lastIndexOf) {
            lastIndexOf = -1;
        }
        if (lastIndexOf2 < 0) {
            lastIndexOf2 = 0;
        }
        return lastIndexOf >= 0 ? str.substring(lastIndexOf2, lastIndexOf) : str.substring(lastIndexOf2);
    }

    public static void A0A(C14730pf r24, File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            long j2 = 0;
            for (File length : listFiles) {
                j2 += length.length();
            }
            if (j2 > 0) {
                ArrayList arrayList = new ArrayList(Arrays.asList(listFiles));
                Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(23));
                long A01 = r24.A01();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    long lastModified = file2.lastModified();
                    if (currentTimeMillis - lastModified >= 604800000 || j2 > 20000000 || (j2 > 2000000 && 50000000 > A01 && A01 > 0)) {
                        long length2 = file2.length();
                        StringBuilder sb = new StringBuilder("cleanup/");
                        sb.append(file2.getName());
                        sb.append(":");
                        sb.append(currentTimeMillis);
                        sb.append(" - ");
                        sb.append(lastModified);
                        sb.append(" fileLength=");
                        sb.append(length2);
                        sb.append(" directoryLengthBeforeCleanup=");
                        sb.append(j2);
                        sb.append(" storageAvailableBeforeCleanup=");
                        sb.append(A01);
                        Log.i(sb.toString());
                        if (!file2.delete()) {
                            StringBuilder sb2 = new StringBuilder("cleanup/failed to delete ");
                            sb2.append(file2.getName());
                            Log.i(sb2.toString());
                        } else {
                            j2 -= length2;
                            A01 += length2;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.C16510tB r3, java.io.File r4, java.io.File r5) {
        /*
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r4)
            r3.A05(r2)     // Catch:{ all -> 0x0025 }
            java.io.File r0 = r5.getParentFile()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0011
            r0.mkdirs()     // Catch:{ all -> 0x0025 }
        L_0x0011:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0025 }
            r1.<init>(r5)     // Catch:{ all -> 0x0025 }
            A0H(r2, r1)     // Catch:{ all -> 0x0020 }
            r1.close()     // Catch:{ all -> 0x0025 }
            r2.close()
            return
        L_0x0020:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XI.A0B(X.0tB, java.io.File, java.io.File):void");
    }

    public static void A0C(C16510tB r1, File file, File file2) {
        if (!file.renameTo(file2)) {
            A0B(r1, file, file2);
            A0N(file);
        }
    }

    public static void A0D(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A0D(file2);
                } else {
                    file2.getPath();
                    A0N(file2);
                }
            }
        }
        file.getPath();
        A0N(file);
    }

    public static void A0E(File file, long j2) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (System.currentTimeMillis() - file2.lastModified() > j2) {
                    StringBuilder sb = new StringBuilder("cleanup/");
                    sb.append(file2.getName());
                    sb.append(":");
                    sb.append(System.currentTimeMillis());
                    sb.append(" - ");
                    sb.append(file2.lastModified());
                    Log.i(sb.toString());
                    if (!file2.delete()) {
                        StringBuilder sb2 = new StringBuilder("cleanup/failed to delete ");
                        sb2.append(file2.getName());
                        Log.i(sb2.toString());
                    }
                }
            }
        }
    }

    public static void A0F(File file, String str) {
        int length;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null && (length = listFiles.length) > 0) {
            int i2 = 0;
            do {
                File file2 = listFiles[i2];
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(file2.getName());
                sb.append(" ");
                sb.append(file2.length());
                sb.append(" drw=");
                String str2 = "1";
                String str3 = "0";
                if (file2.isDirectory()) {
                    str3 = str2;
                }
                sb.append(str3);
                String str4 = "0";
                if (file2.canRead()) {
                    str4 = str2;
                }
                sb.append(str4);
                if (!file2.canWrite()) {
                    str2 = "0";
                }
                sb.append(str2);
                Log.i(sb.toString());
                i2++;
            } while (i2 < length);
        }
    }

    public static void A0G(File file, byte[] bArr) {
        if (bArr != null) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    public static void A0H(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void A0I(FileChannel fileChannel, WritableByteChannel writableByteChannel) {
        long j2 = 0;
        while (true) {
            FileChannel fileChannel2 = fileChannel;
            if (j2 < fileChannel.size()) {
                fileChannel2.transferTo(j2, Math.min(131072, fileChannel.size() - j2), writableByteChannel);
                j2 += 131072;
            } else {
                return;
            }
        }
    }

    public static boolean A0J(Uri uri, AnonymousClass01V r6, C16260sj r7, boolean z2) {
        String scheme = uri.getScheme();
        if (!"settings".equals(uri.getAuthority()) && ("file".equals(scheme) || "content".equals(scheme))) {
            try {
                ContentResolver A0C = r6.A0C();
                if (A0C == null) {
                    Log.w("file-utils/ringtone-available/false cr=null");
                    return false;
                }
                C30311c8.A04(A0C.openInputStream(uri));
                return true;
            } catch (SQLiteException | FileNotFoundException | NullPointerException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("file-utils/ringtone-available/false/file-not-found ");
                sb.append(uri);
                Log.i(sb.toString(), e2);
                return false;
            } catch (IllegalStateException e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("file-utils/ringtone-available/false/illegal-state ");
                sb2.append(uri);
                Log.i(sb2.toString(), e3);
                return false;
            } catch (IllegalArgumentException e4) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("file-utils/ringtone-available/false/illegal-argument ");
                sb3.append(uri);
                Log.i(sb3.toString(), e4);
                return false;
            } catch (SecurityException e5) {
                if (uri.toString().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString())) {
                    Log.i("file-utils/ringtone-available/false/access-denied", e5);
                    if (!r7.A0B()) {
                        return z2;
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("file-utils/ringtone-available/true/cannot-check ");
                    sb4.append(uri.toString());
                    Log.i(sb4.toString(), e5);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0K(X.AnonymousClass12W r5, java.io.File r6, java.io.File r7) {
        /*
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002f }
            r4.<init>(r6)     // Catch:{ IOException -> 0x002f }
            X.1XH r0 = r5.A00()     // Catch:{ all -> 0x002a }
            X.1uh r3 = new X.1uh     // Catch:{ all -> 0x002a }
            r3.<init>(r0, r7)     // Catch:{ all -> 0x002a }
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0025 }
            r1 = 0
        L_0x0013:
            int r0 = r4.read(r2)     // Catch:{ all -> 0x0025 }
            if (r0 < 0) goto L_0x001d
            r3.write(r2, r1, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x0013
        L_0x001d:
            r0 = 1
            r3.close()     // Catch:{ all -> 0x002a }
            r4.close()     // Catch:{ IOException -> 0x002f }
            return r0
        L_0x0025:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "fileutils/copyexternalfile/failed to copy external file"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XI.A0K(X.12W, java.io.File, java.io.File):boolean");
    }

    public static boolean A0L(AnonymousClass12W r1, File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        boolean A0K = A0K(r1, file, file2);
        if (!file.delete()) {
            Log.w("fileutils/moveFile/could not delete source file");
        }
        return A0K;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0M(X.AnonymousClass12X r5, java.io.File r6, java.io.File r7) {
        /*
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002d }
            r4.<init>(r6)     // Catch:{ IOException -> 0x002d }
            X.1XH r0 = r5.A00     // Catch:{ all -> 0x0028 }
            X.1uh r3 = new X.1uh     // Catch:{ all -> 0x0028 }
            r3.<init>(r0, r7)     // Catch:{ all -> 0x0028 }
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0023 }
            r1 = 0
        L_0x0011:
            int r0 = r4.read(r2)     // Catch:{ all -> 0x0023 }
            if (r0 < 0) goto L_0x001b
            r3.write(r2, r1, r0)     // Catch:{ all -> 0x0023 }
            goto L_0x0011
        L_0x001b:
            r0 = 1
            r3.close()     // Catch:{ all -> 0x0028 }
            r4.close()     // Catch:{ IOException -> 0x002d }
            return r0
        L_0x0023:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r1 = move-exception
            java.lang.String r0 = "fileutils/copyinternalfile/failed to copy internal file"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XI.A0M(X.12X, java.io.File, java.io.File):boolean");
    }

    public static boolean A0N(File file) {
        if (!file.exists() || file.delete()) {
            return true;
        }
        StringBuilder sb = new StringBuilder("file-utils/delete-file/failed ");
        sb.append(file);
        Log.w(sb.toString());
        return false;
    }

    public static boolean A0O(File file) {
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File A0O : listFiles) {
                        if (!A0O(A0O)) {
                            return false;
                        }
                    }
                }
            } catch (OutOfMemoryError e2) {
                StringBuilder sb = new StringBuilder("trash/delete-recursive/out-of-memory ");
                sb.append(file.getAbsolutePath());
                Log.e(sb.toString(), e2);
                return false;
            }
        }
        return file.delete();
    }

    public static boolean A0P(File file) {
        StringBuilder sb;
        String str;
        String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            if (file.isDirectory()) {
                StringBuilder sb2 = new StringBuilder("FileUtils/prepareEmptyDir/Directory already exists unexpectedly! Cleaning up. ");
                sb2.append(absolutePath);
                Log.e(sb2.toString());
                A0E(file, -1);
                return true;
            }
            sb = new StringBuilder();
            str = "FileUtils/prepareEmptyDir/Directory already exists unexpectedly and is a file! Wrong call.";
        } else if (file.mkdirs()) {
            return true;
        } else {
            sb = new StringBuilder();
            str = "FileUtils/prepareEmptyDir/Could not make directory ";
        }
        sb.append(str);
        sb.append(absolutePath);
        Log.e(sb.toString());
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0Q(java.io.File r5, java.io.InputStream r6) {
        /*
            r4 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0024 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0024 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0024 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0024 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x001f }
        L_0x000f:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x001f }
            r0 = -1
            if (r1 == r0) goto L_0x001a
            r3.write(r2, r4, r1)     // Catch:{ all -> 0x001f }
            goto L_0x000f
        L_0x001a:
            r3.close()     // Catch:{ IOException -> 0x0024 }
            r0 = 1
            return r0
        L_0x001f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            throw r0     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            java.lang.String r0 = "FileUtils/saveInputStreamToFile/could not save file to:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XI.A0Q(java.io.File, java.io.InputStream):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0R(java.io.File r8, java.io.InputStream r9, long r10) {
        /*
            r3 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004a }
            r0.<init>(r8)     // Catch:{ IOException -> 0x004a }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x004a }
            r6.<init>(r0)     // Catch:{ IOException -> 0x004a }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x0045 }
            r0 = 0
        L_0x0011:
            int r4 = r9.read(r7)     // Catch:{ all -> 0x0045 }
            r2 = -1
            if (r4 == r2) goto L_0x0040
            r6.write(r7, r3, r4)     // Catch:{ all -> 0x0045 }
            long r4 = (long) r4     // Catch:{ all -> 0x0045 }
            long r0 = r0 + r4
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0011
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r4.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "FileUtils/saveInputStreamToFileWithMaxBytes file size of "
            r4.append(r2)     // Catch:{ all -> 0x0045 }
            r4.append(r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = " but max of "
            r4.append(r0)     // Catch:{ all -> 0x0045 }
            r4.append(r10)     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0045 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            r0.<init>(r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0040:
            r6.close()     // Catch:{ IOException -> 0x004a }
            r0 = 1
            return r0
        L_0x0045:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            r2 = move-exception
            java.lang.String r0 = "FileUtils/saveInputStreamToFileWithMaxBytes/could not save file to:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r8.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XI.A0R(java.io.File, java.io.InputStream, long):boolean");
    }

    public static boolean A0S(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            if (!str.matches("[\\w-.,'\\s]+")) {
                str2 = "FileUtils/fileNameInvalid/file name contains invalid characters, allowed characters are a to z, A to Z, _ , ' - . and space character";
            } else if (!str.contains("..")) {
                return false;
            } else {
                str2 = "FileUtils/fileNameInvalid/file name cannot contain ..";
            }
            Log.e(str2);
        }
        return true;
    }

    public static byte[] A0T(File file) {
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
