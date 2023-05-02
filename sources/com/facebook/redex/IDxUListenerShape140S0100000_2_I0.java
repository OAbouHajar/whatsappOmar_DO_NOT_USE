package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2P3;
import X.AnonymousClass2Tr;
import X.AnonymousClass2V5;
import X.AnonymousClass2V7;
import X.C14820po;
import X.C46202Cw;
import X.C49112Rc;
import X.C53772gG;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.obwhatsapp.components.RoundCornerProgressBar;
import com.obwhatsapp.components.SegmentedProgressBar;
import com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;
import com.obwhatsapp.status.playback.widget.VoiceStatusContentView;
import com.obwhatsapp.storage.SizeTickerView;
import java.util.List;

public class IDxUListenerShape140S0100000_2_I0 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public IDxUListenerShape140S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.A01) {
            case 0:
                ((View) this.A00).scrollTo(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()), 0);
                return;
            case 1:
                ((View) this.A00).setX(AnonymousClass000.A03(valueAnimator));
                return;
            case 2:
                view = (View) this.A00;
                break;
            case 3:
            case 4:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                homeActivity.A0S.setBackgroundColor(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
                int i2 = 0;
                while (true) {
                    C14820po r1 = homeActivity.A0Q;
                    if (i2 < r1.A00) {
                        r1.A0H(i2).A04.setTextColor(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
                        i2++;
                    } else {
                        return;
                    }
                }
            case 5:
                VoiceParticipantAudioWave voiceParticipantAudioWave = (VoiceParticipantAudioWave) this.A00;
                voiceParticipantAudioWave.A00 = AnonymousClass000.A03(valueAnimator);
                voiceParticipantAudioWave.invalidate();
                return;
            case 6:
                AnonymousClass2Tr r12 = (AnonymousClass2Tr) this.A00;
                float A03 = AnonymousClass000.A03(valueAnimator);
                r12.A0C.setAlpha(A03);
                r12.A0G.A1R(0, A03 - 1.0f);
                return;
            case 7:
                ((AnonymousClass2Tr) this.A00).A0C.setTranslationY(AnonymousClass000.A03(valueAnimator));
                return;
            case 8:
                AnonymousClass2V5 r2 = (AnonymousClass2V5) this.A00;
                int dimensionPixelSize = (int) (((float) r2.A09.getResources().getDimensionPixelSize(R.dimen.dimen0743)) / AnonymousClass000.A03(valueAnimator));
                r2.A0I.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                return;
            case 9:
                view = ((AnonymousClass2V7) this.A00).A01;
                if (view == null) {
                    return;
                }
                break;
            case 10:
                RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) this.A00;
                roundCornerProgressBar.A00 = AnonymousClass000.A03(valueAnimator);
                roundCornerProgressBar.postInvalidate();
                return;
            case 11:
                SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) this.A00;
                segmentedProgressBar.A02 = AnonymousClass000.A0D(valueAnimator.getAnimatedValue());
                segmentedProgressBar.postInvalidate();
                return;
            case 12:
                View view2 = (View) this.A00;
                int A0D = AnonymousClass000.A0D(valueAnimator.getAnimatedValue());
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
                layoutParams.height = A0D;
                view2.setLayoutParams(layoutParams);
                return;
            case 13:
                ((View) this.A00).setAlpha(AnonymousClass000.A03(valueAnimator));
                return;
            case 14:
                ((C49112Rc) this.A00).A0H.setShapeToolX(AnonymousClass000.A03(valueAnimator));
                return;
            case 15:
                ((C49112Rc) this.A00).A0H.setCloseButtonAlpha(AnonymousClass000.A03(valueAnimator));
                return;
            case 16:
                ((C49112Rc) this.A00).A0H.setCropToolX(AnonymousClass000.A03(valueAnimator));
                return;
            case 17:
                ((C49112Rc) this.A00).A0H.setTextToolX(AnonymousClass000.A03(valueAnimator));
                return;
            case 18:
                ((C49112Rc) this.A00).A0H.setUndoToolX(AnonymousClass000.A03(valueAnimator));
                return;
            case 19:
                ((C49112Rc) this.A00).A0H.setDeleteToolX(AnonymousClass000.A03(valueAnimator));
                return;
            case 20:
                C49112Rc r0 = (C49112Rc) this.A00;
                TitleBarView titleBarView = r0.A0H;
                int A002 = r0.A00();
                float A032 = AnonymousClass000.A03(valueAnimator);
                if (A002 != 1) {
                    if (A002 != 2) {
                        if (A002 == 3) {
                            titleBarView.A05.setAlpha(A032);
                            titleBarView.A06.setAlpha(A032);
                            titleBarView.A03.setAlpha(A032);
                            return;
                        } else if (A002 != 5) {
                            return;
                        }
                    }
                    titleBarView.A05.setAlpha(A032);
                    titleBarView.A09.setAlpha(A032);
                    titleBarView.A03.setAlpha(A032);
                    return;
                }
                titleBarView.A06.setAlpha(A032);
                titleBarView.A09.setAlpha(A032);
                titleBarView.A03.setAlpha(A032);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                ((UserNoticeBottomSheetDialogFragment) this.A00).A03.setAlpha(AnonymousClass000.A03(valueAnimator));
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                View view3 = (View) this.A00;
                int A0D2 = AnonymousClass000.A0D(valueAnimator.getAnimatedValue());
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = A0D2;
                    view3.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                ((Chip) this.A00).setChipBackgroundColor(ColorStateList.valueOf(AnonymousClass000.A0D(valueAnimator.getAnimatedValue())));
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) this.A00;
                float A033 = AnonymousClass000.A03(valueAnimator);
                List list = voiceStatusContentView.A0K;
                List list2 = voiceStatusContentView.A0J;
                List list3 = voiceStatusContentView.A0G;
                list3.clear();
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    float A04 = AnonymousClass000.A04(list2.get(i3));
                    float f2 = 0.0f;
                    if (i3 < list.size()) {
                        f2 = AnonymousClass000.A04(list.get(i3));
                    }
                    list3.add(Float.valueOf(((A04 - f2) * A033) + f2));
                }
                voiceStatusContentView.A04.A02(list3, 1.0f);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                SizeTickerView sizeTickerView = (SizeTickerView) this.A00;
                int A0D3 = AnonymousClass000.A0D(valueAnimator.getAnimatedValue());
                sizeTickerView.A02 = A0D3;
                sizeTickerView.setTextColor(A0D3);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                ((C53772gG) this.A00).A0A.setTextColor(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                ((C53772gG) this.A00).A09.setAlpha(AnonymousClass000.A03(valueAnimator));
                return;
            case 30:
                ((C46202Cw) this.A00).A0I.A06().setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue());
                return;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                View view4 = (View) this.A00;
                float A034 = AnonymousClass000.A03(valueAnimator);
                view4.setScaleX(A034);
                view4.setScaleY(A034);
                return;
            case 32:
                AnonymousClass2P3.A00(valueAnimator, (AnonymousClass2P3) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                AnonymousClass2P3.A02(valueAnimator, (AnonymousClass2P3) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                AnonymousClass2P3.A01(valueAnimator, (AnonymousClass2P3) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                AnonymousClass2P3 r3 = (AnonymousClass2P3) this.A00;
                float A035 = AnonymousClass000.A03(valueAnimator);
                r3.A03 = (2.5f * A035) - 1.75f;
                float height = ((float) r3.A0S.getHeight()) * 0.39f * A035;
                r3.A01 = r3.A0B - height;
                r3.A02 = r3.A0C - height;
                return;
            default:
                ((View) this.A00).setBackgroundColor(AnonymousClass000.A0D(valueAnimator.getAnimatedValue()) << 24);
                return;
        }
        view.setTranslationY((float) AnonymousClass000.A0D(valueAnimator.getAnimatedValue()));
    }
}
