package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tu  reason: invalid class name and case insensitive filesystem */
public final class C58692tu extends C28541Wm implements C28561Wp {
    public static final C58692tu A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public AnonymousClass1XE A02;
    public AnonymousClass1XE A03;

    static {
        C58692tu r0 = new C58692tu();
        A04 = r0;
        r0.A0W();
    }

    public C58692tu() {
        AnonymousClass2NE r0 = AnonymousClass2NE.A01;
        this.A02 = r0;
        this.A03 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r5.ordinal()) {
            case 0:
                return A04;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                C58692tu r7 = (C58692tu) obj2;
                this.A01 = r6.Ahq(this.A01, r7.A01, C28541Wm.A0T(this.A00), C28541Wm.A0T(r7.A00));
                this.A02 = r6.Ahs(this.A02, r7.A02);
                this.A03 = r6.Ahs(this.A03, r7.A03);
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
                        } else if (A032 == 8) {
                            int A022 = r62.A02();
                            if (C802142z.A00(A022) == null) {
                                super.A0X(1, A022);
                            } else {
                                this.A00 = 1 | this.A00;
                                this.A01 = A022;
                            }
                        } else if (A032 == 18) {
                            AnonymousClass1XE r1 = this.A02;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A02 = r1;
                            }
                            r1.add((C58252tC) C28541Wm.A0H(r62, r72, C58252tC.A02));
                        } else if (A032 == 26) {
                            AnonymousClass1XE r12 = this.A03;
                            if (!((AnonymousClass1XF) r12).A00) {
                                r12 = C28541Wm.A0G(r12);
                                this.A03 = r12;
                            }
                            r12.add((C58262tD) C28541Wm.A0H(r62, r72, C58262tD.A02));
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
                ((AnonymousClass1XF) this.A02).A00 = false;
                ((AnonymousClass1XF) this.A03).A00 = false;
                return null;
            case 4:
                return new C58692tu();
            case 5:
                return new C69043eP();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58692tu.class) {
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
        int A002 = (this.A00 & 1) == 1 ? CodedOutputStream.A00(1, this.A01) : 0;
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            A002 = C28541Wm.A06((AnonymousClass1Wo) this.A02.get(i3), 2, A002);
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            A002 = C28541Wm.A06((AnonymousClass1Wo) this.A03.get(i4), 3, A002);
        }
        return C28541Wm.A05(this, A002);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A02.size()) {
            i3 = C28541Wm.A04(codedOutputStream, this.A02, i3, 2);
        }
        while (i2 < this.A03.size()) {
            i2 = C28541Wm.A04(codedOutputStream, this.A03, i2, 3);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
