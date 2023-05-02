package X;

import android.content.SharedPreferences;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: X.1QY  reason: invalid class name */
public class AnonymousClass1QY {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass1QY(C17020u3 r1) {
        this.A01 = r1;
    }

    public List A00(int i2, int i3, int i4) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A00("media_bandwidth_shared_preferences_v2");
                this.A00 = sharedPreferences;
            }
        }
        StringTokenizer stringTokenizer = new StringTokenizer(sharedPreferences.getString(String.format(Locale.US, "%d_%d_%d_%d_%s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i3), 0, "bandwidths"}), ""), ",");
        LinkedList linkedList = new LinkedList();
        while (stringTokenizer.hasMoreTokens()) {
            linkedList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
        }
        return linkedList;
    }
}
