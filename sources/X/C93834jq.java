package X;

import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4jq  reason: invalid class name and case insensitive filesystem */
public class C93834jq implements ActionMode.Callback {
    public final /* synthetic */ C46142Cp A00;

    public C93834jq(C46142Cp r1) {
        this.A00 = r1;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        String str;
        C46142Cp r2 = this.A00;
        int selectionStart = r2.getSelectionStart();
        int selectionEnd = r2.getSelectionEnd();
        if (selectionStart > selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.bold) {
            str = "*";
        } else if (itemId == R.id.italic) {
            str = "_";
        } else if (itemId == R.id.strikethrough) {
            str = "~";
        } else if (itemId != R.id.monospace) {
            return false;
        } else {
            str = "```";
        }
        Editable text = r2.getText();
        while (selectionEnd > selectionStart) {
            int i3 = selectionEnd - 1;
            if (!Character.isSpaceChar(text.charAt(i3))) {
                break;
            }
            selectionEnd = i3;
        }
        if (selectionEnd < text.length()) {
            char charAt = text.charAt(selectionEnd);
            if (!(Character.isSpaceChar(charAt) || charAt == '*' || charAt == '_' || charAt == '~')) {
                text.insert(selectionEnd, " ");
            }
        }
        text.insert(selectionEnd, str);
        while (selectionStart < selectionEnd && Character.isSpaceChar(text.charAt(selectionStart))) {
            selectionStart++;
        }
        if (selectionStart > 0) {
            char charAt2 = text.charAt(selectionStart - 1);
            if (!(Character.isSpaceChar(charAt2) || charAt2 == '*' || charAt2 == '_' || charAt2 == '~')) {
                text.insert(selectionStart, " ");
                selectionStart++;
            }
        }
        text.insert(selectionStart, str);
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        MenuInflater menuInflater = actionMode.getMenuInflater();
        if (menuInflater != null) {
            menuInflater.inflate(R.menu.menu0015, menu);
            return true;
        }
        Log.w("conversation-text-entry/action-mode-with-null-menu-inflater");
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
