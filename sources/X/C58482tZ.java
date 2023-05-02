package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tZ  reason: invalid class name and case insensitive filesystem */
public final class C58482tZ extends C28541Wm implements C28561Wp {
    public static final C58482tZ A03;
    public static volatile C47872Kz A04;
    public int A00;
    public C455029b A01;
    public C455029b A02;

    static {
        C58482tZ r0 = new C58482tZ();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r5.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                C58482tZ r7 = (C58482tZ) obj2;
                this.A01 = (C455029b) r6.Ahu(this.A01, r7.A01);
                this.A02 = (C455029b) r6.Ahu(this.A02, r7.A02);
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
                        int i3 = 1;
                        if (A032 == 0) {
                            break;
                        } else {
                            if (A032 == 10) {
                                C68733du r1 = (this.A00 & 1) == 1 ? (C68733du) this.A01.A0U() : null;
                                C455029b r0 = (C455029b) C28541Wm.A0H(r62, r72, C455029b.A0A);
                                this.A01 = r0;
                                if (r1 != null) {
                                    this.A01 = (C455029b) C28541Wm.A0C(r1, r0);
                                }
                                i2 = this.A00;
                            } else if (A032 == 18) {
                                i3 = 2;
                                C68733du r12 = (this.A00 & 2) == 2 ? (C68733du) this.A02.A0U() : null;
                                C455029b r02 = (C455029b) C28541Wm.A0H(r62, r72, C455029b.A0A);
                                this.A02 = r02;
                                if (r12 != null) {
                                    this.A02 = (C455029b) C28541Wm.A0C(r12, r02);
                                }
                                i2 = this.A00;
                            } else if (!A0a(r62, A032)) {
                                break;
                            }
                            this.A00 = i2 | i3;
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
                return new C58482tZ();
            case 5:
                return new C69263el();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C58482tZ.class) {
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
            C455029b r02 = this.A02;
            if (r02 == null) {
                r02 = C455029b.A0A;
            }
            i3 = C28541Wm.A06(r02, 2, i3);
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
            C455029b r02 = this.A02;
            if (r02 == null) {
                r02 = C455029b.A0A;
            }
            codedOutputStream.A0G(r02, 2);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
