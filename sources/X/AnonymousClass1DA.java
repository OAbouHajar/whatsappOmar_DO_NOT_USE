package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.obwhatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;

/* renamed from: X.1DA  reason: invalid class name */
public class AnonymousClass1DA implements C23691Cz {
    public final Context A00;
    public final C16040sK A01;
    public final C15860rz A02;

    public AnonymousClass1DA(Context context, C16040sK r2, C15860rz r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void AMa() {
        AnonymousClass01D r3 = this.A02.A01;
        ((SharedPreferences) r3.get()).getInt("c2dm_app_vers", 0);
        ((SharedPreferences) r3.get()).getString("c2dm_reg_id", (String) null);
        C16040sK r0 = this.A01;
        r0.A0B();
        if (r0.A00 != null) {
            Log.i("updatedappreceiver/request-refresh");
            RegistrationIntentService.A02(this.A00.getApplicationContext());
            return;
        }
        Log.i("updateappreceiver/skip-refresh");
    }

    public /* synthetic */ void AMb() {
    }
}
