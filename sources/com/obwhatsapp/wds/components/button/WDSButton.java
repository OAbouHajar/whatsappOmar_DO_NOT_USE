package com.obwhatsapp.wds.components.button;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass090;
import X.AnonymousClass2VM;
import X.AnonymousClass2Xe;
import X.AnonymousClass419;
import X.AnonymousClass4P6;
import X.AnonymousClass4W7;
import X.C14710pd;
import X.C15220qW;
import X.C15450qv;
import X.C18450wi;
import X.C54392hN;
import X.C797741f;
import X.C797841g;
import X.C799141v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

public class WDSButton extends AnonymousClass2VM {
    public PorterDuffColorFilter A00;
    public Drawable A01;
    public AnonymousClass013 A02;
    public C14710pd A03;
    public C797741f A04;
    public AnonymousClass4P6 A05;
    public AnonymousClass419 A06;
    public C799141v A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final RectF A0F;
    public final RectF A0G;
    public final C15220qW A0H;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSButton(Context context) {
        this(context, (AttributeSet) null, false);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        if (r0 == false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WDSButton(android.content.Context r10, android.util.AttributeSet r11, boolean r12) {
        /*
            r9 = this;
            r7 = 1
            X.C18450wi.A0H(r10, r7)
            r9.<init>(r10, r11)
            r9.A0D = r12
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.A0G = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.A0F = r0
            r9.A09 = r7
            java.lang.String r0 = ""
            r9.A08 = r0
            X.4P6 r0 = new X.4P6
            r0.<init>()
            r9.A05 = r0
            r8 = 4
            kotlin.jvm.internal.IDxLambdaShape55S0000000_2_I0 r1 = new kotlin.jvm.internal.IDxLambdaShape55S0000000_2_I0
            r1.<init>(r8)
            X.1DV r0 = new X.1DV
            r0.<init>(r1)
            r9.A0H = r0
            X.41f r6 = X.C797741f.NORMAL
            r9.A04 = r6
            X.419 r5 = X.AnonymousClass419.NORMAL
            r9.A06 = r5
            X.41v r4 = X.C799141v.FILLED
            r9.A07 = r4
            r3 = 0
            if (r11 == 0) goto L_0x0063
            int[] r0 = X.AnonymousClass4B2.A00
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r0, r3, r3)
            X.C18450wi.A0B(r2)
            r0 = 9
            boolean r0 = r2.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0053
            r9.A0D = r7
        L_0x0053:
            boolean r1 = r9.A0D
            r0 = 0
            if (r1 != 0) goto L_0x005e
            r0 = 10
            boolean r0 = r2.getBoolean(r0, r3)
        L_0x005e:
            r2.recycle()
            if (r0 != 0) goto L_0x0150
        L_0x0063:
            boolean r0 = r9.A0D
            if (r0 != 0) goto L_0x0075
            X.0pd r2 = r9.A03
            if (r2 == 0) goto L_0x0150
            r1 = 1963(0x7ab, float:2.751E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0150
        L_0x0075:
            r0 = 1
        L_0x0076:
            r9.A0E = r0
            if (r0 == 0) goto L_0x013f
            r9.A0B = r7
            X.013 r0 = r9.A02
            if (r0 != 0) goto L_0x014a
            r0 = 0
        L_0x0081:
            r9.A0C = r0
            if (r11 == 0) goto L_0x0139
            int[] r0 = X.AnonymousClass4B2.A00
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r0, r3, r3)
            X.C18450wi.A0B(r1)
            r0 = 5
            r7 = -1
            int r0 = r1.getResourceId(r0, r7)
            if (r0 == r7) goto L_0x009d
            java.lang.String r0 = r10.getString(r0)
            r9.setContentDescription(r0)
        L_0x009d:
            r0 = 3
            int r0 = r1.getResourceId(r0, r7)
            if (r0 == r7) goto L_0x00ab
            java.lang.String r0 = r10.getString(r0)
            r9.setHint(r0)
        L_0x00ab:
            int r0 = r1.getResourceId(r8, r7)
            if (r0 == r7) goto L_0x00bc
            java.lang.String r2 = r10.getString(r0)
            int r0 = r9.getImeActionId()
            r9.setImeActionLabel(r2, r0)
        L_0x00bc:
            r0 = 2
            int r0 = r1.getResourceId(r0, r7)
            if (r0 == r7) goto L_0x00ca
            java.lang.String r0 = r10.getString(r0)
            r9.setText(r0)
        L_0x00ca:
            r0 = 8
            boolean r0 = r1.getBoolean(r0, r3)
            r9.A0A = r0
            r0 = 6
            int r8 = r1.getInt(r0, r7)
            X.41f[] r2 = X.C797741f.values()
            if (r8 < 0) goto L_0x00e7
            X.C18450wi.A0H(r2, r3)
            int r0 = r2.length
            int r0 = r0 + -1
            if (r8 > r0) goto L_0x00e7
            r6 = r2[r8]
        L_0x00e7:
            r9.setAction(r6)
            r0 = 12
            int r6 = r1.getInt(r0, r7)
            X.419[] r2 = X.AnonymousClass419.values()
            if (r6 < 0) goto L_0x0100
            X.C18450wi.A0H(r2, r3)
            int r0 = r2.length
            int r0 = r0 + -1
            if (r6 > r0) goto L_0x0100
            r5 = r2[r6]
        L_0x0100:
            r9.setSize(r5)
            r0 = 11
            int r5 = r1.getInt(r0, r7)
            X.41v[] r2 = X.C799141v.values()
            if (r5 < 0) goto L_0x0119
            X.C18450wi.A0H(r2, r3)
            int r0 = r2.length
            int r0 = r0 + -1
            if (r5 > r0) goto L_0x0119
            r4 = r2[r5]
        L_0x0119:
            r9.setVariant(r4)
            android.graphics.drawable.Drawable[] r0 = super.getCompoundDrawables()
            X.C18450wi.A0B(r0)
            int r0 = r0.length
            if (r0 == 0) goto L_0x0140
            android.graphics.drawable.Drawable[] r0 = super.getCompoundDrawables()
            r0 = r0[r3]
            if (r0 == 0) goto L_0x0140
            android.graphics.drawable.Drawable[] r0 = super.getCompoundDrawables()
            r0 = r0[r3]
        L_0x0134:
            r9.A01 = r0
        L_0x0136:
            r1.recycle()
        L_0x0139:
            r9.A02()
            r9.A03()
        L_0x013f:
            return
        L_0x0140:
            android.graphics.drawable.Drawable r0 = r9.A01
            if (r0 != 0) goto L_0x0136
            r0 = 7
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            goto L_0x0134
        L_0x014a:
            boolean r0 = r0.A0T()
            goto L_0x0081
        L_0x0150:
            r0 = 0
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wds.components.button.WDSButton.<init>(android.content.Context, android.util.AttributeSet, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSButton(Context context, AttributeSet attributeSet, boolean z2, int i2, C54392hN r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? false : z2);
    }

    public static final ColorStateList A00(Context context, AnonymousClass4W7 r8) {
        C18450wi.A0H(r8, 0);
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842919}, new int[0]}, new int[]{AnonymousClass00T.A00(context, r8.A00), AnonymousClass00T.A00(context, r8.A02), AnonymousClass00T.A00(context, r8.A01)});
    }

    private final Paint getButtonStrokePaint() {
        return (Paint) this.A0H.getValue();
    }

    private final String getEllipsizedText() {
        if (!this.A09) {
            return this.A08;
        }
        this.A09 = false;
        return TextUtils.ellipsize(getText(), getPaint(), Math.min((float) ((getWidth() - getFixedSpace()) - this.A05.A02), getPaint().measureText(getText().toString())), TextUtils.TruncateAt.END).toString();
    }

    private final int getFixedSpace() {
        AnonymousClass4P6 r2 = this.A05;
        return (r2.A03 << 1) + r2.A07 + r2.A06 + r2.A08;
    }

    private final void setupIcon(Drawable drawable) {
        this.A01 = drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r4.A07 != X.C799141v.A03) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupStrokeStyle(android.content.res.ColorStateList r5) {
        /*
            r4 = this;
            android.graphics.Paint r2 = r4.getButtonStrokePaint()
            int[] r1 = r4.getDrawableState()
            r0 = 0
            int r0 = r5.getColorForState(r1, r0)
            r2.setColor(r0)
            X.41f r1 = r4.A04
            X.41f r0 = X.C797741f.MEDIA
            if (r1 != r0) goto L_0x001d
            X.41v r2 = r4.A07
            X.41v r1 = X.C799141v.OUTLINE
            r0 = 1
            if (r2 == r1) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            android.graphics.Paint r3 = r4.getButtonStrokePaint()
            if (r0 == 0) goto L_0x0036
            r2 = 1073741824(0x40000000, float:2.0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131101846(0x7f060896, float:1.7816113E38)
            int r1 = X.AnonymousClass00T.A00(r1, r0)
            r0 = 0
            r3.setShadowLayer(r2, r0, r0, r1)
            return
        L_0x0036:
            r3.clearShadowLayer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wds.components.button.WDSButton.setupStrokeStyle(android.content.res.ColorStateList):void");
    }

    public final Drawable A01(int i2, boolean z2) {
        int i3;
        int i4;
        if (z2) {
            i3 = 0;
            i4 = 0;
        } else {
            AnonymousClass4P6 r0 = this.A05;
            i3 = r0.A03;
            i4 = r0.A04;
        }
        float[] fArr = new float[8];
        int i5 = 0;
        do {
            fArr[i5] = this.A05.A00;
            i5++;
        } while (i5 < 8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(i2);
        if (C15450qv.A02()) {
            return new InsetDrawable(shapeDrawable, i3, i4, i3, i4);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, i3, i4, i3, i4);
        return layerDrawable;
    }

    public final void A02() {
        C797841g r7;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (this.A0B && this.A0E) {
            boolean z2 = false;
            if (this.A01 == null) {
                z2 = true;
            }
            CharSequence text = getText();
            if (text == null || text.length() == 0) {
                if (!z2) {
                    r7 = C797841g.ICON;
                }
                r7 = C797841g.TEXT;
            } else {
                if (!z2) {
                    r7 = C797841g.ICON_TEXT;
                }
                r7 = C797841g.TEXT;
            }
            AnonymousClass4P6 r3 = this.A05;
            Resources resources = getResources();
            C18450wi.A0B(resources);
            AnonymousClass419 r6 = this.A06;
            C799141v r1 = this.A07;
            C18450wi.A0H(r6, 1);
            C18450wi.A0H(r1, 2);
            C18450wi.A0H(r7, 3);
            r3.A0B = r6;
            r3.A0C = r1;
            r3.A0A = r7;
            switch (r6.ordinal()) {
                case 0:
                    i2 = R.dimen.dimen086b;
                    break;
                case 1:
                    i2 = R.dimen.dimen087d;
                    break;
                default:
                    throw new AnonymousClass2Xe();
            }
            r3.A01 = resources.getDimensionPixelSize(i2);
            switch (r3.A0B.ordinal()) {
                case 0:
                    i3 = R.dimen.dimen0873;
                    break;
                case 1:
                    i3 = R.dimen.dimen0885;
                    break;
                default:
                    throw new AnonymousClass2Xe();
            }
            r3.A05 = resources.getDimensionPixelSize(i3);
            switch (r7.ordinal()) {
                case 0:
                    switch (r3.A0B.ordinal()) {
                        case 0:
                            i11 = R.dimen.dimen086f;
                            break;
                        case 1:
                            i11 = R.dimen.dimen0881;
                            break;
                        default:
                            throw new AnonymousClass2Xe();
                    }
                case 1:
                    i4 = 0;
                    break;
                default:
                    switch (r3.A0B.ordinal()) {
                        case 0:
                            i11 = R.dimen.dimen0870;
                            break;
                        case 1:
                            i11 = R.dimen.dimen0882;
                            break;
                        default:
                            throw new AnonymousClass2Xe();
                    }
            }
            i4 = resources.getDimensionPixelSize(i11);
            r3.A02 = i4;
            switch (r3.A0B.ordinal()) {
                case 0:
                    i5 = R.dimen.dimen088a;
                    break;
                case 1:
                    i5 = R.dimen.dimen0889;
                    break;
                default:
                    throw new AnonymousClass2Xe();
            }
            r3.A09 = resources.getDimensionPixelSize(i5);
            switch (r3.A0B.ordinal()) {
                case 0:
                    int ordinal = r3.A0C.ordinal();
                    int ordinal2 = r3.A0A.ordinal();
                    if (ordinal != 3) {
                        if (ordinal2 != 0) {
                            i6 = R.dimen.dimen0875;
                            break;
                        }
                    } else {
                        switch (ordinal2) {
                            case 0:
                                break;
                            case 1:
                                i6 = R.dimen.dimen0869;
                                break;
                            default:
                                i6 = R.dimen.dimen0866;
                                break;
                        }
                    }
                    i6 = R.dimen.dimen086d;
                    break;
                case 1:
                    int ordinal3 = r3.A0C.ordinal();
                    int ordinal4 = r3.A0A.ordinal();
                    if (ordinal3 != 3) {
                        if (ordinal4 != 0) {
                            i6 = R.dimen.dimen0887;
                            break;
                        }
                    } else {
                        switch (ordinal4) {
                            case 0:
                                break;
                            case 1:
                                i6 = R.dimen.dimen087b;
                                break;
                            default:
                                i6 = R.dimen.dimen0878;
                                break;
                        }
                    }
                    i6 = R.dimen.dimen087f;
                    break;
                default:
                    throw new AnonymousClass2Xe();
            }
            r3.A07 = resources.getDimensionPixelSize(i6);
            switch (r3.A0B.ordinal()) {
                case 0:
                    int ordinal5 = r3.A0C.ordinal();
                    int ordinal6 = r3.A0A.ordinal();
                    if (ordinal5 != 3) {
                        if (ordinal6 != 0) {
                            i7 = R.dimen.dimen0876;
                            break;
                        }
                    } else {
                        switch (ordinal6) {
                            case 0:
                                break;
                            case 1:
                                i7 = R.dimen.dimen086a;
                                break;
                            default:
                                i7 = R.dimen.dimen0867;
                                break;
                        }
                    }
                    i7 = R.dimen.dimen086e;
                    break;
                case 1:
                    int ordinal7 = r3.A0C.ordinal();
                    int ordinal8 = r3.A0A.ordinal();
                    if (ordinal7 != 3) {
                        if (ordinal8 != 0) {
                            i7 = R.dimen.dimen0888;
                            break;
                        }
                    } else {
                        switch (ordinal8) {
                            case 0:
                                break;
                            case 1:
                                i7 = R.dimen.dimen087c;
                                break;
                            default:
                                i7 = R.dimen.dimen0879;
                                break;
                        }
                    }
                    i7 = R.dimen.dimen0880;
                    break;
                default:
                    throw new AnonymousClass2Xe();
            }
            r3.A08 = resources.getDimensionPixelSize(i7);
            switch (r3.A0B.ordinal()) {
                case 0:
                    i8 = R.dimen.dimen0872;
                    break;
                case 1:
                    i8 = R.dimen.dimen0884;
                    break;
                default:
                    throw new AnonymousClass2Xe();
            }
            r3.A04 = resources.getDimensionPixelSize(i8);
            switch (r3.A0B.ordinal()) {
                case 0:
                    int ordinal9 = r3.A0C.ordinal();
                    int ordinal10 = r3.A0A.ordinal();
                    if (ordinal9 != 3) {
                        if (ordinal10 != 0) {
                            i9 = R.dimen.dimen0874;
                            break;
                        }
                    } else {
                        switch (ordinal10) {
                            case 0:
                                break;
                            case 1:
                                i9 = R.dimen.dimen0868;
                                break;
                            default:
                                i9 = R.dimen.dimen0865;
                                break;
                        }
                    }
                    i9 = R.dimen.dimen086c;
                    break;
                case 1:
                    int ordinal11 = r3.A0C.ordinal();
                    int ordinal12 = r3.A0A.ordinal();
                    if (ordinal11 != 3) {
                        if (ordinal12 != 0) {
                            i9 = R.dimen.dimen0886;
                            break;
                        }
                    } else {
                        switch (ordinal12) {
                            case 0:
                                break;
                            case 1:
                                i9 = R.dimen.dimen087a;
                                break;
                            default:
                                i9 = R.dimen.dimen0877;
                                break;
                        }
                    }
                    i9 = R.dimen.dimen087e;
                    break;
                default:
                    throw new AnonymousClass2Xe();
            }
            r3.A06 = resources.getDimensionPixelSize(i9);
            switch (r3.A0B.ordinal()) {
                case 0:
                    i10 = R.dimen.dimen0871;
                    break;
                case 1:
                    i10 = R.dimen.dimen0883;
                    break;
                default:
                    throw new AnonymousClass2Xe();
            }
            r3.A03 = resources.getDimensionPixelSize(i10);
            r3.A00 = (((float) r3.A01) / 2.0f) - ((float) r3.A04);
            getButtonStrokePaint().setStrokeWidth((float) r3.A09);
            this.A09 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cb, code lost:
        r5 = new X.AnonymousClass4W7(r1, r0, r1);
        r2 = new X.AnonymousClass4W7(com.obwhatsapp.R.color.color0866, com.obwhatsapp.R.color.color0866, com.obwhatsapp.R.color.color086a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0150, code lost:
        r1 = com.obwhatsapp.R.color.color0856;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0183, code lost:
        r1 = com.obwhatsapp.R.color.color0858;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0186, code lost:
        r5 = new X.AnonymousClass4W7(r4, r1, com.obwhatsapp.R.color.color0848);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a0, code lost:
        r5 = new X.AnonymousClass4W7(r1, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a5, code lost:
        r0 = getContext();
        X.C18450wi.A0B(r0);
        setupContentStyle(A00(r0, r3));
        r0 = getContext();
        X.C18450wi.A0B(r0);
        setupBackgroundStyle(A00(r0, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c1, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c3, code lost:
        r0 = getContext();
        X.C18450wi.A0B(r0);
        setupStrokeStyle(A00(r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r6 = this;
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x01d1
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x01d1
            boolean r0 = X.C15450qv.A03()
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r6.setStateListAnimator(r0)
        L_0x0012:
            X.41v r0 = r6.A07
            X.41f r5 = r6.A04
            r2 = 0
            r4 = 1
            X.C18450wi.A0H(r0, r4)
            r3 = 2
            X.C18450wi.A0H(r5, r3)
            int[] r1 = X.AnonymousClass4A1.A00
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r4) goto L_0x0055
            if (r1 == r3) goto L_0x004d
            r0 = 3
            if (r1 == r0) goto L_0x0045
            r0 = 4
            if (r1 != r0) goto L_0x0038
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0083;
                case 2: goto L_0x018f;
                case 3: goto L_0x005d;
                default: goto L_0x0038;
            }
        L_0x0038:
            java.lang.String r0 = "content"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0045:
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x00ba;
                case 2: goto L_0x00dd;
                case 3: goto L_0x0096;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0038
        L_0x004d:
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x010f;
                case 1: goto L_0x0121;
                case 2: goto L_0x0175;
                case 3: goto L_0x00fd;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0038
        L_0x0055:
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x0142;
                case 1: goto L_0x0154;
                case 2: goto L_0x0166;
                case 3: goto L_0x0133;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x0038
        L_0x005d:
            r1 = 2131100192(0x7f060220, float:1.7812759E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r1 = 2131101769(0x7f060849, float:1.7815957E38)
            r0 = 2131100194(0x7f060222, float:1.7812763E38)
            goto L_0x01a0
        L_0x0070:
            r1 = 2131101771(0x7f06084b, float:1.7815961E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r1 = 2131101769(0x7f060849, float:1.7815957E38)
            r0 = 2131101770(0x7f06084a, float:1.781596E38)
            goto L_0x01a0
        L_0x0083:
            r1 = 2131101773(0x7f06084d, float:1.7815965E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r1 = 2131101769(0x7f060849, float:1.7815957E38)
            r0 = 2131101772(0x7f06084c, float:1.7815963E38)
            goto L_0x01a0
        L_0x0096:
            r1 = 2131100192(0x7f060220, float:1.7812759E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r1 = 2131101795(0x7f060863, float:1.781601E38)
            r0 = 2131100194(0x7f060222, float:1.7812763E38)
            goto L_0x00cb
        L_0x00a8:
            r1 = 2131101797(0x7f060865, float:1.7816014E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r1 = 2131101795(0x7f060863, float:1.781601E38)
            r0 = 2131101796(0x7f060864, float:1.7816012E38)
            goto L_0x00cb
        L_0x00ba:
            r1 = 2131101777(0x7f060851, float:1.7815973E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r1 = 2131101795(0x7f060863, float:1.781601E38)
            r0 = 2131101776(0x7f060850, float:1.7815971E38)
        L_0x00cb:
            X.4W7 r5 = new X.4W7
            r5.<init>(r1, r0, r1)
            r1 = 2131101798(0x7f060866, float:1.7816016E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r2 = new X.4W7
            r2.<init>(r1, r1, r0)
            goto L_0x01a5
        L_0x00dd:
            r0 = 2131101791(0x7f06085f, float:1.7816002E38)
            r4 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r0, r0, r4)
            r1 = 2131101790(0x7f06085e, float:1.7816E38)
            r0 = 2131101784(0x7f060858, float:1.7815987E38)
            X.4W7 r5 = new X.4W7
            r5.<init>(r1, r0, r1)
            r0 = 2131101792(0x7f060860, float:1.7816004E38)
            X.4W7 r2 = new X.4W7
            r2.<init>(r0, r0, r4)
            goto L_0x01a5
        L_0x00fd:
            r1 = 2131100192(0x7f060220, float:1.7812759E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r4 = 2131100193(0x7f060221, float:1.781276E38)
            r1 = 2131100194(0x7f060222, float:1.7812763E38)
            goto L_0x0186
        L_0x010f:
            r1 = 2131101801(0x7f060869, float:1.7816022E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r4 = 2131101799(0x7f060867, float:1.7816018E38)
            r1 = 2131101800(0x7f060868, float:1.781602E38)
            goto L_0x0186
        L_0x0121:
            r1 = 2131101780(0x7f060854, float:1.781598E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r4 = 2131101778(0x7f060852, float:1.7815975E38)
            r1 = 2131101779(0x7f060853, float:1.7815977E38)
            goto L_0x0186
        L_0x0133:
            r1 = 2131101783(0x7f060857, float:1.7815985E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r4 = 2131100192(0x7f060220, float:1.7812759E38)
            goto L_0x0150
        L_0x0142:
            r1 = 2131101783(0x7f060857, float:1.7815985E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r4 = 2131101781(0x7f060855, float:1.7815981E38)
        L_0x0150:
            r1 = 2131101782(0x7f060856, float:1.7815983E38)
            goto L_0x0186
        L_0x0154:
            r1 = 2131101783(0x7f060857, float:1.7815985E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r4 = 2131101774(0x7f06084e, float:1.7815967E38)
            r1 = 2131101775(0x7f06084f, float:1.781597E38)
            goto L_0x0186
        L_0x0166:
            r1 = 2131101789(0x7f06085d, float:1.7815998E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r4 = 2131101788(0x7f06085c, float:1.7815996E38)
            goto L_0x0183
        L_0x0175:
            r1 = 2131101794(0x7f060862, float:1.7816008E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r4 = 2131101793(0x7f060861, float:1.7816006E38)
        L_0x0183:
            r1 = 2131101784(0x7f060858, float:1.7815987E38)
        L_0x0186:
            r0 = 2131101768(0x7f060848, float:1.7815955E38)
            X.4W7 r5 = new X.4W7
            r5.<init>(r4, r1, r0)
            goto L_0x01a5
        L_0x018f:
            r1 = 2131101787(0x7f06085b, float:1.7815994E38)
            r0 = 2131101802(0x7f06086a, float:1.7816024E38)
            X.4W7 r3 = new X.4W7
            r3.<init>(r1, r1, r0)
            r1 = 2131101785(0x7f060859, float:1.781599E38)
            r0 = 2131101786(0x7f06085a, float:1.7815992E38)
        L_0x01a0:
            X.4W7 r5 = new X.4W7
            r5.<init>(r1, r0, r1)
        L_0x01a5:
            android.content.Context r0 = r6.getContext()
            X.C18450wi.A0B(r0)
            android.content.res.ColorStateList r0 = A00(r0, r3)
            r6.setupContentStyle(r0)
            android.content.Context r0 = r6.getContext()
            X.C18450wi.A0B(r0)
            android.content.res.ColorStateList r0 = A00(r0, r5)
            r6.setupBackgroundStyle(r0)
            if (r2 == 0) goto L_0x01d1
            android.content.Context r0 = r6.getContext()
            X.C18450wi.A0B(r0)
            android.content.res.ColorStateList r0 = A00(r0, r2)
            r6.setupStrokeStyle(r0)
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wds.components.button.WDSButton.A03():void");
    }

    public final C14710pd getAbProps() {
        return this.A03;
    }

    public final C797741f getAction() {
        return this.A04;
    }

    public Drawable[] getCompoundDrawables() {
        if (!this.A0E) {
            Drawable[] compoundDrawables = super.getCompoundDrawables();
            C18450wi.A0B(compoundDrawables);
            return compoundDrawables;
        }
        return new Drawable[]{this.A01, null, null, null};
    }

    public final Drawable getIcon() {
        return this.A01;
    }

    public final boolean getOverrideButtonMigration() {
        return this.A0D;
    }

    public final AnonymousClass419 getSize() {
        return this.A06;
    }

    public final boolean getUseWDSButtonStyling() {
        return this.A0E;
    }

    public final C799141v getVariant() {
        return this.A07;
    }

    public final AnonymousClass013 getWhatsAppLocale() {
        return this.A02;
    }

    public void onDraw(Canvas canvas) {
        int width;
        C18450wi.A0H(canvas, 0);
        if (!this.A0E) {
            super.onDraw(canvas);
            return;
        }
        this.A08 = getEllipsizedText();
        float measureText = getPaint().measureText(this.A08);
        if (this.A01 == null) {
            width = 0;
        } else {
            AnonymousClass4P6 r3 = this.A05;
            width = r3.A03 + r3.A07 + ((((getWidth() - getFixedSpace()) - r3.A02) - ((int) measureText)) >> 1);
            if (this.A0C) {
                width = (getWidth() - width) - r3.A02;
            }
        }
        int height = getHeight();
        AnonymousClass4P6 r5 = this.A05;
        int i2 = r5.A02;
        int i3 = (height - i2) >> 1;
        canvas.drawText(this.A08, this.A01 == null ? (((float) getWidth()) - measureText) / 2.0f : this.A0C ? ((float) (width - r5.A06)) - measureText : ((float) (width + i2)) + ((float) r5.A06), ((((float) getHeight()) - getPaint().descent()) - getPaint().ascent()) / 2.0f, getPaint());
        Drawable drawable = this.A01;
        if (drawable != null) {
            if (!this.A0A || this.A04 != C797741f.MEDIA) {
                PorterDuffColorFilter porterDuffColorFilter = this.A00;
                if (porterDuffColorFilter == null) {
                    C18450wi.A0O("colorFilter");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            int i4 = r5.A02;
            drawable.setBounds(width, i3, i4 + width, i4 + i3);
            drawable.draw(canvas);
            drawable.clearColorFilter();
        }
        if (this.A07 == C799141v.OUTLINE) {
            RectF rectF = this.A0F;
            rectF.set(getBackground().getBounds());
            float f2 = ((float) r5.A09) / 2.0f;
            float f3 = (float) r5.A04;
            float height2 = (((float) getHeight()) / 2.0f) - f3;
            RectF rectF2 = this.A0G;
            float f4 = (float) r5.A03;
            rectF2.set(rectF.left + f2 + f4, rectF.top + f2 + f3, (rectF.right - f2) - f4, (rectF.bottom - f2) - f3);
            canvas.drawRoundRect(rectF2, height2, height2, getButtonStrokePaint());
        }
    }

    public void onMeasure(int i2, int i3) {
        AnonymousClass4P6 r3;
        int min;
        if (this.A0E) {
            this.A09 = true;
            CharSequence text = getText();
            if ((text == null || text.length() == 0) && this.A01 != null) {
                r3 = this.A05;
                min = r3.A05;
            } else {
                int fixedSpace = getFixedSpace();
                r3 = this.A05;
                min = Math.min(getMaxWidth(), Math.max(getMinWidth(), fixedSpace + r3.A02 + ((int) getPaint().measureText(getText().toString()))));
            }
            i2 = View.MeasureSpec.makeMeasureSpec(View.resolveSize(min, i2), 1073741824);
            i3 = View.MeasureSpec.makeMeasureSpec(r3.A01, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public final void setAbProps(C14710pd r1) {
        this.A03 = r1;
    }

    public final void setAction(C797741f r3) {
        boolean z2 = false;
        C18450wi.A0H(r3, 0);
        if (this.A04 != r3) {
            z2 = true;
        }
        this.A04 = r3;
        if (z2) {
            A03();
        }
    }

    public void setBackground(Drawable drawable) {
        if (!this.A0E || drawable != null) {
            super.setBackground(drawable);
        } else {
            setVariant(C799141v.BORDERLESS);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.A0E) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else if (!this.A0C || drawable != null) {
            setIcon(drawable);
        } else {
            setIcon(drawable3);
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        setCompoundDrawablesWithIntrinsicBounds(i2 == 0 ? null : AnonymousClass00T.A04(getContext(), i2), (Drawable) null, i4 == 0 ? null : AnonymousClass00T.A04(getContext(), i4), (Drawable) null);
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.A0E) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else if (!this.A0C || drawable != null) {
            setIcon(drawable);
        } else {
            setIcon(drawable3);
        }
    }

    public void setEnabled(boolean z2) {
        if (!this.A0E) {
            super.setEnabled(z2);
        } else if (isEnabled() != z2) {
            super.setEnabled(z2);
            A03();
        }
    }

    public final void setIcon(int i2) {
        setIcon(i2 <= 0 ? null : AnonymousClass00T.A04(getContext(), i2));
    }

    public final void setIcon(Drawable drawable) {
        this.A01 = drawable;
        A02();
        requestLayout();
    }

    public final void setOverrideButtonMigration(boolean z2) {
        this.A0D = z2;
    }

    public final void setSize(AnonymousClass419 r3) {
        boolean z2 = false;
        C18450wi.A0H(r3, 0);
        if (this.A06 != r3) {
            z2 = true;
        }
        this.A06 = r3;
        if (z2) {
            A02();
            A03();
            requestLayout();
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.A0E && !this.A09) {
            this.A09 = !C18450wi.A0R(getText(), String.valueOf(charSequence));
        }
        super.setText(charSequence, bufferType);
    }

    public final void setUseWDSButtonStyling(boolean z2) {
        this.A0E = z2;
    }

    public final void setVariant(C799141v r3) {
        boolean z2 = false;
        C18450wi.A0H(r3, 0);
        if (this.A07 != r3) {
            z2 = true;
        }
        this.A07 = r3;
        if (z2) {
            A03();
        }
    }

    public final void setWhatsAppLocale(AnonymousClass013 r1) {
        this.A02 = r1;
    }

    public void setupBackgroundStyle(ColorStateList colorStateList) {
        C18450wi.A0H(colorStateList, 0);
        int defaultColor = colorStateList.getDefaultColor();
        int colorForState = colorStateList.getColorForState(getDrawableState(), defaultColor);
        Drawable A012 = A01(colorForState, false);
        int colorForState2 = colorStateList.getColorForState(new int[]{16842919, 16842910}, defaultColor);
        if (isEnabled()) {
            if (C15450qv.A03()) {
                A012 = new RippleDrawable(colorStateList, A012, A01(colorForState2, true));
            } else {
                Drawable A013 = A01(AnonymousClass090.A05(colorForState2, colorForState), false);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, A013);
                stateListDrawable.addState(new int[0], A012);
                A012 = stateListDrawable;
            }
        }
        setBackground(A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r4.A07 != X.C799141v.A03) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setupContentStyle(android.content.res.ColorStateList r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18450wi.A0H(r5, r0)
            int[] r1 = r4.getDrawableState()
            r0 = -1
            int r2 = r5.getColorForState(r1, r0)
            android.text.TextPaint r0 = r4.getPaint()
            r0.setColor(r2)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r2, r1)
            r4.A00 = r0
            X.41f r1 = r4.A04
            X.41f r0 = X.C797741f.MEDIA
            if (r1 != r0) goto L_0x002a
            X.41v r2 = r4.A07
            X.41v r1 = X.C799141v.OUTLINE
            r0 = 1
            if (r2 == r1) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            android.text.TextPaint r3 = r4.getPaint()
            if (r0 == 0) goto L_0x0043
            r2 = 1073741824(0x40000000, float:2.0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131101846(0x7f060896, float:1.7816113E38)
            int r1 = X.AnonymousClass00T.A00(r1, r0)
            r0 = 0
            r3.setShadowLayer(r2, r0, r0, r1)
            return
        L_0x0043:
            r3.clearShadowLayer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wds.components.button.WDSButton.setupContentStyle(android.content.res.ColorStateList):void");
    }
}
