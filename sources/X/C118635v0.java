package X;

import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.5v0  reason: invalid class name and case insensitive filesystem */
public abstract class C118635v0 {
    public final C31081dR A00;

    public C118635v0(C16440t3 r8, C16490t9 r9, AnonymousClass17S r10, C19500yX r11, String str, int i2) {
        C31081dR r0 = new C31081dR(r8, r9, r10, r11, str, i2);
        this.A00 = r0;
        r0.A06.A03 = true;
    }

    public void A00(Intent intent) {
        if (intent != null) {
            long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
            String stringExtra = intent.getStringExtra("perf_origin");
            if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                this.A00.A0D(stringExtra, longExtra);
                return;
            }
        }
        Log.e("Expect to have origin for perf tracking.");
        this.A00.A0D("unknown", -1);
    }
}
