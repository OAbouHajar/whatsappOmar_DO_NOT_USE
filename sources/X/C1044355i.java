package X;

import com.obwhatsapp.status.playback.widget.StatusEditText;

/* renamed from: X.55i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1044355i implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ StatusEditText A02;

    public /* synthetic */ C1044355i(StatusEditText statusEditText, int i2, int i3) {
        this.A02 = statusEditText;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void run() {
        StatusEditText statusEditText = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        int length = statusEditText.getText() != null ? statusEditText.getText().length() : 0;
        if (i2 <= length && i3 <= length) {
            statusEditText.setSelection(i2, i3);
        }
    }
}
