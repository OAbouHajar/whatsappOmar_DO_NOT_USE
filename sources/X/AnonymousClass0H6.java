package X;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0H6  reason: invalid class name */
public class AnonymousClass0H6 extends C009004c {
    public final /* synthetic */ AnonymousClass022 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass0H6(AnonymousClass022 r1, String str, boolean z2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z2;
    }

    public void A00() {
        C07770cR A012;
        Cursor A002;
        AnonymousClass022 r6 = this.A00;
        WorkDatabase workDatabase = r6.A04;
        workDatabase.A0A();
        try {
            C13360lu A0J = workDatabase.A0J();
            A012 = AnonymousClass0M4.A01("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", this.A01);
            AnonymousClass0SM r0 = ((C08170dC) A0J).A01;
            r0.A09();
            A002 = AnonymousClass0M5.A00(r0, A012, false);
            ArrayList A0v = AnonymousClass000.A0v(A002);
            while (A002.moveToNext()) {
                A0v.add(A002.isNull(0) ? null : A002.getString(0));
            }
            A002.close();
            A012.A01();
            Iterator it = A0v.iterator();
            while (it.hasNext()) {
                A01(r6, AnonymousClass000.A0m(it));
            }
            workDatabase.A0C();
            workDatabase.A0B();
            if (this.A02) {
                C06310Vf.A01(r6.A02, workDatabase, r6.A07);
            }
        } catch (Throwable th) {
            workDatabase.A0B();
            throw th;
        }
    }
}
