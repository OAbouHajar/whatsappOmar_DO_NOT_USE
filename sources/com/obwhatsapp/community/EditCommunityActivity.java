package com.obwhatsapp.community;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass12A;
import X.AnonymousClass2Ao;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16000sG;
import X.C16010sH;
import X.C16050sL;
import X.C16080sP;
import X.C16150sX;
import X.C17140ub;
import X.C17200uh;
import X.C30371cF;
import X.C33481ie;
import X.C49132Rg;
import X.C49362Sq;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.contact.IDxCObserverShape67S0100000_1_I1;
import com.obwhatsapp.contact.photos.ContactPhotos$LoaderLifecycleEventObserver;
import com.whatsapp.jid.GroupJid;

public class EditCommunityActivity extends C49362Sq {
    public C16000sG A00;
    public C17140ub A01;
    public C16080sP A02;
    public AnonymousClass12A A03;
    public AnonymousClass2Ao A04;
    public C17200uh A05;
    public C16010sH A06;
    public GroupJid A07;
    public boolean A08;
    public final C33481ie A09;

    public EditCommunityActivity() {
        this(0);
        this.A09 = new IDxCObserverShape67S0100000_1_I1(this, 1);
    }

    public EditCommunityActivity(int i2) {
        this.A08 = false;
        C13680ns.A1G(this, 38);
    }

    public void A1q() {
        if (!this.A08) {
            this.A08 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0h(r1, this);
            this.A05 = C16150sX.A0R(r1);
            this.A00 = C16150sX.A0M(r1);
            this.A02 = C16150sX.A0Q(r1);
            this.A01 = C16150sX.A0N(r1);
            this.A03 = (AnonymousClass12A) r1.A50.get();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 64206) {
            if (i2 != 16436755) {
                super.onActivityResult(i2, i3, intent);
                return;
            }
            this.A09.A01.A0N("tmpi").delete();
            if (i3 != -1) {
                if (i3 == 0 && intent != null) {
                    this.A09.A03(intent, this);
                    return;
                }
                return;
            }
        } else if (i3 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    this.A01.A05(this.A07);
                    this.A09.A08(this.A06);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    this.A09.A01.A0N("tmpi").delete();
                }
            }
            this.A09.A04(intent, this, 16436755);
            return;
        } else {
            return;
        }
        this.A01.A05(this.A07);
        this.A09.A0A(this.A06);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass00T.A05(this, R.id.name_counter).setVisibility(8);
        AnonymousClass2Ao A042 = this.A05.A04(this, "community-home");
        this.A06.A00(new ContactPhotos$LoaderLifecycleEventObserver(A042));
        this.A04 = A042;
        this.A01.A02(this.A09);
        C16050sL A0N = C14530pL.A0N(getIntent(), "extra_community_jid");
        this.A07 = A0N;
        C16010sH A0A = this.A00.A0A(A0N);
        this.A06 = A0A;
        this.A02.setText(this.A02.A08(A0A));
        WaEditText waEditText = this.A01;
        C30371cF r0 = this.A06.A0H;
        AnonymousClass00B.A06(r0);
        waEditText.setText(r0.A02);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen057a);
        this.A04.A07(this.A00, this.A06, dimensionPixelSize);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01.A03(this.A09);
    }
}
