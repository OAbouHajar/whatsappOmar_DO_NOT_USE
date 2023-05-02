package okhttp3.internal.publicsuffix;

import java.io.Closeable;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.Util;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Source;

/* compiled from: XFMFile */
public final class PublicSuffixDatabase {
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f2284e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f2285f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f2286g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f2287h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f2288a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f2289b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2290c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f2291d;

    public static String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z2;
        byte b2;
        int i4;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr3[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i3 = i7 + i8;
                if (bArr3[i3] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i3 - i7;
            int i10 = i2;
            boolean z3 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z3) {
                    b2 = 46;
                    z2 = false;
                } else {
                    z2 = z3;
                    b2 = bArr4[i10][i11] & 255;
                }
                i4 = b2 - (bArr3[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr4[i10].length != i11) {
                        z3 = z2;
                    } else if (i10 == bArr4.length - 1) {
                        break;
                    } else {
                        i10++;
                        z3 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr4[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr3, i7, i9, Util.UTF_8);
                        }
                    }
                }
                i5 = i3 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    public static PublicSuffixDatabase get() {
        return f2287h;
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream != null) {
            BufferedSource buffer = Okio.buffer((Source) new GzipSource(Okio.source(resourceAsStream)));
            try {
                byte[] bArr = new byte[buffer.readInt()];
                buffer.readFully(bArr);
                byte[] bArr2 = new byte[buffer.readInt()];
                buffer.readFully(bArr2);
                synchronized (this) {
                    this.f2290c = bArr;
                    this.f2291d = bArr2;
                }
                this.f2289b.countDown();
            } finally {
                Util.closeQuietly((Closeable) buffer);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r1 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r1 != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getEffectiveTldPlusOne(java.lang.String r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0133
            java.lang.String r0 = java.net.IDN.toUnicode(r11)
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.f2288a
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0048
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.f2288a
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0048
            r1 = 0
        L_0x001f:
            r10.b()     // Catch:{ InterruptedIOException -> 0x0046, IOException -> 0x0027 }
            if (r1 == 0) goto L_0x0055
            goto L_0x0034
        L_0x0025:
            r11 = move-exception
            goto L_0x003c
        L_0x0027:
            r4 = move-exception
            okhttp3.internal.platform.Platform r5 = okhttp3.internal.platform.Platform.get()     // Catch:{ all -> 0x0025 }
            java.lang.String r6 = "Failed to read public suffix list"
            r7 = 5
            r5.log(r7, r6, r4)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0055
        L_0x0034:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x0055
        L_0x003c:
            if (r1 == 0) goto L_0x0045
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0045:
            throw r11
        L_0x0046:
            r1 = 1
            goto L_0x001f
        L_0x0048:
            java.util.concurrent.CountDownLatch r1 = r10.f2289b     // Catch:{ InterruptedException -> 0x004e }
            r1.await()     // Catch:{ InterruptedException -> 0x004e }
            goto L_0x0055
        L_0x004e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0055:
            monitor-enter(r10)
            byte[] r1 = r10.f2290c     // Catch:{ all -> 0x0130 }
            if (r1 == 0) goto L_0x0128
            monitor-exit(r10)     // Catch:{ all -> 0x0130 }
            int r1 = r0.length
            byte[][] r4 = new byte[r1][]
            r5 = 0
        L_0x005f:
            int r6 = r0.length
            if (r5 >= r6) goto L_0x006f
            r6 = r0[r5]
            java.nio.charset.Charset r7 = okhttp3.internal.Util.UTF_8
            byte[] r6 = r6.getBytes(r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x005f
        L_0x006f:
            r5 = 0
        L_0x0070:
            r6 = 0
            if (r5 >= r1) goto L_0x007f
            byte[] r7 = r10.f2290c
            java.lang.String r7 = a(r7, r4, r5)
            if (r7 == 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            int r5 = r5 + 1
            goto L_0x0070
        L_0x007f:
            r7 = r6
        L_0x0080:
            if (r1 <= r2) goto L_0x009d
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            r8 = 0
        L_0x0089:
            int r9 = r5.length
            int r9 = r9 - r2
            if (r8 >= r9) goto L_0x009d
            byte[] r9 = f2284e
            r5[r8] = r9
            byte[] r9 = r10.f2290c
            java.lang.String r9 = a(r9, r5, r8)
            if (r9 == 0) goto L_0x009a
            goto L_0x009e
        L_0x009a:
            int r8 = r8 + 1
            goto L_0x0089
        L_0x009d:
            r9 = r6
        L_0x009e:
            if (r9 == 0) goto L_0x00b1
            r5 = 0
        L_0x00a1:
            int r8 = r1 + -1
            if (r5 >= r8) goto L_0x00b1
            byte[] r8 = r10.f2291d
            java.lang.String r8 = a(r8, r4, r5)
            if (r8 == 0) goto L_0x00ae
            goto L_0x00b2
        L_0x00ae:
            int r5 = r5 + 1
            goto L_0x00a1
        L_0x00b1:
            r8 = r6
        L_0x00b2:
            if (r8 == 0) goto L_0x00c1
            java.lang.String r1 = "!"
            java.lang.String r1 = r1.concat(r8)
            java.lang.String r4 = "\\."
            java.lang.String[] r1 = r1.split(r4)
            goto L_0x00e4
        L_0x00c1:
            if (r7 != 0) goto L_0x00c8
            if (r9 != 0) goto L_0x00c8
            java.lang.String[] r1 = f2286g
            goto L_0x00e4
        L_0x00c8:
            if (r7 == 0) goto L_0x00d1
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r7.split(r1)
            goto L_0x00d3
        L_0x00d1:
            java.lang.String[] r1 = f2285f
        L_0x00d3:
            if (r9 == 0) goto L_0x00dc
            java.lang.String r4 = "\\."
            java.lang.String[] r4 = r9.split(r4)
            goto L_0x00de
        L_0x00dc:
            java.lang.String[] r4 = f2285f
        L_0x00de:
            int r5 = r1.length
            int r7 = r4.length
            if (r5 <= r7) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r1 = r4
        L_0x00e4:
            int r4 = r0.length
            int r5 = r1.length
            r7 = 33
            if (r4 != r5) goto L_0x00f3
            r4 = r1[r3]
            char r4 = r4.charAt(r3)
            if (r4 == r7) goto L_0x00f3
            return r6
        L_0x00f3:
            r4 = r1[r3]
            char r3 = r4.charAt(r3)
            int r0 = r0.length
            int r1 = r1.length
            if (r3 != r7) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            int r1 = r1 + r2
        L_0x00ff:
            int r0 = r0 - r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "\\."
            java.lang.String[] r11 = r11.split(r3)
        L_0x010b:
            int r3 = r11.length
            if (r0 >= r3) goto L_0x011b
            r3 = r11[r0]
            r1.append(r3)
            r3 = 46
            r1.append(r3)
            int r0 = r0 + 1
            goto L_0x010b
        L_0x011b:
            int r11 = r1.length()
            int r11 = r11 - r2
            r1.deleteCharAt(r11)
            java.lang.String r11 = r1.toString()
            return r11
        L_0x0128:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r11.<init>(r0)     // Catch:{ all -> 0x0130 }
            throw r11     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0130 }
            throw r11
        L_0x0133:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "domain == null"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.getEffectiveTldPlusOne(java.lang.String):java.lang.String");
    }
}
