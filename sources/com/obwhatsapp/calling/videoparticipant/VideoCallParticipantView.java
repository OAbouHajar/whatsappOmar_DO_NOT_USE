package com.obwhatsapp.calling.videoparticipant;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass2Ub;
import X.AnonymousClass3NE;
import X.C004601z;
import X.C14710pd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.whatsapp.jid.UserJid;

public class VideoCallParticipantView extends AnonymousClass2Ub {
    public static final int A0Q = ViewConfiguration.getLongPressTimeout();
    public static final int[] A0R = {Integer.MIN_VALUE, 0, 0};
    public static final int[] A0S = {Integer.MIN_VALUE, 0};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public GradientDrawable A07;
    public GradientDrawable A08;
    public GradientDrawable A09;
    public GradientDrawable A0A;
    public GradientDrawable A0B;
    public View A0C;
    public AnonymousClass013 A0D;
    public C14710pd A0E;
    public UserJid A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final FrameLayout A0L;
    public final ImageView A0M;
    public final ImageView A0N;
    public final TextView A0O;
    public final WaImageButton A0P;

    public VideoCallParticipantView(Context context) {
        this(context, (AttributeSet) null);
    }

    public VideoCallParticipantView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoCallParticipantView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setFocusable(false);
        if (Build.VERSION.SDK_INT > 19) {
            setImportantForAccessibility(4);
        }
        LayoutInflater.from(context).inflate(R.layout.layout05ca, this);
        SurfaceView surfaceView = new SurfaceView(context, attributeSet, i2);
        this.A0K = surfaceView;
        addView(surfaceView, 0, new FrameLayout.LayoutParams(-1, -1));
        this.A0J = C004601z.A0E(this, R.id.status_layout);
        this.A0O = (TextView) C004601z.A0E(this, R.id.status);
        this.A0P = (WaImageButton) C004601z.A0E(this, R.id.video_call_status_button);
        this.A0I = C004601z.A0E(this, R.id.mute_image);
        this.A0M = (ImageView) C004601z.A0E(this, R.id.frame_overlay);
        this.A0N = (ImageView) C004601z.A0E(this, R.id.video_call_participant_photo);
        this.A0L = (FrameLayout) C004601z.A0E(this, R.id.mute_layout);
        this.A0G = C004601z.A0E(this, R.id.camera_off_image);
        this.A0C = findViewById(R.id.video_status_container);
        this.A0H = C004601z.A0E(this, R.id.dark_overlay);
        this.A06 = AnonymousClass00T.A00(getContext(), R.color.color00ea);
        this.A05 = AnonymousClass00T.A00(getContext(), 17170445);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.dimen010e);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.dimen0122);
        this.A04 = getResources().getDimensionPixelSize(R.dimen.dimen0128);
        this.A03 = 0;
    }

    private Drawable getMuteIconGradient() {
        int i2 = this.A03;
        if (i2 == 1) {
            GradientDrawable gradientDrawable = this.A09;
            if (gradientDrawable != null) {
                return gradientDrawable;
            }
            GradientDrawable A002 = A00(GradientDrawable.Orientation.BOTTOM_TOP);
            this.A09 = A002;
            return A002;
        } else if (i2 == 2) {
            GradientDrawable gradientDrawable2 = this.A07;
            if (gradientDrawable2 != null) {
                return gradientDrawable2;
            }
            GradientDrawable A003 = A00(GradientDrawable.Orientation.BL_TR);
            this.A07 = A003;
            return A003;
        } else if (i2 == 3) {
            if (this.A07 == null) {
                this.A08 = A00(GradientDrawable.Orientation.BR_TL);
            }
            return this.A08;
        } else if (i2 == 4) {
            GradientDrawable gradientDrawable3 = this.A0B;
            if (gradientDrawable3 != null) {
                return gradientDrawable3;
            }
            GradientDrawable A004 = A00(GradientDrawable.Orientation.TR_BL);
            this.A0B = A004;
            return A004;
        } else if (i2 != 5) {
            return null;
        } else {
            GradientDrawable gradientDrawable4 = this.A0A;
            if (gradientDrawable4 != null) {
                return gradientDrawable4;
            }
            GradientDrawable A005 = A00(GradientDrawable.Orientation.TL_BR);
            this.A0A = A005;
            return A005;
        }
    }

    public final GradientDrawable A00(GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, this.A03 == 1 ? A0S : A0R);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    public void A01() {
        this.A0C.setVisibility(8);
    }

    public void A02() {
        int i2;
        switch (this.A03) {
            case 1:
                A05(81, 0, 0, 0, this.A04);
                A04(81, -1, -2);
                return;
            case 2:
                i2 = 83;
                int i3 = this.A01;
                A05(83, i3, 0, 0, i3);
                break;
            case 3:
                i2 = 85;
                int i4 = this.A01;
                A05(85, 0, 0, i4, i4);
                break;
            case 4:
                i2 = 53;
                int i5 = this.A01;
                A05(53, 0, i5, i5, 0);
                break;
            case 5:
                i2 = 51;
                int i6 = this.A01;
                A05(51, i6, i6, 0, 0);
                break;
            case 6:
                i2 = 49;
                A05(49, 0, this.A01, 0, 0);
                break;
            case 7:
                A05(81, 0, 0, 0, this.A01);
                A04(81, -1, -1);
                return;
            default:
                return;
        }
        int i7 = this.A02;
        A04(i2, i7, i7);
    }

    public void A03(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new AnonymousClass3NE(this, i2));
        }
    }

    public final void A04(int i2, int i3, int i4) {
        FrameLayout frameLayout = this.A0L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.gravity = i2;
        layoutParams.width = i3;
        layoutParams.height = i4;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(getMuteIconGradient());
    }

    public final void A05(int i2, int i3, int i4, int i5, int i6) {
        View view = this.A0I;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i2;
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        layoutParams.rightMargin = i5;
        layoutParams.bottomMargin = i6;
        view.setLayoutParams(layoutParams);
    }

    public void A06(CharSequence charSequence, boolean z2) {
        int i2 = 0;
        this.A0C.setVisibility(0);
        TextView textView = this.A0O;
        textView.setText(charSequence);
        textView.setVisibility(0);
        WaImageButton waImageButton = this.A0P;
        int i3 = 8;
        if (z2) {
            i3 = 0;
        }
        waImageButton.setVisibility(i3);
        if (!z2) {
            i2 = getResources().getDimensionPixelSize(R.dimen.dimen00f9);
        }
        boolean A0T = this.A0D.A0T();
        int paddingLeft = A0T ? i2 : textView.getPaddingLeft();
        int paddingTop = textView.getPaddingTop();
        if (A0T) {
            i2 = textView.getPaddingRight();
        }
        textView.setPadding(paddingLeft, paddingTop, i2, textView.getPaddingBottom());
    }

    public void A07(boolean z2, boolean z3) {
        View view = this.A0G;
        int i2 = 0;
        int i3 = 8;
        if (z3) {
            i3 = 0;
        }
        view.setVisibility(i3);
        FrameLayout frameLayout = this.A0L;
        if (!z2) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
    }

    public boolean A08() {
        int i2 = this.A03;
        return i2 == 5 || i2 == 4 || i2 == 2 || i2 == 3 || i2 == 6;
    }

    public WaImageButton getCancelButton() {
        return this.A0P;
    }

    public ImageView getFrameOverlay() {
        return this.A0M;
    }

    public UserJid getJid() {
        return this.A0F;
    }

    public int getLayoutMode() {
        return this.A03;
    }

    public ImageView getPhotoImageView() {
        return this.A0N;
    }

    public View getVideoView() {
        return this.A0K;
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        float f2 = this.A00;
        if (f2 > 0.0f && (i4 = (int) (((float) size) * f2)) <= size2) {
            i3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(13, -1);
                setLayoutParams(layoutParams2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAspectRatio(float f2) {
        this.A00 = f2;
    }

    public void setJid(UserJid userJid) {
        this.A0F = userJid;
    }

    public void setLayoutMode(int i2) {
        this.A03 = i2;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.A0K.setVisibility(i2);
    }
}
