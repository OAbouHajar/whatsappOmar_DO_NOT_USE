package X;

import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;

/* renamed from: X.4R0  reason: invalid class name */
public class AnonymousClass4R0 {
    public final PackageManager A00;
    public final C15950sB A01;

    public AnonymousClass4R0(C16980tz r2, C15950sB r3) {
        this.A00 = r2.A00.getPackageManager();
        this.A01 = r3;
    }

    public boolean A00(String str) {
        boolean z2;
        try {
            z2 = this.A01.A01(str).A03;
        } catch (PackageManager.NameNotFoundException unused) {
            z2 = false;
        }
        if (z2) {
            PackageManager packageManager = this.A00;
            if (packageManager.checkPermission("com.apple.movetoios.ACCESS", str) == 0) {
                try {
                    PermissionInfo permissionInfo = packageManager.getPermissionInfo("com.apple.movetoios.ACCESS", 0);
                    if ((permissionInfo.protectionLevel & 15) == 2) {
                        return C46772Ge.A00(packageManager, permissionInfo.packageName).equals(C46772Ge.A00(packageManager, str));
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    return false;
                }
            }
        }
        return false;
    }
}
