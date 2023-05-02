package com.mod.ColorTools;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.view.MotionEventCompat;
import android.view.View;

public class ColorManager {
    public static int[] DARKBACKGROUND = {-15592942, -15198184, -14606047, -14273992, -13154481, -14730675, -14403769, -12703965, -15721180, blackColor};
    public static int accentColor = Tools.getColor("accent");
    public static int blackColor = Tools.getColor("black");
    public static int dialogNightBg = Tools.getColor("delta_dialog_night_bg");
    public static int greyColor = Tools.getColor("material_grey_300");
    public static int lightBackgroundColor = Tools.getColor("material_grey_50");
    public static int neomorphLight = Tools.getColor("neomorph_background_color");
    public static int nightBackgroundColor = Tools.getColor("paletteSurface");
    public static int primaryColor = Tools.getColor("primary");
    public static int titleColor = Tools.getColor("paletteSurface_8dp");
    public static int whiteColor = Tools.getColor("white");

    public static GradientDrawable circleBorder(int i2, int i3, boolean z2, int i4, int i5, int i6, int i7) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(i2, i3);
        gradientDrawable.setCornerRadius((float) Tools.dpToPx((float) i7));
        if (z2) {
            gradientDrawable.setColors(new int[]{i4, i5});
            gradientDrawable.setOrientation(getOrientation(i6));
        } else {
            gradientDrawable.setColor(i4);
        }
        return gradientDrawable;
    }

    public static int getAccentColor() {
        return Prefs.getInt("key_accent_color", accentColor);
    }

    public static int getActionBarTitleColor() {
        return Prefs.getBoolean(Tools.CHECK("HomeBarText"), false) ? Prefs.getInt("HomeBarText", setTitleColor()) : setTitleColor();
    }

    public static int getAlphaColor(int i2, int i3) {
        if (i3 == 0) {
            return i2;
        }
        float f2 = 1.0f - (((float) i3) / 255.0f);
        int i4 = (i2 >> 16) & MotionEventCompat.ACTION_MASK;
        int i5 = (i2 >> 8) & MotionEventCompat.ACTION_MASK;
        int i6 = i2 & MotionEventCompat.ACTION_MASK;
        double d2 = (double) (((float) i4) * f2);
        Double.isNaN(d2);
        int i7 = (int) (d2 + 0.5d);
        double d3 = (double) (((float) i5) * f2);
        Double.isNaN(d3);
        int i8 = (int) (d3 + 0.5d);
        double d4 = (double) (((float) i6) * f2);
        Double.isNaN(d4);
        return -16777216 | (i7 << 16) | (i8 << 8) | ((int) (d4 + 0.5d));
    }

    public static int getAlphaComponent(int i2, int i3) {
        if (i3 >= 0 && i3 <= 255) {
            return (16777215 & i2) | (i3 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int getBorderColor() {
        return 1180787041;
    }

    public static int getCardBackgroundColor(String str) {
        return Prefs.getBoolean(Tools.CHECK(str), false) ? Prefs.getInt(str, Themes.dialogBackground()) : Themes.dialogBackground();
    }

    public static int getCardTitleColor(int i2) {
        return Prefs.getBoolean(Tools.CHECK("key_card_title"), false) ? Prefs.getInt("key_card_title", getTitleColor(i2)) : getTitleColor(i2);
    }

    public static int getCardWindowsBackground() {
        return Prefs.getBoolean(Tools.CHECK("key_card_win_bg"), false) ? Prefs.getInt("key_card_win_bg", getWindowBackground()) : getWindowBackground();
    }

    public static int getChatActionBar() {
        return getColorCheck(getActionBarTitleColor(), "key_chat_actionbar");
    }

    public static int getColorCheck(int i2, String str) {
        return Prefs.getBoolean(Tools.CHECK(str), false) ? Prefs.getInt(str, i2) : i2;
    }

    public static void getColorGradientCheck(int i2, String str, View view) {
        if (Prefs.getBoolean(Tools.CHECK(str), false)) {
            getGradientColor(str, view, i2);
        } else {
            view.setBackgroundColor(i2);
        }
    }

    public static int getCustomBackgroundColor(boolean z2) {
        return z2 ? Prefs.getInt("delight_app_theme_dark", getDefaultBackground()) : Prefs.getInt("delight_app_theme_light", getDefaultLightBackground());
    }

    public static void getGradientBackground(View view, int[] iArr, int i2) {
        GradientDrawable.Orientation orientation;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        switch (i2) {
            case 0:
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                break;
            case 1:
                orientation = GradientDrawable.Orientation.TR_BL;
                break;
            case 2:
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                break;
            case 3:
                orientation = GradientDrawable.Orientation.BR_TL;
                break;
            case 4:
                orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                break;
            case 5:
                orientation = GradientDrawable.Orientation.BL_TR;
                break;
            case 6:
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                break;
            case 7:
                orientation = GradientDrawable.Orientation.TL_BR;
                break;
            default:
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                break;
        }
        gradientDrawable.setOrientation(orientation);
        view.setBackground(gradientDrawable);
    }

    public static void getGradientColor(String str, View view, int i2) {
        if (Prefs.getBoolean(Tools.ISGRADIENT(str), false)) {
            getGradientBackground(view, new int[]{Prefs.getInt(str, i2), Prefs.getInt(Tools.ENDCOLOR(str), i2)}, Prefs.getInt(Tools.ORIENTATION(str), 0));
            return;
        }
        view.setBackgroundColor(i2);
    }

    public static GradientDrawable.Orientation getOrientation(int i2) {
        return i2 == 0 ? GradientDrawable.Orientation.TOP_BOTTOM : i2 == 1 ? GradientDrawable.Orientation.TR_BL : i2 == 2 ? GradientDrawable.Orientation.RIGHT_LEFT : i2 == 3 ? GradientDrawable.Orientation.BR_TL : i2 == 4 ? GradientDrawable.Orientation.BOTTOM_TOP : i2 == 5 ? GradientDrawable.Orientation.BL_TR : i2 == 6 ? GradientDrawable.Orientation.LEFT_RIGHT : i2 == 7 ? GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.TOP_BOTTOM;
    }

    public static int getPrimaryColor() {
        return Prefs.getInt("ModConPickColor", primaryColor);
    }

    public static int getSecondPrimary() {
        return Prefs.getInt(Tools.ENDCOLOR("ModConPickColor"), primaryColor);
    }

    public static int getTextColor(int i2) {
        return isDarken(i2) ? whiteColor : titleColor;
    }

    public static int getTitleColor(int i2) {
        return isDarken(i2) ? whiteColor : titleColor;
    }

    public static void getWallBackground(View view) {
        if (Prefs.getBoolean(Tools.CHECK("key_card_win_bg"), false)) {
            getGradientColor("key_card_win_bg", view, getCardWindowsBackground());
        }
    }

    public static Drawable gradientDrawable(int i2, int i3, int i4) {
        GradientDrawable.Orientation orientation;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{i2, i3});
        switch (i4) {
            case 1:
                orientation = GradientDrawable.Orientation.TR_BL;
                break;
            case 2:
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                break;
            case 3:
                orientation = GradientDrawable.Orientation.BR_TL;
                break;
            case 4:
                orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                break;
            case 5:
                orientation = GradientDrawable.Orientation.BL_TR;
                break;
            case 6:
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                break;
            case 7:
                orientation = GradientDrawable.Orientation.TL_BR;
                break;
            default:
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                break;
        }
        gradientDrawable.setOrientation(orientation);
        return gradientDrawable;
    }

    public static Drawable iconMenu(int i2) {
        Drawable drawable = Tools.getContext().getResources().getDrawable(i2);
        drawable.setColorFilter(getActionBarTitleColor(), PorterDuff.Mode.SRC_ATOP);
        return drawable;
    }

    public static boolean isDarken(int i2) {
        double red = (double) Color.red(i2);
        Double.isNaN(red);
        double green = (double) Color.green(i2);
        Double.isNaN(green);
        double d2 = (red * 0.299d) + (green * 0.587d);
        double blue = (double) Color.blue(i2);
        Double.isNaN(blue);
        return 1.0d - ((d2 + (blue * 0.114d)) / 255.0d) >= 0.5d;
    }

    public static boolean isGradientCheck(String str) {
        return Prefs.getBoolean(Tools.ISGRADIENT(str), false);
    }

    public static boolean isPrimaryGradient() {
        return Prefs.getBoolean(Tools.ISGRADIENT("ModConPickColor"), false);
    }

    public static int setTitleColor() {
        return isDarken(getPrimaryColor()) ? whiteColor : titleColor;
    }

    public static int warnaAutoIconFab() {
        return isDarken(warnaFab()) ? whiteColor : titleColor;
    }

    public static int warnaFab() {
        return Prefs.getBoolean(Tools.CHECK("key_fab_color"), false) ? Prefs.getInt("key_fab_color", getAccentColor()) : getAccentColor();
    }

    public static int warnaFabIcon() {
        return Prefs.getBoolean(Tools.CHECK("key_fab_icon"), false) ? Prefs.getInt("key_fab_icon", warnaAutoIconFab()) : warnaAutoIconFab();
    }
}
