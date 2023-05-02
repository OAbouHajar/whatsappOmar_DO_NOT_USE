package q;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.webkit.URLUtil;
import com.obwhatsapp.youbasha.task.utils;
import java.io.File;
import java.io.FileOutputStream;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f2379b = utils.dbsf("aHR0cDovL3lvdGhlbWVzLnlvdXNlZmFsYmFzaGEuY29tL3NjcmVlbnMv", 1);

    /* renamed from: a  reason: collision with root package name */
    public final File f2380a;

    static {
        String str = "ۦۗۖۘ۫ۜۘۘۢ۫ۥۢۜۤۘۘ۠";
        while (true) {
            switch ((str.hashCode() ^ 301) ^ 1054836362) {
                case -870637431:
                    str = "ۢۨۦۥۥ۬ۨۜۦۘۧۚۜۘۗۥۤۙۛۦ۬ۨۜۘ";
                    break;
                case 1362721728:
                    return;
            }
        }
    }

    public a(Context context) {
        File file;
        String str = "ۤ۫۠ۘۥۨۡۤۖ۫ۙۥۧۦۤ۫۬۫۫ۙۘ";
        while (true) {
            switch (str.hashCode() ^ 1562498482) {
                case -1339570770:
                    file = context.getCacheDir();
                    break;
                case -397223680:
                    file = new File(Environment.getExternalStorageDirectory(), "/OBWhatsApp/Cache");
                    break;
                case -70922985:
                    str = "ۧۥ۫ۛۤۦۜۢۖۗۙۜۘۥۦۗۖۢۖ۫ۗۖۤ۟ۦ۠ۧ۬";
                    continue;
                case 1101518093:
                    if (Environment.getExternalStorageState().equals("mounted")) {
                        str = "۫ۦۘۛۜ۟ۙۙۨۘ۫ۚ۠۟ۘۥۘۚۨۖۘۜۦۘۥۛۢۢۥۢ";
                        break;
                    } else {
                        str = "۬ۙۨۘۡۙۛۚۢ۠ۜۖۨۘۘ";
                        continue;
                    }
            }
        }
        this.f2380a = file;
        String str2 = "ۛۖ۠ۨۘۧۘۥۗۦۘۡ۟۟۫۬ۦۤ۟ۢ";
        while (true) {
            switch (str2.hashCode() ^ -1098734350) {
                case -1461366972:
                    str2 = "ۦۢۡۚۡۘۦۡۨۘۗۛۧۧ۠ۤ۟ۦۡۗۜۡۘ";
                    break;
                case -1025521685:
                    if (this.f2380a.exists()) {
                        str2 = "ۡۖۗۜ۟۟۟ۘۘۤ۠ۢۙۦۨۤۙۨ";
                        break;
                    } else {
                        str2 = "ۥۖۛ۫۬ۚۨ۫ۢۗۦۨ۬ۨۧۘ";
                        break;
                    }
                case -206583573:
                    return;
                case 271703397:
                    this.f2380a.mkdirs();
                    return;
            }
        }
    }

    public final File a(String str) {
        int i2 = 0;
        String str2 = "۠۟ۡۡۖ۟۠ۙۗۘۥۜۘ۟ۥۘۨ۟ۖ۠ۢۥۢ۬ۤ";
        File file = null;
        File file2 = null;
        String str3 = null;
        while (true) {
            switch ((str2.hashCode() ^ 904) ^ -1107439614) {
                case -1994214348:
                    return new File(file2, String.valueOf(str.hashCode()));
                case -1509658423:
                    str2 = "ۤۢ۫ۘۘۧ۬ۨۨ۠ۥ۫۫ۤ۫ۤۖۧ۠ۚۘۤ۟ۨۘۜۦۧۘ";
                    break;
                case -996176313:
                    str3 = URLUtil.guessFileName(str, (String) null, (String) null);
                    str2 = "ۜۙۡۘ۠ۤۜۘۤۨۜۘ۫ۨۧۘۨۙۥۘۥۘ۫۟ۥۙۢۢۘۘ۟۬ۘ";
                    break;
                case -682963936:
                    i2 = a.a.f(new StringBuilder(), f2379b, str3).hashCode();
                    str2 = "ۛۨۡۗۙۜۘۦۨۦۥۡۥۘۚۙۡۤ۠ۖۘ۠ۖ۟ۚۗ۟ۧۚ";
                    break;
                case 338078772:
                    file = new File(file2, String.valueOf(i2));
                    str2 = "ۨ۟ۢۨۦۖۢۙۘۘۜۚ۫ۘۢۦ۠۟۫ۢۚۨۘ۠ۥۘۚۛۙ";
                    break;
                case 506884424:
                    return file;
                case 949445644:
                    String str4 = "ۦۧۦۘۦ۠۫ۗۤۗۚ۫ۙۛ۫ۤۛۖ۫ۗۡۦۘۙ";
                    while (true) {
                        switch (str4.hashCode() ^ -268405323) {
                            case -1507995341:
                                str2 = "ۨۙۖۘ۠۠ۜۘۚۛ۫ۢۗۦۡۗۦۘ";
                                continue;
                            case 456204185:
                                str4 = "ۤۨ۟ۘ۫ۡ۬ۡۘۡ۟ۖۘ۫ۦۘ۟ۧۙۨۧۤۙۚۢۡ۬";
                                break;
                            case 1599822384:
                                if (!file.exists()) {
                                    str4 = "ۤۢۗۖۗ۠ۘ۟ۧۤۚۘۧ۬ۘۥ۫ۖۡۨۗۦۜۧ";
                                    break;
                                } else {
                                    str4 = "ۜۨ۟۫ۡ۠۠ۧۜۘۢ۟ۨۘۜۡۤۤۡۡ";
                                    break;
                                }
                            case 1939365278:
                                str2 = "ۧۘۦۘۚۡۖۥۡۖۧۤۚۧۨۦۘ";
                                continue;
                        }
                    }
                    break;
                case 1246437697:
                    file2 = this.f2380a;
                    str2 = "۟ۜۖۢۚۘۜ۬ۦۚۙۥۘۙ۬ۗۦۜۗ";
                    break;
                case 2034689863:
                    str2 = "ۤۘ۟ۗۢۥۘۡۘ۠ۤۛۚۢۥۨۘۗۛۘۗۥۘۙۧۥۘ";
                    break;
            }
        }
    }

    public final void b(String str, Bitmap bitmap) {
        int hashCode = str.hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2380a);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(a.a.f(sb, File.separator, String.valueOf(hashCode)));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e2) {
        }
    }
}
