package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1FU  reason: invalid class name */
public final class AnonymousClass1FU implements C19400yN {
    public final C19240y6 A00;

    public AnonymousClass1FU(C19240y6 r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public String AGT() {
        return "SplitWindowAsyncInit";
    }

    public void AMc() {
        C19240y6 r4 = this.A00;
        if (r4.A07()) {
            Context context = r4.A01;
            String packageName = context.getPackageName();
            C18450wi.A0B(packageName);
            int i2 = 0;
            Set A03 = AnonymousClass1F9.A03("com.obwhatsapp.HomeActivity", "com.obwhatsapp.Conversation", "com.obwhatsapp.home.ui.HomePlaceholderActivity");
            HashSet hashSet = new HashSet();
            try {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(packageName, 1).activities;
                C18450wi.A0A(activityInfoArr);
                int length = activityInfoArr.length;
                while (i2 < length) {
                    ActivityInfo activityInfo = activityInfoArr[i2];
                    i2++;
                    if (!A03.contains(activityInfo.name)) {
                        hashSet.add(new ComponentName(packageName, activityInfo.name));
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("SplitWindowManager/getActivitiesToExpand/ failed to get activities from the packagemanager", e2);
            }
            ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(hashSet, 10));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(new AnonymousClass03D((ComponentName) it.next()));
            }
            AnonymousClass03F r3 = new AnonymousClass03F(C003101j.A0F(arrayList));
            AnonymousClass03B r2 = (AnonymousClass03B) ((AnonymousClass035) r4.A06.getValue()).A01;
            CopyOnWriteArraySet copyOnWriteArraySet = r2.A03;
            if (!copyOnWriteArraySet.contains(r3)) {
                copyOnWriteArraySet.add(r3);
                AnonymousClass03C r0 = r2.A00;
                if (r0 != null) {
                    r0.Aeg(copyOnWriteArraySet);
                }
            }
        }
    }
}
