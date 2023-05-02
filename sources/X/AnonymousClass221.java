package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.221  reason: invalid class name */
public final class AnonymousClass221 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass221 A03;
    public static volatile C47872Kz A04;
    public int A00;
    public int A01 = 1;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;

    static {
        AnonymousClass221 r0 = new AnonymousClass221();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                AnonymousClass221 r9 = (AnonymousClass221) obj2;
                this.A02 = r8.Ahs(this.A02, r9.A02);
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                int i3 = this.A01;
                int i4 = r9.A00;
                boolean z3 = true;
                if ((i4 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r8.Ahq(i3, r9.A01, z2, z3);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i4;
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
                            AnonymousClass1XE r1 = this.A02;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A02 = r1;
                            }
                            r1.add((AnonymousClass222) r82.A09(r92, AnonymousClass222.A03.A0V()));
                        } else if (A032 == 16) {
                            this.A00 |= 1;
                            this.A01 = r82.A02();
                        } else if (!A0a(r82, A032)) {
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
                ((AnonymousClass1XF) this.A02).A00 = false;
                return null;
            case 4:
                return new AnonymousClass221();
            case 5:
                return new C68853e6();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (AnonymousClass221.class) {
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
        int i3 = 0;
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i3 += CodedOutputStream.A05((AnonymousClass1Wo) this.A02.get(i4), 1);
        }
        if ((this.A00 & 1) == 1) {
            i3 += CodedOutputStream.A01(2, this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A02.get(i2), 1);
        }
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(2, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
