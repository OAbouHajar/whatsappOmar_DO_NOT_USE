package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2gm  reason: invalid class name and case insensitive filesystem */
public final class C54082gm extends C28541Wm implements C28561Wp {
    public static final C54082gm A09;
    public static volatile C47872Kz A0A;
    public int A00;
    public C28631Ww A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public C28631Ww A04;
    public C28631Ww A05;
    public C28631Ww A06;
    public C28631Ww A07;
    public C28631Ww A08;

    static {
        C54082gm r0 = new C54082gm();
        A09 = r0;
        r0.A0W();
    }

    public C54082gm() {
        C28631Ww r0 = C28631Ww.A01;
        this.A05 = r0;
        this.A04 = r0;
        this.A03 = r0;
        this.A06 = r0;
        this.A08 = r0;
        this.A07 = r0;
        this.A01 = r0;
        this.A02 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r6, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r6.ordinal()) {
            case 0:
                return A09;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj;
                C54082gm r8 = (C54082gm) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                C28631Ww r2 = this.A05;
                boolean z3 = true;
                if ((r8.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A05 = r7.Ahn(r2, r8.A05, z2, z3);
                boolean z4 = false;
                if ((this.A00 & 2) == 2) {
                    z4 = true;
                }
                C28631Ww r3 = this.A04;
                boolean z5 = false;
                if ((r8.A00 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r7.Ahn(r3, r8.A04, z4, z5);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                C28631Ww r32 = this.A03;
                boolean z7 = false;
                if ((r8.A00 & 4) == 4) {
                    z7 = true;
                }
                this.A03 = r7.Ahn(r32, r8.A03, z6, z7);
                boolean z8 = false;
                if ((this.A00 & 8) == 8) {
                    z8 = true;
                }
                C28631Ww r33 = this.A06;
                boolean z9 = false;
                if ((r8.A00 & 8) == 8) {
                    z9 = true;
                }
                this.A06 = r7.Ahn(r33, r8.A06, z8, z9);
                boolean z10 = false;
                if ((this.A00 & 16) == 16) {
                    z10 = true;
                }
                C28631Ww r34 = this.A08;
                boolean z11 = false;
                if ((r8.A00 & 16) == 16) {
                    z11 = true;
                }
                this.A08 = r7.Ahn(r34, r8.A08, z10, z11);
                boolean z12 = false;
                if ((this.A00 & 32) == 32) {
                    z12 = true;
                }
                C28631Ww r35 = this.A07;
                boolean z13 = false;
                if ((r8.A00 & 32) == 32) {
                    z13 = true;
                }
                this.A07 = r7.Ahn(r35, r8.A07, z12, z13);
                boolean z14 = false;
                if ((this.A00 & 64) == 64) {
                    z14 = true;
                }
                C28631Ww r36 = this.A01;
                boolean z15 = false;
                if ((r8.A00 & 64) == 64) {
                    z15 = true;
                }
                this.A01 = r7.Ahn(r36, r8.A01, z14, z15);
                boolean z16 = false;
                if ((this.A00 & 128) == 128) {
                    z16 = true;
                }
                C28631Ww r37 = this.A02;
                boolean z17 = false;
                if ((r8.A00 & 128) == 128) {
                    z17 = true;
                }
                this.A02 = r7.Ahn(r37, r8.A02, z16, z17);
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 |= r8.A00;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            this.A00 |= 1;
                            this.A05 = r72.A08();
                        } else if (A032 == 18) {
                            this.A00 |= 2;
                            this.A04 = r72.A08();
                        } else if (A032 == 26) {
                            this.A00 |= 4;
                            this.A03 = r72.A08();
                        } else if (A032 == 34) {
                            this.A00 |= 8;
                            this.A06 = r72.A08();
                        } else if (A032 == 42) {
                            this.A00 |= 16;
                            this.A08 = r72.A08();
                        } else if (A032 == 50) {
                            this.A00 |= 32;
                            this.A07 = r72.A08();
                        } else if (A032 == 58) {
                            this.A00 |= 64;
                            this.A01 = r72.A08();
                        } else if (A032 == 66) {
                            this.A00 |= 128;
                            this.A02 = r72.A08();
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
                return null;
            case 4:
                return new C54082gm();
            case 5:
                return new C54092gn();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C54082gm.class) {
                        if (A0A == null) {
                            A0A = new C47872Kz(A09);
                        }
                    }
                }
                return A0A;
            default:
                throw new UnsupportedOperationException();
        }
        return A09;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A04(this.A05, 1);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A04, 2);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A03, 3);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A06, 4);
        }
        if ((i4 & 16) == 16) {
            i3 += CodedOutputStream.A04(this.A08, 5);
        }
        if ((i4 & 32) == 32) {
            i3 += CodedOutputStream.A04(this.A07, 6);
        }
        if ((i4 & 64) == 64) {
            i3 += CodedOutputStream.A04(this.A01, 7);
        }
        if ((i4 & 128) == 128) {
            i3 += CodedOutputStream.A04(this.A02, 8);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A05, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A04, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A03, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A06, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0F(this.A08, 5);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0F(this.A07, 6);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0F(this.A01, 7);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0F(this.A02, 8);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
