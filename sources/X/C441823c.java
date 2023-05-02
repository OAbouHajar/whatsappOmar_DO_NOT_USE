package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.23c  reason: invalid class name and case insensitive filesystem */
public final class C441823c extends C28541Wm implements C28561Wp {
    public static final C441823c A01;
    public static volatile C47872Kz A02;
    public AnonymousClass1XE A00 = AnonymousClass2NE.A01;

    static {
        C441823c r0 = new C441823c();
        A01 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r4, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r4.ordinal()) {
            case 0:
                return A01;
            case 1:
                this.A00 = ((AnonymousClass2L6) obj).Ahs(this.A00, ((C441823c) obj2).A00);
                return this;
            case 2:
                C47852Kx r5 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A03 = r5.A03();
                        if (A03 == 0) {
                            break;
                        } else if (A03 == 10) {
                            AnonymousClass1XE r1 = this.A00;
                            if (!((AnonymousClass1XF) r1).A00) {
                                r1 = C28541Wm.A0G(r1);
                                this.A00 = r1;
                            }
                            r1.add(r5.A08());
                        } else if (!A0a(r5, A03)) {
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
                ((AnonymousClass1XF) this.A00).A00 = false;
                return null;
            case 4:
                return new C441823c();
            case 5:
                return new C47922Le();
            case 6:
                break;
            case 7:
                if (A02 == null) {
                    synchronized (C441823c.class) {
                        if (A02 == null) {
                            A02 = new C47872Kz(A01);
                        }
                    }
                }
                return A02;
            default:
                throw new UnsupportedOperationException();
        }
        return A01;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A00.size(); i4++) {
            int A03 = ((C28631Ww) this.A00.get(i4)).A03();
            int i5 = 1;
            if ((A03 & -128) != 0) {
                i5 = 2;
                if ((A03 & -16384) != 0) {
                    i5 = 3;
                    if ((-2097152 & A03) != 0) {
                        i5 = 5;
                        if ((-268435456 & A03) == 0) {
                            i5 = 4;
                        }
                    }
                }
            }
            i3 += i5 + A03;
        }
        int size = 0 + i3 + this.A00.size() + this.unknownFields.A00();
        this.A00 = size;
        return size;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            codedOutputStream.A0F((C28631Ww) this.A00.get(i2), 1);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
