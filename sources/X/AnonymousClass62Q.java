package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.math.BigDecimal;

/* renamed from: X.62Q  reason: invalid class name */
public class AnonymousClass62Q implements AnonymousClass685 {
    public C28401Vy A00;
    public final Context A01;
    public final AnonymousClass013 A02;
    public final C28411Vz A03;
    public final C28401Vy A04;
    public final C28401Vy A05;

    public AnonymousClass62Q(Context context, AnonymousClass013 r2, C28411Vz r3, C28401Vy r4, C28401Vy r5, C28401Vy r6) {
        this.A01 = context;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = r4;
        this.A05 = r5;
        this.A04 = r6;
    }

    public final C116855s3 A00(String str, BigDecimal bigDecimal, int i2, boolean z2) {
        BigDecimal bigDecimal2 = (i2 == 0 ? this.A00 : this.A04).A00;
        if (bigDecimal.compareTo(bigDecimal2) <= 0 && (bigDecimal.compareTo(bigDecimal2) != 0 || !str.endsWith(".") || z2)) {
            return new C116855s3(0, "");
        }
        return new C116855s3(3, C13680ns.A0d(this.A01, this.A03.A9I(this.A02, bigDecimal2, 0), C13680ns.A1b(), 0, R.string.str10ce));
    }
}
