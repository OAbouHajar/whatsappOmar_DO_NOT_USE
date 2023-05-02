package X;

import android.widget.ImageView;
import com.obwhatsapp.R;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4OS  reason: invalid class name */
public class AnonymousClass4OS {
    public int A00;
    public int A01;
    public C30741cs A02;
    public final String A03;
    public final String A04;
    public final ConcurrentMap A05;
    public final boolean A06;
    public volatile AtomicBoolean A07 = new AtomicBoolean();

    public AnonymousClass4OS(AnonymousClass5TC r5) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A05 = concurrentHashMap;
        concurrentHashMap.put(r5, r5);
        this.A03 = r5.getId();
        this.A04 = r5.AGp();
        this.A00 = r5.ADO();
        this.A01 = r5.ADQ();
        ImageView ACj = r5.ACj();
        boolean z2 = false;
        if (!(ACj == null || ACj.getTag(R.id.optin_for_bitmapool_caching) == null || !AnonymousClass000.A1X(ACj.getTag(R.id.optin_for_bitmapool_caching)))) {
            z2 = true;
        }
        this.A06 = z2;
    }
}
