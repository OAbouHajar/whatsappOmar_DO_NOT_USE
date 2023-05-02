package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2en  reason: invalid class name and case insensitive filesystem */
public final class C52992en extends C28541Wm implements C28561Wp {
    public static final C52992en A02;
    public static volatile C47872Kz A03;
    public int A00;
    public C33211iD A01;

    static {
        C52992en r0 = new C52992en();
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
                C52992en r7 = (C52992en) obj2;
                this.A01 = (C33211iD) r6.Ahu(this.A01, r7.A01);
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
                            C33221iE r1 = (this.A00 & 1) == 1 ? (C33221iE) this.A01.A0U() : null;
                            C33211iD r0 = (C33211iD) r62.A09(r72, C33211iD.A0o.A0V());
                            this.A01 = r0;
                            if (r1 != null) {
                                r1.A04(r0);
                                this.A01 = (C33211iD) r1.A01();
                            }
                            this.A00 |= 1;
                        } else if (!A0a(r62, A032)) {
                            break;
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r02 = new C29791bD(e3.getMessage());
                        r02.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r02);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C52992en();
            case 5:
                return new C69513fA();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C52992en.class) {
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
            C33211iD r0 = this.A01;
            if (r0 == null) {
                r0 = C33211iD.A0o;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C33211iD r0 = this.A01;
            if (r0 == null) {
                r0 = C33211iD.A0o;
            }
            codedOutputStream.A0G(r0, 1);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
