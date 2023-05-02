package com.obwhatsapp.text;

import X.AnonymousClass4F6;
import X.C46162Cr;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import com.obwhatsapp.search.SearchViewModel;
import java.util.List;

public class FinalBackspaceAwareEntry extends C46162Cr {
    public static final char A04 = "​".charAt(0);
    public TextView.BufferType A00;
    public List A01;
    public boolean A02;
    public boolean A03;

    public FinalBackspaceAwareEntry(Context context) {
        super(context);
        A02();
        this.A02 = false;
        this.A00 = TextView.BufferType.EDITABLE;
        A08();
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A02 = false;
        this.A00 = TextView.BufferType.EDITABLE;
        A08();
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A02 = false;
        this.A00 = TextView.BufferType.EDITABLE;
        A08();
    }

    public FinalBackspaceAwareEntry(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public static /* synthetic */ void A00(FinalBackspaceAwareEntry finalBackspaceAwareEntry, String str) {
        Editable A07 = finalBackspaceAwareEntry.A07(finalBackspaceAwareEntry.getText());
        if (str != null && A07 != null && !str.equals(A07.toString())) {
            finalBackspaceAwareEntry.setTextWithBsPrefix(str);
            finalBackspaceAwareEntry.setSelection(str.length());
        }
    }

    public static final boolean A01(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && charSequence.charAt(0) == A04;
    }

    private void setTextWithBsPrefix(String str) {
        StringBuilder sb = new StringBuilder("​");
        sb.append(str);
        setText(sb.toString());
    }

    public final int A06(int i2) {
        return Math.max(0, Math.min(i2, TextUtils.isEmpty(getText()) ? 0 : getText().length()));
    }

    public final Editable A07(Editable editable) {
        Editable editable2 = editable;
        if (!A01(editable)) {
            return editable2;
        }
        Editable newEditable = Editable.Factory.getInstance().newEditable(editable);
        newEditable.replace(0, A01(newEditable) ? 1 : 0, "", 0, 0);
        return newEditable;
    }

    public final void A08() {
        if (!A01(getText())) {
            A09(getText());
        }
        addTextChangedListener(new IDxWAdapterShape102S0100000_2_I0(this, 4));
    }

    public final void A09(Editable editable) {
        Editable editable2;
        this.A02 = true;
        if (editable != null) {
            editable2 = Editable.Factory.getInstance().newEditable(editable);
            editable2.replace(0, 0, "​", 0, 1);
        } else {
            editable2 = null;
        }
        setText(editable2, this.A00);
        this.A02 = false;
    }

    public int getSelectionEnd() {
        Editable text = getText();
        return TextUtils.isEmpty(A07(text)) ? A01(text) ? 1 : 0 : super.getSelectionEnd();
    }

    public int getSelectionStart() {
        return Math.max(super.getSelectionStart(), A01(getText()) ? 1 : 0);
    }

    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        SearchViewModel searchViewModel;
        List<AnonymousClass4F6> list = this.A01;
        if (list != null) {
            for (AnonymousClass4F6 r2 : list) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (searchViewModel = r2.A00.A0C) != null) {
                    searchViewModel.A0Y(false);
                }
            }
        }
        return super.onKeyPreIme(i2, keyEvent);
    }

    public void onSelectionChanged(int i2, int i3) {
        super.onSelectionChanged(i2, i3);
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        int A012 = A01(getText());
        if (min < A012) {
            setSelection(A06(Math.max(min, A012)), A06(max));
        }
    }

    public void setSelection(int i2) {
        super.setSelection(A06(i2 + (A01(getText()) ? 1 : 0)));
    }
}
