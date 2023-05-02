package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2go  reason: invalid class name and case insensitive filesystem */
public final class C54102go extends C28541Wm implements C28561Wp {
    public static final C54102go A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01;
    public C54122gq A02;
    public C58542tf A03;
    public String A04 = "";
    public boolean A05;

    static {
        C54102go r0 = new C54102go();
        A06 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r8.ordinal()) {
            case 0:
                return A06;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C54102go r10 = (C54102go) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A04;
                boolean z3 = true;
                if ((r10.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A04 = r9.Ahz(str, r10.A04, z2, z3);
                this.A02 = (C54122gq) r9.Ahu(this.A02, r10.A02);
                int i3 = this.A00;
                boolean z4 = false;
                if ((i3 & 4) == 4) {
                    z4 = true;
                }
                int i4 = this.A01;
                int i5 = r10.A00;
                boolean z5 = false;
                if ((i5 & 4) == 4) {
                    z5 = true;
                }
                this.A01 = r9.Ahq(i4, r10.A01, z4, z5);
                boolean z6 = false;
                if ((i3 & 8) == 8) {
                    z6 = true;
                }
                boolean z7 = this.A05;
                boolean z8 = false;
                if ((i5 & 8) == 8) {
                    z8 = true;
                }
                this.A05 = r9.Ahm(z6, z7, z8, r10.A05);
                this.A03 = (C58542tf) r9.Ahu(this.A03, r10.A03);
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
                        } else if (A032 != 10) {
                            if (A032 == 18) {
                                C54132gr r1 = (this.A00 & 2) == 2 ? (C54132gr) this.A02.A0U() : null;
                                C54122gq r0 = (C54122gq) r92.A09(r102, C54122gq.A06.A0V());
                                this.A02 = r0;
                                if (r1 != null) {
                                    r1.A04(r0);
                                    this.A02 = (C54122gq) r1.A01();
                                }
                                i2 = this.A00 | 2;
                            } else if (A032 == 24) {
                                int A022 = r92.A02();
                                if (C37421p8.A00(A022) == null) {
                                    super.A0X(3, A022);
                                } else {
                                    this.A00 |= 4;
                                    this.A01 = A022;
                                }
                            } else if (A032 == 32) {
                                this.A00 |= 8;
                                this.A05 = r92.A0F();
                            } else if (A032 == 42) {
                                C68413dO r12 = (this.A00 & 16) == 16 ? (C68413dO) this.A03.A0U() : null;
                                C58542tf r02 = (C58542tf) r92.A09(r102, C58542tf.A04.A0V());
                                this.A03 = r02;
                                if (r12 != null) {
                                    r12.A04(r02);
                                    this.A03 = (C58542tf) r12.A01();
                                }
                                i2 = this.A00 | 16;
                            } else if (!A0a(r92, A032)) {
                                break;
                            }
                            this.A00 = i2;
                        } else {
                            String A0A = r92.A0A();
                            this.A00 = 1 | this.A00;
                            this.A04 = A0A;
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r03 = new C29791bD(e3.getMessage());
                        r03.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r03);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C54102go();
            case 5:
                return new C54112gp();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C54102go.class) {
                        if (A07 == null) {
                            A07 = new C47872Kz(A06);
                        }
                    }
                }
                return A07;
            default:
                throw new UnsupportedOperationException();
        }
        return A06;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A00 & 2) == 2) {
            C54122gq r0 = this.A02;
            if (r0 == null) {
                r0 = C54122gq.A06;
            }
            i3 += CodedOutputStream.A05(r0, 2);
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A00(3, this.A01);
        }
        if ((i4 & 8) == 8) {
            i3 += 2;
        }
        if ((i4 & 16) == 16) {
            C58542tf r02 = this.A03;
            if (r02 == null) {
                r02 = C58542tf.A04;
            }
            i3 += CodedOutputStream.A05(r02, 5);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            C54122gq r0 = this.A02;
            if (r0 == null) {
                r0 = C54122gq.A06;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A09(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0E(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            C58542tf r02 = this.A03;
            if (r02 == null) {
                r02 = C58542tf.A04;
            }
            codedOutputStream.A0G(r02, 5);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
