package X;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;

/* renamed from: X.1QX  reason: invalid class name */
public class AnonymousClass1QX {
    public static final C43001zB A06 = new C43001zB(4, 5, false);
    public SecureRandom A00;
    public final C16300so A01;
    public final C16440t3 A02;
    public final C16820th A03;
    public final C16510tB A04;
    public final AnonymousClass1QS A05;

    public AnonymousClass1QX(C16300so r1, C16440t3 r2, C16820th r3, C16510tB r4, AnonymousClass1QS r5) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C43091zK A00(X.C43061zH r3, java.io.InputStream r4, int r5) {
        /*
            X.1zI r2 = new X.1zI     // Catch:{ IOException -> 0x001a }
            r2.<init>(r3, r4, r5)     // Catch:{ IOException -> 0x001a }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0015 }
        L_0x0009:
            int r0 = r2.read(r1)     // Catch:{ all -> 0x0015 }
            if (r0 >= 0) goto L_0x0009
            X.1zK r0 = r2.A04     // Catch:{ all -> 0x0015 }
            r2.close()     // Catch:{ IOException -> 0x001a }
            return r0
        L_0x0015:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0019 }
        L_0x0019:
            throw r0     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            r1 = move-exception
            java.lang.String r0 = "mediaupload/calculate-sidecar/ioexception"
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QX.A00(X.1zH, java.io.InputStream, int):X.1zK");
    }

    public C43131zO A01(C43121zN r4, C31771f0 r5, File file) {
        C38231qS r1 = r5.A02;
        if (!r1.A0A) {
            C43141zP r2 = new C43141zP(A05(r5, file), MessageDigest.getInstance("SHA-256"));
            return new C43131zO(r2, r2, (C43141zP) null, this);
        }
        int[] iArr = r1.A0E;
        return (iArr == null || iArr.length <= 0) ? A02(r4, r5, file) : A03(r4, file, iArr);
    }

    public final C43131zO A02(C43121zN r5, C31771f0 r6, File file) {
        C43141zP r3 = new C43141zP(A05(r6, file), MessageDigest.getInstance("SHA-256"));
        return new C43131zO(r3, new C43141zP(r5.A8O(r3), MessageDigest.getInstance("SHA-256")), (C43141zP) null, this);
    }

    public C43131zO A03(C43121zN r8, File file, int[] iArr) {
        AnonymousClass00B.A06(file);
        FileInputStream A0G = C17970vw.A0G(file);
        this.A04.A05(A0G);
        if (iArr.length == 4) {
            long j2 = (long) (iArr[0] + iArr[1] + iArr[2]);
            if (j2 != -1) {
                C43141zP r4 = new C43141zP(new BufferedInputStream(A0G), MessageDigest.getInstance("SHA-256"));
                C43141zP r3 = new C43141zP(new C38021q7(r4, j2), MessageDigest.getInstance("SHA-256"));
                return new C43131zO(r4, new C43141zP(r8.A8O(new C43191zU(r3, r4)), MessageDigest.getInstance("SHA-256")), r3, this);
            }
        }
        C43141zP r32 = new C43141zP(new BufferedInputStream(A0G), MessageDigest.getInstance("SHA-256"));
        return new C43131zO(r32, new C43141zP(r8.A8O(r32), MessageDigest.getInstance("SHA-256")), (C43141zP) null, this);
    }

    public C43161zR A04(C43101zL r6, C31771f0 r7, C43111zM r8) {
        C43141zP r1;
        C43121zN ABy = r6.ABy(r8.A00.A01);
        File file = r7.A02.A06;
        AnonymousClass00B.A06(file);
        C43131zO A012 = A01(ABy, r7, file);
        try {
            byte[] bArr = new byte[16384];
            do {
                r1 = A012.A00;
            } while (r1.read(bArr) >= 0);
            C43161zR r0 = new C43161zR(new C43151zQ(A012.A02.A00(), false), new C43151zQ(r1.A00(), false), r8);
            A012.close();
            return r0;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final InputStream A05(C31771f0 r4, File file) {
        if (r4 instanceof C43171zS) {
            File file2 = r4.A02.A06;
            AnonymousClass00B.A06(file2);
            return new C43181zT((C43171zS) r4, this, file2);
        }
        AnonymousClass00B.A06(file);
        FileInputStream A0G = C17970vw.A0G(file);
        AnonymousClass1XK r1 = r4.A02.A05;
        if (!(r1 == AnonymousClass1XK.A0S || r1 == AnonymousClass1XK.A09 || r1 == AnonymousClass1XK.A0C || r1 == AnonymousClass1XK.A0Y || r1 == AnonymousClass1XK.A0A || r1 == AnonymousClass1XK.A0H)) {
            this.A04.A05(A0G);
        }
        return new BufferedInputStream(A0G);
    }

    public String A06(AnonymousClass1XK r3, File file, boolean z2) {
        AnonymousClass00B.A0G(A07(r3, file, z2));
        if (AnonymousClass1XK.A05 == r3 || AnonymousClass1XK.A0I == r3) {
            return AnonymousClass1QS.A06(z2 ? A06 : AnonymousClass1QS.A03(file));
        } else if (!C31831f6.A03(r3)) {
            return null;
        } else {
            int i2 = AnonymousClass1QS.A04(file, false).A01;
            return i2 == 7 ? "video/quicktime" : i2 == 3 ? "video/3gpp" : "video/mp4";
        }
    }

    public boolean A07(AnonymousClass1XK r3, File file, boolean z2) {
        if (AnonymousClass1XK.A05 == r3 || AnonymousClass1XK.A0I == r3) {
            return z2 || this.A05.A0D(file);
        }
        if (C31831f6.A03(r3)) {
            return this.A05.A0E(file);
        }
        return true;
    }
}
