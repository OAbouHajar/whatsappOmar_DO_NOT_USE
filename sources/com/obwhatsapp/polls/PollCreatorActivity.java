package com.obwhatsapp.polls;

import X.AnonymousClass1N9;
import X.AnonymousClass29T;
import X.AnonymousClass2O1;
import X.AnonymousClass3QX;
import X.C004601z;
import X.C005402i;
import X.C006602z;
import X.C02800Fh;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15830rv;
import X.C16150sX;
import X.C16460t6;
import X.C16620tM;
import X.C34331k5;
import X.C447725m;
import X.C453428a;
import X.C49132Rg;
import X.C51012ap;
import X.C51022aq;
import X.C57342qx;
import X.C57352qy;
import X.C75453sB;
import X.C807645k;
import X.C86204Rr;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.FloatingActionButton;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;

public class PollCreatorActivity extends C14530pL implements AnonymousClass2O1 {
    public long A00;
    public Vibrator A01;
    public InputMethodManager A02;
    public RecyclerView A03;
    public C51012ap A04;
    public C51022aq A05;
    public FloatingActionButton A06;
    public C16460t6 A07;
    public C15830rv A08;
    public C57352qy A09;
    public PollCreatorViewModel A0A;
    public AnonymousClass1N9 A0B;
    public boolean A0C;
    public boolean A0D;

    public PollCreatorActivity() {
        this(0);
    }

    public PollCreatorActivity(int i2) {
        this.A0C = false;
        C13680ns.A1G(this, 90);
    }

    public void A1q() {
        if (!this.A0C) {
            this.A0C = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A07 = (C16460t6) r1.A5k.get();
            this.A0B = (AnonymousClass1N9) r1.AIt.get();
            this.A04 = (C51012ap) A1T.A1A.get();
            this.A05 = (C51022aq) A1T.A1B.get();
        }
    }

    public final void A35() {
        if (!AnonymousClass29T.A03(this)) {
            C86204Rr A002 = C807645k.A00(new Object[0], R.string.str12e8);
            A002.A04 = R.string.str12db;
            A002.A01 = R.string.str12d9;
            A002.A03 = R.string.str12da;
            A002.A02 = R.color.color0696;
            C453428a.A00(A002.A00(), AGM());
        }
    }

    public void APh(DialogInterface dialogInterface, int i2, int i3) {
        if (i3 != -3) {
            if (i3 == -2) {
                finish();
                return;
            } else if (i3 != -1) {
                return;
            }
        }
        dialogInterface.dismiss();
    }

    public void onBackPressed() {
        if (this.A0D) {
            A35();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str0616);
        setContentView((int) R.layout.layout0498);
        C005402i A0s = C14550pN.A0s(this, R.id.toolbar);
        A0s.A0N(true);
        A0s.A0B(R.string.str0616);
        this.A0D = this.A0C.A0E(C16620tM.A02, 2661);
        this.A08 = C14530pL.A0M(this);
        this.A00 = getIntent().getLongExtra("quoted_message_row_id", 0);
        PollCreatorViewModel pollCreatorViewModel = (PollCreatorViewModel) new C006602z(this).A01(PollCreatorViewModel.class);
        this.A0A = pollCreatorViewModel;
        C13680ns.A1L(this, pollCreatorViewModel.A04, 120);
        C13680ns.A1L(this, this.A0A.A0D, 118);
        C13680ns.A1L(this, this.A0A.A0E, 121);
        boolean z2 = this.A0D;
        PollCreatorViewModel pollCreatorViewModel2 = this.A0A;
        if (z2) {
            C13680ns.A1M(this, pollCreatorViewModel2.A0C, 30);
        } else {
            C13680ns.A1L(this, pollCreatorViewModel2.A0B, 117);
        }
        C13680ns.A1L(this, this.A0A.A03, 119);
        if (this.A0D) {
            String stringExtra = getIntent().getStringExtra("entry_string_text");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.A0A.A09.A00 = stringExtra;
                getIntent().removeExtra("entry_string_text");
            }
        }
        this.A03 = (RecyclerView) C004601z.A0E(this.A00, R.id.poll_creator_options_recycler_view);
        this.A01 = (Vibrator) getSystemService("vibrator");
        this.A02 = (InputMethodManager) getSystemService("input_method");
        new C02800Fh(new C57342qx(this)).A0D(this.A03);
        this.A03.setLayoutManager(new SmoothScrollLinearLayoutManager(1));
        C57352qy r5 = new C57352qy(new AnonymousClass3QX(), this.A04, this.A05, this.A0A, this.A0D);
        this.A09 = r5;
        this.A03.setAdapter(r5);
        FloatingActionButton floatingActionButton = (FloatingActionButton) C004601z.A0E(this.A00, R.id.poll_create_button);
        this.A06 = floatingActionButton;
        C447725m.A01(floatingActionButton.getContext(), floatingActionButton, this.A01, R.drawable.input_send);
        C34331k5.A03(this.A06, this, 39);
        AnonymousClass1N9 r3 = this.A0B;
        C15830rv r2 = this.A08;
        C75453sB r1 = new C75453sB();
        r1.A03 = 1;
        r3.A01(r1, r2);
        r3.A01.A06(r1);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.A0D) {
            return super.onOptionsItemSelected(menuItem);
        }
        A35();
        return true;
    }
}
