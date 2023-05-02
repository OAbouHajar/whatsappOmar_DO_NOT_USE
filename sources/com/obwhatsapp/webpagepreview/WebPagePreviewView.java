package com.obwhatsapp.webpagepreview;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass1ZR;
import X.AnonymousClass2GQ;
import X.AnonymousClass2SR;
import X.AnonymousClass2TP;
import X.AnonymousClass4Y8;
import X.C004601z;
import X.C018208n;
import X.C14710pd;
import X.C16150sX;
import X.C16620tM;
import X.C18030w2;
import X.C20070zS;
import X.C26081Mg;
import X.C30581cc;
import X.C30931dC;
import X.C42181xM;
import X.C45902Bo;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C55642k5;
import X.C55842kV;
import X.C56522nn;
import X.C61863As;
import X.C70643hR;
import X.C70653hS;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.yo.Conversation;
import java.util.List;
import java.util.Set;

public class WebPagePreviewView extends FrameLayout implements C55842kV, AnonymousClass006 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public FrameLayout A08;
    public FrameLayout A09;
    public FrameLayout A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ImageView A0D;
    public LinearLayout A0E;
    public ProgressBar A0F;
    public ProgressBar A0G;
    public TextView A0H;
    public WaImageView A0I;
    public WaTextView A0J;
    public WaTextView A0K;
    public WaTextView A0L;
    public ThumbnailButton A0M;
    public ThumbnailButton A0N;
    public AnonymousClass013 A0O;
    public C20070zS A0P;
    public C26081Mg A0Q;
    public C18030w2 A0R;
    public C14710pd A0S;
    public C52662eE A0T;
    public boolean A0U;

    public WebPagePreviewView(Context context) {
        super(context);
        A03();
        A06(context);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        A06(context);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A03();
        A06(context);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A03();
    }

    private void setImageThumbContentIndicator(int i2) {
        if (this.A0S.A0E(C16620tM.A02, 2652)) {
            WaImageView waImageView = this.A0I;
            int i3 = 8;
            if (i2 == 1) {
                i3 = 0;
            }
            waImageView.setVisibility(i3);
        }
    }

    private void setImageThumbWithBitmap(Bitmap bitmap) {
        this.A0N.setImageBitmap(bitmap);
        this.A0N.setVisibility(0);
    }

    public void A00() {
        this.A0A.setVisibility(8);
        this.A08.setVisibility(0);
        this.A09.setVisibility(0);
        this.A0N.setVisibility(8);
        if (this.A0S.A0E(C16620tM.A02, 2652)) {
            this.A0I.setVisibility(8);
        }
    }

    public void A01() {
        this.A01.setVisibility(0);
        this.A0A.setVisibility(8);
        this.A08.setVisibility(8);
        C45902Bo.A08(this.A0K, this.A0O, 0, getContext().getResources().getDimensionPixelSize(R.dimen.dimen029c));
    }

    public void A02() {
        this.A0A.setVisibility(8);
        this.A08.setVisibility(8);
        this.A09.setVisibility(0);
        this.A0N.setVisibility(0);
        if (this.A0S.A0E(C16620tM.A02, 2652)) {
            this.A0I.setVisibility(0);
        }
    }

    public void A03() {
        if (!this.A0U) {
            this.A0U = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A0S = (C14710pd) r1.A05.get();
            this.A0O = (AnonymousClass013) r1.AR8.get();
            this.A0Q = (C26081Mg) r1.AIY.get();
            this.A0R = (C18030w2) r1.A6W.get();
            this.A0P = r1.A1U();
        }
    }

    public final void A04() {
        this.A0N.setImageDrawable((Drawable) null);
        this.A0N.setVisibility(8);
        if (this.A0S.A0E(C16620tM.A02, 2652)) {
            this.A0I.setVisibility(8);
        }
    }

    public void A05(int i2, int i3) {
        this.A08.getLayoutParams().width = i2;
        this.A08.getLayoutParams().height = i3;
        this.A08.requestLayout();
    }

    public final void A06(Context context) {
        FrameLayout.inflate(context, R.layout.layout0620, this);
        this.A02 = C004601z.A0E(this, R.id.link_preview_content);
        Conversation.pageDescColor(this);
        this.A09 = (FrameLayout) C004601z.A0E(this, R.id.thumb_frame);
        this.A0N = (ThumbnailButton) C004601z.A0E(this, R.id.thumb);
        this.A0I = (WaImageView) C004601z.A0E(this, R.id.thumb_content_indicator);
        this.A04 = C004601z.A0E(this, R.id.play_frame_small);
        this.A0F = (ProgressBar) C004601z.A0E(this, R.id.progress);
        this.A01 = C004601z.A0E(this, R.id.cancel);
        this.A0A = (FrameLayout) C004601z.A0E(this, R.id.large_thumb_frame);
        this.A0D = (ImageView) C004601z.A0E(this, R.id.large_thumb);
        this.A0C = (ImageView) C004601z.A0E(this, R.id.logo_button);
        this.A0G = (ProgressBar) C004601z.A0E(this, R.id.large_progress);
        this.A05 = C004601z.A0E(this, R.id.play_frame);
        this.A06 = C004601z.A0E(this, R.id.inline_indication);
        this.A07 = C004601z.A0E(this, R.id.inline_layer);
        this.A08 = (FrameLayout) C004601z.A0E(this, R.id.webPagePreviewImageLarge_frame);
        this.A0M = (ThumbnailButton) C004601z.A0E(this, R.id.webPagePreviewImageLarge_thumb);
        this.A0B = (ImageView) C004601z.A0E(this, R.id.webPagePreviewImageLarge_logo_platform);
        this.A03 = C004601z.A0E(this, R.id.webPagePreviewImageLarge_logo_platform_shadow);
        this.A0E = (LinearLayout) C004601z.A0E(this, R.id.titleSnippetUrlLayout);
        this.A0K = (WaTextView) C004601z.A0E(this, R.id.title);
        this.A0J = (WaTextView) C004601z.A0E(this, R.id.snippet);
        this.A0L = (WaTextView) C004601z.A0E(this, R.id.url);
        this.A00 = C004601z.A0E(this, R.id.gif_size_bullet);
        this.A0H = (TextView) C004601z.A0E(this, R.id.gif_size);
        Drawable A042 = AnonymousClass00T.A04(context, R.drawable.balloon_incoming_frame);
        AnonymousClass00B.A06(A042);
        Drawable A032 = C018208n.A03(A042.mutate());
        C018208n.A0A(A032, AnonymousClass00T.A00(context, R.color.color00c6));
        setForeground(A032);
        if (getId() == -1) {
            setId(R.id.link_preview_frame);
        }
    }

    public final void A07(WaTextView waTextView, String str, List list, int i2) {
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > i2) {
                str2 = str.substring(0, i2);
            }
            waTextView.setVisibility(0);
            waTextView.setText((CharSequence) AnonymousClass2TP.A00(getContext(), this.A0O, AnonymousClass2TP.A01, str2, list, false).A00);
            return;
        }
        waTextView.setVisibility(8);
    }

    public void A08(AnonymousClass1ZR r20, List list, boolean z2, boolean z3) {
        AnonymousClass1ZR r1 = r20;
        String str = r1.A0K;
        String str2 = r1.A0H;
        String str3 = TextUtils.isEmpty(r1.A0D) ? r1.A0W : r1.A0D;
        byte[] bArr = r1.A0T;
        String str4 = r1.A0W;
        Integer num = r1.A0B;
        C55642k5 r0 = r1.A09;
        int i2 = r0 != null ? r0.A00 : -1;
        boolean A0G2 = r1.A0G();
        int i3 = r1.A02;
        boolean z4 = r1 instanceof C70653hS;
        boolean z5 = r1 instanceof C70643hR;
        A0A(num, str, str2, str3, str4, list, i2, false, z5, z3);
        A0B(str4, bArr, i2, i3, false, z2, A0G2, z4);
    }

    public void A09(C30581cc r12, String str) {
        A02();
        String A012 = C30931dC.A01(r12.A13());
        Set A002 = this.A0Q.A00(r12.A0C(), r12, str);
        byte[] A17 = r12.A17();
        boolean z2 = false;
        if (A002 != null) {
            z2 = true;
        }
        A0B(A012, A17, -1, r12.A01, z2, false, false, false);
    }

    public final void A0A(Integer num, String str, String str2, String str3, String str4, List list, int i2, boolean z2, boolean z3, boolean z4) {
        boolean A0D2 = this.A0R.A0D(str3);
        boolean A022 = C61863As.A02(str4);
        C18030w2 r2 = this.A0R;
        boolean z5 = false;
        if (!TextUtils.isEmpty(str4) && 33 == r2.A08(Uri.parse(str4))) {
            z5 = true;
        }
        if (A022) {
            str2 = AnonymousClass4Y8.A00(getContext(), num, str2, z4);
        }
        if (z5 && str4 != null) {
            List<String> pathSegments = Uri.parse(str4).getPathSegments();
            if (pathSegments.size() > 0) {
                boolean equals = pathSegments.get(0).equals("video");
                Context context = getContext();
                int i3 = R.string.str1b95;
                if (equals) {
                    i3 = R.string.str1b94;
                }
                String string = context.getString(i3);
                if (string != null) {
                    str = string;
                }
            }
        }
        setImageProgressBarVisibility(false);
        if (i2 > 0) {
            this.A0K.setText(getContext().getString(R.string.str09c9));
            this.A0J.setVisibility(8);
        } else {
            setTitleAndSnippet(str, str2, z2, list);
        }
        if (z3) {
            Context context2 = getContext();
            StringBuilder sb = new StringBuilder(context2.getString(R.string.str161b));
            Drawable A023 = AnonymousClass2SR.A02(context2, R.drawable.msg_status_shop, R.color.color055a);
            WaTextView waTextView = this.A0L;
            waTextView.setText(C56522nn.A00(waTextView.getPaint(), A023, sb));
        } else {
            setLinkHostname((A022 || A0D2 || z5 || TextUtils.isEmpty(str3)) ? null : C61863As.A00(str3));
        }
        setLinkGifSize(i2);
        C004601z.A0f(this.A0E, C45902Bo.A0G(str) ^ true ? 1 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(java.lang.String r9, byte[] r10, int r11, int r12, boolean r13, boolean r14, boolean r15, boolean r16) {
        /*
            r8 = this;
            boolean r7 = X.C61863As.A02(r9)
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166409(0x7f0704c9, float:1.7947063E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166408(0x7f0704c8, float:1.794706E38)
            int r3 = r1.getDimensionPixelSize(r0)
            if (r15 != 0) goto L_0x0137
            if (r14 == 0) goto L_0x002e
            if (r13 != 0) goto L_0x002e
            if (r11 > 0) goto L_0x002e
            r8.A00()
            return
        L_0x002e:
            r8.A02()
            com.obwhatsapp.components.button.ThumbnailButton r2 = r8.A0N
            r0 = 0
            if (r7 == 0) goto L_0x0038
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0038:
            r2.A02 = r0
            r1 = 0
            r2.setContentDescription(r1)
            r5 = 0
            if (r13 != 0) goto L_0x0132
            if (r11 <= 0) goto L_0x00d7
            com.obwhatsapp.components.button.ThumbnailButton r2 = r8.A0N
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131232048(0x7f080530, float:1.8080194E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setImageDrawable(r0)
            com.obwhatsapp.components.button.ThumbnailButton r2 = r8.A0N
            android.content.Context r1 = r8.getContext()
            r0 = 2131100919(0x7f0604f7, float:1.7814233E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r2.setBackgroundColor(r0)
            com.obwhatsapp.components.button.ThumbnailButton r2 = r8.A0N
            android.content.Context r1 = r8.getContext()
            r0 = 2131888585(0x7f1209c9, float:1.941181E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
            com.obwhatsapp.components.button.ThumbnailButton r0 = r8.A0N
            r0.setVisibility(r5)
        L_0x0078:
            r6 = 0
        L_0x0079:
            if (r7 == 0) goto L_0x00b7
            int r0 = r4 << 1
            int r4 = r0 / 3
            int r0 = r3 << 1
            int r3 = r0 / 3
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166404(0x7f0704c4, float:1.7947052E38)
            int r5 = r1.getDimensionPixelSize(r0)
            com.obwhatsapp.components.button.ThumbnailButton r1 = r8.A0N
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
        L_0x0096:
            r1.setScaleType(r0)
            com.obwhatsapp.components.button.ThumbnailButton r0 = r8.A0N
            r0.setPadding(r5, r5, r5, r5)
            com.obwhatsapp.components.button.ThumbnailButton r0 = r8.A0N
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r4
            com.obwhatsapp.components.button.ThumbnailButton r0 = r8.A0N
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r3
            com.obwhatsapp.components.button.ThumbnailButton r0 = r8.A0N
            r0.requestLayout()
            r8.setImageThumbContentIndicator(r12)
            return
        L_0x00b7:
            if (r6 == 0) goto L_0x00cd
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165875(0x7f0702b3, float:1.794598E38)
            int r5 = r1.getDimensionPixelSize(r0)
            com.obwhatsapp.components.button.ThumbnailButton r1 = r8.A0N
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L_0x0096
        L_0x00cd:
            com.obwhatsapp.components.button.ThumbnailButton r1 = r8.A0N
            if (r11 <= 0) goto L_0x00d4
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            goto L_0x0096
        L_0x00d4:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L_0x0096
        L_0x00d7:
            if (r10 == 0) goto L_0x00f6
            X.25c r0 = new X.25c
            r0.<init>(r4, r3)
            X.25d r0 = X.C37741pe.A05(r1, r0, r10, r5)
            android.graphics.Bitmap r1 = r0.A02
            if (r1 == 0) goto L_0x00f6
            int r0 = r1.getHeight()
            if (r0 == 0) goto L_0x00f6
            int r0 = r1.getWidth()
            if (r0 == 0) goto L_0x00f6
            r8.setImageThumbWithBitmap(r1)
            goto L_0x0078
        L_0x00f6:
            if (r16 == 0) goto L_0x0132
            r6 = 1
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131231681(0x7f0803c1, float:1.807945E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            android.graphics.drawable.Drawable r2 = X.C018208n.A03(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131100091(0x7f0601bb, float:1.7812554E38)
            int r0 = r1.getColor(r0)
            X.C018208n.A0A(r2, r0)
            com.obwhatsapp.components.button.ThumbnailButton r0 = r8.A0N
            r0.setImageDrawable(r2)
            com.obwhatsapp.components.button.ThumbnailButton r2 = r8.A0N
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131100090(0x7f0601ba, float:1.7812552E38)
            int r0 = r1.getColor(r0)
            r2.setBackgroundColor(r0)
            com.obwhatsapp.components.button.ThumbnailButton r0 = r8.A0N
            r0.setVisibility(r5)
            goto L_0x0079
        L_0x0132:
            r8.A04()
            goto L_0x0078
        L_0x0137:
            r8.AIB()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.webpagepreview.WebPagePreviewView.A0B(java.lang.String, byte[], int, int, boolean, boolean, boolean, boolean):void");
    }

    public void AIB() {
        this.A0A.setVisibility(0);
        this.A08.setVisibility(8);
        this.A09.setVisibility(0);
        this.A0N.setVisibility(8);
        if (this.A0S.A0E(C16620tM.A02, 2652)) {
            this.A0I.setVisibility(8);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0T;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0T = r0;
        }
        return r0.generatedComponent();
    }

    public ThumbnailButton getImageLargeThumb() {
        return this.A0M;
    }

    public ThumbnailButton getImageThumb() {
        return this.A0N;
    }

    public WaTextView getSnippetView() {
        return this.A0J;
    }

    public int getTitleSnippetUrlLayoutHeight() {
        return this.A0E.getHeight();
    }

    public WaTextView getUrlView() {
        return this.A0L;
    }

    public ImageView getVideoLargeThumb() {
        return this.A0D;
    }

    public FrameLayout getVideoLargeThumbFrame() {
        return this.A0A;
    }

    public void setImageCancelClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setImageContentBackgroundResource(int i2) {
        this.A02.setBackgroundResource(i2);
    }

    public void setImageContentClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setImageContentEnabled(boolean z2) {
        this.A02.setEnabled(z2);
    }

    public void setImageContentMinimumHeight(int i2) {
        this.A02.setMinimumHeight(i2);
    }

    public void setImageLargeLogo(int i2) {
        ImageView imageView = this.A0B;
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.A03.setVisibility(0);
            ImageView imageView2 = this.A0B;
            int i3 = R.drawable.ic_pip_facebook;
            if (i2 != 1) {
                i3 = R.drawable.ic_pip_instagram;
                if (i2 != 2) {
                    i3 = -1;
                }
            }
            imageView2.setImageResource(i3);
            return;
        }
        imageView.setVisibility(8);
        this.A03.setVisibility(8);
    }

    public void setImageLargeThumbFrameHeight(int i2) {
        this.A08.getLayoutParams().height = i2;
    }

    public void setImageLargeThumbWithBackground(int i2) {
        this.A0M.setBackgroundColor(i2);
        this.A0M.setImageDrawable((Drawable) null);
    }

    public void setImageLargeThumbWithBitmap(Bitmap bitmap) {
        this.A0M.setImageBitmap(bitmap);
        this.A0M.setVisibility(0);
    }

    public void setImagePlayFrameVisibility(boolean z2) {
        View view = this.A04;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public void setImageProgressBarVisibility(boolean z2) {
        ProgressBar progressBar = this.A0F;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        progressBar.setVisibility(i2);
    }

    public void setImageThumbVisibility(boolean z2) {
        ThumbnailButton thumbnailButton = this.A0N;
        int i2 = 0;
        int i3 = 8;
        if (z2) {
            i3 = 0;
        }
        thumbnailButton.setVisibility(i3);
        if (this.A0S.A0E(C16620tM.A02, 2652)) {
            WaImageView waImageView = this.A0I;
            if (!z2) {
                i2 = 8;
            }
            waImageView.setVisibility(i2);
        }
    }

    public void setLinkGifSize(int i2) {
        View view = this.A00;
        if (i2 > 0) {
            view.setVisibility(0);
            this.A0H.setVisibility(0);
            this.A0H.setText(AnonymousClass2GQ.A03(this.A0O, (long) i2));
            return;
        }
        view.setVisibility(8);
        this.A0H.setVisibility(8);
    }

    public void setLinkHostname(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A0L.setVisibility(8);
            return;
        }
        this.A0L.setVisibility(0);
        if (str.length() > 150) {
            str = str.substring(0, 150);
        }
        this.A0L.setText(str);
    }

    public void setLinkSnippet(CharSequence charSequence) {
        WaTextView waTextView = this.A0J;
        if (charSequence == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A0J.setText(charSequence);
    }

    public void setLinkTitle(CharSequence charSequence) {
        WaTextView waTextView = this.A0K;
        if (charSequence == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A0K.setText(charSequence);
    }

    public void setLinkTitleTypeface(int i2) {
        this.A0K.setTypeface((Typeface) null, i2);
    }

    public final void setTitleAndSnippet(String str, String str2, boolean z2, List list) {
        if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && !z2) {
            A07(this.A0K, str, list, 150);
            A07(this.A0J, str2, list, 300);
            return;
        }
        this.A0K.setVisibility(8);
        this.A0J.setVisibility(8);
    }

    public void setVideoLargeLogo(int i2) {
        if (i2 == 1 || i2 == 7) {
            this.A0C.setVisibility(8);
            return;
        }
        this.A0C.animate().cancel();
        this.A0C.setVisibility(0);
        this.A0C.setImageResource(C42181xM.A00(i2));
        this.A0C.setAlpha(1.0f);
    }

    public void setVideoLargeThumbFrameHeight(int i2) {
        this.A0A.getLayoutParams().height = i2;
    }

    public void setVideoLargeThumbWithBackground(int i2) {
        this.A0D.setBackgroundColor(i2);
        this.A0D.setImageDrawable((Drawable) null);
    }

    public void setVideoLargeThumbWithBitmap(Bitmap bitmap) {
        this.A0D.setImageBitmap(bitmap);
        this.A0D.setVisibility(0);
    }
}
