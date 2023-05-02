package X;

import android.content.SharedPreferences;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0w4  reason: invalid class name and case insensitive filesystem */
public class C18050w4 {
    public final C16300so A00;
    public final C18020w1 A01;
    public final C16600tK A02;
    public final C16000sG A03;
    public final C16440t3 A04;
    public final C15860rz A05;
    public final C15810rt A06;
    public final C16070sO A07;
    public final C18030w2 A08;
    public final C14710pd A09;
    public final C16490t9 A0A;
    public final C18040w3 A0B;

    public C18050w4(C16300so r1, C18020w1 r2, C16600tK r3, C16000sG r4, C16440t3 r5, C15860rz r6, C15810rt r7, C16070sO r8, C18030w2 r9, C14710pd r10, C16490t9 r11, C18040w3 r12) {
        this.A04 = r5;
        this.A09 = r10;
        this.A00 = r1;
        this.A06 = r7;
        this.A0A = r11;
        this.A03 = r4;
        this.A01 = r2;
        this.A08 = r9;
        this.A02 = r3;
        this.A0B = r12;
        this.A05 = r6;
        this.A07 = r8;
    }

    public void A00(int i2, long j2) {
        A01((C15830rv) null, i2, 0, 0, j2);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    public void A01(X.C15830rv r7, int r8, int r9, int r10, long r11) {
        /*
            r6 = this;
            X.2IV r3 = new X.2IV
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r3.A03 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r3.A06 = r0
            r2 = 3
            if (r8 != r2) goto L_0x0021
            if (r7 == 0) goto L_0x0021
            boolean r0 = r7 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00c6
            r1 = 1
        L_0x001b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        L_0x001f:
            r3.A02 = r4
        L_0x0021:
            if (r9 <= 0) goto L_0x002f
            r0 = 32
            if (r9 > r0) goto L_0x00c3
            r0 = 32
        L_0x0029:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
        L_0x002f:
            if (r10 <= 0) goto L_0x0047
            r0 = 32
            if (r10 > r0) goto L_0x00c0
            r0 = 32
        L_0x0037:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A04 = r0
            int r0 = X.C18020w1.A00(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
        L_0x0047:
            com.whatsapp.jid.GroupJid r1 = com.whatsapp.jid.GroupJid.of(r7)
            r5 = 0
            if (r1 == 0) goto L_0x0063
            X.0sG r0 = r6.A03
            X.0sH r0 = r0.A09(r1)
            if (r0 == 0) goto L_0x0063
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x0063
            X.0rt r0 = r6.A06
            boolean r0 = r0.A0H(r1)
            if (r0 == 0) goto L_0x0063
            r5 = 1
        L_0x0063:
            boolean r1 = X.C16030sJ.A0M(r7)
            r4 = 1
            if (r8 == r2) goto L_0x00b5
            r0 = 8
            if (r8 == r0) goto L_0x00b0
            r0 = 10
            if (r8 != r0) goto L_0x0078
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
        L_0x0076:
            r3.A00 = r0
        L_0x0078:
            java.lang.Integer r0 = r3.A03
            int r1 = r0.intValue()
            r0 = 12
            X.0t9 r5 = r6.A0A
            if (r1 != r0) goto L_0x00ac
            X.00F r0 = new X.00F
            r0.<init>(r4, r4)
            r5.A0A(r3, r0)
        L_0x008c:
            X.2IW r1 = new X.2IW
            r1.<init>()
            X.0tK r0 = r6.A02
            boolean r0 = r0.A08()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            r5.A06(r1)
            X.0pd r2 = r6.A09
            r1 = 305(0x131, float:4.27E-43)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            monitor-enter(r5)
            goto L_0x00e4
        L_0x00ac:
            r5.A06(r3)
            goto L_0x008c
        L_0x00b0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0076
        L_0x00b5:
            if (r1 != 0) goto L_0x00ba
            r0 = 0
            if (r5 == 0) goto L_0x00bb
        L_0x00ba:
            r0 = 1
        L_0x00bb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0076
        L_0x00c0:
            long r0 = (long) r10
            goto L_0x0037
        L_0x00c3:
            long r0 = (long) r9
            goto L_0x0029
        L_0x00c6:
            boolean r0 = r7 instanceof X.C16050sL
            r4 = 0
            if (r0 == 0) goto L_0x001f
            X.0rt r1 = r6.A06
            r0 = r7
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r0 = r1.A03(r0)
            r1 = 4
            if (r0 == r2) goto L_0x001b
            r1 = 2
            if (r0 != r1) goto L_0x00e0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto L_0x001f
        L_0x00e0:
            if (r0 != 0) goto L_0x001f
            goto L_0x001b
        L_0x00e4:
            r5.A0N = r0     // Catch:{ all -> 0x010a }
            monitor-exit(r5)     // Catch:{ all -> 0x010a }
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x0109
            X.2IX r2 = new X.2IX
            r2.<init>()
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A01 = r0
            r5.A06(r2)
            X.2IY r0 = new X.2IY
            r0.<init>()
            r5.A06(r0)
        L_0x0109:
            return
        L_0x010a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x010a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18050w4.A01(X.0rv, int, int, int, long):void");
    }

    public void A02(C16740tZ r11, int i2) {
        int i3;
        int i4;
        AnonymousClass2IU r3 = new AnonymousClass2IU();
        r3.A05 = Integer.valueOf(i2);
        C28381Vw r6 = r11.A11;
        C15830rv r2 = r6.A00;
        boolean A0L = C16030sJ.A0L(r2);
        if (A0L) {
            i3 = 2;
        } else if (C16030sJ.A0Q(r2)) {
            i3 = 3;
        } else {
            i3 = 1;
            if (C16030sJ.A0H(r2)) {
                i3 = 4;
            }
        }
        r3.A07 = Integer.valueOf(i3);
        r3.A0C = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.A04.A00() - r11.A0G));
        byte b2 = r11.A10;
        int i5 = 1;
        if (b2 != 11) {
            i5 = 0;
            if (b2 == 31) {
                i5 = 2;
            }
        }
        r3.A08 = Integer.valueOf(i5);
        r3.A04 = Integer.valueOf(C18020w1.A06(r11));
        r3.A03 = Integer.valueOf(C18020w1.A02(this.A08, r11));
        boolean z2 = true;
        if (i2 == 1 && (r11 instanceof C38781rP)) {
            switch (((C38781rP) r11).A00) {
                case 1:
                    i4 = 1;
                    break;
                case 2:
                    i4 = 4;
                    break;
                case 3:
                    i4 = 5;
                    break;
                case 4:
                    i4 = 6;
                    break;
                case 5:
                    i4 = 2;
                    break;
                case 6:
                    i4 = 7;
                    break;
                case 7:
                    i4 = 3;
                    break;
                case 8:
                    i4 = 8;
                    break;
                case 9:
                    i4 = 9;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            r3.A06 = Integer.valueOf(i4);
        }
        Set A022 = this.A07.A02(r2);
        r3.A00 = Boolean.valueOf(this.A01.A0N(r2, r3.A03));
        r3.A09 = C30871d6.A00(this.A06, r2);
        int size = C16030sJ.A0A(this.A00, A022).size();
        int size2 = A022.size();
        if (size > 0) {
            r3.A0B = Long.valueOf(size <= 32 ? 32 : (long) size);
        }
        if (size2 > 0) {
            r3.A0A = Long.valueOf(size2 <= 32 ? 32 : (long) size2);
            r3.A02 = Integer.valueOf(C18020w1.A00(size2));
        }
        C14710pd r7 = this.A09;
        C16620tM r5 = C16620tM.A02;
        if (r7.A0E(r5, 2639) && r2 != null) {
            C15830rv A0B2 = (A0L || C16030sJ.A0G(r2)) ? r11.A0B() : null;
            StringBuilder sb = new StringBuilder();
            sb.append(r2.getRawString());
            sb.append("_");
            sb.append(r6.A01);
            sb.append("_");
            sb.append(r6.A02 ? 1 : 0);
            sb.append("_");
            sb.append(A0B2 != null ? A0B2.getRawString() : "0");
            r3.A0D = C18040w3.A00(this.A0B.A05(new Random()), sb.toString());
        }
        long j2 = ((SharedPreferences) this.A05.A01.get()).getLong("registration_initialized_time", 0);
        if (j2 != 0 && r11.A0I >= j2) {
            z2 = false;
        }
        r3.A01 = Boolean.valueOf(z2);
        boolean A0E = r7.A0E(r5, 2963);
        C16490t9 r0 = this.A0A;
        if (A0E) {
            r0.A04(r3);
        } else {
            r0.A05(r3);
        }
    }
}
