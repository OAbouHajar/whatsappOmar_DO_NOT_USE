package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2ts  reason: invalid class name and case insensitive filesystem */
public final class C58672ts extends C28541Wm implements C28561Wp {
    public static final C58672ts A04;
    public static volatile C47872Kz A05;
    public int A00;
    public AnonymousClass1XE A01 = AnonymousClass2NE.A01;
    public C58422tT A02;
    public String A03 = "";

    static {
        C58672ts r0 = new C58672ts();
        A04 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A04;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58672ts r9 = (C58672ts) obj2;
                this.A01 = r8.Ahs(this.A01, r9.A01);
                this.A02 = (C58422tT) r8.Ahu(this.A02, r9.A02);
                int i2 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i2 & 2, 2);
                String str = this.A03;
                int i3 = r9.A00;
                this.A03 = r8.Ahz(str, r9.A03, A1R, AnonymousClass000.A1R(i3 & 2, 2));
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
                            AnonymousClass1XE r1 = this.A01;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A01 = r1;
                            }
                            r1.add((C58432tU) C28541Wm.A0H(r82, r92, C58432tU.A03));
                        } else if (A032 == 18) {
                            C68943eF r12 = (this.A00 & 1) == 1 ? (C68943eF) this.A02.A0U() : null;
                            C58422tT r0 = (C58422tT) C28541Wm.A0H(r82, r92, C58422tT.A03);
                            this.A02 = r0;
                            if (r12 != null) {
                                this.A02 = (C58422tT) C28541Wm.A0C(r12, r0);
                            }
                            this.A00 |= 1;
                        } else if (A032 == 26) {
                            String A0A = r82.A0A();
                            this.A00 |= 2;
                            this.A03 = A0A;
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
                C28541Wm.A0R(this.A01);
                return null;
            case 4:
                return new C58672ts();
            case 5:
                return new C68953eG();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58672ts.class) {
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
        for (int i4 = 0; i4 < this.A01.size(); i4++) {
            i3 = C28541Wm.A06((AnonymousClass1Wo) this.A01.get(i4), 1, i3);
        }
        if ((this.A00 & 1) == 1) {
            C58422tT r0 = this.A02;
            if (r0 == null) {
                r0 = C58422tT.A03;
            }
            i3 = C28541Wm.A06(r0, 2, i3);
        }
        if ((this.A00 & 2) == 2) {
            i3 = C28541Wm.A08(this.A03, 1, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        int i2 = 0;
        while (i2 < this.A01.size()) {
            i2 = C28541Wm.A04(codedOutputStream, this.A01, i2, 1);
        }
        if ((this.A00 & 1) == 1) {
            C58422tT r0 = this.A02;
            if (r0 == null) {
                r0 = C58422tT.A03;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(3, this.A03);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
