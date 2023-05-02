package X;

import android.app.Activity;
import com.obwhatsapp.support.DescribeProblemActivity;
import com.obwhatsapp.support.faq.SearchFAQ;
import java.util.Map;

/* renamed from: X.1Tl  reason: invalid class name and case insensitive filesystem */
public class C27871Tl implements C27881Tm {
    public /* synthetic */ void AKL(String str) {
    }

    public void AKN(AnonymousClass2JM r6) {
        int i2;
        int i3;
        Activity A00 = AnonymousClass22N.A00(r6.A00);
        if (A00 != null) {
            if (A00 instanceof SearchFAQ) {
                SearchFAQ searchFAQ = (SearchFAQ) A00;
                i2 = searchFAQ.A00;
                i3 = searchFAQ.A0B.size();
                if (i2 == -1) {
                    return;
                }
            } else if (A00 instanceof DescribeProblemActivity) {
                i2 = 0;
                i3 = -1;
            } else {
                return;
            }
            Integer valueOf = Integer.valueOf(i2);
            Map map = r6.A01;
            map.put("FAQ Results Returned", valueOf);
            if (i2 == 0) {
                map.put("FAQ Results Read", "n/a");
            } else {
                map.put("FAQ Results Read", Integer.valueOf(i3));
            }
        }
    }

    public /* synthetic */ void AKY(String str) {
    }
}
