package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1cQ  reason: invalid class name and case insensitive filesystem */
public final class C30481cQ extends C28541Wm implements C28561Wp {
    public static final C30481cQ A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public long A02;
    public String A03 = "";

    static {
        C30481cQ r0 = new C30481cQ();
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
                C30481cQ r4 = (C30481cQ) obj3;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A03;
                int i3 = r4.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A03 = r8.Ahz(str, r4.A03, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                int i4 = this.A01;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A01 = r8.Ahq(i4, r4.A01, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                long j2 = this.A02;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A02 = r8.Aht(j2, r4.A02, z6, z7);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj4;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A = r82.A0A();
                            this.A00 = 1 | this.A00;
                            this.A03 = A0A;
                        } else if (A032 == 16) {
                            int A022 = r82.A02();
                            if (A022 == 0 || A022 == 1) {
                                this.A00 |= 2;
                                this.A01 = A022;
                            } else {
                                super.A0X(2, A022);
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
                        C29791bD r0 = new C29791bD(e3.getMessage());
                        r0.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r0);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C30481cQ();
            case 5:
                return new C69343et();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C30481cQ.class) {
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
            i3 = 0 + 1 + CodedOutputStream.A06(this.A03);
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
            codedOutputStream.A0D(1, this.A03);
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
