package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass052;
import X.AnonymousClass3Og;
import X.C006602z;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C447725m;
import X.C49132Rg;
import android.os.Bundle;
import android.view.Menu;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.base.WaFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;

public class EncBackupMainActivity extends C14530pL {
    public AnonymousClass02C A00;
    public WaImageButton A01;
    public EncBackupViewModel A02;
    public boolean A03;

    public EncBackupMainActivity() {
        this(0);
    }

    public EncBackupMainActivity(int i2) {
        this.A03 = false;
        C13680ns.A1G(this, 15);
    }

    public static /* synthetic */ void A02(EncBackupMainActivity encBackupMainActivity) {
        AnonymousClass02C r3 = encBackupMainActivity.A00;
        if (r3 == null) {
            return;
        }
        if (r3.A04() <= 1) {
            encBackupMainActivity.setResult(0, C13680ns.A09());
            encBackupMainActivity.finish();
            return;
        }
        String str = ((AnonymousClass050) ((AnonymousClass052) r3.A0E.get(r3.A04() - 2))).A0A;
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (encBackupMainActivity.A02.A0G()) {
                    AnonymousClass02C r2 = encBackupMainActivity.A00;
                    if (r2.A04() > 2 || parseInt == 202 || parseInt == 203) {
                        String str2 = ((AnonymousClass050) ((AnonymousClass052) r2.A0E.get(r2.A04() - 3))).A0A;
                        if (str2 != null) {
                            parseInt = Integer.parseInt(str2);
                        }
                    }
                }
                encBackupMainActivity.A02.A0C(parseInt);
            } catch (NumberFormatException unused) {
                Log.e("EncBackupMainActivity unable to set fragment request code to proper value after back navigation");
            }
        }
    }

    public void A1q() {
        if (!this.A03) {
            this.A03 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public final void A35(WaFragment waFragment, int i2, boolean z2) {
        this.A01.setVisibility(C13680ns.A02(z2 ? 1 : 0));
        this.A01.setOnClickListener(z2 ? new ViewOnClickCListenerShape4S0100000_I1(this, 4) : null);
        this.A04.A01(new AnonymousClass3Og(this, z2), this);
        String valueOf = String.valueOf(i2);
        AnonymousClass01A A0B = this.A00.A0B(valueOf);
        if (this.A00 == null) {
            return;
        }
        if (A0B == null || A0B.A0e()) {
            AnonymousClass050 r1 = new AnonymousClass050(this.A00);
            r1.A0E(waFragment, valueOf, R.id.fragment_container);
            r1.A0I(valueOf);
            r1.A02();
        }
    }

    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
        Object A012 = this.A02.A03.A01();
        if (A012 != null) {
            AnonymousClass01A A0B = this.A00.A0B(A012.toString());
            if (A0B instanceof EncryptionKeyDisplayFragment) {
                ((EncryptionKeyDisplayFragment) A0B).A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0265);
        WaImageButton waImageButton = (WaImageButton) AnonymousClass00T.A05(this, R.id.enc_backup_toolbar_button);
        this.A01 = waImageButton;
        C447725m.A01(this, waImageButton, this.A01, R.drawable.ic_back);
        this.A00 = AGM();
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) new C006602z(this).A01(EncBackupViewModel.class);
        this.A02 = encBackupViewModel;
        C13680ns.A1M(this, encBackupViewModel.A03, 1);
        C13680ns.A1L(this, this.A02.A04, 4);
        C13680ns.A1L(this, this.A02.A07, 5);
        this.A02.A0E(C13690nt.A0E(this));
    }
}
