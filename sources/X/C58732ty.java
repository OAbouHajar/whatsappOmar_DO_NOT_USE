package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2ty  reason: invalid class name and case insensitive filesystem */
public final class C58732ty extends C28541Wm implements C28561Wp {
    public static final C58732ty A04;
    public static volatile C47872Kz A05;
    public int A00;
    public C33211iD A01;
    public C58932uO A02;
    public C33231iF A03;

    static {
        C58732ty r0 = new C58732ty();
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
                C58732ty r7 = (C58732ty) obj2;
                this.A01 = (C33211iD) r6.Ahu(this.A01, r7.A01);
                this.A03 = (C33231iF) r6.Ahu(this.A03, r7.A03);
                this.A02 = (C58932uO) r6.Ahu(this.A02, r7.A02);
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
                        } else {
                            if (A032 == 18) {
                                C33221iE r1 = (this.A00 & 1) == 1 ? (C33221iE) this.A01.A0U() : null;
                                C33211iD r0 = (C33211iD) C28541Wm.A0H(r62, r72, C33211iD.A0o);
                                this.A01 = r0;
                                if (r1 != null) {
                                    this.A01 = (C33211iD) C28541Wm.A0C(r1, r0);
                                }
                                i2 = this.A00 | 1;
                            } else if (A032 == 26) {
                                C33241iG r12 = (this.A00 & 2) == 2 ? (C33241iG) this.A03.A0U() : null;
                                C33231iF r02 = (C33231iF) C28541Wm.A0H(r62, r72, C33231iF.A05);
                                this.A03 = r02;
                                if (r12 != null) {
                                    this.A03 = (C33231iF) C28541Wm.A0C(r12, r02);
                                }
                                i2 = this.A00 | 2;
                            } else if (A032 == 34) {
                                C69223eh r13 = (this.A00 & 4) == 4 ? (C69223eh) this.A02.A0U() : null;
                                C58932uO r03 = (C58932uO) C28541Wm.A0H(r62, r72, C58932uO.A0B);
                                this.A02 = r03;
                                if (r13 != null) {
                                    this.A02 = (C58932uO) C28541Wm.A0C(r13, r03);
                                }
                                i2 = this.A00 | 4;
                            } else if (!A0a(r62, A032)) {
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
                return new C58732ty();
            case 5:
                return new C69563fF();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58732ty.class) {
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
            C33211iD r0 = this.A01;
            if (r0 == null) {
                r0 = C33211iD.A0o;
            }
            i3 = C28541Wm.A06(r0, 2, 0);
        }
        if ((this.A00 & 2) == 2) {
            C33231iF r02 = this.A03;
            if (r02 == null) {
                r02 = C33231iF.A05;
            }
            i3 = C28541Wm.A06(r02, 3, i3);
        }
        if ((this.A00 & 4) == 4) {
            C58932uO r03 = this.A02;
            if (r03 == null) {
                r03 = C58932uO.A0B;
            }
            i3 = C28541Wm.A06(r03, 4, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C33211iD r0 = this.A01;
            if (r0 == null) {
                r0 = C33211iD.A0o;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 2) == 2) {
            C33231iF r02 = this.A03;
            if (r02 == null) {
                r02 = C33231iF.A05;
            }
            codedOutputStream.A0G(r02, 3);
        }
        if ((this.A00 & 4) == 4) {
            C58932uO r03 = this.A02;
            if (r03 == null) {
                r03 = C58932uO.A0B;
            }
            codedOutputStream.A0G(r03, 4);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
