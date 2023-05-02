package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.obwhatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.3CV  reason: invalid class name */
public class AnonymousClass3CV implements ActionMode.Callback {
    public final /* synthetic */ EncryptionKeyFragment A00;

    public AnonymousClass3CV(EncryptionKeyFragment encryptionKeyFragment) {
        this.A00 = encryptionKeyFragment;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipData primaryClip;
        int itemId = menuItem.getItemId();
        if (itemId != 16908322 && itemId != 16908337) {
            return false;
        }
        EncryptionKeyFragment encryptionKeyFragment = this.A00;
        EncBackupViewModel encBackupViewModel = encryptionKeyFragment.A01;
        AnonymousClass01V r7 = encBackupViewModel.A0C;
        ClipboardManager A0B = r7.A0B();
        if (!(A0B == null || (primaryClip = A0B.getPrimaryClip()) == null)) {
            AnonymousClass027 r6 = encBackupViewModel.A02;
            String str = (String) r6.A01();
            String lowerCase = primaryClip.getItemAt(0).getText().toString().replaceAll("\\s", "").toLowerCase(C13690nt.A0m(encBackupViewModel.A0E));
            if (!TextUtils.isEmpty(str) && lowerCase.length() != 64) {
                if (str != null) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append(str.replaceAll("\\s", ""));
                    lowerCase = AnonymousClass000.A0h(lowerCase, A0o);
                    if (lowerCase.length() > 64) {
                        C41631wI.A02(r7);
                    }
                }
            }
            r6.A0B(lowerCase);
        }
        encryptionKeyFragment.A1B((String) encryptionKeyFragment.A01.A02.A01());
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        menu.removeItem(16908355);
        return false;
    }
}
