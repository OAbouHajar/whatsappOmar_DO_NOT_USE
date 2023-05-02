package com.obwhatsapp.authentication;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass050;
import X.AnonymousClass0rA;
import X.AnonymousClass2JN;
import X.AnonymousClass3MF;
import X.C001000l;
import X.C14860ps;
import X.C14870pt;
import X.C16320sq;
import X.C57102q8;
import X.C63783Lm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentTransaction;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.IDxECallbackShape271S0100000_2_I0;
import com.facebook.redex.IDxSInterfaceShape356S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape246S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.List;

public class VerifyTwoFactorAuthCodeDialogFragment extends Hilt_VerifyTwoFactorAuthCodeDialogFragment implements AnonymousClass0rA {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public CodeInputField A03;
    public C14870pt A04;
    public AnonymousClass01V A05;
    public C14860ps A06;
    public C16320sq A07;
    public final Handler A08 = new C63783Lm(Looper.getMainLooper(), this);
    public final Runnable A09 = new RunnableRunnableShape2S0100000_I0_1(this, 35);

    public void A0w() {
        super.A0w();
        List list = this.A06.A0B;
        AnonymousClass00B.A0G(list.contains(this));
        list.remove(this);
    }

    public void A14() {
        super.A14();
        List list = this.A06.A0B;
        AnonymousClass00B.A0G(!list.contains(this));
        list.add(this);
    }

    public Dialog A1B(Bundle bundle) {
        Dialog dialog = new Dialog(A0C());
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(R.layout.layout02a8);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) dialog.findViewById(R.id.nag_text);
        textEmojiLabel.A07 = new AnonymousClass3MF();
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A05));
        textEmojiLabel.setText(AnonymousClass2JN.A08(new RunnableRunnableShape2S0100000_I0_1(this, 36), A0J(R.string.str183a), "forgot-pin"));
        this.A02 = (TextView) dialog.findViewById(R.id.error);
        this.A03 = (CodeInputField) dialog.findViewById(R.id.code);
        String A0K = A0K(R.string.str0041, 6);
        CodeInputField codeInputField = this.A03;
        codeInputField.A08(new IDxECallbackShape271S0100000_2_I0(this, 0), new IDxSInterfaceShape356S0100000_2_I0(codeInputField.getContext(), 0), (String) null, A0K, '*', '*', 6);
        this.A03.setPasswordTransformationEnabled(true);
        this.A01 = (ProgressBar) dialog.findViewById(R.id.progress_bar_code_input_blocked);
        this.A03.setEnabled(true);
        this.A01.setProgress(100);
        dialog.setOnShowListener(new IDxSListenerShape246S0100000_2_I0(this, 0));
        dialog.getWindow().addFlags(8192);
        return dialog;
    }

    public void A1N() {
        this.A00 = 1;
        this.A04.A08(0, R.string.str183f);
        this.A04.A0L(this.A09, 5000);
        C14860ps r2 = this.A06;
        Log.i("twofactorauthmanager/disable-two-factor-auth");
        r2.A04("", (String) null);
    }

    public final void A1O() {
        C001000l A0C = A0C();
        if (A0C != null) {
            AnonymousClass050 r1 = new AnonymousClass050(A0C.AGM());
            r1.A07(this);
            r1.A07 = FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
            r1.A02();
        }
    }

    public void AZH() {
        if (this.A00 == 1) {
            this.A00 = 0;
            this.A04.A0J(this.A09);
            this.A04.A0L(new RunnableRunnableShape2S0100000_I0_1(this, 37), 500);
        }
    }

    public void AZI() {
        if (this.A00 == 1) {
            this.A00 = 3;
            this.A04.A0J(this.A09);
            this.A04.A0L(new RunnableRunnableShape2S0100000_I0_1(this, 39), 500);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C001000l A0C;
        super.onDismiss(dialogInterface);
        int i2 = this.A00;
        if (i2 != 2 && i2 != 4 && (A0C = A0C()) != null) {
            A0C.finish();
        }
    }
}
