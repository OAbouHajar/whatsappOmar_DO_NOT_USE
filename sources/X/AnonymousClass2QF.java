package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.IDxTRendererShape198S0100000_2_I0;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.location.WaMapView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;

/* renamed from: X.2QF  reason: invalid class name */
public class AnonymousClass2QF extends AnonymousClass2QG {
    public C17160ud A00;
    public C19430yQ A01;
    public final View A02;
    public final View A03 = findViewById(R.id.control_frame);
    public final View A04 = findViewById(R.id.live_location_label_holder);
    public final View A05;
    public final View A06 = findViewById(R.id.progress_bar);
    public final View A07;
    public final View A08;
    public final View A09 = findViewById(R.id.thumb_button);
    public final FrameLayout A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final ImageView A0D;
    public final ImageView A0E = ((ImageView) findViewById(R.id.thumb));
    public final TextView A0F = ((TextView) findViewById(R.id.control_btn));
    public final TextView A0G = ((TextView) findViewById(R.id.live_location_label));
    public final TextEmojiLabel A0H;
    public final TextEmojiLabel A0I;
    public final ThumbnailButton A0J;
    public final AnonymousClass2Ao A0K;
    public final WaMapView A0L;

    public AnonymousClass2QF(Context context, AnonymousClass2Ao r5, AnonymousClass1YG r6, C38841rV r7) {
        super(context, r6, r7);
        this.A0K = r5;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.map_frame);
        this.A0A = frameLayout;
        this.A0J = (ThumbnailButton) findViewById(R.id.contact_thumbnail);
        this.A02 = findViewById(R.id.contact_thumbnail_overlay);
        this.A05 = findViewById(R.id.message_info_holder);
        this.A08 = findViewById(R.id.text_and_date);
        this.A07 = findViewById(R.id.btn_divider);
        this.A0I = (TextEmojiLabel) findViewById(R.id.stop_share_btn);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.live_location_caption);
        this.A0H = textEmojiLabel;
        this.A0B = (ImageView) findViewById(R.id.live_location_icon_1);
        this.A0C = (ImageView) findViewById(R.id.live_location_icon_2);
        this.A0D = (ImageView) findViewById(R.id.live_location_icon_3);
        this.A0L = (WaMapView) findViewById(R.id.map_holder);
        textEmojiLabel.A07 = new AnonymousClass3MF();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        if (frameLayout != null) {
            frameLayout.setForeground(getLiveLocationFrameForegroundDrawable());
        }
        A1M();
    }

    public void A0t() {
        A1J(false);
        A1M();
    }

    public void A1G(C16740tZ r3, boolean z2) {
        boolean z3 = false;
        if (r3 != this.A0O) {
            z3 = true;
        }
        super.A1G(r3, z2);
        if (z2 || z3) {
            A1M();
        }
    }

    public final void A1M() {
        ImageView imageView;
        ImageView imageView2;
        View view;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        Resources resources;
        int i2;
        int dimensionPixelSize4;
        C16010sH A012;
        C38841rV r10 = (C38841rV) this.A0O;
        View view2 = this.A09;
        View.OnLongClickListener onLongClickListener = this.A1n;
        view2.setOnLongClickListener(onLongClickListener);
        TextEmojiLabel textEmojiLabel = this.A0I;
        textEmojiLabel.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(r10, 14, this));
        textEmojiLabel.setOnLongClickListener(onLongClickListener);
        View view3 = this.A03;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.A08;
        if (view4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        this.A0A.setVisibility(0);
        long A002 = this.A0r.A00();
        C19430yQ r1 = this.A01;
        AnonymousClass00B.A06(r1);
        boolean z2 = r10.A11.A02;
        long A052 = z2 ? r1.A05(r10) : r1.A04(r10);
        boolean A022 = AnonymousClass3BR.A02(this.A0r, r10, A052);
        boolean A0G2 = this.A0L.A0G();
        View view5 = this.A05;
        if (view5 != null) {
            view5.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.dimen051c));
        }
        if (!A022 || A0G2) {
            this.A0B.setVisibility(8);
            imageView = this.A0C;
            imageView.setVisibility(8);
            imageView2 = this.A0D;
            imageView2.setVisibility(8);
        } else {
            this.A0B.setVisibility(0);
            imageView = this.A0C;
            imageView.setVisibility(0);
            imageView2 = this.A0D;
            imageView2.setVisibility(0);
        }
        imageView.clearAnimation();
        imageView2.clearAnimation();
        if (A022 && A052 > A002 && !A0G2) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setRepeatCount(-1);
            alphaAnimation.setRepeatMode(2);
            alphaAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 10));
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(1000);
            alphaAnimation2.setStartOffset(300);
            alphaAnimation2.setInterpolator(new DecelerateInterpolator());
            alphaAnimation2.setRepeatCount(-1);
            alphaAnimation2.setRepeatMode(2);
            imageView.startAnimation(alphaAnimation);
            imageView2.startAnimation(alphaAnimation2);
        }
        this.A04.setVisibility(0);
        Context context = getContext();
        C16040sK r2 = this.A0L;
        AnonymousClass1P7 r12 = this.A0N;
        AnonymousClass00B.A06(r12);
        View.OnClickListener A003 = AnonymousClass3BR.A00(context, r2, r12, r10, A022);
        if (!A022 || A0G2) {
            view = this.A07;
            view.setVisibility(8);
            textEmojiLabel.setVisibility(8);
        } else {
            view = this.A07;
            view.setVisibility(0);
            textEmojiLabel.setVisibility(0);
        }
        view2.setOnClickListener(A003);
        String A013 = AnonymousClass3BR.A01(getContext(), this.A0L, this.A0r, this.A0K, this.A01, r10, A022);
        TextView textView = this.A0G;
        TextView textView2 = textView;
        textView.setText(A013);
        int secondaryTextColor = getSecondaryTextColor();
        View view6 = this.A02;
        if (view6 != null) {
            view6.setVisibility(8);
        }
        WaMapView waMapView = this.A0L;
        WaMapView waMapView2 = waMapView;
        AnonymousClass1P7 r122 = this.A0N;
        AnonymousClass00B.A06(r122);
        waMapView.A02(r122, r10, A022);
        if (waMapView2.getVisibility() == 0) {
            ThumbnailButton thumbnailButton = this.A0J;
            C16040sK r13 = this.A0L;
            C17160ud r14 = this.A00;
            AnonymousClass00B.A06(r14);
            AnonymousClass2Ao r123 = this.A0K;
            C216114t r15 = this.A0v;
            if (z2) {
                r13.A0B();
                A012 = r13.A01;
                AnonymousClass00B.A06(A012);
            } else {
                UserJid A0C2 = r10.A0C();
                if (A0C2 != null) {
                    A012 = r15.A01(A0C2);
                } else {
                    r14.A05(thumbnailButton, R.drawable.avatar_contact);
                }
            }
            r123.A06(thumbnailButton, A012);
        }
        if (!TextUtils.isEmpty(r10.A03)) {
            setMessageText(r10.A03, this.A0H, r10);
            int i3 = 8;
            if (A022) {
                i3 = 0;
            }
            view.setVisibility(i3);
            Resources resources2 = getResources();
            i2 = R.dimen.dimen0249;
            dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.dimen0249);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen024b);
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.dimen0249);
            resources = getResources();
        } else {
            setMessageText("", this.A0H, r10);
            view.setVisibility(8);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0249);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen024c);
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.dimen0249);
            resources = getResources();
            i2 = R.dimen.dimen024a;
        }
        textEmojiLabel.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, resources.getDimensionPixelSize(i2));
        if (view4 != null) {
            boolean isEmpty = TextUtils.isEmpty(r10.A03);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (isEmpty) {
                layoutParams.addRule(11);
                layoutParams.addRule(8, R.id.live_location_info_holder);
                view4.setLayoutParams(layoutParams);
                ViewGroup viewGroup = this.A04;
                viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                dimensionPixelSize4 = viewGroup.getMeasuredWidth() + getResources().getDimensionPixelSize(R.dimen.dimen024d);
            } else {
                layoutParams.addRule(11);
                layoutParams.addRule(3, R.id.live_location_info_holder);
                view4.setLayoutParams(layoutParams);
                dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.dimen024d);
            }
            boolean z3 = !this.A0K.A0T();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
            if (z3) {
                marginLayoutParams2.rightMargin = dimensionPixelSize4;
            } else {
                marginLayoutParams2.leftMargin = dimensionPixelSize4;
            }
        }
        TextView textView3 = this.A0F;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        int i4 = r10.A02;
        if (i4 == 1) {
            View view7 = this.A06;
            if (z2) {
                view7.setVisibility(0);
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                view2.setOnClickListener((View.OnClickListener) null);
            } else {
                view7.setVisibility(0);
            }
        } else if (!z2 || i4 == 2 || !A022) {
            View view8 = this.A06;
            if (view8 != null) {
                view8.setVisibility(8);
            }
        } else {
            View view9 = this.A06;
            if (view9 != null) {
                view9.setVisibility(8);
            }
            if (textView3 != null && !this.A0L.A0G()) {
                textView3.setVisibility(0);
                textView3.setText(R.string.str146a);
                textView3.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 25));
            }
            if (view3 != null) {
                view3.setVisibility(0);
            }
            view.setVisibility(8);
            textEmojiLabel.setVisibility(8);
            if (!this.A0L.A0G()) {
                view2.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 25));
            }
        }
        if (waMapView2.getVisibility() == 8) {
            this.A1d.A08(this.A0E, r10, new IDxTRendererShape198S0100000_2_I0(this, 1));
        }
    }

    public void dispatchSetPressed(boolean z2) {
        super.dispatchSetPressed(z2);
        FrameLayout frameLayout = this.A0A;
        if (frameLayout != null) {
            frameLayout.setForeground(getLiveLocationFrameForegroundDrawable());
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01a1;
    }

    public C38841rV getFMessage() {
        return (C38841rV) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01a1;
    }

    public Drawable getLiveLocationFrameForegroundDrawable() {
        if (isPressed()) {
            Context context = getContext();
            boolean z2 = this.A0O.A11.A02;
            int i2 = R.color.color00c7;
            if (z2) {
                i2 = R.color.color00c9;
            }
            return AnonymousClass2SR.A02(context, R.drawable.balloon_live_location_incoming_frame, i2);
        }
        boolean z3 = this.A0O.A11.A02;
        int i3 = R.drawable.balloon_live_location_incoming_frame;
        if (z3) {
            i3 = R.drawable.balloon_live_location_outgoing_frame;
        }
        Context context2 = getContext();
        boolean z4 = this.A0O.A11.A02;
        int i4 = R.color.color00c6;
        if (z4) {
            i4 = R.color.color00c8;
        }
        return AnonymousClass2SR.A02(context2, i3, i4);
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01a3;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38841rV);
        this.A0O = r2;
    }
}
