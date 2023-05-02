package com.obwhatsapp.yo.autoschedreply;

import android.content.Context;
import android.view.MenuItem;
import android.widget.Toast;
import c.d;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import java.io.File;

public final /* synthetic */ class n implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f706a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f707b;

    public /* synthetic */ n(Object obj, int i2) {
        this.f706a = i2;
        this.f707b = obj;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Context ctx;
        int i2 = this.f706a;
        String str = "photo_saved_to_gallery";
        Object obj = this.f707b;
        switch (i2) {
            case 0:
                ListMessages listMessages = (ListMessages) obj;
                int i3 = ListMessages.f667d;
                listMessages.getClass();
                new CustomAlertDialogBuilder(listMessages).setTitle((CharSequence) yo.getString("msg_store_confirm")).setPositiveButton(17039370, new d(listMessages, 6)).setNegativeButton(17039360, new x(6)).create().show();
                return false;
            case 1:
                String str2 = yo.mpack;
                ((MediaViewFragment) obj).prevon = false;
                Toast.makeText(yo.getCtx(), yo.getString("photo_saved_to_gallery"), 0).show();
                menuItem.setEnabled(false);
                return true;
            default:
                File file = (File) obj;
                String str3 = yo.mpack;
                try {
                    String replace = file.getAbsolutePath().replace("Private/", "P-");
                    File file2 = new File(replace);
                    String str4 = "ۜۡۤۤۗ۠ۥ۬ۘۤۘۘۧ۬ۦۡۖۙ۟ۡۧۘۖۡ۟";
                    while (true) {
                        switch (str4.hashCode() ^ -331501603) {
                            case -1260110541:
                                str4 = "۟ۘ۬ۙۦۜۘۙۤۡۘ۠ۚۧۨۚۘ";
                                continue;
                            case -1208611712:
                                if (file2.exists()) {
                                    str4 = "۠ۤۘۦۧۚۤۗۦۡ۟ۧۡۡۡۘۨ۠۬ۙۥۖۘۤۦۜۘ";
                                    break;
                                } else {
                                    str4 = "ۚۤۧ۫ۨۡۖۤۡۘۖۥۛۜۥۡۘ";
                                    continue;
                                }
                            case 9514282:
                                ctx = yo.getCtx();
                                str = "already_saved";
                                break;
                            case 1280832285:
                                utils.copyFile(file.getPath(), replace);
                                utils.forceScanMediaFile(file2);
                                ctx = yo.getCtx();
                                break;
                            default:
                                continue;
                        }
                    }
                    Toast.makeText(ctx, yo.getString(str), 0).show();
                } catch (Exception e2) {
                }
                menuItem.setEnabled(false);
                return true;
        }
    }
}
