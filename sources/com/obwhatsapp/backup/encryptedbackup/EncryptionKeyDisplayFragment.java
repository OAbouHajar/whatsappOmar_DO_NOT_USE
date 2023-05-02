package com.obwhatsapp.backup.encryptedbackup;

import X.C13680ns;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.base.WaFragment;

public class EncryptionKeyDisplayFragment extends WaFragment {
    public RelativeLayout A00;
    public EncBackupViewModel A01;

    public boolean A0p(MenuItem menuItem) {
        this.A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg);
        if (menuItem.getItemId() != 0) {
            return true;
        }
        EncBackupViewModel encBackupViewModel = this.A01;
        ClipboardManager A0B = encBackupViewModel.A0C.A0B();
        String str = (String) encBackupViewModel.A02.A01();
        if (A0B == null || str == null) {
            return true;
        }
        A0B.setPrimaryClip(ClipData.newPlainText(str, str));
        return true;
    }

    public void A18(Bundle bundle, View view) {
        this.A01 = C13680ns.A0T(this);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, R.string.str05fd);
        this.A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg_pressed);
    }
}
