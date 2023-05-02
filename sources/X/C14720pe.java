package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.obwhatsapp.yo.HD;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0pe  reason: invalid class name and case insensitive filesystem */
public abstract class C14720pe {
    public static volatile boolean A06;
    public final SharedPreferences A00;
    public final C222217c A01;
    public final C226318r A02;
    public final C16320sq A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap(32);

    public C14720pe(C222217c r3, C226318r r4, C17020u3 r5, C16320sq r6, String str) {
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r5.A00(str);
    }

    public float A00(int i2) {
        return A01(C16620tM.A02, i2);
    }

    public float A01(C16620tM r6, int i2) {
        float f2;
        Number number = (Number) A04(r6, i2);
        if (number != null) {
            return number.floatValue();
        }
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("_expo_key");
            A0B(sb.toString());
            C17930vs r0 = this instanceof C14710pd ? ((C14710pd) this).A01 : ((AnonymousClass10J) this).A00.A01;
            Integer valueOf = Integer.valueOf(i2);
            Float f3 = (Float) r0.get(valueOf);
            if (f3 != null) {
                boolean z2 = this instanceof AnonymousClass10J;
                f2 = this.A00.getFloat(Integer.toString(i2), f3.floatValue());
                (z2 ? ((AnonymousClass10J) this).A02 : this.A05).put(valueOf, Float.valueOf(f2));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown FloatField: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return f2;
    }

    public int A02(int i2) {
        return A03(C16620tM.A02, i2);
    }

    public final int A03(C16620tM r6, int i2) {
        int i3;
        if (2693 == i2) {
            return 1;
        }
        if (HD.A0G(i2, 1)) {
            return HD.A0D();
        }
        if (HD.A0G(i2, 2)) {
            return HD.A0C();
        }
        Number number = (Number) A04(r6, i2);
        if (number != null) {
            return number.intValue();
        }
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("_expo_key");
            A0B(sb.toString());
            C17930vs r0 = this instanceof C14710pd ? ((C14710pd) this).A02 : ((AnonymousClass10J) this).A00.A02;
            Integer valueOf = Integer.valueOf(i2);
            Integer num = (Integer) r0.get(valueOf);
            if (num != null) {
                boolean z2 = this instanceof AnonymousClass10J;
                i3 = this.A00.getInt(Integer.toString(i2), num.intValue());
                if (!r6.A00) {
                    (z2 ? ((AnonymousClass10J) this).A02 : this.A05).put(valueOf, Integer.valueOf(i3));
                } else {
                    ConcurrentHashMap concurrentHashMap = this.A04;
                    concurrentHashMap.putIfAbsent(valueOf, Integer.valueOf(i3));
                    i3 = ((Integer) concurrentHashMap.get(valueOf)).intValue();
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown IntField: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return i3;
    }

    public Object A04(C16620tM r3, int i2) {
        return (this instanceof AnonymousClass10J ? ((AnonymousClass10J) this).A02 : r3.A00 ? this.A04 : this.A05).get(Integer.valueOf(i2));
    }

    public String A05(int i2) {
        return A06(C16620tM.A02, i2);
    }

    public final String A06(C16620tM r7, int i2) {
        String string;
        String str = (String) A04(r7, i2);
        if (str != null) {
            return str;
        }
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("_expo_key");
            A0B(sb.toString());
            C17930vs r0 = this instanceof C14710pd ? ((C14710pd) this).A04 : ((AnonymousClass10J) this).A00.A04;
            Integer valueOf = Integer.valueOf(i2);
            String str2 = (String) r0.get(valueOf);
            if (str2 != null) {
                boolean z2 = this instanceof AnonymousClass10J;
                string = this.A00.getString(Integer.toString(i2), str2);
                if (string != null) {
                    (z2 ? ((AnonymousClass10J) this).A02 : this.A05).put(valueOf, string);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown StringField: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return string;
    }

    public JSONObject A07(int i2) {
        return A08(C16620tM.A02, i2);
    }

    public final JSONObject A08(C16620tM r9, int i2) {
        IllegalArgumentException illegalArgumentException;
        JSONObject jSONObject;
        JSONObject jSONObject2 = (JSONObject) A04(r9, i2);
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("_expo_key");
            A0B(sb.toString());
            C17930vs r0 = this instanceof C14710pd ? ((C14710pd) this).A03 : ((AnonymousClass10J) this).A00.A03;
            Integer valueOf = Integer.valueOf(i2);
            String str = (String) r0.get(valueOf);
            if (str != null) {
                boolean z2 = this instanceof AnonymousClass10J;
                String num = Integer.toString(i2);
                SharedPreferences sharedPreferences = this.A00;
                String string = sharedPreferences.getString(num, (String) null);
                if (!TextUtils.isEmpty(string)) {
                    str = string;
                }
                try {
                    jSONObject = new JSONObject(str);
                    (z2 ? ((AnonymousClass10J) this).A02 : this.A05).put(valueOf, jSONObject);
                } catch (JSONException e2) {
                    sharedPreferences.edit().remove(num).apply();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AbstractABProps/invalid json format for property; prefKey=");
                    sb2.append(num);
                    sb2.append("; value=");
                    sb2.append(str);
                    illegalArgumentException = new IllegalArgumentException(sb2.toString(), e2);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown JsonField: ");
                sb3.append(i2);
                illegalArgumentException = new IllegalArgumentException(sb3.toString());
                throw illegalArgumentException;
            }
        }
        return jSONObject;
    }

    public void A09() {
        (this instanceof AnonymousClass10J ? ((AnonymousClass10J) this).A02 : this.A05).clear();
    }

    public synchronized void A0A(SharedPreferences.Editor editor, Set set) {
        editor.putStringSet("ab_props:sys:last_exposure_keys", set);
        editor.apply();
        C226318r r3 = this.A02;
        String join = TextUtils.join(",", set);
        r3.A02(join, 5029, 0);
        r3.A02(join, 5029, 1);
        r3.A02(join, 5029, 2);
    }

    public void A0B(String str) {
        if (!(this instanceof AnonymousClass10J)) {
            SharedPreferences sharedPreferences = this.A00;
            String string = sharedPreferences.getString(str, (String) null);
            Set<String> stringSet = sharedPreferences.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
            C003001i r1 = stringSet == null ? new C003001i(0) : new C003001i((Collection) stringSet);
            if (!TextUtils.isEmpty(string) && !r1.contains(string)) {
                r1.add(string);
                A0A(sharedPreferences.edit(), r1);
            }
        }
    }

    public boolean A0C(int i2) {
        return A0E(C16620tM.A02, i2);
    }

    public boolean A0D(C16620tM r2) {
        return A0E(r2, 2846);
    }

    public final boolean A0E(C16620tM r6, int i2) {
        boolean z2;
        if (1292 == i2 || 1352 == i2 || 1353 == i2 || 1011 == i2 || 1217 == i2 || 1597 == i2 || 1455 == i2 || 808 == i2 || 1687 == i2 || 815 == i2 || 1267 == i2 || 1394 == i2 || 1857 == i2 || 2182 == i2 || 1874 == i2 || 1875 == i2 || 2343 == i2 || 1750 == i2 || 2424 == i2 || 1533 == i2 || 1396 == i2 || 662 == i2 || 2190 == i2 || 2189 == i2) {
            return true;
        }
        Boolean bool = (Boolean) A04(r6, i2);
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("_expo_key");
            A0B(sb.toString());
            C17930vs r0 = this instanceof C14710pd ? ((C14710pd) this).A00 : ((AnonymousClass10J) this).A00.A00;
            Integer valueOf = Integer.valueOf(i2);
            Boolean bool2 = (Boolean) r0.get(valueOf);
            if (bool2 != null) {
                boolean z3 = this instanceof AnonymousClass10J;
                z2 = this.A00.getBoolean(Integer.toString(i2), bool2.booleanValue());
                if (!r6.A00) {
                    (z3 ? ((AnonymousClass10J) this).A02 : this.A05).put(valueOf, Boolean.valueOf(z2));
                } else {
                    ConcurrentHashMap concurrentHashMap = this.A04;
                    concurrentHashMap.putIfAbsent(valueOf, Boolean.valueOf(z2));
                    z2 = ((Boolean) concurrentHashMap.get(valueOf)).booleanValue();
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown BooleanField: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return z2;
    }
}
