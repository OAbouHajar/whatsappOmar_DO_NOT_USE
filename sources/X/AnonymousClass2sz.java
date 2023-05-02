package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2sz  reason: invalid class name */
public final class AnonymousClass2sz extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2sz A01;
    public static volatile C47872Kz A02;
    public AnonymousClass1XE A00 = AnonymousClass2NE.A01;

    static {
        AnonymousClass2sz r0 = new AnonymousClass2sz();
        A01 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r3, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r3.ordinal()) {
            case 0:
                return A01;
            case 1:
                this.A00 = ((AnonymousClass2L6) obj).Ahs(this.A00, ((AnonymousClass2sz) obj2).A00);
                return this;
            case 2:
                C47852Kx r4 = (C47852Kx) obj;
                C47862Ky r5 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A03 = r4.A03();
                        if (A03 == 0) {
                            break;
                        } else if (A03 == 10) {
                            AnonymousClass1XE r1 = this.A00;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A00 = r1;
                            }
                            r1.add((C37611pR) C28541Wm.A0H(r4, r5, C37611pR.A02));
                        } else if (!A0a(r4, A03)) {
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
                C28541Wm.A0R(this.A00);
                return null;
            case 4:
                return new AnonymousClass2sz();
            case 5:
                return new C68573de();
            case 6:
                break;
            case 7:
                if (A02 == null) {
                    synchronized (AnonymousClass2sz.class) {
                        if (A02 == null) {
                            A02 = C28541Wm.A09(A01);
                        }
                    }
                }
                return A02;
            default:
                throw C13680ns.A0m();
        }
        return A01;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A00.size(); i4++) {
            i3 = C28541Wm.A06((AnonymousClass1Wo) this.A00.get(i4), 1, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A00.get(i2), 1);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
