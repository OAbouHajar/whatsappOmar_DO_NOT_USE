package X;

import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.Lock;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.11s  reason: invalid class name and case insensitive filesystem */
public class C208211s {
    public C35981mo A00;
    public C35991mp A01;
    public final AnonymousClass19T A02;
    public final C16040sK A03;
    public final C15900s5 A04;
    public final C19250y7 A05;
    public final C31861f9 A06;
    public final C30851d4 A07;
    public final C35941mk A08;
    public final C31691es A09;
    public final C31901fD A0A;
    public final C31741ex A0B;
    public final C31711eu A0C;
    public final C16440t3 A0D;
    public final C15860rz A0E;
    public final AnonymousClass19U A0F;
    public final C35951ml A0G = new C35951ml();
    public final AnonymousClass16P A0H;
    public final C18920xT A0I;
    public final AnonymousClass03M A0J;
    public final C002601d A0K;
    public final C14710pd A0L;
    public final JniBridge A0M;

    public C208211s(AnonymousClass19T r16, C16040sK r17, C15900s5 r18, C19250y7 r19, C16440t3 r20, C15860rz r21, AnonymousClass19U r22, AnonymousClass16P r23, C18920xT r24, C002601d r25, C14710pd r26, JniBridge jniBridge) {
        C15900s5 r6 = r18;
        C16440t3 r3 = r20;
        C002601d r2 = r25;
        C31691es r9 = new C31691es(r6, r3, r2);
        C31741ex r11 = new C31741ex(r3, r2);
        C31901fD r10 = new C31901fD(r3, r2);
        C30851d4 r8 = new C30851d4(r3, r2);
        C31711eu r12 = new C31711eu(r3, r2);
        C35941mk r5 = new C35941mk(r3, r2);
        C31861f9 r7 = new C31861f9(r3, r2);
        C35961mm r1 = new C35961mm(this);
        this.A0J = r1;
        this.A0D = r3;
        this.A0L = r26;
        JniBridge jniBridge2 = jniBridge;
        this.A0M = jniBridge2;
        this.A03 = r17;
        this.A04 = r6;
        this.A0I = r24;
        this.A0F = r22;
        AnonymousClass16P r14 = r23;
        this.A0H = r14;
        this.A0K = r2;
        this.A02 = r16;
        this.A09 = r9;
        this.A0B = r11;
        this.A05 = r19;
        this.A0E = r21;
        this.A0A = r10;
        this.A07 = r8;
        this.A0C = r12;
        this.A08 = r5;
        this.A06 = r7;
        this.A00 = new C35981mo(new C35971mn(r6, r7, r8, r9, r10, r11, r12, this, r14), r3, r14);
        this.A01 = new C35991mp(r6, r9, r3, jniBridge2);
        r2.A00 = r1;
    }

    public static C30971dG A00(C31791f2 r6) {
        C31801f3 r5 = r6.A00;
        int i2 = r5.A01;
        byte[] bArr = new byte[3];
        bArr[2] = (byte) i2;
        bArr[1] = (byte) (i2 >> 8);
        bArr[0] = (byte) (i2 >> 16);
        return new C30971dG(bArr, r6.A00().A01.A01, r5.A05.A04());
    }

    public static C30971dG A01(byte[] bArr, int i2) {
        byte[] A042 = ((C36001mq) C28541Wm.A0E(C36001mq.A04, bArr)).A03.A04();
        int length = A042.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(A042, 1, bArr2, 0, length);
        byte[] bArr3 = new byte[3];
        bArr3[2] = (byte) i2;
        bArr3[1] = (byte) (i2 >> 8);
        bArr3[0] = (byte) (i2 >> 16);
        return new C30971dG(bArr3, bArr2, (byte[]) null);
    }

    public static void A02(C31721ev r1) {
        if (r1.A01.A00.A05.A04().length == 0) {
            throw new IOException("Alice base key missing from session");
        }
    }

    public int A03() {
        return this.A07.A01();
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0152 A[Catch:{ 1nJ -> 0x00e7, all -> 0x0369 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0154 A[Catch:{ 1nJ -> 0x00e7, all -> 0x0369 }] */
    public int A04(X.C28861Yb r38, X.C30971dG r39, X.C30971dG r40, byte[] r41, byte[] r42, byte r43) {
        /*
            r37 = this;
            r6 = r37
            X.0xT r0 = r6.A0I
            r1 = r38
            java.util.concurrent.locks.Lock r19 = r0.A02(r1)
            if (r19 != 0) goto L_0x000d
            goto L_0x0011
        L_0x000d:
            r19.lock()     // Catch:{ all -> 0x0369 }
            goto L_0x0016
        L_0x0011:
            X.16P r0 = r6.A0H     // Catch:{ all -> 0x0369 }
            r0.A00()     // Catch:{ all -> 0x0369 }
        L_0x0016:
            X.0pd r3 = r6.A0L     // Catch:{ all -> 0x0369 }
            r2 = 1760(0x6e0, float:2.466E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x0369 }
            boolean r0 = r3.A0E(r0, r2)     // Catch:{ all -> 0x0369 }
            r10 = r41
            r11 = r43
            if (r0 == 0) goto L_0x004c
            X.1ev r0 = r6.A0D(r1)     // Catch:{ all -> 0x0369 }
            X.1ms r0 = r0.A01     // Catch:{ all -> 0x0369 }
            X.1mt r0 = r0.A00     // Catch:{ all -> 0x0369 }
            X.1Ww r0 = r0.A07     // Catch:{ all -> 0x0369 }
            byte[] r5 = r0.A04()     // Catch:{ all -> 0x0369 }
            int r4 = r5.length     // Catch:{ all -> 0x0369 }
            if (r4 == 0) goto L_0x004c
            r3 = 1
            int r4 = r4 - r3
            byte[] r2 = new byte[r4]     // Catch:{ all -> 0x0369 }
            r0 = 0
            java.lang.System.arraycopy(r5, r3, r2, r0, r4)     // Catch:{ all -> 0x0369 }
            byte r0 = r5[r0]     // Catch:{ all -> 0x0369 }
            if (r0 != r11) goto L_0x0049
            boolean r0 = java.util.Arrays.equals(r10, r2)     // Catch:{ all -> 0x0369 }
            if (r0 != 0) goto L_0x004c
        L_0x0049:
            r6.A0U(r1)     // Catch:{ all -> 0x0369 }
        L_0x004c:
            X.0s5 r2 = r6.A04     // Catch:{ all -> 0x0369 }
            X.0s8 r0 = X.C15910s6.A13     // Catch:{ all -> 0x0369 }
            boolean r0 = r2.A05(r0)     // Catch:{ all -> 0x0369 }
            r9 = r39
            r3 = r40
            if (r0 == 0) goto L_0x00d2
            X.1mp r7 = r6.A01     // Catch:{ all -> 0x0369 }
            if (r39 == 0) goto L_0x00cf
            byte[] r0 = r9.A01     // Catch:{ all -> 0x0369 }
            int r4 = X.C28641Wx.A01(r0)     // Catch:{ all -> 0x0369 }
            byte[] r11 = r9.A00     // Catch:{ all -> 0x0369 }
        L_0x0066:
            byte[] r0 = r3.A01     // Catch:{ all -> 0x0369 }
            int r2 = X.C28641Wx.A01(r0)     // Catch:{ all -> 0x0369 }
            int r0 = X.C28641Wx.A00(r42)     // Catch:{ all -> 0x0369 }
            X.0t3 r5 = r7.A02     // Catch:{ all -> 0x0369 }
            long r28 = r5.A00()     // Catch:{ all -> 0x0369 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r28 = r28 / r5
            java.lang.String r5 = "wamsys/processPreKeyBundle preKeyId="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0369 }
            r6.<init>(r5)     // Catch:{ all -> 0x0369 }
            r6.append(r4)     // Catch:{ all -> 0x0369 }
            java.lang.String r5 = "; signedPreKeyId="
            r6.append(r5)     // Catch:{ all -> 0x0369 }
            r6.append(r2)     // Catch:{ all -> 0x0369 }
            java.lang.String r5 = "; registrationId="
            r6.append(r5)     // Catch:{ all -> 0x0369 }
            r6.append(r0)     // Catch:{ all -> 0x0369 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0369 }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x0369 }
            com.whatsapp.wamsys.JniBridge r8 = r7.A03     // Catch:{ all -> 0x0369 }
            java.lang.String r30 = X.C31811f4.A01(r1)     // Catch:{ all -> 0x0369 }
            int r1 = r1.A00     // Catch:{ all -> 0x0369 }
            byte[] r12 = r3.A00     // Catch:{ all -> 0x0369 }
            byte[] r9 = r3.A02     // Catch:{ all -> 0x0369 }
            r36 = 0
            long r6 = (long) r1     // Catch:{ all -> 0x0369 }
            long r4 = (long) r4     // Catch:{ all -> 0x0369 }
            long r2 = (long) r2     // Catch:{ all -> 0x0369 }
            long r0 = (long) r0     // Catch:{ all -> 0x0369 }
            java.util.concurrent.atomic.AtomicReference r8 = r8.wajContext     // Catch:{ all -> 0x0369 }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0369 }
            com.facebook.simplejni.NativeHolder r8 = (com.facebook.simplejni.NativeHolder) r8     // Catch:{ all -> 0x0369 }
            r20 = r6
            r22 = r4
            r24 = r2
            r26 = r0
            r31 = r8
            r32 = r11
            r33 = r10
            r34 = r12
            r35 = r9
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIIIIIOOOOOOO(r20, r22, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0369 }
            int r7 = (int) r0     // Catch:{ all -> 0x0369 }
            goto L_0x0363
        L_0x00cf:
            r11 = 0
            r4 = 0
            goto L_0x0066
        L_0x00d2:
            X.1mo r2 = r6.A00     // Catch:{ all -> 0x0369 }
            r23 = 0
            int r6 = r10.length     // Catch:{ 1nJ -> 0x00e7 }
            r5 = 1
            int r0 = r6 + 1
            byte[] r4 = new byte[r0]     // Catch:{ 1nJ -> 0x00e7 }
            r0 = 0
            r4[r0] = r43     // Catch:{ 1nJ -> 0x00e7 }
            java.lang.System.arraycopy(r10, r0, r4, r5, r6)     // Catch:{ 1nJ -> 0x00e7 }
            X.1nF r4 = X.C36241nE.A00(r4)     // Catch:{ 1nJ -> 0x00e7 }
            goto L_0x00fb
        L_0x00e7:
            r5 = move-exception
            java.lang.String r4 = "invalid identity key returned from server during prekey fetch; address="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0369 }
            r0.<init>(r4)     // Catch:{ all -> 0x0369 }
            r0.append(r1)     // Catch:{ all -> 0x0369 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0369 }
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x0369 }
            r4 = r23
        L_0x00fb:
            if (r39 == 0) goto L_0x0124
            byte[] r8 = r9.A00     // Catch:{ all -> 0x0369 }
            if (r8 == 0) goto L_0x0124
            int r7 = r8.length     // Catch:{ 1nJ -> 0x0112 }
            r6 = 1
            int r0 = r7 + 1
            byte[] r5 = new byte[r0]     // Catch:{ 1nJ -> 0x0112 }
            r0 = 0
            r5[r0] = r43     // Catch:{ 1nJ -> 0x0112 }
            java.lang.System.arraycopy(r8, r0, r5, r6, r7)     // Catch:{ 1nJ -> 0x0112 }
            X.1nF r8 = X.C36241nE.A00(r5)     // Catch:{ 1nJ -> 0x0112 }
            goto L_0x0126
        L_0x0112:
            r6 = move-exception
            java.lang.String r5 = "invalid prekey returned from server during prekey fetch; address="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0369 }
            r0.<init>(r5)     // Catch:{ all -> 0x0369 }
            r0.append(r1)     // Catch:{ all -> 0x0369 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0369 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x0369 }
        L_0x0124:
            r8 = r23
        L_0x0126:
            byte[] r10 = r3.A00     // Catch:{ 1nJ -> 0x0139 }
            int r7 = r10.length     // Catch:{ 1nJ -> 0x0139 }
            r6 = 1
            int r0 = r7 + 1
            byte[] r5 = new byte[r0]     // Catch:{ 1nJ -> 0x0139 }
            r0 = 0
            r5[r0] = r43     // Catch:{ 1nJ -> 0x0139 }
            java.lang.System.arraycopy(r10, r0, r5, r6, r7)     // Catch:{ 1nJ -> 0x0139 }
            X.1nF r23 = X.C36241nE.A00(r5)     // Catch:{ 1nJ -> 0x0139 }
            goto L_0x014b
        L_0x0139:
            r6 = move-exception
            java.lang.String r5 = "invalid signed prekey returned from server during prekey fetch; address="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0369 }
            r0.<init>(r5)     // Catch:{ all -> 0x0369 }
            r0.append(r1)     // Catch:{ all -> 0x0369 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0369 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x0369 }
        L_0x014b:
            int r18 = X.C28641Wx.A00(r42)     // Catch:{ all -> 0x0369 }
            r7 = 0
            if (r39 != 0) goto L_0x0154
            r10 = -1
            goto L_0x015a
        L_0x0154:
            byte[] r0 = r9.A01     // Catch:{ all -> 0x0369 }
            int r10 = X.C28641Wx.A01(r0)     // Catch:{ all -> 0x0369 }
        L_0x015a:
            byte[] r0 = r3.A01     // Catch:{ all -> 0x0369 }
            int r17 = X.C28641Wx.A01(r0)     // Catch:{ all -> 0x0369 }
            byte[] r9 = r3.A02     // Catch:{ all -> 0x0369 }
            X.1nO r6 = new X.1nO     // Catch:{ all -> 0x0369 }
            r6.<init>((X.C36251nF) r4)     // Catch:{ all -> 0x0369 }
            X.1mn r5 = r2.A00     // Catch:{ all -> 0x0369 }
            X.1nZ r4 = r5.A06     // Catch:{ all -> 0x0369 }
            java.lang.String r2 = X.C31811f4.A01(r1)     // Catch:{ all -> 0x0369 }
            int r1 = r1.A00     // Catch:{ all -> 0x0369 }
            X.1nW r0 = new X.1nW     // Catch:{ all -> 0x0369 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0369 }
            X.1na r3 = new X.1na     // Catch:{ all -> 0x0369 }
            r13 = r5
            r14 = r5
            r11 = r3
            r12 = r5
            r15 = r4
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0369 }
            java.lang.Object r16 = X.C36301nK.A04     // Catch:{ 1nJ -> 0x035e, 1nP -> 0x0361 }
            monitor-enter(r16)     // Catch:{ 1nJ -> 0x035e, 1nP -> 0x0361 }
            X.1mn r5 = r3.A00     // Catch:{ all -> 0x035b }
            X.1nW r4 = r3.A04     // Catch:{ all -> 0x035b }
            X.1Yb r2 = X.C31811f4.A00(r4)     // Catch:{ all -> 0x035b }
            java.lang.String r0 = "axolotl trusting "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x035b }
            r1.<init>(r0)     // Catch:{ all -> 0x035b }
            r1.append(r2)     // Catch:{ all -> 0x035b }
            java.lang.String r0 = " key pair"
            r1.append(r0)     // Catch:{ all -> 0x035b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x035b }
            if (r23 == 0) goto L_0x0353
            X.1nF r0 = r6.A00     // Catch:{ all -> 0x035b }
            byte[] r2 = r23.A00()     // Catch:{ all -> 0x035b }
            X.1nb r1 = X.C36471nb.A00()     // Catch:{ all -> 0x035b }
            byte[] r0 = r0.A00     // Catch:{ all -> 0x035b }
            boolean r0 = r1.A01(r0, r2, r9)     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x034b
            X.1mn r3 = r3.A02     // Catch:{ all -> 0x035b }
            X.1nc r2 = r3.A02(r4)     // Catch:{ all -> 0x035b }
            X.1nd r11 = X.C36241nE.A01()     // Catch:{ all -> 0x035b }
            if (r8 != 0) goto L_0x0208
            X.1ne r9 = X.C36501ne.A00     // Catch:{ all -> 0x035b }
        L_0x01c5:
            boolean r0 = r9 instanceof X.C36521ng     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x0205
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x035b }
            X.1ng r1 = new X.1ng     // Catch:{ all -> 0x035b }
            r1.<init>(r0)     // Catch:{ all -> 0x035b }
        L_0x01d2:
            X.1nh r22 = r5.A01()     // Catch:{ all -> 0x035b }
            boolean r0 = r2.A02     // Catch:{ all -> 0x035b }
            if (r0 != 0) goto L_0x01f3
            X.1ni r8 = new X.1ni     // Catch:{ all -> 0x035b }
            r8.<init>()     // Catch:{ all -> 0x035b }
            java.util.LinkedList r10 = r2.A00     // Catch:{ all -> 0x035b }
            X.1ni r0 = r2.A01     // Catch:{ all -> 0x035b }
            r10.addFirst(r0)     // Catch:{ all -> 0x035b }
            r2.A01 = r8     // Catch:{ all -> 0x035b }
            int r8 = r10.size()     // Catch:{ all -> 0x035b }
            r0 = 40
            if (r8 <= r0) goto L_0x01f3
            r10.removeLast()     // Catch:{ all -> 0x035b }
        L_0x01f3:
            X.1ni r10 = r2.A01     // Catch:{ all -> 0x035b }
            X.1nj r8 = new X.1nj     // Catch:{ all -> 0x035b }
            r20 = r8
            r21 = r6
            r24 = r23
            r25 = r11
            r26 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x035b }
            goto L_0x020e
        L_0x0205:
            X.1ne r1 = X.C36501ne.A00     // Catch:{ all -> 0x035b }
            goto L_0x01d2
        L_0x0208:
            X.1ng r9 = new X.1ng     // Catch:{ all -> 0x035b }
            r9.<init>(r8)     // Catch:{ all -> 0x035b }
            goto L_0x01c5
        L_0x020e:
            r10.A06()     // Catch:{ IOException -> 0x0344 }
            X.1nO r14 = r8.A00     // Catch:{ IOException -> 0x0344 }
            r10.A0A(r14)     // Catch:{ IOException -> 0x0344 }
            X.1nh r15 = r8.A01     // Catch:{ IOException -> 0x0344 }
            X.1nO r0 = r15.A00     // Catch:{ IOException -> 0x0344 }
            r10.A09(r0)     // Catch:{ IOException -> 0x0344 }
            X.1nd r12 = X.C36241nE.A01()     // Catch:{ IOException -> 0x0344 }
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0344 }
            r13.<init>()     // Catch:{ IOException -> 0x0344 }
            r0 = 32
            byte[] r9 = new byte[r0]     // Catch:{ IOException -> 0x0344 }
            r0 = -1
            java.util.Arrays.fill(r9, r0)     // Catch:{ IOException -> 0x0344 }
            r13.write(r9)     // Catch:{ IOException -> 0x0344 }
            X.1nF r9 = r8.A03     // Catch:{ IOException -> 0x0344 }
            X.1nV r0 = r15.A01     // Catch:{ IOException -> 0x0344 }
            byte[] r0 = X.C36241nE.A02(r0, r9)     // Catch:{ IOException -> 0x0344 }
            r13.write(r0)     // Catch:{ IOException -> 0x0344 }
            X.1nF r15 = r14.A00     // Catch:{ IOException -> 0x0344 }
            X.1nd r0 = r8.A04     // Catch:{ IOException -> 0x0344 }
            X.1nV r14 = r0.A00     // Catch:{ IOException -> 0x0344 }
            byte[] r0 = X.C36241nE.A02(r14, r15)     // Catch:{ IOException -> 0x0344 }
            r13.write(r0)     // Catch:{ IOException -> 0x0344 }
            byte[] r0 = X.C36241nE.A02(r14, r9)     // Catch:{ IOException -> 0x0344 }
            r13.write(r0)     // Catch:{ IOException -> 0x0344 }
            X.1nf r9 = r8.A05     // Catch:{ IOException -> 0x0344 }
            boolean r0 = r9 instanceof X.C36521ng     // Catch:{ IOException -> 0x0344 }
            if (r0 == 0) goto L_0x0263
            java.lang.Object r0 = r9.A00()     // Catch:{ IOException -> 0x0344 }
            X.1nF r0 = (X.C36251nF) r0     // Catch:{ IOException -> 0x0344 }
            byte[] r0 = X.C36241nE.A02(r14, r0)     // Catch:{ IOException -> 0x0344 }
            r13.write(r0)     // Catch:{ IOException -> 0x0344 }
        L_0x0263:
            byte[] r15 = r13.toByteArray()     // Catch:{ IOException -> 0x0344 }
            X.1nk r14 = new X.1nk     // Catch:{ IOException -> 0x0344 }
            r14.<init>()     // Catch:{ IOException -> 0x0344 }
            java.lang.String r0 = "WhisperText"
            byte[] r13 = r0.getBytes()     // Catch:{ IOException -> 0x0344 }
            r9 = 64
            r0 = 32
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0344 }
            byte[] r9 = r14.A02(r15, r0, r13, r9)     // Catch:{ IOException -> 0x0344 }
            r0 = 32
            byte[][] r9 = X.C36581nm.A01(r9, r0, r0)     // Catch:{ IOException -> 0x0344 }
            r0 = r9[r7]     // Catch:{ IOException -> 0x0344 }
            X.1nn r13 = new X.1nn     // Catch:{ IOException -> 0x0344 }
            r13.<init>(r14, r0)     // Catch:{ IOException -> 0x0344 }
            r0 = 1
            r0 = r9[r0]     // Catch:{ IOException -> 0x0344 }
            X.1no r9 = new X.1no     // Catch:{ IOException -> 0x0344 }
            r9.<init>(r14, r0, r7)     // Catch:{ IOException -> 0x0344 }
            X.1nF r0 = r8.A02     // Catch:{ IOException -> 0x0344 }
            X.1np r8 = r13.A00(r0, r12)     // Catch:{ IOException -> 0x0344 }
            r10.A0B(r0, r9)     // Catch:{ IOException -> 0x0344 }
            java.lang.Object r0 = r8.A01     // Catch:{ IOException -> 0x0344 }
            X.1no r0 = (X.C36601no) r0     // Catch:{ IOException -> 0x0344 }
            r10.A0C(r12, r0)     // Catch:{ IOException -> 0x0344 }
            java.lang.Object r0 = r8.A00     // Catch:{ IOException -> 0x0344 }
            X.1nn r0 = (X.C36591nn) r0     // Catch:{ IOException -> 0x0344 }
            r10.A0D(r0)     // Catch:{ IOException -> 0x0344 }
            X.1ni r10 = r2.A01     // Catch:{ all -> 0x035b }
            X.1nF r8 = r11.A01     // Catch:{ all -> 0x035b }
            X.1nq r0 = X.C36621nq.A04     // Catch:{ all -> 0x035b }
            X.1Wr r11 = r0.A0U()     // Catch:{ all -> 0x035b }
            X.1nr r11 = (X.C36631nr) r11     // Catch:{ all -> 0x035b }
            r11.A03()     // Catch:{ all -> 0x035b }
            X.1Wm r9 = r11.A00     // Catch:{ all -> 0x035b }
            X.1nq r9 = (X.C36621nq) r9     // Catch:{ all -> 0x035b }
            int r0 = r9.A00     // Catch:{ all -> 0x035b }
            r0 = r0 | 2
            r9.A00 = r0     // Catch:{ all -> 0x035b }
            r0 = r17
            r9.A02 = r0     // Catch:{ all -> 0x035b }
            byte[] r9 = r8.A00()     // Catch:{ all -> 0x035b }
            int r0 = r9.length     // Catch:{ all -> 0x035b }
            X.1Ww r12 = X.C28631Ww.A01(r9, r7, r0)     // Catch:{ all -> 0x035b }
            r11.A03()     // Catch:{ all -> 0x035b }
            X.1Wm r9 = r11.A00     // Catch:{ all -> 0x035b }
            X.1nq r9 = (X.C36621nq) r9     // Catch:{ all -> 0x035b }
            int r0 = r9.A00     // Catch:{ all -> 0x035b }
            r0 = r0 | 4
            r9.A00 = r0     // Catch:{ all -> 0x035b }
            r9.A03 = r12     // Catch:{ all -> 0x035b }
            boolean r0 = r1 instanceof X.C36521ng     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x02fa
            java.lang.Object r0 = r1.A00()     // Catch:{ all -> 0x035b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x035b }
            int r9 = r0.intValue()     // Catch:{ all -> 0x035b }
            r11.A03()     // Catch:{ all -> 0x035b }
            X.1Wm r1 = r11.A00     // Catch:{ all -> 0x035b }
            X.1nq r1 = (X.C36621nq) r1     // Catch:{ all -> 0x035b }
            int r0 = r1.A00     // Catch:{ all -> 0x035b }
            r0 = r0 | 1
            r1.A00 = r0     // Catch:{ all -> 0x035b }
            r1.A01 = r9     // Catch:{ all -> 0x035b }
        L_0x02fa:
            X.1mt r0 = r10.A00     // Catch:{ all -> 0x035b }
            X.1Wr r9 = r0.A0U()     // Catch:{ all -> 0x035b }
            X.1ns r9 = (X.C36641ns) r9     // Catch:{ all -> 0x035b }
            X.1Wm r0 = r11.A02()     // Catch:{ all -> 0x035b }
            X.1nq r0 = (X.C36621nq) r0     // Catch:{ all -> 0x035b }
            r9.A03()     // Catch:{ all -> 0x035b }
            X.1Wm r1 = r9.A00     // Catch:{ all -> 0x035b }
            X.1mt r1 = (X.C36031mt) r1     // Catch:{ all -> 0x035b }
            r1.A0C = r0     // Catch:{ all -> 0x035b }
            int r0 = r1.A00     // Catch:{ all -> 0x035b }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A00 = r0     // Catch:{ all -> 0x035b }
            X.1Wm r0 = r9.A02()     // Catch:{ all -> 0x035b }
            X.1mt r0 = (X.C36031mt) r0     // Catch:{ all -> 0x035b }
            r10.A00 = r0     // Catch:{ all -> 0x035b }
            X.1ni r1 = r2.A01     // Catch:{ all -> 0x035b }
            X.11s r0 = r5.A07     // Catch:{ all -> 0x035b }
            X.1d4 r0 = r0.A07     // Catch:{ all -> 0x035b }
            int r0 = r0.A01()     // Catch:{ all -> 0x035b }
            r1.A07(r0)     // Catch:{ all -> 0x035b }
            X.1ni r1 = r2.A01     // Catch:{ all -> 0x035b }
            r0 = r18
            r1.A08(r0)     // Catch:{ all -> 0x035b }
            X.1ni r1 = r2.A01     // Catch:{ all -> 0x035b }
            byte[] r0 = r8.A00()     // Catch:{ all -> 0x035b }
            r1.A0E(r0)     // Catch:{ all -> 0x035b }
            r3.A04(r4, r2)     // Catch:{ all -> 0x035b }
            r5.A03(r6, r4)     // Catch:{ all -> 0x035b }
            monitor-exit(r16)     // Catch:{ all -> 0x035b }
            goto L_0x0363
        L_0x0344:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x035b }
            r0.<init>(r1)     // Catch:{ all -> 0x035b }
            throw r0     // Catch:{ all -> 0x035b }
        L_0x034b:
            java.lang.String r1 = "Invalid signature on device key!"
            X.1nJ r0 = new X.1nJ     // Catch:{ all -> 0x035b }
            r0.<init>(r1)     // Catch:{ all -> 0x035b }
            throw r0     // Catch:{ all -> 0x035b }
        L_0x0353:
            java.lang.String r1 = "No signed prekey!"
            X.1nJ r0 = new X.1nJ     // Catch:{ all -> 0x035b }
            r0.<init>(r1)     // Catch:{ all -> 0x035b }
            throw r0     // Catch:{ all -> 0x035b }
        L_0x035b:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x035b }
            throw r0     // Catch:{ 1nJ -> 0x035e, 1nP -> 0x0361 }
        L_0x035e:
            r7 = -1002(0xfffffffffffffc16, float:NaN)
            goto L_0x0363
        L_0x0361:
            r7 = -1010(0xfffffffffffffc0e, float:NaN)
        L_0x0363:
            if (r19 == 0) goto L_0x0368
            r19.unlock()
        L_0x0368:
            return r7
        L_0x0369:
            r0 = move-exception
            if (r19 == 0) goto L_0x036f
            r19.unlock()
        L_0x036f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A04(X.1Yb, X.1dG, X.1dG, byte[], byte[], byte):int");
    }

    public C30891d8 A05(C30881d7 r14, C28861Yb r15, byte[] bArr) {
        C30891d8 r0;
        C36131n3 r1;
        byte[] bArr2;
        Lock A022 = this.A0I.A02(r15);
        if (A022 == null) {
            this.A0H.A00();
        } else {
            try {
                A022.lock();
            } catch (Throwable th) {
                if (A022 != null) {
                    A022.unlock();
                }
                throw th;
            }
        }
        C30881d7 r10 = r14;
        byte[] bArr3 = bArr;
        if (this.A0L.A0E(C16620tM.A02, 182)) {
            JniBridge jniBridge = this.A01.A03;
            C36111n1 r02 = new C36111n1((NativeHolder) JniBridge.jvidispatchOIOOOO(2, (long) r15.A00, C31811f4.A01(r15), r10, (NativeHolder) jniBridge.wajContext.get(), bArr3));
            JniBridge.getInstance();
            NativeHolder nativeHolder = r02.A00;
            JniBridge.getInstance();
            r0 = new C30891d8((byte[]) JniBridge.jvidispatchOIO(0, (long) 52, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 53, nativeHolder));
        } else {
            C35981mo r03 = this.A00;
            C36301nK A052 = r03.A05(r15);
            if (r14 != null) {
                try {
                    r1 = new C36121n2(r14);
                } catch (C36161n6 e2) {
                    r0 = C35981mo.A00(e2, (byte[]) null, -1005);
                } catch (C36151n5 e3) {
                    r0 = C35981mo.A00(e3, (byte[]) null, -1001);
                } catch (C36171n7 e4) {
                    r0 = C35981mo.A00(e4, (byte[]) null, -1007);
                } catch (C36141n4 e5) {
                    r0 = C35981mo.A00(e5, (byte[]) null, -1008);
                }
            } else {
                r1 = new C36321nM();
            }
            if (r03.A02.A01()) {
                C36311nL r04 = new C36311nL(bArr3);
                synchronized (C36301nK.A04) {
                    bArr2 = A052.A03(r1, r04);
                }
            } else {
                bArr2 = A052.A03(r1, new C36311nL(bArr3));
            }
            r0 = C35981mo.A00((Exception) null, bArr2, 0);
        }
        if (A022 != null) {
            A022.unlock();
        }
        return r0;
    }

    public C30891d8 A06(C30881d7 r15, C28861Yb r16, byte[] bArr) {
        C30891d8 r1;
        C36131n3 r12;
        byte[] bArr2;
        C28861Yb r2 = r16;
        Lock A022 = this.A0I.A02(r2);
        if (A022 == null) {
            try {
                this.A0H.A00();
            } catch (C36161n6 e2) {
                Log.w("axolotl", e2);
                r1 = new C30891d8((byte[]) null, -1005);
            } catch (C36361nQ e3) {
                Log.w("axolotl", e3);
                r1 = new C30891d8((byte[]) null, -1006);
            } catch (Throwable th) {
                if (A022 != null) {
                    A022.unlock();
                }
                throw th;
            }
        } else {
            A022.lock();
        }
        byte[] bArr3 = bArr;
        C36331nN r5 = new C36331nN(bArr3);
        C14710pd r4 = this.A0L;
        C16620tM r3 = C16620tM.A02;
        if (r4.A0E(r3, 1468)) {
            byte[] A042 = A0D(r2).A01.A00.A07.A04();
            if (A042.length != 0 && !Arrays.equals(A042, r5.A03.A00.A00())) {
                A0U(r2);
            }
        }
        C30881d7 r11 = r15;
        if (r4.A0E(r3, 182)) {
            JniBridge jniBridge = this.A01.A03;
            C36111n1 r0 = new C36111n1((NativeHolder) JniBridge.jvidispatchOIOOOO(3, (long) r2.A00, C31811f4.A01(r2), r11, (NativeHolder) jniBridge.wajContext.get(), bArr3));
            JniBridge.getInstance();
            NativeHolder nativeHolder = r0.A00;
            JniBridge.getInstance();
            r1 = new C30891d8((byte[]) JniBridge.jvidispatchOIO(0, (long) 52, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 53, nativeHolder));
        } else {
            C35981mo r02 = this.A00;
            C36301nK A052 = r02.A05(r2);
            if (r15 != null) {
                try {
                    r12 = new C36121n2(r15);
                } catch (C36151n5 e4) {
                    r1 = C35981mo.A00(e4, (byte[]) null, -1001);
                } catch (C36161n6 e5) {
                    r1 = C35981mo.A00(e5, (byte[]) null, -1005);
                } catch (C36281nI e6) {
                    r1 = C35981mo.A00(e6, (byte[]) null, -1003);
                } catch (C36291nJ e7) {
                    r1 = C35981mo.A00(e7, (byte[]) null, -1002);
                } catch (C36351nP e8) {
                    r1 = C35981mo.A00(e8, (byte[]) null, -1010);
                } catch (C36171n7 e9) {
                    r1 = C35981mo.A00(e9, (byte[]) null, -1007);
                }
            } else {
                r12 = new C36321nM();
            }
            if (r02.A02.A01()) {
                synchronized (C36301nK.A04) {
                    bArr2 = A052.A02(r12, r5);
                }
            } else {
                bArr2 = A052.A02(r12, r5);
            }
            r1 = C35981mo.A00((Exception) null, bArr2, 0);
        }
        if (A022 != null) {
            A022.unlock();
        }
        return r1;
    }

    public C30891d8 A07(C30881d7 r15, C30981dH r16, byte[] bArr) {
        C30891d8 r0;
        byte[] bArr2;
        C30981dH r3 = r16;
        Lock A032 = this.A0I.A03(r3);
        if (A032 == null) {
            this.A0H.A00();
        } else {
            try {
                A032.lock();
            } catch (Throwable th) {
                if (A032 != null) {
                    A032.unlock();
                }
                throw th;
            }
        }
        C30881d7 r11 = r15;
        byte[] bArr3 = bArr;
        if (this.A0L.A0E(C16620tM.A02, 188)) {
            JniBridge jniBridge = this.A01.A03;
            String str = r3.A01;
            C28861Yb r02 = r3.A00;
            C36111n1 r03 = new C36111n1((NativeHolder) JniBridge.jvidispatchOIOOOOO(0, (long) r02.A00, str, C31811f4.A01(r02), r11, (NativeHolder) jniBridge.wajContext.get(), bArr3));
            JniBridge.getInstance();
            NativeHolder nativeHolder = r03.A00;
            JniBridge.getInstance();
            r0 = new C30891d8((byte[]) JniBridge.jvidispatchOIO(0, (long) 52, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 53, nativeHolder));
        } else {
            C35981mo r2 = this.A00;
            C36071mx r4 = new C36071mx(r2.A00.A02, C31811f4.A02(r3));
            try {
                C36121n2 r1 = new C36121n2(r15);
                if (r2.A02.A01()) {
                    synchronized (C36071mx.A02) {
                        bArr2 = r4.A00(r1, bArr3);
                    }
                } else {
                    bArr2 = r4.A00(r1, bArr3);
                }
                r0 = C35981mo.A00((Exception) null, bArr2, 0);
            } catch (C36171n7 e2) {
                r0 = C35981mo.A00(e2, (byte[]) null, -1007);
            } catch (C36161n6 e3) {
                r0 = C35981mo.A00(e3, (byte[]) null, -1005);
            } catch (C36151n5 e4) {
                r0 = C35981mo.A00(e4, (byte[]) null, -1001);
            } catch (C36141n4 e5) {
                r0 = C35981mo.A00(e5, (byte[]) null, -1008);
            }
        }
        if (A032 != null) {
            A032.unlock();
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0174, code lost:
        throw new X.C36161n6(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016e A[ExcHandler: 1nI | 1nJ (r1v5 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:12:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30891d8 A08(X.C30881d7 r15, X.C30981dH r16, byte[] r17) {
        /*
            r14 = this;
            X.0xT r0 = r14.A0I
            r5 = r16
            java.util.concurrent.locks.Lock r13 = r0.A03(r5)
            if (r13 != 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            r13.lock()     // Catch:{ all -> 0x019d }
            goto L_0x0014
        L_0x000f:
            X.16P r0 = r14.A0H     // Catch:{ all -> 0x019d }
            r0.A00()     // Catch:{ all -> 0x019d }
        L_0x0014:
            X.0pd r2 = r14.A0L     // Catch:{ all -> 0x019d }
            r1 = 188(0xbc, float:2.63E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x019d }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x019d }
            r3 = r17
            if (r0 == 0) goto L_0x006b
            X.1mp r0 = r14.A01     // Catch:{ all -> 0x019d }
            com.whatsapp.wamsys.JniBridge r4 = r0.A03     // Catch:{ all -> 0x019d }
            java.lang.String r2 = r5.A01     // Catch:{ all -> 0x019d }
            X.1Yb r0 = r5.A00     // Catch:{ all -> 0x019d }
            java.lang.String r8 = X.C31811f4.A01(r0)     // Catch:{ all -> 0x019d }
            int r0 = r0.A00     // Catch:{ all -> 0x019d }
            long r5 = (long) r0     // Catch:{ all -> 0x019d }
            java.util.concurrent.atomic.AtomicReference r0 = r4.wajContext     // Catch:{ all -> 0x019d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x019d }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ all -> 0x019d }
            r4 = 1
            r7 = r2
            r9 = r15
            r10 = r0
            r11 = r3
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOOO(r4, r5, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x019d }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x019d }
            X.1n1 r0 = new X.1n1     // Catch:{ all -> 0x019d }
            r0.<init>(r1)     // Catch:{ all -> 0x019d }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x019d }
            com.facebook.simplejni.NativeHolder r3 = r0.A00     // Catch:{ all -> 0x019d }
            r0 = 52
            long r1 = (long) r0     // Catch:{ all -> 0x019d }
            r0 = 0
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r0, r1, r3)     // Catch:{ all -> 0x019d }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x019d }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x019d }
            r0 = 53
            long r1 = (long) r0     // Catch:{ all -> 0x019d }
            r0 = 1
            long r2 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r0, r1, r3)     // Catch:{ all -> 0x019d }
            int r1 = (int) r2     // Catch:{ all -> 0x019d }
            X.1d8 r0 = new X.1d8     // Catch:{ all -> 0x019d }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x019d }
            goto L_0x0197
        L_0x006b:
            X.1mo r0 = r14.A00     // Catch:{ all -> 0x019d }
            X.1mn r0 = r0.A00     // Catch:{ all -> 0x019d }
            X.1n8 r11 = r0.A01     // Catch:{ all -> 0x019d }
            X.1mw r9 = X.C31811f4.A02(r5)     // Catch:{ all -> 0x019d }
            r2 = 0
            X.1n2 r10 = new X.1n2     // Catch:{ 1n7 -> 0x0190, 1n6 -> 0x0188, 1n5 -> 0x0180, 1n4 -> 0x0178 }
            r10.<init>(r15)     // Catch:{ 1n7 -> 0x0190, 1n6 -> 0x0188, 1n5 -> 0x0180, 1n4 -> 0x0178 }
            java.lang.Object r12 = X.C36191n9.A00     // Catch:{ 1n7 -> 0x0190, 1n6 -> 0x0188, 1n5 -> 0x0180, 1n4 -> 0x0178 }
            monitor-enter(r12)     // Catch:{ 1n7 -> 0x0190, 1n6 -> 0x0188, 1n5 -> 0x0180, 1n4 -> 0x0178 }
            X.1fB r8 = r11.A00(r9)     // Catch:{ 1nI | 1nJ -> 0x016e }
            java.util.LinkedList r1 = r8.A00     // Catch:{ 1nI | 1nJ -> 0x016e }
            boolean r0 = r1.isEmpty()     // Catch:{ 1nI | 1nJ -> 0x016e }
            if (r0 != 0) goto L_0x0157
            X.1nA r5 = new X.1nA     // Catch:{ 1nI | 1nJ -> 0x016e }
            r5.<init>(r3)     // Catch:{ 1nI | 1nJ -> 0x016e }
            int r4 = r5.A01     // Catch:{ 1nI | 1nJ -> 0x016e }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ 1nI | 1nJ -> 0x016e }
        L_0x0095:
            boolean r0 = r3.hasNext()     // Catch:{ 1nI | 1nJ -> 0x016e }
            if (r0 == 0) goto L_0x0143
            java.lang.Object r6 = r3.next()     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1nB r6 = (X.C36211nB) r6     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1nC r1 = r6.A00     // Catch:{ 1nI | 1nJ -> 0x016e }
            int r0 = r1.A01     // Catch:{ 1nI | 1nJ -> 0x016e }
            if (r0 != r4) goto L_0x0095
            X.1nD r0 = r1.A03     // Catch:{ 1nI | 1nJ -> 0x016e }
            if (r0 != 0) goto L_0x00ad
            X.1nD r0 = X.C36231nD.A03     // Catch:{ 1nI | 1nJ -> 0x016e }
        L_0x00ad:
            X.1Ww r0 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x016e }
            byte[] r0 = r0.A04()     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1nF r0 = X.C36241nE.A00(r0)     // Catch:{ 1nI | 1nJ -> 0x016e }
            r5.A00(r0)     // Catch:{ 1nI | 1nJ -> 0x016e }
            int r4 = r5.A00     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1nC r0 = r6.A00     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1XE r0 = r0.A02     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1nG r1 = new X.1nG     // Catch:{ 1nI | 1nJ -> 0x016e }
            r1.<init>((java.util.List) r0)     // Catch:{ 1nI | 1nJ -> 0x016e }
            int r3 = r1.A00     // Catch:{ 1nI | 1nJ -> 0x016e }
            if (r3 > r4) goto L_0x0127
            if (r3 >= r4) goto L_0x00d0
            int r4 = r4 - r3
            X.1nG r1 = r1.A02(r4)     // Catch:{ 1nI | 1nJ -> 0x016e }
        L_0x00d0:
            r0 = 1
            X.1nG r0 = r1.A02(r0)     // Catch:{ 1nI | 1nJ -> 0x016e }
            r6.A00(r0)     // Catch:{ 1nI | 1nJ -> 0x016e }
            byte[][] r4 = r1.A03()     // Catch:{ 1nI | 1nJ -> 0x016e }
            int r3 = r1.A00     // Catch:{ 1nI | 1nJ -> 0x016e }
            int r0 = r4.length     // Catch:{ 1nI | 1nJ -> 0x016e }
            r1 = 1
            int r0 = r0 - r1
            r0 = r4[r0]     // Catch:{ 1nI | 1nJ -> 0x016e }
            byte[] r0 = X.C36261nG.A01(r0, r1)     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1nH r1 = new X.1nH     // Catch:{ 1nI | 1nJ -> 0x016e }
            r1.<init>(r3, r0)     // Catch:{ 1nI | 1nJ -> 0x016e }
            byte[] r0 = r1.A02     // Catch:{ 1nI | 1nJ -> 0x016e }
            byte[] r7 = r1.A01     // Catch:{ 1nI | 1nJ -> 0x016e }
            byte[] r6 = r5.A02     // Catch:{ 1nI | 1nJ -> 0x016e }
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0120, BadPaddingException | IllegalBlockSizeException -> 0x0119, 1nI | 1nJ -> 0x016e }
            r5.<init>(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0120, BadPaddingException | IllegalBlockSizeException -> 0x0119, 1nI | 1nJ -> 0x016e }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0120, BadPaddingException | IllegalBlockSizeException -> 0x0119, 1nI | 1nJ -> 0x016e }
            r3 = 2
            java.lang.String r1 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0120, BadPaddingException | IllegalBlockSizeException -> 0x0119, 1nI | 1nJ -> 0x016e }
            r0.<init>(r7, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0120, BadPaddingException | IllegalBlockSizeException -> 0x0119, 1nI | 1nJ -> 0x016e }
            r4.init(r3, r0, r5)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0120, BadPaddingException | IllegalBlockSizeException -> 0x0119, 1nI | 1nJ -> 0x016e }
            byte[] r1 = r4.doFinal(r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0120, BadPaddingException | IllegalBlockSizeException -> 0x0119, 1nI | 1nJ -> 0x016e }
            r10.AHO(r1)     // Catch:{ 1nI | 1nJ -> 0x016e }
            r11.A01(r9, r8)     // Catch:{ 1nI | 1nJ -> 0x016e }
            monitor-exit(r12)     // Catch:{ all -> 0x0175 }
            r0 = 0
            X.1d8 r0 = X.C35981mo.A00(r2, r1, r0)     // Catch:{ 1n7 -> 0x0190, 1n6 -> 0x0188, 1n5 -> 0x0180, 1n4 -> 0x0178 }
            goto L_0x0197
        L_0x0119:
            r1 = move-exception
            X.1n6 r0 = new X.1n6     // Catch:{ 1nI | 1nJ -> 0x016e }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ 1nI | 1nJ -> 0x016e }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x016e }
        L_0x0120:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ 1nI | 1nJ -> 0x016e }
            r0.<init>(r1)     // Catch:{ 1nI | 1nJ -> 0x016e }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x016e }
        L_0x0127:
            java.lang.String r0 = "Received message with old counter: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1nI | 1nJ -> 0x016e }
            r1.<init>(r0)     // Catch:{ 1nI | 1nJ -> 0x016e }
            r1.append(r3)     // Catch:{ 1nI | 1nJ -> 0x016e }
            java.lang.String r0 = " , "
            r1.append(r0)     // Catch:{ 1nI | 1nJ -> 0x016e }
            r1.append(r4)     // Catch:{ 1nI | 1nJ -> 0x016e }
            java.lang.String r1 = r1.toString()     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1n5 r0 = new X.1n5     // Catch:{ 1nI | 1nJ -> 0x016e }
            r0.<init>(r1)     // Catch:{ 1nI | 1nJ -> 0x016e }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x016e }
        L_0x0143:
            java.lang.String r1 = "No keys for: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 1nI | 1nJ -> 0x016e }
            r0.<init>(r1)     // Catch:{ 1nI | 1nJ -> 0x016e }
            r0.append(r4)     // Catch:{ 1nI | 1nJ -> 0x016e }
            java.lang.String r1 = r0.toString()     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1nI r0 = new X.1nI     // Catch:{ 1nI | 1nJ -> 0x016e }
            r0.<init>((java.lang.String) r1)     // Catch:{ 1nI | 1nJ -> 0x016e }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x016e }
        L_0x0157:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1nI | 1nJ -> 0x016e }
            r1.<init>()     // Catch:{ 1nI | 1nJ -> 0x016e }
            java.lang.String r0 = "No sender key for: "
            r1.append(r0)     // Catch:{ 1nI | 1nJ -> 0x016e }
            r1.append(r9)     // Catch:{ 1nI | 1nJ -> 0x016e }
            java.lang.String r1 = r1.toString()     // Catch:{ 1nI | 1nJ -> 0x016e }
            X.1n4 r0 = new X.1n4     // Catch:{ 1nI | 1nJ -> 0x016e }
            r0.<init>((java.lang.String) r1)     // Catch:{ 1nI | 1nJ -> 0x016e }
            throw r0     // Catch:{ 1nI | 1nJ -> 0x016e }
        L_0x016e:
            r1 = move-exception
            X.1n6 r0 = new X.1n6     // Catch:{ all -> 0x0175 }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ 1n7 -> 0x0190, 1n6 -> 0x0188, 1n5 -> 0x0180, 1n4 -> 0x0178 }
        L_0x0178:
            r1 = move-exception
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            X.1d8 r0 = X.C35981mo.A00(r1, r2, r0)     // Catch:{ all -> 0x019d }
            goto L_0x0197
        L_0x0180:
            r1 = move-exception
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            X.1d8 r0 = X.C35981mo.A00(r1, r2, r0)     // Catch:{ all -> 0x019d }
            goto L_0x0197
        L_0x0188:
            r1 = move-exception
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            X.1d8 r0 = X.C35981mo.A00(r1, r2, r0)     // Catch:{ all -> 0x019d }
            goto L_0x0197
        L_0x0190:
            r1 = move-exception
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            X.1d8 r0 = X.C35981mo.A00(r1, r2, r0)     // Catch:{ all -> 0x019d }
        L_0x0197:
            if (r13 == 0) goto L_0x019c
            r13.unlock()
        L_0x019c:
            return r0
        L_0x019d:
            r0 = move-exception
            if (r13 == 0) goto L_0x01a3
            r13.unlock()
        L_0x01a3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A08(X.1d7, X.1dH, byte[]):X.1d8");
    }

    public C36381nS A09(C28861Yb r15, byte[] bArr) {
        C36381nS r2;
        C36091mz r22;
        int i2;
        Lock A022 = this.A0I.A02(r15);
        if (A022 == null) {
            this.A0H.A00();
        } else {
            try {
                A022.lock();
            } catch (Throwable th) {
                if (A022 != null) {
                    A022.unlock();
                }
                throw th;
            }
        }
        byte[] bArr2 = bArr;
        if (this.A0L.A0E(C16620tM.A02, 187)) {
            JniBridge jniBridge = this.A01.A03;
            C36371nR r0 = new C36371nR((NativeHolder) JniBridge.jvidispatchOIOOO(0, (long) r15.A00, C31811f4.A01(r15), (NativeHolder) jniBridge.wajContext.get(), bArr2));
            JniBridge.getInstance();
            NativeHolder nativeHolder = r0.A00;
            JniBridge.getInstance();
            JniBridge.getInstance();
            r2 = new C36381nS((byte[]) JniBridge.jvidispatchOIO(0, (long) 49, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 50, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 51, nativeHolder));
        } else {
            C35981mo r6 = this.A00;
            C36301nK A052 = r6.A05(r15);
            byte[] A032 = C35981mo.A03(bArr2);
            try {
                if (r6.A02.A01()) {
                    synchronized (C36301nK.A04) {
                        r22 = A052.A01(A032);
                    }
                } else {
                    r22 = A052.A01(A032);
                }
                int type = r22.getType();
                if (type == 2) {
                    i2 = 1;
                } else if (type != 3) {
                    throw new IllegalStateException("SignalMessageType is neither message nor pre_key_message");
                } else {
                    i2 = 2;
                }
                r2 = new C36381nS(r22.AdU(), i2, 0);
            } catch (IllegalArgumentException e2) {
                StringBuilder sb = new StringBuilder("SignalCoordinatorDefault/encryptForIndividual/error encrypting for ");
                sb.append(r15);
                Log.e(sb.toString(), e2);
                if (!r6.A00.A07.A0d(C31811f4.A00(new C36421nW(C31811f4.A01(r15), r15.A00)))) {
                    r2 = new C36381nS((byte[]) null, 0, -1008);
                } else {
                    throw e2;
                }
            }
        }
        if (A022 != null) {
            A022.unlock();
        }
        return r2;
    }

    public C36381nS A0A(C30981dH r17, byte[] bArr) {
        C36381nS r2;
        byte[] bArr2;
        C30981dH r3 = r17;
        Lock A032 = this.A0I.A03(r3);
        if (A032 == null) {
            this.A0H.A00();
        } else {
            try {
                A032.lock();
            } catch (Throwable th) {
                if (A032 != null) {
                    A032.unlock();
                }
                throw th;
            }
        }
        byte[] bArr3 = bArr;
        if (this.A0L.A0E(C16620tM.A02, 189)) {
            JniBridge jniBridge = this.A01.A03;
            String str = r3.A01;
            C28861Yb r0 = r3.A00;
            C36371nR r02 = new C36371nR((NativeHolder) JniBridge.jvidispatchOIOOOO(1, (long) r0.A00, str, C31811f4.A01(r0), (NativeHolder) jniBridge.wajContext.get(), bArr3));
            JniBridge.getInstance();
            NativeHolder nativeHolder = r02.A00;
            JniBridge.getInstance();
            JniBridge.getInstance();
            r2 = new C36381nS((byte[]) JniBridge.jvidispatchOIO(0, (long) 49, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 50, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 51, nativeHolder));
        } else {
            C36181n8 r8 = this.A00.A00.A01;
            new C36391nT(r8).A00(C31811f4.A02(r3));
            C36061mw A022 = C31811f4.A02(r3);
            byte[] A033 = C35981mo.A03(bArr3);
            try {
                synchronized (C36191n9.A00) {
                    try {
                        C31881fB A002 = r8.A00(A022);
                        C36211nB A003 = A002.A00();
                        C36261nG r03 = new C36261nG((List) A003.A00.A02);
                        byte[][] A034 = r03.A03();
                        C36271nH r12 = new C36271nH(r03.A00, C36261nG.A01(A034[A034.length - 1], (byte) 1));
                        byte[] bArr4 = r12.A02;
                        byte[] bArr5 = r12.A01;
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
                        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        instance.init(1, new SecretKeySpec(bArr5, "AES"), ivParameterSpec);
                        byte[] doFinal = instance.doFinal(A033);
                        C36221nC r04 = A003.A00;
                        int i2 = r04.A01;
                        int i3 = r12.A00;
                        C36231nD r05 = r04.A03;
                        if (r05 == null) {
                            r05 = C36231nD.A03;
                        }
                        C36201nA r22 = new C36201nA(new C36411nV(r05.A01.A04()), doFinal, i2, i3);
                        A003.A00(new C36261nG((List) A003.A00.A02).A02(1));
                        r8.A01(A022, A002);
                        bArr2 = r22.A03;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                        throw new AssertionError(e2);
                    } catch (C36281nI e3) {
                        throw new C36141n4((Exception) e3);
                    }
                }
                r2 = new C36381nS(bArr2, 4, 0);
            } catch (C36141n4 unused) {
                r2 = new C36381nS((byte[]) null, 0, -1008);
            }
        }
        if (A032 != null) {
            A032.unlock();
        }
        return r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1WL A0B(X.C28861Yb r7) {
        /*
            r6 = this;
            X.1Yb r5 = r6.A0F(r7)
            X.0xT r0 = r6.A0I
            java.util.concurrent.locks.Lock r4 = r0.A02(r5)
            if (r4 == 0) goto L_0x000f
            r4.lock()     // Catch:{ all -> 0x0045 }
        L_0x000f:
            X.1d4 r3 = r6.A07     // Catch:{ all -> 0x0045 }
            byte[] r0 = r3.A04(r5)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x003e
            X.1cD r1 = X.C28851Ya.A01(r0)     // Catch:{ 1ey -> 0x0021 }
            X.1WL r0 = new X.1WL     // Catch:{ 1ey -> 0x0021 }
            r0.<init>(r1)     // Catch:{ 1ey -> 0x0021 }
            goto L_0x003f
        L_0x0021:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r1.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "axolotl identity key for "
            r1.append(r0)     // Catch:{ all -> 0x0045 }
            r1.append(r5)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = " decoded as invalid"
            r1.append(r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0045 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0045 }
            r3.A03(r5)     // Catch:{ all -> 0x0045 }
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r4 == 0) goto L_0x0044
            r4.unlock()
        L_0x0044:
            return r0
        L_0x0045:
            r0 = move-exception
            if (r4 == 0) goto L_0x004b
            r4.unlock()
        L_0x004b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0B(X.1Yb):X.1WL");
    }

    public C36101n0 A0C(C30981dH r5) {
        C36081my r0;
        Lock A032 = this.A0I.A03(r5);
        if (A032 == null) {
            try {
                this.A0H.A00();
            } catch (Throwable th) {
                if (A032 != null) {
                    A032.unlock();
                }
                throw th;
            }
        } else {
            A032.lock();
        }
        C35981mo r2 = this.A00;
        boolean A012 = r2.A02.A01();
        C36051mv r22 = new C36051mv(r2.A00.A02);
        C36061mw A022 = C31811f4.A02(r5);
        if (A012) {
            synchronized (C36071mx.A02) {
                r0 = r22.A00(A022);
            }
        } else {
            r0 = r22.A00(A022);
        }
        C36101n0 r02 = new C36101n0(r0.A04, 0);
        if (A032 != null) {
            A032.unlock();
        }
        return r02;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return A0E(r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C31721ev A0D(X.C28861Yb r4) {
        /*
            r3 = this;
            X.19U r2 = r3.A0F
            monitor-enter(r2)
            X.1ev r0 = r2.A00(r4)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0019
            X.1ex r0 = r3.A0B     // Catch:{ all -> 0x002e }
            byte[] r1 = r0.A03(r4)     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x001b
            X.1ev r0 = new X.1ev     // Catch:{ all -> 0x002e }
            r0.<init>()     // Catch:{ all -> 0x002e }
            r2.A03(r0, r4)     // Catch:{ all -> 0x002e }
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            goto L_0x0027
        L_0x001b:
            X.1ev r0 = new X.1ev     // Catch:{ IOException -> 0x0028 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0028 }
            A02(r0)     // Catch:{ IOException -> 0x0028 }
            r2.A03(r0, r4)     // Catch:{ IOException -> 0x0028 }
            goto L_0x0019
        L_0x0027:
            return r0
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            X.1ev r0 = r3.A0E(r4)
            return r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0D(X.1Yb):X.1ev");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C31721ev A0E(X.C28861Yb r5) {
        /*
            r4 = this;
            X.01d r0 = r4.A0K
            X.0tf r3 = r0.A02()
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x002d }
            X.19U r1 = r4.A0F     // Catch:{ all -> 0x0028 }
            monitor-enter(r1)     // Catch:{ all -> 0x0028 }
            X.1ex r0 = r4.A0B     // Catch:{ all -> 0x0025 }
            r0.A01(r5)     // Catch:{ all -> 0x0025 }
            X.1ev r0 = new X.1ev     // Catch:{ all -> 0x0025 }
            r0.<init>()     // Catch:{ all -> 0x0025 }
            r1.A03(r0, r5)     // Catch:{ all -> 0x0025 }
            r2.A00()     // Catch:{ all -> 0x0025 }
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x002d }
            r3.close()
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0E(X.1Yb):X.1ev");
    }

    public final C28861Yb A0F(C28861Yb r5) {
        C16040sK r1 = this.A03;
        AnonymousClass1ZX A032 = r1.A03();
        r1.A0B();
        AnonymousClass1ZT r2 = r1.A05;
        return (A032 == null || r2 == null || !r5.A02.equals(A032.user)) ? r5 : new C28861Yb(0, r2.user, r5.A00);
    }

    public C31791f2 A0G() {
        AnonymousClass16P r2 = this.A0H;
        if (r2.A01() || this.A0I.A06) {
            return A0H();
        }
        try {
            return (C31791f2) r2.A00.submit(new IDxCallableShape148S0100000_2_I0(this, 11)).get();
        } catch (InterruptedException | ExecutionException e2) {
            Log.w("SignedPreKeyStore/getLatestSignedPrekeyRecord", e2);
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00dc */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0096=Splitter:B:23:0x0096, B:44:0x00d7=Splitter:B:44:0x00d7} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0099=Splitter:B:25:0x0099, B:49:0x00dc=Splitter:B:49:0x00dc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C31791f2 A0H() {
        /*
            r27 = this;
            r1 = r27
            X.0xT r0 = r1.A0I
            java.util.concurrent.locks.Lock r10 = r0.A01()
            if (r10 == 0) goto L_0x000d
            r10.lock()     // Catch:{ all -> 0x00dd }
        L_0x000d:
            X.1eu r0 = r1.A0C     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = "record"
            java.lang.String r6 = "prekey_id"
            X.01d r0 = r0.A01     // Catch:{ all -> 0x00dd }
            X.0tf r2 = r0.get()     // Catch:{ all -> 0x00dd }
            X.0tg r11 = r2.A02     // Catch:{ all -> 0x00d8 }
            java.lang.String r12 = "signed_prekeys"
            r7 = 2
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ all -> 0x00d8 }
            r9 = 0
            r13[r9] = r6     // Catch:{ all -> 0x00d8 }
            r8 = 1
            r13[r8] = r5     // Catch:{ all -> 0x00d8 }
            r14 = 0
            java.lang.String r17 = "prekey_id DESC"
            java.lang.String r18 = "1"
            r16 = r14
            r15 = r14
            android.database.Cursor r1 = r11.A09(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00d8 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "no signed prekey record found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d1 }
            r1.close()     // Catch:{ all -> 0x00d8 }
            goto L_0x00c6
        L_0x0043:
            int r0 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x00d1 }
            int r4 = r1.getInt(r0)     // Catch:{ all -> 0x00d1 }
            int r0 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x00d1 }
            byte[] r3 = r1.getBlob(r0)     // Catch:{ all -> 0x00d1 }
            r1.close()     // Catch:{ all -> 0x00d8 }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 != r0) goto L_0x0099
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x00d8 }
            r7[r9] = r6     // Catch:{ all -> 0x00d8 }
            r7[r8] = r5     // Catch:{ all -> 0x00d8 }
            java.lang.String r22 = "prekey_id < ?"
            java.lang.String[] r1 = new java.lang.String[r8]     // Catch:{ all -> 0x00d8 }
            r0 = 8388607(0x7fffff, float:1.1754942E-38)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r1[r9] = r0     // Catch:{ all -> 0x00d8 }
            r19 = r11
            r20 = r12
            r21 = r7
            r23 = r1
            r24 = r14
            r25 = r17
            r26 = r18
            android.database.Cursor r1 = r19.A09(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x00d8 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x0096
            int r0 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x00d1 }
            int r4 = r1.getInt(r0)     // Catch:{ all -> 0x00d1 }
            int r0 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x00d1 }
            byte[] r3 = r1.getBlob(r0)     // Catch:{ all -> 0x00d1 }
        L_0x0096:
            r1.close()     // Catch:{ all -> 0x00d8 }
        L_0x0099:
            r2.close()     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "axolotl retrieved latest signed prekey record successfully; id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
            r0.<init>(r1)     // Catch:{ all -> 0x00dd }
            r0.append(r4)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00dd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00dd }
            if (r3 == 0) goto L_0x00c9
            X.1f2 r0 = new X.1f2     // Catch:{ IOException -> 0x00ba }
            r0.<init>(r3)     // Catch:{ IOException -> 0x00ba }
            if (r10 == 0) goto L_0x00b9
            r10.unlock()
        L_0x00b9:
            return r0
        L_0x00ba:
            r1 = move-exception
            java.lang.String r0 = "failed to parse the latest signed prekey record"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00dd }
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00dd }
            r0.<init>(r1)     // Catch:{ all -> 0x00dd }
            goto L_0x00d0
        L_0x00c6:
            r2.close()     // Catch:{ all -> 0x00dd }
        L_0x00c9:
            java.lang.String r1 = "no signed prekey record found"
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00dd }
            r0.<init>(r1)     // Catch:{ all -> 0x00dd }
        L_0x00d0:
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00d1:
            r0 = move-exception
            if (r1 == 0) goto L_0x00d7
            r1.close()     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            if (r10 == 0) goto L_0x00e3
            r10.unlock()
        L_0x00e3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0H():X.1f2");
    }

    public C30971dG A0I() {
        if (!this.A0I.A06) {
            this.A0H.A00();
        }
        C31791f2 A0G2 = A0G();
        Log.i("axolotl loaded the latest signed pre key for sending");
        return A00(A0G2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00f0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00f5 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x00f5=Splitter:B:58:0x00f5, B:34:0x00bc=Splitter:B:34:0x00bc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30971dG A0J() {
        /*
            r19 = this;
            r1 = r19
            X.0xT r0 = r1.A0I
            java.util.concurrent.locks.Lock r10 = r0.A01()
            if (r10 != 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            r10.lock()     // Catch:{ all -> 0x00f6 }
            goto L_0x0014
        L_0x000f:
            X.16P r0 = r1.A0H     // Catch:{ all -> 0x00f6 }
            r0.A00()     // Catch:{ all -> 0x00f6 }
        L_0x0014:
            X.1mo r1 = r1.A00     // Catch:{ all -> 0x00f6 }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x00f6 }
            if (r0 != 0) goto L_0x001f
            r1.A06()     // Catch:{ all -> 0x00f6 }
        L_0x001f:
            X.1mn r0 = r1.A00     // Catch:{ all -> 0x00f6 }
            X.1es r3 = r0.A04     // Catch:{ all -> 0x00f6 }
            java.lang.String r4 = "record"
            java.lang.String r1 = "prekey_id"
            X.01d r2 = r3.A02     // Catch:{ all -> 0x00f6 }
            X.0tf r5 = r2.get()     // Catch:{ all -> 0x00f6 }
            X.0tg r11 = r5.A02     // Catch:{ all -> 0x00f1 }
            java.lang.String r12 = "prekeys"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x00f1 }
            r0 = 0
            r13[r0] = r1     // Catch:{ all -> 0x00f1 }
            r0 = 1
            r13[r0] = r4     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "sent_to_server = 0 AND direct_distribution = 0"
            r15 = 0
            java.lang.String r18 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f1 }
            r17 = r15
            r16 = r15
            android.database.Cursor r6 = r11.A09(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00f1 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x006c
            int r0 = r6.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00ea }
            int r1 = r6.getInt(r0)     // Catch:{ all -> 0x00ea }
            int r0 = r6.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ea }
            byte[] r0 = r6.getBlob(r0)     // Catch:{ all -> 0x00ea }
            X.1ew r4 = new X.1ew     // Catch:{ all -> 0x00ea }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x00ea }
            r6.close()     // Catch:{ all -> 0x00f1 }
            r5.close()     // Catch:{ all -> 0x00f6 }
            goto L_0x0073
        L_0x006c:
            r6.close()     // Catch:{ all -> 0x00f1 }
            r5.close()     // Catch:{ all -> 0x00f6 }
            r4 = r15
        L_0x0073:
            r9 = 0
            if (r4 == 0) goto L_0x00e4
            int r8 = r4.A00     // Catch:{ IOException -> 0x00cc }
            byte[] r1 = r4.A01     // Catch:{ IOException -> 0x00cc }
            X.1nY r0 = new X.1nY     // Catch:{ IOException -> 0x00cc }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00cc }
            X.1dG r15 = X.C35971mn.A00(r0, r8)     // Catch:{ IOException -> 0x00cc }
            X.0tf r6 = r2.A02()     // Catch:{ all -> 0x00f6 }
            r0 = 2
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00c7 }
            r7.<init>(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "direct_distribution"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00c7 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "upload_timestamp"
            X.0t3 r0 = r3.A01     // Catch:{ all -> 0x00c7 }
            long r2 = r0.A00()     // Catch:{ all -> 0x00c7 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00c7 }
            r7.put(r4, r0)     // Catch:{ all -> 0x00c7 }
            X.0tg r5 = r6.A02     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "prekey_id=?"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00c7 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00c7 }
            int r0 = r5.A00(r12, r7, r4, r2)     // Catch:{ all -> 0x00c7 }
            if (r0 == r3) goto L_0x00bc
            r3 = 0
        L_0x00bc:
            r6.close()     // Catch:{ all -> 0x00f6 }
            if (r3 != 0) goto L_0x00e3
            java.lang.String r0 = "Failed to mark key as direct distribution, not sending pre-key with retry receipt"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00f6 }
            goto L_0x00e4
        L_0x00c7:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x00f5
        L_0x00cc:
            r2 = move-exception
            java.lang.String r1 = "error reading prekey "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f6 }
            int r1 = r4.A00     // Catch:{ all -> 0x00f6 }
            r0.append(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f6 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00f6 }
            r3.A02(r1)     // Catch:{ all -> 0x00f6 }
        L_0x00e3:
            r9 = r15
        L_0x00e4:
            if (r10 == 0) goto L_0x00e9
            r10.unlock()
        L_0x00e9:
            return r9
        L_0x00ea:
            r0 = move-exception
            if (r6 == 0) goto L_0x00f0
            r6.close()     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            if (r10 == 0) goto L_0x00fc
            r10.unlock()
        L_0x00fc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0J():X.1dG");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0102 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0107 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0102=Splitter:B:34:0x0102, B:20:0x008b=Splitter:B:20:0x008b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30971dG A0K() {
        /*
            r27 = this;
            r1 = r27
            X.0xT r0 = r1.A0I
            java.util.concurrent.locks.Lock r10 = r0.A01()
            if (r10 != 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            r10.lock()     // Catch:{ all -> 0x0108 }
            goto L_0x0014
        L_0x000f:
            X.16P r0 = r1.A0H     // Catch:{ all -> 0x0108 }
            r0.A00()     // Catch:{ all -> 0x0108 }
        L_0x0014:
            X.1mo r4 = r1.A00     // Catch:{ all -> 0x0108 }
            X.1nX r1 = r4.A04()     // Catch:{ all -> 0x0108 }
            X.1mn r0 = r4.A00     // Catch:{ all -> 0x0108 }
            X.1nZ r0 = r0.A06     // Catch:{ all -> 0x0108 }
            X.1eu r2 = r0.A00     // Catch:{ all -> 0x0108 }
            java.lang.String r6 = "prekey_id"
            X.01d r0 = r2.A01     // Catch:{ all -> 0x0108 }
            X.0tf r3 = r0.get()     // Catch:{ all -> 0x0108 }
            X.0tg r11 = r3.A02     // Catch:{ all -> 0x0103 }
            java.lang.String r12 = "signed_prekeys"
            r8 = 1
            java.lang.String[] r13 = new java.lang.String[r8]     // Catch:{ all -> 0x0103 }
            r9 = 0
            r13[r9] = r6     // Catch:{ all -> 0x0103 }
            r14 = 0
            java.lang.String r17 = "prekey_id DESC"
            java.lang.String r18 = "1"
            r16 = r14
            r15 = r14
            android.database.Cursor r5 = r11.A09(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0103 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x008f
            int r0 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x00fc }
            int r7 = r5.getInt(r0)     // Catch:{ all -> 0x00fc }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 == r0) goto L_0x0055
            int r14 = r7 + 1
            goto L_0x008b
        L_0x0055:
            r5.close()     // Catch:{ all -> 0x0103 }
            java.lang.String[] r7 = new java.lang.String[r8]     // Catch:{ all -> 0x0103 }
            r7[r9] = r6     // Catch:{ all -> 0x0103 }
            java.lang.String r22 = "prekey_id < ?"
            java.lang.String[] r5 = new java.lang.String[r8]     // Catch:{ all -> 0x0103 }
            r0 = 8388607(0x7fffff, float:1.1754942E-38)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0103 }
            r5[r9] = r0     // Catch:{ all -> 0x0103 }
            r19 = r11
            r20 = r12
            r21 = r7
            r23 = r5
            r24 = r14
            r25 = r17
            r26 = r18
            android.database.Cursor r5 = r19.A09(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0103 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x008f
            int r0 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x00fc }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x00fc }
            int r14 = r0 + 1
        L_0x008b:
            r5.close()     // Catch:{ all -> 0x0103 }
            goto L_0x0097
        L_0x008f:
            r5.close()     // Catch:{ all -> 0x0103 }
            r3.close()     // Catch:{ all -> 0x0108 }
            r14 = 0
            goto L_0x009a
        L_0x0097:
            r3.close()     // Catch:{ all -> 0x0108 }
        L_0x009a:
            X.0t3 r0 = r4.A01     // Catch:{ all -> 0x0108 }
            long r15 = r0.A00()     // Catch:{ all -> 0x0108 }
            X.1mr r12 = X.C28851Ya.A00()     // Catch:{ all -> 0x0108 }
            X.1nv r1 = r1.A00     // Catch:{ all -> 0x0108 }
            X.1cD r0 = r12.A01     // Catch:{ all -> 0x0108 }
            byte[] r0 = r0.A00()     // Catch:{ all -> 0x0108 }
            byte[] r13 = X.C28851Ya.A06(r1, r0)     // Catch:{ all -> 0x0108 }
            X.1f2 r11 = new X.1f2     // Catch:{ all -> 0x0108 }
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x0108 }
            X.1f3 r5 = r11.A00     // Catch:{ all -> 0x0108 }
            int r4 = r5.A01     // Catch:{ all -> 0x0108 }
            X.1mr r0 = r11.A00()     // Catch:{ all -> 0x0108 }
            X.1cD r0 = r0.A01     // Catch:{ all -> 0x0108 }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0108 }
            X.1nF r3 = new X.1nF     // Catch:{ all -> 0x0108 }
            r3.<init>(r0)     // Catch:{ all -> 0x0108 }
            X.1mr r0 = r11.A00()     // Catch:{ all -> 0x0108 }
            X.1nv r0 = r0.A00     // Catch:{ all -> 0x0108 }
            byte[] r1 = r0.A01     // Catch:{ all -> 0x0108 }
            X.1nV r0 = new X.1nV     // Catch:{ all -> 0x0108 }
            r0.<init>(r1)     // Catch:{ all -> 0x0108 }
            X.1nd r13 = new X.1nd     // Catch:{ all -> 0x0108 }
            r13.<init>(r0, r3)     // Catch:{ all -> 0x0108 }
            int r15 = r5.A01     // Catch:{ all -> 0x0108 }
            long r0 = r5.A02     // Catch:{ all -> 0x0108 }
            X.1Ww r3 = r5.A05     // Catch:{ all -> 0x0108 }
            byte[] r14 = r3.A04()     // Catch:{ all -> 0x0108 }
            X.1nw r12 = new X.1nw     // Catch:{ all -> 0x0108 }
            r16 = r0
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x0108 }
            X.1f3 r0 = r12.A00     // Catch:{ all -> 0x0108 }
            byte[] r0 = r0.A02()     // Catch:{ all -> 0x0108 }
            r2.A00(r4, r0)     // Catch:{ all -> 0x0108 }
            X.1dG r0 = A00(r11)     // Catch:{ all -> 0x0108 }
            if (r10 == 0) goto L_0x00fb
            r10.unlock()
        L_0x00fb:
            return r0
        L_0x00fc:
            r0 = move-exception
            if (r5 == 0) goto L_0x0102
            r5.close()     // Catch:{ all -> 0x0102 }
        L_0x0102:
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0107 }
        L_0x0107:
            throw r0     // Catch:{ all -> 0x0108 }
        L_0x0108:
            r0 = move-exception
            if (r10 == 0) goto L_0x010e
            r10.unlock()
        L_0x010e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0K():X.1dG");
    }

    public final Map A0L(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            C28861Yb r1 = (C28861Yb) entry.getKey();
            hashMap.put(r1, A09(r1, (byte[]) entry.getValue()));
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x010b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01bf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x01c4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A0M(java.util.Set r20) {
        /*
            r19 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r2 = r20.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            r3 = r19
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = r2.next()
            X.1Yb r1 = (X.C28861Yb) r1
            X.1Yb r0 = r3.A0F(r1)
            r4.put(r0, r1)
            goto L_0x0009
        L_0x001f:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            X.0xT r2 = r3.A0I
            java.util.Set r1 = r4.keySet()
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0055
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0055
            int r0 = r1.size()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()
            X.1Yb r0 = (X.C28861Yb) r0
            java.util.concurrent.locks.Lock r0 = r2.A02(r0)
            r5.add(r0)
            goto L_0x0041
        L_0x0055:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
        L_0x005a:
            r2.A06(r5)     // Catch:{ all -> 0x01c9 }
            X.1d4 r0 = r3.A07     // Catch:{ all -> 0x01c9 }
            r18 = r0
            java.util.Set r17 = r4.keySet()     // Catch:{ all -> 0x01c9 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x01c9 }
            r7.<init>()     // Catch:{ all -> 0x01c9 }
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x01c9 }
            if (r0 != 0) goto L_0x012f
            r0 = 0
            X.1Yb[] r1 = new X.C28861Yb[r0]     // Catch:{ all -> 0x01c9 }
            r0 = r17
            java.lang.Object[] r1 = r0.toArray(r1)     // Catch:{ all -> 0x01c9 }
            r16 = 0
            r0 = r18
            X.01d r0 = r0.A03     // Catch:{ all -> 0x01c9 }
            X.0tf r12 = r0.get()     // Catch:{ all -> 0x01c9 }
            r0 = 100
            X.1jh r14 = new X.1jh     // Catch:{ all -> 0x0129 }
            r14.<init>(r1, r0)     // Catch:{ all -> 0x0129 }
        L_0x008a:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x010c
            java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x0129 }
            X.1Yb[] r9 = (X.C28861Yb[]) r9     // Catch:{ all -> 0x0129 }
            X.0tg r8 = r12.A02     // Catch:{ all -> 0x0129 }
            int r3 = r9.length     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "SELECT public_key, timestamp, recipient_id, recipient_type, device_id FROM identities INNER JOIN (SELECT ? AS r, ? AS t, ? AS d"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r2.<init>(r0)     // Catch:{ all -> 0x0129 }
            r1 = 1
        L_0x00a1:
            if (r1 >= r3) goto L_0x00ab
            java.lang.String r0 = " UNION ALL SELECT ? AS r, ? AS t, ? AS d"
            r2.append(r0)     // Catch:{ all -> 0x0129 }
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00ab:
            java.lang.String r0 = ") AS joined ON joined.r = identities.recipient_id AND joined.t = identities.recipient_type AND joined.d = identities.device_id"
            r2.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0129 }
            java.util.List r0 = java.util.Arrays.asList(r9)     // Catch:{ all -> 0x0129 }
            java.lang.String[] r0 = X.AnonymousClass03N.A00(r0)     // Catch:{ all -> 0x0129 }
            android.database.Cursor r13 = r8.A08(r1, r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "public_key"
            int r11 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "timestamp"
            int r10 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "recipient_id"
            int r9 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "recipient_type"
            int r8 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "device_id"
            int r3 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0105 }
        L_0x00df:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0101
            java.lang.String r15 = r13.getString(r9)     // Catch:{ all -> 0x0105 }
            int r2 = r13.getInt(r8)     // Catch:{ all -> 0x0105 }
            int r0 = r13.getInt(r3)     // Catch:{ all -> 0x0105 }
            X.1Yb r1 = new X.1Yb     // Catch:{ all -> 0x0105 }
            r1.<init>(r2, r15, r0)     // Catch:{ all -> 0x0105 }
            byte[] r0 = r13.getBlob(r11)     // Catch:{ all -> 0x0105 }
            r13.getLong(r10)     // Catch:{ all -> 0x0105 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0105 }
            goto L_0x00df
        L_0x0101:
            r13.close()     // Catch:{ all -> 0x0129 }
            goto L_0x008a
        L_0x0105:
            r0 = move-exception
            if (r13 == 0) goto L_0x010b
            r13.close()     // Catch:{ all -> 0x010b }
        L_0x010b:
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x010c:
            r12.close()     // Catch:{ all -> 0x01c9 }
            java.util.Iterator r2 = r17.iterator()     // Catch:{ all -> 0x01c9 }
        L_0x0113:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x012f
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01c9 }
            boolean r0 = r7.containsKey(r1)     // Catch:{ all -> 0x01c9 }
            if (r0 != 0) goto L_0x0113
            r0 = r16
            r7.put(r1, r0)     // Catch:{ all -> 0x01c9 }
            goto L_0x0113
        L_0x0129:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x01c4 }
            goto L_0x01c4
        L_0x012f:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x01c9 }
            r8.<init>()     // Catch:{ all -> 0x01c9 }
            java.util.Set r0 = r7.entrySet()     // Catch:{ all -> 0x01c9 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x01c9 }
        L_0x013c:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x0189
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x01c9 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x01c9 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x01c9 }
            java.lang.Object r7 = r4.get(r0)     // Catch:{ all -> 0x01c9 }
            X.1Yb r7 = (X.C28861Yb) r7     // Catch:{ all -> 0x01c9 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x01c9 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x01c9 }
            r3 = 0
            if (r0 == 0) goto L_0x0185
            X.1cD r1 = X.C28851Ya.A01(r0)     // Catch:{ 1ey -> 0x0168 }
            X.1WL r0 = new X.1WL     // Catch:{ 1ey -> 0x0168 }
            r0.<init>(r1)     // Catch:{ 1ey -> 0x0168 }
            r6.put(r7, r0)     // Catch:{ 1ey -> 0x0168 }
            goto L_0x013c
        L_0x0168:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c9 }
            r1.<init>()     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "axolotl identity key for "
            r1.append(r0)     // Catch:{ all -> 0x01c9 }
            r1.append(r7)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = " decoded as invalid"
            r1.append(r0)     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c9 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01c9 }
            r8.add(r7)     // Catch:{ all -> 0x01c9 }
        L_0x0185:
            r6.put(r7, r3)     // Catch:{ all -> 0x01c9 }
            goto L_0x013c
        L_0x0189:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x01c9 }
            if (r0 != 0) goto L_0x01c5
            r0 = r18
            X.01d r0 = r0.A03     // Catch:{ all -> 0x01c9 }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x01c9 }
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x01c0 }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x01bb }
        L_0x019f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01bb }
            X.1Yb r1 = (X.C28861Yb) r1     // Catch:{ all -> 0x01bb }
            r0 = r18
            r0.A03(r1)     // Catch:{ all -> 0x01bb }
            goto L_0x019f
        L_0x01b1:
            r3.A00()     // Catch:{ all -> 0x01bb }
            r3.close()     // Catch:{ all -> 0x01c0 }
            r4.close()     // Catch:{ all -> 0x01c9 }
            goto L_0x01c5
        L_0x01bb:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            throw r0     // Catch:{ all -> 0x01c9 }
        L_0x01c5:
            X.C18920xT.A00(r5)
            return r6
        L_0x01c9:
            r0 = move-exception
            X.C18920xT.A00(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0M(java.util.Set):java.util.Map");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:13|14|15|16|17|37|35|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r1.hasNext() == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        A0E((X.C28861Yb) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        return r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A0N(java.util.List r15) {
        /*
            r14 = this;
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            X.19U r10 = r14.A0F
            monitor-enter(r10)
            java.util.Set r9 = r10.A01(r15)     // Catch:{ all -> 0x008e }
            java.util.Set r13 = r10.A02(r15)     // Catch:{ all -> 0x008e }
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0018
            monitor-exit(r10)     // Catch:{ all -> 0x008e }
            return r9
        L_0x0018:
            r9.addAll(r13)     // Catch:{ all -> 0x008e }
            X.1ex r0 = r14.A0B     // Catch:{ all -> 0x008e }
            android.database.Cursor r11 = r0.A00(r13)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "record"
            int r8 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "recipient_id"
            int r7 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "recipient_type"
            int r6 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "device_id"
            int r5 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0087 }
        L_0x0039:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006b
            byte[] r4 = r11.getBlob(r8)     // Catch:{ all -> 0x0087 }
            long r0 = r11.getLong(r7)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0087 }
            int r2 = r11.getInt(r6)     // Catch:{ all -> 0x0087 }
            int r0 = r11.getInt(r5)     // Catch:{ all -> 0x0087 }
            X.1Yb r1 = new X.1Yb     // Catch:{ all -> 0x0087 }
            r1.<init>(r2, r3, r0)     // Catch:{ all -> 0x0087 }
            X.1ev r0 = new X.1ev     // Catch:{ IOException -> 0x0067 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0067 }
            A02(r0)     // Catch:{ IOException -> 0x0067 }
            r10.A03(r0, r1)     // Catch:{ IOException -> 0x0067 }
            r9.remove(r1)     // Catch:{ IOException -> 0x0067 }
            goto L_0x0039
        L_0x0067:
            r12.add(r1)     // Catch:{ all -> 0x0087 }
            goto L_0x0039
        L_0x006b:
            r11.close()     // Catch:{ all -> 0x008e }
            r10.A04(r13)     // Catch:{ all -> 0x008e }
            monitor-exit(r10)     // Catch:{ all -> 0x008e }
            java.util.Iterator r1 = r12.iterator()
        L_0x0076:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r1.next()
            X.1Yb r0 = (X.C28861Yb) r0
            r14.A0E(r0)
            goto L_0x0076
        L_0x0086:
            return r9
        L_0x0087:
            r0 = move-exception
            if (r11 == 0) goto L_0x008d
            r11.close()     // Catch:{ all -> 0x008d }
        L_0x008d:
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x008e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0N(java.util.List):java.util.Set");
    }

    public void A0O() {
        NativeHolder nativeHolder;
        this.A0K.A04();
        if (this.A04.A05(C15910s6.A13) && (nativeHolder = (NativeHolder) this.A0M.wajContext.getAndSet(JniBridge.jvidispatchO(0))) != null) {
            nativeHolder.release();
        }
        AnonymousClass19U r0 = this.A0F;
        Map map = r0.A00;
        synchronized (map) {
            map.clear();
            r0.A01.clear();
        }
    }

    public void A0P() {
        Lock A012 = this.A0I.A01();
        if (A012 == null) {
            try {
                this.A0H.A00();
            } catch (Throwable th) {
                if (A012 != null) {
                    A012.unlock();
                }
                throw th;
            }
        } else {
            A012.lock();
        }
        if (this.A04.A05(C15910s6.A13)) {
            C35991mp r6 = this.A01;
            int A002 = r6.A01.A00();
            int A022 = r6.A00.A02(C15910s6.A1C);
            if (A002 < A022) {
                int i2 = A022 - A002;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    int min = Math.min(i2, 50);
                    StringBuilder sb = new StringBuilder("wa-msys generating ");
                    sb.append(min);
                    sb.append(" new prekeys and recording them in the db");
                    Log.i(sb.toString());
                    int jvidispatchIIO = (int) JniBridge.jvidispatchIIO(4, (long) min, (NativeHolder) r6.A03.wajContext.get());
                    if (jvidispatchIIO <= 0) {
                        StringBuilder sb2 = new StringBuilder("wa-msys generated 0 keys when expected to generate ");
                        sb2.append(min);
                        sb2.append(" keys");
                        Log.e(sb2.toString());
                        break;
                    }
                    i2 -= jvidispatchIIO;
                }
            } else {
                StringBuilder sb3 = new StringBuilder("skipping key generation because already more than ");
                sb3.append(A022);
                sb3.append(" are unsent");
                Log.i(sb3.toString());
            }
        } else {
            this.A00.A06();
        }
        if (A012 != null) {
            A012.unlock();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0080 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q() {
        /*
            r9 = this;
            X.0xT r0 = r9.A0I
            java.util.concurrent.locks.Lock r8 = r0.A01()
            if (r8 != 0) goto L_0x000e
            X.16P r0 = r9.A0H     // Catch:{ all -> 0x008b }
            r0.A00()     // Catch:{ all -> 0x008b }
            goto L_0x0011
        L_0x000e:
            r8.lock()     // Catch:{ all -> 0x008b }
        L_0x0011:
            X.1mo r0 = r9.A00     // Catch:{ all -> 0x008b }
            X.1mn r0 = r0.A00     // Catch:{ all -> 0x008b }
            X.1es r0 = r0.A04     // Catch:{ all -> 0x008b }
            X.01d r7 = r0.A02     // Catch:{ all -> 0x008b }
            X.0tf r4 = r7.A02()     // Catch:{ all -> 0x008b }
            X.1cj r6 = r4.A00()     // Catch:{ all -> 0x0086 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0081 }
            r5.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "sent_to_server"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0081 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "upload_timestamp"
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0081 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0081 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "prekeys"
            java.lang.String r0 = "sent_to_server != 0"
            r2 = 0
            r3.A00(r1, r5, r0, r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "axolotl recorded no prekeys as received by server"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0081 }
            X.0tf r3 = r7.A02()     // Catch:{ all -> 0x0081 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "prekey_uploads"
            int r2 = r1.A01(r0, r2, r2)     // Catch:{ all -> 0x007c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
            r1.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "axolotl deleted prekey upload timestamps:"
            r1.append(r0)     // Catch:{ all -> 0x007c }
            r1.append(r2)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x007c }
            r3.close()     // Catch:{ all -> 0x0081 }
            r6.A00()     // Catch:{ all -> 0x0081 }
            r6.close()     // Catch:{ all -> 0x0086 }
            r4.close()     // Catch:{ all -> 0x008b }
            if (r8 == 0) goto L_0x007b
            r8.unlock()
        L_0x007b:
            return
        L_0x007c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0080 }
        L_0x0080:
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0085 }
        L_0x0085:
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            throw r0     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            if (r8 == 0) goto L_0x0091
            r8.unlock()
        L_0x0091:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0Q():void");
    }

    public void A0R(AnonymousClass1WL r3, C28861Yb r4) {
        DeviceJid A032 = C28851Ya.A03(r4);
        C16040sK r1 = this.A03;
        if (r1.A0J(A032)) {
            if (r1.A0G()) {
                AnonymousClass00B.A0F(r1.A0J(C28851Ya.A03(r4)));
            } else {
                Log.e("SignalCoordinator/saveIdentity - Not allowed to save my companion identity as primary");
                return;
            }
        }
        A0S(r3, r4);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0117 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(X.AnonymousClass1WL r10, X.C28861Yb r11) {
        /*
            r9 = this;
            X.0xT r0 = r9.A0I
            java.util.concurrent.locks.Lock r8 = r0.A02(r11)
            if (r8 != 0) goto L_0x000e
            X.16P r0 = r9.A0H     // Catch:{ all -> 0x0118 }
            r0.A00()     // Catch:{ all -> 0x0118 }
            goto L_0x0011
        L_0x000e:
            r8.lock()     // Catch:{ all -> 0x0118 }
        L_0x0011:
            X.1WL r5 = r9.A0B(r11)     // Catch:{ all -> 0x0118 }
            X.1d4 r2 = r9.A07     // Catch:{ all -> 0x0118 }
            if (r10 == 0) goto L_0x0026
            X.1cD r0 = r10.A00     // Catch:{ all -> 0x0118 }
            byte[] r3 = r0.A00()     // Catch:{ all -> 0x0118 }
        L_0x001f:
            X.01d r0 = r2.A03     // Catch:{ all -> 0x0118 }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x0118 }
            goto L_0x0028
        L_0x0026:
            r3 = 0
            goto L_0x001f
        L_0x0028:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0113 }
            r7.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = "recipient_id"
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x0113 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = "recipient_type"
            int r0 = r11.A01     // Catch:{ all -> 0x0113 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0113 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = "device_id"
            int r0 = r11.A00     // Catch:{ all -> 0x0113 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0113 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "public_key"
            if (r3 == 0) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            r7.putNull(r0)     // Catch:{ all -> 0x0113 }
            goto L_0x0056
        L_0x0053:
            r7.put(r0, r3)     // Catch:{ all -> 0x0113 }
        L_0x0056:
            java.lang.String r6 = "timestamp"
            X.0t3 r0 = r2.A02     // Catch:{ all -> 0x0113 }
            long r2 = r0.A00()     // Catch:{ all -> 0x0113 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0113 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0113 }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "identities"
            long r1 = r1.A05(r7, r0)     // Catch:{ all -> 0x0113 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            r3.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "axolotl saved identity for "
            r3.append(r0)     // Catch:{ all -> 0x0113 }
            r3.append(r11)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = " with resultant row id "
            r3.append(r0)     // Catch:{ all -> 0x0113 }
            r3.append(r1)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0113 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0113 }
            r4.close()     // Catch:{ all -> 0x0118 }
            com.whatsapp.jid.DeviceJid r2 = X.C28851Ya.A03(r11)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x010d
            if (r10 != 0) goto L_0x00a0
            if (r5 == 0) goto L_0x010d
            X.19T r0 = r9.A02     // Catch:{ all -> 0x0118 }
            r0.A04(r2)     // Catch:{ all -> 0x0118 }
            goto L_0x010d
        L_0x00a0:
            if (r5 != 0) goto L_0x00ce
            X.19T r1 = r9.A02     // Catch:{ all -> 0x0118 }
            X.0xT r0 = r1.A01     // Catch:{ all -> 0x0118 }
            java.util.concurrent.locks.Lock r3 = r0.A04(r2)     // Catch:{ all -> 0x0118 }
            if (r3 != 0) goto L_0x00ad
            goto L_0x00b1
        L_0x00ad:
            r3.lock()     // Catch:{ all -> 0x0106 }
            goto L_0x00b6
        L_0x00b1:
            X.16P r0 = r1.A00     // Catch:{ all -> 0x0106 }
            r0.A00()     // Catch:{ all -> 0x0106 }
        L_0x00b6:
            java.lang.Iterable r0 = r1.A01()     // Catch:{ all -> 0x0106 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0106 }
        L_0x00be:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0106 }
            X.1ia r0 = (X.C33441ia) r0     // Catch:{ all -> 0x0106 }
            r0.AS5(r2)     // Catch:{ all -> 0x0106 }
            goto L_0x00be
        L_0x00ce:
            boolean r0 = r10.equals(r5)     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x010d
            X.19T r1 = r9.A02     // Catch:{ all -> 0x0118 }
            X.0xT r0 = r1.A01     // Catch:{ all -> 0x0118 }
            java.util.concurrent.locks.Lock r3 = r0.A04(r2)     // Catch:{ all -> 0x0118 }
            if (r3 != 0) goto L_0x00df
            goto L_0x00e3
        L_0x00df:
            r3.lock()     // Catch:{ all -> 0x0106 }
            goto L_0x00e8
        L_0x00e3:
            X.16P r0 = r1.A00     // Catch:{ all -> 0x0106 }
            r0.A00()     // Catch:{ all -> 0x0106 }
        L_0x00e8:
            java.lang.Iterable r0 = r1.A01()     // Catch:{ all -> 0x0106 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0106 }
        L_0x00f0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0106 }
            X.1ia r0 = (X.C33441ia) r0     // Catch:{ all -> 0x0106 }
            r0.AS6(r2)     // Catch:{ all -> 0x0106 }
            goto L_0x00f0
        L_0x0100:
            if (r3 == 0) goto L_0x010d
            r3.unlock()     // Catch:{ all -> 0x0118 }
            goto L_0x010d
        L_0x0106:
            r0 = move-exception
            if (r3 == 0) goto L_0x010c
            r3.unlock()     // Catch:{ all -> 0x0118 }
        L_0x010c:
            throw r0     // Catch:{ all -> 0x0118 }
        L_0x010d:
            if (r8 == 0) goto L_0x0112
            r8.unlock()
        L_0x0112:
            return
        L_0x0113:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0117 }
        L_0x0117:
            throw r0     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            if (r8 == 0) goto L_0x011e
            r8.unlock()
        L_0x011e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0S(X.1WL, X.1Yb):void");
    }

    public void A0T(C28861Yb r4) {
        DeviceJid A032;
        Lock A022 = this.A0I.A02(r4);
        if (A022 == null) {
            this.A0H.A00();
        } else {
            try {
                A022.lock();
            } catch (Throwable th) {
                if (A022 != null) {
                    A022.unlock();
                }
                throw th;
            }
        }
        C30851d4 r0 = this.A07;
        byte[] A042 = r0.A04(r4);
        boolean A033 = r0.A03(r4);
        if (!(A042 == null || !A033 || (A032 = C28851Ya.A03(r4)) == null)) {
            this.A02.A04(A032);
        }
        if (A022 != null) {
            A022.unlock();
        }
    }

    public void A0U(C28861Yb r2) {
        if (!this.A0I.A06) {
            this.A0H.A00();
        }
        A0E(r2);
    }

    public void A0V(C28861Yb r5, C15830rv r6, byte[] bArr) {
        Lock A022 = this.A0I.A02(r5);
        if (A022 == null) {
            this.A0H.A00();
        } else {
            try {
                A022.lock();
            } catch (Throwable th) {
                if (A022 != null) {
                    A022.unlock();
                }
                throw th;
            }
        }
        A0X(r5, new C28381Vw(r6, "location_msg_id", true), bArr);
        if (A022 != null) {
            A022.unlock();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(X.C28861Yb r9, X.C28381Vw r10) {
        /*
            r8 = this;
            X.0xT r0 = r8.A0I
            java.util.concurrent.locks.Lock r7 = r0.A02(r9)
            if (r7 != 0) goto L_0x0009
            goto L_0x000d
        L_0x0009:
            r7.lock()     // Catch:{ all -> 0x0084 }
            goto L_0x0012
        L_0x000d:
            X.16P r0 = r8.A0H     // Catch:{ all -> 0x0084 }
            r0.A00()     // Catch:{ all -> 0x0084 }
        L_0x0012:
            X.1mk r2 = r8.A08     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = X.C35941mk.A00(r10)     // Catch:{ all -> 0x0084 }
            X.0rv r0 = r10.A00     // Catch:{ all -> 0x0084 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0084 }
            X.01d r0 = r2.A01     // Catch:{ all -> 0x0084 }
            X.0tf r6 = r0.A02()     // Catch:{ all -> 0x0084 }
            X.0tg r4 = r6.A02     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "message_base_key"
            r0 = 5
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x007f }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x007f }
            java.lang.String r1 = r9.A02     // Catch:{ all -> 0x007f }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x007f }
            int r0 = r9.A01     // Catch:{ all -> 0x007f }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x007f }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x007f }
            int r0 = r9.A00     // Catch:{ all -> 0x007f }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x007f }
            r0 = 3
            r2[r0] = r1     // Catch:{ all -> 0x007f }
            java.lang.String r1 = r10.A01     // Catch:{ all -> 0x007f }
            r0 = 4
            r2[r0] = r1     // Catch:{ all -> 0x007f }
            int r0 = r4.A01(r3, r5, r2)     // Catch:{ all -> 0x007f }
            long r2 = (long) r0     // Catch:{ all -> 0x007f }
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = 5
            if (r0 <= 0) goto L_0x005a
            r4 = 3
        L_0x005a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r1.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "axolotl deleted "
            r1.append(r0)     // Catch:{ all -> 0x007f }
            r1.append(r2)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = " message base key rows for "
            r1.append(r0)     // Catch:{ all -> 0x007f }
            r1.append(r10)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007f }
            com.whatsapp.util.Log.log((int) r4, (java.lang.String) r0)     // Catch:{ all -> 0x007f }
            r6.close()     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x007e
            r7.unlock()
        L_0x007e:
            return
        L_0x007f:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0083 }
        L_0x0083:
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            if (r7 == 0) goto L_0x008a
            r7.unlock()
        L_0x008a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0W(X.1Yb, X.1Vw):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00a5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(X.C28861Yb r9, X.C28381Vw r10, byte[] r11) {
        /*
            r8 = this;
            X.0xT r0 = r8.A0I
            java.util.concurrent.locks.Lock r7 = r0.A02(r9)
            if (r7 != 0) goto L_0x0009
            goto L_0x000d
        L_0x0009:
            r7.lock()     // Catch:{ all -> 0x00a6 }
            goto L_0x0012
        L_0x000d:
            X.16P r0 = r8.A0H     // Catch:{ all -> 0x00a6 }
            r0.A00()     // Catch:{ all -> 0x00a6 }
        L_0x0012:
            X.1mk r2 = r8.A08     // Catch:{ all -> 0x00a6 }
            X.0rv r0 = r10.A00     // Catch:{ all -> 0x00a6 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00a6 }
            X.01d r0 = r2.A01     // Catch:{ all -> 0x00a6 }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x00a6 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x00a1 }
            r6.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "msg_key_remote_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "recipient_id"
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x00a1 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "recipient_type"
            int r0 = r9.A01     // Catch:{ all -> 0x00a1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "device_id"
            int r0 = r9.A00     // Catch:{ all -> 0x00a1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "msg_key_from_me"
            boolean r0 = r10.A02     // Catch:{ all -> 0x00a1 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "msg_key_id"
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x00a1 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "last_alice_base_key"
            r6.put(r0, r11)     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = "timestamp"
            X.0t3 r0 = r2.A00     // Catch:{ all -> 0x00a1 }
            long r2 = r0.A00()     // Catch:{ all -> 0x00a1 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00a1 }
            r6.put(r5, r0)     // Catch:{ all -> 0x00a1 }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "message_base_key"
            long r1 = r1.A05(r6, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r3.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "axolotl saved a message base key for "
            r3.append(r0)     // Catch:{ all -> 0x00a1 }
            r3.append(r10)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = " with row id "
            r3.append(r0)     // Catch:{ all -> 0x00a1 }
            r3.append(r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00a1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00a1 }
            r4.close()     // Catch:{ all -> 0x00a6 }
            if (r7 == 0) goto L_0x00a0
            r7.unlock()
        L_0x00a0:
            return
        L_0x00a1:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            if (r7 == 0) goto L_0x00ac
            r7.unlock()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0X(X.1Yb, X.1Vw, byte[]):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Y(X.C30981dH r7) {
        /*
            r6 = this;
            X.0xT r0 = r6.A0I
            java.util.concurrent.locks.Lock r5 = r0.A03(r7)
            if (r5 != 0) goto L_0x0009
            goto L_0x000d
        L_0x0009:
            r5.lock()     // Catch:{ all -> 0x0065 }
            goto L_0x0012
        L_0x000d:
            X.16P r0 = r6.A0H     // Catch:{ all -> 0x0065 }
            r0.A00()     // Catch:{ all -> 0x0065 }
        L_0x0012:
            java.lang.String r2 = r7.A01     // Catch:{ all -> 0x0065 }
            X.1l7 r0 = X.C34941l7.A00     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0065 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0036
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "signalCoordinator/removefastratchetsenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x0065 }
            r1.append(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0065 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0065 }
            goto L_0x005a
        L_0x0036:
            X.1f9 r0 = r6.A06     // Catch:{ all -> 0x0065 }
            X.01d r0 = r0.A01     // Catch:{ all -> 0x0065 }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x0065 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "fast_ratchet_sender_keys"
            java.lang.String r1 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r0 = r7.A00()     // Catch:{ all -> 0x0060 }
            r3.A01(r2, r1, r0)     // Catch:{ all -> 0x0060 }
            r4.close()     // Catch:{ all -> 0x0065 }
            X.0y7 r0 = r6.A05     // Catch:{ all -> 0x0065 }
            X.1nt r1 = new X.1nt     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            X.1mi r0 = r0.A00     // Catch:{ all -> 0x0065 }
            r0.A01(r1)     // Catch:{ all -> 0x0065 }
        L_0x005a:
            if (r5 == 0) goto L_0x005f
            r5.unlock()
        L_0x005f:
            return
        L_0x0060:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            if (r5 == 0) goto L_0x006b
            r5.unlock()
        L_0x006b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0Y(X.1dH):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x008e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(X.C30981dH r7, byte[] r8) {
        /*
            r6 = this;
            X.0xT r0 = r6.A0I
            java.util.concurrent.locks.Lock r5 = r0.A03(r7)
            if (r5 != 0) goto L_0x0009
            goto L_0x000d
        L_0x0009:
            r5.lock()     // Catch:{ all -> 0x008f }
            goto L_0x0012
        L_0x000d:
            X.16P r0 = r6.A0H     // Catch:{ all -> 0x008f }
            r0.A00()     // Catch:{ all -> 0x008f }
        L_0x0012:
            java.lang.String r2 = r7.A01     // Catch:{ all -> 0x008f }
            X.1l7 r0 = X.C34941l7.A00     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x008f }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x0036
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r1.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "signalCoordinator/savefastratchetsenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x008f }
            r1.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x008f }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x008f }
            goto L_0x0084
        L_0x0036:
            X.1f9 r0 = r6.A06     // Catch:{ all -> 0x008f }
            X.01d r0 = r0.A01     // Catch:{ all -> 0x008f }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x008f }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x008a }
            r4.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "group_id"
            r4.put(r0, r2)     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "sender_id"
            X.1Yb r2 = r7.A00     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x008a }
            r4.put(r1, r0)     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "sender_type"
            int r0 = r2.A01     // Catch:{ all -> 0x008a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008a }
            r4.put(r1, r0)     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "device_id"
            int r0 = r2.A00     // Catch:{ all -> 0x008a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008a }
            r4.put(r1, r0)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "record"
            r4.put(r0, r8)     // Catch:{ all -> 0x008a }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "fast_ratchet_sender_keys"
            r1.A05(r4, r0)     // Catch:{ all -> 0x008a }
            r3.close()     // Catch:{ all -> 0x008f }
            X.0y7 r0 = r6.A05     // Catch:{ all -> 0x008f }
            X.1nt r1 = new X.1nt     // Catch:{ all -> 0x008f }
            r1.<init>()     // Catch:{ all -> 0x008f }
            X.1mi r0 = r0.A00     // Catch:{ all -> 0x008f }
            r0.A01(r1)     // Catch:{ all -> 0x008f }
        L_0x0084:
            if (r5 == 0) goto L_0x0089
            r5.unlock()
        L_0x0089:
            return
        L_0x008a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x008e }
        L_0x008e:
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            if (r5 == 0) goto L_0x0095
            r5.unlock()
        L_0x0095:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0Z(X.1dH, byte[]):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("senderkeystore/storesenderkey/invalidgroupid ");
        r1.append(r12);
        com.whatsapp.util.Log.w(r1.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00d8 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x00d1=Splitter:B:31:0x00d1, B:36:0x00d8=Splitter:B:36:0x00d8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(X.C30981dH r19, byte[] r20) {
        /*
            r18 = this;
            r6 = r18
            X.0xT r0 = r6.A0I
            r13 = r19
            java.util.concurrent.locks.Lock r17 = r0.A03(r13)
            if (r17 != 0) goto L_0x000d
            goto L_0x0011
        L_0x000d:
            r17.lock()     // Catch:{ all -> 0x00f3 }
            goto L_0x0016
        L_0x0011:
            X.16P r0 = r6.A0H     // Catch:{ all -> 0x00f3 }
            r0.A00()     // Catch:{ all -> 0x00f3 }
        L_0x0016:
            java.lang.String r12 = r13.A01     // Catch:{ all -> 0x00f3 }
            com.whatsapp.jid.Jid r3 = com.whatsapp.jid.Jid.get(r12)     // Catch:{ 1W4 -> 0x00d8 }
            boolean r0 = r3 instanceof X.C16060sN     // Catch:{ 1W4 -> 0x00d8 }
            if (r0 == 0) goto L_0x00d2
            X.0sN r3 = (X.C16060sN) r3     // Catch:{ 1W4 -> 0x00d8 }
            X.1fD r4 = r6.A0A     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = "SenderKeyStore/saveSenderKey/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f3 }
            r0.append(r13)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00f3 }
            X.01d r0 = r4.A01     // Catch:{ all -> 0x00f3 }
            X.0tf r2 = r0.A02()     // Catch:{ all -> 0x00f3 }
            X.1cj r16 = r2.A00()     // Catch:{ all -> 0x00cd }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x00c8 }
            r9.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "record"
            r1 = r20
            r9.put(r0, r1)     // Catch:{ all -> 0x00c8 }
            X.0t3 r0 = r4.A00     // Catch:{ all -> 0x00c8 }
            long r14 = r0.A00()     // Catch:{ all -> 0x00c8 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r0
            X.0tg r8 = r2.A02     // Catch:{ all -> 0x00c8 }
            java.lang.String r7 = "sender_keys"
            java.lang.String r1 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r0 = r13.A00()     // Catch:{ all -> 0x00c8 }
            int r0 = r8.A00(r7, r9, r1, r0)     // Catch:{ all -> 0x00c8 }
            long r4 = (long) r0     // Catch:{ all -> 0x00c8 }
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "group_id"
            r9.put(r0, r12)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "sender_id"
            X.1Yb r4 = r13.A00     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = r4.A02     // Catch:{ all -> 0x00c8 }
            r9.put(r1, r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "sender_type"
            int r0 = r4.A01     // Catch:{ all -> 0x00c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c8 }
            r9.put(r1, r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "device_id"
            int r0 = r4.A00     // Catch:{ all -> 0x00c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c8 }
            r9.put(r1, r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x00c8 }
            r9.put(r1, r0)     // Catch:{ all -> 0x00c8 }
            long r4 = r8.A03(r9, r7)     // Catch:{ all -> 0x00c8 }
        L_0x009e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r1.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "SenderKeyStore/saveSenderKey/result/"
            r1.append(r0)     // Catch:{ all -> 0x00c8 }
            r1.append(r4)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c8 }
            r16.A00()     // Catch:{ all -> 0x00c8 }
            r16.close()     // Catch:{ all -> 0x00cd }
            r2.close()     // Catch:{ all -> 0x00f3 }
            X.0y7 r0 = r6.A05     // Catch:{ all -> 0x00f3 }
            X.1nu r1 = new X.1nu     // Catch:{ all -> 0x00f3 }
            r1.<init>(r3)     // Catch:{ all -> 0x00f3 }
            X.1mi r0 = r0.A01     // Catch:{ all -> 0x00f3 }
            r0.A01(r1)     // Catch:{ all -> 0x00f3 }
            goto L_0x00ed
        L_0x00c8:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x00d2:
            X.1W4 r0 = new X.1W4     // Catch:{ 1W4 -> 0x00d8 }
            r0.<init>((java.lang.String) r12)     // Catch:{ 1W4 -> 0x00d8 }
            throw r0     // Catch:{ 1W4 -> 0x00d8 }
        L_0x00d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r1.<init>()     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "senderkeystore/storesenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x00f3 }
            r1.append(r12)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f3 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00f3 }
        L_0x00ed:
            if (r17 == 0) goto L_0x00f2
            r17.unlock()
        L_0x00f2:
            return
        L_0x00f3:
            r0 = move-exception
            if (r17 == 0) goto L_0x00f9
            r17.unlock()
        L_0x00f9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0a(X.1dH, byte[]):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00bf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00ce */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0b(java.util.List r12, int r13) {
        /*
            r11 = this;
            X.0xT r0 = r11.A0I
            java.util.concurrent.locks.Lock r10 = r0.A01()
            if (r10 != 0) goto L_0x000e
            X.16P r0 = r11.A0H     // Catch:{ all -> 0x00d5 }
            r0.A00()     // Catch:{ all -> 0x00d5 }
            goto L_0x0011
        L_0x000e:
            r10.lock()     // Catch:{ all -> 0x00d5 }
        L_0x0011:
            int r0 = r12.size()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00cf
            X.01d r0 = r11.A0K     // Catch:{ all -> 0x00d5 }
            X.0tf r9 = r0.A02()     // Catch:{ all -> 0x00d5 }
            X.1cj r8 = r9.A00()     // Catch:{ all -> 0x00ca }
            X.1es r0 = r11.A09     // Catch:{ all -> 0x00c5 }
            X.01d r0 = r0.A02     // Catch:{ all -> 0x00c5 }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x00c5 }
            X.1cj r6 = r3.A00()     // Catch:{ all -> 0x00c0 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00bb }
            r5.<init>()     // Catch:{ all -> 0x00bb }
            java.util.Iterator r4 = r12.iterator()     // Catch:{ all -> 0x00bb }
        L_0x0036:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x006c
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x00bb }
            X.1ew r2 = (X.C31731ew) r2     // Catch:{ all -> 0x00bb }
            r5.clear()     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "prekey_id"
            int r0 = r2.A00     // Catch:{ all -> 0x00bb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00bb }
            r5.put(r1, r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "record"
            byte[] r0 = r2.A01     // Catch:{ all -> 0x00bb }
            r5.put(r1, r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "sent_to_server"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00bb }
            r5.put(r0, r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "direct_distribution"
            r5.put(r0, r1)     // Catch:{ all -> 0x00bb }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "prekeys"
            r1.A03(r5, r0)     // Catch:{ all -> 0x00bb }
            goto L_0x0036
        L_0x006c:
            r6.A00()     // Catch:{ all -> 0x00bb }
            r6.close()     // Catch:{ all -> 0x00c0 }
            r3.close()     // Catch:{ all -> 0x00c5 }
            X.1d4 r0 = r11.A07     // Catch:{ all -> 0x00c5 }
            X.01d r0 = r0.A03     // Catch:{ all -> 0x00c5 }
            X.0tf r6 = r0.A02()     // Catch:{ all -> 0x00c5 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00b6 }
            r7.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "next_prekey_id"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00b6 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00b6 }
            X.0tg r5 = r6.A02     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = "identities"
            java.lang.String r3 = "recipient_id=? AND recipient_type = ? AND device_id=?"
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00b6 }
            r0 = -1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b6 }
            r1 = 0
            r2[r1] = r0     // Catch:{ all -> 0x00b6 }
            r0 = 1
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00b6 }
            r2[r0] = r1     // Catch:{ all -> 0x00b6 }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x00b6 }
            r5.A00(r4, r7, r3, r2)     // Catch:{ all -> 0x00b6 }
            r6.close()     // Catch:{ all -> 0x00c5 }
            r8.A00()     // Catch:{ all -> 0x00c5 }
            r8.close()     // Catch:{ all -> 0x00ca }
            r9.close()     // Catch:{ all -> 0x00d5 }
            goto L_0x00cf
        L_0x00b6:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00c4 }
            goto L_0x00c4
        L_0x00bb:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00cf:
            if (r10 == 0) goto L_0x00d4
            r10.unlock()
        L_0x00d4:
            return
        L_0x00d5:
            r0 = move-exception
            if (r10 == 0) goto L_0x00db
            r10.unlock()
        L_0x00db:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0b(java.util.List, int):void");
    }

    public boolean A0c() {
        Lock A012 = this.A0I.A01();
        if (A012 == null) {
            this.A0H.A00();
        } else {
            try {
                A012.lock();
            } catch (Throwable th) {
                if (A012 != null) {
                    A012.unlock();
                }
                throw th;
            }
        }
        boolean A072 = this.A00.A07();
        if (A012 != null) {
            A012.unlock();
        }
        return A072;
    }

    public boolean A0d(C28861Yb r6) {
        AnonymousClass19U r4 = this.A0F;
        synchronized (r4) {
            C31721ev A002 = r4.A00(r6);
            boolean z2 = true;
            if (A002 == null) {
                byte[] A032 = this.A0B.A03(r6);
                if (A032 == null) {
                    r4.A03(new C31721ev(), r6);
                    return false;
                }
                try {
                    C31721ev r0 = new C31721ev(A032);
                    A02(r0);
                    r4.A03(r0, r6);
                } catch (IOException unused) {
                    A0E(r6);
                    return false;
                }
            } else if (A002.A00) {
                z2 = false;
            }
            return z2;
        }
    }

    public boolean A0e(C28861Yb r5, C15830rv r6) {
        Lock A022 = this.A0I.A02(r5);
        if (A022 == null) {
            this.A0H.A00();
        } else {
            try {
                A022.lock();
            } catch (Throwable th) {
                if (A022 != null) {
                    A022.unlock();
                }
                throw th;
            }
        }
        boolean A0f = A0f(r5, new C28381Vw(r6, "location_msg_id", true));
        if (A022 != null) {
            A022.unlock();
        }
        return A0f;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00f7 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0080=Splitter:B:17:0x0080, B:43:0x00f2=Splitter:B:43:0x00f2} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0f(X.C28861Yb r19, X.C28381Vw r20) {
        /*
            r18 = this;
            r5 = r18
            X.0xT r1 = r5.A0I
            r3 = r19
            java.util.concurrent.locks.Lock r9 = r1.A02(r3)
            if (r9 != 0) goto L_0x000d
            goto L_0x0011
        L_0x000d:
            r9.lock()     // Catch:{ all -> 0x00ff }
            goto L_0x0016
        L_0x0011:
            X.16P r0 = r5.A0H     // Catch:{ all -> 0x00ff }
            r0.A00()     // Catch:{ all -> 0x00ff }
        L_0x0016:
            java.util.concurrent.locks.Lock r8 = r1.A02(r3)     // Catch:{ all -> 0x00ff }
            if (r8 != 0) goto L_0x0022
            X.16P r0 = r5.A0H     // Catch:{ all -> 0x00f8 }
            r0.A00()     // Catch:{ all -> 0x00f8 }
            goto L_0x0025
        L_0x0022:
            r8.lock()     // Catch:{ all -> 0x00f8 }
        L_0x0025:
            X.1mk r1 = r5.A08     // Catch:{ all -> 0x00f8 }
            java.lang.String r6 = "last_alice_base_key"
            r4 = r20
            java.lang.String r13 = X.C35941mk.A00(r4)     // Catch:{ all -> 0x00f8 }
            X.0rv r0 = r4.A00     // Catch:{ all -> 0x00f8 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r7 = r0.getRawString()     // Catch:{ all -> 0x00f8 }
            X.01d r0 = r1.A01     // Catch:{ all -> 0x00f8 }
            X.0tf r2 = r0.get()     // Catch:{ all -> 0x00f8 }
            X.0tg r10 = r2.A02     // Catch:{ all -> 0x00f3 }
            java.lang.String r11 = "message_base_key"
            r0 = 1
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x00f3 }
            r1 = 0
            r12[r1] = r6     // Catch:{ all -> 0x00f3 }
            r0 = 5
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ all -> 0x00f3 }
            r14[r1] = r7     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = r3.A02     // Catch:{ all -> 0x00f3 }
            r0 = 1
            r14[r0] = r1     // Catch:{ all -> 0x00f3 }
            int r0 = r3.A01     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f3 }
            r0 = 2
            r14[r0] = r1     // Catch:{ all -> 0x00f3 }
            int r0 = r3.A00     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f3 }
            r0 = 3
            r14[r0] = r1     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = r4.A01     // Catch:{ all -> 0x00f3 }
            r0 = 4
            r14[r0] = r1     // Catch:{ all -> 0x00f3 }
            r15 = 0
            r17 = r15
            r16 = r15
            android.database.Cursor r1 = r10.A09(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00f3 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x0080
            int r0 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x00ec }
            byte[] r15 = r1.getBlob(r0)     // Catch:{ all -> 0x00ec }
        L_0x0080:
            r1.close()     // Catch:{ all -> 0x00f3 }
            r2.close()     // Catch:{ all -> 0x00f8 }
            if (r8 == 0) goto L_0x008b
            r8.unlock()     // Catch:{ all -> 0x00ff }
        L_0x008b:
            if (r15 != 0) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r1.<init>()     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "axolotl has no saved base key for "
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            r1.append(r4)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ff }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ff }
            r0 = 0
            if (r9 == 0) goto L_0x00a7
            r9.unlock()
        L_0x00a7:
            return r0
        L_0x00a8:
            X.1ev r0 = r5.A0D(r3)     // Catch:{ all -> 0x00ff }
            X.1ms r0 = r0.A01     // Catch:{ all -> 0x00ff }
            X.1mt r0 = r0.A00     // Catch:{ all -> 0x00ff }
            X.1Ww r0 = r0.A05     // Catch:{ all -> 0x00ff }
            byte[] r0 = r0.A04()     // Catch:{ all -> 0x00ff }
            boolean r2 = java.util.Arrays.equals(r15, r0)     // Catch:{ all -> 0x00ff }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r1.<init>()     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "axolotl has "
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            if (r2 == 0) goto L_0x00c7
            goto L_0x00ca
        L_0x00c7:
            java.lang.String r0 = "different"
            goto L_0x00cc
        L_0x00ca:
            java.lang.String r0 = "matching"
        L_0x00cc:
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = " saved base key and session for "
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            r1.append(r4)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            r1.append(r3)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ff }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ff }
            if (r9 == 0) goto L_0x00eb
            r9.unlock()
        L_0x00eb:
            return r2
        L_0x00ec:
            r0 = move-exception
            if (r1 == 0) goto L_0x00f2
            r1.close()     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            throw r0     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            if (r8 == 0) goto L_0x00fe
            r8.unlock()     // Catch:{ all -> 0x00ff }
        L_0x00fe:
            throw r0     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            if (r9 == 0) goto L_0x0105
            r9.unlock()
        L_0x0105:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0f(X.1Yb, X.1Vw):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|(2:20|21)) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("senderkeystore/removesenderkey/invalidgroupid ");
        r1.append(r2);
        com.whatsapp.util.Log.w(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r6 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r6.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0g(X.C30981dH r8, boolean r9) {
        /*
            r7 = this;
            r3 = 0
            if (r9 != 0) goto L_0x000b
            X.1Yb r0 = r8.A00
            int r1 = r0.A01
            r0 = 1
            if (r1 != r0) goto L_0x000b
        L_0x000a:
            return r3
        L_0x000b:
            X.0xT r0 = r7.A0I
            java.util.concurrent.locks.Lock r6 = r0.A03(r8)
            if (r6 != 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            r6.lock()     // Catch:{ all -> 0x0091 }
            goto L_0x001d
        L_0x0018:
            X.16P r0 = r7.A0H     // Catch:{ all -> 0x0091 }
            r0.A00()     // Catch:{ all -> 0x0091 }
        L_0x001d:
            java.lang.String r2 = r8.A01     // Catch:{ all -> 0x0091 }
            com.whatsapp.jid.Jid r5 = com.whatsapp.jid.Jid.get(r2)     // Catch:{ 1W4 -> 0x0030 }
            boolean r0 = r5 instanceof X.C16060sN     // Catch:{ 1W4 -> 0x0030 }
            if (r0 == 0) goto L_0x002a
            X.0sN r5 = (X.C16060sN) r5     // Catch:{ 1W4 -> 0x0030 }
            goto L_0x004b
        L_0x002a:
            X.1W4 r0 = new X.1W4     // Catch:{ 1W4 -> 0x0030 }
            r0.<init>((java.lang.String) r2)     // Catch:{ 1W4 -> 0x0030 }
            throw r0     // Catch:{ 1W4 -> 0x0030 }
        L_0x0030:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r1.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "senderkeystore/removesenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x0091 }
            r1.append(r2)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0091 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x000a
            r6.unlock()
            return r3
        L_0x004b:
            X.1fD r2 = r7.A0A     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "SenderKeyStore/removeSenderKey/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r0.<init>(r1)     // Catch:{ all -> 0x0091 }
            r0.append(r8)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0091 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0091 }
            X.01d r0 = r2.A01     // Catch:{ all -> 0x0091 }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x0091 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "sender_keys"
            java.lang.String r1 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r0 = r8.A00()     // Catch:{ all -> 0x008c }
            int r0 = r3.A01(r2, r1, r0)     // Catch:{ all -> 0x008c }
            r2 = 0
            if (r0 <= 0) goto L_0x0077
            r2 = 1
        L_0x0077:
            r4.close()     // Catch:{ all -> 0x0091 }
            X.0y7 r0 = r7.A05     // Catch:{ all -> 0x0091 }
            X.1nu r1 = new X.1nu     // Catch:{ all -> 0x0091 }
            r1.<init>(r5)     // Catch:{ all -> 0x0091 }
            X.1mi r0 = r0.A01     // Catch:{ all -> 0x0091 }
            r0.A01(r1)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x008b
            r6.unlock()
        L_0x008b:
            return r2
        L_0x008c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0090 }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            if (r6 == 0) goto L_0x0097
            r6.unlock()
        L_0x0097:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208211s.A0g(X.1dH, boolean):boolean");
    }

    public byte[] A0h() {
        Lock A012 = this.A0I.A01();
        if (A012 == null) {
            this.A0H.A00();
        } else {
            try {
                A012.lock();
            } catch (Throwable th) {
                if (A012 != null) {
                    A012.unlock();
                }
                throw th;
            }
        }
        byte[] bArr = this.A00.A04().A01.A00.A01;
        Log.i("axolotl fetched identity key for sending");
        if (A012 != null) {
            A012.unlock();
        }
        return bArr;
    }
}
