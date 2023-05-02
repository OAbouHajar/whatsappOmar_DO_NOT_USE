package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: X.0ZI  reason: invalid class name */
public class AnonymousClass0ZI implements C009804r {
    public final Context A00;
    public final ActionMode.Callback A01;
    public final AnonymousClass00O A02 = new AnonymousClass00O();
    public final ArrayList A03 = AnonymousClass000.A0u();

    public AnonymousClass0ZI(Context context, ActionMode.Callback callback) {
        this.A00 = context;
        this.A01 = callback;
    }

    public ActionMode A00(AnonymousClass05J r6) {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0Bc r1 = (AnonymousClass0Bc) arrayList.get(i2);
            if (r1 != null && r1.A01 == r6) {
                return r1;
            }
        }
        AnonymousClass0Bc r0 = new AnonymousClass0Bc(this.A00, r6);
        arrayList.add(r0);
        return r0;
    }

    public boolean AM1(MenuItem menuItem, AnonymousClass05J r6) {
        return this.A01.onActionItemClicked(A00(r6), new C02550Cv(this.A00, (AnonymousClass09J) menuItem));
    }

    public boolean APA(Menu menu, AnonymousClass05J r8) {
        ActionMode.Callback callback = this.A01;
        ActionMode A002 = A00(r8);
        AnonymousClass00O r3 = this.A02;
        Menu menu2 = (Menu) r3.get(menu);
        if (menu2 == null) {
            menu2 = new AnonymousClass0Cu(this.A00, (C016707x) menu);
            r3.put(menu, menu2);
        }
        return callback.onCreateActionMode(A002, menu2);
    }

    public void APd(AnonymousClass05J r3) {
        this.A01.onDestroyActionMode(A00(r3));
    }

    public boolean AV8(Menu menu, AnonymousClass05J r8) {
        ActionMode.Callback callback = this.A01;
        ActionMode A002 = A00(r8);
        AnonymousClass00O r3 = this.A02;
        Menu menu2 = (Menu) r3.get(menu);
        if (menu2 == null) {
            menu2 = new AnonymousClass0Cu(this.A00, (C016707x) menu);
            r3.put(menu, menu2);
        }
        return callback.onPrepareActionMode(A002, menu2);
    }
}
