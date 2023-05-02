package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1mQ  reason: invalid class name and case insensitive filesystem */
public final class C35741mQ extends C28541Wm implements C28561Wp {
    public static final C35741mQ A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public int A02 = -1;
    public int A03;
    public AnonymousClass27P A04 = C58132sw.A02;

    static {
        C35741mQ r0 = new C35741mQ();
        A05 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C35741mQ r9 = (C35741mQ) obj2;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                int i3 = this.A03;
                int i4 = r9.A00;
                boolean z3 = true;
                if ((i4 & 1) != 1) {
                    z3 = false;
                }
                this.A03 = r8.Ahq(i3, r9.A03, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                int i5 = this.A01;
                boolean z5 = false;
                if ((i4 & 2) == 2) {
                    z5 = true;
                }
                this.A01 = r8.Ahq(i5, r9.A01, z4, z5);
                this.A04 = r8.Ahr(this.A04, r9.A04);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 |= r9.A00;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            this.A00 |= 1;
                            this.A03 = r82.A02();
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A01 = r82.A02();
                        } else if (A032 == 24) {
                            AnonymousClass27P r2 = this.A04;
                            if (!((AnonymousClass1XF) r2).A00) {
                                r2 = C28541Wm.A0F(r2);
                                this.A04 = r2;
                            }
                            C58132sw r22 = (C58132sw) r2;
                            r22.A02(r22.A00, r82.A02());
                        } else if (A032 == 26) {
                            int A042 = r82.A04(r82.A02());
                            AnonymousClass27P r1 = this.A04;
                            if (!((AnonymousClass1XF) r1).A00 && r82.A00() > 0) {
                                this.A04 = C28541Wm.A0F(r1);
                            }
                            while (r82.A00() > 0) {
                                C58132sw r23 = (C58132sw) this.A04;
                                r23.A02(r23.A00, r82.A02());
                            }
                            r82.A03 = A042;
                            r82.A0B();
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
                ((AnonymousClass1XF) this.A04).A00 = false;
                return null;
            case 4:
                return new C35741mQ();
            case 5:
                return new C68553dc();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C35741mQ.class) {
                        if (A06 == null) {
                            A06 = new C47872Kz(A05);
                        }
                    }
                }
                return A06;
            default:
                throw new UnsupportedOperationException();
        }
        return A05;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        int A022 = (i3 & 1) == 1 ? CodedOutputStream.A02(1, this.A03) : 0;
        if ((i3 & 2) == 2) {
            A022 += CodedOutputStream.A02(2, this.A01);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A04.size(); i5++) {
            C58132sw r0 = (C58132sw) this.A04;
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
        if (!this.A04.isEmpty()) {
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
        this.A02 = i4;
        int A002 = i8 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        AFw();
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0A(2, this.A01);
        }
        if (this.A04.size() > 0) {
            codedOutputStream.A07(26);
            codedOutputStream.A07(this.A02);
        }
        for (int i2 = 0; i2 < this.A04.size(); i2++) {
            C58132sw r0 = (C58132sw) this.A04;
            r0.A01(i2);
            codedOutputStream.A07(r0.A01[i2]);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
