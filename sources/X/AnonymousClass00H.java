package X;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/* renamed from: X.00H  reason: invalid class name */
public final class AnonymousClass00H {
    public static final Set A00 = new HashSet();
    public static final boolean A01;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z2 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z2 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder("VM with version ");
        sb.append(property);
        sb.append(z2 ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        A01 = z2;
    }

    public static Field A00(Object obj, String str) {
        Class cls = obj.getClass();
        Class cls2 = cls;
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (declaredField.isAccessible()) {
                    return declaredField;
                }
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(cls2);
        throw new NoSuchFieldException(sb.toString());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x015c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x01a7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r14) {
        /*
            java.lang.String r3 = "MultiDex"
            java.lang.String r0 = "Installing application"
            android.util.Log.i(r3, r0)
            boolean r0 = A01
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "VM has multidex support, MultiDex support library is disabled."
        L_0x000d:
            android.util.Log.i(r3, r0)
            return
        L_0x0011:
            android.content.pm.ApplicationInfo r1 = r14.getApplicationInfo()     // Catch:{ RuntimeException -> 0x01ab }
            if (r1 == 0) goto L_0x01b1
            java.lang.String r0 = r1.sourceDir     // Catch:{ Exception -> 0x01b7 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x01b7 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = r1.dataDir     // Catch:{ Exception -> 0x01b7 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x01b7 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r8 = "secondary-dexes"
            java.util.Set r4 = A00     // Catch:{ Exception -> 0x01b7 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x01b7 }
            boolean r0 = r4.contains(r7)     // Catch:{ all -> 0x01a8 }
            if (r0 != 0) goto L_0x019c
            r4.add(r7)     // Catch:{ all -> 0x01a8 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01a8 }
            r2 = 20
            if (r6 <= r2) goto L_0x0072
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a8 }
            r1.<init>()     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = "MultiDex is not guaranteed to work in SDK version "
            r1.append(r0)     // Catch:{ all -> 0x01a8 }
            r1.append(r6)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = ": SDK version higher than "
            r1.append(r0)     // Catch:{ all -> 0x01a8 }
            r1.append(r2)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = " should be backed by "
            r1.append(r0)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = "runtime with built-in multidex capabilty but it's not the "
            r1.append(r0)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = "case here: java.vm.version=\""
            r1.append(r0)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x01a8 }
            r1.append(r0)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a8 }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x01a8 }
        L_0x0072:
            java.lang.ClassLoader r6 = r14.getClassLoader()     // Catch:{ RuntimeException -> 0x0190 }
            boolean r0 = r6 instanceof dalvik.system.BaseDexClassLoader     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x0197
            if (r6 == 0) goto L_0x019c
            java.io.File r0 = r14.getFilesDir()     // Catch:{ all -> 0x014b }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x014b }
            r2.<init>(r0, r8)     // Catch:{ all -> 0x014b }
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = "Clearing old secondary dex dir ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r1.<init>(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r2.getPath()     // Catch:{ all -> 0x014b }
            r1.append(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r9 = ")."
            r1.append(r9)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014b }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x014b }
            java.io.File[] r11 = r2.listFiles()     // Catch:{ all -> 0x014b }
            if (r11 != 0) goto L_0x00c5
            java.lang.String r0 = "Failed to list secondary dex dir content ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r1.<init>(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r2.getPath()     // Catch:{ all -> 0x014b }
            r1.append(r0)     // Catch:{ all -> 0x014b }
            r1.append(r9)     // Catch:{ all -> 0x014b }
        L_0x00bc:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014b }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x014b }
            goto L_0x0151
        L_0x00c5:
            int r10 = r11.length     // Catch:{ all -> 0x014b }
            r9 = 0
        L_0x00c7:
            if (r9 >= r10) goto L_0x0120
            r13 = r11[r9]     // Catch:{ all -> 0x014b }
            java.lang.String r0 = "Trying to delete old file "
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r12.<init>(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r13.getPath()     // Catch:{ all -> 0x014b }
            r12.append(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = " of size "
            r12.append(r0)     // Catch:{ all -> 0x014b }
            long r0 = r13.length()     // Catch:{ all -> 0x014b }
            r12.append(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x014b }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x014b }
            boolean r0 = r13.delete()     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = "Failed to delete old file "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r1.<init>(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r13.getPath()     // Catch:{ all -> 0x014b }
            r1.append(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014b }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x014b }
            goto L_0x011d
        L_0x0108:
            java.lang.String r0 = "Deleted old file "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r1.<init>(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r13.getPath()     // Catch:{ all -> 0x014b }
            r1.append(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014b }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x014b }
        L_0x011d:
            int r9 = r9 + 1
            goto L_0x00c7
        L_0x0120:
            boolean r0 = r2.delete()     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "Failed to delete secondary dex dir "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r1.<init>(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r2.getPath()     // Catch:{ all -> 0x014b }
            r1.append(r0)     // Catch:{ all -> 0x014b }
            goto L_0x00bc
        L_0x0135:
            java.lang.String r0 = "Deleted old secondary dex dir "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r1.<init>(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r2.getPath()     // Catch:{ all -> 0x014b }
            r1.append(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014b }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x014b }
            goto L_0x0151
        L_0x014b:
            r1 = move-exception
            java.lang.String r0 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r3, r0, r1)     // Catch:{ all -> 0x01a8 }
        L_0x0151:
            java.lang.String r2 = "code_cache"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01a8 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x01a8 }
            A02(r1)     // Catch:{ IOException -> 0x015c }
            goto L_0x0168
        L_0x015c:
            java.io.File r0 = r14.getFilesDir()     // Catch:{ all -> 0x01a8 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01a8 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x01a8 }
            A02(r1)     // Catch:{ all -> 0x01a8 }
        L_0x0168:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x01a8 }
            r5.<init>(r1, r8)     // Catch:{ all -> 0x01a8 }
            A02(r5)     // Catch:{ all -> 0x01a8 }
            X.00J r2 = new X.00J     // Catch:{ all -> 0x01a8 }
            r2.<init>(r7, r5)     // Catch:{ all -> 0x01a8 }
            r0 = 0
            java.util.List r0 = r2.A03(r14, r0)     // Catch:{ all -> 0x01a3 }
            A03(r5, r6, r0)     // Catch:{ IOException -> 0x017e }
            goto L_0x018c
        L_0x017e:
            r1 = move-exception
            java.lang.String r0 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r3, r0, r1)     // Catch:{ all -> 0x01a3 }
            r0 = 1
            java.util.List r0 = r2.A03(r14, r0)     // Catch:{ all -> 0x01a3 }
            A03(r5, r6, r0)     // Catch:{ all -> 0x01a3 }
        L_0x018c:
            r2.close()     // Catch:{ IOException -> 0x01a1 }
            goto L_0x019c
        L_0x0190:
            r1 = move-exception
            java.lang.String r0 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r3, r0, r1)     // Catch:{ all -> 0x01a8 }
            goto L_0x019c
        L_0x0197:
            java.lang.String r0 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x01a8 }
        L_0x019c:
            monitor-exit(r4)     // Catch:{ all -> 0x01a8 }
            java.lang.String r0 = "install done"
            goto L_0x000d
        L_0x01a1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01a8 }
        L_0x01a3:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x01a7 }
        L_0x01a7:
            throw r0     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01a8 }
            throw r0     // Catch:{ Exception -> 0x01b7 }
        L_0x01ab:
            r1 = move-exception
            java.lang.String r0 = "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching."
            android.util.Log.w(r3, r0, r1)     // Catch:{ Exception -> 0x01b7 }
        L_0x01b1:
            java.lang.String r0 = "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled."
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x01b7 }
            return
        L_0x01b7:
            r2 = move-exception
            java.lang.String r0 = "MultiDex installation failure"
            android.util.Log.e(r3, r0, r2)
            java.lang.String r0 = "MultiDex installation failed ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = ")."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00H.A01(android.content.Context):void");
    }

    public static void A02(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create dir ");
            String path = file.getPath();
            if (parentFile == null) {
                sb.append(path);
                sb.append(". Parent file is null.");
            } else {
                sb.append(path);
                sb.append(". parent file is a dir ");
                sb.append(parentFile.isDirectory());
                sb.append(", a file ");
                sb.append(parentFile.isFile());
                sb.append(", exists ");
                sb.append(parentFile.exists());
                sb.append(", readable ");
                sb.append(parentFile.canRead());
                sb.append(", writable ");
                sb.append(parentFile.canWrite());
            }
            Log.e("MultiDex", sb.toString());
            StringBuilder sb2 = new StringBuilder("Failed to create directory ");
            sb2.append(file.getPath());
            throw new IOException(sb2.toString());
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(java.io.File r13, java.lang.ClassLoader r14, java.util.List r15) {
        /*
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x015b
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            java.lang.String r0 = "pathList"
            java.lang.reflect.Field r0 = A00(r14, r0)
            if (r2 < r1) goto L_0x00e0
            java.lang.Object r7 = r0.get(r14)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r15)
            r12 = 3
            java.lang.Class[] r10 = new java.lang.Class[r12]
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            r6 = 0
            r10[r6] = r1
            java.lang.Class<java.io.File> r0 = java.io.File.class
            r9 = 1
            r10[r9] = r0
            r8 = 2
            r10[r8] = r1
            java.lang.String r4 = "makeDexElements"
            java.lang.Class r3 = r7.getClass()
            r2 = r3
        L_0x0037:
            if (r3 == 0) goto L_0x00b8
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r4, r10)     // Catch:{ NoSuchMethodException -> 0x0047 }
            boolean r0 = r1.isAccessible()     // Catch:{ NoSuchMethodException -> 0x0047 }
            if (r0 != 0) goto L_0x004c
            r1.setAccessible(r9)     // Catch:{ NoSuchMethodException -> 0x0047 }
            goto L_0x004c
        L_0x0047:
            java.lang.Class r3 = r3.getSuperclass()
            goto L_0x0037
        L_0x004c:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r6] = r11
            r0[r9] = r13
            r0[r8] = r5
            java.lang.Object r1 = r1.invoke(r7, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.String r0 = "dexElements"
            A04(r7, r0, r1)
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x015b
            java.util.Iterator r3 = r5.iterator()
        L_0x0069:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r2 = r3.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r1 = "MultiDex"
            java.lang.String r0 = "Exception in makeDexElement"
            android.util.Log.w(r1, r0, r2)
            goto L_0x0069
        L_0x007d:
            java.lang.String r0 = "dexElementsSuppressedExceptions"
            java.lang.reflect.Field r4 = A00(r7, r0)
            java.lang.Object r3 = r4.get(r7)
            java.io.IOException[] r3 = (java.io.IOException[]) r3
            int r0 = r5.size()
            if (r3 != 0) goto L_0x00a9
            java.io.IOException[] r0 = new java.io.IOException[r0]
            java.lang.Object[] r2 = r5.toArray(r0)
        L_0x0095:
            r4.set(r7, r2)
            java.lang.String r0 = "I/O exception during makeDexElement"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            java.lang.Object r0 = r5.get(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.initCause(r0)
            throw r1
        L_0x00a9:
            int r1 = r3.length
            int r0 = r0 + r1
            java.io.IOException[] r2 = new java.io.IOException[r0]
            r5.toArray(r2)
            int r0 = r5.size()
            java.lang.System.arraycopy(r3, r6, r2, r0, r1)
            goto L_0x0095
        L_0x00b8:
            java.lang.String r0 = "Method "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " with parameters "
            r1.append(r0)
            java.util.List r0 = java.util.Arrays.asList(r10)
            r1.append(r0)
            java.lang.String r0 = " not found in "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r0.<init>(r1)
            throw r0
        L_0x00e0:
            java.lang.Object r4 = r0.get(r14)
            java.lang.String r0 = "dalvik.system.DexPathList$Element"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            X.0bz r7 = new X.0bz     // Catch:{ NoSuchMethodException -> 0x00f0 }
            r7.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x00f0 }
            goto L_0x00fb
        L_0x00f0:
            X.0c0 r7 = new X.0c0     // Catch:{ NoSuchMethodException -> 0x00f6 }
            r7.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x00f6 }
            goto L_0x00fb
        L_0x00f6:
            X.0c1 r7 = new X.0c1
            r7.<init>(r0)
        L_0x00fb:
            int r6 = r15.size()
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r5 = 0
            r2 = 0
        L_0x0103:
            if (r2 >= r6) goto L_0x0148
            java.lang.Object r8 = r15.get(r2)
            java.io.File r8 = (java.io.File) r8
            java.lang.String r9 = r8.getPath()
            java.io.File r10 = r8.getParentFile()
            java.lang.String r12 = r8.getName()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r1 = r12.length()
            r0 = 4
            int r1 = r1 - r0
            java.lang.String r0 = r12.substring(r5, r1)
            r11.append(r0)
            java.lang.String r0 = ".dex"
            r11.append(r0)
            java.lang.String r1 = r11.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r10, r1)
            java.lang.String r0 = r0.getPath()
            dalvik.system.DexFile r0 = dalvik.system.DexFile.loadDex(r9, r0, r5)
            java.lang.Object r0 = r7.ALk(r0, r8)
            r3[r2] = r0
            int r2 = r2 + 1
            goto L_0x0103
        L_0x0148:
            java.lang.String r0 = "dexElements"
            A04(r4, r0, r3)     // Catch:{ NoSuchFieldException -> 0x014e }
            return
        L_0x014e:
            r2 = move-exception
            java.lang.String r1 = "MultiDex"
            java.lang.String r0 = "Failed find field 'dexElements' attempting 'pathElements'"
            android.util.Log.w(r1, r0, r2)
            java.lang.String r0 = "pathElements"
            A04(r4, r0, r3)
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00H.A03(java.io.File, java.lang.ClassLoader, java.util.List):void");
    }

    public static void A04(Object obj, String str, Object[] objArr) {
        Field A002 = A00(obj, str);
        Object[] objArr2 = (Object[]) A002.get(obj);
        Class<?> componentType = objArr2.getClass().getComponentType();
        int length = objArr2.length;
        int length2 = objArr.length;
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(objArr2, 0, newInstance, 0, length);
        System.arraycopy(objArr, 0, newInstance, length, length2);
        A002.set(obj, newInstance);
    }
}
