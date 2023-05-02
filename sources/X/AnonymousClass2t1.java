package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2t1  reason: invalid class name */
public final class AnonymousClass2t1 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2t1 A02;
    public static volatile C47872Kz A03;
    public int A00;
    public String A01 = "";

    static {
        AnonymousClass2t1 r0 = new AnonymousClass2t1();
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
                AnonymousClass2t1 r9 = (AnonymousClass2t1) obj2;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                String str = this.A01;
                int i3 = r9.A00;
                this.A01 = r8.Ahz(str, r9.A01, A0T, C28541Wm.A0T(i3));
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A = r82.A0A();
                            this.A00 = 1 | this.A00;
                            this.A01 = A0A;
                        } else if (!A0a(r82, A032)) {
                            break;
                        }
                    } catch (C29791bD e2) {
                        runtimeException = C28541Wm.A0J(e2, this);
                        throw runtimeException;
                    } catch (IOException e3) {
                        runtimeException = C28541Wm.A0K(this, e3);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new AnonymousClass2t1();
            case 5:
                return new C68353dI();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (AnonymousClass2t1.class) {
                        if (A03 == null) {
                            A03 = C28541Wm.A09(A02);
                        }
                    }
                }
                return A03;
            default:
                throw C13680ns.A0m();
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
            i3 = C28541Wm.A08(this.A01, 1, 0);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A01);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
