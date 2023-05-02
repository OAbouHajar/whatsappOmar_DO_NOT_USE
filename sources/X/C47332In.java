package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2In  reason: invalid class name and case insensitive filesystem */
public final class C47332In extends C28541Wm implements C28561Wp {
    public static final C47332In A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public String A04 = "";

    static {
        C47332In r0 = new C47332In();
        A05 = r0;
        r0.A0W();
    }

    public C47332In() {
        C28631Ww r1 = C28631Ww.A01;
        this.A02 = r1;
        this.A03 = r1;
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C47332In r10 = (C47332In) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                C28631Ww r2 = this.A02;
                boolean z3 = true;
                if ((r10.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A02 = r9.Ahn(r2, r10.A02, z2, z3);
                int i2 = this.A00;
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str = this.A04;
                int i3 = r10.A00;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r9.Ahz(str, r10.A04, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                C28631Ww r3 = this.A03;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A03 = r9.Ahn(r3, r10.A03, z6, z7);
                int i4 = this.A00;
                boolean z8 = false;
                if ((i4 & 8) == 8) {
                    z8 = true;
                }
                int i5 = this.A01;
                int i6 = r10.A00;
                boolean z9 = false;
                if ((i6 & 8) == 8) {
                    z9 = true;
                }
                this.A01 = r9.Ahq(i5, r10.A01, z8, z9);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A00 = i4 | i6;
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
                            this.A00 |= 1;
                            this.A02 = r92.A08();
                        } else if (A032 == 18) {
                            String A0A = r92.A0A();
                            this.A00 |= 2;
                            this.A04 = A0A;
                        } else if (A032 == 26) {
                            this.A00 |= 4;
                            this.A03 = r92.A08();
                        } else if (A032 == 32) {
                            this.A00 |= 8;
                            this.A01 = r92.A02();
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
                return new C47332In();
            case 5:
                return new C47322Im();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C47332In.class) {
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
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A04(this.A02, 1);
        }
        if ((i4 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A04);
        }
        int i5 = this.A00;
        if ((i5 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A03, 3);
        }
        if ((i5 & 8) == 8) {
            i3 += CodedOutputStream.A02(4, this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A02, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A03, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0A(4, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
