package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2sI  reason: invalid class name and case insensitive filesystem */
public final class C57982sI extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C93244is();
    public Bundle A00;
    public Map A01;

    public C57982sI(Bundle bundle) {
        this.A00 = bundle;
    }

    public final int A00() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    public final int A01() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    public final Map A02() {
        Map map = this.A01;
        AnonymousClass00N r4 = map;
        if (map == null) {
            Bundle bundle = this.A00;
            AnonymousClass00N r42 = new AnonymousClass00N();
            Iterator it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                Object obj = bundle.get(A0m);
                if ((obj instanceof String) && !A0m.startsWith("google.") && !A0m.startsWith("gcm.") && !A0m.equals("from") && !A0m.equals("message_type") && !A0m.equals("collapse_key")) {
                    r42.put(A0m, obj);
                }
            }
            this.A01 = r42;
            r4 = r42;
        }
        return r4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A02(this.A00, parcel, 2);
        C32251fv.A05(parcel, A012);
    }
}
