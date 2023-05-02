package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.IDxProviderShape13S0400000_2_I0;
import com.facebook.redex.IDxProviderShape156S0100000_2_I0;
import com.facebook.redex.IDxProviderShape36S0300000_2_I0;
import com.facebook.redex.IDxProviderShape64S0200000_2_I0;
import com.google.android.material.appbar.AppBarLayout;
import com.obwhatsapp.R;

/* renamed from: X.1VE  reason: invalid class name */
public class AnonymousClass1VE implements AnonymousClass1VF {
    public float A00 = 0.0f;
    public int A01 = 0;
    public final float A02;
    public final float A03;
    public final Resources A04;
    public final View A05;
    public final View A06;
    public final ViewGroup.LayoutParams A07;
    public final ViewGroup.MarginLayoutParams A08;
    public final TextView A09;
    public final TextView A0A;
    public final AnonymousClass013 A0B;
    public final AnonymousClass1VH A0C;
    public final AnonymousClass1VH A0D;
    public final AnonymousClass1VH A0E;
    public final AnonymousClass1VH A0F;
    public final AnonymousClass1VH A0G;
    public final AnonymousClass1VH A0H;
    public final AnonymousClass1VH A0I;
    public final AnonymousClass1VH A0J;
    public final AnonymousClass1VH A0K;
    public final AnonymousClass1VH A0L;
    public final AnonymousClass1VH A0M;
    public final AnonymousClass1VH A0N;
    public final AnonymousClass1VH A0O;
    public final AnonymousClass1VH A0P;
    public final AnonymousClass1VH A0Q;

    public AnonymousClass1VE(View view, View view2, TextView textView, TextView textView2, AnonymousClass013 r14) {
        this.A0B = r14;
        this.A05 = (View) view2.getParent();
        this.A04 = view2.getResources();
        this.A06 = view2;
        this.A0A = textView;
        this.A09 = textView2;
        this.A08 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        this.A03 = textView.getTextSize();
        this.A07 = textView2.getLayoutParams();
        this.A02 = textView2.getTextSize();
        this.A0C = new AnonymousClass1VH(new IDxProviderShape64S0200000_2_I0(view, 3, this));
        this.A0I = new AnonymousClass1VH(new IDxProviderShape64S0200000_2_I0(view2, 1, this));
        this.A0D = new AnonymousClass1VH(new IDxProviderShape64S0200000_2_I0(view2, 0, this));
        this.A0J = new AnonymousClass1VH(new IDxProviderShape13S0400000_2_I0(view2, view, this, r14, 0));
        this.A0K = new AnonymousClass1VH(new IDxProviderShape64S0200000_2_I0(view2, 2, this));
        this.A0M = new AnonymousClass1VH(new IDxProviderShape156S0100000_2_I0(textView, 11));
        this.A0H = new AnonymousClass1VH(new IDxProviderShape156S0100000_2_I0(this, 17));
        this.A0G = new AnonymousClass1VH(new IDxProviderShape36S0300000_2_I0(view, this, r14, 1));
        this.A0P = new AnonymousClass1VH(new IDxProviderShape156S0100000_2_I0(this, 12));
        this.A0Q = new AnonymousClass1VH(new IDxProviderShape156S0100000_2_I0(this, 16));
        this.A0L = new AnonymousClass1VH(new IDxProviderShape156S0100000_2_I0(textView2, 10));
        this.A0F = new AnonymousClass1VH(new IDxProviderShape156S0100000_2_I0(this, 13));
        this.A0E = new AnonymousClass1VH(new IDxProviderShape36S0300000_2_I0(view, this, r14, 0));
        this.A0N = new AnonymousClass1VH(new IDxProviderShape156S0100000_2_I0(this, 14));
        this.A0O = new AnonymousClass1VH(new IDxProviderShape156S0100000_2_I0(this, 15));
    }

    public static final void A00(View view, float f2, float f3, float f4, float f5, float f6) {
        view.setScaleX(f6);
        view.setScaleY(f6);
        float f7 = 1.0f - f6;
        view.setTranslationX(f4 - (((((float) view.getWidth()) / 2.0f) - f2) * f7));
        view.setTranslationY(f5 - (((((float) view.getHeight()) / 2.0f) - f3) * f7));
    }

    public final ViewGroup.MarginLayoutParams A01(int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A08;
        if (marginLayoutParams instanceof RelativeLayout.LayoutParams) {
            return new RelativeLayout.LayoutParams(i2, i3);
        }
        if (marginLayoutParams instanceof C64313Nq) {
            return new C64313Nq(i2, i3);
        }
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            return new LinearLayout.LayoutParams(i2, i3);
        }
        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
            return new FrameLayout.LayoutParams(i2, i3);
        }
        throw new IllegalStateException("Title view parent is of an unsupported type. Provide a custom LayoutParams factory.");
    }

    public final void A02() {
        TextView textView = this.A09;
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setTranslationY(0.0f);
        textView.setAlpha(1.0f);
        textView.setMaxLines(3);
        if (Build.VERSION.SDK_INT >= 27) {
            C05720Ss.A00(textView, 0);
        } else if (textView instanceof AnonymousClass02a) {
            ((AnonymousClass02a) textView).setAutoSizeTextTypeWithDefaults(0);
        }
        textView.setLayoutParams(this.A07);
        textView.setTextSize(0, this.A02);
        textView.setGravity(1);
    }

    public final void A03() {
        TextView textView = this.A0A;
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setTranslationY(0.0f);
        textView.setAlpha(1.0f);
        textView.setMaxLines(3);
        if (Build.VERSION.SDK_INT >= 27) {
            C05720Ss.A00(textView, 0);
        } else if (textView instanceof AnonymousClass02a) {
            ((AnonymousClass02a) textView).setAutoSizeTextTypeWithDefaults(0);
        }
        textView.setLayoutParams(this.A08);
        textView.setTextSize(0, this.A03);
        textView.setGravity(1);
    }

    public final void A04(Rect rect, ViewGroup.MarginLayoutParams marginLayoutParams, AppBarLayout appBarLayout) {
        if (!C15450qv.A00() || (!this.A0B.A0T())) {
            marginLayoutParams.leftMargin = rect.left;
        } else {
            marginLayoutParams.rightMargin = appBarLayout.getWidth() - rect.right;
        }
        marginLayoutParams.topMargin = rect.top;
    }

    public final void A05(AppBarLayout appBarLayout) {
        Rect rect = (Rect) this.A0E.get();
        ViewGroup.MarginLayoutParams A012 = A01(rect.width(), rect.height());
        A04(rect, A012, appBarLayout);
        TextView textView = this.A09;
        if (textView.getWidth() != rect.width()) {
            textView.setLayoutParams(A012);
        }
    }

    public final void A06(AppBarLayout appBarLayout) {
        Rect rect = (Rect) this.A0G.get();
        ViewGroup.MarginLayoutParams A012 = A01(rect.width(), rect.height());
        A04(rect, A012, appBarLayout);
        TextView textView = this.A0A;
        if (textView.getWidth() != rect.width()) {
            textView.setLayoutParams(A012);
        }
    }

    public void AU9(AppBarLayout appBarLayout, int i2) {
        AppBarLayout appBarLayout2 = appBarLayout;
        int i3 = i2;
        float height = ((float) i3) / (((float) appBarLayout2.getHeight()) - ((float) appBarLayout2.getMinimumHeight()));
        if (!Float.isNaN(height) && !Float.isInfinite(height)) {
            float f2 = this.A00;
            if (height != f2) {
                if (f2 == 0.0f || f2 == -1.0f) {
                    View view = this.A06;
                    view.setPivotX(((float) view.getWidth()) / 2.0f);
                    view.setPivotY(((float) view.getHeight()) / 2.0f);
                    TextView textView = this.A0A;
                    textView.setPivotX(((float) textView.getWidth()) / 2.0f);
                    textView.setPivotY(((float) textView.getHeight()) / 2.0f);
                    TextView textView2 = this.A09;
                    textView2.setPivotX(((float) textView2.getWidth()) / 2.0f);
                    textView2.setPivotY(((float) textView2.getHeight()) / 2.0f);
                }
                if (height == 0.0f) {
                    View view2 = this.A06;
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    A03();
                    A02();
                } else {
                    float f3 = -height;
                    float floatValue = 1.0f - (((Number) this.A0I.get()).floatValue() * f3);
                    float f4 = (float) (-i3);
                    A00(this.A06, 0.0f, 0.0f, ((Number) this.A0J.get()).floatValue() * f3, f4 + (((Number) this.A0K.get()).floatValue() * f3), floatValue);
                    double d2 = (double) f3;
                    int i4 = 1;
                    if (d2 < 0.5d) {
                        TextView textView3 = this.A0A;
                        if (textView3.getMaxLines() == 1) {
                            A03();
                        }
                        float floatValue2 = 1.0f - (((Number) this.A0P.get()).floatValue() * f3);
                        A00(textView3, ((float) textView3.getWidth()) / 2.0f, ((float) textView3.getHeight()) / 2.0f, 0.0f, f4 + (((Number) this.A0Q.get()).floatValue() * f3), floatValue2);
                        textView3.setAlpha(1.0f - (f3 * 2.0f));
                    } else {
                        TextView textView4 = this.A0A;
                        if (textView4.getMaxLines() != 1) {
                            textView4.setScaleX(1.0f);
                            textView4.setScaleY(1.0f);
                            textView4.setMaxLines(1);
                            AnonymousClass04h.A09(textView4, this.A04.getDimensionPixelSize(R.dimen.dimen07d2), (int) (this.A03 + 0.5f), 1, 0);
                            A06(appBarLayout2);
                            int i5 = 51;
                            if (this.A0B.A0T()) {
                                i5 = 53;
                            }
                            textView4.setGravity(i5);
                        }
                        if (!this.A0B.A0T()) {
                            i4 = -1;
                        }
                        float f5 = (f3 - 0.5f) * 2.0f;
                        textView4.setTranslationX((((float) (i4 * textView4.getLeft())) / 4.0f) * (1.0f - f5));
                        textView4.setTranslationY(f4);
                        textView4.setAlpha(f5);
                    }
                    int i6 = 1;
                    int i7 = (d2 > 0.5d ? 1 : (d2 == 0.5d ? 0 : -1));
                    TextView textView5 = this.A09;
                    int maxLines = textView5.getMaxLines();
                    if (i7 < 0) {
                        if (maxLines == 1) {
                            A02();
                        }
                        A00(textView5, ((float) textView5.getWidth()) / 2.0f, ((float) textView5.getHeight()) / 2.0f, 0.0f, f4 + (((Number) this.A0O.get()).floatValue() * f3), 1.0f - (((Number) this.A0N.get()).floatValue() * f3));
                        textView5.setAlpha(1.0f - (f3 * 2.0f));
                    } else {
                        if (maxLines != 1) {
                            textView5.setScaleX(1.0f);
                            textView5.setScaleY(1.0f);
                            textView5.setMaxLines(1);
                            AnonymousClass04h.A09(textView5, this.A04.getDimensionPixelSize(R.dimen.dimen07d2), (int) (this.A02 + 0.5f), 1, 0);
                            A05(appBarLayout2);
                            int i8 = 51;
                            if (this.A0B.A0T()) {
                                i8 = 53;
                            }
                            textView5.setGravity(i8);
                        }
                        if (!this.A0B.A0T()) {
                            i6 = -1;
                        }
                        float f6 = (f3 - 0.5f) * 2.0f;
                        textView5.setTranslationX((((float) (i6 * textView5.getLeft())) / 4.0f) * (1.0f - f6));
                        textView5.setTranslationY(f4);
                        textView5.setAlpha(f6);
                    }
                }
            }
            if (height == 0.0f) {
                View view3 = this.A05;
                int height2 = view3.getHeight();
                this.A0G.A00 = null;
                this.A0E.A00 = null;
                if (view3.getLayoutParams().height != height2) {
                    view3.getLayoutParams().height = height2;
                }
            } else if (height == -1.0f) {
                View view4 = this.A05;
                int height3 = view4.getHeight();
                this.A0G.A00 = null;
                this.A0E.A00 = null;
                if (view4.getLayoutParams().height != height3) {
                    view4.getLayoutParams().height = height3;
                }
                this.A0M.get();
                this.A0L.get();
                A06(appBarLayout2);
                A05(appBarLayout2);
            }
            this.A00 = height;
            this.A01 = i3;
        }
    }
}
