package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1D5  reason: invalid class name */
public class AnonymousClass1D5 implements C23691Cz, AnonymousClass1D6 {
    public final C18890xQ A00;

    public AnonymousClass1D5(C18890xQ r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void AMX() {
    }

    public void AMa() {
        C18890xQ r3 = this.A00;
        C16190sc r2 = r3.A02;
        File A07 = r2.A07("OBWhatsApp.download");
        if (A07.exists()) {
            Log.a(A07.delete());
        }
        if (!r2.A07("OBWhatsApp.upgrade").exists()) {
            File A072 = r2.A07("OBWhatsApp.apk");
            if (A072.exists()) {
                Log.a(A072.delete());
            }
            r3.A05.A0K().remove("last_upgrade_remote_sha256").apply();
        }
    }

    public /* synthetic */ void AMb() {
    }
}
