package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2u4  reason: invalid class name and case insensitive filesystem */
public final class C58762u4 extends C28541Wm implements C28561Wp {
    public static final C58762u4 A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01 = 0;
    public AnonymousClass21S A02;
    public C58222t9 A03;
    public Object A04;

    static {
        C58762u4 r0 = new C58762u4();
        A05 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        boolean z2 = false;
        switch (r7.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58762u4 r9 = (C58762u4) obj2;
                this.A03 = (C58222t9) r8.Ahu(this.A03, r9.A03);
                this.A02 = (AnonymousClass21S) r8.Ahu(this.A02, r9.A02);
                int i3 = r9.A01;
                switch ((i3 != 0 ? i3 != 2 ? null : AnonymousClass42L.A02 : AnonymousClass42L.A01).ordinal()) {
                    case 0:
                        if (this.A01 == 2) {
                            z2 = true;
                        }
                        this.A04 = r8.Ahw(this.A04, r9.A04, z2);
                        break;
                    case 1:
                        if (this.A01 != 0) {
                            z2 = true;
                        }
                        r8.Ahx(z2);
                        break;
                }
                if (r8 == AnonymousClass2L7.A00) {
                    int i4 = r9.A01;
                    if (i4 != 0) {
                        this.A01 = i4;
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
                        } else {
                            if (A032 == 10) {
                                C68883e9 r1 = (this.A00 & 1) == 1 ? (C68883e9) this.A03.A0U() : null;
                                C58222t9 r0 = (C58222t9) C28541Wm.A0H(r82, r92, C58222t9.A02);
                                this.A03 = r0;
                                if (r1 != null) {
                                    this.A03 = (C58222t9) C28541Wm.A0C(r1, r0);
                                }
                                i2 = this.A00 | 1;
                            } else if (A032 == 18) {
                                C68903eB r12 = this.A01 == 2 ? (C68903eB) ((C58662tr) this.A04).A0U() : null;
                                AnonymousClass1Wo A0H = C28541Wm.A0H(r82, r92, C58662tr.A04);
                                this.A04 = A0H;
                                if (r12 != null) {
                                    this.A04 = C28541Wm.A0C(r12, (C58662tr) A0H);
                                }
                                this.A01 = 2;
                            } else if (A032 == 122) {
                                AnonymousClass21T r13 = (this.A00 & 4) == 4 ? (AnonymousClass21T) this.A02.A0U() : null;
                                AnonymousClass21S r02 = (AnonymousClass21S) C28541Wm.A0H(r82, r92, AnonymousClass21S.A0R);
                                this.A02 = r02;
                                if (r13 != null) {
                                    this.A02 = (AnonymousClass21S) C28541Wm.A0C(r13, r02);
                                }
                                i2 = this.A00 | 4;
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
                return new C58762u4();
            case 5:
                return new C68893eA();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C58762u4.class) {
                        if (A06 == null) {
                            A06 = C28541Wm.A09(A05);
                        }
                    }
                }
                return A06;
            default:
                throw C13680ns.A0m();
        }
        return A05;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C58222t9 r0 = this.A03;
            if (r0 == null) {
                r0 = C58222t9.A02;
            }
            i3 = C28541Wm.A06(r0, 1, 0);
        }
        if (this.A01 == 2) {
            i3 = C28541Wm.A06((C28551Wn) this.A04, 2, i3);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass21S r02 = this.A02;
            if (r02 == null) {
                r02 = AnonymousClass21S.A0R;
            }
            i3 = C28541Wm.A06(r02, 15, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C58222t9 r0 = this.A03;
            if (r0 == null) {
                r0 = C58222t9.A02;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if (this.A01 == 2) {
            C28541Wm.A0O(codedOutputStream, this.A04, 2);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass21S r02 = this.A02;
            if (r02 == null) {
                r02 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r02, 15);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
