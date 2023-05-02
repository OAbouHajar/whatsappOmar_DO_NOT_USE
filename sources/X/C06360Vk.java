package X;

import java.util.Collections;

/* renamed from: X.0Vk  reason: invalid class name and case insensitive filesystem */
public class C06360Vk {
    public static C06000Tv A00;

    static {
        String[] strArr = new String[2];
        strArr[0] = "ty";
        A00 = C06000Tv.A00("d", strArr, 1);
    }

    public static AnonymousClass0HU A00(AnonymousClass0HU r1) {
        return r1 == null ? new AnonymousClass0HU(Collections.singletonList(new C06520Wl(100))) : r1;
    }

    public static AnonymousClass0HQ A01(AnonymousClass0Rs r3, C09090et r4) {
        return new AnonymousClass0HQ(C06370Vl.A00(r3, C08600du.A00, r4, AnonymousClass0XD.A00(), true));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: X.0K4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: X.0HT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: X.0HR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v42, resolved type: X.0JW} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.0kl] */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.0lg] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v24, types: [X.0lg] */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v36 */
    /* JADX WARNING: type inference failed for: r9v37 */
    /* JADX WARNING: type inference failed for: r9v43 */
    /* JADX WARNING: type inference failed for: r9v53 */
    /* JADX WARNING: type inference failed for: r9v61 */
    /* JADX WARNING: type inference failed for: r9v73 */
    /* JADX WARNING: type inference failed for: r9v75 */
    /* JADX WARNING: type inference failed for: r9v76 */
    /* JADX WARNING: type inference failed for: r9v80 */
    /* JADX WARNING: type inference failed for: r9v91 */
    /* JADX WARNING: type inference failed for: r9v98 */
    /* JADX WARNING: type inference failed for: r9v104 */
    /* JADX WARNING: type inference failed for: r9v116 */
    /* JADX WARNING: type inference failed for: r9v118 */
    /* JADX WARNING: type inference failed for: r9v125 */
    /* JADX WARNING: type inference failed for: r9v128 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C12660kl A02(X.AnonymousClass0Rs r21, X.C09090et r22) {
        /*
            r0 = r22
            r0.A0F()
            r6 = 2
        L_0x0006:
            boolean r1 = r0.A0M()
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L_0x0619
            X.0Tv r1 = A00
            int r1 = r0.A09(r1)
            if (r1 == 0) goto L_0x0024
            if (r1 == r2) goto L_0x001f
            r0.A0I()
            r0.A0J()
            goto L_0x0006
        L_0x001f:
            int r6 = r0.A08()
            goto L_0x0006
        L_0x0024:
            java.lang.String r4 = r0.A0D()
            if (r4 == 0) goto L_0x0619
            int r3 = r4.hashCode()
            r1 = r21
            switch(r3) {
                case 3239: goto L_0x05b6;
                case 3270: goto L_0x0555;
                case 3295: goto L_0x04b7;
                case 3307: goto L_0x046a;
                case 3308: goto L_0x0343;
                case 3488: goto L_0x02e7;
                case 3633: goto L_0x029d;
                case 3646: goto L_0x0252;
                case 3669: goto L_0x0205;
                case 3679: goto L_0x018b;
                case 3681: goto L_0x00b4;
                case 3705: goto L_0x0057;
                case 3710: goto L_0x004a;
                default: goto L_0x0033;
            }
        L_0x0033:
            java.lang.String r1 = "Unknown shape type "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            java.lang.String r1 = X.AnonymousClass000.A0h(r4, r1)
            X.C05770Sy.A00(r1)
        L_0x0040:
            boolean r1 = r0.A0M()
            if (r1 == 0) goto L_0x060a
            r0.A0J()
            goto L_0x0040
        L_0x004a:
            java.lang.String r2 = "tr"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0033
            X.0df r9 = X.AnonymousClass0TY.A00(r1, r0)
            goto L_0x0040
        L_0x0057:
            java.lang.String r3 = "tm"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            r5 = 0
            r10 = 0
            r6 = r9
            r7 = r9
            r8 = r9
            r11 = 0
        L_0x0065:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x00ad
            X.0Tv r3 = X.AnonymousClass0TN.A00
            int r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x00a8
            if (r4 == r2) goto L_0x00a3
            r3 = 2
            if (r4 == r3) goto L_0x009e
            r3 = 3
            if (r4 == r3) goto L_0x0099
            r3 = 4
            if (r4 == r3) goto L_0x008a
            r3 = 5
            if (r4 == r3) goto L_0x0085
            r0.A0J()
            goto L_0x0065
        L_0x0085:
            boolean r11 = r0.A0N()
            goto L_0x0065
        L_0x008a:
            int r4 = r0.A08()
            if (r4 == r2) goto L_0x0096
            r3 = 2
            if (r4 != r3) goto L_0x060e
            X.0JW r9 = X.AnonymousClass0JW.INDIVIDUALLY
            goto L_0x0065
        L_0x0096:
            X.0JW r9 = X.AnonymousClass0JW.SIMULTANEOUSLY
            goto L_0x0065
        L_0x0099:
            java.lang.String r10 = r0.A0D()
            goto L_0x0065
        L_0x009e:
            X.0HT r8 = X.C06270Vb.A01(r1, r0, r5)
            goto L_0x0065
        L_0x00a3:
            X.0HT r7 = X.C06270Vb.A01(r1, r0, r5)
            goto L_0x0065
        L_0x00a8:
            X.0HT r6 = X.C06270Vb.A01(r1, r0, r5)
            goto L_0x0065
        L_0x00ad:
            X.0do r5 = new X.0do
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r9 = r5
            goto L_0x0040
        L_0x00b4:
            java.lang.String r3 = "st"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            r6 = 0
            r16 = 0
            r11 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r8 = 0
        L_0x00cd:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x017e
            X.0Tv r3 = X.C05800Tb.A00
            int r3 = r0.A09(r3)
            switch(r3) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x00e5;
                case 2: goto L_0x0178;
                case 3: goto L_0x00ea;
                case 4: goto L_0x00ef;
                case 5: goto L_0x00fb;
                case 6: goto L_0x0107;
                case 7: goto L_0x010c;
                case 8: goto L_0x0111;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            r0.A0J()
            goto L_0x00cd
        L_0x00e0:
            java.lang.String r16 = r0.A0D()
            goto L_0x00cd
        L_0x00e5:
            X.0HO r10 = X.C06270Vb.A00(r1, r0)
            goto L_0x00cd
        L_0x00ea:
            X.0HU r8 = X.C06270Vb.A02(r1, r0)
            goto L_0x00cd
        L_0x00ef:
            X.0JM[] r4 = X.AnonymousClass0JM.values()
            int r3 = r0.A08()
            int r3 = r3 - r2
            r14 = r4[r3]
            goto L_0x00cd
        L_0x00fb:
            X.0KT[] r4 = X.AnonymousClass0KT.values()
            int r3 = r0.A08()
            int r3 = r3 - r2
            r15 = r4[r3]
            goto L_0x00cd
        L_0x0107:
            float r18 = X.C09090et.A05(r0)
            goto L_0x00cd
        L_0x010c:
            boolean r19 = r0.A0N()
            goto L_0x00cd
        L_0x0111:
            r0.A0E()
        L_0x0114:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x0166
            r0.A0F()
            r7 = 0
            r4 = 0
        L_0x011f:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x0140
            X.0Tv r3 = X.C05800Tb.A01
            int r3 = r0.A09(r3)
            if (r3 == 0) goto L_0x013b
            if (r3 == r2) goto L_0x0136
            r0.A0I()
            r0.A0J()
            goto L_0x011f
        L_0x0136:
            X.0HT r4 = X.C06270Vb.A01(r1, r0, r2)
            goto L_0x011f
        L_0x013b:
            java.lang.String r7 = r0.A0D()
            goto L_0x011f
        L_0x0140:
            r0.A0H()
            int r3 = r7.hashCode()
            switch(r3) {
                case 100: goto L_0x014b;
                case 103: goto L_0x014e;
                case 111: goto L_0x015c;
                default: goto L_0x014a;
            }
        L_0x014a:
            goto L_0x0114
        L_0x014b:
            java.lang.String r3 = "d"
            goto L_0x0150
        L_0x014e:
            java.lang.String r3 = "g"
        L_0x0150:
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0114
            r1.A0C = r2
            r5.add(r4)
            goto L_0x0114
        L_0x015c:
            java.lang.String r3 = "o"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0114
            r11 = r4
            goto L_0x0114
        L_0x0166:
            r0.A0G()
            int r3 = r5.size()
            if (r3 != r2) goto L_0x00cd
            java.lang.Object r3 = r5.get(r6)
            r5.add(r3)
            goto L_0x00cd
        L_0x0178:
            X.0HT r12 = X.C06270Vb.A01(r1, r0, r2)
            goto L_0x00cd
        L_0x017e:
            X.0HU r13 = A00(r8)
            X.0dh r9 = new X.0dh
            r17 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0040
        L_0x018b:
            java.lang.String r3 = "sr"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            r5 = 0
            r19 = 0
            r11 = r9
            r17 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r20 = 0
        L_0x01a1:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x01fb
            X.0Tv r3 = X.AnonymousClass0TH.A00
            int r3 = r0.A09(r3)
            switch(r3) {
                case 0: goto L_0x01b7;
                case 1: goto L_0x01bc;
                case 2: goto L_0x01d3;
                case 3: goto L_0x01d8;
                case 4: goto L_0x01dd;
                case 5: goto L_0x01f1;
                case 6: goto L_0x01e2;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01e7;
                case 9: goto L_0x01ec;
                default: goto L_0x01b0;
            }
        L_0x01b0:
            r0.A0I()
            r0.A0J()
            goto L_0x01a1
        L_0x01b7:
            java.lang.String r19 = r0.A0D()
            goto L_0x01a1
        L_0x01bc:
            int r8 = r0.A08()
            X.0KK[] r4 = X.AnonymousClass0KK.values()
            int r7 = r4.length
            r3 = 0
        L_0x01c6:
            if (r3 >= r7) goto L_0x01d1
            r9 = r4[r3]
            int r6 = r9.value
            if (r6 == r8) goto L_0x01a1
            int r3 = r3 + 1
            goto L_0x01c6
        L_0x01d1:
            r9 = 0
            goto L_0x01a1
        L_0x01d3:
            X.0HT r11 = X.C06270Vb.A01(r1, r0, r5)
            goto L_0x01a1
        L_0x01d8:
            X.0lg r17 = X.C06350Vj.A01(r1, r0)
            goto L_0x01a1
        L_0x01dd:
            X.0HT r12 = X.C06270Vb.A01(r1, r0, r5)
            goto L_0x01a1
        L_0x01e2:
            X.0HT r16 = X.C06270Vb.A01(r1, r0, r5)
            goto L_0x01a1
        L_0x01e7:
            X.0HT r15 = X.C06270Vb.A01(r1, r0, r5)
            goto L_0x01a1
        L_0x01ec:
            boolean r20 = r0.A0N()
            goto L_0x01a1
        L_0x01f1:
            X.0HT r14 = X.C06270Vb.A01(r1, r0, r2)
            goto L_0x01a1
        L_0x01f6:
            X.0HT r13 = X.C06270Vb.A01(r1, r0, r2)
            goto L_0x01a1
        L_0x01fb:
            X.0dg r10 = new X.0dg
            r18 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9 = r10
            goto L_0x0040
        L_0x0205:
            java.lang.String r3 = "sh"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            r8 = 0
            r7 = 0
            r6 = 0
        L_0x0210:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x024a
            X.0Tv r3 = X.AnonymousClass0TM.A00
            int r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x0245
            if (r4 == r2) goto L_0x0240
            r3 = 2
            if (r4 == r3) goto L_0x022f
            r3 = 3
            if (r4 == r3) goto L_0x022a
            r0.A0J()
            goto L_0x0210
        L_0x022a:
            boolean r6 = r0.A0N()
            goto L_0x0210
        L_0x022f:
            float r5 = X.AnonymousClass0XD.A00()
            X.0dx r4 = X.C08630dx.A00
            r3 = 0
            java.util.List r3 = X.C06370Vl.A00(r1, r4, r0, r5, r3)
            X.0HR r9 = new X.0HR
            r9.<init>(r3)
            goto L_0x0210
        L_0x0240:
            int r8 = r0.A08()
            goto L_0x0210
        L_0x0245:
            java.lang.String r7 = r0.A0D()
            goto L_0x0210
        L_0x024a:
            X.0dl r1 = new X.0dl
            r1.<init>(r9, r7, r8, r6)
            r9 = r1
            goto L_0x0040
        L_0x0252:
            java.lang.String r3 = "rp"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            r5 = 0
            r12 = 0
            r10 = r9
            r11 = r9
            r13 = 0
        L_0x025f:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x0295
            X.0Tv r3 = X.AnonymousClass0TJ.A00
            int r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x0290
            if (r4 == r2) goto L_0x028b
            r3 = 2
            if (r4 == r3) goto L_0x0286
            r3 = 3
            if (r4 == r3) goto L_0x0281
            r3 = 4
            if (r4 == r3) goto L_0x027c
            r0.A0J()
            goto L_0x025f
        L_0x027c:
            boolean r13 = r0.A0N()
            goto L_0x025f
        L_0x0281:
            X.0df r11 = X.AnonymousClass0TY.A00(r1, r0)
            goto L_0x025f
        L_0x0286:
            X.0HT r10 = X.C06270Vb.A01(r1, r0, r5)
            goto L_0x025f
        L_0x028b:
            X.0HT r9 = X.C06270Vb.A01(r1, r0, r5)
            goto L_0x025f
        L_0x0290:
            java.lang.String r12 = r0.A0D()
            goto L_0x025f
        L_0x0295:
            X.0dd r8 = new X.0dd
            r8.<init>(r9, r10, r11, r12, r13)
            r9 = r8
            goto L_0x0040
        L_0x029d:
            java.lang.String r3 = "rc"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            r11 = 0
            r10 = r9
            r8 = r9
            r12 = 0
        L_0x02a9:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x02df
            X.0Tv r3 = X.AnonymousClass0TI.A00
            int r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x02da
            if (r4 == r2) goto L_0x02d5
            r3 = 2
            if (r4 == r3) goto L_0x02d0
            r3 = 3
            if (r4 == r3) goto L_0x02cb
            r3 = 4
            if (r4 == r3) goto L_0x02c6
            r0.A0J()
            goto L_0x02a9
        L_0x02c6:
            boolean r12 = r0.A0N()
            goto L_0x02a9
        L_0x02cb:
            X.0HT r8 = X.C06270Vb.A01(r1, r0, r2)
            goto L_0x02a9
        L_0x02d0:
            X.0HQ r10 = A01(r1, r0)
            goto L_0x02a9
        L_0x02d5:
            X.0lg r9 = X.C06350Vj.A01(r1, r0)
            goto L_0x02a9
        L_0x02da:
            java.lang.String r11 = r0.A0D()
            goto L_0x02a9
        L_0x02df:
            X.0dm r7 = new X.0dm
            r7.<init>(r8, r9, r10, r11, r12)
            r9 = r7
            goto L_0x0040
        L_0x02e7:
            java.lang.String r3 = "mm"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            r6 = 0
            r5 = 0
        L_0x02f1:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x0336
            X.0Tv r3 = X.AnonymousClass0TG.A00
            int r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x0331
            if (r4 == r2) goto L_0x0310
            r3 = 2
            if (r4 == r3) goto L_0x030b
            r0.A0I()
            r0.A0J()
            goto L_0x02f1
        L_0x030b:
            boolean r5 = r0.A0N()
            goto L_0x02f1
        L_0x0310:
            int r4 = r0.A08()
            if (r4 == r2) goto L_0x032e
            r3 = 2
            if (r4 == r3) goto L_0x032b
            r3 = 3
            if (r4 == r3) goto L_0x0328
            r3 = 4
            if (r4 == r3) goto L_0x0325
            r3 = 5
            if (r4 != r3) goto L_0x032e
            X.0K4 r9 = X.AnonymousClass0K4.EXCLUDE_INTERSECTIONS
            goto L_0x02f1
        L_0x0325:
            X.0K4 r9 = X.AnonymousClass0K4.INTERSECT
            goto L_0x02f1
        L_0x0328:
            X.0K4 r9 = X.AnonymousClass0K4.SUBTRACT
            goto L_0x02f1
        L_0x032b:
            X.0K4 r9 = X.AnonymousClass0K4.ADD
            goto L_0x02f1
        L_0x032e:
            X.0K4 r9 = X.AnonymousClass0K4.MERGE
            goto L_0x02f1
        L_0x0331:
            java.lang.String r6 = r0.A0D()
            goto L_0x02f1
        L_0x0336:
            X.0dj r2 = new X.0dj
            r2.<init>(r9, r6, r5)
            r9 = r2
            java.lang.String r2 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            X.AnonymousClass0Rs.A01(r1, r2)
            goto L_0x0040
        L_0x0343:
            java.lang.String r3 = "gs"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            r19 = 0
            r16 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r10 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r11 = 0
            r22 = 0
            r8 = 0
        L_0x0361:
            boolean r4 = r0.A0M()
            if (r4 == 0) goto L_0x045d
            X.0Tv r4 = X.C05840Tf.A00
            int r4 = r0.A09(r4)
            switch(r4) {
                case 0: goto L_0x0377;
                case 1: goto L_0x037c;
                case 2: goto L_0x03b2;
                case 3: goto L_0x03b7;
                case 4: goto L_0x03c3;
                case 5: goto L_0x03c8;
                case 6: goto L_0x0457;
                case 7: goto L_0x03cd;
                case 8: goto L_0x03d9;
                case 9: goto L_0x03e6;
                case 10: goto L_0x03ec;
                case 11: goto L_0x03f2;
                default: goto L_0x0370;
            }
        L_0x0370:
            r0.A0I()
            r0.A0J()
            goto L_0x0361
        L_0x0377:
            java.lang.String r19 = r0.A0D()
            goto L_0x0361
        L_0x037c:
            r5 = -1
            r0.A0F()
        L_0x0380:
            boolean r4 = r0.A0M()
            if (r4 == 0) goto L_0x03ae
            X.0Tv r4 = X.C05840Tf.A02
            int r4 = r0.A09(r4)
            if (r4 == 0) goto L_0x03a9
            if (r4 == r2) goto L_0x0397
            r0.A0I()
            r0.A0J()
            goto L_0x0380
        L_0x0397:
            X.0dp r4 = new X.0dp
            r4.<init>(r5)
            r7 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            java.util.List r4 = X.C06370Vl.A00(r1, r4, r0, r7, r6)
            X.0HP r12 = new X.0HP
            r12.<init>(r4)
            goto L_0x0380
        L_0x03a9:
            int r5 = r0.A08()
            goto L_0x0380
        L_0x03ae:
            r0.A0H()
            goto L_0x0361
        L_0x03b2:
            X.0HU r8 = X.C06270Vb.A02(r1, r0)
            goto L_0x0361
        L_0x03b7:
            int r4 = r0.A08()
            if (r4 != r2) goto L_0x03c0
            X.0JV r16 = X.AnonymousClass0JV.LINEAR
            goto L_0x0361
        L_0x03c0:
            X.0JV r16 = X.AnonymousClass0JV.RADIAL
            goto L_0x0361
        L_0x03c3:
            X.0HQ r14 = A01(r1, r0)
            goto L_0x0361
        L_0x03c8:
            X.0HQ r15 = A01(r1, r0)
            goto L_0x0361
        L_0x03cd:
            X.0JM[] r5 = X.AnonymousClass0JM.values()
            int r4 = r0.A08()
            int r4 = r4 - r2
            r17 = r5[r4]
            goto L_0x0361
        L_0x03d9:
            X.0KT[] r5 = X.AnonymousClass0KT.values()
            int r4 = r0.A08()
            int r4 = r4 - r2
            r18 = r5[r4]
            goto L_0x0361
        L_0x03e6:
            float r21 = X.C09090et.A05(r0)
            goto L_0x0361
        L_0x03ec:
            boolean r22 = r0.A0N()
            goto L_0x0361
        L_0x03f2:
            r0.A0E()
        L_0x03f5:
            boolean r4 = r0.A0M()
            if (r4 == 0) goto L_0x0444
            r0.A0F()
            r4 = 0
            r6 = 0
        L_0x0400:
            boolean r5 = r0.A0M()
            if (r5 == 0) goto L_0x0421
            X.0Tv r5 = X.C05840Tf.A01
            int r5 = r0.A09(r5)
            if (r5 == 0) goto L_0x041c
            if (r5 == r2) goto L_0x0417
            r0.A0I()
            r0.A0J()
            goto L_0x0400
        L_0x0417:
            X.0HT r6 = X.C06270Vb.A01(r1, r0, r2)
            goto L_0x0400
        L_0x041c:
            java.lang.String r4 = r0.A0D()
            goto L_0x0400
        L_0x0421:
            r0.A0H()
            java.lang.String r5 = "o"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x042e
            r11 = r6
            goto L_0x03f5
        L_0x042e:
            java.lang.String r5 = "d"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x043e
            java.lang.String r5 = "g"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x03f5
        L_0x043e:
            r1.A0C = r2
            r3.add(r6)
            goto L_0x03f5
        L_0x0444:
            r0.A0G()
            int r4 = r3.size()
            if (r4 != r2) goto L_0x0361
            r4 = 0
            java.lang.Object r4 = r3.get(r4)
            r3.add(r4)
            goto L_0x0361
        L_0x0457:
            X.0HT r10 = X.C06270Vb.A01(r1, r0, r2)
            goto L_0x0361
        L_0x045d:
            X.0HU r13 = A00(r8)
            X.0di r9 = new X.0di
            r20 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0040
        L_0x046a:
            java.lang.String r3 = "gr"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            r6 = 0
            r5 = 0
        L_0x0478:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x04b0
            X.0Tv r3 = X.AnonymousClass0TL.A00
            int r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x04ab
            if (r4 == r2) goto L_0x04a6
            r3 = 2
            if (r4 == r3) goto L_0x048f
            r0.A0J()
            goto L_0x0478
        L_0x048f:
            r0.A0E()
        L_0x0492:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x04a2
            X.0kl r3 = A02(r1, r0)
            if (r3 == 0) goto L_0x0492
            r7.add(r3)
            goto L_0x0492
        L_0x04a2:
            r0.A0G()
            goto L_0x0478
        L_0x04a6:
            boolean r5 = r0.A0N()
            goto L_0x0478
        L_0x04ab:
            java.lang.String r6 = r0.A0D()
            goto L_0x0478
        L_0x04b0:
            X.0dk r9 = new X.0dk
            r9.<init>(r6, r7, r5)
            goto L_0x0040
        L_0x04b7:
            java.lang.String r2 = "gf"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0033
            android.graphics.Path$FillType r11 = android.graphics.Path.FillType.WINDING
            r7 = 0
            r16 = r9
            r12 = r9
            r14 = r9
            r15 = r9
            r18 = 0
        L_0x04c9:
            boolean r2 = r0.A0M()
            if (r2 == 0) goto L_0x0547
            X.0Tv r2 = X.C05790Ta.A01
            int r2 = r0.A09(r2)
            r6 = 1
            switch(r2) {
                case 0: goto L_0x04e0;
                case 1: goto L_0x04e5;
                case 2: goto L_0x051b;
                case 3: goto L_0x0520;
                case 4: goto L_0x052c;
                case 5: goto L_0x0531;
                case 6: goto L_0x0536;
                case 7: goto L_0x0542;
                default: goto L_0x04d9;
            }
        L_0x04d9:
            r0.A0I()
            r0.A0J()
            goto L_0x04c9
        L_0x04e0:
            java.lang.String r9 = r0.A0D()
            goto L_0x04c9
        L_0x04e5:
            r5 = -1
            r0.A0F()
        L_0x04e9:
            boolean r2 = r0.A0M()
            if (r2 == 0) goto L_0x0517
            X.0Tv r2 = X.C05790Ta.A00
            int r2 = r0.A09(r2)
            if (r2 == 0) goto L_0x0512
            if (r2 == r6) goto L_0x0500
            r0.A0I()
            r0.A0J()
            goto L_0x04e9
        L_0x0500:
            X.0dp r4 = new X.0dp
            r4.<init>(r5)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            java.util.List r2 = X.C06370Vl.A00(r1, r4, r0, r3, r2)
            X.0HP r12 = new X.0HP
            r12.<init>(r2)
            goto L_0x04e9
        L_0x0512:
            int r5 = r0.A08()
            goto L_0x04e9
        L_0x0517:
            r0.A0H()
            goto L_0x04c9
        L_0x051b:
            X.0HU r7 = X.C06270Vb.A02(r1, r0)
            goto L_0x04c9
        L_0x0520:
            int r2 = r0.A08()
            if (r2 != r6) goto L_0x0529
            X.0JV r16 = X.AnonymousClass0JV.LINEAR
            goto L_0x04c9
        L_0x0529:
            X.0JV r16 = X.AnonymousClass0JV.RADIAL
            goto L_0x04c9
        L_0x052c:
            X.0HQ r14 = A01(r1, r0)
            goto L_0x04c9
        L_0x0531:
            X.0HQ r15 = A01(r1, r0)
            goto L_0x04c9
        L_0x0536:
            int r2 = r0.A08()
            if (r2 != r6) goto L_0x053f
            android.graphics.Path$FillType r11 = android.graphics.Path.FillType.WINDING
            goto L_0x04c9
        L_0x053f:
            android.graphics.Path$FillType r11 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x04c9
        L_0x0542:
            boolean r18 = r0.A0N()
            goto L_0x04c9
        L_0x0547:
            X.0HU r13 = A00(r7)
            X.0de r10 = new X.0de
            r17 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r9 = r10
            goto L_0x0040
        L_0x0555:
            java.lang.String r3 = "fl"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            r6 = 0
            r7 = r9
            r5 = 1
            r10 = 0
            r11 = 0
        L_0x0562:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x05a3
            X.0Tv r3 = X.AnonymousClass0TK.A00
            int r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x059e
            if (r4 == r2) goto L_0x0599
            r3 = 2
            if (r4 == r3) goto L_0x0594
            r3 = 3
            if (r4 == r3) goto L_0x058f
            r3 = 4
            if (r4 == r3) goto L_0x058a
            r3 = 5
            if (r4 == r3) goto L_0x0585
            r0.A0I()
            r0.A0J()
            goto L_0x0562
        L_0x0585:
            boolean r11 = r0.A0N()
            goto L_0x0562
        L_0x058a:
            int r5 = r0.A08()
            goto L_0x0562
        L_0x058f:
            boolean r10 = r0.A0N()
            goto L_0x0562
        L_0x0594:
            X.0HU r6 = X.C06270Vb.A02(r1, r0)
            goto L_0x0562
        L_0x0599:
            X.0HO r7 = X.C06270Vb.A00(r1, r0)
            goto L_0x0562
        L_0x059e:
            java.lang.String r9 = r0.A0D()
            goto L_0x0562
        L_0x05a3:
            X.0HU r8 = A00(r6)
            if (r5 != r2) goto L_0x05b3
            android.graphics.Path$FillType r6 = android.graphics.Path.FillType.WINDING
        L_0x05ab:
            X.0dn r5 = new X.0dn
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r9 = r5
            goto L_0x0040
        L_0x05b3:
            android.graphics.Path$FillType r6 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x05ab
        L_0x05b6:
            java.lang.String r3 = "el"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0033
            r5 = 3
            boolean r11 = X.AnonymousClass000.A1R(r6, r5)
            r10 = 0
            r8 = r9
            r12 = 0
        L_0x05c6:
            boolean r3 = r0.A0M()
            if (r3 == 0) goto L_0x0602
            X.0Tv r3 = X.AnonymousClass0TE.A00
            int r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x05fd
            if (r4 == r2) goto L_0x05f8
            r3 = 2
            if (r4 == r3) goto L_0x05f3
            if (r4 == r5) goto L_0x05ee
            r3 = 4
            if (r4 == r3) goto L_0x05e5
            r0.A0I()
            r0.A0J()
            goto L_0x05c6
        L_0x05e5:
            int r3 = r0.A08()
            boolean r11 = X.AnonymousClass000.A1R(r3, r5)
            goto L_0x05c6
        L_0x05ee:
            boolean r12 = r0.A0N()
            goto L_0x05c6
        L_0x05f3:
            X.0HQ r8 = A01(r1, r0)
            goto L_0x05c6
        L_0x05f8:
            X.0lg r9 = X.C06350Vj.A01(r1, r0)
            goto L_0x05c6
        L_0x05fd:
            java.lang.String r10 = r0.A0D()
            goto L_0x05c6
        L_0x0602:
            X.0dc r7 = new X.0dc
            r7.<init>(r8, r9, r10, r11, r12)
            r9 = r7
            goto L_0x0040
        L_0x060a:
            r0.A0H()
            return r9
        L_0x060e:
            java.lang.String r0 = "Unknown trim path type "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0U(r0, r4)
            throw r0
        L_0x0619:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06360Vk.A02(X.0Rs, X.0et):X.0kl");
    }
}
