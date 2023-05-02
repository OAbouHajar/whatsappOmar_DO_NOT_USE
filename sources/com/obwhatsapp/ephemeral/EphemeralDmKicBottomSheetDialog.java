package com.obwhatsapp.ephemeral;

import X.AnonymousClass00T;
import X.AnonymousClass02C;
import X.C001000l;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C15800rs;
import X.C15830rv;
import X.C15860rz;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C17220uj;
import X.C17800vf;
import X.C18040w3;
import X.C18070w6;
import X.C19980zJ;
import X.C222617g;
import X.C48402Na;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

public class EphemeralDmKicBottomSheetDialog extends Hilt_EphemeralDmKicBottomSheetDialog {
    public static C48402Na A0P;
    public int A00 = 0;
    public C19980zJ A01;
    public WaButton A02;
    public WaButton A03;
    public WaImageView A04;
    public WaImageView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public WaTextView A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public C15800rs A0C;
    public C16440t3 A0D;
    public C15860rz A0E;
    public C16460t6 A0F;
    public C18070w6 A0G;
    public C16490t9 A0H;
    public C18040w3 A0I;
    public C15830rv A0J;
    public C17800vf A0K;
    public C222617g A0L;
    public C17220uj A0M;
    public C16320sq A0N;
    public boolean A0O = false;

    public static void A01(AnonymousClass02C r3, C15830rv r4, int i2) {
        EphemeralDmKicBottomSheetDialog ephemeralDmKicBottomSheetDialog = new EphemeralDmKicBottomSheetDialog();
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putParcelable("chat_jid", r4);
        A0D2.putInt("entry_point", i2);
        ephemeralDmKicBottomSheetDialog.A0T(A0D2);
        ephemeralDmKicBottomSheetDialog.A1G(r3, "ephemeral_kic_nux");
    }

    public static boolean A02(AnonymousClass02C r3, C15860rz r4) {
        return !r3.A0o() && !C13680ns.A0B(r4).getBoolean("ephemeral_kic_nux", false) && r3.A0B("ephemeral_kic_nux") == null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        WaTextView waTextView;
        int i2;
        WaImageView waImageView;
        int i3;
        boolean z2 = false;
        View inflate = layoutInflater.inflate(R.layout.layout0267, viewGroup, false);
        this.A0J = (C15830rv) A04().getParcelable("chat_jid");
        int i4 = A04().getInt("entry_point");
        this.A00 = i4;
        int i5 = 1;
        if (i4 == 3) {
            z2 = true;
        }
        this.A0O = z2;
        this.A03 = (WaButton) C004601z.A0E(inflate, R.id.ephemeral_nux_ok);
        this.A02 = (WaButton) C004601z.A0E(inflate, R.id.ephemeral_nux_learn_more);
        this.A0A = C13680ns.A0S(inflate, R.id.ephemeral_nux_text_third_line);
        this.A08 = C13680ns.A0S(inflate, R.id.ephemeral_nux_text_second_line);
        this.A06 = C13680ns.A0S(inflate, R.id.ephemeral_nux_text_first_line);
        this.A09 = C13680ns.A0S(inflate, R.id.ephemeral_nux_subtitle);
        this.A0B = C13680ns.A0S(inflate, R.id.ephemeral_nux_title);
        this.A05 = C13690nt.A0R(inflate, R.id.ephemeral_nux_icon);
        this.A04 = C13690nt.A0R(inflate, R.id.ephemeral_nux_dismiss);
        this.A07 = C13680ns.A0S(inflate, R.id.ephemeral_nux_new);
        C13680ns.A16(this.A03, this, 2);
        C13680ns.A16(this.A02, this, 3);
        C13680ns.A16(this.A04, this, 4);
        boolean z3 = !this.A0K.A00((Object) null, "ephemeral");
        if (!z3 || this.A0O) {
            this.A09.setVisibility(8);
            this.A07.setVisibility(0);
            int i6 = this.A00;
            WaTextView waTextView2 = this.A06;
            if (i6 == 1) {
                waTextView2.setText(R.string.str0e7f);
                waTextView = this.A0B;
                i2 = R.string.str0e80;
            } else {
                waTextView2.setText(R.string.str0e7d);
                waTextView = this.A0B;
                i2 = R.string.str0e83;
            }
            waTextView.setText(i2);
            this.A0A.setText(R.string.str0e82);
            this.A08.setText(R.string.str0e81);
            A1N(this.A0A, R.drawable.ic_hand);
            A1N(this.A08, R.drawable.ic_action_undo_keep);
            A1N(this.A06, R.drawable.ic_add_new_group);
            waImageView = this.A05;
            i3 = R.drawable.ic_action_keep;
        } else {
            this.A09.setVisibility(0);
            this.A07.setVisibility(8);
            int i7 = this.A00;
            WaTextView waTextView3 = this.A0B;
            int i8 = R.string.str0e7a;
            if (i7 == 2) {
                i8 = R.string.str0e7b;
            }
            waTextView3.setText(i8);
            this.A0A.setText(R.string.str0e79);
            A1N(this.A0A, R.drawable.ic_hand);
            this.A08.setText(R.string.str0e77);
            A1N(this.A08, R.drawable.ic_action_keep);
            this.A06.setText(R.string.str0e76);
            A1N(this.A06, R.drawable.ic_dm_timer);
            this.A09.setText(R.string.str0e78);
            waImageView = this.A05;
            i3 = R.drawable.ic_ephemeral_v2;
        }
        waImageView.setImageResource(i3);
        C18070w6 r6 = this.A0G;
        C15830rv r5 = this.A0J;
        C15800rs r4 = this.A0C;
        if (!z3) {
            i5 = 2;
        }
        r6.A01(r4, r5, Integer.valueOf(i5), this.A00);
        return inflate;
    }

    public void A14() {
        super.A14();
        if (C13680ns.A0B(this.A0E).getBoolean("ephemeral_kic_nux", false) && !this.A0O) {
            A1D();
        }
    }

    public final void A1N(WaTextView waTextView, int i2) {
        Drawable A042 = AnonymousClass00T.A04(A02(), i2);
        if (Build.VERSION.SDK_INT >= 17) {
            waTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(A042, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            waTextView.setCompoundDrawablesWithIntrinsicBounds(A042, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        C13680ns.A0z(this.A0E.A0K(), "ephemeral_kic_nux", true);
        A1D();
        super.onCancel(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C001000l A0C2 = A0C();
        if (A0C2 instanceof C48402Na) {
            ((C48402Na) A0C2).AU6();
        }
        C48402Na r0 = A0P;
        if (r0 != null) {
            r0.AU6();
            A0P = null;
        }
    }
}
