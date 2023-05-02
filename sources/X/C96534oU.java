package X;

/* renamed from: X.4oU  reason: invalid class name and case insensitive filesystem */
public final class C96534oU implements C55132it {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = -1;
    public C55142iu A04;
    public C15060qG A05;
    public C96614oc A06;
    public C96754oq A07;
    public C97214pa A08;
    public final C90504eH A09 = C90504eH.A05(6);

    public void AHx(C15060qG r1) {
        this.A05 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d0, code lost:
        r8 = X.C34641kb.of();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbN(X.C55142iu r32, X.AnonymousClass4Bt r33) {
        /*
            r31 = this;
            r0 = r31
            int r4 = r0.A02
            r3 = 0
            r6 = r32
            if (r4 == 0) goto L_0x0201
            r2 = 1
            if (r4 == r2) goto L_0x01ec
            r1 = 2
            if (r4 == r1) goto L_0x0051
            r1 = 4
            r9 = r33
            if (r4 == r1) goto L_0x0044
            r1 = 5
            if (r4 == r1) goto L_0x001c
            r0 = 6
            if (r4 != r0) goto L_0x003f
            r4 = -1
        L_0x001b:
            return r4
        L_0x001c:
            X.4oc r5 = r0.A06
            if (r5 == 0) goto L_0x0024
            X.2iu r1 = r0.A04
            if (r6 == r1) goto L_0x002f
        L_0x0024:
            r0.A04 = r6
            long r3 = r0.A03
            X.4oc r5 = new X.4oc
            r5.<init>(r6, r3)
            r0.A06 = r5
        L_0x002f:
            X.4oq r1 = r0.A07
            int r4 = r1.AbN(r5, r9)
            if (r4 != r2) goto L_0x001b
            long r2 = r9.A00
            long r0 = r0.A03
            long r2 = r2 + r0
            r9.A00 = r2
            return r4
        L_0x003f:
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()
            throw r0
        L_0x0044:
            long r7 = r6.AF7()
            long r4 = r0.A03
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0233
            r9.A00 = r4
            return r2
        L_0x0051:
            int r4 = r0.A00
            r1 = 65505(0xffe1, float:9.1792E-41)
            if (r4 != r1) goto L_0x01e5
            int r4 = r0.A01
            X.4eH r5 = X.C90504eH.A05(r4)
            byte[] r1 = r5.A02
            r6.readFully(r1, r3, r4)
            X.4pa r1 = r0.A08
            if (r1 != 0) goto L_0x0319
            java.lang.String r4 = r5.A0M()
            java.lang.String r1 = "http://ns.adobe.com/xap/1.0/"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0319
            java.lang.String r5 = r5.A0M()
            if (r5 == 0) goto L_0x0319
            long r19 = r6.getLength()
            r7 = 0
            r17 = -1
            int r1 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0311
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.io.StringReader r4 = new java.io.StringReader     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r4.<init>(r5)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r1.setInput(r4)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r1.next()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r11 = "x:xmpmeta"
            boolean r4 = X.C89514cM.A02(r11, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x01d5
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.1kb r8 = X.C34641kb.of()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
        L_0x00a8:
            r1.next()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = "rdf:Description"
            boolean r4 = X.C89514cM.A02(r4, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x00f1
            java.lang.String[] r8 = X.C82044Aw.A02     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            int r6 = r8.length     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r5 = 0
        L_0x00b7:
            if (r5 >= r6) goto L_0x0311
            r4 = r8[r5]     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = X.C89514cM.A00(r4, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x00cc
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 != r2) goto L_0x0311
            java.lang.String[] r10 = X.C82044Aw.A01     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            int r9 = r10.length     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r8 = 0
            goto L_0x00cf
        L_0x00cc:
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x00cf:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r9) goto L_0x00eb
            r4 = r10[r8]     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = X.C89514cM.A00(r4, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x00e7
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            int r4 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x00eb
            goto L_0x00ea
        L_0x00e7:
            int r8 = r8 + 1
            goto L_0x00cf
        L_0x00ea:
            r5 = r8
        L_0x00eb:
            java.lang.String[] r10 = X.C82044Aw.A00     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            int r9 = r10.length     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r8 = 0
            goto L_0x01cd
        L_0x00f1:
            java.lang.String r4 = "Container:Directory"
            boolean r4 = X.C89514cM.A02(r4, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x0182
            java.lang.String r12 = "Container"
            java.lang.String r16 = "Item"
        L_0x00fd:
            X.3cL r10 = X.C34641kb.builder()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0q(r12)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = ":Item"
            java.lang.String r9 = X.AnonymousClass000.A0h(r4, r8)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0q(r12)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = ":Directory"
            java.lang.String r8 = X.AnonymousClass000.A0h(r4, r8)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
        L_0x0115:
            r1.next()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            boolean r4 = X.C89514cM.A02(r9, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x0177
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0q(r16)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = ":Mime"
            java.lang.String r14 = X.AnonymousClass000.A0h(r4, r12)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0q(r16)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = ":Semantic"
            java.lang.String r13 = X.AnonymousClass000.A0h(r4, r12)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0q(r16)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = ":Length"
            java.lang.String r12 = X.AnonymousClass000.A0h(r4, r12)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0q(r16)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = ":Padding"
            java.lang.String r4 = X.AnonymousClass000.A0h(r4, r15)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r22 = X.C89514cM.A00(r14, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r13 = X.C89514cM.A00(r13, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r12 = X.C89514cM.A00(r12, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = X.C89514cM.A00(r4, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r22 == 0) goto L_0x01d0
            if (r13 == 0) goto L_0x01d0
            if (r12 == 0) goto L_0x0161
            long r23 = java.lang.Long.parseLong(r12)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            goto L_0x0163
        L_0x0161:
            r23 = 0
        L_0x0163:
            if (r4 == 0) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r25 = 0
            goto L_0x016d
        L_0x0169:
            long r25 = java.lang.Long.parseLong(r4)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
        L_0x016d:
            X.4JU r4 = new X.4JU     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r21 = r4
            r21.<init>(r22, r23, r25)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r10.add((java.lang.Object) r4)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
        L_0x0177:
            boolean r4 = X.C89514cM.A01(r8, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x0115
            X.1kb r8 = r10.build()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            goto L_0x01b8
        L_0x0182:
            java.lang.String r4 = "GContainer:Directory"
            boolean r4 = X.C89514cM.A02(r4, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x01b8
            java.lang.String r12 = "GContainer"
            java.lang.String r16 = "GContainerItem"
            goto L_0x00fd
        L_0x0190:
            r4 = r10[r8]     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r4 = X.C89514cM.A00(r4, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x01cb
            long r27 = java.lang.Long.parseLong(r4)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r23 = 0
            java.lang.String r22 = "image/jpeg"
            r25 = 0
            X.4JU r4 = new X.4JU     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r21 = r4
            r21.<init>(r22, r23, r25)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            java.lang.String r26 = "video/mp4"
            X.4JU r8 = new X.4JU     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r29 = 0
            r25 = r8
            r25.<init>(r26, r27, r29)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            X.1kb r8 = X.C34641kb.of(r4, r8)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
        L_0x01b8:
            boolean r4 = X.C89514cM.A01(r11, r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r4 == 0) goto L_0x00a8
            boolean r1 = r8.isEmpty()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            if (r1 != 0) goto L_0x0311
            X.4G9 r4 = new X.4G9     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            r4.<init>(r8, r5)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            goto L_0x02b2
        L_0x01cb:
            int r8 = r8 + 1
        L_0x01cd:
            if (r8 >= r9) goto L_0x01d0
            goto L_0x0190
        L_0x01d0:
            X.1kb r8 = X.C34641kb.of()     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            goto L_0x01b8
        L_0x01d5:
            java.lang.String r1 = "Couldn't find xmp metadata"
            X.40M r1 = X.AnonymousClass40M.A00(r1)     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
            throw r1     // Catch:{ 40M | NumberFormatException | XmlPullParserException -> 0x01dc }
        L_0x01dc:
            java.lang.String r2 = "MotionPhotoXmpParser"
            java.lang.String r1 = "Ignoring unexpected XMP metadata"
            android.util.Log.w(r2, r1)
            goto L_0x0311
        L_0x01e5:
            int r1 = r0.A01
            r6.Afx(r1)
            goto L_0x0319
        L_0x01ec:
            X.4eH r4 = r0.A09
            r2 = 2
            r4.A0Q(r2)
            byte[] r1 = r4.A02
            r6.readFully(r1, r3, r2)
            int r1 = r4.A0F()
            int r1 = r1 - r2
            r0.A01 = r1
            r0.A02 = r2
            return r3
        L_0x0201:
            X.4eH r4 = r0.A09
            r2 = 2
            r4.A0Q(r2)
            byte[] r1 = r4.A02
            r6.readFully(r1, r3, r2)
            int r2 = r4.A0F()
            r0.A00 = r2
            r1 = 65498(0xffda, float:9.1782E-41)
            if (r2 != r1) goto L_0x0221
            long r6 = r0.A03
            r4 = -1
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0288
            r1 = 4
            goto L_0x0285
        L_0x0221:
            r1 = 65488(0xffd0, float:9.1768E-41)
            if (r2 < r1) goto L_0x022d
            r1 = 65497(0xffd9, float:9.1781E-41)
            if (r2 <= r1) goto L_0x031b
        L_0x022b:
            r1 = 1
            goto L_0x0285
        L_0x022d:
            r1 = 65281(0xff01, float:9.1478E-41)
            if (r2 == r1) goto L_0x031b
            goto L_0x022b
        L_0x0233:
            X.4eH r1 = r0.A09
            byte[] r1 = r1.A02
            boolean r1 = r6.AaM(r1, r3, r2, r2)
            if (r1 == 0) goto L_0x0288
            r6.AcS()
            X.4oq r1 = r0.A07
            if (r1 != 0) goto L_0x024b
            X.4oq r1 = new X.4oq
            r1.<init>()
            r0.A07 = r1
        L_0x024b:
            long r4 = r0.A03
            X.4oc r1 = new X.4oc
            r1.<init>(r6, r4)
            r0.A06 = r1
            boolean r1 = X.AnonymousClass4YJ.A00(r1, r3)
            if (r1 == 0) goto L_0x0288
            X.4oq r7 = r0.A07
            long r4 = r0.A03
            X.0qG r6 = r0.A05
            X.4of r1 = new X.4of
            r1.<init>(r6, r4)
            r7.A0B = r1
            X.1mP[] r5 = new X.C35731mP[r2]
            X.4pa r1 = r0.A08
            r5[r3] = r1
            X.0qG r4 = r0.A05
            r2 = 1024(0x400, float:1.435E-42)
            r1 = 4
            X.1gS r4 = r4.Ah1(r2, r1)
            X.1gR r2 = X.AnonymousClass3K4.A0N()
            X.4jf r1 = new X.4jf
            r1.<init>((X.C35731mP[]) r5)
            r2.A0J = r1
            X.AnonymousClass3K3.A19(r2, r4)
            r1 = 5
        L_0x0285:
            r0.A02 = r1
            return r3
        L_0x0288:
            X.1mP[] r5 = new X.C35731mP[r3]
            X.0qG r4 = r0.A05
            r2 = 1024(0x400, float:1.435E-42)
            r1 = 4
            X.1gS r4 = r4.Ah1(r2, r1)
            X.1gR r2 = X.AnonymousClass3K4.A0N()
            X.4jf r1 = new X.4jf
            r1.<init>((X.C35731mP[]) r5)
            r2.A0J = r1
            X.AnonymousClass3K3.A19(r2, r4)
            X.0qG r1 = r0.A05
            r1.A8W()
            X.0qG r4 = r0.A05
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.AnonymousClass3K2.A15(r4, r1)
            r1 = 6
            goto L_0x0285
        L_0x02b2:
            java.util.List r8 = r4.A01
            int r2 = r8.size()
            r1 = 2
            if (r2 < r1) goto L_0x0311
            int r1 = r8.size()
            int r5 = r1 + -1
            r21 = -1
            r23 = -1
            r27 = -1
            r29 = -1
            r9 = 0
        L_0x02ca:
            if (r5 < 0) goto L_0x02f6
            java.lang.Object r6 = r8.get(r5)
            X.4JU r6 = (X.AnonymousClass4JU) r6
            java.lang.String r2 = r6.A02
            java.lang.String r1 = "video/mp4"
            boolean r13 = r1.equals(r2)
            r13 = r13 | r9
            if (r5 != 0) goto L_0x0321
            long r1 = r6.A01
            long r19 = r19 - r1
            r11 = r19
            r19 = 0
        L_0x02e5:
            if (r13 == 0) goto L_0x031f
            int r1 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x031f
            long r29 = r11 - r19
            r27 = r19
            r9 = 0
        L_0x02f0:
            if (r5 != 0) goto L_0x031c
            r21 = r19
            r23 = r11
        L_0x02f6:
            int r1 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0311
            int r1 = (r29 > r17 ? 1 : (r29 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0311
            int r1 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0311
            int r1 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0311
            long r1 = r4.A00
            X.4pa r7 = new X.4pa
            r20 = r7
            r25 = r1
            r20.<init>(r21, r23, r25, r27, r29)
        L_0x0311:
            r0.A08 = r7
            if (r7 == 0) goto L_0x0319
            long r1 = r7.A04
            r0.A03 = r1
        L_0x0319:
            r0.A02 = r3
        L_0x031b:
            return r3
        L_0x031c:
            int r5 = r5 + -1
            goto L_0x02ca
        L_0x031f:
            r9 = r13
            goto L_0x02f0
        L_0x0321:
            long r1 = r6.A00
            long r9 = r19 - r1
            r11 = r19
            r19 = r9
            goto L_0x02e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96534oU.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        if (j2 == 0) {
            this.A02 = 0;
            this.A07 = null;
        } else if (this.A02 == 5) {
            this.A07.AdC(j2, j3);
        }
    }

    public boolean Afz(C55142iu r8) {
        C90504eH r6 = this.A09;
        r6.A0Q(2);
        r8.AaL(r6.A02, 0, 2);
        if (r6.A0F() != 65496) {
            return false;
        }
        r6.A0Q(2);
        C90504eH.A06(r8, r6, 2);
        int A0F = r6.A0F();
        this.A00 = A0F;
        if (A0F == 65504) {
            r6.A0Q(2);
            C90504eH.A06(r8, r6, 2);
            r8.A4m(r6.A0F() - 2);
            r6.A0Q(2);
            C90504eH.A06(r8, r6, 2);
            A0F = r6.A0F();
            this.A00 = A0F;
        }
        if (A0F != 65505) {
            return false;
        }
        r8.A4m(2);
        r6.A0Q(6);
        C90504eH.A06(r8, r6, 6);
        return r6.A0I() == 1165519206 && r6.A0F() == 0;
    }
}
