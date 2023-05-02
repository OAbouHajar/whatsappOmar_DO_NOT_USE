package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.1Tr  reason: invalid class name and case insensitive filesystem */
public class C27931Tr implements C27881Tm {
    public final C15860rz A00;

    public C27931Tr(C15860rz r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void AKL(String str) {
    }

    public /* synthetic */ void AKN(AnonymousClass2JM r1) {
    }

    public void AKY(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/priv/last=");
        C15860rz r3 = this.A00;
        AnonymousClass01D r5 = r3.A01;
        sb.append(AnonymousClass271.A01(((SharedPreferences) r5.get()).getInt("privacy_last_seen", 0), "last"));
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/priv/pic=");
        sb2.append(AnonymousClass271.A01(r3.A0C(), "profile"));
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("/priv/status=");
        sb3.append(AnonymousClass271.A01(((SharedPreferences) r5.get()).getInt("privacy_status", 0), "status"));
        Log.i(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("/priv/readreceipts=");
        sb4.append(r3.A1i());
        Log.i(sb4.toString());
    }
}
