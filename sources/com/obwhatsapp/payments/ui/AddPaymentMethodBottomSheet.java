package com.obwhatsapp.payments.ui;

import X.AnonymousClass01V;
import X.AnonymousClass174;
import X.AnonymousClass1Vo;
import X.AnonymousClass5vV;
import X.AnonymousClass5yC;
import X.C004101u;
import X.C004601z;
import X.C110105dW;
import X.C110115dX;
import X.C111925he;
import X.C117265si;
import X.C13680ns;
import X.C16490t9;
import X.C30531cW;
import X.C30681cm;
import X.C53842gO;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class AddPaymentMethodBottomSheet extends Hilt_AddPaymentMethodBottomSheet {
    public AnonymousClass01V A00;
    public C16490t9 A01;
    public AnonymousClass174 A02;
    public AnonymousClass5vV A03;
    public C117265si A04;
    public Runnable A05;
    public final AnonymousClass5yC A06 = new AnonymousClass5yC();
    public final AnonymousClass1Vo A07 = C110105dW.A0Q("AddPaymentMethodBottomSheet", "payment-settings");

    public void A0x(int i2, int i3, Intent intent) {
        if (i2 != 10) {
            super.A0x(i2, i3, intent);
        } else if (i3 == -1) {
            Runnable runnable = this.A05;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            A1C();
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView A0M;
        TextEmojiLabel textEmojiLabel;
        TextView A0M2;
        View inflate = layoutInflater.inflate(R.layout.layout0063, viewGroup, false);
        C117265si r0 = this.A04;
        if (r0 != null) {
            String str = r0.A03;
            if (!TextUtils.isEmpty(str) && (A0M2 = C13680ns.A0M(inflate, R.id.add_payment_method_bottom_sheet_title)) != null) {
                A0M2.setText(str);
            }
            String str2 = this.A04.A02;
            if (!TextUtils.isEmpty(str2) && (textEmojiLabel = (TextEmojiLabel) inflate.findViewById(R.id.add_payment_method_bottom_sheet_desc)) != null) {
                C30531cW.A04(textEmojiLabel, this.A00, str2);
            }
            String str3 = this.A04.A01;
            if (!TextUtils.isEmpty(str3) && (A0M = C13680ns.A0M(inflate, R.id.add_payment_method)) != null) {
                A0M.setText(str3);
            }
            if (!TextUtils.isEmpty((CharSequence) null)) {
                View A0E = C004601z.A0E(inflate, R.id.extra_info_education_divider);
                View A0E2 = C004601z.A0E(inflate, R.id.extra_info_education_container);
                TextView A0L = C13680ns.A0L(inflate, R.id.extra_info_education_text);
                A0E.setVisibility(0);
                A0E2.setVisibility(0);
                A0L.setText((CharSequence) null);
            }
        }
        C30681cm A012 = this.A02.A01();
        if (A012 == null) {
            this.A07.A05("createEvent/null country");
        } else {
            C111925he r3 = new C111925he();
            AnonymousClass5vV r2 = this.A03;
            byte[] bArr = new byte[8];
            r2.A03.nextBytes(bArr);
            String A042 = C004101u.A04(bArr);
            r2.A02 = A042;
            r3.A02 = A042;
            r3.A01 = A012.A03;
            this.A01.A06(r3);
        }
        C30681cm A013 = this.A02.A01();
        if (A013 == null) {
            this.A07.A05("createUserActionEvent/null country");
        } else {
            C53842gO r32 = new C53842gO();
            AnonymousClass5vV r22 = this.A03;
            byte[] bArr2 = new byte[8];
            r22.A03.nextBytes(bArr2);
            String A043 = C004101u.A04(bArr2);
            r22.A02 = A043;
            r32.A0U = A043;
            r32.A0R = A013.A03;
            r32.A0a = "get_started";
            C110115dX.A10(r32, 0);
            this.A01.A06(r32);
        }
        C110105dW.A0r(inflate.findViewById(R.id.add_payment_method), this, 6);
        return inflate;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.A06.onDismiss(dialogInterface);
    }
}
