package com.obwhatsapp.account.delete;

import X.AnonymousClass3K3;
import X.C005402i;
import X.C05230Pu;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C32241fu;
import X.C447725m;
import X.C49132Rg;
import X.C91244fb;
import X.C94904lf;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape237S0100000_2_I1;
import com.facebook.redex.IDxDListenerShape191S0100000_2_I1;
import com.facebook.redex.IDxDListenerShape411S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.obwhatsapp.R;

public class DeleteAccountFeedback extends C14530pL {
    public static final int[] A09 = {R.string.str067c, R.string.str067b, R.string.str0682, R.string.str067e, R.string.str067f, R.string.str0680};
    public int A00;
    public int A01;
    public View A02;
    public EditText A03;
    public ScrollView A04;
    public C05230Pu A05;
    public DialogFragment A06;
    public boolean A07;
    public boolean A08;

    public class ChangeNumberMessageDialogFragment extends Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment {
        public static DialogFragment A01(String str) {
            ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = new ChangeNumberMessageDialogFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putInt("deleteReason", 1);
            A0D.putString("additionalComments", str);
            changeNumberMessageDialogFragment.A0T(A0D);
            return changeNumberMessageDialogFragment;
        }

        public Dialog A1B(Bundle bundle) {
            int i2 = A04().getInt("deleteReason", -1);
            String string = A04().getString("additionalComments");
            C32241fu A0c = AnonymousClass3K3.A0c(this);
            A0c.A06(C13690nt.A0c(this, A0J(R.string.str1533), C13680ns.A1b(), 0, R.string.str066a));
            C13680ns.A1H(A0c, this, 12, R.string.str1533);
            A0c.setNegativeButton(R.string.str1543, new C91244fb(this, string, i2));
            return A0c.create();
        }
    }

    public DeleteAccountFeedback() {
        this(0);
        this.A01 = -1;
        this.A07 = false;
    }

    public DeleteAccountFeedback(int i2) {
        this.A08 = false;
        C13680ns.A1G(this, 7);
    }

    public void A1q() {
        if (!this.A08) {
            this.A08 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public final void A35() {
        this.A02.setElevation(this.A04.canScrollVertically(1) ? (float) this.A00 : 0.0f);
    }

    public final void A36() {
        this.A04.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape191S0100000_2_I1(this, 1));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            A36();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str153c);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
        }
        setContentView((int) R.layout.layout0212);
        this.A04 = (ScrollView) findViewById(R.id.scroll_view);
        this.A03 = (EditText) findViewById(R.id.delete_reason_additional_comments_edittext);
        this.A02 = findViewById(R.id.bottom_button_container);
        TextView A0N = C13680ns.A0N(this, R.id.select_delete_reason);
        A0N.setBackground(C447725m.A00(this, this.A01, R.drawable.abc_spinner_textfield_background_material));
        this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen06f3);
        if (bundle != null) {
            this.A01 = bundle.getInt("delete_reason_selected", -1);
            this.A07 = bundle.getBoolean("delete_reason_showing", false);
            EditText editText = this.A03;
            int i2 = this.A01;
            int i3 = R.string.str0668;
            if (i2 == 2) {
                i3 = R.string.str0669;
            }
            editText.setHint(getString(i3));
        }
        int i4 = this.A01;
        int[] iArr = A09;
        int length = iArr.length;
        if (i4 >= length || i4 < 0) {
            C13700nu.A0T(A0N);
        } else {
            A0N.setText(iArr[i4]);
        }
        this.A05 = new C05230Pu(this, findViewById(R.id.delete_reason_prompt), 0, R.attr.attr03db);
        for (int i5 = 0; i5 < length; i5++) {
            this.A05.A04.add(0, i5, 0, iArr[i5]);
        }
        C05230Pu r1 = this.A05;
        r1.A00 = new IDxDListenerShape411S0100000_2_I1(this, 0);
        r1.A01 = new C94904lf(A0N, this);
        C13680ns.A1A(A0N, this, 12);
        C13680ns.A1A(findViewById(R.id.delete_account_submit), this, 13);
        this.A00.post(new RunnableRunnableShape17S0100000_I1((Object) this, 9));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen06f3);
            this.A04.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape237S0100000_2_I1(this, 1));
            A36();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("delete_reason_selected", this.A01);
        bundle.putBoolean("delete_reason_showing", this.A07);
        super.onSaveInstanceState(bundle);
    }

    public void onStop() {
        super.onStop();
        C05230Pu r1 = this.A05;
        if (r1 != null) {
            r1.A00 = null;
            r1.A05.A01();
        }
    }
}
