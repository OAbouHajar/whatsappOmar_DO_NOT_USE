package X;

import android.net.Uri;
import android.os.Build;
import android.os.ConditionVariable;
import com.facebook.redex.IDxNConsumerShape153S0100000_2_I0;
import com.facebook.redex.IDxRObservableShape442S0100000_1_I0;
import com.obwhatsapp.files.FileUtils$OsRename;
import com.whatsapp.Mp4Ops;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1co  reason: invalid class name and case insensitive filesystem */
public class C30701co extends C30711cp implements Comparable, C30731cr {
    public C38141qJ A00;
    public C31781f1 A01;
    public C76833ul A02;
    public File A03;
    public URL A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final ConditionVariable A08;
    public final AnonymousClass10M A09;
    public final C16300so A0A;
    public final C16180sb A0B;
    public final C18020w1 A0C;
    public final Mp4Ops A0D;
    public final C15900s5 A0E;
    public final C17130ua A0F;
    public final AnonymousClass1XS A0G;
    public final AnonymousClass1XS A0H;
    public final AnonymousClass1XS A0I = new AnonymousClass1XS();
    public final AnonymousClass1XS A0J = new AnonymousClass1XS();
    public final AnonymousClass1XS A0K = new AnonymousClass1XS();
    public final AnonymousClass1XS A0L = new AnonymousClass1XS();
    public final C16440t3 A0M;
    public final C16980tz A0N;
    public final C14730pf A0O;
    public final C16480t8 A0P;
    public final C14710pd A0Q;
    public final C20330zs A0R;
    public final C17680vT A0S;
    public final C18210wK A0T;
    public final C215514n A0U;
    public final C215914r A0V;
    public final C20130zY A0W;
    public final AnonymousClass1OJ A0X;
    public final C216214u A0Y;
    public final C30761cu A0Z;
    public final C38241qT A0a;
    public final AnonymousClass1QT A0b;
    public final C30741cs A0c;
    public final C17020u3 A0d;
    public final C38221qR A0e;
    public final C19040xf A0f;
    public final C16220sf A0g;
    public final C18840xL A0h;
    public final C48642Oh A0i;
    public final C18820xJ A0j;
    public final C215714p A0k;
    public final C18830xK A0l;
    public final C16320sq A0m;
    public final AnonymousClass1QZ A0n;
    public final AnonymousClass12P A0o;
    public final Object A0p;
    public final LinkedList A0q = new LinkedList();
    public final CountDownLatch A0r = new CountDownLatch(1);
    public final AtomicBoolean A0s = new AtomicBoolean();
    public final boolean A0t;
    public volatile int A0u;
    public volatile boolean A0v;
    public volatile boolean A0w;

    public C30701co(ConditionVariable conditionVariable, AnonymousClass10M r13, C16300so r14, C16180sb r15, C14870pt r16, C18020w1 r17, Mp4Ops mp4Ops, C15900s5 r19, C17130ua r20, C16440t3 r21, C16980tz r22, C14730pf r23, C16480t8 r24, C14710pd r25, C20330zs r26, C17680vT r27, C18210wK r28, C215514n r29, C215914r r30, C20130zY r31, AnonymousClass1OJ r32, C216214u r33, C38241qT r34, AnonymousClass1QT r35, C17020u3 r36, C19040xf r37, C16220sf r38, C18840xL r39, C18820xJ r40, C215714p r41, C18830xK r42, C16320sq r43, AnonymousClass1QZ r44, AnonymousClass12P r45, int i2, int i3, long j2, boolean z2) {
        boolean z3 = true;
        AnonymousClass1XS r4 = new AnonymousClass1XS();
        this.A0H = r4;
        this.A0G = new AnonymousClass1XS();
        boolean z4 = false;
        this.A0e = new IDxRObservableShape442S0100000_1_I0(this, 0);
        this.A0p = new Object();
        this.A0M = r21;
        this.A0D = mp4Ops;
        this.A0Q = r25;
        this.A0N = r22;
        this.A0A = r14;
        this.A0m = r43;
        this.A0B = r15;
        this.A0F = r20;
        this.A09 = r13;
        this.A0E = r19;
        this.A0n = r44;
        this.A0T = r28;
        this.A0O = r23;
        this.A0f = r37;
        this.A0j = r40;
        this.A0C = r17;
        this.A0b = r35;
        this.A0l = r42;
        this.A0h = r39;
        this.A0o = r45;
        this.A0U = r29;
        this.A0g = r38;
        this.A0P = r24;
        this.A0X = r32;
        this.A0Y = r33;
        this.A0k = r41;
        this.A0S = r27;
        C20330zs r1 = r26;
        this.A0R = r1;
        this.A0d = r36;
        this.A08 = conditionVariable;
        this.A0W = r31;
        C38241qT r7 = r34;
        this.A0a = r7;
        this.A0u = i2;
        this.A0V = r30;
        int i4 = r7.A03;
        boolean z5 = i4 == 3;
        this.A0t = z5;
        AnonymousClass1XK r8 = r7.A09;
        int i5 = this.A0u;
        int i6 = r1.A01.A01() ? 4 : 0;
        C30741cs r12 = z5 ? new C30751ct(r8, i5, i6) : new C30741cs(r8, i5, i6);
        this.A0c = r12;
        r12.A0W = i4 == 0;
        this.A0v = false;
        this.A07 = j2;
        this.A06 = i3;
        this.A0Z = new C30761cu();
        StringBuilder sb = new StringBuilder("MediaDownload/initialized;mediaHash=");
        sb.append(r7.A0F);
        sb.append(" autoDownload=");
        sb.append(this.A0u);
        sb.append(" streamable=");
        int i7 = r7.A02;
        z4 = (i7 == 3 || i7 == 2) ? true : z4;
        sb.append(z4);
        Log.i(sb.toString());
        IDxNConsumerShape153S0100000_2_I0 iDxNConsumerShape153S0100000_2_I0 = new IDxNConsumerShape153S0100000_2_I0(this, 11);
        Executor executor = r16.A06;
        A01(iDxNConsumerShape153S0100000_2_I0, executor);
        this.A00.A03(new IDxNConsumerShape153S0100000_2_I0(this, 12), executor);
        this.A00.A03(new IDxNConsumerShape153S0100000_2_I0(this, 13), executor);
        if (z4) {
            C48642Oh r2 = new C48642Oh();
            this.A0i = r2;
            long j3 = r7.A07;
            synchronized (r2) {
                r2.A04 = j3;
            }
        } else {
            this.A0i = null;
        }
        if (!(2 == this.A0u || 3 == this.A0u)) {
            z3 = false;
        }
        r4.A04(new AnonymousClass4I7(z3, z4));
        this.A05 = z2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16730tY A00(X.C16480t8 r14, X.C38241qT r15, X.C16220sf r16) {
        /*
            java.util.concurrent.Callable r0 = r15.A0L     // Catch:{ Exception -> 0x000b }
            java.lang.Object r1 = r0.call()     // Catch:{ Exception -> 0x000b }
            X.1y3 r1 = (X.C42581y3) r1     // Catch:{ Exception -> 0x000b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0013
        L_0x000b:
            java.lang.String r0 = "failed to get streaming sidecar"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0010:
            r1 = -1
            goto L_0x002f
        L_0x0013:
            X.1XK r0 = r15.A09
            boolean r0 = X.C31831f6.A02(r0)
            if (r0 == 0) goto L_0x0010
            int[] r2 = r1.A01
            if (r2 == 0) goto L_0x0010
            int r1 = r2.length
            r0 = 4
            if (r1 != r0) goto L_0x0010
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1 + r0
            r0 = 2
            r0 = r2[r0]
            int r1 = r1 + r0
            long r1 = (long) r1
        L_0x002f:
            java.lang.String r0 = "mediadownload/findexistingfile"
            X.1Zf r3 = new X.1Zf
            r3.<init>((java.lang.String) r0)
            java.lang.String r5 = r15.A0F
            X.AnonymousClass00B.A06(r5)
            X.1XK r0 = r15.A09
            byte r0 = r0.A00
            r13 = 0
            java.util.Collection r0 = r14.A0E(r5, r0)
            r3.A01()
            r0.size()
            java.util.Iterator r12 = r0.iterator()
        L_0x004e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0142
            java.lang.Object r3 = r12.next()
            X.0tY r3 = (X.C16730tY) r3
            r0 = r16
            int r4 = X.AnonymousClass1A9.A0O(r3, r0)
            int r0 = r15.A01
            if (r4 != r0) goto L_0x004e
            X.0ta r0 = r3.A02
            X.AnonymousClass00B.A06(r0)
            java.io.File r7 = r0.A0F
            X.AnonymousClass00B.A06(r7)
            java.lang.String r11 = r15.A0K
            java.lang.String r6 = "MediaDownload/call/could not get hash for existing file; file="
            if (r11 == 0) goto L_0x00fe
            r8 = -1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00fe
            java.lang.String r10 = "SHA-256"
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r10)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            r0.<init>(r7)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            r4.<init>(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            X.1q7 r0 = new X.1q7     // Catch:{ all -> 0x00f9 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x00f9 }
            X.1zP r8 = new X.1zP     // Catch:{ all -> 0x00f9 }
            r8.<init>(r0, r9)     // Catch:{ all -> 0x00f9 }
            X.1zU r9 = new X.1zU     // Catch:{ all -> 0x00f4 }
            r9.<init>(r8, r4)     // Catch:{ all -> 0x00f4 }
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r10)     // Catch:{ all -> 0x00ef }
            X.C37981q3.A02(r9, r0)     // Catch:{ all -> 0x00ef }
            byte[] r10 = r0.digest()     // Catch:{ all -> 0x00ef }
            r0 = 2
            java.lang.String r10 = android.util.Base64.encodeToString(r10, r0)     // Catch:{ all -> 0x00ef }
            boolean r0 = r10.equals(r5)     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = r8.A00()     // Catch:{ all -> 0x00ef }
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x00e5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r3.<init>()     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = "MediaDownload/call/file exists for hash, but existing file hash ("
            r3.append(r0)     // Catch:{ all -> 0x00ef }
            r3.append(r10)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = ") does not match to stored value ("
            r3.append(r0)     // Catch:{ all -> 0x00ef }
            r3.append(r5)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = "), probably the file has been replaced"
            r3.append(r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00ef }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ef }
            r9.close()     // Catch:{ all -> 0x00f4 }
            r8.close()     // Catch:{ all -> 0x00f9 }
            r4.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            goto L_0x004e
        L_0x00e5:
            r9.close()     // Catch:{ all -> 0x00f4 }
            r8.close()     // Catch:{ all -> 0x00f9 }
            r4.close()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            goto L_0x0140
        L_0x00ef:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            throw r0     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
        L_0x00fe:
            java.lang.String r4 = X.C37981q3.A00(r7)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            boolean r0 = r4.equals(r5)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            if (r0 != 0) goto L_0x0141
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            r3.<init>()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            java.lang.String r0 = "MediaDownload/call/file exists for hash, but existing file hash ("
            r3.append(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            r3.append(r4)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            java.lang.String r0 = ") does not match to stored value ("
            r3.append(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            r3.append(r5)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            java.lang.String r0 = "), probably the file has been replaced"
            r3.append(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x012b }
            goto L_0x004e
        L_0x012b:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r3)
            goto L_0x004e
        L_0x0140:
            return r3
        L_0x0141:
            return r3
        L_0x0142:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30701co.A00(X.0t8, X.1qT, X.0sf):X.0tY");
    }

    public static void A01(C16180sb r4, C14710pd r5, C30701co r6, C30761cu r7, C38241qT r8, AnonymousClass1QT r9, File file) {
        boolean z2;
        String str;
        AnonymousClass1XK r3 = r8.A09;
        if (!C221516v.A01(r3) || !"application/pdf".equals(r8.A0H)) {
            if (C31831f6.A04(r3) || r3 == AnonymousClass1XK.A05 || r3 == AnonymousClass1XK.A0I) {
                z2 = r9.A09(r3, file);
            } else if (r3 == AnonymousClass1XK.A0S) {
                if (WebpUtils.verifyWebpFileIntegrity(file.getAbsolutePath()) == null) {
                    str = "MediaDownload/suspicious sticker found, file deleted";
                    Log.w(str);
                    r7.A09(1);
                    A02(r4, file);
                    return;
                }
                return;
            } else if (C221516v.A01(r3) && AnonymousClass1A9.A0T(r8.A0H)) {
                z2 = r5.A0E(C16620tM.A02, 2425);
            } else {
                return;
            }
            if (z2) {
                try {
                    Mp4Ops.A03(file, false);
                } catch (AnonymousClass20O e2) {
                    if (!r6.A02.isCancelled() && e2.errorCode < 300) {
                        str = "MediaDownload/suspicious video/audio found, file deleted";
                    }
                }
            }
        } else {
            C41931wt r0 = new C41931wt(file);
            try {
                r0.A04();
                boolean z3 = r0.A03;
                int i2 = 0;
                if (z3) {
                    i2 = 3;
                }
                r7.A09(i2);
            } catch (C41951wv e3) {
                r7.A09(3);
                Log.e("MediaDownload/Failed to parse document", e3);
            } catch (IOException e4) {
                Log.e("MediaDownload/Failed to parse document", e4);
            }
        }
    }

    public static boolean A02(C16180sb r2, File file) {
        File A0G2 = r2.A0G(file);
        if (A0G2.exists() && !A0G2.delete()) {
            StringBuilder sb = new StringBuilder("MediaDownload/MMS failed to delete stream check success file ");
            sb.append(A0G2);
            Log.w(sb.toString());
        }
        return file.delete();
    }

    public static boolean A03(File file, File file2) {
        boolean z2;
        String str;
        if (Build.VERSION.SDK_INT < 21) {
            z2 = file.renameTo(file2);
            if (!z2) {
                str = "media-file-utils/download file rename failed";
            }
            return z2;
        }
        z2 = true;
        if (FileUtils$OsRename.attempt(file, file2) > 0) {
            if (FileUtils$OsRename.attempt(file, file2) > 0) {
                Log.i("media-file-utils/Second try rename failed");
                return false;
            }
            str = "media-file-utils/Second try rename succeeded";
        }
        return z2;
        Log.i(str);
        return z2;
    }

    public void A04() {
        super.A04();
        this.A0J.A01();
        this.A0I.A01();
        this.A0K.A01();
        this.A0H.A01();
        this.A0G.A01();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x05ed  */
    /* JADX WARNING: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0169  */
    public /* bridge */ /* synthetic */ java.lang.Object A05() {
        /*
            r33 = this;
            r0 = r33
            boolean r1 = r0.A0t
            r19 = r1
            X.1qT r1 = r0.A0a
            if (r19 == 0) goto L_0x0023
            java.lang.String r14 = r1.A0J
            r3 = 1
            r12 = 0
            r2 = 0
            if (r14 != 0) goto L_0x001c
            java.lang.String r0 = "MediaDownload/call/expressPathDownload download url is null"
        L_0x0013:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1et r4 = new X.1et
            r4.<init>(r3, r2, r12)
        L_0x001b:
            return r4
        L_0x001c:
            java.lang.String r4 = r1.A0E
            if (r4 != 0) goto L_0x048b
            java.lang.String r0 = "MediaDownload/call/expressPathDownload enc hash is null"
            goto L_0x0013
        L_0x0023:
            java.lang.String r14 = r1.A0F
            r18 = 0
            r11 = 0
            r5 = 1
            if (r14 != 0) goto L_0x0039
            java.lang.String r2 = "MediaDownload/call/media hash is null"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0030:
            X.1et r4 = new X.1et
            r2 = r18
            r4.<init>(r5, r2, r11)
            goto L_0x051a
        L_0x0039:
            java.io.File r2 = r1.A0A
            X.AnonymousClass00B.A06(r2)
            r0.A03 = r2
            X.1cs r8 = r0.A0c
            X.14n r2 = r0.A0U
            r32 = r2
            java.lang.Float r2 = r2.A01(r5)
            r8.A0B = r2
            int r3 = r1.A02
            r2 = 3
            if (r3 == r2) goto L_0x0056
            r2 = 2
            r17 = 0
            if (r3 != r2) goto L_0x0083
        L_0x0056:
            r17 = 1
            X.2Oh r3 = r0.A0i
            java.io.File r2 = r0.A03
            r3.A07(r2)
            r3.A05(r5)
            java.io.File r2 = r0.A03
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x00cc
            java.io.File r2 = r0.A03
            boolean r2 = r2.createNewFile()
            if (r2 != 0) goto L_0x0083
            java.lang.String r3 = "MediaDownload/create unable to create decryption file; mediaHash="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0083:
            int r2 = r0.A0u
            if (r2 == 0) goto L_0x00d5
            android.os.ConditionVariable r3 = r0.A08
            if (r3 == 0) goto L_0x0092
            boolean r2 = r0.A0v
            if (r2 != 0) goto L_0x0092
            r3.block()
        L_0x0092:
            r0.A06()
            X.0pf r2 = r0.A0O
            long r6 = r2.A01()
            long r12 = r2.A03()
            long r4 = r1.A07
            r9 = 32000000(0x1e84800, double:1.58101007E-316)
            X.0pd r15 = r0.A0Q
            r3 = 1291(0x50b, float:1.809E-42)
            X.0tM r2 = X.C16620tM.A02
            int r2 = r15.A03(r2, r3)
            long r2 = (long) r2
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r15
            long r9 = java.lang.Math.max(r9, r2)
            boolean r2 = r1.A0V
            if (r2 != 0) goto L_0x00d5
            long r9 = r9 + r4
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d5
            java.lang.String r2 = "MediaDownload/call/nospace total: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r12)
            goto L_0x04fb
        L_0x00cc:
            java.lang.System.currentTimeMillis()
            java.io.File r2 = r0.A03
            r2.lastModified()
            goto L_0x0083
        L_0x00d5:
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.A0H = r2
            r8.A02 = r11
            X.0wK r6 = r0.A0T
            java.lang.String r5 = r1.A0G
            int r2 = r0.A0u
            r7 = 0
            if (r2 != 0) goto L_0x00eb
            r7 = 1
        L_0x00eb:
            boolean r4 = r1.A0V
            if (r5 == 0) goto L_0x0111
            X.1OJ r3 = r6.A0J
            r2 = 1
            if (r4 == 0) goto L_0x00f5
            r2 = 3
        L_0x00f5:
            X.1f1 r3 = r3.A02(r5, r2)
            if (r3 == 0) goto L_0x0111
            if (r7 == 0) goto L_0x0103
            int r2 = r3.A03
            int r2 = r2 + 1
            r3.A03 = r2
        L_0x0103:
            r0.A01 = r3
            java.lang.String r3 = r3.A0D
            boolean r2 = r3.equals(r5)
            if (r2 != 0) goto L_0x012e
            X.1cu r2 = r0.A0Z
            monitor-enter(r2)
            goto L_0x011c
        L_0x0111:
            X.1OJ r3 = r6.A0J
            r2 = 1
            if (r4 == 0) goto L_0x0117
            r2 = 3
        L_0x0117:
            X.1f1 r3 = r3.A01(r5, r2)
            goto L_0x0103
        L_0x011c:
            r2.A0F = r3     // Catch:{ all -> 0x0532 }
            monitor-exit(r2)
            X.1f1 r2 = r0.A01
            java.lang.String r3 = r2.A0D
            X.1XS r2 = r0.A0L
            r2.A04(r3)
            X.1f1 r2 = r0.A01
            int r2 = r2.A02
            r8.A03 = r2
        L_0x012e:
            X.0t3 r2 = r0.A0M
            r31 = r2
            long r4 = android.os.SystemClock.elapsedRealtime()
            X.0xf r9 = r0.A0f
            r9.A08()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.A0O = r2
            r0.A06()
            X.0u3 r2 = r0.A0d
            X.0sb r13 = r0.A0B
            X.C17970vw.A0L(r13, r2)
            X.0so r7 = r0.A0A     // Catch:{ Exception -> 0x020d }
            X.0t8 r3 = r0.A0P     // Catch:{ Exception -> 0x020d }
            X.0sf r2 = r0.A0g     // Catch:{ Exception -> 0x020d }
            X.0tY r2 = A00(r3, r1, r2)     // Catch:{ Exception -> 0x020d }
            X.AnonymousClass00B.A06(r2)     // Catch:{ Exception -> 0x020d }
            X.0ta r4 = r2.A02     // Catch:{ Exception -> 0x020d }
            X.AnonymousClass00B.A06(r4)     // Catch:{ Exception -> 0x020d }
            java.io.File r3 = r4.A0F     // Catch:{ Exception -> 0x020d }
            X.AnonymousClass00B.A06(r3)     // Catch:{ Exception -> 0x020d }
            if (r3 == 0) goto L_0x0212
            java.lang.String r2 = "MediaDownload/call/file exists for hash; mediaHash="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            r5.append(r14)
            java.lang.String r2 = " directoryType="
            r5.append(r2)
            int r2 = r1.A01
            r5.append(r2)
            java.lang.String r2 = " file="
            r5.append(r2)
            java.lang.String r2 = r3.getAbsolutePath()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0pd r5 = r0.A0Q
            X.1QT r2 = r0.A0b
            X.1cu r6 = r0.A0Z
            r12 = r13
            r13 = r5
            r14 = r0
            r15 = r6
            r16 = r1
            r17 = r2
            r18 = r3
            A01(r12, r13, r14, r15, r16, r17, r18)
            X.2Oh r2 = r0.A0i
            if (r2 == 0) goto L_0x01bc
            java.io.File r5 = r0.A07()
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x01bc
            boolean r2 = r5.delete()
            if (r2 != 0) goto L_0x01bc
            java.lang.String r2 = "MediaDownload/call/unable to delete chunk store file on file hash match"
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x01bc:
            X.1XK r8 = r1.A09
            boolean r5 = r1.A0U
            boolean r2 = X.C221516v.A01(r8)
            if (r2 != 0) goto L_0x01d2
            X.1XK r2 = X.AnonymousClass1XK.A0S
            if (r8 == r2) goto L_0x01d2
            boolean r2 = X.C31831f6.A02(r8)
            if (r2 == 0) goto L_0x01f8
            if (r5 == 0) goto L_0x01f8
        L_0x01d2:
            X.0xJ r5 = r0.A0j
            X.0xK r4 = r0.A0l
            X.0xL r2 = r0.A0h
            r12 = r7
            r13 = r6
            r14 = r1
            r15 = r2
            r16 = r5
            r17 = r4
            X.C61973Bd.A03(r12, r13, r14, r15, r16, r17, r18)
            r0.A08()
        L_0x01e6:
            r0.A0F(r3)
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.String r2 = X.AnonymousClass1XI.A08(r2)
            X.1et r4 = new X.1et
            r4.<init>(r3, r2, r11, r11)
            goto L_0x051a
        L_0x01f8:
            int r2 = r4.A02
            monitor-enter(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0535 }
            r6.A09 = r2     // Catch:{ all -> 0x0535 }
            monitor-exit(r6)
            int r2 = r4.A03
            monitor-enter(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0535 }
            r6.A0A = r2     // Catch:{ all -> 0x0535 }
            monitor-exit(r6)
            goto L_0x01e6
        L_0x020d:
            java.lang.String r2 = "MediaDownload/call/unable to find existing file."
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0212:
            java.io.File r2 = r0.A03
            long r2 = r2.length()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.A0G = r2
            java.io.File r10 = r1.A0B
            java.lang.String r2 = r1.A0E
            if (r10 == 0) goto L_0x02db
            long r15 = r10.length()
            r4 = 0
            int r3 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x02db
            if (r2 == 0) goto L_0x02db
            X.0pd r5 = r0.A0Q
            X.0tM r4 = X.C16620tM.A01
            r3 = 1539(0x603, float:2.157E-42)
            boolean r3 = r5.A0E(r4, r3)
            if (r3 == 0) goto L_0x02db
            X.0zY r5 = r0.A0W
            monitor-enter(r5)
            X.0tc r3 = r5.A01     // Catch:{ IllegalArgumentException -> 0x02c1 }
            X.0tf r4 = r3.get()     // Catch:{ IllegalArgumentException -> 0x02c1 }
            X.0tg r12 = r4.A02     // Catch:{ all -> 0x02bc }
            java.lang.String r7 = "SELECT + enc_file_hash, ep_saved_time_ms, ep_saved_bytes, last_update_time FROM express_path_download_data WHERE enc_file_hash=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x02bc }
            r3[r11] = r2     // Catch:{ all -> 0x02bc }
            android.database.Cursor r3 = r12.A08(r7, r3)     // Catch:{ all -> 0x02bc }
            boolean r7 = r3.moveToLast()     // Catch:{ all -> 0x02b5 }
            if (r7 == 0) goto L_0x02ae
            java.lang.String r7 = "ep_saved_time_ms"
            int r15 = r3.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x02b5 }
            java.lang.String r7 = "ep_saved_bytes"
            int r12 = r3.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x02b5 }
            java.lang.String r7 = "last_update_time"
            int r7 = r3.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x02b5 }
            long r22 = r3.getLong(r15)     // Catch:{ all -> 0x02b5 }
            long r24 = r3.getLong(r12)     // Catch:{ all -> 0x02b5 }
            long r26 = r3.getLong(r7)     // Catch:{ all -> 0x02b5 }
            X.4Rb r7 = new X.4Rb     // Catch:{ all -> 0x02b5 }
            r20 = r7
            r21 = r2
            r20.<init>(r21, r22, r24, r26)     // Catch:{ all -> 0x02b5 }
            r3.close()     // Catch:{ all -> 0x02bc }
            r4.close()     // Catch:{ IllegalArgumentException -> 0x02c1 }
            monitor-exit(r5)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = r3.booleanValue()
            r8.A0V = r3
            long r3 = r7.A02
            r8.A06 = r3
            long r3 = r7.A01
            r8.A05 = r3
            boolean r3 = r5.A00(r2)
            if (r3 != 0) goto L_0x02db
            java.lang.String r4 = "MediaDownload/download failed to delete EP gain metric in DB with encHash: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r3)
            goto L_0x02db
        L_0x02ae:
            r3.close()     // Catch:{ all -> 0x02bc }
            r4.close()     // Catch:{ IllegalArgumentException -> 0x02c1 }
            goto L_0x02da
        L_0x02b5:
            r7 = move-exception
            if (r3 == 0) goto L_0x02bb
            r3.close()     // Catch:{ all -> 0x02bb }
        L_0x02bb:
            throw r7     // Catch:{ all -> 0x02bc }
        L_0x02bc:
            r3 = move-exception
            r4.close()     // Catch:{ all -> 0x02c0 }
        L_0x02c0:
            throw r3     // Catch:{ IllegalArgumentException -> 0x02c1 }
        L_0x02c1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0538 }
            r4.<init>()     // Catch:{ all -> 0x0538 }
            java.lang.String r3 = "ExpressPathDownloadDataStore/get/"
            r4.append(r3)     // Catch:{ all -> 0x0538 }
            r4.append(r2)     // Catch:{ all -> 0x0538 }
            java.lang.String r3 = "/at-least-one-column-not-found"
            r4.append(r3)     // Catch:{ all -> 0x0538 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0538 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0538 }
        L_0x02da:
            monitor-exit(r5)
        L_0x02db:
            r0.A06()
            if (r2 == 0) goto L_0x02e7
            byte[] r3 = r1.A0Y
            if (r3 != 0) goto L_0x02e7
            r5 = 5
            goto L_0x0030
        L_0x02e7:
            java.lang.Boolean r3 = r6.A04()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0375
            if (r17 != 0) goto L_0x0375
            int r4 = r0.A0u
            r3 = 1
            if (r4 == r3) goto L_0x02fc
            int r3 = r0.A0u
            if (r3 != 0) goto L_0x0375
        L_0x02fc:
            java.lang.String r3 = "MediaDownload/download media using native API's"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.10M r4 = r0.A09
            X.1eo r3 = new X.1eo
            r3.<init>(r4, r0)
            X.1XK r4 = r1.A09
            int r29 = X.C31841f7.A00(r4)
            int r4 = r0.A0u
            r30 = 0
            if (r4 == 0) goto L_0x0316
            r30 = 1
        L_0x0316:
            X.AnonymousClass00B.A06(r10)
            r4 = 2
            byte[] r27 = android.util.Base64.decode(r2, r4)
            byte[] r28 = android.util.Base64.decode(r14, r4)
            X.1qE r4 = r9.A07()
            r2 = r31
            java.lang.String r24 = X.AnonymousClass2NK.A00(r2, r4)
            X.AnonymousClass00B.A06(r24)
            java.lang.String r25 = r1.toString()
            java.lang.String r21 = r10.getPath()
            java.io.File r2 = r0.A03
            java.lang.String r22 = r2.getPath()
            java.lang.String r5 = r1.A0D
            byte[] r4 = r1.A0Y
            X.AnonymousClass00B.A06(r4)
            X.4SG r2 = new X.4SG
            r23 = r5
            r26 = r4
            r20 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.obwhatsapp.wamsys.IDxARunnableShape10S0300000_2_I0 r4 = new com.obwhatsapp.wamsys.IDxARunnableShape10S0300000_2_I0
            r4.<init>(r2, r3, r3, r11)
            r3.A00 = r4
            java.lang.Object r4 = X.C31591ei.A00(r4)
            X.1et r4 = (X.C31701et) r4
            if (r4 != 0) goto L_0x0367
            r3 = 17
            X.1et r4 = new X.1et
            r2 = r18
            r4.<init>(r3, r2, r11)
        L_0x0367:
            r31.A00()
            if (r4 != 0) goto L_0x0410
            java.lang.String r2 = "MediaDownload/call/didn't get a selected route"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            r2 = 11
            goto L_0x0513
        L_0x0375:
            int r3 = r1.A03
            r6 = 2
            if (r3 != r6) goto L_0x03c0
            java.lang.String r3 = r1.A0J
            if (r3 != 0) goto L_0x0382
            r2 = 8
            goto L_0x0513
        L_0x0382:
            X.0pd r6 = r0.A0Q
            X.1qG r5 = new X.1qG
            r5.<init>(r6, r3)
            android.net.Uri r4 = android.net.Uri.parse(r3)
            java.lang.String r3 = "category"
            java.lang.String r4 = r4.getQueryParameter(r3)
            java.lang.String r3 = "PSA"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x03ba
            r4 = 2037(0x7f5, float:2.854E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r3 = r6.A0E(r3, r4)
            if (r3 == 0) goto L_0x03ba
            X.1XK r3 = r1.A09
            java.lang.String r3 = r3.A02
            r24 = 1
            r25 = 1
            r20 = r9
            r21 = r3
            r22 = r2
            r23 = r18
            X.1qJ r2 = r20.A05(r21, r22, r23, r24, r25)
            goto L_0x03e3
        L_0x03ba:
            r2 = 1
            X.1qJ r2 = r9.A04(r5, r2)
            goto L_0x03e3
        L_0x03c0:
            X.1XK r3 = r1.A09
            java.lang.String r5 = r3.A02
            java.lang.String r4 = r1.A0D
            int r3 = r0.A0u
            if (r3 == 0) goto L_0x03cb
            r6 = 1
        L_0x03cb:
            r3 = 1
            X.AnonymousClass00B.A0G(r3)
            if (r5 != 0) goto L_0x03d3
            java.lang.String r5 = "image"
        L_0x03d3:
            r25 = 0
            r20 = r9
            r21 = r5
            r22 = r2
            r23 = r4
            r24 = r6
            X.1qJ r2 = r20.A05(r21, r22, r23, r24, r25)
        L_0x03e3:
            r0.A00 = r2
            boolean r2 = r1.A0M
            if (r2 == 0) goto L_0x03f1
            r2 = 1
            r0.A0w = r2
            X.1qR r2 = r0.A0e
            r9.A02(r2)
        L_0x03f1:
            X.1qJ r4 = r0.A00
            r3 = 1
            com.facebook.redex.IDxRConsumerShape110S0200000_1_I0 r2 = new com.facebook.redex.IDxRConsumerShape110S0200000_1_I0
            r2.<init>(r0, r3, r10)
            java.lang.Object r4 = r4.A00(r2)
            X.1et r4 = (X.C31701et) r4
            X.1qJ r2 = r0.A00
            java.util.concurrent.atomic.AtomicInteger r2 = r2.A01
            int r2 = r2.get()
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.A0N = r2
            goto L_0x0367
        L_0x0410:
            int r3 = r4.A01
            r2 = 0
            if (r3 != 0) goto L_0x0416
            r2 = 1
        L_0x0416:
            r3 = 13
            if (r2 == 0) goto L_0x047a
            X.1XK r2 = r8.A0Y
            long r22 = r8.A02()
            long r24 = r8.A01()
            r21 = 1
            r19 = r32
            r20 = r2
            r19.A02(r20, r21, r22, r24)
            r31.A00()
            X.0pd r6 = r0.A0Q
            X.0so r9 = r0.A0A
            X.1QT r5 = r0.A0b
            X.1cu r8 = r0.A0Z
            java.io.File r2 = r0.A03
            r19 = r13
            r20 = r6
            r21 = r0
            r22 = r8
            r23 = r1
            r24 = r5
            r25 = r2
            A01(r19, r20, r21, r22, r23, r24, r25)
            r31.A00()
            java.util.concurrent.FutureTask r2 = r0.A02
            boolean r2 = r2.isCancelled()
            if (r2 != 0) goto L_0x0482
            X.0xJ r7 = r0.A0j
            X.0xK r6 = r0.A0l
            X.0xL r5 = r0.A0h
            java.io.File r2 = r0.A03
            r19 = r9
            r20 = r8
            r21 = r1
            r22 = r5
            r23 = r7
            r24 = r6
            r25 = r2
            X.C61973Bd.A03(r19, r20, r21, r22, r23, r24, r25)
            r31.A00()
            java.io.File r2 = r0.A03
            r0.A0F(r2)
            r31.A00()
        L_0x047a:
            java.util.concurrent.FutureTask r2 = r0.A02
            boolean r2 = r2.isCancelled()
            if (r2 == 0) goto L_0x051a
        L_0x0482:
            X.1et r4 = new X.1et
            r2 = r18
            r4.<init>(r3, r2, r11)
            goto L_0x051a
        L_0x048b:
            java.io.File r2 = r1.A0B
            r25 = r2
            X.AnonymousClass00B.A06(r25)
            boolean r2 = r25.exists()
            if (r2 != 0) goto L_0x04af
            boolean r2 = r25.createNewFile()
            if (r2 != 0) goto L_0x04af
            java.lang.String r3 = "MediaDownload/create unable to create encrypted file; mediaEncHash="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x04af:
            android.os.ConditionVariable r3 = r0.A08
            if (r3 == 0) goto L_0x04ba
            boolean r2 = r0.A0v
            if (r2 != 0) goto L_0x04ba
            r3.block()
        L_0x04ba:
            r0.A06()
            X.0pf r15 = r0.A0O
            long r6 = r15.A01()
            long r10 = r15.A03()
            long r4 = r1.A07
            r16 = 16
            long r2 = r4 % r16
            long r8 = r4 - r2
            long r8 = r8 + r16
            r2 = 10
            long r8 = r8 + r2
            long r4 = r4 + r8
            r8 = 32000000(0x1e84800, double:1.58101007E-316)
            X.0pd r13 = r0.A0Q
            r3 = 1291(0x50b, float:1.809E-42)
            X.0tM r2 = X.C16620tM.A02
            int r2 = r13.A03(r2, r3)
            long r2 = (long) r2
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r16
            long r8 = java.lang.Math.max(r8, r2)
            long r8 = r8 + r4
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0601
            java.lang.String r2 = "MediaDownload/call/nospace total: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r10)
        L_0x04fb:
            java.lang.String r2 = " free: "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = " need: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r2 = 4
        L_0x0513:
            X.1et r4 = new X.1et
            r4.<init>(r2)
            if (r19 != 0) goto L_0x001b
        L_0x051a:
            X.0t3 r2 = r0.A0M
            r24 = r2
            r24.A00()
            int r2 = r4.A01
            if (r2 != 0) goto L_0x05ed
            r0.A0C(r4)
            X.1cu r12 = r0.A0Z
            java.io.File r2 = r0.A03
            long r2 = r2.length()
            monitor-enter(r12)
            goto L_0x053b
        L_0x0532:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0535:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0538:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x053b:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x05ea }
            r12.A0E = r2     // Catch:{ all -> 0x05ea }
            monitor-exit(r12)
            X.2Oh r11 = r0.A0i
            if (r11 == 0) goto L_0x054a
            r2 = 2
            r11.A05(r2)
        L_0x054a:
            boolean r2 = r1.A0V
            if (r2 != 0) goto L_0x057a
            int r3 = r12.A00()
            r2 = 1
            if (r3 == r2) goto L_0x057a
            int r3 = r12.A00()
            r2 = 3
            if (r3 != r2) goto L_0x0561
            java.lang.String r2 = "MediaDownload/updateMessageAfterExecution/keeping suspicious download file"
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x0561:
            java.io.File r3 = r4.A02
            if (r3 == 0) goto L_0x0589
            r3.getAbsolutePath()
            java.io.File r2 = r0.A03
            r2.getAbsolutePath()
            java.io.File r2 = r0.A03
            r2.getAbsolutePath()
            r12.A0D(r3)
            java.io.File r0 = r0.A03
            r0.delete()
        L_0x057a:
            if (r11 == 0) goto L_0x05fd
            java.io.File r0 = r12.A03()
            r11.A07(r0)
            r0 = 3
            r11.A05(r0)
            monitor-enter(r11)
            goto L_0x05e1
        L_0x0589:
            java.io.File r3 = r1.A0C
            if (r3 == 0) goto L_0x059f
            boolean r2 = r3.exists()
            if (r2 != 0) goto L_0x059f
            java.io.File r2 = r0.A03
            boolean r2 = A03(r2, r3)
            if (r2 == 0) goto L_0x059f
            r12.A0D(r3)
            goto L_0x057a
        L_0x059f:
            boolean r15 = r1.A0U
            boolean r14 = r1.A0P
            boolean r13 = r1.A0S
            boolean r10 = r1.A0W
            X.1XK r9 = r1.A09
            int r8 = r1.A04
            int r7 = r1.A01
            java.lang.String r6 = r1.A0I
            java.lang.String r5 = r4.A03
            java.lang.String r2 = r1.A0J
            if (r5 != 0) goto L_0x05bb
            if (r2 == 0) goto L_0x05df
            java.lang.String r5 = X.AnonymousClass1XI.A08(r2)
        L_0x05bb:
            X.0sb r3 = r0.A0B
            X.0u3 r2 = r0.A0d
            r23 = r10
            r22 = r13
            r21 = r14
            r20 = r15
            r19 = r7
            r18 = r8
            r17 = r5
            r16 = r6
            r15 = r9
            r14 = r2
            r13 = r3
            java.io.File r2 = X.C17970vw.A0D(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r12.A0D(r2)
            java.io.File r0 = r0.A03
            A03(r0, r2)
            goto L_0x057a
        L_0x05df:
            r5 = 0
            goto L_0x05bb
        L_0x05e1:
            java.util.List r0 = r11.A0F     // Catch:{ all -> 0x05e7 }
            r0.clear()     // Catch:{ all -> 0x05e7 }
            goto L_0x05f1
        L_0x05e7:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x05ea:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x05ed:
            r0.A0D(r4)
            goto L_0x05fd
        L_0x05f1:
            monitor-exit(r11)
            r11.A03()
            java.io.File r0 = r1.A0B
            X.AnonymousClass00B.A06(r0)
            r0.delete()
        L_0x05fd:
            r24.A00()
            return r4
        L_0x0601:
            X.0t8 r3 = r0.A0P     // Catch:{ Exception -> 0x061e }
            X.0sf r2 = r0.A0g     // Catch:{ Exception -> 0x061e }
            X.0tY r2 = A00(r3, r1, r2)     // Catch:{ Exception -> 0x061e }
            X.AnonymousClass00B.A06(r2)     // Catch:{ Exception -> 0x061e }
            X.0ta r2 = r2.A02     // Catch:{ Exception -> 0x061e }
            X.AnonymousClass00B.A06(r2)     // Catch:{ Exception -> 0x061e }
            java.io.File r2 = r2.A0F     // Catch:{ Exception -> 0x061e }
            X.AnonymousClass00B.A06(r2)     // Catch:{ Exception -> 0x061e }
            if (r2 == 0) goto L_0x0623
            X.1et r4 = new X.1et
            r4.<init>(r12)
            return r4
        L_0x061e:
            java.lang.String r2 = "MediaDownload/call/unable to find existing file."
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0623:
            r0.A06()
            X.0ua r7 = r0.A0F
            X.0s5 r6 = r0.A0E
            X.0xf r5 = r0.A0f
            X.0zs r4 = r0.A0R
            X.1XK r3 = r1.A09
            X.1cs r1 = r0.A0c
            X.3ul r2 = new X.3ul
            r20 = r13
            r21 = r4
            r22 = r1
            r23 = r3
            r24 = r5
            r26 = r14
            r16 = r2
            r17 = r6
            r18 = r7
            r19 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.facebook.redex.IDxDListenerShape344S0100000_2_I0 r1 = new com.facebook.redex.IDxDListenerShape344S0100000_2_I0
            r1.<init>(r0, r12)
            r2.A4Z(r1)
            java.lang.Object r1 = r0.A0p
            monitor-enter(r1)
            r0.A02 = r2     // Catch:{ all -> 0x0666 }
            monitor-exit(r1)     // Catch:{ all -> 0x0666 }
            X.258 r0 = r2.A01()
            r25.getCanonicalPath()
            r25.length()
            X.1et r4 = r0.A00
            return r4
        L_0x0666:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0666 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30701co.A05():java.lang.Object");
    }

    public final File A07() {
        StringBuilder sb = new StringBuilder();
        String str = this.A0a.A0F;
        AnonymousClass00B.A06(str);
        sb.append(str.replace(IOUtils.DIR_SEPARATOR_UNIX, '-'));
        sb.append(".chk.tmp");
        return this.A0B.A0N(sb.toString());
    }

    public void A08() {
        byte[] A0G2 = this.A0Z.A0G();
        if (A0G2 != null) {
            this.A0K.A04(A0G2);
        }
    }

    public void A09(long j2) {
        this.A0J.A04(Long.valueOf(j2));
    }

    public void A0A(C31701et r5) {
        C30761cu r0 = this.A0Z;
        A0E(r0);
        LinkedList linkedList = this.A0q;
        synchronized (linkedList) {
            C30761cu A022 = r0.A02();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((C38331qc) it.next()).AQ4(r5, A022);
            }
            linkedList.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d0, code lost:
        if (r10.contains("wa/static") == false) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r0.A0C == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018b, code lost:
        if (r12 == 2) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bc, code lost:
        if (r11 == 15) goto L_0x01be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C31701et r19) {
        /*
            r18 = this;
            r6 = r18
            X.1cs r5 = r6.A0c
            r7 = r19
            r5.A08 = r7
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0F = r0
            r0 = 4
            r5.A02 = r0
            boolean r0 = r6.A0t
            if (r0 == 0) goto L_0x002f
            boolean r0 = r5 instanceof X.C30751ct
            if (r0 == 0) goto L_0x002f
            X.1qT r0 = r6.A0a
            java.lang.String r0 = r0.A0E
            if (r0 == 0) goto L_0x002f
            X.0sq r2 = r6.A0m
            r1 = 35
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.Acl(r0)
        L_0x002f:
            X.1f1 r4 = r6.A01
            if (r4 == 0) goto L_0x0064
            java.lang.Long r0 = r5.A04()
            long r2 = r0.longValue()
            long r0 = r4.A07
            long r0 = r0 + r2
            r4.A07 = r0
            X.2Oh r0 = r6.A0i
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x004e
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
        L_0x004e:
            int r1 = r7.A01
            r0 = 0
            if (r1 != 0) goto L_0x0054
            r0 = 1
        L_0x0054:
            X.0sq r2 = r6.A0m
            r1 = 33
            if (r0 == 0) goto L_0x005c
            r1 = 34
        L_0x005c:
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.Acl(r0)
        L_0x0064:
            X.0w1 r4 = r6.A0C
            X.1qT r9 = r6.A0a
            X.1f1 r10 = r6.A01
            X.2Oh r0 = r6.A0i
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.A0C
            r2 = 1
            if (r0 != 0) goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            int r0 = r6.A06
            r17 = r0
            X.1cu r1 = r6.A0Z
            monitor-enter(r1)
            boolean r14 = r1.A0H     // Catch:{ all -> 0x031f }
            monitor-exit(r1)
            java.lang.Integer r13 = r1.A08
            if (r2 != 0) goto L_0x0260
            X.1et r0 = r5.A08
            if (r0 != 0) goto L_0x0134
            r0 = -1
        L_0x0087:
            int r11 = X.C42141xI.A01(r0)
            X.1XK r12 = r5.A0Y
            X.1XK r0 = X.AnonymousClass1XK.A0H
            r3 = 1
            r8 = 0
            if (r12 != r0) goto L_0x0094
            r8 = 1
        L_0x0094:
            X.2e9 r2 = new X.2e9
            r2.<init>()
            int r0 = r9.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0H = r0
            boolean r0 = r5.A0W
            if (r0 == 0) goto L_0x0130
            r0 = 4
        L_0x00a7:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0T = r0
            java.lang.Long r0 = r5.A0N
            r2.A0V = r0
            long r0 = r9.A07
            double r15 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r15)
            r2.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A04 = r0
            r2.A05 = r0
            int r0 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0C = r0
            java.lang.Integer r0 = r5.A0D
            r2.A0A = r0
            java.lang.String r0 = r5.A0Q
            r2.A0a = r0
            java.net.URL r0 = r5.A0U
            if (r0 != 0) goto L_0x012b
            r0 = 0
        L_0x00d5:
            r2.A0b = r0
            byte r0 = r12.A00
            boolean r0 = X.C30921dB.A00(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r0
            if (r14 == 0) goto L_0x00ea
            r0 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x00ea:
            r2.A0B = r13
            java.lang.Long r1 = r5.A04()
            long r12 = r1.longValue()
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0100
            java.lang.Long r0 = X.C42141xI.A02(r1, r8)
            r2.A0W = r0
        L_0x0100:
            java.lang.Long r0 = r5.A0H
            if (r0 != 0) goto L_0x011f
            r0 = 0
        L_0x0105:
            java.lang.Long r0 = X.C42141xI.A02(r0, r8)
            r2.A0U = r0
            java.lang.Long r0 = r5.A0O
            if (r0 == 0) goto L_0x0111
            r2.A0Q = r0
        L_0x0111:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r2.A0G = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r2.A0F = r0
            monitor-enter(r5)
            goto L_0x0138
        L_0x011f:
            long r12 = r0.longValue()
            long r0 = r5.A0X
            long r12 = r12 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            goto L_0x0105
        L_0x012b:
            java.lang.String r0 = r0.getHost()
            goto L_0x00d5
        L_0x0130:
            r0 = 3
            goto L_0x00a7
        L_0x0134:
            int r0 = r0.A01
            goto L_0x0087
        L_0x0138:
            int r12 = r5.A00     // Catch:{ all -> 0x013b }
            goto L_0x013e
        L_0x013b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x013e:
            monitor-exit(r5)
            boolean r0 = r9.A0V
            if (r0 == 0) goto L_0x0313
            r1 = 5
        L_0x0144:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A0E = r0
            java.lang.Long r0 = r5.A0J
            java.lang.Long r0 = X.C42141xI.A02(r0, r8)
            r2.A0S = r0
            java.lang.Long r0 = r5.A0G
            if (r0 == 0) goto L_0x030f
            long r0 = r0.longValue()
        L_0x015a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0L = r0
            long r0 = r5.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.C42141xI.A02(r0, r8)
            r2.A0I = r0
            long r0 = r5.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.C42141xI.A02(r0, r8)
            r2.A0K = r0
            java.lang.Boolean r0 = r5.A09
            r2.A00 = r0
            java.lang.Long r0 = r5.A0M
            r2.A0J = r0
            int r12 = r9.A02
            r0 = 3
            if (r12 == r0) goto L_0x018d
            r1 = 2
            r0 = 0
            if (r12 != r1) goto L_0x018e
        L_0x018d:
            r0 = 1
        L_0x018e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            long r0 = r5.A02()
            double r12 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r12)
            r2.A06 = r0
            java.lang.Long r1 = r5.A0H
            r12 = 0
            if (r1 == 0) goto L_0x01ad
            java.lang.Long r0 = r5.A0P
            if (r0 == 0) goto L_0x0300
            long r12 = r0.longValue()
        L_0x01ad:
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            java.lang.Long r0 = X.C42141xI.A02(r0, r8)
            r2.A0M = r0
            if (r11 == r3) goto L_0x01be
            r0 = 15
            r12 = 1
            if (r11 != r0) goto L_0x01bf
        L_0x01be:
            r12 = 0
        L_0x01bf:
            r1 = 0
            if (r12 == 0) goto L_0x02fd
            java.lang.String r0 = r5.A0T
        L_0x01c4:
            r2.A0Y = r0
            java.lang.String r0 = r5.A0S
            r2.A0c = r0
            if (r12 == 0) goto L_0x02fa
            java.net.URL r0 = r5.A0U
            if (r0 != 0) goto L_0x02f4
            r0 = 0
        L_0x01d1:
            r2.A0Z = r0
            if (r12 == 0) goto L_0x01d7
            java.lang.String r1 = r5.A0R
        L_0x01d7:
            r2.A0X = r1
            if (r10 == 0) goto L_0x02e0
            int r0 = r10.A03
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0P = r0
            long r0 = r10.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.C42141xI.A02(r0, r8)
            r2.A0R = r0
            java.lang.String r0 = r10.A0D
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            long r10 = r0.getMostSignificantBits()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r10 = r10 & r0
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r2.A0O = r0
        L_0x0206:
            java.lang.Float r1 = r5.A0B
            if (r1 == 0) goto L_0x0221
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r8 = r1.floatValue()
            float r0 = r0 - r8
            float r1 = java.lang.Math.abs(r0)
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0221
            double r0 = (double) r8
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A07 = r0
        L_0x0221:
            java.lang.String r1 = r9.A0D
            java.lang.String r10 = r9.A0J
            if (r1 != 0) goto L_0x0297
            if (r10 == 0) goto L_0x02d8
            java.lang.String r0 = "express"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x02c0
            r0 = 4
        L_0x0232:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0D = r0
            boolean r0 = r5.A0V
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            long r0 = r5.A05
            double r8 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r8)
            r2.A08 = r0
            long r0 = r5.A06
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0N = r0
            X.0t9 r8 = r4.A0C
            if (r12 == 0) goto L_0x0277
            X.00F r0 = new X.00F
            r0.<init>(r3, r3)
            r8.A0B(r2, r0, r3)
        L_0x025d:
            r8.A01()
        L_0x0260:
            long r3 = r5.A02()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0276
            X.0sq r2 = r6.A0m
            r1 = 24
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r6, r1, r7)
            r2.Acl(r0)
        L_0x0276:
            return
        L_0x0277:
            if (r10 == 0) goto L_0x0293
            java.lang.String r0 = "express"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x0293
            X.0pd r3 = r4.A0B
            r1 = 2810(0xafa, float:3.938E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 != 0) goto L_0x0293
            X.00F r0 = X.C52622eA.A00
            r8.A0A(r2, r0)
            goto L_0x025d
        L_0x0293:
            r8.A06(r2)
            goto L_0x025d
        L_0x0297:
            java.lang.String r0 = "/o"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x02a1
            r0 = 3
            goto L_0x0232
        L_0x02a1:
            java.lang.String r0 = "/v"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x02ab
            r0 = 2
            goto L_0x0232
        L_0x02ab:
            if (r10 == 0) goto L_0x02d5
            java.lang.String r0 = "static.whatsapp.net"
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x02d2
            java.lang.String r0 = "wa/static"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x02d5
            goto L_0x02d2
        L_0x02c0:
            java.lang.String r0 = "static.whatsapp.net"
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x02d2
            java.lang.String r0 = "wa/static"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x02d8
        L_0x02d2:
            r0 = 5
            goto L_0x0232
        L_0x02d5:
            java.lang.String r0 = "messagelogging/getBackendStoreType Unknown backend store type"
            goto L_0x02da
        L_0x02d8:
            java.lang.String r0 = "messagelogging/getBackendStoreType Unknown backend store type, both direct path and url are null"
        L_0x02da:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            goto L_0x0232
        L_0x02e0:
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r2.A0V = r0
            r2.A0P = r0
            r2.A0O = r0
            java.lang.Long r0 = r2.A0W
            java.lang.Long r0 = X.C42141xI.A02(r0, r8)
            r2.A0R = r0
            goto L_0x0206
        L_0x02f4:
            java.lang.String r0 = r0.toString()
            goto L_0x01d1
        L_0x02fa:
            r0 = r1
            goto L_0x01d1
        L_0x02fd:
            r0 = r1
            goto L_0x01c4
        L_0x0300:
            java.lang.Long r0 = r5.A0F
            if (r0 != 0) goto L_0x01ad
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.longValue()
            long r12 = r12 - r0
            goto L_0x01ad
        L_0x030f:
            r0 = 0
            goto L_0x015a
        L_0x0313:
            r0 = 2
            r1 = 2
            if (r12 == r3) goto L_0x0144
            r1 = 3
            if (r12 == r0) goto L_0x0144
            if (r12 == r1) goto L_0x0144
            r1 = 1
            goto L_0x0144
        L_0x031f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30701co.A0B(X.1et):void");
    }

    public final void A0C(C31701et r5) {
        StringBuilder sb = new StringBuilder("MediaDownload/updateMessageAfterDownload/mediaHash=");
        C38241qT r3 = this.A0a;
        sb.append(r3.A0F);
        sb.append(" url=");
        sb.append(this.A04);
        sb.append(" status=");
        sb.append(r5);
        Log.i(sb.toString());
        if (this.A0w) {
            this.A0f.A03(this.A0e);
        }
        boolean z2 = false;
        if (r5.A01 == 0) {
            z2 = true;
        }
        this.A0Z.A0C(r5, r3.A01, z2);
    }

    public final void A0D(C31701et r7) {
        A0C(r7);
        C48642Oh r2 = this.A0i;
        if (r2 != null) {
            int i2 = r7.A01;
            boolean A012 = C31701et.A01(i2);
            synchronized (r2) {
                r2.A0B = A012;
                r2.A02 = i2;
            }
            r2.A05(4);
            synchronized (r2) {
                r2.A0F.clear();
            }
        }
        File file = this.A03;
        if (file != null && file.length() == 0) {
            A02(this.A0B, this.A03);
        }
        int i3 = r7.A01;
        if (i3 == 5 || i3 == 12 || i3 == 4) {
            this.A0Z.A05();
        }
    }

    public void A0E(C30761cu r3) {
        StringBuilder sb = new StringBuilder("MediaDownload/publishDownloadDataWhenComplete; mediaHash=");
        sb.append(this.A0a.A0F);
        sb.append(" downloadData=");
        sb.append(r3.toString());
        Log.i(sb.toString());
        this.A0G.A04(r3.A02());
    }

    public final void A0F(File file) {
        C15900s5 r2 = this.A0E;
        int i2 = this.A0a.A04;
        long length = file.length();
        if (i2 == 7 && length < ((long) r2.A02(C15910s6.A24)) * FileUtils.ONE_KB) {
            try {
                List A002 = AnonymousClass25M.A00(this.A0n.A01(Uri.fromFile(file)));
                if (A002 != null) {
                    C30761cu r1 = this.A0Z;
                    Integer valueOf = Integer.valueOf(A002.size());
                    synchronized (r1) {
                        r1.A07 = valueOf;
                    }
                }
            } catch (IOException e2) {
                Log.e("vcardloader/splitvcards/exception", e2);
            }
        }
    }

    public void A4Z(C38331qc r3) {
        LinkedList linkedList = this.A0q;
        synchronized (linkedList) {
            linkedList.add(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r3 == false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A64(boolean r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0005
            r7.A04()
        L_0x0005:
            java.lang.String r0 = "MediaDownload/cancelMediaDownload/mediaHash="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1qT r6 = r7.A0a
            java.lang.String r0 = r6.A0F
            r1.append(r0)
            r1.append(r0)
            java.lang.String r0 = " url="
            r1.append(r0)
            java.net.URL r0 = r7.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r7.A0p
            monitor-enter(r2)
            X.3ul r1 = r7.A02     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x003b
            monitor-enter(r1)     // Catch:{ all -> 0x0087 }
            X.5Sc r0 = r1.A00     // Catch:{ all -> 0x0035 }
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x003b
            goto L_0x0038
        L_0x0035:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0038:
            r0.A63()     // Catch:{ all -> 0x0087 }
        L_0x003b:
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            r7.cancel()
            X.1cu r5 = r7.A0Z
            java.lang.Boolean r0 = r5.A04()
            r4 = 0
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = r5.A04()
            boolean r3 = r0.booleanValue()
            if (r3 != 0) goto L_0x0065
        L_0x0052:
            r2 = 13
            r0 = 0
            X.1et r1 = new X.1et
            r1.<init>(r0, r0, r2, r4)
            int r0 = r6.A01
            r5.A0C(r1, r0, r4)
            r5.A05()
            r7.A0E(r5)
        L_0x0065:
            java.util.LinkedList r2 = r7.A0q
            monitor-enter(r2)
            goto L_0x006b
        L_0x0069:
            r3 = 0
            goto L_0x0052
        L_0x006b:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0084 }
        L_0x006f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0084 }
            X.1qc r0 = (X.C38331qc) r0     // Catch:{ all -> 0x0084 }
            r0.AQ3(r3)     // Catch:{ all -> 0x0084 }
            goto L_0x006f
        L_0x007f:
            r2.clear()     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            return
        L_0x0084:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            throw r0
        L_0x0087:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30701co.A64(boolean):void");
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof C30701co)) {
            return 0;
        }
        long j2 = ((C30701co) obj).A07;
        long j3 = this.A07;
        if (j2 < j3) {
            return -1;
        }
        return j3 >= j2 ? 0 : 1;
    }
}
