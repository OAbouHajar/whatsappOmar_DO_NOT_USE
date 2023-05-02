package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2ta  reason: invalid class name and case insensitive filesystem */
public final class C58492ta extends C28541Wm implements C28561Wp {
    public static final C58492ta A03;
    public static volatile C47872Kz A04;
    public int A00;
    public C455029b A01;
    public String A02 = "";

    static {
        C58492ta r0 = new C58492ta();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58492ta r9 = (C58492ta) obj2;
                this.A01 = (C455029b) r8.Ahu(this.A01, r9.A01);
                int i2 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i2 & 2, 2);
                String str = this.A02;
                int i3 = r9.A00;
                this.A02 = r8.Ahz(str, r9.A02, A1R, AnonymousClass000.A1R(i3 & 2, 2));
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
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
                            C68733du r1 = (this.A00 & 1) == 1 ? (C68733du) this.A01.A0U() : null;
                            C455029b r0 = (C455029b) C28541Wm.A0H(r82, r92, C455029b.A0A);
                            this.A01 = r0;
                            if (r1 != null) {
                                this.A01 = (C455029b) C28541Wm.A0C(r1, r0);
                            }
                            this.A00 |= 1;
                        } else if (A032 == 18) {
                            String A0A = r82.A0A();
                            this.A00 |= 2;
                            this.A02 = A0A;
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
            case 3:
                return null;
            case 4:
                return new C58492ta();
            case 5:
                return new C69273em();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C58492ta.class) {
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
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C455029b r0 = this.A01;
            if (r0 == null) {
                r0 = C455029b.A0A;
            }
            i3 = C28541Wm.A06(r0, 1, 0);
        }
        if ((this.A00 & 2) == 2) {
            i3 = C28541Wm.A07(this.A02, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C455029b r0 = this.A01;
            if (r0 == null) {
                r0 = C455029b.A0A;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A02);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
