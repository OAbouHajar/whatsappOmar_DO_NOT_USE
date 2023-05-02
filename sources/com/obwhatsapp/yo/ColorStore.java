package com.obwhatsapp.yo;

import okhttp3.internal.http.StatusLine;

public abstract class ColorStore {

    /* renamed from: a  reason: collision with root package name */
    public static int f494a = -11;

    /* renamed from: b  reason: collision with root package name */
    public static int f495b = -11;

    /* renamed from: c  reason: collision with root package name */
    public static int f496c = -11;

    /* renamed from: d  reason: collision with root package name */
    public static int f497d = -11;

    /* renamed from: e  reason: collision with root package name */
    public static int f498e = -11;

    /* renamed from: f  reason: collision with root package name */
    public static int f499f = -11;

    /* renamed from: g  reason: collision with root package name */
    public static int f500g = -11;

    /* renamed from: h  reason: collision with root package name */
    public static int f501h = -11;

    /* renamed from: i  reason: collision with root package name */
    public static int f502i = -11;

    /* renamed from: j  reason: collision with root package name */
    public static int f503j = -11;

    /* renamed from: k  reason: collision with root package name */
    public static int f504k = -11;

    /* renamed from: l  reason: collision with root package name */
    public static int f505l = -11;

    /* renamed from: m  reason: collision with root package name */
    public static int f506m = -11;

    /* renamed from: n  reason: collision with root package name */
    public static int f507n = -11;

    /* renamed from: o  reason: collision with root package name */
    public static int f508o = -11;

    /* renamed from: p  reason: collision with root package name */
    public static int f509p = -11;

    /* renamed from: q  reason: collision with root package name */
    public static int f510q = -11;

    /* renamed from: r  reason: collision with root package name */
    public static int f511r = -11;

    public static int getDefaultChatBubbleDateColor() {
        String str = "ۖۦۢۥۙۙۙۛۥۜۦۜۥۖۦۜۤ۠ۥۙ۫۟۠ۤ۠ۢ۟";
        while (true) {
            switch ((str.hashCode() ^ 280) ^ 1012496620) {
                case 747274968:
                    String str2 = "۬ۡ۫ۢۗۢۗۨۘ۬ۦۘۛۗۖۙۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 891304203) {
                            case -2127292994:
                                str2 = "ۜۥۛۥۜۥۘ۟ۖۚۤۢۨۘۦۤۗ۬۟۠ۡ۠۫ۨ۠ۨ";
                                break;
                            case -1739272315:
                                str = "ۨۨۚۡۤۦ۬ۢۦۘۧۛۨۥۗۛۖۜۛۖۗۘۜۖۧ";
                                continue;
                            case -189051710:
                                if (f509p != -11) {
                                    str2 = "ۙۧۨۙ۫ۘۛۛۡۜ۫۟ۖ۟ۗۗۤۖۘۦ۬ۖ";
                                    break;
                                } else {
                                    str2 = "۠ۦ۟ۢۥۙۚۦۨۖۛۧۥۙ۠ۥۜۨۘۙۡۛۥۥۘ";
                                    break;
                                }
                            case 1422807686:
                                str = "ۚ۬ۛۤ۟ۖۖۨۤۢۙۚۥۨۤۗۘۥۘ";
                                continue;
                        }
                    }
                    break;
                case 1797583302:
                    f509p = yo.getResColor("conversation_row_date");
                    str = "ۨۨۚۡۤۦ۬ۢۦۘۧۛۨۥۗۛۖۜۛۖۗۘۜۖۧ";
                    break;
                case 1839961329:
                    return f509p;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getDefaultChatBubbleTextColor() {
        /*
            java.lang.String r0 = "ۥ۠ۨۘۚ۬ۘۘۦۤۥۘۗۢ۫ۛ۟۬ۧۢۤۨۦ۟ۘۦۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 868(0x364, float:1.216E-42)
            r3 = -1219678019(0xffffffffb74d30bd, float:-1.22303E-5)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 650707653: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            int r0 = getPrimaryTextColor()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.ColorStore.getDefaultChatBubbleTextColor():int");
    }

    public static int getDefaultContactTypingColor() {
        String str = "ۧۗۘۜۦۖۘۤ۟۠ۢ۠ۙۚۙۡۜۛۖۘۖۙۜۘ۫ۗۙۥۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 109) ^ -765606415) {
                case -1907546981:
                    String str2 = "ۦۥۤ۠ۙۤۘۜۚۥۚ۟ۜۥۧۘ۬۫ۥ";
                    while (true) {
                        switch (str2.hashCode() ^ -738572559) {
                            case -1567395965:
                                if (f506m != -11) {
                                    str2 = "ۜۙ۫ۗۜۚۥۥۘۘۨۢۧ۠ۤۚۗ۫ۛۤ۟ۢۘۜۨۘۢۧ۬";
                                    break;
                                } else {
                                    str2 = "ۙۜۥۘۘ۟ۦۡۘۧ۟ۘۤۦۗۙۙ۬ۖ۬ۧ۠ۗۤۧۛۥۨ";
                                    break;
                                }
                            case -1465728558:
                                str = "ۗۦۡۘۥۛۙۗۗۨۦۛ۟۟۟ۛۙۤۦ۫ۢ";
                                continue;
                            case -749121700:
                                str = "ۧۜۙۚۦۧۙۜۛۙ۬ۡۘۗ۠۟۟ۛ۟";
                                continue;
                            case 41347003:
                                str2 = "ۨ۬ۢۥۖۘۦۘۥۤۦۦۦۦۦۘۜۨۖۢۢۗۛ۬۟ۧ۟";
                                break;
                        }
                    }
                    break;
                case -1868791542:
                    return f506m;
                case -101120092:
                    f506m = yo.getResColor("composing");
                    str = "ۗۦۡۘۥۛۙۗۗۨۦۛ۟۟۟ۛۙۤۦ۫ۢ";
                    break;
            }
        }
    }

    public static int getDefaultConversationEntryBackground() {
        String str = "ۨۘ۫۟۟۬ۗ۬ۘۘۤۖۡۛۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 939) ^ 2124867900) {
                case -1861532514:
                    String str2 = "۟۫ۦۜ۬ۘۗۙۜۡۧۘ۬ۦۖۘۛۥۚۦۛ۠ۚ۠ۘۡۖۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 855415856) {
                            case -2090315727:
                                str2 = "ۜۦۥۘ۟ۘۢ۟۠ۘۢۖۘۨۧۖۘۢۘ۬ۢۘۘ";
                                break;
                            case -987947028:
                                if (f507n != -11) {
                                    str2 = "ۘۘۢۨۤۥۦ۫ۜۥۢۖۘۡۚۘۜۗ۫۠ۥۖۘ";
                                    break;
                                } else {
                                    str2 = "ۢۚۖۘۘ۫ۗۢۧۜۘۜۘۛۧ۟ۥ۫ۗۧۜ۟ۢۘ۠ۜۘ";
                                    break;
                                }
                            case 277782071:
                                str = "ۚۨۧۘۡۚۚۥۜۡۘۖ۠ۥ۬ۛۖۘ۬ۘۥ۠";
                                continue;
                            case 586756470:
                                str = "ۢۗۜۜۗۡۘ۬ۚۖۘۤ۠ۘۘۚۖۘۡۥۡ۫۫ۨۘۥۛۖ";
                                continue;
                        }
                    }
                    break;
                case -1475087852:
                    return f507n;
                case -319084835:
                    f507n = yo.getResColor("conversationEntryBackground");
                    str = "ۚۨۧۘۡۚۚۥۜۡۘۖ۠ۥ۬ۛۖۘ۬ۘۥ۠";
                    break;
            }
        }
    }

    public static int getDefaultConversationEntryIconsColor() {
        String str = "ۤۛۖۚ۫۟ۗ۟ۨۘ۬ۘۙ۟ۥۥۛۜۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 190) ^ -1546333204) {
                case -2045657203:
                    return f508o;
                case -1413728413:
                    f508o = yo.getResColor("icon_secondary");
                    str = "ۧۖ۫ۦۧ۟۫ۛۜۘۧ۬ۙۘۨۜۤۘۧۙۤۨۘ۠ۤۥۘ";
                    break;
                case 1811186046:
                    String str2 = "۫ۗۦۘۢۘۖۘۜۥۧۧ۠ۚ۠ۧ";
                    while (true) {
                        switch (str2.hashCode() ^ 525935811) {
                            case -1825778077:
                                if (f508o != -11) {
                                    str2 = "ۖ۠ۥۘۛۦۦۘ۬۟ۦۤۨۧۘۙۢۛۨۛۧ";
                                    break;
                                } else {
                                    str2 = "ۡۦۦۘۢۛ۟ۚۖۗۛ۟ۘۘ۟ۤۙۢۘۘۘ۬ۘۘ";
                                    break;
                                }
                            case -1662969290:
                                str = "ۡۥ۟۫ۢۨۘۙۡۜ۠ۖۚۚۢ۠ۖ۠ۨۘۛۘۥ۟ۧۡ";
                                continue;
                            case -1028757069:
                                str = "ۧۖ۫ۦۧ۟۫ۛۜۘۧ۬ۙۘۨۜۤۘۧۙۤۨۘ۠ۤۥۘ";
                                continue;
                            case 1599827057:
                                str2 = "ۜۤۦۘۧۡۡۧۖۥۘۚۜ۟ۦۜۜۘۖ۬ۥۛۤۥۘۢۢ۠";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public static int getDefaultHomeRowsUnreadBkColor() {
        String str = "ۘۨۧۘ۟ۨۚۗۥ۫ۚۢۡۧۘۖ۬ۡۧۦۢ";
        while (true) {
            switch ((str.hashCode() ^ 881) ^ 761192260) {
                case -1284988512:
                    String str2 = "ۡ۟ۥۢ۫ۘۤۘۖۘ۬ۤۡۘۧۚۤ";
                    while (true) {
                        switch (str2.hashCode() ^ -1901646115) {
                            case -1524430823:
                                if (f500g != -11) {
                                    str2 = "ۛ۠ۜۘۢ۠ۦۤۗ۬ۗۧۤۛۚۚ۬ۢۡ۠ۡۨ";
                                    break;
                                } else {
                                    str2 = "ۘ۠ۡۥۘۨۘۦۥۚ۟ۢۛۡ۠ۧۛۡۧۛۥ۬";
                                    break;
                                }
                            case -821728472:
                                str = "ۚ۠ۖۘۢ۠ۡ۬۠ۥۘۥۨۘۦۥۦ";
                                continue;
                            case 92397436:
                                str = "ۛۘۧۘۙ۫ۤۦۨۖۗۘۙ۫ۡ۠ۛۖۖۘۨۘۨۧ۟ۢۗۘۜ";
                                continue;
                            case 613222605:
                                str2 = "ۗ۬ۚ۬ۧۙۛۖ۟ۥۖۜۘۚۖۡ۟ۨۨۘ۫ۥۤ۠ۦۥۘۧ۠ۗ";
                                break;
                        }
                    }
                    break;
                case -931388927:
                    return f500g;
                case 1966592703:
                    f500g = yo.getResColor("unread_indicator");
                    str = "ۚ۠ۖۘۢ۠ۡ۬۠ۥۘۥۨۘۦۥۦ";
                    break;
            }
        }
    }

    public static int getDefaultHomeRowsUnreadTextColor() {
        String str = "۫۬۠ۡ۬ۚۛۖۢۚۖۢۥۙۥۘۚۘۥۘۤۗۤۛۙۜۜۛ";
        while (true) {
            switch ((str.hashCode() ^ 551) ^ -267746531) {
                case -818938341:
                    return f501h;
                case 1686361545:
                    String str2 = "ۨۥۙ۬ۜۙ۟ۗۢ۟ۙۦۘۗۘ۫ۨۛۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -647907309) {
                            case -1515778919:
                                str2 = "ۙۥۡۨۧۡۗۚۡۖۚ۫۟ۙۘۘۡ۠ۜۥۗۘۘ";
                                break;
                            case -48640201:
                                if (f501h != -11) {
                                    str2 = "ۚ۟ۥۘۦ۟ۘۘۜۦۧۢۗۖۘ۠ۗۛۚۦۧۘۙۡ۫ۛۦۧۘ";
                                    break;
                                } else {
                                    str2 = "۟ۗۥۘۜۘۘۤۚۨۘۙۧۖۦۖۙۙۖۜۘۘۧۘ۟ۥۨ";
                                    break;
                                }
                            case 826419596:
                                str = "ۖۢۧۥ۫۬ۢۢ۠ۨ۟ۙۤۦۤۤ۟ۡۘ۟ۡۜۘ";
                                continue;
                            case 1052689970:
                                str = "ۙۤ۬۬ۥۡۘۢۨۥۘ۬۬ۧۗۨۥۘ";
                                continue;
                        }
                    }
                    break;
                case 1726106111:
                    f501h = yo.getResColor("conversationUnseenBadgeText");
                    str = "ۙۤ۬۬ۥۡۘۢۨۥۘ۬۬ۧۗۨۥۘ";
                    break;
            }
        }
    }

    public static int getDefaultHomeToolbarColor() {
        String str = "۫ۘۢۜۘۘۥۙۚۙۜۜۙۙۡۘۡۧۖۘۧۢۥ";
        while (true) {
            switch ((str.hashCode() ^ StatusLine.HTTP_PERM_REDIRECT) ^ -2000950174) {
                case -453675385:
                    String str2 = "ۜۧۥۗ۫ۖ۟۫ۧۗۨۧۘۛ۟ۧۨۤۧ۬ۧۥۘۜ۬ۨۘۥۚۜ";
                    while (true) {
                        switch (str2.hashCode() ^ -1931382182) {
                            case -1219439098:
                                if (f499f != -11) {
                                    str2 = "ۖۜۖ۬۟ۘۜۘۡۜۘۘۛۦۤۜۦۦۖۢۨۨۢۜ";
                                    break;
                                } else {
                                    str2 = "ۖۘۢۦ۫ۥۘۖۦۢ۠ۥۥۜۨۜ";
                                    break;
                                }
                            case -626750792:
                                str = "ۦ۟ۖۜۡۘۥۤۙۥۚۘۥۜ۬۠۠ۘۦۜۜ";
                                continue;
                            case 1157611439:
                                str = "۟ۛۛۤۖۧۙۡ۟۫ۥۜۡۗۜۡۡۢ";
                                continue;
                            case 1860303408:
                                str2 = "ۦۢۙۤۢۜۦ۟ۨۘۛۛۥۘۚۦۛۗۙۨۢۙۡۘ";
                                break;
                        }
                    }
                    break;
                case 518176914:
                    f499f = yo.getResColor("homeActivityToolbarContent");
                    str = "۟ۛۛۤۖۧۙۡ۟۫ۥۜۡۗۜۡۡۢ";
                    break;
                case 1491221995:
                    return f499f;
            }
        }
    }

    public static int getDefaultListItemSubTitleColor() {
        String str = "ۦۧۨۜۖۜۘ۫ۧۜۘۢۧۨۘ۫۟ۜۘۢ۟ۤۢۧۚ";
        while (true) {
            switch ((str.hashCode() ^ 391) ^ 1995243464) {
                case -1954053130:
                    f505l = yo.getResColor("list_item_sub_title");
                    str = "ۛۛۤۧ۬ۚۖۜۖۚۚۖۧۧۦۙۥۙۗۡۢۨۜۚۛ";
                    break;
                case -262017120:
                    return f505l;
                case 860424359:
                    String str2 = "ۛۡ۟ۢۤۥۡۦۨۙۦۖۧۚۦۚۘۗ۠ۖۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -955510534) {
                            case -2030210494:
                                str = "ۛۛۤۧ۬ۚۖۜۖۚۚۖۧۧۦۙۥۙۗۡۢۨۜۚۛ";
                                continue;
                            case -1850586779:
                                if (f505l != -11) {
                                    str2 = "ۖۦۗۢۤ۠ۜۛۦۘۜۥۦۘۛۧ۫۬ۡۘۘۡۧ۫ۢۚ۟ۚ۟";
                                    break;
                                } else {
                                    str2 = "۟ۙۡۡۙۡ۫ۚۨۘ۬ۖۥۘۦۛ۠ۡ۬ۘ";
                                    break;
                                }
                            case -1582958726:
                                str2 = "۬ۘ۬۬ۚۤۜۦ۟ۧ۬ۨۘ۟ۥۨۘۡۜۡۖۤۛ";
                                break;
                            case 1242567051:
                                str = "ۤ۬ۨۥۤۦۘ۠ۨۦۘ۬ۖۦۘ۠۬ۛ۫۬ۥۘۥ۟ۖۦۚۥۘۜۡۥ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public static int getDefaultListItemTitleColor() {
        String str = "ۙۗۧۖۘۜۦ۫ۦۡۘۤۜ۟ۡۛۤۧۘۘۨۦۢۚۢۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 117) ^ -882098079) {
                case -1347519451:
                    String str2 = "ۗۙۨۦ۠۠ۥۢۧ۟۠ۘۘۖ۬ۘۘۨۘۚۘ۬ۘۘۛۙۖۧۤۥ";
                    while (true) {
                        switch (str2.hashCode() ^ 2047925417) {
                            case -1059350748:
                                if (f504k != -11) {
                                    str2 = "ۙۛۨۘۙۙۦۘۚۨۡۛۖ۫ۦۛ۟ۖ۬۫ۘۢ۟";
                                    break;
                                } else {
                                    str2 = "ۤ۫ۨۤۦۖۙ۫ۧ۫ۛۡۘۚۨۚۖۙ۟ۗۖۦۙ۠ۜۘ";
                                    break;
                                }
                            case -375562881:
                                str = "۫ۡ۟ۡۛۜۘۜۦۜۥۢۨۘۤۛۨۧۛۧۙۚۖ";
                                continue;
                            case 597163200:
                                str = "۫۬ۢۨۥۡۖۗ۫۬۟ۚ۟ۖۡۥ۠ۨۘ";
                                continue;
                            case 744068312:
                                str2 = "ۨۘ۠ۡۢ۬ۜۛ۟ۧۘۦۘۢۚۜۗۡۚ۫۬ۥۘۤۙۦۘۖۡۜۘ";
                                break;
                        }
                    }
                    break;
                case -320455993:
                    f504k = yo.getResColor("list_item_title");
                    str = "۫۬ۢۨۥۡۖۗ۫۬۟ۚ۟ۖۡۥ۠ۨۘ";
                    break;
                case 158890593:
                    return f504k;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getDefaultTabActiveColor() {
        /*
            java.lang.String r0 = "۫ۗۡ۬ۛۙۤۙ۠ۦۧۖۖۗ۠"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 103(0x67, float:1.44E-43)
            r3 = -1076045598(0xffffffffbfdcd8e2, float:-1.7253687)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1781296837: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "homeActivityTabActive"
            int r0 = com.obwhatsapp.yo.yo.getResColor(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.ColorStore.getDefaultTabActiveColor():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getDefaultTabInActiveColor() {
        /*
            java.lang.String r0 = "ۘۖۗۤۨۚۘۘۜۘۙ۠ۡ۬ۧ۫ۖۡۘۙۢۡۘۦۡۘۙ۫ۤ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 62
            r3 = 443550480(0x1a700b10, float:4.9639773E-23)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1702536509: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "homeActivityTabInactive"
            int r0 = com.obwhatsapp.yo.yo.getResColor(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.ColorStore.getDefaultTabInActiveColor():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getFabBgColor() {
        /*
            java.lang.String r0 = "ۦ۠۫۟ۛ۫ۤۛ۬ۚۢ۠۫ۖۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 736(0x2e0, float:1.031E-42)
            r3 = 1750565329(0x685781d1, float:4.070814E24)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1037067277: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "#1Affffff"
            int r0 = android.graphics.Color.parseColor(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.ColorStore.getFabBgColor():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getFabColorNormal() {
        /*
            java.lang.String r0 = "ۘۧۨۘۘۨۡۢۢۦۘۢ۫ۨ۠ۚۚۨۖۜۘۢۙ۬ۛۛۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 30
            r3 = -137272065(0xfffffffff7d164ff, float:-8.4940507E33)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -131526160: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "primaryFloatingButton"
            int r0 = com.obwhatsapp.yo.yo.getResColor(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.ColorStore.getFabColorNormal():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getFabColorPressed() {
        /*
            java.lang.String r0 = "ۨۤۧ۬۬ۙۡۤۘ۫ۧۚۛۧۡ۬ۘ۟"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 96
            r3 = 173066556(0xa50c93c, float:1.0052684E-32)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -206509399: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "primaryButtonColor"
            int r0 = com.obwhatsapp.yo.yo.getResColor(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.ColorStore.getFabColorPressed():int");
    }

    public static int getPrimaryColor() {
        String str = "ۖ۫ۖۧۜۡۚۦۙۛۖۘۛۢ۠ۜۘ۟";
        while (true) {
            switch ((str.hashCode() ^ 559) ^ 1211196535) {
                case 39813853:
                    String str2 = "ۦ۫ۡۘۧۥۜۜۥۧۘۢۢۚ۬ۛۜۚۗ۟";
                    while (true) {
                        switch (str2.hashCode() ^ -1455399438) {
                            case -1967697130:
                                str = "۫ۡۚۗ۠۬ۘۚۗۜۗ۠ۧۨۘۙۡۜۗۛۡۘۥ۫ۡۢۗ۬";
                                continue;
                            case -863044912:
                                str = "ۗۤ۟۬۬ۚ۟ۢۘۜۧۘۘۛۨۘ۬ۗۜۘۡۜ۟۫ۤۥۚۜۘ";
                                continue;
                            case -793580183:
                                str2 = "ۛۘۤۢۤۢ۟ۦۧۘۖ۠ۙۗ۬ۨۘۖۡۨۘ۠ۖۘ";
                                break;
                            case -537557951:
                                if (f494a != -11) {
                                    str2 = "ۢ۟ۤۢۜۧۥۦۧۘۦۨۘۘۥ۟ۥۘۤۜۛۖۜۖۨۖۘۘ";
                                    break;
                                } else {
                                    str2 = "۟ۗۖ۠ۢۜۘ۠ۧۥۚۡ۬ۙ۠ۛ۬ۘۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 962102316:
                    return f494a;
                case 1768974011:
                    f494a = yo.getResColor("primary");
                    str = "ۗۤ۟۬۬ۚ۟ۢۘۜۧۘۘۛۨۘ۬ۗۜۘۡۜ۟۫ۤۥۚۜۘ";
                    break;
            }
        }
    }

    public static int getPrimaryColorAttachPopupBackground() {
        String str = "۬ۦۗۤۘۦۗۘۤۛۢۨ۫۫ۖۤۡۜۘۛۦۥ";
        while (true) {
            switch ((str.hashCode() ^ 373) ^ -978533498) {
                case -214470578:
                    return f502i;
                case -71847251:
                    String str2 = "ۥۗۤۘ۫ۡۗۚۦۘۙۘ۠ۢ۠۫ۙۛۖۘۧۛۜۡۚۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1631913049) {
                            case -1975549920:
                                str = "۬ۛۡۘ۫ۛۡۘۢۤۨۘۚۥۦۖۤۜۘۛۜۧۘۦ۫";
                                continue;
                            case -407644737:
                                if (f502i != -11) {
                                    str2 = "ۚۜۘۘ۟۟ۨۚ۫ۘ۬ۡ۠ۛ۟۠ۤۡۖ";
                                    break;
                                } else {
                                    str2 = "ۙۧ۟ۢۛۛۦۢۨۥۛۖۘۡۢۦۘۛ۟۫ۜۢۨۘ";
                                    break;
                                }
                            case 1171824594:
                                str = "ۘ۫ۦ۟ۧۗۘۦۢۖۚۦۗۚۚۡۖۘ";
                                continue;
                            case 2096800848:
                                str2 = "ۥۙۖۡۥۖۤۘۖۘۨۚۡۘ۫ۚۢۛۚ۫۟۫ۘۚۢ۫ۦۚۖۘ";
                                break;
                        }
                    }
                    break;
                case 1514376805:
                    f502i = yo.getResColor("attach_popup_background");
                    str = "۬ۛۡۘ۫ۛۡۘۢۤۨۘۚۥۦۖۤۜۘۛۜۧۘۦ۫";
                    break;
            }
        }
    }

    public static int getPrimaryColorAttachText() {
        String str = "ۨۨ۟۫ۜۦ۠ۚ۫ۖۚۢۡۤۦۘۧۘۛۤۙۘۨۤۗ";
        while (true) {
            switch ((str.hashCode() ^ 85) ^ -1430429769) {
                case -1406538007:
                    return f503j;
                case 1284083496:
                    String str2 = "ۢۚۦ۫ۗۜۤۢۗ۫۟ۨۨ۟ۜۘ۠ۦۧ۬۫ۘۥۚ۬۬ۙۚ";
                    while (true) {
                        switch (str2.hashCode() ^ 1669706268) {
                            case -2074306679:
                                str2 = "ۘ۠ۥۥۨۜۙۦۘۖۖۡۗۜۡۚۧۥۚۤۘۛ۟۠ۤۛ۠";
                                break;
                            case -789533374:
                                if (f503j != -11) {
                                    str2 = "ۧ۬ۥۨۤ۟ۚۢۦۘۡۡۙۖۙۙ۠ۛۛ۟ۘۨۜۧۛ";
                                    break;
                                } else {
                                    str2 = "ۙ۟۟ۡۚ۠ۤۜ۫ۦۡ۟ۚۜۢۚۡۖۘۤ۫ۘۘۥۡۧۘۤۗۦ";
                                    break;
                                }
                            case -450869327:
                                str = "ۡۦۗۗۨۚۡ۬ۙۢ۬۠ۙ۫ۤۥ۫ۗ";
                                continue;
                            case 621809947:
                                str = "ۨ۟۠ۜۜ۬ۘ۟ۨ۠ۖۦۘۘۚۖۚ۟ۤۤ۠ۘ";
                                continue;
                        }
                    }
                    break;
                case 2054819420:
                    f503j = yo.getResColor("attachmentPickerText");
                    str = "ۨ۟۠ۜۜ۬ۘ۟ۨ۠ۖۦۘۘۚۖۚ۟ۤۤ۠ۘ";
                    break;
            }
        }
    }

    public static int getPrimaryColorRound() {
        String str = "ۗ۬ۡۘۙ۫ۛۚ۬ۦۘ۟۫ۘۘۖۙۘۦ۠ۤۗۖۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 677) ^ -530937153) {
                case -1772311251:
                    f496c = yo.getResColor("primary_round");
                    str = "ۛ۠ۙۜ۫ۛ۬ۚۜۘۚۧۖۙ۠ۜ۟۫ۤۦۢۗ";
                    break;
                case -263845:
                    String str2 = "ۙۥۜۘۘۖۦۨ۟۫ۨۜۘ۫ۛۙ";
                    while (true) {
                        switch (str2.hashCode() ^ -943514548) {
                            case -2012293323:
                                if (f496c != -11) {
                                    str2 = "۫۟۫۫ۧۢ۬۬ۖۢۧۡۘۨۦۧۘۛۜۥۘ۠ۗ۬ۚۘۖ";
                                    break;
                                } else {
                                    str2 = "ۖۧۥ۠ۤۥ۟ۧۥۘۥ۠۠ۙ۠ۙۨۜ۫ۨۥۦ";
                                    break;
                                }
                            case -1892555483:
                                str = "ۛ۠ۙۜ۫ۛ۬ۚۜۘۚۧۖۙ۠ۜ۟۫ۤۦۢۗ";
                                continue;
                            case 317247787:
                                str2 = "ۙ۠ۥۘۙۧۜۘۥۙۚ۬ۜۛۥۗۥۜۡۘۘۘۚ۫";
                                break;
                            case 1427005398:
                                str = "۟ۤۧۧۜۜۘۥۧۜۜۘۡۘۚۦۧۛۖۡۧۨۥۘ۟۫ۦۘ";
                                continue;
                        }
                    }
                    break;
                case 458131179:
                    return f496c;
            }
        }
    }

    public static int getPrimaryColorStatusBar() {
        String str = "۠ۛ۠ۚۦۘۘۜۨۦۥۦۥۛۧ۬ۜۘۡۘۛ۠ۦۘ۟ۧۥ";
        while (true) {
            switch ((str.hashCode() ^ 819) ^ 1353382700) {
                case -1064468687:
                    String str2 = "ۦ۠۟ۦۡ۫ۗۛۥۘۘۦۨۘۙۡۜ";
                    while (true) {
                        switch (str2.hashCode() ^ -402688780) {
                            case -886882624:
                                if (f495b != -11) {
                                    str2 = "ۥ۟ۛۧۦۖ۠ۡۡۦ۠ۢۦۥۦۘۧۖۦۘ";
                                    break;
                                } else {
                                    str2 = "ۨۤۘۧۡۖۘ۠ۢۘۡۡۘۘۘۗۘۙۗۨۨۙۚۜۗۥۘۙۥۘۘ";
                                    break;
                                }
                            case 975118180:
                                str = "ۜۚۛ۟ۙۡۗۚۗۦۘۘ۬ۢۖ۬ۛۨۢۨۡۗ۫ۖۨۡۘ";
                                continue;
                            case 1481279040:
                                str2 = "ۡۚۡۘۨ۟ۛ۬ۨۧۘۨۛۙۘۤ۟۟ۗۨۙۢۥۘۡ۬ۚۤۖۧ";
                                break;
                            case 1790567952:
                                str = "ۗ۠ۘۘ۬ۜۘۥۨۚۜ۬۟ۨۘ";
                                continue;
                        }
                    }
                    break;
                case -275284516:
                    return f495b;
                case 1375911544:
                    f495b = yo.getResColor("primary_statusbar");
                    str = "ۜۚۛ۟ۙۡۗۚۗۦۘۘ۬ۢۖ۬ۛۨۢۨۡۗ۫ۖۨۡۘ";
                    break;
            }
        }
    }

    public static int getPrimarySurfaceColor() {
        String str = "ۖ۟ۖۢۡۙۜۖ۟۠۬ۘۘۛۤۧۧۛ۫";
        while (true) {
            switch ((str.hashCode() ^ 575) ^ 381076434) {
                case -1797281981:
                    f497d = yo.getResColor("primary_surface");
                    str = "ۘ۟ۖ۠ۗ۫ۖۧۖۘۨۦۘۚۦ۬ۢۡۖۘۥۗۦۧۤۗ";
                    break;
                case -1606704248:
                    return f497d;
                case -637736848:
                    String str2 = "ۘۘۜۘۤۛ۫ۨۖۡۘۘۧۢۡ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 1319880202) {
                            case -1474752727:
                                str2 = "۠ۥ۫ۖۜۜۘ۠ۖۥۘۡۧۡۨ۫ۧۖۜۜۜۤۥۘ۫ۖۚۛۚۜ";
                                break;
                            case 241694991:
                                str = "ۡۗۗ۠ۜۨۛۧۦۘۨۤۘۘ۟ۤۧ۟ۨۧۥۚۚ۫ۛۢ";
                                continue;
                            case 1514284651:
                                if (f497d != -11) {
                                    str2 = "۬ۧ۠ۥ۬ۡ۬ۗۡۘۦ۠۠ۛ۠ۧ";
                                    break;
                                } else {
                                    str2 = "ۖۧۦ۟ۖ۟۬ۛ۟ۦۖ۬ۨۧۡ";
                                    break;
                                }
                            case 1803401785:
                                str = "ۘ۟ۖ۠ۗ۫ۖۧۖۘۨۦۘۚۦ۬ۢۡۖۘۥۗۦۧۤۗ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public static int getPrimaryTextColor() {
        String str = "ۛۖۖۡ۠۠ۘ۫۠۫ۜۛۢۤۡۘۧۚۤۛۤۖۛ۫ۥ";
        while (true) {
            switch ((str.hashCode() ^ 149) ^ 1501994714) {
                case -144916251:
                    f498e = yo.getResColor("primary_text");
                    str = "ۧۚۛۜۨۘ۫ۘۦ۬ۚۤۜۜۦۘۙ۫ۥۙۨۥۘ";
                    break;
                case 1217851885:
                    return f498e;
                case 1788783762:
                    String str2 = "ۙۧۜۘ۫ۤۜۘ۠ۖۡۘۢۛۦ۬ۧۥۦۘۨۛ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 240653857) {
                            case -1039492856:
                                str = "ۧۚۛۜۨۘ۫ۘۦ۬ۚۤۜۜۦۘۙ۫ۥۙۨۥۘ";
                                continue;
                            case 359682315:
                                str = "ۛۥ۬ۢۙۥۤۛۜۨۙۛ۟ۖۙۙۢۗۘۘۧ";
                                continue;
                            case 1347415936:
                                str2 = "ۗۖۖۘۗۘۤۘ۫ۜۘۦ۠ۡۜۦۚۖۡۖۥ۫ۦۨۢۤ۫ۨۢ";
                                break;
                            case 1601150844:
                                if (f498e != -11) {
                                    str2 = "ۡ۟ۥ۟ۚۛۤۛۥۘۦۘ۬ۥۗ";
                                    break;
                                } else {
                                    str2 = "ۦۗۦ۫ۤۢۘ۠ۦۘۗۧۜۗۘۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }
}
