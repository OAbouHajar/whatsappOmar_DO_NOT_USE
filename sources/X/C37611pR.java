package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1pR  reason: invalid class name and case insensitive filesystem */
public final class C37611pR extends C28541Wm implements C28561Wp {
    public static final C37611pR A02;
    public static volatile C47872Kz A03;
    public int A00;
    public C28631Ww A01 = C28631Ww.A01;

    static {
        C37611pR r0 = new C37611pR();
        A02 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r5.ordinal()) {
            case 0:
                return A02;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                C37611pR r7 = (C37611pR) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                C28631Ww r2 = this.A01;
                boolean z3 = true;
                if ((r7.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r6.Ahn(r2, r7.A01, z2, z3);
                if (r6 == AnonymousClass2L7.A00) {
                    this.A00 |= r7.A00;
                }
                return this;
            case 2:
                C47852Kx r62 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r62.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            this.A00 |= 1;
                            this.A01 = r62.A08();
                        } else if (!A0a(r62, A032)) {
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
                return new C37611pR();
            case 5:
                return new C68563dd();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C37611pR.class) {
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
            i3 = 0 + CodedOutputStream.A04(this.A01, 1);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A01, 1);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
