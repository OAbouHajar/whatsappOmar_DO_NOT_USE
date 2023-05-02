package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.17D  reason: invalid class name */
public class AnonymousClass17D {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass17D(C17020u3 r1) {
        this.A01 = r1;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("community_shared_pref");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A01(GroupJid groupJid) {
        Log.i("CommunitySharedPrefs/clearTempGroupType");
        SharedPreferences.Editor edit = A00().edit();
        StringBuilder sb = new StringBuilder("create_");
        sb.append(groupJid.getRawString());
        edit.remove(sb.toString()).apply();
    }

    public void A02(GroupJid groupJid, boolean z2) {
        StringBuilder sb = new StringBuilder("CommunitySharedPrefs/setTempIsClosed()/groupType = ");
        sb.append(z2);
        Log.i(sb.toString());
        SharedPreferences.Editor edit = A00().edit();
        StringBuilder sb2 = new StringBuilder("closed_");
        sb2.append(groupJid.getRawString());
        edit.putBoolean(sb2.toString(), z2).apply();
    }
}
