package X;

import android.app.Notification;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1vD  reason: invalid class name and case insensitive filesystem */
public abstract class C41091vD {
    public List A00(Context context) {
        String str;
        String[] strArr;
        char c2;
        String str2;
        if (this instanceof C41121vG) {
            strArr = new String[3];
            strArr[0] = "com.miui.miuilite";
            strArr[1] = "com.miui.miuihome";
            c2 = 2;
            str2 = "com.miui.miuihome2";
        } else if (this instanceof C41131vH) {
            strArr = new String[3];
            strArr[0] = "com.sonyericsson.home";
            strArr[1] = "com.sonymobile.home";
            c2 = 2;
            str2 = "com.sonymobile.launcher";
        } else if (this instanceof C41081vC) {
            return null;
        } else {
            if (this instanceof C41111vF) {
                strArr = new String[4];
                strArr[0] = "com.sec.android.app.launcher";
                strArr[1] = "com.sec.android.app.twlauncher";
                strArr[2] = "com.sec.android.app.easylauncher";
                c2 = 3;
                str2 = "com.sec.android.emergencylauncher";
            } else {
                if (this instanceof C41161vK) {
                    C41161vK r5 = (C41161vK) this;
                    String str3 = Build.MANUFACTURER;
                    if (str3.equalsIgnoreCase("OPPO") || str3.equalsIgnoreCase("realme")) {
                        String str4 = Build.BRAND;
                        if (str4.equalsIgnoreCase("oppo") || str4.equalsIgnoreCase("realme")) {
                            boolean z2 = false;
                            try {
                                z2 = !TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.build.version.oplusrom"}));
                            } catch (Exception e2) {
                                Log.e("Error while checking oppo launcher information", e2);
                            }
                            if (z2 && r5.A00.A0E(C16620tM.A02, 503)) {
                                str = "com.android.launcher";
                            }
                        }
                    }
                    str = "com.oppo.launcher";
                } else if (this instanceof C41151vJ) {
                    str = "com.huawei.android.launcher";
                } else if (this instanceof C41141vI) {
                    if (((C41141vI) this).A03(context) < 4.0f) {
                        return new ArrayList();
                    }
                    str = "com.htc.launcher";
                } else if (!(this instanceof C41171vL)) {
                    strArr = new String[4];
                    strArr[0] = "com.asus.launcher";
                    strArr[1] = "com.lge.launcher";
                    strArr[2] = "com.lge.launcher2";
                    c2 = 3;
                    str2 = "com.lge.launcher3";
                } else if (!((C41171vL) this).A00.A0E(C16620tM.A02, 2337)) {
                    return Collections.emptyList();
                } else {
                    str = "com.hihonor.android.launcher";
                }
                return Collections.singletonList(str);
            }
        }
        strArr[c2] = str2;
        return Arrays.asList(strArr);
    }

    public void A01(Notification notification, Context context, int i2) {
    }

    public void A02(Context context, int i2) {
        Intent intent;
        String str;
        String str2;
        Context context2 = context;
        int i3 = i2;
        if (this instanceof C41121vG) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, Integer.valueOf(i3));
                return;
            } catch (Exception unused) {
                intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
                StringBuilder sb = new StringBuilder();
                sb.append(context2.getPackageName());
                sb.append("/");
                sb.append(yo.bIc());
                intent.putExtra("android.intent.extra.update_application_component_name", sb.toString());
                str = String.valueOf(i2 == 0 ? "" : Integer.valueOf(i3));
                str2 = "android.intent.extra.update_application_message_text";
            }
        } else {
            if (this instanceof C41131vH) {
                boolean z2 = false;
                if (context2.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
                    intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", context2.getPackageName());
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", yo.bIc());
                    if (i2 > 0) {
                        z2 = true;
                    }
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z2);
                    str = String.valueOf(i3);
                    str2 = "com.sonyericsson.home.intent.extra.badge.MESSAGE";
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("badge_count", Integer.valueOf(i3));
                    contentValues.put("package_name", context2.getPackageName());
                    contentValues.put("activity_name", yo.bIc());
                    try {
                        context2.getContentResolver().insert(Uri.parse("content://com.sonymobile.home.resourceprovider/badge"), contentValues);
                        return;
                    } catch (Exception e2) {
                        Log.e("badger/sony/updatebadge", e2);
                        return;
                    }
                }
            } else if (this instanceof C41081vC) {
                return;
            } else {
                if (this instanceof C41141vI) {
                    float A03 = ((C41141vI) this).A03(context2);
                    if (A03 >= 5.0f) {
                        Intent intent2 = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
                        intent2.setFlags(16);
                        intent2.putExtra("com.htc.launcher.extra.COMPONENT", new ComponentName(context2.getPackageName(), yo.bIc()).flattenToShortString());
                        intent2.putExtra("com.htc.launcher.extra.COUNT", i3);
                        context2.sendBroadcast(intent2);
                        return;
                    } else if (A03 >= 4.0f) {
                        Intent intent3 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
                        intent3.setFlags(16);
                        intent3.putExtra("packagename", context2.getPackageName());
                        intent3.putExtra("count", i3);
                        context2.sendBroadcast(intent3);
                        ContentResolver contentResolver = context2.getContentResolver();
                        HashSet hashSet = new HashSet();
                        Uri parse = Uri.parse("content://com.htc.launcher.settings/favorites");
                        StringBuilder sb2 = new StringBuilder("%");
                        sb2.append(context2.getPackageName());
                        sb2.append("%");
                        Cursor query = contentResolver.query(parse, new String[]{"_id", "intent"}, "intent LIKE ?", new String[]{sb2.toString()}, (String) null);
                        if (query != null) {
                            try {
                                int columnIndex = query.getColumnIndex("_id");
                                int columnIndex2 = query.getColumnIndex("intent");
                                query.moveToFirst();
                                while (!query.isAfterLast()) {
                                    try {
                                        ComponentName component = Intent.parseUri(query.getString(columnIndex2), 0).getComponent();
                                        if (component != null && context2.getPackageName().equals(component.getPackageName()) && yo.bIc().equals(component.getClassName())) {
                                            hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                                        }
                                    } catch (URISyntaxException unused2) {
                                    }
                                    query.moveToNext();
                                }
                                query.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            Intent intent4 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
                            intent3.setFlags(16);
                            intent4.putExtra("packagename", context2.getPackageName());
                            intent4.putExtra("favorite_item_id", ((Number) it.next()).longValue());
                            ComponentName componentName = new ComponentName(context2.getPackageName(), yo.bIc());
                            StringBuilder sb3 = new StringBuilder("%");
                            sb3.append(componentName.flattenToShortString());
                            sb3.append("%");
                            intent4.putExtra("selectArgs", new String[]{sb3.toString()});
                            intent4.putExtra("count", i3);
                            context2.sendBroadcast(intent4);
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                    intent.putExtra("badge_count", i3);
                    intent.putExtra("badge_count_package_name", context2.getPackageName());
                    str = yo.bIc();
                    str2 = "badge_count_class_name";
                }
            }
            intent.putExtra(str2, str);
            context2.sendBroadcast(intent);
            return;
        }
        throw th;
    }
}
