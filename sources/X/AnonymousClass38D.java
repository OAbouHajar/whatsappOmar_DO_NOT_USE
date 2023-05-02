package X;

import android.text.TextUtils;

/* renamed from: X.38D  reason: invalid class name */
public final class AnonymousClass38D {
    public static void A00(C16740tZ r11, AnonymousClass21Q r12, AnonymousClass1GC r13) {
        C16880tn AAt;
        C35171lU r4;
        C33221iE r3 = r12.A04;
        C59042ua r0 = ((C33211iD) r3.A00).A0R;
        if (r0 == null) {
            r0 = C59042ua.A09;
        }
        C28581Wr A0U = r0.A0U();
        if ((r11 instanceof C16840tj) && (AAt = ((C16840tj) r11).AAt()) != null) {
            int i2 = AAt.A00;
            AnonymousClass42U r2 = i2 != 1 ? i2 != 2 ? AnonymousClass42U.A03 : AnonymousClass42U.A01 : AnonymousClass42U.A02;
            C59042ua r1 = (C59042ua) C28581Wr.A00(A0U);
            r1.A00 |= 8;
            r1.A01 = r2.value;
            C35201lX r02 = AAt.A02;
            if (r02 != null) {
                String str = r02.A01;
                if (!TextUtils.isEmpty(str)) {
                    C59042ua r14 = (C59042ua) C28581Wr.A00(A0U);
                    r14.A00 |= 1;
                    r14.A08 = str;
                }
            }
            String str2 = AAt.A08;
            if (!TextUtils.isEmpty(str2)) {
                C59042ua r15 = (C59042ua) C28581Wr.A00(A0U);
                r15.A00 |= 32;
                r15.A07 = str2;
            }
            String str3 = AAt.A07;
            C59042ua r16 = (C59042ua) C28581Wr.A00(A0U);
            r16.A00 |= 2;
            r16.A06 = str3;
            String str4 = AAt.A06;
            C59042ua r17 = (C59042ua) C28581Wr.A00(A0U);
            r17.A00 |= 4;
            r17.A05 = str4;
            int i3 = AAt.A00;
            if (i3 == 1) {
                for (C35121lP r42 : AAt.A09) {
                    C28581Wr A0U2 = C58442tV.A03.A0U();
                    String str5 = r42.A00;
                    if (!TextUtils.isEmpty(str5)) {
                        C58442tV r18 = (C58442tV) C28581Wr.A00(A0U2);
                        r18.A00 |= 1;
                        r18.A02 = str5;
                    }
                    for (C35111lO r5 : r42.A01) {
                        C28581Wr A0U3 = C58682tt.A04.A0U();
                        String str6 = r5.A02;
                        C58682tt r19 = (C58682tt) C28581Wr.A00(A0U3);
                        r19.A00 |= 1;
                        r19.A03 = str6;
                        String str7 = r5.A01;
                        C58682tt r110 = (C58682tt) C28581Wr.A00(A0U3);
                        r110.A00 |= 4;
                        r110.A02 = str7;
                        String str8 = r5.A00;
                        if (!TextUtils.isEmpty(str8)) {
                            C58682tt r111 = (C58682tt) C28581Wr.A00(A0U3);
                            r111.A00 |= 2;
                            r111.A01 = str8;
                        }
                        C28541Wm A02 = A0U3.A02();
                        C58442tV r22 = (C58442tV) C28581Wr.A00(A0U2);
                        AnonymousClass1XE r112 = r22.A01;
                        if (!((AnonymousClass1XF) r112).A00) {
                            r112 = C28541Wm.A0G(r112);
                            r22.A01 = r112;
                        }
                        r112.add(A02);
                    }
                    C28541Wm A022 = A0U2.A02();
                    C59042ua r23 = (C59042ua) C28581Wr.A00(A0U);
                    AnonymousClass1XE r113 = r23.A02;
                    if (!((AnonymousClass1XF) r113).A00) {
                        r113 = C28541Wm.A0G(r113);
                        r23.A02 = r113;
                    }
                    r113.add(A022);
                }
            } else if (i3 == 2 && (r4 = AAt.A04) != null) {
                C28581Wr A0U4 = C58672ts.A04.A0U();
                for (C35141lR r52 : r4.A02) {
                    C28581Wr A0U5 = C58432tU.A03.A0U();
                    String str9 = r52.A00;
                    if (!TextUtils.isEmpty(str9)) {
                        C58432tU r114 = (C58432tU) C28581Wr.A00(A0U5);
                        r114.A00 |= 1;
                        r114.A02 = str9;
                    }
                    for (C35161lT r115 : r52.A01) {
                        C28581Wr A0U6 = C58232tA.A02.A0U();
                        String str10 = r115.A00;
                        if (!TextUtils.isEmpty(str10)) {
                            C58232tA r116 = (C58232tA) C28581Wr.A00(A0U6);
                            r116.A00 |= 1;
                            r116.A01 = str10;
                            C28541Wm A023 = A0U6.A02();
                            C58432tU r24 = (C58432tU) C28581Wr.A00(A0U5);
                            AnonymousClass1XE r117 = r24.A01;
                            if (!((AnonymousClass1XF) r117).A00) {
                                r117 = C28541Wm.A0G(r117);
                                r24.A01 = r117;
                            }
                            r117.add(A023);
                        }
                    }
                    C28541Wm A024 = A0U5.A02();
                    C58672ts r25 = (C58672ts) C28581Wr.A00(A0U4);
                    AnonymousClass1XE r118 = r25.A01;
                    if (!((AnonymousClass1XF) r118).A00) {
                        r118 = C28541Wm.A0G(r118);
                        r25.A01 = r118;
                    }
                    r118.add(A024);
                    String rawString = r4.A00.getRawString();
                    C58672ts r119 = (C58672ts) C28581Wr.A00(A0U4);
                    r119.A00 |= 2;
                    r119.A03 = rawString;
                }
                C28581Wr A0U7 = C58422tT.A03.A0U();
                C35151lS r43 = r4.A01;
                byte[] bArr = r43.A02;
                if (bArr != null) {
                    C28631Ww A01 = C28631Ww.A01(bArr, 0, bArr.length);
                    C58422tT r120 = (C58422tT) C28581Wr.A00(A0U7);
                    r120.A00 |= 2;
                    r120.A01 = A01;
                }
                String str11 = r43.A01;
                C58422tT r121 = (C58422tT) C28581Wr.A00(A0U7);
                r121.A00 |= 1;
                r121.A02 = str11;
                C58672ts r122 = (C58672ts) C28581Wr.A00(A0U4);
                r122.A02 = (C58422tT) A0U7.A02();
                r122.A00 |= 1;
                C59042ua r123 = (C59042ua) C28581Wr.A00(A0U);
                r123.A04 = (C58672ts) A0U4.A02();
                r123.A00 |= 16;
            }
            AnonymousClass1WV r26 = r12.A05;
            byte[] bArr2 = r12.A0A;
            if (C41071vB.A0O(r26, r11, bArr2)) {
                AnonymousClass21S A00 = r13.A00(r26, r11, bArr2, r12.A07);
                C59042ua r124 = (C59042ua) C28581Wr.A00(A0U);
                r124.A03 = A00;
                r124.A00 |= 64;
            }
            C33211iD r27 = (C33211iD) C28581Wr.A00(r3);
            r27.A0R = (C59042ua) A0U.A02();
            r27.A00 |= 134217728;
        }
    }
}
