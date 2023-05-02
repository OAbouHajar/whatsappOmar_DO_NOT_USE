package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2GB  reason: invalid class name */
public final class AnonymousClass2GB extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2GB A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public AnonymousClass2G7 A02;
    public AnonymousClass2t0 A03;
    public AnonymousClass2u8 A04;

    static {
        AnonymousClass2GB r0 = new AnonymousClass2GB();
        A05 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r6, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r6.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj;
                AnonymousClass2GB r8 = (AnonymousClass2GB) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                int i3 = this.A01;
                boolean z3 = true;
                if ((r8.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r7.Ahq(i3, r8.A01, z2, z3);
                this.A04 = (AnonymousClass2u8) r7.Ahu(this.A04, r8.A04);
                this.A03 = (AnonymousClass2t0) r7.Ahu(this.A03, r8.A03);
                this.A02 = (AnonymousClass2G7) r7.Ahu(this.A02, r8.A02);
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 |= r8.A00;
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
                        } else if (A032 != 8) {
                            if (A032 == 18) {
                                C68303dD r1 = (this.A00 & 2) == 2 ? (C68303dD) this.A04.A0U() : null;
                                AnonymousClass2u8 r0 = (AnonymousClass2u8) r72.A09(r82, AnonymousClass2u8.A06.A0V());
                                this.A04 = r0;
                                if (r1 != null) {
                                    r1.A04(r0);
                                    this.A04 = (AnonymousClass2u8) r1.A01();
                                }
                                i2 = this.A00 | 2;
                            } else if (A032 == 26) {
                                C68293dC r12 = (this.A00 & 4) == 4 ? (C68293dC) this.A03.A0U() : null;
                                AnonymousClass2t0 r02 = (AnonymousClass2t0) r72.A09(r82, AnonymousClass2t0.A02.A0V());
                                this.A03 = r02;
                                if (r12 != null) {
                                    r12.A04(r02);
                                    this.A03 = (AnonymousClass2t0) r12.A01();
                                }
                                i2 = this.A00 | 4;
                            } else if (A032 == 34) {
                                C68273dA r13 = (this.A00 & 8) == 8 ? (C68273dA) this.A02.A0U() : null;
                                AnonymousClass2G7 r03 = (AnonymousClass2G7) r72.A09(r82, AnonymousClass2G7.A0f.A0V());
                                this.A02 = r03;
                                if (r13 != null) {
                                    r13.A04(r03);
                                    this.A02 = (AnonymousClass2G7) r13.A01();
                                }
                                i2 = this.A00 | 8;
                            } else if (!A0a(r72, A032)) {
                                break;
                            }
                            this.A00 = i2;
                        } else {
                            int A022 = r72.A02();
                            if (A022 == 0 || A022 == 1) {
                                this.A00 = 1 | this.A00;
                                this.A01 = A022;
                            } else {
                                super.A0X(1, A022);
                            }
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r04 = new C29791bD(e3.getMessage());
                        r04.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r04);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new AnonymousClass2GB();
            case 5:
                return new C68283dB();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (AnonymousClass2GB.class) {
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
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A00(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            AnonymousClass2u8 r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass2u8.A06;
            }
            i3 += CodedOutputStream.A05(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass2t0 r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass2t0.A02;
            }
            i3 += CodedOutputStream.A05(r02, 3);
        }
        if ((this.A00 & 8) == 8) {
            AnonymousClass2G7 r03 = this.A02;
            if (r03 == null) {
                r03 = AnonymousClass2G7.A0f;
            }
            i3 += CodedOutputStream.A05(r03, 4);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass2u8 r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass2u8.A06;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass2t0 r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass2t0.A02;
            }
            codedOutputStream.A0G(r02, 3);
        }
        if ((this.A00 & 8) == 8) {
            AnonymousClass2G7 r03 = this.A02;
            if (r03 == null) {
                r03 = AnonymousClass2G7.A0f;
            }
            codedOutputStream.A0G(r03, 4);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
