package com.mod2.dp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.v;
import android.text.TextUtils;
import com.bbm.ah;
import com.bbm.bali;
import com.bbm.d.ay;
import com.bbm.ui.d.g;
import com.bbm.ui.gc;
import com.bbm.ui.gd;
import com.bbm.util.c.j;
import com.bbm.util.cc;
import com.bbm.util.hd;
import com.cropimage.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: ProfileIconHelper */
public final class giffer {
    public static void a(Activity activity, int i2, Uri uri) {
        f fVar = new f(uri);
        fVar.b = uri;
        fVar.c = true;
        activity.startActivityForResult(fVar.a(activity), i2);
    }

    public static void a(Context context, Bitmap bitmap) {
        if (context != null && bitmap != null) {
            try {
                String str = cc.a(context) + File.separator + bali.i().i() + ".jpg";
                int i2 = 100;
                Bitmap a2 = j.a(bitmap);
                while (a2 != null) {
                    File file = new File(str);
                    if (file.exists() && !file.delete()) {
                        ah.a("file delete failed: " + str, new Object[0]);
                        return;
                    } else if (!file.createNewFile()) {
                        ah.a("file creation failed: " + str, new Object[0]);
                        return;
                    } else {
                        if (!a2.compress(Bitmap.CompressFormat.JPEG, i2, new FileOutputStream(file))) {
                            return;
                        }
                        if (file.length() < 32768) {
                            bali.i().a(ay.l(str).a(true));
                            hd.a(context, context.getString(2131298443));
                            return;
                        }
                        i2 -= 10;
                    }
                }
            } catch (Exception e2) {
                ah.a(e2);
            }
        }
    }

    public static boolean a(Activity activity, int i2, Uri uri, boolean z2) throws IOException {
        if (j.d(activity, uri)) {
            String a2 = cc.a(activity, uri);
            File file = new File(a2);
            if (file.exists() && file.length() > 32768) {
                j.a(a2);
            }
            if (!z2) {
                bali.i().a(ay.l(a2));
                return true;
            }
            g a3 = g.a(true);
            a3.f(2131298228).f(2131298228).d(2131296692).c(2131297960);
            a3.l = new gc(a2, activity);
            a3.m = new gd(activity);
            a3.a((v) activity);
            return true;
        }
        a(activity, i2, uri);
        return false;
    }

    public static boolean a(Activity activity, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return false;
    }
}
