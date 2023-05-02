package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tw  reason: invalid class name and case insensitive filesystem */
public final class C58712tw extends C28541Wm implements C28561Wp {
    public static final C58712tw A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public String A03 = "";

    static {
        C58712tw r0 = new C58712tw();
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
                C58712tw r9 = (C58712tw) obj2;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                int i3 = this.A01;
                int i4 = r9.A00;
                this.A01 = r8.Ahq(i3, r9.A01, A0T, C28541Wm.A0T(i4));
                this.A03 = r8.Ahz(this.A03, r9.A03, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i4 & 2, 2));
                this.A02 = r8.Ahs(this.A02, r9.A02);
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
                        } else if (A032 == 8) {
                            int A022 = r82.A02();
                            if (C802142z.A00(A022) == null) {
                                super.A0X(1, A022);
                            } else {
                                this.A00 = 1 | this.A00;
                                this.A01 = A022;
                            }
                        } else if (A032 == 18) {
                            String A0A = r82.A0A();
                            this.A00 |= 2;
                            this.A03 = A0A;
                        } else if (A032 == 26) {
                            AnonymousClass1XE r1 = this.A02;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A02 = r1;
                            }
                            r1.add((C58702tv) C28541Wm.A0H(r82, r92, C58702tv.A04));
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
                C28541Wm.A0R(this.A02);
                return null;
            case 4:
                return new C58712tw();
            case 5:
                return new C69543fD();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58712tw.class) {
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
        int i3 = this.A00;
        int A002 = (i3 & 1) == 1 ? CodedOutputStream.A00(1, this.A01) : 0;
        if ((i3 & 2) == 2) {
            A002 = C28541Wm.A07(this.A03, A002);
        }
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            A002 = C28541Wm.A06((AnonymousClass1Wo) this.A02.get(i4), 3, A002);
        }
        return C28541Wm.A05(this, A002);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A03);
        }
        int i2 = 0;
        while (i2 < this.A02.size()) {
            i2 = C28541Wm.A04(codedOutputStream, this.A02, i2, 3);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
