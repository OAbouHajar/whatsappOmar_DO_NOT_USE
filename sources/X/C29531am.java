package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1am  reason: invalid class name and case insensitive filesystem */
public class C29531am implements C29541an {
    public final /* synthetic */ C23401Bv A00;
    public final /* synthetic */ boolean A01;

    public C29531am(C23401Bv r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public /* synthetic */ void AP3(String str) {
    }

    public void APP(long j2) {
    }

    public void AQb(String str) {
        StringBuilder sb = new StringBuilder("app/CrashLogs/uploadCrashData/error received: ");
        sb.append(str);
        Log.e(sb.toString());
        this.A00.A0A("upload-error-from-server", this.A01);
    }

    public void AWH(String str, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
