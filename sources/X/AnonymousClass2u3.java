package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2u3  reason: invalid class name */
public final class AnonymousClass2u3 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2u3 A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public AnonymousClass2t2 A02;
    public C58382tP A03;
    public String A04 = "";

    static {
        AnonymousClass2u3 r0 = new AnonymousClass2u3();
        A05 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        int i3;
        switch (r5.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                AnonymousClass2u3 r7 = (AnonymousClass2u3) obj2;
                this.A04 = r6.Ahz(this.A04, r7.A04, C28541Wm.A0T(this.A00), C28541Wm.A0T(r7.A00));
                this.A02 = (AnonymousClass2t2) r6.Ahu(this.A02, r7.A02);
                this.A01 = r6.Ahq(this.A01, r7.A01, AnonymousClass000.A1R(this.A00 & 4, 4), AnonymousClass000.A1R(r7.A00 & 4, 4));
                this.A03 = (C58382tP) r6.Ahu(this.A03, r7.A03);
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
                        } else if (A032 != 10) {
                            if (A032 == 18) {
                                i2 = 2;
                                C68613di r1 = (this.A00 & 2) == 2 ? (C68613di) this.A02.A0U() : null;
                                AnonymousClass2t2 r0 = (AnonymousClass2t2) C28541Wm.A0H(r62, r72, AnonymousClass2t2.A02);
                                this.A02 = r0;
                                if (r1 != null) {
                                    this.A02 = (AnonymousClass2t2) C28541Wm.A0C(r1, r0);
                                }
                                i3 = this.A00;
                            } else if (A032 == 24) {
                                int A022 = r62.A02();
                                if (A022 == 0 || A022 == 1 || A022 == 2) {
                                    this.A00 |= 4;
                                    this.A01 = A022;
                                } else {
                                    super.A0X(3, A022);
                                }
                            } else if (A032 == 34) {
                                i2 = 8;
                                C68623dj r12 = (this.A00 & 8) == 8 ? (C68623dj) this.A03.A0U() : null;
                                C58382tP r02 = (C58382tP) C28541Wm.A0H(r62, r72, C58382tP.A03);
                                this.A03 = r02;
                                if (r12 != null) {
                                    this.A03 = (C58382tP) C28541Wm.A0C(r12, r02);
                                }
                                i3 = this.A00;
                            } else if (!A0a(r62, A032)) {
                                break;
                            }
                            this.A00 = i3 | i2;
                        } else {
                            String A0A = r62.A0A();
                            this.A00 = 1 | this.A00;
                            this.A04 = A0A;
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
                return new AnonymousClass2u3();
            case 5:
                return new C68603dh();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (AnonymousClass2u3.class) {
                        if (A06 == null) {
                            A06 = C28541Wm.A09(A05);
                        }
                    }
                }
                return A06;
            default:
                throw C13680ns.A0m();
        }
        return A05;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = C28541Wm.A08(this.A04, 1, 0);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass2t2 r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass2t2.A02;
            }
            i3 = C28541Wm.A06(r0, 2, i3);
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A01(3, this.A01, i3);
        }
        if ((i4 & 8) == 8) {
            C58382tP r02 = this.A03;
            if (r02 == null) {
                r02 = C58382tP.A03;
            }
            i3 = C28541Wm.A06(r02, 4, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass2t2 r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass2t2.A02;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A09(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            C58382tP r02 = this.A03;
            if (r02 == null) {
                r02 = C58382tP.A03;
            }
            codedOutputStream.A0G(r02, 4);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
