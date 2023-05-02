package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.27J  reason: invalid class name */
public final class AnonymousClass27J extends C28541Wm implements C28561Wp {
    public static final AnonymousClass27J A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public long A04;
    public AnonymousClass27P A05 = C58132sw.A02;

    static {
        AnonymousClass27J r0 = new AnonymousClass27J();
        A06 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A06;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                AnonymousClass27J r2 = (AnonymousClass27J) obj3;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                int i3 = this.A02;
                int i4 = r2.A00;
                boolean z3 = true;
                if ((i4 & 1) != 1) {
                    z3 = false;
                }
                this.A02 = r7.Ahq(i3, r2.A02, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                long j2 = this.A04;
                boolean z5 = false;
                if ((i4 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r7.Aht(j2, r2.A04, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                int i5 = this.A01;
                boolean z7 = false;
                if ((i4 & 4) == 4) {
                    z7 = true;
                }
                this.A01 = r7.Ahq(i5, r2.A01, z6, z7);
                this.A05 = r7.Ahr(this.A05, r2.A05);
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 |= r2.A00;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj4;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            this.A00 |= 1;
                            this.A02 = r72.A02();
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A04 = r72.A06();
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A01 = r72.A02();
                        } else if (A032 == 32) {
                            AnonymousClass27P r22 = this.A05;
                            if (!((AnonymousClass1XF) r22).A00) {
                                r22 = C28541Wm.A0F(r22);
                                this.A05 = r22;
                            }
                            C58132sw r23 = (C58132sw) r22;
                            r23.A02(r23.A00, r72.A02());
                        } else if (A032 == 34) {
                            int A042 = r72.A04(r72.A02());
                            AnonymousClass27P r1 = this.A05;
                            if (!((AnonymousClass1XF) r1).A00 && r72.A00() > 0) {
                                this.A05 = C28541Wm.A0F(r1);
                            }
                            while (r72.A00() > 0) {
                                C58132sw r24 = (C58132sw) this.A05;
                                r24.A02(r24.A00, r72.A02());
                            }
                            r72.A03 = A042;
                            r72.A0B();
                        } else if (!A0a(r72, A032)) {
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
                ((AnonymousClass1XF) this.A05).A00 = false;
                return null;
            case 4:
                return new AnonymousClass27J();
            case 5:
                return new C68243d7();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (AnonymousClass27J.class) {
                        if (A07 == null) {
                            A07 = new C47872Kz(A06);
                        }
                    }
                }
                return A07;
            default:
                throw new UnsupportedOperationException();
        }
        return A06;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        int A022 = (i3 & 1) == 1 ? CodedOutputStream.A02(1, this.A02) : 0;
        if ((i3 & 2) == 2) {
            A022 += 1 + CodedOutputStream.A03(this.A04);
        }
        if ((i3 & 4) == 4) {
            A022 += CodedOutputStream.A02(3, this.A01);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A05.size(); i5++) {
            C58132sw r0 = (C58132sw) this.A05;
            r0.A01(i5);
            int i6 = r0.A01[i5];
            int i7 = 1;
            if ((i6 & -128) != 0) {
                i7 = 2;
                if ((i6 & -16384) != 0) {
                    i7 = 3;
                    if ((-2097152 & i6) != 0) {
                        i7 = 5;
                        if ((i6 & -268435456) == 0) {
                            i7 = 4;
                        }
                    }
                }
            }
            i4 += i7;
        }
        int i8 = A022 + i4;
        if (!this.A05.isEmpty()) {
            int i9 = i8 + 1;
            int i10 = 10;
            if (i4 >= 0) {
                i10 = 1;
                if ((i4 & -128) != 0) {
                    i10 = 2;
                    if ((i4 & -16384) != 0) {
                        i10 = 3;
                        if ((-2097152 & i4) != 0) {
                            i10 = 5;
                            if ((-268435456 & i4) == 0) {
                                i10 = 4;
                            }
                        }
                    }
                }
            }
            i8 = i9 + i10;
        }
        this.A03 = i4;
        int A002 = i8 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        AFw();
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(3, this.A01);
        }
        if (this.A05.size() > 0) {
            codedOutputStream.A07(34);
            codedOutputStream.A07(this.A03);
        }
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            C58132sw r0 = (C58132sw) this.A05;
            r0.A01(i2);
            codedOutputStream.A07(r0.A01[i2]);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
