package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.27T  reason: invalid class name */
public final class AnonymousClass27T extends C28541Wm implements C28561Wp {
    public static final AnonymousClass27T A05;
    public static volatile C47872Kz A06;
    public int A00;
    public C28631Ww A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public C28631Ww A04;

    static {
        AnonymousClass27T r0 = new AnonymousClass27T();
        A05 = r0;
        r0.A0W();
    }

    public AnonymousClass27T() {
        C28631Ww r0 = C28631Ww.A01;
        this.A03 = r0;
        this.A01 = r0;
        this.A02 = r0;
        this.A04 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r6, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r6.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj;
                AnonymousClass27T r8 = (AnonymousClass27T) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                C28631Ww r2 = this.A03;
                boolean z3 = true;
                if ((r8.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A03 = r7.Ahn(r2, r8.A03, z2, z3);
                boolean z4 = false;
                if ((this.A00 & 2) == 2) {
                    z4 = true;
                }
                C28631Ww r3 = this.A01;
                boolean z5 = false;
                if ((r8.A00 & 2) == 2) {
                    z5 = true;
                }
                this.A01 = r7.Ahn(r3, r8.A01, z4, z5);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                C28631Ww r32 = this.A02;
                boolean z7 = false;
                if ((r8.A00 & 4) == 4) {
                    z7 = true;
                }
                this.A02 = r7.Ahn(r32, r8.A02, z6, z7);
                boolean z8 = false;
                if ((this.A00 & 8) == 8) {
                    z8 = true;
                }
                C28631Ww r33 = this.A04;
                boolean z9 = false;
                if ((r8.A00 & 8) == 8) {
                    z9 = true;
                }
                this.A04 = r7.Ahn(r33, r8.A04, z8, z9);
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
                            this.A03 = r72.A08();
                        } else if (A032 == 18) {
                            this.A00 |= 2;
                            this.A01 = r72.A08();
                        } else if (A032 == 26) {
                            this.A00 |= 4;
                            this.A02 = r72.A08();
                        } else if (A032 == 34) {
                            this.A00 |= 8;
                            this.A04 = r72.A08();
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
                return new AnonymousClass27T();
            case 5:
                return new C53952gZ();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (AnonymousClass27T.class) {
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
            i3 = 0 + CodedOutputStream.A04(this.A03, 1);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A01, 2);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A02, 3);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A04, 4);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A03, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A01, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A02, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A04, 4);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
