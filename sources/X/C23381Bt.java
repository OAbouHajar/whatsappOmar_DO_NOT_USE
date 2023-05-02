package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.obwhatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.1Bt  reason: invalid class name and case insensitive filesystem */
public class C23381Bt {
    public final ComponentName A00;
    public final PackageManager A01;

    public C23381Bt(Context context) {
        this.A01 = context.getPackageManager();
        this.A00 = new ComponentName(context, ExportMigrationActivity.class);
    }
}
