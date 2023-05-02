package com.obwhatsapp.yo;

import android.os.AsyncTask;
import com.obwhatsapp.Conversation;
import java.lang.ref.WeakReference;

public final class h1 extends AsyncTask {

    /* renamed from: d  reason: collision with root package name */
    public static final int f778d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f779a;

    /* renamed from: b  reason: collision with root package name */
    public long f780b;

    /* renamed from: c  reason: collision with root package name */
    public final String f781c;

    public h1(Conversation conversation, String str) {
        String str2;
        this.f779a = new WeakReference(conversation);
        this.f781c = str;
        String str3 = "ۚۥۘۘۨ۬ۚۤۛۜۘۤ۬ۜۦۖۘۨۚۨۥۨۥۘ۟۫۫";
        while (true) {
            switch (str3.hashCode() ^ 2101178976) {
                case -1624539099:
                    if (yo.isGroupJid(str)) {
                        str3 = "ۜۨۜ۫۬ۡۘۧۗۨۘۘۢۦۡۖۘۦ۠";
                        break;
                    } else {
                        str3 = "۠ۜۜ۠ۜۘۘۥۘۛۧۙۘۤۥۘۚۢۙ";
                        continue;
                    }
                case -1301552620:
                    str2 = "@g.us";
                    break;
                case -457005079:
                    str3 = "۬ۥۘۘۜ۫ۨۘۨۥۜۘۜۚۚۚۜۧۤ۬ۦۘ";
                    continue;
                case 112873812:
                    str2 = "@s.whatsapp.net";
                    break;
            }
        }
        this.f781c = str.concat(str2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r13) {
        /*
            r12 = this;
            r6 = 3
            r11 = 2
            r8 = 0
            java.lang.String[] r13 = (java.lang.String[]) r13
            android.database.sqlite.SQLiteOpenHelper r0 = com.obwhatsapp.yo.yo.sql
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()
            boolean r2 = z.j.g(r0)
            java.lang.ref.WeakReference r10 = r12.f779a
            java.lang.String r9 = "notfound"
            java.lang.String r3 = r12.f781c
            r4 = 1723037490(0x66b37732, float:4.237512E23)
            java.lang.String r1 = "ۙۙۛۦۙۜۦۚۙۨ۠ۡۘۤۥۧۘۜۘ۟ۘۘ"
        L_0x001a:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1716726900: goto L_0x0023;
                case -435379395: goto L_0x019d;
                case 1674311158: goto L_0x002e;
                case 2023317689: goto L_0x0029;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x001a
        L_0x0023:
            java.lang.String r1 = "ۗۢۨۤ۫ۤۥۘۘۥۤۢۘۘۗ۠۟ۘۘ۫ۨۗ۠ۙۖۖ۬ۥۘ"
            goto L_0x001a
        L_0x0026:
            java.lang.String r1 = "ۖ۬ۢۙۤۥۘۘۛۛۜ۫ۥۘۡ۬۬ۦ۟۟۬۫ۢۦ۫ۜۘ"
            goto L_0x001a
        L_0x0029:
            if (r2 == 0) goto L_0x0026
            java.lang.String r1 = "ۖۛۦۘۢۡ۠ۘۦۘۧۢۘۘۚ۫ۧۚۥۤ"
            goto L_0x001a
        L_0x002e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ea }
            java.lang.String r2 = "SELECT data,timestamp,_id,key_id,media_size FROM messages WHERE key_remote_jid='"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00ea }
            r1.append(r3)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r2 = "'"
            r1.append(r2)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ea }
            r2 = 0
            android.database.Cursor r2 = r0.rawQuery(r1, r2)     // Catch:{ Exception -> 0x00ea }
            r2.moveToFirst()     // Catch:{ Exception -> 0x00ea }
            r4 = 1869895187(0x6f745613, float:7.56184E28)
            java.lang.String r1 = "ۗۨۨۖۗۦۘۧۖۥۛۥۗۘۖۖۘۗۗۚ"
        L_0x004e:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x00ea }
            r5 = r5 ^ r4
            switch(r5) {
                case -1689932671: goto L_0x00c7;
                case -868886080: goto L_0x0057;
                case -726349978: goto L_0x00c4;
                case 1199779146: goto L_0x00bb;
                default: goto L_0x0056;
            }     // Catch:{ Exception -> 0x00ea }
        L_0x0056:
            goto L_0x004e
        L_0x0057:
            r4 = -1288510845(0xffffffffb332e283, float:-4.1649866E-8)
            java.lang.String r1 = "ۙۙۥۦۚ۠ۦ۬ۜۤ۟ۢۡۥ"
        L_0x005c:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x00ea }
            r5 = r5 ^ r4
            switch(r5) {
                case -1259497377: goto L_0x00cf;
                case -733810851: goto L_0x0071;
                case -619873924: goto L_0x0065;
                case 1309842567: goto L_0x00d8;
                default: goto L_0x0064;
            }     // Catch:{ Exception -> 0x00ea }
        L_0x0064:
            goto L_0x005c
        L_0x0065:
            java.lang.String r1 = "_id"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x00ea }
            long r4 = r2.getLong(r1)     // Catch:{ Exception -> 0x00ea }
            r12.f780b = r4     // Catch:{ Exception -> 0x00ea }
        L_0x0071:
            r4 = 1466232248(0x5764edb8, float:2.51709645E14)
            java.lang.String r1 = "ۢۘۨۘۦۡۙ۠ۤۦۘ۠ۖۨۗۥۨۘۡۘۘ"
        L_0x0076:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x00ea }
            r5 = r5 ^ r4
            switch(r5) {
                case -2130679449: goto L_0x00de;
                case -388560721: goto L_0x00e7;
                case -266580516: goto L_0x007f;
                case 818172720: goto L_0x0057;
                default: goto L_0x007e;
            }     // Catch:{ Exception -> 0x00ea }
        L_0x007e:
            goto L_0x0076
        L_0x007f:
            r2.close()     // Catch:{ Exception -> 0x00ea }
        L_0x0082:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016a }
            r1.<init>()     // Catch:{ Exception -> 0x016a }
            java.lang.String r2 = "SELECT key_id FROM messages WHERE key_remote_jid='"
            r1.append(r2)     // Catch:{ Exception -> 0x016a }
            r1.append(r3)     // Catch:{ Exception -> 0x016a }
            java.lang.String r2 = "' AND _id="
            r1.append(r2)     // Catch:{ Exception -> 0x016a }
            long r2 = r12.f780b     // Catch:{ Exception -> 0x016a }
            r1.append(r2)     // Catch:{ Exception -> 0x016a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x016a }
            r2 = 0
            android.database.Cursor r1 = r0.rawQuery(r1, r2)     // Catch:{ Exception -> 0x016a }
            r1.moveToFirst()     // Catch:{ Exception -> 0x016a }
            r2 = -361257161(0xffffffffea77a737, float:-7.484858E25)
            java.lang.String r0 = "ۦۘۡۘۧ۬ۜۘۖۙ۬۠ۢ۬ۢۨۥۘ۟۬ۖۙۤۗ"
        L_0x00aa:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x016a }
            r3 = r3 ^ r2
            switch(r3) {
                case -1718811301: goto L_0x0127;
                case -1090136304: goto L_0x011b;
                case -1063223484: goto L_0x0124;
                case 199138523: goto L_0x00b3;
                default: goto L_0x00b2;
            }     // Catch:{ Exception -> 0x016a }
        L_0x00b2:
            goto L_0x00aa
        L_0x00b3:
            r1.close()     // Catch:{ Exception -> 0x016a }
            r8 = r9
        L_0x00b7:
            return r8
        L_0x00b8:
            java.lang.String r1 = "ۖۢۘ۬ۖۤ۬ۗۨۜۚۡۛۡۘۘ۫ۙۛ"
            goto L_0x004e
        L_0x00bb:
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x00ea }
            if (r1 > 0) goto L_0x00b8
            java.lang.String r1 = "ۗۛۜۘۚ۬ۘ۫۫ۜۨۤۨۘ۠۠ۘ۫۠ۡۘ۟ۛۡۘ"
            goto L_0x004e
        L_0x00c4:
            java.lang.String r1 = "۬۫ۡۘ۠ۥۗۘ۠ۗ۠ۗۢۥ۟ۘۘ۠۠ۘۘ"
            goto L_0x004e
        L_0x00c7:
            r2.close()     // Catch:{ Exception -> 0x00ea }
            r8 = r9
            goto L_0x00b7
        L_0x00cc:
            java.lang.String r1 = "ۘۧۥۙ۬ۡۨۥۚۘ۫ۧۜۙۡۘۤۖۖۘۛ۫ۥ"
            goto L_0x005c
        L_0x00cf:
            int r1 = r2.getPosition()     // Catch:{ Exception -> 0x00ea }
            if (r1 != 0) goto L_0x00cc
            java.lang.String r1 = "ۜۜۘۘ۫ۥۧۘ۠ۨۥۙ۫ۦۦ۟ۙ۠ۦۙۨ۟۬ۦۗۥۘ"
            goto L_0x005c
        L_0x00d8:
            java.lang.String r1 = "ۧ۠۠۟ۜۙ۟ۨۡ۫ۨۜۘ۬ۖۡۛۨۡۘ"
            goto L_0x005c
        L_0x00db:
            java.lang.String r1 = "ۗۧۤۚۢۨۛۘۖۘ۫ۚۥ۠ۨۤۡۦۦۘ"
            goto L_0x0076
        L_0x00de:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x00ea }
            if (r1 != 0) goto L_0x00db
            java.lang.String r1 = "ۥ۫۟ۘۗۥۘۤ۬ۚۧۙۚۜۛۡۘ"
            goto L_0x0076
        L_0x00e7:
            java.lang.String r1 = "۫ۗۦۨۡۧۘ۬۟ۜۨۨۘۘۜۙۦۤۨۦۚ۠"
            goto L_0x0076
        L_0x00ea:
            r1 = move-exception
            r2 = 2765830(0x2a3406, float:3.875753E-39)
            java.lang.String r1 = "ۚۙۙۧ۟ۢ۟ۥۨۘۡ۬ۢۡۥۥۘۗۨۘۘۤ۫۠ۖۨ۫۟۫ۘ"
        L_0x00f0:
            int r4 = r1.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1238264971: goto L_0x010c;
                case 274164362: goto L_0x00f9;
                case 529964581: goto L_0x0115;
                case 708398604: goto L_0x0082;
                default: goto L_0x00f8;
            }
        L_0x00f8:
            goto L_0x00f0
        L_0x00f9:
            java.lang.Object r1 = r10.get()
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1
            com.obwhatsapp.yo.d0 r2 = new com.obwhatsapp.yo.d0
            r2.<init>(r6)
            r1.runOnUiThread(r2)
            goto L_0x0082
        L_0x0109:
            java.lang.String r1 = "۟۬ۘۡۖۦۘ۫ۨۥۘ۬ۜ۬ۘۧۖ۬۫ۢ۬ۥۙ"
            goto L_0x00f0
        L_0x010c:
            java.lang.Object r1 = r10.get()
            if (r1 == 0) goto L_0x0109
            java.lang.String r1 = "ۨ۟ۥۘۢ۟۠ۥ۠ۖۡ۬ۡۘۗۘۘۘۖۗۘۨۧۦۘ"
            goto L_0x00f0
        L_0x0115:
            java.lang.String r1 = "ۥۗ۟ۖۖۥۜۖۤۖۜ۬ۦ۬ۧۙ"
            goto L_0x00f0
        L_0x0118:
            java.lang.String r0 = "ۨۖۖ۟۬۬ۚۥ۟ۚ۫ۛۨ۬ۗۛۡۘۙ۫ۧۥ۬ۚۦۛ۫"
            goto L_0x00aa
        L_0x011b:
            int r0 = r1.getCount()     // Catch:{ Exception -> 0x016a }
            if (r0 > 0) goto L_0x0118
            java.lang.String r0 = "۬ۨۢۤۗۗۗۦۚۜۙ۫ۡۙۛۨۙۤۥۡۘ۫ۥۘ"
            goto L_0x00aa
        L_0x0124:
            java.lang.String r0 = "۟۬ۜۘۛ۠۫۫ۖۘۦۧۗ۬ۜۢ"
            goto L_0x00aa
        L_0x0127:
            java.lang.String r0 = "key_id"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x016a }
            java.lang.String r8 = r1.getString(r0)     // Catch:{ Exception -> 0x016a }
            r2 = -1868581922(0xffffffff909fb3de, float:-6.299157E-29)
            java.lang.String r0 = "۟ۚ۠۟ۧۤ۫ۜۘۘ۫ۡۛۥۖ۟ۚۥۛۙ۟ۡۗۦۖۘۗۡۚ"
        L_0x0136:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x016a }
            r3 = r3 ^ r2
            switch(r3) {
                case -826843491: goto L_0x0156;
                case -571358599: goto L_0x013f;
                case 1499034562: goto L_0x015f;
                case 1977756490: goto L_0x0127;
                default: goto L_0x013e;
            }     // Catch:{ Exception -> 0x016a }
        L_0x013e:
            goto L_0x0136
        L_0x013f:
            r1.close()     // Catch:{ Exception -> 0x016a }
            r1 = 387499894(0x1718c776, float:4.9365604E-25)
            java.lang.String r0 = "ۢ۟ۤۘۙۘۘ۠ۦۘۘۖ۟ۥۘۖۛۥۘۧۡۤۛۡۥۜۦۡۤۥۘ"
        L_0x0147:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x016a }
            r2 = r2 ^ r1
            switch(r2) {
                case -1515504995: goto L_0x00b7;
                case -487417308: goto L_0x0150;
                case -202635776: goto L_0x0179;
                case 650366145: goto L_0x0165;
                default: goto L_0x014f;
            }
        L_0x014f:
            goto L_0x0147
        L_0x0150:
            java.lang.String r0 = "ۤۚ۫۠ۜۧۘۛ۫۠۬ۘ۬ۦۙۘۘۥۧۨۘۛۛۦۘۤۦ"
            goto L_0x0147
        L_0x0153:
            java.lang.String r0 = "ۙۨۧۘۧۡۧۘۘۖۦۘۛۙۜ۠۬ۘۙۖۚ"
            goto L_0x0136
        L_0x0156:
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x016a }
            if (r0 != 0) goto L_0x0153
            java.lang.String r0 = "ۡۦۧۘۢ۠ۡۘۖۚۥۜۢۘۘۨۛۥۦۢۖۘۡۘ۠ۚۡ"
            goto L_0x0136
        L_0x015f:
            java.lang.String r0 = "ۚ۟ۡۨۤ۫ۢۡۖ۫۬ۧۗۨۘۧ۬۠ۡۤۨۘۜۘۢۗۡ"
            goto L_0x0136
        L_0x0162:
            java.lang.String r0 = "۟ۡۨۙۤ۬۫ۨۖۘۙۥ۫ۤ۠ۧۨۙۘۘۢۜۧۘۛۥۢ"
            goto L_0x0147
        L_0x0165:
            if (r8 == 0) goto L_0x0162
            java.lang.String r0 = "ۥۜۖۘۡۥۜۘۗۛ۬ۤۗۨۘۤۘۘۘۙۚۙ"
            goto L_0x0147
        L_0x016a:
            r0 = move-exception
            r1 = 623683983(0x252ca98f, float:1.497607E-16)
            java.lang.String r0 = "۬ۛۖۚۨ۟ۨۜۖۘ۫ۘۜۡۜ۠ۜۨ۠"
        L_0x0170:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1051967599: goto L_0x017f;
                case -805733530: goto L_0x0179;
                case 654566948: goto L_0x0188;
                case 1174792030: goto L_0x018b;
                default: goto L_0x0178;
            }
        L_0x0178:
            goto L_0x0170
        L_0x0179:
            r8 = r9
            goto L_0x00b7
        L_0x017c:
            java.lang.String r0 = "ۤۚۤۚ۟ۖۘۛۛۨۘۧۛۨۘۖ۟ۗۖۘۤۤۗۙ"
            goto L_0x0170
        L_0x017f:
            java.lang.Object r0 = r10.get()
            if (r0 == 0) goto L_0x017c
            java.lang.String r0 = "ۜ۟ۧۡ۠۟ۤۜۡۚ۟ۦۘۙۥۥۘۨۡۧ"
            goto L_0x0170
        L_0x0188:
            java.lang.String r0 = "ۚ۟ۘۘ۠ۘۦ۟ۛ۫ۡۨۨۨۨۚۢۦۢۡۢۗۦۡۦۘۘۥۢ"
            goto L_0x0170
        L_0x018b:
            java.lang.Object r0 = r10.get()
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            com.obwhatsapp.yo.d0 r1 = new com.obwhatsapp.yo.d0
            r2 = 4
            r1.<init>(r2)
            r0.runOnUiThread(r1)
            r8 = r9
            goto L_0x00b7
        L_0x019d:
            int r1 = z.j.e(r0, r3)     // Catch:{ Exception -> 0x0242 }
            int r5 = z.j.d(r0, r1)     // Catch:{ Exception -> 0x0242 }
            java.lang.String r1 = "message"
            r2 = 4
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x01e2 }
            r3 = 0
            java.lang.String r4 = "_id"
            r2[r3] = r4     // Catch:{ Exception -> 0x01e2 }
            r3 = 1
            java.lang.String r4 = "text_data"
            r2[r3] = r4     // Catch:{ Exception -> 0x01e2 }
            r3 = 2
            java.lang.String r4 = "timestamp"
            r2[r3] = r4     // Catch:{ Exception -> 0x01e2 }
            r3 = 3
            java.lang.String r4 = "key_id"
            r2[r3] = r4     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = "chat_row_id=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x01e2 }
            r6 = 0
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x01e2 }
            r4[r6] = r5     // Catch:{ Exception -> 0x01e2 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01e2 }
        L_0x01d1:
            r2 = -1445256334(0xffffffffa9db2372, float:-9.7317025E-14)
            java.lang.String r1 = "ۥ۠۠ۤۜ۫ۜ۠ۨۘۥۗۜۙۜۤ۟ۗ۬"
        L_0x01d6:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -876894525: goto L_0x01df;
                case -318797945: goto L_0x00b7;
                case 1111648265: goto L_0x01e8;
                case 1762961953: goto L_0x01ed;
                default: goto L_0x01de;
            }
        L_0x01de:
            goto L_0x01d6
        L_0x01df:
            java.lang.String r1 = "ۦۢۘۘۖۜ۫۠ۖۦۘۛۢۛۡۢۚۤۢۨۡ۠ۦۘ۬ۚۘۘ"
            goto L_0x01d6
        L_0x01e2:
            r0 = move-exception
            r0 = r8
            goto L_0x01d1
        L_0x01e5:
            java.lang.String r1 = "۠ۘۘۘۢۤۢۤۖۙۙۦۦۘۦۘ۬ۛۙۤۗۧۖۥۗۜۘ۬ۥۘ"
            goto L_0x01d6
        L_0x01e8:
            if (r0 == 0) goto L_0x01e5
            java.lang.String r1 = "ۨۜۨۦۤۢۖۧۜۘۧۢۤۢۗۤۙۤ۟"
            goto L_0x01d6
        L_0x01ed:
            r2 = -1549428956(0xffffffffa3a59724, float:-1.7953346E-17)
            java.lang.String r1 = "ۛۦۜۚۡۤۖ۬۫۠ۦۗۛ۟ۜۘۖۡۜۘ۫ۧۘۘ"
        L_0x01f2:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x0242 }
            r3 = r3 ^ r2
            switch(r3) {
                case -2139872305: goto L_0x020f;
                case 305030767: goto L_0x01fb;
                case 1210037811: goto L_0x00b7;
                case 1464710605: goto L_0x0218;
                default: goto L_0x01fa;
            }     // Catch:{ Exception -> 0x0242 }
        L_0x01fa:
            goto L_0x01f2
        L_0x01fb:
            r2 = 2058626243(0x7ab424c3, float:4.6767953E35)
            java.lang.String r1 = "ۚۦۧۗۢۖۜۙۖۙۥۧۤۦۨۘۦۖۨۨۖۢۨ"
        L_0x0200:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x0242 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1912975185: goto L_0x0227;
                case -2219265: goto L_0x0209;
                case 211702658: goto L_0x0262;
                case 784676683: goto L_0x021e;
                default: goto L_0x0208;
            }     // Catch:{ Exception -> 0x0242 }
        L_0x0208:
            goto L_0x0200
        L_0x0209:
            java.lang.String r1 = "ۧۛۥۘۚ۟ۜۘۗۦۡۜ۫۟ۢۢۥۜۙۢ۬ۙۜۨۘ۬ۛۘۜۘ"
            goto L_0x0200
        L_0x020c:
            java.lang.String r1 = "ۖۚۧۛۘۥۘۜۡۥۘۜۡۗۙۧۥۖ۟ۘۘۚۧۧۢۨۨۘ"
            goto L_0x01f2
        L_0x020f:
            int r1 = r0.getCount()     // Catch:{ Exception -> 0x0242 }
            if (r1 <= 0) goto L_0x020c
            java.lang.String r1 = "۬ۨۜۘۗۚۨۘۜۚۛۦ۟ۡۘۦۜۢۜۘۦۘۖۧ"
            goto L_0x01f2
        L_0x0218:
            java.lang.String r1 = "ۙ۟ۦۘ۠۫ۖۥۙۘۢۖۜۗۚۤ۟ۘۚ۠ۜ۟ۘۤۛ۟ۧ"
            goto L_0x01f2
        L_0x021b:
            java.lang.String r1 = "ۥۢۖۘۥۛۜۘ۟ۖۡۘۧ۟ۜۘۗۦۨۘ۬ۛ"
            goto L_0x0200
        L_0x021e:
            int r1 = r0.getPosition()     // Catch:{ Exception -> 0x0242 }
            if (r1 != 0) goto L_0x021b
            java.lang.String r1 = "۠ۜۛۖۛ۠ۦۨۦۘ۠ۥۙۛۚۙۤۢ۟ۗۨ"
            goto L_0x0200
        L_0x0227:
            java.lang.String r1 = "_id"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x0242 }
            long r2 = r0.getLong(r1)     // Catch:{ Exception -> 0x0242 }
            r12.f780b = r2     // Catch:{ Exception -> 0x0242 }
            java.lang.String r1 = "key_id"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x0242 }
            java.lang.String r8 = r0.getString(r1)     // Catch:{ Exception -> 0x0242 }
        L_0x023d:
            r0.close()     // Catch:{ Exception -> 0x0242 }
            goto L_0x00b7
        L_0x0242:
            r0 = move-exception
            r1 = -1811408530(0xffffffff9408196e, float:-6.8712604E-27)
            java.lang.String r0 = "۟ۢۗۙۖۨۘۗۘۗۛۗۤۘۦۥۙۧۗ۟ۖ۬ۖ۬ۢۥۙ"
        L_0x0248:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case 542548443: goto L_0x0179;
                case 1191980747: goto L_0x028b;
                case 1564344382: goto L_0x0282;
                case 1891553621: goto L_0x0251;
                default: goto L_0x0250;
            }
        L_0x0250:
            goto L_0x0248
        L_0x0251:
            java.lang.Object r0 = r10.get()
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            com.obwhatsapp.yo.d0 r1 = new com.obwhatsapp.yo.d0
            r1.<init>(r11)
            r0.runOnUiThread(r1)
            r8 = r9
            goto L_0x00b7
        L_0x0262:
            r2 = -1706060800(0xffffffff9a4f9400, float:-4.292615E-23)
            java.lang.String r1 = "۫ۦۙۖۡۜۜۙۚۖۘۦۗۦۘ"
        L_0x0267:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x0242 }
            r3 = r3 ^ r2
            switch(r3) {
                case -2015908504: goto L_0x023d;
                case -916016721: goto L_0x0276;
                case -880480323: goto L_0x01fb;
                case -332737377: goto L_0x0270;
                default: goto L_0x026f;
            }     // Catch:{ Exception -> 0x0242 }
        L_0x026f:
            goto L_0x0267
        L_0x0270:
            java.lang.String r1 = "ۦۘۙۥ۬۫ۥۚۡۘ۠ۖۨ۬ۦۚۛۜۛۚۗۨ"
            goto L_0x0267
        L_0x0273:
            java.lang.String r1 = "ۨۘۢۡ۫ۜۚ۠ۡۘۧۙۨۢ۠ۛۢۖۥۘۤۦۡۘۜ۟ۤ"
            goto L_0x0267
        L_0x0276:
            boolean r1 = r0.moveToNext()     // Catch:{ Exception -> 0x0242 }
            if (r1 != 0) goto L_0x0273
            java.lang.String r1 = "۬ۘۜۦ۟ۨۤۢۙۙ۠ۨۛۤۢۥ۬ۨۘ۟۠ۢۢۛۨۘ"
            goto L_0x0267
        L_0x027f:
            java.lang.String r0 = "ۧۚ۟ۤۗۢۘۗۛۘۧۘ۠ۨۜۦۥۘ"
            goto L_0x0248
        L_0x0282:
            java.lang.Object r0 = r10.get()
            if (r0 == 0) goto L_0x027f
            java.lang.String r0 = "ۦ۬ۤۡۙۧۙۦۡۘۛۙۢ۫ۚۘۘۛۤ۬ۤۦۙۨۥۘۘۥۛ"
            goto L_0x0248
        L_0x028b:
            java.lang.String r0 = "ۜۢۘۘۡۦۦۘ۟ۚۘۘۘۤۘۘۧۡۥۜ۫ۘۘ۟ۦۘ"
            goto L_0x0248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.h1.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        r1 = "ۤ۟ۚۚۚۤۗۙۤۨۦۘ۟ۗۘۨۢۨۙۖۚۥۥۗۛۚۡ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPostExecute(java.lang.Object r9) {
        /*
            r8 = this;
            r3 = 0
            java.lang.String r0 = "ۡۜۗۘۖۥۘۢۨۥۦ۬ۦۨۥ۟"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
        L_0x0007:
            int r0 = r1.hashCode()
            r3 = 467(0x1d3, float:6.54E-43)
            r6 = 462607314(0x1b92d3d2, float:2.429056E-22)
            r0 = r0 ^ r3
            r0 = r0 ^ r6
            switch(r0) {
                case -1507805428: goto L_0x001e;
                case -1466343505: goto L_0x001a;
                case -1419699397: goto L_0x0065;
                case -1338703501: goto L_0x00c4;
                case -689391518: goto L_0x0092;
                case -385172343: goto L_0x00b9;
                case -69254763: goto L_0x00a1;
                case 33635371: goto L_0x00ad;
                case 506097461: goto L_0x0016;
                case 549837525: goto L_0x0025;
                case 844054652: goto L_0x00dc;
                case 1842783796: goto L_0x0042;
                case 1888447125: goto L_0x00ce;
                case 1951110572: goto L_0x006c;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۙۨۛۖۢۜۘۢۘۡۙۛۘۘۦ۫ۡۘ۠ۘۧ۫۟ۡ۟۫ۚۦۙۘۘ"
            r1 = r0
            goto L_0x0007
        L_0x001a:
            java.lang.String r0 = "ۚ۟ۤ۬ۘۚۗۛۥۘۙۗۙۗ۫ۛۖۖۧۖۢۡۖۡۘ"
            r1 = r0
            goto L_0x0007
        L_0x001e:
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "ۖۖ۫ۙ۬ۦۘۜۗۜۗ۬ۧۨ۟ۡۘۥۛۨۘۥ۬ۜۛۧۚۖۚۖۘ"
            r5 = r0
            goto L_0x0007
        L_0x0025:
            r1 = 883435738(0x34a828da, float:3.1322162E-7)
            java.lang.String r0 = "ۤۦۙۡۚۘ۟ۨۤۥۗۜۘۤۢۢۥۖ۠ۖۚۖۖۘۘ۬۫ۡ"
        L_0x002a:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -956068316: goto L_0x003e;
                case -243114584: goto L_0x0039;
                case 1058419631: goto L_0x007a;
                case 1299709174: goto L_0x0033;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x002a
        L_0x0033:
            java.lang.String r0 = "۫ۦۧۘ۫ۡۜۘۨۥ۟ۡۚۖۡۘۦۘۤۤۦ۬۫۟ۛۤۘۘۤۗۖ"
            goto L_0x002a
        L_0x0036:
            java.lang.String r0 = "ۛۦۜۥ۫ۧۧۙۗۚۜۗۖۡ۠"
            goto L_0x002a
        L_0x0039:
            if (r5 == 0) goto L_0x0036
            java.lang.String r0 = "ۚ۬۠ۘۢۡ۟ۗۖۥۨۗۙ۠ۨۘۡ۟ۡۘۨ۫ۚ"
            goto L_0x002a
        L_0x003e:
            java.lang.String r0 = "۬ۥۦ۬ۚۡۘۗۧۦۜۘۘۜۥۢ۟ۦۙۘۤۘۘ۟ۙ۬"
            r1 = r0
            goto L_0x0007
        L_0x0042:
            r1 = 1405458995(0x53c59a33, float:1.69739118E12)
            java.lang.String r0 = "ۚۙۢ۟۬ۜۘ۠۬ۥۘۢۜۤۥ۫ۨ"
        L_0x0047:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1901662580: goto L_0x0050;
                case -569698224: goto L_0x0057;
                case -556346616: goto L_0x007a;
                case 1630534338: goto L_0x0062;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0047
        L_0x0050:
            java.lang.String r0 = "ۨ۬۫ۜۙۤ۟۫۫ۧۘۜۘۖ۠ۘۘۜۢۖ"
            r1 = r0
            goto L_0x0007
        L_0x0054:
            java.lang.String r0 = "ۛۧۖ۟ۖۤۜۢۜۥ۟ۘۘۥۖۙ"
            goto L_0x0047
        L_0x0057:
            java.lang.String r0 = "notfound"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "ۗ۠ۜۘ۟ۨۧۨۧۤۜۧۜۘ۟۟ۨۙۘۥ"
            goto L_0x0047
        L_0x0062:
            java.lang.String r0 = "ۡ۬ۚۗۙۖۚۙ۫ۨۧ۠ۛۡۘۛ۬ۤۘۗۛ۫ۦۛ"
            goto L_0x0047
        L_0x0065:
            java.lang.ref.WeakReference r3 = r8.f779a
            java.lang.String r0 = "ۥۡۜۘ۠۬ۥۘۢۡۘ۬ۛۤۧۢۛۗۛۜۘ"
            r1 = r0
            r4 = r3
            goto L_0x0007
        L_0x006c:
            r1 = 594175181(0x236a64cd, float:1.2706511E-17)
            java.lang.String r0 = "ۚۘۦۘ۠ۖۛۨ۫ۗۡۘۧۘۘۘۚۡۧۥۖۧۛ۬ۘۘ"
        L_0x0071:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -703419625: goto L_0x008a;
                case -291751321: goto L_0x008d;
                case 831425112: goto L_0x007a;
                case 1420594915: goto L_0x0081;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x0071
        L_0x007a:
            java.lang.String r0 = "ۤ۟ۚۚۚۤۗۙۤۨۦۘ۟ۗۘۨۢۨۙۖۚۥۥۗۛۚۡ"
            r1 = r0
            goto L_0x0007
        L_0x007e:
            java.lang.String r0 = "ۡ۫ۚۥۖۘۢ۟ۚۤۨۦۘۗۥۘ۟ۗۗ۟ۥۥۥ۬"
            goto L_0x0071
        L_0x0081:
            java.lang.Object r0 = r4.get()
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "ۚۥۘۘۛ۟ۧۨۗۥۚۘۨۘۤۖۖۘۤۜۖۘ"
            goto L_0x0071
        L_0x008a:
            java.lang.String r0 = "۬ۦۥۜۦۦۤ۠ۥۢۜۛۙۖۧۘۖۖۥۘ"
            goto L_0x0071
        L_0x008d:
            java.lang.String r0 = "۫ۛۜۘۢۧۜۘۜ۠ۜۜۨۘ۟۬ۢۥۦۘ"
            r1 = r0
            goto L_0x0007
        L_0x0092:
            java.lang.Object r0 = r4.get()
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r0 = "ۧۘۦۖۜۙۜۖۖۡۢۘۤۘۤ۟ۢۥۥ۠ۨۦۘ"
            r1 = r0
            goto L_0x0007
        L_0x00a1:
            java.lang.String r0 = "row_id"
            long r6 = r8.f780b
            r2.putExtra(r0, r6)
            java.lang.String r0 = "ۗۤۦۛۚۡۘۡۗ۫۫۟ۡۛۨۘ۬ۛۥۘ۫ۡۘ۟ۘ۟"
            r1 = r0
            goto L_0x0007
        L_0x00ad:
            java.lang.String r0 = "sort_id"
            long r6 = r8.f780b
            r2.putExtra(r0, r6)
            java.lang.String r0 = "ۥ۫ۧۚۜۡۘۗۢۨۡ۟ۦ۠۟ۤ۬ۥۨ۬ۖۡ"
            r1 = r0
            goto L_0x0007
        L_0x00b9:
            java.lang.String r0 = "fMessageKeyFromMe"
            r1 = 0
            r2.putExtra(r0, r1)
            java.lang.String r0 = "ۜۜۚۥۖ۟ۛ۟ۢۧۦۘ۫۫ۨۘۙۜ۬ۡۜۖۘ۫ۛۤۦۢۛ"
            r1 = r0
            goto L_0x0007
        L_0x00c4:
            java.lang.String r0 = "fMessageKeyId"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "ۗۧۨۘۚۥۚۚ۬ۖۘ۬ۚۘۗۡۧۡ۠ۙ۬۬ۨۘ"
            r1 = r0
            goto L_0x0007
        L_0x00ce:
            java.lang.Object r0 = r4.get()
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            r0.startActivity(r2)
            java.lang.String r0 = "ۤ۟ۚۚۚۤۗۙۤۨۦۘ۟ۗۘۨۢۨۙۖۚۥۥۗۛۚۡ"
            r1 = r0
            goto L_0x0007
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.h1.onPostExecute(java.lang.Object):void");
    }

    public final void onPreExecute() {
        String str = "ۙۡۙۤۖۦۘۧ۟ۗۨ۬ۖۘ۫ۙۖۘۜۘۛ";
        while (true) {
            switch ((str.hashCode() ^ 549) ^ -596023378) {
                case -1243074515:
                    super.onPreExecute();
                    str = "ۖۦۥۢۜۜۘۛۚۘۢۢۘۘۨۗۡۛۥۜۘ";
                    break;
                case -1001451020:
                    str = "۫ۚۥۨۢۘۨۘ۫ۘۘۜ۫ۡۘۘۗۦۤۛۖۙۜۦۘ";
                    break;
                case 859370753:
                    return;
            }
        }
    }
}
