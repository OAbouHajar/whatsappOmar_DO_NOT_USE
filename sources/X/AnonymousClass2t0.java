package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2t0  reason: invalid class name */
public final class AnonymousClass2t0 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2t0 A02;
    public static volatile C47872Kz A03;
    public int A00;
    public C28631Ww A01 = C28631Ww.A01;

    static {
        AnonymousClass2t0 r0 = new AnonymousClass2t0();
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
                AnonymousClass2t0 r7 = (AnonymousClass2t0) obj2;
                this.A01 = r6.Ahn(this.A01, r7.A01, C28541Wm.A0T(this.A00), C28541Wm.A0T(r7.A00));
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
                return new AnonymousClass2t0();
            case 5:
                return new C68293dC();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (AnonymousClass2t0.class) {
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
            i3 = C28541Wm.A03(this.A01, 1, 0);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A01, 1);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
