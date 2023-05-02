package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1XC  reason: invalid class name */
public final class AnonymousClass1XC extends C28541Wm implements C28561Wp {
    public static final AnonymousClass1XC A09;
    public static volatile C47872Kz A0A;
    public int A00;
    public int A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public AnonymousClass1XE A04 = AnonymousClass2NE.A01;
    public C48342Mu A05;
    public AnonymousClass1XB A06;
    public AnonymousClass1X1 A07;
    public C34211jt A08;

    static {
        AnonymousClass1XC r0 = new AnonymousClass1XC();
        A09 = r0;
        r0.A0W();
    }

    public AnonymousClass1XC() {
        C28631Ww r0 = C28631Ww.A01;
        this.A03 = r0;
        this.A02 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r8.ordinal()) {
            case 0:
                return A09;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                AnonymousClass1XC r10 = (AnonymousClass1XC) obj2;
                this.A08 = (C34211jt) r9.Ahu(this.A08, r10.A08);
                this.A04 = r9.Ahs(this.A04, r10.A04);
                this.A06 = (AnonymousClass1XB) r9.Ahu(this.A06, r10.A06);
                boolean z2 = false;
                if ((this.A00 & 4) == 4) {
                    z2 = true;
                }
                C28631Ww r3 = this.A03;
                boolean z3 = false;
                if ((r10.A00 & 4) == 4) {
                    z3 = true;
                }
                this.A03 = r9.Ahn(r3, r10.A03, z2, z3);
                boolean z4 = false;
                if ((this.A00 & 8) == 8) {
                    z4 = true;
                }
                C28631Ww r32 = this.A02;
                boolean z5 = false;
                if ((r10.A00 & 8) == 8) {
                    z5 = true;
                }
                this.A02 = r9.Ahn(r32, r10.A02, z4, z5);
                this.A07 = (AnonymousClass1X1) r9.Ahu(this.A07, r10.A07);
                this.A05 = (C48342Mu) r9.Ahu(this.A05, r10.A05);
                int i3 = this.A00;
                boolean z6 = false;
                if ((i3 & 64) == 64) {
                    z6 = true;
                }
                int i4 = this.A01;
                int i5 = r10.A00;
                boolean z7 = false;
                if ((i5 & 64) == 64) {
                    z7 = true;
                }
                this.A01 = r9.Ahq(i4, r10.A01, z6, z7);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A00 = i3 | i5;
                }
                return this;
            case 2:
                C47852Kx r92 = (C47852Kx) obj;
                C47862Ky r102 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A032 = r92.A03();
                        if (A032 == 0) {
                            break;
                        } else {
                            if (A032 == 10) {
                                C48252Ml r1 = (this.A00 & 1) == 1 ? (C48252Ml) this.A08.A0U() : null;
                                C34211jt r0 = (C34211jt) r92.A09(r102, C34211jt.A02.A0V());
                                this.A08 = r0;
                                if (r1 != null) {
                                    r1.A04(r0);
                                    this.A08 = (C34211jt) r1.A01();
                                }
                                i2 = this.A00 | 1;
                            } else if (A032 == 18) {
                                AnonymousClass1XE r12 = this.A04;
                                if (!((AnonymousClass1XF) r12).A00) {
                                    r12 = C28541Wm.A0G(r12);
                                    this.A04 = r12;
                                }
                                r12.add((AnonymousClass1X3) r92.A09(r102, AnonymousClass1X3.A03.A0V()));
                            } else if (A032 == 26) {
                                C48332Mt r13 = (this.A00 & 2) == 2 ? (C48332Mt) this.A06.A0U() : null;
                                AnonymousClass1XB r02 = (AnonymousClass1XB) r92.A09(r102, AnonymousClass1XB.A07.A0V());
                                this.A06 = r02;
                                if (r13 != null) {
                                    r13.A04(r02);
                                    this.A06 = (AnonymousClass1XB) r13.A01();
                                }
                                i2 = this.A00 | 2;
                            } else if (A032 == 34) {
                                this.A00 |= 4;
                                this.A03 = r92.A08();
                            } else if (A032 == 42) {
                                this.A00 |= 8;
                                this.A02 = r92.A08();
                            } else if (A032 == 50) {
                                C48292Mp r14 = (this.A00 & 16) == 16 ? (C48292Mp) this.A07.A0U() : null;
                                AnonymousClass1X1 r03 = (AnonymousClass1X1) r92.A09(r102, AnonymousClass1X1.A02.A0V());
                                this.A07 = r03;
                                if (r14 != null) {
                                    r14.A04(r03);
                                    this.A07 = (AnonymousClass1X1) r14.A01();
                                }
                                i2 = this.A00 | 16;
                            } else if (A032 == 58) {
                                C48352Mv r15 = (this.A00 & 32) == 32 ? (C48352Mv) this.A05.A0U() : null;
                                C48342Mu r04 = (C48342Mu) r92.A09(r102, C48342Mu.A03.A0V());
                                this.A05 = r04;
                                if (r15 != null) {
                                    r15.A04(r04);
                                    this.A05 = (C48342Mu) r15.A01();
                                }
                                i2 = this.A00 | 32;
                            } else if (A032 == 64) {
                                this.A00 |= 64;
                                this.A01 = r92.A02();
                            } else if (!A0a(r92, A032)) {
                                break;
                            }
                            this.A00 = i2;
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r05 = new C29791bD(e3.getMessage());
                        r05.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r05);
                        throw runtimeException;
                    }
                }
            case 3:
                ((AnonymousClass1XF) this.A04).A00 = false;
                return null;
            case 4:
                return new AnonymousClass1XC();
            case 5:
                return new C69423f1();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (AnonymousClass1XC.class) {
                        if (A0A == null) {
                            A0A = new C47872Kz(A09);
                        }
                    }
                }
                return A0A;
            default:
                throw new UnsupportedOperationException();
        }
        return A09;
    }

    public int AFw() {
        int i2;
        int i3 = this.A00;
        if (i3 != -1) {
            return i3;
        }
        if ((this.A00 & 1) == 1) {
            C34211jt r0 = this.A08;
            if (r0 == null) {
                r0 = C34211jt.A02;
            }
            i2 = CodedOutputStream.A05(r0, 1);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < this.A04.size(); i4++) {
            i2 += CodedOutputStream.A05((AnonymousClass1Wo) this.A04.get(i4), 2);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass1XB r02 = this.A06;
            if (r02 == null) {
                r02 = AnonymousClass1XB.A07;
            }
            i2 += CodedOutputStream.A05(r02, 3);
        }
        int i5 = this.A00;
        if ((i5 & 4) == 4) {
            i2 += CodedOutputStream.A04(this.A03, 4);
        }
        if ((i5 & 8) == 8) {
            i2 += CodedOutputStream.A04(this.A02, 5);
        }
        if ((i5 & 16) == 16) {
            AnonymousClass1X1 r03 = this.A07;
            if (r03 == null) {
                r03 = AnonymousClass1X1.A02;
            }
            i2 += CodedOutputStream.A05(r03, 6);
        }
        if ((this.A00 & 32) == 32) {
            C48342Mu r04 = this.A05;
            if (r04 == null) {
                r04 = C48342Mu.A03;
            }
            i2 += CodedOutputStream.A05(r04, 7);
        }
        if ((this.A00 & 64) == 64) {
            i2 += CodedOutputStream.A02(8, this.A01);
        }
        int A002 = i2 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C34211jt r0 = this.A08;
            if (r0 == null) {
                r0 = C34211jt.A02;
            }
            codedOutputStream.A0G(r0, 1);
        }
        for (int i2 = 0; i2 < this.A04.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A04.get(i2), 2);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass1XB r02 = this.A06;
            if (r02 == null) {
                r02 = AnonymousClass1XB.A07;
            }
            codedOutputStream.A0G(r02, 3);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A03, 4);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A02, 5);
        }
        if ((this.A00 & 16) == 16) {
            AnonymousClass1X1 r03 = this.A07;
            if (r03 == null) {
                r03 = AnonymousClass1X1.A02;
            }
            codedOutputStream.A0G(r03, 6);
        }
        if ((this.A00 & 32) == 32) {
            C48342Mu r04 = this.A05;
            if (r04 == null) {
                r04 = C48342Mu.A03;
            }
            codedOutputStream.A0G(r04, 7);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0A(8, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
