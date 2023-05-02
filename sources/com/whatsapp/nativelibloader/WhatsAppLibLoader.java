package com.whatsapp.nativelibloader;

import X.AnonymousClass10L;
import X.AnonymousClass1C1;
import X.AnonymousClass1C2;
import X.C14730pf;
import X.C15860rz;
import X.C16300so;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.superpack.AssetDecompressor;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Map;

public class WhatsAppLibLoader {
    public static final String[] A08 = new String[0];
    public static final String[] A09 = {"vlc", "whatsapp", "curve25519"};
    public Boolean A00 = null;
    public Map A01 = null;
    public final C16300so A02;
    public final AnonymousClass1C2 A03;
    public final C15860rz A04;
    public final C14730pf A05;
    public final AnonymousClass1C1 A06;
    public final AnonymousClass10L A07;

    public WhatsAppLibLoader(C16300so r2, AnonymousClass1C2 r3, C15860rz r4, C14730pf r5, AnonymousClass1C1 r6, AnonymousClass10L r7) {
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
        this.A07 = r7;
        this.A06 = r6;
        this.A03 = r3;
    }

    public static final boolean A00() {
        String str;
        byte[] bArr = new byte[3];
        try {
            testLibraryUsable(bArr);
            if (!Arrays.equals(new byte[]{31, 41, 59}, bArr)) {
                Log.w("whatsapplibloader/usable test array does not match");
                return false;
            }
            try {
                String jNICodeVersion = getJNICodeVersion();
                StringBuilder sb = new StringBuilder();
                sb.append("whatsapplibloader/usable jniVersion: ");
                sb.append(jNICodeVersion);
                Log.i(sb.toString());
                if (!"2.23.1.76".equals(jNICodeVersion)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("whatsapplibloader/usable version does not match. JAVA version: ");
                    sb2.append("2.23.1.76");
                    sb2.append(", JNI version: ");
                    sb2.append(jNICodeVersion);
                    Log.w(sb2.toString());
                    return false;
                }
                Log.i("whatsapplibloader/usable isLibraryUsable: True");
                return true;
            } catch (UnsatisfiedLinkError e2) {
                e = e2;
                str = "whatsapplibloader/usable error while testing library usability getJNICodeVersion";
                Log.w(str, e);
                return false;
            }
        } catch (UnsatisfiedLinkError e3) {
            e = e3;
            str = "whatsapplibloader/usable error while testing library usability testLibraryUsable";
            Log.w(str, e);
            return false;
        }
    }

    public static native String getJNICodeVersion();

    public static native void testLibraryUsable(byte[] bArr);

    public final void A01(Context context, String str) {
        StringBuilder sb = new StringBuilder("whatsapplibloader/system-load-library-with-install start, loading: ");
        sb.append(str);
        Log.i(sb.toString());
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e2) {
            Log.w("whatsapplibloader/system-load-library-with-install error", e2);
            A02(context, Arrays.asList(new String[]{str}));
        }
        Log.i("whatsapplibloader/system-load-library-with-install end");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0135 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x013c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A02(android.content.Context r12, java.util.List r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e6 }
            r1.<init>()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "whatsapplibloader/try-install start, loading: "
            r1.append(r0)     // Catch:{ all -> 0x01e6 }
            int r0 = r13.size()     // Catch:{ all -> 0x01e6 }
            r1.append(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01e6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01e6 }
            java.lang.String r4 = X.AnonymousClass1U8.A02()     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "armeabi-v7"
            boolean r0 = r4.startsWith(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.String r2 = "x86"
            java.lang.String r3 = "x86_64"
            java.lang.String r1 = "arm64-v8a"
            if (r0 == 0) goto L_0x0043
            java.lang.String r2 = "armeabi-v7a"
        L_0x0030:
            java.lang.String r1 = "whatsapplibloader/arch resolved to "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e6 }
            r0.append(r2)     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01e6 }
            goto L_0x006e
        L_0x0043:
            boolean r0 = r4.startsWith(r1)     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x004b
            r2 = r1
            goto L_0x0030
        L_0x004b:
            boolean r0 = r4.startsWith(r3)     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x0053
            r2 = r3
            goto L_0x0030
        L_0x0053:
            boolean r0 = r4.startsWith(r2)     // Catch:{ all -> 0x01e6 }
            if (r0 != 0) goto L_0x0030
            java.lang.String r1 = "can not find lib folder for ABI "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e6 }
            r0.append(r4)     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e6 }
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x01e6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01e6 }
            goto L_0x01e5
        L_0x006e:
            java.lang.String r0 = r12.getPackageCodePath()     // Catch:{ IOException -> 0x01d7 }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x01d7 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x01d7 }
            java.util.Map r0 = r11.A01     // Catch:{ all -> 0x01d2 }
            if (r0 != 0) goto L_0x0140
            r0 = 8
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x01d2 }
            r6.<init>(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "lib/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d2 }
            r1.append(r2)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "/lib"
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x01d2 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r0]     // Catch:{ all -> 0x01d2 }
            java.util.Enumeration r10 = r4.entries()     // Catch:{ all -> 0x01d2 }
        L_0x009d:
            boolean r0 = r10.hasMoreElements()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x013d
            java.lang.Object r8 = r10.nextElement()     // Catch:{ all -> 0x01d2 }
            java.util.zip.ZipEntry r8 = (java.util.zip.ZipEntry) r8     // Catch:{ all -> 0x01d2 }
            java.lang.String r2 = r8.getName()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = ".so"
            boolean r0 = r2.endsWith(r0)     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x009d
            java.lang.String r1 = "whatsapplibloader/extractLibs found "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d2 }
            r0.append(r2)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01d2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01d2 }
            boolean r0 = r2.startsWith(r5)     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = "/"
            java.lang.String[] r1 = r2.split(r0)     // Catch:{ all -> 0x01d2 }
            int r0 = r1.length     // Catch:{ all -> 0x01d2 }
            int r0 = r0 + -1
            r7 = r1[r0]     // Catch:{ all -> 0x01d2 }
            java.io.File r0 = r12.getFilesDir()     // Catch:{ all -> 0x01d2 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x01d2 }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "libunwindstack.so"
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x00ed
            r2.delete()     // Catch:{ all -> 0x01d2 }
            goto L_0x009d
        L_0x00ed:
            java.io.InputStream r9 = r4.getInputStream(r8)     // Catch:{ all -> 0x01d2 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x0136 }
            r8.<init>(r2)     // Catch:{ all -> 0x0136 }
        L_0x00f6:
            int r1 = r9.read(r3)     // Catch:{ all -> 0x0131 }
            if (r1 <= 0) goto L_0x0101
            r0 = 0
            r8.write(r3, r0, r1)     // Catch:{ all -> 0x0131 }
            goto L_0x00f6
        L_0x0101:
            r8.close()     // Catch:{ all -> 0x0136 }
            r9.close()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "whatsapplibloader/extractLibs copied "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ all -> 0x01d2 }
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = " from apk"
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01d2 }
            int r1 = r7.length()     // Catch:{ all -> 0x01d2 }
            r0 = 3
            int r1 = r1 - r0
            java.lang.String r0 = r7.substring(r0, r1)     // Catch:{ all -> 0x01d2 }
            r6.put(r0, r2)     // Catch:{ all -> 0x01d2 }
            goto L_0x009d
        L_0x0131:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0135 }
        L_0x0135:
            throw r0     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            if (r9 == 0) goto L_0x013c
            r9.close()     // Catch:{ all -> 0x013c }
        L_0x013c:
            throw r0     // Catch:{ all -> 0x01d2 }
        L_0x013d:
            r11.A01 = r6     // Catch:{ all -> 0x01d2 }
            goto L_0x0146
        L_0x0140:
            java.lang.String r0 = "whatsapplibloader/try-install No need to extract libs again"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01d2 }
        L_0x0146:
            java.util.Map r0 = r11.A01     // Catch:{ all -> 0x01d2 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x01d2 }
            r2.<init>(r13)     // Catch:{ all -> 0x01d2 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x01d2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x0155:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01d2 }
            r2.remove(r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x0155
        L_0x0165:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01ba
            java.util.Map r3 = r11.A01     // Catch:{ all -> 0x01d2 }
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ all -> 0x01d2 }
            r2.<init>()     // Catch:{ all -> 0x01d2 }
            java.util.Iterator r1 = r13.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x0176:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01d2 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x01d2 }
            r2.add(r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x0176
        L_0x0188:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x018c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x01d2 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x01d2 }
            java.lang.String r2 = r0.getAbsolutePath()     // Catch:{ all -> 0x01d2 }
            java.lang.System.load(r2)     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "whatsapplibloader/try-install loaded: "
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            r1.append(r2)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x018c
        L_0x01b5:
            r4.close()     // Catch:{ IOException -> 0x01d7 }
            monitor-exit(r11)
            return
        L_0x01ba:
            java.lang.String r0 = "Libraries not found: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01d2 }
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d2 }
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x01d2 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d2 }
            throw r0     // Catch:{ all -> 0x01d2 }
        L_0x01d2:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01d6 }
        L_0x01d6:
            throw r0     // Catch:{ IOException -> 0x01d7 }
        L_0x01d7:
            r1 = move-exception
            java.lang.String r0 = "whatsapplibloader/try-install ioerror"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "IOException when install native library"
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x01e6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01e6 }
        L_0x01e5:
            throw r1     // Catch:{ all -> 0x01e6 }
        L_0x01e6:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nativelibloader.WhatsAppLibLoader.A02(android.content.Context, java.util.List):void");
    }

    public synchronized boolean A03() {
        boolean z2;
        if (this.A00 == null) {
            Log.e("whatsapplibloader/is-loaded: isLoaded() was called before load was attempted");
        }
        z2 = false;
        if (this.A00 == Boolean.TRUE) {
            z2 = true;
        }
        return z2;
    }

    public boolean A04(Context context) {
        try {
            A01(context, "superpack");
            byte[] bArr = new byte[3];
            try {
                AssetDecompressor.testDecompressorLibraryUsable(bArr);
                if (!Arrays.equals(new byte[]{71, 119, 83}, bArr)) {
                    Log.w("whatsappassetdecompressor/usable compressor test array does not match");
                    return false;
                }
                Log.i("whatsappassetdecompressor/decompressor-usable isLibraryUsable: True");
                return true;
            } catch (UnsatisfiedLinkError e2) {
                Log.w("whatsappassetdecompressor/decompressor-usable error while testing compressor library usability testLibraryUsable", e2);
                return false;
            }
        } catch (UnsatisfiedLinkError e3) {
            StringBuilder sb = new StringBuilder("whatsapplibloader/compression library is corrupt/");
            sb.append(e3);
            Log.i(sb.toString());
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            StringBuilder sb2 = new StringBuilder("whatsapplibloader/load-startup-libs: install source ");
            sb2.append("com.android.vending");
            Log.i(sb2.toString());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A05(android.content.Context r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x011f }
            r5 = 1
            r8 = 0
            java.lang.Boolean r0 = r9.A00     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            if (r0 != 0) goto L_0x00a5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r9.A00 = r0     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            X.10L r7 = r9.A07     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            java.lang.String r0 = "libs.spk.zst"
            boolean r0 = r7.A02(r10, r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            if (r0 == 0) goto L_0x008a
            X.C31131dW.A00(r10)     // Catch:{ IOException -> 0x008a }
            java.lang.String[] r6 = A09     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            int r3 = r6.length     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r2 = 0
        L_0x001f:
            if (r2 >= r3) goto L_0x002f
            r1 = r6[r2]     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            boolean r0 = r7.A03(r10, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            if (r0 != 0) goto L_0x002c
            r9.A01(r10, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x002f:
            java.lang.String[] r4 = A08     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            int r3 = r4.length     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r2 = 0
        L_0x0033:
            if (r2 >= r3) goto L_0x0057
            r1 = r4[r2]     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            boolean r0 = r7.A03(r10, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "whatsapplibloader/system-load-optional-library start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            java.lang.System.loadLibrary(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0047 }
            goto L_0x004e
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "whatsapplibloader/load-optional-library error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
        L_0x004e:
            java.lang.String r0 = "whatsapplibloader/system-load-optional-library end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0057:
            boolean r0 = A00()     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "whatsapplibloader/load-startup-libs unable to use loaded libraries; trying install direct from apk"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            java.util.List r0 = java.util.Arrays.asList(r6)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r9.A02(r10, r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            java.lang.String r0 = "whatsapplibloader/load-startup-libs install direct from apk worked; retesting library usability"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            boolean r0 = A00()     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "whatsapplibloader/load-startup-libs library usability still broken; throwing to corrupt installation activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            java.lang.String r1 = "unable to use libraries despite successful install directly from apk"
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            goto L_0x00b0
        L_0x0085:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r9.A00 = r0     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            goto L_0x00b1
        L_0x008a:
            java.lang.String r0 = "whatsappsoloader/decompression failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            X.1C1 r3 = r9.A06     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r2.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r1 = 6
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r0.<init>(r10, r1, r3)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r2.post(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            goto L_0x011b
        L_0x00a5:
            boolean r0 = r0.booleanValue()     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            if (r0 != 0) goto L_0x00b1
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
            r0.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
        L_0x00b0:
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r9)
            return r5
        L_0x00b3:
            r3 = move-exception
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ all -> 0x011f }
            java.lang.String r0 = r10.getPackageName()     // Catch:{ all -> 0x011f }
            java.lang.String r2 = "com.android.vending"
            java.lang.String r1 = "whatsapplibloader/load-startup-libs: install source "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r0.<init>(r1)     // Catch:{ all -> 0x011f }
            r0.append(r2)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x011f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x011f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r2.<init>()     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "whatsapplibloader/load-startup-libs: available internal storage: "
            r2.append(r0)     // Catch:{ all -> 0x011f }
            X.0pf r0 = r9.A05     // Catch:{ all -> 0x011f }
            long r0 = r0.A02()     // Catch:{ all -> 0x011f }
            r2.append(r0)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x011f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "OBWhatsAppLibLoader/loadStartupLibs"
            com.whatsapp.util.Log.e(r4, r3)     // Catch:{ all -> 0x011f }
            X.0rz r3 = r9.A04     // Catch:{ all -> 0x011d }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r2 = "corrupt_installation_reported_timestamp"
            boolean r0 = r3.A1n(r2, r0)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x0107
            X.0so r1 = r9.A02     // Catch:{ all -> 0x011d }
            java.lang.String r0 = "native libraries are missing"
            r1.AcB(r4, r0, r5)     // Catch:{ all -> 0x011d }
            r3.A0x(r2)     // Catch:{ all -> 0x011d }
        L_0x0107:
            X.1C1 r3 = r9.A06     // Catch:{ all -> 0x011f }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x011f }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x011f }
            r2.<init>(r0)     // Catch:{ all -> 0x011f }
            r1 = 6
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7     // Catch:{ all -> 0x011f }
            r0.<init>(r10, r1, r3)     // Catch:{ all -> 0x011f }
            r2.post(r0)     // Catch:{ all -> 0x011f }
        L_0x011b:
            monitor-exit(r9)
            return r8
        L_0x011d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x011f }
        L_0x011f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nativelibloader.WhatsAppLibLoader.A05(android.content.Context):boolean");
    }
}
