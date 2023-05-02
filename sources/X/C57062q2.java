package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.util.ViewOnClickCListenerShape0S0201000_I1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2q2  reason: invalid class name and case insensitive filesystem */
public class C57062q2 extends C000700i {
    public final /* synthetic */ C000900k A00;
    public final /* synthetic */ ViewOnClickCListenerShape0S0201000_I1 A01;

    public C57062q2(C000900k r1, ViewOnClickCListenerShape0S0201000_I1 viewOnClickCListenerShape0S0201000_I1) {
        this.A01 = viewOnClickCListenerShape0S0201000_I1;
        this.A00 = r1;
    }

    public void A02(List list, List list2, List list3) {
        this.A00.A0j((C000700i) null);
        AnonymousClass39F r1 = (AnonymousClass39F) this.A01.A01;
        C004601z.A0n(r1.A03, (String) null);
        C004601z.A0n(r1.A05, (String) null);
        ImageView imageView = r1.A04;
        if (imageView != null) {
            C004601z.A0n(imageView, (String) null);
        }
    }

    public void A03(List list, Map map) {
        View A06;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            if (!map.containsKey(A0m) && (A06 = C455529g.A06(C13690nt.A0J(this.A00), A0m)) != null) {
                map.put(A0m, A06);
            }
        }
    }
}
