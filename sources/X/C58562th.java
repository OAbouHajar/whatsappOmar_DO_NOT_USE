package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2th  reason: invalid class name and case insensitive filesystem */
public final class C58562th extends C28541Wm implements C28561Wp {
    public static final C58562th A04;
    public static volatile C47872Kz A05;
    public int A00 = 0;
    public int A01;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public Object A03;

    static {
        C58562th r0 = new C58562th();
        A04 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r6, Object obj, Object obj2) {
        RuntimeException runtimeException;
        boolean z2 = false;
        switch (r6.ordinal()) {
            case 0:
                return A04;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj;
                C58562th r8 = (C58562th) obj2;
                this.A02 = r7.Ahs(this.A02, r8.A02);
                int i2 = r8.A00;
                switch ((i2 != 0 ? i2 != 2 ? null : AnonymousClass42F.A02 : AnonymousClass42F.A01).ordinal()) {
                    case 0:
                        if (this.A00 == 2) {
                            z2 = true;
                        }
                        this.A03 = r7.Ahw(this.A03, r8.A03, z2);
                        break;
                    case 1:
                        if (this.A00 != 0) {
                            z2 = true;
                        }
                        r7.Ahx(z2);
                        break;
                }
                if (r7 == AnonymousClass2L7.A00) {
                    int i3 = r8.A00;
                    if (i3 != 0) {
                        this.A00 = i3;
                    }
                    this.A01 |= r8.A01;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj;
                C47862Ky r82 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            AnonymousClass1XE r1 = this.A02;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A02 = r1;
                            }
                            r1.add((C58782u6) C28541Wm.A0H(r72, r82, C58782u6.A05));
                        } else if (A032 == 18) {
                            C68513dY r12 = this.A00 == 2 ? (C68513dY) ((C58572ti) this.A03).A0U() : null;
                            AnonymousClass1Wo A0H = C28541Wm.A0H(r72, r82, C58572ti.A04);
                            this.A03 = A0H;
                            if (r12 != null) {
                                this.A03 = C28541Wm.A0C(r12, (C58572ti) A0H);
                            }
                            this.A00 = 2;
                        } else if (!A0a(r72, A032)) {
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
                return null;
            case 4:
                return new C58562th();
            case 5:
                return new C68503dX();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58562th.class) {
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
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i3 = C28541Wm.A06((AnonymousClass1Wo) this.A02.get(i4), 1, i3);
        }
        if (this.A00 == 2) {
            i3 = C28541Wm.A06((C28551Wn) this.A03, 2, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A02.get(i2), 1);
        }
        if (this.A00 == 2) {
            C28541Wm.A0O(codedOutputStream, this.A03, 2);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
