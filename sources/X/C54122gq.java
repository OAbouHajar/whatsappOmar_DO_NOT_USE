package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2gq  reason: invalid class name and case insensitive filesystem */
public final class C54122gq extends C28541Wm implements C28561Wp {
    public static final C54122gq A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    static {
        C54122gq r0 = new C54122gq();
        A06 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A06;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C54122gq r10 = (C54122gq) obj2;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                int i3 = this.A01;
                int i4 = r10.A00;
                boolean z3 = true;
                if ((i4 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r9.Ahq(i3, r10.A01, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                int i5 = this.A04;
                boolean z5 = false;
                if ((i4 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r9.Ahq(i5, r10.A04, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                int i6 = this.A05;
                boolean z7 = false;
                if ((i4 & 4) == 4) {
                    z7 = true;
                }
                this.A05 = r9.Ahq(i6, r10.A05, z6, z7);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                int i7 = this.A02;
                boolean z9 = false;
                if ((i4 & 8) == 8) {
                    z9 = true;
                }
                this.A02 = r9.Ahq(i7, r10.A02, z8, z9);
                boolean z10 = false;
                if ((i2 & 16) == 16) {
                    z10 = true;
                }
                int i8 = this.A03;
                boolean z11 = false;
                if ((i4 & 16) == 16) {
                    z11 = true;
                }
                this.A03 = r9.Ahq(i8, r10.A03, z10, z11);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i4;
                }
                return this;
            case 2:
                C47852Kx r92 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r92.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            this.A00 |= 1;
                            this.A01 = r92.A02();
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A04 = r92.A02();
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A05 = r92.A02();
                        } else if (A032 == 32) {
                            this.A00 |= 8;
                            this.A02 = r92.A02();
                        } else if (A032 == 40) {
                            this.A00 |= 16;
                            this.A03 = r92.A02();
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
                return new C54122gq();
            case 5:
                return new C54132gr();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C54122gq.class) {
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
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A02(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A02(2, this.A04);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A02(3, this.A05);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A02(4, this.A02);
        }
        if ((i4 & 16) == 16) {
            i3 += CodedOutputStream.A02(5, this.A03);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0A(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(3, this.A05);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0A(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0A(5, this.A03);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
