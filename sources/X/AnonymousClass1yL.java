package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1yL  reason: invalid class name */
public class AnonymousClass1yL {
    public static Intent A00(Intent intent, C28381Vw r5) {
        if (!intent.hasExtra("fMessageKeyJid") && !intent.hasExtra("fMessageKeyFromMe") && !intent.hasExtra("fMessageKeyId")) {
            return intent.putExtra("fMessageKeyId", r5.A01).putExtra("fMessageKeyFromMe", r5.A02).putExtra("fMessageKeyJid", C16030sJ.A03(r5.A00));
        }
        throw new IllegalArgumentException("Intent already contains key.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.content.Intent[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A01(android.content.IntentSender r6, java.lang.CharSequence r7, java.util.List r8) {
        /*
            r5 = 0
            java.lang.Object r2 = r8.get(r5)
            android.content.Intent r2 = (android.content.Intent) r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x002e
            if (r6 == 0) goto L_0x002e
            android.content.Intent r4 = android.content.Intent.createChooser(r2, r7, r6)
        L_0x0013:
            int r0 = r8.size()
            int r3 = r0 + -1
            if (r3 <= 0) goto L_0x002d
            android.content.Intent[] r2 = new android.content.Intent[r3]
        L_0x001d:
            int r1 = r5 + 1
            java.lang.Object r0 = r8.get(r1)
            r2[r5] = r0
            r5 = r1
            if (r1 < r3) goto L_0x001d
            java.lang.String r0 = "android.intent.extra.INITIAL_INTENTS"
            r4.putExtra(r0, r2)
        L_0x002d:
            return r4
        L_0x002e:
            android.content.Intent r4 = android.content.Intent.createChooser(r2, r7)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1yL.A01(android.content.IntentSender, java.lang.CharSequence, java.util.List):android.content.Intent");
    }

    public static C28381Vw A02(Intent intent) {
        if (!intent.hasExtra("fMessageKeyJid") || !intent.hasExtra("fMessageKeyFromMe") || !intent.hasExtra("fMessageKeyId")) {
            return null;
        }
        return new C28381Vw(C15830rv.A02(intent.getStringExtra("fMessageKeyJid")), intent.getStringExtra("fMessageKeyId"), intent.getBooleanExtra("fMessageKeyFromMe", false));
    }

    public static C28381Vw A03(Bundle bundle, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("fMessageKeyJid");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("fMessageKeyFromMe");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("fMessageKeyId");
        String obj3 = sb3.toString();
        if (!bundle.containsKey(obj) || !bundle.containsKey(obj2) || !bundle.containsKey(obj3)) {
            return null;
        }
        return new C28381Vw(C15830rv.A02(bundle.getString(obj)), bundle.getString(obj3), bundle.getBoolean(obj2, false));
    }

    public static List A04(Bundle bundle) {
        if (!bundle.containsKey("fMessageKeyJidArray") || !bundle.containsKey("fMessageKeyFromMeArray") || !bundle.containsKey("fMessageKeyIdArray")) {
            return null;
        }
        String[] stringArray = bundle.getStringArray("fMessageKeyIdArray");
        AnonymousClass00B.A06(stringArray);
        boolean[] booleanArray = bundle.getBooleanArray("fMessageKeyFromMeArray");
        AnonymousClass00B.A06(booleanArray);
        String[] stringArray2 = bundle.getStringArray("fMessageKeyJidArray");
        AnonymousClass00B.A06(stringArray2);
        int length = stringArray.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(new C28381Vw(C15830rv.A02(stringArray2[i2]), stringArray[i2], booleanArray[i2]));
        }
        return arrayList;
    }

    public static void A05(Activity activity) {
        A07(activity, "com.obwhatsapp");
    }

    public static void A06(Activity activity) {
        try {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", "com.obwhatsapp");
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public static void A07(Activity activity, String str) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, (String) null));
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public static void A08(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            StringBuilder sb = new StringBuilder("com.obwhatsapp");
            sb.append(".intent.action.");
            if (action.startsWith(sb.toString()) && !"gigaset".equalsIgnoreCase(Build.MANUFACTURER)) {
                intent.setPackage("com.obwhatsapp");
            }
        }
    }

    public static void A09(Bundle bundle, C28381Vw r5, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("fMessageKeyJid");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("fMessageKeyFromMe");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("fMessageKeyId");
        String obj3 = sb3.toString();
        if (bundle.containsKey(obj3) || bundle.containsKey(obj2) || bundle.containsKey(obj3)) {
            throw new IllegalArgumentException("Bundle already contains key.");
        }
        bundle.putString(obj3, r5.A01);
        bundle.putBoolean(obj2, r5.A02);
        bundle.putString(obj, C16030sJ.A03(r5.A00));
    }

    public static void A0A(Bundle bundle, Collection collection) {
        if (bundle.containsKey("fMessageKeyJidArray") || bundle.containsKey("fMessageKeyFromMeArray") || bundle.containsKey("fMessageKeyIdArray")) {
            throw new IllegalArgumentException("Bundle already contains list of keys.");
        }
        String[] strArr = new String[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        String[] strArr2 = new String[collection.size()];
        int i2 = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C28381Vw r1 = (C28381Vw) it.next();
            strArr[i2] = r1.A01;
            zArr[i2] = r1.A02;
            strArr2[i2] = C16030sJ.A03(r1.A00);
            i2++;
        }
        bundle.putStringArray("fMessageKeyIdArray", strArr);
        bundle.putBooleanArray("fMessageKeyFromMeArray", zArr);
        bundle.putStringArray("fMessageKeyJidArray", strArr2);
    }
}
