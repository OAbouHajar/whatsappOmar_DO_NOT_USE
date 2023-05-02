package X;

import android.content.SharedPreferences;
import com.facebook.redex.IDxRCallbackShape229S0100000_1_I0;
import com.whatsapp.jid.Jid;

/* renamed from: X.1Tt  reason: invalid class name and case insensitive filesystem */
public class C27951Tt {
    public final C16440t3 A00;
    public final C19070xi A01;
    public final AnonymousClass1CL A02;
    public final C17190ug A03;

    public C27951Tt(C16440t3 r1, C19070xi r2, AnonymousClass1CL r3, C17190ug r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00(boolean z2) {
        SharedPreferences sharedPreferences;
        String string;
        String str;
        C17190ug r8 = this.A03;
        String A022 = r8.A02();
        C19070xi r4 = this.A01;
        synchronized (r4) {
            sharedPreferences = r4.A01;
            string = sharedPreferences.getString("ab_props:sys:config_hash", (String) null);
        }
        if (string == null || z2) {
            str = "";
        } else {
            synchronized (r4) {
                str = sharedPreferences.getString("ab_props:sys:config_hash", (String) null);
            }
        }
        r8.A0G(new IDxRCallbackShape229S0100000_1_I0(this, 1), new C28371Vv(new C28371Vv("props", new C35081lL[]{new C35081lL("protocol", 1), new C35081lL("hash", str)}), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("type", "get"), new C35081lL("id", A022), new C35081lL("xmlns", "abt")}), A022, 220, 32000);
    }
}
