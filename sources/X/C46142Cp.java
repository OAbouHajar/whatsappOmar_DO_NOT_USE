package X;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* renamed from: X.2Cp  reason: invalid class name and case insensitive filesystem */
public class C46142Cp extends C46152Cq {
    public static final Editable.Factory A01 = new AnonymousClass3MB();
    public AnonymousClass5PG A00;

    public C46142Cp(Context context) {
        super(context);
        setEditableFactory(A01);
        setCustomSelectionActionModeCallback(new C93834jq(this));
    }

    public C46142Cp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEditableFactory(A01);
        setCustomSelectionActionModeCallback(new C93834jq(this));
    }

    public C46142Cp(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setEditableFactory(A01);
        setCustomSelectionActionModeCallback(new C93834jq(this));
    }

    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        AnonymousClass5PG r0 = this.A00;
        if (r0 != null) {
            r0.ASV(i2, keyEvent);
        }
        return super.onKeyPreIme(i2, keyEvent);
    }

    public boolean onTextContextMenuItem(int i2) {
        if (Build.VERSION.SDK_INT >= 23 && i2 == 16908322) {
            i2 = 16908337;
        }
        return super.onTextContextMenuItem(i2);
    }

    public void setInputEnterDone(boolean z2) {
        int i2 = 0;
        if (z2) {
            i2 = 6;
        }
        setInputEnterAction(i2);
    }

    public void setInputEnterSend(boolean z2) {
        int i2 = 0;
        if (z2) {
            i2 = 4;
        }
        setInputEnterAction(i2);
    }

    public void setOnKeyPreImeListener(AnonymousClass5PG r1) {
        this.A00 = r1;
    }
}
