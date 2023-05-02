package com.obwhatsapp.insufficientstoragespace;

import X.AnonymousClass2GQ;
import X.AnonymousClass39V;
import X.AnonymousClass4Y3;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16490t9;
import X.C19980zJ;
import X.C49132Rg;
import X.C74903rI;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape18S0100000_I1_3;
import com.facebook.redex.ViewOnClickCListenerShape3S1100000_I1;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;

public class InsufficientStorageSpaceActivity extends C14530pL {
    public long A00;
    public ScrollView A01;
    public C16490t9 A02;
    public AnonymousClass39V A03;
    public boolean A04;

    public InsufficientStorageSpaceActivity() {
        this(0);
    }

    public InsufficientStorageSpaceActivity(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 80);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A02 = C16150sX.A0m(r1);
        }
    }

    public void A2x() {
    }

    public void onBackPressed() {
        C19980zJ.A03(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03.A00();
    }

    public void onCreate(Bundle bundle) {
        boolean z2;
        int i2;
        int i3;
        String A0F;
        super.onCreate(bundle);
        String A002 = AnonymousClass4Y3.A00(this.A02, 6);
        setContentView((int) R.layout.layout004e);
        this.A01 = (ScrollView) findViewById(R.id.insufficient_storage_scroll_view);
        TextView A09 = C13700nu.A09(this, R.id.btn_storage_settings);
        TextView A092 = C13700nu.A09(this, R.id.insufficient_storage_title_textview);
        TextView A093 = C13700nu.A09(this, R.id.insufficient_storage_description_textview);
        long longExtra = getIntent().getLongExtra("spaceNeededInBytes", -1);
        this.A00 = longExtra;
        long A022 = (longExtra - this.A06.A02()) + SearchActionVerificationClientService.MS_TO_NS;
        if (getIntent() == null || !getIntent().getBooleanExtra("allowSkipKey", false)) {
            z2 = false;
            i2 = R.string.str0b95;
            i3 = R.string.str0b9b;
            A0F = C13700nu.A0F(getResources(), AnonymousClass2GQ.A03(this.A01, A022), new Object[1], 0, R.string.str0b98);
        } else {
            z2 = true;
            i2 = R.string.str0b96;
            i3 = R.string.str0b9a;
            A0F = getResources().getString(R.string.str0b97);
        }
        A092.setText(i3);
        A093.setText(A0F);
        A09.setText(i2);
        A09.setOnClickListener(z2 ? new ViewOnClickCListenerShape3S1100000_I1(3, A002, this) : new ViewOnClickCListenerShape18S0100000_I1_3(this, 29));
        if (z2) {
            View findViewById = findViewById(R.id.btn_skip_storage_settings);
            findViewById.setVisibility(0);
            C13680ns.A16(findViewById, this, 30);
        }
        AnonymousClass39V r0 = new AnonymousClass39V(this.A01, findViewById(R.id.bottom_button_container), getResources().getDimensionPixelSize(R.dimen.dimen06f3));
        this.A03 = r0;
        r0.A00();
    }

    public void onResume() {
        super.onResume();
        long A022 = this.A06.A02();
        Locale locale = Locale.ENGLISH;
        Object[] A1Z = C13690nt.A1Z();
        boolean z2 = false;
        A1Z[0] = Long.valueOf(A022);
        A1Z[1] = Long.valueOf(this.A00);
        C13700nu.A0Z("insufficient-storage-activity/internal-storage available: %,d required: %,d", locale, A1Z);
        if (A022 > this.A00) {
            Log.i("insufficient-storage-activity/space-available/finishing-the-activity");
            long j2 = this.A00;
            if (j2 > 0) {
                C74903rI r1 = new C74903rI();
                r1.A02 = Long.valueOf(j2);
                if (findViewById(R.id.btn_skip_storage_settings).getVisibility() == 0) {
                    z2 = true;
                }
                r1.A00 = Boolean.valueOf(z2);
                r1.A01 = 1;
                this.A02.A05(r1);
            }
            finish();
        }
    }
}
