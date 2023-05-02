package com.B58works;

public class IDGen {

    public static final class id {
        public static int abu_saleh_anti_revoke_status = IDGen.idid("abu_saleh_anti_revoke_status");
        public static int abu_saleh_anti_view_once = IDGen.idid("abu_saleh_anti_view_once");
        public static int abu_saleh_forwarded_tag = IDGen.idid("abu_saleh_forwarded_tag");
        public static int composing = IDGen.idid("composing");
        public static int follow = IDGen.idid("follow");
        public static int hidebluetick = IDGen.idid("hidebluetick");
        public static int menu_BOR = IDGen.idid("menu_BOR");
        public static int menu_antirevoke = IDGen.idid("menu_antirevoke");
        public static int menu_antirevokestatus = IDGen.idid("menu_antirevokestatus");
        public static int menu_disfwd = IDGen.idid("menu_disfwd");
        public static int menu_hide2tick = IDGen.idid("menu_hide2tick");
        public static int menu_hideseen = IDGen.idid("menu_hideseen");
        public static int menu_hidestatus = IDGen.idid("menu_hidestatus");
        public static int menu_mutestatus = IDGen.idid("menu_mutestatus");
        public static int openc = IDGen.idid("openc");
        public static int playy = IDGen.idid("playy");
        public static int recording = IDGen.idid("recording");
        public static int resetpriv = IDGen.idid("resetpriv");
        public static int restart = IDGen.idid("restart");
        public static int tb = IDGen.idid("tb");
        public static int tb1 = IDGen.idid("tb1");
        public static int tb2 = IDGen.idid("tb2");
        public static int tb3 = IDGen.idid("tb3");
        public static int tb4 = IDGen.idid("tb4");
        public static int tb5 = IDGen.idid("tb5");
        public static int tb6 = IDGen.idid("tb6");
        public static int tb7 = IDGen.idid("tb7");
        public static int update = IDGen.idid("update");
    }

    public static int idid(String str) {
        return B58.ctx.getResources().getIdentifier(str, "id", B58.ctx.getPackageName());
    }
}
