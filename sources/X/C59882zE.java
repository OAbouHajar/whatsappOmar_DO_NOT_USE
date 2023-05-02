package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.WaDynamicRoundCornerImageView;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.obwhatsapp.components.button.ThumbnailButton;

/* renamed from: X.2zE  reason: invalid class name and case insensitive filesystem */
public class C59882zE extends AnonymousClass26E {
    public int A00;
    public ValueAnimator A01;
    public CircularProgressBar A02;
    public AnonymousClass4Q9 A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final View A09;
    public final View A0A;
    public final ViewGroup A0B;
    public final ViewGroup A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final ConstraintLayout A0F;
    public final WaDynamicRoundCornerImageView A0G;
    public final WaImageView A0H;
    public final WaImageView A0I;
    public final VoiceParticipantAudioWave A0J;
    public final ThumbnailButton A0K;
    public final ThumbnailButton A0L;

    public C59882zE(View view, C23651Cv r9, AnonymousClass4DV r10, CallGridViewModel callGridViewModel, C17160ud r12, C16080sP r13) {
        super(view, r9, r10, callGridViewModel, r12, r13);
        GradientDrawable gradientDrawable;
        this.A0F = (ConstraintLayout) C004601z.A0E(view, R.id.audio_call_grid);
        this.A0D = C13680ns.A0M(view, R.id.audio_call_participant_name);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C004601z.A0E(view, R.id.audio_call_participant_photo);
        this.A0K = thumbnailButton;
        this.A0J = (VoiceParticipantAudioWave) view.findViewById(R.id.audio_call_participant_wave);
        this.A0H = (WaImageView) view.findViewById(R.id.mute_icon);
        this.A0I = (WaImageView) view.findViewById(R.id.tile_background);
        this.A0G = (WaDynamicRoundCornerImageView) view.findViewById(R.id.call_grid_blur_background);
        this.A09 = view.findViewById(R.id.dark_overlay);
        ViewGroup A0K2 = C13690nt.A0K(view, R.id.status_container);
        this.A0C = A0K2;
        this.A0B = C13690nt.A0K(view, R.id.picture_in_picture_container);
        ThumbnailButton thumbnailButton2 = (ThumbnailButton) view.findViewById(R.id.picture_in_picture_photo);
        this.A0L = thumbnailButton2;
        this.A0E = A0K2 != null ? C13680ns.A0M(A0K2, R.id.status) : null;
        View findViewById = view.findViewById(R.id.speaking_border);
        this.A0A = findViewById;
        this.A05 = view.getResources().getDimensionPixelSize(R.dimen.dimen0825);
        this.A07 = view.getResources().getDimensionPixelSize(R.dimen.dimen0827);
        this.A01 = view.getResources().getDimensionPixelSize(R.dimen.dimen010b);
        this.A06 = view.getResources().getDimensionPixelSize(R.dimen.dimen0826);
        this.A08 = view.getResources().getDimensionPixelSize(R.dimen.dimen0828);
        this.A04 = view.getResources().getDimensionPixelSize(R.dimen.dimen083d);
        Resources.Theme A042 = C13700nu.A04(view);
        TypedValue typedValue = new TypedValue();
        boolean z2 = true;
        A042.resolveAttribute(R.attr.attr008b, typedValue, true);
        AnonymousClass00B.A0F(typedValue.resourceId == 0 ? false : z2);
        if (!(findViewById == null || (gradientDrawable = (GradientDrawable) findViewById.getBackground()) == null)) {
            gradientDrawable.setCornerRadius((float) view.getResources().getDimensionPixelSize(typedValue.resourceId));
        }
        float f2 = (((float) C13690nt.A0H(view).widthPixels) + 1.0f) / 2.0f;
        thumbnailButton.A02 = f2;
        if (thumbnailButton2 != null) {
            thumbnailButton2.A02 = f2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0204, code lost:
        if (r2 != false) goto L_0x0206;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C37921px r7) {
        /*
            r6 = this;
            X.1px r0 = r6.A06
            if (r0 == 0) goto L_0x000e
            com.whatsapp.jid.UserJid r1 = r0.A0U
            com.whatsapp.jid.UserJid r0 = r7.A0U
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0069
        L_0x000e:
            r6.A0J(r7)
            r6.A0K(r7)
            android.view.View r0 = r6.A0H
            android.content.res.Resources r1 = r0.getResources()
            int r2 = r7.A01
            r0 = -1
            if (r2 != r0) goto L_0x0250
            r0 = 2131102000(0x7f060930, float:1.7816426E38)
            int r1 = r1.getColor(r0)
        L_0x0026:
            r6.A00 = r1
            android.widget.TextView r0 = r6.A0D
            if (r0 == 0) goto L_0x002c
        L_0x002c:
            r2 = 0
            r6.A07 = r2
            android.view.View r0 = r6.A0A
            if (r0 == 0) goto L_0x0040
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r6.A01
            if (r1 == 0) goto L_0x0040
            r1.setStroke(r0, r2)
        L_0x0040:
            r6.A0H()
            r0 = 44
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r4 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r4.<init>(r6, r0)
            r6.A04 = r4
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r6.A05
            if (r0 == 0) goto L_0x0065
            X.4Ql r3 = r0.A0G
            com.whatsapp.jid.UserJid r2 = r7.A0U
            java.util.Map r1 = r3.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x0060
            r0 = 0
            r1.put(r2, r0)
        L_0x0060:
            java.util.Map r0 = r3.A00
            r0.put(r2, r4)
        L_0x0065:
            r0 = 0
            r6.A0L(r7, r0)
        L_0x0069:
            android.view.ViewGroup r5 = r6.A0C
            if (r5 == 0) goto L_0x0091
            android.widget.TextView r4 = r6.A0E
            if (r4 == 0) goto L_0x0091
            boolean r0 = r7.A0A
            r3 = 0
            r2 = 8
            if (r0 == 0) goto L_0x0232
            android.view.ViewGroup r0 = r6.A0B
            if (r0 == 0) goto L_0x0232
            r1 = 0
            r3 = 8
        L_0x007f:
            r5.setVisibility(r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0F
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r6.A0B
            if (r0 == 0) goto L_0x008e
            r0.setVisibility(r1)
        L_0x008e:
            r6.A0K(r7)
        L_0x0091:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r6.A0F
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0106
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0106
            com.obwhatsapp.CircularProgressBar r0 = r6.A02
            r4 = -1
            if (r0 != 0) goto L_0x00cc
            android.view.View r2 = r6.A0H
            android.content.Context r1 = r2.getContext()
            com.obwhatsapp.CircularProgressBar r0 = new com.obwhatsapp.CircularProgressBar
            r0.<init>(r1)
            r6.A02 = r0
            r0.A0C = r4
            android.content.res.Resources r1 = X.C13680ns.A0D(r2)
            r0 = 2131165456(0x7f070110, float:1.794513E38)
            int r0 = r1.getDimensionPixelSize(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 17
            r1.gravity = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            com.obwhatsapp.CircularProgressBar r0 = r6.A02
            r2.addView(r0, r1)
        L_0x00cc:
            com.obwhatsapp.CircularProgressBar r0 = r6.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00d8
            android.animation.ValueAnimator r0 = r6.A01
            if (r0 != 0) goto L_0x0106
        L_0x00d8:
            com.obwhatsapp.CircularProgressBar r1 = r6.A02
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r6.A09
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {0, 100} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r6.A01 = r2
            r0 = 750(0x2ee, double:3.705E-321)
            r2.setDuration(r0)
            android.animation.ValueAnimator r0 = r6.A01
            r0.setRepeatCount(r4)
            android.animation.ValueAnimator r1 = r6.A01
            r0 = 4
            X.C13690nt.A0o(r1, r6, r0)
            android.animation.ValueAnimator r0 = r6.A01
            r0.start()
        L_0x0106:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0115
            com.obwhatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = r6.A0J
            if (r1 == 0) goto L_0x0223
            boolean r0 = r7.A0O
            r1.setMuteIconVisibility(r0)
        L_0x0115:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0182
            com.obwhatsapp.calling.callgrid.view.VoiceParticipantAudioWave r4 = r6.A0J
            if (r4 == 0) goto L_0x0182
            int r1 = r7.A00
            r0 = -1
            if (r1 == r0) goto L_0x021f
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r7.A00
            int r0 = r1.getColor(r0)
        L_0x012e:
            r4.setColor(r0)
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x013a
            r1 = 0
            r0 = 0
            r4.A02(r1, r0)
        L_0x013a:
            boolean r1 = r7.A0J
            android.animation.ValueAnimator r0 = r4.A07
            if (r0 == 0) goto L_0x0143
            r0.cancel()
        L_0x0143:
            if (r1 == 0) goto L_0x0173
            r3 = 2
            float[] r0 = new float[r3]
            r0 = {1036831949, 1058642330} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r4.A07 = r2
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r4.A07
            android.view.animation.Interpolator r0 = r4.A0H
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r4.A07
            r0 = -1
            r1.setRepeatCount(r0)
            android.animation.ValueAnimator r0 = r4.A07
            r0.setRepeatMode(r3)
            android.animation.ValueAnimator r1 = r4.A07
            r0 = 4
            X.C13690nt.A0p(r1, r4, r0)
            android.animation.ValueAnimator r0 = r4.A07
            r0.start()
        L_0x0173:
            X.2Wj r1 = r7.A06
            if (r1 == 0) goto L_0x020a
            android.content.Context r0 = r4.getContext()
            java.lang.String r0 = r1.A00(r0)
        L_0x017f:
            r4.setContentDescription(r0)
        L_0x0182:
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x018a
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0195
        L_0x018a:
            android.view.View r2 = r6.A0H
            r1 = 1
            com.facebook.redex.IDxTListenerShape168S0100000_2_I1 r0 = new com.facebook.redex.IDxTListenerShape168S0100000_2_I1
            r0.<init>(r6, r1)
            r2.setOnTouchListener(r0)
        L_0x0195:
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x01a0
            android.view.View r1 = r6.A0H
            r0 = 21
            X.C13680ns.A1B(r1, r6, r7, r0)
        L_0x01a0:
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x01af
            android.view.View r2 = r6.A0H
            r1 = 0
            com.facebook.redex.IDxCListenerShape53S0200000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape53S0200000_2_I1
            r0.<init>(r6, r1, r7)
            r2.setOnLongClickListener(r0)
        L_0x01af:
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x01fc
            boolean r3 = r7.A0C
            boolean r2 = r7.A08
            boolean r1 = r7.A0A
            boolean r0 = r7.A00()
            if (r0 != 0) goto L_0x0206
            if (r1 == 0) goto L_0x01ff
            r1 = 2131165457(0x7f070111, float:1.7945132E38)
        L_0x01c4:
            android.view.View r0 = r6.A0H
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r1)
            int r0 = r6.A00
            if (r0 == r2) goto L_0x01fc
            r6.A00 = r2
            com.obwhatsapp.WaImageView r1 = r6.A0I
            boolean r0 = r1 instanceof com.obwhatsapp.WaDynamicRoundCornerImageView
            if (r0 == 0) goto L_0x01e0
            com.obwhatsapp.WaDynamicRoundCornerImageView r1 = (com.obwhatsapp.WaDynamicRoundCornerImageView) r1
            float r0 = (float) r2
            r1.setRadius(r0)
        L_0x01e0:
            com.obwhatsapp.WaDynamicRoundCornerImageView r1 = r6.A0G
            if (r1 == 0) goto L_0x01ea
            int r0 = r6.A00
            float r0 = (float) r0
            r1.setRadius(r0)
        L_0x01ea:
            android.view.View r0 = r6.A0A
            if (r0 == 0) goto L_0x01fc
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x01fc
            int r0 = r6.A00
            float r0 = (float) r0
            r1.setCornerRadius(r0)
        L_0x01fc:
            r6.A06 = r7
            return
        L_0x01ff:
            if (r3 == 0) goto L_0x0206
            r1 = 2131165462(0x7f070116, float:1.7945142E38)
            if (r2 == 0) goto L_0x01c4
        L_0x0206:
            r1 = 2131165450(0x7f07010a, float:1.7945117E38)
            goto L_0x01c4
        L_0x020a:
            boolean r0 = r7.A0O
            if (r0 == 0) goto L_0x021b
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131893000(0x7f121b08, float:1.9420764E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x017f
        L_0x021b:
            java.lang.String r0 = ""
            goto L_0x017f
        L_0x021f:
            int r0 = r6.A00
            goto L_0x012e
        L_0x0223:
            com.obwhatsapp.WaImageView r1 = r6.A0H
            if (r1 == 0) goto L_0x0115
            boolean r0 = r7.A0O
            int r0 = X.C13680ns.A02(r0)
            r1.setVisibility(r0)
            goto L_0x0115
        L_0x0232:
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x0249
            X.2Wj r1 = r7.A06
            if (r1 == 0) goto L_0x0249
            android.content.Context r0 = r4.getContext()
            java.lang.String r0 = r1.A00(r0)
            r4.setText(r0)
            r1 = 8
            goto L_0x007f
        L_0x0249:
            r1 = 8
            r3 = 8
            r2 = 0
            goto L_0x007f
        L_0x0250:
            r0 = 2130903071(0x7f03001f, float:1.741295E38)
            int[] r1 = r1.getIntArray(r0)
            int r0 = r1.length
            int r2 = r2 % r0
            r1 = r1[r2]
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59882zE.A0G(X.1px):void");
    }

    public final void A0H() {
        if (this.A02 != null) {
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator != null) {
                valueAnimator.end();
                this.A01 = null;
            }
            this.A02.setVisibility(8);
            this.A09.setAlpha(0.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r1.A0O != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(int r6) {
        /*
            r5 = this;
            X.1px r1 = r5.A06
            if (r1 == 0) goto L_0x0057
            r4 = 1
            if (r6 <= 0) goto L_0x000c
            boolean r0 = r1.A0O
            r3 = 1
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            boolean r0 = r5.A07
            if (r0 == r3) goto L_0x002d
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x005b
            if (r3 == 0) goto L_0x005b
        L_0x0017:
            android.view.View r0 = r5.A0A
            if (r0 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            int r1 = r5.A00
            int r0 = r5.A01
            if (r2 == 0) goto L_0x002d
            if (r4 != 0) goto L_0x002a
            r1 = 0
        L_0x002a:
            r2.setStroke(r0, r1)
        L_0x002d:
            X.1px r0 = r5.A06
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0034
            r6 = 0
        L_0x0034:
            com.obwhatsapp.calling.callgrid.view.VoiceParticipantAudioWave r2 = r5.A0J
            if (r2 == 0) goto L_0x003d
            float r1 = (float) r6
            r0 = 1
            r2.A02(r1, r0)
        L_0x003d:
            X.1px r0 = r5.A06
            boolean r0 = r0.A0I
            if (r0 != 0) goto L_0x0055
            if (r2 == 0) goto L_0x0055
            if (r3 == 0) goto L_0x0058
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131892988(0x7f121afc, float:1.942074E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0052:
            r2.setContentDescription(r0)
        L_0x0055:
            r5.A07 = r3
        L_0x0057:
            return
        L_0x0058:
            java.lang.String r0 = ""
            goto L_0x0052
        L_0x005b:
            r4 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59882zE.A0I(int):void");
    }

    public void A0J(C37921px r4) {
        TextView textView = this.A0D;
        if (textView != null) {
            textView.setVisibility(C13680ns.A02(r4.A0P ? 1 : 0));
            textView.setText(r4.A0E ? textView.getContext().getString(R.string.str1ba8) : this.A0B.A08(r4.A0T));
        }
    }

    public final void A0K(C37921px r6) {
        WaImageView waImageView;
        boolean z2;
        String string;
        TextView textView;
        if (r6 != null && (waImageView = this.A0I) != null) {
            int i2 = 1;
            if (this.A0F.getVisibility() == 8 || (textView = this.A0D) == null || textView.getVisibility() == 8) {
                z2 = true;
                string = r6.A0E ? waImageView.getContext().getString(R.string.str1ba8) : this.A0B.A08(r6.A0T);
            } else {
                z2 = false;
                string = "";
            }
            waImageView.setContentDescription(string);
            if (!z2) {
                i2 = 2;
            }
            waImageView.setImportantForAccessibility(i2);
        }
    }

    public void A0L(C37921px r5, boolean z2) {
        C16010sH r3 = r5.A0T;
        A0E(this.A0K, r3, false, false);
        ThumbnailButton thumbnailButton = this.A0L;
        if (thumbnailButton != null) {
            A0E(thumbnailButton, r3, false, false);
        }
        WaDynamicRoundCornerImageView waDynamicRoundCornerImageView = this.A0G;
        if (waDynamicRoundCornerImageView != null && r5.A0R) {
            A0E(waDynamicRoundCornerImageView, r3, true, z2);
            waDynamicRoundCornerImageView.setVisibility(0);
        }
    }
}
