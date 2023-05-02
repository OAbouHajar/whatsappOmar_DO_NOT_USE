package X;

import com.facebook.redex.IDxNConsumerShape12S0101000_2_I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.1XU  reason: invalid class name */
public class AnonymousClass1XU extends AnonymousClass1WD {
    public int A00;
    public boolean A01 = false;
    public final List A02;
    public final List A03;

    public AnonymousClass1XU(List list) {
        AnonymousClass00B.A0C("AllOfAsyncFuture: futures list is empty", list.size() > 0);
        this.A02 = new ArrayList(Collections.nCopies(list.size(), (Object) null));
        this.A03 = new ArrayList(Collections.nCopies(list.size(), (Object) null));
        this.A00 = list.size();
        for (int i2 = 0; i2 < list.size(); i2++) {
            AnonymousClass1WD r2 = (AnonymousClass1WD) list.get(i2);
            r2.A00(new IDxNConsumerShape12S0101000_2_I0(this, i2, 1));
            r2.A00.A03(new IDxNConsumerShape12S0101000_2_I0(this, i2, 0), (Executor) null);
        }
    }

    public final void A05() {
        ArrayList arrayList;
        C803643o r1;
        synchronized (this) {
            arrayList = null;
            if (this.A01) {
                r1 = null;
                arrayList = new ArrayList(this.A02);
            } else {
                r1 = new C803643o(this.A03);
            }
        }
        if (arrayList != null) {
            A02(arrayList);
        } else {
            A03(r1);
        }
    }
}
