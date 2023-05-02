package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tj  reason: invalid class name and case insensitive filesystem */
public final class C58582tj extends C28541Wm implements C28561Wp {
    public static final C58582tj A04;
    public static volatile C47872Kz A05;
    public int A00;
    public long A01;
    public C28631Ww A02 = C28631Ww.A01;
    public C35741mQ A03;

    static {
        C58582tj r0 = new C58582tj();
        A04 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r12, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj;
        switch (r12.ordinal()) {
            case 0:
                return A04;
            case 1:
                AnonymousClass2L6 r4 = (AnonymousClass2L6) obj3;
                C58582tj r14 = (C58582tj) obj2;
                this.A02 = r4.Ahn(this.A02, r14.A02, C28541Wm.A0T(this.A00), C28541Wm.A0T(r14.A00));
                this.A03 = (C35741mQ) r4.Ahu(this.A03, r14.A03);
                int i2 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i2 & 4, 4);
                long j2 = this.A01;
                int i3 = r14.A00;
                this.A01 = r4.Aht(j2, r14.A01, A1R, AnonymousClass000.A1R(i3 & 4, 4));
                if (r4 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
                }
                return this;
            case 2:
                C47852Kx r42 = (C47852Kx) obj3;
                C47862Ky r142 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A032 = r42.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            this.A00 |= 1;
                            this.A02 = r42.A08();
                        } else if (A032 == 18) {
                            C68553dc r1 = (this.A00 & 2) == 2 ? (C68553dc) this.A03.A0U() : null;
                            C35741mQ r0 = (C35741mQ) C28541Wm.A0H(r42, r142, C35741mQ.A05);
                            this.A03 = r0;
                            if (r1 != null) {
                                this.A03 = (C35741mQ) C28541Wm.A0C(r1, r0);
                            }
                            this.A00 |= 2;
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A01 = r42.A06();
                        } else if (!A0a(r42, A032)) {
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
                return new C58582tj();
            case 5:
                return new C68543db();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58582tj.class) {
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
            i3 = C28541Wm.A03(this.A02, 1, 0);
        }
        if ((i4 & 2) == 2) {
            C35741mQ r0 = this.A03;
            if (r0 == null) {
                r0 = C35741mQ.A05;
            }
            i3 = C28541Wm.A06(r0, 2, i3);
        }
        if ((this.A00 & 4) == 4) {
            i3 = C28541Wm.A02(i3, this.A01);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A02, 1);
        }
        if ((this.A00 & 2) == 2) {
            C35741mQ r0 = this.A03;
            if (r0 == null) {
                r0 = C35741mQ.A05;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0C(3, this.A01);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
