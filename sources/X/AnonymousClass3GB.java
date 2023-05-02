package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxObserverShape37S0200000_2_I1;
import com.facebook.redex.IDxSListenerShape268S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;
import com.obwhatsapp.mediaview.IDxPViewShape89S0100000_2_I1;
import com.obwhatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;

/* renamed from: X.3GB  reason: invalid class name */
public class AnonymousClass3GB implements AnonymousClass5T0 {
    public final /* synthetic */ LinkedAccountMediaViewFragment A00;

    public AnonymousClass3GB(LinkedAccountMediaViewFragment linkedAccountMediaViewFragment) {
        this.A00 = linkedAccountMediaViewFragment;
    }

    public AnonymousClass01Q A7f(int i2) {
        LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = this.A00;
        ViewGroup viewGroup = (ViewGroup) linkedAccountMediaViewFragment.A05().inflate(R.layout.layout03d7, (ViewGroup) null);
        ViewGroup A07 = C13700nu.A07(viewGroup, R.id.footer);
        IDxPViewShape89S0100000_2_I1 iDxPViewShape89S0100000_2_I1 = new IDxPViewShape89S0100000_2_I1(linkedAccountMediaViewFragment.A02(), this, 1);
        iDxPViewShape89S0100000_2_I1.A0M = new ViewOnClickCListenerShape4S0100000_I1(this, 18);
        C004601z.A0n(iDxPViewShape89S0100000_2_I1, C13680ns.A0h("thumb-transition-", linkedAccountMediaViewFragment.A03.A04));
        int i3 = 0;
        viewGroup.addView(iDxPViewShape89S0100000_2_I1, 0);
        iDxPViewShape89S0100000_2_I1.A0Y = true;
        linkedAccountMediaViewFragment.A04.A01(iDxPViewShape89S0100000_2_I1, linkedAccountMediaViewFragment.A03, (C108515Oh) null, new IDxSListenerShape268S0100000_2_I1(iDxPViewShape89S0100000_2_I1, 3), 1);
        if (!TextUtils.isEmpty(linkedAccountMediaViewFragment.A0A)) {
            View inflate = linkedAccountMediaViewFragment.A05().inflate(R.layout.layout03d2, (ViewGroup) null);
            MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) C004601z.A0E(inflate, R.id.caption);
            A07.addView(inflate, 0);
            for (int i4 = 0; i4 < A07.getChildCount(); i4++) {
                C13690nt.A16(A07.getChildAt(i4), linkedAccountMediaViewFragment);
            }
            mediaCaptionTextView.setCaptionText(linkedAccountMediaViewFragment.A0A);
            mediaCaptionTextView.A09.A0A(linkedAccountMediaViewFragment.A0H(), new IDxObserverShape37S0200000_2_I1(inflate, 0, this));
        }
        if (!linkedAccountMediaViewFragment.A0G) {
            i3 = 8;
        }
        A07.setVisibility(i3);
        return new AnonymousClass01Q(viewGroup, linkedAccountMediaViewFragment.A03.A04);
    }

    public void A7w(int i2) {
    }

    public /* bridge */ /* synthetic */ int AF8(Object obj) {
        return 0;
    }

    public void ARO() {
    }

    public int getCount() {
        return 1;
    }
}
