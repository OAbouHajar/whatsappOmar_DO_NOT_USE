package X;

import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2Dr  reason: invalid class name and case insensitive filesystem */
public class C46322Dr extends AnonymousClass2Dq {
    public final C46312Dn A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public C46322Dr(C46312Dn r1, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        super(str3);
        this.A06 = str;
        this.A05 = str2;
        this.A08 = list;
        this.A07 = str4;
        this.A01 = str5;
        this.A00 = r1;
        this.A02 = str6;
        this.A04 = str7;
        this.A03 = str8;
    }

    public static C46322Dr A00(Bundle bundle) {
        Bundle bundle2 = bundle;
        String string = bundle2.getString("icon_light_url");
        AnonymousClass00B.A06(string);
        String string2 = bundle2.getString("icon_dark_url");
        AnonymousClass00B.A06(string2);
        String string3 = bundle2.getString("icon_description");
        AnonymousClass00B.A06(string3);
        String string4 = bundle2.getString("title");
        AnonymousClass00B.A06(string4);
        int i2 = bundle2.getInt("bullets_size", 0);
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            StringBuilder sb = new StringBuilder("bullet_text_");
            sb.append(i3);
            String string5 = bundle2.getString(sb.toString());
            AnonymousClass00B.A06(string5);
            StringBuilder sb2 = new StringBuilder("bullet_icon_light_url_");
            sb2.append(i3);
            String string6 = bundle2.getString(sb2.toString());
            StringBuilder sb3 = new StringBuilder("bullet_icon_dark_url_");
            sb3.append(i3);
            arrayList.add(new AnonymousClass4W6(string5, string6, bundle2.getString(sb3.toString())));
        }
        String string7 = bundle2.getString("agree_button_text");
        AnonymousClass00B.A06(string7);
        long j2 = bundle2.getLong("start_time_millis");
        AnonymousClass2Dy r3 = null;
        AnonymousClass2Dy r4 = j2 != 0 ? new AnonymousClass2Dy(j2) : null;
        AnonymousClass2Dx r7 = new AnonymousClass2Dx(bundle2.getLongArray("duration_repeat"), bundle2.getLong("duration_static", -1));
        long j3 = bundle2.getLong("end_time_millis");
        if (j3 != 0) {
            r3 = new AnonymousClass2Dy(j3);
        }
        C46322Dr r8 = new C46322Dr(new C46312Dn(r7, r4, r3), string, string2, string3, string4, string7, bundle2.getString("body"), bundle2.getString("footer"), bundle2.getString("dismiss_button_text"), arrayList);
        String string8 = bundle2.getString("light_icon_path");
        r8.A01 = string8 == null ? null : new File(string8);
        String string9 = bundle2.getString("dark_icon_path");
        r8.A00 = string9 == null ? null : new File(string9);
        return r8;
    }

    public static C46322Dr A01(JSONObject jSONObject) {
        String string = jSONObject.getString("title");
        AnonymousClass4SF r8 = new AnonymousClass4SF(C46312Dn.A00(jSONObject.getJSONObject("timing")), jSONObject.getString("icon_light_url"), jSONObject.getString("icon_dark_url"), jSONObject.getString("icon_description"), string, jSONObject.getString("agree_button_text"));
        JSONArray jSONArray = jSONObject.getJSONArray("bullets");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            String string2 = jSONObject2.getString("bullet_text_");
            String str = null;
            String optString = jSONObject2.has("bullet_icon_light_url_") ? jSONObject2.optString("bullet_icon_light_url_") : null;
            if (jSONObject2.has("bullet_icon_dark_url_")) {
                str = jSONObject2.optString("bullet_icon_dark_url_");
            }
            r8.A08.add(new AnonymousClass4W6(string2, optString, str));
        }
        if (jSONObject.has("body")) {
            r8.A01 = jSONObject.getString("body");
        }
        if (jSONObject.has("footer")) {
            r8.A03 = jSONObject.getString("footer");
        }
        if (jSONObject.has("dismiss_button_text")) {
            r8.A02 = jSONObject.getString("dismiss_button_text");
        }
        return r8.A00();
    }

    public JSONObject A02() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", this.A07);
        jSONObject.put("icon_description", this.A02);
        jSONObject.put("agree_button_text", this.A01);
        jSONObject.put("icon_light_url", this.A06);
        jSONObject.put("icon_dark_url", this.A05);
        jSONObject.put("timing", this.A00.A01());
        JSONArray jSONArray = new JSONArray();
        for (AnonymousClass4W6 r4 : this.A08) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bullet_text_", r4.A02);
            String str = r4.A01;
            if (str != null) {
                jSONObject2.put("bullet_icon_light_url_", str);
            }
            String str2 = r4.A00;
            if (str2 != null) {
                jSONObject2.put("bullet_icon_dark_url_", str2);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("bullets", jSONArray);
        String str3 = this.A02;
        if (str3 != null) {
            jSONObject.put("body", str3);
        }
        String str4 = this.A04;
        if (str4 != null) {
            jSONObject.put("footer", str4);
        }
        String str5 = this.A03;
        if (str5 != null) {
            jSONObject.put("dismiss_button_text", str5);
        }
        return jSONObject;
    }

    public void A03(Bundle bundle) {
        bundle.putString("icon_light_url", this.A06);
        bundle.putString("icon_dark_url", this.A05);
        bundle.putString("icon_description", this.A02);
        bundle.putString("title", this.A07);
        List list = this.A08;
        bundle.putInt("bullets_size", list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            AnonymousClass4W6 r4 = (AnonymousClass4W6) list.get(i2);
            StringBuilder sb = new StringBuilder("bullet_text_");
            sb.append(i2);
            bundle.putString(sb.toString(), r4.A02);
            StringBuilder sb2 = new StringBuilder("bullet_icon_light_url_");
            sb2.append(i2);
            bundle.putString(sb2.toString(), r4.A01);
            StringBuilder sb3 = new StringBuilder("bullet_icon_dark_url_");
            sb3.append(i2);
            bundle.putString(sb3.toString(), r4.A00);
        }
        bundle.putString("agree_button_text", this.A01);
        C46312Dn r42 = this.A00;
        AnonymousClass2Dy r0 = r42.A02;
        if (r0 != null) {
            bundle.putLong("start_time_millis", r0.A00);
        }
        AnonymousClass2Dx r3 = r42.A00;
        if (r3 != null) {
            bundle.putLong("duration_static", r3.A00);
            bundle.putLongArray("duration_repeat", r3.A01);
        }
        AnonymousClass2Dy r02 = r42.A01;
        if (r02 != null) {
            bundle.putLong("end_time_millis", r02.A00);
        }
        bundle.putString("body", this.A02);
        bundle.putString("footer", this.A04);
        bundle.putString("dismiss_button_text", this.A03);
        File file = this.A01;
        if (file != null) {
            bundle.putString("light_icon_path", file.getAbsolutePath());
        }
        File file2 = this.A00;
        if (file2 != null) {
            bundle.putString("dark_icon_path", file2.getAbsolutePath());
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C46322Dr r5 = (C46322Dr) obj;
            if (!this.A06.equals(r5.A06) || !this.A05.equals(r5.A05) || !this.A07.equals(r5.A07) || !this.A08.equals(r5.A08) || !this.A01.equals(r5.A01) || !this.A00.equals(r5.A00) || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A04, r5.A04) || !C34901l3.A00(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A05, this.A07, this.A08, this.A01, this.A00, this.A02, this.A04, this.A03});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserNoticeModal{iconLightUrl='");
        sb.append(this.A06);
        sb.append('\'');
        sb.append(", iconDarkUrl='");
        sb.append(this.A05);
        sb.append('\'');
        sb.append(", iconDescription='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", title='");
        sb.append(this.A07);
        sb.append('\'');
        sb.append(", bulletPoints=");
        sb.append(this.A08);
        sb.append(", agreeButtonText='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append(", timing=");
        sb.append(this.A00);
        sb.append(", body='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", footer='");
        sb.append(this.A04);
        sb.append('\'');
        sb.append(", dismissButtonText='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
