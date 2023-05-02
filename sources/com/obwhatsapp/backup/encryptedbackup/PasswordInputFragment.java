package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.AnonymousClass3K4;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C16320sq;
import X.C16940tv;
import X.C32241fu;
import X.C34331k5;
import X.C41631wI;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape212S0100000_2_I1;
import com.facebook.redex.IDxObjectShape279S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.whatsapp.util.Log;
import java.text.Normalizer;

public abstract class PasswordInputFragment extends Hilt_PasswordInputFragment {
    public int A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public CodeInputField A06;
    public EncBackupViewModel A07;
    public Button A08;
    public AnonymousClass01V A09;
    public AnonymousClass013 A0A;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0266);
    }

    public void A18(Bundle bundle, View view) {
        super.A17(bundle);
        EncBackupViewModel A0T = C13680ns.A0T(this);
        this.A07 = A0T;
        this.A00 = A0T.A05();
        this.A04 = C13680ns.A0L(view, R.id.enc_backup_password_input_title);
        this.A03 = C13680ns.A0L(view, R.id.enc_backup_password_input_instruction);
        this.A01 = C13680ns.A0L(view, R.id.enc_backup_password_input_forgot_password);
        this.A06 = (CodeInputField) C004601z.A0E(view, R.id.enc_backup_password_input);
        this.A02 = C13680ns.A0L(view, R.id.enc_backup_password_input_requirement);
        this.A08 = (Button) C004601z.A0E(view, R.id.enc_backup_password_input_button);
        this.A05 = C13680ns.A0L(view, R.id.enc_backup_password_input_use_encryption_key_button);
        this.A01.setVisibility(8);
        this.A05.setVisibility(8);
        this.A06.addTextChangedListener(new IDxObjectShape279S0100000_2_I1(this, 1));
        A1G(false);
        C13680ns.A1N(A0H(), this.A07.A04, this, 7);
    }

    public void A1B() {
        EncBackupViewModel encBackupViewModel;
        int i2;
        String str;
        EncBackupViewModel encBackupViewModel2;
        C16320sq r2;
        int i3;
        if (this instanceof VerifyPasswordFragment) {
            Editable text = this.A06.getText();
            if (text != null) {
                EncBackupViewModel encBackupViewModel3 = this.A07;
                encBackupViewModel3.A05.A0B(Normalizer.normalize(AnonymousClass3K4.A0Z(text), Normalizer.Form.NFKC));
                encBackupViewModel2 = this.A07;
                AnonymousClass027 r1 = encBackupViewModel2.A04;
                C13680ns.A1O(r1, 2);
                if (encBackupViewModel2.A0B.A01.A00() != null) {
                    r2 = encBackupViewModel2.A0I;
                    i3 = 47;
                } else {
                    Log.i("EncBackupViewModel/no attempts remaining");
                    C13680ns.A1P(r1, 7);
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof RestorePasswordInputFragment) {
            Editable text2 = this.A06.getText();
            if (text2 != null) {
                EncBackupViewModel encBackupViewModel4 = this.A07;
                encBackupViewModel4.A05.A0B(Normalizer.normalize(AnonymousClass3K4.A0Z(text2), Normalizer.Form.NFKC));
                encBackupViewModel2 = this.A07;
                boolean A0F = encBackupViewModel2.A0H.A0F();
                AnonymousClass027 r12 = encBackupViewModel2.A04;
                if (!A0F) {
                    C13680ns.A1O(r12, 4);
                    return;
                }
                C13680ns.A1O(r12, 2);
                r2 = encBackupViewModel2.A0I;
                i3 = 46;
            } else {
                return;
            }
        } else {
            if (this instanceof CreatePasswordFragment) {
                Editable text3 = this.A06.getText();
                if (text3 != null) {
                    String normalize = Normalizer.normalize(AnonymousClass3K4.A0Z(text3), Normalizer.Form.NFKC);
                    int A002 = C16940tv.A00(normalize);
                    if (A002 == 1) {
                        Resources A032 = A03();
                        Object[] objArr = new Object[1];
                        AnonymousClass000.A1M(objArr, 6, 0);
                        str = A032.getQuantityString(R.plurals.plurals0049, 6, objArr);
                    } else if (A002 == 2) {
                        Resources A033 = A03();
                        Object[] objArr2 = new Object[1];
                        AnonymousClass000.A1M(objArr2, 1, 0);
                        str = A033.getQuantityString(R.plurals.plurals0048, 1, objArr2);
                    } else if (A002 == 3) {
                        str = A0J(R.string.str07cd);
                    } else if (A002 == 4) {
                        this.A07.A05.A0B(normalize);
                        encBackupViewModel = this.A07;
                        i2 = 400;
                    } else {
                        return;
                    }
                    A1E(str, true);
                    return;
                }
                return;
            }
            ConfirmPasswordFragment confirmPasswordFragment = (ConfirmPasswordFragment) this;
            Editable text4 = confirmPasswordFragment.A06.getText();
            if (text4 == null || !Normalizer.normalize(AnonymousClass3K4.A0Z(text4), Normalizer.Form.NFKC).equals(confirmPasswordFragment.A00)) {
                confirmPasswordFragment.A1E(confirmPasswordFragment.A0J(R.string.str07a0), true);
                return;
            }
            int i4 = confirmPasswordFragment.A00;
            encBackupViewModel = confirmPasswordFragment.A07;
            if (i4 == 1) {
                i2 = 500;
            } else {
                encBackupViewModel.A07();
                return;
            }
            encBackupViewModel.A0C(i2);
            return;
        }
        r2.Acl(new RunnableRunnableShape2S0100000_I0_1(encBackupViewModel2, i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r1 == 0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 <= 1) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1C() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof com.obwhatsapp.backup.encryptedbackup.VerifyPasswordFragment
            if (r0 != 0) goto L_0x0089
            boolean r0 = r9 instanceof com.obwhatsapp.backup.encryptedbackup.RestorePasswordInputFragment
            if (r0 != 0) goto L_0x0089
            boolean r1 = r9 instanceof com.obwhatsapp.backup.encryptedbackup.CreatePasswordFragment
            com.obwhatsapp.CodeInputField r0 = r9.A06
            android.text.Editable r0 = r0.getText()
            if (r1 == 0) goto L_0x005a
            r8 = 1
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.toString()
            int r1 = X.C16940tv.A00(r0)
            r0 = 1
            if (r1 > r8) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r9.A1G(r0)
            r7 = 2131755079(0x7f100047, float:1.9141027E38)
            android.content.Context r6 = r9.A0u()
            if (r6 == 0) goto L_0x0059
            r5 = 0
            X.AnonymousClass00B.A0F(r8)
            android.widget.TextView r4 = r9.A02
            android.content.res.Resources r3 = r9.A03()
            java.lang.Object[] r2 = X.C13690nt.A1Z()
            r1 = 6
            X.AnonymousClass000.A1M(r2, r1, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2[r8] = r0
            java.lang.String r0 = r3.getQuantityString(r7, r1, r2)
            r4.setText(r0)
            android.widget.TextView r1 = r9.A02
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            X.C13680ns.A0v(r6, r1, r0)
            android.widget.TextView r0 = r9.A02
            r0.setVisibility(r5)
        L_0x0059:
            return
        L_0x005a:
            r1 = 1
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = r0.toString()
            int r0 = X.C16940tv.A00(r0)
            if (r0 <= r1) goto L_0x0087
        L_0x0067:
            r9.A1G(r1)
            r1 = 2131888030(0x7f12079e, float:1.9410684E38)
            android.content.Context r3 = r9.A0u()
            if (r3 == 0) goto L_0x0059
            r2 = 0
            android.widget.TextView r0 = r9.A02
            r0.setText(r1)
            android.widget.TextView r1 = r9.A02
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            X.C13680ns.A0v(r3, r1, r0)
            android.widget.TextView r0 = r9.A02
            r0.setVisibility(r2)
            return
        L_0x0087:
            r1 = 0
            goto L_0x0067
        L_0x0089:
            com.obwhatsapp.CodeInputField r0 = r9.A06
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r0.toString()
            int r1 = X.C16940tv.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            r9.A1G(r0)
            android.widget.TextView r1 = r9.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment.A1C():void");
    }

    public final void A1D(DialogInterface.OnClickListener onClickListener, String str, boolean z2) {
        C32241fu A002 = C32241fu.A00(A0D());
        A002.A06(str);
        A002.setPositiveButton(R.string.str0e87, onClickListener);
        C13690nt.A1G(A002);
        A1F(z2);
        A1G(false);
        C41631wI.A02(this.A09);
        Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PasswordInputFragment/error modal shown with message: ")));
    }

    public void A1E(String str, boolean z2) {
        Context A0u = A0u();
        if (A0u != null) {
            this.A02.setText(str);
            C13680ns.A0v(A0u, this.A02, R.color.color0699);
            this.A02.setVisibility(0);
            A1F(z2);
            A1G(false);
            C41631wI.A02(this.A09);
            Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PasswordInputFragment/error message shown: ")));
        }
    }

    public void A1F(boolean z2) {
        this.A06.setEnabled(z2);
        if (z2) {
            InputMethodManager A0Q = this.A09.A0Q();
            if (A0Q != null && !A0Q.isAcceptingText()) {
                A0Q.toggleSoftInput(1, 1);
            }
            this.A06.requestFocus();
        }
    }

    public void A1G(boolean z2) {
        IDxAListenerShape212S0100000_2_I1 iDxAListenerShape212S0100000_2_I1;
        CodeInputField codeInputField;
        this.A08.setEnabled(z2);
        Button button = this.A08;
        if (z2) {
            C34331k5.A01(button, this, 11);
            codeInputField = this.A06;
            iDxAListenerShape212S0100000_2_I1 = new IDxAListenerShape212S0100000_2_I1(this, 1);
        } else {
            iDxAListenerShape212S0100000_2_I1 = null;
            button.setOnClickListener((View.OnClickListener) null);
            codeInputField = this.A06;
        }
        codeInputField.setOnEditorActionListener(iDxAListenerShape212S0100000_2_I1);
    }
}
