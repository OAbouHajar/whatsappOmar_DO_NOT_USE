package com.obwhatsapp.settings.chat.wallpaper;

import X.C005302h;
import X.C13680ns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;

public class WallpaperSetConfirmationDialogFragment extends Hilt_WallpaperSetConfirmationDialogFragment {
    public C005302h A1N() {
        C005302h A1N = super.A1N();
        TextView textView = (TextView) LayoutInflater.from(A0C()).inflate(R.layout.layout0615, (ViewGroup) null);
        textView.setText(R.string.str1b4b);
        A1N.setView(textView);
        View inflate = LayoutInflater.from(A0C()).inflate(R.layout.layout0616, (ViewGroup) null);
        C13680ns.A0L(inflate, R.id.wallpaper_confirmation_title_view).setText(R.string.str1b49);
        A1N.A01.A0B = inflate;
        return A1N;
    }
}
