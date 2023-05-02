package X;

import android.os.SystemClock;
import com.obwhatsapp.infra.graphql.generated.mex.UpdateUserStatusQueryImpl;
import com.obwhatsapp.infra.graphql.generated.mex.calls.XWA2UserUpdateVersions;
import com.obwhatsapp.infra.graphql.generated.mex.missing.UpdateUserStatusRequestString;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1kW  reason: invalid class name and case insensitive filesystem */
public class C34591kW {
    public final C16300so A00;
    public final C16980tz A01;
    public final AnonymousClass12C A02;
    public final C17190ug A03;
    public final C34571kU A04;

    public C34591kW(C16300so r1, C16980tz r2, AnonymousClass12C r3, C17190ug r4, C34571kU r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void A00(UserJid userJid, long j2) {
        C28371Vv r4;
        AnonymousClass51O r3;
        C28371Vv r0;
        C17190ug r15 = this.A03;
        String A022 = r15.A02();
        AnonymousClass12C r5 = this.A02;
        UserJid userJid2 = userJid;
        C18450wi.A0H(userJid2, 0);
        if (!r5.A01(userJid2) || (r5.A01.A03(C16620tM.A02, 2250) & 1) != 1) {
            ArrayList arrayList = new ArrayList();
            long j3 = j2 / 1000;
            if (j3 == 0) {
                r0 = new C28371Vv("user", new C35081lL[]{new C35081lL((Jid) userJid2, "jid")});
            } else {
                r0 = new C28371Vv("user", new C35081lL[]{new C35081lL((Jid) userJid2, "jid"), new C35081lL("t", Long.toString(j3))});
            }
            arrayList.add(r0);
            r4 = new C28371Vv(new C28371Vv("status", (C35081lL[]) null, (C28371Vv[]) arrayList.toArray(new C28371Vv[0])), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "status"), new C35081lL("type", "get"), new C35081lL((Jid) C34791ks.A00, "to")});
            r3 = new AnonymousClass33x(userJid2, this);
        } else {
            XWA2UserUpdateVersions xWA2UserUpdateVersions = new XWA2UserUpdateVersions();
            xWA2UserUpdateVersions.setUserId(userJid2.user);
            C34641kb of = C34641kb.of(xWA2UserUpdateVersions);
            C34641kb of2 = C34641kb.of("STATUS");
            C12220k2 r32 = ((UpdateUserStatusQueryImpl.Builder) new UpdateUserStatusQueryImpl.Builder().setUsers(of).setUpdates(of2)).build().A01;
            C25401Jq[] r10 = {new C25401Jq("user_id", userJid2.user)};
            JSONArray jSONArray = new JSONArray();
            C25401Jq[] r02 = {r10[0]};
            JSONObject jSONObject = new JSONObject();
            C25401Jq r03 = r02[0];
            jSONObject.put((String) r03.first, r03.second);
            jSONArray.put(jSONObject);
            Object[] objArr = {of2.get(0)};
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(objArr[0]);
            String str = ((UpdateUserStatusRequestString) r32).A00;
            C25401Jq[] r33 = {new C25401Jq("users", jSONArray), new C25401Jq("updates", jSONArray2)};
            C18450wi.A0H(str, 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("operationName", str);
            jSONObject2.put("query", "query UpdateUserStatusQuery($users:[XWA2UserUpdateVersions!]!$updates:[XWA2UserUpdateCategory!]!){xwa2_users_updates_since(users:$users,updates:$updates){jid updates{__typename ...on XWA2UserStatusUpdate{dhash text}}}}");
            C25401Jq[] r9 = (C25401Jq[]) Arrays.copyOf(r33, 2);
            C18450wi.A0H(r9, 0);
            JSONObject jSONObject3 = new JSONObject();
            int length = r9.length;
            int i2 = 0;
            while (i2 < length) {
                C25401Jq r04 = r9[i2];
                i2++;
                jSONObject3.put((String) r04.first, r04.second);
            }
            jSONObject2.put("variables", jSONObject3);
            String jSONObject4 = jSONObject2.toString(1);
            C18450wi.A0B(jSONObject4);
            AnonymousClass38K r05 = new AnonymousClass38K(new AnonymousClass2BJ(A022), jSONObject4);
            r4 = r05.A00;
            r3 = new C605533y(userJid2, this, r05);
        }
        if (r5.A01(userJid2)) {
            C34551kS r7 = r5.A03;
            long uptimeMillis = SystemClock.uptimeMillis() - r7.A01;
            if (!C18450wi.A0R(userJid2.user, r7.A02) || uptimeMillis >= AnonymousClass1NO.A0L) {
                r7.A02 = userJid2.user;
                r7.A00 = 0;
                r7.A01 = SystemClock.uptimeMillis();
            } else {
                int i3 = r7.A00 + 1;
                r7.A00 = i3;
                if (i3 > 3) {
                    this.A04.AU1(userJid2);
                    return;
                }
            }
        }
        C1052458t r1 = new C1052458t(r4, r3);
        if (r5.A01(userJid2)) {
            r1.AIU(r5.A00);
        }
        r15.A0G(r3, r4, A022, 41, 0);
    }
}
