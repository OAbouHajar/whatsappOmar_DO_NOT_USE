package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tJ  reason: invalid class name and case insensitive filesystem */
public final class C58322tJ extends C28541Wm implements C28561Wp {
    public static final C58322tJ A03;
    public static volatile C47872Kz A04;
    public int A00;
    public C28631Ww A01;
    public C28631Ww A02;

    static {
        C58322tJ r0 = new C58322tJ();
        A03 = r0;
        r0.A0W();
    }

    public C58322tJ() {
        C28631Ww r0 = C28631Ww.A01;
        this.A01 = r0;
        this.A02 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r5.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                C58322tJ r7 = (C58322tJ) obj2;
                this.A01 = r6.Ahn(this.A01, r7.A01, C28541Wm.A0T(this.A00), C28541Wm.A0T(r7.A00));
                this.A02 = r6.Ahn(this.A02, r7.A02, AnonymousClass000.A1R(this.A00 & 2, 2), AnonymousClass000.A1R(r7.A00 & 2, 2));
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
                        } else if (A032 == 18) {
                            this.A00 |= 2;
                            this.A02 = r62.A08();
                        } else if (!A0a(r62, A032)) {
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
                return new C58322tJ();
            case 5:
                return new C68393dM();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C58322tJ.class) {
                        if (A04 == null) {
                            A04 = C28541Wm.A09(A03);
                        }
                    }
                }
                return A04;
            default:
                throw C13680ns.A0m();
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
            i3 = C28541Wm.A03(this.A01, 1, 0);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A03(this.A02, 2, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A01, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A02, 2);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
