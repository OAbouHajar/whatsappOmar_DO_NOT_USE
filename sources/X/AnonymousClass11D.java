package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.11D  reason: invalid class name */
public class AnonymousClass11D {
    public C17930vs A00;
    public final AnonymousClass01D A01;

    public AnonymousClass11D(C16980tz r2) {
        this.A01 = new AnonymousClass2EG(r2);
    }

    public C17930vs A00() {
        C17930vs r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                HashMap hashMap = new HashMap();
                for (C30111bl r3 : (Set) this.A01.get()) {
                    AnonymousClass00B.A06(r3);
                    String str = r3.A0C;
                    AnonymousClass00B.A06(str);
                    if (hashMap.containsKey(str)) {
                        StringBuilder sb = new StringBuilder("MigrationRegistry/addMigration/duplicate; name=");
                        sb.append(str);
                        Log.w(sb.toString());
                    }
                    hashMap.put(str, r3);
                }
                r0 = C17930vs.copyOf((Map) hashMap);
                this.A00 = r0;
            }
        }
        return r0;
    }
}
