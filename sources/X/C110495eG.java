package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.IDxTListenerShape169S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.text.IDxWAdapterShape104S0100000_3_I1;
import java.util.AbstractList;
import org.npci.commonlibrary.NPCIFragment;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.5eG  reason: invalid class name and case insensitive filesystem */
public class C110495eG extends LinearLayout implements AnonymousClass69X {
    public int A00;
    public int A01;
    public Button A02;
    public ImageView A03;
    public LinearLayout A04;
    public ProgressBar A05;
    public TextView A06;
    public Object A07;
    public String A08;
    public String A09 = "";
    public FormItemEditText A0A;
    public AnonymousClass69I A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E;

    public C110495eG(Context context) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C115685q9.A01);
        if (obtainStyledAttributes != null) {
            this.A08 = obtainStyledAttributes.getString(2);
            this.A00 = obtainStyledAttributes.getInteger(1, 6);
            this.A0E = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        LinearLayout.inflate(context, R.layout.layout041f, this);
        this.A04 = (LinearLayout) findViewById(R.id.form_item_action_bar);
        this.A06 = C13680ns.A0M(this, R.id.form_item_title);
        this.A0A = (FormItemEditText) findViewById(R.id.form_item_input);
        this.A02 = (Button) findViewById(R.id.form_item_button);
        this.A05 = (ProgressBar) findViewById(R.id.form_item_progress);
        this.A03 = C13680ns.A0K(this, R.id.form_item_image);
        this.A0A.setInputType(0);
        setTitle(this.A08);
        setInputLength(this.A00);
        this.A0A.addTextChangedListener(new IDxWAdapterShape104S0100000_3_I1(this, 4));
        this.A0A.setOnTouchListener(new IDxTListenerShape169S0100000_3_I1(this, 2));
        setActionBarPositionTop(this.A0E);
    }

    public static C110495eG A00(AbstractList abstractList, NPCIFragment nPCIFragment) {
        C110495eG r2 = (C110495eG) abstractList.get(nPCIFragment.A00);
        AnonymousClass0SH A012 = r2.A01(r2.A05, false);
        A012.A09(new AccelerateDecelerateInterpolator());
        A012.A02();
        C110495eG r4 = (C110495eG) abstractList.get(nPCIFragment.A00);
        if (!TextUtils.isEmpty("")) {
            r4.A02.setText("");
        }
        Button button = r4.A02;
        r4.A01(button, false);
        button.setEnabled(false);
        button.setOnClickListener((View.OnClickListener) null);
        return (C110495eG) abstractList.get(nPCIFragment.A00);
    }

    public final AnonymousClass0SH A01(View view, boolean z2) {
        AnonymousClass0SH A0H = C004601z.A0H(view);
        float f2 = 0.0f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        if (z2) {
            f4 = 1.0f;
        }
        A0H.A05(f4);
        if (z2) {
            f2 = 1.0f;
        }
        A0H.A04(f2);
        A0H.A09(new AccelerateInterpolator());
        A0H.A0A(new C110535eM(this, z2));
        if (!z2) {
            f3 = 0.5f;
        }
        A0H.A03(f3);
        return A0H;
    }

    public boolean A9B() {
        this.A0A.requestFocus();
        return true;
    }

    public void Agw(Drawable drawable, View.OnClickListener onClickListener, String str, int i2, boolean z2, boolean z3) {
        if (!TextUtils.isEmpty(str)) {
            this.A02.setText(str);
        }
        Button button = this.A02;
        button.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        button.setOnClickListener(onClickListener);
        button.setEnabled(z3);
        A01(button, z2);
    }

    public boolean Agx() {
        if (!this.A0D) {
            this.A0D = true;
            setText(this.A09);
        } else {
            this.A0D = false;
            this.A0A.setText(this.A09.replaceAll(".", "●"));
        }
        return this.A0D;
    }

    public Object getFormDataTag() {
        return this.A07;
    }

    public FormItemEditText getFormInputView() {
        return this.A0A;
    }

    public AnonymousClass69I getFormItemListener() {
        return this.A0B;
    }

    public int getInputLength() {
        return this.A00;
    }

    public String getInputValue() {
        return (this.A0C || this.A0D) ? C13680ns.A0f(this.A0A) : this.A09;
    }

    public void setActionBarPositionTop(boolean z2) {
        LinearLayout linearLayout = this.A04;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (z2) {
            layoutParams.addRule(10);
            layoutParams.addRule(8, 0);
        } else {
            layoutParams.addRule(10, 0);
            layoutParams.addRule(8, R.id.form_item_input);
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    public void setFormDataTag(Object obj) {
        this.A07 = obj;
    }

    public void setFormItemListener(AnonymousClass69I r1) {
        this.A0B = r1;
    }

    public void setFormItemTag(int i2) {
        this.A01 = i2;
    }

    public void setInputLength(int i2) {
        this.A0A.setMaxLength(i2);
        this.A00 = i2;
    }

    public void setText(String str) {
        FormItemEditText formItemEditText = this.A0A;
        formItemEditText.setText(str);
        formItemEditText.setSelection(str.length());
    }

    public void setTitle(String str) {
        this.A06.setText(str);
        this.A08 = str;
    }
}
