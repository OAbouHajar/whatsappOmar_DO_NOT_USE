package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.util.Pair;

/* renamed from: X.0sB  reason: invalid class name and case insensitive filesystem */
public class C15950sB {
    public final C16980tz A00;
    public final AnonymousClass1GV A01;

    public C15950sB(C16980tz r1, AnonymousClass1GV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C15880s3 A00() {
        int length;
        int callingUid = Binder.getCallingUid();
        if (callingUid != Process.myUid()) {
            Context context = this.A00.A00;
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid == null || (length = packagesForUid.length) == 0) {
                StringBuilder sb = new StringBuilder("No packages associated with uid: ");
                sb.append(callingUid);
                throw new SecurityException(sb.toString());
            } else if (length == 1) {
                String str = packagesForUid[0];
                String A012 = C46772Ge.A01(C46772Ge.A00(context.getPackageManager(), str));
                boolean z2 = false;
                if (this.A01.A01.contains(Pair.create(str, A012))) {
                    z2 = true;
                }
                return new C15880s3(str, A012, callingUid, z2);
            } else {
                StringBuilder sb2 = new StringBuilder("Multiple packages per uid are not supported, uid: ");
                sb2.append(callingUid);
                throw new SecurityException(sb2.toString());
            }
        } else {
            throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread");
        }
    }

    public C15880s3 A01(String str) {
        Context context = this.A00.A00;
        int i2 = context.getPackageManager().getPackageInfo(str, 0).applicationInfo.uid;
        String A012 = C46772Ge.A01(C46772Ge.A00(context.getPackageManager(), str));
        boolean z2 = false;
        if (this.A01.A01.contains(Pair.create(str, A012))) {
            z2 = true;
        }
        return new C15880s3(str, A012, i2, z2);
    }

    public C15880s3 A02(String str) {
        try {
            C15880s3 A012 = A01(str);
            A012.A00();
            return A012;
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sb = new StringBuilder("Package not found: ");
            sb.append(str);
            throw new SecurityException(sb.toString(), e2);
        }
    }
}
