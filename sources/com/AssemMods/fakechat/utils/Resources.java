package com.AssemMods.fakechat.utils;

import com.obwhatsapp.yo.yo;

public class Resources {
    public static int getDimen(String str) {
        return yo.getCtx().getResources().getIdentifier(str, "dimen", yo.getCtx().getPackageName());
    }

    public static int getDrawable(String str) {
        return yo.getCtx().getResources().getIdentifier(str, "drawable", yo.getCtx().getPackageName());
    }

    public static int getId(String str) {
        return yo.getCtx().getResources().getIdentifier(str, "id", yo.getCtx().getPackageName());
    }

    public static int getLayout(String str) {
        return yo.getCtx().getResources().getIdentifier(str, "layout", yo.getCtx().getPackageName());
    }

    public static int getMenu(String str) {
        return yo.getCtx().getResources().getIdentifier(str, "menu", yo.getCtx().getPackageName());
    }

    public static int getString(String str) {
        return yo.getCtx().getResources().getIdentifier(str, "string", yo.getCtx().getPackageName());
    }

    public static int getXml(String str) {
        return yo.getCtx().getResources().getIdentifier(str, "xml", yo.getCtx().getPackageName());
    }
}
