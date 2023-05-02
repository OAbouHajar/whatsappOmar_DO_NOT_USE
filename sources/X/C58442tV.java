package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tV  reason: invalid class name and case insensitive filesystem */
public final class C58442tV extends C28541Wm implements C28561Wp {
    public static final C58442tV A03;
    public static volatile C47872Kz A04;
    public int A00;
    public AnonymousClass1XE A01 = AnonymousClass2NE.A01;
    public String A02 = "";

    static {
        C58442tV r0 = new C58442tV();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r5.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                C58442tV r7 = (C58442tV) obj2;
                this.A02 = r6.Ahz(this.A02, r7.A02, C28541Wm.A0T(this.A00), C28541Wm.A0T(r7.A00));
                this.A01 = r6.Ahs(this.A01, r7.A01);
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
                            String A0A = r62.A0A();
                            this.A00 = 1 | this.A00;
                            this.A02 = A0A;
                        } else if (A032 == 18) {
                            AnonymousClass1XE r1 = this.A01;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A01 = r1;
                            }
                            r1.add((C58682tt) C28541Wm.A0H(r62, r72, C58682tt.A04));
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
                C28541Wm.A0R(this.A01);
                return null;
            case 4:
                return new C58442tV();
            case 5:
                return new C68983eJ();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C58442tV.class) {
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
        int A06 = (this.A00 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A02) : 0;
        for (int i3 = 0; i3 < this.A01.size(); i3++) {
            A06 = C28541Wm.A06((AnonymousClass1Wo) this.A01.get(i3), 2, A06);
        }
        return C28541Wm.A05(this, A06);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A02);
        }
        int i2 = 0;
        while (i2 < this.A01.size()) {
            i2 = C28541Wm.A04(codedOutputStream, this.A01, i2, 2);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
