package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.facebook.redex.ViewOnClickCListenerShape3S0400000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;

/* renamed from: X.3KP  reason: invalid class name */
public class AnonymousClass3KP extends Dialog {
    public AnonymousClass3KP(Context context, SettingsGoogleDriveViewModel settingsGoogleDriveViewModel) {
        super(context);
        setCancelable(false);
        setContentView(R.layout.layout0087);
        View findViewById = findViewById(R.id.cancel_backup_export);
        findViewById.setOnClickListener(new ViewOnClickCListenerShape3S0400000_I1(findViewById, findViewById(R.id.backup_export_info), findViewById(R.id.backup_export_progress), settingsGoogleDriveViewModel, 1));
    }
}
