package X;

import android.media.MediaScannerConnection;
import com.facebook.redex.IDxFFilterShape3S1000000_2_I0;
import com.whatsapp.NativeMediaHandler;
import com.whatsapp.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0sb  reason: invalid class name and case insensitive filesystem */
public class C16180sb {
    public static SimpleDateFormat A06 = new SimpleDateFormat("yyyyww", Locale.US);
    public static final String A07;
    public static final String A08;
    public static final String A09;
    public static final String A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public static final String A0F;
    public static final String A0G;
    public C33841jH A00;
    public final NativeMediaHandler A01;
    public final C16190sc A02;
    public final C16980tz A03;
    public final C16510tB A04;
    public final Object A05 = new Object();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("OBWhatsApp");
        sb.append(" Audio");
        A09 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("OBWhatsApp");
        sb2.append(" Animated Gifs");
        A08 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("OBWhatsApp");
        sb3.append(" Voice Notes");
        A0G = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("OBWhatsApp");
        sb4.append(" Video");
        A0F = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("OBWhatsApp");
        sb5.append(" Images");
        A0C = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("OBWhatsApp");
        sb6.append(" Documents");
        A0B = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("OBWhatsApp");
        sb7.append(" Profile Photos");
        A0D = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append("OBWhatsApp");
        sb8.append(" Calls");
        A0A = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append("OBWhatsApp");
        sb9.append(" Stickers");
        A0E = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append("OBWhatsApp");
        sb10.append(" History Sync");
        A07 = sb10.toString();
    }

    public C16180sb(NativeMediaHandler nativeMediaHandler, C16190sc r3, C16980tz r4, C16510tB r5) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = nativeMediaHandler;
        this.A04 = r5;
    }

    public static File A00(File file, String str) {
        boolean z2 = false;
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                z2 = true;
            }
        }
        if (!z2 && !file.mkdirs()) {
            Log.e("app/extsharedfile/folder/created/false");
        }
        return new File(file, str);
    }

    public static final File A01(File file, String str, String str2, String str3) {
        String name;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace(IOUtils.DIR_SEPARATOR_UNIX, '-'));
            sb.append(str3);
            name = sb.toString();
        } else if (str2 != null) {
            name = new File(str2).getName();
        } else {
            Log.e("fmessageio/getDownloadFile/no_url");
            return null;
        }
        return A00(file, name);
    }

    public static synchronized String A02(File file, String str) {
        String obj;
        boolean z2;
        synchronized (C16180sb.class) {
            String l2 = Long.toString(System.currentTimeMillis(), 36);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(l2);
            obj = sb.toString();
            File[] listFiles = file.listFiles(new IDxFFilterShape3S1000000_2_I0(obj, 0));
            if (listFiles != null) {
                do {
                    z2 = false;
                    for (File name : listFiles) {
                        if (name.getName().equals(obj)) {
                            StringBuilder sb2 = new StringBuilder();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            sb3.append("-");
                            sb3.append(l2);
                            sb2.append(sb3.toString());
                            sb2.append(UUID.randomUUID().toString());
                            obj = sb2.toString();
                            z2 = true;
                        }
                    }
                } while (z2);
            }
        }
        return obj;
    }

    public static void A03(File file) {
        AnonymousClass1XI.A0N(file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r3.isDirectory() != false) goto L_0x0030;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(java.io.File r3, boolean r4) {
        /*
            boolean r0 = r3.exists()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r3.isFile()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x002a
            r3.delete()     // Catch:{ all -> 0x005b }
        L_0x000f:
            boolean r0 = r3.mkdirs()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r1.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "fmessageio/prepareFolder/mkdirs failed: "
            r1.append(r0)     // Catch:{ all -> 0x005b }
            r1.append(r3)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x005b }
            goto L_0x0030
        L_0x002a:
            boolean r0 = r3.isDirectory()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x000f
        L_0x0030:
            if (r4 == 0) goto L_0x005a
            java.lang.String r0 = ".nomedia"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x005b }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x005b }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x005a
            r1.createNewFile()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0059
        L_0x0043:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r1.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "fmessageio/prepareFolder "
            r1.append(r0)     // Catch:{ all -> 0x005b }
            r1.append(r3)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005b }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x005b }
            goto L_0x005a
        L_0x0059:
            return
        L_0x005a:
            return
        L_0x005b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16180sb.A04(java.io.File, boolean):void");
    }

    public C33841jH A05() {
        C33841jH r0;
        synchronized (this.A05) {
            if (this.A00 == null) {
                Log.i("fmessageio/media-dirs-null");
                A0Q();
            }
            r0 = this.A00;
            AnonymousClass00B.A06(r0);
        }
        return r0;
    }

    public File A06() {
        return new File(this.A03.A00.getFilesDir(), "business_activity_report.zip");
    }

    public File A07() {
        File file = new File(this.A03.A00.getCacheDir(), "export_chats");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A08() {
        File file = new File(this.A03.A00.getCacheDir(), "export_business_activity");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A09() {
        File file = new File(this.A03.A00.getCacheDir(), "export_gdpr");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0A() {
        File file = new File(this.A03.A00.getFilesDir(), "Payment Backgrounds");
        A04(file, false);
        return file;
    }

    public File A0B() {
        File file = new File(this.A03.A00.getFilesDir(), "Stickers");
        A04(file, false);
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        if (r9 != 3) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0C(byte r7, int r8, int r9) {
        /*
            r6 = this;
            X.1jH r1 = r6.A05()
            r2 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r7 == r3) goto L_0x00ab
            if (r7 == r4) goto L_0x0087
            if (r7 == r5) goto L_0x0073
            r0 = 9
            if (r7 == r0) goto L_0x0061
            r0 = 13
            if (r7 == r0) goto L_0x0052
            r0 = 20
            if (r7 == r0) goto L_0x004f
            r0 = 23
            if (r7 == r0) goto L_0x00ab
            r0 = 37
            if (r7 == r0) goto L_0x00ab
            r0 = 65
            if (r7 == r0) goto L_0x00c3
            r0 = 25
            if (r7 == r0) goto L_0x00ab
            r0 = 26
            if (r7 == r0) goto L_0x0061
            r0 = 28
            if (r7 == r0) goto L_0x0073
            r0 = 29
            if (r7 == r0) goto L_0x0052
            r0 = 42
            if (r7 == r0) goto L_0x004c
            r0 = 43
            if (r7 == r0) goto L_0x004c
        L_0x003e:
            X.0sc r0 = r6.A02
            java.io.File r1 = r0.A04()
        L_0x0044:
            if (r9 == r4) goto L_0x0048
            if (r9 != r5) goto L_0x00c1
        L_0x0048:
            A04(r1, r3)
            return r1
        L_0x004c:
            java.io.File r1 = r1.A08
            goto L_0x0044
        L_0x004f:
            java.io.File r1 = r1.A04
            goto L_0x0044
        L_0x0052:
            if (r9 == r3) goto L_0x005e
            if (r9 == r4) goto L_0x005b
            if (r9 != r5) goto L_0x003e
            java.io.File r1 = r1.A0H
            goto L_0x0048
        L_0x005b:
            java.io.File r1 = r1.A0B
            goto L_0x0048
        L_0x005e:
            java.io.File r1 = r1.A00
            goto L_0x00c1
        L_0x0061:
            r0 = 7
            if (r8 != r0) goto L_0x0067
            java.io.File r1 = r1.A0D
            goto L_0x0044
        L_0x0067:
            if (r9 == r3) goto L_0x00bf
            if (r9 == r4) goto L_0x0070
            if (r9 != r5) goto L_0x003e
            java.io.File r1 = r1.A0J
            goto L_0x0048
        L_0x0070:
            java.io.File r1 = r1.A0D
            goto L_0x0048
        L_0x0073:
            if (r9 == r3) goto L_0x0084
            if (r9 == r4) goto L_0x0081
            if (r9 == r5) goto L_0x007e
            if (r9 != r2) goto L_0x003e
            java.io.File r1 = r1.A07
            goto L_0x00c1
        L_0x007e:
            java.io.File r1 = r1.A0L
            goto L_0x0048
        L_0x0081:
            java.io.File r1 = r1.A0F
            goto L_0x0048
        L_0x0084:
            java.io.File r1 = r1.A0N
            goto L_0x00c1
        L_0x0087:
            if (r8 != r3) goto L_0x009c
            java.io.File r2 = r1.A0O
            java.text.SimpleDateFormat r1 = A06
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r1.format(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            goto L_0x0044
        L_0x009c:
            if (r9 == r3) goto L_0x00a8
            if (r9 == r4) goto L_0x00a5
            if (r9 != r5) goto L_0x003e
            java.io.File r1 = r1.A0I
            goto L_0x0048
        L_0x00a5:
            java.io.File r1 = r1.A0C
            goto L_0x0048
        L_0x00a8:
            java.io.File r1 = r1.A01
            goto L_0x00c1
        L_0x00ab:
            if (r9 == r3) goto L_0x00bc
            if (r9 == r4) goto L_0x00b9
            if (r9 == r5) goto L_0x00b6
            if (r9 != r2) goto L_0x003e
            java.io.File r1 = r1.A06
            goto L_0x00c1
        L_0x00b6:
            java.io.File r1 = r1.A0K
            goto L_0x0048
        L_0x00b9:
            java.io.File r1 = r1.A0E
            goto L_0x0048
        L_0x00bc:
            java.io.File r1 = r1.A05
            goto L_0x00c1
        L_0x00bf:
            java.io.File r1 = r1.A02
        L_0x00c1:
            r3 = 0
            goto L_0x0048
        L_0x00c3:
            java.io.File r1 = r6.A0A()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16180sb.A0C(byte, int, int):java.io.File");
    }

    public File A0D(AnonymousClass1XK r5, String str, String str2, String str3, boolean z2, boolean z3) {
        File file;
        File filesDir;
        String str4;
        if (z2) {
            filesDir = this.A03.A00.getFilesDir();
            str4 = "gdpr.zip.enc.tmp";
        } else if (z3) {
            filesDir = this.A03.A00.getFilesDir();
            str4 = "business_activity_report.zip.enc.tmp";
        } else if (AnonymousClass1XK.A0P == r5) {
            filesDir = this.A03.A00.getFilesDir();
            str4 = "payment_background_img.enc.tmp";
        } else {
            if (AnonymousClass1XK.A0K == r5) {
                file = new File(this.A03.A00.getFilesDir(), A07);
                A04(file, false);
            } else {
                file = A05().A03;
                A04(file, true);
                if (str != null) {
                    return A01(file, str, str3, ".enc.tmp");
                }
            }
            return A01(file, str2, str3, ".enc.tmp");
        }
        return new File(filesDir, str4);
    }

    public File A0E(AnonymousClass1XK r7, String str, String str2, boolean z2, boolean z3, boolean z4) {
        File file;
        boolean z5;
        File filesDir;
        String str3;
        if (z2) {
            filesDir = this.A03.A00.getFilesDir();
            str3 = "gdpr.zip.tmp";
        } else if (z3) {
            filesDir = this.A03.A00.getFilesDir();
            str3 = "business_activity_report.zip.tmp";
        } else {
            if (AnonymousClass1XK.A0K == r7) {
                file = new File(this.A03.A00.getFilesDir(), A07);
                z5 = false;
            } else if (AnonymousClass1XK.A0P == r7) {
                filesDir = this.A03.A00.getFilesDir();
                str3 = "payment_background_img.tmp";
            } else if (z4) {
                String l2 = Long.toString(System.currentTimeMillis(), 36);
                File file2 = A05().A09;
                StringBuilder sb = new StringBuilder();
                String str4 = r7.A02;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append("-");
                sb2.append(l2);
                sb.append(sb2.toString());
                sb.append(".tmp");
                return new File(file2, sb.toString());
            } else {
                file = A05().A03;
                z5 = true;
            }
            A04(file, z5);
            return A01(file, str, str2, ".tmp");
        }
        return new File(filesDir, str3);
    }

    public File A0F(C16730tY r5) {
        if (C16030sJ.A0K(r5.A11.A00)) {
            return new File(this.A03.A00.getFilesDir(), "gdpr.zip.tmp");
        }
        File file = A05().A03;
        A04(file, true);
        return A01(file, r5.A05, r5.A08, ".tmp");
    }

    public File A0G(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(".chck");
        return A0N(sb.toString());
    }

    public File A0H(String str) {
        return new File(this.A03.A00.getFilesDir(), "personal".equals(str) ? "dyi.zip" : "business_dyi.zip");
    }

    public File A0I(String str) {
        File A072 = A07();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".txt");
        return new File(A072, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0J(String str) {
        File A082 = A08();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A082, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0K(String str) {
        File file = new File(this.A03.A00.getCacheDir(), "personal".equals(str) ? "export_personal_dyi" : "export_business_dyi");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0L(String str) {
        File A092 = A09();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A092, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0M(String str) {
        File file = new File(this.A03.A00.getCacheDir(), "support");
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(file, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0N(String str) {
        File file = A05().A03;
        A04(file, true);
        return A00(file, str);
    }

    public File A0O(String str, String str2) {
        File A0K = A0K(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0K, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0P(String str, String str2) {
        File A072 = this.A02.A07(".StickerThumbs");
        A04(A072, false);
        return A01(A072, str, str2, ".thumb.webp");
    }

    public void A0Q() {
        synchronized (this.A05) {
            Log.i("fmessageio/initExternalStorageDirectory");
            this.A00 = new C33841jH(this);
        }
    }

    public final void A0R(File file) {
        File[] listFiles;
        File file2 = new File(file, ".nomedia");
        if (file2.exists() && file2.delete() && (listFiles = file.listFiles()) != null) {
            A0S((Runnable) null, Arrays.asList(listFiles));
        }
    }

    public void A0S(Runnable runnable, List list) {
        int size = list.size();
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = ((File) list.get(i2)).getAbsolutePath();
        }
        MediaScannerConnection.scanFile(this.A03.A00, strArr, (String[]) null, new C33851jI(runnable, new AtomicInteger(size)));
    }

    public boolean A0T(File file) {
        return file.getCanonicalPath().startsWith(A05().A0A.getCanonicalPath());
    }

    public boolean A0U(File file) {
        return file.getCanonicalPath().startsWith(A05().A03.getCanonicalPath()) || file.getCanonicalPath().startsWith(A05().A09.getCanonicalPath());
    }

    public boolean A0V(File file) {
        return file.getCanonicalPath().startsWith(A05().A08.getCanonicalPath());
    }

    public boolean A0W(File file) {
        if (!A0T(file)) {
            return false;
        }
        String canonicalPath = file.getCanonicalPath();
        C33841jH A052 = A05();
        return !canonicalPath.startsWith(A052.A0H.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0I.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0J.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0K.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0L.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0M.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0B.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0C.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0D.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0E.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0F.getCanonicalPath()) && !canonicalPath.startsWith(A052.A04.getCanonicalPath()) && !canonicalPath.startsWith(A052.A0O.getCanonicalPath());
    }
}
