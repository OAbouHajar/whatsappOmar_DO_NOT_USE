package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.1pP  reason: invalid class name and case insensitive filesystem */
public final class C37591pP extends C28541Wm implements C28561Wp {
    public static final C37591pP A01;
    public static volatile C47872Kz A02;
    public AnonymousClass1XE A00 = AnonymousClass2NE.A01;

    static {
        C37591pP r0 = new C37591pP();
        A01 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r4, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r4.ordinal()) {
            case 0:
                return A01;
            case 1:
                this.A00 = ((AnonymousClass2L6) obj).Ahs(this.A00, ((C37591pP) obj2).A00);
                return this;
            case 2:
                C47852Kx r5 = (C47852Kx) obj;
                C47862Ky r6 = (C47862Ky) obj2;
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
                            r1.add((C37581pO) r5.A09(r6, C37581pO.A03.A0V()));
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
                return new C37591pP();
            case 5:
                return new C68583df();
            case 6:
                break;
            case 7:
                if (A02 == null) {
                    synchronized (C37591pP.class) {
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
            i3 += CodedOutputStream.A05((AnonymousClass1Wo) this.A00.get(i4), 1);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A00.get(i2), 1);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
