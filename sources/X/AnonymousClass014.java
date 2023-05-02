package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.obwhatsapp.R;

/* renamed from: X.014  reason: invalid class name */
public class AnonymousClass014 extends EditText implements AnonymousClass015, AnonymousClass016 {
    public final AnonymousClass08Q A00;
    public final AnonymousClass08S A01;
    public final AnonymousClass08R A02;
    public final C07350bB A03;

    public AnonymousClass014(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr0161);
    }

    public AnonymousClass014(Context context, AttributeSet attributeSet, int i2) {
        super(AnonymousClass08O.A00(context), attributeSet, i2);
        AnonymousClass08P.A03(getContext(), this);
        AnonymousClass08Q r0 = new AnonymousClass08Q(this);
        this.A00 = r0;
        r0.A05(attributeSet, i2);
        AnonymousClass08R r02 = new AnonymousClass08R(this);
        this.A02 = r02;
        r02.A0A(attributeSet, i2);
        r02.A02();
        this.A01 = new AnonymousClass08S(this);
        this.A03 = new C07350bB();
    }

    public C06130Uj AVl(C06130Uj r2) {
        return this.A03.AVk(this, r2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass08R r02 = this.A02;
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

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x000f
            X.08S r0 = r2.A01
            if (r0 == 0) goto L_0x000f
            android.view.textclassifier.TextClassifier r0 = r0.A00()
            return r0
        L_0x000f:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass014.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass08R.A01(editorInfo, onCreateInputConnection, this);
        AnonymousClass08Z.A00(this, editorInfo, onCreateInputConnection);
        String[] A0y = C004601z.A0y(this);
        if (onCreateInputConnection == null || A0y == null) {
            return onCreateInputConnection;
        }
        EditorInfoCompat.setContentMimeTypes(editorInfo, A0y);
        return InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, (InputConnectionCompat.OnCommitContentListener) new C07390bF(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r0 = new java.lang.StringBuilder("Can't handle drop: no activity: view=");
        r0.append(r3);
        android.util.Log.i("ReceiveContent", r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDragEvent(android.view.DragEvent r4) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0060
            java.lang.Object r0 = r4.getLocalState()
            if (r0 != 0) goto L_0x0060
            java.lang.String[] r0 = X.C004601z.A0y(r3)
            if (r0 == 0) goto L_0x0060
            android.content.Context r2 = r3.getContext()
        L_0x0016:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x004d
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0046
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x004d
            int r1 = r4.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x0031
            boolean r0 = r3 instanceof android.widget.TextView
            r0 = r0 ^ 1
        L_0x002d:
            if (r0 == 0) goto L_0x0060
            r0 = 1
            return r0
        L_0x0031:
            int r1 = r4.getAction()
            r0 = 3
            if (r1 != r0) goto L_0x0060
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0041
            boolean r0 = X.AnonymousClass0SO.A01(r2, r4, r3)
            goto L_0x002d
        L_0x0041:
            boolean r0 = X.AnonymousClass0SO.A00(r2, r4, r3)
            goto L_0x002d
        L_0x0046:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L_0x0016
        L_0x004d:
            java.lang.String r1 = "Can't handle drop: no activity: view="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ReceiveContent"
            android.util.Log.i(r0, r1)
        L_0x0060:
            boolean r0 = super.onDragEvent(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass014.onDragEvent(android.view.DragEvent):boolean");
    }

    public boolean onTextContextMenuItem(int i2) {
        ClipData primaryClip;
        int i3 = 0;
        if ((i2 != 16908322 && i2 != 16908337) || C004601z.A0y(this) == null) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0) {
            return true;
        }
        AnonymousClass0NR r0 = new AnonymousClass0NR(primaryClip, 1);
        if (i2 != 16908322) {
            i3 = 1;
        }
        C13270lk r02 = r0.A00;
        r02.Adw(i3);
        C004601z.A0G(this, r02.A5h());
        return true;
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass04h.A02(callback, this));
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
        AnonymousClass08R r0 = this.A02;
        if (r0 != null) {
            r0.A05(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        AnonymousClass08S r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A01) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.A01(textClassifier);
        }
    }
}
