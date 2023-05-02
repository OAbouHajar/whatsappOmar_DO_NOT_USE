package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.27I  reason: invalid class name */
public final class AnonymousClass27I extends C28541Wm implements C28561Wp {
    public static final AnonymousClass27I A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public int A02;
    public long A03;

    static {
        AnonymousClass27I r0 = new AnonymousClass27I();
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
                AnonymousClass27I r7 = (AnonymousClass27I) obj3;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                int i3 = this.A02;
                int i4 = r7.A00;
                boolean z3 = true;
                if ((i4 & 1) != 1) {
                    z3 = false;
                }
                this.A02 = r8.Ahq(i3, r7.A02, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                long j2 = this.A03;
                boolean z5 = false;
                if ((i4 & 2) == 2) {
                    z5 = true;
                }
                this.A03 = r8.Aht(j2, r7.A03, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                int i5 = this.A01;
                boolean z7 = false;
                if ((i4 & 4) == 4) {
                    z7 = true;
                }
                this.A01 = r8.Ahq(i5, r7.A01, z6, z7);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i4;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj4;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            this.A00 |= 1;
                            this.A02 = r82.A02();
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A03 = r82.A06();
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A01 = r82.A02();
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
                return new AnonymousClass27I();
            case 5:
                return new C68233d6();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (AnonymousClass27I.class) {
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
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A02(1, this.A02);
        }
        if ((i4 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A03(this.A03);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A02(3, this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(3, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
