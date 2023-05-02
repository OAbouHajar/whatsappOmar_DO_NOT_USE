package X;

import android.os.SystemClock;
import android.util.SparseIntArray;

/* renamed from: X.55k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1044455k implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C26301Ne A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C1044455k(C26301Ne r1, long j2, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A00 = j2;
        this.A02 = z2;
        this.A03 = z3;
    }

    public final void run() {
        C26301Ne r9 = this.A01;
        long j2 = this.A00;
        boolean z2 = this.A02;
        boolean z3 = this.A03;
        C15860rz r4 = r9.A08;
        r4.A0g(5);
        r4.A0K().putLong("ext_dir_migration_rescan_time", SystemClock.elapsedRealtime() - j2).commit();
        r9.A03((SparseIntArray) null, 1);
        r4.A1E(z2);
        if (z3) {
            r9.A09.A05("ExternalDirMigration");
        }
    }
}
