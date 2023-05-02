package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.28g  reason: invalid class name */
public final class AnonymousClass28g implements C453728e {
    public final C15860rz A00;

    public AnonymousClass28g(C15860rz r1) {
        this.A00 = r1;
    }

    public String AE0() {
        return "community_home";
    }

    public /* bridge */ /* synthetic */ boolean AHa(Object obj) {
        Jid jid = (Jid) obj;
        AnonymousClass01D r3 = this.A00.A01;
        if (!((SharedPreferences) r3.get()).getBoolean("about_community_nux_threshold_reached", false)) {
            return ((SharedPreferences) r3.get()).getStringSet("pref_about_community_nux_seen_communities", new HashSet()).contains(jid == null ? null : jid.getRawString());
        }
    }

    public void ALs(boolean z2) {
        C15860rz r2 = this.A00;
        r2.A0K().putBoolean("about_community_nux_threshold_reached", z2).apply();
        if (!z2) {
            r2.A0K().remove("pref_about_community_nux_seen_communities").apply();
        }
    }

    public /* bridge */ /* synthetic */ void AeB(Object obj) {
        boolean z2;
        SharedPreferences.Editor A0K;
        Jid jid = (Jid) obj;
        if (jid != null) {
            C15860rz r3 = this.A00;
            Set<String> stringSet = ((SharedPreferences) r3.A01.get()).getStringSet("pref_about_community_nux_seen_communities", new HashSet());
            stringSet.add(jid.getRawString());
            r3.A0K().putStringSet("pref_about_community_nux_seen_communities", stringSet).apply();
            z2 = true;
            if (stringSet.size() >= 1) {
                A0K = r3.A0K();
            } else {
                return;
            }
        } else {
            z2 = true;
            A0K = this.A00.A0K();
        }
        A0K.putBoolean("about_community_nux_threshold_reached", z2).apply();
    }
}
