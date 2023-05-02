package X;

import java.lang.reflect.Constructor;
import javax.crypto.BadPaddingException;

/* renamed from: X.5A8  reason: invalid class name */
public class AnonymousClass5A8 implements AnonymousClass5TM {
    public static final Constructor A01;
    public AnonymousClass5TG A00;

    static {
        Class A002 = C32971hd.A00(AnonymousClass5Kd.class, "javax.crypto.AEADBadTagException");
        Constructor constructor = null;
        if (A002 != null) {
            try {
                constructor = AnonymousClass3K4.A0c(A002, String.class, new Class[1], 0);
            } catch (Exception unused) {
                constructor = null;
            }
        }
        A01 = constructor;
    }

    public AnonymousClass5A8(AnonymousClass5TG r1) {
        this.A00 = r1;
    }

    public int A8A(byte[] bArr, int i2) {
        try {
            return this.A00.A8A(bArr, i2);
        } catch (AnonymousClass5JC e2) {
            Constructor constructor = A01;
            if (constructor != null) {
                BadPaddingException badPaddingException = null;
                try {
                    badPaddingException = (BadPaddingException) AnonymousClass3K4.A0W(e2.getMessage(), constructor, new Object[1], 0);
                } catch (Exception unused) {
                }
                if (badPaddingException != null) {
                    throw badPaddingException;
                }
            }
            throw new BadPaddingException(e2.getMessage());
        }
    }

    public String A9q() {
        AnonymousClass5TG r1 = this.A00;
        return r1 instanceof AnonymousClass5VP ? ((AnonymousClass5VP) r1).AGk().A9q() : r1.A9q();
    }

    public int AE9(int i2) {
        return this.A00.AE9(i2);
    }

    public AnonymousClass5T1 AGk() {
        AnonymousClass5TG r1 = this.A00;
        if (r1 instanceof AnonymousClass5VP) {
            return ((AnonymousClass5VP) r1).AGk();
        }
        return null;
    }

    public int AGm(int i2) {
        return this.A00.AGm(i2);
    }

    public void AI1(C46932Gv r2, boolean z2) {
        this.A00.AI1(r2, z2);
    }

    public int Aar(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        return this.A00.Aar(bArr, i2, i3, bArr2, i4);
    }

    public void AhM(byte[] bArr, int i2, int i3) {
        this.A00.Aap(bArr, i2, i3);
    }

    public boolean AiB() {
        return false;
    }
}
