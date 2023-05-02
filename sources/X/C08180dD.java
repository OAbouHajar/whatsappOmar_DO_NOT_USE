package X;

import android.database.Cursor;
import com.facebook.redex.IDxIAdapterShape37S0100000_I1;
import com.facebook.redex.IDxLStatementShape38S0100000_I1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0dD  reason: invalid class name and case insensitive filesystem */
public final class C08180dD implements C12610kg {
    public final C02860Fx A00;
    public final AnonymousClass0SM A01;
    public final C05450Rm A02;

    public C08180dD(AnonymousClass0SM r3) {
        this.A01 = r3;
        this.A00 = new IDxIAdapterShape37S0100000_I1(r3, this, 6);
        this.A02 = new IDxLStatementShape38S0100000_I1(r3, this, 16);
    }

    public List AGU(String str) {
        C07770cR A002 = AnonymousClass0M4.A00("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        A002.A5S(1, str);
        AnonymousClass0SM r0 = this.A01;
        r0.A09();
        Cursor A003 = AnonymousClass0M5.A00(r0, A002, false);
        try {
            ArrayList A0v = AnonymousClass000.A0v(A003);
            while (A003.moveToNext()) {
                A0v.add(A003.isNull(0) ? null : A003.getString(0));
            }
            return A0v;
        } finally {
            A003.close();
            A002.A01();
        }
    }
}
