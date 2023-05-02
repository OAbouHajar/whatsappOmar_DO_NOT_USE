package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2ex  reason: invalid class name and case insensitive filesystem */
public final class C53082ex extends C28541Wm implements C28561Wp {
    public static final C53082ex A05;
    public static volatile C47872Kz A06;
    public int A00;
    public long A01;
    public C58462tX A02;
    public C58152sy A03;
    public C33231iF A04;

    static {
        C53082ex r0 = new C53082ex();
        A05 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r12, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        Object obj3 = obj;
        switch (r12.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r4 = (AnonymousClass2L6) obj3;
                C53082ex r14 = (C53082ex) obj2;
                this.A04 = (C33231iF) r4.Ahu(this.A04, r14.A04);
                this.A02 = (C58462tX) r4.Ahu(this.A02, r14.A02);
                this.A03 = (C58152sy) r4.Ahu(this.A03, r14.A03);
                int i3 = this.A00;
                boolean z2 = false;
                if ((i3 & 8) == 8) {
                    z2 = true;
                }
                long j2 = this.A01;
                int i4 = r14.A00;
                boolean z3 = false;
                if ((i4 & 8) == 8) {
                    z3 = true;
                }
                this.A01 = r4.Aht(j2, r14.A01, z2, z3);
                if (r4 == AnonymousClass2L7.A00) {
                    this.A00 = i3 | i4;
                }
                return this;
            case 2:
                C47852Kx r42 = (C47852Kx) obj3;
                C47862Ky r142 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A032 = r42.A03();
                        int i5 = 1;
                        if (A032 == 0) {
                            break;
                        } else {
                            if (A032 == 10) {
                                C33241iG r1 = (this.A00 & 1) == 1 ? (C33241iG) this.A04.A0U() : null;
                                C33231iF r0 = (C33231iF) r42.A09(r142, C33231iF.A05.A0V());
                                this.A04 = r0;
                                if (r1 != null) {
                                    r1.A04(r0);
                                    this.A04 = (C33231iF) r1.A01();
                                }
                                i2 = this.A00;
                            } else if (A032 == 18) {
                                i5 = 2;
                                C69113eW r13 = (this.A00 & 2) == 2 ? (C69113eW) this.A02.A0U() : null;
                                C58462tX r02 = (C58462tX) r42.A09(r142, C58462tX.A03.A0V());
                                this.A02 = r02;
                                if (r13 != null) {
                                    r13.A04(r02);
                                    this.A02 = (C58462tX) r13.A01();
                                }
                                i2 = this.A00;
                            } else if (A032 == 26) {
                                i5 = 4;
                                C69133eY r15 = (this.A00 & 4) == 4 ? (C69133eY) this.A03.A0U() : null;
                                C58152sy r03 = (C58152sy) r42.A09(r142, C58152sy.A00.A0V());
                                this.A03 = r03;
                                if (r15 != null) {
                                    r15.A04(r03);
                                    this.A03 = (C58152sy) r15.A01();
                                }
                                i2 = this.A00;
                            } else if (A032 == 32) {
                                this.A00 |= 8;
                                this.A01 = r42.A06();
                            } else if (!A0a(r42, A032)) {
                                break;
                            }
                            this.A00 = i2 | i5;
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r04 = new C29791bD(e3.getMessage());
                        r04.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r04);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C53082ex();
            case 5:
                return new C69123eX();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C53082ex.class) {
                        if (A06 == null) {
                            A06 = new C47872Kz(A05);
                        }
                    }
                }
                return A06;
            default:
                throw new UnsupportedOperationException();
        }
        return A05;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A04;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            C58462tX r02 = this.A02;
            if (r02 == null) {
                r02 = C58462tX.A03;
            }
            i3 += CodedOutputStream.A05(r02, 2);
        }
        if ((this.A00 & 4) == 4) {
            C58152sy r03 = this.A03;
            if (r03 == null) {
                r03 = C58152sy.A00;
            }
            i3 += CodedOutputStream.A05(r03, 3);
        }
        if ((this.A00 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A03(this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A04;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            C58462tX r02 = this.A02;
            if (r02 == null) {
                r02 = C58462tX.A03;
            }
            codedOutputStream.A0G(r02, 2);
        }
        if ((this.A00 & 4) == 4) {
            C58152sy r03 = this.A03;
            if (r03 == null) {
                r03 = C58152sy.A00;
            }
            codedOutputStream.A0G(r03, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0C(4, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
