package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape252S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.BidiToolbar;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.chatinfo.view.custom.BusinessChatInfoLayout;
import com.obwhatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.obwhatsapp.components.ScalingFrameLayout;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2Uu  reason: invalid class name and case insensitive filesystem */
public abstract class C49662Uu extends AnonymousClass2Uw {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public View.OnClickListener A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public ListView A0H;
    public TextView A0I;
    public BidiToolbar A0J;
    public TextEmojiLabel A0K;
    public C30521cU A0L;
    public AnonymousClass5PD A0M;
    public ScalingFrameLayout A0N;
    public C17160ud A0O;
    public C16080sP A0P;
    public AnonymousClass013 A0Q;
    public C17250um A0R;
    public C14710pd A0S;
    public C17240ul A0T;
    public C25781Lc A0U;
    public CharSequence A0V;
    public CharSequence A0W;
    public String A0X;
    public boolean A0Y;
    public final ViewTreeObserver.OnGlobalLayoutListener A0Z = new C94304kh(this);

    public C49662Uu(Context context) {
        super(context);
        A0B(context);
    }

    public C49662Uu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0B(context);
    }

    public C49662Uu(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A0B(context);
    }

    public static /* synthetic */ void A00(C49662Uu r3) {
        if (r3.getWidth() > r3.getHeight()) {
            ((C001000l) C19980zJ.A00(r3.getContext())).A0c();
            r3.A0H.setOnScrollListener(new IDxSListenerShape252S0100000_2_I0(r3, 2));
            return;
        }
        int A032 = r3.A03(r3.getMeasuredWidth()) - r3.A02(r3.getMeasuredWidth());
        r3.A08 = A032;
        r3.A0H.setSelectionFromTop(0, A032);
        r3.setScrollPos(r3.A08);
        r3.A0H.post(new AnonymousClass55D(r3));
    }

    private void setSubtitleSingleLine(boolean z2) {
        TextView textView = this.A0I;
        if (textView != null) {
            textView.setSingleLine(z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r1.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(int r3) {
        /*
            r2 = this;
            r1 = r2
            com.obwhatsapp.chatinfo.view.custom.ChatInfoLayoutV2 r1 = (com.obwhatsapp.chatinfo.view.custom.ChatInfoLayoutV2) r1
            boolean r0 = r1 instanceof com.obwhatsapp.chatinfo.view.custom.BusinessChatInfoLayout
            if (r0 == 0) goto L_0x0017
            android.widget.ImageView r0 = r1.A05
            if (r0 == 0) goto L_0x0017
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0017
            float r1 = (float) r3
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
        L_0x0017:
            int r0 = r1.A03(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49662Uu.A02(int):int");
    }

    public abstract int A03(int i2);

    public void A04() {
        this.A06 = 0;
        if (this.A0E.getVisibility() != 0) {
            this.A0E.setVisibility(0);
        }
    }

    public void A05() {
        this.A0F = findViewById(R.id.photo_overlay);
        this.A0G = findViewById(R.id.subject_layout);
        this.A0L = new C30521cU((View) this, this.A0P, this.A0Q, this.A0U, (int) R.id.conversation_contact_name);
        AnonymousClass2JP.A03(findViewById(R.id.conversation_contact_name), R.string.str0095);
        this.A0N = (ScalingFrameLayout) findViewById(R.id.conversation_contact_name_scaler);
        this.A0J = (BidiToolbar) C004601z.A0E(this, R.id.toolbar);
        TextView textView = (TextView) findViewById(R.id.conversation_contact_status);
        this.A0I = textView;
        if (textView != null) {
            textView.setClickable(false);
        }
        this.A0K = (TextEmojiLabel) findViewById(R.id.push_name);
        this.A0C = findViewById(R.id.header);
        this.A0H = (ListView) findViewById(16908298);
        this.A0E = C004601z.A0E(this, R.id.header_placeholder);
        this.A01 = this.A0L.A02.getTextSize();
        A06();
    }

    public void A06() {
        Display defaultDisplay = C19980zJ.A00(getContext()).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.A0E.setLayoutParams(new LinearLayout.LayoutParams(-1, A02(point.x)));
        this.A0H.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 8));
    }

    public void A07() {
        CharSequence charSequence = this.A0W;
        if (charSequence != null) {
            this.A0E.setContentDescription(C40631uR.A00(this.A0Q, Arrays.asList(this.A0X == null ? new String[]{charSequence.toString()} : new String[]{charSequence.toString(), this.A0X}), false));
        }
        AnonymousClass2JP.A03(this.A0E, R.string.str0095);
    }

    public void A08() {
        View childAt = this.A0H.getChildAt(0);
        if (childAt != null) {
            setScrollPos(this.A0H.getFirstVisiblePosition() == 0 ? childAt.getTop() : -getHeight());
        }
        AnonymousClass5PD r0 = this.A0M;
        if (r0 != null) {
            r0.AWk();
        }
    }

    public void A09(int i2) {
        this.A0H = (ListView) C004601z.A0E(this, 16908298);
        View inflate = LayoutInflater.from(getContext()).inflate(i2, this.A0H, false);
        this.A0D = inflate;
        this.A0H.addHeaderView(inflate, (Object) null, false);
        C004601z.A0d(this.A0D, 2);
    }

    public void A0A(int i2, int i3) {
        this.A04 = i2;
        this.A03 = i3;
        if (getWidth() < getHeight()) {
            float f2 = this.A00;
            if (f2 > 0.0f) {
                int i4 = (int) (((float) this.A04) * f2 * f2);
                int i5 = (int) (((float) this.A03) * f2 * f2);
                C45902Bo.A08(this.A0G, this.A0Q, i4, i5);
            }
        }
    }

    public final void A0B(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.attr0007, typedValue, true)) {
            this.A07 = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        this.A02 = (float) getResources().getDimensionPixelSize(R.dimen.dimen01f1);
    }

    public void A0C(Bitmap bitmap) {
        if (this instanceof BusinessChatInfoLayout) {
            ImageView imageView = (ImageView) C004601z.A0E(this, R.id.picture);
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                imageView.setImageDrawable((Drawable) null);
            }
            A06();
        }
    }

    public void A0D(View view, View view2, Adapter adapter) {
        this.A0H.getViewTreeObserver().addOnGlobalLayoutListener(new C94414ks(view, view2, adapter, this));
    }

    public final void A0E(CharSequence charSequence) {
        if (this.A0K != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            TextEmojiLabel textEmojiLabel = this.A0K;
            if (isEmpty) {
                textEmojiLabel.setVisibility(8);
            } else {
                textEmojiLabel.setVisibility(0);
                this.A0K.A0I((List) null, charSequence);
            }
            this.A0K.setOnClickListener(this.A0A);
            AnonymousClass2JP.A03(this.A0K, R.string.str0095);
        }
    }

    public View getBusinessDetailsCard() {
        return this.A0B;
    }

    public int getColor() {
        return this.A05;
    }

    public int getToolbarColor() {
        return AnonymousClass00T.A00(getContext(), R.color.color0784);
    }

    public abstract int getToolbarColorResId();

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View view;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingTop = getPaddingTop();
        int paddingBottom = i7 - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = i6 - getPaddingRight();
        if (i7 > i6) {
            View view2 = this.A0C;
            view2.layout(paddingLeft, paddingTop, paddingRight, view2.getMeasuredHeight() + paddingTop);
            view = this.A0H;
        } else if (this.A0Q.A0T()) {
            ListView listView = this.A0H;
            listView.layout(0 + paddingLeft, paddingTop, listView.getMeasuredWidth() + paddingLeft, paddingBottom);
            view = this.A0C;
            paddingLeft += this.A0H.getMeasuredWidth();
        } else {
            View view3 = this.A0C;
            view3.layout(paddingLeft, paddingTop, view3.getMeasuredWidth() + paddingLeft, paddingBottom);
            view = this.A0H;
            paddingLeft += this.A0C.getMeasuredWidth();
        }
        view.layout(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public void onMeasure(int i2, int i3) {
        ListView listView;
        int makeMeasureSpec;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        View view = this.A0E;
        if (measuredHeight >= measuredWidth) {
            if (!(view == null || view.getVisibility() == 0)) {
                this.A0F.setOnClickListener((View.OnClickListener) null);
                this.A0F.setClickable(false);
                this.A0E.setVisibility(0);
                this.A0H.getViewTreeObserver().addOnGlobalLayoutListener(this.A0Z);
            }
            this.A0C.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(this.A07, this.A06), 1073741824));
            listView = this.A0H;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        } else {
            if (view.getVisibility() != 8) {
                this.A0F.setOnClickListener(this.A0A);
                AnonymousClass2JP.A03(this.A0F, R.string.str0095);
                this.A0F.setClickable(true);
                C30521cU r0 = this.A0L;
                r0.A02.setOnClickListener(this.A0A);
                this.A0E.setVisibility(8);
                this.A0H.post(new RunnableRunnableShape5S0100000_I0_4((Object) this, 26));
            }
            int i4 = (int) (((float) measuredWidth) * 0.618f);
            this.A0C.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - i4, 1073741824), i3);
            listView = this.A0H;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        listView.measure(makeMeasureSpec, i3);
    }

    public void setColor(int i2) {
        int i3 = (i2 & ViewCompat.MEASURED_SIZE_MASK) | (this.A05 & -16777216);
        this.A05 = i3;
        this.A0F.setBackgroundColor(i3);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.A0A = onClickListener;
    }

    public abstract void setOnPhotoClickListener(View.OnClickListener onClickListener);

    public void setOnScrollListener(AnonymousClass5PD r1) {
        this.A0M = r1;
    }

    public void setPushName(String str) {
        this.A0V = str;
        A0E(str);
    }

    public abstract void setRadius(float f2);

    public void setScrollPos(int i2) {
        int width = getWidth();
        int height = getHeight();
        boolean z2 = this.A0Y;
        if (width < height) {
            if (z2) {
                A04();
            }
            this.A0Y = false;
            this.A09 = Math.max(this.A09, ((long) (((((float) (i2 - this.A08)) / ((float) getHeight())) * 100.0f) - 100.0f)) * -1);
            int max = Math.max(this.A07, A02(getWidth()) + i2);
            int A032 = A03(getWidth());
            this.A00 = Math.max(0.0f, ((float) (A032 - max)) / ((float) (A032 - this.A07)));
            TextUtils.TruncateAt ellipsize = this.A0L.A02.getEllipsize();
            int i3 = this.A07 << 1;
            TextEmojiLabel textEmojiLabel = this.A0L.A02;
            if (max < i3) {
                textEmojiLabel.setSingleLine(true);
                this.A0L.A02.setEllipsize(TextUtils.TruncateAt.END);
                setSubtitleSingleLine(true);
                ((ViewGroup.MarginLayoutParams) this.A0L.A02.getLayoutParams()).setMargins(0, 0, 0, 0);
            } else {
                textEmojiLabel.setSingleLine(false);
                this.A0L.A02.setEllipsize((TextUtils.TruncateAt) null);
                setSubtitleSingleLine(false);
                int i4 = this.A07;
                ((ViewGroup.MarginLayoutParams) this.A0L.A02.getLayoutParams()).setMargins(0, Math.min(i4, max - (i4 << 1)), 0, 0);
            }
            A0E(this.A0V);
            if (ellipsize != this.A0L.A02.getEllipsize()) {
                this.A0L.A0E(this.A0W);
                A07();
            }
            if (this.A06 != max) {
                this.A06 = max;
                int i5 = this.A05 >> 24;
                if (max == this.A07) {
                    if (i5 != -1) {
                        this.A0L.A02.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        TextView textView = this.A0I;
                        if (textView != null) {
                            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        }
                    }
                } else if (i5 == -1) {
                    this.A0L.A02.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    TextView textView2 = this.A0I;
                    if (textView2 != null) {
                        textView2.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    }
                }
                ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) this;
                float f2 = chatInfoLayoutV2.getResources().getDisplayMetrics().density;
                float f3 = chatInfoLayoutV2.A00;
                float f4 = 1.0f - f3;
                int i6 = (int) (f3 * 255.0f);
                int i7 = (int) (((float) chatInfoLayoutV2.A04) * f3 * f3);
                int i8 = (int) (((float) chatInfoLayoutV2.A03) * f3 * f3);
                float f5 = chatInfoLayoutV2.A01;
                float f6 = (f5 - ((f5 - chatInfoLayoutV2.A02) * f3)) / f5;
                int i9 = (f3 > 0.8f ? 1 : (f3 == 0.8f ? 0 : -1));
                TextView textView3 = chatInfoLayoutV2.A07;
                if (i9 > 0) {
                    textView3.setAlpha((float) i6);
                    chatInfoLayoutV2.A07.setVisibility(0);
                } else {
                    textView3.setVisibility(8);
                }
                ScalingFrameLayout scalingFrameLayout = chatInfoLayoutV2.A0N;
                scalingFrameLayout.A00 = f6;
                chatInfoLayoutV2.A09.A00 = f6;
                ((ViewGroup.MarginLayoutParams) scalingFrameLayout.getLayoutParams()).setMargins(0, 0, 0, 0);
                chatInfoLayoutV2.A05 = (i6 << 24) | (chatInfoLayoutV2.A05 & ViewCompat.MEASURED_SIZE_MASK);
                if (chatInfoLayoutV2.getContext() instanceof AnonymousClass2DL) {
                    AnonymousClass2DL r1 = (AnonymousClass2DL) C19980zJ.A01(chatInfoLayoutV2.getContext(), AnonymousClass2DL.class);
                    if (i6 > 0) {
                        r1.A3C(chatInfoLayoutV2.A05);
                    } else if (C15450qv.A04()) {
                        C434920f.A04(r1, R.color.color04f1);
                    } else {
                        C434920f.A03(r1, R.color.color0581);
                    }
                }
                chatInfoLayoutV2.A0F.setBackgroundColor(chatInfoLayoutV2.A05);
                if (!C434920f.A09(chatInfoLayoutV2.getContext())) {
                    int i10 = (int) (chatInfoLayoutV2.A00 * 255.0f);
                    if (i10 < 111) {
                        i10 = 111;
                    }
                    int i11 = i10 & MotionEventCompat.ACTION_MASK;
                    chatInfoLayoutV2.setToolbarIconColorIfNeeded((i11 << 0) | -16777216 | (i11 << 16) | (i11 << 8));
                }
                C45902Bo.A08(chatInfoLayoutV2.A0G, chatInfoLayoutV2.A0Q, i7, i8);
                chatInfoLayoutV2.A0F();
                boolean z3 = false;
                if (chatInfoLayoutV2.A00 <= 0.95f) {
                    z3 = true;
                }
                chatInfoLayoutV2.A0B = z3;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) chatInfoLayoutV2.A05.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) (((float) chatInfoLayoutV2.getResources().getDimensionPixelSize(R.dimen.dimen00e2)) * f4));
                chatInfoLayoutV2.A05.setLayoutParams(marginLayoutParams);
                chatInfoLayoutV2.A0F.setLayoutParams(marginLayoutParams);
                if (chatInfoLayoutV2.A0C) {
                    chatInfoLayoutV2.A08.setAnimationValue(chatInfoLayoutV2.A00);
                } else {
                    int i12 = (int) ((((float) chatInfoLayoutV2.A03) * f4) / 2.0f);
                    int i13 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
                    Resources resources = chatInfoLayoutV2.getResources();
                    int i14 = R.dimen.dimen00e5;
                    if (i13 > 0) {
                        i14 = R.dimen.dimen00e4;
                    }
                    int dimensionPixelSize = resources.getDimensionPixelSize(i14);
                    chatInfoLayoutV2.A04.setPadding(i12, i12, i12, i12);
                    chatInfoLayoutV2.A06.setPadding(i12, i12, i12, i12);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) chatInfoLayoutV2.A04.getLayoutParams();
                    boolean z4 = !chatInfoLayoutV2.A0Q.A0T();
                    int i15 = (int) (chatInfoLayoutV2.A00 * ((float) dimensionPixelSize));
                    if (z4) {
                        layoutParams.setMargins(0, 0, i15, 0);
                    } else {
                        layoutParams.setMargins(i15, 0, 0, 0);
                    }
                    Drawable drawable = null;
                    if (chatInfoLayoutV2.A00 > 0.95f) {
                        chatInfoLayoutV2.A04.setBackground((Drawable) null);
                        layoutParams.setMargins(0, 0, 0, 0);
                        layoutParams.gravity = GravityCompat.START;
                    } else {
                        boolean z5 = false;
                        if (chatInfoLayoutV2.A00 != -2.14748365E9f) {
                            z5 = true;
                        }
                        View view = chatInfoLayoutV2.A04;
                        if (z5) {
                            drawable = AnonymousClass00T.A04(chatInfoLayoutV2.getContext(), R.drawable.business_profile_photo_bg);
                        }
                        view.setBackground(drawable);
                        layoutParams.gravity = 1;
                    }
                    chatInfoLayoutV2.A04.setLayoutParams(layoutParams);
                }
                chatInfoLayoutV2.A0G();
                chatInfoLayoutV2.requestLayout();
            }
        } else if (!z2) {
            this.A0Y = true;
            ChatInfoLayoutV2 chatInfoLayoutV22 = (ChatInfoLayoutV2) this;
            chatInfoLayoutV22.A0E.setVisibility(8);
            chatInfoLayoutV22.A0F.setBackgroundColor(0);
            chatInfoLayoutV22.A0N.setVisibility(8);
            chatInfoLayoutV22.A09.A00 = 1.0f;
            chatInfoLayoutV22.A04.setBackground(AnonymousClass00T.A04(chatInfoLayoutV22.getContext(), R.drawable.business_profile_photo_bg));
            chatInfoLayoutV22.A0F();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) chatInfoLayoutV22.A05.getLayoutParams();
            marginLayoutParams2.setMargins(0, 0, 0, 0);
            chatInfoLayoutV22.A05.setLayoutParams(marginLayoutParams2);
            chatInfoLayoutV22.A0F.setLayoutParams(marginLayoutParams2);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) chatInfoLayoutV22.A04.getLayoutParams();
            marginLayoutParams3.setMargins(0, 0, 0, 0);
            chatInfoLayoutV22.A04.setLayoutParams(marginLayoutParams3);
            int dimensionPixelSize2 = chatInfoLayoutV22.getResources().getDimensionPixelSize(R.dimen.dimen00e1);
            chatInfoLayoutV22.A04.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            chatInfoLayoutV22.setToolbarIconColorIfNeeded(chatInfoLayoutV22.getToolbarColor());
        }
    }

    public abstract void setStatusData(AnonymousClass2XQ r1);

    public void setSubtitleText(String str) {
        TextView textView = this.A0I;
        if (textView != null && str != null) {
            this.A0X = str;
            textView.setText(str);
            TextView textView2 = this.A0I;
            int i2 = 0;
            if (TextUtils.isEmpty(str)) {
                i2 = 8;
            }
            textView2.setVisibility(i2);
            A07();
        }
    }

    public void setTitleText(String str) {
        CharSequence A042 = AnonymousClass2Sy.A04(getContext(), this.A0L.A02.getPaint(), this.A0R, str, 0.9f);
        this.A0W = A042;
        this.A0L.A0E(A042);
        C30521cU r0 = this.A0L;
        r0.A02.setOnClickListener(this.A0A);
        A07();
    }

    public void setTitleTextMessageYourself(C16010sH r4) {
        this.A0L.A0C(r4, (AnonymousClass2TP) null, (List) null, 0.9f);
        C30521cU r0 = this.A0L;
        r0.A02.setOnClickListener(this.A0A);
        A07();
    }

    public void setTitleVerified(boolean z2) {
        C30521cU r1 = this.A0L;
        int i2 = 0;
        if (z2) {
            i2 = 2;
        }
        r1.A07(i2);
    }

    public void setToolbarIconColorIfNeeded(int i2) {
        if (!C434920f.A09(getContext())) {
            Drawable navigationIcon = this.A0J.getNavigationIcon();
            Drawable overflowIcon = this.A0J.getOverflowIcon();
            if (navigationIcon != null && overflowIcon != null) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                overflowIcon.setColorFilter(i2, mode);
                navigationIcon.setColorFilter(i2, mode);
                this.A0J.setNavigationIcon(navigationIcon);
                this.A0J.setOverflowIcon(overflowIcon);
            }
        }
    }
}
