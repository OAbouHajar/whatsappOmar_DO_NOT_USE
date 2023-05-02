package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.27r  reason: invalid class name and case insensitive filesystem */
public class C452527r {
    public C452727t A00 = null;
    public Map A01;
    public Set A02;
    public final AnonymousClass12D A03;

    public C452527r(AnonymousClass12D r2) {
        this.A03 = r2;
        A01();
    }

    public final void A00() {
        AnonymousClass12D r4;
        SharedPreferences.Editor editor;
        Set<C452727t> set;
        try {
            C452727t r0 = this.A00;
            if (r0 == null || !r0.A02()) {
                r4 = this.A03;
                r4.A01().edit().remove("current_running_sync").apply();
            } else {
                r4 = this.A03;
                r4.A01().edit().putString("current_running_sync", this.A00.A01()).apply();
            }
        } catch (JSONException unused) {
            r4 = this.A03;
            r4.A01().edit().remove("current_running_sync").apply();
        }
        if (!this.A02.isEmpty()) {
            HashSet hashSet = new HashSet();
            synchronized (this) {
                set = this.A02;
            }
            for (C452727t r1 : set) {
                try {
                    if (r1.A02()) {
                        hashSet.add(r1.A01());
                    }
                } catch (JSONException unused2) {
                }
            }
            if (!hashSet.isEmpty()) {
                editor = r4.A01().edit().putStringSet("queued_running_sync_set", hashSet);
                editor.apply();
            }
        }
        editor = r4.A01().edit().remove("queued_running_sync_set");
        editor.apply();
    }

    public synchronized void A01() {
        this.A02 = new HashSet();
        this.A01 = new HashMap();
    }

    public synchronized void A02(C452727t r3, Runnable runnable, long j2) {
        this.A02.add(r3);
        this.A01.put(r3, new C452827u(runnable, j2));
        A00();
    }
}
