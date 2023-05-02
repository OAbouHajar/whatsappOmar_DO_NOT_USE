package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: X.3Nd  reason: invalid class name and case insensitive filesystem */
public class C64183Nd extends InputConnectionWrapper {
    public final InputConnection A00;

    public C64183Nd(InputConnection inputConnection, InputConnection inputConnection2) {
        super(inputConnection2, true);
        this.A00 = inputConnection;
    }

    public boolean deleteSurroundingText(int i2, int i3) {
        return (i2 == 1 && i3 == 0) ? sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67)) : super.deleteSurroundingText(i2, i3);
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 67 ? this.A00.sendKeyEvent(keyEvent) : super.sendKeyEvent(keyEvent);
    }
}
