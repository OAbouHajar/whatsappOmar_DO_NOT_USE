package X;

import android.content.Intent;
import com.obwhatsapp.instrumentation.service.InstrumentationFGService;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.10Z  reason: invalid class name */
public class AnonymousClass10Z {
    public final C16980tz A00;
    public final AnonymousClass116 A01;
    public final Set A02 = new HashSet();

    public AnonymousClass10Z(C16980tz r2, AnonymousClass116 r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    public final synchronized void A00(int i2) {
        this.A02.add(Integer.valueOf(i2));
        this.A01.A03(this.A00.A00, new Intent(), InstrumentationFGService.class);
    }

    public final synchronized void A01(int i2) {
        Set set = this.A02;
        set.remove(Integer.valueOf(i2));
        if (set.isEmpty()) {
            this.A01.A01(this.A00.A00, InstrumentationFGService.class);
        }
    }
}
