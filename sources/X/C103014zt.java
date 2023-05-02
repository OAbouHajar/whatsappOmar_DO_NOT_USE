package X;

import com.obwhatsapp.migration.export.ui.ExportMigrationViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4zt  reason: invalid class name and case insensitive filesystem */
public class C103014zt implements AnonymousClass5T7 {
    public final /* synthetic */ ExportMigrationViewModel A00;

    public C103014zt(ExportMigrationViewModel exportMigrationViewModel) {
        this.A00 = exportMigrationViewModel;
    }

    public void AO6() {
        this.A00.A05(0);
    }

    public void AO7() {
        this.A00.A05(5);
    }

    public void AOq() {
        this.A00.A05(2);
    }

    public void AQR(int i2) {
        ExportMigrationViewModel exportMigrationViewModel = this.A00;
        Log.i(C13680ns.A0c(1, "ExportMigrationViewModel/setErrorCode: "));
        Integer num = 1;
        AnonymousClass027 r1 = exportMigrationViewModel.A00;
        if (!num.equals(r1.A01())) {
            r1.A09(num);
        }
    }

    public void AQp() {
        this.A00.A05(1);
    }

    public void AVL(int i2) {
        ExportMigrationViewModel exportMigrationViewModel = this.A00;
        Integer valueOf = Integer.valueOf(i2);
        AnonymousClass027 r1 = exportMigrationViewModel.A01;
        if (!C34901l3.A00(valueOf, r1.A01())) {
            if (i2 > 100) {
                i2 = 100;
            } else if (i2 < 0) {
                i2 = 0;
            }
            C13680ns.A1P(r1, i2);
        }
    }
}
