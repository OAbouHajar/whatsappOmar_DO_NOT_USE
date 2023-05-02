package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1DN  reason: invalid class name */
public class AnonymousClass1DN {
    public SharedPreferences A00;
    public AnonymousClass1WA A01;
    public ConcurrentHashMap A02 = new ConcurrentHashMap(4);
    public final C16440t3 A03;
    public final C14710pd A04;
    public final AnonymousClass176 A05;
    public final C17020u3 A06;
    public final AnonymousClass13K A07;
    public final AnonymousClass13L A08;
    public final AnonymousClass1DM A09;
    public final C16320sq A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public AnonymousClass1DN(C16440t3 r3, C14710pd r4, AnonymousClass176 r5, C17020u3 r6, AnonymousClass13K r7, AnonymousClass13L r8, AnonymousClass1DM r9, C16320sq r10) {
        this.A03 = r3;
        this.A04 = r4;
        this.A0A = r10;
        this.A07 = r7;
        this.A05 = r5;
        this.A08 = r8;
        this.A06 = r6;
        this.A09 = r9;
    }

    public final long A00() {
        C14710pd r3 = this.A04;
        C16620tM r2 = C16620tM.A02;
        if (r3.A03(r2, 1486) == 2) {
            return -1;
        }
        try {
            long A032 = (long) r3.A03(r2, 1392);
            if (A032 > 0) {
                return A032;
            }
            return 1209600;
        } catch (IllegalArgumentException unused) {
            Log.e("noticebadgemanager/getbadgeexpiretimeinseconds duration abprops is not defined");
            return 1209600;
        }
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A06.A00("notice_store");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public final void A02() {
        for (Map.Entry next : A01().getAll().entrySet()) {
            try {
                Integer valueOf = Integer.valueOf((String) next.getKey());
                try {
                    JSONObject jSONObject = new JSONObject((String) next.getValue());
                    this.A02.put(valueOf, new C52512dv(jSONObject.getInt("viewId"), jSONObject.getInt("badgeStage"), jSONObject.getLong("enabledTimeInSeconds"), jSONObject.getLong("selectedTimeInSeconds")));
                } catch (JSONException e2) {
                    StringBuilder sb = new StringBuilder("noticebadgemanager/loadFromFile bad json ");
                    sb.append(e2.toString());
                    Log.e(sb.toString());
                    A01().edit().remove((String) next.getKey()).apply();
                } catch (NumberFormatException e3) {
                    StringBuilder sb2 = new StringBuilder("noticebadgemanager/loadFromFile corrupted number ");
                    sb2.append(e3.toString());
                    Log.e(sb2.toString());
                    A01().edit().remove((String) next.getKey()).apply();
                }
            } catch (NumberFormatException unused) {
                Log.e("noticebadgemanager/loadfromfile notice id key is corrupted");
            }
        }
    }

    public final void A03(int i2, int i3) {
        ConcurrentHashMap concurrentHashMap = this.A02;
        if (concurrentHashMap.size() == 0) {
            A02();
        }
        C52512dv r4 = (C52512dv) concurrentHashMap.get(Integer.valueOf(i2));
        if (r4 != null) {
            int i4 = r4.A00;
            if (i3 > i4 && i4 != -1) {
                r4.A00 = i3;
                if (i4 < 4 && i3 == 4) {
                    r4.A03 = this.A03.A00() / 1000;
                }
                A04(r4, i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid noticeId");
    }

    public final void A04(C52512dv r5, int i2) {
        this.A02.put(Integer.valueOf(i2), r5);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewId", r5.A01);
            jSONObject.put("badgeStage", r5.A00);
            jSONObject.put("enabledTimeInSeconds", r5.A02);
            jSONObject.put("selectedTimeInSeconds", r5.A03);
            A01().edit().putString(String.valueOf(i2), jSONObject.toString()).apply();
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder("noticebadgemanager/savenotice JEX ");
            sb.append(e2.toString());
            Log.e(sb.toString());
        }
    }

    public final void A05(Runnable runnable) {
        AnonymousClass1WA r2 = this.A01;
        if (r2 == null) {
            r2 = new AnonymousClass1WA(this.A0A, false);
            this.A01 = r2;
        }
        r2.execute(runnable);
    }

    public boolean A06() {
        int i2;
        if (this.A0C) {
            ConcurrentHashMap concurrentHashMap = this.A02;
            for (Object next : concurrentHashMap.keySet()) {
                C52512dv r2 = (C52512dv) concurrentHashMap.get(next);
                if (r2 != null && (i2 = r2.A00) > -1 && i2 < 4) {
                    if ((this.A03.A00() / 1000) - r2.A02 < A00()) {
                        return true;
                    }
                    A05(new RunnableRunnableShape9S0200000_I0_7(this, 29, next));
                }
            }
        }
        return false;
    }
}
