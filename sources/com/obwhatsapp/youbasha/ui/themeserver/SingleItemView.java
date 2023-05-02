package com.obwhatsapp.youbasha.ui.themeserver;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.gson.internal.f;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import java.io.File;
import q.a;

public class SingleItemView extends Activity {

    /* renamed from: b  reason: collision with root package name */
    public static final int f1340b = others.getID("temp_img", "drawable");

    /* renamed from: c  reason: collision with root package name */
    public static final int f1341c = others.getID("ic_action_cancel", "drawable");

    /* renamed from: a  reason: collision with root package name */
    public a f1342a;

    static {
        String str = "ۜۦ۬ۤۦۥۘۤۢۛۘۖ۠۟۫ۦ۬۟ۜۧۦ۠ۦۘۡۛۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 421) ^ 877921196) {
                case 294012272:
                    str = "ۚ۟ۖۘۛ۠ۚۤۦۛۖۢۨ۠ۧۢۜ۠ۥۙ۫ۦۘ";
                    break;
                case 530114354:
                    str = "ۙۘ۬ۘۡۥۘ۟ۗ۬۫۫ۘۨۛۢۘ۬ۗ";
                    break;
                case 677511816:
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(others.getID("pic", "layout"));
        this.f1342a = new a(this);
        String stringExtra = getIntent().getStringExtra("url");
        ImageView imageView = (ImageView) findViewById(others.getID("seeeme", "id"));
        Toast.makeText(this, yo.getString("media_loading"), 0).show();
        File a2 = this.f1342a.a(stringExtra);
        String str = "ۛۖۨۘۙۢۦۜۖۤۡۗ۫ۦۛۤۥۜۛ";
        while (true) {
            switch (str.hashCode() ^ 626697930) {
                case -1081407498:
                    try {
                        imageView.setImageBitmap(BitmapFactory.decodeFile(a2.getPath()));
                        return;
                    } catch (Exception e2) {
                        return;
                    }
                case 3748574:
                    Picasso.get().load(stringExtra).networkPolicy(NetworkPolicy.NO_STORE, new NetworkPolicy[0]).placeholder(f1340b).error(f1341c).into(imageView, new f(this, imageView, stringExtra, 1));
                    return;
                case 281238040:
                    if (!a2.exists()) {
                        str = "ۤ۟ۦۘۘۡۜۙ۠ۜۘ۟ۥۥۦۦۗۤۤۨۘۢۘۚ۟ۡ۟ۛۢۥ";
                        break;
                    } else {
                        str = "ۨ۬۟ۘۧۦۘۡۡۗۥۧۡۘۤۡۧۘۨۤۨۘ۫ۛ۟ۙ۬ۗ";
                        break;
                    }
                case 964574313:
                    str = "ۘۛ۟ۚۥۤۡۜ۬ۢ۠ۛ۠ۗۜۘ";
                    break;
            }
        }
    }
}
