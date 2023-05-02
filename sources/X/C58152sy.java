package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2sy  reason: invalid class name and case insensitive filesystem */
public final class C58152sy extends C28541Wm implements C28561Wp {
    public static final C58152sy A00;
    public static volatile C47872Kz A01;

    static {
        C58152sy r0 = new C58152sy();
        A00 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r3, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int A03;
        switch (r3.ordinal()) {
            case 0:
                return A00;
            case 1:
                return this;
            case 2:
                C47852Kx r4 = (C47852Kx) obj;
                do {
                    try {
                        A03 = r4.A03();
                        if (A03 == 0) {
                            break;
                        }
                    } catch (C29791bD e2) {
                        runtimeException = C28541Wm.A0J(e2, this);
                        throw runtimeException;
                    } catch (IOException e3) {
                        runtimeException = C28541Wm.A0K(this, e3);
                        throw runtimeException;
                    }
                } while (!A0a(r4, A03));
                break;
            case 3:
                return null;
            case 4:
                return new C58152sy();
            case 5:
                return new C69133eY();
            case 6:
                break;
            case 7:
                if (A01 == null) {
                    synchronized (C58152sy.class) {
                        if (A01 == null) {
                            A01 = C28541Wm.A09(A00);
                        }
                    }
                }
                return A01;
            default:
                throw C13680ns.A0m();
        }
        return A00;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A002 = this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        C28541Wm.A0N(codedOutputStream, this);
    }
}
