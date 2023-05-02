package com.obwhatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass1V8;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14750ph;
import X.C15810rt;
import X.C16030sJ;
import X.C16050sL;
import X.C16070sO;
import X.C16150sX;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class GroupMembersSelector extends AnonymousClass1V8 {
    public C15810rt A00;
    public C16070sO A01;
    public C16050sL A02;
    public List A03;
    public boolean A04;

    public GroupMembersSelector() {
        this(0);
    }

    public GroupMembersSelector(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 73);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0g(r1, C14530pL.A0D(r1, this), this);
            this.A00 = C16150sX.A0c(r1);
            this.A01 = C16150sX.A0e(r1);
        }
    }

    public void A3Q(int i2) {
        if (i2 <= 0) {
            x().A0A(R.string.str00ba);
        } else {
            super.A3Q(i2);
        }
    }

    public final void A3f() {
        Intent A09 = C13680ns.A09();
        A09.setClassName(getPackageName(), "com.obwhatsapp.group.NewGroup");
        A09.putExtra("create_group_for_community", false);
        ArrayList A06 = C16030sJ.A06(this.A03);
        if (!CallsPrivacy.saveSelectedList(this, A06)) {
            Intent putExtra = A09.putExtra("selected", A06).putExtra("entry_point", getIntent().getIntExtra("entry_point", -1));
            C16050sL r0 = this.A02;
            startActivityForResult(putExtra.putExtra("parent_group_jid_to_link", r0 == null ? null : r0.getRawString()), 1);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent A0x;
        if (i2 != 1) {
            if (i2 != 150) {
                super.onActivityResult(i2, i3, intent);
                return;
            } else if (i3 != -1) {
                Log.i("groupmembersselector/permissions denied");
            } else {
                return;
            }
        } else if (i3 == -1) {
            if (intent != null) {
                C16050sL A0N = C14530pL.A0N(intent, "group_jid");
                Bundle bundleExtra = intent.getBundleExtra("new_group_result_bundle");
                Log.i(AnonymousClass000.A0g("groupmembersselector/group created ", A0N));
                if (this.A00.A0F(A0N) && !AIm()) {
                    Log.i(AnonymousClass000.A0g("groupmembersselector/opening conversation", A0N));
                    if (this.A02 != null) {
                        new C14750ph();
                        A0x = C14750ph.A0Q(this, A0N);
                    } else {
                        A0x = C14750ph.A0q().A0x(this, A0N);
                    }
                    if (bundleExtra != null) {
                        A0x.putExtra("new_group_result_bundle", bundleExtra);
                    }
                    this.A00.A07(this, A0x);
                }
            }
            startActivity(C14750ph.A02(this));
        } else {
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.A02 = C16050sL.A05(getIntent().getStringExtra("parent_group_jid_to_link"));
        }
        if (bundle == null && !this.A0I.A00()) {
            RequestPermissionActivity.A0D(this, R.string.str11ba, R.string.str11b9);
        }
    }
}
