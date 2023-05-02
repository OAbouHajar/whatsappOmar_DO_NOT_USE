package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tF  reason: invalid class name and case insensitive filesystem */
public final class C58282tF extends C28541Wm implements C28561Wp {
    public static final C58282tF A02;
    public static volatile C47872Kz A03;
    public int A00;
    public AnonymousClass21S A01;

    static {
        C58282tF r0 = new C58282tF();
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
                C58282tF r7 = (C58282tF) obj2;
                this.A01 = (AnonymousClass21S) r6.Ahu(this.A01, r7.A01);
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
                        } else if (A032 == 10) {
                            AnonymousClass21T r1 = (this.A00 & 1) == 1 ? (AnonymousClass21T) this.A01.A0U() : null;
                            AnonymousClass21S r0 = (AnonymousClass21S) C28541Wm.A0H(r62, r72, AnonymousClass21S.A0R);
                            this.A01 = r0;
                            if (r1 != null) {
                                this.A01 = (AnonymousClass21S) C28541Wm.A0C(r1, r0);
                            }
                            this.A00 |= 1;
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
                return new C58282tF();
            case 5:
                return new C69183ed();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C58282tF.class) {
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
            AnonymousClass21S r0 = this.A01;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 = C28541Wm.A06(r0, 1, 0);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            AnonymousClass21S r0 = this.A01;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 1);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
