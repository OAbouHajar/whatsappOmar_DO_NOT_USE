package com.obwhatsapp.community.deactivate;

import X.AnonymousClass00T;
import X.AnonymousClass2Ao;
import X.C107945Mb;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16000sG;
import X.C16010sH;
import X.C16050sL;
import X.C16080sP;
import X.C16150sX;
import X.C17190ug;
import X.C17200uh;
import X.C18450wi;
import X.C49132Rg;
import X.C49732Vm;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape238S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

public final class DeactivateCommunityDisclaimerActivity extends C14530pL implements C107945Mb {
    public View A00;
    public C16000sG A01;
    public C16080sP A02;
    public C17200uh A03;
    public C16010sH A04;
    public C16050sL A05;
    public C17190ug A06;
    public boolean A07;

    public DeactivateCommunityDisclaimerActivity() {
        this(0);
    }

    public DeactivateCommunityDisclaimerActivity(int i2) {
        this.A07 = false;
        C13680ns.A1G(this, 42);
    }

    public void A1q() {
        if (!this.A07) {
            this.A07 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A03 = C16150sX.A0R(r1);
            this.A06 = C16150sX.A0t(r1);
            this.A01 = C16150sX.A0M(r1);
            this.A02 = C16150sX.A0Q(r1);
        }
    }

    public final void A35() {
        if (!this.A07.A0A()) {
            A2b(new IDxCListenerShape238S0100000_2_I1(this, 3), 0, R.string.str0647, R.string.str0648, R.string.str0646);
            return;
        }
        C16050sL r0 = this.A05;
        if (r0 == null) {
            throw C18450wi.A03("parentGroupJid");
        }
        DeactivateCommunityConfirmationFragment deactivateCommunityConfirmationFragment = new DeactivateCommunityConfirmationFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("parent_group_jid", r0.getRawString());
        deactivateCommunityConfirmationFragment.A0T(A0D);
        Afb(deactivateCommunityConfirmationFragment, "DeactivateCommunityDisclaimerActivity");
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout003c);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle((int) R.string.str063d);
        Aem(toolbar);
        C13690nt.A0N(this).A0N(true);
        C16050sL A042 = C16050sL.A04(getIntent().getStringExtra("parent_group_jid"));
        C18450wi.A0B(A042);
        this.A05 = A042;
        C16000sG r0 = this.A01;
        if (r0 != null) {
            this.A04 = r0.A0A(A042);
            View A052 = AnonymousClass00T.A05(this, R.id.deactivate_community_main_view);
            C18450wi.A0B(A052);
            this.A00 = A052;
            View A053 = AnonymousClass00T.A05(this, R.id.deactivate_community_disclaimer_photo_view);
            C18450wi.A0B(A053);
            ImageView imageView = (ImageView) A053;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen02b8);
            C17200uh r1 = this.A03;
            if (r1 != null) {
                AnonymousClass2Ao A043 = r1.A04(this, "deactivate-community-disclaimer");
                C16010sH r02 = this.A04;
                if (r02 != null) {
                    A043.A07(imageView, r02, dimensionPixelSize);
                    C13680ns.A17(AnonymousClass00T.A05(this, R.id.community_deactivate_disclaimer_continue_button), this, 5);
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.deactivate_community_disclaimer_title);
                    Object[] objArr = new Object[1];
                    C16080sP r12 = this.A02;
                    if (r12 != null) {
                        C16010sH r03 = this.A04;
                        if (r03 != null) {
                            textEmojiLabel.A0I((List) null, C13680ns.A0d(this, r12.A08(r03), objArr, 0, R.string.str0643));
                            View A054 = AnonymousClass00T.A05(this, R.id.deactivate_community_disclaimer_scrollview);
                            C18450wi.A0B(A054);
                            View A055 = AnonymousClass00T.A05(this, R.id.community_deactivate_disclaimer_continue_button_container);
                            C18450wi.A0B(A055);
                            C49732Vm.A00(A055, (ScrollView) A054);
                            return;
                        }
                    } else {
                        str = "waContactNames";
                    }
                }
                throw C18450wi.A03("parentGroupContact");
            }
            str = "contactPhotos";
        } else {
            str = "contactManager";
        }
        throw C18450wi.A03(str);
    }
}
