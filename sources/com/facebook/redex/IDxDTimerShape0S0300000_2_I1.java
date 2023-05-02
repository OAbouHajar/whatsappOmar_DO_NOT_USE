package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass2JN;
import X.AnonymousClass3K3;
import X.C13690nt;
import X.C14530pL;
import X.C14910pz;
import X.C14930q1;
import X.C14990q7;
import X.C29701b3;
import X.C31201dg;
import X.C62183Bz;
import X.C69833fg;
import android.os.CountDownTimer;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.instagram.common.bloks.mutations.IDxUOperationShape50S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.RequestOtpCodeBottomSheetFragment;

public class IDxDTimerShape0S0300000_2_I1 extends CountDownTimer {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxDTimerShape0S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2, long j2) {
        super(j2, 1000);
        this.A03 = i2;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void onFinish() {
        switch (this.A03) {
            case 0:
                C14990q7 r6 = (C14990q7) this.A01;
                C14910pz A032 = C62183Bz.A03(r6);
                C31201dg r4 = ((C69833fg) this.A00).A00;
                A032.A06(new IDxUOperationShape50S0100000_2_I1(this, 4), (long) r4.A00);
                C14930q1 A0H = r4.A0H(36);
                if (A0H != null) {
                    C29701b3.A01(r6, r4, AnonymousClass3K3.A0Z(r4), A0H);
                    return;
                }
                return;
            case 1:
                RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment = (RequestOtpCodeBottomSheetFragment) this.A00;
                MaterialButton materialButton = requestOtpCodeBottomSheetFragment.A08;
                AnonymousClass00B.A04(materialButton);
                materialButton.setEnabled(true);
                MaterialButton materialButton2 = requestOtpCodeBottomSheetFragment.A08;
                String str = requestOtpCodeBottomSheetFragment.A0D;
                AnonymousClass00B.A06(str);
                RequestOtpCodeBottomSheetFragment.A02((View) this.A02, materialButton2, str, R.drawable.ic_reg_sms_normal);
                requestOtpCodeBottomSheetFragment.A03 = null;
                return;
            case 2:
                RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment2 = (RequestOtpCodeBottomSheetFragment) this.A00;
                MaterialButton materialButton3 = requestOtpCodeBottomSheetFragment2.A07;
                AnonymousClass00B.A04(materialButton3);
                materialButton3.setEnabled(true);
                MaterialButton materialButton4 = requestOtpCodeBottomSheetFragment2.A07;
                String str2 = requestOtpCodeBottomSheetFragment2.A0E;
                AnonymousClass00B.A06(str2);
                RequestOtpCodeBottomSheetFragment.A02((View) this.A02, materialButton4, str2, R.drawable.ic_reg_call_normal);
                requestOtpCodeBottomSheetFragment2.A04 = null;
                return;
            default:
                RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment3 = (RequestOtpCodeBottomSheetFragment) this.A00;
                MaterialButton materialButton5 = requestOtpCodeBottomSheetFragment3.A09;
                AnonymousClass00B.A04(materialButton5);
                materialButton5.setEnabled(true);
                MaterialButton materialButton6 = requestOtpCodeBottomSheetFragment3.A09;
                String str3 = requestOtpCodeBottomSheetFragment3.A0F;
                AnonymousClass00B.A06(str3);
                RequestOtpCodeBottomSheetFragment.A02((View) this.A02, materialButton6, str3, R.drawable.ic_settings_change_number);
                requestOtpCodeBottomSheetFragment3.A05 = null;
                return;
        }
    }

    public void onTick(long j2) {
        MaterialButton materialButton;
        View view;
        String A0D;
        int i2;
        long j3 = j2;
        switch (this.A03) {
            case 0:
                ((C69833fg) this.A00).A01.Aez((View) this.A02, C13690nt.A09(j3));
                return;
            case 1:
                RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment = (RequestOtpCodeBottomSheetFragment) this.A00;
                materialButton = requestOtpCodeBottomSheetFragment.A08;
                AnonymousClass00B.A04(materialButton);
                view = (View) this.A02;
                AnonymousClass013 r10 = requestOtpCodeBottomSheetFragment.A0A;
                C14530pL r9 = (C14530pL) this.A01;
                boolean z2 = requestOtpCodeBottomSheetFragment.A0G;
                int i3 = R.plurals.plurals017b;
                if (z2) {
                    i3 = R.plurals.plurals017d;
                }
                A0D = AnonymousClass2JN.A0D(r9, r10, requestOtpCodeBottomSheetFragment.A0D, i3, j3);
                i2 = R.drawable.ic_reg_sms_disabled;
                break;
            case 2:
                RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment2 = (RequestOtpCodeBottomSheetFragment) this.A00;
                materialButton = requestOtpCodeBottomSheetFragment2.A07;
                AnonymousClass00B.A04(materialButton);
                view = (View) this.A02;
                A0D = AnonymousClass2JN.A0D((C14530pL) this.A01, requestOtpCodeBottomSheetFragment2.A0A, requestOtpCodeBottomSheetFragment2.A0E, R.plurals.plurals017e, j3);
                i2 = R.drawable.ic_reg_call_disabled;
                break;
            default:
                RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment3 = (RequestOtpCodeBottomSheetFragment) this.A00;
                materialButton = requestOtpCodeBottomSheetFragment3.A09;
                AnonymousClass00B.A04(materialButton);
                view = (View) this.A02;
                A0D = AnonymousClass2JN.A0D((C14530pL) this.A01, requestOtpCodeBottomSheetFragment3.A0A, requestOtpCodeBottomSheetFragment3.A0F, R.plurals.plurals017c, j3);
                i2 = R.drawable.ic_settings_change_number;
                break;
        }
        RequestOtpCodeBottomSheetFragment.A02(view, materialButton, A0D, i2);
    }
}
