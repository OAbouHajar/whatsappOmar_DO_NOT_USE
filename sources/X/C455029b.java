package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.29b  reason: invalid class name and case insensitive filesystem */
public final class C455029b extends C28541Wm implements C28561Wp {
    public static final C455029b A0A;
    public static volatile C47872Kz A0B;
    public int A00;
    public AnonymousClass1XE A01;
    public AnonymousClass1XE A02;
    public C59022uY A03;
    public String A04;
    public String A05;
    public String A06 = "";
    public String A07;
    public String A08;
    public String A09 = "";

    static {
        C455029b r0 = new C455029b();
        A0A = r0;
        r0.A0W();
    }

    public C455029b() {
        AnonymousClass2NE r0 = AnonymousClass2NE.A01;
        this.A02 = r0;
        this.A08 = "";
        this.A07 = "";
        this.A01 = r0;
        this.A05 = "";
        this.A04 = "";
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A0A;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C455029b r10 = (C455029b) obj2;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A09;
                int i3 = r10.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A09 = r9.Ahz(str, r10.A09, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A06;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A06 = r9.Ahz(str2, r10.A06, z4, z5);
                this.A02 = r9.Ahs(this.A02, r10.A02);
                int i4 = this.A00;
                boolean z6 = false;
                if ((i4 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A08;
                int i5 = r10.A00;
                boolean z7 = false;
                if ((i5 & 4) == 4) {
                    z7 = true;
                }
                this.A08 = r9.Ahz(str3, r10.A08, z6, z7);
                boolean z8 = false;
                if ((i4 & 8) == 8) {
                    z8 = true;
                }
                String str4 = this.A07;
                boolean z9 = false;
                if ((i5 & 8) == 8) {
                    z9 = true;
                }
                this.A07 = r9.Ahz(str4, r10.A07, z8, z9);
                this.A01 = r9.Ahs(this.A01, r10.A01);
                int i6 = this.A00;
                boolean z10 = false;
                if ((i6 & 16) == 16) {
                    z10 = true;
                }
                String str5 = this.A05;
                int i7 = r10.A00;
                boolean z11 = false;
                if ((i7 & 16) == 16) {
                    z11 = true;
                }
                this.A05 = r9.Ahz(str5, r10.A05, z10, z11);
                boolean z12 = false;
                if ((i6 & 32) == 32) {
                    z12 = true;
                }
                String str6 = this.A04;
                boolean z13 = false;
                if ((i7 & 32) == 32) {
                    z13 = true;
                }
                this.A04 = r9.Ahz(str6, r10.A04, z12, z13);
                this.A03 = (C59022uY) r9.Ahu(this.A03, r10.A03);
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
                            String A0A2 = r92.A0A();
                            this.A00 = 1 | this.A00;
                            this.A09 = A0A2;
                        } else if (A032 == 18) {
                            String A0A3 = r92.A0A();
                            this.A00 |= 2;
                            this.A06 = A0A3;
                        } else if (A032 == 26) {
                            String A0A4 = r92.A0A();
                            AnonymousClass1XE r1 = this.A02;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A02 = r1;
                            }
                            r1.add(A0A4);
                        } else if (A032 == 34) {
                            String A0A5 = r92.A0A();
                            this.A00 |= 4;
                            this.A08 = A0A5;
                        } else if (A032 == 42) {
                            String A0A6 = r92.A0A();
                            this.A00 |= 8;
                            this.A07 = A0A6;
                        } else if (A032 == 50) {
                            AnonymousClass1XE r12 = this.A01;
                            if (!((AnonymousClass1XF) r12).A00) {
                                r12 = C28541Wm.A0G(r12);
                                this.A01 = r12;
                            }
                            r12.add((C58632to) r92.A09(r102, C58632to.A04.A0V()));
                        } else if (A032 == 58) {
                            String A0A7 = r92.A0A();
                            this.A00 |= 16;
                            this.A05 = A0A7;
                        } else if (A032 == 66) {
                            String A0A8 = r92.A0A();
                            this.A00 |= 32;
                            this.A04 = A0A8;
                        } else if (A032 == 74) {
                            C69633fM r13 = (this.A00 & 64) == 64 ? (C69633fM) this.A03.A0U() : null;
                            C59022uY r0 = (C59022uY) r92.A09(r102, C59022uY.A06.A0V());
                            this.A03 = r0;
                            if (r13 != null) {
                                r13.A04(r0);
                                this.A03 = (C59022uY) r13.A01();
                            }
                            this.A00 |= 64;
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
                ((AnonymousClass1XF) this.A02).A00 = false;
                ((AnonymousClass1XF) this.A01).A00 = false;
                return null;
            case 4:
                return new C455029b();
            case 5:
                return new C68733du();
            case 6:
                break;
            case 7:
                if (A0B == null) {
                    synchronized (C455029b.class) {
                        if (A0B == null) {
                            A0B = new C47872Kz(A0A);
                        }
                    }
                }
                return A0B;
            default:
                throw new UnsupportedOperationException();
        }
        return A0A;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = (this.A00 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A09) : 0;
        if ((this.A00 & 2) == 2) {
            A062 += 1 + CodedOutputStream.A06(this.A06);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i3 += CodedOutputStream.A06((String) this.A02.get(i4));
        }
        int size = A062 + i3 + this.A02.size();
        if ((this.A00 & 4) == 4) {
            size += 1 + CodedOutputStream.A06(this.A08);
        }
        if ((this.A00 & 8) == 8) {
            size += 1 + CodedOutputStream.A06(this.A07);
        }
        for (int i5 = 0; i5 < this.A01.size(); i5++) {
            size += CodedOutputStream.A05((AnonymousClass1Wo) this.A01.get(i5), 6);
        }
        if ((this.A00 & 16) == 16) {
            size += 1 + CodedOutputStream.A06(this.A05);
        }
        if ((this.A00 & 32) == 32) {
            size += 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A00 & 64) == 64) {
            C59022uY r0 = this.A03;
            if (r0 == null) {
                r0 = C59022uY.A06;
            }
            size += CodedOutputStream.A05(r0, 9);
        }
        int A002 = size + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A09);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A06);
        }
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            codedOutputStream.A0D(3, (String) this.A02.get(i2));
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(4, this.A08);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(5, this.A07);
        }
        for (int i3 = 0; i3 < this.A01.size(); i3++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A01.get(i3), 6);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(7, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0D(8, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            C59022uY r0 = this.A03;
            if (r0 == null) {
                r0 = C59022uY.A06;
            }
            codedOutputStream.A0G(r0, 9);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
