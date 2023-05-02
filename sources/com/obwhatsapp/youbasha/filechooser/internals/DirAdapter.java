package com.obwhatsapp.youbasha.filechooser.internals;

import X.AnonymousClass00T;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.yo;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DirAdapter extends ArrayAdapter<File> {

    /* renamed from: b  reason: collision with root package name */
    public static SimpleDateFormat f1045b;

    /* renamed from: a  reason: collision with root package name */
    public List f1046a;

    public DirAdapter(Context context, List<File> list, int i2) {
        super(context, i2, yo.getID("text1", "id"), list);
        a(list, (String) null);
    }

    public DirAdapter(Context context, List<File> list, int i2, int i3) {
        super(context, i2, i3, list);
        a(list, (String) null);
    }

    public DirAdapter(Context context, List<File> list, int i2, String str) {
        super(context, i2, yo.getID("text1", "id"), list);
        a(list, str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        r0 = "ۢ۠ۘۘ۟ۗۧۢۚۡۢۦۙۨۢۨۘۢۦۥۘۥۙۤ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r8, java.lang.String r9) {
        /*
            r7 = this;
            r2 = 0
            java.lang.String r0 = "ۨۗۙۚۦۖۘۛۥۥۘۜ۬۫۠ۖۦۖۚۙۛ۟ۦۘۨۤۡۘۡ۠ۦۘ"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0006:
            int r2 = r0.hashCode()
            r5 = 861(0x35d, float:1.207E-42)
            r6 = 369495835(0x16060f1b, float:1.08292E-25)
            r2 = r2 ^ r5
            r2 = r2 ^ r6
            switch(r2) {
                case -1938737650: goto L_0x001b;
                case -1930486393: goto L_0x0080;
                case -1865822836: goto L_0x0067;
                case -1825361739: goto L_0x008d;
                case -1200052722: goto L_0x003a;
                case -1186187954: goto L_0x0074;
                case -1091484894: goto L_0x0070;
                case -637863564: goto L_0x006b;
                case -241699103: goto L_0x0018;
                case -99273315: goto L_0x001e;
                case 459414723: goto L_0x0015;
                case 599871315: goto L_0x0060;
                case 1729138700: goto L_0x0089;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "۬ۖۡۘ۟ۖۦ۟ۘۧۨۘ۫ۗۡۘۨ۬ۦۘۧ۫ۤۥ۟ۖۘۖۖۚ"
            goto L_0x0006
        L_0x0018:
            java.lang.String r0 = "۠ۚ۠۬ۘۨۘۡۘۖ۠ۚ۟ۜۥۙ"
            goto L_0x0006
        L_0x001b:
            java.lang.String r0 = "ۢۘ۠ۤۛۥۘۥۤۦۘ۠۬ۖۘۛۙ۬"
            goto L_0x0006
        L_0x001e:
            r2 = 262367639(0xfa36997, float:1.6113713E-29)
            java.lang.String r0 = "ۨۚ۠ۧۛۥ۟ۙ۟۠ۥۘ۠ۚۛۨۥۦۚ۠ۧ۫ۗ۬ۗۛ"
        L_0x0023:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case 446444248: goto L_0x0037;
                case 704024363: goto L_0x0032;
                case 898282222: goto L_0x0085;
                case 1059021073: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0023
        L_0x002c:
            java.lang.String r0 = "ۤۛۜۘۙۚۨۘۢۨۤۢۨۨۘۚ۠ۥ"
            goto L_0x0023
        L_0x002f:
            java.lang.String r0 = "ۚۤۧۦۚۡۘۗۗ۠ۙ۫ۗۤۖۘ"
            goto L_0x0023
        L_0x0032:
            if (r9 == 0) goto L_0x002f
            java.lang.String r0 = "ۢۤۨۘۙ۟ۡۘۨۡۥۘۧ۬ۙۦ۟ۖۖۡۙۛۤۥۘ"
            goto L_0x0023
        L_0x0037:
            java.lang.String r0 = "ۗۜۨۘ۫۟ۧۗۚ۬ۤۜۥۘۦ۫ۘۘۥۢۛۙۖۡۢۛۢ"
            goto L_0x0006
        L_0x003a:
            r2 = -1937894926(0xffffffff8c7e11f2, float:-1.9572848E-31)
            java.lang.String r0 = "ۦۚ۠ۙۤۡۚۛۖۙۥۜۗۢۧۥۡۤۡۦۥۘۜ۠"
        L_0x003f:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1449187361: goto L_0x0048;
                case -1254331237: goto L_0x0085;
                case -1078971296: goto L_0x005a;
                case -1042817944: goto L_0x005d;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x003f
        L_0x0048:
            java.lang.String r0 = ""
            java.lang.String r5 = r9.trim()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "ۖۙۦ۫ۥۢ۫ۨۚ۬ۤۚۦۢۘ"
            goto L_0x003f
        L_0x0057:
            java.lang.String r0 = "ۜۚۖۛۗۛۦۦۛۧۗۗۗ۟ۗۗۚۢۨۛ۬۟ۨۨ"
            goto L_0x003f
        L_0x005a:
            java.lang.String r0 = "ۡۨۚۘۤۡۗۥۨۥۛۦۤۦۡۘۨۗۚ"
            goto L_0x003f
        L_0x005d:
            java.lang.String r0 = "ۧۥۛۧۚۡۘۜۨ۠۟ۥ۬۟ۙۨ"
            goto L_0x0006
        L_0x0060:
            java.lang.String r4 = r9.trim()
            java.lang.String r0 = "ۡۛ۟۟ۥ۬ۨ۟ۡۜۛۚۤۚۖۘ"
            goto L_0x0006
        L_0x0067:
            java.lang.String r0 = "ۥۥۢۥ۫ۡۘۧۢۥۘۤۛۧۖۚ۟ۥۧۨۘ"
            r3 = r4
            goto L_0x0006
        L_0x006b:
            java.lang.String r1 = "yyyy/MM/dd HH:mm:ss"
            java.lang.String r0 = "۫ۘۘ۠ۛۤۤۘۘۘ۠ۜۧۘۗۛۜۧۦۘۘۧۖۚۡۡۘۥۨ۬"
            goto L_0x0006
        L_0x0070:
            java.lang.String r0 = "ۚ۟ۖۘۨۜ۟۠ۛۡ۫ۜۢۧۖۥۡۢ"
            r3 = r1
            goto L_0x0006
        L_0x0074:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r0.<init>(r3, r2)
            f1045b = r0
            java.lang.String r0 = "ۥ۫ۦ۫ۨۜ۟۫ۦۖۖۨ۠ۨۖۜۙ۟ۦ۠ۖۘۧۛۨۘ"
            goto L_0x0006
        L_0x0080:
            r7.f1046a = r8
            java.lang.String r0 = "ۙ۠ۢۖۤۙۙۧ۟ۡۤ۠ۜۨۛۡ۫ۤۛۘۥ۬ۧۡۘ"
            goto L_0x0006
        L_0x0085:
            java.lang.String r0 = "ۢ۠ۘۘ۟ۗۧۢۚۡۢۦۙۨۢۨۘۢۦۥۘۥۙۤ"
            goto L_0x0006
        L_0x0089:
            java.lang.String r0 = "ۚ۟ۖۘۨۜ۟۠ۛۡ۫ۜۢۧۖۥۡۢ"
            goto L_0x0006
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.filechooser.internals.DirAdapter.a(java.util.List, java.lang.String):void");
    }

    @NonNull
    public View getView(int i2, View view, @NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = null;
        TextView textView = null;
        TextView textView2 = null;
        TextView textView3 = null;
        File file = null;
        SimpleDateFormat simpleDateFormat = null;
        Date date = null;
        SimpleDateFormat simpleDateFormat2 = null;
        Date date2 = null;
        Date date3 = null;
        SimpleDateFormat simpleDateFormat3 = null;
        String str = "ۜۗۘۥۥۡ۫ۛۗۡۘۘ۬ۦ۫ۤۚۨۘۤۡۤ۟۬ۥۘۡۤ۠";
        while (true) {
            switch ((str.hashCode() ^ 605) ^ -489665640) {
                case -2111833244:
                    str = "ۘ۫ۥۧۡۛۤۦۥۘۖۨۘۘۨۙۢ۟ۛۜۢۨۗۚۧ۫";
                    date3 = date2;
                    break;
                case -1765175468:
                    textView.setTextColor(ColorStore.getPrimaryTextColor());
                    str = "۬ۨۖۢۨۖۗۜۥۘۨۦۙۡۛۧ";
                    break;
                case -1712820132:
                    str = "ۢ۬ۗۢ۠ۦۘۜ۠ۙۚ۬ۧۨۥۖۘۗۖ";
                    break;
                case -1681893693:
                    return viewGroup2;
                case -1636713290:
                    str = "ۙۤ۠ۤ۫ۤۡۢۨۧۢۦۦۚۡۘ۟ۘۖۘۡۜۦۘۚۗۧۢۦۖۘ";
                    textView = (TextView) viewGroup2.findViewById(yo.getID("text1", "id"));
                    break;
                case -1623490810:
                    textView.setCompoundDrawablesWithIntrinsicBounds(AnonymousClass00T.A04(getContext(), yo.getID("ic_file", "drawable")), (Drawable) null, (Drawable) null, (Drawable) null);
                    str = "ۤ۟ۙۧۗۚۥۘۨۘۗۘۥۜۛۖ۠ۚۥۨۧۥ";
                    break;
                case -1330697616:
                    textView3.setVisibility(0);
                    str = "ۨۚۦۘۨۧۦ۫ۙ۬ۨۦۘۗ۠ۢ";
                    break;
                case -1309020941:
                    textView.setCompoundDrawablesWithIntrinsicBounds(AnonymousClass00T.A04(getContext(), yo.getID("ic_folder", "drawable")), (Drawable) null, (Drawable) null, (Drawable) null);
                    str = "۬ۤ۫ۧۖۦۘ۬ۙۘۥۘۥۘۦۘ۠ۧۨۙ";
                    break;
                case -1245890027:
                    str = "۠ۨ۬۟ۛ۟ۢۙ۬ۘۛۖۘۚۜۖۥۚۦۘۛ۬ۖۘۢ۠ۡ";
                    simpleDateFormat3 = simpleDateFormat;
                    break;
                case -1140252001:
                    str = "ۗۚ۫ۢ۫ۡۘۧ۟ۙ۟ۖۜۘۘۚۜۗۥۡۘۧۘۖ۠۬ۨۜۡۘ";
                    file = (File) this.f1046a.get(i2);
                    break;
                case -892241764:
                    textView2.setText("");
                    str = "۬ۨۚۚۤ۫ۙۜۥۜۗۥ۬ۦۡۘ۟۫ۤۘۡۘ۠ۛۧ۟ۨۧۘ";
                    break;
                case -636324137:
                    str = "ۥۦۜ۟ۨ۬ۙۤۚۦ۬ۦۘ۟ۥۡۘۢۚۛۧۖۛۢۛۥ";
                    simpleDateFormat3 = simpleDateFormat2;
                    break;
                case -518240376:
                    simpleDateFormat = f1045b;
                    str = "ۥ۫ۦۘۛۦۧۜۘۘۨۦۙ۬۠ۛ۫ۦۘ۫۬ۖ";
                    break;
                case -434890636:
                    String str2 = "۫۟۫ۚۗ۟ۛۖۧۘۤۦ۫ۨۥۚ";
                    while (true) {
                        switch (str2.hashCode() ^ 1288373782) {
                            case -221321539:
                                if (viewGroup2 != null) {
                                    str2 = "ۙۢۨۢۡۜۘۙۡۜۘ۬ۦۘۜۢۙۨۡۘۗۦۨ۬۫ۥ۫۠ۥ";
                                    break;
                                } else {
                                    str2 = "ۢ۠ۧۡۦۨۦ۟ۧ۟ۥۚۜۙۜۘ";
                                    break;
                                }
                            case 452278465:
                                str = "ۦۦۡۘۥۘۢۗۛ۟ۖۘۦۢۨۘ۫ۡۜۘ۠۠ۨۘ";
                                continue;
                            case 1291489839:
                                str2 = "ۚۤۢۡۗۥۘۛۚۘ۫ۡۡ۟ۨۦۧۤۜۘۨۥۧۢۛ۬۟ۨ۟";
                                break;
                            case 1756732188:
                                str = "۬ۙ۫ۖۖۘۦۙۙۗ۬ۨۗۥۘۘۚ۬ۧۙۦ";
                                continue;
                        }
                    }
                    break;
                case -428242699:
                    str = "ۖۡۥۡۥۗۨۙۤ۫ۙۨۡۧۨۘۗۘۡۘ";
                    date3 = date;
                    break;
                case -187140244:
                    str = "ۦۖۘۘۚۗۙۢۤۖ۬۬ۖۛۡۧۘۖۨۧۘ";
                    break;
                case -68430466:
                    str = "ۘۤۜۘ۟ۗۖۨۦۧۘ۟ۦ۟۠ۨۘۖ۟۫ۨۗۧۢۡۡۘ";
                    break;
                case -25401250:
                    textView.setText(((File) this.f1046a.get(i2)).getName());
                    str = "ۨۖۨۘۤۡۡۘ۬ۡۘۙ۟ۘۘۜۦۥۘۗ۫ۡ۬ۢۡۚۘۨۙ۫";
                    break;
                case 173691072:
                    textView2.setTextColor(ColorStore.getPrimaryTextColor());
                    str = "ۚۛۘ۫۟ۥ۠ۛۢ۟ۖۘۥ۠ۥۥۥ۟ۖ۫ۜ";
                    break;
                case 283918125:
                    str = "ۙۖۘۖۘۙۡۛۚ۬۬ۗۧۜۨۘۢ۬ۨ۠ۤ۠ۡ۠ۦ";
                    viewGroup2 = (ViewGroup) super.getView(i2, view, viewGroup);
                    break;
                case 380540843:
                    str = "ۥۦۜ۟ۨ۬ۙۤۚۦ۬ۦۘ۟ۥۡۘۢۚۛۧۖۛۢۛۥ";
                    break;
                case 428221750:
                    String str3 = "ۧۘۙۢۗۦۢۚ۫ۜۥۨۢۛۚ۬ۛۧۥۧۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 1272380571) {
                            case -1151759767:
                                str = "۬ۤ۫ۧۖۦۘ۬ۙۘۥۘۥۘۦۘ۠ۧۨۙ";
                                continue;
                            case -513864265:
                                str = "ۡۘۢ۠ۧۚۡۗۖۘۥۘۚۛ۬ۗۘۦ";
                                continue;
                            case 1226812913:
                                if (((File) this.f1046a.get(i2)).getName().trim().equals("..")) {
                                    str3 = "ۘۥۨۘۦۚۥۘۧ۟ۦۛۡۨۘ۬ۗۦۘ۟ۢۖۘ۠۬ۜۥۤ۟";
                                    break;
                                } else {
                                    str3 = "۬ۦۡۡۖۡۘ۟ۦۢۧۡۖۢۚۖۘ";
                                    break;
                                }
                            case 2063554773:
                                str3 = "ۥۤۚ۠ۙۡۘۥۜ۟ۖۘۛ۫ۨۜۛۚ۠۬ۧۦۘۦۥۡۨۡۜ";
                                break;
                        }
                    }
                    break;
                case 467223244:
                    simpleDateFormat2 = f1045b;
                    str = "ۘۤۛۢۜۡۦۨۗۖۧۛۧۛۦۘۗۖۢۧ۟۟ۥۨۡۛ۫ۜۘ";
                    break;
                case 681147618:
                    str = "ۤۥۘۘ۬۟ۖۧۛۤOۦۘۦۘۡ۬ۨۛۢۨ۫ۧ۫";
                    break;
                case 715526518:
                    date2 = new Date(file.lastModified());
                    str = "ۖ۟ۖۘۘۤۤۡۙۘۘۘۖۛۘۥۧۘۖۡ";
                    break;
                case 857315778:
                    String str4 = "۫ۛۚۖ۟ۗ۠ۤۡۘۧۛۛۦۤۖۘۙ۫۫ۧۧۙ";
                    while (true) {
                        switch (str4.hashCode() ^ 1757036287) {
                            case -690533480:
                                str4 = "۟۠ۗۤۗۚ۠ۗۨۛۜۥ۫ۘۦ۬ۜۦۘۡۨۘ۫ۙ۬ۢۘۚ";
                                break;
                            case 362196983:
                                if (!file.isDirectory()) {
                                    str4 = "ۘۖ۫ۛۧۨۘۤۨ۟ۤۤۤۛۖۗ۠ۜۡۚۢۘۛۖ";
                                    break;
                                } else {
                                    str4 = "ۤۥۜۘ۫ۤۥۡۦۦۦ۫۠ۛۖۡۤۜۖۘۡۙ۟ۙ۫ۜۡۚۚ";
                                    break;
                                }
                            case 1490560047:
                                str = "ۨۘ۫ۦ۟ۖۘۜۜۥ۠ۢۥۘۥۥۚۗ۫ۛۡ۫ۥۘۦۛۧ";
                                continue;
                            case 1609313791:
                                str = "ۚۖۤۗۨ۠ۗۖ۟۫۫۟ۧۜ";
                                continue;
                        }
                    }
                    break;
                case 942163042:
                    textView3.setText(simpleDateFormat3.format(date3));
                    str = "ۤۥۘۘ۬۟ۖۧۛۤOۦۘۦۘۡ۬ۨۛۢۨ۫ۧ۫";
                    break;
                case 954091673:
                    date = new Date(file.lastModified());
                    str = "ۡۨ۬۟ۧۙۛۥ۬ۥ۟ۤۤۤۢ۫۠ۗۥۧۦ";
                    break;
                case 967057989:
                    str = "۟ۧۚۡۡۡۢۚۨۘۧۦۖۘۖۨۘۚ۟۬ۜۖۦۘ";
                    textView2 = (TextView) viewGroup2.findViewById(yo.getID("txt_size", "id"));
                    break;
                case 1161268522:
                    str = "ۜۡ۟۟۠ۘۘ۫۠ۜۧ۠ۙۤ۠۬ۢۦۥۙۢۧ";
                    break;
                case 1417198511:
                    textView3.setTextColor(ColorStore.getPrimaryTextColor());
                    str = "ۥۛۤۖۚۖۘۨۦۖۦۘۨ۠ۗۨۘۗۙۜۙۥۙۨ۟ۘ";
                    break;
                case 1438308492:
                    String str5 = "ۧۡ۟۠ۘۖۡۦۡۘ۫۬ۥۡۛۧۜۨۨۤ۟ۖۘ۫ۤۜۘۡۦۘۘ";
                    while (true) {
                        switch (str5.hashCode() ^ -1969794090) {
                            case -1767729501:
                                if (file != null) {
                                    str5 = "ۙۨۖۨۧۘۗۦۢۜۦ۬ۗۘۥۢۜۛۚ";
                                    break;
                                } else {
                                    str5 = "ۥۚۥۖۙ۟ۤۤۨۘۘۛ۫ۘۚۦ";
                                    break;
                                }
                            case -1456040410:
                                str = "ۜ۟ۜۜۢۡۘۚۛ۟۬ۗ۠ۙۚۥۘ۠ۖۢ";
                                continue;
                            case 1151610634:
                                str = "ۢۧۡۘۛۜ۬ۙۘۘۚۛۚ۟۫ۗ۫ۡۚۢۢۖۥۦۖ";
                                continue;
                            case 1208201486:
                                str5 = "ۖۜ۠ۗۚ۠ۖۧۘۛۗۦۜ۠۠ۗۡۨۘ";
                                break;
                        }
                    }
                    break;
                case 1442425378:
                    textView3.setVisibility(8);
                    str = "۟ۥۢ۠ۜ۟ۜۘۤۨۗۥۘۘۛۦۘۜ۟ۨۘ۬ۡ۫ۢۤۗ۫۬ۜۘ";
                    break;
                case 1514847521:
                    textView.setText(((File) this.f1046a.get(i2)).getName());
                    str = "ۛۡۛۤۥۚ۬ۥۖۛۥۘۙۤۥۚ۬ۦۡۛ۬";
                    break;
                case 1522513211:
                    str = "ۖۘۡۙۙۘۘ۠۫ۡۘۨۧۛۗۤۚۛۦ۬ۦۥۘ";
                    textView3 = (TextView) viewGroup2.findViewById(yo.getID("txt_date", "id"));
                    break;
                case 1581585071:
                    textView.setCompoundDrawablesWithIntrinsicBounds(AnonymousClass00T.A04(getContext(), yo.getID("ic_folder", "drawable")), (Drawable) null, (Drawable) null, (Drawable) null);
                    str = "۫۬ۛ۫ۗۤ۫ۛۗۛۜۨ۫ۦ";
                    break;
                case 1634512408:
                    textView2.setText(FileUtil.getReadableFileSize(file.length()));
                    str = "۬ۡۤ۠ۡۤۡۚ۫ۤۥۘۘۨۖۦۘۨۡ۟ۙۛۘۘ";
                    break;
                case 1933332776:
                    return null;
                case 2088922158:
                    textView.setText("..");
                    str = "ۜ۫ۘۘۖۘۜۧۖۘۘۤۛۙۙۜۘ۟ۦۖۘۦۤۖۘ";
                    break;
            }
        }
    }
}
