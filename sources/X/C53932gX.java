package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2gX  reason: invalid class name and case insensitive filesystem */
public final class C53932gX extends C28541Wm implements C28561Wp {
    public static final C53932gX A03;
    public static volatile C47872Kz A04;
    public int A00;
    public C28631Ww A01;
    public C28631Ww A02;

    static {
        C53932gX r0 = new C53932gX();
        A03 = r0;
        r0.A0W();
    }

    public C53932gX() {
        C28631Ww r0 = C28631Ww.A01;
        this.A01 = r0;
        this.A02 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r6, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r6.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj;
                C53932gX r8 = (C53932gX) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                C28631Ww r2 = this.A01;
                boolean z3 = true;
                if ((r8.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r7.Ahn(r2, r8.A01, z2, z3);
                boolean z4 = false;
                if ((this.A00 & 2) == 2) {
                    z4 = true;
                }
                C28631Ww r3 = this.A02;
                boolean z5 = false;
                if ((r8.A00 & 2) == 2) {
                    z5 = true;
                }
                this.A02 = r7.Ahn(r3, r8.A02, z4, z5);
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
                            this.A01 = r72.A08();
                        } else if (A032 == 18) {
                            this.A00 |= 2;
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
                return new C53932gX();
            case 5:
                return new C68253d8();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C53932gX.class) {
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
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A04(this.A01, 1);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A02, 2);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A01, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A02, 2);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
