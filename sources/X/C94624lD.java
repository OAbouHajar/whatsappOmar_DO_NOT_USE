package X;

import android.view.View;
import android.widget.AbsListView;
import com.obwhatsapp.location.LiveLocationPrivacyActivity;

/* renamed from: X.4lD  reason: invalid class name and case insensitive filesystem */
public class C94624lD implements AbsListView.OnScrollListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LiveLocationPrivacyActivity A01;

    public C94624lD(LiveLocationPrivacyActivity liveLocationPrivacyActivity, int i2) {
        this.A01 = liveLocationPrivacyActivity;
        this.A00 = i2;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        View view;
        float f2;
        if (i2 + i3 == i4) {
            int bottom = absListView.getChildAt(i3 - 1).getBottom();
            LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A01;
            int bottom2 = liveLocationPrivacyActivity.A04.getBottom() - liveLocationPrivacyActivity.A04.getPaddingBottom();
            view = liveLocationPrivacyActivity.A00;
            if (bottom == bottom2) {
                f2 = 0.0f;
            }
            f2 = (float) this.A00;
        } else {
            view = this.A01.A00;
            f2 = (float) this.A00;
        }
        view.setElevation(f2);
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
