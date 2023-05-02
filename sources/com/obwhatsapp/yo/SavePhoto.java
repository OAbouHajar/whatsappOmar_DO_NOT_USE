package com.obwhatsapp.yo;

import X.AnonymousClass2SR;
import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.profile.ViewProfilePhoto;

public class SavePhoto {
    public static void A00(ViewProfilePhoto viewProfilePhoto) {
        viewProfilePhoto.savePhoto();
    }

    public static void A0k(ViewProfilePhoto viewProfilePhoto, Menu menu) {
        try {
            MenuItem icon = menu.add(0, 20, 0, yo.getID("save_to_gallery", "string")).setIcon(AnonymousClass2SR.A02(viewProfilePhoto, yo.getDrawableId("ic_downloadstatus"), yo.getResColor("white")));
            icon.setShowAsAction(2);
            icon.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(viewProfilePhoto) {
                ViewProfilePhoto A00;

                {
                    this.A00 = r1;
                }

                public final boolean onMenuItemClick(MenuItem menuItem) {
                    SavePhoto.A00(this.A00);
                    return true;
                }
            });
        } catch (Exception unused) {
        }
    }
}
