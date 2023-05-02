package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.12T  reason: invalid class name */
public class AnonymousClass12T {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass12T(C17020u3 r1) {
        this.A01 = r1;
    }

    public final SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A002 = this.A01.A00(AnonymousClass01S.A07);
        this.A00 = A002;
        return A002;
    }

    public void A01(String str) {
        ArrayList arrayList = new ArrayList();
        for (String next : A00().getAll().keySet()) {
            if (next != null) {
                if (!next.startsWith("ResumableUrl-")) {
                    StringBuilder sb = new StringBuilder("gdrive-ResumableUrl-");
                    sb.append(str);
                    if (!next.startsWith(sb.toString())) {
                        StringBuilder sb2 = new StringBuilder("gbackup-ResumableUrl-");
                        sb2.append(str);
                        if (!next.startsWith(sb2.toString())) {
                        }
                    }
                }
                arrayList.add(next);
            }
        }
        SharedPreferences.Editor edit = A00().edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        if (!edit.commit()) {
            Log.w("gdrive-api/remove-all-resumable-uris unable to commit after cleanup to shared prefs.");
        }
    }

    public void A02(String str, String str2) {
        SharedPreferences.Editor edit = A00().edit();
        StringBuilder sb = new StringBuilder("gbackup-ResumableUrl-");
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        edit.remove(sb.toString());
        if (!edit.commit()) {
            Log.w("gdrive-api/remove-resumable-uri unable to commit resumable uri to shared prefs.");
        }
    }
}
