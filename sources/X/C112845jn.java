package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape13S0101000_3_I1;
import com.facebook.redex.IDxCListenerShape1S0111000_3_I1;
import com.facebook.redex.IDxCListenerShape8S0101000_3_I1;
import com.facebook.redex.IDxIFactoryShape5S0200000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilMerchantDetailsListActivity;
import java.util.List;

/* renamed from: X.5jn  reason: invalid class name and case insensitive filesystem */
public abstract class C112845jn extends C112945ks {
    public C18290wS A00;
    public C110655eb A01;

    public C005602k A35(ViewGroup viewGroup, int i2) {
        return i2 != 300 ? i2 != 301 ? i2 != 303 ? i2 != 305 ? super.A35(viewGroup, i2) : new C113415m1(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout03e1)) : new C113325lr(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout044d)) : new C113395ly(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout03dd)) : new C113425m2(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout03de));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity = (BrazilMerchantDetailsListActivity) this;
        C110655eb r3 = (C110655eb) new C006602z((AnonymousClass04o) new IDxIFactoryShape5S0200000_3_I1(brazilMerchantDetailsListActivity, 0, brazilMerchantDetailsListActivity.A09), (C001500q) brazilMerchantDetailsListActivity).A01(C110655eb.class);
        brazilMerchantDetailsListActivity.A08 = r3;
        r3.A03.A0A(r3.A07, C110115dX.A07(brazilMerchantDetailsListActivity, 2));
        C110655eb r32 = brazilMerchantDetailsListActivity.A08;
        this.A01 = r32;
        r32.A00.A0A(r32.A07, C110115dX.A07(this, 52));
        C110655eb r33 = this.A01;
        r33.A04.A0A(r33.A07, C110115dX.A07(this, 51));
        C110655eb r2 = this.A01;
        r2.A0U.Acl(new C1212764w(r2));
        this.A01.setLockIconVisibility(false);
    }

    public Dialog onCreateDialog(int i2) {
        CharSequence charSequence;
        boolean z2 = false;
        if (i2 == 200) {
            charSequence = getString(R.string.str06b4);
        } else if (i2 != 201) {
            return super.onCreateDialog(i2);
        } else {
            C18290wS r0 = this.A00;
            r0.A06();
            z2 = true;
            int size = r0.A08.A0T(1).size();
            int i3 = R.string.str06b4;
            if (size > 0) {
                i3 = R.string.str06b5;
            }
            charSequence = AnonymousClass2Sy.A05(this, this.A0B, getString(i3));
        }
        String string = getString(R.string.str13e4);
        int i4 = 200;
        if (z2) {
            i4 = 201;
        }
        C32241fu A002 = C32241fu.A00(this);
        A002.A06(charSequence);
        A002.A07(true);
        A002.setNegativeButton(R.string.str0394, new IDxCListenerShape8S0101000_3_I1(this, i4, 2));
        A002.A09(new IDxCListenerShape1S0111000_3_I1(this, i4, 0, z2), string);
        A002.A03(new IDxCListenerShape13S0101000_3_I1(this, i4, 2));
        return A002.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, getString(R.string.str13e5));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_remove_payment_method) {
            return super.onOptionsItemSelected(menuItem);
        }
        C110655eb r5 = this.A01;
        List A0A = C110115dX.A0H(r5.A0Q).A0A();
        AnonymousClass1Vo r2 = r5.A02;
        StringBuilder A0r = AnonymousClass000.A0r("Remove merchant account. #methods=");
        A0r.append(A0A.size());
        C110105dW.A1L(r2, A0r);
        int i2 = 1;
        if (A0A.size() <= 1) {
            i2 = 0;
        }
        r5.A04.A0B(new C116265r6(i2));
        return true;
    }
}
