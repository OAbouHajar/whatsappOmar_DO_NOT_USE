package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ba  reason: invalid class name and case insensitive filesystem */
public class C23241Ba {
    public final C14870pt A00;
    public final C14710pd A01;
    public final AnonymousClass15V A02;
    public final AnonymousClass1Bc A03;

    public C23241Ba(C14870pt r1, C14710pd r2, AnonymousClass15V r3, AnonymousClass1Bc r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public boolean A00(Context context, Intent intent, C14600pS r11, String str, boolean z2) {
        Intent A012;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str2 = activityInfo.name;
                    String str3 = activityInfo.applicationInfo.packageName;
                    Intent intent2 = new Intent(intent);
                    intent2.setClassName(str3, str2);
                    intent2.setPackage(str3);
                    if (str3.contains("gm") || str3.contains("email") || str3.contains("fsck.k9") || str3.contains("maildroid") || str3.contains("hotmail") || str3.contains("android.mail") || str3.contains("com.baydin.boomerang") || str3.contains("yandex.mail") || str3.contains("com.google.android.apps.inbox") || str3.contains("com.microsoft.office.outlook") || str3.contains("com.asus.email") || str3.equals("org.kman.AquaMail")) {
                        arrayList.add(intent2);
                    }
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                if (size == 1) {
                    A012 = (Intent) arrayList.get(0);
                } else {
                    int i2 = size - 1;
                    Object obj = arrayList.get(i2);
                    arrayList.remove(i2);
                    arrayList.add(0, obj);
                    A012 = AnonymousClass1yL.A01((IntentSender) null, str, arrayList);
                }
                context.startActivity(A012);
                return true;
            } else if (r11 != null) {
                r11.Afg(R.string.str0853);
                return false;
            } else {
                this.A00.A09(R.string.str0853, 0);
                return false;
            }
        } else {
            try {
                context.startActivity(Intent.createChooser(intent, str));
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("email-sender/start-activity ", e2);
                this.A00.A09(R.string.str0853, 0);
                return false;
            }
        }
    }
}
