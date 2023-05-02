package X;

import android.widget.AbsListView;
import com.obwhatsapp.BottomSheetListView;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.EULA;

/* renamed from: X.4lE  reason: invalid class name and case insensitive filesystem */
public class C94634lE implements AbsListView.OnScrollListener {
    public final /* synthetic */ BottomSheetListView A00;
    public final /* synthetic */ EULA A01;

    public C94634lE(BottomSheetListView bottomSheetListView, EULA eula) {
        this.A01 = eula;
        this.A00 = bottomSheetListView;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        this.A01.findViewById(R.id.fade_view).setVisibility(C13680ns.A02(this.A00.A00() ? 1 : 0));
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
