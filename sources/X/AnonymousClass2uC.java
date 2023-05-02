package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uC  reason: invalid class name */
public final class AnonymousClass2uC extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2uC A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01;
    public C28631Ww A02 = C28631Ww.A01;
    public AnonymousClass1XE A03 = AnonymousClass2NE.A01;
    public AnonymousClass21S A04;
    public String A05 = "";

    static {
        AnonymousClass2uC r0 = new AnonymousClass2uC();
        A06 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r5.ordinal()) {
            case 0:
                return A06;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                AnonymousClass2uC r7 = (AnonymousClass2uC) obj2;
                this.A02 = r6.Ahn(this.A02, r7.A02, C28541Wm.A0T(this.A00), C28541Wm.A0T(r7.A00));
                this.A05 = r6.Ahz(this.A05, r7.A05, AnonymousClass000.A1R(this.A00 & 2, 2), AnonymousClass000.A1R(r7.A00 & 2, 2));
                this.A03 = r6.Ahs(this.A03, r7.A03);
                this.A01 = r6.Ahq(this.A01, r7.A01, AnonymousClass000.A1R(this.A00 & 4, 4), AnonymousClass000.A1R(r7.A00 & 4, 4));
                this.A04 = (AnonymousClass21S) r6.Ahu(this.A04, r7.A04);
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
                            this.A00 |= 1;
                            this.A02 = r62.A08();
                        } else if (A032 == 18) {
                            String A0A = r62.A0A();
                            this.A00 |= 2;
                            this.A05 = A0A;
                        } else if (A032 == 26) {
                            AnonymousClass1XE r1 = this.A03;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A03 = r1;
                            }
                            r1.add((C58272tE) C28541Wm.A0H(r62, r72, C58272tE.A02));
                        } else if (A032 == 32) {
                            this.A00 |= 4;
                            this.A01 = r62.A02();
                        } else if (A032 == 42) {
                            AnonymousClass21T r12 = (this.A00 & 8) == 8 ? (AnonymousClass21T) this.A04.A0U() : null;
                            AnonymousClass21S r0 = (AnonymousClass21S) C28541Wm.A0H(r62, r72, AnonymousClass21S.A0R);
                            this.A04 = r0;
                            if (r12 != null) {
                                this.A04 = (AnonymousClass21S) C28541Wm.A0C(r12, r0);
                            }
                            this.A00 |= 8;
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
                C28541Wm.A0R(this.A03);
                return null;
            case 4:
                return new AnonymousClass2uC();
            case 5:
                return new C69093eU();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (AnonymousClass2uC.class) {
                        if (A07 == null) {
                            A07 = C28541Wm.A09(A06);
                        }
                    }
                }
                return A07;
            default:
                throw C13680ns.A0m();
        }
        return A06;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        int A042 = (i3 & 1) == 1 ? CodedOutputStream.A04(this.A02, 1) : 0;
        if ((i3 & 2) == 2) {
            A042 = C28541Wm.A07(this.A05, A042);
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            A042 = C28541Wm.A06((AnonymousClass1Wo) this.A03.get(i4), 3, A042);
        }
        int i5 = this.A00;
        if ((i5 & 4) == 4) {
            A042 = C28541Wm.A00(4, this.A01, A042);
        }
        if ((i5 & 8) == 8) {
            AnonymousClass21S r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            A042 = C28541Wm.A06(r0, 5, A042);
        }
        return C28541Wm.A05(this, A042);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A02, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A05);
        }
        int i2 = 0;
        while (i2 < this.A03.size()) {
            i2 = C28541Wm.A04(codedOutputStream, this.A03, i2, 3);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(4, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            AnonymousClass21S r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 5);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
