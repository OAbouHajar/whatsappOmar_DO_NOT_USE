package X;

import android.content.DialogInterface;
import com.facebook.redex.RunnableRunnableShape0S0100100_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.obwhatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.4fY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91214fY implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExportMigrationActivity A01;

    public /* synthetic */ C91214fY(ExportMigrationActivity exportMigrationActivity, long j2) {
        this.A01 = exportMigrationActivity;
        this.A00 = j2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ExportMigrationActivity exportMigrationActivity = this.A01;
        long j2 = this.A00;
        exportMigrationActivity.A0I.A00(exportMigrationActivity.A0J, 7);
        exportMigrationActivity.A38(new RunnableRunnableShape0S0100100_I0(exportMigrationActivity, j2, 3), new RunnableRunnableShape11S0100000_I0_10((Object) exportMigrationActivity, 32), false);
    }
}
