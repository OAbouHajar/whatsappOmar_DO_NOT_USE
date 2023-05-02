package X;

import android.content.Context;
import android.os.Process;

/* renamed from: X.0LQ  reason: invalid class name */
public final class AnonymousClass0LQ {
    public static int A00(Context context, String str, String str2, int i2, int i3) {
        if (context.checkPermission(str, i2, i3) != -1) {
            String A02 = AnonymousClass0VM.A02(str);
            if (A02 == null) {
                return 0;
            }
            if (str2 == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(i3);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    str2 = packagesForUid[0];
                }
            }
            return ((Process.myUid() != i3 || !AnonymousClass08I.A01(context.getPackageName(), str2)) ? AnonymousClass0VM.A00(context, A02, str2) : AnonymousClass0VM.A01(context, A02, str2, i3)) != 0 ? -2 : 0;
        }
        return -1;
    }
}
