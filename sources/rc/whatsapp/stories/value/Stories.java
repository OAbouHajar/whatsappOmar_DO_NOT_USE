package rc.whatsapp.stories.value;

import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.yo.HomeUI;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;

public class Stories {
    public static int cardElevation() {
        String str = "ۘۨۧۛۘۢۥ۠ۘۘۗۚۢۗ۫ۛۘۥ۟ۦۖۖۙۡۧۘۦۖۖ";
        while (true) {
            switch ((str.hashCode() ^ 965) ^ -168421132) {
                case -2056563783:
                    String str2 = "ۖۨۗۦ۠ۘۘۨۖۘۗۦۘۘۖۚۘۘۧۘۥ";
                    while (true) {
                        switch (str2.hashCode() ^ 1168793492) {
                            case -2038922462:
                                if (!shp.getBoolean("key_stories_elevation")) {
                                    str2 = "ۥۦۧۗۢۧۖۗۥۘۤۨۖۨۛۘ";
                                    break;
                                } else {
                                    str2 = "۟ۧ۠ۘۙۢۛۜ۬ۛۙۥۛۖۧ";
                                    break;
                                }
                            case -1340035064:
                                str = "۟۫ۛۤۦۧۘۥۧ۠۟۬ۖۘ۬ۜۦۘ۫ۛۚۜۦۜۘۖ۠ۘ";
                                continue;
                            case -735194519:
                                str = "ۥۡۖۘۜۡۨۘۡۥۖۡۨ۟۠۠۫ۡ۬ۥۘ۟ۤ۟ۖۜۚ۟ۡ";
                                continue;
                            case 1338307923:
                                str2 = "۫۬ۘۧۖ۟ۨۧۡۗۗۗۡۦۦ۫۠ۡۙۜۘ";
                                break;
                        }
                    }
                    break;
                case -1859719395:
                    return 0;
                case -575315782:
                    return utils.dpToPx(3.0f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int cardRounded() {
        /*
            java.lang.String r0 = "ۚ۟ۙ۬ۜۘۤۧۛ۠ۘۚۖۧۙۘۗ۫ۛ۫ۛ۫ۛ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 597(0x255, float:8.37E-43)
            r3 = -887175372(0xffffffffcb1ec734, float:-1.0405684E7)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -349439400: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            android.content.SharedPreferences r0 = com.obwhatsapp.yo.shp.prefs
            java.lang.String r1 = "key_card_round"
            r2 = 14
            int r0 = r0.getInt(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.stories.value.Stories.cardRounded():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int counterColor() {
        /*
            java.lang.String r0 = "ۧ۠۫۬ۢۦۖ۬ۜۘۢۨۛ۟۠ۢۖۚۦۗ۟ۘۘۙۚۖۘ۫ۢۡۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 211(0xd3, float:2.96E-43)
            r3 = 274338612(0x105a1334, float:4.3007713E-29)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -644462216: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "key_counter_bg"
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultHomeRowsUnreadBkColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.stories.value.Stories.counterColor():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int counterTextColor() {
        /*
            java.lang.String r0 = "ۢۙۖ۟ۢۢۨ۠۟۬ۨۘۖۛۖۘۚۥۘۘۜ۫ۙۘۥۦۘۗۦ۠"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 263(0x107, float:3.69E-43)
            r3 = -1277745917(0xffffffffb3d72503, float:-1.001845E-7)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 887625515: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "key_counter_tx"
            r1 = -11
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.stories.value.Stories.counterTextColor():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int nameColor() {
        /*
            java.lang.String r0 = "۫ۧۚۜۡۡۘۧ۬ۙۖۚۧۢۗۘۘۨۖ۬ۥۡۜۘ۫ۖۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 955(0x3bb, float:1.338E-42)
            r3 = -1341920287(0xffffffffb003ebe1, float:-4.7992726E-10)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -161372178: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "key_name_stories"
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultListItemSubTitleColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.stories.value.Stories.nameColor():int");
    }

    public static int paddTstock() {
        String str = "۟ۜۥۘۢۜۖۘۦ۬۬ۖ۬ۥۗۢۛۙۦۜۘۥ۟ۛ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 530) ^ 1483924495) {
                case -2011282455:
                    str = "ۡۤۖۘۗۥۜۢۡۘۘۛۚۥۘۦۘ۬ۖ۟۫ۗۚۖۦۜۜ";
                    break;
                case -1449769016:
                    str = "۬ۦۦۚۤۦۘ۬ۦۥۤ۫ۗۦۖ۠";
                    f2 = 0.0f;
                    break;
                case -971425632:
                    String str2 = "ۖۨۧۘۖۗۜۙ۬۠ۛۡۗۗۚ۠ۘۚۡۙۦ۬ۗۚۛۥۤ۫";
                    while (true) {
                        switch (str2.hashCode() ^ -1950585243) {
                            case -2080025945:
                                str = "ۡ۠ۡۘۜۤۡۚۢۙۛۡۜۘۛ۠۫ۗۗۖۜ۟ۜۘۦۜ۫۟ۗۢ";
                                continue;
                            case -1954549210:
                                str = "ۨ۟ۘۘۜۢۨۘۤۦ۟ۘ۟۟ۚ۬ۜۘۤۤۦۘ";
                                continue;
                            case 150546352:
                                if (!HomeUI.getUIHomeStyle().equals("stock")) {
                                    str2 = "ۥۡۦۘ۫ۢۢ۬ۘۡۘ۠ۡۤ۫ۖۘۧۧۦۘ۬ۡۨۘۚۙ۠ۜۥ۫";
                                    break;
                                } else {
                                    str2 = "ۢۚۖۖۨۡۘۜۚۧۜۢۤۦۧۗۗ۫ۜۘۨۚ۠ۢ۬ۢ۫ۙ۟";
                                    break;
                                }
                            case 1552469560:
                                str2 = "ۗ۬ۦۨۢۥۘۘۧۘۘ۠ۦۡۘ۫ۡۨۘۛۛۥۘ";
                                break;
                        }
                    }
                    break;
                case -753666187:
                    f3 = 100.0f;
                    str = "ۜۧۨۘۢۛ۠ۙۢۡۘۤۜۥۘ۟ۧ۠ۥۚ۬ۧ۟ۥ۫ۤۦ";
                    break;
                case -624672533:
                    str = "ۦ۫ۤۧ۠ۜۚۦ۟۬۟۬۫ۦۘۧۢۤۗ۫ۥۘ";
                    f2 = f3;
                    break;
                case 317294174:
                    str = "ۦ۫ۤۧ۠ۜۚۦ۟۬۟۬۫ۦۘۧۢۤۗ۫ۥۘ";
                    break;
                case 463318592:
                    return utils.dpToPx(f2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int seenColor() {
        /*
            java.lang.String r0 = "ۨۜۨۗۖۥۛۦ۬ۖۛۜ۬ۜۚ۟ۗۗۢۨۘۢ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 978(0x3d2, float:1.37E-42)
            r3 = 1678642934(0x640e0ef6, float:1.0482063E22)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1215063145: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "SeenColor"
            r1 = -4473148(0xffffffffffbbbec4, float:NaN)
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.stories.value.Stories.seenColor():int");
    }

    public static int statusHeight(HomeActivity homeActivity) {
        String str = "ۤۘ۫ۧۢۖۙ۫ۤ۫۫ۙۧۢۦۨ۠ۙ۠ۡۘۡۤۦۘ۬ۤۜۘ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 605) ^ -124038254) {
                case -1805383363:
                    String str2 = "ۖۘۖۘۜۥۦۘ۬ۥۖۜۛۜۦۜۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1400549173) {
                            case -397953310:
                                if (!HomeUI.IGStoriesEnabled()) {
                                    str2 = "ۦ۬ۥۢۙۡ۬ۦۡۘۙۜ۬ۦۜۡۨۥۖۘ";
                                    break;
                                } else {
                                    str2 = "ۗۧۥۨۙۨ۫ۛۡ۠ۘۤ۟ۜۖۧۥ۫ۛۦۘۘ";
                                    break;
                                }
                            case 326688584:
                                str = "۟۟ۙ۫ۗۜۥ۬ۢ۟ۜۨۗۧۛ۬ۘۡ";
                                continue;
                            case 729456325:
                                str = "ۢۤ۟ۗۖۡۙۨۗۗ۬ۧۥۖ۟";
                                continue;
                            case 1208784905:
                                str2 = "ۚۦۖۘۧۙ۬ۜۛۤۚۘۨۚۛۤ۬۠۬ۤ۫ۨۙۥۗ";
                                break;
                        }
                    }
                    break;
                case -1153277698:
                    str = "۟ۛۜۘۨۘ۬ۡۧۦۦ۫ۦۘۜۗۙ۫ۖۖ";
                    i3 = i4;
                    break;
                case -1005928989:
                    str = "۟ۛۜۘۨۘ۬ۡۧۦۦ۫ۦۘۜۗۙ۫ۖۖ";
                    break;
                case -636719088:
                    i4 = storiesHeight();
                    str = "۠ۙۨۤۙ۫ۤۨۗۙۙۨۧۡ۬۫۠ۖ۬۠۠۟ۨۙۤۦ";
                    break;
                case 571568112:
                    str = "ۘۙۤۗۦۖۘۦۨۥۘۘۧۜۘۛۚۚ۟ۦۘۨۡ۠ۚۘۡۘ";
                    break;
                case 771898398:
                    i2 = utils.dpToPx(0.0f);
                    str = "ۦۧۡۘ۫ۙۜۘۖۛ۬ۖ۠ۙ۟ۚۡۘۚۧۗ۠ۖۘۘۗۤ۬";
                    break;
                case 1445322255:
                    return paddTstock() + i3;
                case 1826682228:
                    str = "ۚۧۖۘۗۛۦۛۙۖۘۨۗۙۨۧۦۦۨۘۘۡۧۧۛ۬۬";
                    i3 = i2;
                    break;
            }
        }
    }

    public static int storiesHeight() {
        String str = "ۜۜ۫ۘۜۘۘ۟ۜۜۘۡۛ۟۟ۙۘ۟ۡۢۢۨۥۘۘۜ۬۟۠ۢ";
        int i2 = 0;
        int i3 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 950) ^ 34567170) {
                case -2129191224:
                    return i3;
                case -2119434901:
                    String str2 = "ۚۥۖۘ۬ۡۚۗ۟ۛ۫ۘۜۘۘۨۡۛ۫ۥۧ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 1792598990) {
                            case -1821742059:
                                str = "ۘۚۗ۟ۜۤۛۗۡۘۧۚۧ۠ۜۡۘۤۢۜۘ";
                                continue;
                            case -1478007098:
                                str = "ۡۜۨۘۡ۟ۧ۟ۢۥۘۨۖۨۘۨۗۥۘ";
                                continue;
                            case 1210491266:
                                if (i4 != 4) {
                                    str2 = "ۘ۫ۙۖۧۡۘۜۤۘۘۛۛ۬ۛۤۡۘۢۛۜ۟ۙۢ";
                                    break;
                                } else {
                                    str2 = "ۨۛ۫ۜۨۖۙۜ۟ۖۥۥۜ۟ۖۗۥ۠ۨ۬ۚۦ";
                                    break;
                                }
                            case 1659856373:
                                str2 = "ۙۨۛۦۤ۟۟ۜۨۥۗۜۘۡ۠ۨۘۚۙۚ";
                                break;
                        }
                    }
                    break;
                case -1651317329:
                    str = "۟ۤۥۖ۬ۥ۫ۖ۫۫۬۫ۥۨۥۘۢ۟ۦ۠ۡۜۡۖۘۨۥ";
                    i3 = i4;
                    break;
                case -1137569038:
                    String str3 = "ۥۨ۬۫۠ۚ۟ۦ۠۫ۘۜۜۛۡۘۙۛۜۘۧۦۚۤۤ۟ۜۦۜۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1097492806) {
                            case 209721986:
                                str = "ۖۨۙۦۖۚ۠ۢۢۢ۟ۘۘ۟۠ۢ۫ۛۘ۟ۚۜ";
                                continue;
                            case 1027426422:
                                str3 = "۫ۦۨۘۢۨۧ۫ۤ۫ۡۥۨ۟ۤۘۘۛۤۜۛۥ";
                                break;
                            case 1077139018:
                                str = "ۚۛۙ۟ۦ۟۠ۗۖۘ۠ۧۘۘۤۖۧ۬۠ۡۤۜ";
                                continue;
                            case 1164798346:
                                if (i4 != 2) {
                                    str3 = "ۢۖۨۘۛۛۜۘ۠۬ۥۘۜۢۗۦ۠ۛ۫۬ۨ";
                                    break;
                                } else {
                                    str3 = "۫ۡۛۥۗۚۛۚۙۧ۠۫ۧ";
                                    break;
                                }
                        }
                    }
                    break;
                case -977532706:
                    String str4 = "ۗۘۖۢۨ۠ۢۧۨۘ۫ۜۜۘۚۛۥۢۗ۬";
                    while (true) {
                        switch (str4.hashCode() ^ 1664091729) {
                            case -2054758699:
                                str = "ۗۧ۬ۗۤۡۢۢ۟۫ۚۤ۫۬۟ۖۢۢ";
                                continue;
                            case -1993684518:
                                str4 = "ۤۢۗ۬ۛۧۨۡۦۘۜ۠ۗۘۚۨ۫ۜۛۙۖۗۦ۟ۙ";
                                break;
                            case 128779170:
                                str = "ۛۙۥۘۛۜۧۛ۠ۘۥۦۢۨۥۧۘ۫ۥ۫ۦ۫ۖۘ۠۬۠ۥۘۨۘ";
                                continue;
                            case 1860208555:
                                if (i4 != 1) {
                                    str4 = "۠۠ۜۤۧ۠ۧۖۢۚۘ۟ۡۜۦۡۘۗ";
                                    break;
                                } else {
                                    str4 = "ۦۛۢۢ۬ۗ۬۬ۘۙۘ۟ۚ۬ۚ۟ۨۧۥۤۧۦ۫ۚ";
                                    break;
                                }
                        }
                    }
                    break;
                case -812023103:
                    str = "ۤۛۗۡۛۖۢۛۤۧۧۙۜۥۘۘۨۡۛ۫ۤ";
                    f4 = f2;
                    break;
                case -803596380:
                    return utils.dpToPx(110.0f);
                case -516535342:
                    str = "۬ۚۦۛۤۥۚۛ۠ۜۡۘۜۥۨۘۤۢۖۘۙۦۦ";
                    f4 = f3;
                    break;
                case -202764836:
                case 406222012:
                    str = "ۡۘۡۘۜۚۨۨۛۤۡۡۖۘ۠۟۬ۚ۬ۛۡۛۦۘ";
                    break;
                case -97418453:
                    return utils.dpToPx(f4);
                case 12123192:
                    str = "ۡ۫ۜۘۛۜۙ۠ۤۡۘ۟ۖۦۜۧۢ";
                    f2 = 170.0f;
                    break;
                case 318934980:
                    str = "ۡۙۗۢۗۤۦۥۡۨۘۡۥۨۨ";
                    f3 = 180.0f;
                    break;
                case 516351360:
                    i2 = utils.dpToPx(110.0f);
                    str = "ۢۙۗۦۧۙۡ۬ۛۙ۟ۡ۠۠ۤ۠ۚۜۚۚ۟ۡۤۨ";
                    break;
                case 878950814:
                    str = "ۡۘۡۘۜۚۨۨۛۤۡۡۖۘ۠۟۬ۚ۬ۛۡۛۦۘ";
                    f4 = f5;
                    break;
                case 924948517:
                    i4 = storyStyle();
                    str = "۬۠ۡ۟ۥۛۤ۬ۡۘۢۦۡۘۢۢۜ";
                    break;
                case 1306285044:
                    String str5 = "ۘۙۥۘۦ۟ۥۡۡۤۚۤۜۨ۫ۛۤ۠ۖۥۡۥۘ۠ۙ۬";
                    while (true) {
                        switch (str5.hashCode() ^ -1251085043) {
                            case -1441714095:
                                if (i4 != 3) {
                                    str5 = "ۖۙۘ۬۠۬ۗۖۛ۬ۡۚ۟ۘۘۗۦ۫ۖۚۢۧ۬ۦۘۗ۟۟";
                                    break;
                                } else {
                                    str5 = "ۤۙۜۘۚۖۜۘۧۧۙۖۖۦۗۦۗ۫ۙۥۘۨ۠";
                                    break;
                                }
                            case -1242361761:
                                str = "ۥۨۖۛۧۗ۠ۗۥۡۛۘۘۢۨۥ۟ۦۨۢ۬ۨ";
                                continue;
                            case -441396026:
                                str = "ۢۖۨۘۡۛۤۗ۫ۦ۠۬ۢۖۢۤۥۦۙۖۧ";
                                continue;
                            case 2049397222:
                                str5 = "ۧۙۤۜۚۘۥۙۖۥۤۡۧۛۚۙۚۨ۟ۧۨۘۗۜۘ";
                                break;
                        }
                    }
                    break;
                case 1551387534:
                    String str6 = "ۢ۟ۢۜۢۗۡۖۦۘۢۨۗ۫ۨۚ۟ۗ۠ۤۖۛ";
                    while (true) {
                        switch (str6.hashCode() ^ -727941583) {
                            case -2110577743:
                                if (i4 != 0) {
                                    str6 = "ۗۧۚ۠ۘۙۛۜۦۘ۠ۨ۬۠ۧۜۘ۬ۘۢ۬ۘۗۤۧۡۘ";
                                    break;
                                } else {
                                    str6 = "ۛۤۖۘ۫ۜ۟ۜۢۘ۬ۘۥۨۙۢۡ۟ۦ۬ۢ";
                                    break;
                                }
                            case -2101551203:
                                str = "ۚۗۦۘ۬ۙۚ۠ۤۜۤۙۗ۫ۙ۟ۜۥۘۘۜۖۖ";
                                continue;
                            case -1220275249:
                                str = "ۤۖ۠ۦۛۡۘۘ۟۬ۧۜۦۘۤۧ";
                                continue;
                            case -1165964314:
                                str6 = "ۥ۬ۙۖۢۖۨ۟ۗۦۢۨۛۨۢ۟۟ۙۙ۫ۘ";
                                break;
                        }
                    }
                    break;
                case 1570956193:
                    f5 = 105.0f;
                    str = "ۦ۠ۜ۬ۥۧ۠ۦۚۚۤۜۡ۫ۥۘۤۙۧۚۦۥۘ";
                    break;
                case 1864226227:
                    str = "ۘۚۗ۟ۜۤۛۗۡۘۧۚۧ۠ۜۡۘۤۢۜۘ";
                    i3 = i2;
                    break;
            }
        }
    }

    public static int storyLayout() {
        String str = "ۧۥ۟ۤۥۨۘۖۤۘۘۤۤۜۘۢۤۢ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 335) ^ -519877864) {
                case -1913332965:
                    str = "۠ۛۚۖ۬ۛۧۘ۬۟ۤۖۗۖۙۖۘۨۘ";
                    str5 = str6;
                    break;
                case -1816154325:
                    String str7 = "ۡۥۦۘۘۥۚۙۗۚۢۙۜۘۜۛۥۘ۠ۘ";
                    while (true) {
                        switch (str7.hashCode() ^ 1059744010) {
                            case -2012377765:
                                str7 = "ۡۘۚۥ۠ۘۦۤۖۘۙۤۦۛۚۜۙۛۥۘۨ۬ۖۘ";
                                break;
                            case -1401494904:
                                if (i3 != 2) {
                                    str7 = "ۧۘۤۡۥۗۚۤۖۤۘۤ۟ۧۚۘ۬ۜۘ۟ۖ۬۟ۚۖۘ۫ۡۘۘ";
                                    break;
                                } else {
                                    str7 = "ۡۖۤ۟ۘۥ۠ۦ۫ۜۘۚۡۙ۟";
                                    break;
                                }
                            case 486100000:
                                str = "ۙ۟ۡۘۢۥۚۗۗ۬ۨ۠ۘۥۥۜۘ";
                                continue;
                            case 1170134397:
                                str = "۫ۛۛۡۦ۬ۧۥۘۘ۟۟ۤۚۥۙ۠ۡۖۘ۠ۢۘۙۡۤۡۥۘ";
                                continue;
                        }
                    }
                    break;
                case -1639624355:
                    String str8 = "۟ۗۘ۫ۡۦۘۨۘ۫ۡۜۨۢۦ۬ۡۦۜۛۡۜ";
                    while (true) {
                        switch (str8.hashCode() ^ -1923370145) {
                            case -1608472085:
                                str8 = "۟۠۠ۢۢۨۘۜۤۚۛۗۖۦ۠ۗ";
                                break;
                            case 514704473:
                                str = "ۚۥۘۘ۬۠۫۫ۡۘۘۤ۟ۛ۫ۛۨۘۖۦۖ۫۟ۚۥۦ۫ۛ";
                                continue;
                            case 527226052:
                                str = "ۤۢ۫۫ۦۥۘۢ۬ۜۖۧ۫۫۫ۨۡۖۖۦۜۜۘۦۙۛۨۘ۠";
                                continue;
                            case 1889865810:
                                if (i3 != 3) {
                                    str8 = "ۛۚۘۘ۠ۢۥ۠ۤۨۙ۫ۨۤۖ۠ۦۘ۬ۜۦۘۧ۬۬";
                                    break;
                                } else {
                                    str8 = "ۖ۬ۛۖۦۡۘۛ۠ۡۘۜۧۘ۬۫ۗ۬ۥۥۘۧۧۘۘۖۚۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1462990184:
                    str = "۟ۙۢۛۦۡۛۤۡۘۜ۟ۜۘۦۚۨ";
                    str3 = "style_stories_concept2";
                    break;
                case -1324946649:
                    return yo.getID(str5, "layout");
                case -1153198431:
                    String str9 = "ۡۡۜۘ۬ۛۘ۟ۖ۟۬ۢۤۜۛۡۘ";
                    while (true) {
                        switch (str9.hashCode() ^ -1824269040) {
                            case -7600064:
                                str = "ۙۡ۬۬ۨۨۧۖ۠ۥۜۘۘۗ۠۟ۜ۠ۢۢۤۜۘۗ۠۠";
                                continue;
                            case 203709586:
                                str = "ۢۛۧۡۜۥۗۧۥۘ۠ۢۜۤ۠ۦ۫۬ۨۘ۬۫ۗ۬ۘۨۘۗ۫ۦ";
                                continue;
                            case 287582154:
                                str9 = "۟ۡ۫ۚۥۧۡۢۨ۠۟ۗۤ۟ۦۙۡۖۜ۟ۖۘۚ۫ۦۚۦۗ";
                                break;
                            case 324056345:
                                if (i3 != 4) {
                                    str9 = "ۢۜۧۛۡ۠ۚۤ۠ۢۤ۬ۤ۠ۥۘ";
                                    break;
                                } else {
                                    str9 = "۬ۘ۠ۖ۠ۛۚ۟ۢۜۙۥۜۘۖۘۖۢ۬";
                                    break;
                                }
                        }
                    }
                    break;
                case -1025351704:
                    String str10 = "ۧ۠ۧۦۡۡۤۘۨۘۘۧۜۨۛۦ۟ۗۦۘۦ۠ۧۜۨۢۨ۫ۨۘ";
                    while (true) {
                        switch (str10.hashCode() ^ 348100575) {
                            case -466499924:
                                str = "۬ۛۡۘۨ۬ۡۡۛۖۦۢ۠ۗۚۛۤۥۧۘۙ۠ۦۘ";
                                continue;
                            case 742777114:
                                str = "ۗ۫۫ۗۘۘۘۨ۠ۨۤۧۨۢۜ۫ۖۗۦۘۧ۟ۜۡ۟ۜۘ";
                                continue;
                            case 1405909975:
                                if (i3 != 0) {
                                    str10 = "ۥۛۧۦۡۥۘۚ۬۬ۘۢ۠ۦۨۚۚۧۨۘۧ۟ۡۘۨۤ";
                                    break;
                                } else {
                                    str10 = "ۨۖۜۗۛۥ۫۫ۗ۠ۢۚۖۧۧ۠ۘۧۛۗۥۘ";
                                    break;
                                }
                            case 2118178467:
                                str10 = "۫ۖۡۘۘۨۨۥۖۗۡۨ۫۬۫";
                                break;
                        }
                    }
                    break;
                case 16043216:
                    str = "ۧۜۡۘۙ۬ۜ۠۫ۨۨۥۧۡۢۤ";
                    str5 = str3;
                    break;
                case 328889498:
                    str6 = "style_stories_notify";
                    str = "ۚۢۜۢ۫ۘۘۗ۫ۥۖۧۜۘ۬ۖۗ";
                    break;
                case 654996518:
                case 1611752243:
                    return i2;
                case 679141381:
                    str = "ۛ۟ۧۗۨۘۚۦۜۡۡۙۚۘۡۙۜۥۘۘۧۚ";
                    i2 = yo.getID("style_stories_stock", "layout");
                    break;
                case 740123406:
                case 1426841769:
                case 2076711989:
                    str = "۠ۛۚۖ۬ۛۧۘ۬۟ۤۖۗۖۙۖۘۨۘ";
                    break;
                case 1055479176:
                    str = "ۦۨۗۚۛ۬ۗ۫ۗۥ۫ۡۛۨۗۥۦۘۘۖ۟ۤ";
                    str5 = str4;
                    break;
                case 1507892976:
                    str = "ۗۘۛ۟۠ۘۢۧۙۜۘۨۘۢۚۖۦ۠ۥۘۧۤۤ";
                    str4 = "style_stories_facebook";
                    break;
                case 1528877577:
                    str2 = "style_stories_concept";
                    str = "ۥۦۦۡۖۙ۟ۖۦۘۥۤ۠ۡۜۨۘ";
                    break;
                case 1544869872:
                    String str11 = "ۦۚۡۘ۫ۢ۠ۡۤۘۥ۫ۨۗۤۖۘۧۙۥۘ۫ۥۖۘ۫ۤۦ";
                    while (true) {
                        switch (str11.hashCode() ^ 365343139) {
                            case -2096487208:
                                str = "ۨۛۢۜۜ۫۬ۥۘۚۦۡۘۛۘۙۤۧۥۘۗۤۧ۟ۨ۟ۖۚۙ";
                                continue;
                            case -1552673296:
                                str11 = "ۤۜۖۘۛۨۥۘۢ۟ۘۘۘۚۛ۬ۖۥۤۨۘ";
                                break;
                            case -1466903760:
                                str = "ۥ۬ۖۚ۫ۜۘ۟ۥۜۘۢۙۘۘ۫ۡۖۘۙۛ۟۫ۖۦۘۧۘۚ";
                                continue;
                            case 1826591857:
                                if (i3 != 1) {
                                    str11 = "ۙۥۙۦۙۚۡ۬ۜۘۘۗۦۘۧۛ۫ۨۥۡ۟۟ۥۚ۫ۜۘ";
                                    break;
                                } else {
                                    str11 = "۟ۗ۫۫ۗۘۧۘۡۘۦۥ۫ۢ۬۠۟۫ۖ۫۟";
                                    break;
                                }
                        }
                    }
                    break;
                case 1750274035:
                    str = "ۤۥۘۘۙۦۖۘۖۨۖۘۗۘۧۘۡۧۨۨ۠ۗ۬۫";
                    i3 = storyStyle();
                    break;
                case 1778154643:
                    str = "ۥۙۡۘۧ۟ۛۧ۟ۘۘ۫ۛۨۗۥۘ";
                    str5 = str2;
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int storyStyle() {
        /*
            java.lang.String r0 = "ۘۚ۬ۘۘۥۘۨۘ۬۠ۥ۫ۤۡۦ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 323(0x143, float:4.53E-43)
            r3 = 1264979422(0x4b660dde, float:1.507683E7)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 382588223: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            android.content.SharedPreferences r0 = com.obwhatsapp.yo.shp.prefs
            java.lang.String r1 = "key_story_view"
            java.lang.String r2 = "0"
            java.lang.String r0 = r0.getString(r1, r2)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.stories.value.Stories.storyStyle():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int unseenColor() {
        /*
            java.lang.String r0 = "۫ۢۖۜۙۡۘۨۚۜۥۡۥۛۖۢ۟ۨۘۘۜۢ۟ۡۘۨۘۚۢۥ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 278(0x116, float:3.9E-43)
            r3 = -918799663(0xffffffffc93c3ad1, float:-770989.06)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1873131644: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "UnSeenColor"
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultHomeRowsUnreadBkColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.stories.value.Stories.unseenColor():int");
    }
}
