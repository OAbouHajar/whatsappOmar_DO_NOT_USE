package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.1wt  reason: invalid class name and case insensitive filesystem */
public class C41931wt {
    public static final byte[] A04 = "endobj".getBytes();
    public static final byte[] A05 = "%FDF-".getBytes();
    public static final byte[] A06 = " obj".getBytes();
    public static final byte[] A07 = "%PDF-".getBytes();
    public static final byte[] A08 = "stream".getBytes();
    public static final String[] A09 = {"/RichMedia", "/JS", "/JavaScript", "/AA", "/Launch", "/RichMediaInstance"};
    public int A00;
    public C86044Qz A01 = new C86044Qz();
    public File A02;
    public boolean A03;

    public C41931wt(File file) {
        this.A02 = file;
    }

    public static void A00(InputStream inputStream) {
        int read;
        do {
            read = inputStream.read();
        } while (A02(read));
        if (read != -1) {
            while (true) {
                if (read == 40) {
                    while (true) {
                        int read2 = inputStream.read();
                        if (read2 != 92) {
                            if (read2 == 41 || read2 == -1) {
                                break;
                            }
                        } else {
                            inputStream.read();
                        }
                    }
                } else if (read == 60) {
                    do {
                    } while (inputStream.read() != 62);
                } else if (read == 91) {
                    A00(inputStream);
                } else if (read == 93 || read == -1) {
                    return;
                }
                read = inputStream.read();
            }
        }
    }

    public static boolean A01(int i2) {
        return i2 == 47 || i2 == 60 || i2 == 62 || i2 == 91 || i2 == 93 || i2 == 40 || i2 == 41 || i2 == -1;
    }

    public static boolean A02(int i2) {
        return i2 == 0 || i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r4 == 47) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        r1.append((char) r4);
        r4 = r7.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (A01(r4) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (A02(r4) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        r5 = r1.toString().trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A03(java.io.InputStream r7, int r8) {
        /*
            r6 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r8 > r0) goto L_0x00c7
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        L_0x0009:
            int r4 = r7.read()
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0014
            goto L_0x0009
        L_0x0014:
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0025
        L_0x001a:
            int r4 = r7.read()
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0025
            goto L_0x001a
        L_0x0025:
            r5 = -1
            if (r4 == r5) goto L_0x0032
            r1 = 62
            if (r4 != r1) goto L_0x0033
            int r0 = r7.read()
            if (r0 != r1) goto L_0x0033
        L_0x0032:
            return r2
        L_0x0033:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0038:
            char r0 = (char) r4
            r3.append(r0)
            int r4 = r7.read()
            boolean r0 = A01(r4)
            if (r0 != 0) goto L_0x004c
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0038
        L_0x004c:
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x005d
        L_0x0052:
            int r4 = r7.read()
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x005d
            goto L_0x0052
        L_0x005d:
            if (r4 == r5) goto L_0x0032
            r5 = 0
            r0 = 40
            if (r4 == r0) goto L_0x00a2
            r0 = 60
            if (r4 == r0) goto L_0x00b6
            r0 = 91
            if (r4 == r0) goto L_0x009e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 47
            if (r4 != r0) goto L_0x007d
        L_0x0075:
            char r0 = (char) r4
            r1.append(r0)
            int r4 = r7.read()
        L_0x007d:
            boolean r0 = A01(r4)
            if (r0 == 0) goto L_0x0075
            boolean r0 = A02(r4)
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = r1.toString()
            java.lang.String r5 = r0.trim()
        L_0x0091:
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = r0.trim()
            r2.put(r0, r5)
            goto L_0x0014
        L_0x009e:
            A00(r7)
            goto L_0x00c2
        L_0x00a2:
            int r1 = r7.read()
            r0 = 92
            if (r1 != r0) goto L_0x00ae
            r7.read()
            goto L_0x00a2
        L_0x00ae:
            r0 = 41
            if (r1 == r0) goto L_0x00c2
            r0 = -1
            if (r1 != r0) goto L_0x00a2
            goto L_0x00c2
        L_0x00b6:
            int r4 = r7.read()
            if (r4 != r0) goto L_0x0091
            int r0 = r8 + 1
            java.util.Map r5 = r6.A03(r7, r0)
        L_0x00c2:
            int r4 = r7.read()
            goto L_0x0091
        L_0x00c7:
            X.1wv r0 = new X.1wv
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41931wt.A03(java.io.InputStream, int):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw new X.C41951wv();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r7 = this;
            r5 = 0
            r7.A00 = r5
            r7.A03 = r5
            java.io.File r1 = r7.A02
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream
            r3.<init>(r0)
            X.4Qz r6 = r7.A01     // Catch:{ all -> 0x0051 }
            byte[] r4 = r6.A01     // Catch:{ all -> 0x0051 }
            java.util.Arrays.fill(r4, r5)     // Catch:{ all -> 0x0051 }
            r2 = 0
        L_0x0019:
            int r0 = r3.read()     // Catch:{ all -> 0x0051 }
            if (r0 < 0) goto L_0x004b
            byte r1 = (byte) r0     // Catch:{ all -> 0x0051 }
            int r0 = r6.A00     // Catch:{ all -> 0x0051 }
            r4[r0] = r1     // Catch:{ all -> 0x0051 }
            int r1 = r0 + 1
            r6.A00 = r1     // Catch:{ all -> 0x0051 }
            int r0 = r4.length     // Catch:{ all -> 0x0051 }
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x0051 }
            byte[] r0 = A07     // Catch:{ all -> 0x0051 }
            boolean r0 = r6.A00(r0)     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0043
            byte[] r0 = A05     // Catch:{ all -> 0x0051 }
            boolean r0 = r6.A00(r0)     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0043
            int r2 = r2 + 1
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 >= r0) goto L_0x004b
            goto L_0x0019
        L_0x0043:
            r0 = 1
            r7.A05(r3, r5, r0)     // Catch:{ all -> 0x0051 }
            r3.close()
            return
        L_0x004b:
            X.1wv r0 = new X.1wv     // Catch:{ all -> 0x0051 }
            r0.<init>()     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41931wt.A04():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0120 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x000a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.io.InputStream r10, int r11, boolean r12) {
        /*
            r9 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r11 <= r0) goto L_0x000a
            X.1wv r0 = new X.1wv
            r0.<init>()
            throw r0
        L_0x000a:
            int r0 = r10.read()
            r3 = -1
            if (r0 == r3) goto L_0x001b
            if (r12 == 0) goto L_0x001c
            byte[] r0 = A06
            boolean r0 = r9.A08(r10, r0)
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            int r2 = r10.read()
            boolean r0 = A02(r2)
            if (r0 != 0) goto L_0x001c
            if (r2 == r3) goto L_0x001b
            r5 = 0
        L_0x0029:
            if (r2 == r3) goto L_0x003b
            r1 = 60
            if (r2 != r1) goto L_0x00bf
            int r0 = r10.read()
            if (r0 != r1) goto L_0x00bf
            int r0 = r11 + 1
            java.util.Map r5 = r9.A03(r10, r0)
        L_0x003b:
            r9.A07(r5)
            if (r2 == r3) goto L_0x001b
            java.lang.String r0 = "/Type"
            java.lang.Object r4 = r5.get(r0)
            java.lang.String r0 = "/Pages"
            boolean r0 = r0.equals(r4)
            java.lang.String r6 = "pdfparser/numberformat/"
            r7 = 82
            r2 = 1
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "/Parent"
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = "/Count"
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.String r3 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00a4
            int r0 = r3.length()
            int r0 = r0 - r2
            char r0 = r3.charAt(r0)
            if (r0 != r7) goto L_0x00a4
            java.lang.String r1 = "pdfparser/indirectpagecount/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0089:
            java.lang.String r0 = "/Length"
            java.lang.Object r8 = r5.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r3 = 0
            if (r0 != 0) goto L_0x00dd
            int r0 = r8.length()
            int r0 = r0 - r2
            char r0 = r8.charAt(r0)
            if (r0 == r7) goto L_0x00dd
            goto L_0x00c5
        L_0x00a4:
            int r0 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00ab }
            r9.A00 = r0     // Catch:{ NumberFormatException -> 0x00ab }
            goto L_0x0089
        L_0x00ab:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x0089
        L_0x00bf:
            int r2 = r10.read()
            goto L_0x0029
        L_0x00c5:
            int r6 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x00ca }
            goto L_0x00de
        L_0x00ca:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0, r1)
        L_0x00dd:
            r6 = 0
        L_0x00de:
            java.lang.String r0 = "/ObjStm"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x012a
            byte[] r0 = A08
            r9.A08(r10, r0)
            int r1 = r10.read()
            r0 = 13
            if (r1 != r0) goto L_0x00f6
            r10.read()
        L_0x00f6:
            X.40T r4 = new X.40T
            r4.<init>(r10, r6)
            java.lang.String r0 = "/Filter"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "/FlateDecode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x012a
            java.util.zip.InflaterInputStream r0 = new java.util.zip.InflaterInputStream     // Catch:{ ZipException -> 0x0121, IOException -> 0x0137 }
            r0.<init>(r4)     // Catch:{ ZipException -> 0x0121, IOException -> 0x0137 }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ ZipException -> 0x0121, IOException -> 0x0137 }
            r1.<init>(r0)     // Catch:{ ZipException -> 0x0121, IOException -> 0x0137 }
            int r0 = r11 + 1
            r9.A05(r1, r0, r3)     // Catch:{ all -> 0x011c }
            r1.close()     // Catch:{ ZipException -> 0x0121, IOException -> 0x0137 }
            goto L_0x012e
        L_0x011c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0120 }
        L_0x0120:
            throw r0     // Catch:{ ZipException -> 0x0121, IOException -> 0x0137 }
        L_0x0121:
            r1 = move-exception
            java.lang.String r0 = "pdfparser/parseInput marking file as suspicious"
            com.whatsapp.util.Log.e(r0, r1)
            r9.A03 = r2
            goto L_0x012e
        L_0x012a:
            long r0 = (long) r6
            r10.skip(r0)
        L_0x012e:
            if (r12 == 0) goto L_0x000a
            byte[] r0 = A04
            r9.A08(r10, r0)
            goto L_0x000a
        L_0x0137:
            r1 = move-exception
            java.lang.String r0 = "pdfparser/parseInput "
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41931wt.A05(java.io.InputStream, int, boolean):void");
    }

    public final void A06(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            if (str.charAt(0) == '/' && str.indexOf(35) >= 0) {
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt != '#' || i2 > length - 3) {
                        sb.append(charAt);
                    } else {
                        try {
                            sb.append((char) Integer.parseInt(str.substring(i2 + 1, i2 + 3), 16));
                            i2 += 2;
                        } catch (NumberFormatException unused) {
                            sb.append(charAt);
                        }
                    }
                    i2++;
                }
                str = sb.toString();
            }
        }
        for (String equals : A09) {
            if (equals.equals(str)) {
                this.A03 = true;
                StringBuilder sb2 = new StringBuilder("pdfparser/checkname pdf contains suspicious name ");
                sb2.append(str);
                Log.i(sb2.toString());
            }
        }
    }

    public final void A07(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                A06((String) entry.getKey());
                Object value = entry.getValue();
                if (value instanceof String) {
                    A06((String) value);
                } else if (value instanceof Map) {
                    A07((Map) value);
                }
            }
        }
    }

    public final boolean A08(InputStream inputStream, byte[] bArr) {
        C86044Qz r3 = this.A01;
        byte[] bArr2 = r3.A01;
        Arrays.fill(bArr2, (byte) 0);
        do {
            int read = inputStream.read();
            if (read < 0) {
                return false;
            }
            byte b2 = (byte) read;
            int i2 = r3.A00;
            bArr2[i2] = b2;
            int i3 = i2 + 1;
            r3.A00 = i3;
            r3.A00 = i3 % bArr2.length;
        } while (!r3.A00(bArr));
        return true;
    }
}
