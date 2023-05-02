package X;

import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.1bP  reason: invalid class name and case insensitive filesystem */
public final class C29901bP extends C28541Wm implements C28561Wp {
    public static final C29901bP A0D;
    public static volatile C47872Kz A0E;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C28631Ww A06;
    public AnonymousClass1XE A07;
    public AnonymousClass1XE A08;
    public AnonymousClass1XE A09;
    public AnonymousClass1XE A0A;
    public AnonymousClass1XE A0B;
    public C58962uR A0C;

    static {
        C29901bP r0 = new C29901bP();
        A0D = r0;
        r0.A0W();
    }

    public C29901bP() {
        AnonymousClass2NE r1 = AnonymousClass2NE.A01;
        this.A07 = r1;
        this.A0B = r1;
        this.A09 = r1;
        this.A06 = C28631Ww.A01;
        this.A0A = r1;
        this.A08 = r1;
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                byte b2 = this.A00;
                if (b2 != 1) {
                    if (b2 != 0) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if ((this.A01 & 1) == 1) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= this.A07.size()) {
                                    int i3 = 0;
                                    while (i3 < this.A0B.size()) {
                                        if (((C28541Wm) this.A0B.get(i3)).A0Z()) {
                                            i3++;
                                        }
                                    }
                                    if (booleanValue) {
                                        this.A00 = 1;
                                        break;
                                    }
                                } else if (((C28541Wm) this.A07.get(i2)).A0Z()) {
                                    i2++;
                                }
                            }
                        }
                        if (booleanValue) {
                            this.A00 = 0;
                        }
                    }
                    return null;
                }
                break;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C29901bP r10 = (C29901bP) obj2;
                boolean z2 = true;
                if ((this.A01 & 1) != 1) {
                    z2 = false;
                }
                int i4 = this.A04;
                boolean z3 = true;
                if ((r10.A01 & 1) != 1) {
                    z3 = false;
                }
                this.A04 = r9.Ahq(i4, r10.A04, z2, z3);
                this.A07 = r9.Ahs(this.A07, r10.A07);
                this.A0B = r9.Ahs(this.A0B, r10.A0B);
                int i5 = this.A01;
                boolean z4 = false;
                if ((i5 & 2) == 2) {
                    z4 = true;
                }
                int i6 = this.A02;
                int i7 = r10.A01;
                boolean z5 = false;
                if ((i7 & 2) == 2) {
                    z5 = true;
                }
                this.A02 = r9.Ahq(i6, r10.A02, z4, z5);
                boolean z6 = false;
                if ((i5 & 4) == 4) {
                    z6 = true;
                }
                int i8 = this.A03;
                boolean z7 = false;
                if ((i7 & 4) == 4) {
                    z7 = true;
                }
                this.A03 = r9.Ahq(i8, r10.A03, z6, z7);
                this.A09 = r9.Ahs(this.A09, r10.A09);
                this.A0C = (C58962uR) r9.Ahu(this.A0C, r10.A0C);
                boolean z8 = false;
                if ((this.A01 & 16) == 16) {
                    z8 = true;
                }
                C28631Ww r3 = this.A06;
                boolean z9 = false;
                if ((r10.A01 & 16) == 16) {
                    z9 = true;
                }
                this.A06 = r9.Ahn(r3, r10.A06, z8, z9);
                boolean z10 = false;
                if ((this.A01 & 32) == 32) {
                    z10 = true;
                }
                int i9 = this.A05;
                boolean z11 = false;
                if ((r10.A01 & 32) == 32) {
                    z11 = true;
                }
                this.A05 = r9.Ahq(i9, r10.A05, z10, z11);
                this.A0A = r9.Ahs(this.A0A, r10.A0A);
                this.A08 = r9.Ahs(this.A08, r10.A08);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A01 |= r10.A01;
                }
                return this;
            case 2:
                C47852Kx r92 = (C47852Kx) obj;
                C47862Ky r102 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A032 = r92.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 8:
                                int A022 = r92.A02();
                                if (C29921bR.A00(A022) != null) {
                                    this.A01 |= 1;
                                    this.A04 = A022;
                                    break;
                                } else {
                                    super.A0X(1, A022);
                                    continue;
                                }
                            case 18:
                                AnonymousClass1XE r1 = this.A07;
                                if (!((AnonymousClass1XF) r1).A00) {
                                    r1 = C28541Wm.A0G(r1);
                                    this.A07 = r1;
                                }
                                r1.add((C29941bT) r92.A09(r102, C29941bT.A0j.A0V()));
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                AnonymousClass1XE r12 = this.A0B;
                                if (!((AnonymousClass1XF) r12).A00) {
                                    r12 = C28541Wm.A0G(r12);
                                    this.A0B = r12;
                                }
                                r12.add((C30441cM) r92.A09(r102, C30441cM.A0l.A0V()));
                                continue;
                            case 40:
                                this.A01 |= 2;
                                this.A02 = r92.A02();
                                continue;
                            case 48:
                                this.A01 |= 4;
                                this.A03 = r92.A02();
                                continue;
                            case 58:
                                AnonymousClass1XE r13 = this.A09;
                                if (!((AnonymousClass1XF) r13).A00) {
                                    r13 = C28541Wm.A0G(r13);
                                    this.A09 = r13;
                                }
                                r13.add((C446024s) r92.A09(r102, C446024s.A03.A0V()));
                                continue;
                            case 66:
                                C69313eq r14 = (this.A01 & 8) == 8 ? (C69313eq) this.A0C.A0U() : null;
                                C58962uR r0 = (C58962uR) r92.A09(r102, C58962uR.A0C.A0V());
                                this.A0C = r0;
                                if (r14 != null) {
                                    r14.A04(r0);
                                    this.A0C = (C58962uR) r14.A01();
                                }
                                this.A01 |= 8;
                                continue;
                            case 74:
                                this.A01 |= 16;
                                this.A06 = r92.A08();
                                continue;
                            case 80:
                                this.A01 |= 32;
                                this.A05 = r92.A02();
                                continue;
                            case 90:
                                AnonymousClass1XE r15 = this.A0A;
                                if (!((AnonymousClass1XF) r15).A00) {
                                    r15 = C28541Wm.A0G(r15);
                                    this.A0A = r15;
                                }
                                r15.add((C445924r) r92.A09(r102, C445924r.A0C.A0V()));
                                continue;
                            case 98:
                                AnonymousClass1XE r16 = this.A08;
                                if (!((AnonymousClass1XF) r16).A00) {
                                    r16 = C28541Wm.A0G(r16);
                                    this.A08 = r16;
                                }
                                r16.add((C30461cO) r92.A09(r102, C30461cO.A03.A0V()));
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
                        C29791bD r02 = new C29791bD(e3.getMessage());
                        r02.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r02);
                        throw runtimeException;
                    }
                }
            case 3:
                ((AnonymousClass1XF) this.A07).A00 = false;
                ((AnonymousClass1XF) this.A0B).A00 = false;
                ((AnonymousClass1XF) this.A09).A00 = false;
                ((AnonymousClass1XF) this.A0A).A00 = false;
                ((AnonymousClass1XF) this.A08).A00 = false;
                return null;
            case 4:
                return new C29901bP();
            case 5:
                return new C29911bQ();
            case 6:
                break;
            case 7:
                if (A0E == null) {
                    synchronized (C29901bP.class) {
                        if (A0E == null) {
                            A0E = new C47872Kz(A0D);
                        }
                    }
                }
                return A0E;
            default:
                throw new UnsupportedOperationException();
        }
        return A0D;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A002 = (this.A01 & 1) == 1 ? CodedOutputStream.A00(1, this.A04) : 0;
        for (int i3 = 0; i3 < this.A07.size(); i3++) {
            A002 += CodedOutputStream.A05((AnonymousClass1Wo) this.A07.get(i3), 2);
        }
        for (int i4 = 0; i4 < this.A0B.size(); i4++) {
            A002 += CodedOutputStream.A05((AnonymousClass1Wo) this.A0B.get(i4), 3);
        }
        int i5 = this.A01;
        if ((i5 & 2) == 2) {
            A002 += CodedOutputStream.A02(5, this.A02);
        }
        if ((i5 & 4) == 4) {
            A002 += CodedOutputStream.A02(6, this.A03);
        }
        for (int i6 = 0; i6 < this.A09.size(); i6++) {
            A002 += CodedOutputStream.A05((AnonymousClass1Wo) this.A09.get(i6), 7);
        }
        if ((this.A01 & 8) == 8) {
            C58962uR r0 = this.A0C;
            if (r0 == null) {
                r0 = C58962uR.A0C;
            }
            A002 += CodedOutputStream.A05(r0, 8);
        }
        int i7 = this.A01;
        if ((i7 & 16) == 16) {
            A002 += CodedOutputStream.A04(this.A06, 9);
        }
        if ((i7 & 32) == 32) {
            A002 += CodedOutputStream.A02(10, this.A05);
        }
        for (int i8 = 0; i8 < this.A0A.size(); i8++) {
            A002 += CodedOutputStream.A05((AnonymousClass1Wo) this.A0A.get(i8), 11);
        }
        for (int i9 = 0; i9 < this.A08.size(); i9++) {
            A002 += CodedOutputStream.A05((AnonymousClass1Wo) this.A08.get(i9), 12);
        }
        int A003 = A002 + this.unknownFields.A00();
        this.A00 = A003;
        return A003;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A09(1, this.A04);
        }
        for (int i2 = 0; i2 < this.A07.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A07.get(i2), 2);
        }
        for (int i3 = 0; i3 < this.A0B.size(); i3++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A0B.get(i3), 3);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0A(5, this.A02);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0A(6, this.A03);
        }
        for (int i4 = 0; i4 < this.A09.size(); i4++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A09.get(i4), 7);
        }
        if ((this.A01 & 8) == 8) {
            C58962uR r0 = this.A0C;
            if (r0 == null) {
                r0 = C58962uR.A0C;
            }
            codedOutputStream.A0G(r0, 8);
        }
        if ((this.A01 & 16) == 16) {
            codedOutputStream.A0F(this.A06, 9);
        }
        if ((this.A01 & 32) == 32) {
            codedOutputStream.A0A(10, this.A05);
        }
        for (int i5 = 0; i5 < this.A0A.size(); i5++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A0A.get(i5), 11);
        }
        for (int i6 = 0; i6 < this.A08.size(); i6++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A08.get(i6), 12);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
