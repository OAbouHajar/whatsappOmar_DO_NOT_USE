package com.obwhatsapp.calling.videoparticipant;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass2UY;
import X.AnonymousClass3D7;
import X.C004601z;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C26801Pf;
import X.C32001fU;
import X.C616839w;
import X.C90984fB;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import com.facebook.redex.IDxKListenerShape223S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;

public class MaximizedParticipantVideoDialogFragment extends Hilt_MaximizedParticipantVideoDialogFragment implements AnonymousClass2UY {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public WaTextView A05;
    public WaTextView A06;
    public VideoCallParticipantView A07;
    public C616839w A08;
    public C26801Pf A09;
    public C16000sG A0A;
    public C16080sP A0B;
    public VideoPort A0C;
    public boolean A0D = false;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final DialogInterface.OnDismissListener A0I;
    public final Drawable A0J;
    public final View.OnClickListener A0K;
    public final Runnable A0L;

    public MaximizedParticipantVideoDialogFragment(DialogInterface.OnDismissListener onDismissListener, Drawable drawable, View.OnClickListener onClickListener, Runnable runnable, int i2, int i3, int i4, int i5) {
        this.A0I = onDismissListener;
        this.A0K = onClickListener;
        this.A0G = i2;
        this.A0H = i3;
        this.A0F = i4;
        this.A0E = i5;
        this.A0J = drawable;
        this.A0L = runnable;
    }

    public void A0q() {
        super.A0q();
        Dialog A1A = A1A();
        if (A1A.getWindow() != null) {
            A1A.getWindow().setLayout(-1, -1);
            A1A.getWindow().setFlags(1024, 1024);
            A1A.getWindow().clearFlags(2);
            A1A.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public Dialog A1B(Bundle bundle) {
        View decorView;
        Dialog dialog = new Dialog(A0C(), R.style.style01ce);
        dialog.setCancelable(true);
        if (dialog.getWindow() != null) {
            dialog.getWindow().requestFeature(1);
        }
        dialog.setContentView(R.layout.layout02ce);
        dialog.setOnDismissListener(this.A0I);
        dialog.setOnKeyListener(new IDxKListenerShape223S0100000_2_I0(this, 0));
        if (dialog.getWindow() == null || (decorView = dialog.getWindow().getDecorView()) == null || this.A08 == null) {
            AnonymousClass00B.A08("failed to initialize MaximizedParticipantVideoDialogFragment");
        } else {
            this.A07 = (VideoCallParticipantView) C004601z.A0E(decorView, R.id.video_view);
            this.A06 = (WaTextView) C004601z.A0E(decorView, R.id.name);
            this.A05 = (WaTextView) C004601z.A0E(decorView, R.id.name_byline);
            this.A04 = C004601z.A0E(decorView, R.id.background_overlay);
            View A0E2 = C004601z.A0E(decorView, R.id.container);
            VideoCallParticipantView videoCallParticipantView = this.A07;
            videoCallParticipantView.A03 = 7;
            videoCallParticipantView.A02();
            this.A07.A0P.setOnClickListener(this.A0K);
            VideoCallParticipantView videoCallParticipantView2 = this.A07;
            videoCallParticipantView2.A00 = 1.5f;
            videoCallParticipantView2.A03(A03().getDimensionPixelSize(R.dimen.dimen0510));
            this.A07.setBackgroundColor(-16777216);
            this.A08.A0A(this.A07);
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null) {
                Log.w("MaximizedParticipantVideoDialogFragment can not get callInfo");
            } else {
                A1N((C32001fU) callInfo.participants.get(this.A08.A04), callInfo);
                if (callInfo.self.A07.equals(this.A08.A04)) {
                    this.A06.setText(R.string.str1ba8);
                } else {
                    C16010sH A0A2 = this.A0A.A0A(this.A08.A04);
                    this.A06.setText(this.A0B.A08(A0A2));
                    if (TextUtils.isEmpty(A0A2.A09())) {
                        this.A05.setText(this.A0B.A0F(A0A2));
                        this.A05.setVisibility(0);
                    }
                }
            }
            A0E2.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 18));
            this.A07.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3D7(this));
            A0E2.setBackground(this.A0J);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            dialog.getWindow().setNavigationBarColor(AnonymousClass00T.A00(dialog.getContext(), R.color.color05d2));
        }
        return dialog;
    }

    public void A1G(AnonymousClass02C r2, String str) {
        if (this.A0D) {
            Log.w("MaximizedParticipantVideoDialogFragment already attached");
            return;
        }
        this.A0D = true;
        AnonymousClass050 r0 = new AnonymousClass050(r2);
        r0.A0C(this, str);
        r0.A02();
        this.A0L.run();
    }

    public void A1N(C32001fU r4, CallInfo callInfo) {
        C616839w r2;
        if (A0c() && r4 != null && (r2 = this.A08) != null && this.A07 != null && r4.A07.equals(r2.A04)) {
            if (!callInfo.callId.equals(Voip.getCurrentCallId())) {
                if (this.A08.A04.equals(callInfo.self.A07)) {
                    this.A08.A03();
                }
            } else if (callInfo.participants.size() > 2) {
                this.A08.A09(r4, callInfo);
                return;
            }
            A1O(false);
        }
    }

    public void A1O(boolean z2) {
        if (A0c()) {
            Log.i("voip/MaximizedParticipantVideoDialogFragment/dismissDialog");
            VideoPort videoPort = this.A0C;
            if (videoPort != null) {
                videoPort.release();
            }
            C616839w r0 = this.A08;
            if (r0 != null) {
                r0.A05();
            }
            this.A0I.onDismiss(this.A03);
            RunnableRunnableShape5S0100000_I0_4 runnableRunnableShape5S0100000_I0_4 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 11);
            AnonymousClass00B.A04(this.A07);
            AnonymousClass00B.A04(this.A06);
            AnonymousClass00B.A04(this.A05);
            this.A07.animate().setDuration(250).scaleX(z2 ? this.A01 : 0.0f).scaleY(z2 ? this.A00 : 0.0f).translationX((float) this.A02).translationY((float) this.A03).setInterpolator(new DecelerateInterpolator(1.5f)).setListener(new C90984fB(this, runnableRunnableShape5S0100000_I0_4)).start();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(250);
            this.A06.startAnimation(alphaAnimation);
            if (this.A05.getVisibility() == 0) {
                this.A05.startAnimation(alphaAnimation);
            }
            View view = this.A04;
            AnonymousClass00B.A04(view);
            view.setAlpha(0.4f);
            this.A04.animate().setDuration(250).alpha(0.0f);
        }
    }

    public VideoPort AGu(VideoCallParticipantView videoCallParticipantView) {
        VideoPort videoPort = this.A0C;
        if (videoPort != null) {
            return videoPort;
        }
        VideoPort A002 = this.A09.A00(videoCallParticipantView.A0K, false);
        this.A0C = A002;
        return A002;
    }

    public void Ahe(Point point, VideoCallParticipantView videoCallParticipantView) {
    }
}
