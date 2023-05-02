package X;

/* renamed from: X.3EV  reason: invalid class name */
public class AnonymousClass3EV implements AnonymousClass5OJ {
    public final /* synthetic */ C03840Kb A00;
    public final /* synthetic */ C03840Kb A01;
    public final /* synthetic */ C005902n A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass3EV(C03840Kb r1, C03840Kb r2, C005902n r3, boolean z2) {
        this.A02 = r3;
        this.A03 = z2;
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Ahk(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 35
            if (r7 == r0) goto L_0x02bc
            r0 = 36
            if (r7 == r0) goto L_0x0280
            r0 = 38
            if (r7 == r0) goto L_0x0268
            r0 = 63
            if (r7 == r0) goto L_0x0250
            java.lang.String r1 = "auto"
            switch(r7) {
                case 40: goto L_0x01a3;
                case 41: goto L_0x01bb;
                case 42: goto L_0x01d3;
                case 43: goto L_0x0217;
                case 44: goto L_0x022f;
                case 45: goto L_0x023a;
                case 46: goto L_0x0245;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r7) {
                case 48: goto L_0x008b;
                case 49: goto L_0x0095;
                case 50: goto L_0x00a0;
                case 51: goto L_0x00ab;
                case 52: goto L_0x00e9;
                case 53: goto L_0x0127;
                case 54: goto L_0x0165;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r7) {
                case 65: goto L_0x0299;
                case 66: goto L_0x005f;
                case 67: goto L_0x0075;
                case 68: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = 0
            return r0
        L_0x001d:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            java.lang.String r0 = "%"
            boolean r0 = r8.endsWith(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x0040
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A00(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 7
            goto L_0x02b1
        L_0x0040:
            boolean r0 = r8.equals(r1)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A01(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 6
            goto L_0x02b1
        L_0x005f:
            boolean r0 = r6.A03     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x006d
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = r6.A01     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A05(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x006d:
            java.lang.String r1 = "Ignoring 'start' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.C29691b2.A00(r0, r1)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x0075:
            boolean r0 = r6.A03     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x0083
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = X.C03840Kb.A04     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A05(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x0083:
            java.lang.String r1 = "Ignoring 'top' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.C29691b2.A00(r0, r1)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x008b:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = X.C03840Kb.A03     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A04(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x0095:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = r6.A01     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A04(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x00a0:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = X.C03840Kb.A04     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A04(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x00ab:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            java.lang.String r0 = "%"
            boolean r0 = r8.endsWith(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x00cf
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A00(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 19
            goto L_0x02b1
        L_0x00cf:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A01(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 18
            goto L_0x02b1
        L_0x00e9:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            java.lang.String r0 = "%"
            boolean r0 = r8.endsWith(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x010d
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A00(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 12
            goto L_0x02b1
        L_0x010d:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A01(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 11
            goto L_0x02b1
        L_0x0127:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            java.lang.String r0 = "%"
            boolean r0 = r8.endsWith(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x014b
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A00(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 17
            goto L_0x02b1
        L_0x014b:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A01(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 16
            goto L_0x02b1
        L_0x0165:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            java.lang.String r0 = "%"
            boolean r0 = r8.endsWith(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x0189
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A00(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 10
            goto L_0x02b1
        L_0x0189:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A01(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 9
            goto L_0x02b1
        L_0x01a3:
            boolean r0 = r6.A03     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x01b2
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = r6.A00     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A05(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x01b2:
            java.lang.String r1 = "Ignoring 'end' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.C29691b2.A00(r0, r1)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x01bb:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.AnonymousClass000.A04(r8)     // Catch:{ 40K -> 0x0321 }
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 1
            goto L_0x02b1
        L_0x01d3:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            java.lang.String r0 = "%"
            boolean r0 = r8.endsWith(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x01f7
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A00(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 14
            goto L_0x02b1
        L_0x01f7:
            boolean r0 = r8.equals(r1)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.C62163Bx.A01(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 13
            goto L_0x02b1
        L_0x0217:
            boolean r0 = r6.A03     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x0226
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = X.C03840Kb.A02     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A05(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x0226:
            java.lang.String r1 = "Ignoring 'left' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.C29691b2.A00(r0, r1)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x022f:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = X.C03840Kb.A01     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A04(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x023a:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = r6.A00     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A04(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x0245:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = X.C03840Kb.A02     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A04(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x0250:
            boolean r0 = r6.A03     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x025f
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = X.C03840Kb.A03     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A05(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x025f:
            java.lang.String r1 = "Ignoring 'right' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.C29691b2.A00(r0, r1)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x0268:
            boolean r0 = r6.A03     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x0277
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            X.0Kb r0 = X.C03840Kb.A01     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            X.C62143Bu.A05(r0, r1, r8)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x0277:
            java.lang.String r1 = "Ignoring 'bottom' value since 'position' is not 'absolute'"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.C29691b2.A00(r0, r1)     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x0280:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.AnonymousClass000.A04(r8)     // Catch:{ 40K -> 0x0321 }
            boolean r0 = X.C005902n.A01(r5)     // Catch:{ 40K -> 0x0321 }
            if (r0 != 0) goto L_0x001b
            float[] r4 = X.C13690nt.A1Y(r1)     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
            r0 = 22
            goto L_0x02b1
        L_0x0299:
            X.02n r1 = r6.A02     // Catch:{ 40K -> 0x0321 }
            float r5 = X.AnonymousClass000.A04(r8)     // Catch:{ 40K -> 0x0321 }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            r0 = 2
            X.C005902n.A00(r1, r0)     // Catch:{ 40K -> 0x0321 }
            float[] r4 = r1.A01     // Catch:{ 40K -> 0x0321 }
            int r3 = r1.A00     // Catch:{ 40K -> 0x0321 }
            int r2 = r3 + 1
            r1.A00 = r2     // Catch:{ 40K -> 0x0321 }
        L_0x02b1:
            float r0 = (float) r0     // Catch:{ 40K -> 0x0321 }
            r4[r3] = r0     // Catch:{ 40K -> 0x0321 }
            int r0 = r2 + 1
            r1.A00 = r0     // Catch:{ 40K -> 0x0321 }
            r4[r2] = r5     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x02bc:
            X.02n r4 = r6.A02     // Catch:{ 40K -> 0x0321 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 40K -> 0x0321 }
            int r0 = r8.hashCode()     // Catch:{ 40K -> 0x0321 }
            switch(r0) {
                case -1881872635: goto L_0x02e9;
                case -1720785339: goto L_0x02f5;
                case -1364013995: goto L_0x0300;
                case 1384876188: goto L_0x030b;
                case 1744442261: goto L_0x0316;
                default: goto L_0x02c7;
            }     // Catch:{ 40K -> 0x0321 }
        L_0x02c7:
            X.0K9 r5 = X.AnonymousClass0K9.AUTO     // Catch:{ 40K -> 0x0321 }
        L_0x02c9:
            X.0K9 r0 = X.C005902n.A02     // Catch:{ 40K -> 0x0321 }
            if (r5 == r0) goto L_0x001b
            float[] r3 = X.C13690nt.A1Y(r4)     // Catch:{ 40K -> 0x0321 }
            int r2 = r4.A00     // Catch:{ 40K -> 0x0321 }
            int r1 = r2 + 1
            r4.A00 = r1     // Catch:{ 40K -> 0x0321 }
            r0 = 20
            float r0 = (float) r0     // Catch:{ 40K -> 0x0321 }
            r3[r2] = r0     // Catch:{ 40K -> 0x0321 }
            int r0 = r1 + 1
            r4.A00 = r0     // Catch:{ 40K -> 0x0321 }
            int r0 = r5.ordinal()     // Catch:{ 40K -> 0x0321 }
            float r0 = (float) r0     // Catch:{ 40K -> 0x0321 }
            r3[r1] = r0     // Catch:{ 40K -> 0x0321 }
            goto L_0x001b
        L_0x02e9:
            java.lang.String r0 = "stretch"
            boolean r0 = r8.equals(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x02c7
            X.0K9 r5 = X.AnonymousClass0K9.STRETCH     // Catch:{ 40K -> 0x0321 }
            goto L_0x02c9
        L_0x02f5:
            java.lang.String r0 = "baseline"
            boolean r0 = r8.equals(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x02c7
            X.0K9 r5 = X.AnonymousClass0K9.BASELINE     // Catch:{ 40K -> 0x0321 }
            goto L_0x02c9
        L_0x0300:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x02c7
            X.0K9 r5 = X.AnonymousClass0K9.CENTER     // Catch:{ 40K -> 0x0321 }
            goto L_0x02c9
        L_0x030b:
            java.lang.String r0 = "flex_start"
            boolean r0 = r8.equals(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x02c7
            X.0K9 r5 = X.AnonymousClass0K9.FLEX_START     // Catch:{ 40K -> 0x0321 }
            goto L_0x02c9
        L_0x0316:
            java.lang.String r0 = "flex_end"
            boolean r0 = r8.equals(r0)     // Catch:{ 40K -> 0x0321 }
            if (r0 == 0) goto L_0x02c7
            X.0K9 r5 = X.AnonymousClass0K9.FLEX_END     // Catch:{ 40K -> 0x0321 }
            goto L_0x02c9
        L_0x0321:
            r2 = move-exception
            java.lang.String r1 = "Error parsing flexbox style value"
            java.lang.String r0 = "BloksFlexLayoutProvider"
            X.C29691b2.A01(r0, r1, r2)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3EV.Ahk(int, java.lang.Object):boolean");
    }
}
