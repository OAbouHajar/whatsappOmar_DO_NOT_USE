package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1ur  reason: invalid class name and case insensitive filesystem */
public class C40891ur implements C19550yc {
    public final /* synthetic */ C17780vd A00;
    public final /* synthetic */ C40841um A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ boolean A03;

    public C40891ur(C17780vd r1, C40841um r2, Runnable runnable, boolean z2) {
        this.A00 = r1;
        this.A03 = z2;
        this.A02 = runnable;
        this.A01 = r2;
    }

    public void APb(String str) {
        Log.i("GroupXmppMethod/Leave group/delivery fail");
    }

    public void AQe(C28371Vv r3, String str) {
        this.A01.Ach(C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r8, String str) {
        C28371Vv A0J = r8.A0J("leave");
        if (A0J != null) {
            ArrayList arrayList = new ArrayList();
            C17780vd r5 = this.A00;
            C16300so r4 = r5.A00;
            Class<C16050sL> cls = C16050sL.class;
            Iterator it = A0J.A0O("group").iterator();
            while (it.hasNext()) {
                arrayList.add(C13690nt.A0S(it).A0F(r4, cls, "id"));
            }
            if (arrayList.size() > 0) {
                ((C17240ul) r5.A04.get()).A0a(arrayList, this.A03);
            }
        }
        this.A02.run();
    }
}
