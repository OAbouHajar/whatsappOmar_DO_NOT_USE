package X;

import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.27t  reason: invalid class name and case insensitive filesystem */
public class C452727t {
    public int A00 = 0;
    public boolean A01;
    public final C34861kz A02;
    public final List A03 = new ArrayList();
    public final List A04;
    public final Set A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C452727t(C452927v r3) {
        this.A02 = r3.A05;
        this.A01 = r3.A02;
        this.A07 = r3.A03;
        this.A08 = r3.A04;
        this.A06 = r3.A01;
        this.A04 = r3.A06;
        this.A05 = r3.A07;
        C453027w r1 = r3.A00;
        this.A0A = r1.A01;
        this.A0G = r1.A07;
        this.A0H = r1.A08;
        this.A0F = r1.A06;
        this.A09 = r1.A00;
        this.A0B = r1.A02;
        this.A0E = r1.A05;
        this.A0C = r1.A03;
        this.A0D = r1.A04;
    }

    public static C452727t A00(String str) {
        JSONObject jSONObject = new JSONObject(str);
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("sync_jid_hash")) {
            JSONArray jSONArray = jSONObject.getJSONArray("sync_jid_hash");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(Base64.decode((String) jSONArray.get(i2), 0));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("sync_jid")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("sync_jid");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                UserJid nullable = UserJid.getNullable((String) jSONArray2.get(i3));
                if (nullable != null) {
                    arrayList2.add(nullable);
                }
            }
        }
        int i4 = jSONObject.getInt("sync_type_code");
        for (C34861kz r2 : C34861kz.values()) {
            if (r2.code == i4) {
                C452927v r3 = new C452927v(r2);
                r3.A02 = jSONObject.getBoolean("sync_is_urgent");
                r3.A03 = jSONObject.getBoolean("sync_only_if_changed");
                r3.A04 = jSONObject.getBoolean("sync_only_if_registered");
                r3.A01 = jSONObject.getBoolean("sync_clear_whatsapp_sync_data");
                r3.A00 = new C453027w(jSONObject.optBoolean("sync_sidelist", true), jSONObject.optBoolean("sync_status", true), jSONObject.optBoolean("sync_picture", true), jSONObject.optBoolean("sync_business", true), jSONObject.optBoolean("sync_devices", true), jSONObject.optBoolean("sync_payment", true), jSONObject.optBoolean("sync_disappearing_mode", true), jSONObject.optBoolean("sync_lid", true), jSONObject.optBoolean("sync_contact", true));
                C452927v.A00(r3, arrayList);
                r3.A07.addAll(arrayList2);
                C452727t A012 = r3.A01();
                A012.A00 = jSONObject.getInt("sync_retry_count");
                if (jSONObject.getBoolean("sync_should_retry")) {
                    A012.A03.add(new AnonymousClass28Q(true));
                }
                return A012;
            }
        }
        return null;
    }

    public String A01() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sync_type_code", this.A02.code);
        jSONObject.put("sync_is_urgent", this.A01);
        jSONObject.put("sync_only_if_changed", this.A07);
        jSONObject.put("sync_only_if_registered", this.A08);
        jSONObject.put("sync_clear_whatsapp_sync_data", this.A06);
        jSONObject.put("sync_should_retry", A02());
        jSONObject.put("sync_retry_count", this.A00);
        jSONObject.put("sync_contact", this.A0A);
        jSONObject.put("sync_sidelist", this.A0G);
        jSONObject.put("sync_status", this.A0H);
        jSONObject.put("sync_picture", this.A0F);
        jSONObject.put("sync_disappearing_mode", this.A0C);
        jSONObject.put("sync_lid", this.A0D);
        List<byte[]> list = this.A04;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (byte[] encodeToString : list) {
                arrayList.add(Base64.encodeToString(encodeToString, 0));
            }
            jSONObject.put("sync_jid_hash", new JSONArray(arrayList));
        }
        Set<Jid> set = this.A05;
        if (!set.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Jid rawString : set) {
                arrayList2.add(rawString.getRawString());
            }
            jSONObject.put("sync_jid", new JSONArray(arrayList2));
        }
        return jSONObject.toString();
    }

    public boolean A02() {
        for (AnonymousClass28Q r0 : this.A03) {
            if (r0.A00) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncRequest, mode=");
        C34861kz r1 = this.A02;
        sb.append(r1.mode.modeString);
        sb.append(", context=");
        sb.append(r1.context.contextString);
        sb.append(", protocols=");
        String str = "";
        sb.append(this.A0A ? "C" : str);
        sb.append(this.A0G ? "I" : str);
        sb.append(this.A0H ? "S" : str);
        sb.append(this.A09 ? "B" : str);
        sb.append(this.A0B ? "D" : str);
        sb.append(this.A0E ? "P" : str);
        sb.append(this.A0C ? "M" : str);
        if (this.A0D) {
            str = "L";
        }
        sb.append(str);
        return sb.toString();
    }
}
