package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.obwhatsapp.R;

/* renamed from: X.0CX  reason: invalid class name */
public class AnonymousClass0CX extends MultiAutoCompleteTextView implements AnonymousClass015 {
    public static final int[] A02 = {16843126};
    public final AnonymousClass08Q A00;
    public final AnonymousClass08R A01;

    public AnonymousClass0CX(Context context, AttributeSet attributeSet) {
        super(AnonymousClass08O.A00(context), attributeSet, R.attr.attr0047);
        AnonymousClass08P.A03(getContext(), this);
        AnonymousClass07T A002 = AnonymousClass07T.A00(getContext(), attributeSet, A02, R.attr.attr0047, 0);
        if (A002.A02.hasValue(0)) {
            setDropDownBackgroundDrawable(A002.A02(0));
        }
        A002.A04();
        AnonymousClass08Q r0 = new AnonymousClass08Q(this);
        this.A00 = r0;
        r0.A05(attributeSet, R.attr.attr0047);
        AnonymousClass08R r02 = new AnonymousClass08R(this);
        this.A01 = r02;
        r02.A0A(attributeSet, R.attr.attr0047);
        r02.A02();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass08R r02 = this.A01;
        if (r02 != null) {
            r02.A02();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A00;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A00;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A01;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass08Z.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A02(i2);
        }
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AnonymousClass06L.A01(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AnonymousClass08R r0 = this.A01;
        if (r0 != null) {
            r0.A05(context, i2);
        }
    }
}
