package X;

import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;

/* renamed from: X.2eJ  reason: invalid class name and case insensitive filesystem */
public final class C52702eJ implements C30881d7 {
    public boolean A00 = true;
    public final C16300so A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C18020w1 A04;
    public final C19000xb A05;
    public final C17150uc A06;
    public final AnonymousClass1TC A07;
    public final C222017a A08;
    public final C16000sG A09;
    public final C17030uP A0A;
    public final C18180wH A0B;
    public final C16440t3 A0C;
    public final C16980tz A0D;
    public final AnonymousClass013 A0E;
    public final C28861Yb A0F;
    public final C208211s A0G;
    public final AnonymousClass1GG A0H;
    public final C15810rt A0I;
    public final C16460t6 A0J;
    public final C223417o A0K;
    public final C221116r A0L;
    public final AnonymousClass15H A0M;
    public final AnonymousClass137 A0N;
    public final AnonymousClass173 A0O;
    public final C18030w2 A0P;
    public final C27731Sx A0Q;
    public final C14710pd A0R;
    public final C16490t9 A0S;
    public final C30861d5 A0T;
    public final C15830rv A0U;
    public final C15830rv A0V;
    public final Jid A0W;
    public final C27541Sd A0X;
    public final AnonymousClass1TD A0Y;
    public final C222517f A0Z;
    public final AnonymousClass124 A0a;
    public final C30841d3 A0b;
    public final AnonymousClass1GP A0c;
    public final C18300wT A0d;
    public final AnonymousClass17Y A0e;
    public final AnonymousClass12K A0f;
    public final C18090w8 A0g;
    public final C18290wS A0h;
    public final AnonymousClass1GF A0i;
    public final C30161br A0j;
    public final C222617g A0k;
    public final AnonymousClass1TS A0l;
    public final AnonymousClass1H2 A0m;
    public final C16320sq A0n;
    public final JniBridge A0o;
    public final Integer A0p;
    public final boolean A0q;

    public C52702eJ(C16300so r6, C14870pt r7, C16040sK r8, C18020w1 r9, C19000xb r10, C17150uc r11, AnonymousClass1TC r12, C222017a r13, C16000sG r14, C17030uP r15, C18180wH r16, C16440t3 r17, C16980tz r18, AnonymousClass013 r19, C28861Yb r20, C208211s r21, AnonymousClass1GG r22, C15810rt r23, C16460t6 r24, C223417o r25, C221116r r26, AnonymousClass15H r27, AnonymousClass137 r28, AnonymousClass173 r29, C18030w2 r30, C27731Sx r31, C14710pd r32, C16490t9 r33, C30861d5 r34, C27541Sd r35, AnonymousClass1TD r36, C222517f r37, AnonymousClass124 r38, C207811o r39, AnonymousClass1GP r40, C18300wT r41, AnonymousClass17Y r42, AnonymousClass12K r43, C18090w8 r44, C18290wS r45, AnonymousClass1GF r46, C30161br r47, C222617g r48, AnonymousClass1TS r49, AnonymousClass1H2 r50, C16320sq r51, JniBridge jniBridge, Integer num, boolean z2) {
        this.A0C = r17;
        this.A0R = r32;
        this.A02 = r7;
        this.A01 = r6;
        this.A03 = r8;
        this.A0D = r18;
        this.A0n = r51;
        this.A0o = jniBridge;
        this.A0I = r23;
        this.A0S = r33;
        this.A0a = r38;
        this.A0q = z2;
        this.A0Z = r37;
        this.A05 = r10;
        this.A09 = r14;
        this.A0P = r30;
        this.A0p = num;
        this.A0E = r19;
        this.A04 = r9;
        this.A0k = r48;
        this.A0h = r45;
        this.A0J = r24;
        this.A0Y = r36;
        this.A0G = r21;
        this.A0i = r46;
        this.A0K = r25;
        this.A0d = r41;
        this.A07 = r12;
        this.A0A = r15;
        this.A0N = r28;
        this.A0m = r50;
        this.A0X = r35;
        this.A0g = r44;
        this.A06 = r11;
        this.A0M = r27;
        this.A0O = r29;
        this.A0Q = r31;
        this.A0B = r16;
        this.A0c = r40;
        this.A0L = r26;
        this.A0H = r22;
        this.A0l = r49;
        this.A0e = r42;
        this.A0f = r43;
        this.A08 = r13;
        this.A0F = r20;
        C30161br r3 = r47;
        this.A0j = r3;
        this.A0T = r34;
        this.A0b = (C30841d3) r39.A00(0, r3.A06);
        Jid jid = r3.A0k;
        this.A0V = C16030sJ.A00(jid);
        Jid jid2 = r3.A08;
        this.A0U = C16030sJ.A00(jid2);
        this.A0W = (C16030sJ.A0L(jid) || C16030sJ.A0G(jid)) ? jid2 : jid;
    }

    public static void A00(AnonymousClass1TC r4, C16980tz r5, UserJid userJid, C16830ti r7) {
        C35171lU r0;
        C16880tn r2 = r7.A00;
        if (r2 != null && r2.A00 == 2 && (r0 = r2.A04) != null) {
            ArrayList arrayList = new ArrayList();
            for (C35141lR r02 : r0.A02) {
                for (C35161lT r03 : r02.A01) {
                    arrayList.add(r03.A00);
                }
            }
            String valueOf = String.valueOf((int) r5.A00.getResources().getDimension(R.dimen.dimen0529));
            r4.A01(new C55222j6(userJid, valueOf, valueOf, arrayList));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r5 == 67) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r5) {
        /*
            r4 = this;
            java.lang.String r1 = "decryptioncallbackv2/e2e failure, reason= "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1br r3 = r4.A0j
            boolean r0 = r3.A0f
            if (r0 != 0) goto L_0x0026
            r0 = 66
            if (r5 == r0) goto L_0x0020
            r0 = 67
            r1 = 5
            if (r5 != r0) goto L_0x0021
        L_0x0020:
            r1 = 6
        L_0x0021:
            X.0w1 r0 = r4.A04
            r0.A0K(r3, r1)
        L_0x0026:
            X.1d5 r1 = r4.A0T
            X.1d3 r0 = r4.A0b
            X.C454929a.A01(r1, r0, r5)
            boolean r0 = r4.A0q
            if (r0 == 0) goto L_0x003e
            r0 = 18
            X.17f r2 = r4.A0Z
            if (r5 != r0) goto L_0x0046
            r1 = 0
            java.lang.String r0 = "unknown-tags"
            r2.A08(r3, r0, r1)
        L_0x003e:
            X.0w1 r1 = r4.A04
            java.lang.Integer r0 = r4.A0p
            r1.A0L(r3, r0, r5)
            return
        L_0x0046:
            r2.A07(r3)
            r0 = 0
            r4.A00 = r0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52702eJ.A01(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.C33211iD r6) {
        /*
            r5 = this;
            X.1br r4 = r5.A0j
            X.1Vw r0 = r4.A0C
            if (r0 != 0) goto L_0x0008
            X.1Vw r0 = r4.A0m
        L_0x0008:
            X.0rv r2 = r0.A00
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            r3 = 1
            r1 = 0
            if (r0 == 0) goto L_0x008d
            X.0sK r2 = r5.A03
            com.whatsapp.jid.Jid r0 = r5.A0W
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r1 == 0) goto L_0x008b
            com.whatsapp.jid.UserJid r0 = r1.getUserJid()
            boolean r0 = r2.A0I(r0)
            if (r0 == 0) goto L_0x008b
            byte r1 = r1.device
            int r0 = r2.A00()
            if (r1 == r0) goto L_0x008b
            int r1 = r6.A00
            r0 = 2048(0x800, float:2.87E-42)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x008c
            X.2eo r0 = r6.A0b
            r2 = r0
            if (r0 != 0) goto L_0x003a
            X.2eo r0 = X.C53002eo.A0F
        L_0x003a:
            int r0 = r0.A00
            r1 = 32
            r0 = r0 & 32
            if (r0 == r1) goto L_0x008b
            r0 = r2
            if (r2 != 0) goto L_0x0047
            X.2eo r0 = X.C53002eo.A0F
        L_0x0047:
            int r0 = r0.A00
            r1 = 64
            r0 = r0 & 64
            if (r0 == r1) goto L_0x008b
            r0 = r2
            if (r2 != 0) goto L_0x0054
            X.2eo r0 = X.C53002eo.A0F
        L_0x0054:
            int r1 = r0.A00
            r0 = 256(0x100, float:3.59E-43)
            r1 = r1 & r0
            if (r1 == r0) goto L_0x008b
            r0 = r2
            if (r2 != 0) goto L_0x0060
            X.2eo r0 = X.C53002eo.A0F
        L_0x0060:
            int r1 = r0.A00
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 == r0) goto L_0x008b
            r0 = r2
            if (r2 != 0) goto L_0x006c
            X.2eo r0 = X.C53002eo.A0F
        L_0x006c:
            int r0 = r0.A00
            r1 = 16
            r0 = r0 & 16
            if (r0 == r1) goto L_0x008b
            r0 = r2
            if (r2 != 0) goto L_0x0079
            X.2eo r0 = X.C53002eo.A0F
        L_0x0079:
            int r1 = r0.A00
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = r1 & r0
            if (r1 == r0) goto L_0x008b
            if (r2 != 0) goto L_0x0084
            X.2eo r2 = X.C53002eo.A0F
        L_0x0084:
            int r1 = r2.A00
            r0 = 8192(0x2000, float:1.14794E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x008c
        L_0x008b:
            r3 = 0
        L_0x008c:
            return r3
        L_0x008d:
            boolean r0 = X.C16030sJ.A0L(r2)
            if (r0 == 0) goto L_0x00b8
            com.whatsapp.jid.Jid r0 = r4.A08
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            X.0sK r2 = r5.A03
            if (r1 == 0) goto L_0x008b
            com.whatsapp.jid.UserJid r0 = r1.getUserJid()
            boolean r0 = r2.A0I(r0)
            if (r0 == 0) goto L_0x008b
            byte r1 = r1.device
            int r0 = r2.A00()
            if (r1 == r0) goto L_0x008b
            X.1d1 r0 = r4.A0A
            if (r0 != 0) goto L_0x008b
            X.1d1 r0 = r4.A09
            if (r0 == 0) goto L_0x008b
            return r3
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52702eJ.A02(X.1iD):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.1rQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.0tZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v72, resolved type: X.1rY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: X.0ti} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v65, resolved type: X.0tZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: X.1rQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: X.1rQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: X.1rQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: X.1rQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: X.1rQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: X.1rQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v101, resolved type: X.1rQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: X.1rQ} */
    /* JADX WARNING: type inference failed for: r5v9, types: [X.0tZ] */
    /* JADX WARNING: type inference failed for: r4v66, types: [X.0tZ] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0455  */
    public void AHO(byte[] r61) {
        /*
            r60 = this;
            java.lang.String r0 = "decryptioncallbackv2/handlePlaintext message="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = r60
            X.1br r1 = r0.A0j
            r59 = r1
            r2.append(r1)
            java.lang.String r1 = " sendReceipt="
            r2.append(r1)
            boolean r1 = r0.A0q
            r16 = r1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1d5 r1 = r0.A0T
            r58 = r1
            X.1d3 r1 = r0.A0b
            r18 = r1
            r3 = r61
            r2 = r58
            byte[] r23 = X.C454929a.A02(r2, r1, r3)
            if (r23 != 0) goto L_0x0055
            java.lang.String r1 = "decryptioncallbackv2/axolotl derived invalid plaintext; message.key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r59
            X.1Vw r1 = r1.A0C
            if (r1 != 0) goto L_0x0046
            r1 = r59
            X.1Vw r1 = r1.A0m
        L_0x0046:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            r1 = 0
        L_0x0051:
            r0.A01(r1)
            return
        L_0x0055:
            X.1iD r2 = X.C33211iD.A0U(r23)     // Catch:{ 1bD -> 0x024a }
            boolean r1 = r0.A02(r2)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x007a
            int r3 = r2.A00     // Catch:{ 1bD -> 0x024a }
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 & r1
            if (r3 == r1) goto L_0x007a
            X.0w1 r3 = r0.A04     // Catch:{ 1bD -> 0x024a }
            com.whatsapp.jid.Jid r1 = r0.A0W     // Catch:{ 1bD -> 0x024a }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r1)     // Catch:{ 1bD -> 0x024a }
            r1 = 2
            r3.A0E(r2, r1)     // Catch:{ 1bD -> 0x024a }
            java.lang.String r1 = "Peers must use DeviceSentMessage proto"
            X.1bD r2 = new X.1bD     // Catch:{ 1bD -> 0x024a }
            r2.<init>(r1)     // Catch:{ 1bD -> 0x024a }
        L_0x0079:
            throw r2     // Catch:{ 1bD -> 0x024a }
        L_0x007a:
            boolean r1 = r0.A02(r2)     // Catch:{ 1bD -> 0x024a }
            if (r1 != 0) goto L_0x009b
            int r3 = r2.A00     // Catch:{ 1bD -> 0x024a }
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 & r1
            if (r3 != r1) goto L_0x009b
            X.0w1 r3 = r0.A04     // Catch:{ 1bD -> 0x024a }
            com.whatsapp.jid.Jid r1 = r0.A0W     // Catch:{ 1bD -> 0x024a }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r1)     // Catch:{ 1bD -> 0x024a }
            r1 = 1
            r3.A0E(r2, r1)     // Catch:{ 1bD -> 0x024a }
            java.lang.String r1 = "DeviceSentMessage proto only allowed from peer device"
            X.1bD r2 = new X.1bD     // Catch:{ 1bD -> 0x024a }
            r2.<init>(r1)     // Catch:{ 1bD -> 0x024a }
            goto L_0x0079
        L_0x009b:
            int r3 = r2.A00     // Catch:{ 1bD -> 0x024a }
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 & r1
            if (r3 != r1) goto L_0x00cc
            X.2tm r5 = r2.A0B     // Catch:{ 1bD -> 0x024a }
            if (r5 != 0) goto L_0x00a8
            X.2tm r5 = X.C58612tm.A04     // Catch:{ 1bD -> 0x024a }
        L_0x00a8:
            int r4 = r5.A00     // Catch:{ 1bD -> 0x024a }
            r3 = 2
            r1 = r4 & 2
            if (r1 != r3) goto L_0x01ce
            r3 = 1
            r1 = r4 & 1
            if (r1 != r3) goto L_0x01ce
            java.lang.String r1 = r5.A02     // Catch:{ 1bD -> 0x024a }
            X.0rv r3 = X.C15830rv.A01(r1)     // Catch:{ 1W4 -> 0x01ce }
            r1 = r59
            X.1Vw r1 = r1.A0C     // Catch:{ 1bD -> 0x024a }
            if (r1 != 0) goto L_0x00c4
            r1 = r59
            X.1Vw r1 = r1.A0m     // Catch:{ 1bD -> 0x024a }
        L_0x00c4:
            X.0rv r1 = r1.A00     // Catch:{ 1bD -> 0x024a }
            boolean r1 = r3.equals(r1)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x01ce
        L_0x00cc:
            int r1 = r2.A01     // Catch:{ 1bD -> 0x024a }
            r3 = 1
            r1 = r1 & 1
            if (r1 != r3) goto L_0x00f5
            r1 = r59
            X.41t r3 = r1.A0D     // Catch:{ 1bD -> 0x024a }
            X.41t r1 = X.C798941t.BUTTON     // Catch:{ 1bD -> 0x024a }
            if (r3 == r1) goto L_0x00f5
            X.2uG r1 = r2.A03     // Catch:{ 1bD -> 0x024a }
            r3 = r1
            if (r1 != 0) goto L_0x00e2
            X.2uG r1 = X.C58852uG.A08     // Catch:{ 1bD -> 0x024a }
        L_0x00e2:
            X.1XE r1 = r1.A03     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x00f3
            if (r3 != 0) goto L_0x00ea
            X.2uG r3 = X.C58852uG.A08     // Catch:{ 1bD -> 0x024a }
        L_0x00ea:
            X.1XE r1 = r3.A03     // Catch:{ 1bD -> 0x024a }
            boolean r1 = r1.isEmpty()     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r5 = 0
            goto L_0x00f6
        L_0x00f5:
            r5 = 1
        L_0x00f6:
            int r3 = r2.A00     // Catch:{ 1bD -> 0x024a }
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 & r1
            if (r3 != r1) goto L_0x0106
            r1 = r59
            X.41t r3 = r1.A0D     // Catch:{ 1bD -> 0x024a }
            X.41t r1 = X.C798941t.LIST     // Catch:{ 1bD -> 0x024a }
            r4 = 0
            if (r3 != r1) goto L_0x0107
        L_0x0106:
            r4 = 1
        L_0x0107:
            boolean r1 = r2.A0f()     // Catch:{ 1bD -> 0x024a }
            if (r1 != 0) goto L_0x0113
            boolean r1 = r2.A0e()     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x0125
        L_0x0113:
            r1 = r59
            X.41t r3 = r1.A0D     // Catch:{ 1bD -> 0x024a }
            X.41t r1 = X.C798941t.BIZ     // Catch:{ 1bD -> 0x024a }
            if (r3 != r1) goto L_0x0127
            r3 = 32
            r1 = r59
            int r1 = r1.A03     // Catch:{ 1bD -> 0x024a }
            r1 = r1 & 32
            if (r1 != r3) goto L_0x0127
        L_0x0125:
            r1 = 1
            goto L_0x0128
        L_0x0127:
            r1 = 0
        L_0x0128:
            if (r5 == 0) goto L_0x01c5
            if (r4 == 0) goto L_0x01c5
            if (r1 == 0) goto L_0x01c5
            X.1iD r3 = X.C454929a.A00(r2)     // Catch:{ 1bD -> 0x024a }
            r1 = r59
            java.lang.String r6 = r1.A0X     // Catch:{ 1bD -> 0x024a }
            X.0wH r5 = r0.A0B     // Catch:{ 1bD -> 0x024a }
            X.1Qr r1 = X.C41061vA.A00(r5, r3)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x01ba
            java.lang.String r4 = r1.A00()     // Catch:{ 1bD -> 0x024a }
        L_0x0142:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x014e
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 1bD -> 0x024a }
            if (r1 != 0) goto L_0x015a
        L_0x014e:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 1bD -> 0x024a }
            if (r1 != 0) goto L_0x0181
            boolean r1 = r6.equals(r4)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x0181
        L_0x015a:
            X.1Qr r1 = X.C41061vA.A00(r5, r3)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x01e3
            java.lang.String r4 = r1.A00()     // Catch:{ 1bD -> 0x024a }
            if (r4 == 0) goto L_0x01e3
            java.util.Map r1 = r5.A00     // Catch:{ 1bD -> 0x024a }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ 1bD -> 0x024a }
            X.1Qr r4 = (X.C27161Qr) r4     // Catch:{ 1bD -> 0x024a }
            if (r4 == 0) goto L_0x01e3
            r1 = r59
            boolean r1 = r4.A04(r3, r1)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x01e3
            java.lang.String r1 = "Extensions Flow id is not owned by the sender jid"
            X.1bD r2 = new X.1bD     // Catch:{ 1bD -> 0x024a }
            r2.<init>(r1)     // Catch:{ 1bD -> 0x024a }
            goto L_0x0079
        L_0x0181:
            r1 = r59
            java.lang.String r6 = r1.A0X     // Catch:{ 1bD -> 0x024a }
            X.1Qr r1 = X.C41061vA.A00(r5, r3)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x01b8
            java.lang.String r4 = r1.A00()     // Catch:{ 1bD -> 0x024a }
        L_0x018f:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x019b
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 1bD -> 0x024a }
            if (r1 != 0) goto L_0x015a
        L_0x019b:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 1bD -> 0x024a }
            if (r1 != 0) goto L_0x01bc
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 1bD -> 0x024a }
            if (r1 != 0) goto L_0x01bc
            java.util.Map r1 = r5.A01     // Catch:{ 1bD -> 0x024a }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ 1bD -> 0x024a }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x01bc
            boolean r1 = r1.contains(r4)     // Catch:{ 1bD -> 0x024a }
            if (r1 == 0) goto L_0x01bc
            goto L_0x015a
        L_0x01b8:
            r4 = 0
            goto L_0x018f
        L_0x01ba:
            r4 = 0
            goto L_0x0142
        L_0x01bc:
            java.lang.String r1 = "Native flow name in envelope and proto must be consistent or an identified pair"
            X.1bD r2 = new X.1bD     // Catch:{ 1bD -> 0x024a }
            r2.<init>(r1)     // Catch:{ 1bD -> 0x024a }
            goto L_0x0079
        L_0x01c5:
            java.lang.String r1 = "Message type for list/button/template in envelope and proto must be consistent"
            X.1bD r2 = new X.1bD     // Catch:{ 1bD -> 0x024a }
            r2.<init>(r1)     // Catch:{ 1bD -> 0x024a }
            goto L_0x0079
        L_0x01ce:
            X.0w1 r3 = r0.A04     // Catch:{ 1bD -> 0x024a }
            com.whatsapp.jid.Jid r1 = r0.A0W     // Catch:{ 1bD -> 0x024a }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r1)     // Catch:{ 1bD -> 0x024a }
            r1 = 3
            r3.A0E(r2, r1)     // Catch:{ 1bD -> 0x024a }
            java.lang.String r1 = "invalid DeviceSentMessage"
            X.1bD r2 = new X.1bD     // Catch:{ 1bD -> 0x024a }
            r2.<init>(r1)     // Catch:{ 1bD -> 0x024a }
            goto L_0x0079
        L_0x01e3:
            X.1iD r1 = X.C454929a.A00(r2)     // Catch:{ 1bD -> 0x024a }
            java.util.List r22 = X.C41061vA.A09(r1)
            int r3 = X.C41071vB.A0J(r1)
            java.lang.String r2 = "decryptioncallbackv2/ messageTypes = "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r2 = r22
            r4.append(r2)
            java.lang.String r2 = " : numUnknownTags = "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = 2
            if (r3 < r2) goto L_0x020e
            goto L_0x026a
        L_0x020e:
            X.0pd r2 = r0.A0R
            r32 = r2
            X.0so r2 = r0.A01
            r57 = r2
            r4 = r2
            r3 = r32
            r2 = r22
            boolean r2 = X.C41061vA.A0D(r4, r3, r1, r2)
            if (r2 != 0) goto L_0x029a
            java.lang.String r1 = "decryptioncallbackv2/received an invalid protobuf; message.key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r59
            X.1Vw r1 = r1.A0C
            if (r1 != 0) goto L_0x0232
            r1 = r59
            X.1Vw r1 = r1.A0m
        L_0x0232:
            r2.append(r1)
            java.lang.String r1 = " messageTypes="
            r2.append(r1)
            r1 = r22
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            r1 = 12
            goto L_0x0051
        L_0x024a:
            r3 = move-exception
            java.lang.String r1 = "decryptioncallbackv2/axolotl derived plaintext does not represent valid protocol buffer; message.key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r59
            X.1Vw r1 = r1.A0C
            if (r1 != 0) goto L_0x025c
            r1 = r59
            X.1Vw r1 = r1.A0m
        L_0x025c:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.w(r1, r3)
            r1 = 11
            goto L_0x0051
        L_0x026a:
            java.lang.String r1 = "decryptioncallbackv2/axolotl received several unknown tags; message.key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r59
            X.1Vw r1 = r1.A0C
            if (r1 != 0) goto L_0x027b
            r1 = r59
            X.1Vw r1 = r1.A0m
        L_0x027b:
            r2.append(r1)
            java.lang.String r1 = " numUnknownTags="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            r3 = 18
            r2 = r58
            r1 = r18
            X.C454929a.A01(r2, r1, r3)
            r0.A01(r3)
            return
        L_0x029a:
            com.whatsapp.jid.Jid r2 = r0.A0W
            X.0rv r17 = X.C16030sJ.A00(r2)
            X.1Vr r9 = new X.1Vr
            r9.<init>()
            r2 = -1
            r9.A03 = r2
            r2 = r59
            int r2 = r2.A05
            r9.A01 = r2
            com.whatsapp.jid.UserJid r6 = com.whatsapp.jid.UserJid.of(r17)
            r2 = r59
            java.lang.Long r2 = r2.A0P
            if (r2 == 0) goto L_0x048c
            if (r6 == 0) goto L_0x048c
            X.0uP r8 = r0.A0A
            java.util.Map r2 = r8.A0A
            r2.remove(r6)
            X.1Vq r12 = r8.A00(r6)
            java.lang.String r2 = "decryptioncallbackv2/verified name = "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r2 = r59
            java.lang.Long r2 = r2.A0P
            r3.append(r2)
            java.lang.String r2 = " : "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            int r2 = X.C32441gM.A00(r12)
            r9.A02 = r2
            r11 = 0
            r10 = 0
            r7 = 1
            if (r12 == 0) goto L_0x0382
            long r2 = r12.A05
            r4 = r59
            java.lang.Long r4 = r4.A0P
            long r13 = r4.longValue()
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x036f
            java.lang.String r5 = "DecryptionCallbackV2verified name serial changed; jid="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = " "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " -> "
            r4.append(r2)
            r2 = r59
            java.lang.Long r2 = r2.A0P
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
            int r2 = r12.A03
            r9.A03 = r2
            java.lang.String r2 = r12.A08
            r9.A07 = r2
            X.1ta r2 = r12.A00()
            r9.A05 = r2
            r8.A01(r6)
        L_0x0331:
            r21 = 1
        L_0x0333:
            r2 = r59
            java.lang.Long r4 = r2.A0O
            java.lang.Long r3 = r2.A0N
            if (r4 == 0) goto L_0x03a3
            if (r3 == 0) goto L_0x03a3
            java.lang.String r2 = "decryptioncallbackv2/triggred_block expiration_ts = "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            r5.append(r4)
            java.lang.String r2 = " cooldown = "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            long r4 = r4.longValue()
            r19 = 0
            int r2 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r2 <= 0) goto L_0x03a3
            long r13 = r3.longValue()
            int r2 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r2 <= 0) goto L_0x03a3
            X.17a r15 = r0.A08
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r2
            long r2 = r2 * r13
            goto L_0x0389
        L_0x036f:
            r9.A08 = r7
            int r2 = r12.A03
            r9.A03 = r2
            java.lang.String r2 = r12.A08
            r9.A07 = r2
            X.1ta r2 = r12.A00()
            r9.A05 = r2
            r21 = 0
            goto L_0x0333
        L_0x0382:
            r9.A03 = r10
            r9.A07 = r11
            r9.A05 = r11
            goto L_0x0331
        L_0x0389:
            org.json.JSONObject r14 = r15.A01(r6)     // Catch:{ JSONException -> 0x03a3 }
            if (r14 != 0) goto L_0x0394
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03a3 }
            r14.<init>()     // Catch:{ JSONException -> 0x03a3 }
        L_0x0394:
            java.lang.String r13 = "tb_expired_ts"
            r14.put(r13, r4)     // Catch:{ JSONException -> 0x03a3 }
            java.lang.String r4 = "tb_cooldown"
            r14.put(r4, r2)     // Catch:{ JSONException -> 0x03a3 }
            r15.A02(r6, r14)     // Catch:{ JSONException -> 0x03a3 }
        L_0x03a3:
            if (r21 == 0) goto L_0x0455
            r2 = r59
            byte[] r4 = r2.A0i
            if (r4 == 0) goto L_0x03e0
            if (r12 == 0) goto L_0x0434
            X.1ta r3 = r12.A00()
            X.1ta r7 = r2.A0E
            long r2 = r3.privacyModeTs
            r12 = 0
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0434
            if (r7 == 0) goto L_0x03c3
            long r2 = r7.privacyModeTs
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0434
        L_0x03c3:
            java.lang.String r2 = "decryptioncallbackv2/missing privacy mode. userJid="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r6)
            java.lang.String r2 = ". id="
            r3.append(r2)
            r2 = r59
            java.lang.String r2 = r2.A0o
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x03e0:
            r10 = r21
        L_0x03e2:
            r7 = 0
        L_0x03e3:
            X.1Vq r3 = r8.A00(r6)
            int r2 = X.C32441gM.A00(r3)
            r9.A00 = r2
            if (r3 == 0) goto L_0x03f9
            java.lang.String r2 = r3.A08
            r9.A06 = r2
            X.1ta r2 = r3.A00()
            r9.A04 = r2
        L_0x03f9:
            if (r10 != 0) goto L_0x0428
            if (r7 == 0) goto L_0x04b6
            java.lang.String r2 = "decryptmessagerunnable/usync vlevel/privacy mismatch. jid="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r2 = r17
            r3.append(r2)
            java.lang.String r2 = " vlevel="
            r3.append(r2)
            r2 = r59
            int r2 = r2.A05
            r3.append(r2)
            java.lang.String r2 = " privacy mode="
            r3.append(r2)
            r2 = r59
            X.1ta r2 = r2.A0E
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0428:
            X.0xb r3 = r0.A05
            com.obwhatsapp.jobqueue.job.GetVNameCertificateJob r2 = new com.obwhatsapp.jobqueue.job.GetVNameCertificateJob
            r2.<init>(r6)
            r3.A00(r2)
            goto L_0x04b6
        L_0x0434:
            r2 = r59
            int r3 = r2.A05
            X.1ta r2 = r2.A0E
            boolean r2 = r8.A04(r6, r2, r4, r3)
            if (r2 == 0) goto L_0x03e0
            X.0sq r5 = r0.A0n
            r4 = 40
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r3 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r2 = r17
            r3.<init>(r0, r4, r2)
            r5.Acl(r3)
            r9.A03 = r10
            r9.A07 = r11
            r9.A05 = r11
            goto L_0x03e2
        L_0x0455:
            X.1ta r3 = r9.A05
            r2 = r59
            X.1ta r10 = r2.A0E
            if (r3 == 0) goto L_0x0472
            long r2 = r3.privacyModeTs
            r12 = 0
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0470
            if (r10 == 0) goto L_0x046d
            long r4 = r10.privacyModeTs
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0485
        L_0x046d:
            r10 = 0
            goto L_0x03e3
        L_0x0470:
            if (r10 != 0) goto L_0x0485
        L_0x0472:
            int r3 = r9.A03
            r2 = r59
            int r2 = r2.A05
            if (r3 == r2) goto L_0x03e0
        L_0x047a:
            r2 = r59
            int r2 = r2.A05
            boolean r2 = r8.A03(r6, r10, r2, r7)
            r7 = r2 ^ 1
            goto L_0x046d
        L_0x0485:
            long r4 = r10.privacyModeTs
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x0472
            goto L_0x047a
        L_0x048c:
            X.0sG r2 = r0.A09
            X.0sH r3 = r2.A08(r6)
            if (r3 == 0) goto L_0x04b6
            boolean r2 = r3.A0H()
            if (r2 == 0) goto L_0x04b6
            int r2 = r3.A06
            r9.A03 = r2
            java.lang.String r2 = "decryptmessagerunnable/verified name serial not present on message, clearing state; jid="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r2 = r17
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
            X.0uP r2 = r0.A0A
            r2.A01(r6)
        L_0x04b6:
            X.1Vs r8 = r9.A01()
            int r3 = r1.A00
            r2 = 1024(0x400, float:1.435E-42)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x0608
            r2 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r2 = r58
            r2.A08 = r3
            if (r16 == 0) goto L_0x04d6
            X.17f r3 = r0.A0Z
            r2 = r59
            r3.A07(r2)
            r9 = 0
        L_0x04d4:
            r0.A00 = r9
        L_0x04d6:
            int r2 = r1.A00
            r3 = 2
            r2 = r2 & 2
            if (r2 != r3) goto L_0x0549
            java.lang.String r2 = "decryptioncallbackv2/axolotl received sender key distribution message; message.key="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r2 = r59
            X.1Vw r2 = r2.A0C
            if (r2 != 0) goto L_0x04ee
            r2 = r59
            X.1Vw r2 = r2.A0m
        L_0x04ee:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.2tY r4 = r1.A0h
            if (r4 != 0) goto L_0x04fe
            X.2tY r4 = X.C58472tY.A03
        L_0x04fe:
            int r5 = r4.A00
            r3 = 1
            r2 = r5 & 1
            if (r2 != r3) goto L_0x05ff
            r3 = 2
            r2 = r5 & 2
            if (r2 != r3) goto L_0x05ff
            X.0rv r3 = r0.A0V
            boolean r2 = X.C16030sJ.A0L(r3)
            if (r2 == 0) goto L_0x0563
            java.lang.String r3 = r3.getRawString()
            java.lang.String r2 = r4.A02
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0563
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "decryptioncallbackv2/group id on message and group id in ciphertext do not match; message.key="
        L_0x0525:
            r3.append(r2)
            r2 = r59
            X.1Vw r2 = r2.A0C
            if (r2 != 0) goto L_0x0532
            r2 = r59
            X.1Vw r2 = r2.A0m
        L_0x0532:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x053c:
            if (r16 == 0) goto L_0x0549
            boolean r2 = r0.A00
            if (r2 == 0) goto L_0x0549
            X.17f r3 = r0.A0Z
            r2 = r59
            r3.A07(r2)
        L_0x0549:
            com.whatsapp.jid.Jid r2 = r0.A0W
            com.whatsapp.jid.DeviceJid r4 = com.whatsapp.jid.DeviceJid.of(r2)
            if (r4 != 0) goto L_0x0edf
            java.lang.String r1 = "decryptioncallbackv2/processIcdcData sender is not a userJid jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0563:
            java.lang.String r3 = r4.A02
            X.1Yb r2 = r0.A0F
            X.1dH r7 = new X.1dH
            r7.<init>(r2, r3)
            X.11s r3 = r0.A0G
            X.1Ww r2 = r4.A01
            byte[] r4 = r2.A04()
            X.0xT r2 = r3.A0I
            java.util.concurrent.locks.Lock r8 = r2.A03(r7)
            if (r8 != 0) goto L_0x057d
            goto L_0x0581
        L_0x057d:
            r8.lock()     // Catch:{ all -> 0x0f65 }
            goto L_0x0586
        L_0x0581:
            X.16P r2 = r3.A0H     // Catch:{ all -> 0x0f65 }
            r2.A00()     // Catch:{ all -> 0x0f65 }
        L_0x0586:
            X.1mo r3 = r3.A00     // Catch:{ all -> 0x0f65 }
            java.lang.String r5 = "axolotl"
            X.1my r6 = new X.1my     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            r6.<init>(r4)     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            X.16P r2 = r3.A02     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            boolean r2 = r2.A01()     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            if (r2 == 0) goto L_0x05af
            X.1mn r2 = r3.A00     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            X.1mu r2 = r2.A02     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            X.1mv r4 = new X.1mv     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            r4.<init>(r2)     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            X.1mw r2 = X.C31811f4.A02(r7)     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            java.lang.Object r3 = X.C36071mx.A02     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            monitor-enter(r3)     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            r4.A01(r2, r6)     // Catch:{ all -> 0x05ac }
            monitor-exit(r3)     // Catch:{ all -> 0x05ac }
            goto L_0x05bf
        L_0x05ac:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x05ac }
            throw r2     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
        L_0x05af:
            X.1mn r2 = r3.A00     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            X.1mu r2 = r2.A02     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            X.1mv r3 = new X.1mv     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            r3.<init>(r2)     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            X.1mw r2 = X.C31811f4.A02(r7)     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
            r3.A01(r2, r6)     // Catch:{ 1n7 -> 0x05c6, 1n6 -> 0x05c1 }
        L_0x05bf:
            r4 = 0
            goto L_0x05cf
        L_0x05c1:
            r2 = move-exception
            com.whatsapp.util.Log.w(r5, r2)     // Catch:{ all -> 0x0f65 }
            goto L_0x05cd
        L_0x05c6:
            r2 = move-exception
            com.whatsapp.util.Log.w(r5, r2)     // Catch:{ all -> 0x0f65 }
            r4 = -1007(0xfffffffffffffc11, float:NaN)
            goto L_0x05cf
        L_0x05cd:
            r4 = -1005(0xfffffffffffffc13, float:NaN)
        L_0x05cf:
            if (r8 == 0) goto L_0x05d4
            r8.unlock()
        L_0x05d4:
            java.lang.String r3 = "decryptioncallbackv2/processSenderKeyDistributionMessage/status/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = -1005(0xfffffffffffffc13, float:NaN)
            if (r4 != r2) goto L_0x05f2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "decryptioncallbackv2/axolotl received invalid sender key distribution message; message.key="
            goto L_0x0525
        L_0x05f2:
            r2 = -1007(0xfffffffffffffc11, float:NaN)
            if (r4 != r2) goto L_0x053c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "decryptioncallbackv2/axolotl received legacy sender key distribution message; message.key="
            goto L_0x0525
        L_0x05ff:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "decryptioncallbackv2/axolotl received incomplete sender key distribution message; message.key="
            goto L_0x0525
        L_0x0608:
            int r2 = r22.size()
            r7 = 1
            if (r2 != r7) goto L_0x0805
            r2 = r59
            int r2 = r2.A01
            if (r2 != 0) goto L_0x0805
            r3 = 32
            r2 = r59
            int r2 = r2.A03
            r2 = r2 & 32
            if (r2 != r3) goto L_0x0805
            boolean r9 = r0.A00
            X.1TD r7 = r0.A0Y
            X.4Eb r6 = new X.4Eb
            r6.<init>(r0)
            r27 = 0
            boolean r10 = r1.A0f()
            if (r10 == 0) goto L_0x066d
            X.2uY r2 = r1.A0k
            r5 = r2
            if (r2 != 0) goto L_0x0637
            X.2uY r2 = X.C59022uY.A06
        L_0x0637:
            int r2 = r2.A00
            r3 = 16
            r2 = r2 & 16
            if (r2 != r3) goto L_0x066d
        L_0x063f:
            if (r5 != 0) goto L_0x0643
            X.2uY r5 = X.C59022uY.A06
        L_0x0643:
            r2 = r59
            com.whatsapp.jid.Jid r3 = r2.A0k
            X.0rv r2 = X.C16030sJ.A00(r3)
            boolean r2 = X.C16030sJ.A0L(r2)
            if (r2 != 0) goto L_0x0664
            X.0rv r2 = X.C16030sJ.A00(r3)
            boolean r2 = X.C16030sJ.A0G(r2)
            if (r2 != 0) goto L_0x0664
            X.0rv r12 = X.C16030sJ.A00(r3)
        L_0x065f:
            r15 = 1
            r4 = -1
            if (r5 == 0) goto L_0x06d4
            goto L_0x068b
        L_0x0664:
            r2 = r59
            com.whatsapp.jid.Jid r2 = r2.A08
            X.0rv r12 = X.C16030sJ.A00(r2)
            goto L_0x065f
        L_0x066d:
            boolean r2 = r1.A0e()
            if (r2 == 0) goto L_0x0689
            X.29b r2 = r1.A0M
            r4 = r2
            if (r2 != 0) goto L_0x067a
            X.29b r2 = X.C455029b.A0A
        L_0x067a:
            int r2 = r2.A00
            r3 = 64
            r2 = r2 & 64
            if (r2 != r3) goto L_0x0689
            if (r4 != 0) goto L_0x0686
            X.29b r4 = X.C455029b.A0A
        L_0x0686:
            X.2uY r5 = r4.A03
            goto L_0x063f
        L_0x0689:
            r5 = 0
            goto L_0x0643
        L_0x068b:
            X.17g r10 = r7.A0D     // Catch:{ 23S -> 0x0781 }
            r3 = r58
            r2 = r59
            X.0tZ r13 = r7.A01(r3, r5, r2, r10)     // Catch:{ 23S -> 0x0781 }
            if (r13 == 0) goto L_0x06c9
            X.1ta r2 = r8.A05     // Catch:{ 23S -> 0x0781 }
            X.1ta r3 = r8.A04     // Catch:{ 23S -> 0x0781 }
            boolean r2 = X.C47402Iv.A01(r2, r3)     // Catch:{ 23S -> 0x0781 }
            if (r2 == 0) goto L_0x06a8
            r13.A0V = r3     // Catch:{ 23S -> 0x0781 }
            r2 = 4096(0x1000, float:5.74E-42)
            r13.A0S(r2)     // Catch:{ 23S -> 0x0781 }
        L_0x06a8:
            boolean r2 = r8.A08     // Catch:{ 23S -> 0x0781 }
            r13.A0y = r2     // Catch:{ 23S -> 0x0781 }
            X.0t6 r2 = r7.A06     // Catch:{ 23S -> 0x0781 }
            r2.A0u(r13)     // Catch:{ 23S -> 0x0781 }
            X.153 r11 = r7.A07     // Catch:{ 23S -> 0x0781 }
            X.2uZ r2 = r5.A03     // Catch:{ 23S -> 0x0781 }
            if (r2 != 0) goto L_0x06b9
            X.2uZ r2 = X.C59032uZ.A07     // Catch:{ 23S -> 0x0781 }
        L_0x06b9:
            java.lang.String r10 = r2.A06     // Catch:{ 23S -> 0x0781 }
            X.126 r5 = r11.A00     // Catch:{ 23S -> 0x0781 }
            r2 = 20
            com.facebook.redex.RunnableRunnableShape0S1200000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S1200000_I0     // Catch:{ 23S -> 0x0781 }
            r3.<init>(r13, r10, r11, r2)     // Catch:{ 23S -> 0x0781 }
            r2 = 48
            r5.A01(r3, r2)     // Catch:{ 23S -> 0x0781 }
        L_0x06c9:
            int r2 = r8.A03     // Catch:{ 23S -> 0x0781 }
            if (r2 == r4) goto L_0x0802
            X.0t6 r2 = r7.A06     // Catch:{ 23S -> 0x0781 }
            r2.A0R(r12, r8)     // Catch:{ 23S -> 0x0781 }
            goto L_0x0802
        L_0x06d4:
            if (r10 == 0) goto L_0x0768
            X.2uY r2 = r1.A0k
            if (r2 != 0) goto L_0x06dc
            X.2uY r2 = X.C59022uY.A06
        L_0x06dc:
            int r3 = r2.A01
            r2 = 5
            if (r3 != r2) goto L_0x07df
            X.0pd r13 = r7.A09     // Catch:{ 23S -> 0x0781 }
            r3 = 2813(0xafd, float:3.942E-42)
            X.0tM r2 = X.C16620tM.A02     // Catch:{ 23S -> 0x0781 }
            boolean r2 = r13.A0E(r2, r3)     // Catch:{ 23S -> 0x0781 }
            if (r2 != 0) goto L_0x0711
            r2 = r59
            X.1Vw r5 = r2.A0C     // Catch:{ 23S -> 0x0781 }
            if (r5 != 0) goto L_0x06f5
            X.1Vw r5 = r2.A0m     // Catch:{ 23S -> 0x0781 }
        L_0x06f5:
            long r2 = r2.A0j     // Catch:{ 23S -> 0x0781 }
            byte[] r19 = r1.A02()     // Catch:{ 23S -> 0x0781 }
            r20 = 2
            X.1rQ r4 = new X.1rQ     // Catch:{ 23S -> 0x0781 }
            r21 = r2
            r17 = r4
            r18 = r5
            r17.<init>(r18, r19, r20, r21)     // Catch:{ 23S -> 0x0781 }
        L_0x0708:
            X.1Sd r3 = r7.A0A     // Catch:{ 23S -> 0x0781 }
            r2 = r59
            r3.A00(r4, r2)     // Catch:{ 23S -> 0x0781 }
            goto L_0x0802
        L_0x0711:
            X.0t6 r14 = r7.A06     // Catch:{ 23S -> 0x0781 }
            X.17f r11 = r7.A0B     // Catch:{ 23S -> 0x0781 }
            X.0so r10 = r7.A00     // Catch:{ 23S -> 0x0781 }
            r2 = r59
            X.1Vw r8 = r2.A0C     // Catch:{ 23S -> 0x0781 }
            if (r8 != 0) goto L_0x071f
            X.1Vw r8 = r2.A0m     // Catch:{ 23S -> 0x0781 }
        L_0x071f:
            long r3 = r2.A0j     // Catch:{ 23S -> 0x0781 }
            X.173 r5 = r7.A08     // Catch:{ 23S -> 0x0781 }
            X.17g r2 = r7.A0D     // Catch:{ 23S -> 0x0781 }
            r28 = 0
            r19 = r5
            r20 = r13
            r21 = r11
            r22 = r1
            r23 = r8
            r24 = r2
            r25 = r3
            r17 = r10
            r18 = r14
            X.0tZ r4 = X.C61983Be.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)     // Catch:{ 23S -> 0x0781 }
            boolean r2 = r4 instanceof X.C16830ti     // Catch:{ 23S -> 0x0781 }
            if (r2 == 0) goto L_0x074f
            com.whatsapp.jid.UserJid r8 = com.whatsapp.jid.UserJid.of(r12)     // Catch:{ 23S -> 0x0781 }
            r5 = r4
            X.0ti r5 = (X.C16830ti) r5     // Catch:{ 23S -> 0x0781 }
            X.1TC r3 = r7.A02     // Catch:{ 23S -> 0x0781 }
            X.0tz r2 = r7.A04     // Catch:{ 23S -> 0x0781 }
            A00(r3, r2, r8, r5)     // Catch:{ 23S -> 0x0781 }
        L_0x074f:
            X.153 r10 = r7.A07     // Catch:{ 23S -> 0x0781 }
            X.2uY r2 = r1.A0k     // Catch:{ 23S -> 0x0781 }
            if (r2 != 0) goto L_0x0757
            X.2uY r2 = X.C59022uY.A06     // Catch:{ 23S -> 0x0781 }
        L_0x0757:
            java.lang.String r8 = r2.A05     // Catch:{ 23S -> 0x0781 }
            X.126 r5 = r10.A00     // Catch:{ 23S -> 0x0781 }
            r2 = 20
            com.facebook.redex.RunnableRunnableShape0S1200000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S1200000_I0     // Catch:{ 23S -> 0x0781 }
            r3.<init>(r4, r8, r10, r2)     // Catch:{ 23S -> 0x0781 }
            r2 = 48
            r5.A01(r3, r2)     // Catch:{ 23S -> 0x0781 }
            goto L_0x0708
        L_0x0768:
            boolean r2 = r1.A0e()
            if (r2 == 0) goto L_0x078e
            r3 = r58
            r2 = r59
            boolean r15 = r7.A02(r3, r6, r1, r2)     // Catch:{ 23S -> 0x0781 }
            int r2 = r8.A03     // Catch:{ 23S -> 0x0781 }
            if (r2 == r4) goto L_0x0802
            X.0t6 r2 = r7.A06     // Catch:{ 23S -> 0x0781 }
            r2.A0R(r12, r8)     // Catch:{ 23S -> 0x0781 }
            goto L_0x0802
        L_0x0781:
            r2 = move-exception
            java.lang.Integer r2 = r2.e2eFailureReason
            int r3 = r2.intValue()
            X.2eJ r2 = r6.A00
            r2.A01(r3)
            goto L_0x0802
        L_0x078e:
            r3 = 19
            r2 = r59
            X.0tZ r10 = r2.A02(r3)
            X.0t6 r3 = r7.A06
            r3.A0u(r10)
            int r2 = r8.A03
            if (r2 == r4) goto L_0x07a2
            r3.A0R(r12, r8)
        L_0x07a2:
            X.17f r3 = r7.A0B
            byte r4 = r10.A10
            r2 = 19
            if (r4 == r2) goto L_0x07c7
            java.lang.String r2 = "skipping permanent failure receipt due to wrong type. type="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r4)
            java.lang.String r2 = " key="
            r3.append(r2)
            X.1Vw r2 = r10.A11
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            goto L_0x0802
        L_0x07c7:
            X.0xb r6 = r3.A00
            X.1Vw r2 = r10.A11
            X.0rv r5 = r2.A00
            X.AnonymousClass00B.A06(r5)
            X.0rv r4 = r10.A0B()
            java.lang.String r3 = r2.A01
            com.obwhatsapp.jobqueue.job.SendPermanentFailureReceiptJob r2 = new com.obwhatsapp.jobqueue.job.SendPermanentFailureReceiptJob
            r2.<init>(r5, r4, r3)
            r6.A00(r2)
            goto L_0x0802
        L_0x07df:
            r3 = r58
            r2 = r59
            android.util.Pair r3 = r7.A00(r3, r6, r1, r2)
            java.lang.Object r2 = r3.first
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x07fa
            int r2 = r8.A03
            if (r2 == r4) goto L_0x07fa
            X.0t6 r2 = r7.A06
            r2.A0R(r12, r8)
        L_0x07fa:
            java.lang.Object r2 = r3.second
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r15 = r2.booleanValue()
        L_0x0802:
            r9 = r9 & r15
            goto L_0x04d4
        L_0x0805:
            int r2 = r22.size()
            if (r2 != r7) goto L_0x04d6
            java.lang.String r2 = "decryptioncallbackv2/regular message"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0wH r5 = r0.A0B     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r32
            boolean r2 = X.C41061vA.A0E(r5, r2, r1)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 != 0) goto L_0x0c94
            r2 = r59
            boolean r2 = r2.A0d     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 != 0) goto L_0x0c94
            boolean r2 = r1.A0f()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x084e
            r3 = 32
            r2 = r59
            int r2 = r2.A03     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r2 & 32
            if (r2 != r3) goto L_0x0cdb
            boolean r6 = r0.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1TD r5 = r0.A0Y     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.4Eb r4 = new X.4Eb     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4.<init>(r0)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = r58
            r2 = r59
            android.util.Pair r2 = r5.A00(r3, r4, r1, r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.Object r2 = r2.second     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r2 = r2.booleanValue()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r6 = r6 & r2
            r0.A00 = r6     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x04d6
        L_0x084e:
            boolean r2 = r1.A0e()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x086a
            boolean r6 = r0.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1TD r5 = r0.A0Y     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.4Eb r4 = new X.4Eb     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4.<init>(r0)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = r58
            r2 = r59
            boolean r2 = r5.A02(r3, r4, r1, r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r6 = r6 & r2
            r0.A00 = r6     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x04d6
        L_0x086a:
            r2 = r32
            X.21S r9 = X.C41061vA.A01(r2, r1)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r9 == 0) goto L_0x08d5
            int r3 = r9.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 1024(0x400, float:1.435E-42)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x08d5
            r2 = r59
            X.1Vw r3 = r2.A0m     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0rv r11 = r3.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r10 = r3.A02     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1iF r2 = r9.A0F     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 != 0) goto L_0x0887
            X.1iF r2 = X.C33231iF.A05     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0887:
            java.lang.String r2 = r2.A01     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1Vw r4 = new X.1Vw     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4.<init>(r11, r2, r10)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0t6 r2 = r0.A0J     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0th r2 = r2.A0K     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0tZ r11 = r2.A03(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r11 == 0) goto L_0x08d5
            byte r10 = r11.A10     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 31
            if (r10 != r2) goto L_0x08d5
            com.whatsapp.jid.UserJid r10 = r11.A0C()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.jid.Jid r2 = r59.A01()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0rv r2 = X.C16030sJ.A00(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r2 = X.C34901l3.A00(r10, r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x08d5
            java.lang.String r2 = "decryptioncallbackv2/placeholder message"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r10 = r4.A01     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 != 0) goto L_0x08d5
            r2 = r59
            X.1Vw r2 = r2.A0C     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 != 0) goto L_0x08c8
            r2 = r3
        L_0x08c8:
            X.0rv r4 = r2.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r2 = r2.A02     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1Vw r3 = new X.1Vw     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r4, r10, r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r59
            r2.A0C = r3     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x08d5:
            X.0tz r15 = r0.A0D     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0sG r2 = r0.A09     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r22 = r2
            X.013 r2 = r0.A0E     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r25 = r2
            X.1GF r2 = r0.A0i     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r36 = r2
            X.0uc r2 = r0.A06     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r21 = r2
            X.0sK r13 = r0.A03     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.17g r2 = r0.A0k     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r40 = r2
            X.0wS r2 = r0.A0h     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r35 = r2
            X.173 r2 = r0.A0O     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r30 = r2
            X.1GG r2 = r0.A0H     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r26 = r2
            r2 = r59
            X.1Vt r2 = r2.A07     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r31 = r2
            r2 = r59
            X.1Vw r4 = r2.A0C     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r4 != 0) goto L_0x0907
            X.1Vw r4 = r2.A0m     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0907:
            com.whatsapp.jid.Jid r2 = r2.A08     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0rv r33 = X.C16030sJ.A00(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r59
            long r2 = r2.A0j     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r55 = r2
            r11 = 0
            r2 = r59
            java.lang.Integer r2 = r2.A0G     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0992
            int r48 = r2.intValue()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x091e:
            X.0t6 r2 = r0.A0J     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.17o r3 = r0.A0K     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r29 = r3
            com.whatsapp.wamsys.JniBridge r3 = r0.A0o     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r42 = r3
            X.0rt r3 = r0.A0I     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r27 = r3
            X.17f r3 = r0.A0Z     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r34 = r3
            r3 = r59
            java.lang.Long r3 = r3.A0M     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r43 = r3
            r3 = r59
            int r3 = r3.A01     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r49 = r3
            r3 = r59
            java.lang.String r3 = r3.A0b     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r44 = r3
            X.1TS r3 = r0.A0l     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r41 = r3
            r3 = r59
            java.lang.String r14 = r3.A0Y     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r10 = r3.A0S     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = r3.A0W     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r12 = r32
            X.21S r37 = X.C41061vA.A01(r12, r1)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r52 = 1
            r53 = 0
            r54 = 0
            r19 = r57
            r20 = r13
            r23 = r5
            r24 = r15
            r28 = r2
            r38 = r1
            r39 = r4
            r45 = r14
            r46 = r10
            r47 = r3
            r50 = r55
            X.0tZ r5 = X.C41061vA.A04(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r53, r54)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = r59
            r3.A03(r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r3 = r3.A0c     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0a29
            r3 = r59
            java.lang.String r4 = r3.A0Q     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = 0
            if (r9 == 0) goto L_0x0995
            int r12 = r9.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r10 = 8192(0x2000, float:1.14794E-41)
            r12 = r12 & r10
            if (r12 != r10) goto L_0x0995
            X.1Ww r3 = r9.A08     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            byte[] r3 = r3.A04()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0995
        L_0x0992:
            r48 = 0
            goto L_0x091e
        L_0x0995:
            if (r4 == 0) goto L_0x09c4
            if (r3 == 0) goto L_0x09bd
            int r10 = r59.A00()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r10 != 0) goto L_0x09b6
            int r12 = r3.length     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r10 = 32
            if (r12 != r10) goto L_0x0d91
            r13.A0B()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1ZT r12 = r13.A05     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.AnonymousClass00B.A06(r12)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r10 = r59
            com.whatsapp.jid.Jid r10 = r10.A08     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r14 = r10 instanceof X.C34841kx     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r14 != 0) goto L_0x09d6
            r10 = 0
            goto L_0x09d6
        L_0x09b6:
            X.43c r3 = new X.43c     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r7)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x09bd:
            X.43c r3 = new X.43c     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r7)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x09c4:
            if (r3 == 0) goto L_0x0a29
            java.lang.String r4 = "DecryptionCallbackV2/handleBroadcastEphemeralSetting"
            java.lang.String r3 = "broadcast with secret but without ephemeral setting"
            r2 = r57
            r2.AcB(r4, r3, r7)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.43c r3 = new X.43c     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r11)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x09d6:
            X.AnonymousClass00B.A06(r10)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r21 = r12.getRawString()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r22 = r6.getRawString()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r23 = 0
            java.lang.String r25 = r10.getRawString()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r19 = 1
            r20 = r4
            r24 = r3
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOOOO(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.facebook.simplejni.NativeHolder r4 = (com.facebook.simplejni.NativeHolder) r4     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r4 == 0) goto L_0x0c8d
            X.4Bh r3 = new X.4Bh     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.facebook.simplejni.NativeHolder r10 = r3.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = 47
            long r3 = (long) r3     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            long r3 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r7, r3, r10)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r12 = (int) r3     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = 48
            long r3 = (long) r3     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r14 = 2
            long r3 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r14, r3, r10)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r19 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r19
            X.1WV r10 = new X.1WV     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r10.<init>(r12, r3, r11)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r3 = r10.expiration     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r5.A0T(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            long r3 = r10.ephemeralSettingTimestamp     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r5.A0i(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0a29:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4.<init>()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = "decryptioncallbackv2/FMessage="
            r4.append(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4.append(r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = r4.toString()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r9 == 0) goto L_0x0a58
            int r4 = r9.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = 1024(0x400, float:1.435E-42)
            r4 = r4 & r3
            if (r4 != r3) goto L_0x0a58
            r3 = r59
            X.1Vw r9 = r3.A0C     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r9 != 0) goto L_0x0a4e
            X.1Vw r9 = r3.A0m     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0a4e:
            X.1Vw r4 = r3.A0m     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r3 = r9.equals(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 != 0) goto L_0x0a58
            r5.A0R = r4     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0a58:
            X.0tZ r4 = r5.A0D()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r4 == 0) goto L_0x0a63
            X.16r r3 = r0.A0L     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.A0f(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0a63:
            boolean r3 = r5 instanceof X.C16830ti     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0a7b
            r4 = r5
            X.0ti r4 = (X.C16830ti) r4     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1TC r3 = r0.A07     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            A00(r3, r15, r6, r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0a6f:
            X.0w8 r3 = r0.A0g     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r3 = r3.A09()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 != 0) goto L_0x0af0
            X.12K r4 = r0.A0f     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            monitor-enter(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0a93
        L_0x0a7b:
            boolean r3 = r5 instanceof X.C39221s7     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0a6f
            X.1Vw r4 = r5.A11     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r3 = r4.A02     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0a6f
            X.0rv r4 = r4.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r3 = r4 instanceof X.AnonymousClass1ZX     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0a6f
            X.15H r3 = r0.A0M     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1ZX r4 = (X.AnonymousClass1ZX) r4     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.A05(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0a6f
        L_0x0a93:
            boolean r3 = r4.A01     // Catch:{ all -> 0x0aec }
            monitor-exit(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 != 0) goto L_0x0af0
            r3 = r59
            X.1Vt r9 = r3.A07     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r9 == 0) goto L_0x0af0
            monitor-enter(r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r10 = r9.A03     // Catch:{ all -> 0x0c89 }
            r3 = 2
            if (r10 == r3) goto L_0x0aad
            r3 = 20
            if (r10 == r3) goto L_0x0aad
            r6 = 200(0xc8, float:2.8E-43)
            r3 = 0
            if (r10 != r6) goto L_0x0aae
        L_0x0aad:
            r3 = 1
        L_0x0aae:
            monitor-exit(r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0af0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r6.<init>()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = "decryptioncallbackv2/PAY: received payment message with payments not enabled: "
            r6.append(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = r59
            X.1Vw r3 = r3.A0C     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 != 0) goto L_0x0ac5
            r3 = r59
            X.1Vw r3 = r3.A0m     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0ac5:
            r6.append(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = " "
            r6.append(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = r59
            X.1Vt r3 = r3.A07     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = r3.A0K     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r6.append(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = "; getting server props"
            r6.append(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = r6.toString()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.124 r3 = r0.A0a     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r6 = 0
            r3.A06(r11)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            monitor-enter(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4.A01 = r7     // Catch:{ all -> 0x0aec }
            goto L_0x0af2
        L_0x0aec:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x0af0:
            r6 = 0
            goto L_0x0b21
        L_0x0af2:
            monitor-exit(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = r59
            X.1Vt r3 = r3.A07     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.jid.UserJid r3 = r3.A0D     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r3 = r13.A0I(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0b21
            X.0wT r13 = r0.A0d     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0t3 r3 = r0.A0C     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            long r3 = r3.A00()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r9 = 1
            long r9 = r12.toMillis(r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            long r3 = r3 + r9
            r13.A0C(r11, r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0pt r10 = r0.A02     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1GP r9 = r0.A0c     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4 = 12
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r3 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>((java.lang.Object) r9, (int) r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r10.A0K(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0b21:
            X.1Vt r10 = r5.A0L     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r10 == 0) goto L_0x0b37
            X.16r r9 = r0.A0L     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.AnonymousClass00B.A06(r10)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r4 = r10.A03     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = 5
            if (r4 != r3) goto L_0x0b42
            X.1Vo r4 = r9.A09     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = "verifyPaymentAcceptedRequest type future"
        L_0x0b34:
            r4.A05(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0b37:
            boolean r3 = r5 instanceof X.C38871rY     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0cf0
            r3 = r5
            X.1rY r3 = (X.C38871rY) r3     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r4 = r3.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            monitor-enter(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0ba9
        L_0x0b42:
            boolean r3 = X.AnonymousClass1W1.A08(r10)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0b4e
            X.1Vo r4 = r9.A09     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = "verifyPaymentAcceptedRequest empty transaction"
            goto L_0x0b34
        L_0x0b4e:
            X.1Vt r12 = r5.A0L     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = r12.A0M     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4 = 0
            X.1Vt r9 = r9.A0M(r3, r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r9 == 0) goto L_0x0ba4
            com.whatsapp.jid.UserJid r3 = r5.A0C()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r3 = r9.A0K(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0ba4
            monitor-enter(r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.jid.UserJid r10 = r12.A0E     // Catch:{ all -> 0x0c89 }
            if (r10 == 0) goto L_0x0b76
            com.whatsapp.jid.UserJid r3 = r9.A0E     // Catch:{ all -> 0x0c89 }
            boolean r3 = r10.equals(r3)     // Catch:{ all -> 0x0c89 }
            if (r3 != 0) goto L_0x0b76
            java.lang.String r3 = "Pay: PaymentTransactionInfoData canBeAcceptedWithTransaction: sender mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0c89 }
            goto L_0x0ba3
        L_0x0b76:
            java.lang.String r10 = r9.A0I     // Catch:{ all -> 0x0c89 }
            if (r10 == 0) goto L_0x0b9e
            java.lang.String r3 = r12.A0I     // Catch:{ all -> 0x0c89 }
            boolean r3 = r10.equals(r3)     // Catch:{ all -> 0x0c89 }
            if (r3 == 0) goto L_0x0b9e
            X.1Vy r10 = r9.A08     // Catch:{ all -> 0x0c89 }
            if (r10 == 0) goto L_0x0b9e
            X.1Vy r3 = r12.A08     // Catch:{ all -> 0x0c89 }
            boolean r3 = r10.equals(r3)     // Catch:{ all -> 0x0c89 }
            if (r3 == 0) goto L_0x0b9e
            monitor-exit(r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1Vt r10 = r5.A0L     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0pt r9 = r0.A02     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4 = 39
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r3 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r0, r4, r10)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r9.A0K(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0b37
        L_0x0b9e:
            java.lang.String r3 = "PAY: PaymentTransactionInfoData canBeAcceptedWithTransaction: amount mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0c89 }
        L_0x0ba3:
            monitor-exit(r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0ba4:
            X.1Vt r3 = r5.A0L     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.A0M = r4     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0b37
        L_0x0ba9:
            X.0wS r3 = r2.A1f     // Catch:{ all -> 0x0c85 }
            r3.A06()     // Catch:{ all -> 0x0c85 }
            X.16r r10 = r3.A08     // Catch:{ all -> 0x0c85 }
            r3 = 0
            X.1Vt r9 = r10.A0M(r4, r3)     // Catch:{ all -> 0x0c85 }
            if (r9 == 0) goto L_0x0c57
            com.whatsapp.jid.UserJid r3 = r5.A0C()     // Catch:{ all -> 0x0c85 }
            boolean r3 = r9.A0K(r3)     // Catch:{ all -> 0x0c85 }
            if (r3 == 0) goto L_0x0c57
            X.0tZ r12 = r2.A0H(r9)     // Catch:{ all -> 0x0c85 }
            if (r12 == 0) goto L_0x0c16
            int r13 = r9.A02     // Catch:{ all -> 0x0c85 }
            boolean r3 = r2.A0r(r9, r5)     // Catch:{ all -> 0x0c85 }
            if (r3 == 0) goto L_0x0c57
            X.0t3 r3 = r2.A0F     // Catch:{ all -> 0x0c85 }
            long r3 = r3.A00()     // Catch:{ all -> 0x0c85 }
            r9.A06 = r3     // Catch:{ all -> 0x0c85 }
            r12.A0L = r9     // Catch:{ all -> 0x0c85 }
            X.1Vw r3 = r12.A11     // Catch:{ all -> 0x0c85 }
            r24 = 0
            r23 = 0
            r19 = r10
            r20 = r9
            r21 = r3
            r22 = r13
            boolean r3 = r19.A0m(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0c85 }
            if (r3 == 0) goto L_0x0c57
            java.lang.String r4 = "CoreMessageStore"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c85 }
            r10.<init>()     // Catch:{ all -> 0x0c85 }
            java.lang.String r3 = "msgStore/markPaymentRequestMessageResponded request message id: "
            r10.append(r3)     // Catch:{ all -> 0x0c85 }
            java.lang.String r3 = r9.A0L     // Catch:{ all -> 0x0c85 }
            r10.append(r3)     // Catch:{ all -> 0x0c85 }
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x0c85 }
            java.lang.String r3 = X.AnonymousClass1Vo.A01(r4, r3)     // Catch:{ all -> 0x0c85 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0c85 }
            X.17E r4 = r2.A0e     // Catch:{ all -> 0x0c85 }
            r3 = 16
            r4.A00(r12, r3)     // Catch:{ all -> 0x0c85 }
            X.17F r3 = r2.A0a     // Catch:{ all -> 0x0c85 }
            r3.A0O(r12)     // Catch:{ all -> 0x0c85 }
            goto L_0x0c54
        L_0x0c16:
            boolean r3 = r2.A0r(r9, r5)     // Catch:{ all -> 0x0c85 }
            if (r3 == 0) goto L_0x0c57
            X.0t3 r3 = r2.A0F     // Catch:{ all -> 0x0c85 }
            long r3 = r3.A00()     // Catch:{ all -> 0x0c85 }
            r9.A06 = r3     // Catch:{ all -> 0x0c85 }
            boolean r3 = r10.A0j(r9)     // Catch:{ all -> 0x0c85 }
            if (r3 == 0) goto L_0x0c57
            java.lang.String r10 = "CoreMessageStore"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c85 }
            r4.<init>()     // Catch:{ all -> 0x0c85 }
            java.lang.String r3 = "msgStore/markPaymentRequestMessageResponded request message id: "
            r4.append(r3)     // Catch:{ all -> 0x0c85 }
            java.lang.String r3 = r9.A0L     // Catch:{ all -> 0x0c85 }
            r4.append(r3)     // Catch:{ all -> 0x0c85 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c85 }
            java.lang.String r3 = X.AnonymousClass1Vo.A01(r10, r3)     // Catch:{ all -> 0x0c85 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0c85 }
            X.107 r11 = r2.A1d     // Catch:{ all -> 0x0c85 }
            X.0sq r10 = r11.A0B     // Catch:{ all -> 0x0c85 }
            r4 = 13
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r3 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7     // Catch:{ all -> 0x0c85 }
            r3.<init>(r11, r4, r9)     // Catch:{ all -> 0x0c85 }
            r10.Acl(r3)     // Catch:{ all -> 0x0c85 }
        L_0x0c54:
            monitor-exit(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0cf0
        L_0x0c57:
            monitor-exit(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r3 = r5.A0B     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 <= 0) goto L_0x0c71
            X.1Vw r4 = r5.A11     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0th r3 = r2.A0K     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0tZ r4 = r3.A03(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r4 == 0) goto L_0x0c71
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r7)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.add(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2.A0m(r3, r11)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0c71:
            int r2 = r1.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = 2
            r2 = r2 & 2
            if (r2 == r3) goto L_0x04d6
            if (r16 == 0) goto L_0x04d6
            r3 = r59
            r2 = r34
            r2.A07(r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r0.A00 = r11     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x04d6
        L_0x0c85:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x0c89:
            r3 = move-exception
            monitor-exit(r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x0c8d:
            X.43c r3 = new X.43c     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r11)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x0c94:
            r6 = 0
            r24 = 2
            r2 = r59
            X.1Vw r4 = r2.A0C     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r4 != 0) goto L_0x0c9f
            X.1Vw r4 = r2.A0m     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0c9f:
            long r2 = r2.A0j     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1rQ r5 = new X.1rQ     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r21 = r5
            r22 = r4
            r25 = r2
            r21.<init>(r22, r23, r24, r25)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r59
            r2.A03(r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r2 = X.C41061vA.A0G(r1)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0cba
            r9 = 56
            goto L_0x0cd8
        L_0x0cba:
            int r4 = r1.A01     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = 128(0x80, float:1.794E-43)
            r2 = r4 & r3
            r9 = 67
            if (r2 == r3) goto L_0x0cd8
            r3 = 256(0x100, float:3.59E-43)
            r2 = r4 & r3
            if (r2 != r3) goto L_0x0cd1
            r2 = 68
            r5.A00 = r2     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r5.A01 = r6     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0cf0
        L_0x0cd1:
            r2 = 8192(0x2000, float:1.14794E-41)
            r4 = r4 & r2
            if (r4 != r2) goto L_0x0cf0
            r9 = 74
        L_0x0cd8:
            r5.A00 = r9     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0cf0
        L_0x0cdb:
            X.1TD r6 = r0.A0Y     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.2uY r5 = r1.A0k     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r5 != 0) goto L_0x0ce3
            X.2uY r5 = X.C59022uY.A06     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0ce3:
            X.17g r4 = r6.A0D     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = r58
            r2 = r59
            X.0tZ r5 = r6.A01(r3, r5, r2, r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r6 = 0
            if (r5 == 0) goto L_0x04d6
        L_0x0cf0:
            int r3 = r1.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x0d70
            X.1H2 r10 = r0.A0m     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0w1 r2 = r0.A04     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0w2 r2 = r2.A09     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r9 = X.C18020w1.A02(r2, r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.21R r2 = r1.A0m     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4 = r2
            if (r2 != 0) goto L_0x0d08
            X.21R r2 = X.AnonymousClass21R.A05     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0d08:
            int r2 = r2.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = 4
            r2 = r2 & 4
            if (r2 != r3) goto L_0x0d2d
            if (r4 != 0) goto L_0x0d13
            X.21R r4 = X.AnonymousClass21R.A05     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0d13:
            X.1Ww r2 = r4.A02     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            byte[] r4 = r2.A04()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r3 = r4.length     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 32
            if (r3 == r2) goto L_0x0d42
            r10.A02(r7, r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 67
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.23S r3 = new X.23S     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x0d2d:
            boolean r2 = X.AnonymousClass1H2.A01(r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0d44
            r10.A02(r6, r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 66
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.23S r3 = new X.23S     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x0d42:
            r5.A1F = r4     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0d44:
            X.21R r2 = r1.A0m     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r4 = r2
            if (r2 != 0) goto L_0x0d4b
            X.21R r2 = X.AnonymousClass21R.A05     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0d4b:
            int r2 = r2.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3 = 8
            r2 = r2 & 8
            if (r2 != r3) goto L_0x0d97
            r2 = r4
            if (r4 != 0) goto L_0x0d58
            X.21R r2 = X.AnonymousClass21R.A05     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0d58:
            X.1Ww r2 = r2.A03     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0d97
            if (r4 != 0) goto L_0x0d60
            X.21R r4 = X.AnonymousClass21R.A05     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0d60:
            X.1Ww r2 = r4.A03     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r2 = r2.A03()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            long r2 = (long) r2     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r59
            r2.A0K = r3     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d97
        L_0x0d70:
            boolean r2 = X.AnonymousClass1H2.A01(r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0d97
            X.0t9 r4 = r0.A0S     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = "decryptioncallbackv2/processRegularMessage"
            X.0w1 r2 = r0.A04     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0w2 r2 = r2.A09     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r2 = X.C18020w1.A02(r2, r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.AnonymousClass1H2.A00(r4, r3, r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 66
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.23S r3 = new X.23S     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0d96
        L_0x0d91:
            X.43c r3 = new X.43c     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r7)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0d96:
            throw r3     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0d97:
            if (r18 == 0) goto L_0x0da3
            X.0w2 r2 = r0.A0P     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r3 = X.C18020w1.A02(r2, r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r18
            r2.A00 = r3     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0da3:
            boolean r2 = r5 instanceof X.C38831rU     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0dad
            boolean r2 = X.C38621r6.A0o(r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 != 0) goto L_0x0db9
        L_0x0dad:
            int r2 = r5.A01     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0dc4
            boolean r2 = r5 instanceof X.C39101rv     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 != 0) goto L_0x0db9
            boolean r2 = r5 instanceof X.C39191s4     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0dc4
        L_0x0db9:
            X.1Sd r3 = r0.A0X     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r59
            r3.A00(r5, r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0dc0:
            r0.A00 = r6     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x04d6
        L_0x0dc4:
            byte r9 = r5.A10     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 79
            if (r9 != r2) goto L_0x0deb
            java.lang.String r2 = "decryptioncallbackv2/unsupported message"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r7)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.add(r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0t6 r2 = r0.A0J     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2.A0m(r3, r7)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 69
            r0.A01(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r16 == 0) goto L_0x04d6
            X.17f r3 = r0.A0Z     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r59
            r3.A07(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0dc0
        L_0x0deb:
            boolean r2 = r5 instanceof X.C39101rv     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0e2f
            r2 = r5
            X.1rv r2 = (X.C39101rv) r2     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r3 = r2.A01     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r3 == 0) goto L_0x0e02
            X.1pj r2 = new X.1pj     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2.<init>((java.lang.String) r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int[] r2 = r2.A00     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r3 = r2.length     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 30
            if (r3 <= r2) goto L_0x0e2f
        L_0x0e02:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r2 = "decryptioncallbackv2/reaction text failed validation key="
            r3.append(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1Vw r2 = r5.A11     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.append(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r2 = r3.toString()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r4 = "reaction text failed validation"
            r3 = 0
            r2 = r57
            r2.AcB(r4, r3, r6)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 68
            r0.A01(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r16 == 0) goto L_0x04d6
            X.17f r3 = r0.A0Z     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r59
            r3.A07(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0dc0
        L_0x0e2f:
            int r4 = r5.A01     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r4 == 0) goto L_0x0e36
            if (r4 == r7) goto L_0x0e36
            goto L_0x0e8c
        L_0x0e36:
            X.0w2 r2 = r0.A0P     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r2 = X.C18020w1.A02(r2, r5)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r58
            r2.A08 = r3     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.0uP r3 = r0.A0A     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r59
            com.whatsapp.jid.UserJid r2 = r2.A0l     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1Vq r2 = r3.A00(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0e89
            X.1ta r3 = r2.A00()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0e54:
            r2 = r59
            X.1ta r2 = r2.A0E     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            boolean r2 = X.C47402Iv.A01(r3, r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            if (r2 == 0) goto L_0x0e63
            r2 = 4096(0x1000, float:5.74E-42)
            r5.A0S(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
        L_0x0e63:
            boolean r2 = r8.A08     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r5.A0y = r2     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1Sd r3 = r0.A0X     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r59
            r3.A00(r5, r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r3 = r8.A03     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = -1
            if (r3 == r2) goto L_0x0dc0
            X.0t6 r4 = r0.A0J     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1Vr r3 = new X.1Vr     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>(r8)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            int r2 = r5.A0E     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.A01 = r2     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1Vs r3 = r3.A01()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = r17
            r4.A0R(r2, r3)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0dc0
        L_0x0e89:
            X.1ta r3 = r8.A05     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x0e54
        L_0x0e8c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.<init>()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r2 = "decryptioncallbackv2/invalid-edit-version edit="
            r3.append(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.append(r4)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r2 = ", type="
            r3.append(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.append(r9)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r2 = ", id="
            r3.append(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            X.1Vw r2 = r5.A11     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r2 = r2.A01     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r3.append(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            java.lang.String r2 = r3.toString()     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            r2 = 19
            r0.A01(r2)     // Catch:{ 23S -> 0x0ed3, 43c -> 0x0ebb }
            goto L_0x04d6
        L_0x0ebb:
            r4 = move-exception
            r2 = r59
            r2.A0f = r7
            r3 = 9
            r2.A04 = r3
            int r2 = r4.failureReason
            if (r2 == 0) goto L_0x0ed0
            if (r2 != r7) goto L_0x0f6c
            r2 = 0
        L_0x0ecb:
            r0.A01(r2)
            goto L_0x04d6
        L_0x0ed0:
            r2 = 35
            goto L_0x0ecb
        L_0x0ed3:
            r2 = move-exception
            java.lang.Integer r2 = r2.e2eFailureReason
            int r2 = r2.intValue()
            r0.A01(r2)
            goto L_0x04d6
        L_0x0edf:
            int r5 = r1.A00
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r5 & r3
            if (r2 != r3) goto L_0x0f0d
            X.21R r2 = r1.A0m
            if (r2 != 0) goto L_0x0eed
            X.21R r2 = X.AnonymousClass21R.A05
        L_0x0eed:
            int r2 = r2.A00
            r3 = 1
            r2 = r2 & 1
            if (r2 != r3) goto L_0x0f0d
        L_0x0ef4:
            X.21R r1 = r1.A0m
            if (r1 != 0) goto L_0x0efa
            X.21R r1 = X.AnonymousClass21R.A05
        L_0x0efa:
            X.2uK r5 = r1.A04
            if (r5 != 0) goto L_0x0f00
            X.2uK r5 = X.C58892uK.A09
        L_0x0f00:
            X.0sq r3 = r0.A0n
            r2 = 27
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r1 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r1.<init>(r0, r4, r5, r2)
            r3.Acl(r1)
            return
        L_0x0f0d:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r5 = r5 & r2
            if (r5 != r2) goto L_0x0f49
            X.2tm r1 = r1.A0B
            r3 = r1
            if (r1 != 0) goto L_0x0f19
            X.2tm r1 = X.C58612tm.A04
        L_0x0f19:
            X.1iD r1 = r1.A01
            if (r1 != 0) goto L_0x0f1f
            X.1iD r1 = X.C33211iD.A0o
        L_0x0f1f:
            int r2 = r1.A00
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x0f49
            r1 = r3
            if (r3 != 0) goto L_0x0f2b
            X.2tm r1 = X.C58612tm.A04
        L_0x0f2b:
            X.1iD r1 = r1.A01
            if (r1 != 0) goto L_0x0f31
            X.1iD r1 = X.C33211iD.A0o
        L_0x0f31:
            X.21R r1 = r1.A0m
            if (r1 != 0) goto L_0x0f37
            X.21R r1 = X.AnonymousClass21R.A05
        L_0x0f37:
            int r1 = r1.A00
            r2 = 1
            r1 = r1 & 1
            if (r1 != r2) goto L_0x0f49
            if (r3 != 0) goto L_0x0f42
            X.2tm r3 = X.C58612tm.A04
        L_0x0f42:
            X.1iD r1 = r3.A01
            if (r1 != 0) goto L_0x0ef4
            X.1iD r1 = X.C33211iD.A0o
            goto L_0x0ef4
        L_0x0f49:
            java.lang.String r1 = "decryptioncallbackv2/processIcdcData no icdc data, sender="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r4)
            java.lang.String r1 = "; chatJid="
            r2.append(r1)
            X.0rv r0 = r0.A0V
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0f65:
            r0 = move-exception
            if (r8 == 0) goto L_0x0f6b
            r8.unlock()
        L_0x0f6b:
            throw r0
        L_0x0f6c:
            java.lang.String r1 = "Invalid failure reason"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52702eJ.AHO(byte[]):void");
    }
}
