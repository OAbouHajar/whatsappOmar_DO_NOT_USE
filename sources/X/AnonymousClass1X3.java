package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1X3  reason: invalid class name */
public final class AnonymousClass1X3 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass1X3 A03;
    public static volatile C47872Kz A04;
    public int A00;
    public int A01;
    public AnonymousClass1X2 A02;

    static {
        AnonymousClass1X3 r0 = new AnonymousClass1X3();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r5.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                AnonymousClass1X3 r7 = (AnonymousClass1X3) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                int i2 = this.A01;
                boolean z3 = true;
                if ((r7.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r6.Ahq(i2, r7.A01, z2, z3);
                this.A02 = (AnonymousClass1X2) r6.Ahu(this.A02, r7.A02);
                if (r6 == AnonymousClass2L7.A00) {
                    this.A00 |= r7.A00;
                }
                return this;
            case 2:
                C47852Kx r62 = (C47852Kx) obj;
                C47862Ky r72 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A032 = r62.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            int A022 = r62.A02();
                            if (A022 == 0 || A022 == 1) {
                                this.A00 = 1 | this.A00;
                                this.A01 = A022;
                            } else {
                                super.A0X(1, A022);
                            }
                        } else if (A032 == 18) {
                            C48312Mr r1 = (this.A00 & 2) == 2 ? (C48312Mr) this.A02.A0U() : null;
                            AnonymousClass1X2 r0 = (AnonymousClass1X2) r62.A09(r72, AnonymousClass1X2.A04.A0V());
                            this.A02 = r0;
                            if (r1 != null) {
                                r1.A04(r0);
                                this.A02 = (AnonymousClass1X2) r1.A01();
                            }
                            this.A00 |= 2;
                        } else if (!A0a(r62, A032)) {
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
                return new AnonymousClass1X3();
            case 5:
                return new C69413f0();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (AnonymousClass1X3.class) {
                        if (A04 == null) {
                            A04 = new C47872Kz(A03);
                        }
                    }
                }
                return A04;
            default:
                throw new UnsupportedOperationException();
        }
        return A03;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A00(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            AnonymousClass1X2 r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass1X2.A04;
            }
            i3 += CodedOutputStream.A05(r0, 2);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass1X2 r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass1X2.A04;
            }
            codedOutputStream.A0G(r0, 2);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
