package X;

import android.database.Cursor;
import java.util.List;

/* renamed from: X.10m  reason: invalid class name and case insensitive filesystem */
public class C205310m extends AnonymousClass10W {
    public final C15800rs A00;
    public final C16440t3 A01;
    public final C18910xS A02;
    public final C15810rt A03;
    public final C16460t6 A04;
    public final C16100sR A05;
    public final C205110k A06;
    public final C16220sf A07;

    public C205310m(C15800rs r1, C16440t3 r2, C18910xS r3, C15810rt r4, C16460t6 r5, C16100sR r6, C205110k r7, C16220sf r8) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
    }

    public final void A00(C15830rv r18, List list, long j2) {
        C15830rv r10 = r18;
        long A042 = this.A03.A04(r10);
        C16460t6 r9 = this.A04;
        C16440t3 r3 = this.A01;
        C34651kc A0C = r9.A0C(r10, 100, A042, r3.A00(), true);
        try {
            Cursor cursor = A0C.A00;
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        C16740tZ A0G = r9.A0G(cursor, r10);
                        if (A0G != null && A0G.A13 != A042 && !A0G.A11.A02 && A0G.A0G >= r3.A00() - j2) {
                            list.add(A0G);
                        }
                    } while (cursor.moveToNext());
                }
                cursor.close();
            }
        } catch (Throwable th) {
            Cursor cursor2 = A0C.A00;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}
