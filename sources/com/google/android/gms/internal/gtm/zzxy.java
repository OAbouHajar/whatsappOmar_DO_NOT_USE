package com.google.android.gms.internal.gtm;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class zzxy {
    public static final long zza = ((long) zzz(byte[].class));
    public static final boolean zzb;
    public static final Unsafe zzc;
    public static final Class zzd = zzsk.zza();
    public static final boolean zze;
    public static final boolean zzf;
    public static final zzxx zzg;
    public static final boolean zzh;
    public static final boolean zzi;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        if (r12.getDeclaredField("effectiveDirectAddress") == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        if (r2 != null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        if (r2.getType() == java.lang.Long.TYPE) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0176, code lost:
        r0 = zzg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0178, code lost:
        if (r0 == null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017a, code lost:
        r0.zzl(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0185  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r8 = java.lang.Object[].class
            java.lang.Class<double[]> r7 = double[].class
            java.lang.Class<float[]> r6 = float[].class
            java.lang.Class<long[]> r5 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r2 = boolean[].class
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
            com.google.android.gms.internal.gtm.zzxu r0 = new com.google.android.gms.internal.gtm.zzxu     // Catch:{ all -> 0x001a }
            r0.<init>()     // Catch:{ all -> 0x001a }
            java.lang.Object r9 = java.security.AccessController.doPrivileged(r0)     // Catch:{ all -> 0x001a }
            sun.misc.Unsafe r9 = (sun.misc.Unsafe) r9     // Catch:{ all -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r9 = 0
        L_0x001b:
            zzc = r9
            java.lang.Class r0 = com.google.android.gms.internal.gtm.zzsk.zza()
            zzd = r0
            java.lang.Class r11 = java.lang.Long.TYPE
            boolean r3 = zzv(r11)
            zze = r3
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r1 = zzv(r0)
            zzf = r1
            r0 = 0
            if (r9 == 0) goto L_0x003d
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.internal.gtm.zzxw r0 = new com.google.android.gms.internal.gtm.zzxw
            r0.<init>(r9)
        L_0x003d:
            zzg = r0
            java.lang.String r10 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r1 = 2
            r3 = 1
            r14 = 0
            if (r0 == 0) goto L_0x0088
            sun.misc.Unsafe r0 = r0.zza
            if (r0 == 0) goto L_0x0088
            goto L_0x0055
        L_0x004d:
            if (r1 == 0) goto L_0x003d
            com.google.android.gms.internal.gtm.zzxv r0 = new com.google.android.gms.internal.gtm.zzxv
            r0.<init>(r9)
            goto L_0x003d
        L_0x0055:
            java.lang.Class r13 = r0.getClass()     // Catch:{ all -> 0x0084 }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x0084 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r12[r14] = r0     // Catch:{ all -> 0x0084 }
            r13.getMethod(r9, r12)     // Catch:{ all -> 0x0084 }
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ all -> 0x0084 }
            r0[r14] = r15     // Catch:{ all -> 0x0084 }
            r0[r3] = r11     // Catch:{ all -> 0x0084 }
            r13.getMethod(r10, r0)     // Catch:{ all -> 0x0084 }
            java.lang.Class<java.nio.Buffer> r12 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r12.getDeclaredField(r0)     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x008a
        L_0x0075:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r0 = r12.getDeclaredField(r0)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0088
            java.lang.Class r0 = r0.getType()     // Catch:{ all -> 0x0084 }
            if (r0 != r11) goto L_0x0088
            goto L_0x008a
        L_0x0084:
            r0 = move-exception
            zzh(r0)
        L_0x0088:
            r0 = 0
            goto L_0x008b
        L_0x008a:
            r0 = 1
        L_0x008b:
            zzh = r0
            com.google.android.gms.internal.gtm.zzxx r0 = zzg
            if (r0 == 0) goto L_0x0106
            sun.misc.Unsafe r0 = r0.zza
            if (r0 == 0) goto L_0x0106
            java.lang.Class r11 = r0.getClass()     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x0102 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r12[r14] = r0     // Catch:{ all -> 0x0102 }
            r11.getMethod(r9, r12)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x0102 }
            java.lang.Class<java.lang.Class> r12 = java.lang.Class.class
            r9[r14] = r12     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "arrayBaseOffset"
            r11.getMethod(r0, r9)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x0102 }
            r9[r14] = r12     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "arrayIndexScale"
            r11.getMethod(r0, r9)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ all -> 0x0102 }
            r9[r14] = r15     // Catch:{ all -> 0x0102 }
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ all -> 0x0102 }
            r9[r3] = r13     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "getInt"
            r11.getMethod(r0, r9)     // Catch:{ all -> 0x0102 }
            r12 = 3
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x0102 }
            r9[r14] = r15     // Catch:{ all -> 0x0102 }
            r9[r3] = r13     // Catch:{ all -> 0x0102 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0102 }
            r9[r1] = r0     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "putInt"
            r11.getMethod(r0, r9)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ all -> 0x0102 }
            r0[r14] = r15     // Catch:{ all -> 0x0102 }
            r0[r3] = r13     // Catch:{ all -> 0x0102 }
            r11.getMethod(r10, r0)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x0102 }
            r9[r14] = r15     // Catch:{ all -> 0x0102 }
            r9[r3] = r13     // Catch:{ all -> 0x0102 }
            r9[r1] = r13     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "putLong"
            r11.getMethod(r0, r9)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ all -> 0x0102 }
            r9[r14] = r15     // Catch:{ all -> 0x0102 }
            r9[r3] = r13     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "getObject"
            r11.getMethod(r0, r9)     // Catch:{ all -> 0x0102 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x0102 }
            r9[r14] = r15     // Catch:{ all -> 0x0102 }
            r9[r3] = r13     // Catch:{ all -> 0x0102 }
            r9[r1] = r15     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "putObject"
            r11.getMethod(r0, r9)     // Catch:{ all -> 0x0102 }
            goto L_0x0108
        L_0x0102:
            r0 = move-exception
            zzh(r0)
        L_0x0106:
            r0 = 0
            goto L_0x0109
        L_0x0108:
            r0 = 1
        L_0x0109:
            zzi = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzz(r0)
            long r0 = (long) r0
            zza = r0
            zzz(r2)
            boolean r0 = zzi
            if (r0 == 0) goto L_0x0120
            com.google.android.gms.internal.gtm.zzxx r0 = zzg
            r0.zzi(r2)
        L_0x0120:
            zzz(r4)
            boolean r0 = zzi
            if (r0 == 0) goto L_0x012c
            com.google.android.gms.internal.gtm.zzxx r0 = zzg
            r0.zzi(r4)
        L_0x012c:
            zzz(r5)
            boolean r0 = zzi
            if (r0 == 0) goto L_0x0138
            com.google.android.gms.internal.gtm.zzxx r0 = zzg
            r0.zzi(r5)
        L_0x0138:
            zzz(r6)
            boolean r0 = zzi
            if (r0 == 0) goto L_0x0144
            com.google.android.gms.internal.gtm.zzxx r0 = zzg
            r0.zzi(r6)
        L_0x0144:
            zzz(r7)
            boolean r0 = zzi
            if (r0 == 0) goto L_0x0150
            com.google.android.gms.internal.gtm.zzxx r0 = zzg
            r0.zzi(r7)
        L_0x0150:
            zzz(r8)
            boolean r0 = zzi
            if (r0 == 0) goto L_0x015c
            com.google.android.gms.internal.gtm.zzxx r0 = zzg
            r0.zzi(r8)
        L_0x015c:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0166 }
            if (r2 != 0) goto L_0x0176
        L_0x0166:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x017d }
            if (r2 == 0) goto L_0x017d
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x017d
        L_0x0176:
            com.google.android.gms.internal.gtm.zzxx r0 = zzg
            if (r0 == 0) goto L_0x017d
            r0.zzl(r2)
        L_0x017d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x0186
            r3 = 0
        L_0x0186:
            zzb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzxy.<clinit>():void");
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger logger = Logger.getLogger(zzxy.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    public static boolean zzv(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class cls3 = zzd;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int zzz(Class cls) {
        if (zzi) {
            return zzg.zzh(cls);
        }
        return -1;
    }
}
