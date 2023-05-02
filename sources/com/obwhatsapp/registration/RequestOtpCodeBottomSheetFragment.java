package com.obwhatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass3AS;
import X.C004601z;
import X.C018208n;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxDTimerShape0S0300000_2_I1;
import com.google.android.material.button.MaterialButton;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class RequestOtpCodeBottomSheetFragment extends Hilt_RequestOtpCodeBottomSheetFragment {
    public long A00;
    public long A01;
    public long A02;
    public CountDownTimer A03;
    public CountDownTimer A04;
    public CountDownTimer A05;
    public LinearLayout A06;
    public MaterialButton A07;
    public MaterialButton A08;
    public MaterialButton A09;
    public AnonymousClass013 A0A;
    public AnonymousClass3AS A0B;
    public VerifyPhoneNumber A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;

    public static RequestOtpCodeBottomSheetFragment A01(String str, long j2, long j3, long j4, boolean z2) {
        RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment = new RequestOtpCodeBottomSheetFragment();
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putLong("EXTRA_SMS_COUNTDOWN_TIME", j2);
        A0D2.putLong("EXTRA_VOICE_COUNTDOWN_TIME", j3);
        A0D2.putLong("EXTRA_WA_OLD_COUNTDOWN_TIME", j4);
        A0D2.putBoolean("EXTRA_REG_STATE_IS_WA_OLD", z2);
        A0D2.putString("EXTRA_ENABLE_SMS_STRING", str);
        requestOtpCodeBottomSheetFragment.A0T(A0D2);
        return requestOtpCodeBottomSheetFragment;
    }

    public static final void A02(View view, MaterialButton materialButton, String str, int i2) {
        Drawable A032 = C018208n.A03(AnonymousClass00T.A04(view.getContext(), i2));
        materialButton.setText(str);
        materialButton.setIcon(A032);
        materialButton.A00 = 2;
    }

    public void A0k() {
        super.A0k();
        this.A0C = null;
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A03 = null;
        }
        CountDownTimer countDownTimer2 = this.A04;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
            this.A04 = null;
        }
        CountDownTimer countDownTimer3 = this.A05;
        if (countDownTimer3 != null) {
            countDownTimer3.cancel();
            this.A05 = null;
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout04fe, viewGroup, true);
        LinearLayout linearLayout = (LinearLayout) C004601z.A0E(inflate, R.id.request_otp_code_buttons_layout);
        this.A06 = linearLayout;
        boolean z2 = this.A0G;
        View inflate2 = layoutInflater.inflate(R.layout.layout04ff, linearLayout, false);
        if (z2) {
            MaterialButton materialButton = (MaterialButton) inflate2;
            this.A09 = materialButton;
            this.A06.addView(materialButton);
            inflate2 = layoutInflater.inflate(R.layout.layout0500, this.A06, false);
        }
        MaterialButton materialButton2 = (MaterialButton) inflate2;
        this.A08 = materialButton2;
        this.A06.addView(materialButton2);
        MaterialButton materialButton3 = (MaterialButton) layoutInflater.inflate(R.layout.layout0500, this.A06, false);
        this.A07 = materialButton3;
        this.A06.addView(materialButton3);
        return inflate;
    }

    public void A16(Context context) {
        super.A16(context);
        try {
            this.A0C = (VerifyPhoneNumber) A0C();
        } catch (ClassCastException e2) {
            Log.e(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("RequestOtpCodeBottomSheetFragment/onAttach/error: ")));
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A00 = A04().getLong("EXTRA_SMS_COUNTDOWN_TIME");
        this.A01 = A04().getLong("EXTRA_VOICE_COUNTDOWN_TIME");
        this.A02 = A04().getLong("EXTRA_WA_OLD_COUNTDOWN_TIME");
        this.A0G = A04().getBoolean("EXTRA_REG_STATE_IS_WA_OLD");
        this.A0D = A04().getString("EXTRA_ENABLE_SMS_STRING");
        this.A0E = A0J(R.string.str19a9);
        this.A0F = A0J(R.string.str199f);
    }

    public void A18(Bundle bundle, View view) {
        int i2;
        View view2 = view;
        C13680ns.A15(C004601z.A0E(view, R.id.request_otp_code_bottom_sheet_close_button), this, 32);
        ImageView A0J = C13680ns.A0J(view, R.id.request_otp_code_bottom_sheet_icon);
        TextView A0L = C13680ns.A0L(view, R.id.request_otp_code_bottom_sheet_title);
        TextView A0L2 = C13680ns.A0L(view, R.id.request_otp_code_bottom_sheet_description);
        if (this.A0G) {
            A0J.setImageDrawable((Drawable) null);
            A0J.setBackgroundResource(R.drawable.registration_device_confirmation);
            A0L.setText(R.string.str143e);
            i2 = R.string.str143d;
        } else {
            C13700nu.A0L(A0u(), A0J, R.drawable.ic_reg_sms_normal);
            A0J.setBackgroundResource(R.drawable.request_otp_code_circle_background);
            A0L.setText(R.string.str143c);
            i2 = R.string.str143b;
        }
        A0L2.setText(i2);
        VerifyPhoneNumber verifyPhoneNumber = this.A0C;
        if (verifyPhoneNumber == null) {
            Log.i("RequestOtpCodeBottomSheetFragment/initializeSmsButton/null base activity");
        } else {
            this.A08.setIconResource(R.drawable.ic_reg_sms_normal);
            this.A08.setText(R.string.str199e);
            C13680ns.A1C(this.A08, this, verifyPhoneNumber, 42);
            int i3 = (this.A00 > 0 ? 1 : (this.A00 == 0 ? 0 : -1));
            MaterialButton materialButton = this.A08;
            if (i3 <= 0) {
                materialButton.setEnabled(true);
                MaterialButton materialButton2 = this.A08;
                String str = this.A0D;
                AnonymousClass00B.A06(str);
                A02(view, materialButton2, str, R.drawable.ic_reg_sms_normal);
            } else {
                materialButton.setEnabled(false);
                CountDownTimer countDownTimer = this.A03;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    this.A03 = null;
                }
                this.A03 = new IDxDTimerShape0S0300000_2_I1(view2, verifyPhoneNumber, this, 1, this.A00).start();
            }
        }
        VerifyPhoneNumber verifyPhoneNumber2 = this.A0C;
        if (verifyPhoneNumber2 == null) {
            Log.i("RequestOtpCodeBottomSheetFragment/initializeVoiceCallButton/null base activity");
        } else {
            this.A07.setIconResource(R.drawable.ic_reg_call_normal);
            this.A07.setText(R.string.str19a9);
            C13680ns.A1C(this.A07, this, verifyPhoneNumber2, 41);
            int i4 = (this.A01 > 0 ? 1 : (this.A01 == 0 ? 0 : -1));
            MaterialButton materialButton3 = this.A07;
            if (i4 <= 0) {
                materialButton3.setEnabled(true);
                MaterialButton materialButton4 = this.A07;
                String str2 = this.A0E;
                AnonymousClass00B.A06(str2);
                A02(view, materialButton4, str2, R.drawable.ic_reg_call_normal);
            } else {
                materialButton3.setEnabled(false);
                CountDownTimer countDownTimer2 = this.A04;
                if (countDownTimer2 != null) {
                    countDownTimer2.cancel();
                    this.A04 = null;
                }
                this.A04 = new IDxDTimerShape0S0300000_2_I1(view2, verifyPhoneNumber2, this, 2, this.A01).start();
            }
        }
        VerifyPhoneNumber verifyPhoneNumber3 = this.A0C;
        MaterialButton materialButton5 = this.A09;
        if (materialButton5 == null || verifyPhoneNumber3 == null) {
            Log.i("RequestOtpCodeBottomSheetFragment/initializeWaOldButton/null resendWAOldCodeBtn or base activity");
            return;
        }
        materialButton5.setIconResource(R.drawable.ic_settings_change_number);
        this.A09.setText(R.string.str199f);
        C13680ns.A1C(this.A09, this, verifyPhoneNumber3, 43);
        int i5 = (this.A02 > 0 ? 1 : (this.A02 == 0 ? 0 : -1));
        MaterialButton materialButton6 = this.A09;
        if (i5 <= 0) {
            materialButton6.setEnabled(true);
            MaterialButton materialButton7 = this.A09;
            String str3 = this.A0F;
            AnonymousClass00B.A06(str3);
            A02(view, materialButton7, str3, R.drawable.ic_settings_change_number);
            return;
        }
        materialButton6.setEnabled(false);
        CountDownTimer countDownTimer3 = this.A05;
        if (countDownTimer3 != null) {
            countDownTimer3.cancel();
            this.A05 = null;
        }
        this.A05 = new IDxDTimerShape0S0300000_2_I1(view2, verifyPhoneNumber3, this, 3, this.A02).start();
    }
}
