package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tv  reason: invalid class name and case insensitive filesystem */
public final class C58702tv extends C28541Wm implements C28561Wp {
    public static final C58702tv A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public C37551pL A02;
    public C37521pI A03;

    static {
        C58702tv r0 = new C58702tv();
        A04 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r5.ordinal()) {
            case 0:
                return A04;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                C58702tv r7 = (C58702tv) obj2;
                this.A01 = r6.Ahq(this.A01, r7.A01, C28541Wm.A0T(this.A00), C28541Wm.A0T(r7.A00));
                this.A03 = (C37521pI) r6.Ahu(this.A03, r7.A03);
                this.A02 = (C37551pL) r6.Ahu(this.A02, r7.A02);
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
                        } else if (A032 != 8) {
                            if (A032 == 18) {
                                C69573fG r1 = (this.A00 & 2) == 2 ? (C69573fG) this.A03.A0U() : null;
                                C37521pI r0 = (C37521pI) C28541Wm.A0H(r62, r72, C37521pI.A0I);
                                this.A03 = r0;
                                if (r1 != null) {
                                    this.A03 = (C37521pI) C28541Wm.A0C(r1, r0);
                                }
                                i2 = this.A00 | 2;
                            } else if (A032 == 26) {
                                C69083eT r12 = (this.A00 & 4) == 4 ? (C69083eT) this.A02.A0U() : null;
                                C37551pL r02 = (C37551pL) C28541Wm.A0H(r62, r72, C37551pL.A08);
                                this.A02 = r02;
                                if (r12 != null) {
                                    this.A02 = (C37551pL) C28541Wm.A0C(r12, r02);
                                }
                                i2 = this.A00 | 4;
                            } else if (!A0a(r62, A032)) {
                                break;
                            }
                            this.A00 = i2;
                        } else {
                            int A022 = r62.A02();
                            if (C37511pH.A00(A022) == null) {
                                super.A0X(1, A022);
                            } else {
                                this.A00 = 1 | this.A00;
                                this.A01 = A022;
                            }
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
                return new C58702tv();
            case 5:
                return new C69073eS();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58702tv.class) {
                        if (A05 == null) {
                            A05 = C28541Wm.A09(A04);
                        }
                    }
                }
                return A05;
            default:
                throw C13680ns.A0m();
        }
        return A04;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = C28541Wm.A01(1, this.A01, 0);
        }
        if ((i4 & 2) == 2) {
            C37521pI r0 = this.A03;
            if (r0 == null) {
                r0 = C37521pI.A0I;
            }
            i3 = C28541Wm.A06(r0, 2, i3);
        }
        if ((this.A00 & 4) == 4) {
            C37551pL r02 = this.A02;
            if (r02 == null) {
                r02 = C37551pL.A08;
            }
            i3 = C28541Wm.A06(r02, 3, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            C37521pI r0 = this.A03;
            if (r0 == null) {
                r0 = C37521pI.A0I;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            C37551pL r02 = this.A02;
            if (r02 == null) {
                r02 = C37551pL.A08;
            }
            codedOutputStream.A0G(r02, 3);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
