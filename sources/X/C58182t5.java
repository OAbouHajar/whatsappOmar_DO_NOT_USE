package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2t5  reason: invalid class name and case insensitive filesystem */
public final class C58182t5 extends C28541Wm implements C28561Wp {
    public static final C58182t5 A02;
    public static volatile C47872Kz A03;
    public int A00;
    public long A01;

    static {
        C58182t5 r0 = new C58182t5();
        A02 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r12, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj;
        switch (r12.ordinal()) {
            case 0:
                return A02;
            case 1:
                AnonymousClass2L6 r4 = (AnonymousClass2L6) obj3;
                C58182t5 r14 = (C58182t5) obj2;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                long j2 = this.A01;
                int i3 = r14.A00;
                this.A01 = r4.Aht(j2, r14.A01, A0T, C28541Wm.A0T(i3));
                if (r4 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
                }
                return this;
            case 2:
                C47852Kx r42 = (C47852Kx) obj3;
                while (true) {
                    try {
                        int A032 = r42.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            this.A00 |= 1;
                            this.A01 = r42.A06();
                        } else if (!A0a(r42, A032)) {
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
                return new C58182t5();
            case 5:
                return new C68783dz();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C58182t5.class) {
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
            i3 = 0 + 1 + CodedOutputStream.A03(this.A01);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0C(1, this.A01);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
