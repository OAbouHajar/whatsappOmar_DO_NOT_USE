package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2Cg  reason: invalid class name and case insensitive filesystem */
public final class C46082Cg extends C28541Wm implements C28561Wp {
    public static final C46082Cg A07;
    public static volatile C47872Kz A08;
    public int A00;
    public int A01;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public AnonymousClass2u1 A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";

    static {
        C46082Cg r0 = new C46082Cg();
        A07 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A07;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C46082Cg r10 = (C46082Cg) obj2;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A06;
                int i3 = r10.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A06 = r9.Ahz(str, r10.A06, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A05;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A05 = r9.Ahz(str2, r10.A05, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A04;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A04 = r9.Ahz(str3, r10.A04, z6, z7);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                int i4 = this.A01;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A01 = r9.Ahq(i4, r10.A01, z8, z9);
                this.A02 = r9.Ahs(this.A02, r10.A02);
                this.A03 = (AnonymousClass2u1) r9.Ahu(this.A03, r10.A03);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A00 |= r10.A00;
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
                        } else if (A032 == 10) {
                            String A0A = r92.A0A();
                            this.A00 = 1 | this.A00;
                            this.A06 = A0A;
                        } else if (A032 == 18) {
                            String A0A2 = r92.A0A();
                            this.A00 |= 2;
                            this.A05 = A0A2;
                        } else if (A032 == 26) {
                            String A0A3 = r92.A0A();
                            this.A00 |= 4;
                            this.A04 = A0A3;
                        } else if (A032 == 32) {
                            this.A00 |= 8;
                            this.A01 = r92.A02();
                        } else if (A032 == 42) {
                            AnonymousClass1XE r1 = this.A02;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A02 = r1;
                            }
                            r1.add((AnonymousClass2IQ) r92.A09(r102, AnonymousClass2IQ.A08.A0V()));
                        } else if (A032 == 50) {
                            C68313dE r12 = (this.A00 & 16) == 16 ? (C68313dE) this.A03.A0U() : null;
                            AnonymousClass2u1 r0 = (AnonymousClass2u1) r92.A09(r102, AnonymousClass2u1.A05.A0V());
                            this.A03 = r0;
                            if (r12 != null) {
                                r12.A04(r0);
                                this.A03 = (AnonymousClass2u1) r12.A01();
                            }
                            this.A00 |= 16;
                        } else if (!A0a(r92, A032)) {
                            break;
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r02 = new C29791bD(e3.getMessage());
                        r02.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r02);
                        throw runtimeException;
                    }
                }
            case 3:
                ((AnonymousClass1XF) this.A02).A00 = false;
                return null;
            case 4:
                return new C46082Cg();
            case 5:
                return new C46092Ch();
            case 6:
                break;
            case 7:
                if (A08 == null) {
                    synchronized (C46082Cg.class) {
                        if (A08 == null) {
                            A08 = new C47872Kz(A07);
                        }
                    }
                }
                return A08;
            default:
                throw new UnsupportedOperationException();
        }
        return A07;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = (this.A00 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A06) : 0;
        if ((this.A00 & 2) == 2) {
            A062 += 1 + CodedOutputStream.A06(this.A05);
        }
        if ((this.A00 & 4) == 4) {
            A062 += 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A00 & 8) == 8) {
            A062 += CodedOutputStream.A02(4, this.A01);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            A062 += CodedOutputStream.A05((AnonymousClass1Wo) this.A02.get(i3), 5);
        }
        if ((this.A00 & 16) == 16) {
            AnonymousClass2u1 r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass2u1.A05;
            }
            A062 += CodedOutputStream.A05(r0, 6);
        }
        int A002 = A062 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A06);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0A(4, this.A01);
        }
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A02.get(i2), 5);
        }
        if ((this.A00 & 16) == 16) {
            AnonymousClass2u1 r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass2u1.A05;
            }
            codedOutputStream.A0G(r0, 6);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
