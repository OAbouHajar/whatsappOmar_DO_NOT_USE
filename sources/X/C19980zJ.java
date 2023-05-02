package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.0zJ  reason: invalid class name and case insensitive filesystem */
public class C19980zJ implements C17100uX {
    public C14710pd A00;
    public final C14870pt A01;
    public final C16440t3 A02;

    public C19980zJ(C14870pt r1, C16440t3 r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public static Activity A00(Context context) {
        Activity A002 = AnonymousClass22N.A00(context);
        if (A002 != null) {
            return A002;
        }
        throw new IllegalStateException("The Context is not an Activity.");
    }

    public static Activity A01(Context context, Class cls) {
        Activity A002 = A00(context);
        if (cls.isAssignableFrom(A002.getClass())) {
            return A002;
        }
        StringBuilder sb = new StringBuilder("The Context is not assignable from class ");
        sb.append(cls.getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public static Activity A02(View view) {
        return A00(view.getContext());
    }

    public static void A03(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void A04(View view, WindowManager windowManager) {
        int identifier;
        if (Build.VERSION.SDK_INT >= 19 && view != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i2 = 0;
            Resources resources = view.getContext().getResources();
            if (Build.MANUFACTURER.equalsIgnoreCase("Essential Products") && Build.MODEL.equalsIgnoreCase("PH-1") && resources.getConfiguration().orientation == 2 && (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                i2 = resources.getDimensionPixelSize(identifier);
            }
            view.getLayoutParams().width = point.x - i2;
        }
    }

    public static void A05(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if ((r7.getFlags() & 268435456) != 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            X.0pt r4 = r5.A01
            android.app.Activity r0 = X.AnonymousClass22N.A00(r6)
            r3 = 0
            if (r0 != 0) goto L_0x0013
            int r2 = r7.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            r1 = 0
            if (r2 == 0) goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            java.lang.String r0 = "Need to use activity context or FLAG_ACTIVITY_NEW_TASK flag"
            X.AnonymousClass00B.A0C(r0, r1)
            r6.startActivity(r7)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x001d }
            goto L_0x002a
        L_0x001d:
            r1 = move-exception
            java.lang.String r0 = "app/start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 2131886240(0x7f1200a0, float:1.9407053E38)
            r4.A09(r0, r3)
            return
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19980zJ.A06(android.content.Context, android.content.Intent):void");
    }

    public void A07(Context context, Intent intent) {
        A08(context, intent, context.getClass().getSimpleName());
    }

    public void A08(Context context, Intent intent, String str) {
        boolean z2 = true;
        boolean z3 = false;
        if (context != null) {
            z3 = true;
        }
        AnonymousClass00B.A0C("Context must not be null", z3);
        boolean z4 = false;
        if (intent != null) {
            z4 = true;
        }
        AnonymousClass00B.A0C("Intent cannot be null to launch the activity", z4);
        if (str == null) {
            z2 = false;
        }
        AnonymousClass00B.A0C("Origin cannot be null", z2);
        AnonymousClass22U.A00(intent, str);
        A06(context, intent);
    }

    public boolean A09(Activity activity, Intent intent, int i2) {
        try {
            activity.startActivityForResult(intent, i2);
            return true;
        } catch (ActivityNotFoundException | SecurityException e2) {
            Log.e("app/start-activity-for-result ", e2);
            this.A01.A09(R.string.str00a0, 0);
            return false;
        }
    }

    public void Act(Context context, Uri uri) {
        if (uri == null) {
            Log.e("activity-utils/start-activity/uri-is-null");
            return;
        }
        C14710pd r2 = this.A00;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("create_new_tab", true);
        if (r2.A0E(C16620tM.A02, 2428)) {
            String host = uri.getHost();
            if (host != null && host.startsWith("www.")) {
                host = host.replace("www.", "");
            }
            String str = (String) AnonymousClass22V.A00.get(host);
            if (str != null) {
                try {
                    context.getPackageManager().getPackageInfo(str, 0);
                    intent.setPackage(str);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        A06(context, intent);
    }

    public void Acu(Context context, Uri uri, int i2) {
    }

    public void Acv(Context context, Uri uri, int i2, int i3) {
    }
}
