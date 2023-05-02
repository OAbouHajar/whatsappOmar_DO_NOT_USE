package X;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;

/* renamed from: X.2RZ  reason: invalid class name */
public class AnonymousClass2RZ {
    public static void A00(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), yo.bIc());
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        intent.addFlags(AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END);
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.NAME", str);
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, R.mipmap.icon));
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        context.sendBroadcast(intent2);
    }
}
