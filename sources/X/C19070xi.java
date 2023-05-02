package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0xi  reason: invalid class name and case insensitive filesystem */
public class C19070xi {
    public C19060xh A00;
    public final SharedPreferences A01;
    public final C16440t3 A02;
    public final C16980tz A03;
    public final AnonymousClass10J A04;
    public final C222217c A05;
    public final C14720pe A06;
    public final C226318r A07;
    public final C17020u3 A08;

    public C19070xi(C16440t3 r2, C16980tz r3, AnonymousClass10J r4, C222217c r5, C14720pe r6, C226318r r7, C17020u3 r8) {
        this.A02 = r2;
        this.A06 = r6;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A07 = r7;
        this.A01 = r8.A00("ab-props");
        this.A08 = r8;
    }

    public synchronized long A00() {
        return this.A01.getLong("ab_props:sys:last_refresh_time", 0);
    }

    public synchronized String A01() {
        Set<String> stringSet;
        stringSet = this.A01.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
        return stringSet == null ? "" : TextUtils.join(",", stringSet);
    }

    public synchronized void A02() {
        AnonymousClass10J r0 = this.A04;
        r0.A09();
        r0.A0F().edit().clear().apply();
    }

    public synchronized void A03(int i2) {
        SharedPreferences.Editor edit = this.A01.edit();
        edit.putInt("ab_props:sys:fetch_attemp_count", i2);
        edit.apply();
    }

    public synchronized void A04(int i2) {
        SharedPreferences.Editor edit = this.A01.edit();
        edit.putInt("ab_props:sys:last_error_code", i2);
        edit.apply();
    }

    public final boolean A05(SharedPreferences.Editor editor, String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            String num = Integer.toString(i2);
            try {
                C14720pe r4 = this.A06;
                boolean z2 = r4 instanceof C14710pd;
                C17930vs r0 = z2 ? ((C14710pd) r4).A00 : ((AnonymousClass10J) r4).A00.A00;
                Integer valueOf = Integer.valueOf(i2);
                if (r0.containsKey(valueOf)) {
                    boolean z3 = false;
                    if (Integer.parseInt(str) != 0) {
                        z3 = true;
                    }
                    editor.putBoolean(num, z3);
                    return true;
                }
                if ((z2 ? ((C14710pd) r4).A02 : ((AnonymousClass10J) r4).A00.A02).containsKey(valueOf)) {
                    editor.putInt(num, Integer.parseInt(str));
                    return true;
                }
                if ((z2 ? ((C14710pd) r4).A01 : ((AnonymousClass10J) r4).A00.A01).containsKey(valueOf)) {
                    editor.putFloat(num, Float.parseFloat(str));
                    return true;
                }
                if (!(z2 ? ((C14710pd) r4).A04 : ((AnonymousClass10J) r4).A00.A04).containsKey(valueOf)) {
                    if ((z2 ? ((C14710pd) r4).A03 : ((AnonymousClass10J) r4).A00.A03).containsKey(valueOf)) {
                        new JSONObject(str);
                    }
                }
                editor.putString(num, str);
                return true;
            } catch (NumberFormatException | JSONException e2) {
                StringBuilder sb = new StringBuilder("ABPropsManager/invalid format for config; configCode=");
                sb.append(i2);
                sb.append("; value=");
                sb.append(str);
                Log.e(sb.toString(), e2);
            }
        }
        return false;
    }
}
