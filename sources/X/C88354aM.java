package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.4aM  reason: invalid class name and case insensitive filesystem */
public final class C88354aM {
    public static final AnonymousClass3WP A07;
    public static final AnonymousClass458 A08;
    @Deprecated
    public static final C437721l A09;
    public AnonymousClass43D A00;
    public final int A01;
    public final Context A02;
    public final C107735Le A03;
    public final C107745Lf A04;
    public final C107825Lo A05;
    public final String A06;

    static {
        AnonymousClass458 r3 = new AnonymousClass458();
        A08 = r3;
        AnonymousClass3WH r2 = new AnonymousClass3WH();
        A07 = r2;
        A09 = new C437721l(r2, r3, "ClearcutLogger.API");
    }

    public C88354aM(Context context) {
        AnonymousClass3WV r7 = new AnonymousClass3WV(context);
        C98074r3 r6 = C98074r3.A00;
        C97814qc r5 = new C97814qc(context);
        AnonymousClass43D r4 = AnonymousClass43D.A01;
        this.A00 = r4;
        this.A02 = context;
        this.A06 = context.getPackageName();
        int i2 = 0;
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.wtf("ClearcutLogger", "This can't happen.", e2);
        }
        this.A01 = i2;
        this.A04 = r7;
        this.A05 = r6;
        this.A00 = r4;
        this.A03 = r5;
    }
}
