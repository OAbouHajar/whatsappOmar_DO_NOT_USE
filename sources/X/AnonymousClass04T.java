package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.04T  reason: invalid class name */
public class AnonymousClass04T {
    public static volatile C05350Qj A00;
    public static volatile List A01;

    public static int A00(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static Intent A01(Context context, AnonymousClass04S r3) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 26 || (intent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(r3.A02())) == null) {
            intent = new Intent();
        }
        r3.A03(intent);
        return intent;
    }

    public static C05350Qj A02(Context context) {
        if (A00 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    A00 = (C05350Qj) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, AnonymousClass04T.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                } catch (Exception unused) {
                }
            }
            if (A00 == null) {
                A00 = new AnonymousClass0E5();
            }
        }
        return A00;
    }

    public static List A03(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo r1 : dynamicShortcuts) {
                arrayList.add(new AnonymousClass04R(context, r1).A00());
            }
            return arrayList;
        }
        try {
            return A02(context).A02();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static List A04(Context context) {
        Bundle bundle;
        String string;
        if (A01 == null) {
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
                intent.setPackage(context.getPackageName());
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                        try {
                            Class.forName(string, false, AnonymousClass04T.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                            arrayList.add((Object) null);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (A01 == null) {
                A01 = arrayList;
            }
        }
        return A01;
    }

    public static void A05(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        A02(context).A00();
        Iterator it = A04(context).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static void A06(Context context, AnonymousClass04S r4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 31) {
            if ((r4.A01 & 1) != 0) {
                return;
            }
            if (i2 < 26) {
                if (A08(context)) {
                    Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    r4.A03(intent);
                    context.sendBroadcast(intent);
                    return;
                }
                return;
            }
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(r4.A02(), (IntentSender) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r7 >= 25) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(android.content.Context r8, java.util.List<X.AnonymousClass04S> r9) {
        /*
            r4 = 1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 > r0) goto L_0x0027
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = r2.next()
            X.04S r1 = (X.AnonymousClass04S) r1
            int r0 = r1.A01
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0010
            r3.remove(r1)
            goto L_0x0010
        L_0x0026:
            r9 = r3
        L_0x0027:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r7 > r0) goto L_0x0076
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r9)
            java.util.Iterator r6 = r0.iterator()
        L_0x0036:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r5 = r6.next()
            X.04S r5 = (X.AnonymousClass04S) r5
            androidx.core.graphics.drawable.IconCompat r2 = r5.A09
            if (r2 == 0) goto L_0x006e
            int r3 = r2.A02
            r1 = 6
            if (r3 == r1) goto L_0x004f
            r0 = 4
            if (r3 == r0) goto L_0x004f
            goto L_0x0036
        L_0x004f:
            java.io.InputStream r0 = r2.A0C(r8)
            if (r0 == 0) goto L_0x006e
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0)
            if (r2 == 0) goto L_0x006e
            if (r3 != r1) goto L_0x0068
            r1 = 5
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>(r1)
        L_0x0063:
            r0.A06 = r2
            r5.A09 = r0
            goto L_0x0036
        L_0x0068:
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>(r4)
            goto L_0x0063
        L_0x006e:
            r9.remove(r5)
            goto L_0x0036
        L_0x0072:
            r0 = 25
            if (r7 < r0) goto L_0x0093
        L_0x0076:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r9.iterator()
        L_0x007f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r1.next()
            X.04S r0 = (X.AnonymousClass04S) r0
            android.content.pm.ShortcutInfo r0 = r0.A02()
            r2.add(r0)
            goto L_0x007f
        L_0x0093:
            X.0Qj r0 = A02(r8)
            r0.A01(r9)
            java.util.List r0 = A04(r8)
            java.util.Iterator r1 = r0.iterator()
        L_0x00a2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ba
            r1.next()
            goto L_0x00a2
        L_0x00ac:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r8.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.addDynamicShortcuts(r2)
            if (r0 != 0) goto L_0x0093
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04T.A07(android.content.Context, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(android.content.Context r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0013
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r5.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.isRequestPinShortcutSupported()
            return r0
        L_0x0013:
            java.lang.String r4 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r0 = X.AnonymousClass00T.A01(r5, r4)
            r3 = 0
            if (r0 != 0) goto L_0x004d
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r1 = "com.android.launcher.action.INSTALL_SHORTCUT"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            java.util.List r0 = r2.queryBroadcastReceivers(r0, r3)
            java.util.Iterator r2 = r0.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r2.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = r0.permission
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004b
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x002f
        L_0x004b:
            r0 = 1
            return r0
        L_0x004d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04T.A08(android.content.Context):boolean");
    }
}
