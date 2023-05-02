package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

/* renamed from: X.0iR  reason: invalid class name and case insensitive filesystem */
public final class C11250iR extends SecureRandomSpi {
    public static DataInputStream A00;
    public static OutputStream A01;
    public static final File A02 = new File("/dev/urandom");
    public static final Object A03 = new Object();
    public boolean seeded;

    public byte[] engineGenerateSeed(int i2) {
        byte[] bArr = new byte[i2];
        engineNextBytes(bArr);
        return bArr;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void engineNextBytes(byte[] r5) {
        /*
            r4 = this;
            boolean r0 = r4.seeded
            if (r0 != 0) goto L_0x000b
            byte[] r0 = X.AnonymousClass00G.A01()
            r4.engineSetSeed(r0)
        L_0x000b:
            java.lang.Object r3 = A03     // Catch:{ IOException -> 0x004e }
            monitor-enter(r3)     // Catch:{ IOException -> 0x004e }
            monitor-enter(r3)     // Catch:{ all -> 0x004b }
            java.io.DataInputStream r1 = A00     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x003d
            java.io.File r1 = A02     // Catch:{ IOException -> 0x0022 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0022 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0022 }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0022 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0022 }
            A00 = r1     // Catch:{ IOException -> 0x0022 }
            goto L_0x003d
        L_0x0022:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "Failed to open "
            r1.append(r0)     // Catch:{ all -> 0x0048 }
            java.io.File r0 = A02     // Catch:{ all -> 0x0048 }
            r1.append(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = " for reading"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0048 }
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x0048 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x003d:
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x004e }
            r1.readFully(r5)     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            goto L_0x004d
        L_0x0048:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
        L_0x004d:
            throw r0     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            r2 = move-exception
            java.lang.String r0 = "Failed to read from "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.io.File r0 = A02
            java.lang.String r1 = X.AnonymousClass000.A0f(r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11250iR.engineNextBytes(byte[]):void");
    }

    public void engineSetSeed(byte[] bArr) {
        OutputStream outputStream;
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            this.seeded = true;
            return;
        }
        try {
            synchronized (A03) {
                outputStream = A01;
                if (outputStream == null) {
                    outputStream = new FileOutputStream(A02);
                    A01 = outputStream;
                }
            }
            outputStream.write(bArr);
            outputStream.flush();
            this.seeded = true;
        } catch (IOException e2) {
            Log.w("unable to seed PRNG", e2);
        }
    }
}
