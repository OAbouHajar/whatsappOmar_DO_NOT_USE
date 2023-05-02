package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1pO  reason: invalid class name and case insensitive filesystem */
public final class C37581pO extends C28541Wm implements C28561Wp {
    public static final C37581pO A03;
    public static volatile C47872Kz A04;
    public int A00;
    public C58582tj A01;
    public C37611pR A02;

    static {
        C37581pO r0 = new C37581pO();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r5.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                C37581pO r7 = (C37581pO) obj2;
                this.A02 = (C37611pR) r6.Ahu(this.A02, r7.A02);
                this.A01 = (C58582tj) r6.Ahu(this.A01, r7.A01);
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
                        } else {
                            if (A032 == 10) {
                                C68563dd r1 = (this.A00 & 1) == 1 ? (C68563dd) this.A02.A0U() : null;
                                C37611pR r0 = (C37611pR) r62.A09(r72, C37611pR.A02.A0V());
                                this.A02 = r0;
                                if (r1 != null) {
                                    r1.A04(r0);
                                    this.A02 = (C37611pR) r1.A01();
                                }
                                i2 = this.A00 | 1;
                            } else if (A032 == 18) {
                                C68543db r12 = (this.A00 & 2) == 2 ? (C68543db) this.A01.A0U() : null;
                                C58582tj r02 = (C58582tj) r62.A09(r72, C58582tj.A04.A0V());
                                this.A01 = r02;
                                if (r12 != null) {
                                    r12.A04(r02);
                                    this.A01 = (C58582tj) r12.A01();
                                }
                                i2 = this.A00 | 2;
                            } else if (!A0a(r62, A032)) {
                                break;
                            }
                            this.A00 = i2;
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r03 = new C29791bD(e3.getMessage());
                        r03.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r03);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C37581pO();
            case 5:
                return new C68533da();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C37581pO.class) {
                        if (A04 == null) {
                            A04 = new C47872Kz(A03);
                        }
                    }
                }
                return A04;
            default:
                throw new UnsupportedOperationException();
        }
        return A03;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C37611pR r0 = this.A02;
            if (r0 == null) {
                r0 = C37611pR.A02;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            C58582tj r02 = this.A01;
            if (r02 == null) {
                r02 = C58582tj.A04;
            }
            i3 += CodedOutputStream.A05(r02, 2);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C37611pR r0 = this.A02;
            if (r0 == null) {
                r0 = C37611pR.A02;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            C58582tj r02 = this.A01;
            if (r02 == null) {
                r02 = C58582tj.A04;
            }
            codedOutputStream.A0G(r02, 2);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
