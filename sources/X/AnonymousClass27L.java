package X;

import android.text.TextUtils;
import com.AssemMods.fakechat.utils.AppUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.27L  reason: invalid class name */
public class AnonymousClass27L implements C19550yc {
    public final long A00;
    public final long A01;
    public final C19680yp A02;
    public final C17190ug A03;
    public final boolean A04;

    public AnonymousClass27L(C19680yp r1, C17190ug r2, long j2, long j3, boolean z2) {
        this.A03 = r2;
        this.A04 = z2;
        this.A00 = j2;
        this.A01 = j3;
        this.A02 = r1;
    }

    public void APb(String str) {
        this.A02.A04.A0K().putBoolean("adv_key_index_list_require_update", true).apply();
    }

    public void AQe(C28371Vv r4, String str) {
        C28371Vv A0J = r4.A0J("error");
        int i2 = -1;
        if (A0J != null) {
            i2 = A0J.A0A("code", -1);
        }
        this.A02.A01(i2);
    }

    public void AYG(C28371Vv r10, String str) {
        C28371Vv A0J = r10.A0J("retry-ts");
        if (A0J != null) {
            String A0N = A0J.A0N(AppUtils.HANDLER_TS_KEY, (String) null);
            long A012 = !TextUtils.isEmpty(A0N) ? C29501aj.A01(A0N, -1) : -1;
            if (this.A04 || A012 == -1) {
                this.A02.A01(-1);
                return;
            }
            C19680yp r2 = this.A02;
            long j2 = this.A01;
            StringBuilder sb = new StringBuilder("DeviceKeyIndexListUpdateHandler/onRetry advTs=");
            sb.append(A012);
            sb.append(" serverTs=");
            sb.append(j2);
            Log.e(sb.toString());
            r2.A02(A012, j2, true);
            return;
        }
        C19680yp r5 = this.A02;
        long j3 = this.A00;
        long j4 = this.A01;
        r5.A02.A05(j3);
        C19410yO r8 = r5.A06;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1WN r52 : r8.A06()) {
            if (r52.A01() && r52.A01 < j4) {
                arrayList.add(r52.A06);
            }
        }
        r8.A0I.A04(C17380uz.copyOf((Collection) arrayList));
    }
}
