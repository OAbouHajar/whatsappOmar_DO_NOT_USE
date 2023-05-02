package X;

import android.database.Cursor;

/* renamed from: X.0vO  reason: invalid class name and case insensitive filesystem */
public class C17630vO {
    public final C16440t3 A00;
    public final C16820th A01;
    public final C16920ts A02;
    public final C17620vN A03;
    public final C17610vM A04;
    public final C16900tq A05;

    public C17630vO(C16440t3 r1, C16820th r2, C16920ts r3, C17620vN r4, C17610vM r5, C16900tq r6) {
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public C16830ti A00(String str) {
        Throwable th;
        AnonymousClass00B.A00();
        C17610vM r0 = this.A04;
        AnonymousClass00B.A00();
        C16800tf A012 = r0.A00.get();
        try {
            Cursor A08 = A012.A02.A08(C42571y2.A01, new String[]{str});
            A012.close();
            try {
                C16830ti r02 = A08.moveToNext() ? (C16830ti) this.A01.A01(A08) : null;
                A08.close();
                return r02;
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            A012.close();
            throw th;
        }
    }
}
