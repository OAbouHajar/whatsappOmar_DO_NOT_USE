package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.1vF  reason: invalid class name and case insensitive filesystem */
public final class C41111vF extends C41091vD {
    public void A02(Context context, int i2) {
        if (Build.VERSION.SDK_INT < 22) {
            String packageName = context.getPackageName();
            try {
                Uri parse = Uri.parse("content://com.sec.badge/apps");
                ContentResolver contentResolver = context.getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("package", packageName);
                String bIc = yo.bIc();
                contentValues.put("class", bIc);
                contentValues.put("badgecount", Integer.valueOf(i2));
                if (contentResolver.update(parse, contentValues, "package=? AND class=?", new String[]{packageName, bIc}) == 0) {
                    contentResolver.insert(parse, contentValues);
                }
            } catch (Exception e2) {
                Log.e("widgetprovider/updatebadge", e2);
            }
        } else {
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i2);
            intent.putExtra("badge_count_package_name", context.getPackageName());
            intent.putExtra("badge_count_class_name", yo.bIc());
            context.sendBroadcast(intent);
        }
    }
}
