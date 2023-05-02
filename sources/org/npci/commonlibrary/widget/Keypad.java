package org.npci.commonlibrary.widget;

import X.AnonymousClass00T;
import X.C110105dW;
import X.C115685q9;
import X.C1221568m;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape19S0101000_3_I1;
import com.obwhatsapp.R;

public class Keypad extends TableLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C1221568m A04;

    public Keypad(Context context) {
        this(context, (AttributeSet) null);
    }

    public Keypad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = 61;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C115685q9.A02, 0, 0);
        this.A03 = obtainStyledAttributes.getColor(3, AnonymousClass00T.A00(getContext(), R.color.color0592));
        this.A01 = obtainStyledAttributes.getColor(0, AnonymousClass00T.A00(getContext(), R.color.color0590));
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelSize(2, 36);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, this.A02);
        obtainStyledAttributes.recycle();
        setBackgroundColor(this.A03);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, 0, 1.0f);
        int i2 = 0;
        int i3 = 1;
        while (true) {
            Context context2 = getContext();
            if (i2 < 3) {
                TableRow tableRow = new TableRow(context2);
                tableRow.setLayoutParams(layoutParams);
                tableRow.setWeightSum(3.0f);
                int i4 = 0;
                do {
                    TextView textView = new TextView(getContext());
                    textView.setGravity(17);
                    textView.setLayoutParams(getItemParams());
                    textView.setTextColor(this.A01);
                    textView.setTextSize(2, this.A00);
                    textView.setText(String.valueOf(i3));
                    textView.setClickable(true);
                    setClickFeedback(textView);
                    textView.setOnClickListener(new IDxCListenerShape19S0101000_3_I1(this, i3, 1));
                    tableRow.addView(textView);
                    i3++;
                    i4++;
                } while (i4 < 3);
                addView(tableRow);
                i2++;
            } else {
                ImageView imageView = new ImageView(context2);
                imageView.setImageResource(R.drawable.ic_action_backspace);
                imageView.setLayoutParams(getItemParams());
                imageView.setClickable(true);
                setClickFeedback(imageView);
                C110105dW.A0r(imageView, this, 150);
                TextView textView2 = new TextView(getContext());
                textView2.setLayoutParams(getItemParams());
                textView2.setGravity(17);
                textView2.setText(String.valueOf(0));
                textView2.setTextColor(this.A01);
                textView2.setTextSize(2, this.A00);
                textView2.setClickable(true);
                setClickFeedback(textView2);
                C110105dW.A0r(textView2, this, 151);
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(R.drawable.ic_action_submit);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView2.setAdjustViewBounds(true);
                TableRow.LayoutParams itemParams = getItemParams();
                itemParams.height = (int) (C110105dW.A00(this, (float) this.A02) * 1.25f);
                imageView2.setLayoutParams(itemParams);
                imageView2.setClickable(true);
                imageView2.setContentDescription(getContext().getString(R.string.str045d));
                setClickFeedback(imageView2);
                C110105dW.A0r(imageView2, this, 152);
                TableRow tableRow2 = new TableRow(getContext());
                tableRow2.setLayoutParams(layoutParams);
                tableRow2.setWeightSum(3.0f);
                tableRow2.addView(imageView);
                tableRow2.addView(textView2);
                tableRow2.addView(imageView2);
                addView(tableRow2);
                return;
            }
        }
    }

    private TableRow.LayoutParams getItemParams() {
        return new TableRow.LayoutParams(0, (int) (((float) this.A02) * ((float) (getResources().getDisplayMetrics().densityDpi / 160))), 1.0f);
    }

    private void setClickFeedback(View view) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public void setOnKeyPressCallback(C1221568m r1) {
        this.A04 = r1;
    }
}
