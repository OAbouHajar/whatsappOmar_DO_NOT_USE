package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.21X  reason: invalid class name */
public final class AnonymousClass21X extends C28541Wm implements C28561Wp {
    public static final AnonymousClass21X A0E;
    public static volatile C47872Kz A0F;
    public int A00;
    public int A01;
    public C28631Ww A02 = C28631Ww.A01;
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    static {
        AnonymousClass21X r0 = new AnonymousClass21X();
        A0E = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A0E;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                AnonymousClass21X r10 = (AnonymousClass21X) obj2;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A0A;
                int i3 = r10.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A0A = r9.Ahz(str, r10.A0A, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A03;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A03 = r9.Ahz(str2, r10.A03, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                int i4 = this.A01;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A01 = r9.Ahq(i4, r10.A01, z6, z7);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                String str3 = this.A09;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A09 = r9.Ahz(str3, r10.A09, z8, z9);
                boolean z10 = false;
                if ((i2 & 16) == 16) {
                    z10 = true;
                }
                String str4 = this.A05;
                boolean z11 = false;
                if ((i3 & 16) == 16) {
                    z11 = true;
                }
                this.A05 = r9.Ahz(str4, r10.A05, z10, z11);
                boolean z12 = false;
                if ((i2 & 32) == 32) {
                    z12 = true;
                }
                C28631Ww r3 = this.A02;
                boolean z13 = false;
                if ((i3 & 32) == 32) {
                    z13 = true;
                }
                this.A02 = r9.Ahn(r3, r10.A02, z12, z13);
                int i5 = this.A00;
                boolean z14 = false;
                if ((i5 & 64) == 64) {
                    z14 = true;
                }
                String str5 = this.A07;
                int i6 = r10.A00;
                boolean z15 = false;
                if ((i6 & 64) == 64) {
                    z15 = true;
                }
                this.A07 = r9.Ahz(str5, r10.A07, z14, z15);
                boolean z16 = false;
                if ((i5 & 128) == 128) {
                    z16 = true;
                }
                String str6 = this.A06;
                boolean z17 = false;
                if ((i6 & 128) == 128) {
                    z17 = true;
                }
                this.A06 = r9.Ahz(str6, r10.A06, z16, z17);
                boolean z18 = false;
                if ((i5 & 256) == 256) {
                    z18 = true;
                }
                String str7 = this.A08;
                boolean z19 = false;
                if ((i6 & 256) == 256) {
                    z19 = true;
                }
                this.A08 = r9.Ahz(str7, r10.A08, z18, z19);
                boolean z20 = false;
                if ((i5 & 512) == 512) {
                    z20 = true;
                }
                boolean z21 = this.A0B;
                boolean z22 = false;
                if ((i6 & 512) == 512) {
                    z22 = true;
                }
                this.A0B = r9.Ahm(z20, z21, z22, r10.A0B);
                boolean z23 = false;
                if ((i5 & 1024) == 1024) {
                    z23 = true;
                }
                boolean z24 = this.A0C;
                boolean z25 = false;
                if ((i6 & 1024) == 1024) {
                    z25 = true;
                }
                this.A0C = r9.Ahm(z23, z24, z25, r10.A0C);
                boolean z26 = false;
                if ((i5 & 2048) == 2048) {
                    z26 = true;
                }
                boolean z27 = this.A0D;
                boolean z28 = false;
                if ((i6 & 2048) == 2048) {
                    z28 = true;
                }
                this.A0D = r9.Ahm(z26, z27, z28, r10.A0D);
                boolean z29 = false;
                if ((i5 & 4096) == 4096) {
                    z29 = true;
                }
                String str8 = this.A04;
                boolean z30 = false;
                if ((i6 & 4096) == 4096) {
                    z30 = true;
                }
                this.A04 = r9.Ahz(str8, r10.A04, z29, z30);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A00 = i5 | i6;
                }
                return this;
            case 2:
                C47852Kx r92 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r92.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r92.A0A();
                                this.A00 = 1 | this.A00;
                                this.A0A = A0A2;
                                continue;
                            case 18:
                                String A0A3 = r92.A0A();
                                this.A00 |= 2;
                                this.A03 = A0A3;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                int A022 = r92.A02();
                                if (A022 == 0 || A022 == 1 || A022 == 2) {
                                    this.A00 |= 4;
                                    this.A01 = A022;
                                    break;
                                } else {
                                    super.A0X(3, A022);
                                    continue;
                                }
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                String A0A4 = r92.A0A();
                                this.A00 |= 8;
                                this.A09 = A0A4;
                                continue;
                            case 42:
                                String A0A5 = r92.A0A();
                                this.A00 |= 16;
                                this.A05 = A0A5;
                                continue;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*50*/:
                                this.A00 |= 32;
                                this.A02 = r92.A08();
                                continue;
                            case 58:
                                String A0A6 = r92.A0A();
                                this.A00 |= 64;
                                this.A07 = A0A6;
                                continue;
                            case 66:
                                String A0A7 = r92.A0A();
                                this.A00 |= 128;
                                this.A06 = A0A7;
                                continue;
                            case 74:
                                String A0A8 = r92.A0A();
                                this.A00 |= 256;
                                this.A08 = A0A8;
                                continue;
                            case 80:
                                this.A00 |= 512;
                                this.A0B = r92.A0F();
                                continue;
                            case 88:
                                this.A00 |= 1024;
                                this.A0C = r92.A0F();
                                continue;
                            case 96:
                                this.A00 |= 2048;
                                this.A0D = r92.A0F();
                                continue;
                            case 106:
                                String A0A9 = r92.A0A();
                                this.A00 |= 4096;
                                this.A04 = A0A9;
                                continue;
                            default:
                                if (!A0a(r92, A032)) {
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
                return new AnonymousClass21X();
            case 5:
                return new C68443dR();
            case 6:
                break;
            case 7:
                if (A0F == null) {
                    synchronized (AnonymousClass21X.class) {
                        if (A0F == null) {
                            A0F = new C47872Kz(A0E);
                        }
                    }
                }
                return A0F;
            default:
                throw new UnsupportedOperationException();
        }
        return A0E;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A0A);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A03);
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A00(3, this.A01);
        }
        if ((i4 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A06(this.A09);
        }
        if ((this.A00 & 16) == 16) {
            i3 += 1 + CodedOutputStream.A06(this.A05);
        }
        int i5 = this.A00;
        if ((i5 & 32) == 32) {
            i3 += CodedOutputStream.A04(this.A02, 6);
        }
        if ((i5 & 64) == 64) {
            i3 += 1 + CodedOutputStream.A06(this.A07);
        }
        if ((this.A00 & 128) == 128) {
            i3 += 1 + CodedOutputStream.A06(this.A06);
        }
        if ((this.A00 & 256) == 256) {
            i3 += 1 + CodedOutputStream.A06(this.A08);
        }
        int i6 = this.A00;
        if ((i6 & 512) == 512) {
            i3 += 2;
        }
        if ((i6 & 1024) == 1024) {
            i3 += 2;
        }
        if ((i6 & 2048) == 2048) {
            i3 += 2;
        }
        if ((i6 & 4096) == 4096) {
            i3 += 1 + CodedOutputStream.A06(this.A04);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0A);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A09(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(4, this.A09);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(5, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0F(this.A02, 6);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0D(7, this.A07);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0D(8, this.A06);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0D(9, this.A08);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0E(10, this.A0B);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0E(11, this.A0C);
        }
        if ((this.A00 & 2048) == 2048) {
            codedOutputStream.A0E(12, this.A0D);
        }
        if ((this.A00 & 4096) == 4096) {
            codedOutputStream.A0D(13, this.A04);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
