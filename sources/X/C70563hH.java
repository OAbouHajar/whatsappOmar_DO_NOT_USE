package X;

import android.content.Context;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.obwhatsapp.WaEditText;

/* renamed from: X.3hH  reason: invalid class name and case insensitive filesystem */
public class C70563hH extends WaEditText {
    public C70563hH(Context context) {
        super(context);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 0;
        BaseInputConnection baseInputConnection = new BaseInputConnection(this, false);
        try {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (onCreateInputConnection != null) {
                return new C64183Nd(baseInputConnection, onCreateInputConnection);
            }
            return null;
        } catch (Exception unused) {
            return super.onCreateInputConnection(editorInfo);
        }
    }
}
