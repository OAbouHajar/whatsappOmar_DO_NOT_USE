package X;

import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.24r  reason: invalid class name and case insensitive filesystem */
public final class C445924r extends C28541Wm implements C28561Wp {
    public static final C445924r A0C;
    public static volatile C47872Kz A0D;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C28631Ww A06;
    public C28631Ww A07;
    public C28631Ww A08;
    public String A09;
    public String A0A;
    public String A0B = "";

    static {
        C445924r r0 = new C445924r();
        A0C = r0;
        r0.A0W();
    }

    public C445924r() {
        C28631Ww r0 = C28631Ww.A01;
        this.A07 = r0;
        this.A06 = r0;
        this.A08 = r0;
        this.A0A = "";
        this.A09 = "";
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A0C;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                C445924r r3 = (C445924r) obj3;
                int i2 = this.A01;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A0B;
                int i3 = r3.A01;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A0B = r8.Ahz(str, r3.A0B, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                C28631Ww r4 = this.A07;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A07 = r8.Ahn(r4, r3.A07, z4, z5);
                boolean z6 = false;
                if ((this.A01 & 4) == 4) {
                    z6 = true;
                }
                C28631Ww r42 = this.A06;
                boolean z7 = false;
                if ((r3.A01 & 4) == 4) {
                    z7 = true;
                }
                this.A06 = r8.Ahn(r42, r3.A06, z6, z7);
                boolean z8 = false;
                if ((this.A01 & 8) == 8) {
                    z8 = true;
                }
                C28631Ww r43 = this.A08;
                boolean z9 = false;
                if ((r3.A01 & 8) == 8) {
                    z9 = true;
                }
                this.A08 = r8.Ahn(r43, r3.A08, z8, z9);
                int i4 = this.A01;
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                String str2 = this.A0A;
                int i5 = r3.A01;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A0A = r8.Ahz(str2, r3.A0A, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                int i6 = this.A02;
                boolean z13 = false;
                if ((i5 & 32) == 32) {
                    z13 = true;
                }
                this.A02 = r8.Ahq(i6, r3.A02, z12, z13);
                boolean z14 = false;
                if ((i4 & 64) == 64) {
                    z14 = true;
                }
                int i7 = this.A03;
                boolean z15 = false;
                if ((i5 & 64) == 64) {
                    z15 = true;
                }
                this.A03 = r8.Ahq(i7, r3.A03, z14, z15);
                boolean z16 = false;
                if ((i4 & 128) == 128) {
                    z16 = true;
                }
                String str3 = this.A09;
                boolean z17 = false;
                if ((i5 & 128) == 128) {
                    z17 = true;
                }
                this.A09 = r8.Ahz(str3, r3.A09, z16, z17);
                boolean z18 = false;
                if ((i4 & 256) == 256) {
                    z18 = true;
                }
                long j2 = this.A04;
                boolean z19 = false;
                if ((i5 & 256) == 256) {
                    z19 = true;
                }
                this.A04 = r8.Aht(j2, r3.A04, z18, z19);
                boolean z20 = false;
                if ((i4 & 512) == 512) {
                    z20 = true;
                }
                float f2 = this.A00;
                boolean z21 = false;
                if ((i5 & 512) == 512) {
                    z21 = true;
                }
                this.A00 = r8.Ahp(f2, r3.A00, z20, z21);
                boolean z22 = false;
                if ((i4 & 1024) == 1024) {
                    z22 = true;
                }
                long j3 = this.A05;
                boolean z23 = false;
                if ((i5 & 1024) == 1024) {
                    z23 = true;
                }
                this.A05 = r8.Aht(j3, r3.A05, z22, z23);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A01 = i4 | i5;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj4;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r82.A0A();
                                this.A01 = 1 | this.A01;
                                this.A0B = A0A2;
                                continue;
                            case 18:
                                this.A01 |= 2;
                                this.A07 = r82.A08();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                this.A01 |= 4;
                                this.A06 = r82.A08();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                this.A01 |= 8;
                                this.A08 = r82.A08();
                                continue;
                            case 42:
                                String A0A3 = r82.A0A();
                                this.A01 |= 16;
                                this.A0A = A0A3;
                                continue;
                            case 48:
                                this.A01 |= 32;
                                this.A02 = r82.A02();
                                continue;
                            case 56:
                                this.A01 |= 64;
                                this.A03 = r82.A02();
                                continue;
                            case 66:
                                String A0A4 = r82.A0A();
                                this.A01 |= 128;
                                this.A09 = A0A4;
                                continue;
                            case AnonymousClass2EA.A02 /*72*/:
                                this.A01 |= 256;
                                this.A04 = r82.A06();
                                continue;
                            case 85:
                                this.A01 |= 512;
                                this.A00 = Float.intBitsToFloat(r82.A01());
                                continue;
                            case 88:
                                this.A01 |= 1024;
                                this.A05 = r82.A06();
                                continue;
                            default:
                                if (!A0a(r82, A032)) {
                                    break;
                                } else {
                                    continue;
                                }
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
                return new C445924r();
            case 5:
                return new C69363ev();
            case 6:
                break;
            case 7:
                if (A0D == null) {
                    synchronized (C445924r.class) {
                        if (A0D == null) {
                            A0D = new C47872Kz(A0C);
                        }
                    }
                }
                return A0D;
            default:
                throw new UnsupportedOperationException();
        }
        return A0C;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A01 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A0B);
        }
        int i4 = this.A01;
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A07, 2);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A06, 3);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A08, 4);
        }
        if ((i4 & 16) == 16) {
            i3 += 1 + CodedOutputStream.A06(this.A0A);
        }
        int i5 = this.A01;
        if ((i5 & 32) == 32) {
            i3 += CodedOutputStream.A02(6, this.A02);
        }
        if ((i5 & 64) == 64) {
            i3 += CodedOutputStream.A02(7, this.A03);
        }
        if ((i5 & 128) == 128) {
            i3 += 1 + CodedOutputStream.A06(this.A09);
        }
        int i6 = this.A01;
        if ((i6 & 256) == 256) {
            i3 += 1 + CodedOutputStream.A03(this.A04);
        }
        if ((i6 & 512) == 512) {
            i3 += 5;
        }
        if ((i6 & 1024) == 1024) {
            i3 += 1 + CodedOutputStream.A03(this.A05);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0B);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0F(this.A07, 2);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0F(this.A06, 3);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A0F(this.A08, 4);
        }
        if ((this.A01 & 16) == 16) {
            codedOutputStream.A0D(5, this.A0A);
        }
        if ((this.A01 & 32) == 32) {
            codedOutputStream.A0A(6, this.A02);
        }
        if ((this.A01 & 64) == 64) {
            codedOutputStream.A0A(7, this.A03);
        }
        if ((this.A01 & 128) == 128) {
            codedOutputStream.A0D(8, this.A09);
        }
        if ((this.A01 & 256) == 256) {
            codedOutputStream.A0C(9, this.A04);
        }
        if ((this.A01 & 512) == 512) {
            codedOutputStream.A08(10, Float.floatToRawIntBits(this.A00));
        }
        if ((this.A01 & 1024) == 1024) {
            codedOutputStream.A0C(11, this.A05);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
