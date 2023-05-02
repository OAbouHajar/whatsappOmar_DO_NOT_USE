package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.obwhatsapp.R;
import com.obwhatsapp.location.LiveLocationPrivacyActivity;

/* renamed from: X.2oO  reason: invalid class name and case insensitive filesystem */
public class C56712oO extends BaseAdapter {
    public final /* synthetic */ LiveLocationPrivacyActivity A00;

    public C56712oO(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        this.A00 = liveLocationPrivacyActivity;
    }

    public int getCount() {
        return this.A00.A0G.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A00.A0G.get(i2);
    }

    public long getItemId(int i2) {
        return ((C16010sH) C13690nt.A0a(this.A00.A0G, i2)).A05();
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        AnonymousClass4MN r0;
        if (view == null) {
            view = C13680ns.A0H(this.A00.getLayoutInflater(), viewGroup, R.layout.layout03a2);
            r0 = new AnonymousClass4MN();
            r0.A02 = C13680ns.A0R(view, R.id.name);
            r0.A01 = C13680ns.A0M(view, R.id.time_left);
            r0.A00 = C13680ns.A0K(view, R.id.avatar);
            view.setTag(r0);
        } else {
            r0 = (AnonymousClass4MN) view.getTag();
        }
        LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A00;
        C16010sH r5 = (C16010sH) C13690nt.A0a(liveLocationPrivacyActivity.A0G, i2);
        if (r5 != null) {
            long A002 = liveLocationPrivacyActivity.A05.A00();
            long A03 = liveLocationPrivacyActivity.A0D.A03(C16010sH.A01(r5));
            r0.A03 = r5;
            r0.A01.setText(C28961Zl.A07(liveLocationPrivacyActivity.A01, A03 - A002));
            r0.A02.setText(liveLocationPrivacyActivity.A01.A0G(liveLocationPrivacyActivity.A07.A08(r5)));
            C004601z.A0d(r0.A00, 2);
            liveLocationPrivacyActivity.A08.A06(r0.A00, r0.A03);
        }
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }
}
