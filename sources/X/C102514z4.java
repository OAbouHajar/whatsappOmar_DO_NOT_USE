package X;

import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.4z4  reason: invalid class name and case insensitive filesystem */
public class C102514z4 implements C109415Sa {
    public final /* synthetic */ AnonymousClass2AS A00;

    public C102514z4(AnonymousClass2AS r1) {
        this.A00 = r1;
    }

    public void AQR(int i2) {
        Log.e(C13680ns.A0c(i2, "CommunitySubgroupsViewModelLinkSubgroupsProtocolHelper/error = "));
        this.A00.A0E.A09((Object) null);
    }

    public void ASg(Set set) {
        Log.e("CommunitySubgroupsViewModelLinkSubgroupsProtocolHelper/response");
        this.A00.A0E.A09(set);
    }

    public void AYu() {
        Log.e("CommunitySubgroupsViewModelLinkSubgroupsProtocolHelper/timeout");
        this.A00.A0E.A09((Object) null);
    }
}
