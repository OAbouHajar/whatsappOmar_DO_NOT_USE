package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: X.0C6  reason: invalid class name */
public class AnonymousClass0C6 extends CheckedTextView {
    public static final int[] A01 = {16843016};
    public final AnonymousClass08R A00;

    public AnonymousClass0C6(Context context, AttributeSet attributeSet) {
        super(AnonymousClass08O.A00(context), attributeSet, 16843720);
        AnonymousClass08P.A03(getContext(), this);
        AnonymousClass08R r0 = new AnonymousClass08R(this);
        this.A00 = r0;
        r0.A0A(attributeSet, 16843720);
        r0.A02();
        AnonymousClass07T A002 = AnonymousClass07T.A00(getContext(), attributeSet, A01, 16843720, 0);
        setCheckMarkDrawable(A002.A02(0));
        A002.A04();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass08R r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass08Z.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(AnonymousClass06L.A01(getContext(), i2));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass04h.A02(callback, this));
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AnonymousClass08R r0 = this.A00;
        if (r0 != null) {
            r0.A05(context, i2);
        }
    }
}
