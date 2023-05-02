package X;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import com.facebook.superpack.AssetDecompressor;
import com.obwhatsapp.AbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: X.10L  reason: invalid class name */
public class AnonymousClass10L {
    public static final Integer[] A08 = {0, 1};
    public String A00;
    public String A01;
    public boolean A02 = false;
    public final AnonymousClass1C3 A03;
    public final C16320sq A04;
    public final HashMap A05 = new HashMap();
    public final Set A06 = new HashSet();
    public final AtomicBoolean A07 = new AtomicBoolean(true);

    public AnonymousClass10L(AnonymousClass1C3 r3, C16320sq r4) {
        this.A04 = r4;
        this.A03 = r3;
    }

    public final String A00(int i2) {
        if (i2 == 0) {
            String str = this.A00;
            if (str != null) {
                return str;
            }
            String[] strArr = {"arm64-v8a", "armeabi-v7a", "x86", "x86_64"};
            String str2 = strArr[AssetDecompressor.get_architecture()];
            this.A00 = str2;
            return str2;
        } else if (i2 == 1) {
            return "strings";
        } else {
            StringBuilder sb = new StringBuilder("Compressed folder not explicitly specified for assetType: ");
            sb.append(i2);
            throw new RuntimeException(sb.toString());
        }
    }

    public void A01(Context context) {
        boolean z2 = true;
        AnonymousClass00B.A0G(!"2.23.1.76".isEmpty());
        int i2 = AssetDecompressor.get_architecture();
        StringBuilder sb = new StringBuilder();
        sb.append("2.23.1.76");
        sb.append(":");
        sb.append(new String[]{"arm64-v8a", "armeabi-v7a", "x86", "x86_64"}[i2]);
        sb.append(":");
        sb.append(new File(context.getPackageCodePath()).lastModified() / 1000);
        this.A01 = sb.toString();
        this.A02 = true;
        AnonymousClass1C3 r3 = this.A03;
        if (!(i2 == 0 || i2 == 3)) {
            z2 = false;
        }
        r3.A01(new File(context.getFilesDir(), "decompressed/libs.spk.zst").getAbsolutePath(), z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r0 == false) goto L_0x007f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.util.HashMap r4 = r7.A05
            java.lang.Object r0 = r4.get(r9)
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x001a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.put(r9, r0)
            r1 = 0
        L_0x0019:
            return r1
        L_0x001a:
            java.util.Set r0 = r7.A06
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0026
            r4.put(r9, r2)
            return r1
        L_0x0026:
            java.io.File r2 = r8.getFilesDir()     // Catch:{ IOException -> 0x006e }
            java.lang.String r1 = "decompressed"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x006e }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x006e }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x006e }
            r1.<init>(r0, r9)     // Catch:{ IOException -> 0x006e }
            java.lang.String r0 = ".superpack_version"
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x006e }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x006e }
            long r1 = r6.length()     // Catch:{ IOException -> 0x006e }
            int r0 = (int) r1     // Catch:{ IOException -> 0x006e }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x006e }
            r5.<init>(r0)     // Catch:{ IOException -> 0x006e }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006e }
            r3.<init>(r6)     // Catch:{ IOException -> 0x006e }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0069 }
        L_0x0050:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x0069 }
            r0 = -1
            if (r1 == r0) goto L_0x005c
            r0 = 0
            r5.write(r2, r0, r1)     // Catch:{ all -> 0x0069 }
            goto L_0x0050
        L_0x005c:
            r3.close()     // Catch:{ IOException -> 0x006e }
            byte[] r0 = r5.toByteArray()     // Catch:{ IOException -> 0x006e }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x006e }
            r1.<init>(r0)     // Catch:{ IOException -> 0x006e }
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            throw r0     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            java.lang.String r1 = ""
        L_0x0070:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = r7.A01
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.put(r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10L.A02(android.content.Context, java.lang.String):boolean");
    }

    public boolean A03(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        sb.append(str);
        sb.append(".so");
        if (!new File(new File(new File(context.getFilesDir(), "decompressed"), AbstractAppShellDelegate.COMPRESSED_LIBS_ARCHIVE_NAME), sb.toString()).exists()) {
            StringBuilder sb2 = new StringBuilder("whatsappassetdecompressor/load-library-from-archive File missing: ");
            sb2.append(str);
            Log.w(sb2.toString());
            return false;
        }
        try {
            return SoLoader.A06(str);
        } catch (UnsatisfiedLinkError e2) {
            StringBuilder sb3 = new StringBuilder("whatsappassetdecompressor/load-library-from-archive error: ");
            sb3.append(str);
            Log.w(sb3.toString(), e2);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        if (r6.contains("libvlc.so") != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(android.content.Context r10, java.lang.String r11, int r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            r4 = r9
            boolean r0 = r9.A02
            X.AnonymousClass00B.A0G(r0)
            r5 = r10
            java.io.File r1 = r10.getFilesDir()
            java.lang.String r2 = "decompressed"
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            java.io.File r7 = new java.io.File
            r7.<init>(r0, r11)
            java.io.File r0 = r10.getFilesDir()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0034
            boolean r0 = r1.mkdir()
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "Could not create decompressed assets directory"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0034:
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x003d
            r7.mkdir()
        L_0x003d:
            if (r13 != 0) goto L_0x009c
            boolean r0 = r9.A02(r10, r11)
            if (r0 == 0) goto L_0x009c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.C31131dW.A00(r10)
        L_0x004d:
            if (r12 != 0) goto L_0x0093
            java.lang.String r1 = r9.A00
            if (r1 != 0) goto L_0x0074
            int r3 = com.facebook.superpack.AssetDecompressor.get_architecture()
            r0 = 4
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "arm64-v8a"
            r2[r1] = r0
            r1 = 1
            java.lang.String r0 = "armeabi-v7a"
            r2[r1] = r0
            r1 = 2
            java.lang.String r0 = "x86"
            r2[r1] = r0
            r1 = 3
            java.lang.String r0 = "x86_64"
            r2[r1] = r0
            r1 = r2[r3]
            r9.A00 = r1
        L_0x0074:
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "libwhatsapp.so"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "libvlc.so"
            boolean r0 = r6.contains(r0)
            r1 = 0
            if (r0 == 0) goto L_0x008e
        L_0x008d:
            r1 = 1
        L_0x008e:
            java.lang.String r0 = "libvlc.so needs to be co-located in armv7 builds, to avoid setting off a bug on some older x86 devices"
            X.AnonymousClass00B.A0D(r0, r1)
        L_0x0093:
            int r1 = r6.size()
            r0 = 0
            if (r1 <= 0) goto L_0x009b
            r0 = 1
        L_0x009b:
            return r0
        L_0x009c:
            java.lang.String r0 = "compressed/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r9.A00(r12)
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r2 = r1.toString()
            java.lang.String r0 = "."
            int r0 = r11.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r3 = r11.substring(r0)
            if (r14 != 0) goto L_0x00d1
            android.content.res.AssetManager r1 = r10.getAssets()     // Catch:{ AssetDecompressionException -> 0x0102 }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ AssetDecompressionException -> 0x0102 }
            java.lang.String[] r0 = com.facebook.superpack.AssetDecompressor.decompress(r1, r2, r3, r0)     // Catch:{ AssetDecompressionException -> 0x0102 }
            goto L_0x00e6
        L_0x00d1:
            android.content.res.AssetManager r0 = r10.getAssets()
            java.io.InputStream r2 = r0.open(r2)
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ AssetDecompressionException -> 0x010b }
            java.lang.String[] r0 = com.facebook.superpack.AssetDecompressor.decompress_legacy(r2, r3, r0)     // Catch:{ AssetDecompressionException -> 0x010b }
            if (r2 == 0) goto L_0x00e6
            r2.close()
        L_0x00e6:
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            X.0sq r0 = r9.A04     // Catch:{ all -> 0x0109 }
            r8 = 35
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0     // Catch:{ all -> 0x0109 }
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0109 }
            r0.Acl(r3)     // Catch:{ all -> 0x0109 }
            java.util.Set r0 = r9.A06
            r0.add(r11)
            goto L_0x004d
        L_0x0102:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0109:
            r1 = move-exception
            throw r1
        L_0x010b:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0112 }
            r0.<init>(r1)     // Catch:{ all -> 0x0112 }
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r0 = move-exception
            if (r2 == 0) goto L_0x0118
            r2.close()     // Catch:{ all -> 0x0118 }
        L_0x0118:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10L.A04(android.content.Context, java.lang.String, int, boolean, boolean):boolean");
    }

    public void A07(String str) {
        try {
            ZipFile zipFile = new ZipFile(str);
            if (!" ".equals(zipFile.getComment())) {
                Runtime.getRuntime().exit(0);
            }
            zipFile.close();
        } catch (Exception e2) {
        }
    }
}
