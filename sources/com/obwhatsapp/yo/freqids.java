package com.obwhatsapp.yo;

import java.util.Locale;
import okhttp3.internal.http.StatusLine;

public abstract class freqids {

    /* renamed from: a  reason: collision with root package name */
    public static final i1 f106a = new i1(1);

    static {
        String str = "ۘۤ۬ۥۘۧۨۜۨۦۘۘۙ۟ۧۜۨۧ۬ۖ۠۬ۧۘۡۧۢ";
        while (true) {
            switch ((str.hashCode() ^ StatusLine.HTTP_PERM_REDIRECT) ^ -1297762068) {
                case -427488588:
                    return;
                case 1700684301:
                    str = "ۛۗۖۘۡۦ۫ۤۦۥ۠ۖۡۘ۠۠ۙۜ۠ۨۤۖۦۘۗۘۗۘۨۛ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int contactLasSeenString() {
        /*
            java.lang.String r0 = "۟۠ۡ۫ۚ۬ۙۙۨۡۙۡۤۧۥۥۥۥ۫ۙۙۤ۟۫"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 22
            r3 = 446195762(0x1a986832, float:6.3034063E-23)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -926353566: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "conversation_last_seen"
            java.lang.String r1 = "string"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.freqids.contactLasSeenString():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int contactOfflineString() {
        /*
            java.lang.String r0 = "ۗۜ۬ۜۚۜۢۥۘ۫ۙۦ۬ۙۙۨۧۖۘۨۙۙۤۧۡ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 772(0x304, float:1.082E-42)
            r3 = 1653948776(0x62954168, float:1.376639E21)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1721050437: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "offline_str"
            java.lang.String r1 = "string"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.freqids.contactOfflineString():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int contactOnlineString() {
        /*
            java.lang.String r0 = "ۗۖۨۘۦۚۛ۬ۢۗ۟ۤ۫۠۠ۛ۬ۥۙ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 859(0x35b, float:1.204E-42)
            r3 = 1848737046(0x6e317d16, float:1.3732517E28)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 213413999: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "conversation_contact_online"
            java.lang.String r1 = "string"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.freqids.contactOnlineString():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int contactStatusString() {
        /*
            java.lang.String r0 = "ۧۤ۫ۜۥۡۨ۬۠ۨۖۡۚۘۜۘۛۙۖۡۚۨۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 195(0xc3, float:2.73E-43)
            r3 = 1280325252(0x4c503684, float:5.4581776E7)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 371163329: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "contact_status"
            java.lang.String r1 = "string"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.freqids.contactStatusString():int");
    }

    public static int getId(String str) {
        try {
            Integer num = (Integer) f106a.get(str.toLowerCase(Locale.ENGLISH));
            String str2 = "۠ۖۜۘۗۜۘۛۜ۠۟ۤ۬ۥۖۙۦۚ۫ۤۤۧۥۥۘ";
            while (true) {
                switch (str2.hashCode() ^ 2124603000) {
                    case -208370259:
                        return num.intValue();
                    case 775853873:
                        if (num == null) {
                            str2 = "ۦۨ۬ۧۙۦۥۨ۟ۗ۬ۚۘۢۧۚۚۥۘۗ۟ۨۘۛۧۙۙۢۡۘ";
                            break;
                        } else {
                            str2 = "ۡۥۜۘۡۦۜۤ۬ۚ۬ۗۡۢۤۤ۟ۤ۫ۥۢۨ";
                            continue;
                        }
                    case 970717428:
                        str2 = "ۡ۠ۡ۟ۛۧۧۤۗ۟ۜۖ۠ۘۢ۟ۢۚ";
                        continue;
                    case 1330772352:
                        break;
                    default:
                        continue;
                }
            }
        } catch (Exception e2) {
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int loglist() {
        /*
            java.lang.String r0 = "ۛۥۡۘۧۚۘۡۥۢۚۘۘۖ۟ۢ۠ۢۥۦ۬ۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 918(0x396, float:1.286E-42)
            r3 = -427083888(0xffffffffe68b3790, float:-3.2871694E23)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -660053215: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "loglist"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.freqids.loglist():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int ppUpdatedString() {
        /*
            java.lang.String r0 = "۟ۨ۬ۚ۠ۡۘۧۤ۬ۤۜۘۛۧۘۘۗۗۦ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 662(0x296, float:9.28E-43)
            r3 = 1415869709(0x5464750d, float:3.92486532E12)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1111478862: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "profile_photo_updated"
            java.lang.String r1 = "string"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.freqids.ppUpdatedString():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int profileNameString() {
        /*
            java.lang.String r0 = "ۚۘۖۘۛۦۗۤۦ۬ۜۚۦۥۧۢ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 914(0x392, float:1.281E-42)
            r3 = -508109184(0xffffffffe1b6de80, float:-4.2166753E20)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -265196124: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "profile_name"
            java.lang.String r1 = "string"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.freqids.profileNameString():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int readlog() {
        /*
            java.lang.String r0 = "۟ۤۘۘ۟ۗ۠ۤۖ۠ۘۜۗۨۗۖۘ۟ۦۦۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 256(0x100, float:3.59E-43)
            r3 = 747785498(0x2c924d1a, float:4.1581296E-12)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 879633192: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "readlog"
            java.lang.String r1 = "layout"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.freqids.readlog():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int readlogrow() {
        /*
            java.lang.String r0 = "ۙۦۧۘۗۖۦۘۚۡ۟ۧۤۘۘ۬ۧ۬ۛ۠ۢۤۙۤ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 768(0x300, float:1.076E-42)
            r3 = -618893282(0xffffffffdb1c701e, float:-4.4033371E16)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 494994147: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "readlogrow"
            java.lang.String r1 = "layout"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.freqids.readlogrow():int");
    }
}
