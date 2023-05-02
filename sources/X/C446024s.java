package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.24s  reason: invalid class name and case insensitive filesystem */
public final class C446024s extends C28541Wm implements C28561Wp {
    public static final C446024s A03;
    public static volatile C47872Kz A04;
    public int A00;
    public String A01 = "";
    public String A02 = "";

    static {
        C446024s r0 = new C446024s();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r8, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r8.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r9 = (AnonymousClass2L6) obj;
                C446024s r10 = (C446024s) obj2;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A01;
                int i3 = r10.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r9.Ahz(str, r10.A01, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A02;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A02 = r9.Ahz(str2, r10.A02, z4, z5);
                if (r9 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
                }
                return this;
            case 2:
                C47852Kx r92 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r92.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A = r92.A0A();
                            this.A00 = 1 | this.A00;
                            this.A01 = A0A;
                        } else if (A032 == 18) {
                            String A0A2 = r92.A0A();
                            this.A00 |= 2;
                            this.A02 = A0A2;
                        } else if (!A0a(r92, A032)) {
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
                return new C446024s();
            case 5:
                return new C446124t();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C446024s.class) {
                        if (A04 == null) {
                            A04 = new C47872Kz(A03);
                        }
                    }
                }
                return A04;
            default:
                throw new UnsupportedOperationException();
        }
        return A03;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A01);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A02);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A02);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
