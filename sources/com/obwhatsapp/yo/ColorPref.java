package com.obwhatsapp.yo;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import c.c;
import c.d;
import com.obwhatsapp.youbasha.colorPicker.ColorSelectorDialog;
import com.obwhatsapp.youbasha.colorPicker.GradientColorsDialog;
import com.obwhatsapp.youbasha.others;
import java.util.Arrays;

public class ColorPref extends Preference {
    public static int RESETBTN_COLOR_CODE = -268435456;

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f487g = {"ModConPickColor", "ModConBackColor", "ModConColor", "statuses_bar_bg_picker", "list_bg_color", "ModChatColor", "ConvoBack", "ModChatGStatusB", "BGColor", "quoted_bg_picker", "emojipopup_header", "emojipopup_body"};

    /* renamed from: a  reason: collision with root package name */
    public boolean f488a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnClickListener f489b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f490c;

    /* renamed from: d  reason: collision with root package name */
    public int f491d = others.getColor(getKey());

    /* renamed from: e  reason: collision with root package name */
    public final String f492e = getKey();

    /* renamed from: f  reason: collision with root package name */
    public GradientDrawable f493f;

    static {
        String str = "ۤ۟ۤۙۛۥۗ۟ۨۘۡۡۧۥۚۜۘ۫ۘۘۤۘۢ";
        while (true) {
            switch ((str.hashCode() ^ 586) ^ 1517336879) {
                case -1082484820:
                    str = "ۗۘۧ۬۠ۨۘۡۗۡۖ۠ۡۘۖۡۢۚۧۡۘۥۘۨۘ";
                    break;
                case -363443687:
                    return;
            }
        }
    }

    public ColorPref(Context context) {
        super(context);
        setWidgetLayoutResource(yo.getID("color_pref", "layout"));
    }

    public ColorPref(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWidgetLayoutResource(yo.getID("color_pref", "layout"));
    }

    public ColorPref(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setWidgetLayoutResource(yo.getID("color_pref", "layout"));
    }

    @TargetApi(21)
    public ColorPref(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        setWidgetLayoutResource(yo.getID("color_pref", "layout"));
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(boolean r10) {
        /*
            r7 = 0
            r3 = 0
            java.lang.String r0 = "ۥۙۘۨۙ۬ۤۘ۫۫ۡ۫ۧۗۧۜۨۥۚۦۡۤ۠ۥۚ"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
            r6 = r7
            r8 = r7
        L_0x000a:
            int r0 = r1.hashCode()
            r7 = 831(0x33f, float:1.164E-42)
            r9 = 1723423428(0x66b95ac4, float:4.3765606E23)
            r0 = r0 ^ r7
            r0 = r0 ^ r9
            switch(r0) {
                case -2068655569: goto L_0x00be;
                case -2044972537: goto L_0x001d;
                case -1738954386: goto L_0x009b;
                case -1634279496: goto L_0x005a;
                case -1320656985: goto L_0x003a;
                case -706890330: goto L_0x00a5;
                case -496054282: goto L_0x0087;
                case 225846308: goto L_0x00c3;
                case 740784437: goto L_0x00af;
                case 875718182: goto L_0x0079;
                case 940021926: goto L_0x0067;
                case 1119946509: goto L_0x004d;
                case 1144428462: goto L_0x0091;
                case 1169606656: goto L_0x0070;
                case 1485767223: goto L_0x0045;
                case 2132075124: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            java.lang.String r0 = "ۧۜۖۘۡ۫ۥۘۜۗ۫ۙۡۗۖ۠ۙۦۘۤۛۡۘ"
            r1 = r0
            goto L_0x000a
        L_0x001d:
            r1 = -1909502131(0xffffffff8e2f4f4d, float:-2.1608597E-30)
            java.lang.String r0 = "ۧ۫ۨۗۘۡۘ۠۫ۡۘۤۗۖۛۥۢ"
        L_0x0022:
            int r7 = r0.hashCode()
            r7 = r7 ^ r1
            switch(r7) {
                case -39600995: goto L_0x002b;
                case 307507658: goto L_0x0037;
                case 1161342154: goto L_0x00b9;
                case 1817882238: goto L_0x0032;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0022
        L_0x002b:
            java.lang.String r0 = "ۚۢۢۗ۬ۤۦ۬ۥۘۤۨۨۜۨ۫۠ۨۡ۫ۘ۟ۥۤۨۘۥۙۡ"
            r1 = r0
            goto L_0x000a
        L_0x002f:
            java.lang.String r0 = "ۗۨۖۘۢ۫ۛۜۘۧۘ۬ۘۤۡۦۘ"
            goto L_0x0022
        L_0x0032:
            if (r10 == 0) goto L_0x002f
            java.lang.String r0 = "ۙ۟ۧۛۨ۬ۤۧۜۜۖۦۘۥۥۡۘۖۨۖۘۘۦۤۤۘ۟"
            goto L_0x0022
        L_0x0037:
            java.lang.String r0 = "ۙۛۦۧ۟ۚۚۨۖۘ۬۟ۘ۟ۡۚۛۢۘ"
            goto L_0x0022
        L_0x003a:
            java.lang.String r0 = "ModConPickColor"
            java.lang.Object[] r7 = com.obwhatsapp.yo.shp.getGradientColor(r0)
            java.lang.String r0 = "۫ۘۖۘۡۜۜۘۧۤۜۘۤ۬ۦۘۦۨۚۦۨۜۛۨۘۚۨ۫ۥۤۘۘ"
            r1 = r0
            r8 = r7
            goto L_0x000a
        L_0x0045:
            r0 = r8[r3]
            android.graphics.drawable.GradientDrawable$Orientation r0 = (android.graphics.drawable.GradientDrawable.Orientation) r0
            java.lang.String r1 = "ۜ۟ۖۗۗۤۨۘۘۢۡۦۘۡ۬ۘۧ۫ۘۘۧۦ۟ۧۦۘۘ"
            r6 = r0
            goto L_0x000a
        L_0x004d:
            r0 = 1
            r0 = r8[r0]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            java.lang.String r0 = "۠۠ۗۗۚۜۘۧ۫ۚۦۥۨۘ۫ۡ۠ۚۖ۟۫ۘ۬ۢۦۢۜۘ"
            r1 = r0
            goto L_0x000a
        L_0x005a:
            r0 = 2
            r0 = r8[r0]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r0.intValue()
            java.lang.String r0 = "۠ۢۥۧۙۨۙ۟ۨۛۨۛ۫۟ۜۘ۬ۨۦۘ"
            r1 = r0
            goto L_0x000a
        L_0x0067:
            java.lang.String r0 = "ModConColor"
            com.obwhatsapp.yo.shp.putGradientColor((java.lang.String) r0, (int) r5, (int) r4, (android.graphics.drawable.GradientDrawable.Orientation) r6)
            java.lang.String r0 = "۠۫ۘۘۖۥۘ۬۫ۙۛ۟ۛۧۗۨۤۧۢ۫ۛۙۖۙۥ"
            r1 = r0
            goto L_0x000a
        L_0x0070:
            java.lang.String r0 = "ModChatColor"
            com.obwhatsapp.yo.shp.putGradientColor((java.lang.String) r0, (int) r5, (int) r4, (android.graphics.drawable.GradientDrawable.Orientation) r6)
            java.lang.String r0 = "ۦۚۜۘۡۛ۠ۖۡۤۘۘ۫ۗۥۜۘ۫ۥۧۘۖۢۡۘۜۥۨۘۢ۬ۗ"
            r1 = r0
            goto L_0x000a
        L_0x0079:
            java.lang.String r0 = "ModConPickColor"
            int r1 = com.obwhatsapp.yo.ColorStore.getPrimaryColor()
            int r2 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            java.lang.String r0 = "ۖۖۦۦۥۘۧۚۢ۬ۧۙۤۙۤ"
            r1 = r0
            goto L_0x000a
        L_0x0087:
            java.lang.String r0 = "ModConPickColor"
            com.obwhatsapp.yo.shp.setIsGradiet(r0, r3)
            java.lang.String r0 = "ۚۡ۠ۡ۟ۡ۠ۛۜۘ۫ۚۦۚۘۢ۬ۧۚۜ۠"
            r1 = r0
            goto L_0x000a
        L_0x0091:
            java.lang.String r0 = "ModChatColor"
            com.obwhatsapp.yo.shp.setIsGradiet(r0, r3)
            java.lang.String r0 = "ۢۛۨۡۘۨۧ۠ۢ۬۠ۗ۬ۢۧ"
            r1 = r0
            goto L_0x000a
        L_0x009b:
            java.lang.String r0 = "ModChatColor"
            com.obwhatsapp.yo.shp.putInt(r0, r2)
            java.lang.String r0 = "ۖ۟۟ۥۚۥۖۡۘۗۛۜۢۤۤ"
            r1 = r0
            goto L_0x000a
        L_0x00a5:
            java.lang.String r0 = "ModConColor"
            com.obwhatsapp.yo.shp.setIsGradiet(r0, r3)
            java.lang.String r0 = "۟۟ۚۘۡۖۘۥۧۛ۠ۗۘۘ۬ۛۤۤۥۙ"
            r1 = r0
            goto L_0x000a
        L_0x00af:
            java.lang.String r0 = "ModConColor"
            com.obwhatsapp.yo.shp.putInt(r0, r2)
            java.lang.String r0 = "ۙۖۤۖ۬۟۫ۛۚۨۛۖۦ۠۠ۧ۫ۨۘ"
            r1 = r0
            goto L_0x000a
        L_0x00b9:
            java.lang.String r0 = "۟ۦۜۤۥۜۙۖۘۛۢۦ۬۫ۦ"
            r1 = r0
            goto L_0x000a
        L_0x00be:
            java.lang.String r0 = "ۙۖۤۖ۬۟۫ۛۚۨۛۖۦ۠۠ۧ۫ۨۘ"
            r1 = r0
            goto L_0x000a
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.ColorPref.a(boolean):void");
    }

    public void clearDot() {
        String str = "ۛۙۦۘ۬ۢۙۖۤۘۜۦۖۧۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 587) ^ -82532022) {
                case -1898522395:
                    str = "ۦۗ۫ۖۜۘۜۜۗۗۡۤۙ۟ۖۤۧ۟ۡ۟ۜ۫۠۠";
                    break;
                case -1266975371:
                    this.f490c.setImageResource(0);
                    str = "ۛۜۜۛۨۥۘۢۛۗ۬ۜۜۦ۟";
                    break;
                case -264389373:
                    return;
            }
        }
    }

    public void onBindView(View view) {
        String str = "۟ۤۦۘۢۗ۟ۗۢۖۜۜۗ۫ۥۧۘۥۙۜۘ";
        c cVar = null;
        c cVar2 = null;
        View.OnClickListener onClickListener = null;
        while (true) {
            switch ((str.hashCode() ^ 984) ^ 2003222205) {
                case -2038454901:
                    onClickListener = this.f489b;
                    str = "ۙ۟ۘۘۡ۫ۦ۫ۦ۫ۨۤۦۜۙۜۘۖۦۨۘ۟ۚۗۥۥۡ";
                    break;
                case -1856654881:
                    str = "ۗۙۧۥۥۖۜ۬ۗۧۜۘۖۨۜۘۙ۬ۜۡۘ۬";
                    break;
                case -1527846981:
                    return;
                case -1006917295:
                    str = "ۦۨۙۢۘۨۡۖ۫۠ۜۚ۬ۗ۠ۖۖۡۧۘۥ۠ۘۡۘۙۗۘۘ";
                    break;
                case -946955945:
                    cVar = new c(this, 2);
                    str = "۬ۢۖۘۘۧۚ۫۬ۜۧ۠ۜۙ۠۟";
                    break;
                case -430357950:
                    str = "ۥۘ۟۟ۗۤۚۧ۬ۘۛ۠ۢ۬";
                    break;
                case 700825419:
                    str = "ۖۦ۠ۤ۬ۖ۫ۜۜۧۘۢۘۚۨ۫ۜۧ";
                    cVar2 = onClickListener;
                    break;
                case 708699378:
                    update();
                    str = "ۥۡۙۥۘۧۘۘۗۙۨۜۘ۫ۡۧۖۛۛۜۥۥۦۛ۟";
                    break;
                case 1615289389:
                    super.onBindView(view);
                    str = "۫ۤ۫۠ۢۥۘ۬۠ۢۘۥۨۦۡۘۘۥۤۡ";
                    break;
                case 1736017192:
                    this.f490c = (ImageView) view.findViewById(yo.getID("imageViewIcon", "id"));
                    str = "ۘۢ۫ۗ۠ۧۖۨۢۖ۫ۤۨۥۘۤۖۥ۬ۜۛ";
                    break;
                case 1927859991:
                    view.setOnClickListener(cVar2);
                    str = "ۧۜۘۗۥۥۚۙۤۜ۫ۖۦ۫ۨ";
                    break;
                case 2037417494:
                    String str2 = "ۧ۟ۗ۬ۨۖۛۨۤ۟ۡۜۘۥۦۦۛۨۗ";
                    while (true) {
                        switch (str2.hashCode() ^ 1291424843) {
                            case -816142758:
                                str2 = "۬ۚۢۦ۠ۡۘ۫ۙ۫۠۬ۜۤ۬ۢۥۡۨ";
                                break;
                            case -746273407:
                                str = "ۧۘۤ۠ۛۙۖۙۛۥۡۖۗۜۚ۠۫ۡ";
                                continue;
                            case 96453076:
                                if (!this.f488a) {
                                    str2 = "ۜۡۡۥۡۖۢۛۘۘۧ۠ۙۘۗۨۘ";
                                    break;
                                } else {
                                    str2 = "ۧۧۤ۫۟ۨۜۧ۟ۙۦۜۚۥۘۤۧۖ";
                                    break;
                                }
                            case 1210149747:
                                str = "۬ۖۦۛ۟ۢۙۜۗ۠ۤۗۡۡۖۗۡ۬ۥۦ۠";
                                continue;
                        }
                    }
                    break;
                case 2075768376:
                    str = "ۦۨۙۢۘۨۡۖ۫۠ۜۚ۬ۗ۠ۖۖۡۧۘۥ۠ۘۡۘۙۗۘۘ";
                    cVar2 = cVar;
                    break;
            }
        }
    }

    public void onClick() {
        String str = "ۡ۫ۨۘۡۦ۬ۡۖ۟ۧۚۥۤۥۤۘۙۡۘ۠۟ۥۘۤ۬ۗ";
        d dVar = null;
        CustomAlertDialogBuilder customAlertDialogBuilder = null;
        CustomAlertDialogBuilder customAlertDialogBuilder2 = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            switch ((str.hashCode() ^ 873) ^ -741969072) {
                case -2008119167:
                    dVar = new d(this, 2);
                    str = "ۜ۟ۙۙۙۧ۬ۤۤۛۛۡۧ۫۟";
                    break;
                case -1681920461:
                    str = "ۜۢۤۘ۫ۡ۠ۦۘ۫ۤۡ۫۟ۛۤۙۡۨ۫ۥۘ۠ۗۤۤۚۨ";
                    str2 = yo.getString("yoGradientTitle");
                    break;
                case -921627808:
                    String str4 = "ۨ۠ۜۚۨۖۘۜۚۧۢۜۛۙۥۜۚ۠ۨۘۛ۬ۧۙ۟ۨۘ";
                    while (true) {
                        switch (str4.hashCode() ^ -748790856) {
                            case -1089498336:
                                str = "۟ۡۢۛۤۖۨۨۧۖۛ۠ۗۤۗۖ۬ۦۘۚۢۖۘۢ۬ۡۘ";
                                continue;
                            case -959661711:
                                str4 = "ۢۖۛۙۨۖۘ۟ۛۢۛۨ۟ۗۥۖۘۜۡ۬ۚ۬ۙۙۙۡۘۤ۠۟";
                                break;
                            case 909642322:
                                str = "ۡۢ۠ۨ۟ۨۘۦۦ۠۟ۦۖۘۨۜۘۘۦۥۦۘۛ۬۟ۧۢ۠";
                                continue;
                            case 1238328746:
                                if (!Arrays.toString(f487g).contains(this.f492e)) {
                                    str4 = "ۦۗ۟۬ۥۢۡۙۤۡۗۨۘۡۡۡ";
                                    break;
                                } else {
                                    str4 = "ۧۙۡ۫۟ۖۙۛ۬ۡۦۗۦۨۧۘۥۤۧۖۥۘۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -851754710:
                    customAlertDialogBuilder2.create().show();
                    str = "ۦ۫ۥ۬۫ۜ۫ۡۛۛۛۗۨۖۜۗ۠۫ۚ۫۠";
                    break;
                case -650581579:
                    str = "ۥۤۦۘۗۖۨۙ۟۟ۛۚ۫ۥۚۛ۫ۛۛۚۤۖۘۨۦۥ۫ۗۘۘ";
                    break;
                case -619510424:
                    str = "۫ۚ۠۫۬۠۟ۜ۫۟ۗ۬ۥۚۡۤۢ۫ۤۧ";
                    customAlertDialogBuilder = customAlertDialogBuilder2.setTitle((CharSequence) yo.getString("abc_action_menu_overflow_description"));
                    break;
                case -487272466:
                    str = "ۖۧۚۧۘۜۘۥ۬۟ۧۙۖ۠۠ۜۘۖ۠ۖۘۛۦۢۡۧۖ";
                    break;
                case -18281062:
                    super.onClick();
                    str = "ۖۥۥۙۗۜۘۧۜۛۛ۬ۦۘۡۧۘ";
                    break;
                case 26502982:
                    showColor();
                    str = "ۥۤۦۘۗۖۨۙ۟۟ۛۚ۫ۥۚۛ۫ۛۛۚۤۖۘۨۦۥ۫ۗۘۘ";
                    break;
                case 259563662:
                    return;
                case 795512421:
                    str = "ۤۜۜۘۖۖۡۘۤۜۖۘۧۧۗۧۚۢۤۙۜ";
                    str3 = yo.getString("solid_color_wallpaper");
                    break;
                case 1450990367:
                    str = "ۥۛۤۙۤۦۖۧۦۘۥۖۖۥۡۡۥۙۡۥ۫ۛۡۘۡۖۥۨۘ";
                    customAlertDialogBuilder2 = new CustomAlertDialogBuilder(getContext());
                    break;
                case 1982936492:
                    customAlertDialogBuilder.setItems(new CharSequence[]{str3, str2}, (DialogInterface.OnClickListener) dVar);
                    str = "ۚۗۦۘۜۖۥۘۨۥۧۜ۫ۘۖۧۛۚۨۘ۬ۜۜۘۘۧۨۡۧ۫";
                    break;
            }
        }
    }

    public void setOnClickAction(View.OnClickListener onClickListener) {
        String str = "ۥۦۜۘ۠ۘ۬۠۠ۨۘ۟ۨۖۘۚۨۨ۬ۛۦۙۢۖۘۤ۬ۧۢۚ۟";
        while (true) {
            switch ((str.hashCode() ^ 83) ^ -209550756) {
                case -380514000:
                    return;
                case 90075693:
                    str = "ۗۘ۠ۨۖۦۛۚۚۢ۟ۖۘۡ۠ۦۙ۟ۘۘ۫۬ۜۘ۠ۛۡۘۢۥ۠";
                    break;
                case 743940007:
                    this.f488a = true;
                    str = "ۛ۫ۙۚۗ۫ۤ۟۫ۗۚۦۘ۠ۡ۠";
                    break;
                case 1128006477:
                    str = "ۘۛۜۧۖۦ۫ۛ۟ۧۨۘۘۜ۠ۚ۬ۡۘۙۢ۟۠ۤۤۛۗۙ";
                    break;
                case 1523864859:
                    this.f489b = onClickListener;
                    str = "ۦۗ۟ۥۦۜۗۙ۫ۢۡۘۚ۬ۖۘۨۥۖ";
                    break;
            }
        }
    }

    public void showColor() {
        String str = "ۦۤۘۘۜ۟ۘۘۛۖ۟ۥۧ۬ۜۢۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 536) ^ -627961067) {
                case -2028726079:
                    return;
                case -632491817:
                    new ColorSelectorDialog(getContext(), new g(this, 0), shp.prefs.getInt(this.f492e, this.f491d)).show();
                    str = "ۧ۟۫ۗۢ۫ۨۜۘۧ۫ۧ۠ۤۜۥۜۦۢۥۡۘۜۛۥۘۡۥ۟";
                    break;
                case -424612446:
                    str = "ۡۤۘۙ۟ۘۘۚ۫ۨۘۤۚۤۥۗ۬ۦۖۜۘۚ۠";
                    break;
            }
        }
    }

    public void showGradient() {
        GradientColorsDialog gradientColorsDialog = null;
        String str = "ۚۨۢ۬۫ۢۨۡ۫۠ۛ۬ۚۤۚ۟ۢۜۦۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 361) ^ 326168222) {
                case -1704350835:
                    gradientColorsDialog.setOnDismissListener(new h(this, gradientColorsDialog));
                    str = "ۖۗۧۧۜۙ۠۠ۘ۫۫۬ۛ۬ۥۚۥ";
                    break;
                case -1480877024:
                    gradientColorsDialog = new GradientColorsDialog(getContext(), this.f492e);
                    str = "ۤ۬ۦۚ۠۟ۗ۬۬ۜ۫ۥۘۛۥۥۦۢۜۘۥۨ۟ۦۦۥۘ";
                    break;
                case -883598150:
                    gradientColorsDialog.show();
                    str = "ۛۘۖ۬ۤۡۘۜ۫ۘۦ۠۫ۖۚۛ";
                    break;
                case -846698308:
                    str = "ۤۥ۟ۡۚۜۢۧۢۜۤ۟ۖ";
                    break;
                case 677594416:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        r1 = "ۥۢۚۛۜ۟ۙ۫ۗۨۥ۫ۥۘۜۘ۠ۤ۟ۨ۫";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update() {
        /*
            r9 = this;
            r3 = 0
            java.lang.String r0 = "۟ۦۖۨۨۘۚۡۥۙ۠ۡ۠ۖۨۘۜۜۘ"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
        L_0x0009:
            int r0 = r1.hashCode()
            r3 = 728(0x2d8, float:1.02E-42)
            r8 = 1199811194(0x4783aa7a, float:67412.95)
            r0 = r0 ^ r3
            r0 = r0 ^ r8
            switch(r0) {
                case -1501114151: goto L_0x0054;
                case -1478817041: goto L_0x0018;
                case -1450632530: goto L_0x0068;
                case -1094666448: goto L_0x004e;
                case -742011014: goto L_0x007b;
                case -717719557: goto L_0x0071;
                case -468437484: goto L_0x0023;
                case -461586136: goto L_0x00b0;
                case 163074137: goto L_0x0106;
                case 476480229: goto L_0x00ef;
                case 492285770: goto L_0x0086;
                case 592638329: goto L_0x00e5;
                case 1098866983: goto L_0x00f9;
                case 1380306483: goto L_0x008e;
                case 1785240444: goto L_0x00d2;
                case 1822069117: goto L_0x001c;
                case 1939869062: goto L_0x0044;
                case 1942462737: goto L_0x005d;
                case 2102905351: goto L_0x00db;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0009
        L_0x0018:
            java.lang.String r0 = "ۡۦۘۘۛۖۡۦۚۤۨۥۘۤ۠ۗۧۧۦۘۥۛۖ"
            r1 = r0
            goto L_0x0009
        L_0x001c:
            android.widget.ImageView r3 = r9.f490c
            java.lang.String r0 = "ۡۤۥ۫ۡۥۨ۬ۡ۟ۡۡۘ۟ۖۜۘۖۤۡۘۘۢۡۘۧۤۘۦۗ۠"
            r1 = r0
            r7 = r3
            goto L_0x0009
        L_0x0023:
            r1 = -1493095041(0xffffffffa7012d7f, float:-1.792701E-15)
            java.lang.String r0 = "ۦۚۥۘۖۡۗ۠ۘ۬ۛ۟ۦۘۢۦۘۘۗۜۘ۬۟ۗۢۗۨ"
        L_0x0028:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -687670938: goto L_0x0038;
                case -667754117: goto L_0x0040;
                case 535168159: goto L_0x0031;
                case 1883338188: goto L_0x003d;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            java.lang.String r0 = "۟ۦۧۘ۠ۗۡۡ۠ۡۘۘ۟ۦۢۢۢۨۘ"
            r1 = r0
            goto L_0x0009
        L_0x0035:
            java.lang.String r0 = "ۧۖۥ۟۟ۨۘۡۖۖۙۦۢۘۦ۫ۗ۬ۘ"
            goto L_0x0028
        L_0x0038:
            if (r7 == 0) goto L_0x0035
            java.lang.String r0 = "۬ۡۘۘۖ۫ۨۘۦۤ۟۫ۡۜ۟ۤۗ"
            goto L_0x0028
        L_0x003d:
            java.lang.String r0 = "ۡ۠ۢۗۢۜۘۨۙ۠ۦۢۗۤۗۥ۫ۗۤۨ۟۟ۤ۟ۘۖۢۡ"
            goto L_0x0028
        L_0x0040:
            java.lang.String r0 = "۟۫ۜۤۨ۬ۘۦۗ۫ۛۜۛۧۨ۫ۗۡۘ"
            r1 = r0
            goto L_0x0009
        L_0x0044:
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            java.lang.String r1 = "ۡۨۦۛۢۡۘۢۡۙۜۚۥۚ۬۫ۢۥ"
            r6 = r0
            goto L_0x0009
        L_0x004e:
            r9.f493f = r6
            java.lang.String r0 = "۠ۧ۠ۡۡۧۘۚۙۤۤ۟ۚ۠ۧۦ"
            r1 = r0
            goto L_0x0009
        L_0x0054:
            int r0 = r9.f491d
            r6.setColor(r0)
            java.lang.String r0 = "۫ۡۚۡۙ۠ۢۧۜۖۜۦۘ۠ۧۥ"
            r1 = r0
            goto L_0x0009
        L_0x005d:
            android.widget.ImageView r0 = r9.f490c
            android.graphics.drawable.GradientDrawable r1 = r9.f493f
            r0.setImageDrawable(r1)
            java.lang.String r0 = "ۢۛ۫ۧ۠ۜۖ۬۬ۙ۫ۘۛۦۦۘۛ۟ۨۘۤۢۢۦۘۜۘۧۗۜۘ"
            r1 = r0
            goto L_0x0009
        L_0x0068:
            android.widget.ImageView r0 = r9.f490c
            r0.invalidate()
            java.lang.String r0 = "ۙ۫ۙۗۛۨۘۨۨۗۤ۟ۨۘۢۖۢ۠"
            r1 = r0
            goto L_0x0009
        L_0x0071:
            android.widget.ImageView r0 = r9.f490c
            r1 = 1
            r0.setClickable(r1)
            java.lang.String r0 = "۫ۦۜۘۚۗۖۙ۟ۘۘۥۚۦۘ۫ۜۘ"
            r1 = r0
            goto L_0x0009
        L_0x007b:
            java.lang.String[] r0 = f487g
            java.lang.String r3 = java.util.Arrays.toString(r0)
            java.lang.String r0 = "ۜۧ۠۟۟ۗۦۦۖ۠۠ۨۛ۬ۢۙۥۘۗ۬ۥۨۢۥۘۤۖۨ"
            r1 = r0
            r5 = r3
            goto L_0x0009
        L_0x0086:
            java.lang.String r3 = r9.f492e
            java.lang.String r0 = "ۢۥ۟ۦۤۥۘۖ۬ۘۘۛۢۘۥۦ۠ۜۡۢۘ۫ۜۧۥۖۘۧۚۡ"
            r1 = r0
            r4 = r3
            goto L_0x0009
        L_0x008e:
            r1 = -128478244(0xfffffffff85793dc, float:-1.7489731E34)
            java.lang.String r0 = "ۗۛۥ۟ۢۚۘۖۜ۠ۖۖۘۨ۟ۘۛ۠ۡۛۡۘۙۦۨۜۘۧۘ"
        L_0x0093:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -2022588587: goto L_0x00ab;
                case 207872845: goto L_0x00a2;
                case 596536587: goto L_0x0101;
                case 1556225333: goto L_0x009c;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x0093
        L_0x009c:
            java.lang.String r0 = "۬ۢۖۥۥۧۗۨۥۘ۟۬ۡ۟ۦۘۤ۬ۨ۟ۢۥۡۥۗ"
            goto L_0x0093
        L_0x009f:
            java.lang.String r0 = "ۖۙۚۥۖۜ۠ۤ۟ۛۢۗۖۖۜۡ۟ۨ"
            goto L_0x0093
        L_0x00a2:
            boolean r0 = r5.contains(r4)
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "۟ۡۧۘۨۚۨۘ۬۠۟ۚۨۖ۟ۥ۠ۖۗۜ۠ۜۘ"
            goto L_0x0093
        L_0x00ab:
            java.lang.String r0 = "ۦۤۤۧۙ۠ۜۤۙۖۛۘۘۥۖۥۘۥۧۨۘ۫ۤۧ"
            r1 = r0
            goto L_0x0009
        L_0x00b0:
            r1 = 306271039(0x1241533f, float:6.100267E-28)
            java.lang.String r0 = "ۢ۟ۗۚۜۘۨۛ۫ۜۤۢۦۦۘ"
        L_0x00b5:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1687546945: goto L_0x0101;
                case -991269179: goto L_0x00be;
                case 530090617: goto L_0x00ca;
                case 2019782303: goto L_0x00cd;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            goto L_0x00b5
        L_0x00be:
            boolean r0 = com.obwhatsapp.yo.shp.getIsGradiet(r4)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "ۛۗۙۨۤ۠ۚۤۡ۠۫ۡۘۤۖۖۘ"
            goto L_0x00b5
        L_0x00c7:
            java.lang.String r0 = "ۙۥۧۘۨۜ۬ۦۙۨ۬ۢ۬ۛۡۘۜۚۡ۟۬ۘۘۛۖ۠۫۫۫"
            goto L_0x00b5
        L_0x00ca:
            java.lang.String r0 = "ۡۢۗ۫۟ۡۘۗۗۦۤۢۘۘۜۚۗ۠ۨۗۙ۫ۘۘۗۙۜۘۚۨۗ"
            goto L_0x00b5
        L_0x00cd:
            java.lang.String r0 = "۟۟ۛۚ۠ۖۘ۫ۦۚ۟۠ۡۘ۠ۙ۫"
            r1 = r0
            goto L_0x0009
        L_0x00d2:
            android.graphics.drawable.GradientDrawable r2 = com.obwhatsapp.yo.shp.getGradientDrawable(r4)
            java.lang.String r0 = "ۖۤۧۧۡۨۘۛۥۨۘۥۦۘۘۜۚۖۦ۟ۦۘ"
            r1 = r0
            goto L_0x0009
        L_0x00db:
            r0 = 1097859072(0x41700000, float:15.0)
            r2.setCornerRadius(r0)
            java.lang.String r0 = "ۛ۬۫۫ۗۨۛۜۖۘۥۚۧۖۘۙ۟ۨۥۘ۠ۤۥ"
            r1 = r0
            goto L_0x0009
        L_0x00e5:
            android.widget.ImageView r0 = r9.f490c
            r0.setImageDrawable(r2)
            java.lang.String r0 = "۠ۛ۠ۛۗ۟۫ۜۦ۟ۚۜۘۡۥ۬ۘۗۘۘۘۨۘۘۜۨۜ"
            r1 = r0
            goto L_0x0009
        L_0x00ef:
            android.widget.ImageView r0 = r9.f490c
            r0.invalidate()
            java.lang.String r0 = "ۥۢۚۛۜ۟ۙ۫ۗۨۥ۫ۥۘۜۘ۠ۤ۟ۨ۫"
            r1 = r0
            goto L_0x0009
        L_0x00f9:
            r9.notifyChanged()
            java.lang.String r0 = "۟ۦۧۘ۠ۗۡۡ۠ۡۘۘ۟ۦۢۢۢۨۘ"
            r1 = r0
            goto L_0x0009
        L_0x0101:
            java.lang.String r0 = "ۥۢۚۛۜ۟ۙ۫ۗۨۥ۫ۥۘۜۘ۠ۤ۟ۨ۫"
            r1 = r0
            goto L_0x0009
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.ColorPref.update():void");
    }
}
