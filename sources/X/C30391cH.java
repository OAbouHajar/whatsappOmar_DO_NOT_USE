package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1cH  reason: invalid class name and case insensitive filesystem */
public final class C30391cH extends C28541Wm implements C28561Wp {
    public static final C30391cH A02;
    public static volatile C47872Kz A03;
    public int A00;
    public int A01;

    static {
        C30391cH r0 = new C30391cH();
        A02 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A02;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C30391cH r9 = (C30391cH) obj2;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                int i3 = this.A01;
                int i4 = r9.A00;
                boolean z3 = true;
                if ((i4 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r8.Ahq(i3, r9.A01, z2, z3);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i4;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            int A022 = r82.A02();
                            if (A022 == 0 || A022 == 1 || A022 == 2) {
                                this.A00 = 1 | this.A00;
                                this.A01 = A022;
                            } else {
                                super.A0X(1, A022);
                            }
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
                return new C30391cH();
            case 5:
                return new C30401cI();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C30391cH.class) {
                        if (A03 == null) {
                            A03 = new C47872Kz(A02);
                        }
                    }
                }
                return A03;
            default:
                throw new UnsupportedOperationException();
        }
        return A02;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A00(1, this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
