package X;

import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: X.0yM  reason: invalid class name and case insensitive filesystem */
public class C19390yM implements C19400yN {
    public final C16290sm A00;
    public final C15960sC A01;
    public final AnonymousClass01D A02;
    public final AnonymousClass01D A03;
    public final AnonymousClass01D A04;

    public C19390yM(C16290sm r1, C15960sC r2, AnonymousClass01D r3, AnonymousClass01D r4, AnonymousClass01D r5) {
        this.A01 = r2;
        this.A04 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r5;
    }

    public String AGT() {
        return "AppUpdatedEventManager";
    }

    public void AMc() {
        SharedPreferences sharedPreferences = this.A00.A00;
        if (sharedPreferences.getBoolean("async_tasks_pending_for_version_change", false)) {
            boolean A012 = this.A01.A01();
            for (C23691Cz r0 : (Set) this.A02.get()) {
                r0.AMb();
                if (A012) {
                    r0.AMa();
                }
            }
            sharedPreferences.edit().putBoolean("async_tasks_pending_for_version_change", false).apply();
            ((C15860rz) this.A04.get()).A0x("client_version_upgrade_timestamp");
        }
    }
}
