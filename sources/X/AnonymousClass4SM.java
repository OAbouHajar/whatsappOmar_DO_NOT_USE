package X;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: X.4SM  reason: invalid class name */
public abstract class AnonymousClass4SM {
    public C09110ev A00(Bitmap.Config config, int i2, int i3) {
        return A01(config, i2, i3);
    }

    public C09110ev A01(Bitmap.Config config, int i2, int i3) {
        AnonymousClass54L r4;
        AnonymousClass3TW r6 = (AnonymousClass3TW) this;
        if (r6.A00) {
            C82074Bc r0 = r6.A02;
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
            C95654mz r1 = C95654mz.A00;
            if (r1 == null) {
                r1 = new C95654mz();
                C95654mz.A00 = r1;
            }
            C12870l6 r02 = r0.A00;
            if (createBitmap != null) {
                return new C09110ev(r02, (C12880l7) r1, (Object) createBitmap);
            }
            return null;
        }
        short s2 = (short) i2;
        short s3 = (short) i3;
        AnonymousClass3TO r9 = null;
        try {
            C12200k0 r8 = r6.A01.A00;
            byte[] bArr = AnonymousClass4ZQ.A01;
            int length = bArr.length;
            byte[] bArr2 = AnonymousClass4ZQ.A02;
            AnonymousClass3TO r12 = new AnonymousClass3TO(((C95634mx) r8).A01, length + bArr2.length + 4);
            r9 = r12;
            r12.write(bArr);
            r12.write((byte) (s3 >> 8));
            r12.write((byte) (s3 & 255));
            r12.write((byte) (s2 >> 8));
            r12.write((byte) (s2 & 255));
            r12.write(bArr2);
            if (C09110ev.A01(r12.A01)) {
                C09110ev A00 = C09110ev.A00(C09110ev.A05, new C95624mw(r12.A01, r12.A00));
                r9.close();
                try {
                    r4 = new AnonymousClass54L(A00);
                    r4.A00 = AnonymousClass0NF.A01;
                    C09110ev A01 = r6.A03.A01(config, r4, ((C13600me) A00.A04()).size());
                    if (!((Bitmap) A01.A04()).isMutable()) {
                        A01.close();
                        r6.A00 = true;
                        C13370lv r13 = AnonymousClass0X1.A00;
                        if (r13.AJ7(6)) {
                            r13.AiK("HoneycombBitmapFactory", "Immutable bitmap returned by decoder");
                        }
                        C82074Bc r03 = r6.A02;
                        Bitmap createBitmap2 = Bitmap.createBitmap(i2, i3, config);
                        C95654mz r14 = C95654mz.A00;
                        if (r14 == null) {
                            r14 = new C95654mz();
                            C95654mz.A00 = r14;
                        }
                        C12870l6 r04 = r03.A00;
                        A01 = null;
                        if (createBitmap2 != null) {
                            A01 = new C09110ev(r04, (C12880l7) r14, (Object) createBitmap2);
                        }
                    } else {
                        ((Bitmap) A01.A04()).setHasAlpha(true);
                        ((Bitmap) A01.A04()).eraseColor(0);
                    }
                    r4.close();
                    A00.close();
                    return A01;
                } catch (Throwable th) {
                    A00.close();
                    throw th;
                }
            } else {
                throw new AnonymousClass5AX();
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th2) {
            if (r9 != null) {
                r9.close();
            }
            throw th2;
        }
    }
}
