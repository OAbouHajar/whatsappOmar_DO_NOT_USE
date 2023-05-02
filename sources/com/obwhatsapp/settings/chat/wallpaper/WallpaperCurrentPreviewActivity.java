package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass1UP;
import X.AnonymousClass1YG;
import X.AnonymousClass2Ao;
import X.AnonymousClass2SR;
import X.C004601z;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C16150sX;
import X.C16210se;
import X.C17160ud;
import X.C17200uh;
import X.C34331k5;
import X.C434920f;
import X.C49132Rg;
import X.C62063Bm;
import X.C86864Ul;
import X.C94814lW;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape6S0100000_I1_2;

public class WallpaperCurrentPreviewActivity extends C14530pL {
    public View A00;
    public SeekBar A01;
    public C005402i A02;
    public C17160ud A03;
    public C16000sG A04;
    public C16080sP A05;
    public AnonymousClass2Ao A06;
    public C17200uh A07;
    public C16210se A08;
    public C86864Ul A09;
    public WallpaperImagePreview A0A;
    public boolean A0B;

    public WallpaperCurrentPreviewActivity() {
        this(0);
    }

    public WallpaperCurrentPreviewActivity(int i2) {
        this.A0B = false;
        C13680ns.A1G(this, 127);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r0 != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.app.Activity r2, android.content.Intent r3, X.C86864Ul r4) {
        /*
            X.0rv r0 = X.C62063Bm.A03(r3)
            if (r0 == 0) goto L_0x0016
            if (r4 == 0) goto L_0x000f
            boolean r0 = r4.A03
            r1 = 2131893063(0x7f121b47, float:1.9420892E38)
            if (r0 == 0) goto L_0x0012
        L_0x000f:
            r1 = 2131893061(0x7f121b45, float:1.9420888E38)
        L_0x0012:
            r2.setTitle(r1)
            return
        L_0x0016:
            boolean r0 = X.C434920f.A09(r2)
            r1 = 2131893075(0x7f121b53, float:1.9420916E38)
            if (r0 == 0) goto L_0x0012
            r1 = 2131893064(0x7f121b48, float:1.9420894E38)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity.A02(android.app.Activity, android.content.Intent, X.4Ul):void");
    }

    public static void A03(View view, float f2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (((float) layoutParams.width) * f2);
        layoutParams.height = (int) (((float) layoutParams.height) * f2);
        view.setLayoutParams(layoutParams);
    }

    public void A1q() {
        if (!this.A0B) {
            this.A0B = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A07 = C16150sX.A0R(r1);
            this.A03 = C16150sX.A0L(r1);
            this.A04 = C16150sX.A0M(r1);
            this.A05 = C16150sX.A0Q(r1);
            this.A08 = (C16210se) r1.AQr.get();
        }
    }

    public final void A35(C15830rv r3) {
        Integer num;
        this.A09 = this.A08.A06(this, r3);
        A02(this, getIntent(), this.A09);
        Drawable A032 = this.A08.A03(this.A09);
        if (A032 != null) {
            this.A0A.setImageDrawable(A032);
        }
        if (this.A01.getVisibility() == 0) {
            C86864Ul r0 = this.A09;
            int i2 = 0;
            if (!(r0 == null || (num = r0.A01) == null)) {
                i2 = num.intValue();
            }
            this.A01.setProgress(i2);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 199 && i3 == -1) {
            A35(C62063Bm.A03(getIntent()));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout005d);
        Aem((Toolbar) AnonymousClass00T.A05(this, R.id.wallpaper_preview_toolbar));
        C005402i A0N = C13690nt.A0N(this);
        this.A02 = A0N;
        A0N.A0N(true);
        A02(this, getIntent(), this.A09);
        C34331k5.A02(AnonymousClass00T.A05(this, R.id.change_current_wallpaper), this, 0);
        this.A00 = AnonymousClass00T.A05(this, R.id.wallpaper_dimmer_container);
        AnonymousClass1UP.A06(C13700nu.A09(this, R.id.wallpaper_dimmer_title));
        this.A01 = (SeekBar) AnonymousClass00T.A05(this, R.id.wallpaper_dimmer_seekbar);
        Point A002 = C16210se.A00(this);
        View A052 = AnonymousClass00T.A05(this, R.id.wallpaper_dimmer_container);
        A052.measure(View.MeasureSpec.makeMeasureSpec(A002.x, 1073741824), View.MeasureSpec.makeMeasureSpec(A002.y, 0));
        View A053 = AnonymousClass00T.A05(this, R.id.change_current_wallpaper);
        A053.measure(View.MeasureSpec.makeMeasureSpec(A002.x, 1073741824), View.MeasureSpec.makeMeasureSpec(A002.y, 0));
        TextView A092 = C13700nu.A09(this, R.id.wallpaper_current_preview_theme_description);
        boolean A093 = C434920f.A09(this);
        int i2 = R.string.str1b59;
        if (A093) {
            i2 = R.string.str1b5b;
        }
        A092.setText(i2);
        int[] iArr = {16843499};
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new TypedValue().data, iArr);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        float min = Math.min(0.56f, ((float) (((A002.y - A052.getMeasuredHeight()) - A053.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.dimen0851))) / ((float) (A002.y + dimensionPixelSize)));
        Point A003 = C16210se.A00(this);
        int i3 = (int) (((float) A003.x) * min);
        int i4 = (int) (((float) A003.y) * min);
        ViewGroup.LayoutParams layoutParams = AnonymousClass00T.A05(this, R.id.wallpaper_preview_toolbar_container).getLayoutParams();
        int i5 = (int) (((float) layoutParams.height) * min);
        View A054 = AnonymousClass00T.A05(this, R.id.wallpaper_preview_toolbar_container);
        ViewGroup.LayoutParams layoutParams2 = A054.getLayoutParams();
        layoutParams2.height = i5;
        layoutParams2.width = i3;
        A054.setLayoutParams(layoutParams2);
        View A055 = AnonymousClass00T.A05(this, R.id.current_wallpaper_preview_view_container);
        ViewGroup.LayoutParams layoutParams3 = A055.getLayoutParams();
        layoutParams3.height = i4;
        layoutParams3.width = i3;
        A055.setLayoutParams(layoutParams3);
        int i6 = i4 + layoutParams.height;
        View A056 = AnonymousClass00T.A05(this, R.id.wallpaper_preview_outline_container);
        ViewGroup.LayoutParams layoutParams4 = A056.getLayoutParams();
        layoutParams4.height = i6;
        layoutParams4.width = i3;
        A056.setLayoutParams(layoutParams4);
        View A057 = AnonymousClass00T.A05(this, R.id.change_current_wallpaper);
        ViewGroup.LayoutParams layoutParams5 = A057.getLayoutParams();
        layoutParams5.width = i3;
        A057.setLayoutParams(layoutParams5);
        ViewOnClickCListenerShape6S0100000_I1_2 viewOnClickCListenerShape6S0100000_I1_2 = new ViewOnClickCListenerShape6S0100000_I1_2(this, 1);
        A057.setOnClickListener(viewOnClickCListenerShape6S0100000_I1_2);
        AnonymousClass00T.A05(this, R.id.current_wallpaper_preview_view_container).setOnClickListener(viewOnClickCListenerShape6S0100000_I1_2);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass00T.A05(this, R.id.text_entry_layout);
        viewGroup.setFocusable(false);
        viewGroup.setDescendantFocusability(393216);
        C15830rv A032 = C62063Bm.A03(getIntent());
        this.A0A = (WallpaperImagePreview) AnonymousClass00T.A05(this, R.id.current_wallpaper_preview_view);
        if (A032 != null) {
            A092.setVisibility(4);
        } else {
            A092.setVisibility(0);
        }
        A35(A032);
        ImageView imageView = (ImageView) AnonymousClass00T.A05(this, R.id.conversation_contact_photo);
        A03(imageView, min);
        A03(AnonymousClass00T.A05(this, R.id.send_container), min);
        A03(AnonymousClass00T.A05(this, R.id.voice_note_btn), min);
        A03(AnonymousClass00T.A05(this, R.id.emoji_picker_btn), min);
        A03(AnonymousClass00T.A05(this, R.id.input_attach_button), min);
        A03(AnonymousClass00T.A05(this, R.id.camera_btn), min);
        View A058 = AnonymousClass00T.A05(this, R.id.input_layout_content);
        ViewGroup.LayoutParams layoutParams6 = A058.getLayoutParams();
        layoutParams6.height = (int) (((float) layoutParams6.height) * min);
        A058.setLayoutParams(layoutParams6);
        WallpaperMockChatView wallpaperMockChatView = (WallpaperMockChatView) AnonymousClass00T.A05(this, R.id.wallpaper_preview_default_chat_view);
        wallpaperMockChatView.setMessages(getString(R.string.str0c18), getString(R.string.str0c19), (AnonymousClass1YG) null);
        wallpaperMockChatView.A00.setVisibility(4);
        wallpaperMockChatView.A03.setVisibility(4);
        wallpaperMockChatView.A03.setMinLines(1);
        wallpaperMockChatView.A03.setMaxLines(1);
        wallpaperMockChatView.A02.setMinEms(5);
        C13700nu.A0T(wallpaperMockChatView.A02);
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(wallpaperMockChatView.A02);
        A0O.bottomMargin = wallpaperMockChatView.A03.getPaddingBottom() + wallpaperMockChatView.A04.getPaddingTop();
        wallpaperMockChatView.A02.setLayoutParams(A0O);
        wallpaperMockChatView.A01.setVisibility(4);
        wallpaperMockChatView.A04.setVisibility(4);
        wallpaperMockChatView.A04.setMinLines(1);
        wallpaperMockChatView.A04.setMaxLines(1);
        TextView textView = wallpaperMockChatView.A03;
        textView.setTextSize(0, (float) ((int) (textView.getTextSize() * min)));
        TextView textView2 = wallpaperMockChatView.A02;
        textView2.setTextSize(0, (float) ((int) (textView2.getTextSize() * min)));
        TextView textView3 = wallpaperMockChatView.A04;
        textView3.setTextSize(0, (float) ((int) (textView3.getTextSize() * min)));
        TextView A094 = C13700nu.A09(this, R.id.conversation_contact_name);
        A094.setTextSize(0, (float) ((int) (A094.getTextSize() * min)));
        if (A032 == null) {
            A094.setText(R.string.str1b50);
            this.A03.A05(imageView, R.drawable.avatar_contact);
        } else {
            C16010sH A0A2 = this.A04.A0A(A032);
            AnonymousClass2Ao A059 = this.A07.A05("wallpaper-current-preview-contact-photo", -1.0f, (int) (((float) imageView.getResources().getDimensionPixelSize(R.dimen.dimen074a)) * min));
            this.A06 = A059;
            A059.A06(imageView, A0A2);
            A094.setText(this.A05.A08(A0A2));
        }
        boolean A095 = C434920f.A09(this);
        View view = this.A00;
        if (!A095) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            Drawable[] drawableArr = new Drawable[2];
            C13690nt.A1L(C13690nt.A0C(this, R.drawable.wallpaper_dimmer_seekbar_button_background), AnonymousClass2SR.A02(this, R.drawable.ic_dim, R.color.color0826), drawableArr);
            this.A01.setThumb(new LayerDrawable(drawableArr));
            this.A01.setOnSeekBarChangeListener(new C94814lW(this));
        }
        C004601z.A0d(AnonymousClass00T.A05(this, R.id.conversation_contact_name), 2);
        C004601z.A0d(AnonymousClass00T.A05(this, R.id.emoji_picker_btn), 2);
        C004601z.A0d(AnonymousClass00T.A05(this, R.id.entry), 2);
        C004601z.A0d(AnonymousClass00T.A05(this, R.id.input_attach_button), 2);
        C004601z.A0d(AnonymousClass00T.A05(this, R.id.camera_btn), 2);
        C004601z.A0d(AnonymousClass00T.A05(this, R.id.voice_note_btn), 2);
        C004601z.A0d(((WallpaperMockChatView) AnonymousClass00T.A05(this, R.id.wallpaper_preview_default_chat_view)).A07, 2);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass2Ao r0 = this.A06;
        if (r0 != null) {
            r0.A00();
        }
    }
}
