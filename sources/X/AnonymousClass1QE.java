package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Base64;
import com.obwhatsapp.TextData;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1QE  reason: invalid class name */
public class AnonymousClass1QE extends AnonymousClass1QF implements AnonymousClass1Q5 {
    public static final void A00(C69603fJ r9, C30581cc r10) {
        String str;
        r9.A06(r10.A0I());
        String A02 = C30931dC.A02(r10.A0I());
        if (!TextUtils.isEmpty(A02)) {
            r9.A03();
            C53012ep r1 = (C53012ep) r9.A00;
            r1.A01 |= 2;
            r1.A0J = A02;
        }
        if (!TextUtils.isEmpty(r10.A06)) {
            String str2 = r10.A06;
            r9.A03();
            C53012ep r12 = (C53012ep) r9.A00;
            r12.A01 |= 16;
            r12.A0M = str2;
        }
        if (!TextUtils.isEmpty(r10.A04)) {
            String str3 = r10.A04;
            r9.A03();
            C53012ep r13 = (C53012ep) r9.A00;
            r13.A01 |= 8;
            r13.A0H = str3;
        }
        if (!TextUtils.isEmpty(r10.A07)) {
            String str4 = r10.A07;
            r9.A03();
            C53012ep r14 = (C53012ep) r9.A00;
            r14.A01 |= 4;
            r14.A0G = str4;
        }
        int i2 = r10.A00;
        AnonymousClass431 r3 = i2 == 1 ? AnonymousClass431.A03 : i2 == 2 ? AnonymousClass431.A04 : i2 == 3 ? AnonymousClass431.A02 : AnonymousClass431.A01;
        r9.A03();
        C53012ep r2 = (C53012ep) r9.A00;
        r2.A01 |= 4194304;
        r2.A03 = r3.value;
        C30771cv r6 = r10.A0U;
        if (!(r6 == null || (str = r6.A04) == null || r6.A09 == null || r6.A07 == null || r6.A05 == null)) {
            r9.A03();
            C53012ep r15 = (C53012ep) r9.A00;
            r15.A01 |= 4096;
            r15.A0L = str;
            byte[] bArr = r6.A09;
            C28631Ww A01 = C28631Ww.A01(bArr, 0, bArr.length);
            r9.A03();
            C53012ep r22 = (C53012ep) r9.A00;
            r22.A01 |= 32768;
            r22.A0C = A01;
            byte[] decode = Base64.decode(r6.A07, 0);
            C28631Ww A012 = C28631Ww.A01(decode, 0, decode.length);
            r9.A03();
            C53012ep r16 = (C53012ep) r9.A00;
            r16.A01 |= 8192;
            r16.A0E = A012;
            byte[] decode2 = Base64.decode(r6.A05, 0);
            C28631Ww A013 = C28631Ww.A01(decode2, 0, decode2.length);
            r9.A03();
            C53012ep r17 = (C53012ep) r9.A00;
            r17.A01 |= 16384;
            r17.A0D = A013;
            long j2 = r6.A02;
            if (j2 > 0) {
                r9.A03();
                C53012ep r5 = (C53012ep) r9.A00;
                r5.A01 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                r5.A09 = j2 / 1000;
            }
            int i3 = r6.A00;
            if (i3 > 0) {
                r9.A03();
                C53012ep r23 = (C53012ep) r9.A00;
                r23.A01 |= 131072;
                r23.A07 = i3;
            }
            int i4 = r6.A01;
            if (i4 > 0) {
                r9.A03();
                C53012ep r24 = (C53012ep) r9.A00;
                r24.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
                r24.A08 = i4;
            }
        }
        AnonymousClass42I r25 = r10.A01 == 1 ? AnonymousClass42I.A02 : AnonymousClass42I.A01;
        r9.A03();
        C53012ep r18 = (C53012ep) r9.A00;
        r18.A01 |= 256;
        r18.A05 = r25.value;
        byte[] bArr2 = r10.A08;
        TextData textData = r10.A02;
        if (textData != null) {
            int i5 = textData.backgroundColor;
            r9.A03();
            C53012ep r19 = (C53012ep) r9.A00;
            r19.A01 |= 64;
            r19.A00 = i5;
            int i6 = textData.textColor;
            r9.A03();
            C53012ep r110 = (C53012ep) r9.A00;
            r110.A01 |= 32;
            r110.A06 = i6;
            AnonymousClass435 A00 = AnonymousClass435.A00(textData.fontStyle);
            r9.A03();
            C53012ep r111 = (C53012ep) r9.A00;
            r111.A01 |= 128;
            r111.A02 = A00.value;
            bArr2 = textData.thumbnail;
        }
        if (bArr2 != null) {
            C28631Ww A014 = C28631Ww.A01(bArr2, 0, bArr2.length);
            r9.A03();
            C53012ep r112 = (C53012ep) r9.A00;
            r112.A01 |= 512;
            r112.A0B = A014;
        }
    }

    public void A5i(C16740tZ r19, AnonymousClass21Q r20, AnonymousClass1GC r21) {
        C33211iD r2;
        int i2;
        int i3;
        C35431lv r8;
        long A09;
        C16740tZ r7 = r19;
        if (r7 instanceof C30581cc) {
            C30581cc r22 = (C30581cc) r7;
            AnonymousClass21Q r11 = r20;
            AnonymousClass1GC r10 = r21;
            if (r22.A10(131072)) {
                if (r22.A0L != null || C42551xz.A04(r22)) {
                    AnonymousClass00B.A08("FMessageTextSerializer/buildE2eMessage cant edit payment or buttons message");
                }
                if (r22.A0G() == null) {
                    AnonymousClass00B.A08("FMessageTextSerializer/buildE2eMessage originalMessageKey must be set before we can serialize it");
                } else {
                    C33221iE r3 = r11.A04;
                    C52992en r0 = ((C33211iD) r3.A00).A0G;
                    if (r0 == null) {
                        r0 = C52992en.A02;
                    }
                    C28581Wr A0U = r0.A0U();
                    C33211iD r02 = ((C52992en) A0U.A00).A01;
                    if (r02 == null) {
                        r02 = C33211iD.A0o;
                    }
                    C33221iE r5 = (C33221iE) r02.A0U();
                    C53002eo r03 = ((C33211iD) r5.A00).A0b;
                    if (r03 == null) {
                        r03 = C53002eo.A0F;
                    }
                    C69613fK r6 = (C69613fK) r03.A0U();
                    C33211iD r04 = ((C53002eo) r6.A00).A0D;
                    if (r04 == null) {
                        r04 = C33211iD.A0o;
                    }
                    C33221iE r9 = (C33221iE) r04.A0U();
                    C39271sC A0G = r7.A0G();
                    if (A0G != null) {
                        C33231iF r05 = ((C53002eo) r6.A00).A0E;
                        if (r05 == null) {
                            r05 = C33231iF.A05;
                        }
                        C33241iG r82 = (C33241iG) r05.A0U();
                        C28381Vw r1 = A0G.A02;
                        r82.A07(C16030sJ.A03(r1.A00));
                        r82.A08(r1.A02);
                        r82.A05(r1.A01);
                        if (r22.A0L != null || C42551xz.A04(r22)) {
                            throw new IllegalArgumentException("FMessageTextSerializer/buildUpdatedMessage/Payment or Button text message are not editable");
                        }
                        if (!TextUtils.isEmpty(r22.A06) || !TextUtils.isEmpty(r22.A04) || r22.A02 != null || r22.A10(1024) || C41071vB.A0O(r11.A05, r22, r11.A0A)) {
                            C53012ep r06 = ((C33211iD) r9.A00).A0E;
                            if (r06 == null) {
                                r06 = C53012ep.A0P;
                            }
                            C69603fJ r13 = (C69603fJ) r06.A0U();
                            A00(r13, r22);
                            AnonymousClass1WV r12 = r11.A05;
                            byte[] bArr = r11.A0A;
                            if (C41071vB.A0O(r12, r22, bArr)) {
                                r13.A05(r10.A00(r12, r22, bArr, r11.A07));
                            }
                            r9.A07(r13);
                        } else {
                            String A0I = r22.A0I();
                            r9.A03();
                            C33211iD r14 = (C33211iD) r9.A00;
                            r14.A00 |= 1;
                            r14.A0n = A0I;
                        }
                        r6.A03();
                        C53002eo r15 = (C53002eo) r6.A00;
                        r15.A0D = (C33211iD) r9.A02();
                        r15.A00 |= 1024;
                        r6.A06(r82);
                        r6.A05(AnonymousClass43A.A08);
                        long j2 = r7.A0I;
                        r6.A03();
                        C53002eo r72 = (C53002eo) r6.A00;
                        r72.A00 |= 2048;
                        r72.A04 = j2;
                        r5.A09(r6);
                        A0U.A03();
                        C52992en r16 = (C52992en) A0U.A00;
                        r16.A01 = (C33211iD) r5.A02();
                        r16.A00 |= 1;
                        r3.A03();
                        C33211iD r17 = (C33211iD) r3.A00;
                        r17.A0G = (C52992en) A0U.A02();
                        r17.A01 |= 8192;
                        return;
                    }
                    throw new IllegalArgumentException("FMessageEditedSerializers/buildEditedMessage missing messageEditInfo");
                }
            }
            AnonymousClass1Vt r62 = r22.A0L;
            if (r62 != null) {
                if (r62.A0E()) {
                    C28401Vy r07 = r62.A08;
                    AnonymousClass00B.A06(r07);
                    long longValue = r07.A00.scaleByPowerOfTen(3).longValue();
                    String str = r62.A0I;
                    AnonymousClass1W2 r32 = r62.A0A;
                    if (r32 == null) {
                        r8 = null;
                        A09 = 0;
                    } else {
                        r8 = r32.A01;
                        A09 = r32.A09();
                    }
                    UserJid userJid = r62.A0E;
                    C35361lo A01 = r62.A01();
                    C33221iE r63 = r11.A04;
                    C58872uI r33 = ((C33211iD) r63.A00).A0d;
                    if (r33 == null) {
                        r33 = C58872uI.A08;
                    }
                    C69553fE r34 = (C69553fE) r33.A0U();
                    C33221iE r142 = (C33221iE) C33211iD.A0o.A0U();
                    C53012ep r122 = ((C33211iD) r142.A00).A0E;
                    if (r122 == null) {
                        r122 = C53012ep.A0P;
                    }
                    C69603fJ r132 = (C69603fJ) r122.A0U();
                    if (r22.A0I() != null) {
                        r132.A06(r22.A0I());
                    }
                    AnonymousClass1WV r152 = r11.A05;
                    byte[] bArr2 = r11.A0A;
                    if (C41071vB.A0O(r152, r22, bArr2)) {
                        r132.A05(r10.A00(r152, r22, bArr2, r11.A07));
                    }
                    r142.A07(r132);
                    r34.A05(r142);
                    r34.A03();
                    C58872uI r102 = (C58872uI) r34.A00;
                    r102.A00 |= 4;
                    r102.A01 = longValue;
                    r34.A03();
                    C58872uI r103 = (C58872uI) r34.A00;
                    r103.A00 |= 2;
                    r103.A06 = str;
                    C58742tz r23 = r103.A04;
                    if (r23 == null) {
                        r23 = C58742tz.A04;
                    }
                    C69643fN r24 = (C69643fN) r23.A0U();
                    if (r8 != null) {
                        longValue = (long) r8.A00();
                    }
                    r24.A06(longValue);
                    r24.A05(r8 != null ? r8.A00 : 1000);
                    if (r8 != null) {
                        str = ((C35491m1) r8.A01).A04;
                    }
                    r24.A07(str);
                    r34.A03();
                    C58872uI r18 = (C58872uI) r34.A00;
                    r18.A04 = (C58742tz) r24.A02();
                    r18.A00 |= 32;
                    r34.A03();
                    C58872uI r110 = (C58872uI) r34.A00;
                    r110.A00 |= 16;
                    r110.A02 = A09 / 1000;
                    if (userJid != null) {
                        String rawString = userJid.getRawString();
                        r34.A03();
                        C58872uI r111 = (C58872uI) r34.A00;
                        r111.A00 |= 8;
                        r111.A07 = rawString;
                    }
                    if (A01 != null) {
                        C58932uO A012 = A01.A01();
                        r34.A03();
                        C58872uI r112 = (C58872uI) r34.A00;
                        r112.A05 = A012;
                        r112.A00 |= 64;
                    }
                    r63.A03();
                    r2 = (C33211iD) r63.A00;
                    r2.A0d = (C58872uI) r34.A02();
                    i2 = r2.A00;
                    i3 = 131072;
                } else {
                    String str2 = r62.A0M;
                    UserJid userJid2 = r62.A0D;
                    C35361lo A013 = r62.A01();
                    C33221iE r73 = r11.A04;
                    C58732ty r08 = ((C33211iD) r73.A00).A0f;
                    if (r08 == null) {
                        r08 = C58732ty.A04;
                    }
                    C69563fF r64 = (C69563fF) r08.A0U();
                    if (str2 != null) {
                        C33241iG r35 = (C33241iG) C33231iF.A05.A0U();
                        r35.A05(str2);
                        r35.A08(false);
                        C15830rv r113 = r22.A11.A00;
                        if (C16030sJ.A0L(r113) && userJid2 != null) {
                            r35.A06(userJid2.getRawString());
                        }
                        r35.A07(C16030sJ.A03(r113));
                        r64.A03();
                        C58732ty r114 = (C58732ty) r64.A00;
                        r114.A03 = (C33231iF) r35.A02();
                        r114.A00 |= 2;
                    }
                    if (A013 != null) {
                        C58932uO A014 = A013.A01();
                        r64.A03();
                        C58732ty r115 = (C58732ty) r64.A00;
                        r115.A02 = A014;
                        r115.A00 |= 4;
                    }
                    C33221iE r52 = (C33221iE) C33211iD.A0o.A0U();
                    C53012ep r09 = ((C33211iD) r52.A00).A0E;
                    if (r09 == null) {
                        r09 = C53012ep.A0P;
                    }
                    C69603fJ r4 = (C69603fJ) r09.A0U();
                    if (r22.A0I() != null) {
                        r4.A06(r22.A0I());
                    }
                    AnonymousClass1WV r36 = r11.A05;
                    byte[] bArr3 = r11.A0A;
                    if (C41071vB.A0O(r36, r22, bArr3)) {
                        r4.A05(r10.A00(r36, r22, bArr3, r11.A07));
                    }
                    r52.A07(r4);
                    r64.A05(r52);
                    r73.A03();
                    r2 = (C33211iD) r73.A00;
                    r2.A0f = (C58732ty) r64.A02();
                    i2 = r2.A00;
                    i3 = 32768;
                }
                r2.A00 = i2 | i3;
            } else if (C42551xz.A04(r22)) {
                C33221iE r42 = r11.A04;
                AnonymousClass1WV r74 = r11.A05;
                byte[] bArr4 = r11.A0A;
                boolean z2 = r11.A07;
                C58852uG r010 = ((C33211iD) r42.A00).A03;
                if (r010 == null) {
                    r010 = C58852uG.A08;
                }
                C69503f9 r53 = (C69503f9) r010.A0U();
                if (!TextUtils.isEmpty(r22.A0I())) {
                    r53.A05(AnonymousClass438.A05);
                    String A0I2 = r22.A0I();
                    r53.A03();
                    C58852uG r116 = (C58852uG) r53.A00;
                    r116.A01 = 1;
                    r116.A05 = A0I2;
                } else {
                    r53.A05(AnonymousClass438.A02);
                }
                C42551xz.A03(r53, r22.A0E().A00);
                if (C41071vB.A0O(r74, r22, bArr4)) {
                    AnonymousClass21S A00 = r10.A00(r74, r22, bArr4, z2);
                    r53.A03();
                    C58852uG r117 = (C58852uG) r53.A00;
                    r117.A04 = A00;
                    r117.A00 |= 128;
                }
                r42.A06((C58852uG) r53.A02());
            } else if (!TextUtils.isEmpty(r22.A06) || !TextUtils.isEmpty(r22.A04) || r22.A02 != null || r22.A10(1024) || C41071vB.A0O(r11.A05, r22, r11.A0A)) {
                C33221iE r54 = r11.A04;
                C53012ep r011 = ((C33211iD) r54.A00).A0E;
                if (r011 == null) {
                    r011 = C53012ep.A0P;
                }
                C69603fJ r43 = (C69603fJ) r011.A0U();
                A00(r43, r22);
                AnonymousClass1WV r37 = r11.A05;
                byte[] bArr5 = r11.A0A;
                if (C41071vB.A0O(r37, r22, bArr5)) {
                    r43.A05(r10.A00(r37, r22, bArr5, r11.A07));
                }
                r54.A07(r43);
            } else {
                C33221iE r012 = r11.A04;
                String A0I3 = r22.A0I();
                r012.A03();
                C33211iD r118 = (C33211iD) r012.A00;
                r118.A00 |= 1;
                r118.A0n = A0I3;
            }
        } else {
            throw new IllegalArgumentException("FMessageTextSerializer/buildE2EMessage wrong message passed");
        }
    }

    public int[] ACW() {
        return new int[]{0};
    }
}
