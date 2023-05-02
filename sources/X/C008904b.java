package X;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.04b  reason: invalid class name and case insensitive filesystem */
public class C008904b extends C009004c {
    public final /* synthetic */ AnonymousClass022 A00;

    public C008904b(AnonymousClass022 r1) {
        this.A00 = r1;
    }

    public void A00() {
        C07770cR A002;
        Cursor A003;
        AnonymousClass022 r7 = this.A00;
        WorkDatabase workDatabase = r7.A04;
        workDatabase.A0A();
        try {
            A002 = AnonymousClass0M4.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
            AnonymousClass0SM r0 = ((C08170dC) workDatabase.A0J()).A01;
            r0.A09();
            A003 = AnonymousClass0M5.A00(r0, A002, false);
            ArrayList arrayList = new ArrayList(A003.getCount());
            while (A003.moveToNext()) {
                arrayList.add(A003.isNull(0) ? null : A003.getString(0));
            }
            A003.close();
            A002.A01();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A01(r7, (String) it.next());
            }
            new AnonymousClass0NW(workDatabase).A00.A0F().AIP(new AnonymousClass0R4("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
            workDatabase.A0C();
            workDatabase.A0B();
        } catch (Throwable th) {
            workDatabase.A0B();
            throw th;
        }
    }
}
