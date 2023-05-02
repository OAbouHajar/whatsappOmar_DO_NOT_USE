package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass17Y;
import X.AnonymousClass1Vt;
import X.AnonymousClass2H9;
import X.AnonymousClass5xB;
import X.AnonymousClass5xC;
import X.AnonymousClass5xN;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.C004601z;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110555eQ;
import X.C111855hW;
import X.C115305pX;
import X.C13680ns;
import X.C14870pt;
import X.C16320sq;
import X.C18260wP;
import X.C18280wR;
import X.C18290wS;
import X.C18310wU;
import X.C18340wX;
import X.C28401Vy;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public class MandateUpdateBottomSheetFragment extends Hilt_MandateUpdateBottomSheetFragment {
    public Button A00;
    public Button A01;
    public LinearLayout A02;
    public TextView A03;
    public C14870pt A04;
    public C18260wP A05;
    public AnonymousClass013 A06;
    public AnonymousClass1Vt A07;
    public AnonymousClass60V A08;
    public C18340wX A09;
    public AnonymousClass17Y A0A;
    public C18310wU A0B;
    public C18290wS A0C;
    public AnonymousClass61W A0D;
    public C110555eQ A0E;
    public AnonymousClass5xN A0F;
    public C18280wR A0G;
    public C16320sq A0H;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H2 = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout031c);
        this.A03 = C13680ns.A0L(A0H2, R.id.title);
        this.A02 = C110115dX.A05(A0H2, R.id.update_mandate_container);
        this.A00 = (Button) C004601z.A0E(A0H2, R.id.positive_button);
        this.A01 = (Button) C004601z.A0E(A0H2, R.id.negative_button);
        return A0H2;
    }

    public void A18(Bundle bundle, View view) {
        this.A0D.AKT(C13680ns.A0X(), (Integer) null, "approve_mandate_update_request_prompt", "payment_transaction_details", true);
        this.A0E = (C110555eQ) new C006602z(A0D()).A01(C110555eQ.class);
        View view2 = view;
        C110105dW.A0r(C004601z.A0E(view2, R.id.close), this, 133);
        String A082 = this.A08.A08();
        if (!TextUtils.isEmpty(A082)) {
            C13680ns.A0J(view2, R.id.psp_logo).setImageResource(C115305pX.A00(A082).A00);
        }
        this.A07 = ((AnonymousClass2H9) A04().getParcelable("transaction")).A00;
        this.A02.setVisibility(0);
        C111855hW r4 = (C111855hW) this.A07.A0A;
        AnonymousClass5xC r0 = r4.A0B;
        AnonymousClass00B.A06(r0);
        AnonymousClass5xB r1 = r0.A0C;
        boolean equals = r1.A09.equals("PENDING");
        TextView textView = this.A03;
        int i2 = R.string.str193d;
        if (equals) {
            i2 = R.string.str1932;
        }
        textView.setText(i2);
        long j2 = r1.A00;
        int i3 = (j2 > r4.A0B.A01 ? 1 : (j2 == r4.A0B.A01 ? 0 : -1));
        boolean z2 = false;
        int i4 = R.string.str18f1;
        if (i3 != 0) {
            z2 = true;
            i4 = R.string.str18f0;
        }
        String A0J = A0J(i4);
        String A042 = this.A0F.A04(j2);
        LinearLayout linearLayout = this.A02;
        int i5 = R.color.color06c5;
        if (z2) {
            i5 = R.color.color0660;
        }
        linearLayout.addView(A1A(linearLayout, A0J, A042, i5, false));
        boolean equals2 = this.A07.A08.equals(r1.A00());
        int i6 = R.string.str18ef;
        if (equals2) {
            i6 = R.string.str18e2;
        }
        String A0J2 = A0J(i6);
        AnonymousClass5xN r3 = this.A0F;
        C28401Vy A002 = r1.A00() != null ? r1.A00() : this.A07.A08;
        String str = r1.A07;
        if (str == null) {
            str = r4.A0B.A0F;
        }
        String A052 = r3.A05(A002, str);
        LinearLayout linearLayout2 = this.A02;
        linearLayout2.addView(A1A(linearLayout2, A0J2, A052, R.color.color0660, true));
        if (!r1.A09.equals("INIT") || !r1.A08.equals("UNKNOWN")) {
            this.A00.setVisibility(8);
            this.A01.setVisibility(8);
            return;
        }
        C110105dW.A0r(this.A00, this, 132);
        this.A01.setVisibility(0);
        C110105dW.A0r(this.A01, this, 134);
    }

    public final View A1A(LinearLayout linearLayout, CharSequence charSequence, CharSequence charSequence2, int i2, boolean z2) {
        View A0H2 = C13680ns.A0H(LayoutInflater.from(A0C()), linearLayout, R.layout.layout031a);
        TextView A0L = C13680ns.A0L(A0H2, R.id.left_text);
        TextView A0L2 = C13680ns.A0L(A0H2, R.id.right_text);
        A0L.setText(charSequence);
        A0L2.setText(charSequence2);
        if (z2) {
            A0L.setTypeface(A0L.getTypeface(), 1);
            A0L2.setTypeface(A0L2.getTypeface(), 1);
        }
        C13680ns.A0v(A0L.getContext(), A0L, i2);
        C13680ns.A0v(A0L2.getContext(), A0L2, i2);
        return A0H2;
    }
}
