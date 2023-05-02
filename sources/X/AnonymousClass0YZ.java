package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.obwhatsapp.R;

/* renamed from: X.0YZ  reason: invalid class name */
public class AnonymousClass0YZ implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener {
    public final Preference A00;

    public AnonymousClass0YZ(Preference preference) {
        this.A00 = preference;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.A00;
        CharSequence A02 = preference.A02();
        if (preference.A0Q && !TextUtils.isEmpty(A02)) {
            contextMenu.setHeaderTitle(A02);
            contextMenu.add(0, 0, 0, R.string.str05fd).setOnMenuItemClickListener(this);
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.A00;
        Context context = preference.A05;
        CharSequence A02 = preference.A02();
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", A02));
        Toast.makeText(context, context.getString(R.string.str1d68, new Object[]{A02}), 0).show();
        return true;
    }
}
