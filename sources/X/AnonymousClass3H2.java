package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3H2  reason: invalid class name */
public class AnonymousClass3H2 implements C30781cw {
    public static final Set A02;
    public final C16980tz A00;
    public final AnonymousClass1AP A01;

    static {
        String[] strArr = new String[3];
        strArr[0] = "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareDefaultAlias";
        strArr[1] = "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasActionClarify";
        A02 = C13680ns.A0p("com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasFamilyConsistency", strArr, 2);
    }

    public AnonymousClass3H2(C16980tz r1, AnonymousClass1AP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C30791cx AG3(Context context, List list) {
        String str;
        Intent intent;
        int i2;
        AnonymousClass00B.A00();
        C30791cx r3 = new C30791cx();
        AnonymousClass3AB A002 = AnonymousClass3AB.A00(context, this.A01, list);
        int i3 = A002.A00;
        if (i3 != 0) {
            Map map = A002.A01;
            ArrayList A0u = AnonymousClass000.A0u();
            Iterator A0q = C13680ns.A0q(map);
            while (A0q.hasNext()) {
                Uri A012 = AnonymousClass1XI.A01(this.A00.A00, ((C83964Is) A0q.next()).A00);
                if (A012 != null) {
                    A0u.add(A012);
                }
            }
            switch (i3) {
                case 1:
                case 4:
                    str = "image/png";
                    break;
                case 2:
                case 5:
                    str = "audio/ogg; codecs=opus";
                    break;
                case 3:
                case 6:
                    str = "video/mp4";
                    break;
                default:
                    str = "*/*";
                    break;
            }
            Intent type = C13680ns.A09().setType(str);
            if (A0u.size() == 1) {
                type.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", (Parcelable) A0u.get(0));
            } else if (A0u.size() > 1) {
                type.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", A0u);
            }
            ArrayList A0u2 = AnonymousClass000.A0u();
            List<ResolveInfo> queryIntentActivities = this.A00.A00.getPackageManager().queryIntentActivities(type, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
            int size = queryIntentActivities.size();
            if (size != 0) {
                if (Build.VERSION.SDK_INT < 29) {
                    boolean z2 = false;
                    for (ResolveInfo next : queryIntentActivities) {
                        ActivityInfo activityInfo = next.activityInfo;
                        String str2 = activityInfo.name;
                        if (!str2.startsWith("com.facebook.")) {
                            Intent intent2 = new Intent(type);
                            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                            A0u2.add(intent2);
                        } else if (!z2 && A02.contains(str2)) {
                            ActivityInfo activityInfo2 = next.activityInfo;
                            Intent intent3 = new Intent(type);
                            intent3.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                            A0u2.add(intent3);
                            z2 = true;
                        }
                    }
                    if (size != A0u2.size() && z2 && (i2 = Build.VERSION.SDK_INT) < 29) {
                        intent = Intent.createChooser(i2 >= 23 ? C13680ns.A09() : (Intent) A0u2.remove(0), (CharSequence) null);
                        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) A0u2.toArray(new Parcelable[0]));
                        intent.addFlags(268435456);
                        r3.A02 = A0u;
                        r3.A01 = intent;
                        return r3;
                    }
                }
                intent = Intent.createChooser(type, (CharSequence) null);
                if (intent == null) {
                    return r3;
                }
                intent.addFlags(268435456);
                r3.A02 = A0u;
                r3.A01 = intent;
                return r3;
            }
        }
        return r3;
    }
}
