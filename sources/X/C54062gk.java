package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2gk  reason: invalid class name and case insensitive filesystem */
public final class C54062gk extends C28541Wm implements C28561Wp {
    public static final C54062gk A03;
    public static volatile C47872Kz A04;
    public int A00;
    public int A01;
    public boolean A02;

    static {
        C54062gk r0 = new C54062gk();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C54062gk r10 = (C54062gk) obj2;
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
                boolean z5 = this.A02;
                boolean z6 = false;
                if ((i4 & 2) == 2) {
                    z6 = true;
                }
                this.A02 = r9.Ahm(z4, z5, z6, r10.A02);
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
                        } else if (A032 == 120) {
                            int A022 = r92.A02();
                            if (A022 == 0 || A022 == 1 || A022 == 2 || A022 == 3 || A022 == 4) {
                                this.A00 = 1 | this.A00;
                                this.A01 = A022;
                            } else {
                                super.A0X(15, A022);
                            }
                        } else if (A032 == 128) {
                            this.A00 |= 2;
                            this.A02 = r92.A0F();
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
                return new C54062gk();
            case 5:
                return new C54072gl();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C54062gk.class) {
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
            i3 = 0 + CodedOutputStream.A00(15, this.A01);
        }
        if ((i4 & 2) == 2) {
            i3 += 3;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(15, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0E(16, this.A02);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
