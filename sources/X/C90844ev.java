package X;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.4ev  reason: invalid class name and case insensitive filesystem */
public final class C90844ev {
    public static int A01 = -1;
    public static C66403Zf A02;
    public static C66413Zg A03;
    public static Boolean A04;
    public static String A05;
    public static boolean A06;
    public static final AnonymousClass5RF A07 = new C98114r7();
    public static final AnonymousClass5Ny A08 = new C98144rA();
    public static final AnonymousClass5Ny A09 = new C98134r9();
    public static final ThreadLocal A0A = new ThreadLocal();
    public static final ThreadLocal A0B = new AnonymousClass5B0();
    public final Context A00;

    public C90844ev(Context context) {
        C13710nw.A01(context);
        this.A00 = context;
    }

    public static int A00(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str) + 61);
            A0g.append("com.google.android.gms.dynamite.descriptors.");
            A0g.append(str);
            A0g.append(".");
            Class<?> loadClass = classLoader.loadClass(AnonymousClass000.A0h("ModuleDescriptor", A0g));
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (AnonymousClass45A.A00(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder A0g2 = C13690nt.A0g(valueOf.length() + 51 + C13680ns.A06(str));
            A0g2.append("Module descriptor id '");
            A0g2.append(valueOf);
            A0g2.append("' didn't match expected id '");
            A0g2.append(str);
            Log.e("DynamiteModule", AnonymousClass000.A0h("'", A0g2));
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder A0g3 = C13690nt.A0g(C13680ns.A06(str) + 45);
            A0g3.append("Local module descriptor class for ");
            A0g3.append(str);
            Log.w("DynamiteModule", AnonymousClass000.A0h(" not found.", A0g3));
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", C13680ns.A0g(AnonymousClass3K3.A0q(e2), "Failed to load module descriptor class: "));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static int A01(android.content.Context r19, java.lang.String r20, boolean r21) {
        /*
            r4 = r19
            java.lang.Class<X.4ev> r19 = X.C90844ev.class
            monitor-enter(r19)     // Catch:{ all -> 0x0283 }
            java.lang.Boolean r0 = A04     // Catch:{ all -> 0x027c }
            r5 = 0
            r8 = r20
            r7 = r21
            if (r0 != 0) goto L_0x017e
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x015d }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x015d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r0 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r0 = r0.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x015d }
            java.lang.Class r1 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x015d }
            java.lang.String r0 = "sClassLoader"
            java.lang.reflect.Field r3 = r1.getDeclaredField(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x015d }
            java.lang.Class r18 = r3.getDeclaringClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x015d }
            monitor-enter(r18)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x015d }
            java.lang.Object r1 = r3.get(r5)     // Catch:{ all -> 0x015a }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x0044
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x015a }
            if (r1 != r0) goto L_0x003e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015a }
        L_0x003b:
            monitor-exit(r18)     // Catch:{ all -> 0x015a }
            goto L_0x017c
        L_0x003e:
            A08(r1)     // Catch:{ 43p -> 0x0041 }
        L_0x0041:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x015a }
            goto L_0x003b
        L_0x0044:
            boolean r0 = A06     // Catch:{ all -> 0x015a }
            if (r0 != 0) goto L_0x014c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x015a }
            boolean r0 = r6.equals(r5)     // Catch:{ all -> 0x015a }
            if (r0 != 0) goto L_0x014c
            int r17 = A02(r4, r8, r7)     // Catch:{ 43p -> 0x0141 }
            java.lang.String r0 = A05     // Catch:{ 43p -> 0x0141 }
            if (r0 == 0) goto L_0x0157
            boolean r0 = r0.isEmpty()     // Catch:{ 43p -> 0x0141 }
            if (r0 != 0) goto L_0x0157
            java.lang.Class<X.44c> r16 = X.C805044c.class
            monitor-enter(r16)     // Catch:{ 43p -> 0x0141 }
            java.lang.ClassLoader r0 = X.C805044c.A00     // Catch:{ all -> 0x013e }
            if (r0 != 0) goto L_0x010d
            java.lang.Thread r0 = X.C805044c.A01     // Catch:{ all -> 0x0109 }
            r15 = 0
            if (r0 != 0) goto L_0x00ea
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00e2 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x00e2 }
            java.lang.ThreadGroup r13 = r0.getThreadGroup()     // Catch:{ all -> 0x00e2 }
            if (r13 != 0) goto L_0x007a
            r9 = r5
            goto L_0x00e4
        L_0x007a:
            java.lang.Class<java.lang.Void> r14 = java.lang.Void.class
            monitor-enter(r14)     // Catch:{ all -> 0x00e2 }
            int r10 = r13.activeGroupCount()     // Catch:{ SecurityException -> 0x00cc }
            java.lang.ThreadGroup[] r9 = new java.lang.ThreadGroup[r10]     // Catch:{ SecurityException -> 0x00cc }
            r13.enumerate(r9)     // Catch:{ SecurityException -> 0x00cc }
            r12 = 0
            r2 = 0
        L_0x0088:
            if (r2 >= r10) goto L_0x009b
            r11 = r9[r2]     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r1 = "dynamiteLoader"
            java.lang.String r0 = r11.getName()     // Catch:{ SecurityException -> 0x00cc }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00cc }
            if (r0 != 0) goto L_0x00a2
            int r2 = r2 + 1
            goto L_0x0088
        L_0x009b:
            java.lang.String r0 = "dynamiteLoader"
            java.lang.ThreadGroup r11 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x00cc }
            r11.<init>(r13, r0)     // Catch:{ SecurityException -> 0x00cc }
        L_0x00a2:
            int r10 = r11.activeCount()     // Catch:{ SecurityException -> 0x00cc }
            java.lang.Thread[] r2 = new java.lang.Thread[r10]     // Catch:{ SecurityException -> 0x00cc }
            r11.enumerate(r2)     // Catch:{ SecurityException -> 0x00cc }
        L_0x00ab:
            if (r12 >= r10) goto L_0x00be
            r9 = r2[r12]     // Catch:{ SecurityException -> 0x00cc }
            java.lang.String r1 = "GmsDynamite"
            java.lang.String r0 = r9.getName()     // Catch:{ SecurityException -> 0x00cc }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x00cc }
            if (r0 != 0) goto L_0x00dd
            int r12 = r12 + 1
            goto L_0x00ab
        L_0x00be:
            X.5Au r9 = new X.5Au     // Catch:{ SecurityException -> 0x00cc }
            r9.<init>(r11)     // Catch:{ SecurityException -> 0x00cc }
            r9.setContextClassLoader(r5)     // Catch:{ SecurityException -> 0x00ca }
            r9.start()     // Catch:{ SecurityException -> 0x00ca }
            goto L_0x00dd
        L_0x00ca:
            r0 = move-exception
            goto L_0x00ce
        L_0x00cc:
            r0 = move-exception
            r9 = r5
        L_0x00ce:
            java.lang.String r2 = "DynamiteLoaderV2CL"
            java.lang.String r1 = "Failed to enumerate thread/threadgroup "
            java.lang.String r0 = X.AnonymousClass3K3.A0q(r0)     // Catch:{ all -> 0x00df }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ all -> 0x00df }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r14)     // Catch:{ all -> 0x00df }
            goto L_0x00e4
        L_0x00df:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            goto L_0x0108
        L_0x00e4:
            X.C805044c.A01 = r9     // Catch:{ all -> 0x0109 }
            java.lang.Thread r0 = X.C805044c.A01     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x010b
        L_0x00ea:
            java.lang.Thread r9 = X.C805044c.A01     // Catch:{ all -> 0x0109 }
            monitor-enter(r9)     // Catch:{ all -> 0x0109 }
            java.lang.Thread r0 = X.C805044c.A01     // Catch:{ SecurityException -> 0x00f4 }
            java.lang.ClassLoader r15 = r0.getContextClassLoader()     // Catch:{ SecurityException -> 0x00f4 }
            goto L_0x0104
        L_0x00f4:
            r0 = move-exception
            java.lang.String r2 = "DynamiteLoaderV2CL"
            java.lang.String r1 = "Failed to get thread context classloader "
            java.lang.String r0 = X.AnonymousClass3K3.A0q(r0)     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ all -> 0x0106 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0106 }
        L_0x0104:
            monitor-exit(r9)     // Catch:{ all -> 0x0106 }
            goto L_0x010b
        L_0x0106:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0106 }
        L_0x0108:
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x013e }
        L_0x010b:
            X.C805044c.A00 = r15     // Catch:{ all -> 0x013e }
        L_0x010d:
            java.lang.ClassLoader r2 = X.C805044c.A00     // Catch:{ all -> 0x013e }
            monitor-exit(r16)     // Catch:{ 43p -> 0x0141 }
            if (r2 != 0) goto L_0x0126
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ 43p -> 0x0141 }
            r0 = 29
            if (r1 < r0) goto L_0x012f
            java.lang.String r1 = A05     // Catch:{ 43p -> 0x0141 }
            X.C13710nw.A01(r1)     // Catch:{ 43p -> 0x0141 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ 43p -> 0x0141 }
            dalvik.system.DelegateLastClassLoader r2 = new dalvik.system.DelegateLastClassLoader     // Catch:{ 43p -> 0x0141 }
            r2.<init>(r1, r0)     // Catch:{ 43p -> 0x0141 }
        L_0x0126:
            A08(r2)     // Catch:{ 43p -> 0x0141 }
            r3.set(r5, r2)     // Catch:{ 43p -> 0x0141 }
            A04 = r6     // Catch:{ 43p -> 0x0141 }
            goto L_0x0157
        L_0x012f:
            java.lang.String r1 = A05     // Catch:{ 43p -> 0x0141 }
            X.C13710nw.A01(r1)     // Catch:{ 43p -> 0x0141 }
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ 43p -> 0x0141 }
            X.3zz r2 = new X.3zz     // Catch:{ 43p -> 0x0141 }
            r2.<init>(r1, r0)     // Catch:{ 43p -> 0x0141 }
            goto L_0x0126
        L_0x013e:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ 43p -> 0x0141 }
            throw r0     // Catch:{ 43p -> 0x0141 }
        L_0x0141:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x015a }
            r3.set(r5, r0)     // Catch:{ all -> 0x015a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015a }
            goto L_0x003b
        L_0x014c:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x015a }
            r3.set(r5, r0)     // Catch:{ all -> 0x015a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015a }
            goto L_0x003b
        L_0x0157:
            monitor-exit(r18)     // Catch:{ all -> 0x015a }
            monitor-exit(r19)     // Catch:{ all -> 0x027c }
            return r17
        L_0x015a:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x015a }
            throw r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x015d }
        L_0x015d:
            r0 = move-exception
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x027c }
            int r0 = r2.length()     // Catch:{ all -> 0x027c }
            int r0 = r0 + 30
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)     // Catch:{ all -> 0x027c }
            java.lang.String r0 = "Failed to load module via V2: "
            r1.append(r0)     // Catch:{ all -> 0x027c }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ all -> 0x027c }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x027c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x027c }
        L_0x017c:
            A04 = r0     // Catch:{ all -> 0x027c }
        L_0x017e:
            monitor-exit(r19)     // Catch:{ all -> 0x027c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0283 }
            r3 = 0
            if (r0 == 0) goto L_0x019c
            int r0 = A02(r4, r8, r7)     // Catch:{ 43p -> 0x018b }
            return r0
        L_0x018b:
            r0 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = "Failed to retrieve remote module version: "
            java.lang.String r0 = X.AnonymousClass3K3.A0q(r0)     // Catch:{ all -> 0x0283 }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ all -> 0x0283 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0283 }
            return r3
        L_0x019c:
            X.3Zf r2 = A07(r4)     // Catch:{ all -> 0x0283 }
            if (r2 == 0) goto L_0x027b
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x025e }
            java.lang.String r6 = r2.A01     // Catch:{ RemoteException -> 0x025e }
            r1.writeInterfaceToken(r6)     // Catch:{ RemoteException -> 0x025e }
            r0 = 6
            android.os.Parcel r0 = r2.A00(r0, r1)     // Catch:{ RemoteException -> 0x025e }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x025e }
            r0.recycle()     // Catch:{ RemoteException -> 0x025e }
            r0 = 3
            if (r1 < r0) goto L_0x0221
            java.lang.ThreadLocal r10 = A0A     // Catch:{ RemoteException -> 0x025e }
            java.lang.Object r0 = r10.get()     // Catch:{ RemoteException -> 0x025e }
            X.4ZJ r0 = (X.AnonymousClass4ZJ) r0     // Catch:{ RemoteException -> 0x025e }
            if (r0 == 0) goto L_0x01cd
            android.database.Cursor r0 = r0.A00     // Catch:{ RemoteException -> 0x025e }
            if (r0 == 0) goto L_0x01cd
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x025e }
            return r3
        L_0x01cd:
            X.2sR r9 = new X.2sR     // Catch:{ RemoteException -> 0x025e }
            r9.<init>(r4)     // Catch:{ RemoteException -> 0x025e }
            java.lang.ThreadLocal r0 = A0B     // Catch:{ RemoteException -> 0x025e }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x025e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x025e }
            long r0 = r0.longValue()     // Catch:{ RemoteException -> 0x025e }
            android.os.Parcel r6 = A04(r9, r6, r8, r7)     // Catch:{ RemoteException -> 0x025e }
            r6.writeLong(r0)     // Catch:{ RemoteException -> 0x025e }
            r0 = 7
            com.google.android.gms.dynamic.IObjectWrapper r0 = A05(r6, r2, r0)     // Catch:{ RemoteException -> 0x025e }
            java.lang.Object r6 = X.C58032sR.A01(r0)     // Catch:{ RemoteException -> 0x025e }
            android.database.Cursor r6 = (android.database.Cursor) r6     // Catch:{ RemoteException -> 0x025e }
            if (r6 == 0) goto L_0x0211
            boolean r0 = r6.moveToFirst()     // Catch:{ RemoteException -> 0x021e, all -> 0x0276 }
            if (r0 == 0) goto L_0x0211
            int r2 = r6.getInt(r3)     // Catch:{ RemoteException -> 0x021e, all -> 0x0276 }
            if (r2 <= 0) goto L_0x020d
            java.lang.Object r1 = r10.get()     // Catch:{ RemoteException -> 0x021e, all -> 0x0276 }
            X.4ZJ r1 = (X.AnonymousClass4ZJ) r1     // Catch:{ RemoteException -> 0x021e, all -> 0x0276 }
            if (r1 == 0) goto L_0x020d
            android.database.Cursor r0 = r1.A00     // Catch:{ RemoteException -> 0x021e, all -> 0x0276 }
            if (r0 != 0) goto L_0x020d
            r1.A00 = r6     // Catch:{ RemoteException -> 0x021e, all -> 0x0276 }
            return r2
        L_0x020d:
            r6.close()     // Catch:{ all -> 0x0283 }
            return r2
        L_0x0211:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x021e, all -> 0x0276 }
            if (r6 == 0) goto L_0x027b
            r6.close()     // Catch:{ all -> 0x0283 }
            return r3
        L_0x021e:
            r0 = move-exception
            r5 = r6
            goto L_0x025f
        L_0x0221:
            r0 = 2
            if (r1 != r0) goto L_0x0241
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x025e }
            X.2sR r0 = new X.2sR     // Catch:{ RemoteException -> 0x025e }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x025e }
            android.os.Parcel r1 = A04(r0, r6, r8, r7)     // Catch:{ RemoteException -> 0x025e }
            r0 = 5
            android.os.Parcel r0 = r2.A00(r0, r1)     // Catch:{ RemoteException -> 0x025e }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x025e }
            r0.recycle()     // Catch:{ RemoteException -> 0x025e }
            return r1
        L_0x0241:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r0)     // Catch:{ RemoteException -> 0x025e }
            X.2sR r0 = new X.2sR     // Catch:{ RemoteException -> 0x025e }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x025e }
            android.os.Parcel r1 = A04(r0, r6, r8, r7)     // Catch:{ RemoteException -> 0x025e }
            r0 = 3
            android.os.Parcel r0 = r2.A00(r0, r1)     // Catch:{ RemoteException -> 0x025e }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x025e }
            r0.recycle()     // Catch:{ RemoteException -> 0x025e }
            return r1
        L_0x025e:
            r0 = move-exception
        L_0x025f:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = "Failed to retrieve remote module version: "
            java.lang.String r0 = X.AnonymousClass3K3.A0q(r0)     // Catch:{ all -> 0x0274 }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ all -> 0x0274 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0274 }
            if (r5 == 0) goto L_0x027b
            r5.close()     // Catch:{ all -> 0x0283 }
            return r3
        L_0x0274:
            r0 = move-exception
            goto L_0x0278
        L_0x0276:
            r0 = move-exception
            r5 = r6
        L_0x0278:
            if (r5 == 0) goto L_0x0282
            goto L_0x027f
        L_0x027b:
            return r3
        L_0x027c:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x027c }
            goto L_0x0282
        L_0x027f:
            r5.close()     // Catch:{ all -> 0x0283 }
        L_0x0282:
            throw r0     // Catch:{ all -> 0x0283 }
        L_0x0283:
            r3 = move-exception
            X.C13710nw.A01(r4)     // Catch:{ Exception -> 0x0288 }
            throw r3
        L_0x0288:
            r2 = move-exception
            java.lang.String r1 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r1, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90844ev.A01(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (r3 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bf, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c7, code lost:
        throw new X.C803743p("V2 version check failed", r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bf A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c0 A[Catch:{ all -> 0x00c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            r8 = 0
            java.lang.ThreadLocal r0 = A0B     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            long r4 = r0.longValue()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            android.content.ContentResolver r6 = r9.getContentResolver()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            java.lang.String r3 = "api_force_staging"
            java.lang.String r0 = "api"
            r1 = 1
            if (r1 == r11) goto L_0x0019
            r3 = r0
        L_0x0019:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            r2.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            java.lang.String r0 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r0)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            java.lang.String r0 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r2.authority(r0)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            android.net.Uri$Builder r0 = r0.path(r3)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            android.net.Uri$Builder r3 = r0.appendPath(r10)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            java.lang.String r2 = "requestStartTime"
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            android.net.Uri$Builder r0 = r3.appendQueryParameter(r2, r0)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            android.net.Uri r7 = r0.build()     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            r10 = r8
            r11 = r8
            r9 = r8
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00b9, all -> 0x00b7 }
            if (r3 == 0) goto L_0x00a6
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x00b5 }
            if (r0 == 0) goto L_0x00a6
            r5 = 0
            int r4 = r3.getInt(r5)     // Catch:{ Exception -> 0x00b5 }
            if (r4 <= 0) goto L_0x009a
            java.lang.Class<X.4ev> r2 = X.C90844ev.class
            monitor-enter(r2)     // Catch:{ Exception -> 0x00b5 }
            r0 = 2
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0092 }
            A05 = r0     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "loaderVersion"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            if (r0 < 0) goto L_0x006e
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0092 }
            A01 = r0     // Catch:{ all -> 0x0092 }
        L_0x006e:
            java.lang.String r0 = "disableStandaloneDynamiteLoader"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0092 }
            if (r0 < 0) goto L_0x0080
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x007d
            r1 = 0
        L_0x007d:
            A06 = r1     // Catch:{ all -> 0x0092 }
            r5 = r1
        L_0x0080:
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            java.lang.ThreadLocal r0 = A0A     // Catch:{ Exception -> 0x00b5 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x00b5 }
            X.4ZJ r1 = (X.AnonymousClass4ZJ) r1     // Catch:{ Exception -> 0x00b5 }
            if (r1 == 0) goto L_0x0096
            android.database.Cursor r0 = r1.A00     // Catch:{ Exception -> 0x00b5 }
            if (r0 != 0) goto L_0x0096
            r1.A00 = r3     // Catch:{ Exception -> 0x00b5 }
            goto L_0x0095
        L_0x0092:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            goto L_0x00b4
        L_0x0095:
            r3 = r8
        L_0x0096:
            if (r5 != 0) goto L_0x009e
            if (r3 == 0) goto L_0x009d
        L_0x009a:
            r3.close()
        L_0x009d:
            return r4
        L_0x009e:
            java.lang.String r0 = "forcing fallback to container DynamiteLoader impl"
            X.43p r1 = new X.43p     // Catch:{ Exception -> 0x00b5 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00b4
        L_0x00a6:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r1, r0)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = "Failed to connect to dynamite module ContentResolver."
            X.43p r1 = new X.43p     // Catch:{ Exception -> 0x00b5 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00b5 }
        L_0x00b4:
            throw r1     // Catch:{ Exception -> 0x00b5 }
        L_0x00b5:
            r2 = move-exception
            goto L_0x00bb
        L_0x00b7:
            r0 = move-exception
            throw r0
        L_0x00b9:
            r2 = move-exception
            r3 = r8
        L_0x00bb:
            boolean r0 = r2 instanceof X.C803743p     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c0
            throw r2     // Catch:{ all -> 0x00c8 }
        L_0x00c0:
            java.lang.String r1 = "V2 version check failed"
            X.43p r0 = new X.43p     // Catch:{ all -> 0x00c8 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            if (r3 == 0) goto L_0x00ce
            r3.close()
        L_0x00ce:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90844ev.A02(android.content.Context, java.lang.String, boolean):int");
    }

    public static Parcel A03(C92104h1 r4, Object obj, Object obj2, String str, int i2) {
        C58032sR r3 = new C58032sR(obj);
        C58032sR r2 = new C58032sR(obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r4.A01);
        obtain.writeStrongBinder(r3.asBinder());
        obtain.writeString(str);
        obtain.writeInt(i2);
        obtain.writeStrongBinder(r2.asBinder());
        return obtain;
    }

    public static Parcel A04(C31381e3 r2, String str, String str2, int i2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(str);
        obtain.writeStrongBinder(r2.asBinder());
        obtain.writeString(str2);
        obtain.writeInt(i2);
        return obtain;
    }

    public static IObjectWrapper A05(Parcel parcel, C92104h1 r1, int i2) {
        Parcel A002 = r1.A00(i2, parcel);
        IObjectWrapper A003 = C31371e2.A00(A002.readStrongBinder());
        A002.recycle();
        return A003;
    }

    public static C90844ev A06(Context context, AnonymousClass5Ny r20, String str) {
        C803743p r1;
        C90844ev r3;
        int i2;
        C803743p r2;
        Boolean bool;
        C90844ev r12;
        IObjectWrapper iObjectWrapper;
        C66413Zg r15;
        Boolean valueOf;
        IObjectWrapper A052;
        Class<C90844ev> cls = C90844ev.class;
        ThreadLocal threadLocal = A0A;
        Object obj = threadLocal.get();
        AnonymousClass4ZJ r8 = new AnonymousClass4ZJ((AnonymousClass44L) null);
        threadLocal.set(r8);
        ThreadLocal threadLocal2 = A0B;
        Number number = (Number) threadLocal2.get();
        long longValue = number.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            Context context2 = context;
            AnonymousClass5Ny r19 = r20;
            String str2 = str;
            C84154Jl AdJ = r19.AdJ(context2, A07, str2);
            int i3 = AdJ.A00;
            int i4 = AdJ.A01;
            StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str2) + 68 + C13680ns.A06(str2));
            A0g.append("Considering local module ");
            A0g.append(str2);
            A0g.append(":");
            A0g.append(i3);
            A0g.append(" and remote module ");
            A0g.append(str2);
            Log.i("DynamiteModule", C13680ns.A0i(":", A0g, i4));
            int i5 = AdJ.A02;
            if (i5 != 0) {
                if (i5 == -1) {
                    if (AdJ.A00 != 0) {
                        String valueOf2 = String.valueOf(str2);
                        Log.i("DynamiteModule", valueOf2.length() != 0 ? "Selected local version of ".concat(valueOf2) : new String("Selected local version of "));
                        r3 = new C90844ev(context2.getApplicationContext());
                    }
                } else if (i5 == 1) {
                    int i6 = AdJ.A01;
                    if (i6 != 0) {
                        try {
                            synchronized (cls) {
                                try {
                                    bool = A04;
                                } catch (Throwable th) {
                                    while (true) {
                                        th = th;
                                        break;
                                    }
                                }
                            }
                            if (bool != null) {
                                if (bool.booleanValue()) {
                                    StringBuilder A0g2 = C13690nt.A0g(C13680ns.A06(str2) + 51);
                                    A0g2.append("Selected remote version of ");
                                    A0g2.append(str2);
                                    Log.i("DynamiteModule", C13680ns.A0i(", version >= ", A0g2, i6));
                                    synchronized (cls) {
                                        try {
                                            r15 = A03;
                                        } catch (Throwable th2) {
                                            while (true) {
                                                th = th2;
                                                break;
                                            }
                                        }
                                    }
                                    if (r15 != null) {
                                        AnonymousClass4ZJ r0 = (AnonymousClass4ZJ) threadLocal.get();
                                        if (r0 == null || r0.A00 == null) {
                                            th = new C803743p("No result cursor");
                                        } else {
                                            Context applicationContext = context2.getApplicationContext();
                                            Cursor cursor = r0.A00;
                                            new C58032sR((Object) null);
                                            synchronized (cls) {
                                                try {
                                                    valueOf = Boolean.valueOf(AnonymousClass3K3.A1P(A01, 2));
                                                } catch (Throwable th3) {
                                                    while (true) {
                                                        th = th3;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (valueOf.booleanValue()) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                A052 = A05(A03(r15, applicationContext, cursor, str2, i6), r15, 3);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                A052 = A05(A03(r15, applicationContext, cursor, str2, i6), r15, 2);
                                            }
                                            Context context3 = (Context) C58032sR.A01(A052);
                                            if (context3 != null) {
                                                r12 = new C90844ev(context3);
                                            } else {
                                                th = new C803743p("Failed to get module context");
                                            }
                                        }
                                    } else {
                                        th = new C803743p("DynamiteLoaderV2 was not cached.");
                                    }
                                } else {
                                    StringBuilder A0g3 = C13690nt.A0g(C13680ns.A06(str2) + 51);
                                    A0g3.append("Selected remote version of ");
                                    A0g3.append(str2);
                                    Log.i("DynamiteModule", C13680ns.A0i(", version >= ", A0g3, i6));
                                    C66403Zf A072 = A07(context2);
                                    if (A072 != null) {
                                        Parcel obtain = Parcel.obtain();
                                        String str3 = A072.A01;
                                        obtain.writeInterfaceToken(str3);
                                        Parcel A002 = A072.A00(6, obtain);
                                        int readInt = A002.readInt();
                                        A002.recycle();
                                        if (readInt >= 3) {
                                            AnonymousClass4ZJ r02 = (AnonymousClass4ZJ) threadLocal.get();
                                            if (r02 != null) {
                                                C58032sR r22 = new C58032sR(context2);
                                                C58032sR r03 = new C58032sR(r02.A00);
                                                Parcel A042 = A04(r22, str3, str2, i6);
                                                A042.writeStrongBinder(r03.asBinder());
                                                iObjectWrapper = A05(A042, A072, 8);
                                            } else {
                                                th = new C803743p("No cached result cursor holder");
                                            }
                                        } else if (readInt == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            iObjectWrapper = A05(A04(new C58032sR(context2), str3, str2, i6), A072, 4);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            iObjectWrapper = A05(A04(new C58032sR(context2), str3, str2, i6), A072, 2);
                                        }
                                        if (C58032sR.A01(iObjectWrapper) != null) {
                                            r12 = new C90844ev((Context) C58032sR.A01(iObjectWrapper));
                                        } else {
                                            th = new C803743p("Failed to load remote module.");
                                        }
                                    } else {
                                        th = new C803743p("Failed to create IDynamiteLoader.");
                                    }
                                }
                                if (longValue == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(number);
                                }
                                Cursor cursor2 = r8.A00;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                threadLocal.set(obj);
                                return r12;
                            }
                            th = new C803743p("Failed to determine which loading route to use.");
                            throw th;
                        } catch (RemoteException e2) {
                            r2 = new C803743p("Failed to load remote module.", e2);
                        } catch (C803743p e3) {
                            throw e3;
                        } catch (C803743p e4) {
                            Log.w("DynamiteModule", C13680ns.A0g(AnonymousClass3K3.A0q(e4), "Failed to load remote module: "));
                            int i7 = AdJ.A00;
                            if (i7 != 0) {
                                if (r19.AdJ(context2, new C98124r8(i7), str2).A02 == -1) {
                                    String valueOf3 = String.valueOf(str2);
                                    Log.i("DynamiteModule", valueOf3.length() != 0 ? "Selected local version of ".concat(valueOf3) : new String("Selected local version of "));
                                    r3 = new C90844ev(context2.getApplicationContext());
                                }
                            }
                            throw new C803743p("Remote load failed. No local fallback found.", e4);
                        } catch (Throwable th4) {
                            try {
                                C13710nw.A01(context2);
                            } catch (Exception e5) {
                                Log.e("CrashUtils", "Error adding exception to DropBox!", e5);
                            }
                            r2 = new C803743p("Failed to load remote module.", th4);
                        }
                    }
                } else {
                    r1 = new C803743p(C13680ns.A0i("VersionPolicy returned invalid code:", C13690nt.A0g(47), i5));
                    throw r1;
                }
                if (i2 != 0) {
                    threadLocal2.set(number);
                }
                return r3;
            }
            int i8 = AdJ.A00;
            int i9 = AdJ.A01;
            StringBuilder A0g4 = C13690nt.A0g(C13680ns.A06(str2) + 92);
            A0g4.append("No acceptable module ");
            A0g4.append(str2);
            A0g4.append(" found. Local version is ");
            A0g4.append(i8);
            A0g4.append(" and remote version is ");
            A0g4.append(i9);
            r1 = new C803743p(AnonymousClass000.A0h(".", A0g4));
            throw r1;
            throw r2;
        } finally {
            if (longValue == 0) {
                threadLocal2.remove();
            } else {
                threadLocal2.set(number);
            }
            Cursor cursor3 = r8.A00;
            if (cursor3 != null) {
                cursor3.close();
            }
            threadLocal.set(obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C66403Zf A07(android.content.Context r5) {
        /*
            java.lang.Class<X.4ev> r4 = X.C90844ev.class
            monitor-enter(r4)
            X.3Zf r3 = A02     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x004a
            r3 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r5.createPackageContext(r1, r0)     // Catch:{ Exception -> 0x003a }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ Exception -> 0x003a }
            java.lang.Object r2 = r0.newInstance()     // Catch:{ Exception -> 0x003a }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ Exception -> 0x003a }
            if (r2 == 0) goto L_0x004a
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)     // Catch:{ Exception -> 0x003a }
            boolean r0 = r1 instanceof X.C66403Zf     // Catch:{ Exception -> 0x003a }
            if (r0 == 0) goto L_0x0032
            X.3Zf r1 = (X.C66403Zf) r1     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x004a
        L_0x002f:
            A02 = r1     // Catch:{ Exception -> 0x003a }
            goto L_0x0038
        L_0x0032:
            X.3Zf r1 = new X.3Zf     // Catch:{ Exception -> 0x003a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x003a }
            goto L_0x002f
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            return r1
        L_0x003a:
            r0 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r0 = X.AnonymousClass3K3.A0q(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ all -> 0x004c }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            return r3
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90844ev.A07(android.content.Context):X.3Zf");
    }

    public static void A08(ClassLoader classLoader) {
        C66413Zg r3 = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                r3 = queryLocalInterface instanceof C66413Zg ? (C66413Zg) queryLocalInterface : new C66413Zg(iBinder);
            }
            A03 = r3;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new C803743p("Failed to instantiate dynamite loader", e2);
        }
    }
}
