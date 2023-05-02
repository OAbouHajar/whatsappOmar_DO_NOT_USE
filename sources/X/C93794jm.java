package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.components.TextAndDateLayout;

/* renamed from: X.4jm  reason: invalid class name and case insensitive filesystem */
public class C93794jm implements TextWatcher {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ TextAndDateLayout A01;

    public C93794jm(TextView textView, TextAndDateLayout textAndDateLayout) {
        this.A01 = textAndDateLayout;
        this.A00 = textView;
    }

    public void afterTextChanged(Editable editable) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = 5;
        if (C45902Bo.A0G(editable)) {
            i2 = 3;
        }
        layoutParams.gravity = i2;
        this.A00.setLayoutParams(layoutParams);
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
