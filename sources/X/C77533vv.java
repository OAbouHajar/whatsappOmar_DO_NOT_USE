package X;

import android.view.KeyEvent;
import android.widget.EditText;
import com.obwhatsapp.R;

/* renamed from: X.3vv  reason: invalid class name and case insensitive filesystem */
public class C77533vv extends C103054zx {
    public C77533vv() {
        super(R.drawable.ic_key_comma);
    }

    public void AVD(EditText editText) {
        EditText editText2 = editText;
        editText2.dispatchKeyEvent(new KeyEvent(0, 0, 0, 159, 0));
        editText2.dispatchKeyEvent(new KeyEvent(0, 0, 1, 159, 0));
    }
}
