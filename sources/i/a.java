package i;

import android.content.Context;
import android.content.DialogInterface;
import com.obwhatsapp.youbasha.backuprestore.BackupRestoreCopyingTask;
import com.obwhatsapp.youbasha.backuprestore.Constants;
import java.io.File;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f1756a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1757b;

    public /* synthetic */ a(Context context, int i2) {
        this.f1756a = i2;
        this.f1757b = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str = "۫ۦۨۙۤۘۘۤۗۛۚۨۤۦۘۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 390) ^ -935018589) {
                case -2092377108:
                    new BackupRestoreCopyingTask(this.f1757b, false, false, Constants.f952b, Constants.f951a).execute(new File[0]);
                    str = "ۜۘۙۛۤۧ۫ۧۖۙۖۧۘۖۘۧ";
                    break;
                case -1673933916:
                    str = "ۤۥۥۡ۬ۤۦۦۜۘ۬ۦۖۘۛۚ۬ۛۨۘۖۖۧ";
                    break;
                case -1249810373:
                case 568335214:
                    return;
                case 85044332:
                    str = "۬ۦ۫۬۬ۜۘۡۡۧۘ۬ۗ۫۠ۘ۟";
                    break;
                case 121144153:
                    new BackupRestoreCopyingTask(this.f1757b, false, false, Constants.f954d, Constants.f951a).execute(new File[0]);
                    str = "ۚ۫ۦۡۥۘۘۦۙ۬ۤۘۨ۠ۤۢ۫۟ۥۙ۟۠ۢۚ";
                    break;
                case 223265280:
                    switch (this.f1756a) {
                        case 0:
                            str = "۬ۚۗۙۢۖۨۘۡۘۨۛۡۨۘۡۘ۟۬ۨ۠ۨۢ";
                            break;
                        default:
                            str = "ۧۚۨ۠ۖ۬ۤۖۖ۬ۖ۫۬۬ۖۢۘۚ۬ۗۘ";
                            break;
                    }
                case 1871568317:
                    str = "ۜۜۥۘۖ۬ۢ۠ۖۖۘۥۙۙۗۘۜ";
                    break;
                case 2042136866:
                    str = "۟ۛ۟ۤۚۙۦۜۚۥۧۗ۠ۘۦۨۡۥۘ";
                    break;
            }
        }
    }
}
