package com.obwhatsapp.youbasha.filechooser;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import c.d;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.r1;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.filechooser.internals.DirAdapter;
import com.obwhatsapp.youbasha.filechooser.internals.ExtFileFilter;
import com.obwhatsapp.youbasha.filechooser.internals.RegexFileFilter;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.a;

public class ChooserDialog implements AdapterView.OnItemClickListener, DialogInterface.OnClickListener {

    /* renamed from: j  reason: collision with root package name */
    public static final r1 f1034j = new r1(3);

    /* renamed from: k  reason: collision with root package name */
    public static final r1 f1035k = new r1(4);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1036a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public File f1037b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1038c;

    /* renamed from: d  reason: collision with root package name */
    public AlertDialog f1039d;

    /* renamed from: e  reason: collision with root package name */
    public ListView f1040e;

    /* renamed from: f  reason: collision with root package name */
    public Result f1041f = null;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1042g;

    /* renamed from: h  reason: collision with root package name */
    public FileFilter f1043h;

    /* renamed from: i  reason: collision with root package name */
    public String f1044i;

    public interface Result {
        void onChoosePath(String str, File file);
    }

    static {
        String str = "ۛۡ۠۬ۨۜۘۚۗۜ۬ۦۘۘ۠ۧ۠ۛۨۙۘۙ۟";
        while (true) {
            switch ((str.hashCode() ^ 28) ^ -999339183) {
                case -1233005288:
                    return;
                case -598174903:
                    str = "۠ۖۚۚۛۦۜۤۖ۠ۤۡ۟ۨۤ";
                    break;
                case -333876826:
                    str = "ۨۗۢۧ۬ۘۚ۠ۥۘۧۙۜۘۜۢۚۥ۟ۦۗۚۦۘۨۚۡۘۚۢۚ";
                    break;
            }
        }
    }

    public final DirAdapter a() {
        String str = "۬ۡۨۡۨۛۤۨۥۤۛۜۛۨۖۘۦۨۡ";
        ListView listView = null;
        DirAdapter dirAdapter = null;
        File[] fileArr = null;
        ArrayList arrayList = null;
        while (true) {
            switch ((str.hashCode() ^ 877) ^ 1237063379) {
                case -2136780463:
                    listView.setAdapter(dirAdapter);
                    str = "۟ۚ۠۠ۜۧۛۨۘۢۜۘۘۤۙۡۘۡۢۤ۫۬ۡۘۘ۟۫ۡۡ";
                    break;
                case -1712827019:
                    str = "ۧۡ۫ۨۖۜۘ۠۠ۚۜۚۗۧۥۘۜ۫ۧۘۡۖ";
                    break;
                case -1310631460:
                    str = "۫ۛۨۘۨۨ۬ۚۢۘۘۛۧ۠ۖۢۢۨۦۜۘۛۙۖۛۧ۠";
                    fileArr = this.f1037b.listFiles(this.f1043h);
                    break;
                case -1089674723:
                    arrayList.add(new File(".."));
                    str = "۠ۨۡۘۙ۫ۚۚۖۦۘۚۢۜۘ۠ۗۖۘ";
                    break;
                case -822807254:
                    String str2 = "ۨۜۥۘۘ۬۬ۚ۬ۥۨۡۖ۟ۥۥۡ۫ۤۗۥۙ۬";
                    while (true) {
                        switch (str2.hashCode() ^ -400700766) {
                            case -1621501035:
                                if (fileArr == null) {
                                    str2 = "۠ۜۧۘۖ۟ۥۘۛۢۧۨۥۡۚۘۖۖۘ۟ۢۧۡۘۘۗۘۖۢۖ";
                                    break;
                                } else {
                                    str2 = "ۘۗ۠ۗۥۖۥۨۘۨۗۖۙۘۘ۟ۗۙۦ۟۟ۨۨۨۘ";
                                    break;
                                }
                            case 430411645:
                                str = "۬ۥۖ۫ۖۚۢ۟ۡۘۙ۠ۚۧ۫ۨۨ۫ۘ";
                                continue;
                            case 677838679:
                                str2 = "۫ۧ۬ۥۖۢۛۡۖۘ۟۬ۡۘۨۙۤ۟۟ۖۘۖۛۛ۫۬ۥۘۛۖۦ";
                                break;
                            case 1835261611:
                                str = "ۢۨۗ۟ۤۘۜۤۡ۟۟ۗۙۘۦۨۙ۠ۘۤۚۙۘۢ";
                                continue;
                        }
                    }
                    break;
                case -599110030:
                    String str3 = "ۦۦۧۛۙۢۗۙ۠ۥۘۦۡۘ۠ۦۜۖۛۙۡۙۦ";
                    while (true) {
                        switch (str3.hashCode() ^ 774439485) {
                            case -2078696774:
                                if (this.f1037b.getParent() == null) {
                                    str3 = "ۘۧ۬ۖ۠ۢۙۧۘ۠ۢۙۗۙۢۛۛ۬۫ۢۧ";
                                    break;
                                } else {
                                    str3 = "ۗۤۤۧۖۜۘۗۖۢۥۘ۟ۤۨۡۘۨ۬ۛۙ۟ۦۘۦۡۧ";
                                    break;
                                }
                            case -1656291993:
                                str = "ۧ۠ۦۘۖۨ۟ۦۧۘۤۚۥۤۛۦۘ";
                                continue;
                            case 365039809:
                                str = "۠ۨۡۘۙ۫ۚۚۖۦۘۚۢۜۘ۠ۗۖۘ";
                                continue;
                            case 970444190:
                                str3 = "ۛۧۚۢ۠۫ۨۜۗ۠ۢۙۡ۬ۜۘۜۡۘۗ۫ۥ۠ۢۘۘ";
                                break;
                        }
                    }
                    break;
                case -67451572:
                    String str4 = "۟ۗۛۤۚ۟ۦ۬ۤۤۙۦۖۤۖۘۧۡۦۘۖۙ۬";
                    while (true) {
                        switch (str4.hashCode() ^ 261274777) {
                            case -1482026099:
                                if (listView == null) {
                                    str4 = "۬ۨ۟ۘ۠ۗۙۨۦۗۤۜۘ۠ۦۘۦۜۚ۠ۡۘ۫۬ۘۘ";
                                    break;
                                } else {
                                    str4 = "ۖ۬ۦۘ۬ۜ۟۫ۛۚۡۘ۫ۙۦۦۘۧ۠";
                                    break;
                                }
                            case 1343004043:
                                str = "۟ۚ۠۠ۜۧۛۨۘۢۜۘۘۤۙۡۘۡۢۤ۫۬ۡۘۘ۟۫ۡۡ";
                                continue;
                            case 1588822884:
                                str = "ۡ۬ۤ۠ۤۚ۠ۧۢۗۦۦ۫ۥۜۘ";
                                continue;
                            case 2111754896:
                                str4 = "ۗ۬ۛۖۡ۠ۙۨۥۖ۬ۜۘ۟۟ۚ۫۠ۙۘ۫ۦۤ۟ۨ";
                                break;
                        }
                    }
                    break;
                case -22086653:
                    Collections.addAll(arrayList, fileArr);
                    str = "۬ۥۖ۫ۖۚۢ۟ۡۘۙ۠ۚۧ۫ۨۨ۫ۘ";
                    break;
                case 343351466:
                    return dirAdapter;
                case 602965735:
                    listView = this.f1040e;
                    str = "ۘ۟۟ۥۙۡ۬ۘۤۗۘۥۘۗۧۖۘ۠ۙۜۘۖۦۢۘۖ";
                    break;
                case 1347871491:
                    str = "ۙۚ۟ۧۙۦۘ۠ۤ۟ۗ۠ۘۘۛۡ۠۫ۚۚۚۦۘ";
                    dirAdapter = new DirAdapter(this.f1038c, (List<File>) arrayList, yo.getID("li_row_textview", "layout"), this.f1044i);
                    break;
                case 1527214347:
                    str = "ۛۢۛۥۜۛۧۦۨۘۛۛ۬ۘۧۛۥۘ۠";
                    arrayList = this.f1036a;
                    break;
                case 1659144544:
                    Collections.sort(arrayList, new a());
                    str = "ۥۘۦۘۘۤۦ۟ۥۖۘ۟ۙۢۢۛۘ۠۬ۚۜ۟";
                    break;
                case 1709087536:
                    arrayList.clear();
                    str = "ۥ۬ۚۦ۟ۨۨۗۗۙ۟ۥ۠ۖۡۛ۟ۧ۫ۛۗ۠ۦ";
                    break;
            }
        }
    }

    public ChooserDialog build() {
        String str = "ۜۘۢۘۚۘۘۗۘۜۘۧۤۥۧۢۥ۟ۦۡۙۨ";
        ListView listView = null;
        AlertDialog alertDialog = null;
        CustomAlertDialogBuilder customAlertDialogBuilder = null;
        DirAdapter dirAdapter = null;
        while (true) {
            switch ((str.hashCode() ^ 458) ^ -929496559) {
                case -2007917836:
                    this.f1040e = listView;
                    str = "ۢۛۘۘۙۨ۬ۥۦ۫ۢۥۛۨۚۡ";
                    break;
                case -1252507455:
                    str = "ۛۡۨۘۧ۫ۜۘۜۗۘۘۛ۫ۜۜۥ۫ۖۢۧۜۦۖۘ";
                    alertDialog = customAlertDialogBuilder.create();
                    break;
                case -1231346618:
                    listView.setOnItemClickListener(this);
                    str = "ۖ۬ۧۦۥۡۖۢ۠ۛۘۦۢۘۘۜۙۘۡ۟ۜ";
                    break;
                case -1038979100:
                    customAlertDialogBuilder.setAdapter((ListAdapter) dirAdapter, (DialogInterface.OnClickListener) this);
                    str = "ۜۖۙۥۤ۠ۙۡۡۘۢ۫۬ۢۤۨ";
                    break;
                case -219413108:
                    listView = alertDialog.getListView();
                    str = "ۙ۫ۢۦۢۖۖۨۨۗ۠ۙ۟ۚۨۘ";
                    break;
                case -14419302:
                    customAlertDialogBuilder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new d(this, 8));
                    str = "ۢۖۥۛۖۡۘۤۚۙۖۛۦ۠۠ۚ";
                    break;
                case 445669698:
                    str = "ۡ۟ۘۙۨۥۥۘ۬ۘۢ۬ۥۦۢۚۤۧ۫ۥ۫ۚۖۘ";
                    dirAdapter = a();
                    break;
                case 643327417:
                    str = "ۦ۬ۘ۟ۦۜ۫ۘۗۧۤۤ۫ۚۥۧۤۡۘۢۗۘ";
                    break;
                case 664111882:
                    customAlertDialogBuilder.setTitle((CharSequence) "Choose file");
                    str = "ۨ۠ۖۘۥۗۖۘ۟ۗۙۛۢۗ۟ۖۡۘۛۥۧۧۧۧۨۖۢ";
                    break;
                case 908588187:
                    this.f1039d = alertDialog;
                    str = "۠۬ۢۡۢ۠۟ۛۤۙۙ۫ۧۛۖۘۢۡۘ";
                    break;
                case 1007176068:
                    return this;
                case 1240781954:
                    customAlertDialogBuilder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new x(11));
                    str = "ۢۡۨۥ۬ۘ۟۟ۨۘۚۨۙ۠ۨۢۛۡۨۘۗ۟۟";
                    break;
                case 1396472695:
                    str = "ۚۤۨۗۙۖۥۛۢۨۨۥۘۘ۟ۢ۟ۘ۟ۤۡۧۘۨۛۜۘ";
                    customAlertDialogBuilder = new CustomAlertDialogBuilder(this.f1038c);
                    break;
                case 1882410303:
                    String str2 = "ۘۛۙۘ۬ۦۨۡۖ۬۬ۨۘۗۜۤۙۦۜۘۚۖۧۡۤۛۥۢ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 1204921438) {
                            case -1418592235:
                                if (!this.f1042g) {
                                    str2 = "۟۟ۜۘۡۧۥۘۖۦۦۖۜۛۚۢۦۘۜۥۨ";
                                    break;
                                } else {
                                    str2 = "۬ۢۡۘۢۧۗۖۦ۟ۡۛ۠ۘ۫ۡۘۜۢۤۢۦۚۥۘۘۢۦۦۘ";
                                    break;
                                }
                            case -582281809:
                                str = "ۢۖۥۛۖۡۘۤۚۙۖۛۦ۠۠ۚ";
                                continue;
                            case 126724308:
                                str = "ۡۙ۬ۦۦۨ۫۟ۤ۫ۢۦۚۨۢ";
                                continue;
                            case 1920580611:
                                str2 = "۬ۛۙ۟ۜۘۘۤۦۤۥۦۘ۬ۨۧۦۘۡۘ۬ۙۖۤۦۡۘ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        String str = "ۜۥۥۘۤۗۛۧۢۥۨ۫ۘۘۢۢۦۙۚۜ";
        while (true) {
            switch ((str.hashCode() ^ 500) ^ 808479808) {
                case -2080502247:
                    str = "ۧۖۜۥۜۘۘۖۛۚۖ۫ۜۤ۠ۢۖۛ۟ۤ۫ۨۘ۠ۥۘ";
                    break;
                case -427939898:
                    str = "ۘۧۖۘ۟ۘۦ۫۠۫ۗۚۤ۟ۡ۟ۙۚۜۘۦۚ۬ۡۤ۟";
                    break;
                case 447316674:
                    str = "ۦۖۤ۫ۡۥۘۥۙۖۘۜ۟ۦۧۛۖۘۗۢۜۘ";
                    break;
                case 2067225027:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
        r1 = "۬ۦۛۤۦ۠ۘۛۜۘۗۢۨ۠ۨۨۘۡۥ۬ۙۖۨۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
        /*
            r7 = this;
            r3 = 0
            java.lang.String r0 = "ۥۡۡۛۧۘۥۢۧۚۛ۫ۖ۟ۢ۬ۗۘ"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
        L_0x0007:
            int r0 = r1.hashCode()
            r3 = 935(0x3a7, float:1.31E-42)
            r6 = 1366988245(0x517a95d5, float:6.7265974E10)
            r0 = r0 ^ r3
            r0 = r0 ^ r6
            switch(r0) {
                case -2028196973: goto L_0x0047;
                case -2024731506: goto L_0x0026;
                case -1952891304: goto L_0x0103;
                case -1677745114: goto L_0x00a1;
                case -1677273299: goto L_0x0149;
                case -1617874152: goto L_0x001a;
                case -1280176306: goto L_0x0137;
                case -1179229493: goto L_0x002a;
                case -919794945: goto L_0x00ae;
                case -870832031: goto L_0x0153;
                case -487063092: goto L_0x014e;
                case -120863159: goto L_0x0022;
                case 294914091: goto L_0x00dc;
                case 401555187: goto L_0x006f;
                case 536474587: goto L_0x00fc;
                case 662863104: goto L_0x0079;
                case 876757490: goto L_0x012d;
                case 1326440314: goto L_0x00b5;
                case 1484000506: goto L_0x001e;
                case 1530600636: goto L_0x004e;
                case 1607395583: goto L_0x0153;
                case 1647222706: goto L_0x0121;
                case 2023815529: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۜۦۧ۟۠ۛۡۨۘۘۚۥۚۜۛۖۥۛۚۥۧۨۘ"
            r1 = r0
            goto L_0x0007
        L_0x001a:
            java.lang.String r0 = "۟ۗۛ۠ۤۡۘۦۡۜۡۦۖ۬ۚۗۚ۟ۦۡۗۤ"
            r1 = r0
            goto L_0x0007
        L_0x001e:
            java.lang.String r0 = "ۥۜ۫ۨۢ۬۫ۘۘۥۡۜۘۡۡ۠ۡۥۜۘ"
            r1 = r0
            goto L_0x0007
        L_0x0022:
            java.lang.String r0 = "ۘۢۡۘ۬ۚۧۜۨۚۤ۫ۢۡۙۙ"
            r1 = r0
            goto L_0x0007
        L_0x0026:
            java.lang.String r0 = "ۛۦ۟ۡۡۡ۬ۨۦۘۛ۫ۧۛۜۘۘ۬ۜۦ"
            r1 = r0
            goto L_0x0007
        L_0x002a:
            r1 = -1090355817(0xffffffffbf027d97, float:-0.50972885)
            java.lang.String r0 = "ۙ۠ۧۜۦۖۘۗۥ۟ۛ۬ۥ۬ۥ۬"
        L_0x002f:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1401497325: goto L_0x0038;
                case -1294029174: goto L_0x0040;
                case -334068265: goto L_0x014e;
                case -267593118: goto L_0x0043;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x002f
        L_0x0038:
            if (r10 < 0) goto L_0x003d
            java.lang.String r0 = "ۙۤۙۧۗۤ۫ۙۗۥۧۥۘۚ۫ۜۘۘۛۥ"
            goto L_0x002f
        L_0x003d:
            java.lang.String r0 = "۫ۖۛۚۖ۫۬ۖ۫ۤۨۛ۬ۜۧۢۨۨ"
            goto L_0x002f
        L_0x0040:
            java.lang.String r0 = "۬۠ۥ۠ۗۥۥ۬ۥ۠ۖۜۧۥۡۘ۫ۜۥۘ۫۟ۜۘۤ۬۫"
            goto L_0x002f
        L_0x0043:
            java.lang.String r0 = "۠ۘۥۘ۟ۛۨۘۛۧۖۘۢۚۘ۫۠ۡۘ۠ۖۘۥۘ۟ۙۘۧۘ"
            r1 = r0
            goto L_0x0007
        L_0x0047:
            java.util.ArrayList r3 = r7.f1036a
            java.lang.String r0 = "۠ۚ۫۟ۚۢۤۘۧۘ۬ۦۖۘۦۛۖۘ"
            r1 = r0
            r5 = r3
            goto L_0x0007
        L_0x004e:
            r1 = -1530034131(0xffffffffa4cd882d, float:-8.913527E-17)
            java.lang.String r0 = "ۢۚۢۢ۟ۗۢۘۤۗۘۚۢۘ۬ۗۖۜۖۜۧۦۘۤۛۘ"
        L_0x0053:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1884470371: goto L_0x0063;
                case -1549276717: goto L_0x005c;
                case 699872901: goto L_0x006c;
                case 2081609993: goto L_0x013f;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0053
        L_0x005c:
            java.lang.String r0 = "ۙۡۛ۠ۨۜۡۧۤۢۦۘ۟ۦۚۧۖۥۘ"
            r1 = r0
            goto L_0x0007
        L_0x0060:
            java.lang.String r0 = "ۛۤۤۤۘۧۘۨۤۢۚۚۨۖۧۧۖۜۜۘ۠ۗۡۘ"
            goto L_0x0053
        L_0x0063:
            int r0 = r5.size()
            if (r10 < r0) goto L_0x0060
            java.lang.String r0 = "ۧۢ۟۟ۚۗ۠ۛ۬ۧۚۡۘۡ۫ۨۘۨۛۗۡۗۥ"
            goto L_0x0053
        L_0x006c:
            java.lang.String r0 = "ۧۨۤ۟ۦۡۖۘ۬۬ۥۨۘۧۙ۬"
            goto L_0x0053
        L_0x006f:
            java.lang.Object r0 = r5.get(r10)
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = "ۜۖۨۙۦۥ۟۫۬ۛۗۢ۟ۢ۠ۨۡۘ"
            r4 = r0
            goto L_0x0007
        L_0x0079:
            r1 = -1702344287(0xffffffff9a8849a1, float:-5.6367236E-23)
            java.lang.String r0 = "ۢۥۖۘۥۙۧۦۧۘۦۦۜۜ۟ۛ۟ۤۜ۟ۜۘ"
        L_0x007e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case 65294231: goto L_0x0144;
                case 1722973923: goto L_0x009c;
                case 1877266773: goto L_0x0099;
                case 2074157544: goto L_0x0087;
                default: goto L_0x0086;
            }
        L_0x0086:
            goto L_0x007e
        L_0x0087:
            java.lang.String r0 = r4.getName()
            java.lang.String r3 = ".."
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "ۡ۬ۥۢۘۥۘ۫۬ۜۛۙۦۘۡۥۥ۟ۥۢۛۜۘ"
            goto L_0x007e
        L_0x0096:
            java.lang.String r0 = "۠ۘۦۘۗۖۥۘۛۤۢۢۖۨۘۛۙۡۡۡۘ۠۫ۥۘ۫ۥۤ"
            goto L_0x007e
        L_0x0099:
            java.lang.String r0 = "ۜ۬ۖۘۧۙ۠ۙ۫ۡۘۨۦۤۢۗۨ۫ۤ۟ۡۧۜ"
            goto L_0x007e
        L_0x009c:
            java.lang.String r0 = "ۡۦ۠ۗۡۚۚۛۧۘ۟ۢۧۨۥۤ۬ۙۖۢۚۚۨۙ"
            r1 = r0
            goto L_0x0007
        L_0x00a1:
            java.io.File r0 = r7.f1037b
            java.io.File r0 = r0.getParentFile()
            r7.f1037b = r0
            java.lang.String r0 = "ۡۨۧۘۨۨۡ۟ۖۨۘۦۜ۟ۗۗۥۙۤۦۘۛۛۛ۬ۚۧۘ۠ۨۘ"
            r1 = r0
            goto L_0x0007
        L_0x00ae:
            r7.f1037b = r4
            java.lang.String r0 = "ۥۛۧۗۦۜۜۛۢۛۧ۫ۥۦ۠ۤۢ۠ۢۗۘ"
            r1 = r0
            goto L_0x0007
        L_0x00b5:
            r1 = -176804614(0xfffffffff5762cfa, float:-3.1206476E32)
            java.lang.String r0 = "ۖۜۦ۟۫ۗۚۧۡۘۤۦۘۚۗۜ۟ۦۛۧ۫ۢۢۚۨ۫۠"
        L_0x00ba:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case 11383791: goto L_0x00c3;
                case 598446265: goto L_0x00cb;
                case 732460807: goto L_0x00d7;
                case 1117724560: goto L_0x00d4;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            goto L_0x00ba
        L_0x00c3:
            java.lang.String r0 = "۬ۦۛۤۦ۠ۘۛۜۘۗۢۨ۠ۨۨۘۡۥ۬ۙۖۨۘ"
            r1 = r0
            goto L_0x0007
        L_0x00c8:
            java.lang.String r0 = "ۡۨۨۘۚۡۧۧۘۘۘۙۜ۠ۖۨ"
            goto L_0x00ba
        L_0x00cb:
            boolean r0 = r4.isDirectory()
            if (r0 != 0) goto L_0x00c8
            java.lang.String r0 = "۠ۚۜۘۡۜۥ۟۬ۨۗۨ۠ۜۖۗۜۜ۬ۡ۟۟"
            goto L_0x00ba
        L_0x00d4:
            java.lang.String r0 = "ۦۨۥۘۗۜۦۘۡۙۗۖۘۖۢۖۥۗۧۘۨۙۦ۠ۚۜۨ۫ۥ"
            goto L_0x00ba
        L_0x00d7:
            java.lang.String r0 = "۫ۤۚۜ۫ۥۧۡ۟ۙۡ۟ۗۤ۠ۤۤۜۘۙۢۛۜۗۜۨۙۡ"
            r1 = r0
            goto L_0x0007
        L_0x00dc:
            r1 = 70218434(0x42f72c2, float:2.0623845E-36)
            java.lang.String r0 = "ۤۚۛۡ۟ۨۘۡۢۛ۠۠۠ۛۨۙ"
        L_0x00e1:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1099413492: goto L_0x00f9;
                case -1049848719: goto L_0x00f2;
                case 663401322: goto L_0x00c3;
                case 1172039236: goto L_0x00ea;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            goto L_0x00e1
        L_0x00ea:
            java.lang.String r0 = "ۥۚۦۘۤۚۤ۫۫ۦۘۦ۟ۙۧ۫ۨۦ"
            r1 = r0
            goto L_0x0007
        L_0x00ef:
            java.lang.String r0 = "ۧ۠ۤ۟۟۬ۚۤۡۘۜۢ۬ۡۤۨۘ۠۟۠ۤۚۚۙ۟ۦۛۦۡۘ"
            goto L_0x00e1
        L_0x00f2:
            boolean r0 = r7.f1042g
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "ۛۤۜۘۨۨۗۗۨۗۡۧۤۧۛۙ۫ۜۚ"
            goto L_0x00e1
        L_0x00f9:
            java.lang.String r0 = "ۡۘ۟ۛۨۦۤۜۘۖۨۖۤ۫ۢ"
            goto L_0x00e1
        L_0x00fc:
            com.obwhatsapp.youbasha.filechooser.ChooserDialog$Result r2 = r7.f1041f
            java.lang.String r0 = "ۡۜۡۥۗۨۘۢ۟ۛۙۦ۫۫۠ۤۜۖۧۘۨ۬۠"
            r1 = r0
            goto L_0x0007
        L_0x0103:
            r1 = -1162386731(0xffffffffbab762d5, float:-0.0013991246)
            java.lang.String r0 = "ۡۘۘۡۦ۫۫ۥۦۘ۬ۨۜۖۨۘۦۜۘۘۨۙۦۢۚۦۦ۫"
        L_0x0108:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -596072618: goto L_0x011c;
                case -591453052: goto L_0x00c3;
                case 571283294: goto L_0x0117;
                case 1842557316: goto L_0x0111;
                default: goto L_0x0110;
            }
        L_0x0110:
            goto L_0x0108
        L_0x0111:
            java.lang.String r0 = "ۨۚۧ۫۫۟۟ۨ۫ۚۘۘۥۦۦ"
            goto L_0x0108
        L_0x0114:
            java.lang.String r0 = "ۦۨ۬ۜۡۥۜۧۢۙۖۘۥۦۘۧ۫ۨۘ"
            goto L_0x0108
        L_0x0117:
            if (r2 == 0) goto L_0x0114
            java.lang.String r0 = "ۙۤۡۡۥ۟۫ۢۖۘۘۛۡ۬۫ۡۘۖۧۜۖ۬ۜ"
            goto L_0x0108
        L_0x011c:
            java.lang.String r0 = "ۨۦ۬ۤۗۙۚۢۜۨۚ۟ۤ۫ۙۦۡۜ"
            r1 = r0
            goto L_0x0007
        L_0x0121:
            java.lang.String r0 = r4.getAbsolutePath()
            r2.onChoosePath(r0, r4)
            java.lang.String r0 = "ۤ۫ۦ۟۟ۖۚۧۡۤۨۡۖۘۙۦۛۢ۠ۙۥۚ۬ۥۘ۟ۥۡ"
            r1 = r0
            goto L_0x0007
        L_0x012d:
            android.app.AlertDialog r0 = r7.f1039d
            r0.dismiss()
            java.lang.String r0 = "ۥۤ۫ۚ۠۠ۦۜ۠ۡۥۙۥۧۦۘ"
            r1 = r0
            goto L_0x0007
        L_0x0137:
            r7.a()
            java.lang.String r0 = "ۥۤۧۦۧۥۧۢۚۚۜ۟ۛ۟ۥۘۦۢۦۢۡ۫"
            r1 = r0
            goto L_0x0007
        L_0x013f:
            java.lang.String r0 = "ۖۙۜۚۘ۟ۖ۟ۖۧۡۖ۬ۙۥ"
            r1 = r0
            goto L_0x0007
        L_0x0144:
            java.lang.String r0 = "ۢۛۧۚۢۦۘۦۜۤۧۡۨ۟ۗۡۚ۠ۡۘ۬ۛۚ"
            r1 = r0
            goto L_0x0007
        L_0x0149:
            java.lang.String r0 = "ۥۛۧۗۦۜۜۛۢۛۧ۫ۥۦ۠ۤۢ۠ۢۗۘ"
            r1 = r0
            goto L_0x0007
        L_0x014e:
            java.lang.String r0 = "ۥۤۧۦۧۥۧۢۚۚۜ۟ۛ۟ۥۘۦۢۦۢۡ۫"
            r1 = r0
            goto L_0x0007
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.filechooser.ChooserDialog.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r0 = "ۨۖۨۘ۫۫ۜ۬ۤ۠۫۟ۦۘۚۖۗۚۧۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.obwhatsapp.youbasha.filechooser.ChooserDialog show() {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = "ۧ۠ۘۧۨۛۗۛ۫ۦۚۛۗۙۘۤۤۘۘۥۚۥۖۛۖۘ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 347(0x15b, float:4.86E-43)
            r4 = 797778582(0x2f8d2296, float:2.5672325E-10)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -2093871354: goto L_0x0015;
                case -1651915187: goto L_0x005a;
                case -1221673233: goto L_0x0036;
                case -1069359012: goto L_0x001a;
                case 296994941: goto L_0x0054;
                case 309528916: goto L_0x0065;
                case 2106568785: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "ۜۦۚۘۦۘ۠ۙ۬ۛۧۜۘۦۚ۠"
            goto L_0x0003
        L_0x0015:
            android.app.AlertDialog r1 = r5.f1039d
            java.lang.String r0 = "ۨۗۨ۠۬ۨ۟ۜۚۘۜۘ۠ۢۤۛۤ۟ۤۛۖ"
            goto L_0x0003
        L_0x001a:
            r2 = 359506429(0x156da1fd, float:4.7989555E-26)
            java.lang.String r0 = "ۛۜۨۘۛۦۦۗ۠ۖۘۚۡۥۥۛۥۘۥ۬ۖۘۤۡۨۘ"
        L_0x001f:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1570809091: goto L_0x0062;
                case -1225290047: goto L_0x0033;
                case -852889931: goto L_0x0028;
                case 1419073713: goto L_0x0030;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x001f
        L_0x0028:
            if (r1 == 0) goto L_0x002d
            java.lang.String r0 = "ۚۙۡۘ۟ۘۜۘ۫ۖ۟۠۫۟۫ۙۥ"
            goto L_0x001f
        L_0x002d:
            java.lang.String r0 = "ۢۧۦۡ۠ۙۘۤ۟ۚۡۨۘۢۤۡۥۦۧۘ"
            goto L_0x001f
        L_0x0030:
            java.lang.String r0 = "ۨ۟ۜۜ۬ۖۘۙۦۢۡۡۖۘۦۨۛۤۦۘۦۚۨۨۙۗۥ۟ۥ"
            goto L_0x001f
        L_0x0033:
            java.lang.String r0 = "۫۫ۡۘۦۢۥۡۤۧۥ۠ۥۘ۠ۧ۬ۗۛ۫"
            goto L_0x0003
        L_0x0036:
            r2 = 641604114(0x263e1a12, float:6.5954824E-16)
            java.lang.String r0 = "ۖ۠ۨۘۤۚۥۘ۬۬ۡۘۨۗۘۢۦۦۘۢۗۙ۬ۥ۫ۡۘ۟ۙ"
        L_0x003b:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -191116810: goto L_0x0044;
                case 698093035: goto L_0x0062;
                case 1040448858: goto L_0x004e;
                case 1068608516: goto L_0x0051;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x003b
        L_0x0044:
            android.widget.ListView r0 = r5.f1040e
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "۬ۘۘۜۖۧۘۖۛ۫۬ۨۦۧۥۜۘۡۙۗ۟ۧۦۙۤۧ"
            goto L_0x003b
        L_0x004b:
            java.lang.String r0 = "ۗۥۥۘ۬ۜ۫ۖۤۦۜ۫ۘۨۘۦۚۢۛۘۡۦ۬ۗ۟ۘۜۜ"
            goto L_0x003b
        L_0x004e:
            java.lang.String r0 = "ۦۤۡۘ۟ۨۧۗۘۖۘۘۗۘۘۚۜ۠ۗۖۨۘ۫ۤۦۨۦۡ۬ۢۤ"
            goto L_0x003b
        L_0x0051:
            java.lang.String r0 = "ۤۥۖۘۗۚۜۚ۠۫۬۬ۢۖۢۖۘ۬ۨۦۘۙۨۖۘۜۜۨۘ"
            goto L_0x0003
        L_0x0054:
            r1.show()
            java.lang.String r0 = "ۚۢ۟۬ۢۘ۟ۙ۫ۥۘۥۡۖۡۘۛۙۧۖۧۘۢۛۢۗۡۜۘ"
            goto L_0x0003
        L_0x005a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "call build() before show()."
            r0.<init>(r1)
            throw r0
        L_0x0062:
            java.lang.String r0 = "ۨۖۨۘ۫۫ۜ۬ۤ۠۫۟ۦۘۚۖۗۚۧۘ"
            goto L_0x0003
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.filechooser.ChooserDialog.show():com.obwhatsapp.youbasha.filechooser.ChooserDialog");
    }

    public ChooserDialog with(Context context) {
        String str = "ۛۚۨۚ۫ۗۥۖۥۚۜۘۢۜۗۖۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 791) ^ -516458329) {
                case -1368027311:
                    return this;
                case -1135273509:
                    str = "ۡ۟ۧ۠۟ۛۡۡۛۚۧۛ۟ۡۖ";
                    break;
                case -549365698:
                    str = "ۨۘۡۘۘۤۦۘۧۚۜۚۛۧ۟ۗۗۥ۫ۜۘۛۦۢ۠ۚۡ";
                    break;
                case -453213185:
                    this.f1038c = context;
                    str = "ۥۤۖۨ۫ۘۘ۟ۡۨۘۦۤۜ۫ۙۡ";
                    break;
            }
        }
    }

    public ChooserDialog withChosenListener(Result result) {
        String str = "۬ۥۜۘۖ۬ۘۘۖۗۘ۠ۨۦۘۢۘۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 257) ^ 64499081) {
                case -1752866215:
                    return this;
                case -1672950364:
                    str = "ۜۥۖۘ۠ۢ۟۬ۤۧۦۛ۬۠ۛ۬۬ۡۘۖۨۤۦۚۤ";
                    break;
                case 718641153:
                    this.f1041f = result;
                    str = "۟ۤۘ۬ۜ۟ۧۚۥ۬ۨۘۦۤۥۦۡۖۧۧۡۘ";
                    break;
                case 887579874:
                    str = "۠۬ۨۘۧ۟ۨۘ۟ۧۚۧۚۨۡۦۦۖ۫ۥۘۥۚۖ۠ۤ۬";
                    break;
            }
        }
    }

    public ChooserDialog withDateFormat() {
        String str = "۬۠ۥۖۢۥۖۨۙۙ۠ۚۘ۫ۡۘۘ۫ۙۤ۫ۘۘۗۘۧۘۖۖۥ";
        while (true) {
            switch ((str.hashCode() ^ 771) ^ 288434066) {
                case -607643255:
                    return withDateFormat("yyyy/MM/dd HH:mm:ss");
                case -45820843:
                    str = "ۙۢۖۘ۬۫ۛۛۘۙۤۦۙ۟ۡۜۘۨۡۧۙۨۥۘ۟ۨ۟ۨ۬۬";
                    break;
            }
        }
    }

    public ChooserDialog withDateFormat(String str) {
        String str2 = "ۜ۫ۥۘۥ۠ۨۘ۠ۖۧ۠ۦۙ۬۫ۢۦۧۗۨۨۗۨۢۡۘ";
        while (true) {
            switch ((str2.hashCode() ^ 309) ^ 390006719) {
                case -1966766961:
                    return this;
                case -1387272625:
                    str2 = "ۥۜۖۘۛۗۥۘۨۦۖۤۡۨۘۦ۫ۥۘۥۚۡۨ۟ۢۛۛۖ";
                    break;
                case -1239309688:
                    this.f1044i = str;
                    str2 = "ۛۦۜ۟ۜۡۛۢۚۗۥۢۙۤۦۦۛ۬ۦۛ";
                    break;
                case -306559572:
                    str2 = "ۜۚۧۦ۠ۘۘۤۥۧۗ۟ۘۘ۠ۡۖۤ۠۫";
                    break;
            }
        }
    }

    public ChooserDialog withFilter(FileFilter fileFilter) {
        String str = "ۛ۟ۥۘۤۨۚۜۧۘۘ۬ۘۦۢۨۨۘۘۢ۬ۖۥۡ";
        while (true) {
            switch ((str.hashCode() ^ 294) ^ -82821326) {
                case -1707277602:
                    withFilter(false, false, (String[]) null);
                    str = "۠ۗۜ۬ۖۦ۬ۘۜۘۘ۠ۨۘۜۙۛۚۖۢۧۜ۬ۡۚ۠";
                    break;
                case 39768226:
                    str = "۫۫ۦۧۛۛۜ۟ۖۘ۠ۦۘۘ۬ۥۘۥ۫ۖ۠ۧۜۘ";
                    break;
                case 789118772:
                    str = "۫ۨۨۙۤۥۛ۠۫ۧ۬ۗۗۘۦ";
                    break;
                case 965884539:
                    this.f1043h = fileFilter;
                    str = "ۢۛۡۘۗۚۗ۟ۦۨۘۛۖۢۢۘۦۛۖۙۘۦۤۚۜۛ";
                    break;
                case 1491184393:
                    return this;
            }
        }
    }

    public ChooserDialog withFilter(boolean z2, boolean z3, FileFilter fileFilter) {
        String str = "ۛ۫ۥۚ۬ۖۘ۟۠ۙ۟ۚۨۘۢۧۛۛۢ۫ۗۗ۫ۘۦۤۘ۟۫";
        while (true) {
            switch ((str.hashCode() ^ 756) ^ -1250508088) {
                case -1564852755:
                    str = "ۛۢۜۢ۠ۚۧۢۥۙۦۘۘۗۛۧۛۢۘۦۦۘ";
                    break;
                case -1128530489:
                    withFilter(z2, z3, (String[]) null);
                    str = "۟ۘۜۘ۫ۥۖ۟ۖۥۨۦۡۘۚ۟ۡۘۧۦۨۘۥۤ";
                    break;
                case -863674588:
                    return this;
                case -281792356:
                    str = "ۜۨۤۗۙۥۘۧ۠۠ۡۤۛ۬۬ۙ";
                    break;
                case 266098918:
                    str = "ۛ۫ۗ۫ۗ۫ۛۡۡۘۢ۫ۡۖۛۦۚۦۨۘۤۥ۬";
                    break;
                case 282002765:
                    str = "ۛ۫ۡۚۖۦۘۚۥۦۘۘۡۤ۫ۥۤۥۜۡۘۘ۬ۚۧۜۚۚۙۗ";
                    break;
                case 791622682:
                    this.f1043h = fileFilter;
                    str = "۬ۜۘۛۛ۬۠ۥۥۘۥۡۧۖۙۢۥۨۘۘۗۙ۫ۚۦۚ";
                    break;
            }
        }
    }

    public ChooserDialog withFilter(boolean z2, boolean z3, String... strArr) {
        String str = "ۜۙۗۜۗ۠ۜۙۖۨۜۢ۫ۡۘۖۗۧۗۦۜۘ";
        r1 r1Var = null;
        r1 r1Var2 = null;
        r1 r1Var3 = null;
        while (true) {
            switch ((str.hashCode() ^ 726) ^ -1251587324) {
                case -2038062810:
                    str = "ۖۗۖۨ۬ۜۧ۬ۖ۫ۖۘۘۛۛۢۧ۬۟";
                    break;
                case -2035339450:
                    this.f1042g = z2;
                    str = "ۛۦۙۚۘۘۜۖۥۥ۫ۥ۫ۤۦۘۖۧۧۘۘ۫";
                    break;
                case -1754702359:
                    String str2 = "۫۫ۜۢۚۙۦۤۚۜ۬ۙۤ۟۠۬ۛۗ۬ۙۜ۬ۙۦۘۜۨۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 96863730) {
                            case -1213720989:
                                str2 = "۫ۜۖۘ۬ۦۥۢۧۘۘۤۚۜۢۥۗۗۙۖۘ۠ۚۢۥ۬ۥۘ";
                                break;
                            case -501014043:
                                if (!z2) {
                                    str2 = "۟ۜۨۙۙۗۢ۟۟ۚۥ۬ۘۛۡۘ۫ۜۜ";
                                    break;
                                } else {
                                    str2 = "ۚۤۥ۟۬ۚ۫۬ۦۡۧۛۢۦۘۢۡ";
                                    break;
                                }
                            case 472750324:
                                str = "ۨۨۚۗۗۥۖۡۥۘۡۦۨۤ۟۬ۚۨ۬";
                                continue;
                            case 575927073:
                                str = "ۡ۠ۢۚ۟۬ۗۢۙۡۢ۫ۡۗۧۨۜۨۗۡۦۘ";
                                continue;
                        }
                    }
                    break;
                case -1401864203:
                    r1Var = f1035k;
                    str = "ۙ۬ۜۘۨۦۡۖۚۖۘ۠۠ۧۡۡ۫۟۬ۜۗ۠";
                    break;
                case -1312856995:
                    str = "ۤۧۦۜۙ۟ۦ۟۠ۡ۠ۘ۬ۗ";
                    break;
                case -1171638611:
                    r1Var3 = f1034j;
                    str = "ۡۙۡۚۦۡۘۢۡۡۤۗۡۘۖ۬ۨۘۥۦۘۖ۫ۡۛ۫ۨۘۖۧۜ";
                    break;
                case -878305720:
                    str = "ۖۨۦۘ۫۟۠ۚۚۢۧۨ۬ۢۛۙۧۘۘ";
                    r1Var2 = r1Var;
                    break;
                case -860891838:
                    str = "ۗۥ۟ۗۧۢۤۛۦۥۨ۬ۚۗ۫ۨۚۨۡ۟ۥۘۥۡۤ۠۠ۦ";
                    r1Var2 = r1Var3;
                    break;
                case -716632918:
                    this.f1043h = r1Var2;
                    str = "ۘۚۧ۬ۚ۠ۛۗۧۢۥۦۚۖۙۦ۬۬۠ۘۚ";
                    break;
                case -463608926:
                    str = "ۦۖۥۛۥۧۚۖ۟ۥۥۨۘۦۙۧۜۘۘۘۨ۬ۖۘۜۡ۟";
                    break;
                case -35049003:
                    this.f1043h = new ExtFileFilter(z2, z3, strArr);
                    str = "ۖۗۖۨ۬ۜۧ۬ۖ۫ۖۘۘۛۛۢۧ۬۟";
                    break;
                case 1130505277:
                    str = "ۦۧۜۘۚۜۥۘۛۚۥۘۢۜۖۤۛۡ۟ۧۡۘۗۚ";
                    break;
                case 1223046418:
                    String str3 = "۫۫ۡۚۥ۫ۨۥۘۘ۬ۗۚۗۧۙۧۛۥۘۧۗۦۘۘ۠ۘ۫ۖۡ";
                    while (true) {
                        switch (str3.hashCode() ^ -1775266248) {
                            case 396923070:
                                str3 = "ۦۗۥۘۗ۟ۜۦۢۦۡۧۦۘۦۙۡ";
                                break;
                            case 521139332:
                                str = "ۗۛۥ۫۠ۢ۟ۖۡۦ۬ۜۨۨۧۘۖۘۨۘ";
                                continue;
                            case 737272861:
                                if (strArr != null) {
                                    str3 = "ۜۜ۠ۗۗۛۤۖۢۙۛۢۙۥۨۘۡۨۨۖ۠۬ۢۜۘۘ۫۠ۨ";
                                    break;
                                } else {
                                    str3 = "ۧ۫۬ۗۧۙ۠ۧۚۛۚۘۡۖۘۘۘ۠ۦۨ";
                                    break;
                                }
                            case 1601310761:
                                str = "۟ۦۖۘۙۛۖۘۜۙۥۘۙ۫ۨۘۜ۠۬ۜۛۥۘۛۘۖۘۡۛۦۘۗ۬ۢ";
                                continue;
                        }
                    }
                    break;
                case 1454104707:
                    return this;
                case 2031143488:
                    str = "ۖۨۦۘ۫۟۠ۚۚۢۧۨ۬ۢۛۙۧۘۘ";
                    break;
                case 2044263150:
                    str = "ۡ۬ۡۘۚۢ۠ۖ۠ۛۨ۠ۨۘ۬ۡۦۖۛ۠ۡ۟ۛ";
                    break;
            }
        }
    }

    public ChooserDialog withFilter(boolean z2, String... strArr) {
        String str = "ۥۙۢۧۙۨۛ۫ۖۘۜۜ۫۫ۦۘۘۗۨۘۚۢۜۖۛۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 21) ^ -468986333) {
                case -1600456376:
                    str = "ۖۤۨۖۥۥۘۜۡ۫ۛۙۡۘ۫ۡۨۘ";
                    break;
                case -520231405:
                    str = "ۥۦۧۖۜۡۦۥۨۚ۫ۨۘ۟ۨۘۘۤۜۡۘۤۘۢ";
                    break;
                case -435626281:
                    return withFilter(false, z2, strArr);
                case 362335347:
                    str = "ۥ۟ۖۘۧۗۚۧۦۘۧۢۥۘۛۡۗۙۧ۫ۘۡۘۢ۫ۘ";
                    break;
            }
        }
    }

    public ChooserDialog withFilterRegex(boolean z2, boolean z3, String str) {
        String str2 = "۫ۧۤۤۚۜۘۜۨۘۜۡۜۘ۟۠ۡ۫ۙۘۢۢۤ۫ۥۘۨۘۘ";
        while (true) {
            switch ((str2.hashCode() ^ 347) ^ 13036780) {
                case -1740584511:
                    str2 = "ۢۥۤۘۡۨۘۥ۟ۤۨۤۡۘۖ۫ۦ۬ۛۗ";
                    break;
                case -1185152841:
                    str2 = "ۗۦۖۘۥۖۦۨۤۖۘ۟ۘۜۖ۬ۨ۠ۘۗ";
                    break;
                case -770334216:
                    return this;
                case -669341674:
                    this.f1043h = new RegexFileFilter(z2, z3, str, 2);
                    str2 = "ۜۗۢۗۙ۟ۚۖۘ۫ۢۥۦۦۨ۫ۚ۫ۘۨۦۧ۠ۢ";
                    break;
                case -152327687:
                    this.f1042g = z2;
                    str2 = "ۡۚۧۦۚ۫۠ۙ۠ۖۢ۠ۚۚۥۘۜۦ۫۫۠ۛۥۜۜۘۜۥۡۘ";
                    break;
                case 1970052422:
                    str2 = "ۘۛۡۜ۠ۦۘۡ۫۬ۖ۠ۨۘ۬ۨۦۘ";
                    break;
                case 2111837293:
                    str2 = "۬ۘۨۘۗۗۘۤۡۤۧۚ۟ۚۦۥۦۨۚ";
                    break;
            }
        }
    }

    public ChooserDialog withFilterRegex(boolean z2, boolean z3, String str, int i2) {
        String str2 = "ۘ۟ۥۘۧ۟۠ۨ۟ۙۚ۬ۢۦۖۧ";
        while (true) {
            switch ((str2.hashCode() ^ 585) ^ 535035182) {
                case -1304492182:
                    str2 = "۟ۜۘۨۗ۬ۙۦۨۘۡۡۥۘ۫۫ۙۜۜ۠ۗۗ۟ۙۖۖۘۘ";
                    break;
                case -677463641:
                    return this;
                case -177363042:
                    this.f1042g = z2;
                    str2 = "۟ۧۗ۬ۢۦۖۤ۟ۚۙۖۢۜۨ۬ۥۧۘ۬ۖۜۘ";
                    break;
                case -78366111:
                    str2 = "۠ۤۘۘ۬ۤۢۘۙۥۙۥۧۚۦ۟ۛۖۘۛۖۥۘ";
                    break;
                case 203783570:
                    str2 = "ۢ۠ۡ۫ۖۡۘ۫ۜ۬ۖۛ۬ۢۖۢۖۗ۠ۜۗۖ";
                    break;
                case 845952980:
                    str2 = "۠ۤ۫ۙۛ۫۟ۡۘ۟ۘۡۨ۫۟ۗ۬ۡۘۤۨۡۢۘۥ";
                    break;
                case 1530794672:
                    this.f1043h = new RegexFileFilter(z2, z3, str, i2);
                    str2 = "۟ۖۧۘۘ۫ۛۧۘۘۘۖۥۘ۠ۧ۠۬ۦۛ";
                    break;
                case 1972123932:
                    str2 = "ۚۧ۟ۘۚۜۘۥۢۧۛ۬ۡۘۥۤۚۖۙۖۤۖۧۘۧۚۘۘۚۨ۫";
                    break;
            }
        }
    }

    public ChooserDialog withResources(int i2, int i3, int i4) {
        String str = "ۧۤ۟ۡۚۗ۫ۘۧۤۛۡ۠ۦۨۡۗۥ";
        while (true) {
            switch ((str.hashCode() ^ 318) ^ -305727354) {
                case -1607130992:
                    str = "ۡۜۢۖۘۥۘۦۧۢۖۜ۟ۚۨۡۘۚۛۥ۫ۨۤۛۦۘ";
                    break;
                case -911545256:
                    str = "ۜۗۧ۬ۗۡۡۚۜۥ۬ۥۜۖۧ";
                    break;
                case -617180055:
                    return this;
                case 205320051:
                    str = "ۨۥۘۙۤۘۘۘۧۘۧۛۢۜۘۧ";
                    break;
                case 1397889217:
                    str = "ۧۚۥۘۗۜۦۧ۬ۛۥۖۗۤ۫۬ۜۛۦۘ";
                    break;
            }
        }
    }

    public ChooserDialog withStartFile(String str) {
        String str2 = "۟ۖ۫ۦۙۨۘ۫۬ۧۡۥۖۦۦۢ۠ۥۘ۬ۙۘۘ";
        while (true) {
            switch ((str2.hashCode() ^ 916) ^ 2045742994) {
                case -2104990298:
                    return this;
                case -1578539511:
                    this.f1037b = this.f1037b.getParentFile();
                    str2 = "۟۫ۢۦۤۤۜ۟ۢ۟۟۟ۘۡ۟ۡۦۘ۬۠ۡ";
                    break;
                case -1300849344:
                    str2 = "ۥ۫ۖۘۡۦ۬ۢۥۨۘۦۛۦۘۥۥۖۘۢ۫ۢۢۜۡ";
                    break;
                case -890786636:
                    String str3 = "ۡۜۡۘ۠ۧۗۧۦۘۥۜۨۘۖۘۦۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 537645316) {
                            case -1763924654:
                                if (str == null) {
                                    str3 = "ۖۘۚۛۙ۠ۦۡۦۛۛۜۘۖۢۦۘۦۗۘۘ";
                                    break;
                                } else {
                                    str3 = "ۜۢۙۛ۟ۡۨۙۨ۬ۘۙۧۙۦۘۙ۟۫۫ۧۚ";
                                    break;
                                }
                            case -79891495:
                                str2 = "۟ۗ۬۠ۨۘۛ۠ۛۜ۟ۨ۠ۨ۫ۗۜۜۜۢۛۖ۠";
                                continue;
                            case 1216378457:
                                str3 = "ۡ۬ۦۘۘۡۡۖۨۘ۟ۨ۬ۡۧ۠۟ۚۡۘۛۤۘۥۧ";
                                break;
                            case 2093001384:
                                str2 = "ۛۢۡۘۥۨۜۚۚۦۘ۟ۚۙ۟ۖۦ";
                                continue;
                        }
                    }
                    break;
                case -765553969:
                    String str4 = "ۧۘۨۘۜۡۗۥۢ۠۠ۘۖۙۤۚ۫۬ۨۘۖۨۖ";
                    while (true) {
                        switch (str4.hashCode() ^ 1302669399) {
                            case -2132819936:
                                str2 = "۟۫ۢۦۤۤۜ۟ۢ۟۟۟ۘۡ۟ۡۦۘ۬۠ۡ";
                                continue;
                            case -199156089:
                                if (this.f1037b.isDirectory()) {
                                    str4 = "ۚۘۦۘ۬۠ۜۘۘۗ۠ۛۨۚۡ۬ۘۘ";
                                    break;
                                } else {
                                    str4 = "۠ۜۧ۟ۛۦ۬ۜۦۘ۬ۘۗ۟ۗۘۘ";
                                    break;
                                }
                            case 586406933:
                                str4 = "ۘ۠۫ۚۦۖۤۗۛۘۡۘۙۘۚۡۖۖۘۤۛ";
                                break;
                            case 782515308:
                                str2 = "۟ۥۦۘۤۦۥۢۢۘۘ۟ۗۚ۠ۘ";
                                continue;
                        }
                    }
                    break;
                case -705163368:
                    this.f1037b = Environment.getExternalStorageDirectory();
                    str2 = "ۥ۫ۖۘۡۦ۬ۢۥۨۘۦۛۦۘۥۥۖۘۢ۫ۢۢۜۡ";
                    break;
                case 1096373062:
                    this.f1037b = new File(str);
                    str2 = "۫ۧۨۤۚۘۚۧۢۗۛۖۥ۠۟ۨۨۘۘۡۤ۠ۖۧ۠۠ۜۥ";
                    break;
                case 1115912807:
                    str2 = "ۖ۬ۡۡ۟ۜۖۘۗۙۗۖۘۖ۟ۙۡۡۨۥۦۘۜۧۜ";
                    break;
                case 1973922450:
                    str2 = "ۙۥۗۛ۟۫ۢ۫ۘۖۚۡۘۗۖۖۘۦۡۜ";
                    break;
            }
        }
    }
}
