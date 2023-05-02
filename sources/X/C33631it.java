package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1it  reason: invalid class name and case insensitive filesystem */
public class C33631it extends C20380zx {
    public final AnonymousClass19D A00;
    public final AnonymousClass19E A01;
    public final C16440t3 A02;
    public final C16920ts A03;
    public final C16460t6 A04;
    public final C16900tq A05;
    public final AnonymousClass10G A06;

    public C33631it(AnonymousClass19D r1, AnonymousClass19E r2, C16440t3 r3, C16920ts r4, C16460t6 r5, C16900tq r6, AnonymousClass10G r7, C20360zv r8) {
        super(r8);
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A06 = r7;
    }

    public final List A0A(Cursor cursor, C16800tf r15, boolean z2) {
        C37901pv A022;
        ArrayList arrayList = new ArrayList();
        long A002 = this.A02.A00();
        while (cursor.moveToNext()) {
            C15830rv A052 = this.A03.A05(cursor.getLong(cursor.getColumnIndexOrThrow("chat_row_id")));
            if (!(A052 == null || (A022 = this.A00.A02(cursor, r15, A052)) == null)) {
                arrayList.add(new C37101oc((AnonymousClass1WK) null, A022.A02, new C28381Vw(A022.A01, A022.A03, A022.A04), (String) null, A002, z2, false));
            }
        }
        return arrayList;
    }

    public final void A0B(C37101oc r3, C16740tZ r4) {
        boolean z2 = r3.A02;
        boolean z3 = r4.A0x;
        if (z2) {
            if (!z3) {
                this.A06.A01(Collections.singleton(r4));
            }
        } else if (z3) {
            this.A06.A04(Collections.singleton(r4));
        }
    }
}
