package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass01V;
import X.AnonymousClass050;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14710pd;
import X.C14870pt;
import X.C16300so;
import X.C19980zJ;
import X.C23071Aj;
import X.C34331k5;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape212S0100000_2_I1;
import com.facebook.redex.IDxAListenerShape290S0100000_2_I1;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;
import com.obwhatsapp.deviceauth.BiometricAuthPlugin;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;

public class EncryptionKeyInputFragment extends Hilt_EncryptionKeyInputFragment {
    public Button A00;
    public RelativeLayout A01;
    public C19980zJ A02;
    public C16300so A03;
    public C14870pt A04;
    public C23071Aj A05;
    public EncBackupViewModel A06;
    public EncryptionKeyFragment A07;
    public AnonymousClass01V A08;
    public BiometricAuthPlugin A09;
    public C14710pd A0A;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0263);
    }

    public void A18(Bundle bundle, View view) {
        Resources A032;
        int i2;
        Object[] objArr;
        super.A17(bundle);
        EncBackupViewModel A0T = C13680ns.A0T(this);
        this.A06 = A0T;
        int A052 = A0T.A05();
        View view2 = view;
        TextView A0L = C13680ns.A0L(view2, R.id.enc_backup_encryption_key_input_instructional);
        View A0E = C004601z.A0E(view2, R.id.enc_backup_encryption_key_input_forgot);
        int i3 = 64;
        if (A052 == 6 || A052 == 4) {
            C14710pd r9 = this.A0A;
            C14870pt r14 = this.A04;
            C16300so r13 = this.A03;
            AnonymousClass01V r15 = this.A08;
            this.A09 = new BiometricAuthPlugin(A0D(), r13, r14, r15, new IDxAListenerShape290S0100000_2_I1(this, 0), r9, R.string.str0792, R.string.str0791);
            C34331k5.A01(A0E, this, 8);
            C13690nt.A1J(A0H(), this.A06.A04, this, 2);
            if (A052 == 6) {
                A032 = A03();
                i2 = R.plurals.plurals004e;
                objArr = new Object[]{64};
                i3 = 64;
                C13700nu.A0M(A032, A0L, objArr, i2, i3);
                AnonymousClass050 r3 = new AnonymousClass050(A0F());
                EncryptionKeyFragment encryptionKeyFragment = new EncryptionKeyFragment();
                this.A07 = encryptionKeyFragment;
                r3.A0A(encryptionKeyFragment, R.id.encryption_key_input_encryption_key_container);
                r3.A01();
                this.A00 = (Button) C004601z.A0E(view2, R.id.encryption_key_input_next_button);
                this.A01 = (RelativeLayout) C004601z.A0E(view2, R.id.enc_key_background);
                A1B(false);
                C13680ns.A1N(A0H(), this.A06.A02, this, 6);
            }
            i3 = 64;
            A032 = A03();
            i2 = R.plurals.plurals004f;
        } else {
            if (A052 == 2) {
                C34331k5.A01(A0E, this, 9);
                A032 = A03();
                i2 = R.plurals.plurals004b;
            }
            AnonymousClass050 r32 = new AnonymousClass050(A0F());
            EncryptionKeyFragment encryptionKeyFragment2 = new EncryptionKeyFragment();
            this.A07 = encryptionKeyFragment2;
            r32.A0A(encryptionKeyFragment2, R.id.encryption_key_input_encryption_key_container);
            r32.A01();
            this.A00 = (Button) C004601z.A0E(view2, R.id.encryption_key_input_next_button);
            this.A01 = (RelativeLayout) C004601z.A0E(view2, R.id.enc_key_background);
            A1B(false);
            C13680ns.A1N(A0H(), this.A06.A02, this, 6);
        }
        objArr = new Object[]{64};
        C13700nu.A0M(A032, A0L, objArr, i2, i3);
        AnonymousClass050 r322 = new AnonymousClass050(A0F());
        EncryptionKeyFragment encryptionKeyFragment22 = new EncryptionKeyFragment();
        this.A07 = encryptionKeyFragment22;
        r322.A0A(encryptionKeyFragment22, R.id.encryption_key_input_encryption_key_container);
        r322.A01();
        this.A00 = (Button) C004601z.A0E(view2, R.id.encryption_key_input_next_button);
        this.A01 = (RelativeLayout) C004601z.A0E(view2, R.id.enc_key_background);
        A1B(false);
        C13680ns.A1N(A0H(), this.A06.A02, this, 6);
    }

    public void A1B(boolean z2) {
        this.A00.setEnabled(z2);
        this.A00.setOnClickListener(z2 ? new ViewOnClickCListenerShape4S0100000_I1(this, 10) : null);
        RelativeLayout relativeLayout = this.A01;
        int i2 = R.drawable.enc_backup_enc_key_bg_disabled;
        if (z2) {
            i2 = R.drawable.enc_backup_enc_key_bg;
        }
        relativeLayout.setBackgroundResource(i2);
        EncryptionKeyFragment encryptionKeyFragment = this.A07;
        CodeInputField[] codeInputFieldArr = encryptionKeyFragment.A04;
        if (codeInputFieldArr != null) {
            codeInputFieldArr[codeInputFieldArr.length - 1].setOnEditorActionListener(z2 ? new IDxAListenerShape212S0100000_2_I1(encryptionKeyFragment, 0) : null);
            Context A0u = encryptionKeyFragment.A0u();
            if (A0u != null) {
                int i3 = R.color.color0717;
                if (z2) {
                    i3 = R.color.color0659;
                }
                for (CodeInputField A0v : encryptionKeyFragment.A04) {
                    C13680ns.A0v(A0u, A0v, i3);
                }
            }
        }
    }
}
