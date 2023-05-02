package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1cO  reason: invalid class name and case insensitive filesystem */
public final class C30461cO extends C28541Wm implements C28561Wp {
    public static final C30461cO A03;
    public static volatile C47872Kz A04;
    public int A00;
    public AnonymousClass1XE A01 = AnonymousClass2NE.A01;
    public String A02 = "";

    static {
        C30461cO r0 = new C30461cO();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r5, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r5.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r6 = (AnonymousClass2L6) obj;
                C30461cO r7 = (C30461cO) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A02;
                boolean z3 = true;
                if ((r7.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A02 = r6.Ahz(str, r7.A02, z2, z3);
                this.A01 = r6.Ahs(this.A01, r7.A01);
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
                            String A0A = r62.A0A();
                            this.A00 = 1 | this.A00;
                            this.A02 = A0A;
                        } else if (A032 == 18) {
                            AnonymousClass1XE r1 = this.A01;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A01 = r1;
                            }
                            r1.add((C30481cQ) r62.A09(r72, C30481cQ.A04.A0V()));
                        } else if (!A0a(r62, A032)) {
                            break;
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r0 = new C29791bD(e3.getMessage());
                        r0.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r0);
                        throw runtimeException;
                    }
                }
            case 3:
                ((AnonymousClass1XF) this.A01).A00 = false;
                return null;
            case 4:
                return new C30461cO();
            case 5:
                return new C69353eu();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C30461cO.class) {
                        if (A04 == null) {
                            A04 = new C47872Kz(A03);
                        }
                    }
                }
                return A04;
            default:
                throw new UnsupportedOperationException();
        }
        return A03;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A06 = (this.A00 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A02) : 0;
        for (int i3 = 0; i3 < this.A01.size(); i3++) {
            A06 += CodedOutputStream.A05((AnonymousClass1Wo) this.A01.get(i3), 2);
        }
        int A002 = A06 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A02);
        }
        for (int i2 = 0; i2 < this.A01.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A01.get(i2), 2);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
