package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.18Y  reason: invalid class name */
public class AnonymousClass18Y {
    public C41091vD A00;
    public final C41091vD A01;
    public final C41091vD A02 = new C41081vC();
    public final C41091vD[] A03;

    public AnonymousClass18Y(C14710pd r5) {
        C41101vE r3 = new C41101vE();
        this.A01 = r3;
        this.A03 = new C41091vD[]{new C41111vF(), new C41121vG(), new C41131vH(), new C41141vI(), new C41151vJ(), new C41161vK(r5), new C41171vL(r5), new C41181vM(), r3};
    }

    public synchronized C41091vD A00(Context context) {
        C41091vD r0;
        r0 = this.A00;
        if (r0 == null) {
            if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                this.A00 = new C41121vG();
            } else {
                try {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
                    if (queryIntentActivities != null) {
                        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str = it.next().activityInfo.packageName;
                            StringBuilder sb = new StringBuilder();
                            sb.append("badger/homepackage/");
                            sb.append(str);
                            Log.i(sb.toString());
                            C41091vD[] r4 = this.A03;
                            int length = r4.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                C41091vD r1 = r4[i2];
                                if (r1.A00(context.getApplicationContext()).contains(str)) {
                                    this.A00 = r1;
                                    break;
                                }
                                i2++;
                            }
                            if (this.A00 != null) {
                                break;
                            }
                        }
                    } else {
                        Log.e("badger/nohome");
                    }
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("badger/getbadger ");
                    sb2.append(e2.getMessage());
                    Log.e(sb2.toString(), e2);
                }
                if (this.A00 == null) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        Log.i("badger/getbadger/notfound/default");
                        this.A00 = this.A01;
                    } else {
                        Log.i("badger/getbadger/notfound/disable");
                        this.A00 = this.A02;
                    }
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("badger/getbadger ");
            sb3.append(Arrays.asList(this.A03).indexOf(this.A00));
            Log.i(sb3.toString());
            r0 = this.A00;
        }
        return r0;
    }
}
