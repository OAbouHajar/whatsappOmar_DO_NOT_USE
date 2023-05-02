package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass2AR;
import X.C001000l;
import X.C018208n;
import X.C13680ns;
import X.C13690nt;
import X.C15830rv;
import X.C15860rz;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16050sL;
import X.C16070sO;
import X.C204310c;
import X.C30341cC;
import X.C32241fu;
import X.C57012pj;
import X.C91314fi;
import X.C94004kA;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.jid.GroupJid;
import java.util.List;

public class CallConfirmationFragment extends Hilt_CallConfirmationFragment {
    public C16040sK A00;
    public C204310c A01;
    public C16000sG A02;
    public C15860rz A03;
    public C16070sO A04;
    public boolean A05 = false;
    public final List A06 = AnonymousClass000.A0u();

    public Dialog A1B(Bundle bundle) {
        Dialog create;
        C001000l A0D = A0D();
        boolean z2 = A04().getBoolean("is_video_call");
        C15830rv A022 = C15830rv.A02(A04().getString("jid"));
        AnonymousClass00B.A06(A022);
        C16010sH A0A = this.A02.A0A(A022);
        if (A0A.A0J()) {
            create = new C57012pj(A0D, 0);
            create.setContentView(R.layout.layout00d2);
            TextView textView = (TextView) create.findViewById(R.id.call_button);
            if (textView != null) {
                int i2 = R.drawable.ic_btn_call_audio;
                if (z2) {
                    i2 = R.drawable.ic_btn_call_video;
                }
                Drawable A042 = AnonymousClass00T.A04(A0D, i2);
                if (A042 != null) {
                    A042 = C018208n.A03(A042);
                    C018208n.A0A(A042, AnonymousClass00T.A00(A0D, R.color.color0066));
                }
                if (C13680ns.A1Z(this.A02)) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(A042, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A042, (Drawable) null);
                }
                textView.setOnClickListener(new C94004kA(A0D, this, A0A, z2));
            }
            View findViewById = create.findViewById(R.id.design_bottom_sheet);
            if (findViewById != null) {
                findViewById.setBackgroundResource(R.drawable.rounded_bottom_sheet_dialog);
            }
        } else {
            C32241fu A002 = C32241fu.A00(A0D);
            int i3 = R.string.str011e;
            if (z2) {
                i3 = R.string.str19b7;
            }
            A002.A01(i3);
            A002.setPositiveButton(R.string.str0334, new C91314fi(A0D, this, A0A, z2));
            C13690nt.A1E(A002);
            create = A002.create();
        }
        create.setCanceledOnTouchOutside(true);
        if (A0D instanceof AnonymousClass2AR) {
            this.A06.add(A0D);
        }
        return create;
    }

    public final void A1N(Activity activity, C16010sH r11, boolean z2) {
        int i2 = A04().getInt("call_from_ui");
        Activity activity2 = activity;
        this.A01.A03(activity2, (GroupJid) r11.A08(C16050sL.class), C30341cC.A0C(this.A00, this.A02, this.A04, r11), i2, z2);
        this.A05 = true;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A05) {
            for (AnonymousClass2AR r1 : this.A06) {
                ((QuickContactActivity) r1).A37(false);
            }
        }
        this.A06.clear();
    }
}
