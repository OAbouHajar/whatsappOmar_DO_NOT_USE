package X;

import android.content.SharedPreferences;

/* renamed from: X.1D9  reason: invalid class name */
public class AnonymousClass1D9 implements C23691Cz {
    public final C15860rz A00;

    public AnonymousClass1D9(C15860rz r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void AMa() {
    }

    public void AMb() {
        C15860rz r3 = this.A00;
        if (((SharedPreferences) r3.A01.get()).getInt("external_dir_migration_stage", 0) == 5) {
            r3.A1E(false);
        }
    }
}
