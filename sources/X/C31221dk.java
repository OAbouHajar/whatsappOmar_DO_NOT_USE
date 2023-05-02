package X;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1dk  reason: invalid class name and case insensitive filesystem */
public abstract class C31221dk extends C31161dc {
    public C31471eF A00;
    public String A01;
    public String[] A02;
    public final Context A03;
    public final Map A04 = new HashMap();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31221dk(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            java.lang.String r0 = r0.dataDir
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            r1 = 1
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.<init>(r2, r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.A04 = r0
            r3.A03 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31221dk.<init>(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(java.io.File r3, byte r4) {
        /*
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ SyncFailedException -> 0x0027 }
            r2.<init>(r3, r0)     // Catch:{ SyncFailedException -> 0x0027 }
            r0 = 0
            r2.seek(r0)     // Catch:{ all -> 0x0022 }
            r2.write(r4)     // Catch:{ all -> 0x0022 }
            long r0 = r2.getFilePointer()     // Catch:{ all -> 0x0022 }
            r2.setLength(r0)     // Catch:{ all -> 0x0022 }
            java.io.FileDescriptor r0 = r2.getFD()     // Catch:{ all -> 0x0022 }
            r0.sync()     // Catch:{ all -> 0x0022 }
            r2.close()     // Catch:{ SyncFailedException -> 0x0027 }
            return
        L_0x0022:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r0     // Catch:{ SyncFailedException -> 0x0027 }
        L_0x0027:
            r2 = move-exception
            java.lang.String r1 = "fb-UnpackingSoSource"
            java.lang.String r0 = "state file sync failed"
            android.util.Log.w(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31221dk.A00(java.io.File, byte):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r19v0, types: [X.1eK] */
    /* JADX WARNING: type inference failed for: r0v211, types: [X.3U6] */
    /* JADX WARNING: type inference failed for: r0v212, types: [X.3U5] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:252|253|254|255|256) */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fa, code lost:
        if ((r42 & 2) == 0) goto L_0x0505;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:221:0x04eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:255:0x05d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:263:0x05da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:271:0x05e4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d0 A[Catch:{ all -> 0x04eb, Exception -> 0x02b9, all -> 0x05cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db A[Catch:{ all -> 0x0111, all -> 0x05e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4 A[Catch:{ all -> 0x0111, all -> 0x05e7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r42) {
        /*
            r41 = this;
            r6 = r41
            java.io.File r0 = r6.A01
            r40 = r0
            boolean r0 = r40.mkdirs()
            if (r0 != 0) goto L_0x0028
            boolean r0 = r40.isDirectory()
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "cannot mkdir: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r40
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0028:
            boolean r25 = r40.canWrite()
            java.lang.String r5 = "error removing "
            java.lang.String r22 = "releasing dso store lock for "
            java.lang.String r20 = " (syncer thread started)"
            java.lang.String r21 = "not releasing dso store lock for "
            r7 = 1
            r29 = 0
            java.lang.String r4 = " write permission"
            r3 = 0
            java.lang.String r2 = "fb-UnpackingSoSource"
            if (r25 != 0) goto L_0x0061
            r0 = r40
            boolean r0 = r0.setWritable(r7)     // Catch:{ all -> 0x05e5 }
            if (r0 != 0) goto L_0x0061
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r1.<init>()     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = "error adding "
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = r40.getCanonicalPath()     // Catch:{ all -> 0x05e5 }
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            r1.append(r4)     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e5 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x05e5 }
        L_0x0061:
            java.lang.String r31 = "dso_lock"
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x05e5 }
            r1 = r40
            r0 = r31
            r8.<init>(r1, r0)     // Catch:{ all -> 0x05e5 }
            X.1eF r37 = r6.A03(r8, r7)     // Catch:{ all -> 0x05e5 }
            X.1eF r0 = r6.A00     // Catch:{ all -> 0x05e7 }
            if (r0 != 0) goto L_0x0083
            java.lang.String r8 = "dso_instance_lock"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x05e7 }
            r0 = r40
            r1.<init>(r0, r8)     // Catch:{ all -> 0x05e7 }
            X.1eF r0 = r6.A03(r1, r3)     // Catch:{ all -> 0x05e7 }
            r6.A00 = r0     // Catch:{ all -> 0x05e7 }
        L_0x0083:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e7 }
            r1.<init>()     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = "locked dso store "
            r1.append(r0)     // Catch:{ all -> 0x05e7 }
            r0 = r40
            r1.append(r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e7 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x05e7 }
            boolean r0 = r6 instanceof X.C31351e0     // Catch:{ all -> 0x05e7 }
            if (r0 == 0) goto L_0x0116
            r10 = r6
            X.1e0 r10 = (X.C31351e0) r10     // Catch:{ all -> 0x05e7 }
            java.io.File r0 = r10.A00     // Catch:{ all -> 0x05e7 }
            java.io.File r1 = r0.getCanonicalFile()     // Catch:{ all -> 0x05e7 }
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ all -> 0x05e7 }
            r9 = 2
            r8.writeByte(r9)     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x0111 }
            r8.writeString(r0)     // Catch:{ all -> 0x0111 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x0111 }
            r8.writeLong(r0)     // Catch:{ all -> 0x0111 }
            android.content.Context r10 = r10.A03     // Catch:{ all -> 0x0111 }
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ all -> 0x0111 }
            if (r1 == 0) goto L_0x00cf
            java.lang.String r0 = r10.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x00cf }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException | RuntimeException -> 0x00cf }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException | RuntimeException -> 0x00cf }
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            r8.writeInt(r0)     // Catch:{ all -> 0x0111 }
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()     // Catch:{ all -> 0x0111 }
            java.lang.String r1 = r0.nativeLibraryDir     // Catch:{ all -> 0x0111 }
            if (r1 != 0) goto L_0x00e4
            r8.writeByte(r7)     // Catch:{ all -> 0x0111 }
            byte[] r30 = r8.marshall()     // Catch:{ all -> 0x0111 }
            goto L_0x0173
        L_0x00e4:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0111 }
            r0.<init>(r1)     // Catch:{ all -> 0x0111 }
            java.io.File r1 = r0.getCanonicalFile()     // Catch:{ all -> 0x0111 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x00fb
            r8.writeByte(r7)     // Catch:{ all -> 0x0111 }
            byte[] r30 = r8.marshall()     // Catch:{ all -> 0x0111 }
            goto L_0x0173
        L_0x00fb:
            r8.writeByte(r9)     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x0111 }
            r8.writeString(r0)     // Catch:{ all -> 0x0111 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x0111 }
            r8.writeLong(r0)     // Catch:{ all -> 0x0111 }
            byte[] r30 = r8.marshall()     // Catch:{ all -> 0x0111 }
            goto L_0x0173
        L_0x0111:
            r0 = move-exception
            r8.recycle()     // Catch:{ all -> 0x05e7 }
            throw r0     // Catch:{ all -> 0x05e7 }
        L_0x0116:
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ all -> 0x05e7 }
            boolean r0 = r6 instanceof X.C31231dl     // Catch:{ all -> 0x05e7 }
            if (r0 == 0) goto L_0x0127
            r0 = r6
            X.1dl r0 = (X.C31231dl) r0     // Catch:{ all -> 0x05e7 }
            X.1eH r10 = new X.1eH     // Catch:{ all -> 0x05e7 }
            r10.<init>(r0, r0)     // Catch:{ all -> 0x05e7 }
            goto L_0x012f
        L_0x0127:
            r0 = r6
            X.1e0 r0 = (X.C31351e0) r0     // Catch:{ all -> 0x05e7 }
            X.1eN r10 = new X.1eN     // Catch:{ all -> 0x05e7 }
            r10.<init>(r0, r0)     // Catch:{ all -> 0x05e7 }
        L_0x012f:
            boolean r0 = r10 instanceof X.C31491eH     // Catch:{ all -> 0x05e0 }
            if (r0 == 0) goto L_0x0147
            r0 = r10
            X.1eH r0 = (X.C31491eH) r0     // Catch:{ all -> 0x05e0 }
            X.3U3[] r0 = r0.A00     // Catch:{ all -> 0x05e0 }
            X.1eJ r1 = new X.1eJ     // Catch:{ all -> 0x05e0 }
            r1.<init>(r0)     // Catch:{ all -> 0x05e0 }
        L_0x013d:
            X.1eL[] r9 = r1.A00     // Catch:{ all -> 0x05e0 }
            r11.writeByte(r7)     // Catch:{ all -> 0x05e0 }
            int r8 = r9.length     // Catch:{ all -> 0x05e0 }
            r11.writeInt(r8)     // Catch:{ all -> 0x05e0 }
            goto L_0x0154
        L_0x0147:
            r0 = r10
            X.1eN r0 = (X.C31551eN) r0     // Catch:{ all -> 0x05e0 }
            X.3U4[] r0 = r0.A00()     // Catch:{ all -> 0x05e0 }
            X.1eJ r1 = new X.1eJ     // Catch:{ all -> 0x05e0 }
            r1.<init>(r0)     // Catch:{ all -> 0x05e0 }
            goto L_0x013d
        L_0x0154:
            r1 = 0
        L_0x0155:
            if (r1 >= r8) goto L_0x0168
            r0 = r9[r1]     // Catch:{ all -> 0x05e0 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x05e0 }
            r11.writeString(r0)     // Catch:{ all -> 0x05e0 }
            r0 = r9[r1]     // Catch:{ all -> 0x05e0 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x05e0 }
            r11.writeString(r0)     // Catch:{ all -> 0x05e0 }
            int r1 = r1 + 1
            goto L_0x0155
        L_0x0168:
            r10.close()     // Catch:{ all -> 0x05e7 }
            byte[] r30 = r11.marshall()     // Catch:{ all -> 0x05e7 }
            r11.recycle()     // Catch:{ all -> 0x05e7 }
            goto L_0x0176
        L_0x0173:
            r8.recycle()     // Catch:{ all -> 0x05e7 }
        L_0x0176:
            java.lang.String r28 = "dso_state"
            java.io.File r27 = new java.io.File     // Catch:{ all -> 0x05e7 }
            r8 = r40
            r1 = r27
            r0 = r28
            r1.<init>(r8, r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r26 = "rw"
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ all -> 0x05e7 }
            r0 = r26
            r8.<init>(r1, r0)     // Catch:{ all -> 0x05e7 }
            byte r9 = r8.readByte()     // Catch:{ EOFException -> 0x01b5, all -> 0x01af }
            if (r9 == r7) goto L_0x01b6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x01b5, all -> 0x01af }
            r1.<init>()     // Catch:{ EOFException -> 0x01b5, all -> 0x01af }
            java.lang.String r0 = "dso store "
            r1.append(r0)     // Catch:{ EOFException -> 0x01b5, all -> 0x01af }
            r0 = r40
            r1.append(r0)     // Catch:{ EOFException -> 0x01b5, all -> 0x01af }
            java.lang.String r0 = " regeneration interrupted: wiping clean"
            r1.append(r0)     // Catch:{ EOFException -> 0x01b5, all -> 0x01af }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x01b5, all -> 0x01af }
            android.util.Log.v(r2, r0)     // Catch:{ EOFException -> 0x01b5, all -> 0x01af }
            goto L_0x01b5
        L_0x01af:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x05e4 }
            goto L_0x05e4
        L_0x01b5:
            r9 = 0
        L_0x01b6:
            r8.close()     // Catch:{ all -> 0x05e7 }
            java.lang.String r15 = "dso_deps"
            java.io.File r24 = new java.io.File     // Catch:{ all -> 0x05e7 }
            r1 = r40
            r0 = r24
            r0.<init>(r1, r15)     // Catch:{ all -> 0x05e7 }
            r8 = 0
            java.io.RandomAccessFile r23 = new java.io.RandomAccessFile     // Catch:{ all -> 0x05e7 }
            r10 = r23
            r1 = r0
            r0 = r26
            r10.<init>(r1, r0)     // Catch:{ all -> 0x05e7 }
            long r0 = r23.length()     // Catch:{ all -> 0x05db }
            int r10 = (int) r0     // Catch:{ all -> 0x05db }
            byte[] r1 = new byte[r10]     // Catch:{ all -> 0x05db }
            r0 = r23
            int r0 = r0.read(r1)     // Catch:{ all -> 0x05db }
            if (r0 == r10) goto L_0x01e5
            java.lang.String r0 = "short read of so store deps file: marking unclean"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x05db }
            r9 = 0
        L_0x01e5:
            r0 = r30
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x05db }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01f6
            java.lang.String r0 = "deps mismatch on deps store: regenerating"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x05db }
            r9 = 0
            goto L_0x01fc
        L_0x01f6:
            if (r9 == 0) goto L_0x01fc
            r0 = r42 & 2
            if (r0 == 0) goto L_0x0505
        L_0x01fc:
            java.lang.String r0 = "so store dirty: regenerating"
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x05db }
            r0 = r27
            A00(r0, r3)     // Catch:{ all -> 0x05db }
            boolean r0 = r6 instanceof X.C31231dl     // Catch:{ all -> 0x05db }
            if (r0 == 0) goto L_0x0214
            r0 = r6
            X.1dl r0 = (X.C31231dl) r0     // Catch:{ all -> 0x05db }
            X.1eH r12 = new X.1eH     // Catch:{ all -> 0x05db }
            r12.<init>(r0, r0)     // Catch:{ all -> 0x05db }
            goto L_0x021c
        L_0x0214:
            r0 = r6
            X.1e0 r0 = (X.C31351e0) r0     // Catch:{ all -> 0x05db }
            X.1eN r12 = new X.1eN     // Catch:{ all -> 0x05db }
            r12.<init>(r0, r0)     // Catch:{ all -> 0x05db }
        L_0x021c:
            boolean r1 = r12 instanceof X.C31491eH     // Catch:{ all -> 0x05d6 }
            if (r1 == 0) goto L_0x022b
            r0 = r12
            X.1eH r0 = (X.C31491eH) r0     // Catch:{ all -> 0x05d6 }
            X.3U3[] r0 = r0.A00     // Catch:{ all -> 0x05d6 }
            X.1eJ r8 = new X.1eJ     // Catch:{ all -> 0x05d6 }
            r8.<init>(r0)     // Catch:{ all -> 0x05d6 }
            goto L_0x0237
        L_0x022b:
            r0 = r12
            X.1eN r0 = (X.C31551eN) r0     // Catch:{ all -> 0x05d6 }
            X.3U4[] r0 = r0.A00()     // Catch:{ all -> 0x05d6 }
            X.1eJ r8 = new X.1eJ     // Catch:{ all -> 0x05d6 }
            r8.<init>(r0)     // Catch:{ all -> 0x05d6 }
        L_0x0237:
            if (r1 == 0) goto L_0x0244
            r1 = r12
            X.1eH r1 = (X.C31491eH) r1     // Catch:{ all -> 0x05d6 }
            X.3U5 r19 = new X.3U5     // Catch:{ all -> 0x05d6 }
            r0 = r19
            r0.<init>(r1)     // Catch:{ all -> 0x05d6 }
            goto L_0x024e
        L_0x0244:
            r1 = r12
            X.1eN r1 = (X.C31551eN) r1     // Catch:{ all -> 0x05d6 }
            X.3U6 r19 = new X.3U6     // Catch:{ all -> 0x05d6 }
            r0 = r19
            r0.<init>(r1)     // Catch:{ all -> 0x05d6 }
        L_0x024e:
            java.lang.String r0 = "regenerating DSO store "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05d4 }
            r1.<init>(r0)     // Catch:{ all -> 0x05d4 }
            java.lang.Class r0 = r6.getClass()     // Catch:{ all -> 0x05d4 }
            java.lang.String r18 = r0.getName()     // Catch:{ all -> 0x05d4 }
            r0 = r18
            r1.append(r0)     // Catch:{ all -> 0x05d4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05d4 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x05d4 }
            java.lang.String r14 = "dso_manifest"
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x05d4 }
            r0 = r40
            r10.<init>(r0, r14)     // Catch:{ all -> 0x05d4 }
            java.io.RandomAccessFile r17 = new java.io.RandomAccessFile     // Catch:{ all -> 0x05d4 }
            r1 = r17
            r0 = r26
            r1.<init>(r10, r0)     // Catch:{ all -> 0x05d4 }
            if (r9 != r7) goto L_0x02bf
            byte r0 = r17.readByte()     // Catch:{ Exception -> 0x02b9 }
            if (r0 != r7) goto L_0x02b0
            int r13 = r17.readInt()     // Catch:{ Exception -> 0x02b9 }
            if (r13 < 0) goto L_0x02a8
            X.1eL[] r11 = new X.C31531eL[r13]     // Catch:{ Exception -> 0x02b9 }
            r10 = 0
        L_0x028c:
            if (r10 >= r13) goto L_0x02a0
            java.lang.String r9 = r17.readUTF()     // Catch:{ Exception -> 0x02b9 }
            java.lang.String r1 = r17.readUTF()     // Catch:{ Exception -> 0x02b9 }
            X.1eL r0 = new X.1eL     // Catch:{ Exception -> 0x02b9 }
            r0.<init>(r9, r1)     // Catch:{ Exception -> 0x02b9 }
            r11[r10] = r0     // Catch:{ Exception -> 0x02b9 }
            int r10 = r10 + 1
            goto L_0x028c
        L_0x02a0:
            X.1eJ r16 = new X.1eJ     // Catch:{ Exception -> 0x02b9 }
            r0 = r16
            r0.<init>(r11)     // Catch:{ Exception -> 0x02b9 }
            goto L_0x02c8
        L_0x02a8:
            java.lang.String r0 = "illegal number of shared libraries"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x02b9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x02b9 }
            goto L_0x02b8
        L_0x02b0:
            java.lang.String r0 = "wrong dso manifest version"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x02b9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x02b9 }
        L_0x02b8:
            throw r1     // Catch:{ Exception -> 0x02b9 }
        L_0x02b9:
            r1 = move-exception
            java.lang.String r0 = "error reading existing DSO manifest"
            android.util.Log.i(r2, r0, r1)     // Catch:{ all -> 0x05cf }
        L_0x02bf:
            X.1eL[] r1 = new X.C31531eL[r3]     // Catch:{ all -> 0x05cf }
            X.1eJ r16 = new X.1eJ     // Catch:{ all -> 0x05cf }
            r0 = r16
            r0.<init>(r1)     // Catch:{ all -> 0x05cf }
        L_0x02c8:
            X.1eL[] r11 = r8.A00     // Catch:{ all -> 0x05cf }
            java.lang.String[] r10 = r40.list()     // Catch:{ all -> 0x05cf }
            if (r10 == 0) goto L_0x05b8
            r9 = 0
        L_0x02d1:
            int r0 = r10.length     // Catch:{ all -> 0x05cf }
            if (r9 >= r0) goto L_0x0329
            r13 = r10[r9]     // Catch:{ all -> 0x05cf }
            r0 = r28
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x05cf }
            if (r0 != 0) goto L_0x0326
            r0 = r31
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x05cf }
            if (r0 != 0) goto L_0x0326
            java.lang.String r0 = "dso_instance_lock"
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x05cf }
            if (r0 != 0) goto L_0x0326
            boolean r0 = r13.equals(r15)     // Catch:{ all -> 0x05cf }
            if (r0 != 0) goto L_0x0326
            boolean r0 = r13.equals(r14)     // Catch:{ all -> 0x05cf }
            if (r0 != 0) goto L_0x0326
            r1 = 0
        L_0x02fb:
            int r0 = r11.length     // Catch:{ all -> 0x05cf }
            if (r1 >= r0) goto L_0x030b
            r0 = r11[r1]     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x05cf }
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x05cf }
            if (r0 != 0) goto L_0x0326
            int r1 = r1 + 1
            goto L_0x02fb
        L_0x030b:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x05cf }
            r0 = r40
            r1.<init>(r0, r13)     // Catch:{ all -> 0x05cf }
            java.lang.String r13 = "deleting unaccounted-for file "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05cf }
            r0.<init>(r13)     // Catch:{ all -> 0x05cf }
            r0.append(r1)     // Catch:{ all -> 0x05cf }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05cf }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x05cf }
            X.C31331dy.A00(r1)     // Catch:{ all -> 0x05cf }
        L_0x0326:
            int r9 = r9 + 1
            goto L_0x02d1
        L_0x0329:
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x05cf }
            r31 = r0
        L_0x0330:
            boolean r0 = r19.A01()     // Catch:{ all -> 0x05cf }
            if (r0 == 0) goto L_0x04ec
            X.1eM r11 = r19.A00()     // Catch:{ all -> 0x05cf }
            r14 = 1
            r9 = 0
        L_0x033c:
            r0 = r16
            X.1eL[] r1 = r0.A00     // Catch:{ all -> 0x04e7 }
            int r0 = r1.length     // Catch:{ all -> 0x04e7 }
            if (r9 >= r0) goto L_0x0362
            X.1eL r10 = r11.A00     // Catch:{ all -> 0x04e7 }
            java.lang.String r13 = r10.A01     // Catch:{ all -> 0x04e7 }
            r0 = r1[r9]     // Catch:{ all -> 0x04e7 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x04e7 }
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x04e7 }
            if (r0 == 0) goto L_0x035e
            r0 = r1[r9]     // Catch:{ all -> 0x04e7 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x04e7 }
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x04e7 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04e7 }
            if (r0 == 0) goto L_0x035e
            goto L_0x0361
        L_0x035e:
            int r9 = r9 + 1
            goto L_0x033c
        L_0x0361:
            r14 = 0
        L_0x0362:
            X.1eL r0 = r11.A00     // Catch:{ all -> 0x04e7 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x04e7 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x04e7 }
            r0 = r40
            r9.<init>(r0, r1)     // Catch:{ all -> 0x04e7 }
            boolean r0 = r9.exists()     // Catch:{ all -> 0x04e7 }
            if (r0 == 0) goto L_0x0375
            if (r14 == 0) goto L_0x0468
        L_0x0375:
            java.lang.String r9 = "extracting DSO "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e7 }
            r0.<init>(r9)     // Catch:{ all -> 0x04e7 }
            r0.append(r1)     // Catch:{ all -> 0x04e7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04e7 }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x04e7 }
            r0 = r40
            boolean r0 = r0.setWritable(r7)     // Catch:{ all -> 0x04c4 }
            if (r0 == 0) goto L_0x04ab
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x04c4 }
            r0 = r40
            r10.<init>(r0, r1)     // Catch:{ all -> 0x04c4 }
            r9 = 0
            boolean r0 = r10.exists()     // Catch:{ IOException -> 0x0484 }
            if (r0 == 0) goto L_0x03b6
            boolean r0 = r10.setWritable(r7)     // Catch:{ IOException -> 0x0484 }
            if (r0 != 0) goto L_0x03b6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0484 }
            r1.<init>()     // Catch:{ IOException -> 0x0484 }
            java.lang.String r0 = "error adding write permission to: "
            r1.append(r0)     // Catch:{ IOException -> 0x0484 }
            r1.append(r10)     // Catch:{ IOException -> 0x0484 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0484 }
            android.util.Log.w(r2, r0)     // Catch:{ IOException -> 0x0484 }
        L_0x03b6:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x03be }
            r0 = r26
            r1.<init>(r10, r0)     // Catch:{ IOException -> 0x03be }
            goto L_0x03e2
        L_0x03be:
            r1 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0484 }
            r13.<init>()     // Catch:{ IOException -> 0x0484 }
            java.lang.String r0 = "error overwriting "
            r13.append(r0)     // Catch:{ IOException -> 0x0484 }
            r13.append(r10)     // Catch:{ IOException -> 0x0484 }
            java.lang.String r0 = " trying to delete and start over"
            r13.append(r0)     // Catch:{ IOException -> 0x0484 }
            java.lang.String r0 = r13.toString()     // Catch:{ IOException -> 0x0484 }
            android.util.Log.w(r2, r0, r1)     // Catch:{ IOException -> 0x0484 }
            X.C31331dy.A00(r10)     // Catch:{ IOException -> 0x0484 }
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0484 }
            r0 = r26
            r1.<init>(r10, r0)     // Catch:{ IOException -> 0x0484 }
        L_0x03e2:
            r9 = r1
            java.io.InputStream r0 = r11.A01     // Catch:{ IOException -> 0x0484 }
            r28 = r0
            int r0 = r28.available()     // Catch:{ IOException -> 0x0484 }
            if (r0 <= r7) goto L_0x03fb
            java.io.FileDescriptor r15 = r1.getFD()     // Catch:{ IOException -> 0x0484 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0484 }
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0484 }
            r13 = 21
            if (r14 < r13) goto L_0x03fb
            com.facebook.soloader.SysUtil$LollipopSysdeps.fallocateIfSupported(r15, r0)     // Catch:{ IOException -> 0x0484 }
        L_0x03fb:
            r14 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
        L_0x03ff:
            int r13 = r14 - r1
            r0 = 32768(0x8000, float:4.5918E-41)
            int r15 = java.lang.Math.min(r0, r13)     // Catch:{ IOException -> 0x0484 }
            r13 = r31
            r0 = r28
            int r13 = r0.read(r13, r3, r15)     // Catch:{ IOException -> 0x0484 }
            r0 = -1
            if (r13 == r0) goto L_0x041c
            r0 = r31
            r9.write(r0, r3, r13)     // Catch:{ IOException -> 0x0484 }
            int r1 = r1 + r13
            if (r1 >= r14) goto L_0x041c
            goto L_0x03ff
        L_0x041c:
            long r0 = r9.getFilePointer()     // Catch:{ IOException -> 0x0484 }
            r9.setLength(r0)     // Catch:{ IOException -> 0x0484 }
            boolean r0 = r10.setExecutable(r7, r3)     // Catch:{ IOException -> 0x0484 }
            if (r0 == 0) goto L_0x046d
            boolean r0 = r10.setWritable(r3)     // Catch:{ all -> 0x04c4 }
            if (r0 != 0) goto L_0x0444
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04c4 }
            r0.<init>()     // Catch:{ all -> 0x04c4 }
            r0.append(r5)     // Catch:{ all -> 0x04c4 }
            r0.append(r10)     // Catch:{ all -> 0x04c4 }
            r0.append(r4)     // Catch:{ all -> 0x04c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04c4 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x04c4 }
        L_0x0444:
            r9.close()     // Catch:{ all -> 0x04c4 }
            r0 = r40
            boolean r0 = r0.setWritable(r3)     // Catch:{ all -> 0x04e7 }
            if (r0 != 0) goto L_0x0468
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e7 }
            r1.<init>()     // Catch:{ all -> 0x04e7 }
            r1.append(r5)     // Catch:{ all -> 0x04e7 }
            java.lang.String r0 = r40.getCanonicalPath()     // Catch:{ all -> 0x04e7 }
            r1.append(r0)     // Catch:{ all -> 0x04e7 }
            r1.append(r4)     // Catch:{ all -> 0x04e7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04e7 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x04e7 }
        L_0x0468:
            r11.close()     // Catch:{ all -> 0x05cf }
            goto L_0x0330
        L_0x046d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0484 }
            r1.<init>()     // Catch:{ IOException -> 0x0484 }
            java.lang.String r0 = "cannot make file executable: "
            r1.append(r0)     // Catch:{ IOException -> 0x0484 }
            r1.append(r10)     // Catch:{ IOException -> 0x0484 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0484 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0484 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0484 }
            throw r0     // Catch:{ IOException -> 0x0484 }
        L_0x0484:
            r0 = move-exception
            X.C31331dy.A00(r10)     // Catch:{ all -> 0x0489 }
            throw r0     // Catch:{ all -> 0x0489 }
        L_0x0489:
            r1 = move-exception
            boolean r0 = r10.setWritable(r3)     // Catch:{ all -> 0x04c4 }
            if (r0 != 0) goto L_0x04a5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04c4 }
            r0.<init>()     // Catch:{ all -> 0x04c4 }
            r0.append(r5)     // Catch:{ all -> 0x04c4 }
            r0.append(r10)     // Catch:{ all -> 0x04c4 }
            r0.append(r4)     // Catch:{ all -> 0x04c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04c4 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x04c4 }
        L_0x04a5:
            if (r9 == 0) goto L_0x04aa
            r9.close()     // Catch:{ all -> 0x04c4 }
        L_0x04aa:
            throw r1     // Catch:{ all -> 0x04c4 }
        L_0x04ab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04c4 }
            r1.<init>()     // Catch:{ all -> 0x04c4 }
            java.lang.String r0 = "cannot make directory writable for us: "
            r1.append(r0)     // Catch:{ all -> 0x04c4 }
            r0 = r40
            r1.append(r0)     // Catch:{ all -> 0x04c4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x04c4 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x04c4 }
            r0.<init>(r1)     // Catch:{ all -> 0x04c4 }
            throw r0     // Catch:{ all -> 0x04c4 }
        L_0x04c4:
            r6 = move-exception
            r0 = r40
            boolean r0 = r0.setWritable(r3)     // Catch:{ all -> 0x04e7 }
            if (r0 != 0) goto L_0x04e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e7 }
            r1.<init>()     // Catch:{ all -> 0x04e7 }
            r1.append(r5)     // Catch:{ all -> 0x04e7 }
            java.lang.String r0 = r40.getCanonicalPath()     // Catch:{ all -> 0x04e7 }
            r1.append(r0)     // Catch:{ all -> 0x04e7 }
            r1.append(r4)     // Catch:{ all -> 0x04e7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04e7 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x04e7 }
        L_0x04e6:
            throw r6     // Catch:{ all -> 0x04e7 }
        L_0x04e7:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x04eb }
        L_0x04eb:
            throw r0     // Catch:{ all -> 0x05cf }
        L_0x04ec:
            r17.close()     // Catch:{ all -> 0x05d4 }
            java.lang.String r0 = "Finished regenerating DSO store "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05d4 }
            r1.<init>(r0)     // Catch:{ all -> 0x05d4 }
            r0 = r18
            r1.append(r0)     // Catch:{ all -> 0x05d4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05d4 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x05d4 }
            r12.close()     // Catch:{ all -> 0x05db }
        L_0x0505:
            r23.close()     // Catch:{ all -> 0x05e7 }
            if (r8 != 0) goto L_0x0521
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e7 }
            r1.<init>()     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = "dso store is up-to-date: "
            r1.append(r0)     // Catch:{ all -> 0x05e7 }
            r0 = r40
            r1.append(r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e7 }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x05e7 }
            goto L_0x055d
        L_0x0521:
            r0 = r42 & 4
            if (r0 != 0) goto L_0x055f
            java.lang.Boolean r38 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x05e7 }
            com.facebook.redex.RunnableRunnableShape0S0700000_I0 r7 = new com.facebook.redex.RunnableRunnableShape0S0700000_I0     // Catch:{ all -> 0x05e7 }
            r39 = 0
            r31 = r7
            r32 = r6
            r33 = r24
            r34 = r30
            r35 = r8
            r36 = r27
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x05e7 }
            r0 = r42 & 1
            if (r0 == 0) goto L_0x0559
            java.lang.String r0 = "SoSync:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e7 }
            r1.<init>(r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = r40.getName()     // Catch:{ all -> 0x05e7 }
            r1.append(r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05e7 }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ all -> 0x05e7 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x05e7 }
            r0.start()     // Catch:{ all -> 0x05e7 }
            goto L_0x055f
        L_0x0559:
            r7.run()     // Catch:{ all -> 0x05e7 }
            goto L_0x055f
        L_0x055d:
            r29 = r37
        L_0x055f:
            if (r25 != 0) goto L_0x0582
            r0 = r40
            boolean r0 = r0.setWritable(r3)
            if (r0 != 0) goto L_0x0582
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = r40.getCanonicalPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
        L_0x0582:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r29 == 0) goto L_0x059e
            r1.<init>()
            r0 = r22
            r1.append(r0)
            r0 = r40
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            r29.close()
            return
        L_0x059e:
            r1.<init>()
            r0 = r21
            r1.append(r0)
            r0 = r40
            r1.append(r0)
            r0 = r20
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            return
        L_0x05b8:
            java.lang.String r0 = "unable to list directory "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05cf }
            r1.<init>(r0)     // Catch:{ all -> 0x05cf }
            r0 = r40
            r1.append(r0)     // Catch:{ all -> 0x05cf }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05cf }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x05cf }
            r0.<init>(r1)     // Catch:{ all -> 0x05cf }
            throw r0     // Catch:{ all -> 0x05cf }
        L_0x05cf:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x05d3 }
        L_0x05d3:
            throw r0     // Catch:{ all -> 0x05d4 }
        L_0x05d4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x05d6 }
        L_0x05d6:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x05da }
        L_0x05da:
            throw r0     // Catch:{ all -> 0x05db }
        L_0x05db:
            r0 = move-exception
            r23.close()     // Catch:{ all -> 0x05e4 }
            goto L_0x05e4
        L_0x05e0:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x05e4 }
        L_0x05e4:
            throw r0     // Catch:{ all -> 0x05e7 }
        L_0x05e5:
            r6 = move-exception
            goto L_0x05ea
        L_0x05e7:
            r6 = move-exception
            r29 = r37
        L_0x05ea:
            if (r25 != 0) goto L_0x060d
            r0 = r40
            boolean r0 = r0.setWritable(r3)
            if (r0 != 0) goto L_0x060d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = r40.getCanonicalPath()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
        L_0x060d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r29 == 0) goto L_0x0629
            r1.<init>()
            r0 = r22
            r1.append(r0)
            r0 = r40
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            r29.close()
            throw r6
        L_0x0629:
            r1.<init>()
            r0 = r21
            r1.append(r0)
            r0 = r40
            r1.append(r0)
            r0 = r20
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r2, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31221dk.A01(int):void");
    }

    public C31471eF A03(File file, boolean z2) {
        C31471eF r2;
        File file2 = this.A01;
        if (z2) {
            try {
                return new C31471eF(file, false);
            } catch (FileNotFoundException e2) {
                if (file2.setWritable(true)) {
                    if (z2) {
                        r2 = new C31471eF(file, false);
                    } else {
                        r2 = new C31471eF(file, true);
                        if (r2.A01 == null) {
                            r2.close();
                            r2 = null;
                        }
                    }
                    if (!file2.setWritable(false)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("error removing ");
                        sb.append(file2.getCanonicalPath());
                        sb.append(" write permission");
                        Log.w("SysUtil", sb.toString());
                    }
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                th = th;
                if (!file2.setWritable(false)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("error removing ");
                    sb2.append(file2.getCanonicalPath());
                    sb2.append(" write permission");
                    Log.w("SysUtil", sb2.toString());
                    throw th;
                }
            }
        } else {
            r2 = new C31471eF(file, true);
            if (r2.A01 == null) {
                r2.close();
                return null;
            }
            return r2;
        }
        throw th;
    }
}
