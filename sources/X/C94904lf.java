package X;

import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.4lf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94904lf implements C12270k7 {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ DeleteAccountFeedback A01;

    public /* synthetic */ C94904lf(TextView textView, DeleteAccountFeedback deleteAccountFeedback) {
        this.A01 = deleteAccountFeedback;
        this.A00 = textView;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        DeleteAccountFeedback deleteAccountFeedback = this.A01;
        TextView textView = this.A00;
        deleteAccountFeedback.A01 = menuItem.getItemId();
        textView.setText(menuItem.getTitle());
        EditText editText = deleteAccountFeedback.A03;
        int i2 = deleteAccountFeedback.A01;
        int i3 = R.string.str0668;
        if (i2 == 2) {
            i3 = R.string.str0669;
        }
        editText.setHint(deleteAccountFeedback.getString(i3));
        return false;
    }
}
