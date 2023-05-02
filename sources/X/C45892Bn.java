package X;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Bn  reason: invalid class name and case insensitive filesystem */
public class C45892Bn implements AnonymousClass2BH {
    public final /* synthetic */ C15860rz A00;
    public final /* synthetic */ C17240ul A01;
    public final /* synthetic */ C16050sL A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ Set A04;

    public C45892Bn(C15860rz r1, C17240ul r2, C16050sL r3, List list, Set set) {
        this.A01 = r2;
        this.A04 = set;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = list;
    }

    public void AQR(int i2) {
    }

    public void onSuccess() {
        String obj;
        Set set = this.A04;
        C16050sL r2 = this.A02;
        set.add(r2);
        C15860rz r4 = this.A00;
        AnonymousClass00B.A06(r2);
        String string = ((SharedPreferences) r4.A01.get()).getString("pnh_cag_jid_sucessfully_upgraded", (String) null);
        if (string == null) {
            obj = r2.getRawString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(",");
            sb.append(r2.getRawString());
            obj = sb.toString();
        }
        r4.A1A("pnh_cag_jid_sucessfully_upgraded", obj);
        if (this.A03.size() == set.size()) {
            r4.A0K().putBoolean("pnh_cag_upgrade_incomplete", false).apply();
            r4.A1A("pnh_cag_jid_sucessfully_upgraded", (String) null);
        }
    }
}
