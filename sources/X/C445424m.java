package X;

import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.24m  reason: invalid class name and case insensitive filesystem */
public final class C445424m extends C28541Wm implements C28561Wp {
    public static final C445424m A0F;
    public static volatile C47872Kz A0G;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C28631Ww A05;
    public C28631Ww A06;
    public C28631Ww A07;
    public C28631Ww A08;
    public C28631Ww A09;
    public AnonymousClass21S A0A;
    public String A0B;
    public String A0C = "";
    public String A0D = "";
    public boolean A0E;

    static {
        C445424m r0 = new C445424m();
        A0F = r0;
        r0.A0W();
    }

    public C445424m() {
        C28631Ww r0 = C28631Ww.A01;
        this.A06 = r0;
        this.A07 = r0;
        this.A05 = r0;
        this.A0B = "";
        this.A08 = r0;
        this.A09 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A0F;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                C445424m r1 = (C445424m) obj3;
                int i2 = this.A01;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A0D;
                int i3 = r1.A01;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A0D = r8.Ahz(str, r1.A0D, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A0C;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A0C = r8.Ahz(str2, r1.A0C, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                C28631Ww r4 = this.A06;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A06 = r8.Ahn(r4, r1.A06, z6, z7);
                int i4 = this.A01;
                boolean z8 = false;
                if ((i4 & 8) == 8) {
                    z8 = true;
                }
                long j2 = this.A03;
                int i5 = r1.A01;
                boolean z9 = false;
                if ((i5 & 8) == 8) {
                    z9 = true;
                }
                this.A03 = r8.Aht(j2, r1.A03, z8, z9);
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                int i6 = this.A02;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A02 = r8.Ahq(i6, r1.A02, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                boolean z13 = this.A0E;
                boolean z14 = false;
                if ((i5 & 32) == 32) {
                    z14 = true;
                }
                this.A0E = r8.Ahm(z12, z13, z14, r1.A0E);
                boolean z15 = false;
                if ((i4 & 64) == 64) {
                    z15 = true;
                }
                C28631Ww r42 = this.A07;
                boolean z16 = false;
                if ((i5 & 64) == 64) {
                    z16 = true;
                }
                this.A07 = r8.Ahn(r42, r1.A07, z15, z16);
                boolean z17 = false;
                if ((this.A01 & 128) == 128) {
                    z17 = true;
                }
                C28631Ww r43 = this.A05;
                boolean z18 = false;
                if ((r1.A01 & 128) == 128) {
                    z18 = true;
                }
                this.A05 = r8.Ahn(r43, r1.A05, z17, z18);
                int i7 = this.A01;
                boolean z19 = false;
                if ((i7 & 256) == 256) {
                    z19 = true;
                }
                String str3 = this.A0B;
                int i8 = r1.A01;
                boolean z20 = false;
                if ((i8 & 256) == 256) {
                    z20 = true;
                }
                this.A0B = r8.Ahz(str3, r1.A0B, z19, z20);
                boolean z21 = false;
                if ((i7 & 512) == 512) {
                    z21 = true;
                }
                long j3 = this.A04;
                boolean z22 = false;
                if ((i8 & 512) == 512) {
                    z22 = true;
                }
                this.A04 = r8.Aht(j3, r1.A04, z21, z22);
                this.A0A = (AnonymousClass21S) r8.Ahu(this.A0A, r1.A0A);
                boolean z23 = false;
                if ((this.A01 & 2048) == 2048) {
                    z23 = true;
                }
                C28631Ww r44 = this.A08;
                boolean z24 = false;
                if ((r1.A01 & 2048) == 2048) {
                    z24 = true;
                }
                this.A08 = r8.Ahn(r44, r1.A08, z23, z24);
                boolean z25 = false;
                if ((this.A01 & 4096) == 4096) {
                    z25 = true;
                }
                C28631Ww r45 = this.A09;
                boolean z26 = false;
                if ((r1.A01 & 4096) == 4096) {
                    z26 = true;
                }
                this.A09 = r8.Ahn(r45, r1.A09, z25, z26);
                int i9 = this.A01;
                boolean z27 = false;
                if ((i9 & 8192) == 8192) {
                    z27 = true;
                }
                int i10 = this.A00;
                int i11 = r1.A01;
                boolean z28 = false;
                if ((i11 & 8192) == 8192) {
                    z28 = true;
                }
                this.A00 = r8.Ahq(i10, r1.A00, z27, z28);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A01 = i9 | i11;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj4;
                C47862Ky r12 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r82.A0A();
                                this.A01 = 1 | this.A01;
                                this.A0D = A0A2;
                                continue;
                            case 18:
                                String A0A3 = r82.A0A();
                                this.A01 |= 2;
                                this.A0C = A0A3;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                this.A01 |= 4;
                                this.A06 = r82.A08();
                                continue;
                            case 32:
                                this.A01 |= 8;
                                this.A03 = r82.A06();
                                continue;
                            case 40:
                                this.A01 |= 16;
                                this.A02 = r82.A02();
                                continue;
                            case 48:
                                this.A01 |= 32;
                                this.A0E = r82.A0F();
                                continue;
                            case 58:
                                this.A01 |= 64;
                                this.A07 = r82.A08();
                                continue;
                            case 66:
                                this.A01 |= 128;
                                this.A05 = r82.A08();
                                continue;
                            case 74:
                                String A0A4 = r82.A0A();
                                this.A01 |= 256;
                                this.A0B = A0A4;
                                continue;
                            case 80:
                                this.A01 |= 512;
                                this.A04 = r82.A06();
                                continue;
                            case 138:
                                AnonymousClass21T r2 = (this.A01 & 1024) == 1024 ? (AnonymousClass21T) this.A0A.A0U() : null;
                                AnonymousClass21S r0 = (AnonymousClass21S) r82.A09(r12, AnonymousClass21S.A0R.A0V());
                                this.A0A = r0;
                                if (r2 != null) {
                                    r2.A04(r0);
                                    this.A0A = (AnonymousClass21S) r2.A01();
                                }
                                this.A01 |= 1024;
                                continue;
                            case 146:
                                this.A01 |= 2048;
                                this.A08 = r82.A08();
                                continue;
                            case 154:
                                this.A01 |= 4096;
                                this.A09 = r82.A08();
                                continue;
                            case 165:
                                this.A01 |= 8192;
                                this.A00 = r82.A01();
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
                        C29791bD r02 = new C29791bD(e3.getMessage());
                        r02.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r02);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C445424m();
            case 5:
                return new C68593dg();
            case 6:
                break;
            case 7:
                if (A0G == null) {
                    synchronized (C445424m.class) {
                        if (A0G == null) {
                            A0G = new C47872Kz(A0F);
                        }
                    }
                }
                return A0G;
            default:
                throw new UnsupportedOperationException();
        }
        return A0F;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A01 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A0D);
        }
        if ((this.A01 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A0C);
        }
        int i4 = this.A01;
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A06, 3);
        }
        if ((i4 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A03(this.A03);
        }
        if ((i4 & 16) == 16) {
            i3 += CodedOutputStream.A02(5, this.A02);
        }
        if ((i4 & 32) == 32) {
            i3 += 2;
        }
        if ((i4 & 64) == 64) {
            i3 += CodedOutputStream.A04(this.A07, 7);
        }
        if ((i4 & 128) == 128) {
            i3 += CodedOutputStream.A04(this.A05, 8);
        }
        if ((i4 & 256) == 256) {
            i3 += 1 + CodedOutputStream.A06(this.A0B);
        }
        int i5 = this.A01;
        if ((i5 & 512) == 512) {
            i3 += 1 + CodedOutputStream.A03(this.A04);
        }
        if ((i5 & 1024) == 1024) {
            AnonymousClass21S r0 = this.A0A;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 += CodedOutputStream.A05(r0, 17);
        }
        int i6 = this.A01;
        if ((i6 & 2048) == 2048) {
            i3 += CodedOutputStream.A04(this.A08, 18);
        }
        if ((i6 & 4096) == 4096) {
            i3 += CodedOutputStream.A04(this.A09, 19);
        }
        if ((i6 & 8192) == 8192) {
            i3 += 6;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0D);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0D(2, this.A0C);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0F(this.A06, 3);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A0C(4, this.A03);
        }
        if ((this.A01 & 16) == 16) {
            codedOutputStream.A0A(5, this.A02);
        }
        if ((this.A01 & 32) == 32) {
            codedOutputStream.A0E(6, this.A0E);
        }
        if ((this.A01 & 64) == 64) {
            codedOutputStream.A0F(this.A07, 7);
        }
        if ((this.A01 & 128) == 128) {
            codedOutputStream.A0F(this.A05, 8);
        }
        if ((this.A01 & 256) == 256) {
            codedOutputStream.A0D(9, this.A0B);
        }
        if ((this.A01 & 512) == 512) {
            codedOutputStream.A0C(10, this.A04);
        }
        if ((this.A01 & 1024) == 1024) {
            AnonymousClass21S r0 = this.A0A;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 17);
        }
        if ((this.A01 & 2048) == 2048) {
            codedOutputStream.A0F(this.A08, 18);
        }
        if ((this.A01 & 4096) == 4096) {
            codedOutputStream.A0F(this.A09, 19);
        }
        if ((this.A01 & 8192) == 8192) {
            codedOutputStream.A08(20, this.A00);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
