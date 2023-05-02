package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2IR  reason: invalid class name */
public final class AnonymousClass2IR extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2IR A09;
    public static volatile C47872Kz A0A;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";

    static {
        AnonymousClass2IR r0 = new AnonymousClass2IR();
        A09 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        int i3;
        switch (r8.ordinal()) {
            case 0:
                return A09;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                AnonymousClass2IR r10 = (AnonymousClass2IR) obj2;
                int i4 = this.A00;
                boolean z2 = true;
                if ((i4 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A07;
                int i5 = r10.A00;
                boolean z3 = true;
                if ((i5 & 1) != 1) {
                    z3 = false;
                }
                this.A07 = r9.Ahz(str, r10.A07, z2, z3);
                boolean z4 = false;
                if ((i4 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A06;
                boolean z5 = false;
                if ((i5 & 2) == 2) {
                    z5 = true;
                }
                this.A06 = r9.Ahz(str2, r10.A06, z4, z5);
                boolean z6 = false;
                if ((i4 & 4) == 4) {
                    z6 = true;
                }
                int i6 = this.A04;
                boolean z7 = false;
                if ((i5 & 4) == 4) {
                    z7 = true;
                }
                this.A04 = r9.Ahq(i6, r10.A04, z6, z7);
                boolean z8 = false;
                if ((i4 & 8) == 8) {
                    z8 = true;
                }
                int i7 = this.A05;
                boolean z9 = false;
                if ((i5 & 8) == 8) {
                    z9 = true;
                }
                this.A05 = r9.Ahq(i7, r10.A05, z8, z9);
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                int i8 = this.A03;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A03 = r9.Ahq(i8, r10.A03, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                int i9 = this.A02;
                boolean z13 = false;
                if ((i5 & 32) == 32) {
                    z13 = true;
                }
                this.A02 = r9.Ahq(i9, r10.A02, z12, z13);
                boolean z14 = false;
                if ((i4 & 64) == 64) {
                    z14 = true;
                }
                int i10 = this.A01;
                boolean z15 = false;
                if ((i5 & 64) == 64) {
                    z15 = true;
                }
                this.A01 = r9.Ahq(i10, r10.A01, z14, z15);
                boolean z16 = false;
                if ((i4 & 128) == 128) {
                    z16 = true;
                }
                String str3 = this.A08;
                boolean z17 = false;
                if ((i5 & 128) == 128) {
                    z17 = true;
                }
                this.A08 = r9.Ahz(str3, r10.A08, z16, z17);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A00 = i4 | i5;
                }
                return this;
            case 2:
                C47852Kx r92 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r92.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A2 = r92.A0A();
                            this.A00 = 1 | this.A00;
                            this.A07 = A0A2;
                        } else if (A032 == 18) {
                            String A0A3 = r92.A0A();
                            this.A00 |= 2;
                            this.A06 = A0A3;
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A04 = r92.A02();
                        } else if (A032 != 32) {
                            if (A032 == 40) {
                                i2 = r92.A02();
                                if (AnonymousClass433.A00(i2) == null) {
                                    i3 = 5;
                                } else {
                                    this.A00 |= 16;
                                    this.A03 = i2;
                                }
                            } else if (A032 == 48) {
                                this.A00 |= 32;
                                this.A02 = r92.A02();
                            } else if (A032 == 56) {
                                i2 = r92.A02();
                                if (i2 == 0 || i2 == 1 || i2 == 2) {
                                    this.A00 |= 64;
                                    this.A01 = i2;
                                } else {
                                    i3 = 7;
                                }
                            } else if (A032 == 66) {
                                String A0A4 = r92.A0A();
                                this.A00 |= 128;
                                this.A08 = A0A4;
                            } else if (!A0a(r92, A032)) {
                                break;
                            }
                            super.A0X(i3, i2);
                        } else {
                            int A022 = r92.A02();
                            if (A022 == 0 || A022 == 1 || A022 == 2 || A022 == 3) {
                                this.A00 |= 8;
                                this.A05 = A022;
                            } else {
                                super.A0X(4, A022);
                            }
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r0 = new C29791bD(e3.getMessage());
                        r0.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r0);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new AnonymousClass2IR();
            case 5:
                return new C68373dK();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (AnonymousClass2IR.class) {
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
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A07);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A06);
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A02(3, this.A04);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A00(4, this.A05);
        }
        if ((i4 & 16) == 16) {
            i3 += CodedOutputStream.A00(5, this.A03);
        }
        if ((i4 & 32) == 32) {
            i3 += CodedOutputStream.A02(6, this.A02);
        }
        if ((i4 & 64) == 64) {
            i3 += CodedOutputStream.A00(7, this.A01);
        }
        if ((i4 & 128) == 128) {
            i3 += 1 + CodedOutputStream.A06(this.A08);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A06);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A09(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A09(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0A(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A09(7, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0D(8, this.A08);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
