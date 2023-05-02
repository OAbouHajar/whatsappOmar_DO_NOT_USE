package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2eu  reason: invalid class name and case insensitive filesystem */
public final class C53052eu extends C28541Wm implements C28561Wp {
    public static final C53052eu A05;
    public static volatile C47872Kz A06;
    public int A00;
    public long A01;
    public C33231iF A02;
    public String A03 = "";
    public String A04 = "";

    static {
        C53052eu r0 = new C53052eu();
        A05 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                C53052eu r2 = (C53052eu) obj3;
                this.A02 = (C33231iF) r8.Ahu(this.A02, r2.A02);
                int i2 = this.A00;
                boolean z2 = false;
                if ((i2 & 2) == 2) {
                    z2 = true;
                }
                String str = this.A04;
                int i3 = r2.A00;
                boolean z3 = false;
                if ((i3 & 2) == 2) {
                    z3 = true;
                }
                this.A04 = r8.Ahz(str, r2.A04, z2, z3);
                boolean z4 = false;
                if ((i2 & 4) == 4) {
                    z4 = true;
                }
                String str2 = this.A03;
                boolean z5 = false;
                if ((i3 & 4) == 4) {
                    z5 = true;
                }
                this.A03 = r8.Ahz(str2, r2.A03, z4, z5);
                boolean z6 = false;
                if ((i2 & 8) == 8) {
                    z6 = true;
                }
                long j2 = this.A01;
                boolean z7 = false;
                if ((i3 & 8) == 8) {
                    z7 = true;
                }
                this.A01 = r8.Aht(j2, r2.A01, z6, z7);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
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
                            C33241iG r1 = (this.A00 & 1) == 1 ? (C33241iG) this.A02.A0U() : null;
                            C33231iF r0 = (C33231iF) r82.A09(r22, C33231iF.A05.A0V());
                            this.A02 = r0;
                            if (r1 != null) {
                                r1.A04(r0);
                                this.A02 = (C33231iF) r1.A01();
                            }
                            this.A00 |= 1;
                        } else if (A032 == 18) {
                            String A0A = r82.A0A();
                            this.A00 |= 2;
                            this.A04 = A0A;
                        } else if (A032 == 26) {
                            String A0A2 = r82.A0A();
                            this.A00 |= 4;
                            this.A03 = A0A2;
                        } else if (A032 == 32) {
                            this.A00 |= 8;
                            this.A01 = r82.A06();
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
                return new C53052eu();
            case 5:
                return new C69173ec();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C53052eu.class) {
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
            C33231iF r0 = this.A02;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A00 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A03);
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
            C33231iF r0 = this.A02;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0C(4, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
