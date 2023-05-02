package com.obwhatsapp.twofactor;

import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass2JN;
import X.AnonymousClass3MF;
import X.C32241fu;
import X.C57102q8;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.text.IDxWAdapterShape102S0100000_2_I0;
import com.whatsapp.util.ViewOnClickCListenerShape3S0100000_I0_3;
import java.util.HashMap;

public class SetEmailFragment extends Hilt_SetEmailFragment {
    public int A00;
    public TextWatcher A01 = new IDxWAdapterShape102S0100000_2_I0(this, 5);
    public Button A02;
    public EditText A03;
    public TextView A04;
    public AnonymousClass01V A05;
    public TwoFactorAuthActivity A06;

    public class ConfirmSkipEmailDialog extends Hilt_SetEmailFragment_ConfirmSkipEmailDialog {
        public Dialog A1B(Bundle bundle) {
            C32241fu r3 = new C32241fu(A0u());
            r3.A01(R.string.str1847);
            r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 136));
            r3.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
            return r3.create();
        }
    }

    public static SetEmailFragment A01(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        SetEmailFragment setEmailFragment = new SetEmailFragment();
        setEmailFragment.A0T(bundle);
        return setEmailFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout02a7, viewGroup, false);
    }

    public void A13() {
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A06 = null;
        super.A13();
    }

    public void A14() {
        super.A14();
        EditText editText = this.A03;
        TextWatcher textWatcher = this.A01;
        editText.removeTextChangedListener(textWatcher);
        EditText editText2 = this.A03;
        int i2 = this.A00;
        TwoFactorAuthActivity twoFactorAuthActivity = this.A06;
        editText2.setText(i2 == 1 ? twoFactorAuthActivity.A04 : twoFactorAuthActivity.A05);
        this.A03.addTextChangedListener(textWatcher);
        A1B();
        this.A03.requestFocus();
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A00 = A04().getInt("type", 1);
    }

    public void A18(Bundle bundle, View view) {
        int i2;
        this.A06 = (TwoFactorAuthActivity) A0C();
        Button button = (Button) view.findViewById(R.id.submit);
        this.A02 = button;
        button.setOnClickListener(new ViewOnClickCListenerShape3S0100000_I0_3(this, 8));
        this.A03 = (EditText) view.findViewById(R.id.email);
        this.A04 = (TextView) view.findViewById(R.id.error);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.description);
        int i3 = this.A00;
        int i4 = 1;
        if (i3 != 1) {
            if (i3 == 2) {
                textEmojiLabel.setText(R.string.str1841);
                this.A02.setText(R.string.str1857);
                i2 = 1;
            }
            i2 = 0;
        } else {
            if (this.A06.A08[0] != 2) {
                textEmojiLabel.A07 = new AnonymousClass3MF();
                textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A05));
                String A0J = A0J(R.string.str1845);
                int A002 = AnonymousClass00T.A00(A0u(), R.color.color04f8);
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(A0u(), R.style.style0258);
                RunnableRunnableShape15S0100000_I0_14 runnableRunnableShape15S0100000_I0_14 = new RunnableRunnableShape15S0100000_I0_14(this, 45);
                HashMap hashMap = new HashMap();
                hashMap.put("skip", runnableRunnableShape15S0100000_I0_14);
                textEmojiLabel.setText(AnonymousClass2JN.A07(textAppearanceSpan, A0J, hashMap, A002));
            } else {
                textEmojiLabel.setText(R.string.str1844);
            }
            this.A02.setText(R.string.str0de0);
            i2 = 0;
        }
        TwoFactorAuthActivity twoFactorAuthActivity = this.A06;
        if (!twoFactorAuthActivity.A38(this) || twoFactorAuthActivity.A08.length == 1) {
            i4 = i2;
        }
        twoFactorAuthActivity.A36(view, i4);
    }

    public final void A1B() {
        Button button = this.A02;
        if (button != null) {
            String trim = this.A03.getText().toString().trim();
            int indexOf = trim.indexOf(64);
            boolean z2 = true;
            if (indexOf <= 0 || indexOf >= trim.length() - 1 || indexOf != trim.lastIndexOf(64)) {
                z2 = false;
            }
            button.setEnabled(z2);
        }
    }
}
