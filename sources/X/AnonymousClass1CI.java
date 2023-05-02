package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1CI  reason: invalid class name */
public class AnonymousClass1CI {
    public SharedPreferences A00;
    public SharedPreferences A01;
    public C16490t9 A02 = null;
    public HashMap A03 = null;
    public final C16440t3 A04;
    public final C17020u3 A05;

    public AnonymousClass1CI(C16440t3 r2, C17020u3 r3) {
        this.A04 = r2;
        this.A05 = r3;
    }

    public final SharedPreferences.Editor A00() {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A01;
            if (sharedPreferences == null) {
                sharedPreferences = this.A05.A00("psid_store");
                this.A01 = sharedPreferences;
            }
        }
        return sharedPreferences.edit();
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A05.A00("ps_mini_buffer_sequence_number_store");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public synchronized String A02(int i2) {
        String str;
        IllegalArgumentException illegalArgumentException;
        if (i2 == 0) {
            str = "00000000-0000-0000-0000-000000000000";
        } else {
            HashMap hashMap = this.A03;
            if (hashMap == null) {
                hashMap = A03();
                this.A03 = hashMap;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (hashMap.containsKey(valueOf)) {
                C29051Zw r5 = (C29051Zw) this.A03.get(valueOf);
                if (r5 != null) {
                    int i3 = r5.A02;
                    if (i3 == -1) {
                        str = r5.A01;
                    } else {
                        long A002 = this.A04.A00() / 86400000;
                        if (A002 - r5.A00 >= ((long) i3)) {
                            String str2 = r5.A01;
                            r5.A01 = UUID.randomUUID().toString();
                            r5.A00 = A002;
                            this.A03.put(valueOf, r5);
                            A05(r5, valueOf);
                            A01().edit().remove(str2).apply();
                            A04(2, i2, i3);
                        }
                        str = r5.A01;
                    }
                } else {
                    illegalArgumentException = new IllegalArgumentException("Invalid psIdKey");
                }
            } else {
                illegalArgumentException = new IllegalArgumentException("Invalid psIdKey");
            }
            throw illegalArgumentException;
        }
        return str;
    }

    public synchronized HashMap A03() {
        HashMap hashMap;
        synchronized (this) {
            SharedPreferences sharedPreferences = this.A01;
            if (sharedPreferences == null) {
                sharedPreferences = this.A05.A00("psid_store");
                this.A01 = sharedPreferences;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            this.A03 = new HashMap();
            for (Map.Entry next : all.entrySet()) {
                try {
                    Integer valueOf = Integer.valueOf((String) next.getKey());
                    try {
                        JSONObject jSONObject = new JSONObject((String) next.getValue());
                        String string = jSONObject.getString("psIdValue");
                        int i2 = jSONObject.getInt("rotationInDays");
                        long j2 = jSONObject.getLong("lastRotationTimeUtcDay");
                        jSONObject.getInt("beaconEvtNumber");
                        this.A03.put(valueOf, new C29051Zw(i2, string, j2));
                    } catch (JSONException e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("psidstore/loadFromFile bad json ");
                        sb.append(e2.toString());
                        Log.e(sb.toString());
                        A00().remove((String) next.getKey()).apply();
                    }
                } catch (NumberFormatException unused) {
                    Log.e("psidstore/loadfromfile ps-id key is corrupted");
                }
            }
            hashMap = this.A03;
        }
        return hashMap;
    }

    public final void A04(int i2, int i3, int i4) {
        C16490t9 r3 = this.A02;
        if (r3 != null) {
            C29061Zx r2 = new C29061Zx();
            r2.A00 = Integer.valueOf(i2);
            r2.A01 = Long.valueOf((long) i3);
            r2.A02 = Long.valueOf((long) i4);
            r3.A04(r2);
        }
    }

    public synchronized void A05(C29051Zw r5, Integer num) {
        HashMap hashMap = this.A03;
        if (hashMap == null) {
            hashMap = A03();
            this.A03 = hashMap;
        }
        if (!hashMap.containsKey(num)) {
            throw new IllegalArgumentException("Invalid PS-ID key");
        } else if (r5 == null) {
            this.A03.remove(num);
            A00().remove(num.toString()).apply();
        } else {
            this.A03.put(num, r5);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("psIdValue", r5.A01);
                jSONObject.put("rotationInDays", r5.A02);
                jSONObject.put("lastRotationTimeUtcDay", r5.A00);
                jSONObject.put("beaconEvtNumber", 0);
                A00().putString(num.toString(), jSONObject.toString()).apply();
            } catch (JSONException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("psidstore/updatePsIdRecord JEX ");
                sb.append(e2.toString());
                Log.e(sb.toString());
            }
        }
        return;
    }

    public synchronized void A06(String str, ArrayList arrayList) {
        int i2;
        String str2;
        int i3;
        HashMap hashMap = this.A03;
        if (hashMap == null) {
            hashMap = A03();
            this.A03 = hashMap;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            Integer num = (Integer) it.next();
            while (true) {
                if (i2 < arrayList.size()) {
                    if (num.intValue() == ((C29071Zy) arrayList.get(i2)).A00) {
                        break;
                    }
                    i2++;
                } else {
                    arrayList2.add(num);
                    break;
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            Integer num2 = (Integer) arrayList2.get(i4);
            C29051Zw r0 = (C29051Zw) this.A03.get(num2);
            if (r0 != null) {
                i3 = r0.A02;
                A01().edit().remove(r0.A01).apply();
            } else {
                i3 = 0;
            }
            A05((C29051Zw) null, num2);
            A04(3, num2.intValue(), i3);
        }
        long A002 = this.A04.A00();
        while (i2 < arrayList.size()) {
            C29071Zy r6 = (C29071Zy) arrayList.get(i2);
            if (!this.A03.containsKey(Integer.valueOf(r6.A00))) {
                if (str == null || r6.A00 != 113760892) {
                    str2 = UUID.randomUUID().toString();
                    A04(1, r6.A00, r6.A01);
                } else {
                    str2 = str;
                }
                C29051Zw r2 = new C29051Zw(r6.A01, str2, A002 / 86400000);
                this.A03.put(Integer.valueOf(r6.A00), r2);
                A05(r2, Integer.valueOf(r6.A00));
            }
            i2++;
        }
    }
}
