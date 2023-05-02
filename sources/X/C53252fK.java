package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2fK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53252fK implements C14280ou {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C27761Ta A01;

    public /* synthetic */ C53252fK(C27761Ta r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void AYB(Object obj) {
        C27761Ta r9 = this.A01;
        int i2 = this.A00;
        C65913Xb r0 = ((C98714sr) ((AnonymousClass5UX) ((AnonymousClass2f8) obj).A00)).A01;
        List<AnonymousClass3XT> emptyList = r0 == null ? Collections.emptyList() : Arrays.asList(r0.A03);
        int size = emptyList.size();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (AnonymousClass3XT r1 : emptyList) {
            if (i3 >= i2) {
                break;
            }
            arrayList.add(new AnonymousClass4L5(r1.A01, AnonymousClass1ZW.A0D(r1.A02), r1.A00));
            i3++;
        }
        C27781Tc r3 = r9.A01;
        StringBuilder sb = new StringBuilder("sendmethods/sendSafetyNetVerifyAppsResult appsListSize=");
        sb.append(Integer.valueOf(arrayList.size()));
        sb.append(" errorCode=");
        sb.append(0);
        sb.append(" errorMessage=");
        sb.append((String) null);
        Log.i(sb.toString());
        C32461gQ r6 = new C32461gQ("apps");
        r6.A02(new C35081lL("actual_count", size));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass4L5 r5 = (AnonymousClass4L5) it.next();
            C32461gQ r4 = new C32461gQ("item");
            r4.A02(new C35081lL(FacebookFacade.RequestParameter.NAME, r5.A01));
            r4.A02(new C35081lL("hash", r5.A02));
            r4.A02(new C35081lL("category", r5.A00));
            r6.A03(r4.A01());
        }
        C28371Vv A012 = r6.A01();
        C32461gQ r02 = new C32461gQ("verify_apps");
        r02.A03(A012);
        C28371Vv A013 = r02.A01();
        C32461gQ r03 = new C32461gQ("ib");
        r03.A03(A013);
        r3.A00.A0D(r03.A01(), 273);
    }
}
