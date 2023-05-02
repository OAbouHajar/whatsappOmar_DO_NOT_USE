package X;

import android.database.Cursor;
import com.facebook.redex.IDxIAdapterShape37S0100000_I1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0d7  reason: invalid class name and case insensitive filesystem */
public final class C08120d7 implements C12600kf {
    public final C02860Fx A00;
    public final AnonymousClass0SM A01;

    public C08120d7(AnonymousClass0SM r3) {
        this.A01 = r3;
        this.A00 = new IDxIAdapterShape37S0100000_I1(r3, this, 0);
    }

    public List ABk(String str) {
        C07770cR A012 = AnonymousClass0M4.A01("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", str);
        AnonymousClass0SM r0 = this.A01;
        r0.A09();
        Cursor A002 = AnonymousClass0M5.A00(r0, A012, false);
        try {
            ArrayList A0v = AnonymousClass000.A0v(A002);
            while (A002.moveToNext()) {
                A0v.add(A002.isNull(0) ? null : A002.getString(0));
            }
            return A0v;
        } finally {
            A002.close();
            A012.A01();
        }
    }
}
