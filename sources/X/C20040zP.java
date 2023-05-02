package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0zP  reason: invalid class name and case insensitive filesystem */
public abstract class C20040zP {
    public AnonymousClass21U A00(UserJid userJid) {
        if (this instanceof AnonymousClass1T1) {
            return ((AnonymousClass1T1) this).A07(userJid);
        }
        if (!(this instanceof C27741Sy)) {
            Object obj = ((C20030zO) this).A00.get(1);
            AnonymousClass00B.A06(obj);
            AnonymousClass21U A00 = ((C20040zP) obj).A00(userJid);
            if (A00 != null) {
                return A00;
            }
        }
        return new C47352Ip();
    }

    public void A01() {
        if (this instanceof AnonymousClass1T1) {
            AnonymousClass1T0 r7 = ((AnonymousClass1T1) this).A01;
            ArrayList arrayList = new ArrayList();
            C17020u3 r4 = r7.A02;
            Map<String, ?> all = r4.A00("ctwa_ads_entry_points").getAll();
            for (Map.Entry next : all.entrySet()) {
                String str = (String) next.getKey();
                Object obj = all.get(str);
                if (obj != null) {
                    try {
                        arrayList.add(r7.A01.A00(obj.toString()));
                    } catch (C47342Io e2) {
                        r7.A01(e2, "getAllObjects");
                        r4.A00("ctwa_ads_entry_points").edit().remove(str).apply();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("JidKeyedSharedPreferencesStore/getAllEntryPoints/ null pref value for key=");
                    sb.append(next);
                    Log.e(sb.toString());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass21V r5 = (AnonymousClass21V) it.next();
                if (System.currentTimeMillis() - r5.A01 > AnonymousClass21V.A05) {
                    r7.A00(r5.A00);
                }
            }
        } else if (!(this instanceof C27741Sy)) {
            for (Map.Entry value : ((C20030zO) this).A00.entrySet()) {
                ((C20040zP) value.getValue()).A01();
            }
        }
    }

    public void A02(AnonymousClass21U r3) {
        if (this instanceof AnonymousClass1T1) {
            ((AnonymousClass1T1) this).A01.A00(((AnonymousClass21W) r3).A00);
        } else if (!(this instanceof C27741Sy)) {
            Object obj = ((C20030zO) this).A00.get(Integer.valueOf(r3.A00));
            AnonymousClass00B.A06(obj);
            ((C20040zP) obj).A02(r3);
        }
    }

    public void A03(AnonymousClass21U r3) {
        if (this instanceof AnonymousClass1T1) {
            ((AnonymousClass1T1) this).A01.A00(((AnonymousClass21W) r3).A00);
        } else if (!(this instanceof C27741Sy)) {
            Object obj = ((C20030zO) this).A00.get(Integer.valueOf(r3.A00));
            AnonymousClass00B.A06(obj);
            ((C20040zP) obj).A03(r3);
        }
    }

    public void A04(AnonymousClass21U r7) {
        if (this instanceof AnonymousClass1T1) {
            AnonymousClass21V r72 = (AnonymousClass21V) r7;
            AnonymousClass1T0 r3 = ((AnonymousClass1T1) this).A01;
            try {
                UserJid userJid = r72.A00;
                String rawString = userJid.getRawString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("brj", userJid.getRawString());
                jSONObject.put("ap", r72.A02);
                jSONObject.put("s", r72.A03);
                jSONObject.put("ct", r72.A01);
                String str = r72.A04;
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("tb_t", str);
                    jSONObject.put("tb_a", r72.A00);
                }
                r3.A02.A00("ctwa_ads_entry_points").edit().putString(rawString, jSONObject.toString()).apply();
            } catch (JSONException e2) {
                throw new C47342Io("CTWA: AdsEntryPointTransformer/toData/JSONException", e2);
            } catch (C47342Io e3) {
                r3.A01(e3, "saveObject");
            }
        } else if (!(this instanceof C27741Sy)) {
            Object obj = ((C20030zO) this).A00.get(Integer.valueOf(r7.A00));
            AnonymousClass00B.A06(obj);
            ((C20040zP) obj).A04(r7);
        }
    }

    public void A05(AnonymousClass21U r6, C47322Im r7) {
        if (this instanceof AnonymousClass1T1) {
            AnonymousClass21V r62 = (AnonymousClass21V) r6;
            if (((AnonymousClass1T1) this).A03.A01()) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    C28611Wu r4 = new C28611Wu(r62.A02.getBytes(AnonymousClass01S.A08));
                    r7.A03();
                    C47332In r1 = (C47332In) r7.A00;
                    r1.A00 |= 4;
                    r1.A03 = r4;
                    String str = r62.A03;
                    r7.A03();
                    C47332In r12 = (C47332In) r7.A00;
                    r12.A00 |= 2;
                    r12.A04 = str;
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - r62.A01);
                    r7.A03();
                    C47332In r13 = (C47332In) r7.A00;
                    r13.A00 |= 8;
                    r13.A01 = seconds;
                } catch (Exception e2) {
                    Log.e("CtwaAdsEntryPoint/fillE2ECallInfo/failed to fill E2E context info/exception=", e2);
                }
            }
        } else if (!(this instanceof C27741Sy)) {
            Object obj = ((C20030zO) this).A00.get(Integer.valueOf(r6.A00));
            AnonymousClass00B.A06(obj);
            ((C20040zP) obj).A05(r6, r7);
        }
    }

    public void A06(AnonymousClass21U r5, C16740tZ r6) {
        if (this instanceof AnonymousClass1T1) {
            AnonymousClass1T1 r3 = (AnonymousClass1T1) this;
            AnonymousClass21W r52 = (AnonymousClass21W) r5;
            if (r3.A03.A01()) {
                r3.A02.A01(r52.A00, 0);
                r6.A0J = r52;
            }
            r3.A02.A01(r52.A00, 1);
        } else if (!(this instanceof C27741Sy)) {
            Object obj = ((C20030zO) this).A00.get(Integer.valueOf(r5.A00));
            AnonymousClass00B.A06(obj);
            ((C20040zP) obj).A06(r5, r6);
        }
    }
}
