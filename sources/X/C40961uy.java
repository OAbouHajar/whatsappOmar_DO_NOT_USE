package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1uy  reason: invalid class name and case insensitive filesystem */
public class C40961uy {
    public final int A00;
    public final int A01;
    public final AnonymousClass11D A02;
    public final List A03;

    public C40961uy(AnonymousClass11D r3, int i2, int i3) {
        this.A02 = r3;
        this.A01 = i2;
        this.A00 = i3;
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        arrayList.add("call_log");
        arrayList.add("labeled_jid");
        arrayList.add("message_fts");
        arrayList.add("blank_me_jid");
        arrayList.add("message_link");
        arrayList.add("message_main");
        arrayList.add("message_text");
        arrayList.add("missed_calls");
        arrayList.add("receipt_user");
        arrayList.add("message_media");
        arrayList.add("message_vcard");
        arrayList.add("message_future");
        arrayList.add("message_quoted");
        arrayList.add("message_system");
        arrayList.add("receipt_device");
        arrayList.add("message_mention");
        arrayList.add("message_revoked");
        arrayList.add("broadcast_me_jid");
        arrayList.add("message_frequent");
        arrayList.add("message_location");
        arrayList.add("participant_user");
        arrayList.add("message_thumbnail");
        arrayList.add("message_send_count");
        arrayList.add("migration_jid_store");
        arrayList.add("payment_transaction");
        arrayList.add("migration_chat_store");
        arrayList.add("quoted_order_message");
        arrayList.add("media_migration_fixer");
        arrayList.add("quoted_order_message_v2");
        arrayList.add("message_main_verification");
        arrayList.add("quoted_ui_elements_reply_message");
        arrayList.add("alter_message_ephemeral_to_message_ephemeral_remove_column");
        arrayList.add("alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column");
    }

    public static final boolean A00(AnonymousClass11D r0, String str) {
        C30111bl r02 = (C30111bl) r0.A00().get(str);
        return r02 != null && r02.A04() == 1;
    }

    public final int A01(Map map) {
        boolean z2;
        Iterator it = map.values().iterator();
        loop0:
        while (true) {
            z2 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Boolean bool = (Boolean) it.next();
                if (!z2 || !bool.booleanValue()) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            return 1;
        }
        return this.A00;
    }

    public final Map A02() {
        HashMap hashMap = new HashMap();
        AnonymousClass11D r3 = this.A02;
        hashMap.put("call_log", Boolean.valueOf(A00(r3, "call_log")));
        hashMap.put("labeled_jid", Boolean.valueOf(A00(r3, "labeled_jid")));
        hashMap.put("message_fts", Boolean.valueOf(A00(r3, "message_fts")));
        hashMap.put("blank_me_jid", Boolean.valueOf(A00(r3, "blank_me_jid")));
        hashMap.put("message_link", Boolean.valueOf(A00(r3, "message_link")));
        hashMap.put("message_main", Boolean.valueOf(A00(r3, "message_main")));
        hashMap.put("message_text", Boolean.valueOf(A00(r3, "message_text")));
        hashMap.put("missed_calls", Boolean.valueOf(A00(r3, "missed_calls")));
        hashMap.put("receipt_user", Boolean.valueOf(A00(r3, "receipt_user")));
        hashMap.put("message_media", Boolean.valueOf(A00(r3, "message_media")));
        hashMap.put("message_vcard", Boolean.valueOf(A00(r3, "message_vcard")));
        hashMap.put("message_future", Boolean.valueOf(A00(r3, "message_future")));
        hashMap.put("message_quoted", Boolean.valueOf(A00(r3, "message_quoted")));
        hashMap.put("message_system", Boolean.valueOf(A00(r3, "message_system")));
        hashMap.put("receipt_device", Boolean.valueOf(A00(r3, "receipt_device")));
        hashMap.put("message_mention", Boolean.valueOf(A00(r3, "message_mention")));
        hashMap.put("message_revoked", Boolean.valueOf(A00(r3, "message_revoked")));
        hashMap.put("broadcast_me_jid", Boolean.valueOf(A00(r3, "broadcast_me_jid")));
        hashMap.put("message_frequent", Boolean.valueOf(A00(r3, "message_frequent")));
        hashMap.put("message_location", Boolean.valueOf(A00(r3, "message_location")));
        hashMap.put("participant_user", Boolean.valueOf(A00(r3, "participant_user")));
        hashMap.put("message_thumbnail", Boolean.valueOf(A00(r3, "message_thumbnail")));
        hashMap.put("message_send_count", Boolean.valueOf(A00(r3, "message_send_count")));
        hashMap.put("migration_jid_store", Boolean.valueOf(A00(r3, "migration_jid_store")));
        hashMap.put("payment_transaction", Boolean.valueOf(A00(r3, "payment_transaction")));
        hashMap.put("migration_chat_store", Boolean.valueOf(A00(r3, "migration_chat_store")));
        hashMap.put("quoted_order_message", Boolean.valueOf(A00(r3, "quoted_order_message")));
        hashMap.put("media_migration_fixer", Boolean.valueOf(A00(r3, "media_migration_fixer")));
        hashMap.put("quoted_order_message_v2", Boolean.valueOf(A00(r3, "quoted_order_message_v2")));
        hashMap.put("message_main_verification", Boolean.valueOf(A00(r3, "message_main_verification")));
        hashMap.put("quoted_ui_elements_reply_message", Boolean.valueOf(A00(r3, "quoted_ui_elements_reply_message")));
        Boolean bool = Boolean.TRUE;
        hashMap.put("alter_message_ephemeral_to_message_ephemeral_remove_column", bool);
        hashMap.put("alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column", bool);
        return hashMap;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ed A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(java.io.File r7) {
        /*
            r6 = this;
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0030 }
            r3.<init>(r7)     // Catch:{ IOException -> 0x0030 }
            X.2GB r0 = X.AnonymousClass2GB.A05     // Catch:{ all -> 0x002b }
            X.1Wm r2 = X.C28541Wm.A0D(r0, r3)     // Catch:{ all -> 0x002b }
            X.2GB r2 = (X.AnonymousClass2GB) r2     // Catch:{ all -> 0x002b }
            int r0 = r2.A00     // Catch:{ all -> 0x002b }
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x001c
            X.2G7 r4 = r2.A02     // Catch:{ all -> 0x002b }
            if (r4 != 0) goto L_0x001d
            X.2G7 r4 = X.AnonymousClass2G7.A0f     // Catch:{ all -> 0x002b }
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            r3.close()     // Catch:{ IOException -> 0x0030 }
            if (r4 == 0) goto L_0x0037
            int r0 = r4.A01
            r0 = r0 & 8
            if (r0 != r1) goto L_0x0037
            int r3 = r4.A00
            goto L_0x0038
        L_0x002b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002f }
        L_0x002f:
            throw r0     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "readProtobufBackupMetadata/failed"
            com.whatsapp.util.Log.w(r0, r1)
            r4 = 0
        L_0x0037:
            r3 = 0
        L_0x0038:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.List r0 = r6.A03
            java.util.Iterator r5 = r0.iterator()
        L_0x0043:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r4 == 0) goto L_0x0058
            int r0 = r1.hashCode()
            switch(r0) {
                case -1879012827: goto L_0x01d6;
                case -1696390154: goto L_0x01ca;
                case -1617991306: goto L_0x01be;
                case -1372203662: goto L_0x01b2;
                case -1286318798: goto L_0x01a6;
                case -1286296847: goto L_0x019a;
                case -1286083995: goto L_0x018e;
                case -1220382292: goto L_0x0182;
                case -1212132786: goto L_0x0176;
                case -1003755283: goto L_0x016a;
                case -872783571: goto L_0x015e;
                case -738045655: goto L_0x0152;
                case -631883203: goto L_0x0146;
                case -537381604: goto L_0x013a;
                case -266421354: goto L_0x012e;
                case -251736654: goto L_0x0122;
                case -228245188: goto L_0x0116;
                case -172298781: goto L_0x010a;
                case -136111098: goto L_0x00fe;
                case -101944730: goto L_0x00f2;
                case -38832335: goto L_0x00e6;
                case 320355671: goto L_0x00da;
                case 491179391: goto L_0x00cf;
                case 562095961: goto L_0x00c4;
                case 637715707: goto L_0x00b9;
                case 952486048: goto L_0x00ae;
                case 1013557607: goto L_0x00a3;
                case 1029740752: goto L_0x0098;
                case 1395058782: goto L_0x008d;
                case 1476079284: goto L_0x0082;
                case 1580832246: goto L_0x0077;
                case 1761584297: goto L_0x006c;
                case 2085446219: goto L_0x0061;
                default: goto L_0x0058;
            }
        L_0x0058:
            r0 = 0
        L_0x0059:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r1, r0)
            goto L_0x0043
        L_0x0061:
            java.lang.String r0 = "migration_chat_store"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0V
            goto L_0x0059
        L_0x006c:
            java.lang.String r0 = "message_main_verification"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0L
            goto L_0x0059
        L_0x0077:
            java.lang.String r0 = "alter_message_ephemeral_to_message_ephemeral_remove_column"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A08
            goto L_0x0059
        L_0x0082:
            java.lang.String r0 = "message_thumbnail"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0T
            goto L_0x0059
        L_0x008d:
            java.lang.String r0 = "quoted_ui_elements_reply_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0c
            goto L_0x0059
        L_0x0098:
            java.lang.String r0 = "message_send_count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0Q
            goto L_0x0059
        L_0x00a3:
            java.lang.String r0 = "message_system"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0R
            goto L_0x0059
        L_0x00ae:
            java.lang.String r0 = "message_quoted"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0O
            goto L_0x0059
        L_0x00b9:
            java.lang.String r0 = "message_future"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0H
            goto L_0x0059
        L_0x00c4:
            java.lang.String r0 = "labeled_jid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0D
            goto L_0x0059
        L_0x00cf:
            java.lang.String r0 = "quoted_order_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0a
            goto L_0x0059
        L_0x00da:
            java.lang.String r0 = "participant_user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0Y
            goto L_0x0059
        L_0x00e6:
            java.lang.String r0 = "missed_calls"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0X
            goto L_0x0059
        L_0x00f2:
            java.lang.String r0 = "message_revoked"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0P
            goto L_0x0059
        L_0x00fe:
            java.lang.String r0 = "message_frequent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0F
            goto L_0x0059
        L_0x010a:
            java.lang.String r0 = "call_log"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0B
            goto L_0x0059
        L_0x0116:
            java.lang.String r0 = "quoted_order_message_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0b
            goto L_0x0059
        L_0x0122:
            java.lang.String r0 = "message_mention"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0N
            goto L_0x0059
        L_0x012e:
            java.lang.String r0 = "alter_message_ephemeral_setting_to_message_ephemeral_setting_remove_column"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A07
            goto L_0x0059
        L_0x013a:
            java.lang.String r0 = "broadcast_me_jid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0A
            goto L_0x0059
        L_0x0146:
            java.lang.String r0 = "receipt_device"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0d
            goto L_0x0059
        L_0x0152:
            java.lang.String r0 = "blank_me_jid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A09
            goto L_0x0059
        L_0x015e:
            java.lang.String r0 = "message_fts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0G
            goto L_0x0059
        L_0x016a:
            java.lang.String r0 = "message_location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0J
            goto L_0x0059
        L_0x0176:
            java.lang.String r0 = "message_vcard"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0U
            goto L_0x0059
        L_0x0182:
            java.lang.String r0 = "message_media"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0M
            goto L_0x0059
        L_0x018e:
            java.lang.String r0 = "message_text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0S
            goto L_0x0059
        L_0x019a:
            java.lang.String r0 = "message_main"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0K
            goto L_0x0059
        L_0x01a6:
            java.lang.String r0 = "message_link"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0I
            goto L_0x0059
        L_0x01b2:
            java.lang.String r0 = "receipt_user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0e
            goto L_0x0059
        L_0x01be:
            java.lang.String r0 = "media_migration_fixer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0E
            goto L_0x0059
        L_0x01ca:
            java.lang.String r0 = "migration_jid_store"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0W
            goto L_0x0059
        L_0x01d6:
            java.lang.String r0 = "payment_transaction"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4.A0Z
            goto L_0x0059
        L_0x01e2:
            int r0 = r6.A01
            if (r3 >= r0) goto L_0x01ed
            java.lang.String r0 = "BackupExpiryManager/backup expired based on version"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x01ed:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40961uy.A03(java.io.File):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(org.json.JSONObject r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0015
            java.lang.String r1 = "backup_version"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x0015
            int r5 = r7.getInt(r1)     // Catch:{ JSONException -> 0x000f }
            goto L_0x0016
        L_0x000f:
            r1 = move-exception
            java.lang.String r0 = "BackupExpiryManager/getBackupVersion/failed to parse version from json"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0015:
            r5 = 0
        L_0x0016:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.List r0 = r6.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x0021:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r7 == 0) goto L_0x003c
            boolean r0 = r7.has(r2)     // Catch:{ JSONException -> 0x003c }
            if (r0 == 0) goto L_0x003c
            boolean r1 = r7.getBoolean(r2)     // Catch:{ JSONException -> 0x003c }
            r0 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.put(r2, r0)
            goto L_0x0021
        L_0x0045:
            int r0 = r6.A01
            if (r5 >= r0) goto L_0x0050
            java.lang.String r0 = "BackupExpiryManager/backup expired based on version"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x0050:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40961uy.A04(org.json.JSONObject):boolean");
    }
}
