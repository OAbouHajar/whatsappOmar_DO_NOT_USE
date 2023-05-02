package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1Tp  reason: invalid class name and case insensitive filesystem */
public final class C27911Tp implements C27881Tm {
    public final C17020u3 A00;
    public final C15220qW A01 = new AnonymousClass1DV(new AnonymousClass5EH(this));

    public C27911Tp(C17020u3 r3) {
        C18450wi.A0H(r3, 1);
        this.A00 = r3;
    }

    public void AKL(String str) {
        C18450wi.A0H(str, 0);
        Map<String, ?> all = ((SharedPreferences) this.A01.getValue()).getAll();
        C18450wi.A0B(all);
        for (Map.Entry next : all.entrySet()) {
            String str2 = (String) next.getKey();
            Object value = next.getValue();
            C18450wi.A09(str2);
            if (!str2.startsWith("ab_props:sys:")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("/abprops config code key: ");
                sb.append(str2);
                sb.append(" config value: ");
                sb.append(value);
                Log.i(sb.toString());
            }
        }
    }

    public /* synthetic */ void AKN(AnonymousClass2JM r1) {
    }

    public /* synthetic */ void AKY(String str) {
    }
}
