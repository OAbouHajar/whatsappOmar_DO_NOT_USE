package com.google.android.exoplayer2.ui;

import X.AnonymousClass3C1;
import X.AnonymousClass3K3;
import X.AnonymousClass3O1;
import X.C108335No;
import X.C108345Np;
import X.C13690nt;
import X.C64133Mw;
import X.C88444aV;
import X.C88794b6;
import X.C90464eB;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout implements C108335No {
    public float A00;
    public float A01;
    public int A02;
    public View A03;
    public C90464eB A04;
    public C108345Np A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = Collections.emptyList();
        this.A04 = C90464eB.A06;
        this.A01 = 0.0533f;
        this.A00 = 0.08f;
        this.A08 = true;
        this.A07 = true;
        C64133Mw r0 = new C64133Mw(context, attributeSet);
        this.A05 = r0;
        this.A03 = r0;
        addView(r0);
        this.A02 = 1;
    }

    private List getCuesWithStylingPreferencesApplied() {
        C88794b6 r6;
        if (this.A08 && this.A07) {
            return this.A06;
        }
        ArrayList A0i = C13690nt.A0i(this.A06.size());
        for (int i2 = 0; i2 < this.A06.size(); i2++) {
            C88444aV r1 = (C88444aV) this.A06.get(i2);
            CharSequence charSequence = r1.A0E;
            if (!this.A08) {
                r6 = new C88794b6(r1);
                r6.A05 = -3.4028235E38f;
                r6.A09 = Integer.MIN_VALUE;
                r6.A0F = false;
                if (charSequence != null) {
                    r6.A0E = charSequence.toString();
                }
            } else {
                if (!this.A07 && charSequence != null) {
                    r6 = new C88794b6(r1);
                    r6.A05 = -3.4028235E38f;
                    r6.A09 = Integer.MIN_VALUE;
                    if (charSequence instanceof Spanned) {
                        SpannableString valueOf = SpannableString.valueOf(charSequence);
                        for (AbsoluteSizeSpan removeSpan : (AbsoluteSizeSpan[]) valueOf.getSpans(0, valueOf.length(), AbsoluteSizeSpan.class)) {
                            valueOf.removeSpan(removeSpan);
                        }
                        for (RelativeSizeSpan removeSpan2 : (RelativeSizeSpan[]) valueOf.getSpans(0, valueOf.length(), RelativeSizeSpan.class)) {
                            valueOf.removeSpan(removeSpan2);
                        }
                        r6.A0E = valueOf;
                    }
                }
                A0i.add(r1);
            }
            r1 = r6.A00();
            A0i.add(r1);
        }
        return A0i;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (AnonymousClass3C1.A01 < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r1 = (android.view.accessibility.CaptioningManager) getContext().getSystemService("captioning");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C90464eB getUserCaptionStyle() {
        /*
            r2 = this;
            int r1 = X.AnonymousClass3C1.A01
            r0 = 19
            if (r1 < r0) goto L_0x0029
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L_0x0029
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "captioning"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.accessibility.CaptioningManager r1 = (android.view.accessibility.CaptioningManager) r1
            if (r1 == 0) goto L_0x0029
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x0029
            android.view.accessibility.CaptioningManager$CaptionStyle r0 = r1.getUserStyle()
            X.4eB r0 = X.C90464eB.A00(r0)
            return r0
        L_0x0029:
            X.4eB r0 = X.C90464eB.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.SubtitleView.getUserCaptionStyle():X.4eB");
    }

    private void setView(View view) {
        removeView(this.A03);
        View view2 = this.A03;
        if (view2 instanceof AnonymousClass3O1) {
            ((AnonymousClass3O1) view2).A04.destroy();
        }
        this.A03 = view;
        this.A05 = (C108345Np) view;
        addView(view);
    }

    public void A00() {
        setStyle(getUserCaptionStyle());
    }

    public void A01() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void A02() {
        this.A05.AhL(this.A04, getCuesWithStylingPreferencesApplied(), this.A01, this.A00, 0);
    }

    public void APH(List list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z2) {
        this.A07 = z2;
        A02();
    }

    public void setApplyEmbeddedStyles(boolean z2) {
        this.A08 = z2;
        A02();
    }

    public void setBottomPaddingFraction(float f2) {
        this.A00 = f2;
        A02();
    }

    public void setCues(List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.A06 = list;
        A02();
    }

    public void setFractionalTextSize(float f2) {
        this.A01 = f2;
        A02();
    }

    public void setStyle(C90464eB r1) {
        this.A04 = r1;
        A02();
    }

    public void setViewType(int i2) {
        if (this.A02 != i2) {
            if (i2 == 1) {
                setView(new C64133Mw(getContext(), (AttributeSet) null));
            } else if (i2 == 2) {
                setView(new AnonymousClass3O1(getContext()));
            } else {
                throw AnonymousClass3K3.A0f();
            }
            this.A02 = i2;
        }
    }
}
