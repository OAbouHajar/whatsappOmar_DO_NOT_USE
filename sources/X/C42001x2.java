package X;

import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1x2  reason: invalid class name and case insensitive filesystem */
public final class C42001x2 implements Closeable {
    public static final Charset A0D = AnonymousClass01S.A0A;
    public int A00;
    public long A01 = 0;
    public long A02 = 0;
    public Writer A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final LinkedHashMap A0A = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0B = new IDxCallableShape148S0100000_2_I0(this, 1);
    public final ExecutorService A0C = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C42001x2(File file, long j2) {
        this.A07 = file;
        this.A04 = 1;
        this.A08 = new File(file, "journal");
        this.A09 = new File(file, "journal.tmp");
        this.A05 = 1;
        this.A06 = j2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:53|54|(4:57|(2:59|87)(2:60|88)|85|55)|86|61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        A03(r4);
        A05(r5.A09);
        r10 = r5.A0A.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0162, code lost:
        if (r10.hasNext() != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0164, code lost:
        r4 = (X.AnonymousClass4V0) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016d, code lost:
        if (r4.A01 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016f, code lost:
        r5.A02 += r4.A04[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0179, code lost:
        r4.A01 = null;
        A05(r4.A00());
        A05(r4.A01());
        r10.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018e, code lost:
        r5.A03 = new java.io.BufferedWriter(new java.io.FileWriter(r9, true), 8192);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019c, code lost:
        return r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x014c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C42001x2 A00(java.io.File r14, long r15) {
        /*
            r8 = 1
            r3 = 0
            r1 = r15
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e7
            X.1x2 r5 = new X.1x2
            r16 = r14
            r5.<init>(r14, r1)
            java.io.File r9 = r5.A08
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x01d9
            java.lang.String r12 = ", "
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01d1 }
            r3.<init>(r9)     // Catch:{ IOException -> 0x01d1 }
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x01d1 }
            r4.<init>(r3, r0)     // Catch:{ IOException -> 0x01d1 }
            java.lang.String r11 = A01(r4)     // Catch:{ all -> 0x01cc }
            java.lang.String r10 = A01(r4)     // Catch:{ all -> 0x01cc }
            java.lang.String r13 = A01(r4)     // Catch:{ all -> 0x01cc }
            java.lang.String r7 = A01(r4)     // Catch:{ all -> 0x01cc }
            java.lang.String r6 = A01(r4)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x019d
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x019d
            java.lang.String r3 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x01cc }
            boolean r0 = r3.equals(r13)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x019d
            boolean r0 = r3.equals(r7)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x019d
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x019d
        L_0x0061:
            java.lang.String r3 = A01(r4)     // Catch:{ EOFException -> 0x014c }
            java.lang.String r0 = " "
            java.lang.String[] r13 = r3.split(r0)     // Catch:{ EOFException -> 0x014c }
            int r11 = r13.length     // Catch:{ EOFException -> 0x014c }
            java.lang.String r6 = "unexpected journal line: "
            r10 = 2
            if (r11 < r10) goto L_0x0122
            r12 = r13[r8]     // Catch:{ EOFException -> 0x014c }
            r14 = 0
            r7 = r13[r14]     // Catch:{ EOFException -> 0x014c }
            java.lang.String r0 = "REMOVE"
            boolean r0 = r7.equals(r0)     // Catch:{ EOFException -> 0x014c }
            if (r0 == 0) goto L_0x0087
            if (r11 != r10) goto L_0x0087
            java.util.LinkedHashMap r0 = r5.A0A     // Catch:{ EOFException -> 0x014c }
            r0.remove(r12)     // Catch:{ EOFException -> 0x014c }
            goto L_0x0061
        L_0x0087:
            java.util.LinkedHashMap r0 = r5.A0A     // Catch:{ EOFException -> 0x014c }
            java.lang.Object r7 = r0.get(r12)     // Catch:{ EOFException -> 0x014c }
            X.4V0 r7 = (X.AnonymousClass4V0) r7     // Catch:{ EOFException -> 0x014c }
            r15 = 0
            if (r7 != 0) goto L_0x009a
            X.4V0 r7 = new X.4V0     // Catch:{ EOFException -> 0x014c }
            r7.<init>(r5, r12)     // Catch:{ EOFException -> 0x014c }
            r0.put(r12, r7)     // Catch:{ EOFException -> 0x014c }
        L_0x009a:
            r12 = r13[r14]     // Catch:{ EOFException -> 0x014c }
            java.lang.String r0 = "CLEAN"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x014c }
            if (r0 == 0) goto L_0x00ed
            r0 = 3
            if (r11 != r0) goto L_0x00ed
            r7.A02 = r8     // Catch:{ EOFException -> 0x014c }
            r7.A01 = r15     // Catch:{ EOFException -> 0x014c }
            int r3 = java.lang.Math.min(r8, r8)     // Catch:{ EOFException -> 0x014c }
            java.lang.Class r0 = r13.getClass()     // Catch:{ EOFException -> 0x014c }
            java.lang.Class r0 = r0.getComponentType()     // Catch:{ EOFException -> 0x014c }
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r0, r8)     // Catch:{ EOFException -> 0x014c }
            java.lang.Object[] r12 = (java.lang.Object[]) r12     // Catch:{ EOFException -> 0x014c }
            java.lang.System.arraycopy(r13, r10, r12, r14, r3)     // Catch:{ EOFException -> 0x014c }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ EOFException -> 0x014c }
            int r13 = r12.length     // Catch:{ EOFException -> 0x014c }
            X.1x2 r0 = r7.A05     // Catch:{ EOFException -> 0x014c }
            int r0 = r0.A05     // Catch:{ EOFException -> 0x014c }
            if (r13 == r0) goto L_0x00df
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x014c }
            r3.<init>(r6)     // Catch:{ EOFException -> 0x014c }
            java.lang.String r0 = java.util.Arrays.toString(r12)     // Catch:{ EOFException -> 0x014c }
            r3.append(r0)     // Catch:{ EOFException -> 0x014c }
            java.lang.String r0 = r3.toString()     // Catch:{ EOFException -> 0x014c }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x014c }
            r3.<init>(r0)     // Catch:{ EOFException -> 0x014c }
            goto L_0x014b
        L_0x00df:
            if (r14 >= r13) goto L_0x0061
            long[] r3 = r7.A04     // Catch:{ NumberFormatException -> 0x010c }
            r0 = r12[r14]     // Catch:{ NumberFormatException -> 0x010c }
            long r10 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x010c }
            r3[r14] = r10     // Catch:{ NumberFormatException -> 0x010c }
            r14 = 1
            goto L_0x00df
        L_0x00ed:
            java.lang.String r0 = "DIRTY"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x014c }
            if (r0 == 0) goto L_0x0100
            if (r11 != r10) goto L_0x0100
            X.1x6 r0 = new X.1x6     // Catch:{ EOFException -> 0x014c }
            r0.<init>(r7, r5)     // Catch:{ EOFException -> 0x014c }
            r7.A01 = r0     // Catch:{ EOFException -> 0x014c }
            goto L_0x0061
        L_0x0100:
            java.lang.String r0 = "READ"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x014c }
            if (r0 == 0) goto L_0x0137
            if (r11 != r10) goto L_0x0137
            goto L_0x0061
        L_0x010c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x014c }
            r3.<init>(r6)     // Catch:{ EOFException -> 0x014c }
            java.lang.String r0 = java.util.Arrays.toString(r12)     // Catch:{ EOFException -> 0x014c }
            r3.append(r0)     // Catch:{ EOFException -> 0x014c }
            java.lang.String r0 = r3.toString()     // Catch:{ EOFException -> 0x014c }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x014c }
            r3.<init>(r0)     // Catch:{ EOFException -> 0x014c }
            goto L_0x014b
        L_0x0122:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x014c }
            r0.<init>()     // Catch:{ EOFException -> 0x014c }
            r0.append(r6)     // Catch:{ EOFException -> 0x014c }
            r0.append(r3)     // Catch:{ EOFException -> 0x014c }
            java.lang.String r0 = r0.toString()     // Catch:{ EOFException -> 0x014c }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x014c }
            r3.<init>(r0)     // Catch:{ EOFException -> 0x014c }
            goto L_0x014b
        L_0x0137:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x014c }
            r0.<init>()     // Catch:{ EOFException -> 0x014c }
            r0.append(r6)     // Catch:{ EOFException -> 0x014c }
            r0.append(r3)     // Catch:{ EOFException -> 0x014c }
            java.lang.String r0 = r0.toString()     // Catch:{ EOFException -> 0x014c }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x014c }
            r3.<init>(r0)     // Catch:{ EOFException -> 0x014c }
        L_0x014b:
            throw r3     // Catch:{ EOFException -> 0x014c }
        L_0x014c:
            A03(r4)     // Catch:{ IOException -> 0x01d1 }
            java.io.File r0 = r5.A09     // Catch:{ IOException -> 0x01d1 }
            A05(r0)     // Catch:{ IOException -> 0x01d1 }
            java.util.LinkedHashMap r0 = r5.A0A     // Catch:{ IOException -> 0x01d1 }
            java.util.Collection r0 = r0.values()     // Catch:{ IOException -> 0x01d1 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ IOException -> 0x01d1 }
        L_0x015e:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x018e
            java.lang.Object r4 = r10.next()     // Catch:{ IOException -> 0x01d1 }
            X.4V0 r4 = (X.AnonymousClass4V0) r4     // Catch:{ IOException -> 0x01d1 }
            X.1x6 r0 = r4.A01     // Catch:{ IOException -> 0x01d1 }
            r3 = 0
            if (r0 != 0) goto L_0x0179
            long r6 = r5.A02     // Catch:{ IOException -> 0x01d1 }
            long[] r0 = r4.A04     // Catch:{ IOException -> 0x01d1 }
            r3 = r0[r3]     // Catch:{ IOException -> 0x01d1 }
            long r6 = r6 + r3
            r5.A02 = r6     // Catch:{ IOException -> 0x01d1 }
            goto L_0x015e
        L_0x0179:
            r0 = 0
            r4.A01 = r0     // Catch:{ IOException -> 0x01d1 }
            java.io.File r0 = r4.A00()     // Catch:{ IOException -> 0x01d1 }
            A05(r0)     // Catch:{ IOException -> 0x01d1 }
            java.io.File r0 = r4.A01()     // Catch:{ IOException -> 0x01d1 }
            A05(r0)     // Catch:{ IOException -> 0x01d1 }
            r10.remove()     // Catch:{ IOException -> 0x01d1 }
            goto L_0x015e
        L_0x018e:
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x01d1 }
            r4.<init>(r9, r8)     // Catch:{ IOException -> 0x01d1 }
            r3 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x01d1 }
            r0.<init>(r4, r3)     // Catch:{ IOException -> 0x01d1 }
            r5.A03 = r0     // Catch:{ IOException -> 0x01d1 }
            return r5
        L_0x019d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cc }
            r3.<init>()     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "unexpected journal header: ["
            r3.append(r0)     // Catch:{ all -> 0x01cc }
            r3.append(r11)     // Catch:{ all -> 0x01cc }
            r3.append(r12)     // Catch:{ all -> 0x01cc }
            r3.append(r10)     // Catch:{ all -> 0x01cc }
            r3.append(r12)     // Catch:{ all -> 0x01cc }
            r3.append(r7)     // Catch:{ all -> 0x01cc }
            r3.append(r12)     // Catch:{ all -> 0x01cc }
            r3.append(r6)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "]"
            r3.append(r0)     // Catch:{ all -> 0x01cc }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01cc }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01cc }
            r0.<init>(r3)     // Catch:{ all -> 0x01cc }
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            r0 = move-exception
            A03(r4)     // Catch:{ IOException -> 0x01d1 }
            throw r0     // Catch:{ IOException -> 0x01d1 }
        L_0x01d1:
            r5.close()
            java.io.File r0 = r5.A07
            A04(r0)
        L_0x01d9:
            r16.mkdirs()
            X.1x2 r5 = new X.1x2
            r0 = r16
            r5.<init>(r0, r1)
            r5.A0B()
            return r5
        L_0x01e7:
            java.lang.String r1 = "maxSize <= 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42001x2.A00(java.io.File, long):X.1x2");
    }

    public static String A01(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i2 = length - 1;
                    if (sb.charAt(i2) == 13) {
                        sb.setLength(i2);
                    }
                }
                return sb.toString();
            } else {
                sb.append((char) read);
            }
        }
    }

    public static /* synthetic */ void A02(C42021x6 r10, C42001x2 r11, boolean z2) {
        IllegalStateException illegalStateException;
        synchronized (r11) {
            AnonymousClass4V0 r5 = r10.A01;
            if (r5.A01 == r10) {
                if (z2 && !r5.A02) {
                    int i2 = 0;
                    while (i2 < r11.A05) {
                        if (r5.A01().exists()) {
                            i2 = 1;
                        } else {
                            A02(r10, r10.A02, false);
                            StringBuilder sb = new StringBuilder();
                            sb.append("edit didn't create file ");
                            sb.append(i2);
                            illegalStateException = new IllegalStateException(sb.toString());
                        }
                    }
                }
                for (int i3 = 0; i3 < r11.A05; i3 = 1) {
                    File A012 = r5.A01();
                    if (!z2) {
                        A05(A012);
                    } else if (A012.exists()) {
                        File A002 = r5.A00();
                        A012.renameTo(A002);
                        long[] jArr = r5.A04;
                        long j2 = jArr[i3];
                        long length = A002.length();
                        jArr[i3] = length;
                        r11.A02 = (r11.A02 - j2) + length;
                    }
                }
                r11.A00++;
                r5.A01 = null;
                if (r5.A02 || z2) {
                    r5.A02 = true;
                    Writer writer = r11.A03;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(r5.A03);
                    StringBuilder sb3 = new StringBuilder();
                    for (long append : r5.A04) {
                        sb3.append(' ');
                        sb3.append(append);
                    }
                    sb2.append(sb3.toString());
                    sb2.append(10);
                    writer.write(sb2.toString());
                    if (z2) {
                        long j3 = r11.A01;
                        r11.A01 = 1 + j3;
                        r5.A00 = j3;
                    }
                } else {
                    LinkedHashMap linkedHashMap = r11.A0A;
                    String str = r5.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = r11.A03;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("REMOVE ");
                    sb4.append(str);
                    sb4.append(10);
                    writer2.write(sb4.toString());
                }
                Writer writer3 = r11.A03;
                if (writer3 != null) {
                    writer3.flush();
                }
                if (r11.A02 > r11.A06 || r11.A0C()) {
                    r11.A0C.submit(r11.A0B);
                }
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
    }

    public static void A03(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void A04(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                if (file2.isDirectory()) {
                    A04(file2);
                }
                if (file2.delete()) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a directory: ");
        sb2.append(file);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void A05(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static final void A06(String str) {
        if (str.contains(" ") || str.contains(IOUtils.LINE_SEPARATOR_UNIX) || str.contains("\r")) {
            StringBuilder sb = new StringBuilder("keys must not contain spaces or newlines: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public synchronized long A07() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r1.A01 != null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42021x6 A08(java.lang.String r6) {
        /*
            r5 = this;
            r4 = r5
            monitor-enter(r4)
            java.io.Writer r0 = r5.A03     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x004a
            A06(r6)     // Catch:{ all -> 0x0052 }
            java.util.LinkedHashMap r0 = r5.A0A     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x0052 }
            X.4V0 r1 = (X.AnonymousClass4V0) r1     // Catch:{ all -> 0x0052 }
            r3 = 0
            if (r1 != 0) goto L_0x0044
            X.4V0 r1 = new X.4V0     // Catch:{ all -> 0x0052 }
            r1.<init>(r5, r6)     // Catch:{ all -> 0x0052 }
            r0.put(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x001c:
            X.1x6 r3 = new X.1x6     // Catch:{ all -> 0x0052 }
            r3.<init>(r1, r5)     // Catch:{ all -> 0x0052 }
            r1.A01 = r3     // Catch:{ all -> 0x0052 }
            java.io.Writer r2 = r5.A03     // Catch:{ all -> 0x0052 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "DIRTY "
            r1.append(r0)     // Catch:{ all -> 0x0052 }
            r1.append(r6)     // Catch:{ all -> 0x0052 }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0052 }
            r2.write(r0)     // Catch:{ all -> 0x0052 }
            java.io.Writer r0 = r5.A03     // Catch:{ all -> 0x0052 }
            r0.flush()     // Catch:{ all -> 0x0052 }
            goto L_0x0048
        L_0x0044:
            X.1x6 r0 = r1.A01     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x001c
        L_0x0048:
            monitor-exit(r4)
            return r3
        L_0x004a:
            java.lang.String r1 = "cache is closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0052 }
            r0.<init>(r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42001x2.A08(java.lang.String):X.1x6");
    }

    public synchronized C42011x3 A09(String str) {
        C42011x3 r5;
        synchronized (this) {
            if (this.A03 != null) {
                A06(str);
                AnonymousClass4V0 r6 = (AnonymousClass4V0) this.A0A.get(str);
                r5 = null;
                if (r6 != null && r6.A02) {
                    int i2 = this.A05;
                    InputStream[] inputStreamArr = new InputStream[i2];
                    int i3 = 0;
                    while (i3 < i2) {
                        try {
                            inputStreamArr[i3] = new FileInputStream(r6.A00());
                            i3 = 1;
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }
                    this.A00++;
                    this.A03.append("READ").append(' ').append(str).append(10);
                    if (A0C()) {
                        this.A0C.submit(this.A0B);
                    }
                    r5 = new C42011x3(this, inputStreamArr);
                }
            } else {
                throw new IllegalStateException("cache is closed");
            }
        }
        return r5;
    }

    public final void A0A() {
        HashSet hashSet = new HashSet();
        while (this.A02 > this.A06) {
            String str = (String) ((Map.Entry) this.A0A.entrySet().iterator().next()).getKey();
            if (A0D(str)) {
                hashSet.add(str);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00cd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0B() {
        /*
            r13 = this;
            monitor-enter(r13)
            java.io.Writer r0 = r13.A03     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00ce }
        L_0x0008:
            java.io.File r9 = r13.A09     // Catch:{ all -> 0x00ce }
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ all -> 0x00ce }
            r0.<init>(r9)     // Catch:{ all -> 0x00ce }
            r7 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedWriter r8 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ce }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            r8.write(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "\n"
            r8.write(r1)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "1"
            r8.write(r0)     // Catch:{ all -> 0x00c9 }
            r8.write(r1)     // Catch:{ all -> 0x00c9 }
            int r0 = r13.A04     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00c9 }
            r8.write(r0)     // Catch:{ all -> 0x00c9 }
            r8.write(r1)     // Catch:{ all -> 0x00c9 }
            int r0 = r13.A05     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00c9 }
            r8.write(r0)     // Catch:{ all -> 0x00c9 }
            r8.write(r1)     // Catch:{ all -> 0x00c9 }
            r8.write(r1)     // Catch:{ all -> 0x00c9 }
            java.util.LinkedHashMap r0 = r13.A0A     // Catch:{ all -> 0x00c9 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00c9 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x00c9 }
        L_0x004d:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r2 = r12.next()     // Catch:{ all -> 0x00c9 }
            X.4V0 r2 = (X.AnonymousClass4V0) r2     // Catch:{ all -> 0x00c9 }
            X.1x6 r0 = r2.A01     // Catch:{ all -> 0x00c9 }
            r11 = 10
            if (r0 == 0) goto L_0x0079
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "DIRTY "
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x00c9 }
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            r1.append(r11)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c9 }
            r8.write(r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x004d
        L_0x0079:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r10.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "CLEAN "
            r10.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x00c9 }
            r10.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r6.<init>()     // Catch:{ all -> 0x00c9 }
            long[] r5 = r2.A04     // Catch:{ all -> 0x00c9 }
            int r4 = r5.length     // Catch:{ all -> 0x00c9 }
            r3 = 0
        L_0x0091:
            if (r3 >= r4) goto L_0x00a0
            r1 = r5[r3]     // Catch:{ all -> 0x00c9 }
            r0 = 32
            r6.append(r0)     // Catch:{ all -> 0x00c9 }
            r6.append(r1)     // Catch:{ all -> 0x00c9 }
            int r3 = r3 + 1
            goto L_0x0091
        L_0x00a0:
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00c9 }
            r10.append(r0)     // Catch:{ all -> 0x00c9 }
            r10.append(r11)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x00c9 }
            r8.write(r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x004d
        L_0x00b2:
            r8.close()     // Catch:{ all -> 0x00ce }
            java.io.File r2 = r13.A08     // Catch:{ all -> 0x00ce }
            r9.renameTo(r2)     // Catch:{ all -> 0x00ce }
            r0 = 1
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ all -> 0x00ce }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00ce }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ce }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x00ce }
            r13.A03 = r0     // Catch:{ all -> 0x00ce }
            monitor-exit(r13)
            return
        L_0x00c9:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42001x2.A0B():void");
    }

    public final boolean A0C() {
        int i2 = this.A00;
        return i2 >= 2000 && i2 >= this.A0A.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0D(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.io.Writer r0 = r8.A03     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x007c
            A06(r9)     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashMap r3 = r8.A0A     // Catch:{ all -> 0x0084 }
            java.lang.Object r7 = r3.get(r9)     // Catch:{ all -> 0x0084 }
            X.4V0 r7 = (X.AnonymousClass4V0) r7     // Catch:{ all -> 0x0084 }
            r2 = 0
            if (r7 == 0) goto L_0x007a
            X.1x6 r0 = r7.A01     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0018
            goto L_0x007a
        L_0x0018:
            int r0 = r8.A05     // Catch:{ all -> 0x0084 }
            if (r2 >= r0) goto L_0x004c
            java.io.File r4 = r7.A00()     // Catch:{ all -> 0x0084 }
            boolean r0 = r4.delete()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0035
            long r4 = r8.A02     // Catch:{ all -> 0x0084 }
            long[] r6 = r7.A04     // Catch:{ all -> 0x0084 }
            r0 = r6[r2]     // Catch:{ all -> 0x0084 }
            long r4 = r4 - r0
            r8.A02 = r4     // Catch:{ all -> 0x0084 }
            r0 = 0
            r6[r2] = r0     // Catch:{ all -> 0x0084 }
            r2 = 1
            goto L_0x0018
        L_0x0035:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r1.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "failed to delete "
            r1.append(r0)     // Catch:{ all -> 0x0084 }
            r1.append(r4)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0084 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0084 }
            r0.<init>(r1)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x004c:
            int r0 = r8.A00     // Catch:{ all -> 0x0084 }
            r2 = 1
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x0084 }
            java.io.Writer r1 = r8.A03     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "REMOVE"
            java.io.Writer r1 = r1.append(r0)     // Catch:{ all -> 0x0084 }
            r0 = 32
            java.io.Writer r0 = r1.append(r0)     // Catch:{ all -> 0x0084 }
            java.io.Writer r1 = r0.append(r9)     // Catch:{ all -> 0x0084 }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x0084 }
            r3.remove(r9)     // Catch:{ all -> 0x0084 }
            boolean r0 = r8.A0C()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x007a
            java.util.concurrent.ExecutorService r1 = r8.A0C     // Catch:{ all -> 0x0084 }
            java.util.concurrent.Callable r0 = r8.A0B     // Catch:{ all -> 0x0084 }
            r1.submit(r0)     // Catch:{ all -> 0x0084 }
        L_0x007a:
            monitor-exit(r8)
            return r2
        L_0x007c:
            java.lang.String r1 = "cache is closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0084 }
            r0.<init>(r1)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42001x2.A0D(java.lang.String):boolean");
    }

    public synchronized void close() {
        if (this.A03 != null) {
            Iterator it = new ArrayList(this.A0A.values()).iterator();
            while (it.hasNext()) {
                C42021x6 r2 = ((AnonymousClass4V0) it.next()).A01;
                if (r2 != null) {
                    A02(r2, r2.A02, false);
                }
            }
            A0A();
            this.A03.close();
            this.A03 = null;
        }
    }
}
