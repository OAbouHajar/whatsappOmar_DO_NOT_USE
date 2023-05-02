package X;

import com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4v4  reason: invalid class name and case insensitive filesystem */
public class C100084v4 implements C29761b9 {
    public final /* synthetic */ EncBackupViewModel A00;

    public C100084v4(EncBackupViewModel encBackupViewModel) {
        this.A00 = encBackupViewModel;
    }

    public void AQc(String str, int i2, int i3, int i4, int i5) {
        EncBackupViewModel encBackupViewModel = this.A00;
        if (i2 == 0) {
            Log.i("EncBackupViewModel/successfully saved encryption key");
            C13680ns.A1P(encBackupViewModel.A07, -1);
            return;
        }
        Log.e("EncBackupViewModel/failed to save encryption key");
    }

    public void onSuccess() {
        EncBackupViewModel encBackupViewModel = this.A00;
        Log.i("EncBackupViewModel/successfully saved encryption key");
        C13680ns.A1P(encBackupViewModel.A07, -1);
    }
}
