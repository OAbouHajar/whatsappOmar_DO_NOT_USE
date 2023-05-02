package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0hG  reason: invalid class name and case insensitive filesystem */
public class C10520hG implements Runnable {
    public final AnonymousClass0H9 A00 = AnonymousClass0H9.A00();
    public final /* synthetic */ AnonymousClass022 A01;

    public C10520hG(AnonymousClass022 r2) {
        this.A01 = r2;
    }

    public C29981bY A00() {
        return this.A00;
    }

    public void run() {
        Cursor A002;
        try {
            C08170dC r2 = (C08170dC) this.A01.A04.A0J();
            C07770cR A003 = AnonymousClass0M4.A00("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            A003.A5S(1, "com.obwhatsapp.backup.google.google-backup-worker");
            AnonymousClass0SM r10 = r2.A01;
            r10.A09();
            r10.A0A();
            try {
                A002 = AnonymousClass0M5.A00(r10, A003, true);
                AnonymousClass00N r5 = new AnonymousClass00N();
                AnonymousClass00N r4 = new AnonymousClass00N();
                while (A002.moveToNext()) {
                    String string = A002.getString(0);
                    if (((ArrayList) r5.get(string)) == null) {
                        r5.put(string, AnonymousClass000.A0u());
                    }
                    String string2 = A002.getString(0);
                    if (((ArrayList) r4.get(string2)) == null) {
                        r4.put(string2, AnonymousClass000.A0u());
                    }
                }
                A002.moveToPosition(-1);
                r2.A01(r5);
                r2.A00(r4);
                ArrayList A0v = AnonymousClass000.A0v(A002);
                while (A002.moveToNext()) {
                    String string3 = A002.isNull(0) ? null : A002.getString(0);
                    AnonymousClass0KV A08 = AnonymousClass0XK.A08(A002, 1);
                    C007203h A004 = C007203h.A00(A002.isNull(2) ? null : A002.getBlob(2));
                    int i2 = A002.getInt(3);
                    int i3 = A002.getInt(4);
                    ArrayList arrayList = (ArrayList) r5.get(A002.getString(0));
                    if (arrayList == null) {
                        arrayList = AnonymousClass000.A0u();
                    }
                    ArrayList arrayList2 = (ArrayList) r4.get(A002.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = AnonymousClass000.A0u();
                    }
                    A0v.add(new C05420Re(A004, A08, string3, arrayList, arrayList2, i2, i3));
                }
                r10.A0C();
                A002.close();
                A003.A01();
                r10.A0B();
                this.A00.A09((List) C007303i.A0K.apply(A0v));
            } catch (Throwable th) {
                r10.A0B();
                throw th;
            }
        } catch (Throwable th2) {
            this.A00.A0A(th2);
        }
    }
}
