package X;

import android.content.SharedPreferences;
import com.facebook.redex.IDxProviderShape156S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.UUID;

/* renamed from: X.0su  reason: invalid class name and case insensitive filesystem */
public class C16360su {
    public final C16300so A00;
    public final C17020u3 A01;
    public final AnonymousClass01D A02 = new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(this, 38));

    public C16360su(C16300so r4, C17020u3 r5) {
        this.A00 = r4;
        this.A01 = r5;
    }

    public C37881pt A00() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.A02.get();
        String string = sharedPreferences.getString("/export/enc/active/owner", (String) null);
        String string2 = sharedPreferences.getString("/export/enc/active/version", (String) null);
        String string3 = sharedPreferences.getString("/export/enc/active/account_hash", (String) null);
        String string4 = sharedPreferences.getString("/export/enc/active/server_salt", (String) null);
        long j2 = sharedPreferences.getLong("/export/enc/active/last_fetch_time", 0);
        String string5 = sharedPreferences.getString("/export/enc/active/seed", (String) null);
        if (!(string == null || string2 == null || string3 == null || string4 == null || string5 == null)) {
            try {
                return new C37881pt(UserJid.get(string), string2, string3, string4, string5, j2);
            } catch (AnonymousClass1W4 e2) {
                C16300so r3 = this.A00;
                StringBuilder sb = new StringBuilder("invalid jid: ");
                sb.append(string);
                r3.A03("xpm-export-preferences-active", sb.toString(), e2);
            }
        }
        return null;
    }

    public C37881pt A01() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.A02.get();
        String string = sharedPreferences.getString("/export/enc/prefetched/owner", (String) null);
        String string2 = sharedPreferences.getString("/export/enc/prefetched/version", (String) null);
        String string3 = sharedPreferences.getString("/export/enc/prefetched/account_hash", (String) null);
        String string4 = sharedPreferences.getString("/export/enc/prefetched/server_salt", (String) null);
        long j2 = sharedPreferences.getLong("/export/enc/prefetched/last_fetch_time", 0);
        String string5 = sharedPreferences.getString("/export/enc/prefetched/seed", (String) null);
        if (!(string == null || string2 == null || string3 == null || string4 == null || string5 == null)) {
            try {
                return new C37881pt(UserJid.get(string), string2, string3, string4, string5, j2);
            } catch (AnonymousClass1W4 e2) {
                C16300so r3 = this.A00;
                StringBuilder sb = new StringBuilder("invalid jid: ");
                sb.append(string);
                r3.A03("xpm-export-preferences-prefetched", sb.toString(), e2);
            }
        }
        return null;
    }

    public String A02() {
        AnonymousClass01D r3 = this.A02;
        String string = ((SharedPreferences) r3.get()).getString("/export/logging/funnelId", (String) null);
        if (string != null) {
            return string;
        }
        String obj = UUID.randomUUID().toString();
        ((SharedPreferences) r3.get()).edit().putString("/export/logging/funnelId", obj).apply();
        return obj;
    }

    public void A03() {
        ((SharedPreferences) this.A02.get()).edit().remove("/export/logging/funnelId").apply();
    }

    public void A04() {
        ((SharedPreferences) this.A02.get()).edit().remove("/export/enc/prefetched/owner").remove("/export/enc/prefetched/version").remove("/export/enc/prefetched/account_hash").remove("/export/enc/prefetched/server_salt").remove("/export/enc/prefetched/last_fetch_time").remove("/export/enc/prefetched/seed").apply();
    }
}
