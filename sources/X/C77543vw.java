package X;

import android.view.KeyEvent;
import android.widget.EditText;
import com.obwhatsapp.R;

/* renamed from: X.3vw  reason: invalid class name and case insensitive filesystem */
public class C77543vw extends C103054zx {
    public C77543vw() {
        super(R.drawable.ic_key_decimal);
    }

    public void AVD(EditText editText) {
        EditText editText2 = editText;
        editText2.dispatchKeyEvent(new KeyEvent(0, 0, 0, 158, 0));
        editText2.dispatchKeyEvent(new KeyEvent(0, 0, 1, 158, 0));
    }
}
