package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uE  reason: invalid class name */
public final class AnonymousClass2uE extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2uE A07;
    public static volatile C47872Kz A08;
    public int A00;
    public AnonymousClass21S A01;
    public C58722tx A02;
    public C58952uQ A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";

    static {
        AnonymousClass2uE r0 = new AnonymousClass2uE();
        A07 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r7.ordinal()) {
            case 0:
                return A07;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                AnonymousClass2uE r9 = (AnonymousClass2uE) obj2;
                this.A03 = (C58952uQ) r8.Ahu(this.A03, r9.A03);
                this.A05 = r8.Ahz(this.A05, r9.A05, AnonymousClass000.A1R(this.A00 & 2, 2), AnonymousClass000.A1R(r9.A00 & 2, 2));
                this.A02 = (C58722tx) r8.Ahu(this.A02, r9.A02);
                int i3 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i3 & 8, 8);
                String str = this.A04;
                int i4 = r9.A00;
                this.A04 = r8.Ahz(str, r9.A04, A1R, AnonymousClass000.A1R(i4 & 8, 8));
                this.A06 = r8.Ahz(this.A06, r9.A06, AnonymousClass000.A1R(i3 & 16, 16), AnonymousClass000.A1R(i4 & 16, 16));
                this.A01 = (AnonymousClass21S) r8.Ahu(this.A01, r9.A01);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 |= r9.A00;
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
                        } else {
                            if (A032 == 10) {
                                C69163eb r1 = (this.A00 & 1) == 1 ? (C69163eb) this.A03.A0U() : null;
                                C58952uQ r0 = (C58952uQ) C28541Wm.A0H(r82, r92, C58952uQ.A0C);
                                this.A03 = r0;
                                if (r1 != null) {
                                    this.A03 = (C58952uQ) C28541Wm.A0C(r1, r0);
                                }
                                i2 = this.A00 | 1;
                            } else if (A032 == 18) {
                                String A0A = r82.A0A();
                                this.A00 |= 2;
                                this.A05 = A0A;
                            } else if (A032 == 34) {
                                C69153ea r12 = (this.A00 & 4) == 4 ? (C69153ea) this.A02.A0U() : null;
                                C58722tx r02 = (C58722tx) C28541Wm.A0H(r82, r92, C58722tx.A04);
                                this.A02 = r02;
                                if (r12 != null) {
                                    this.A02 = (C58722tx) C28541Wm.A0C(r12, r02);
                                }
                                i2 = this.A00 | 4;
                            } else if (A032 == 42) {
                                String A0A2 = r82.A0A();
                                this.A00 |= 8;
                                this.A04 = A0A2;
                            } else if (A032 == 50) {
                                String A0A3 = r82.A0A();
                                this.A00 |= 16;
                                this.A06 = A0A3;
                            } else if (A032 == 138) {
                                AnonymousClass21T r13 = (this.A00 & 32) == 32 ? (AnonymousClass21T) this.A01.A0U() : null;
                                AnonymousClass21S r03 = (AnonymousClass21S) C28541Wm.A0H(r82, r92, AnonymousClass21S.A0R);
                                this.A01 = r03;
                                if (r13 != null) {
                                    this.A01 = (AnonymousClass21S) C28541Wm.A0C(r13, r03);
                                }
                                i2 = this.A00 | 32;
                            } else if (!A0a(r82, A032)) {
                                break;
                            }
                            this.A00 = i2;
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
                return new AnonymousClass2uE();
            case 5:
                return new C69143eZ();
            case 6:
                break;
            case 7:
                if (A08 == null) {
                    synchronized (AnonymousClass2uE.class) {
                        if (A08 == null) {
                            A08 = C28541Wm.A09(A07);
                        }
                    }
                }
                return A08;
            default:
                throw C13680ns.A0m();
        }
        return A07;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C58952uQ r0 = this.A03;
            if (r0 == null) {
                r0 = C58952uQ.A0C;
            }
            i3 = C28541Wm.A06(r0, 1, 0);
        }
        if ((this.A00 & 2) == 2) {
            i3 = C28541Wm.A07(this.A05, i3);
        }
        if ((this.A00 & 4) == 4) {
            C58722tx r02 = this.A02;
            if (r02 == null) {
                r02 = C58722tx.A04;
            }
            i3 = C28541Wm.A06(r02, 4, i3);
        }
        if ((this.A00 & 8) == 8) {
            i3 = C28541Wm.A07(this.A04, i3);
        }
        if ((this.A00 & 16) == 16) {
            i3 = C28541Wm.A07(this.A06, i3);
        }
        if ((this.A00 & 32) == 32) {
            AnonymousClass21S r03 = this.A01;
            if (r03 == null) {
                r03 = AnonymousClass21S.A0R;
            }
            i3 = C28541Wm.A06(r03, 17, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C58952uQ r0 = this.A03;
            if (r0 == null) {
                r0 = C58952uQ.A0C;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            C58722tx r02 = this.A02;
            if (r02 == null) {
                r02 = C58722tx.A04;
            }
            codedOutputStream.A0G(r02, 4);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(5, this.A04);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(6, this.A06);
        }
        if ((this.A00 & 32) == 32) {
            AnonymousClass21S r03 = this.A01;
            if (r03 == null) {
                r03 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r03, 17);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
