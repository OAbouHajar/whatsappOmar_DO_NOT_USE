package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uB  reason: invalid class name and case insensitive filesystem */
public final class C58822uB extends C28541Wm implements C28561Wp {
    public static final C58822uB A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01;
    public AnonymousClass21S A02;
    public C58242tB A03;
    public String A04 = "";
    public String A05 = "";

    static {
        C58822uB r0 = new C58822uB();
        A06 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r7.ordinal()) {
            case 0:
                return A06;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58822uB r9 = (C58822uB) obj2;
                int i3 = this.A00;
                boolean A0T = C28541Wm.A0T(i3);
                String str = this.A05;
                int i4 = r9.A00;
                this.A05 = r8.Ahz(str, r9.A05, A0T, C28541Wm.A0T(i4));
                this.A01 = r8.Ahq(this.A01, r9.A01, AnonymousClass000.A1R(i3 & 2, 2), AnonymousClass000.A1R(i4 & 2, 2));
                this.A03 = (C58242tB) r8.Ahu(this.A03, r9.A03);
                this.A02 = (AnonymousClass21S) r8.Ahu(this.A02, r9.A02);
                int i5 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i5 & 16, 16);
                String str2 = this.A04;
                int i6 = r9.A00;
                this.A04 = r8.Ahz(str2, r9.A04, A1R, AnonymousClass000.A1R(i6 & 16, 16));
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i5 | i6;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj;
                C47862Ky r92 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A = r82.A0A();
                            this.A00 = 1 | this.A00;
                            this.A05 = A0A;
                        } else if (A032 != 16) {
                            if (A032 == 26) {
                                C69003eL r1 = (this.A00 & 4) == 4 ? (C69003eL) this.A03.A0U() : null;
                                C58242tB r0 = (C58242tB) C28541Wm.A0H(r82, r92, C58242tB.A02);
                                this.A03 = r0;
                                if (r1 != null) {
                                    this.A03 = (C58242tB) C28541Wm.A0C(r1, r0);
                                }
                                i2 = this.A00 | 4;
                            } else if (A032 == 34) {
                                AnonymousClass21T r12 = (this.A00 & 8) == 8 ? (AnonymousClass21T) this.A02.A0U() : null;
                                AnonymousClass21S r02 = (AnonymousClass21S) C28541Wm.A0H(r82, r92, AnonymousClass21S.A0R);
                                this.A02 = r02;
                                if (r12 != null) {
                                    this.A02 = (AnonymousClass21S) C28541Wm.A0C(r12, r02);
                                }
                                i2 = this.A00 | 8;
                            } else if (A032 == 42) {
                                String A0A2 = r82.A0A();
                                this.A00 |= 16;
                                this.A04 = A0A2;
                            } else if (!A0a(r82, A032)) {
                                break;
                            }
                            this.A00 = i2;
                        } else {
                            int A022 = r82.A02();
                            if (A022 == 0 || A022 == 1) {
                                this.A00 |= 2;
                                this.A01 = A022;
                            } else {
                                super.A0X(2, A022);
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
                return new C58822uB();
            case 5:
                return new C68993eK();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C58822uB.class) {
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
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = C28541Wm.A08(this.A05, 1, 0);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A01(2, this.A01, i3);
        }
        if ((i4 & 4) == 4) {
            C58242tB r0 = this.A03;
            if (r0 == null) {
                r0 = C58242tB.A02;
            }
            i3 = C28541Wm.A06(r0, 3, i3);
        }
        if ((this.A00 & 8) == 8) {
            AnonymousClass21S r02 = this.A02;
            if (r02 == null) {
                r02 = AnonymousClass21S.A0R;
            }
            i3 = C28541Wm.A06(r02, 4, i3);
        }
        if ((this.A00 & 16) == 16) {
            i3 = C28541Wm.A07(this.A04, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A05);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A09(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            C58242tB r0 = this.A03;
            if (r0 == null) {
                r0 = C58242tB.A02;
            }
            codedOutputStream.A0G(r0, 3);
        }
        if ((this.A00 & 8) == 8) {
            AnonymousClass21S r02 = this.A02;
            if (r02 == null) {
                r02 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r02, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(5, this.A04);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
