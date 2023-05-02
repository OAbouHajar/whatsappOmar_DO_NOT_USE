package X;

import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.1uo  reason: invalid class name and case insensitive filesystem */
public class C40861uo implements C19550yc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C17780vd A01;
    public final /* synthetic */ C16050sL A02;

    public C40861uo(C17780vd r1, C16050sL r2, int i2) {
        this.A01 = r1;
        this.A00 = i2;
        this.A02 = r2;
    }

    public void APb(String str) {
        Log.i("GroupXmppMethod/GetGroupInfo/delivery fail");
    }

    public void AQe(C28371Vv r6, String str) {
        C17240ul r4 = (C17240ul) this.A01.A04.get();
        C16050sL r3 = this.A02;
        int A002 = C34451kH.A00(r6);
        if (A002 == 403) {
            StringBuilder sb = new StringBuilder("groupmgr/groupInfoError/not a participant: ");
            sb.append(r3);
            Log.e(sb.toString());
            r4.A0a(Collections.singletonList(r3), true);
        } else if (A002 != 404) {
            StringBuilder sb2 = new StringBuilder("groupmgr/groupInfoError/groupjid = ");
            sb2.append(r3);
            sb2.append("errorcode = ");
            sb2.append(A002);
            Log.i(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("groupmgr/groupInfoError/does not exist: ");
            sb3.append(r3);
            Log.e(sb3.toString());
        }
    }

    public void AYG(C28371Vv r4, String str) {
        int i2 = this.A00;
        C17780vd r0 = this.A01;
        C53262fQ.A07(r0.A00, (C17240ul) r0.A04.get(), r4, i2);
    }
}
