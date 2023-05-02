package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1BB  reason: invalid class name */
public class AnonymousClass1BB {
    public List A00(Context context) {
        ArrayList arrayList = new ArrayList();
        C52592e6 r1 = C52592e6.RESTAURANT;
        arrayList.add(new C35041lH(r1.id, context.getString(R.string.str019b), C52602e7.A01(r1.id)));
        C52592e6 r12 = C52592e6.GROCERY_STORE;
        arrayList.add(new C35041lH(r12.id, context.getString(R.string.str019a), C52602e7.A01(r12.id)));
        C52592e6 r13 = C52592e6.APPAREL_CLOTHING;
        arrayList.add(new C35041lH(r13.id, context.getString(R.string.str0198), C52602e7.A01(r13.id)));
        arrayList.add(new C35041lH((String) null, context.getString(R.string.str1d08), 0));
        return arrayList;
    }
}
