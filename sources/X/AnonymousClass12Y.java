package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Environment;
import android.view.WindowManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.12Y  reason: invalid class name */
public class AnonymousClass12Y implements C16240sh {
    public final C16040sK A00;
    public final C16200sd A01;
    public final C16190sc A02;
    public final AnonymousClass12W A03;
    public final C16980tz A04;
    public final C16260sj A05;
    public final C18790xG A06;
    public final AnonymousClass12X A07;
    public final C16990u0 A08;
    public final AnonymousClass12V A09;

    public AnonymousClass12Y(C16040sK r1, C16200sd r2, C16190sc r3, AnonymousClass12W r4, C16980tz r5, C16260sj r6, C18790xG r7, AnonymousClass12X r8, C16990u0 r9, AnonymousClass12V r10) {
        this.A04 = r5;
        this.A09 = r10;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
        this.A07 = r8;
    }

    public boolean A00(C16960tx r19) {
        String obj;
        C16190sc r4 = this.A02;
        C16960tx r0 = C16960tx.A08;
        File A022 = r4.A02();
        C16960tx r15 = r19;
        if (r15 == r0) {
            obj = "wallpaper.bkup";
        } else {
            StringBuilder sb = new StringBuilder("wallpaper.bkup.crypt");
            sb.append(r15.version);
            obj = sb.toString();
        }
        File file = new File(A022, obj);
        List A082 = C40691uX.A08(C16960tx.A06, C16960tx.A00());
        File file2 = new File(r4.A02(), "wallpaper.bkup");
        ArrayList A072 = C40691uX.A07(file2, A082);
        C40691uX.A0D(file2, A072);
        Iterator it = A072.iterator();
        while (it.hasNext()) {
            File file3 = (File) it.next();
            if (!file3.equals(file) && file3.exists()) {
                AnonymousClass1XI.A0O(file3);
            }
        }
        Context context = this.A04.A00;
        File file4 = new File(context.getFilesDir(), "wallpaper.jpg");
        if (!file4.exists()) {
            return true;
        }
        File parentFile = file.getParentFile();
        AnonymousClass00B.A06(parentFile);
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (!this.A05.A0F(Environment.getExternalStorageState())) {
            StringBuilder sb2 = new StringBuilder("wallpaper/backup/sdcard_unavailable ");
            sb2.append(Environment.getExternalStorageState());
            Log.i(sb2.toString());
            return false;
        }
        try {
            AnonymousClass12V r02 = this.A09;
            C16040sK r8 = this.A00;
            C18790xG r12 = this.A06;
            C40971uz A012 = C40951ux.A01(r8, (C40961uy) null, this.A01, this.A03, r12, this.A07, this.A08, r15, r02, file);
            if (!A012.A04(context)) {
                Log.e("wallpaper/backup/failed to prepare for backup");
                return false;
            }
            A012.A03((C17000u1) null, file4);
            return true;
        } catch (Exception e2) {
            Log.w("wallpaper/backup/error ", e2);
            return false;
        }
    }

    public boolean A5J() {
        return A00(C40691uX.A06(this.A01));
    }

    public String AA3() {
        return "wallpaper-v2";
    }

    public boolean Aca(Context context) {
        C16960tx r10;
        String str;
        C16190sc r4 = this.A02;
        List A082 = C40691uX.A08(C16960tx.A06, C16960tx.A00());
        File file = new File(r4.A02(), "wallpaper.bkup");
        ArrayList A072 = C40691uX.A07(file, A082);
        C40691uX.A0D(file, A072);
        if (!A072.isEmpty()) {
            File file2 = (File) A072.get(0);
            if (file2.exists()) {
                File file3 = new File(context.getFilesDir(), "wallpaper.jpg");
                File file4 = new File(context.getFilesDir(), "wallpaper.bkup");
                try {
                    int A012 = C40691uX.A01(file2.getName(), "wallpaper.bkup");
                    if (A012 <= 0 || (r10 = C16960tx.A02(A012)) == null) {
                        r10 = C16960tx.A08;
                    }
                    AnonymousClass12V r11 = this.A09;
                    C41021v4 A013 = C40951ux.A01(this.A00, (C40961uy) null, this.A01, this.A03, this.A06, this.A07, this.A08, r10, r11, file2).A01((C41011v3) null, this.A04, file4, 0, 0, false);
                    if (A013.A00 != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("wallpaper/restore/failed to restore ");
                        sb.append(A013);
                        str = sb.toString();
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file4.getAbsolutePath(), options);
                        int i2 = options.outWidth;
                        WindowManager A022 = AnonymousClass01V.A02(context);
                        Point point = new Point();
                        A022.getDefaultDisplay().getSize(point);
                        if ((context.getResources().getConfiguration().orientation == 1 ? point.x : point.y) != i2) {
                            str = "wallpaper/restore skipping final rename due to size mismatch";
                        } else if (!file4.renameTo(file3)) {
                            Log.e("wallpaper/restore could not rename tmp file");
                            return false;
                        } else {
                            Log.i("wallpaper/restore complete");
                            return true;
                        }
                    }
                    Log.w(str);
                    return false;
                } catch (Exception e2) {
                    Log.w("wallpaper/restore/ioerror ", e2);
                    return false;
                }
            }
        }
        Log.i("wallpaper/restore/no backups");
        return false;
    }
}
