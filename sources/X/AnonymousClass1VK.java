package X;

import android.content.SharedPreferences;
import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1VK  reason: invalid class name */
public final class AnonymousClass1VK implements SharedPreferences.Editor {
    public boolean A00 = false;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();
    public final /* synthetic */ C28241Ux A03;

    public AnonymousClass1VK(C28241Ux r2) {
        this.A03 = r2;
    }

    public final AnonymousClass2TF A00() {
        Map map;
        ArrayList arrayList;
        long j2;
        Object obj;
        boolean z2;
        C28241Ux r8 = this.A03;
        synchronized (r8.A0A) {
            if (r8.A00 > 0) {
                r8.A04 = new HashMap(r8.A04);
            }
            map = r8.A04;
            r8.A00++;
            boolean z3 = !r8.A0D.isEmpty();
            arrayList = z3 ? new ArrayList() : null;
            synchronized (this.A01) {
                boolean z4 = false;
                if (this.A00) {
                    if (!map.isEmpty()) {
                        map.clear();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.A00 = false;
                    z4 = z2;
                }
                Map map2 = this.A02;
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == this || value == null) {
                        if (map.containsKey(str)) {
                            map.remove(str);
                        }
                    } else if (!map.containsKey(str) || (obj = map.get(str)) == null || !obj.equals(value)) {
                        map.put(str, value);
                    }
                    if (z3) {
                        arrayList.add(str);
                    }
                    z4 = true;
                }
                map2.clear();
                if (z4) {
                    r8.A01 = 1 + r8.A01;
                }
                j2 = r8.A01;
            }
        }
        return new AnonymousClass2TF(arrayList, map, j2);
    }

    public final void A01(AnonymousClass2TF r8) {
        List list = r8.A01;
        if (list != null && list.size() != 0) {
            C28241Ux r5 = this.A03;
            synchronized (r5.A0A) {
                Map map = r5.A0D;
                if (!map.isEmpty()) {
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        String str = (String) list.get(size);
                        Map map2 = (Map) map.get(str);
                        if (map2 != null) {
                            A02(str, map2);
                        }
                        Map map3 = (Map) map.get(r5.A0C);
                        if (map3 != null) {
                            A02(str, map3);
                        }
                    }
                }
            }
        }
    }

    public final void A02(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((Handler) entry.getValue()).post(new RunnableRunnableShape0S1200000_I0(entry.getKey(), str, this, 26));
        }
    }

    public void apply() {
        AnonymousClass2TF A002 = A00();
        C28241Ux r4 = this.A03;
        r4.A09.A00(new RunnableRunnableShape0S0210000_I0(r4, A002, 19, false), r4.A06, true);
        A01(A002);
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        synchronized (this.A01) {
            this.A00 = true;
        }
        return this;
    }

    public boolean commit() {
        boolean z2;
        AnonymousClass2TF A002 = A00();
        C28241Ux r5 = this.A03;
        RunnableRunnableShape0S0210000_I0 runnableRunnableShape0S0210000_I0 = new RunnableRunnableShape0S0210000_I0(r5, A002, 19, true);
        synchronized (r5.A0A) {
            z2 = false;
            if (r5.A00 == 1) {
                z2 = true;
            }
        }
        if (z2) {
            runnableRunnableShape0S0210000_I0.run();
        } else {
            r5.A09.A00(runnableRunnableShape0S0210000_I0, r5.A06, false);
        }
        try {
            A002.A03.await();
            A01(A002);
            return A002.A04;
        } catch (InterruptedException e2) {
            Log.e("LightSharedPreferencesImpl/Commit: Got exception:", e2);
            return false;
        }
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z2) {
        synchronized (this.A01) {
            this.A02.put(str, Boolean.valueOf(z2));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f2) {
        synchronized (this.A01) {
            this.A02.put(str, Float.valueOf(f2));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i2) {
        synchronized (this.A01) {
            this.A02.put(str, Integer.valueOf(i2));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j2) {
        synchronized (this.A01) {
            this.A02.put(str, Long.valueOf(j2));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.A01) {
            this.A02.put(str, str2);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        synchronized (this.A01) {
            this.A02.put(str, set == null ? null : new HashSet(set));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        synchronized (this.A01) {
            this.A02.put(str, this);
        }
        return this;
    }
}
