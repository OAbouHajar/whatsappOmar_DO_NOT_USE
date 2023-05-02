package X;

import com.obwhatsapp.R;
import com.obwhatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.55s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1045255s implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExportMigrationActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C1045255s(ExportMigrationActivity exportMigrationActivity, String str, String str2, long j2) {
        this.A01 = exportMigrationActivity;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = j2;
    }

    public final void run() {
        ExportMigrationActivity exportMigrationActivity = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        long j2 = this.A00;
        C32241fu A002 = C32241fu.A00(exportMigrationActivity);
        A002.setTitle(str);
        A002.A06(str2);
        A002.A07(false);
        C13680ns.A1H(A002, exportMigrationActivity, 68, R.string.str1d18);
        A002.setNegativeButton(R.string.str0394, new C91214fY(exportMigrationActivity, j2));
        A002.A00();
    }
}
