package com.obwhatsapp.youbasha.store;

import X.AnonymousClass00T;
import X.C15860rz;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class ColorStore {

    /* renamed from: a  reason: collision with root package name */
    private static String f1066a = "#ffffff";

    /* renamed from: b  reason: collision with root package name */
    private static String f1067b = "#ffffff";

    /* renamed from: c  reason: collision with root package name */
    private static String f1068c = "#640150";

    /* renamed from: d  reason: collision with root package name */
    private static String f1069d = "#054D44";

    /* renamed from: e  reason: collision with root package name */
    private static String f1070e = "#640150";

    /* renamed from: f  reason: collision with root package name */
    private static String f1071f = "#640150";

    /* renamed from: g  reason: collision with root package name */
    private static String f1072g = "#000000";

    /* renamed from: h  reason: collision with root package name */
    private static String f1073h = "#1Affffff";

    /* renamed from: i  reason: collision with root package name */
    private static String f1074i = "#ffffff";

    /* renamed from: j  reason: collision with root package name */
    private static String f1075j = "#e1ffc7";

    /* renamed from: k  reason: collision with root package name */
    private static String f1076k = "#ffffff";

    /* renamed from: l  reason: collision with root package name */
    private static String f1077l = "#640150";

    /* renamed from: m  reason: collision with root package name */
    private static String f1078m = "#000000";

    /* renamed from: n  reason: collision with root package name */
    private static String f1079n = "#640150";

    /* renamed from: o  reason: collision with root package name */
    private static String f1080o = "#303030";

    /* renamed from: p  reason: collision with root package name */
    private static String f1081p = "#ffffff";

    /* renamed from: q  reason: collision with root package name */
    private static String f1082q = "#303030";

    /* renamed from: r  reason: collision with root package name */
    private static String f1083r = "#303030";

    /* renamed from: z  reason: collision with root package name */
    private static String f1084z = "#00000000";

    public static boolean INM() {
        return ((C15860rz) yo.A00(1)).A0A() == 2;
    }

    public static int MainTextColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("list_item_title", "color"));
    }

    public static int dialogTextColor(Context context) {
        return others.getColor("ModContactNameColor", getDefaultListItemTitleColor(context));
    }

    public static int getActionBarColor() {
        return Color.parseColor(f1068c);
    }

    public static int getActionBarColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("AssemColor", "color"));
    }

    public static int getAssemBarColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("AssemColor2", "color"));
    }

    public static int getBGColor() {
        return Color.parseColor(f1081p);
    }

    public static int getBackColor(View view) {
        return AnonymousClass00T.A00(view.getContext(), yo.getID("conversation_background", "color"));
    }

    public static int getChatBubbleLeftColor() {
        return Color.parseColor(f1074i);
    }

    public static int getChatBubbleRightColor() {
        return Color.parseColor(f1075j);
    }

    public static int getChatBubbleTextColor() {
        return Color.parseColor(f1083r);
    }

    public static int getChatBubbleTextColorL() {
        return Color.parseColor(f1082q);
    }

    public static int getCoEn(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("conversationEntryBackground", "color"));
    }

    public static int getConPickBackColor() {
        return Color.parseColor(f1067b);
    }

    public static int getConsBackColor() {
        return -1;
    }

    public static int getConsBackColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("homeActivityMenuItem", "color"));
    }

    public static int getDefaultListItemSubTitleColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("list_item_sub_title", "color"));
    }

    public static int getDefaultListItemTitleColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("list_item_sub_title", "color"));
    }

    public static int getFABIconsColor() {
        if (!INM()) {
            return others.getColor("ModFabTextColor", -1);
        }
        return -1;
    }

    public static int getFabBgColor() {
        return Color.parseColor(f1066a);
    }

    public static int getFabColorAssem(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("AssemButtonColor", "color"));
    }

    public static int getFabColorNormal() {
        return Color.parseColor(f1070e);
    }

    public static int getFabColorNormal(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("primaryButtonColor", "color"));
    }

    public static int getFabColorNormalAssem(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("primaryButtonColorAssem", "color"));
    }

    public static int getFabColorPressed() {
        return Color.parseColor(f1066a);
    }

    public static int getHKColor() {
        boolean INM = INM();
        int parseColor = Color.parseColor("#FF00Af9C");
        if (!INM) {
            return -1;
        }
        return parseColor;
    }

    public static int getLTColor() {
        String str = "#FF364147";
        if (!INM()) {
            str = "#FFFFFFFF";
        }
        return Color.parseColor(str);
    }

    public static int getMainBkColor(View view) {
        return AnonymousClass00T.A00(view.getContext(), yo.getID("primary_surface", "color"));
    }

    public static int getMicColor() {
        return Color.parseColor(f1080o);
    }

    public static int getNavigationBarColor() {
        return Color.parseColor(f1072g);
    }

    public static int getPrimaryColorAttachPopupBackground(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("attach_popup_background", "color"));
    }

    public static int getPrimaryColorAttachText(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("attachmentPickerText", "color"));
    }

    public static int getPrime(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("primary_text", "color"));
    }

    public static int getRTColor() {
        String str = "#FF054740";
        if (!INM()) {
            str = "#FFE1FFC7";
        }
        return Color.parseColor(str);
    }

    public static int getStBarColor(View view) {
        return AnonymousClass00T.A00(view.getContext(), yo.getID("list_section_background", "color"));
    }

    public static int getStatusBarColor() {
        return Color.parseColor(f1069d);
    }

    public static int getStatusBarColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("primary_dark", "color"));
    }

    public static int getTextColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("search_text_color", "color"));
    }

    public static int getUniActionColor() {
        return Color.parseColor(f1079n);
    }

    public static int getUniActionColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("primary", "color"));
    }

    public static int getUniBackColor() {
        return Color.parseColor(f1076k);
    }

    public static int getUniNavColor() {
        return Color.parseColor(f1078m);
    }

    public static int getUniStatColor() {
        return Color.parseColor(f1077l);
    }

    public static int getUniStatColor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("primary", "color"));
    }

    public static int homectrcolor(Context context) {
        return AnonymousClass00T.A00(context, yo.getID("mText", "color"));
    }

    public static int transp() {
        return Color.parseColor(f1084z);
    }
}
