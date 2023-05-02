package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uH  reason: invalid class name and case insensitive filesystem */
public final class C58862uH extends C28541Wm implements C28561Wp {
    public static final C58862uH A08;
    public static volatile C47872Kz A09;
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03 = 1;
    public int A04;
    public int A05;
    public int A06;
    public int A07;

    static {
        C58862uH r0 = new C58862uH();
        A08 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r7.ordinal()) {
            case 0:
                return A08;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58862uH r9 = (C58862uH) obj2;
                int i3 = this.A00;
                boolean A0T = C28541Wm.A0T(i3);
                int i4 = this.A03;
                int i5 = r9.A00;
                this.A03 = r8.Ahq(i4, r9.A03, A0T, C28541Wm.A0T(i5));
                this.A07 = r8.Ahq(this.A07, r9.A07, AnonymousClass000.A1R(i3 & 2, 2), AnonymousClass000.A1R(i5 & 2, 2));
                this.A06 = r8.Ahq(this.A06, r9.A06, AnonymousClass000.A1R(i3 & 4, 4), AnonymousClass000.A1R(i5 & 4, 4));
                this.A02 = r8.Ahq(this.A02, r9.A02, AnonymousClass000.A1R(i3 & 8, 8), AnonymousClass000.A1R(i5 & 8, 8));
                this.A04 = r8.Ahq(this.A04, r9.A04, AnonymousClass000.A1R(i3 & 16, 16), AnonymousClass000.A1R(i5 & 16, 16));
                this.A05 = r8.Ahq(this.A05, r9.A05, AnonymousClass000.A1R(i3 & 32, 32), AnonymousClass000.A1R(i5 & 32, 32));
                this.A01 = r8.Ahq(this.A01, r9.A01, AnonymousClass000.A1R(i3 & 64, 64), AnonymousClass000.A1R(i5 & 64, 64));
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i3 | i5;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        int i6 = 1;
                        if (A032 == 0) {
                            break;
                        } else {
                            if (A032 == 8) {
                                i2 = r82.A02();
                                if (AnonymousClass439.A00(i2) != null) {
                                    this.A00 = 1 | this.A00;
                                    this.A03 = i2;
                                }
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A07 = r82.A02();
                            } else if (A032 == 24) {
                                this.A00 |= 4;
                                this.A06 = r82.A02();
                            } else if (A032 == 32) {
                                this.A00 |= 8;
                                this.A02 = r82.A02();
                            } else if (A032 == 40) {
                                this.A00 |= 16;
                                this.A04 = r82.A02();
                            } else if (A032 == 48) {
                                this.A00 |= 32;
                                this.A05 = r82.A02();
                            } else if (A032 == 56) {
                                i2 = r82.A02();
                                if (i2 == 1 || i2 == 2) {
                                    this.A00 |= 64;
                                    this.A01 = i2;
                                } else {
                                    i6 = 7;
                                }
                            } else if (!A0a(r82, A032)) {
                                break;
                            }
                            super.A0X(i6, i2);
                        }
                    } catch (C29791bD e2) {
                        runtimeException = C28541Wm.A0J(e2, this);
                        throw runtimeException;
                    } catch (IOException e3) {
                        runtimeException = C28541Wm.A0K(this, e3);
                        throw runtimeException;
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C58862uH();
            case 5:
                return new C68773dy();
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C58862uH.class) {
                        if (A09 == null) {
                            A09 = C28541Wm.A09(A08);
                        }
                    }
                }
                return A09;
            default:
                throw C13680ns.A0m();
        }
        return A08;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = C28541Wm.A01(1, this.A03, 0);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A00(2, this.A07, i3);
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A00(3, this.A06, i3);
        }
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A00(4, this.A02, i3);
        }
        if ((i4 & 16) == 16) {
            i3 = C28541Wm.A00(5, this.A04, i3);
        }
        if ((i4 & 32) == 32) {
            i3 = C28541Wm.A00(6, this.A05, i3);
        }
        if ((i4 & 64) == 64) {
            i3 = C28541Wm.A01(7, this.A01, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0A(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0A(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0A(5, this.A04);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0A(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A09(7, this.A01);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
