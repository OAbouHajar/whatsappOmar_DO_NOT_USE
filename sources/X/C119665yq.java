package X;

import android.view.View;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.5yq  reason: invalid class name and case insensitive filesystem */
public class C119665yq implements View.OnLongClickListener {
    public final /* synthetic */ FormItemEditText A00;

    public C119665yq(FormItemEditText formItemEditText) {
        this.A00 = formItemEditText;
    }

    public boolean onLongClick(View view) {
        FormItemEditText formItemEditText = this.A00;
        formItemEditText.setSelection(formItemEditText.getText().length());
        return true;
    }
}
