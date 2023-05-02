package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.yo.d;
import com.obwhatsapp.yo.yo;

public class ConvoActionBar extends BasePreferenceActivity implements IPreviewScreen {

    /* renamed from: e  reason: collision with root package name */
    public View f1149e;

    /* renamed from: f  reason: collision with root package name */
    public int f1150f;

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f1151g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f1152h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f1153i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f1154j;

    /* renamed from: k  reason: collision with root package name */
    public ImageButton f1155k;

    /* renamed from: l  reason: collision with root package name */
    public ImageButton f1156l;

    public static void c(TextView textView, int i2) {
        LinearLayout.LayoutParams layoutParams = null;
        String str = "ۙۚۜۘۛۦ۫ۢۡۚۖۢ۟ۢۙ۬۫ۡۢۙ۠ۚۖۥۧ";
        while (true) {
            switch ((str.hashCode() ^ 241) ^ -2074174003) {
                case -680540224:
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    str = "۬ۨۧۘ۠ۤۜۥۥۥۘۦۧۥۥۤۥۘ";
                    break;
                case -658898805:
                    str = "ۥۧ۬ۥۖۥۜۧۦۦۗ۬ۜۙۢۨ۠۠ۖۦۘۖ۫ۥ";
                    break;
                case -3563735:
                    str = "ۡۙۘ۟۟۠ۛ۟ۚ۟۟ۦۜۖۜۘۤۘۦۦۚۜ";
                    break;
                case 571802118:
                    textView.setLayoutParams(layoutParams);
                    str = "ۙۧۡۘۥ۟ۘۙۥۘ۬ۛۡۘۥۧۡ۫۟ۥۘ";
                    break;
                case 1278379620:
                    layoutParams.gravity = i2;
                    str = "ۙۧۨۥ۫ۗۧۤۜۘۜۢۥۘ۫ۚۥۗۨۤ۠ۢۙ۫";
                    break;
                case 1619150769:
                    return;
            }
        }
    }

    public static void d(TextView textView, int i2) {
        String str = "ۥۛۘۘۘۗ۠ۨ۟۠ۘۧۤ۬ۘ۠۟ۧ۫ۦۗۖۘۘۢ";
        while (true) {
            switch ((str.hashCode() ^ 424) ^ 1720486947) {
                case -2004120767:
                    String str2 = "ۙۘۨ۟ۙۙۧ۟ۜۘۚۦۘۖۙۤۦۤۢۜۘۖۘۢۜۨ";
                    while (true) {
                        switch (str2.hashCode() ^ -428027138) {
                            case -1933770146:
                                str = "۫ۡۨۘۘ۫ۥۙۗۜۘۥ۠ۖۘۨۛۙۥۚۡۘ";
                                continue;
                            case -1311956689:
                                str2 = "۫ۢۜۙ۫۠۬ۚ۬ۗۨۘۗۡۧۛۛۡۘ";
                                break;
                            case -1212497803:
                                if (i2 != 0) {
                                    str2 = "ۨۖۨۘ۬ۧۤۗ۠ۡۘۙۡۜۡۥۜۡۧۘۘۛ۬ۦ";
                                    break;
                                } else {
                                    str2 = "ۜ۟ۢۡۤۜۘۚ۟ۧۖۥ۬ۘۘۖ۟۠ۥۘ";
                                    break;
                                }
                            case -1012699716:
                                str = "ۦۨۦۥ۟ۘۘۗۖۗۤ۬۠ۨ۠۬ۦۛۧۚ۬۬ۛۗ";
                                continue;
                        }
                    }
                    break;
                case -1294727836:
                    textView.setTypeface(textView.getTypeface(), i2);
                    str = "ۦۤۤۢۖۖۘ۠ۜۨۘۦۚۚۛۧ۟ۥ۠ۘ";
                    break;
                case -993159568:
                    str = "ۦۤۤۢۖۖۘ۠ۜۨۘۦۚۚۛۧ۟ۥ۠ۘ";
                    break;
                case -498501213:
                    return;
                case -371743800:
                    str = "ۡۘ۬ۜۜۧۚۡۤۧۢۡۧۙ۫ۗ۬ۖۘۨۜ۟";
                    break;
                case 704263613:
                    str = "ۖۗۚ۬ۘۗۘۜ۠ۥۙۨۘۦۥۖۘ۟ۧۨۘ۬ۗۜ";
                    break;
                case 1767905873:
                    textView.setTypeface(Typeface.create(textView.getTypeface(), 0), 0);
                    str = "ۗۥۘۘۙۘۚۧۧ۟ۖۖ۫ۚ۬ۙۧۚۗۥۡۘ۠۟۠";
                    break;
            }
        }
    }

    public void initPreview() {
        String str = "ۘۙ۬۬ۨ۟۠ۗ۬ۚۡ۫۫ۡۛ";
        ViewGroup viewGroup = null;
        TextView textView = null;
        TextView textView2 = null;
        TextView textView3 = null;
        View view = null;
        while (true) {
            switch ((str.hashCode() ^ 866) ^ -283078951) {
                case -1603507333:
                    ((ImageButton) viewGroup.getChildAt(2)).setColorFilter(this.f1150f, PorterDuff.Mode.SRC_IN);
                    str = "۫ۥۖۖۨۧۨۜ۫ۡۡۨۧۖۘۘۛۥۧۘۦ۫۬ۢۙۡۘ۫۫";
                    break;
                case -1486000420:
                    str = "ۗۘ۫۬ۧۚۧۨۧۘۥ۬ۜۧۖۢۦۥۡۘۧ۠ۡ۬ۦ۠ۖۘ";
                    textView2 = (TextView) this.f1149e.findViewById(yo.getID("conversation_contact_status", "id"));
                    break;
                case -1375847696:
                    str = "ۘۥۦۛ۫ۤۛۚۦۘۥۙۗۢۛۜ۬ۚۤۧۚ۫ۜ";
                    textView3 = (TextView) this.f1149e.findViewById(yo.getID("conversation_contact_name", "id"));
                    break;
                case -1331839437:
                    textView3.setText(yo.getString("Testing_Name"));
                    str = "ۖۡۡۨۤۡۦۦۘ۠ۥۦۜۦۡۘۙۧۢۛۙۙۤۢ۫۠ۨۦۘ";
                    break;
                case -1159980482:
                    this.f1155k = (ImageButton) viewGroup.getChildAt(0);
                    str = "ۤ۠ۦۙۜۥۛۨۖۘۚۙۖۗۙ۫";
                    break;
                case -1112155900:
                    str = "ۥۖۧۗۖۙۚۢۚۖۨۤۛۜ";
                    viewGroup = (ViewGroup) this.f1149e.findViewById(yo.getID(FacebookFacade.RequestParameter.ACTIONS, "id"));
                    break;
                case -906937095:
                    this.f1155k.setColorFilter(this.f1150f, PorterDuff.Mode.SRC_IN);
                    str = "ۡۘۚۘۡۡ۠ۜۥ۟ۚۨۘۘۘۛ۠ۛۤۦۦۖۛۖۘۥ۟۫";
                    break;
                case -846754400:
                    this.f1153i = textView2;
                    str = "ۧۖۜ۫ۤۡۘۖۡۡۘۥۡۜۨۢۘ۟ۡۚۘۜۛۨ۠۠";
                    break;
                case -383303724:
                    this.f1154j = textView;
                    str = "ۢۜ۠ۤۚ۫ۜۦۦۘۤ۟ۧ۬ۡۘۘۘ۟ۜۘ";
                    break;
                case -224829190:
                    ((ImageView) this.f1149e.findViewById(yo.getID("conversation_contact_photo", "id"))).setImageResource(yo.getID("avatar_contact", "drawable"));
                    str = "ۚۥۘۘۖۛۜۡۘۘۦۡۘ۫ۢۙۧۚۘ";
                    break;
                case 294971722:
                    str = "۬ۖ۫ۘۦۥۖۤۦ۫۠ۖۘۦۨۘۦۙ۠ۖۨۜ";
                    view = findViewById(yo.getID("preview", "id"));
                    break;
                case 302660356:
                    this.f1151g = (FrameLayout) view.findViewById(yo.getID("icon_layout_anchor", "id"));
                    str = "ۧۖ۬ۛۗۨ۬۬ۛۧۡ۟ۚ";
                    break;
                case 434153254:
                    this.f1156l.setColorFilter(this.f1150f, PorterDuff.Mode.SRC_IN);
                    str = "۠ۤۢۤۢۥۗۢۖۘۚۚۛۜ۠ۖۜۗۤۥ۠ۗ";
                    break;
                case 567572418:
                    str = "۫ۧۙۗۡۤۦۥۥۘۘۤۦۗۚۤۢۙۦۘۖۥۡۘۜۢۚ";
                    textView = (TextView) findViewById(yo.getID("conversation_contact_global_status", "id"));
                    break;
                case 941657690:
                    ((ImageView) this.f1149e.findViewById(yo.getID("up", "id"))).setColorFilter(this.f1150f, PorterDuff.Mode.SRC_IN);
                    str = "ۖۛۛۙۦۚۥۨۛۧۧۜۡ۬ۙۗۙۦۘۛ۬ۥۛۢ";
                    break;
                case 1120632994:
                    this.f1156l = (ImageButton) viewGroup.getChildAt(1);
                    str = "۠ۙۡۗۘۦۘۥۗۢۙۜۙ۟۠ۜ۠۬ۨ";
                    break;
                case 1232264801:
                    this.f1149e = view;
                    str = "ۜۧۜۦۜۡۘۗۢ۠ۥۘۜۜۥۧۘۡ۠ۨۚۖۧۘۧۜ";
                    break;
                case 1306586997:
                    this.f1152h = textView3;
                    str = "ۢۙۜۦ۠ۦۘۡۨۨۤۚۨۡۥۢۤ۠۠";
                    break;
                case 1333689647:
                    return;
                case 1403833573:
                    str = "ۗۜۘۖۦۖۘۘۙ۠ۚ۬ۙۢ۠ۜ";
                    break;
                case 1410620695:
                    textView2.setText(yo.getString("Online"));
                    str = "ۛۛۖۘۧ۬ۚۙۨۘۘۜۜۜۘ۟۫۬ۗۘۛ۫ۡۡۢۖۦۘ";
                    break;
                case 1737291554:
                    textView.setText(yo.getString("Support_Mods"));
                    str = "ۚ۟ۛ۬ۙۡۢۥۘۢۤۖۛ۟ۘۦۛۢۘۗۜۘۖۢۖۘ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۡۤۙۥۤ۠ۗۜۢۛ۫ۨۙۘۤۖۛۘۘۥۘۧ";
        while (true) {
            switch ((str.hashCode() ^ 667) ^ -990737173) {
                case -1193134715:
                    str = "۫ۨۘۘۦۜۚۜۨۧۗ۫ۧ۫ۘۘ";
                    break;
                case -440685260:
                    this.f1150f = yo.mainpagercolor();
                    str = "ۘۛۗۖ۠ۖۜۖۥۡۦۘۙۚۨۨ۬ۧ";
                    break;
                case -405258740:
                    initPreview();
                    str = "ۚۤۤۥۚ۠۟ۨۤۜۡۜ۬۟";
                    break;
                case 35134560:
                    str = "ۦ۫۬ۚۗۖۘۦۦۛۨۥۧۘ۬۫ۡ۟۠ۡۚۡۦۤۨۗ";
                    break;
                case 487443165:
                    addPreferencesFromResource(yo.getID("yo_convo_actionbar", "xml"));
                    str = "ۙۖۖۘۤۖۘۘۦۚۥۘ۫ۧۖۘۢ۫ۤ۫ۗ۟۟ۢۚ۟۬ۚ";
                    break;
                case 735012656:
                    return;
                case 791815132:
                    super.onCreate(bundle);
                    str = "ۢ۠ۤۥ۠ۛۨۖۤۛۤۚۦ۫ۖۨۙۤۦۦۘ۫ۗۥۘۢ۫ۢ";
                    break;
                case 2028300233:
                    setContentView(yo.getID("yo_settings_convoactionbar", "layout"));
                    str = "ۡۥۥۘ۬۟ۨۘۥۡۙۘۤۡۡۛۧۢۙ۠۬ۙۨ";
                    break;
            }
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "۟ۧۥۘۤۨۖۗ۬ۡۥۜۦۘۗ۬ۘۨۙ";
        while (true) {
            switch ((str2.hashCode() ^ 94) ^ -407741200) {
                case -2079966837:
                    return;
                case -1582107912:
                    super.onSharedPreferenceChanged(sharedPreferences, str);
                    str2 = "ۘۧۘۘۥۖ۟۬ۙۡۘۧۦۦۡۢۦۜۘۜ۟ۘۧۦۦۘۧ۬";
                    break;
                case 35268808:
                    updatePreview();
                    str2 = "ۘۡۖۘۙۚ۠۫ۨۡۘۧۚۢۙۖۘۗ۬۫ۘ۫ۨۘ";
                    break;
                case 539628312:
                    str2 = "ۥ۬۫ۧ۠ۤ۫ۗۚۤۤۜۙۢۗ";
                    break;
                case 920346999:
                    str2 = "ۘ۬ۢۥۘۥ۠۟ۥۛۛۥ۬ۨۘۧ۫ۥۘۦۨ۟";
                    break;
                case 1142398784:
                    initPreview();
                    str2 = "ۗۤ۫ۖ۠ۦۡۤۜ۟۫ۦۘۛۗۛ۫ۙۦۘ";
                    break;
                case 1738180259:
                    str2 = "ۦۦۧۚ۫ۨ۫ۛۖۘۖ۬ۖۘۜۘ";
                    break;
            }
        }
    }

    public void onStart() {
        String str = "۫ۥۧۖ۠ۦۘ۠۬ۡۧۨۗۧۥۡۘۙۙۡۘۛۢۖ۬ۚۘۘ۬ۜۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 774) ^ 507209540) {
                case -1395263918:
                    return;
                case -417491103:
                    IPreviewScreen.mHandler.postDelayed(new d(this, 5), 300);
                    str = "۬ۧۤۖۚ۟ۦۥۙۙ۟ۢۡۖۥۜۙۡۘ۠ۚۘۖۘ";
                    break;
                case -163016452:
                    super.onStart();
                    str = "ۛۚ۬ۧۚۗ۬۬ۡۘ۫۬ۧۜۢ۬۬ۘۛۨۘۦۘ";
                    break;
                case 2048836906:
                    str = "ۜۚ۟ۚ۫۟ۨۨۘۥۦۗۧۦۡۘۙۖۘۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updatePreview() {
        /*
            r42 = this;
            r38 = 0
            r37 = 0
            r5 = 0
            r36 = 0
            r35 = 0
            r33 = 0
            r34 = 0
            r32 = 0
            r31 = 0
            r30 = 0
            r28 = 0
            r29 = 0
            r27 = 0
            r26 = 0
            r14 = 0
            r25 = 0
            r23 = 0
            r24 = 0
            r22 = 0
            r21 = 0
            r19 = 0
            r17 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r15 = 0
            r12 = 0
            r13 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r7 = 0
            r8 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            java.lang.String r2 = "ۘۙۚۧۧۥۗۦۨۛۚ۫ۖۥۜۘ۬ۥۦۘ"
        L_0x003d:
            int r39 = r2.hashCode()
            r40 = 515(0x203, float:7.22E-43)
            r41 = 2040120370(0x7999c432, float:9.980009E34)
            r39 = r39 ^ r40
            r39 = r39 ^ r41
            switch(r39) {
                case -2096289855: goto L_0x0095;
                case -2051102250: goto L_0x02c3;
                case -2045931194: goto L_0x04e3;
                case -2019220336: goto L_0x04f5;
                case -1878107787: goto L_0x0087;
                case -1857139443: goto L_0x037c;
                case -1839487713: goto L_0x03f1;
                case -1709862422: goto L_0x0544;
                case -1700110483: goto L_0x01d3;
                case -1633488370: goto L_0x04c0;
                case -1612905452: goto L_0x034c;
                case -1571334767: goto L_0x00c7;
                case -1570896167: goto L_0x005a;
                case -1519929235: goto L_0x01e5;
                case -1370599261: goto L_0x0518;
                case -1357315936: goto L_0x0399;
                case -1356503758: goto L_0x04b8;
                case -1338414856: goto L_0x0440;
                case -1333722180: goto L_0x0281;
                case -1287172959: goto L_0x0333;
                case -1281521109: goto L_0x02f7;
                case -1242587541: goto L_0x01b6;
                case -1233081186: goto L_0x0534;
                case -1203722245: goto L_0x01c8;
                case -1161249588: goto L_0x0524;
                case -1127856734: goto L_0x00dd;
                case -1115648084: goto L_0x01b0;
                case -1100202801: goto L_0x0063;
                case -1039333891: goto L_0x0352;
                case -1032375643: goto L_0x04ee;
                case -1024997197: goto L_0x03a4;
                case -1023248308: goto L_0x04a2;
                case -952588696: goto L_0x0358;
                case -937311025: goto L_0x03bc;
                case -882960220: goto L_0x01bc;
                case -876559074: goto L_0x010d;
                case -840618788: goto L_0x01c2;
                case -837235626: goto L_0x041c;
                case -833383456: goto L_0x0324;
                case -795320224: goto L_0x0184;
                case -768105765: goto L_0x04e9;
                case -759894400: goto L_0x0530;
                case -718514929: goto L_0x049c;
                case -646576524: goto L_0x018e;
                case -644691570: goto L_0x0342;
                case -633492565: goto L_0x03cf;
                case -584282730: goto L_0x023e;
                case -521232110: goto L_0x04b1;
                case -457575264: goto L_0x0407;
                case -426207339: goto L_0x0476;
                case -288987130: goto L_0x0393;
                case -236103461: goto L_0x02a2;
                case -233371920: goto L_0x0174;
                case -96805099: goto L_0x0214;
                case -93415678: goto L_0x03f6;
                case -80009077: goto L_0x0067;
                case -5151483: goto L_0x04c5;
                case 27361316: goto L_0x053c;
                case 38309503: goto L_0x052c;
                case 135148455: goto L_0x00e3;
                case 151969166: goto L_0x0453;
                case 193299329: goto L_0x036d;
                case 202050838: goto L_0x046c;
                case 361989662: goto L_0x0251;
                case 369102241: goto L_0x0400;
                case 380312251: goto L_0x04a7;
                case 460746784: goto L_0x00e9;
                case 514000347: goto L_0x015d;
                case 522283198: goto L_0x0386;
                case 554618506: goto L_0x014e;
                case 574628103: goto L_0x01ea;
                case 602036479: goto L_0x0140;
                case 604269808: goto L_0x0263;
                case 659933613: goto L_0x01dd;
                case 805014247: goto L_0x054c;
                case 873363731: goto L_0x03fb;
                case 885594623: goto L_0x0315;
                case 931573612: goto L_0x0510;
                case 1042761228: goto L_0x03b1;
                case 1044476388: goto L_0x020e;
                case 1068591886: goto L_0x047e;
                case 1163189600: goto L_0x0051;
                case 1252046925: goto L_0x038d;
                case 1257912725: goto L_0x0220;
                case 1308977983: goto L_0x0306;
                case 1467774216: goto L_0x022b;
                case 1575479028: goto L_0x04ac;
                case 1662926383: goto L_0x021a;
                case 1688197232: goto L_0x00a2;
                case 1694885300: goto L_0x0131;
                case 1732708708: goto L_0x004e;
                case 1750360317: goto L_0x0500;
                case 1880310223: goto L_0x00ef;
                case 1906597890: goto L_0x0504;
                case 1935926225: goto L_0x03c7;
                case 1956386509: goto L_0x00d7;
                case 1975163229: goto L_0x035e;
                case 2022818991: goto L_0x0554;
                case 2122861881: goto L_0x0208;
                case 2129620179: goto L_0x02e8;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x003d
        L_0x004e:
            java.lang.String r2 = "ۢۤۖۘۘۧ۫ۧۢۖۢ۫ۨۤ۠ۦۘۛ۠ۖۘ"
            goto L_0x003d
        L_0x0051:
            r0 = r42
            android.view.View r0 = r0.f1149e
            r38 = r0
            java.lang.String r2 = "۬ۡۚ۟ۤۢ۬ۧۖۘۙۘۧۘۜ۬۬ۢۤۡ"
            goto L_0x003d
        L_0x005a:
            java.lang.String r2 = "ModChatColor"
            boolean r37 = com.obwhatsapp.yo.shp.getIsGradiet(r2)
            java.lang.String r2 = "ۨ۟ۖۘۧۦۛۗۙۦۜۜۘۘۖۦۥ۬۟ۥ"
            goto L_0x003d
        L_0x0063:
            r5 = 0
            java.lang.String r2 = "ۗۘۧ۠ۦۛۨ۠ۗۙۦۗۛۖۘ۬ۦۖۨ۠۫"
            goto L_0x003d
        L_0x0067:
            r39 = 112707672(0x6b7c858, float:6.913133E-35)
            java.lang.String r2 = "ۡۚۧ۠۠ۤۨۤۧۨ۟ۦۥۜۦۨۘۘ"
        L_0x006c:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1517585168: goto L_0x0076;
                case -1340442102: goto L_0x0081;
                case -134472590: goto L_0x0084;
                case -41955765: goto L_0x007c;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x006c
        L_0x0076:
            java.lang.String r2 = "ۗ۟ۘۗۦۡۘۙۘۙ۫ۢۨۘۥۦۖۢۢۦۘۜۚۨۖۦۦۘ"
            goto L_0x003d
        L_0x0079:
            java.lang.String r2 = "ۚۗۘۘۤۡۖۘۡۗۦۖ۟ۥ۬۬"
            goto L_0x006c
        L_0x007c:
            if (r37 == 0) goto L_0x0079
            java.lang.String r2 = "ۡ۠ۖۘۖۤۡ۫ۜۘۡۡۗۥۦۖۨ۬ۧۥۦ۟ۡۜ۠ۛۖ"
            goto L_0x006c
        L_0x0081:
            java.lang.String r2 = "۫ۧۖۥۦۨۘۡۛۘۘۘۦ۫ۙۘۚ۠۠ۦۘۧ۟ۗ"
            goto L_0x006c
        L_0x0084:
            java.lang.String r2 = "۟ۦۛۨۧۥۥۢۡۗۗۡۙۥ۟"
            goto L_0x003d
        L_0x0087:
            java.lang.String r2 = "ModChatColor"
            android.graphics.drawable.GradientDrawable r2 = com.obwhatsapp.yo.shp.getGradientDrawable(r2)
            r0 = r38
            r0.setBackground(r2)
            java.lang.String r2 = "ۦۨۢۘۨۜۖۦۖۘۛۢۘۘ۠ۢۛۥۜۧۤۖۚ"
            goto L_0x003d
        L_0x0095:
            java.lang.String r2 = "ModChatColor"
            r36 = -11
            r0 = r36
            int r36 = com.obwhatsapp.youbasha.others.getColor(r2, r0)
            java.lang.String r2 = "ۜۙۘ۠ۛۦۚۚۙۚ۬ۡۘۜۛۨۘ"
            goto L_0x003d
        L_0x00a2:
            r39 = 999301342(0x3b9020de, float:0.0043984493)
            java.lang.String r2 = "۬ۖۤ۬ۦۧۘۨۤۥۧۨۛ۠۠ۘۗۙۘ۠ۘۥۘۤۥ۠ۖۧ"
        L_0x00a7:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1483909600: goto L_0x00c3;
                case -1170579725: goto L_0x00c0;
                case -888006390: goto L_0x00b1;
                case -862184337: goto L_0x00b7;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            goto L_0x00a7
        L_0x00b1:
            java.lang.String r2 = "۬ۚۘۘۦۘ۫ۢۙۦ۬ۥۨۧۘۘ۟ۢۡۘۗۥۚ"
            goto L_0x003d
        L_0x00b4:
            java.lang.String r2 = "ۤ۟۫ۙۖۛۙ۬ۘ۟ۚۘۢۢۧ۫۫ۤۧۜۜۘ"
            goto L_0x00a7
        L_0x00b7:
            r2 = -11
            r0 = r36
            if (r0 == r2) goto L_0x00b4
            java.lang.String r2 = "ۥۢۖۘۥۖ۠۫ۖۜ۫ۤۗۜۥۖ۫ۚ۬"
            goto L_0x00a7
        L_0x00c0:
            java.lang.String r2 = "ۘۥۦۦۙ۬۫ۖۢۡۖۥۧۛۧۢۨۜۘۨۙ۫"
            goto L_0x00a7
        L_0x00c3:
            java.lang.String r2 = "ۡۙۦۨۛۦۘۙۦۡۖۤۧۡۙۜۘۢۘۖۘۚۢ۬"
            goto L_0x003d
        L_0x00c7:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r0 = r36
            r2.<init>(r0)
            r0 = r38
            r0.setBackground(r2)
            java.lang.String r2 = "۟ۧۤۦۘۛۡۚۙۦۙۦۙۗ۬ۡۜۖۘۛ۠ۜۖۖۦۘۛۗۖۘ"
            goto L_0x003d
        L_0x00d7:
            r35 = 1
            java.lang.String r2 = "۟ۜ۠ۨۧۙۧ۟۫۠ۘۛۤۜ۬ۘۘ۠"
            goto L_0x003d
        L_0x00dd:
            java.lang.String r2 = "ۨۧۥۢۘۧۢۛۦ۟ۥۘۛۙۦۘۥۥۥۘ"
            r34 = r35
            goto L_0x003d
        L_0x00e3:
            r33 = 0
            java.lang.String r2 = "ۦۡۤ۟ۧۢ۟ۜۘۥۖۜۘۡۚۦۘۜ۠ۗۙۢۥۦۥ۠ۨۛۚ"
            goto L_0x003d
        L_0x00e9:
            java.lang.String r2 = "ۜ۠ۘۜۥۥۘۢ۠ۢۥۜۨۜۖۡۥۤۜۢۖۥ"
            r34 = r33
            goto L_0x003d
        L_0x00ef:
            r39 = -514731865(0xffffffffe151d0a7, float:-2.4190028E20)
            java.lang.String r2 = "۟ۖۖۘۤۖ۠ۧۨۘۖ۬ۙۜۘۘۚۨۖۘ"
        L_0x00f4:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1839716993: goto L_0x0109;
                case -47305289: goto L_0x015d;
                case 338131249: goto L_0x0106;
                case 1874727212: goto L_0x00fe;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            goto L_0x00f4
        L_0x00fe:
            if (r34 != 0) goto L_0x0103
            java.lang.String r2 = "ۚ۠ۜۖ۟ۡۧۛۥۛۦۢۚۤۨ"
            goto L_0x00f4
        L_0x0103:
            java.lang.String r2 = "ۛۥۜۦۖۜۜۖ۬ۜۘۦۖۗۛۛ۟۟ۤۧ۟ۧۦۘ"
            goto L_0x00f4
        L_0x0106:
            java.lang.String r2 = "ۗۧۢ۬ۢۗۧۚۡۘ۫ۧ۬ۚۖۦ۟ۘۨۘۤ۬ۜ"
            goto L_0x00f4
        L_0x0109:
            java.lang.String r2 = "ۧۧۡۘۜۤۧۦۘۨۘۥ۬ۡۘۚۜ۟ۥۙۜۗ۠ۜۘۨۖۨۘۥۧۡۘ"
            goto L_0x003d
        L_0x010d:
            r39 = -2068793566(0xffffffff84b0b722, float:-4.1545582E-36)
            java.lang.String r2 = "ۦۗۢ۫ۡۦۜۛۥۘۘۗۥۘۡۤۦۚۙۘ"
        L_0x0112:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1911830450: goto L_0x0508;
                case 379755147: goto L_0x011c;
                case 871838635: goto L_0x012e;
                case 1863193243: goto L_0x0123;
                default: goto L_0x011b;
            }
        L_0x011b:
            goto L_0x0112
        L_0x011c:
            java.lang.String r2 = "ۥ۫ۤۗۛۨۘۨ۟ۨ۬ۘۥۙۚۛ۬ۖۨۘۧۢۧۡۛۖ۬ۨ۫"
            goto L_0x003d
        L_0x0120:
            java.lang.String r2 = "ۖ۫ۦۘۧۦۜۚۧۥۢۥۙۘۙ۠ۥۦۘ"
            goto L_0x0112
        L_0x0123:
            java.lang.String r2 = "ModConPickColor"
            boolean r2 = com.obwhatsapp.yo.shp.getIsGradiet(r2)
            if (r2 == 0) goto L_0x0120
            java.lang.String r2 = "ۚۛۙۧۤۤۥ۫۫۟ۗۧۖۚۖۘۡ۠ۘۘۤۜۥۘ"
            goto L_0x0112
        L_0x012e:
            java.lang.String r2 = "ۙۘۘ۫۟ۚۧۛۨۘۘۚۚ۬ۗۡۘ"
            goto L_0x0112
        L_0x0131:
            java.lang.String r2 = "ModConPickColor"
            android.graphics.drawable.GradientDrawable r2 = com.obwhatsapp.yo.shp.getGradientDrawable(r2)
            r0 = r38
            r0.setBackground(r2)
            java.lang.String r2 = "ۡ۫ۘۘۤ۫ۧۦۥۜۘۙۦۘۖۗۢۡۥۘۖ۫۬"
            goto L_0x003d
        L_0x0140:
            java.lang.String r2 = "ModConPickColor"
            r32 = -11
            r0 = r32
            int r32 = com.obwhatsapp.youbasha.others.getColor(r2, r0)
            java.lang.String r2 = "ۨۨۖۘۦۗ۠ۥۡۘۘ۟ۜۧۘۧۧۡۘۢ۟ۨۘ"
            goto L_0x003d
        L_0x014e:
            r39 = -105256893(0xfffffffff9b9e843, float:-1.2066072E35)
            java.lang.String r2 = "۫ۨۘۧۤۦۦۙۛۢۘ۫ۧۛۨۘۢ۠۫ۦۧۘۘ"
        L_0x0153:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1311113364: goto L_0x0164;
                case -960324562: goto L_0x015d;
                case -575137724: goto L_0x0170;
                case -190791860: goto L_0x016d;
                default: goto L_0x015c;
            }
        L_0x015c:
            goto L_0x0153
        L_0x015d:
            java.lang.String r2 = "ۤ۠ۘۘ۟ۡۖۤۜۜۘۦۖۖۨ۟ۥۡ۫۬۟ۤۘۘ۬۫ۘ۬ۛۦ"
            goto L_0x003d
        L_0x0161:
            java.lang.String r2 = "ۗۧۜۗۦ۟ۛ۟۫ۤ۠۟ۖۦ۟ۢۥ۟"
            goto L_0x0153
        L_0x0164:
            r2 = -11
            r0 = r32
            if (r0 == r2) goto L_0x0161
            java.lang.String r2 = "۫۠۫ۖۜۡۢۖۧۘۗۡۖۗۛ۫ۢۚۙۡۤۨۘ"
            goto L_0x0153
        L_0x016d:
            java.lang.String r2 = "ۦۨۢۥ۟ۜۚۙۙۚۚۛۨۨۤ۫۟ۦۘ"
            goto L_0x0153
        L_0x0170:
            java.lang.String r2 = "ۢۗۡۧ۬۬ۨۢۦۘ۠ۛۛ۟ۡۘ۟ۘ۫ۤۧۙ"
            goto L_0x003d
        L_0x0174:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r0 = r32
            r2.<init>(r0)
            r0 = r38
            r0.setBackground(r2)
            java.lang.String r2 = "ۤ۠ۘۘ۟ۡۖۤۜۜۘۦۖۖۨ۟ۥۡ۫۬۟ۤۘۘ۬۫ۘ۬ۛۦ"
            goto L_0x003d
        L_0x0184:
            r0 = r42
            android.widget.FrameLayout r0 = r0.f1151g
            r31 = r0
            java.lang.String r2 = "ۛۤۥۘۙۥۧۘۗۨۘۘ۬ۧۡۘۖۙۘۘ۟ۘۥۜۨۙۥ"
            goto L_0x003d
        L_0x018e:
            r39 = -104667966(0xfffffffff9c2e4c2, float:-1.2649317E35)
            java.lang.String r2 = "۠ۛۢۦ۫۫ۢۨۨۘ۠ۨۢۚۨ۠ۧۚۜۨۦۡۘۤۡۤۦۜۡۘ"
        L_0x0193:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -886448543: goto L_0x019d;
                case 521018261: goto L_0x01ac;
                case 983567251: goto L_0x050c;
                case 1056871325: goto L_0x01a9;
                default: goto L_0x019c;
            }
        L_0x019c:
            goto L_0x0193
        L_0x019d:
            boolean r2 = com.obwhatsapp.yo.yo.PicProf()
            if (r2 == 0) goto L_0x01a6
            java.lang.String r2 = "ۡۦۨۘۜۡۥۜۛۧۘۧۥۚۨۡۘ۠ۘ۬۫۟ۡۥ۬ۡۘ۟ۖۥۘ"
            goto L_0x0193
        L_0x01a6:
            java.lang.String r2 = "ۚۦۚ۟ۦۧۘۧۜ۬۟ۛۡۘۛۦۨۘۖ۬ۜۘ"
            goto L_0x0193
        L_0x01a9:
            java.lang.String r2 = "ۤۘۥ۠ۙ۫ۚۦۜۥۗۦۖۦۖۘ"
            goto L_0x0193
        L_0x01ac:
            java.lang.String r2 = "۠ۖۖۘۚ۠ۥۘۢۧۧ۠ۡۡۧۖۘۙۡ۟ۨۖۜۥ۟ۨ"
            goto L_0x003d
        L_0x01b0:
            r30 = 8
            java.lang.String r2 = "ۗۖۛ۬ۚۨ۫ۢۡ۬ۜۘۦۤۘۘ"
            goto L_0x003d
        L_0x01b6:
            java.lang.String r2 = "ۤۗۜۙۦۧۗۖۖۨۦۘۘۘۖ۟"
            r29 = r30
            goto L_0x003d
        L_0x01bc:
            r28 = 0
            java.lang.String r2 = "ۦۦۧۧۘۨۘۢۖ۠ۥۢ۟ۘۡۙۘۡۨ"
            goto L_0x003d
        L_0x01c2:
            java.lang.String r2 = "ۡۧۦۘۡۨ۬ۥۦۧۛ۬ۡۘ۫ۘۜۘ"
            r29 = r28
            goto L_0x003d
        L_0x01c8:
            r0 = r31
            r1 = r29
            r0.setVisibility(r1)
            java.lang.String r2 = "۫ۢۤۛۢۘۦ۬ۚۜۙۘۘۦۜ۬ۥ۠ۡۥۚۜۢۨ۬"
            goto L_0x003d
        L_0x01d3:
            r0 = r42
            android.widget.TextView r0 = r0.f1152h
            r27 = r0
            java.lang.String r2 = "ۜۖۡۙ۟ۨۘۤۚۨۘۗۚۘ۠ۦۦۡ۬ۥۤۦۥۘ۠ۛۘۘ"
            goto L_0x003d
        L_0x01dd:
            boolean r26 = com.obwhatsapp.yo.yo.NameProf()
            java.lang.String r2 = "ۦۨۗۗۧۡۘۢۜۦۡ۬۟ۚۧۨۘۖ۠ۜۡۜۨ"
            goto L_0x003d
        L_0x01e5:
            r14 = 4
            java.lang.String r2 = "ۨۘۗۜۨ۫ۙۘۤۘۡۖ۬ۦۜۘ"
            goto L_0x003d
        L_0x01ea:
            r39 = -1569696531(0xffffffffa27054ed, float:-3.2571025E-18)
            java.lang.String r2 = "ۧۚۨۥۚۡۘۥ۟ۢۖ۟ۖ۬۟ۤ۟ۜۙۛۖۜۘۤۥۦۜ۠"
        L_0x01ef:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1783209390: goto L_0x01f9;
                case -82055110: goto L_0x0514;
                case 619758252: goto L_0x01ff;
                case 1724571081: goto L_0x0204;
                default: goto L_0x01f8;
            }
        L_0x01f8:
            goto L_0x01ef
        L_0x01f9:
            java.lang.String r2 = "۟ۤۚۙۡۗ۠ۙۖ۠ۤۡۖۘۤۖۘۦ۠ۧۛ۟۫"
            goto L_0x01ef
        L_0x01fc:
            java.lang.String r2 = "ۘ۬ۤۙۦۧۙ۬ۘۘۘ۟ۜۖۤۘۡ۟۟ۡۤۡۜۘۨۘ۬ۨ"
            goto L_0x01ef
        L_0x01ff:
            if (r26 == 0) goto L_0x01fc
            java.lang.String r2 = "ۙۧۘۡ۫ۦۧ۫۬ۜۘۜۖ۟ۙ۠ۙ۟ۦۙۚۦ"
            goto L_0x01ef
        L_0x0204:
            java.lang.String r2 = "ۘۖۗۜۜۘۘۢ۫ۦۘۙۜۗۛ۬ۡۘ"
            goto L_0x003d
        L_0x0208:
            r25 = 4
            java.lang.String r2 = "ۥۧۗۧۤۧۨۖ۫۬ۙۢۨۚۢۖۘۡۛۜۗ۟ۢۤۥۡۦۘ"
            goto L_0x003d
        L_0x020e:
            java.lang.String r2 = "ۤۦۤ۟۬ۚۢۖ۠۟ۨۘۢ۟ۨ۠ۧ۬ۧۚ۟ۚۚۖ"
            r24 = r25
            goto L_0x003d
        L_0x0214:
            r23 = 0
            java.lang.String r2 = "ۖ۟ۤۦۚۙۙ۫۟ۨ۬ۨۗۤۡۘۦۜۙ"
            goto L_0x003d
        L_0x021a:
            java.lang.String r2 = "ۨۧۡۡ۬ۘۘۛۚۡ۠ۧۜۤ۫ۥۢ۟ۜۧۧۥ"
            r24 = r23
            goto L_0x003d
        L_0x0220:
            r0 = r27
            r1 = r24
            r0.setVisibility(r1)
            java.lang.String r2 = "ۖۡ۟۠۫ۜ۫ۦۖ۟ۚۦۘۨۘ۠ۛۨ۫"
            goto L_0x003d
        L_0x022b:
            r0 = r42
            android.widget.TextView r2 = r0.f1152h
            r0 = r42
            int r0 = r0.f1150f
            r39 = r0
            r0 = r39
            r2.setTextColor(r0)
            java.lang.String r2 = "۠ۜۧۘ۟ۡۚۤۘۦۘ۫ۖۨ۬ۖۨۘ۫ۦۜ۬۟ۦۙ۠ۥۧۦ۬"
            goto L_0x003d
        L_0x023e:
            r0 = r42
            android.widget.TextView r2 = r0.f1153i
            r0 = r42
            int r0 = r0.f1150f
            r39 = r0
            r0 = r39
            r2.setTextColor(r0)
            java.lang.String r2 = "ۨۜۗ۬ۗۖۚۛۖۤۢ۬۫۟ۦۤۤ۠"
            goto L_0x003d
        L_0x0251:
            java.lang.String r2 = "convostyle"
            java.lang.String r22 = "0"
            r0 = r22
            java.lang.String r2 = com.obwhatsapp.yo.shp.getPrefString(r2, r0)
            int r22 = java.lang.Integer.parseInt(r2)
            java.lang.String r2 = "ۜۧۜۘ۟ۡۘۥۚ۬۠ۖۘۜۥ۠ۢۤۚۢۨۗۢۤۧۙ۫ۢ"
            goto L_0x003d
        L_0x0263:
            r39 = -914322023(0xffffffffc9808d99, float:-1053107.1)
            java.lang.String r2 = "ۡۥۦۚۢۧۗ۫ۨۘۡۢۡۘ۟ۖۤۢ۟۠ۨۨۖ"
        L_0x0268:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1842102014: goto L_0x0528;
                case -1470553592: goto L_0x0272;
                case 4724063: goto L_0x027d;
                case 655172254: goto L_0x0278;
                default: goto L_0x0271;
            }
        L_0x0271:
            goto L_0x0268
        L_0x0272:
            java.lang.String r2 = "ۦۧۚۦۖۘۘۘۢۘۘ۬۠ۛ۟ۦۡ"
            goto L_0x0268
        L_0x0275:
            java.lang.String r2 = "ۜۤۜۘۚۤۙۙۙۢۡۦۥ۬۟ۘۘۜۤۜۤۜۙۤۜۜ"
            goto L_0x0268
        L_0x0278:
            if (r22 == 0) goto L_0x0275
            java.lang.String r2 = "ۦۢۛ۠ۡۘۘۤۥۤۗۖ۟۫ۨۨۘۢ۬ۤ۬۫۠"
            goto L_0x0268
        L_0x027d:
            java.lang.String r2 = "ۤۘۦۘۡۤۥۘ۠ۙۚۥ۫ۨۘۢ۟ۤۙۗۢۜۜۥۘۜۗۙ۬ۦۚ"
            goto L_0x003d
        L_0x0281:
            r39 = -1045483382(0xffffffffc1af308a, float:-21.8987)
            java.lang.String r2 = "ۡۖ۫ۜ۟ۘۘۛۥۗۨۛۛۛۗۦۘۢۧۡۘۘۖۥ"
        L_0x0286:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -2063207613: goto L_0x0297;
                case -1114091518: goto L_0x0290;
                case 1191761526: goto L_0x0520;
                case 1572751045: goto L_0x029f;
                default: goto L_0x028f;
            }
        L_0x028f:
            goto L_0x0286
        L_0x0290:
            java.lang.String r2 = "ۤۚۜۘۥۚۥ۠ۤۚۧۖۙۜۥۤۦۛۖۘ۠۫۬ۙۧۙ"
            goto L_0x003d
        L_0x0294:
            java.lang.String r2 = "۫ۛۡۙۨۥۘۛۧۘۛۢۖۨۢ۟ۤ۫ۦۙۥۘ"
            goto L_0x0286
        L_0x0297:
            r2 = 1
            r0 = r22
            if (r0 == r2) goto L_0x0294
            java.lang.String r2 = "ۖۨ۬۟ۜۡۘۜۨۙۥۨۧۥۚۦۘۢۖۧ۫۬ۗ"
            goto L_0x0286
        L_0x029f:
            java.lang.String r2 = "ۡ۫ۦ۫ۥ۠۬ۘۚ۫ۛۦۘ۬۬ۥ۫ۥۧۤۦۦۘ۫ۨ۫ۨۙۥ"
            goto L_0x0286
        L_0x02a2:
            r39 = 849000166(0x329ab6e6, float:1.8011132E-8)
            java.lang.String r2 = "۫۠۠ۚۧۦۘ۟ۘۘۦۤ۬ۧۙۛۙۤۜۧۢۜۥۧۡۘ"
        L_0x02a7:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -2049057354: goto L_0x02bf;
                case 165486559: goto L_0x02b7;
                case 498348231: goto L_0x051c;
                case 777529922: goto L_0x02b1;
                default: goto L_0x02b0;
            }
        L_0x02b0:
            goto L_0x02a7
        L_0x02b1:
            java.lang.String r2 = "ۤۡۦ۟ۤۥ۬ۘۥۦۧۖۗۤ۠ۘۢ۬ۘۦ"
            goto L_0x02a7
        L_0x02b4:
            java.lang.String r2 = "ۘۙ۫ۘۘۘۖۧۨۛۡۘ۟۬ۜۘۤۢۤۖۜ۟۬ۨۨۘۤۘۜۘ"
            goto L_0x02a7
        L_0x02b7:
            r2 = 2
            r0 = r22
            if (r0 == r2) goto L_0x02b4
            java.lang.String r2 = "۟ۧۨۘۘۥ۬ۥۧۜ۟ۜۘۛۥ۫ۖۚۖۘ۠ۥۤۨ۬"
            goto L_0x02a7
        L_0x02bf:
            java.lang.String r2 = "ۢ۫ۧۢ۠ۢۘۜۙۙۥۤۧۥۦۘ۫۫۠ۤ۟ۨۧ۠ۢ۬ۨۦ"
            goto L_0x003d
        L_0x02c3:
            r39 = 1086146921(0x40bd4969, float:5.915211)
            java.lang.String r2 = "۬ۛۘۘۘ۫۟ۦۧۗۚۧۜۦۗۜۘ۫ۛ۫۠۬۫ۧ۟ۚۦۡۘ"
        L_0x02c8:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1847271006: goto L_0x02d2;
                case -1716145333: goto L_0x02d9;
                case 336768923: goto L_0x02e1;
                case 1002935982: goto L_0x02e4;
                default: goto L_0x02d1;
            }
        L_0x02d1:
            goto L_0x02c8
        L_0x02d2:
            java.lang.String r2 = "۬ۥۦ۬۠۠ۨۗ۟ۤۖ۬۫ۚۘۘۗۖۡۢ۬ۛۢ۠ۧۨۨ"
            goto L_0x003d
        L_0x02d6:
            java.lang.String r2 = "ۗۛۡۘ۟ۢۢۧۙۜۥۛۚۧۥۥۘۙۖ۫ۨۘۤۨۥۛۖۘۖ"
            goto L_0x02c8
        L_0x02d9:
            r2 = 3
            r0 = r22
            if (r0 == r2) goto L_0x02d6
            java.lang.String r2 = "ۥ۠ۘۘ۟۬ۦۘۨۚۚۗۛۥۘۤۚ۠ۛۧۨۘۤ۬ۖۜۛۙۜ۟ۢ"
            goto L_0x02c8
        L_0x02e1:
            java.lang.String r2 = "۠۠ۙۖۛۦۧۗۜۘۦۥ۟ۡ۠ۜۘ"
            goto L_0x02c8
        L_0x02e4:
            java.lang.String r2 = "ۗ۟ۦۘۜ۫۟ۡۜۤ۬ۢۘ۟ۧۦۘۛۙۡۘۤۚۥ۬ۨۘۦۦۚ"
            goto L_0x003d
        L_0x02e8:
            r0 = r42
            android.widget.TextView r2 = r0.f1152h
            r39 = 1
            r0 = r39
            d(r2, r0)
            java.lang.String r2 = "۫ۡۦۢۥۢۜۙۚ۬ۜۦۜۜۙۙۗۙۤۖۖ"
            goto L_0x003d
        L_0x02f7:
            r0 = r42
            android.widget.TextView r2 = r0.f1153i
            r39 = 1
            r0 = r39
            d(r2, r0)
            java.lang.String r2 = "ۨۢۧۘۥ۫ۡ۠ۤۗۚۦۙۤۧۜ۬"
            goto L_0x003d
        L_0x0306:
            r0 = r42
            android.widget.TextView r2 = r0.f1152h
            r39 = 1
            r0 = r39
            d(r2, r0)
            java.lang.String r2 = "ۡۨۥۘۜۜ۫ۛۙۤۖۜۥۘۘۨۨۘ"
            goto L_0x003d
        L_0x0315:
            r0 = r42
            android.widget.TextView r2 = r0.f1153i
            r39 = 1
            r0 = r39
            d(r2, r0)
            java.lang.String r2 = "ۨ۟ۥۢۤۜۘۙۦۧۦۚۖۢۜۜ"
            goto L_0x003d
        L_0x0324:
            r0 = r42
            android.widget.TextView r2 = r0.f1152h
            r39 = 0
            r0 = r39
            d(r2, r0)
            java.lang.String r2 = "۫۬ۘۘ۟۟ۗۜۗۦۡۘۥۘۚۜۤۘ۟ۚ"
            goto L_0x003d
        L_0x0333:
            r0 = r42
            android.widget.TextView r2 = r0.f1153i
            r39 = 0
            r0 = r39
            d(r2, r0)
            java.lang.String r2 = "ۤۙۧۢۛۘۧۛ۠ۨۨ۫۬ۦۛۖۡ۬ۜۥۚۧۖ۠ۤۤۥۘ"
            goto L_0x003d
        L_0x0342:
            r0 = r42
            android.widget.TextView r0 = r0.f1152h
            r21 = r0
            java.lang.String r2 = "ۥۖۦۛۦۨۘۘ۬۫ۢۦۘۤ۬ۘۘۘۡۤۦۛ۠"
            goto L_0x003d
        L_0x034c:
            r19 = 17
            java.lang.String r2 = "ۗۤۦۘۚۥۘۨۦۤۘۘۘۨۨ۬"
            goto L_0x003d
        L_0x0352:
            java.lang.String r2 = "۟ۜۥۦ۫ۚۚۘۘۘۚ۠۬ۡۧۚ"
            r20 = r21
            goto L_0x003d
        L_0x0358:
            java.lang.String r2 = "ۚۙۨۙۗۦۥۜۘۧۙ۫ۥۙ۟ۙۥۧۘ"
            r18 = r19
            goto L_0x003d
        L_0x035e:
            r0 = r42
            android.widget.TextView r2 = r0.f1152h
            r39 = 0
            r0 = r39
            d(r2, r0)
            java.lang.String r2 = "۟ۥ۠ۜۢۧۛۚۘۙ۟۟ۗ۫۫"
            goto L_0x003d
        L_0x036d:
            r0 = r42
            android.widget.TextView r2 = r0.f1153i
            r39 = 0
            r0 = r39
            d(r2, r0)
            java.lang.String r2 = "ۦۖۖۘۗۘۦۘۢۦۜۘۥۧۚ۫ۖۘۥۛۗۘۖۡ"
            goto L_0x003d
        L_0x037c:
            r0 = r42
            android.widget.TextView r0 = r0.f1152h
            r17 = r0
            java.lang.String r2 = "۟ۥۨۘ۫ۨۖ۟۫ۙۦۤۘۘۥۦۘ"
            goto L_0x003d
        L_0x0386:
            r16 = 8388611(0x800003, float:1.1754948E-38)
            java.lang.String r2 = "ۚۧۢۛۦۛۤ۟۟ۛۤۦۡۚ۬ۢ۠ۙۚۘۧ۫ۚۘ"
            goto L_0x003d
        L_0x038d:
            java.lang.String r2 = "ۘ۠ۦۘۨۛۜۘۙۘۥۗۜۤۙۦۢ۠۟ۡ۬۫ۥ"
            r18 = r16
            goto L_0x003d
        L_0x0393:
            java.lang.String r2 = "ۧۙۛۖۖۘۚۙۥۘۢۡۤ۬ۥۨۚ۬ۤۤۜ۟ۡۨۘ"
            r20 = r17
            goto L_0x003d
        L_0x0399:
            r0 = r20
            r1 = r18
            c(r0, r1)
            java.lang.String r2 = "ۢ۫ۘۘۗۛۖۚۥۖۨۗۥۘۨۛۡۘۛۢۡۘۙۦۛ"
            goto L_0x003d
        L_0x03a4:
            r0 = r42
            android.widget.TextView r2 = r0.f1153i
            r0 = r18
            c(r2, r0)
            java.lang.String r2 = "ۧۦۡۖۨۧۘۘۗۦۢ۬ۘۘۥۥۨۖۘۨۨۥۦۘۜۧ۫ۢۡۡۘ"
            goto L_0x003d
        L_0x03b1:
            r0 = r42
            android.widget.TextView r2 = r0.f1152h
            r2.invalidate()
            java.lang.String r2 = "ۜۦۜۘۛۥۜۘۛۨۤۚۖۛۥۗۦۘۨۧۛ۠ۘۚ"
            goto L_0x003d
        L_0x03bc:
            r0 = r42
            android.widget.TextView r2 = r0.f1153i
            r2.invalidate()
            java.lang.String r2 = "۠ۧۖ۠۠ۚۜۤۥۨۧۢۧۗۜۙ۫ۙۘۗ۫"
            goto L_0x003d
        L_0x03c7:
            r0 = r42
            android.widget.TextView r15 = r0.f1154j
            java.lang.String r2 = "ۤۜۙۜ۠ۘۘۘۙۨۘۧۧ۫ۙۘۦۥ۠ۡۥۛۨۘ"
            goto L_0x003d
        L_0x03cf:
            r39 = 455791418(0x1b2ad33a, float:1.4130321E-22)
            java.lang.String r2 = "ۥ۠ۜۚۖۥۚۜۡۘ۠ۗۦۘ۟ۥۤ"
        L_0x03d4:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1560763538: goto L_0x03de;
                case -1179499359: goto L_0x03ea;
                case 193685921: goto L_0x0538;
                case 1993537570: goto L_0x03ed;
                default: goto L_0x03dd;
            }
        L_0x03dd:
            goto L_0x03d4
        L_0x03de:
            boolean r2 = com.obwhatsapp.yo.yo.statuschat_disabled()
            if (r2 == 0) goto L_0x03e7
            java.lang.String r2 = "ۘۘۗۚۗۛ۬ۛۧۢۚۧۢۡۘ"
            goto L_0x03d4
        L_0x03e7:
            java.lang.String r2 = "ۚۖۦۡۦۦۘۚۦۙۧ۠ۤۧ۫ۨۘۢۢ۟۠۬ۡۘ۟ۛۦ"
            goto L_0x03d4
        L_0x03ea:
            java.lang.String r2 = "ۡۜ۫ۤۜۧۘۚۚۡ۟ۧۘۘۗ۟ۙ۟ۖۘۘ"
            goto L_0x03d4
        L_0x03ed:
            java.lang.String r2 = "ۜۙۗۦۧۤۤۖۙۚۙۨۖۚۘۘۘۘۘۖۧۨ"
            goto L_0x003d
        L_0x03f1:
            java.lang.String r2 = "۠ۘۨ۫ۗۙۖۡۢۚۘۘۜ۠ۚۚۙۗ۬ۗۜۘۧۧۢۖ۟ۗ"
            r13 = r14
            goto L_0x003d
        L_0x03f6:
            r12 = 0
            java.lang.String r2 = "۫ۖۦۘۙۗۤۧ۟ۦۘۗۘۥۡۖۨۘ۬۟ۗۜۢۙ۠ۛۖۘ"
            goto L_0x003d
        L_0x03fb:
            java.lang.String r2 = "ۛ۫ۘۘۙۤۦۘۘۦۛۧ۬ۦۘۘۡۦۘۧۧۢ"
            r13 = r12
            goto L_0x003d
        L_0x0400:
            r15.setVisibility(r13)
            java.lang.String r2 = "ۨۦۥۘۖۧۘۖۢۘۘۗۢۤ۟۬۟ۘۜۦۘ"
            goto L_0x003d
        L_0x0407:
            r0 = r42
            android.widget.TextView r2 = r0.f1154j
            java.lang.String r39 = "ModChatGStatusT"
            r40 = -1
            int r39 = com.obwhatsapp.youbasha.others.getColor(r39, r40)
            r0 = r39
            r2.setTextColor(r0)
            java.lang.String r2 = "ۘۛۜۘ۫ۗۗۗۨۨۘۤ۬ۖۛۨۨ۬ۗۡۘ۬ۛۢۨۥۢۢۦۙ"
            goto L_0x003d
        L_0x041c:
            r39 = 1902857121(0x716b4ba1, float:1.1651265E30)
            java.lang.String r2 = "ۥۖۦۢۘۨۘ۟ۧۘۘۦۖۜۘۚۚ۫ۤ۟ۧۖۜ"
        L_0x0421:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -825302088: goto L_0x043c;
                case 996020951: goto L_0x042b;
                case 1190130165: goto L_0x0540;
                case 1338163903: goto L_0x0439;
                default: goto L_0x042a;
            }
        L_0x042a:
            goto L_0x0421
        L_0x042b:
            java.lang.String r2 = "ModChatGStatusB"
            boolean r2 = com.obwhatsapp.yo.shp.getIsGradiet(r2)
            if (r2 == 0) goto L_0x0436
            java.lang.String r2 = "ۧۜۗ۠ۢ۟ۡ۬ۖۦ۠۟ۤۢۢۘۢۗ"
            goto L_0x0421
        L_0x0436:
            java.lang.String r2 = "ۥ۫ۡۘۧۧۨۘۜۦ۟ۚ۫۫ۡ۬ۡۘ"
            goto L_0x0421
        L_0x0439:
            java.lang.String r2 = "۟۠ۥۡۙ۬ۙ۟ۜۘۤۛۥۘۦۛۡۙ۠ۨۘۖۘ۟ۜۨۦ۬ۖۧ"
            goto L_0x0421
        L_0x043c:
            java.lang.String r2 = "۬ۘۙۙۥ۬۟ۥ۫ۦۡۧۚۢۙ۟ۦۧ"
            goto L_0x003d
        L_0x0440:
            r0 = r42
            android.widget.TextView r2 = r0.f1154j
            java.lang.String r39 = "ModChatGStatusB"
            android.graphics.drawable.GradientDrawable r39 = com.obwhatsapp.yo.shp.getGradientDrawable(r39)
            r0 = r39
            r2.setBackground(r0)
            java.lang.String r2 = "۬ۢ۫ۖۢۚۥۥۘۤۜ۬ۡۗۥۙۧۧۡۨۡۘ۬ۦۘ۠ۥۡ"
            goto L_0x003d
        L_0x0453:
            r0 = r42
            android.widget.TextView r2 = r0.f1154j
            java.lang.String r39 = "ModChatGStatusB"
            java.lang.String r40 = "#44000000"
            int r40 = android.graphics.Color.parseColor(r40)
            int r39 = com.obwhatsapp.youbasha.others.getColor(r39, r40)
            r0 = r39
            r2.setBackgroundColor(r0)
            java.lang.String r2 = "۫ۘۛۙ۬ۢ۟ۜۛ۟ۘۜۘۗ۟ۗۥۧۦ"
            goto L_0x003d
        L_0x046c:
            java.lang.String r2 = "Conv_call_btn"
            boolean r11 = com.obwhatsapp.yo.shp.getBoolean(r2)
            java.lang.String r2 = "ۧۦۦۘ۬ۛۦۘۤۙۥۚۙۢۚۨۖ۫ۢۢۚۚ۬"
            goto L_0x003d
        L_0x0476:
            r0 = r42
            android.widget.ImageButton r10 = r0.f1155k
            java.lang.String r2 = "ۚ۬ۛ۟۟ۥ۟ۖۜۨۧۜۨ۬ۖۘ۟ۘۘۘ۫ۖۘۗۖۘ"
            goto L_0x003d
        L_0x047e:
            r39 = -1552532799(0xffffffffa3763ac1, float:-1.3348128E-17)
            java.lang.String r2 = "ۙ۟ۨۘۚ۟ۘۘ۫ۖۘ۫۟ۥۘۜ۬ۢۢۛ۠"
        L_0x0483:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1698244529: goto L_0x048d;
                case -674382321: goto L_0x0493;
                case 1504684950: goto L_0x0548;
                case 1639513099: goto L_0x0498;
                default: goto L_0x048c;
            }
        L_0x048c:
            goto L_0x0483
        L_0x048d:
            java.lang.String r2 = "ۨۘۡۤۡۧۛ۠ۖۘۗۤۛۙۥۨۘ"
            goto L_0x0483
        L_0x0490:
            java.lang.String r2 = "۬ۖۥۘۢۛۛۛۘ۟ۖ۬ۙۡ۬ۤۧۜ۬ۘ۫"
            goto L_0x0483
        L_0x0493:
            if (r11 == 0) goto L_0x0490
            java.lang.String r2 = "۫ۖۡۘۢۙ۟ۜۦۛۦۚۡۘۚۦۚۦۜ"
            goto L_0x0483
        L_0x0498:
            java.lang.String r2 = "ۤۛۙ۠۟ۖۘ۠ۢۧۥۡ۠ۥۗۚ۠ۦۥۛ۠"
            goto L_0x003d
        L_0x049c:
            r9 = 8
            java.lang.String r2 = "ۦۖۦۘۡ۫ۖۘۘۗۗۗۡ۟ۜۗۙۡۖۥ"
            goto L_0x003d
        L_0x04a2:
            java.lang.String r2 = "ۘ۟ۘۘۧۗۚۘۙۥۘۧۙۖۘۤۙۦۧ۠ۘۖۥ۫ۖۦۧۘ۬ۗۥ"
            r8 = r9
            goto L_0x003d
        L_0x04a7:
            r7 = 0
            java.lang.String r2 = "ۙ۟ۦۘۛۨۡ۟ۖ۟ۗۦۧۘ۟ۧۚۚۛۖۘۘۘۧ۠۬۟ۗۥۨ"
            goto L_0x003d
        L_0x04ac:
            java.lang.String r2 = "ۦۧۡۘۥۤۙۦۥۢۦۗۥۘۛۥۧۘ۫ۨۡۘۘۨۧ"
            r8 = r7
            goto L_0x003d
        L_0x04b1:
            r10.setVisibility(r8)
            java.lang.String r2 = "ۥۨۦۘۗۦۥ۫ۜ۬۬ۨۘۙ۫ۗ"
            goto L_0x003d
        L_0x04b8:
            r0 = r42
            android.widget.ImageButton r6 = r0.f1156l
            java.lang.String r2 = "۬۟ۤ۟ۨۛۨۖۤ۬ۥۡ۟ۙۤ۟ۛۗۘۘۖۜۢۧۨ۟ۥ"
            goto L_0x003d
        L_0x04c0:
            java.lang.String r2 = "ۛۤ۠ۜ۫ۦۙۗۧۚۗۖۘۧۜۛۤۖۜۘ۠ۘۘۚۡۧۜۨۜۘ"
            r4 = r5
            goto L_0x003d
        L_0x04c5:
            r39 = -873801484(0xffffffffcbead8f4, float:-3.0781928E7)
            java.lang.String r2 = "ۤ۠ۥۦۡ۠۬ۥۡۢۙۙۚۡۧ"
        L_0x04ca:
            int r40 = r2.hashCode()
            r40 = r40 ^ r39
            switch(r40) {
                case -1073951515: goto L_0x0550;
                case -191820399: goto L_0x04df;
                case 1710006899: goto L_0x04d4;
                case 2098671166: goto L_0x04da;
                default: goto L_0x04d3;
            }
        L_0x04d3:
            goto L_0x04ca
        L_0x04d4:
            java.lang.String r2 = "۫۬۫۬ۦۙۧۛۛۜ۠ۢ۟ۗۥۥۙ۫ۦ۟ۜۘۙۡ۬۫ۗ"
            goto L_0x04ca
        L_0x04d7:
            java.lang.String r2 = "۠ۧۤۜۙۤۘ۬ۡۘۛۦۡۘۗۡ۠ۙۡۘ"
            goto L_0x04ca
        L_0x04da:
            if (r11 == 0) goto L_0x04d7
            java.lang.String r2 = "ۦۚۡۜۧۡۜۨۨۘۖۤۡۘۙۨ۠"
            goto L_0x04ca
        L_0x04df:
            java.lang.String r2 = "۟ۚۜۘۤۧۡۘۛۧۜۢۜۢۤ۫ۧ"
            goto L_0x003d
        L_0x04e3:
            r3 = 8
            java.lang.String r2 = "ۜۡۙۧۢۥۘۛۨۚۜۛ۬ۥۤۦۘۙ۠ۤ"
            goto L_0x003d
        L_0x04e9:
            java.lang.String r2 = "ۖۤۜۦۜۥۘۙ۬ۡۘۘۨۘۘ۠ۢۥۘۧۥۧۥۧۤۡۦۘ"
            r4 = r3
            goto L_0x003d
        L_0x04ee:
            r6.setVisibility(r4)
            java.lang.String r2 = "۠ۨۙۜ۠ۜۨۨۛ۟ۤۛۤۨۨۚۙ۠ۛۜۜۧۧۘۜۙۚ"
            goto L_0x003d
        L_0x04f5:
            r0 = r42
            android.view.View r2 = r0.f1149e
            r2.invalidate()
            java.lang.String r2 = "ۘۥۢۧۥۢۘۥ۫ۘۗۚۜ۟ۜۛۛ۫"
            goto L_0x003d
        L_0x0500:
            java.lang.String r2 = "۟ۧۤۦۘۛۡۚۙۦۙۦۙۗ۬ۡۜۖۘۛ۠ۜۖۖۦۘۛۗۖۘ"
            goto L_0x003d
        L_0x0504:
            java.lang.String r2 = "ۜ۠ۘۜۥۥۘۢ۠ۢۥۜۨۜۖۡۥۤۜۢۖۥ"
            goto L_0x003d
        L_0x0508:
            java.lang.String r2 = "ۙۗۧ۫ۛ۟ۥۦۖۘۛۡ۬۫۟۟"
            goto L_0x003d
        L_0x050c:
            java.lang.String r2 = "ۦ۬ۤۥۘۖۙۨ۟ۤۛۙ۟ۖۜۤۘۜۥۙۙ۫ۤۦۘ۟۬ۘ"
            goto L_0x003d
        L_0x0510:
            java.lang.String r2 = "ۡۧۦۘۡۨ۬ۥۦۧۛ۬ۡۘ۫ۘۜۘ"
            goto L_0x003d
        L_0x0514:
            java.lang.String r2 = "ۥۚ۫۟ۢۡۘۙۚ۬ۘۜۧۘۦ۬۫۟ۨۥ۬ۗۤۦ۟ۖۜۧۚ"
            goto L_0x003d
        L_0x0518:
            java.lang.String r2 = "ۨۧۡۡ۬ۘۘۛۚۡ۠ۧۜۤ۫ۥۢ۟ۜۧۧۥ"
            goto L_0x003d
        L_0x051c:
            java.lang.String r2 = "ۖۥۗۚۨۨۧۤۡ۠۫ۖۛ۫ۜ۫ۘۖۙ۬ۖۘ۠ۦ۟"
            goto L_0x003d
        L_0x0520:
            java.lang.String r2 = "۫ۜۚۙۧ۬۟ۥۧۘۖۙۙۜ۟ۛ۫ۧۛ"
            goto L_0x003d
        L_0x0524:
            java.lang.String r2 = "ۤۙۧۢۛۘۧۛ۠ۨۨ۫۬ۦۛۖۡ۬ۜۥۚۧۖ۠ۤۤۥۘ"
            goto L_0x003d
        L_0x0528:
            java.lang.String r2 = "ۡۢۨ۬ۖۘۗۢۙۖ۫۟ۥۚۙۢۖ۟۠ۡۗ"
            goto L_0x003d
        L_0x052c:
            java.lang.String r2 = "ۦۖۖۘۗۘۦۘۢۦۜۘۥۧۚ۫ۖۘۥۛۗۘۖۡ"
            goto L_0x003d
        L_0x0530:
            java.lang.String r2 = "ۧۙۛۖۖۘۚۙۥۘۢۡۤ۬ۥۨۚ۬ۤۤۜ۟ۡۨۘ"
            goto L_0x003d
        L_0x0534:
            java.lang.String r2 = "ۧۦۡۖۨۧۘۘۗۦۢ۬ۘۘۥۥۨۖۘۨۨۥۦۘۜۧ۫ۢۡۡۘ"
            goto L_0x003d
        L_0x0538:
            java.lang.String r2 = "ۤ۫ۨۘۥۡۨۖۥۤ۫ۧۤ۫ۖ"
            goto L_0x003d
        L_0x053c:
            java.lang.String r2 = "ۛ۫ۘۘۙۤۦۘۘۦۛۧ۬ۦۘۘۡۦۘۧۧۢ"
            goto L_0x003d
        L_0x0540:
            java.lang.String r2 = "۟ۚۡۘ۬۫ۗۦۗۙۜۘۨۘۛۦۧۛۛۚۙ۟ۜۤ۟۟ۙۦۦ"
            goto L_0x003d
        L_0x0544:
            java.lang.String r2 = "۫ۘۛۙ۬ۢ۟ۜۛ۟ۘۜۘۗ۟ۗۥۧۦ"
            goto L_0x003d
        L_0x0548:
            java.lang.String r2 = "ۨ۠ۦۡۘۖۘۜۡۙۗۥۜۙ۟ۜۘۚ۬ۡۘۖۜۢۙۥۦۘۜۥۡ"
            goto L_0x003d
        L_0x054c:
            java.lang.String r2 = "ۦۧۡۘۥۤۙۦۥۢۦۗۥۘۛۥۧۘ۫ۨۡۘۘۨۧ"
            goto L_0x003d
        L_0x0550:
            java.lang.String r2 = "ۖۤۜۦۜۥۘۙ۬ۡۘۘۨۘۘ۠ۢۥۘۧۥۧۥۧۤۡۦۘ"
            goto L_0x003d
        L_0x0554:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.ConvoActionBar.updatePreview():void");
    }
}
