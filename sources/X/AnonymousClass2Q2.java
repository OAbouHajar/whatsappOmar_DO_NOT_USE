package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2Q2  reason: invalid class name */
public final class AnonymousClass2Q2 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2Q2 A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public long A02;
    public C33231iF A03;

    static {
        AnonymousClass2Q2 r0 = new AnonymousClass2Q2();
        A04 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A04;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                AnonymousClass2Q2 r2 = (AnonymousClass2Q2) obj3;
                this.A03 = (C33231iF) r8.Ahu(this.A03, r2.A03);
                int i2 = this.A00;
                boolean z2 = false;
                if ((i2 & 2) == 2) {
                    z2 = true;
                }
                int i3 = this.A01;
                int i4 = r2.A00;
                boolean z3 = false;
                if ((i4 & 2) == 2) {
                    z3 = true;
                }
                this.A01 = r8.Ahq(i3, r2.A01, z2, z3);
                boolean z4 = false;
                if ((i2 & 4) == 4) {
                    z4 = true;
                }
                long j2 = this.A02;
                boolean z5 = false;
                if ((i4 & 4) == 4) {
                    z5 = true;
                }
                this.A02 = r8.Aht(j2, r2.A02, z4, z5);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i4;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj4;
                C47862Ky r22 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            C33241iG r1 = (this.A00 & 1) == 1 ? (C33241iG) this.A03.A0U() : null;
                            C33231iF r0 = (C33231iF) r82.A09(r22, C33231iF.A05.A0V());
                            this.A03 = r0;
                            if (r1 != null) {
                                r1.A04(r0);
                                this.A03 = (C33231iF) r1.A01();
                            }
                            this.A00 |= 1;
                        } else if (A032 == 16) {
                            int A022 = r82.A02();
                            if (C802042y.A00(A022) == null) {
                                super.A0X(2, A022);
                            } else {
                                this.A00 |= 2;
                                this.A01 = A022;
                            }
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A02 = r82.A06();
                        } else if (!A0a(r82, A032)) {
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
                return null;
            case 4:
                return new AnonymousClass2Q2();
            case 5:
                return new C68913eC();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (AnonymousClass2Q2.class) {
                        if (A05 == null) {
                            A05 = new C47872Kz(A04);
                        }
                    }
                }
                return A05;
            default:
                throw new UnsupportedOperationException();
        }
        return A04;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A03;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A00(2, this.A01);
        }
        if ((i4 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A03(this.A02);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A03;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A09(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0C(3, this.A02);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
