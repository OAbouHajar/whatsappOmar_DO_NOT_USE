package X;

import android.app.Activity;
import android.content.pm.PackageManager;

/* renamed from: X.00g  reason: invalid class name and case insensitive filesystem */
public class C000500g implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ String[] A02;

    public C000500g(Activity activity, String[] strArr, int i2) {
        this.A02 = strArr;
        this.A01 = activity;
        this.A00 = i2;
    }

    public void run() {
        String[] strArr = this.A02;
        int length = strArr.length;
        int[] iArr = new int[length];
        Activity activity = this.A01;
        PackageManager packageManager = activity.getPackageManager();
        String packageName = activity.getPackageName();
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
        }
        ((C000400f) activity).onRequestPermissionsResult(this.A00, strArr, iArr);
    }
}
