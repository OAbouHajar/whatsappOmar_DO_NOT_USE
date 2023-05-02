package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1pL  reason: invalid class name and case insensitive filesystem */
public final class C37551pL extends C28541Wm implements C28561Wp {
    public static final C37551pL A08;
    public static volatile C47872Kz A09;
    public int A00;
    public C28631Ww A01 = C28631Ww.A01;
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";

    static {
        C37551pL r0 = new C37551pL();
        A08 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A08;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C37551pL r10 = (C37551pL) obj2;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A07;
                int i3 = r10.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A07 = r9.Ahz(str, r10.A07, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A06;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A06 = r9.Ahz(str2, r10.A06, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A03;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A03 = r9.Ahz(str3, r10.A03, z6, z7);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                C28631Ww r3 = this.A01;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A01 = r9.Ahn(r3, r10.A01, z8, z9);
                int i4 = this.A00;
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                String str4 = this.A02;
                int i5 = r10.A00;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A02 = r9.Ahz(str4, r10.A02, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                String str5 = this.A04;
                boolean z13 = false;
                if ((i5 & 32) == 32) {
                    z13 = true;
                }
                this.A04 = r9.Ahz(str5, r10.A04, z12, z13);
                boolean z14 = false;
                if ((i4 & 64) == 64) {
                    z14 = true;
                }
                String str6 = this.A05;
                boolean z15 = false;
                if ((i5 & 64) == 64) {
                    z15 = true;
                }
                this.A05 = r9.Ahz(str6, r10.A05, z14, z15);
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
                            String A0A = r92.A0A();
                            this.A00 = 1 | this.A00;
                            this.A07 = A0A;
                        } else if (A032 == 18) {
                            String A0A2 = r92.A0A();
                            this.A00 |= 2;
                            this.A06 = A0A2;
                        } else if (A032 == 26) {
                            String A0A3 = r92.A0A();
                            this.A00 |= 4;
                            this.A03 = A0A3;
                        } else if (A032 == 34) {
                            this.A00 |= 8;
                            this.A01 = r92.A08();
                        } else if (A032 == 42) {
                            String A0A4 = r92.A0A();
                            this.A00 |= 16;
                            this.A02 = A0A4;
                        } else if (A032 == 50) {
                            String A0A5 = r92.A0A();
                            this.A00 |= 32;
                            this.A04 = A0A5;
                        } else if (A032 == 58) {
                            String A0A6 = r92.A0A();
                            this.A00 |= 64;
                            this.A05 = A0A6;
                        } else if (!A0a(r92, A032)) {
                            break;
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
                return new C37551pL();
            case 5:
                return new C69083eT();
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C37551pL.class) {
                        if (A09 == null) {
                            A09 = new C47872Kz(A08);
                        }
                    }
                }
                return A09;
            default:
                throw new UnsupportedOperationException();
        }
        return A08;
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
        if ((this.A00 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A03);
        }
        int i4 = this.A00;
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A01, 4);
        }
        if ((i4 & 16) == 16) {
            i3 += 1 + CodedOutputStream.A06(this.A02);
        }
        if ((this.A00 & 32) == 32) {
            i3 += 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A00 & 64) == 64) {
            i3 += 1 + CodedOutputStream.A06(this.A05);
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
            codedOutputStream.A0D(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A01, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0D(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0D(7, this.A05);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
