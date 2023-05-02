package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0w8  reason: invalid class name and case insensitive filesystem */
public class C18090w8 {
    public final C15900s5 A00;
    public final C16000sG A01;
    public final C16440t3 A02;
    public final C14710pd A03;
    public final AnonymousClass175 A04;
    public final C18300wT A05;
    public final AnonymousClass174 A06;
    public final C224918d A07;

    public C18090w8(C15900s5 r1, C16000sG r2, C16440t3 r3, C14710pd r4, AnonymousClass175 r5, C18300wT r6, AnonymousClass174 r7, C224918d r8) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
    }

    public int A00(UserJid userJid) {
        C16010sH A08;
        String A042 = C24561Gk.A04(userJid);
        if (!(userJid == null || (A08 = this.A01.A08(userJid)) == null)) {
            A08.A0H();
        }
        return A02(A042);
    }

    public int A01(String str) {
        C16010sH A08;
        UserJid nullable = UserJid.getNullable(str);
        if (!(nullable == null || (A08 = this.A01.A08(nullable)) == null)) {
            A08.A0H();
        }
        return A02(str);
    }

    public int A02(String str) {
        Set<C30681cm> set = (Set) C40041tT.A00.get(C30681cm.A01(C39851tA.A02(str)));
        AnonymousClass174 r4 = this.A06;
        C30681cm A012 = r4.A01();
        if (set == null || A012 == null) {
            return 1;
        }
        for (C30681cm r0 : set) {
            if (r0.A03.equals(A012.A03)) {
                r4.A01();
                return 2;
            }
        }
        return 1;
    }

    public Map A03() {
        HashMap hashMap = new HashMap();
        String A062 = this.A03.A06(C16620tM.A02, 2351);
        if (!TextUtils.isEmpty(A062)) {
            try {
                JSONArray optJSONArray = new JSONObject(A062).optJSONArray("psp_list");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                        String optString = jSONObject.optString("id");
                        String optString2 = jSONObject.optString("display_name");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            hashMap.put(optString, optString2);
                        }
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentsGatingManager/getP2mLitePspMap can't construct psp json map from abprops");
            }
        }
        return hashMap;
    }

    public boolean A04() {
        return A0A() && this.A03.A0E(C16620tM.A02, 1746);
    }

    public boolean A05() {
        return A0C(2) && this.A03.A0E(C16620tM.A02, 1159);
    }

    public boolean A06() {
        return A0C(1) && this.A03.A0E(C16620tM.A02, 1586);
    }

    public boolean A07() {
        return this.A00.A05(C15910s6.A0g);
    }

    public boolean A08() {
        if (A0C(0)) {
            C30681cm r1 = C30681cm.A0D;
            AnonymousClass174 r2 = this.A06;
            if (r1 == r2.A01() && A0A()) {
                return true;
            }
            if (C30681cm.A0E == r2.A01() && this.A03.A0E(C16620tM.A02, 733)) {
                return true;
            }
        }
        C30681cm r12 = C30681cm.A0D;
        AnonymousClass174 r22 = this.A06;
        return (r12 == r22.A01() || C30681cm.A0E == r22.A01()) && this.A03.A0E(C16620tM.A02, 888);
    }

    public boolean A09() {
        return A0C(0) || A05();
    }

    public boolean A0A() {
        return this.A06.A03() && this.A00.A05(C15910s6.A0g) && this.A03.A0E(C16620tM.A02, 1158);
    }

    public boolean A0B() {
        if (!A07()) {
            return false;
        }
        C18300wT r3 = this.A05;
        return r3.A01().getBoolean("has_p2mlite_account", false) || r3.A01().getBoolean("has_p2mlite_transactions", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(int r10) {
        /*
            r9 = this;
            r6 = 1
            if (r10 == 0) goto L_0x002d
            if (r10 == r6) goto L_0x0028
            r8 = 0
        L_0x0006:
            X.174 r0 = r9.A06
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0079
            if (r8 != 0) goto L_0x0075
            X.0wT r7 = r9.A05
            android.content.SharedPreferences r2 = r7.A01()
            java.lang.String r1 = "pref_dog_food_country_code"
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r0 == 0) goto L_0x005b
            java.lang.String r1 = "setMockedCountry() not supported in non-debug builds"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0028:
            X.0s5 r1 = r9.A00
            X.0s8 r0 = X.C15910s6.A0g
            goto L_0x0031
        L_0x002d:
            X.0s5 r1 = r9.A00
            X.0s8 r0 = X.C15910s6.A0h
        L_0x0031:
            boolean r8 = r1.A05(r0)
            if (r8 == 0) goto L_0x0006
            X.0wT r7 = r9.A05
            java.lang.String r5 = "payments_enabled_till"
            android.content.SharedPreferences r2 = r7.A01()
            r0 = -1
            long r3 = r2.getLong(r5, r0)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0006
            android.content.SharedPreferences r0 = r7.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)
            r0.apply()
            goto L_0x0006
        L_0x005b:
            X.0t3 r0 = r9.A02
            long r4 = r0.A00()
            if (r10 == 0) goto L_0x0076
            if (r10 == r6) goto L_0x0076
            java.lang.String r3 = "merchant_payments_enabled_till"
        L_0x0067:
            android.content.SharedPreferences r2 = r7.A01()
            r0 = -1
            long r1 = r2.getLong(r3, r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0079
        L_0x0075:
            return r6
        L_0x0076:
            java.lang.String r3 = "payments_enabled_till"
            goto L_0x0067
        L_0x0079:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18090w8.A0C(int):boolean");
    }

    public boolean A0D(String str) {
        if (!TextUtils.isEmpty(str)) {
            return A03().containsKey(str);
        }
        return false;
    }
}
