package X;

import android.database.Cursor;

/* renamed from: X.4zp  reason: invalid class name and case insensitive filesystem */
public class C102974zp implements C108895Px {
    public final C16920ts A00;
    public final C16900tq A01;
    public final C15830rv A02;

    public C102974zp(C16920ts r1, C16900tq r2, C15830rv r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public Cursor ABX(int i2, long j2, long j3, long j4) {
        String[] strArr = {String.valueOf(j2), String.valueOf(j3), String.valueOf(this.A00.A02(this.A02)), String.valueOf(j4), String.valueOf(5000)};
        C16800tf A012 = this.A01.get();
        try {
            Cursor A08 = A012.A02.A08(AnonymousClass1WW.A0I, strArr);
            A012.close();
            return A08;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
