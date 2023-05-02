package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Cg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62193Cg implements View.OnClickListener {
    public final /* synthetic */ RestoreFromBackupActivity A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C62193Cg(RestoreFromBackupActivity restoreFromBackupActivity, boolean z2, boolean z3) {
        this.A00 = restoreFromBackupActivity;
        this.A01 = z2;
        this.A02 = z3;
    }

    public final void onClick(View view) {
        String str;
        RestoreFromBackupActivity restoreFromBackupActivity = this.A00;
        boolean z2 = this.A01;
        boolean z3 = this.A02;
        restoreFromBackupActivity.A0c.A04(z2 ? "restore_successful" : "restore_unsuccessful", "next");
        if (!z3) {
            restoreFromBackupActivity.A09.A0j(0);
            restoreFromBackupActivity.A09.A0U();
            str = "restore>RestoreFromBackupActivity/msgstore-download-finish/no media to restore, setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.";
        } else if (restoreFromBackupActivity.A07.A04(true) != 1) {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/Wi-Fi not available, show dialog to restore on cellular.");
            C55862kX r1 = new C55862kX(12);
            r1.A02(restoreFromBackupActivity.getString(R.string.str0994));
            r1.A07(false);
            r1.A05(restoreFromBackupActivity.getString(R.string.str0e87));
            r1.A03(restoreFromBackupActivity.getString(R.string.str09a7));
            C13680ns.A1J(r1.A00(), restoreFromBackupActivity);
            return;
        } else {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/Wi-Fi available, starting media restore.");
            Log.i("restore>RestoreFromBackupActivity/start to restore media");
            C446524y.A00(restoreFromBackupActivity, C14750ph.A0d(restoreFromBackupActivity, "action_restore_media"));
            str = "restore>RestoreFromBackupActivity/msgstore-download-finish/setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.";
        }
        Log.i(str);
        restoreFromBackupActivity.setResult(3);
        restoreFromBackupActivity.finish();
    }
}
