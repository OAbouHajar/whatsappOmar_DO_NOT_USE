package com.facebook.soloader;

import X.AnonymousClass1C4;
import X.C31181de;
import X.C31191df;
import X.C31221dk;
import X.C31281dr;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {
    public static boolean A00 = true;
    public static int A01;
    public static int A02;
    public static C31191df A03;
    public static AnonymousClass1C4 A04;
    public static C31221dk[] A05;
    public static final HashSet A06 = new HashSet();
    public static final Map A07 = new HashMap();
    public static final Set A08 = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final AtomicInteger A09 = new AtomicInteger(0);
    public static final ReentrantReadWriteLock A0A = new ReentrantReadWriteLock();
    public static final boolean A0B;
    public static final String[] A0C = {System.mapLibraryName("breakpad")};
    public static volatile C31181de[] A0D;

    static {
        boolean z2 = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z2 = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        A0B = z2;
    }

    public static int A00() {
        ReentrantReadWriteLock reentrantReadWriteLock = A0A;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i2 = A02;
            int i3 = 0;
            if ((i2 & 2) != 0) {
                i3 = 1;
            }
            if ((i2 & 256) != 0) {
                i3 |= 4;
            }
            return i3;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x019f A[Catch:{ Exception -> 0x014a, all -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d1 A[Catch:{ Exception -> 0x014a, all -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03a4 A[Catch:{ Exception -> 0x014a, all -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03ec A[Catch:{ Exception -> 0x014a, all -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03df A[EDGE_INSN: B:235:0x03df->B:193:0x03df ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r19, X.AnonymousClass1C4 r20, java.lang.String[] r21, int r22) {
        /*
            r15 = r20
            r7 = r22
            boolean r0 = A03()
            if (r0 != 0) goto L_0x0467
            android.os.StrictMode$ThreadPolicy r14 = android.os.StrictMode.allowThreadDiskWrites()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0462 }
            r3 = 1
            r0 = 23
            r5 = r19
            if (r1 < r0) goto L_0x004d
            r4 = 0
            java.lang.String r4 = r5.getPackageName()     // Catch:{ Exception -> 0x0034 }
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ Exception -> 0x0034 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r4, r0)     // Catch:{ Exception -> 0x0034 }
            android.os.Bundle r1 = r0.metaData     // Catch:{ Exception -> 0x0034 }
            if (r1 == 0) goto L_0x004d
            java.lang.String r0 = "com.facebook.soloader.enabled"
            boolean r0 = r1.getBoolean(r0, r3)     // Catch:{ all -> 0x0462 }
            if (r0 != 0) goto L_0x004d
            r3 = 0
            goto L_0x004d
        L_0x0034:
            r2 = move-exception
            java.lang.String r0 = "Unexpected issue with package manager ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0462 }
            r1.<init>(r0)     // Catch:{ all -> 0x0462 }
            r1.append(r4)     // Catch:{ all -> 0x0462 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x0462 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0462 }
            java.lang.String r0 = "SoLoader"
            android.util.Log.w(r0, r1, r2)     // Catch:{ all -> 0x0462 }
        L_0x004d:
            A00 = r3     // Catch:{ all -> 0x0462 }
            java.lang.String r1 = "SoLoader"
            if (r3 == 0) goto L_0x042a
            int r3 = A01     // Catch:{ all -> 0x0462 }
            if (r3 != 0) goto L_0x0090
            r0 = r22 & 32
            r3 = 1
            if (r0 != 0) goto L_0x0090
            if (r19 == 0) goto L_0x0090
            android.content.pm.ApplicationInfo r6 = r5.getApplicationInfo()     // Catch:{ all -> 0x0462 }
            int r4 = r6.flags     // Catch:{ all -> 0x0462 }
            r0 = r4 & 1
            r2 = 3
            if (r0 == 0) goto L_0x006f
            r0 = r4 & 128(0x80, float:1.794E-43)
            r3 = 2
            if (r0 == 0) goto L_0x006f
            r3 = 3
        L_0x006f:
            boolean r0 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0462 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "ApplicationInfo.flags is: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0462 }
            r2.<init>(r0)     // Catch:{ all -> 0x0462 }
            int r0 = r6.flags     // Catch:{ all -> 0x0462 }
            r2.append(r0)     // Catch:{ all -> 0x0462 }
            java.lang.String r0 = " appType is: "
            r2.append(r0)     // Catch:{ all -> 0x0462 }
            r2.append(r3)     // Catch:{ all -> 0x0462 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0462 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0462 }
        L_0x0090:
            A01 = r3     // Catch:{ all -> 0x0462 }
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00a4
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0462 }
            r0 = 23
            if (r2 < r0) goto L_0x00a4
            boolean r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.A00(r5, r3)     // Catch:{ all -> 0x0462 }
            if (r0 == 0) goto L_0x00a4
            r7 = r22 | 72
        L_0x00a4:
            java.lang.Class<com.facebook.soloader.SoLoader> r11 = com.facebook.soloader.SoLoader.class
            monitor-enter(r11)     // Catch:{ all -> 0x0462 }
            if (r20 != 0) goto L_0x0118
            X.1C4 r0 = A04     // Catch:{ all -> 0x0427 }
            if (r0 != 0) goto L_0x011a
            java.lang.Runtime r16 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0427 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0427 }
            r19 = 0
            r0 = 23
            if (r2 < r0) goto L_0x0107
            r0 = 27
            if (r2 > r0) goto L_0x0107
            java.lang.Class<java.lang.Runtime> r6 = java.lang.Runtime.class
            java.lang.String r4 = "nativeLoad"
            r0 = 3
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException | SecurityException -> 0x0101 }
            r0 = 0
            r3[r0] = r8     // Catch:{ NoSuchMethodException | SecurityException -> 0x0101 }
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            r2 = 1
            r3[r2] = r0     // Catch:{ NoSuchMethodException | SecurityException -> 0x0101 }
            r0 = 2
            r3[r0] = r8     // Catch:{ NoSuchMethodException | SecurityException -> 0x0101 }
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r4, r3)     // Catch:{ NoSuchMethodException | SecurityException -> 0x0101 }
            r0.setAccessible(r2)     // Catch:{ NoSuchMethodException | SecurityException -> 0x0101 }
            r19 = r0
            r20 = 1
            java.lang.String r9 = com.facebook.soloader.SysUtil$Api14Utils.A00()     // Catch:{ all -> 0x0427 }
            if (r9 == 0) goto L_0x010a
            java.lang.String r10 = ":"
            java.lang.String[] r8 = r9.split(r10)     // Catch:{ all -> 0x0427 }
            int r6 = r8.length     // Catch:{ all -> 0x0427 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0427 }
            r4.<init>(r6)     // Catch:{ all -> 0x0427 }
            r3 = 0
        L_0x00ef:
            if (r3 >= r6) goto L_0x010d
            r2 = r8[r3]     // Catch:{ all -> 0x0427 }
            java.lang.String r0 = "!"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0427 }
            if (r0 != 0) goto L_0x00fe
            r4.add(r2)     // Catch:{ all -> 0x0427 }
        L_0x00fe:
            int r3 = r3 + 1
            goto L_0x00ef
        L_0x0101:
            r2 = move-exception
            java.lang.String r0 = "Cannot get nativeLoad method"
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x0427 }
        L_0x0107:
            r20 = 0
            r9 = 0
        L_0x010a:
            r18 = 0
            goto L_0x0111
        L_0x010d:
            java.lang.String r18 = android.text.TextUtils.join(r10, r4)     // Catch:{ all -> 0x0427 }
        L_0x0111:
            X.1dj r15 = new X.1dj     // Catch:{ all -> 0x0427 }
            r17 = r9
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0427 }
        L_0x0118:
            A04 = r15     // Catch:{ all -> 0x0427 }
        L_0x011a:
            monitor-exit(r11)     // Catch:{ all -> 0x0462 }
            X.1de[] r0 = A0D     // Catch:{ all -> 0x0462 }
            if (r0 != 0) goto L_0x0419
            java.util.concurrent.locks.ReentrantReadWriteLock r13 = A0A     // Catch:{ all -> 0x0462 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x0462 }
            r0.lock()     // Catch:{ all -> 0x0462 }
            X.1de[] r0 = A0D     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x0412
            A02 = r7     // Catch:{ all -> 0x0409 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0409 }
            r4.<init>()     // Catch:{ all -> 0x0409 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0409 }
            r6 = 0
            r0 = 23
            if (r2 < r0) goto L_0x013f
            boolean r0 = com.facebook.soloader.SysUtil$MarshmallowSysdeps.is64Bit()     // Catch:{ all -> 0x0409 }
            goto L_0x0147
        L_0x013f:
            r0 = 21
            if (r2 < r0) goto L_0x015f
            boolean r0 = com.facebook.soloader.SysUtil$LollipopSysdeps.is64Bit()     // Catch:{ Exception -> 0x014a }
        L_0x0147:
            if (r0 == 0) goto L_0x015f
            goto L_0x0162
        L_0x014a:
            r3 = move-exception
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0409 }
            r2[r6] = r0     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "Could not read /proc/self/exe. Err msg: %s"
            java.lang.String r2 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "SysUtil"
            android.util.Log.e(r0, r2)     // Catch:{ all -> 0x0409 }
        L_0x015f:
            java.lang.String r6 = "/system/lib:/vendor/lib"
            goto L_0x0164
        L_0x0162:
            java.lang.String r6 = "/system/lib64:/vendor/lib64"
        L_0x0164:
            java.lang.String r0 = "LD_LIBRARY_PATH"
            java.lang.String r3 = java.lang.System.getenv(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = ":"
            if (r3 == 0) goto L_0x0188
            java.lang.String r0 = ""
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x0188
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r0.<init>()     // Catch:{ all -> 0x0409 }
            r0.append(r6)     // Catch:{ all -> 0x0409 }
            r0.append(r2)     // Catch:{ all -> 0x0409 }
            r0.append(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0409 }
        L_0x0188:
            java.lang.String[] r0 = r6.split(r2)     // Catch:{ all -> 0x0409 }
            java.util.List r2 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0409 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0409 }
            r0.<init>(r2)     // Catch:{ all -> 0x0409 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0409 }
        L_0x0199:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r6 = r8.next()     // Catch:{ all -> 0x0409 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0409 }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x01bd
            java.lang.String r2 = "adding system library source: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r0.<init>(r2)     // Catch:{ all -> 0x0409 }
            r0.append(r6)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0409 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0409 }
        L_0x01bd:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0409 }
            r3.<init>(r6)     // Catch:{ all -> 0x0409 }
            r2 = 2
            X.1dc r0 = new X.1dc     // Catch:{ all -> 0x0409 }
            r6 = r21
            r0.<init>(r3, r6, r2)     // Catch:{ all -> 0x0409 }
            r4.add(r0)     // Catch:{ all -> 0x0409 }
            goto L_0x0199
        L_0x01ce:
            r6 = 3
            if (r5 == 0) goto L_0x038f
            r0 = r7 & 1
            if (r0 == 0) goto L_0x01ec
            int r3 = A01     // Catch:{ all -> 0x0409 }
            r2 = 1
            r0 = 0
            if (r3 == r2) goto L_0x0375
            r0 = 2
            if (r3 == r0) goto L_0x01e9
            if (r3 == r6) goto L_0x01e9
            java.lang.String r0 = "Unsupported app type, we should not reach here"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0409 }
            r1.<init>(r0)     // Catch:{ all -> 0x0409 }
            goto L_0x0281
        L_0x01e9:
            r0 = 1
            goto L_0x0375
        L_0x01ec:
            r0 = r7 & 64
            if (r0 == 0) goto L_0x026f
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0409 }
            r7 = 0
            r0 = 21
            if (r2 < r0) goto L_0x0241
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch:{ all -> 0x0409 }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0241
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch:{ all -> 0x0409 }
            java.lang.String[] r10 = r0.splitSourceDirs     // Catch:{ all -> 0x0409 }
            int r9 = r10.length     // Catch:{ all -> 0x0409 }
            r8 = 0
        L_0x0207:
            if (r8 >= r9) goto L_0x0241
            r2 = r10[r8]     // Catch:{ all -> 0x0409 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0409 }
            r0.<init>(r2)     // Catch:{ all -> 0x0409 }
            X.1dx r3 = new X.1dx     // Catch:{ all -> 0x0409 }
            r3.<init>((java.io.File) r0)     // Catch:{ all -> 0x0409 }
            boolean r0 = android.util.Log.isLoggable(r1, r6)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0231
            java.lang.String r0 = "validating/adding directApk source from splitApk: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0409 }
        L_0x0231:
            java.util.Set r0 = r3.A02     // Catch:{ all -> 0x0409 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0409 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x023e
            r4.add(r7, r3)     // Catch:{ all -> 0x0409 }
        L_0x023e:
            int r8 = r8 + 1
            goto L_0x0207
        L_0x0241:
            X.1dx r3 = new X.1dx     // Catch:{ all -> 0x0409 }
            r3.<init>((android.content.Context) r5)     // Catch:{ all -> 0x0409 }
            boolean r0 = android.util.Log.isLoggable(r1, r6)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0262
            java.lang.String r0 = "validating/adding directApk source: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0409 }
        L_0x0262:
            java.util.Set r0 = r3.A02     // Catch:{ all -> 0x0409 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0409 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x026f
            r4.add(r7, r3)     // Catch:{ all -> 0x0409 }
        L_0x026f:
            int r3 = A01     // Catch:{ all -> 0x0409 }
            r2 = 1
            r0 = 0
            if (r3 == r2) goto L_0x0283
            r0 = 2
            if (r3 == r0) goto L_0x0282
            if (r3 == r6) goto L_0x0282
            java.lang.String r0 = "Unsupported app type, we should not reach here"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0409 }
            r1.<init>(r0)     // Catch:{ all -> 0x0409 }
        L_0x0281:
            throw r1     // Catch:{ all -> 0x0409 }
        L_0x0282:
            r0 = 1
        L_0x0283:
            A02(r5, r4, r0)     // Catch:{ all -> 0x0409 }
            int r0 = A02     // Catch:{ all -> 0x0409 }
            r0 = r0 & 8
            java.lang.String r8 = "lib-main"
            if (r0 == 0) goto L_0x02cd
            r0 = 0
            A05 = r0     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>()     // Catch:{ all -> 0x0409 }
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r0.dataDir     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "/"
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            r2.append(r8)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0409 }
            r5.<init>(r0)     // Catch:{ all -> 0x0409 }
            X.C31331dy.A00(r5)     // Catch:{ IOException -> 0x02b5 }
            goto L_0x038f
        L_0x02b5:
            r3 = move-exception
            java.lang.String r0 = "Failed to delete "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r5.getCanonicalPath()     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            android.util.Log.w(r1, r0, r3)     // Catch:{ all -> 0x0409 }
            goto L_0x038f
        L_0x02cd:
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = r0.sourceDir     // Catch:{ all -> 0x0409 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0409 }
            r0.<init>(r2)     // Catch:{ all -> 0x0409 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0409 }
            r7.<init>()     // Catch:{ all -> 0x0409 }
            X.1e0 r3 = new X.1e0     // Catch:{ all -> 0x0409 }
            r3.<init>(r5, r0, r8)     // Catch:{ all -> 0x0409 }
            r7.add(r3)     // Catch:{ all -> 0x0409 }
            boolean r0 = android.util.Log.isLoggable(r1, r6)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0300
            java.lang.String r0 = "adding backup source from : "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0409 }
        L_0x0300:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0409 }
            r0 = 21
            if (r2 < r0) goto L_0x0362
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch:{ all -> 0x0409 }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0362
            boolean r0 = android.util.Log.isLoggable(r1, r6)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0319
            java.lang.String r0 = "adding backup sources from split apks"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0409 }
        L_0x0319:
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch:{ all -> 0x0409 }
            java.lang.String[] r11 = r0.splitSourceDirs     // Catch:{ all -> 0x0409 }
            int r10 = r11.length     // Catch:{ all -> 0x0409 }
            r9 = 0
            r3 = 0
        L_0x0322:
            if (r9 >= r10) goto L_0x0362
            r0 = r11[r9]     // Catch:{ all -> 0x0409 }
            java.io.File r12 = new java.io.File     // Catch:{ all -> 0x0409 }
            r12.<init>(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = "lib-"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r0.<init>(r2)     // Catch:{ all -> 0x0409 }
            int r8 = r3 + 1
            r0.append(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0409 }
            X.1e0 r3 = new X.1e0     // Catch:{ all -> 0x0409 }
            r3.<init>(r5, r12, r0)     // Catch:{ all -> 0x0409 }
            boolean r0 = android.util.Log.isLoggable(r1, r6)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x035b
            java.lang.String r0 = "adding backup source: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0409 }
        L_0x035b:
            r7.add(r3)     // Catch:{ all -> 0x0409 }
            int r9 = r9 + 1
            r3 = r8
            goto L_0x0322
        L_0x0362:
            int r0 = r7.size()     // Catch:{ all -> 0x0409 }
            X.1dk[] r0 = new X.C31221dk[r0]     // Catch:{ all -> 0x0409 }
            java.lang.Object[] r0 = r7.toArray(r0)     // Catch:{ all -> 0x0409 }
            X.1dk[] r0 = (X.C31221dk[]) r0     // Catch:{ all -> 0x0409 }
            A05 = r0     // Catch:{ all -> 0x0409 }
            r0 = 0
            r4.addAll(r0, r7)     // Catch:{ all -> 0x0409 }
            goto L_0x038f
        L_0x0375:
            A02(r5, r4, r0)     // Catch:{ all -> 0x0409 }
            r0 = 0
            A05 = r0     // Catch:{ all -> 0x0409 }
            boolean r0 = android.util.Log.isLoggable(r1, r6)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0386
            java.lang.String r0 = "adding exo package source: lib-main"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0409 }
        L_0x0386:
            r2 = 0
            X.1dl r0 = new X.1dl     // Catch:{ all -> 0x0409 }
            r0.<init>(r5)     // Catch:{ all -> 0x0409 }
            r4.add(r2, r0)     // Catch:{ all -> 0x0409 }
        L_0x038f:
            int r0 = r4.size()     // Catch:{ all -> 0x0409 }
            X.1de[] r0 = new X.C31181de[r0]     // Catch:{ all -> 0x0409 }
            java.lang.Object[] r7 = r4.toArray(r0)     // Catch:{ all -> 0x0409 }
            X.1de[] r7 = (X.C31181de[]) r7     // Catch:{ all -> 0x0409 }
            int r5 = A00()     // Catch:{ all -> 0x0409 }
            int r0 = r7.length     // Catch:{ all -> 0x0409 }
        L_0x03a0:
            int r4 = r0 + -1
            if (r0 <= 0) goto L_0x03df
            boolean r0 = android.util.Log.isLoggable(r1, r6)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x03c0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "Preparing SO source: "
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            r0 = r7[r4]     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0409 }
        L_0x03c0:
            boolean r3 = A0B     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x03d3
            java.lang.String r2 = "_"
            r0 = r7[r4]     // Catch:{ all -> 0x0409 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x0409 }
            com.facebook.soloader.Api18TraceUtils.A01(r1, r2, r0)     // Catch:{ all -> 0x0409 }
        L_0x03d3:
            r0 = r7[r4]     // Catch:{ all -> 0x0409 }
            r0.A01(r5)     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x03dd
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0409 }
        L_0x03dd:
            r0 = r4
            goto L_0x03a0
        L_0x03df:
            A0D = r7     // Catch:{ all -> 0x0409 }
            java.util.concurrent.atomic.AtomicInteger r0 = A09     // Catch:{ all -> 0x0409 }
            r0.getAndIncrement()     // Catch:{ all -> 0x0409 }
            boolean r0 = android.util.Log.isLoggable(r1, r6)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0412
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r2.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "init finish: "
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            X.1de[] r0 = A0D     // Catch:{ all -> 0x0409 }
            int r0 = r0.length     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = " SO sources prepared"
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0409 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0409 }
            goto L_0x0412
        L_0x0409:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x0462 }
            r0.unlock()     // Catch:{ all -> 0x0462 }
            goto L_0x0449
        L_0x0412:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r13.writeLock()     // Catch:{ all -> 0x0462 }
            r0.unlock()     // Catch:{ all -> 0x0462 }
        L_0x0419:
            java.lang.String r0 = "Init SoLoader delegate"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0462 }
            X.1do r0 = new X.1do     // Catch:{ all -> 0x0462 }
            r0.<init>()     // Catch:{ all -> 0x0462 }
            X.C31281dr.A00(r0)     // Catch:{ all -> 0x0462 }
            goto L_0x045e
        L_0x0427:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0462 }
            throw r0     // Catch:{ all -> 0x0462 }
        L_0x042a:
            X.1de[] r0 = A0D     // Catch:{ all -> 0x0462 }
            if (r0 != 0) goto L_0x0451
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = A0A     // Catch:{ all -> 0x0462 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()     // Catch:{ all -> 0x0462 }
            r0.lock()     // Catch:{ all -> 0x0462 }
            X.1de[] r0 = A0D     // Catch:{ all -> 0x0441 }
            if (r0 != 0) goto L_0x044a
            r0 = 0
            X.1de[] r0 = new X.C31181de[r0]     // Catch:{ all -> 0x0441 }
            A0D = r0     // Catch:{ all -> 0x0441 }
            goto L_0x044a
        L_0x0441:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()     // Catch:{ all -> 0x0462 }
            r0.unlock()     // Catch:{ all -> 0x0462 }
        L_0x0449:
            throw r1     // Catch:{ all -> 0x0462 }
        L_0x044a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()     // Catch:{ all -> 0x0462 }
            r0.unlock()     // Catch:{ all -> 0x0462 }
        L_0x0451:
            java.lang.String r0 = "Init System Loader delegate"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0462 }
            X.1dz r0 = new X.1dz     // Catch:{ all -> 0x0462 }
            r0.<init>()     // Catch:{ all -> 0x0462 }
            X.C31281dr.A00(r0)     // Catch:{ all -> 0x0462 }
        L_0x045e:
            android.os.StrictMode.setThreadPolicy(r14)
            return
        L_0x0462:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r14)
            throw r0
        L_0x0467:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A01(android.content.Context, X.1C4, java.lang.String[], int):void");
    }

    public static void A02(Context context, ArrayList arrayList, int i2) {
        if (Build.VERSION.SDK_INT <= 17) {
            i2 |= 1;
        }
        A03 = new C31191df(context, i2);
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder sb = new StringBuilder("adding application source: ");
            sb.append(A03.toString());
            Log.d("SoLoader", sb.toString());
        }
        arrayList.add(0, A03);
    }

    public static boolean A03() {
        boolean z2 = true;
        if (A0D != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = A0A;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (A0D == null) {
                z2 = false;
            }
            return z2;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0098 A[LOOP:0: B:1:0x0001->B:20:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(android.os.StrictMode.ThreadPolicy r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r3 = 0
        L_0x0001:
            boolean r3 = A05(r12, r13, r14, r15)     // Catch:{ UnsatisfiedLinkError -> 0x0006 }
            return r3
        L_0x0006:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicInteger r10 = A09
            int r2 = r10.get()
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = A0A
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.lock()
            X.1df r7 = A03     // Catch:{ IOException -> 0x00a3 }
            if (r7 == 0) goto L_0x0088
            X.1dc r0 = r7.A02     // Catch:{ IOException -> 0x00a3 }
            java.io.File r4 = r0.A01     // Catch:{ IOException -> 0x00a3 }
            android.content.Context r1 = r7.A01     // Catch:{ NameNotFoundException -> 0x009b }
            java.lang.String r0 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x009b }
            android.content.Context r6 = r1.createPackageContext(r0, r3)     // Catch:{ NameNotFoundException -> 0x009b }
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ IOException -> 0x00a3 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x00a3 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x00a3 }
            boolean r0 = r4.equals(r8)     // Catch:{ IOException -> 0x00a3 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = "Native library directory updated from "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a3 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00a3 }
            r1.append(r4)     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ IOException -> 0x00a3 }
            r1.append(r8)     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r5 = "SoLoader"
            android.util.Log.d(r5, r0)     // Catch:{ IOException -> 0x00a3 }
            int r0 = r7.A00     // Catch:{ IOException -> 0x00a3 }
            r4 = r0 | 1
            r7.A00 = r4     // Catch:{ IOException -> 0x00a3 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ IOException -> 0x00a3 }
            X.1dc r1 = new X.1dc     // Catch:{ IOException -> 0x00a3 }
            r1.<init>(r8, r0, r4)     // Catch:{ IOException -> 0x00a3 }
            r7.A02 = r1     // Catch:{ IOException -> 0x00a3 }
            int r0 = r7.A00     // Catch:{ IOException -> 0x00a3 }
            r1.A01(r0)     // Catch:{ IOException -> 0x00a3 }
            r7.A01 = r6     // Catch:{ IOException -> 0x00a3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a3 }
            r1.<init>()     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r0 = "sApplicationSoSource updated during load: "
            r1.append(r0)     // Catch:{ IOException -> 0x00a3 }
            r1.append(r13)     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r0 = ", attempting load again."
            r1.append(r0)     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00a3 }
            android.util.Log.w(r5, r0)     // Catch:{ IOException -> 0x00a3 }
            r10.getAndIncrement()     // Catch:{ IOException -> 0x00a3 }
            goto L_0x008a
        L_0x0088:
            r1 = 0
            goto L_0x008b
        L_0x008a:
            r1 = 1
        L_0x008b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.unlock()
            int r0 = r10.get()
            if (r0 == r2) goto L_0x00a2
            if (r1 != 0) goto L_0x0001
            return r3
        L_0x009b:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x00a3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00a3 }
            throw r0     // Catch:{ IOException -> 0x00a3 }
        L_0x00a2:
            throw r11
        L_0x00a3:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00aa }
            r0.<init>(r1)     // Catch:{ all -> 0x00aa }
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r9.writeLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A04(android.os.StrictMode$ThreadPolicy, java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0128, code lost:
        if (r16 == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x012d, code lost:
        if (r17 == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x012f, code lost:
        android.os.StrictMode.setThreadPolicy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0132, code lost:
        if (r12 == 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0134, code lost:
        if (r12 != 3) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0136, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("couldn't find DSO to load: ");
        r2.append(r5);
        r18.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x014b, code lost:
        if (r8 >= A0D.length) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x014d, code lost:
        r2.append("\n\tSoSource ");
        r2.append(r8);
        r2.append(": ");
        r2.append(A0D[r8].toString());
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0168, code lost:
        r0 = A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016a, code lost:
        if (r0 == null) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r5 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0179, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x017f, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0180, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0181, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0183, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0184, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x018c, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x018d, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x018e, code lost:
        if (r16 != false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0193, code lost:
        if (r17 != false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0195, code lost:
        android.os.StrictMode.setThreadPolicy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0198, code lost:
        if (r8 != 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x019a, code lost:
        if (r8 == 3) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01a1, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01a3, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Loaded: ");
        r1.append(r5);
        android.util.Log.d("SoLoader", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01b7, code lost:
        monitor-enter(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r9.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01be, code lost:
        if ((r23 & 16) == 0) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x01c4, code lost:
        if (android.text.TextUtils.isEmpty(r22) == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01c6, code lost:
        A08.contains(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x01cd, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01ce, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x01d5, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01d6, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("couldn't find DSO to load: ");
        r2.append(r5);
        r1 = r6.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01e9, code lost:
        if (r1 == null) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x01eb, code lost:
        r1 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x01ef, code lost:
        r2.append(" caused by: ");
        r2.append(r1);
        r6.printStackTrace();
        r2.append(" result: ");
        r2.append(r8);
        r0 = r2.toString();
        android.util.Log.e("SoLoader", r0);
        r1 = new java.lang.UnsatisfiedLinkError(r0);
        r1.initCause(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Could not load: ");
        r1.append(r5);
        r1.append(" because no SO source exists");
        android.util.Log.e("SoLoader", r1.toString());
        r0 = new java.lang.StringBuilder();
        r0.append("couldn't find DSO to load: ");
        r0.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x023d, code lost:
        throw new java.lang.UnsatisfiedLinkError(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x023e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0247, code lost:
        r1 = new java.io.File(r5.createPackageContext(r5.getPackageName(), 0).getApplicationInfo().nativeLibraryDir);
        r2.append("\n\tNative lib dir: ");
        r2.append(r1.getAbsolutePath());
        r2.append(org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0263, code lost:
        r18.readLock().unlock();
        r2.append(" result: ");
        r2.append(r12);
        r0 = r2.toString();
        android.util.Log.e("SoLoader", r0);
        r1 = new java.lang.UnsatisfiedLinkError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x027c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x027d, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r18 = A0A;
        r18.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r2 = r4.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x029a, code lost:
        throw new X.C31391e5(r2.substring(r2.lastIndexOf("unexpected e_machine:")), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x029b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02a1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02a2, code lost:
        r18.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02a9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-enter(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (r9.contains(r5) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        monitor-exit(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        monitor-exit(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005f, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("About to load: ");
        r2.append(r5);
        android.util.Log.d("SoLoader", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0073, code lost:
        r18.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        if (A0D == null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r18.readLock().unlock();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
        if (r20 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008e, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0091, code lost:
        r1 = android.os.StrictMode.allowThreadDiskReads();
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0097, code lost:
        r16 = A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0099, code lost:
        if (r16 == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("SoLoader.loadLibrary[", r5, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a2, code lost:
        r20 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r18.readLock().lock();
        r12 = 0;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b0, code lost:
        if (r13 >= A0D.length) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b2, code lost:
        r12 = A0D[r13].A00(r1, r5, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bc, code lost:
        if (r12 != 3) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c0, code lost:
        if (A05 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c6, code lost:
        if (android.util.Log.isLoggable("SoLoader", 3) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c8, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append("Trying backup SoSource for ");
        r6.append(r5);
        android.util.Log.d("SoLoader", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dc, code lost:
        r13 = A05;
        r21 = r13.length;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e3, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e5, code lost:
        if (r12 != 0) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ea, code lost:
        if (r14 >= r21) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ec, code lost:
        r6 = r13[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ee, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r15 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f1, code lost:
        monitor-enter(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r0 = r15.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f6, code lost:
        if (r0 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00f8, code lost:
        r0 = new java.lang.Object();
        r15.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0100, code lost:
        monitor-exit(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r6.A01 = r5;
        r6.A01(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0108, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0110, code lost:
        if (r6.A00(r1, r5, r20) != 1) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0113, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0116, code lost:
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0118, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x011b, code lost:
        r8 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0190 A[SYNTHETIC, Splitter:B:136:0x0190] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0195 A[Catch:{ NameNotFoundException -> 0x0179, UnsatisfiedLinkError -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x019a A[Catch:{ NameNotFoundException -> 0x0179, UnsatisfiedLinkError -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01eb A[Catch:{ NameNotFoundException -> 0x0179, UnsatisfiedLinkError -> 0x027d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.os.StrictMode.ThreadPolicy r20, java.lang.String r21, java.lang.String r22, int r23) {
        /*
            r1 = r20
            java.lang.Class<com.facebook.soloader.SoLoader> r19 = com.facebook.soloader.SoLoader.class
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            r4 = 0
            if (r0 != 0) goto L_0x0016
            java.util.Set r2 = A08
            r0 = r22
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            monitor-enter(r19)
            java.util.HashSet r9 = A06     // Catch:{ all -> 0x02aa }
            r5 = r21
            boolean r0 = r9.contains(r5)     // Catch:{ all -> 0x02aa }
            if (r0 == 0) goto L_0x0023
            monitor-exit(r19)     // Catch:{ all -> 0x02aa }
            return r4
        L_0x0023:
            java.util.Map r2 = A07     // Catch:{ all -> 0x02aa }
            boolean r0 = r2.containsKey(r5)     // Catch:{ all -> 0x02aa }
            if (r0 == 0) goto L_0x0031
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x02aa }
        L_0x002f:
            monitor-exit(r19)     // Catch:{ all -> 0x02aa }
            goto L_0x003a
        L_0x0031:
            java.lang.Object r3 = new java.lang.Object     // Catch:{ all -> 0x02aa }
            r3.<init>()     // Catch:{ all -> 0x02aa }
            r2.put(r5, r3)     // Catch:{ all -> 0x02aa }
            goto L_0x002f
        L_0x003a:
            java.util.concurrent.locks.ReentrantReadWriteLock r18 = A0A
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()
            r0.lock()
            monitor-enter(r3)     // Catch:{ all -> 0x02a1 }
            r11 = 3
            monitor-enter(r19)     // Catch:{ all -> 0x029e }
            boolean r0 = r9.contains(r5)     // Catch:{ all -> 0x029b }
            if (r0 == 0) goto L_0x0056
            monitor-exit(r19)     // Catch:{ all -> 0x029b }
            monitor-exit(r3)     // Catch:{ all -> 0x029e }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()
            r0.unlock()
            return r4
        L_0x0056:
            monitor-exit(r19)     // Catch:{ all -> 0x029b }
            java.lang.String r4 = "SoLoader"
            boolean r0 = android.util.Log.isLoggable(r4, r11)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            if (r0 == 0) goto L_0x0073
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = "About to load: "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            android.util.Log.d(r4, r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x0073:
            java.lang.String r10 = " result: "
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r0.lock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            X.1de[] r0 = A0D     // Catch:{ all -> 0x023e }
            java.lang.String r7 = "couldn't find DSO to load: "
            if (r0 == 0) goto L_0x0210
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r0.unlock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2 = 1
            r8 = 0
            if (r20 != 0) goto L_0x008e
            goto L_0x0091
        L_0x008e:
            r17 = 0
            goto L_0x0097
        L_0x0091:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r17 = 1
        L_0x0097:
            boolean r16 = A0B     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            if (r16 == 0) goto L_0x00a2
            java.lang.String r6 = "SoLoader.loadLibrary["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r6, r5, r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x00a2:
            r20 = r23
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ all -> 0x018d }
            r0.lock()     // Catch:{ all -> 0x018d }
            r12 = 0
            r13 = 0
        L_0x00ad:
            X.1de[] r0 = A0D     // Catch:{ all -> 0x0183 }
            int r0 = r0.length     // Catch:{ all -> 0x0183 }
            if (r13 >= r0) goto L_0x0121
            X.1de[] r0 = A0D     // Catch:{ all -> 0x0183 }
            r6 = r0[r13]     // Catch:{ all -> 0x0183 }
            r0 = r20
            int r12 = r6.A00(r1, r5, r0)     // Catch:{ all -> 0x0183 }
            if (r12 != r11) goto L_0x00e3
            X.1dk[] r0 = A05     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x0121
            boolean r0 = android.util.Log.isLoggable(r4, r11)     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x00dc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r6.<init>()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "Trying backup SoSource for "
            r6.append(r0)     // Catch:{ all -> 0x0183 }
            r6.append(r5)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0183 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0183 }
        L_0x00dc:
            X.1dk[] r13 = A05     // Catch:{ all -> 0x0183 }
            int r0 = r13.length     // Catch:{ all -> 0x0183 }
            r21 = r0
            r14 = 0
            goto L_0x00e8
        L_0x00e3:
            int r13 = r13 + 1
            if (r12 != 0) goto L_0x0121
            goto L_0x00ad
        L_0x00e8:
            r0 = r21
            if (r14 >= r0) goto L_0x0121
            r6 = r13[r14]     // Catch:{ all -> 0x0183 }
            monitor-enter(r6)     // Catch:{ all -> 0x0183 }
            java.util.Map r15 = r6.A04     // Catch:{ all -> 0x011e }
            monitor-enter(r15)     // Catch:{ all -> 0x011e }
            java.lang.Object r0 = r15.get(r5)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x0100
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x011b }
            r0.<init>()     // Catch:{ all -> 0x011b }
            r15.put(r5, r0)     // Catch:{ all -> 0x011b }
        L_0x0100:
            monitor-exit(r15)     // Catch:{ all -> 0x011b }
            monitor-enter(r0)     // Catch:{ all -> 0x011e }
            r6.A01 = r5     // Catch:{ all -> 0x0118 }
            r15 = 2
            r6.A01(r15)     // Catch:{ all -> 0x0118 }
            monitor-exit(r0)     // Catch:{ all -> 0x0118 }
            monitor-exit(r6)     // Catch:{ all -> 0x0183 }
            r0 = r20
            int r0 = r6.A00(r1, r5, r0)     // Catch:{ all -> 0x0183 }
            if (r0 != r2) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            int r14 = r14 + 1
            goto L_0x00e8
        L_0x0116:
            r12 = 1
            goto L_0x0121
        L_0x0118:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0118 }
            goto L_0x011d
        L_0x011b:
            r8 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x011b }
        L_0x011d:
            throw r8     // Catch:{ all -> 0x011e }
        L_0x011e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0183 }
            throw r0     // Catch:{ all -> 0x0183 }
        L_0x0121:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ all -> 0x0180 }
            r0.unlock()     // Catch:{ all -> 0x0180 }
            if (r16 == 0) goto L_0x012d
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x012d:
            if (r17 == 0) goto L_0x0132
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x0132:
            if (r12 == 0) goto L_0x0136
            if (r12 != r11) goto L_0x019d
        L_0x0136:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r7)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r0.lock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x0148:
            X.1de[] r0 = A0D     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            int r0 = r0.length     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            if (r8 >= r0) goto L_0x0168
            java.lang.String r0 = "\n\tSoSource "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = ": "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            X.1de[] r0 = A0D     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r0 = r0[r8]     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            int r8 = r8 + 1
            goto L_0x0148
        L_0x0168:
            X.1df r0 = A03     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            if (r0 == 0) goto L_0x0263
            android.content.Context r5 = r0.A01     // Catch:{ NameNotFoundException -> 0x0179 }
            java.lang.String r1 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0179 }
            r0 = 0
            android.content.Context r0 = r5.createPackageContext(r1, r0)     // Catch:{ NameNotFoundException -> 0x0179 }
            goto L_0x0247
        L_0x0179:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x0180:
            r6 = move-exception
            r8 = r12
            goto L_0x018e
        L_0x0183:
            r6 = move-exception
            r8 = r12
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ all -> 0x018d }
            r0.unlock()     // Catch:{ all -> 0x018d }
            throw r6     // Catch:{ all -> 0x018d }
        L_0x018d:
            r6 = move-exception
        L_0x018e:
            if (r16 == 0) goto L_0x0193
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x0193:
            if (r17 == 0) goto L_0x0198
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x0198:
            if (r8 == 0) goto L_0x01da
            if (r8 != r11) goto L_0x019d
            goto L_0x01da
        L_0x019d:
            boolean r0 = android.util.Log.isLoggable(r4, r11)     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x01b7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029e }
            r1.<init>()     // Catch:{ all -> 0x029e }
            java.lang.String r0 = "Loaded: "
            r1.append(r0)     // Catch:{ all -> 0x029e }
            r1.append(r5)     // Catch:{ all -> 0x029e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029e }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x029e }
        L_0x01b7:
            monitor-enter(r19)     // Catch:{ all -> 0x029e }
            r9.add(r5)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r19)     // Catch:{ all -> 0x01d6 }
            r0 = r23 & 16
            if (r0 != 0) goto L_0x01cd
            boolean r0 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x029e }
            if (r0 != 0) goto L_0x01cd
            java.util.Set r1 = A08     // Catch:{ all -> 0x029e }
            r0 = r22
            r1.contains(r0)     // Catch:{ all -> 0x029e }
        L_0x01cd:
            monitor-exit(r3)     // Catch:{ all -> 0x029e }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()
            r0.unlock()
            return r2
        L_0x01d6:
            r4 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x01d6 }
            goto L_0x029d
        L_0x01da:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r7)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r1 = r6.getMessage()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            if (r1 != 0) goto L_0x01ef
            java.lang.String r1 = r6.toString()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x01ef:
            java.lang.String r0 = " caused by: "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r1)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r6.printStackTrace()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r10)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            android.util.Log.e(r4, r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r1.initCause(r6)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            goto L_0x027c
        L_0x0210:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x023e }
            r1.<init>()     // Catch:{ all -> 0x023e }
            java.lang.String r0 = "Could not load: "
            r1.append(r0)     // Catch:{ all -> 0x023e }
            r1.append(r5)     // Catch:{ all -> 0x023e }
            java.lang.String r0 = " because no SO source exists"
            r1.append(r0)     // Catch:{ all -> 0x023e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x023e }
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x023e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x023e }
            r0.<init>()     // Catch:{ all -> 0x023e }
            r0.append(r7)     // Catch:{ all -> 0x023e }
            r0.append(r5)     // Catch:{ all -> 0x023e }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x023e }
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x023e }
            r0.<init>(r1)     // Catch:{ all -> 0x023e }
            throw r0     // Catch:{ all -> 0x023e }
        L_0x023e:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r0.unlock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            goto L_0x027c
        L_0x0247:
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.io.File r1 = new java.io.File     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = "\n\tNative lib dir: "
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x0263:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r0.unlock()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r10)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r2.append(r12)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            android.util.Log.e(r4, r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x027d }
            r1.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x027c:
            throw r1     // Catch:{ UnsatisfiedLinkError -> 0x027d }
        L_0x027d:
            r4 = move-exception
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x029e }
            if (r2 == 0) goto L_0x029d
            java.lang.String r1 = "unexpected e_machine:"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x029d
            int r0 = r2.lastIndexOf(r1)     // Catch:{ all -> 0x029e }
            java.lang.String r1 = r2.substring(r0)     // Catch:{ all -> 0x029e }
            X.1e5 r0 = new X.1e5     // Catch:{ all -> 0x029e }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x029e }
            throw r0     // Catch:{ all -> 0x029e }
        L_0x029b:
            r4 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x029b }
        L_0x029d:
            throw r4     // Catch:{ all -> 0x029e }
        L_0x029e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x029e }
            throw r0     // Catch:{ all -> 0x02a1 }
        L_0x02a1:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r18.readLock()
            r0.unlock()
            throw r1
        L_0x02aa:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x02aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A05(android.os.StrictMode$ThreadPolicy, java.lang.String, java.lang.String, int):boolean");
    }

    public static boolean A06(String str) {
        return A00 ? A07(str) : C31281dr.A01(str);
    }

    public static boolean A07(String str) {
        boolean z2;
        Boolean valueOf;
        if (A0D == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = A0A;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (A0D == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                z2 = !A06.contains(str);
                                if (z2) {
                                    System.loadLibrary(str);
                                }
                                valueOf = Boolean.valueOf(z2);
                            } catch (Throwable th) {
                                while (true) {
                                    th = th;
                                    break;
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        if (valueOf != null) {
                            return z2;
                        }
                    } else if (!A03()) {
                        th = new IllegalStateException("SoLoader.init() not yet called");
                    }
                    throw th;
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
        return !A00 ? C31281dr.A01(str) : A04((StrictMode.ThreadPolicy) null, System.mapLibraryName(str), str, 0);
    }

    public static void init(Context context, int i2) {
        A01(context, (AnonymousClass1C4) null, A0C, i2);
    }
}
