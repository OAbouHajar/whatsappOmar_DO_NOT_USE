package X;

import android.os.Bundle;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;
import com.obwhatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Oz  reason: invalid class name and case insensitive filesystem */
public class C64393Oz extends C000700i {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C455429f A01;

    public C64393Oz(Bundle bundle, C455429f r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public void A03(List list, Map map) {
        ArrayList<String> stringArrayList;
        PhotoView A1A;
        MediaViewBaseFragment mediaViewBaseFragment = this.A01.A01;
        Object A1D = mediaViewBaseFragment.A1D(mediaViewBaseFragment.A09.getCurrentItem());
        if (A1D != null && (stringArrayList = this.A00.getStringArrayList("visible_shared_elements")) != null && stringArrayList.contains(C47612Jr.A04(A1D.toString())) && (A1A = mediaViewBaseFragment.A1A(A1D)) != null) {
            Object A1C = mediaViewBaseFragment.A1C();
            AnonymousClass00B.A06(A1C);
            list.remove(C47612Jr.A04(A1C.toString()));
            list.add(C47612Jr.A04(A1D.toString()));
            map.put(C47612Jr.A04(A1D.toString()), A1A);
        }
    }
}
