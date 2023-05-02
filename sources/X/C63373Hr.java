package X;

import android.database.Cursor;

/* renamed from: X.3Hr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63373Hr implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass3FN A02;
    public final /* synthetic */ C38701rH A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C63373Hr(AnonymousClass3FN r1, C38701rH r2, int i2, int i3, boolean z2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i2;
        this.A04 = z2;
        this.A01 = i3;
    }

    public final void run() {
        C16740tZ r4;
        AnonymousClass3FN r3 = this.A02;
        C38701rH r5 = this.A03;
        int i2 = this.A00;
        boolean z2 = this.A04;
        int i3 = this.A01;
        AnonymousClass1BA r1 = (AnonymousClass1BA) r3.A0C.get();
        C15830rv r10 = r5.A11.A00;
        if (r10 != null) {
            C16460t6 r9 = r1.A00;
            Cursor cursor = r9.A0C(r10, 1, r5.A13 + 1, -1, false).A00;
            try {
                if (cursor.moveToNext()) {
                    r4 = r9.A0K.A01(cursor);
                    if (r4 instanceof C38701rH) {
                        if (r4.A11.A02 || C16730tY.A00((C38701rH) r4).A0P) {
                            cursor.close();
                            r3.A01.A0K(new AnonymousClass3Hx(r3, r4, r5, i2, i3, z2));
                            return;
                        }
                    }
                }
                cursor.close();
            } catch (Throwable unused) {
            }
        }
        r4 = null;
        r3.A01.A0K(new AnonymousClass3Hx(r3, r4, r5, i2, i3, z2));
        return;
        throw th;
    }
}
