package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: X.4f4  reason: invalid class name and case insensitive filesystem */
public final class C90914f4 {
    public static final long A00;
    public static final AnonymousClass4XS A01;
    public static final Class A02 = C87864Yy.A00;
    public static final Unsafe A03;
    public static final boolean A04 = AnonymousClass000.A1Y(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    public static final boolean A05;
    public static final boolean A06;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013c A[SYNTHETIC, Splitter:B:44:0x013c] */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r19 = java.lang.Object[].class
            java.lang.Class<double[]> r18 = double[].class
            java.lang.Class<float[]> r17 = float[].class
            java.lang.Class<long[]> r16 = long[].class
            java.lang.Class<int[]> r15 = int[].class
            java.lang.Class<boolean[]> r14 = boolean[].class
            sun.misc.Unsafe r3 = A05()
            A03 = r3
            java.lang.Class r0 = X.C87864Yy.A00
            A02 = r0
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<byte[]> r13 = byte[].class
            boolean r0 = X.C87864Yy.A00()
            r12 = 0
            if (r0 != 0) goto L_0x005f
            r2 = 0
        L_0x0022:
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r0 = X.C87864Yy.A00()
            if (r0 != 0) goto L_0x0056
            r1 = 0
        L_0x002b:
            r6 = 0
            if (r3 == 0) goto L_0x003b
            boolean r0 = X.C87864Yy.A00()
            if (r0 == 0) goto L_0x0050
            if (r2 == 0) goto L_0x0048
            X.3bP r6 = new X.3bP
            r6.<init>(r3)
        L_0x003b:
            A01 = r6
            java.lang.String r8 = "copyMemory"
            java.lang.String r7 = "getLong"
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            sun.misc.Unsafe r0 = A03
            if (r0 == 0) goto L_0x00eb
            goto L_0x0068
        L_0x0048:
            if (r1 == 0) goto L_0x003b
            X.3bN r6 = new X.3bN
            r6.<init>(r3)
            goto L_0x003b
        L_0x0050:
            X.3bO r6 = new X.3bO
            r6.<init>(r3)
            goto L_0x003b
        L_0x0056:
            java.lang.Class r0 = A02     // Catch:{ all -> 0x005d }
            boolean r1 = X.AnonymousClass3K2.A1Y(r0, r5)     // Catch:{ all -> 0x005d }
            goto L_0x002b
        L_0x005d:
            r1 = 0
            goto L_0x002b
        L_0x005f:
            java.lang.Class r0 = A02     // Catch:{ all -> 0x0066 }
            boolean r2 = X.AnonymousClass3K2.A1Y(r0, r1)     // Catch:{ all -> 0x0066 }
            goto L_0x0022
        L_0x0066:
            r2 = 0
            goto L_0x0022
        L_0x0068:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "objectFieldOffset"
            r10 = 1
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00be }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r12] = r0     // Catch:{ all -> 0x00be }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00be }
            r9 = 2
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x00be }
            r0[r12] = r11     // Catch:{ all -> 0x00be }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x00be }
            r0[r10] = r3     // Catch:{ all -> 0x00be }
            r4.getMethod(r7, r0)     // Catch:{ all -> 0x00be }
            java.lang.reflect.Field r0 = A04()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00eb
            boolean r0 = X.C87864Yy.A00()     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x00ed
            java.lang.Class[] r0 = X.AnonymousClass3K2.A1b(r4, r3)     // Catch:{ all -> 0x00be }
            r4.getMethod(r7, r0)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x00be }
            r0[r12] = r3     // Catch:{ all -> 0x00be }
            r0[r10] = r3     // Catch:{ all -> 0x00be }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00be }
            r2 = 3
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x00be }
            r0[r12] = r3     // Catch:{ all -> 0x00be }
            r0[r10] = r3     // Catch:{ all -> 0x00be }
            r0[r9] = r3     // Catch:{ all -> 0x00be }
            r4.getMethod(r8, r0)     // Catch:{ all -> 0x00be }
            r0 = 5
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r3, r0)     // Catch:{ all -> 0x00be }
            r1[r9] = r11     // Catch:{ all -> 0x00be }
            r1[r2] = r3     // Catch:{ all -> 0x00be }
            r0 = 4
            r1[r0] = r3     // Catch:{ all -> 0x00be }
            r4.getMethod(r8, r1)     // Catch:{ all -> 0x00be }
            goto L_0x00ed
        L_0x00be:
            r1 = move-exception
            java.lang.Class<X.4f4> r0 = X.C90914f4.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r0 = r2.length()
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            r1.append(r0)
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeByteBufferOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00ee
        L_0x00eb:
            r0 = 0
            goto L_0x00ee
        L_0x00ed:
            r0 = 1
        L_0x00ee:
            A05 = r0
            sun.misc.Unsafe r0 = A03
            if (r0 != 0) goto L_0x013c
            r0 = 0
        L_0x00f5:
            A06 = r0
            int r0 = A01(r13)
            long r0 = (long) r0
            A00 = r0
            A01(r14)
            A06(r14)
            A01(r15)
            A06(r15)
            A01(r16)
            A06(r16)
            A01(r17)
            A06(r17)
            A01(r18)
            A06(r18)
            A01(r19)
            A06(r19)
            java.lang.reflect.Field r1 = A04()
            if (r1 == 0) goto L_0x012f
            if (r6 == 0) goto L_0x012f
            sun.misc.Unsafe r0 = r6.A00
            r0.objectFieldOffset(r1)
        L_0x012f:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            A04 = r0
            return
        L_0x013c:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x0201 }
            java.lang.String r2 = "objectFieldOffset"
            r8 = 1
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ all -> 0x0201 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r12] = r0     // Catch:{ all -> 0x0201 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "arrayBaseOffset"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ all -> 0x0201 }
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r0[r12] = r2     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ all -> 0x0201 }
            r0[r12] = r2     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "getInt"
            r3 = 2
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x0201 }
            r0[r12] = r11     // Catch:{ all -> 0x0201 }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ all -> 0x0201 }
            r0[r8] = r9     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "putInt"
            r8 = 3
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0201 }
            r0[r3] = r5     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0201 }
            r4.getMethod(r7, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0201 }
            r0[r3] = r9     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0201 }
            r0[r3] = r11     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            boolean r0 = X.C87864Yy.A00()     // Catch:{ all -> 0x0201 }
            if (r0 != 0) goto L_0x01fe
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0201 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0201 }
            r1[r3] = r0     // Catch:{ all -> 0x0201 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r2 = "putBoolean"
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0201 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0201 }
            r1[r3] = r0     // Catch:{ all -> 0x0201 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r2 = "putFloat"
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0201 }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x0201 }
            r1[r3] = r0     // Catch:{ all -> 0x0201 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0201 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0201 }
            java.lang.String r2 = "putDouble"
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0201 }
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ all -> 0x0201 }
            r1[r3] = r0     // Catch:{ all -> 0x0201 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0201 }
        L_0x01fe:
            r0 = 1
            goto L_0x00f5
        L_0x0201:
            r1 = move-exception
            java.lang.Class<X.4f4> r0 = X.C90914f4.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r0 = r2.length()
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            r1.append(r0)
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeArrayOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00f5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90914f4.<clinit>():void");
    }

    public static byte A00(byte[] bArr, long j2) {
        return A01.A01(bArr, A00 + j2);
    }

    public static int A01(Class cls) {
        if (A06) {
            return A01.A00.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Object A02(Class cls) {
        try {
            return A03.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object A03(Object obj, long j2) {
        return A01.A00.getObject(obj, j2);
    }

    public static Field A04() {
        Field field;
        Field field2;
        if (C87864Yy.A00()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static Unsafe A05() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1046456i());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A06(Class cls) {
        if (A06) {
            A01.A00.arrayIndexScale(cls);
        }
    }

    public static void A07(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        AnonymousClass4XS r4 = A01;
        r4.A09(obj, j3, AnonymousClass3K3.A0D(((int) j2) ^ -1, r4.A04(obj, j3), b2));
    }

    public static void A08(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        AnonymousClass4XS r4 = A01;
        r4.A09(obj, j3, AnonymousClass3K3.A0D((int) j2, r4.A04(obj, j3), b2));
    }

    public static void A09(Object obj, long j2, Object obj2) {
        A01.A00.putObject(obj, j2, obj2);
    }

    public static void A0A(byte[] bArr, byte b2, long j2) {
        A01.A06(bArr, A00 + j2, b2);
    }
}
