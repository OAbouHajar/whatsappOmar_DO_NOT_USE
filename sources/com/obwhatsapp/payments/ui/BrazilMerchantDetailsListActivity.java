package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass174;
import X.AnonymousClass17O;
import X.AnonymousClass1KO;
import X.AnonymousClass1Vt;
import X.AnonymousClass5o4;
import X.C005602k;
import X.C110105dW;
import X.C110115dX;
import X.C110655eb;
import X.C112845jn;
import X.C113375lw;
import X.C117655tL;
import X.C117755tV;
import X.C1200860g;
import X.C1204661t;
import X.C1212764w;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C16320sq;
import X.C17130ua;
import X.C18090w8;
import X.C30671cl;
import X.C49132Rg;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.HashMap;

public class BrazilMerchantDetailsListActivity extends C112845jn {
    public AnonymousClass1KO A00;
    public C17130ua A01;
    public C1200860g A02;
    public C1204661t A03;
    public AnonymousClass17O A04;
    public AnonymousClass174 A05;
    public C18090w8 A06;
    public AnonymousClass5o4 A07;
    public C110655eb A08;
    public C117755tV A09;
    public boolean A0A;

    public BrazilMerchantDetailsListActivity() {
        this(0);
    }

    public BrazilMerchantDetailsListActivity(int i2) {
        this.A0A = false;
        C110105dW.A0t(this, 15);
    }

    public static /* synthetic */ void A0A(BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity, C117655tL r14) {
        Uri uri;
        String str;
        BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity2 = brazilMerchantDetailsListActivity;
        switch (r14.A01) {
            case 0:
                Context applicationContext = brazilMerchantDetailsListActivity.getApplicationContext();
                Intent A092 = C13680ns.A09();
                A092.setClassName(applicationContext.getPackageName(), "com.obwhatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity");
                brazilMerchantDetailsListActivity.startActivity(A092);
                return;
            case 1:
                C16320sq r2 = brazilMerchantDetailsListActivity.A05;
                AnonymousClass5o4 r0 = brazilMerchantDetailsListActivity.A07;
                if (r0 != null && r0.A03() == 1) {
                    brazilMerchantDetailsListActivity.A07.A06(false);
                }
                Bundle A0D = C13690nt.A0D();
                A0D.putString("com.obwhatsapp.support.DescribeProblemActivity.from", "payments:settings");
                C17130ua r8 = brazilMerchantDetailsListActivity.A01;
                AnonymousClass5o4 r3 = new AnonymousClass5o4(A0D, brazilMerchantDetailsListActivity2, brazilMerchantDetailsListActivity.A00, brazilMerchantDetailsListActivity.A06, r8, brazilMerchantDetailsListActivity.A01, (C30671cl) null, (AnonymousClass1Vt) null, brazilMerchantDetailsListActivity.A0D, brazilMerchantDetailsListActivity.A05, "payments:settings");
                brazilMerchantDetailsListActivity2.A07 = r3;
                C13680ns.A1U(r3, r2);
                return;
            case 2:
                uri = r14.A03;
                AnonymousClass00B.A06(uri);
                str = "android.intent.action.VIEW";
                break;
            case 3:
                uri = Uri.fromParts("tel", r14.A05, (String) null);
                str = "android.intent.action.DIAL";
                break;
            case 4:
                brazilMerchantDetailsListActivity.Ac1();
                Context applicationContext2 = brazilMerchantDetailsListActivity.getApplicationContext();
                HashMap hashMap = r14.A07;
                String str2 = r14.A06;
                Intent A093 = C13680ns.A09();
                A093.setClassName(applicationContext2.getPackageName(), "com.obwhatsapp.payments.ui.BrazilPayBloksActivity");
                A093.putExtra("screen_params", hashMap);
                A093.putExtra("screen_name", str2);
                brazilMerchantDetailsListActivity.Ag3(A093, 1);
                return;
            case 5:
                if (r14.A08) {
                    brazilMerchantDetailsListActivity.A2h(brazilMerchantDetailsListActivity.getString(r14.A02));
                    return;
                } else {
                    brazilMerchantDetailsListActivity.Ac1();
                    return;
                }
            case 6:
                brazilMerchantDetailsListActivity.Afg(r14.A00);
                return;
            default:
                brazilMerchantDetailsListActivity.A02.A01(brazilMerchantDetailsListActivity2, brazilMerchantDetailsListActivity.A0C, brazilMerchantDetailsListActivity.A03, r14.A04.A00, R.string.str1031).show();
                return;
        }
        Intent intent = new Intent(str, uri);
        if (intent.resolveActivity(brazilMerchantDetailsListActivity.getPackageManager()) != null) {
            brazilMerchantDetailsListActivity.startActivity(intent);
        }
    }

    public void A1q() {
        if (!this.A0A) {
            this.A0A = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A00 = C110115dX.A0Q(r1);
            this.A01 = (C17130ua) r1.AN9.get();
            this.A00 = (AnonymousClass1KO) r1.ALY.get();
            this.A06 = C16150sX.A10(r1);
            this.A02 = A0C.A0N();
            this.A05 = (AnonymousClass174) r1.AI3.get();
            this.A03 = C110115dX.A0J(r1);
            this.A04 = (AnonymousClass17O) r1.AHe.get();
            this.A09 = (C117755tV) r1.A2X.get();
        }
    }

    public void A2S(int i2) {
        if (i2 == R.string.str14e5) {
            finish();
        }
    }

    public C005602k A35(ViewGroup viewGroup, int i2) {
        return i2 != 302 ? super.A35(viewGroup, i2) : new C113375lw(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout03df));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            C110655eb r2 = this.A08;
            r2.A0U.Acl(new C1212764w(r2));
        }
    }
}
