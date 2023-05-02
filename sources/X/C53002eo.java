package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2eo  reason: invalid class name and case insensitive filesystem */
public final class C53002eo extends C28541Wm implements C28561Wp {
    public static final C53002eo A0F;
    public static volatile C47872Kz A0G;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C30391cH A05;
    public C58372tO A06;
    public AnonymousClass2sz A07;
    public C37591pP A08;
    public C58922uN A09;
    public C58192t6 A0A;
    public C58692tu A0B;
    public C58712tw A0C;
    public C33211iD A0D;
    public C33231iF A0E;

    static {
        C53002eo r0 = new C53002eo();
        A0F = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A0F;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                C53002eo r1 = (C53002eo) obj3;
                this.A0E = (C33231iF) r8.Ahu(this.A0E, r1.A0E);
                int i2 = this.A00;
                boolean z2 = false;
                if ((i2 & 2) == 2) {
                    z2 = true;
                }
                int i3 = this.A02;
                int i4 = r1.A00;
                boolean z3 = false;
                if ((i4 & 2) == 2) {
                    z3 = true;
                }
                this.A02 = r8.Ahq(i3, r1.A02, z2, z3);
                boolean z4 = false;
                if ((i2 & 4) == 4) {
                    z4 = true;
                }
                int i5 = this.A01;
                boolean z5 = false;
                if ((i4 & 4) == 4) {
                    z5 = true;
                }
                this.A01 = r8.Ahq(i5, r1.A01, z4, z5);
                boolean z6 = false;
                if ((i2 & 8) == 8) {
                    z6 = true;
                }
                long j2 = this.A03;
                boolean z7 = false;
                if ((i4 & 8) == 8) {
                    z7 = true;
                }
                this.A03 = r8.Aht(j2, r1.A03, z6, z7);
                this.A09 = (C58922uN) r8.Ahu(this.A09, r1.A09);
                this.A08 = (C37591pP) r8.Ahu(this.A08, r1.A08);
                this.A07 = (AnonymousClass2sz) r8.Ahu(this.A07, r1.A07);
                this.A0A = (C58192t6) r8.Ahu(this.A0A, r1.A0A);
                this.A06 = (C58372tO) r8.Ahu(this.A06, r1.A06);
                this.A05 = (C30391cH) r8.Ahu(this.A05, r1.A05);
                this.A0D = (C33211iD) r8.Ahu(this.A0D, r1.A0D);
                boolean z8 = false;
                if ((this.A00 & 2048) == 2048) {
                    z8 = true;
                }
                long j3 = this.A04;
                boolean z9 = false;
                if ((r1.A00 & 2048) == 2048) {
                    z9 = true;
                }
                this.A04 = r8.Aht(j3, r1.A04, z8, z9);
                this.A0B = (C58692tu) r8.Ahu(this.A0B, r1.A0B);
                this.A0C = (C58712tw) r8.Ahu(this.A0C, r1.A0C);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 |= r1.A00;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj4;
                C47862Ky r12 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                C33241iG r2 = (this.A00 & 1) == 1 ? (C33241iG) this.A0E.A0U() : null;
                                C33231iF r0 = (C33231iF) r82.A09(r12, C33231iF.A05.A0V());
                                this.A0E = r0;
                                if (r2 != null) {
                                    r2.A04(r0);
                                    this.A0E = (C33231iF) r2.A01();
                                }
                                this.A00 |= 1;
                                continue;
                            case 16:
                                int A022 = r82.A02();
                                if (AnonymousClass43A.A00(A022) != null) {
                                    this.A00 |= 2;
                                    this.A02 = A022;
                                    break;
                                } else {
                                    super.A0X(2, A022);
                                    continue;
                                }
                            case 32:
                                this.A00 |= 4;
                                this.A01 = r82.A02();
                                continue;
                            case 40:
                                this.A00 |= 8;
                                this.A03 = r82.A06();
                                continue;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*50*/:
                                C68793e0 r22 = (this.A00 & 16) == 16 ? (C68793e0) this.A09.A0U() : null;
                                C58922uN r02 = (C58922uN) r82.A09(r12, C58922uN.A0B.A0V());
                                this.A09 = r02;
                                if (r22 != null) {
                                    r22.A04(r02);
                                    this.A09 = (C58922uN) r22.A01();
                                }
                                this.A00 |= 16;
                                continue;
                            case 58:
                                C68583df r23 = (this.A00 & 32) == 32 ? (C68583df) this.A08.A0U() : null;
                                C37591pP r03 = (C37591pP) r82.A09(r12, C37591pP.A01.A0V());
                                this.A08 = r03;
                                if (r23 != null) {
                                    r23.A04(r03);
                                    this.A08 = (C37591pP) r23.A01();
                                }
                                this.A00 |= 32;
                                continue;
                            case 66:
                                C68573de r24 = (this.A00 & 64) == 64 ? (C68573de) this.A07.A0U() : null;
                                AnonymousClass2sz r04 = (AnonymousClass2sz) r82.A09(r12, AnonymousClass2sz.A01.A0V());
                                this.A07 = r04;
                                if (r24 != null) {
                                    r24.A04(r04);
                                    this.A07 = (AnonymousClass2sz) r24.A01();
                                }
                                this.A00 |= 64;
                                continue;
                            case 74:
                                C68813e2 r25 = (this.A00 & 128) == 128 ? (C68813e2) this.A0A.A0U() : null;
                                C58192t6 r05 = (C58192t6) r82.A09(r12, C58192t6.A02.A0V());
                                this.A0A = r05;
                                if (r25 != null) {
                                    r25.A04(r05);
                                    this.A0A = (C58192t6) r25.A01();
                                }
                                this.A00 |= 128;
                                continue;
                            case 82:
                                C68523dZ r26 = (this.A00 & 256) == 256 ? (C68523dZ) this.A06.A0U() : null;
                                C58372tO r06 = (C58372tO) r82.A09(r12, C58372tO.A03.A0V());
                                this.A06 = r06;
                                if (r26 != null) {
                                    r26.A04(r06);
                                    this.A06 = (C58372tO) r26.A01();
                                }
                                this.A00 |= 256;
                                continue;
                            case 90:
                                C30401cI r27 = (this.A00 & 512) == 512 ? (C30401cI) this.A05.A0U() : null;
                                C30391cH r07 = (C30391cH) r82.A09(r12, C30391cH.A02.A0V());
                                this.A05 = r07;
                                if (r27 != null) {
                                    r27.A04(r07);
                                    this.A05 = (C30391cH) r27.A01();
                                }
                                this.A00 |= 512;
                                continue;
                            case 114:
                                C33221iE r28 = (this.A00 & 1024) == 1024 ? (C33221iE) this.A0D.A0U() : null;
                                C33211iD r08 = (C33211iD) r82.A09(r12, C33211iD.A0o.A0V());
                                this.A0D = r08;
                                if (r28 != null) {
                                    r28.A04(r08);
                                    this.A0D = (C33211iD) r28.A01();
                                }
                                this.A00 |= 1024;
                                continue;
                            case 120:
                                this.A00 |= 2048;
                                this.A04 = r82.A06();
                                continue;
                            case 130:
                                C69043eP r29 = (this.A00 & 4096) == 4096 ? (C69043eP) this.A0B.A0U() : null;
                                C58692tu r09 = (C58692tu) r82.A09(r12, C58692tu.A04.A0V());
                                this.A0B = r09;
                                if (r29 != null) {
                                    r29.A04(r09);
                                    this.A0B = (C58692tu) r29.A01();
                                }
                                this.A00 |= 4096;
                                continue;
                            case 138:
                                C69543fD r210 = (this.A00 & 8192) == 8192 ? (C69543fD) this.A0C.A0U() : null;
                                C58712tw r010 = (C58712tw) r82.A09(r12, C58712tw.A04.A0V());
                                this.A0C = r010;
                                if (r210 != null) {
                                    r210.A04(r010);
                                    this.A0C = (C58712tw) r210.A01();
                                }
                                this.A00 |= 8192;
                                continue;
                            default:
                                if (!A0a(r82, A032)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r011 = new C29791bD(e3.getMessage());
                        r011.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r011);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C53002eo();
            case 5:
                return new C69613fK();
            case 6:
                break;
            case 7:
                if (A0G == null) {
                    synchronized (C53002eo.class) {
                        if (A0G == null) {
                            A0G = new C47872Kz(A0F);
                        }
                    }
                }
                return A0G;
            default:
                throw new UnsupportedOperationException();
        }
        return A0F;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A0E;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A00(2, this.A02);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A02(4, this.A01);
        }
        if ((i4 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A03(this.A03);
        }
        if ((i4 & 16) == 16) {
            C58922uN r02 = this.A09;
            if (r02 == null) {
                r02 = C58922uN.A0B;
            }
            i3 += CodedOutputStream.A05(r02, 6);
        }
        if ((this.A00 & 32) == 32) {
            C37591pP r03 = this.A08;
            if (r03 == null) {
                r03 = C37591pP.A01;
            }
            i3 += CodedOutputStream.A05(r03, 7);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass2sz r04 = this.A07;
            if (r04 == null) {
                r04 = AnonymousClass2sz.A01;
            }
            i3 += CodedOutputStream.A05(r04, 8);
        }
        if ((this.A00 & 128) == 128) {
            C58192t6 r05 = this.A0A;
            if (r05 == null) {
                r05 = C58192t6.A02;
            }
            i3 += CodedOutputStream.A05(r05, 9);
        }
        if ((this.A00 & 256) == 256) {
            C58372tO r06 = this.A06;
            if (r06 == null) {
                r06 = C58372tO.A03;
            }
            i3 += CodedOutputStream.A05(r06, 10);
        }
        if ((this.A00 & 512) == 512) {
            C30391cH r07 = this.A05;
            if (r07 == null) {
                r07 = C30391cH.A02;
            }
            i3 += CodedOutputStream.A05(r07, 11);
        }
        if ((this.A00 & 1024) == 1024) {
            C33211iD r08 = this.A0D;
            if (r08 == null) {
                r08 = C33211iD.A0o;
            }
            i3 += CodedOutputStream.A05(r08, 14);
        }
        int i5 = this.A00;
        if ((i5 & 2048) == 2048) {
            i3 += 1 + CodedOutputStream.A03(this.A04);
        }
        if ((i5 & 4096) == 4096) {
            C58692tu r09 = this.A0B;
            if (r09 == null) {
                r09 = C58692tu.A04;
            }
            i3 += CodedOutputStream.A05(r09, 16);
        }
        if ((this.A00 & 8192) == 8192) {
            C58712tw r010 = this.A0C;
            if (r010 == null) {
                r010 = C58712tw.A04;
            }
            i3 += CodedOutputStream.A05(r010, 17);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A0E;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A09(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(4, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0C(5, this.A03);
        }
        if ((this.A00 & 16) == 16) {
            C58922uN r02 = this.A09;
            if (r02 == null) {
                r02 = C58922uN.A0B;
            }
            codedOutputStream.A0G(r02, 6);
        }
        if ((this.A00 & 32) == 32) {
            C37591pP r03 = this.A08;
            if (r03 == null) {
                r03 = C37591pP.A01;
            }
            codedOutputStream.A0G(r03, 7);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass2sz r04 = this.A07;
            if (r04 == null) {
                r04 = AnonymousClass2sz.A01;
            }
            codedOutputStream.A0G(r04, 8);
        }
        if ((this.A00 & 128) == 128) {
            C58192t6 r05 = this.A0A;
            if (r05 == null) {
                r05 = C58192t6.A02;
            }
            codedOutputStream.A0G(r05, 9);
        }
        if ((this.A00 & 256) == 256) {
            C58372tO r06 = this.A06;
            if (r06 == null) {
                r06 = C58372tO.A03;
            }
            codedOutputStream.A0G(r06, 10);
        }
        if ((this.A00 & 512) == 512) {
            C30391cH r07 = this.A05;
            if (r07 == null) {
                r07 = C30391cH.A02;
            }
            codedOutputStream.A0G(r07, 11);
        }
        if ((this.A00 & 1024) == 1024) {
            C33211iD r08 = this.A0D;
            if (r08 == null) {
                r08 = C33211iD.A0o;
            }
            codedOutputStream.A0G(r08, 14);
        }
        if ((this.A00 & 2048) == 2048) {
            codedOutputStream.A0C(15, this.A04);
        }
        if ((this.A00 & 4096) == 4096) {
            C58692tu r09 = this.A0B;
            if (r09 == null) {
                r09 = C58692tu.A04;
            }
            codedOutputStream.A0G(r09, 16);
        }
        if ((this.A00 & 8192) == 8192) {
            C58712tw r010 = this.A0C;
            if (r010 == null) {
                r010 = C58712tw.A04;
            }
            codedOutputStream.A0G(r010, 17);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
