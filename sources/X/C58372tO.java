package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tO  reason: invalid class name and case insensitive filesystem */
public final class C58372tO extends C28541Wm implements C28561Wp {
    public static final C58372tO A03;
    public static volatile C47872Kz A04;
    public int A00;
    public long A01;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;

    static {
        C58372tO r0 = new C58372tO();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r12, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj;
        switch (r12.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r4 = (AnonymousClass2L6) obj3;
                C58372tO r14 = (C58372tO) obj2;
                this.A02 = r4.Ahs(this.A02, r14.A02);
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                long j2 = this.A01;
                int i3 = r14.A00;
                this.A01 = r4.Aht(j2, r14.A01, A0T, C28541Wm.A0T(i3));
                if (r4 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
                }
                return this;
            case 2:
                C47852Kx r42 = (C47852Kx) obj3;
                while (true) {
                    try {
                        int A032 = r42.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A = r42.A0A();
                            AnonymousClass1XE r1 = this.A02;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A02 = r1;
                            }
                            r1.add(A0A);
                        } else if (A032 == 16) {
                            this.A00 |= 1;
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
                C28541Wm.A0R(this.A02);
                return null;
            case 4:
                return new C58372tO();
            case 5:
                return new C68523dZ();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C58372tO.class) {
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
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i3 += CodedOutputStream.A06(AnonymousClass000.A0n(this.A02, i4));
        }
        int size = 0 + i3 + this.A02.size();
        if ((this.A00 & 1) == 1) {
            size += 1 + CodedOutputStream.A03(this.A01);
        }
        return C28541Wm.A05(this, size);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            codedOutputStream.A0D(1, AnonymousClass000.A0n(this.A02, i2));
        }
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0C(2, this.A01);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
