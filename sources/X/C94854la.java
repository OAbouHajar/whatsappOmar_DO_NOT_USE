package X;

import android.view.KeyEvent;
import android.widget.TextView;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4la  reason: invalid class name and case insensitive filesystem */
public class C94854la implements TextView.OnEditorActionListener {
    public boolean A00;
    public final /* synthetic */ C42821yj A01;

    public C94854la(C42821yj r1) {
        this.A01 = r1;
    }

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (keyEvent != null) {
            keyEvent.getKeyCode();
        }
        if (i2 == 4) {
            this.A01.A0m(false);
            return true;
        } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        } else {
            if (this.A00) {
                this.A00 = false;
                return true;
            }
            C42821yj r3 = this.A01;
            if (((C14550pN) r3.A22).A09.A1W()) {
                r3.A0m(false);
            } else {
                int selectionStart = r3.A37.getSelectionStart();
                int selectionEnd = r3.A37.getSelectionEnd();
                if (selectionStart != r3.A37.length()) {
                    r3.A37.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), IOUtils.LINE_SEPARATOR_UNIX, 0, 1);
                } else {
                    r3.A37.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
            }
            this.A00 = true;
            return true;
        }
    }
}
