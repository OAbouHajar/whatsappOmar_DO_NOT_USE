package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.21R  reason: invalid class name */
public final class AnonymousClass21R extends C28541Wm implements C28561Wp {
    public static final AnonymousClass21R A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public C58892uK A04;

    static {
        AnonymousClass21R r0 = new AnonymousClass21R();
        A05 = r0;
        r0.A0W();
    }

    public AnonymousClass21R() {
        C28631Ww r0 = C28631Ww.A01;
        this.A02 = r0;
        this.A03 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                AnonymousClass21R r10 = (AnonymousClass21R) obj2;
                this.A04 = (C58892uK) r9.Ahu(this.A04, r10.A04);
                int i2 = this.A00;
                boolean z2 = false;
                if ((i2 & 2) == 2) {
                    z2 = true;
                }
                int i3 = this.A01;
                int i4 = r10.A00;
                boolean z3 = false;
                if ((i4 & 2) == 2) {
                    z3 = true;
                }
                this.A01 = r9.Ahq(i3, r10.A01, z2, z3);
                boolean z4 = false;
                if ((i2 & 4) == 4) {
                    z4 = true;
                }
                C28631Ww r3 = this.A02;
                boolean z5 = false;
                if ((i4 & 4) == 4) {
                    z5 = true;
                }
                this.A02 = r9.Ahn(r3, r10.A02, z4, z5);
                boolean z6 = false;
                if ((this.A00 & 8) == 8) {
                    z6 = true;
                }
                C28631Ww r32 = this.A03;
                boolean z7 = false;
                if ((r10.A00 & 8) == 8) {
                    z7 = true;
                }
                this.A03 = r9.Ahn(r32, r10.A03, z6, z7);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A00 |= r10.A00;
                }
                return this;
            case 2:
                C47852Kx r92 = (C47852Kx) obj;
                C47862Ky r102 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A032 = r92.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            C68453dS r1 = (this.A00 & 1) == 1 ? (C68453dS) this.A04.A0U() : null;
                            C58892uK r0 = (C58892uK) r92.A09(r102, C58892uK.A09.A0V());
                            this.A04 = r0;
                            if (r1 != null) {
                                r1.A04(r0);
                                this.A04 = (C58892uK) r1.A01();
                            }
                            this.A00 |= 1;
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A01 = r92.A02();
                        } else if (A032 == 26) {
                            this.A00 |= 4;
                            this.A02 = r92.A08();
                        } else if (A032 == 34) {
                            this.A00 |= 8;
                            this.A03 = r92.A08();
                        } else if (!A0a(r92, A032)) {
                            break;
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r02 = new C29791bD(e3.getMessage());
                        r02.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r02);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new AnonymousClass21R();
            case 5:
                return new C69213eg();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (AnonymousClass21R.class) {
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
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C58892uK r0 = this.A04;
            if (r0 == null) {
                r0 = C58892uK.A09;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A01(2, this.A01);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A02, 3);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A03, 4);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C58892uK r0 = this.A04;
            if (r0 == null) {
                r0 = C58892uK.A09;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A09(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A02, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A03, 4);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
