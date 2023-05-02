package androidx.appcompat.view.menu;

import X.AnonymousClass05L;
import X.AnonymousClass07T;
import X.C07290av;
import X.C12950lE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ListMenuItemView extends LinearLayout implements C12950lE, AbsListView.SelectionBoundsAdjuster {
    public int A00;
    public Context A01;
    public Drawable A02;
    public Drawable A03;
    public LayoutInflater A04;
    public CheckBox A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public RadioButton A0A;
    public TextView A0B;
    public TextView A0C;
    public C07290av A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr034c);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        AnonymousClass07T A002 = AnonymousClass07T.A00(getContext(), attributeSet, AnonymousClass05L.A0G, i2, 0);
        this.A02 = A002.A02(5);
        TypedArray typedArray = A002.A02;
        this.A00 = typedArray.getResourceId(1, -1);
        this.A0G = typedArray.getBoolean(7, false);
        this.A01 = context;
        this.A03 = A002.A02(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.attr0159, 0);
        this.A0F = obtainStyledAttributes.hasValue(0);
        A002.A04();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.A04;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        this.A04 = from;
        return from;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.A08;
        if (imageView != null) {
            int i2 = 8;
            if (z2) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public final void A00() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.layout000e, this, false);
        this.A05 = checkBox;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public final void A01() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.layout0011, this, false);
        this.A0A = radioButton;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AII(X.C07290av r10, int r11) {
        /*
            r9 = this;
            r9.A0D = r10
            boolean r1 = r10.isVisible()
            r0 = 8
            if (r1 == 0) goto L_0x000b
            r0 = 0
        L_0x000b:
            r9.setVisibility(r0)
            java.lang.CharSequence r0 = r10.getTitle()
            r9.setTitle(r0)
            boolean r0 = r10.isCheckable()
            r9.setCheckable(r0)
            X.07w r1 = r10.A0E
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x0131
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x012d
            char r0 = r10.A00
        L_0x002c:
            if (r0 == 0) goto L_0x0131
            X.0av r2 = r9.A0D
            X.07w r8 = r2.A0E
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x0131
            boolean r1 = r8.A0I()
            if (r1 == 0) goto L_0x0129
            char r0 = r2.A00
        L_0x0040:
            if (r0 == 0) goto L_0x0131
            r6 = 0
            android.widget.TextView r5 = r9.A0B
            if (r1 == 0) goto L_0x0125
            char r7 = r2.A00
        L_0x0049:
            if (r7 != 0) goto L_0x007a
            java.lang.String r0 = ""
        L_0x004d:
            r5.setText(r0)
        L_0x0050:
            android.widget.TextView r0 = r9.A0B
            int r0 = r0.getVisibility()
            if (r0 == r6) goto L_0x005d
            android.widget.TextView r0 = r9.A0B
            r0.setVisibility(r6)
        L_0x005d:
            android.graphics.drawable.Drawable r0 = r10.getIcon()
            r9.setIcon(r0)
            boolean r0 = r10.isEnabled()
            r9.setEnabled(r0)
            boolean r0 = r10.hasSubMenu()
            r9.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r0 = r10.getContentDescription()
            r9.setContentDescription(r0)
            return
        L_0x007a:
            android.content.Context r0 = r8.A0N
            android.content.res.Resources r4 = r0.getResources()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 == 0) goto L_0x0098
            r0 = 2131893183(0x7f121bbf, float:1.9421135E38)
            java.lang.String r0 = r4.getString(r0)
            r3.append(r0)
        L_0x0098:
            boolean r0 = r8.A0I()
            if (r0 == 0) goto L_0x0121
            int r8 = r2.A04
        L_0x00a0:
            r0 = 2131893179(0x7f121bbb, float:1.9421127E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r8 & r1
            if (r0 != r1) goto L_0x00b0
            r3.append(r2)
        L_0x00b0:
            r0 = 2131893175(0x7f121bb7, float:1.942112E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r8 & r1
            if (r0 != r1) goto L_0x00c0
            r3.append(r2)
        L_0x00c0:
            r0 = 2131893174(0x7f121bb6, float:1.9421117E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 2
            r0 = r8 & 2
            if (r0 != r1) goto L_0x00cf
            r3.append(r2)
        L_0x00cf:
            r0 = 2131893180(0x7f121bbc, float:1.942113E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 1
            r0 = r8 & 1
            if (r0 != r1) goto L_0x00de
            r3.append(r2)
        L_0x00de:
            r0 = 2131893182(0x7f121bbe, float:1.9421133E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 4
            r0 = r8 & 4
            if (r0 != r1) goto L_0x00ed
            r3.append(r2)
        L_0x00ed:
            r0 = 2131893178(0x7f121bba, float:1.9421125E38)
            java.lang.String r1 = r4.getString(r0)
            r2 = 8
            r0 = r8 & 8
            if (r0 != r2) goto L_0x00fd
            r3.append(r1)
        L_0x00fd:
            r1 = 2131893176(0x7f121bb8, float:1.9421121E38)
            if (r7 == r2) goto L_0x0119
            r0 = 10
            r1 = 2131893177(0x7f121bb9, float:1.9421123E38)
            if (r7 == r0) goto L_0x0119
            r0 = 32
            if (r7 == r0) goto L_0x0116
            r3.append(r7)
        L_0x0110:
            java.lang.String r0 = r3.toString()
            goto L_0x004d
        L_0x0116:
            r1 = 2131893181(0x7f121bbd, float:1.9421131E38)
        L_0x0119:
            java.lang.String r0 = r4.getString(r1)
            r3.append(r0)
            goto L_0x0110
        L_0x0121:
            int r8 = r2.A05
            goto L_0x00a0
        L_0x0125:
            char r7 = r2.A01
            goto L_0x0049
        L_0x0129:
            char r0 = r2.A01
            goto L_0x0040
        L_0x012d:
            char r0 = r10.A01
            goto L_0x002c
        L_0x0131:
            r6 = 8
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.AII(X.0av, int):void");
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A06;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A06.getLayoutParams();
            rect.top += this.A06.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public C07290av getItemData() {
        return this.A0D;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.A02);
        TextView textView = (TextView) findViewById(R.id.title);
        this.A0C = textView;
        int i2 = this.A00;
        if (i2 != -1) {
            textView.setTextAppearance(this.A01, i2);
        }
        this.A0B = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.A08 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A03);
        }
        this.A06 = (ImageView) findViewById(R.id.group_divider);
        this.A09 = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i2, int i3) {
        if (this.A07 != null && this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.A07.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CheckBox checkBox;
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z2 || this.A0A != null || this.A05 != null) {
            if ((this.A0D.A02 & 4) != 0) {
                if (this.A0A == null) {
                    A01();
                }
                CompoundButton compoundButton3 = this.A0A;
                CompoundButton compoundButton4 = this.A05;
                checkBox = compoundButton4;
                compoundButton = compoundButton3;
                compoundButton2 = compoundButton4;
            } else {
                if (this.A05 == null) {
                    A00();
                }
                CompoundButton compoundButton5 = this.A05;
                checkBox = compoundButton5;
                compoundButton = compoundButton5;
                compoundButton2 = this.A0A;
            }
            if (z2) {
                compoundButton.setChecked(this.A0D.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.A0A;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.A0D.A02 & 4) != 0) {
            if (this.A0A == null) {
                A01();
            }
            compoundButton = this.A0A;
        } else {
            if (this.A05 == null) {
                A00();
            }
            compoundButton = this.A05;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.A0E = z2;
        this.A0G = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r3 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGroupDividerEnabled(boolean r3) {
        /*
            r2 = this;
            android.widget.ImageView r1 = r2.A06
            if (r1 == 0) goto L_0x0010
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x000b
            r0 = 0
            if (r3 != 0) goto L_0x000d
        L_0x000b:
            r0 = 8
        L_0x000d:
            r1.setVisibility(r0)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setGroupDividerEnabled(boolean):void");
    }

    public void setIcon(Drawable drawable) {
        boolean z2;
        if (this.A0D.A0E.A0H || this.A0E) {
            z2 = true;
        } else {
            z2 = false;
            if (!this.A0G) {
                return;
            }
        }
        if (this.A07 == null) {
            if (drawable != null || this.A0G) {
                ImageView imageView = (ImageView) getInflater().inflate(R.layout.layout000f, this, false);
                this.A07 = imageView;
                LinearLayout linearLayout = this.A09;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            } else {
                return;
            }
        }
        if (drawable != null || this.A0G) {
            ImageView imageView2 = this.A07;
            if (!z2) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.A07.getVisibility() != 0) {
                this.A07.setVisibility(0);
                return;
            }
            return;
        }
        this.A07.setVisibility(8);
    }

    public void setTitle(CharSequence charSequence) {
        int i2;
        TextView textView;
        TextView textView2 = this.A0C;
        if (charSequence != null) {
            textView2.setText(charSequence);
            if (this.A0C.getVisibility() != 0) {
                textView = this.A0C;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (textView2.getVisibility() != 8) {
                textView = this.A0C;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
