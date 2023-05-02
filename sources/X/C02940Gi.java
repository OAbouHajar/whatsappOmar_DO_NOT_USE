package X;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.0Gi  reason: invalid class name and case insensitive filesystem */
public final class C02940Gi extends C007003f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C02940Gi(Class cls, TimeUnit timeUnit, TimeUnit timeUnit2) {
        super(cls);
        C18450wi.A0H(timeUnit, 3);
        C18450wi.A0H(timeUnit2, 5);
        C007303i r6 = this.A00;
        long millis = timeUnit.toMillis(43200000);
        long millis2 = timeUnit2.toMillis(21600000);
        if (millis < 900000) {
            C06530Wm.A00();
            Log.w(C007303i.A0L, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        r6.A05 = millis < 900000 ? 900000 : millis;
        if (millis2 < 300000) {
            C06530Wm.A00();
            Log.w(C007303i.A0L, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (millis2 > r6.A05) {
            C06530Wm.A00();
            String str = C007303i.A0L;
            StringBuilder A0r = AnonymousClass000.A0r("Flex duration greater than interval duration; Changed to ");
            A0r.append(millis);
            Log.w(str, A0r.toString());
        }
        long j2 = r6.A05;
        if (300000 <= j2) {
            if (millis2 < 300000) {
                j2 = 300000;
            } else if (millis2 <= j2) {
                j2 = millis2;
            }
            r6.A03 = j2;
            return;
        }
        StringBuilder A0r2 = AnonymousClass000.A0r("Cannot coerce value to an empty range: maximum ");
        A0r2.append(j2);
        A0r2.append(" is less than minimum ");
        A0r2.append(300000);
        A0r2.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw AnonymousClass000.A0T(A0r2.toString());
    }

    public /* bridge */ /* synthetic */ AnonymousClass03k A01() {
        String str;
        if (this.A02 && Build.VERSION.SDK_INT >= 23 && this.A00.A0A.A00()) {
            str = "Cannot set backoff criteria on an idle mode job";
        } else if (!this.A00.A0H) {
            return new C02950Gj(this);
        } else {
            str = "PeriodicWorkRequests cannot be expedited";
        }
        throw AnonymousClass000.A0T(str);
    }
}
