package X;

import android.net.Uri;
import com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4v6  reason: invalid class name and case insensitive filesystem */
public class C100104v6 implements AnonymousClass5RR {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ RestoreFromBackupViewModel A01;

    public C100104v6(Uri uri, RestoreFromBackupViewModel restoreFromBackupViewModel) {
        this.A01 = restoreFromBackupViewModel;
        this.A00 = uri;
    }

    public void AML(int i2, long j2) {
        int i3;
        Object r1;
        RestoreFromBackupViewModel restoreFromBackupViewModel = this.A01;
        restoreFromBackupViewModel.A04.A01.A03(this);
        if (i2 == 0) {
            i3 = 0;
            r1 = new C71243ij(this.A00, i3);
        } else if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                Log.e(C13680ns.A0c(i2, "restore-from-backup-view-model/incorrect-space-check-result/"));
                r1 = null;
            }
            r1 = new C71243ij(this.A00, i3);
        } else {
            r1 = new C71233ii(this.A00, j2);
        }
        restoreFromBackupViewModel.A07.A09(r1);
    }

    public void ANc() {
    }
}
