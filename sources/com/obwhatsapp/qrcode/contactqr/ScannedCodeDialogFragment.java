package com.obwhatsapp.qrcode.contactqr;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass156;
import X.AnonymousClass26U;
import X.AnonymousClass2Ao;
import X.AnonymousClass2RN;
import X.AnonymousClass2Sy;
import X.C004601z;
import X.C14650pX;
import X.C14750ph;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16260sj;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C17030uP;
import X.C17140ub;
import X.C17200uh;
import X.C17250um;
import X.C19230xz;
import X.C24561Gk;
import X.C25681Ks;
import X.C25691Kt;
import X.C25781Lc;
import X.C30521cU;
import X.C33481ie;
import X.C34751ko;
import X.C54472hZ;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class ScannedCodeDialogFragment extends Hilt_ScannedCodeDialogFragment {
    public int A00;
    public View.OnClickListener A01 = new ViewOnClickCListenerShape11S0100000_I0_4(this, 30);
    public View.OnClickListener A02 = new ViewOnClickCListenerShape11S0100000_I0_4(this, 32);
    public ImageView A03;
    public C16040sK A04;
    public C15900s5 A05;
    public C16000sG A06;
    public C17140ub A07;
    public AnonymousClass156 A08;
    public C17030uP A09;
    public C16080sP A0A;
    public AnonymousClass2Ao A0B;
    public C17200uh A0C;
    public C19230xz A0D;
    public AnonymousClass01V A0E;
    public C16440t3 A0F;
    public C16260sj A0G;
    public AnonymousClass013 A0H;
    public C16010sH A0I;
    public C17250um A0J;
    public C16490t9 A0K;
    public UserJid A0L;
    public C14650pX A0M;
    public C25781Lc A0N;
    public C25681Ks A0O;
    public C25691Kt A0P;
    public C16320sq A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public final C33481ie A0U = new IDxCObserverShape68S0100000_2_I0(this, 26);

    public static ScannedCodeDialogFragment A01(AnonymousClass26U r4, AnonymousClass2RN r5) {
        ScannedCodeDialogFragment scannedCodeDialogFragment = new ScannedCodeDialogFragment();
        Bundle bundle = new Bundle();
        int i2 = r5.A01;
        int i3 = 0;
        if (i2 != 0) {
            i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    throw new IllegalArgumentException("Unhandled type");
                }
            }
        }
        bundle.putInt("ARG_TYPE", i3);
        UserJid userJid = r5.A02;
        bundle.putString("ARG_JID", userJid != null ? userJid.getRawString() : null);
        bundle.putString("ARG_MESSAGE", r5.A03);
        bundle.putString("ARG_SOURCE", r4.A03);
        bundle.putString("ARG_QR_CODE_ID", r4.A02);
        scannedCodeDialogFragment.A0T(bundle);
        return scannedCodeDialogFragment;
    }

    public void A0k() {
        super.A0k();
        this.A07.A03(this.A0U);
    }

    public void A0x(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            if (i3 == -1) {
                this.A0D.A07();
                A0r(C14750ph.A02(A0D()).addFlags(603979776));
                Intent A0x = new C14750ph().A0x(A02(), this.A0L);
                A0x.putExtra("added_by_qr_code", true);
                C54472hZ.A00(A0x, this);
            }
            A1C();
            this.A0O.A00();
            return;
        }
        super.A0x(i2, i3, intent);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E2;
        int i2;
        Bundle A042 = A04();
        this.A00 = A042.getInt("ARG_TYPE");
        this.A0L = UserJid.getNullable(A042.getString("ARG_JID"));
        this.A0S = A042.getString("ARG_MESSAGE");
        this.A0R = A042.getString("ARG_SOURCE");
        this.A0T = A042.getString("ARG_QR_CODE_ID");
        C16000sG r1 = this.A06;
        UserJid userJid = this.A0L;
        AnonymousClass00B.A06(userJid);
        this.A0I = r1.A0A(userJid);
        boolean A0I2 = this.A04.A0I(this.A0L);
        View inflate = A0D().getLayoutInflater().inflate(R.layout.layout05db, (ViewGroup) null);
        TextView textView = (TextView) C004601z.A0E(inflate, R.id.title);
        TextView textView2 = (TextView) C004601z.A0E(inflate, R.id.positive_button);
        this.A03 = (ImageView) C004601z.A0E(inflate, R.id.profile_picture);
        View A0E3 = C004601z.A0E(inflate, R.id.contact_info);
        TextView textView3 = (TextView) C004601z.A0E(inflate, R.id.result_title);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(inflate, R.id.result_subtitle);
        if (!this.A0I.A0F()) {
            textView3.setText(this.A0H.A0H(C24561Gk.A04(this.A0L)));
            String A0B2 = this.A0A.A0B(this.A0I);
            if (A0B2 != null) {
                textEmojiLabel.A0I((List) null, A0B2);
            } else {
                textEmojiLabel.setVisibility(8);
            }
        } else {
            C30521cU r11 = new C30521cU(A0E3, this.A0A, this.A0H, this.A0N, (int) R.id.result_title);
            textView3.setText(AnonymousClass2Sy.A03(A0u(), textView3.getPaint(), this.A0J, this.A0I.A0B()));
            r11.A07(1);
            textEmojiLabel.setText(A0J(R.string.str0300));
        }
        this.A0B.A06(this.A03, this.A0I);
        int i3 = this.A00;
        if (i3 == 0) {
            textView.setText(A0J(R.string.str1334));
            if (A0I2) {
                textView2.setText(A0J(R.string.str0e87));
                textView2.setOnClickListener(this.A02);
                return inflate;
            }
            C34751ko r12 = this.A0I.A0D;
            int i4 = R.string.str0570;
            if (r12 != null) {
                i4 = R.string.str0571;
            }
            textView2.setText(A0J(i4));
            textView2.setOnClickListener(this.A01);
            A0E2 = C004601z.A0E(inflate, R.id.details_row);
            i2 = 31;
        } else if (i3 == 1) {
            A1C();
            return inflate;
        } else if (i3 == 2) {
            textView.setText(A0J(R.string.str1334));
            textView2.setText(R.string.str0d45);
            textView2.setOnClickListener(this.A01);
            A0E2 = C004601z.A0E(inflate, R.id.details_row);
            i2 = 29;
        } else {
            throw new IllegalArgumentException("Unhandled type");
        }
        A0E2.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, i2));
        return inflate;
    }

    public void A12() {
        super.A12();
        this.A0B.A00();
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof C14650pX) {
            this.A0M = (C14650pX) context;
        }
        this.A07.A02(this.A0U);
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A0B = this.A0C.A04(A02(), "scanned-code-dialog-fragment");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C14650pX r0 = this.A0M;
        if (r0 != null) {
            r0.AVW();
        }
    }
}
