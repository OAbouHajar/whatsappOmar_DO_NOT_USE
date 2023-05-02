package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tf  reason: invalid class name and case insensitive filesystem */
public final class C58542tf extends C28541Wm implements C28561Wp {
    public static final C58542tf A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    static {
        C58542tf r0 = new C58542tf();
        A04 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A04;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58542tf r9 = (C58542tf) obj2;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                int i3 = this.A01;
                int i4 = r9.A00;
                this.A01 = r8.Ahq(i3, r9.A01, A0T, C28541Wm.A0T(i4));
                this.A02 = r8.Ahq(this.A02, r9.A02, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i4 & 2, 2));
                this.A03 = r8.Ahq(this.A03, r9.A03, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i4 & 4, 4));
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
                            this.A00 |= 1;
                            this.A01 = r82.A02();
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A02 = r82.A02();
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A03 = r82.A02();
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
                return new C58542tf();
            case 5:
                return new C68413dO();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58542tf.class) {
                        if (A05 == null) {
                            A05 = C28541Wm.A09(A04);
                        }
                    }
                }
                return A05;
            default:
                throw C13680ns.A0m();
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
            i3 = C28541Wm.A00(1, this.A01, 0);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A00(2, this.A02, i3);
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A00(3, this.A03, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0A(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(3, this.A03);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
