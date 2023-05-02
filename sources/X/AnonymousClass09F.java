package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.R;

/* renamed from: X.09F  reason: invalid class name */
public class AnonymousClass09F implements AnonymousClass09G {
    public int A00 = 0;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public View A06;
    public Window.Callback A07;
    public AnonymousClass0ZV A08;
    public Toolbar A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public boolean A0D;
    public boolean A0E;

    public AnonymousClass09F(Toolbar toolbar, boolean z2) {
        Drawable drawable;
        this.A09 = toolbar;
        CharSequence charSequence = toolbar.A0V;
        this.A0C = charSequence;
        this.A0B = toolbar.A0U;
        this.A0E = charSequence != null;
        this.A05 = toolbar.getNavigationIcon();
        AnonymousClass07T A002 = AnonymousClass07T.A00(toolbar.getContext(), (AttributeSet) null, AnonymousClass05L.A00, R.attr.attr0009, 0);
        this.A02 = A002.A02(15);
        if (z2) {
            TypedArray typedArray = A002.A02;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                Aer(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                Ael(text2);
            }
            Drawable A022 = A002.A02(20);
            if (A022 != null) {
                this.A04 = A022;
                A00();
            }
            Drawable A023 = A002.A02(17);
            if (A023 != null) {
                this.A03 = A023;
                A00();
            }
            if (this.A05 == null && (drawable = this.A02) != null) {
                AeA(drawable);
            }
            Adr(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                Adp(LayoutInflater.from(this.A09.getContext()).inflate(resourceId, this.A09, false));
                Adr(this.A01 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.A09.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.A09.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.A09.A0B(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = this.A09;
                toolbar2.A0C(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = this.A09;
                Context context = toolbar3.getContext();
                toolbar3.A06 = resourceId3;
                TextView textView = toolbar3.A0K;
                if (textView != null) {
                    textView.setTextAppearance(context, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                this.A09.setPopupTheme(resourceId4);
            }
        } else {
            Toolbar toolbar4 = this.A09;
            int i2 = 11;
            if (toolbar4.getNavigationIcon() != null) {
                i2 = 15;
                this.A02 = toolbar4.getNavigationIcon();
            }
            this.A01 = i2;
        }
        A002.A04();
        if (R.string.str1baf != this.A00) {
            this.A00 = R.string.str1baf;
            if (TextUtils.isEmpty(this.A09.getNavigationContentDescription())) {
                int i3 = this.A00;
                String string = i3 == 0 ? null : this.A09.getContext().getString(i3);
                this.A0A = string;
                if ((this.A01 & 4) != 0) {
                    boolean isEmpty = TextUtils.isEmpty(string);
                    Toolbar toolbar5 = this.A09;
                    if (isEmpty) {
                        toolbar5.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar5.setNavigationContentDescription(this.A0A);
                    }
                }
            }
        }
        this.A0A = this.A09.getNavigationContentDescription();
        this.A09.setNavigationOnClickListener(new AnonymousClass09H(this));
    }

    public final void A00() {
        Drawable drawable;
        int i2 = this.A01;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.A04) == null) {
            drawable = this.A03;
        }
        this.A09.setLogo(drawable);
    }

    public void A85() {
        AnonymousClass0ZV r0;
        ActionMenuView actionMenuView = this.A09.A0O;
        if (actionMenuView != null && (r0 = actionMenuView.A08) != null) {
            r0.A01();
            AnonymousClass0D0 r02 = r0.A0B;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public void Adp(View view) {
        View view2 = this.A06;
        if (!(view2 == null || (this.A01 & 16) == 0)) {
            this.A09.removeView(view2);
        }
        this.A06 = view;
        if (view != null && (this.A01 & 16) != 0) {
            this.A09.addView(view);
        }
    }

    public void Adr(int i2) {
        View view;
        CharSequence charSequence;
        Drawable drawable;
        int i3 = this.A01 ^ i2;
        this.A01 = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    CharSequence charSequence2 = this.A0A;
                    boolean isEmpty = TextUtils.isEmpty(charSequence2);
                    Toolbar toolbar = this.A09;
                    if (isEmpty) {
                        toolbar.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar.setNavigationContentDescription(charSequence2);
                    }
                }
                int i4 = this.A01 & 4;
                Toolbar toolbar2 = this.A09;
                if (i4 != 0) {
                    drawable = this.A05;
                    if (drawable == null) {
                        drawable = this.A02;
                    }
                } else {
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            if ((i3 & 3) != 0) {
                A00();
            }
            if ((i3 & 8) != 0) {
                int i5 = i2 & 8;
                Toolbar toolbar3 = this.A09;
                if (i5 != 0) {
                    toolbar3.setTitle(this.A0C);
                    charSequence = this.A0B;
                } else {
                    charSequence = null;
                    toolbar3.setTitle((CharSequence) null);
                }
                toolbar3.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.A06) != null) {
                int i6 = i2 & 16;
                Toolbar toolbar4 = this.A09;
                if (i6 != 0) {
                    toolbar4.addView(view);
                } else {
                    toolbar4.removeView(view);
                }
            }
        }
    }

    public void AeA(Drawable drawable) {
        this.A05 = drawable;
        int i2 = this.A01 & 4;
        Toolbar toolbar = this.A09;
        Drawable drawable2 = null;
        if (i2 != 0) {
            drawable2 = drawable;
            if (drawable == null) {
                drawable2 = this.A02;
            }
        }
        toolbar.setNavigationIcon(drawable2);
    }

    public void Ael(CharSequence charSequence) {
        this.A0B = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setSubtitle(charSequence);
        }
    }

    public void Aer(CharSequence charSequence) {
        this.A0E = true;
        this.A0C = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setTitle(charSequence);
        }
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.A0E) {
            this.A0C = charSequence;
            if ((this.A01 & 8) != 0) {
                this.A09.setTitle(charSequence);
            }
        }
    }
}
