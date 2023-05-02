package X;

import android.database.Cursor;
import android.os.Build;

/* renamed from: X.0XK  reason: invalid class name */
public final class AnonymousClass0XK {
    public static final int A00(AnonymousClass04P r1) {
        switch (r1.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                throw new AnonymousClass2Xe();
        }
    }

    public static final int A01(AnonymousClass041 r3) {
        switch (r3.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                if (Build.VERSION.SDK_INT >= 30 && r3 == AnonymousClass041.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                StringBuilder A0r = AnonymousClass000.A0r("Could not convert ");
                A0r.append(r3);
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(" to int", A0r));
        }
    }

    public static final int A02(C007403j r1) {
        C18450wi.A0H(r1, 0);
        switch (r1.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                throw new AnonymousClass2Xe();
        }
    }

    public static final int A03(AnonymousClass0KV r1) {
        C18450wi.A0H(r1, 0);
        switch (r1.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                throw new AnonymousClass2Xe();
        }
    }

    public static final AnonymousClass04P A04(int i2) {
        if (i2 == 0) {
            return AnonymousClass04P.EXPONENTIAL;
        }
        if (i2 == 1) {
            return AnonymousClass04P.LINEAR;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Could not convert ");
        A0r.append(i2);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" to BackoffPolicy", A0r));
    }

    public static final AnonymousClass041 A05(int i2) {
        if (i2 == 0) {
            return AnonymousClass041.NOT_REQUIRED;
        }
        if (i2 == 1) {
            return AnonymousClass041.CONNECTED;
        }
        if (i2 == 2) {
            return AnonymousClass041.UNMETERED;
        }
        if (i2 == 3) {
            return AnonymousClass041.NOT_ROAMING;
        }
        if (i2 == 4) {
            return AnonymousClass041.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return AnonymousClass041.TEMPORARILY_UNMETERED;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Could not convert ");
        A0r.append(i2);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" to NetworkType", A0r));
    }

    public static final C007403j A06(int i2) {
        if (i2 == 0) {
            return C007403j.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i2 == 1) {
            return C007403j.DROP_WORK_REQUEST;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Could not convert ");
        A0r.append(i2);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" to OutOfQuotaPolicy", A0r));
    }

    public static final AnonymousClass0KV A07(int i2) {
        if (i2 == 0) {
            return AnonymousClass0KV.ENQUEUED;
        }
        if (i2 == 1) {
            return AnonymousClass0KV.RUNNING;
        }
        if (i2 == 2) {
            return AnonymousClass0KV.SUCCEEDED;
        }
        if (i2 == 3) {
            return AnonymousClass0KV.FAILED;
        }
        if (i2 == 4) {
            return AnonymousClass0KV.BLOCKED;
        }
        if (i2 == 5) {
            return AnonymousClass0KV.CANCELLED;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Could not convert ");
        A0r.append(i2);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" to State", A0r));
    }

    public static AnonymousClass0KV A08(Cursor cursor, int i2) {
        return A07(cursor.getInt(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C41191vO.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set A09(byte[] r9) {
        /*
            r0 = 0
            X.C18450wi.A0H(r9, r0)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            int r0 = r9.length
            r7 = 0
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x0056
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r9)
            r5 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0047 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x0047 }
            int r3 = r4.readInt()     // Catch:{ all -> 0x0040 }
        L_0x0020:
            if (r7 >= r3) goto L_0x003c
            java.lang.String r0 = r4.readUTF()     // Catch:{ all -> 0x0040 }
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0040 }
            boolean r1 = r4.readBoolean()     // Catch:{ all -> 0x0040 }
            X.C18450wi.A0B(r2)     // Catch:{ all -> 0x0040 }
            X.0QL r0 = new X.0QL     // Catch:{ all -> 0x0040 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0040 }
            r8.add(r0)     // Catch:{ all -> 0x0040 }
            int r7 = r7 + 1
            goto L_0x0020
        L_0x003c:
            X.C41191vO.A00(r4, r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            X.C41191vO.A00(r4, r1)     // Catch:{ IOException -> 0x0047 }
            throw r0     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x004f }
        L_0x004b:
            X.C41191vO.A00(r6, r5)
            return r8
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.C41191vO.A00(r6, r1)
            throw r0
        L_0x0056:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XK.A09(byte[]):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C41191vO.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        X.C41191vO.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A0A(java.util.Set r5) {
        /*
            r1 = 0
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x000a
            byte[] r0 = new byte[r1]
            return r0
        L_0x000a:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0050 }
            r3.<init>(r4)     // Catch:{ all -> 0x0050 }
            int r0 = r5.size()     // Catch:{ all -> 0x0049 }
            r3.writeInt(r0)     // Catch:{ all -> 0x0049 }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x0049 }
        L_0x001f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x003a
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0049 }
            X.0QL r1 = (X.AnonymousClass0QL) r1     // Catch:{ all -> 0x0049 }
            android.net.Uri r0 = r1.A00     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0049 }
            r3.writeUTF(r0)     // Catch:{ all -> 0x0049 }
            boolean r0 = r1.A01     // Catch:{ all -> 0x0049 }
            r3.writeBoolean(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x001f
        L_0x003a:
            r0 = 0
            X.C41191vO.A00(r3, r0)     // Catch:{ all -> 0x0050 }
            X.C41191vO.A00(r4, r0)
            byte[] r0 = r4.toByteArray()
            X.C18450wi.A0B(r0)
            return r0
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.C41191vO.A00(r3, r1)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.C41191vO.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XK.A0A(java.util.Set):byte[]");
    }
}
