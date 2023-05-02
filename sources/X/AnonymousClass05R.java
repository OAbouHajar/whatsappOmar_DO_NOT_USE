package X;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry$1;
import com.facebook.redex.IDxRLauncherShape0S1201000_I0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.05R  reason: invalid class name */
public class AnonymousClass05R {
    public ArrayList A00 = new ArrayList();
    public Random A01 = new Random();
    public final Bundle A02 = new Bundle();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final transient Map A07 = new HashMap();
    public final /* synthetic */ C001100m A08;

    public AnonymousClass05R(C001100m r2) {
        this.A08 = r2;
    }

    public final int A00(String str) {
        Map map = this.A04;
        Number number = (Number) map.get(str);
        if (number != null) {
            return number.intValue();
        }
        int nextInt = this.A01.nextInt(2147418112);
        while (true) {
            int i2 = nextInt + AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
            Map map2 = this.A06;
            Integer valueOf = Integer.valueOf(i2);
            if (map2.containsKey(valueOf)) {
                nextInt = this.A01.nextInt(2147418112);
            } else {
                map2.put(valueOf, str);
                map.put(str, valueOf);
                return i2;
            }
        }
    }

    public final C011105i A01(AnonymousClass05g r11, AnonymousClass05h r12, C001300o r13, String str) {
        C009704q lifecycle = r13.getLifecycle();
        C009604p r2 = (C009604p) lifecycle;
        if (!r2.A02.A00(C011005f.STARTED)) {
            String str2 = str;
            int A002 = A00(str);
            Map map = this.A03;
            C04710Np r22 = (C04710Np) map.get(str);
            if (r22 == null) {
                r22 = new C04710Np(lifecycle);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, r11, r12, str);
            r22.A00.A00(activityResultRegistry$1);
            r22.A01.add(activityResultRegistry$1);
            map.put(str, r22);
            return new IDxRLauncherShape0S1201000_I0(this, r12, str2, A002, 0);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(r13);
        sb.append(" is attempting to register while current state is ");
        sb.append(r2.A02);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }

    public final C011105i A02(AnonymousClass05g r8, AnonymousClass05h r9, String str) {
        String str2 = str;
        int A002 = A00(str);
        AnonymousClass05h r3 = r9;
        this.A07.put(str, new AnonymousClass07N(r8, r9));
        Map map = this.A05;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            r8.AM3(obj);
        }
        Bundle bundle = this.A02;
        AnonymousClass0YD r0 = (AnonymousClass0YD) bundle.getParcelable(str);
        if (r0 != null) {
            bundle.remove(str);
            r8.AM3(r9.A02(r0.A01, r0.A00));
        }
        return new IDxRLauncherShape0S1201000_I0(this, r3, str2, A002, 1);
    }

    public final void A03(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null && integerArrayList != null) {
            this.A00 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            this.A01 = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            Bundle bundle2 = this.A02;
            bundle2.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                String str = stringArrayList.get(i2);
                Map map = this.A04;
                if (map.containsKey(str)) {
                    Object remove = map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        this.A06.remove(remove);
                    }
                }
                Integer num = integerArrayList.get(i2);
                String str2 = stringArrayList.get(i2);
                this.A06.put(num, str2);
                map.put(str2, num);
            }
        }
    }

    public final void A04(String str) {
        Object remove;
        if (!this.A00.contains(str) && (remove = this.A04.remove(str)) != null) {
            this.A06.remove(remove);
        }
        this.A07.remove(str);
        Map map = this.A05;
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(map.get(str));
            Log.w("ActivityResultRegistry", sb.toString());
            map.remove(str);
        }
        Bundle bundle = this.A02;
        if (bundle.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sb2.toString());
            bundle.remove(str);
        }
        Map map2 = this.A03;
        C04710Np r4 = (C04710Np) map2.get(str);
        if (r4 != null) {
            ArrayList arrayList = r4.A01;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r4.A00.A01((C003501o) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }

    public final boolean A05(Intent intent, int i2, int i3) {
        AnonymousClass05g r1;
        String str = (String) this.A06.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.A00.remove(str);
        AnonymousClass07N r0 = (AnonymousClass07N) this.A07.get(str);
        if (r0 == null || (r1 = r0.A00) == null) {
            this.A05.remove(str);
            this.A02.putParcelable(str, new AnonymousClass0YD(i3, intent));
            return true;
        }
        r1.AM3(r0.A01.A02(intent, i3));
        return true;
    }
}
