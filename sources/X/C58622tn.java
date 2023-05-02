package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tn  reason: invalid class name and case insensitive filesystem */
public final class C58622tn extends C28541Wm implements C28561Wp {
    public static final C58622tn A04;
    public static volatile C47872Kz A05;
    public int A00;
    public C28631Ww A01;
    public C28631Ww A02;
    public C33231iF A03;

    static {
        C58622tn r0 = new C58622tn();
        A04 = r0;
        r0.A0W();
    }

    public C58622tn() {
        C28631Ww r0 = C28631Ww.A01;
        this.A02 = r0;
        this.A01 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r5.ordinal()) {
            case 0:
                return A04;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                C58622tn r7 = (C58622tn) obj2;
                this.A03 = (C33231iF) r6.Ahu(this.A03, r7.A03);
                this.A02 = r6.Ahn(this.A02, r7.A02, AnonymousClass000.A1R(this.A00 & 2, 2), AnonymousClass000.A1R(r7.A00 & 2, 2));
                this.A01 = r6.Ahn(this.A01, r7.A01, AnonymousClass000.A1R(this.A00 & 4, 4), AnonymousClass000.A1R(r7.A00 & 4, 4));
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
                            C33241iG r1 = (this.A00 & 1) == 1 ? (C33241iG) this.A03.A0U() : null;
                            C33231iF r0 = (C33231iF) C28541Wm.A0H(r62, r72, C33231iF.A05);
                            this.A03 = r0;
                            if (r1 != null) {
                                this.A03 = (C33231iF) C28541Wm.A0C(r1, r0);
                            }
                            this.A00 |= 1;
                        } else if (A032 == 18) {
                            this.A00 |= 2;
                            this.A02 = r62.A08();
                        } else if (A032 == 26) {
                            this.A00 |= 4;
                            this.A01 = r62.A08();
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
                return null;
            case 4:
                return new C58622tn();
            case 5:
                return new C68713ds();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58622tn.class) {
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
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A03;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 = C28541Wm.A06(r0, 1, 0);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A03(this.A02, 2, i3);
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A03(this.A01, 3, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A03;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A02, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A01, 3);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
