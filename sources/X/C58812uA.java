package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uA  reason: invalid class name and case insensitive filesystem */
public final class C58812uA extends C28541Wm implements C28561Wp {
    public static final C58812uA A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01 = 0;
    public int A02;
    public AnonymousClass21S A03;
    public Object A04;
    public String A05 = "";

    static {
        C58812uA r0 = new C58812uA();
        A06 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        boolean z2 = false;
        switch (r7.ordinal()) {
            case 0:
                return A06;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58812uA r9 = (C58812uA) obj2;
                this.A05 = r8.Ahz(this.A05, r9.A05, C28541Wm.A0T(this.A00), C28541Wm.A0T(r9.A00));
                this.A03 = (AnonymousClass21S) r8.Ahu(this.A03, r9.A03);
                this.A02 = r8.Ahq(this.A02, r9.A02, AnonymousClass000.A1R(this.A00 & 8, 8), AnonymousClass000.A1R(r9.A00 & 8, 8));
                int i2 = r9.A01;
                switch ((i2 != 0 ? i2 != 2 ? null : AnonymousClass42G.A02 : AnonymousClass42G.A01).ordinal()) {
                    case 0:
                        if (this.A01 == 2) {
                            z2 = true;
                        }
                        this.A04 = r8.Ahy(this.A04, r9.A04, z2);
                        break;
                    case 1:
                        if (this.A01 != 0) {
                            z2 = true;
                        }
                        r8.Ahx(z2);
                        break;
                }
                if (r8 == AnonymousClass2L7.A00) {
                    int i3 = r9.A01;
                    if (i3 != 0) {
                        this.A01 = i3;
                    }
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
                        } else if (A032 == 10) {
                            String A0A = r82.A0A();
                            this.A00 |= 1;
                            this.A05 = A0A;
                        } else if (A032 == 18) {
                            String A0A2 = r82.A0A();
                            this.A01 = 2;
                            this.A04 = A0A2;
                        } else if (A032 == 26) {
                            AnonymousClass21T r1 = (this.A00 & 4) == 4 ? (AnonymousClass21T) this.A03.A0U() : null;
                            AnonymousClass21S r0 = (AnonymousClass21S) C28541Wm.A0H(r82, r92, AnonymousClass21S.A0R);
                            this.A03 = r0;
                            if (r1 != null) {
                                this.A03 = (AnonymousClass21S) C28541Wm.A0C(r1, r0);
                            }
                            this.A00 |= 4;
                        } else if (A032 == 32) {
                            int A022 = r82.A02();
                            if (A022 == 0 || A022 == 1) {
                                this.A00 |= 8;
                                this.A02 = A022;
                            } else {
                                super.A0X(4, A022);
                            }
                        } else if (!A0a(r82, A032)) {
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
                break;
            case 3:
                return null;
            case 4:
                return new C58812uA();
            case 5:
                return new C68633dk();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C58812uA.class) {
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
        if (this.A01 == 2) {
            i3 = C28541Wm.A07((String) this.A04, i3);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass21S r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 = C28541Wm.A06(r0, 3, i3);
        }
        if ((this.A00 & 8) == 8) {
            i3 = C28541Wm.A01(4, this.A02, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A05);
        }
        if (this.A01 == 2) {
            codedOutputStream.A0D(2, (String) this.A04);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass21S r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A09(4, this.A02);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
