package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Window;
import com.facebook.redex.IDxTListenerShape167S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.obwhatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.obwhatsapp.mediacomposer.doodle.textentry.TextEntryView;
import com.obwhatsapp.text.IDxWAdapterShape22S0200000_2_I0;

/* renamed from: X.2k1  reason: invalid class name and case insensitive filesystem */
public abstract class C55602k1 extends C55612k2 {
    public int A00;
    public WaButton A01;
    public AnonymousClass01V A02;
    public C17250um A03;
    public ColorPickerComponent A04;
    public DoodleEditText A05;
    public boolean A06;

    public C55602k1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C55602k1(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A00(int i2) {
        if (this instanceof TextEntryView) {
            ((TextEntryView) this).A03.A01(i2);
        }
    }

    public void A01(int i2, int i3, int i4) {
        this.A05.setFontStyle(i3);
        DoodleEditText doodleEditText = this.A05;
        if (this instanceof TextEntryView) {
            TextEntryView textEntryView = (TextEntryView) this;
            WaTextView waTextView = textEntryView.A02;
            Typeface typeface = textEntryView.A05.getTypeface();
        }
    }

    public void A02(Window window, C102834zb r8, AnonymousClass4MW r9, int[] iArr) {
        window.setLayout(-1, -1);
        window.setFlags(1024, 1024);
        window.clearFlags(256);
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        C41971wz.A00(findViewById(R.id.main), window, this.A02);
        ColorPickerComponent colorPickerComponent = (ColorPickerComponent) C004601z.A0E(this, R.id.color_picker_component);
        this.A04 = colorPickerComponent;
        int i2 = this.A00;
        if (i2 > 0) {
            colorPickerComponent.setMaxHeight(i2);
        }
        if (this.A06) {
            colorPickerComponent.A00();
        }
        this.A04.setColorAndInvalidate(r9.A01);
        this.A05 = (DoodleEditText) C004601z.A0E(this, R.id.text);
        int i3 = r9.A01;
        this.A05.setText(r9.A03);
        this.A05.setFontStyle(r9.A02);
        DoodleEditText doodleEditText = this.A05;
        int length = r9.A03.length();
        doodleEditText.setSelection(length, length);
        this.A05.setOnEditorActionListener(new C94864lb(this, r8));
        DoodleEditText doodleEditText2 = this.A05;
        doodleEditText2.A01 = new C102824za(this, r8);
        doodleEditText2.addTextChangedListener(new IDxWAdapterShape22S0200000_2_I0(r8, 0, this));
        WaButton waButton = (WaButton) C004601z.A0E(this, R.id.done);
        this.A01 = waButton;
        waButton.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 34, r8));
        this.A04.A04((AnonymousClass4XG) null, new C102744zS(this, r9), (AnonymousClass29j) null);
        IDxTListenerShape167S0100000_2_I0 iDxTListenerShape167S0100000_2_I0 = new IDxTListenerShape167S0100000_2_I0(this, 9);
        C004601z.A0E(this, R.id.main).setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 35, r8));
        C004601z.A0E(this, R.id.main).setOnTouchListener(iDxTListenerShape167S0100000_2_I0);
        window.setSoftInputMode(5);
        this.A05.post(new RunnableRunnableShape8S0200000_I0_6(this, 32, r8));
        this.A05.A04(false);
    }

    public void setDelayShowColorPicker(boolean z2) {
        this.A06 = z2;
    }

    public void setEntryTextSize(float f2) {
        this.A05.setTextSize(f2);
    }

    public void setMaxColorPickerHeight(int i2) {
        this.A00 = i2;
    }
}
