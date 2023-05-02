package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: X.1Ux  reason: invalid class name and case insensitive filesystem */
public class C28241Ux implements SharedPreferences {
    public int A00;
    public long A01;
    public long A02;
    public Throwable A03;
    public Map A04 = new HashMap();
    public boolean A05;
    public final int A06;
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final C28231Uw A08;
    public final C23281Bj A09;
    public final Object A0A = new Object();
    public final Object A0B = new Object();
    public final String A0C = UUID.randomUUID().toString();
    public final Map A0D = new HashMap();
    public final boolean A0E;

    public C28241Ux(C28231Uw r5, C23281Bj r6, int i2, boolean z2) {
        this.A08 = r5;
        this.A0E = z2;
        this.A09 = r6;
        this.A06 = i2;
        synchronized (this.A0A) {
            this.A05 = false;
        }
        this.A09.A00(new RunnableRunnableShape12S0100000_I0_11((Object) this, 17), this.A06, false);
    }

    public final void A00() {
        while (!this.A05) {
            try {
                this.A0A.wait();
            } catch (InterruptedException unused) {
            }
        }
        Throwable th = this.A03;
        if (th != null) {
            throw new IllegalStateException(th);
        }
    }

    public boolean contains(String str) {
        boolean containsKey;
        synchronized (this.A0A) {
            A00();
            containsKey = this.A04.containsKey(str);
        }
        return containsKey;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        synchronized (this.A0A) {
            A00();
        }
        return new AnonymousClass1VK(this);
    }

    public Map getAll() {
        HashMap hashMap;
        synchronized (this.A0A) {
            A00();
            hashMap = new HashMap(this.A04);
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z2) {
        synchronized (this.A0A) {
            A00();
            Boolean bool = (Boolean) this.A04.get(str);
            if (bool != null) {
                z2 = bool.booleanValue();
            }
        }
        return z2;
    }

    public float getFloat(String str, float f2) {
        synchronized (this.A0A) {
            A00();
            Float f3 = (Float) this.A04.get(str);
            if (f3 != null) {
                f2 = f3.floatValue();
            }
        }
        return f2;
    }

    public int getInt(String str, int i2) {
        synchronized (this.A0A) {
            A00();
            Integer num = (Integer) this.A04.get(str);
            if (num != null) {
                i2 = num.intValue();
            }
        }
        return i2;
    }

    public long getLong(String str, long j2) {
        synchronized (this.A0A) {
            A00();
            Long l2 = (Long) this.A04.get(str);
            if (l2 != null) {
                j2 = l2.longValue();
            }
        }
        return j2;
    }

    public String getString(String str, String str2) {
        synchronized (this.A0A) {
            A00();
            String str3 = (String) this.A04.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    public Set getStringSet(String str, Set set) {
        synchronized (this.A0A) {
            A00();
            Set set2 = (Set) this.A04.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0C;
        Handler handler = this.A07;
        synchronized (this.A0A) {
            Map map = this.A0D;
            AnonymousClass00B.A06(str);
            WeakHashMap weakHashMap = (WeakHashMap) map.get(str);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                map.put(str, weakHashMap);
            }
            AnonymousClass00B.A06(onSharedPreferenceChangeListener);
            AnonymousClass00B.A06(handler);
            weakHashMap.put(onSharedPreferenceChangeListener, handler);
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0C;
        synchronized (this.A0A) {
            Map map = this.A0D;
            AnonymousClass00B.A06(str);
            Map map2 = (Map) map.get(str);
            if (map2 != null) {
                AnonymousClass00B.A06(onSharedPreferenceChangeListener);
                map2.remove(onSharedPreferenceChangeListener);
            }
        }
    }
}
