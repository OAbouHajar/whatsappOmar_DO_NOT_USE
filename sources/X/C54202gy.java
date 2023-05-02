package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2gy  reason: invalid class name and case insensitive filesystem */
public final class C54202gy extends C28541Wm implements C28561Wp {
    public static final C54202gy A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public C58972uS A02;
    public String A03 = "";
    public String A04 = "";

    static {
        C54202gy r0 = new C54202gy();
        A05 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C54202gy r10 = (C54202gy) obj2;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A03;
                int i3 = r10.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A03 = r9.Ahz(str, r10.A03, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A04;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r9.Ahz(str2, r10.A04, z4, z5);
                this.A02 = (C58972uS) r9.Ahu(this.A02, r10.A02);
                int i4 = this.A00;
                boolean z6 = false;
                if ((i4 & 8) == 8) {
                    z6 = true;
                }
                int i5 = this.A01;
                int i6 = r10.A00;
                boolean z7 = false;
                if ((i6 & 8) == 8) {
                    z7 = true;
                }
                this.A01 = r9.Ahq(i5, r10.A01, z6, z7);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A00 = i4 | i6;
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
                            this.A03 = A0A;
                        } else if (A032 == 18) {
                            String A0A2 = r92.A0A();
                            this.A00 |= 2;
                            this.A04 = A0A2;
                        } else if (A032 == 26) {
                            C69453f4 r1 = (this.A00 & 4) == 4 ? (C69453f4) this.A02.A0U() : null;
                            C58972uS r0 = (C58972uS) r92.A09(r102, C58972uS.A0C.A0V());
                            this.A02 = r0;
                            if (r1 != null) {
                                r1.A04(r0);
                                this.A02 = (C58972uS) r1.A01();
                            }
                            this.A00 |= 4;
                        } else if (A032 == 32) {
                            int A022 = r92.A02();
                            if (A022 == 0 || A022 == 1 || A022 == 2 || A022 == 3 || A022 == 4) {
                                this.A00 |= 8;
                                this.A01 = A022;
                            } else {
                                super.A0X(4, A022);
                            }
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
                return null;
            case 4:
                return new C54202gy();
            case 5:
                return new C69443f3();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C54202gy.class) {
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
            i3 = 0 + 1 + CodedOutputStream.A06(this.A03);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C58972uS r0 = this.A02;
            if (r0 == null) {
                r0 = C58972uS.A0C;
            }
            i3 += CodedOutputStream.A05(r0, 3);
        }
        if ((this.A00 & 8) == 8) {
            i3 += CodedOutputStream.A00(4, this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C58972uS r0 = this.A02;
            if (r0 == null) {
                r0 = C58972uS.A0C;
            }
            codedOutputStream.A0G(r0, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A09(4, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
