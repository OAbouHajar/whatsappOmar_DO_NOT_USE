package X;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1bl  reason: invalid class name and case insensitive filesystem */
public abstract class C30111bl {
    public final int A00;
    public final C16300so A01;
    public final C15900s5 A02;
    public final C14730pf A03;
    public final C18590ww A04;
    public final C16900tq A05;
    public final AnonymousClass11I A06;
    public final C24781Hg A07;
    public final C24811Hj A08;
    public final AnonymousClass11D A09;
    public final C24771Hf A0A;
    public final C16490t9 A0B;
    public final String A0C;

    public C30111bl(C24821Hk r2, String str, int i2) {
        this.A0C = str;
        this.A00 = i2;
        this.A01 = r2.A00;
        this.A0B = r2.A0E;
        this.A02 = r2.A01;
        this.A03 = r2.A04;
        this.A09 = r2.A0C;
        this.A06 = r2.A08;
        this.A0A = r2.A0D;
        this.A05 = r2.A07;
        this.A08 = r2.A0B;
        this.A07 = r2.A09;
        this.A04 = r2.A06;
    }

    public static final int A00(C30101bk r2) {
        for (C30091bj r1 : r2.A00) {
            if (!r1.isValid()) {
                Integer A7v = r1.A7v();
                if (A7v != null) {
                    return A7v.intValue();
                }
                return 0;
            }
        }
        return 0;
    }

    public static void A01(C16300so r3, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("migration-failed-");
        sb.append(str2);
        sb.append("-");
        sb.append(str);
        String obj = sb.toString();
        Log.e(obj, th);
        r3.AcB(obj, th.toString(), true);
    }

    public int A02() {
        if (this instanceof C46492Em) {
            return 0;
        }
        if (this instanceof AnonymousClass2EY) {
            return 200;
        }
        if ((this instanceof C46422Ef) || (this instanceof C46502En) || (this instanceof C46432Eg)) {
            return 0;
        }
        if (this instanceof AnonymousClass2EZ) {
            return 200;
        }
        if (this instanceof C46442Eh) {
            return 10;
        }
        if (this instanceof AnonymousClass2EO) {
            return 256;
        }
        if (this instanceof C46402Ed) {
            return 128;
        }
        if (this instanceof AnonymousClass2EN) {
            return 2048;
        }
        if (this instanceof AnonymousClass2ET) {
            return 32;
        }
        if (this instanceof C46392Ec) {
            return 1024;
        }
        if (this instanceof AnonymousClass2EV) {
            return 2048;
        }
        if (this instanceof AnonymousClass2EM) {
            return 25;
        }
        if (this instanceof AnonymousClass2ER) {
            return 32;
        }
        if (this instanceof C46412Ee) {
            return 2048;
        }
        if ((this instanceof C46472Ek) || (this instanceof C46462Ej)) {
            return 512;
        }
        if (this instanceof AnonymousClass2EQ) {
            return 25;
        }
        if (this instanceof AnonymousClass2ES) {
            return 10;
        }
        if (this instanceof AnonymousClass2EU) {
            return 2048;
        }
        if (this instanceof C46372Ea) {
            return ((C46372Ea) this) instanceof C46382Eb ? 256 : 2048;
        }
        if ((this instanceof AnonymousClass2EL) || (this instanceof AnonymousClass2EX) || (this instanceof AnonymousClass2EK)) {
            return 2048;
        }
        if (this instanceof AnonymousClass2EH) {
            return 1024;
        }
        if (this instanceof C46482El) {
            return 512;
        }
        if (this instanceof AnonymousClass2EP) {
            return 128;
        }
        if (!(this instanceof AnonymousClass2EJ)) {
            return this instanceof AnonymousClass2EW ? 1024 : 0;
        }
        return 32;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03() {
        /*
            r6 = this;
            boolean r0 = r6.A0M()
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6.A0N()
            if (r0 != 0) goto L_0x0026
            r5 = r6
            boolean r0 = r6 instanceof X.C46492Em
            if (r0 == 0) goto L_0x0028
            X.2Em r5 = (X.C46492Em) r5
            X.0pd r2 = r5.A00
            r1 = 626(0x272, float:8.77E-43)
        L_0x0017:
            X.0tM r0 = X.C16620tM.A02
            java.lang.String r1 = r2.A06(r0, r1)
            java.lang.String r0 = "migrate"
            boolean r0 = r0.equals(r1)
        L_0x0023:
            r1 = 2
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r1 = 3
        L_0x0027:
            return r1
        L_0x0028:
            boolean r0 = r6 instanceof X.AnonymousClass2EY
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6 instanceof X.C46422Ef
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6 instanceof X.C46502En
            if (r0 == 0) goto L_0x003b
            X.2En r5 = (X.C46502En) r5
            X.0pd r2 = r5.A00
            r1 = 627(0x273, float:8.79E-43)
            goto L_0x0017
        L_0x003b:
            boolean r0 = r6 instanceof X.C46432Eg
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6 instanceof X.AnonymousClass2EZ
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6 instanceof X.C46442Eh
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6 instanceof X.AnonymousClass2EM
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6 instanceof X.C46472Ek
            if (r0 == 0) goto L_0x005c
            X.2Ek r5 = (X.C46472Ek) r5
            X.0pd r2 = r5.A00
            r1 = 438(0x1b6, float:6.14E-43)
        L_0x0055:
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            goto L_0x0023
        L_0x005c:
            boolean r0 = r6 instanceof X.C46462Ej
            if (r0 == 0) goto L_0x0083
            X.2Ej r5 = (X.C46462Ej) r5
            X.11I r3 = r5.A06
            java.lang.String r2 = r5.A0E()
            r0 = -1
            long r3 = r3.A01(r2, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0081
            X.0pd r2 = r5.A00
            r1 = 438(0x1b6, float:6.14E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r1 = 3
            if (r0 != 0) goto L_0x0027
        L_0x0081:
            r1 = 2
            return r1
        L_0x0083:
            boolean r0 = r6 instanceof X.AnonymousClass2ES
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6 instanceof X.C46372Ea
            if (r0 == 0) goto L_0x009a
            X.2Ea r5 = (X.C46372Ea) r5
            boolean r0 = r5 instanceof X.C46382Eb
            if (r0 == 0) goto L_0x0026
            X.1Hf r1 = r5.A0A
            java.lang.String r0 = r5.A0C
        L_0x0095:
            int r1 = r1.A01(r0)
            return r1
        L_0x009a:
            boolean r0 = r6 instanceof X.C46482El
            if (r0 == 0) goto L_0x00a5
            X.2El r5 = (X.C46482El) r5
            X.0pd r2 = r5.A00
            r1 = 473(0x1d9, float:6.63E-43)
            goto L_0x0055
        L_0x00a5:
            boolean r0 = r6 instanceof X.AnonymousClass2EJ
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6 instanceof X.C46452Ei
            if (r0 != 0) goto L_0x0026
            X.1Hf r1 = r6.A0A
            java.lang.String r0 = r6.A0C
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30111bl.A03():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A04() {
        /*
            r6 = this;
            boolean r0 = r6.A0O()
            if (r0 == 0) goto L_0x0011
            boolean r1 = r6.A0Q()
            r0 = 11
            if (r1 != 0) goto L_0x0010
            r0 = 13
        L_0x0010:
            return r0
        L_0x0011:
            int r0 = r6.A03()
            r3 = 4
            r2 = 2
            r1 = 1
            if (r0 != r2) goto L_0x0028
            boolean r0 = r6.A0L()
            if (r0 != 0) goto L_0x007d
            boolean r0 = r6.A0K()
            if (r0 == 0) goto L_0x0092
            r0 = 0
            return r0
        L_0x0028:
            int r0 = r6.A03()
            r5 = 3
            if (r0 != r5) goto L_0x007e
            boolean r0 = r6.A0L()
            if (r0 != 0) goto L_0x007d
            boolean r0 = r6.A0P()
            if (r0 == 0) goto L_0x003c
            return r2
        L_0x003c:
            boolean r0 = r6.A0Q()
            if (r0 != 0) goto L_0x0045
            r0 = 12
            return r0
        L_0x0045:
            boolean r0 = r6.A0J()
            if (r0 == 0) goto L_0x007a
            boolean r0 = r6.A0K()
            if (r0 != 0) goto L_0x006b
            long r3 = r6.A05()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            X.0ww r0 = r6.A04
            java.lang.Long r0 = r0.A00()
            if (r0 == 0) goto L_0x006b
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x007a
        L_0x006b:
            boolean r0 = r6.A0R()
            if (r0 == 0) goto L_0x007a
            boolean r0 = r6.A0K()
            if (r0 == 0) goto L_0x0078
            return r5
        L_0x0078:
            r0 = 5
            return r0
        L_0x007a:
            r0 = 10
            return r0
        L_0x007d:
            return r1
        L_0x007e:
            int r0 = r6.A03()
            if (r0 != r1) goto L_0x0093
            boolean r0 = r6.A0L()
            if (r0 != 0) goto L_0x0090
            boolean r0 = r6.A0K()
            if (r0 == 0) goto L_0x0092
        L_0x0090:
            r0 = 7
            return r0
        L_0x0092:
            return r3
        L_0x0093:
            r0 = 9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30111bl.A04():int");
    }

    public long A05() {
        if ((this instanceof C46492Em) || (this instanceof C46502En) || (this instanceof AnonymousClass2EO) || (this instanceof C46402Ed) || (this instanceof AnonymousClass2EN) || (this instanceof AnonymousClass2ET) || (this instanceof C46392Ec) || (this instanceof AnonymousClass2EV) || (this instanceof AnonymousClass2ER) || (this instanceof C46412Ee) || (this instanceof AnonymousClass2EQ) || (this instanceof AnonymousClass2EU) || (this instanceof AnonymousClass2EL) || (this instanceof AnonymousClass2EX) || (this instanceof AnonymousClass2EK) || (this instanceof AnonymousClass2EH) || (this instanceof AnonymousClass2EP) || (this instanceof AnonymousClass2EW)) {
            return (long) this.A0A.A00.A03(C16620tM.A02, 261);
        }
        return 0;
    }

    public long A06() {
        C24771Hf r0 = this.A0A;
        String str = this.A0C;
        String trim = r0.A00.A06(C16620tM.A02, 402).toLowerCase(Locale.US).trim();
        if (TextUtils.isEmpty(trim)) {
            return 0;
        }
        for (String trim2 : trim.split(";")) {
            String trim3 = trim2.trim();
            if (trim3.startsWith(str)) {
                String[] split = trim3.split(":");
                if (split.length == 2) {
                    String str2 = split[0];
                    long A012 = C29501aj.A01(split[1], -1);
                    if (str.equals(str2) && A012 >= 0) {
                        if (A012 != -1) {
                            return A012;
                        }
                        return 10485760;
                    }
                } else {
                    continue;
                }
            }
        }
        return 10485760;
    }

    public long A07() {
        long j2 = this instanceof C46372Ea ? 1 : 0;
        AnonymousClass11I r5 = this.A06;
        if (j2 == r5.A01(A0D(), 0)) {
            return r5.A01(A0C(), 0);
        }
        return 0;
    }

    public Cursor A08(C16800tf r6, int i2, long j2) {
        String str;
        C16810tg r1 = r6.A02;
        if (!(this instanceof C46492Em)) {
            if (this instanceof AnonymousClass2EY) {
                str = "SELECT _id, gjid, jid, admin, pending, sent_sender_key FROM group_participants WHERE _id > ?  ORDER BY _id ASC LIMIT ?";
            } else if (!(this instanceof C46422Ef) && !(this instanceof C46502En) && !(this instanceof C46432Eg)) {
                if (this instanceof AnonymousClass2EZ) {
                    str = "SELECT group_participant_user._id, group_jid_row_id FROM group_participant_user LEFT JOIN jid ON group_jid_row_id = jid._id WHERE group_participant_user._id > ?  AND type = 3 GROUP BY group_jid_row_id ORDER BY group_participant_user._id LIMIT ? ";
                } else if (this instanceof C46442Eh) {
                    str = "SELECT _id, raw_string, type FROM jid WHERE _id > ?  ORDER BY _id ASC LIMIT ? ";
                } else if (this instanceof AnonymousClass2EO) {
                    str = "SELECT _id, media_wa_type, data, raw_data FROM messages WHERE _id > ?  AND media_wa_type IN (4, 14) ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof C46402Ed) {
                    str = "SELECT messages._id, message_thumbnails.thumbnail, message_thumbnails.key_remote_jid, message_thumbnails.key_from_me, message_thumbnails.key_id  FROM messages, message_thumbnails  WHERE messages._id > ? AND message_thumbnails.key_remote_jid = messages.key_remote_jid AND message_thumbnails.key_from_me = messages.key_from_me AND message_thumbnails.key_id = messages.key_id ORDER BY messages._id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2EN) {
                    str = "SELECT _id, key_remote_jid, key_from_me, key_id, media_name, media_caption, media_url, thumb_image, preview_type, status, media_duration  FROM messages WHERE _id > ? AND media_wa_type IN (0, 27) ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2ET) {
                    str = C49532Tn.A04;
                } else if (this instanceof C46392Ec) {
                    str = "SELECT _id, send_count FROM messages WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2EV) {
                    str = "SELECT _id, media_name, media_caption FROM messages WHERE _id > ? AND media_wa_type IN (15,64) ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2EM) {
                    str = "SELECT _id, key_id, key_remote_jid, key_from_me, remote_resource, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM messages WHERE _id > ?  AND (status IS NULL OR status!=6) ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2ER) {
                    str = C49532Tn.A03;
                } else if (this instanceof C46412Ee) {
                    str = "SELECT pay_transactions.rowid AS _id, pay_transactions.key_remote_jid, (CASE WHEN pay_transactions.key_remote_jid IS NOT NULL THEN pay_transactions.key_id else NULL END) AS key_id,messages.rowid AS message_row_id, (CASE WHEN pay_transactions.key_remote_jid IS NULL THEN pay_transactions.key_id else NULL END) AS interop_id, id, pay_transactions.timestamp AS timestamp, pay_transactions.status AS status,error_code, sender, receiver, type, currency, amount_1000, credential_id, methods, bank_transaction_id, metadata, init_timestamp, request_key_id, country, version, future_data, service_id, background_id, purchase_initiator FROM pay_transactions LEFT JOIN messages ON pay_transactions.key_id = messages.key_id WHERE pay_transactions.rowid>? LIMIT ?";
                } else if (this instanceof C46472Ek) {
                    str = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code,total_amount_1000 FROM message_quoted_order WHERE message_row_id > ? ORDER BY message_row_id LIMIT ?";
                } else if (this instanceof C46462Ej) {
                    str = "SELECT messages._id AS _id, quoted_message_order.order_id AS order_id, quoted_message_order.thumbnail AS thumbnail, quoted_message_order.order_title AS order_title, quoted_message_order.item_count AS item_count, quoted_message_order.status AS status, quoted_message_order.surface AS surface, quoted_message_order.message AS message, quoted_message_order.seller_jid AS seller_jid, quoted_message_order.token AS token, quoted_message_order.currency_code AS currency_code, quoted_message_order.total_amount_1000 AS total_amount_1000 FROM (SELECT messages._id, messages.quoted_row_id FROM messages WHERE messages.quoted_row_id != 0 AND messages.media_wa_type = 0 AND messages.timestamp > 1598925600000) messages INNER JOIN (SELECT messages_quotes._id FROM messages_quotes WHERE messages_quotes.media_wa_type = 44) messages_quotes ON messages_quotes._id = messages.quoted_row_id INNER JOIN quoted_message_order ON quoted_message_order.message_row_id = messages.quoted_row_id WHERE messages._id > ? ORDER BY messages._id LIMIT ?";
                } else if (this instanceof AnonymousClass2EQ) {
                    str = C49532Tn.A02;
                } else if (this instanceof AnonymousClass2ES) {
                    str = "SELECT _id, key_remote_jid, key_from_me, key_id, remote_resource, status, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, participant_hash FROM messages WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2EU) {
                    str = "SELECT _id, mentioned_jids FROM messages WHERE _id > ?  ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof C46372Ea) {
                    str = "SELECT _id, thumb_image, media_wa_type, key_remote_jid, multicast_id, media_url, media_mime_type, media_size, media_name, media_hash, media_duration, media_enc_hash, timestamp  FROM messages WHERE _id > ?  ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2EL) {
                    str = C49532Tn.A01;
                } else if (this instanceof AnonymousClass2EX) {
                    str = "SELECT _id, key_remote_jid, media_wa_type, media_name, media_url, media_duration, media_size, latitude, longitude, thumb_image  FROM messages WHERE _id > ? AND media_wa_type IN (16, 5, 30) ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2EK) {
                    str = "SELECT _id, chat_row_id, data, media_caption, message_type FROM available_message_view WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2EH) {
                    str = "SELECT _id, label_id, jid FROM labeled_jids WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof C46482El) {
                    str = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id > ? ORDER BY message_row_id LIMIT ?";
                } else if (this instanceof AnonymousClass2EP) {
                    str = "SELECT _id, media_duration, raw_data, future_message_type  FROM messages WHERE _id > ?   AND media_wa_type IN (12) ORDER BY _id ASC LIMIT ?";
                } else if (this instanceof AnonymousClass2EJ) {
                    str = C49532Tn.A00;
                } else if (this instanceof AnonymousClass2EW) {
                    str = "SELECT _id, jid, type, message_count FROM frequents WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            String[] strArr = {String.valueOf(j2), String.valueOf(i2)};
            StringBuilder sb = new StringBuilder("MIGRATION_GET_QUERY_FOR_");
            sb.append(this.A0C);
            sb.toString();
            return r1.A08(str, strArr);
        }
        str = "";
        String[] strArr2 = {String.valueOf(j2), String.valueOf(i2)};
        StringBuilder sb2 = new StringBuilder("MIGRATION_GET_QUERY_FOR_");
        sb2.append(this.A0C);
        sb2.toString();
        return r1.A08(str, strArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:407:0x09a1, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing information, skipping; rowId=");
        r5.append(r3);
        com.whatsapp.util.Log.e(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0ce4, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0ce5, code lost:
        r2 = new java.lang.StringBuilder("MissedCallsLogDatabaseMigration/processBatch/failed to read message with id = ");
        r2.append(r3);
        com.whatsapp.util.Log.e(r2.toString(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0cf7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0cf8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0d76, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0d7a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0de9, code lost:
        if (r16 != false) goto L_0x0deb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0eed, code lost:
        if (r8.A02.A00("message", r10, "_id = ?", new java.lang.String[]{java.lang.String.valueOf(r6.A13)}) == 0) goto L_0x0eef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0eef, code lost:
        r10 = new android.content.ContentValues();
        r7.A03(r10, r6);
        r8.A02.A03(r10, "message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0efe, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0f02, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0f03, code lost:
        if (r3 != null) goto L_0x0f05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0fb9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0fbd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x114c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x1151, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x1155, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x11cc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:159:0x041d, B:568:0x0dd2, B:592:0x0f08] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:222:0x0552, B:518:0x0cbf] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:301:0x070e, B:656:0x1068, B:723:0x1150] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:488:0x0b87, B:644:0x1012] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:71:0x021e, B:350:0x08a2] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x02ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:207:0x0515 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:243:0x05cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:460:0x0b60 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:469:0x0b6c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:474:0x0b71 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:485:0x0b85 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:506:0x0c9e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:592:0x0f08 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:699:0x112b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:708:0x1137 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:713:0x113c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:723:0x1150 */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05f1 A[Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0603 A[Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }] */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0cf7 A[ExcHandler: SQLException (r0v12 'e' android.database.SQLException A[CUSTOM_DECLARE]), Splitter:B:222:0x0552] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:273:0x0654=Splitter:B:273:0x0654, B:558:0x0d94=Splitter:B:558:0x0d94, B:597:0x0f34=Splitter:B:597:0x0f34, B:574:0x0de6=Splitter:B:574:0x0de6, B:592:0x0f08=Splitter:B:592:0x0f08, B:211:0x051a=Splitter:B:211:0x051a, B:159:0x041d=Splitter:B:159:0x041d} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:282:0x06a7=Splitter:B:282:0x06a7, B:336:0x0848=Splitter:B:336:0x0848, B:78:0x024a=Splitter:B:78:0x024a, B:536:0x0d1b=Splitter:B:536:0x0d1b, B:114:0x02ee=Splitter:B:114:0x02ee} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C49522Tm A09(android.database.Cursor r42) {
        /*
            r41 = this;
            r1 = r41
            boolean r0 = r1 instanceof X.C46492Em
            if (r0 != 0) goto L_0x12e2
            boolean r2 = r1 instanceof X.AnonymousClass2EY
            r0 = r42
            if (r2 == 0) goto L_0x00f6
            X.2EY r1 = (X.AnonymousClass2EY) r1
            java.lang.String r2 = "_id"
            int r15 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "gjid"
            int r14 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "jid"
            int r13 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "admin"
            int r11 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "pending"
            int r10 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "sent_sender_key"
            int r9 = r0.getColumnIndexOrThrow(r2)
            r2 = -1
            r4 = 0
        L_0x0036:
            boolean r5 = r0.moveToNext()
            if (r5 == 0) goto L_0x0b7b
            long r2 = r0.getLong(r15)
            int r4 = r4 + 1
            int r18 = r0.getInt(r11)
            int r5 = r0.getInt(r10)
            r19 = 0
            if (r5 == 0) goto L_0x0050
            r19 = 1
        L_0x0050:
            int r5 = r0.getInt(r9)
            r20 = 0
            if (r5 == 0) goto L_0x005a
            r20 = 1
        L_0x005a:
            java.lang.String r12 = X.C33931jQ.A02(r0, r14)
            boolean r5 = android.text.TextUtils.isEmpty(r12)
            r8 = 0
            if (r5 != 0) goto L_0x0077
            com.whatsapp.jid.Jid r6 = com.whatsapp.jid.Jid.get(r12)     // Catch:{ 1W4 -> 0x0077 }
            boolean r5 = r6 instanceof X.C16060sN     // Catch:{ 1W4 -> 0x0077 }
            if (r5 == 0) goto L_0x0071
            X.0sN r6 = (X.C16060sN) r6     // Catch:{ 1W4 -> 0x0077 }
            r8 = r6
            goto L_0x0077
        L_0x0071:
            X.1W4 r5 = new X.1W4     // Catch:{ 1W4 -> 0x0077 }
            r5.<init>((java.lang.String) r12)     // Catch:{ 1W4 -> 0x0077 }
            throw r5     // Catch:{ 1W4 -> 0x0077 }
        L_0x0077:
            java.lang.String r7 = "participant-user-db-migration/process-batch: groupJid="
            java.lang.String r6 = ", rowId="
            if (r8 != 0) goto L_0x009b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r12)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " SKIP Due to invalid MultipleParticipantJid."
        L_0x0090:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r5)
            goto L_0x0036
        L_0x009b:
            if (r19 == 0) goto L_0x00b9
            X.0rt r5 = r1.A01
            X.0rx r5 = r5.A06(r8)
            if (r5 != 0) goto L_0x00b9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r12)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " SKIP Due to pending group which no longer exists."
            goto L_0x0090
        L_0x00b9:
            java.lang.String r7 = X.C33931jQ.A02(r0, r13)
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 == 0) goto L_0x00df
            X.0sK r5 = r1.A00
            r5.A0B()
            X.1ZT r5 = r5.A05
        L_0x00ca:
            if (r5 != 0) goto L_0x00e4
            java.lang.String r8 = "participant-user-db-migration/process-batch: participantUserJid="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r7)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " SKIP Due to invalid UserJid."
            goto L_0x0090
        L_0x00df:
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.getNullable(r7)
            goto L_0x00ca
        L_0x00e4:
            r21 = 0
            X.1ck r6 = new X.1ck
            r17 = r5
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            X.0us r5 = r1.A02
            r5.A08(r6, r8)
            goto L_0x0036
        L_0x00f6:
            boolean r2 = r1 instanceof X.C46422Ef
            if (r2 != 0) goto L_0x12e2
            boolean r2 = r1 instanceof X.C46502En
            if (r2 != 0) goto L_0x12e2
            boolean r2 = r1 instanceof X.C46432Eg
            if (r2 != 0) goto L_0x12e2
            boolean r2 = r1 instanceof X.AnonymousClass2EZ
            if (r2 == 0) goto L_0x01c0
            X.2EZ r1 = (X.AnonymousClass2EZ) r1
            java.lang.String r2 = "_id"
            int r8 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "group_jid_row_id"
            int r7 = r0.getColumnIndexOrThrow(r2)
            r2 = -1
            r6 = 0
        L_0x0117:
            boolean r4 = r0.moveToNext()
            if (r4 == 0) goto L_0x01ba
            long r2 = r0.getLong(r8)
            int r6 = r6 + 1
            X.14v r10 = r1.A01
            java.lang.Class<X.1kx> r9 = X.C34841kx.class
            int r4 = r0.getInt(r7)
            long r4 = (long) r4
            com.whatsapp.jid.Jid r9 = r10.A07(r9, r4)
            X.0sN r9 = (X.C16060sN) r9
            java.lang.String r10 = ", rowId="
            java.lang.String r11 = "broadcast-me-jid-migration/process-batch: groupJidRowId="
            if (r9 != 0) goto L_0x015a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            int r4 = r0.getInt(r7)
            r5.append(r4)
            r5.append(r10)
            r5.append(r2)
            java.lang.String r4 = " SKIP Due to invalid BroadcastListJid"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r4)
            goto L_0x0117
        L_0x015a:
            X.0us r5 = r1.A02
            X.14v r4 = r5.A08
            long r12 = r4.A01(r9)
            java.lang.String r13 = java.lang.String.valueOf(r12)
            X.0sK r12 = r5.A01
            r12.A0B()
            X.1ZT r4 = r12.A05
            X.AnonymousClass00B.A06(r4)
            boolean r4 = r5.A0H(r4, r13)
            if (r4 != 0) goto L_0x0197
            X.1ZX r4 = r12.A03()
            boolean r4 = r5.A0H(r4, r13)
            if (r4 != 0) goto L_0x0197
            X.0sK r4 = r1.A00
            r4.A0B()
            X.1ZT r11 = r4.A05
            X.AnonymousClass00B.A06(r11)
            r12 = 2
            r13 = 0
            r14 = 0
            r15 = 0
            X.1ck r10 = new X.1ck
            r10.<init>(r11, r12, r13, r14, r15)
            r5.A08(r10, r9)
            goto L_0x0117
        L_0x0197:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            int r4 = r0.getInt(r7)
            r5.append(r4)
            r5.append(r10)
            r5.append(r2)
            java.lang.String r4 = " SKIP since it already has me jid"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            goto L_0x0117
        L_0x01ba:
            X.2Tm r0 = new X.2Tm
            r0.<init>(r2, r6)
            return r0
        L_0x01c0:
            boolean r2 = r1 instanceof X.C46442Eh
            if (r2 == 0) goto L_0x02ef
            X.2Eh r1 = (X.C46442Eh) r1
            java.lang.String r2 = "BlankMeJidDatabaseMigration/processBatch"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.String r9 = "_id"
            int r23 = r0.getColumnIndexOrThrow(r9)
            java.lang.String r2 = "raw_string"
            int r22 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "type"
            int r21 = r0.getColumnIndexOrThrow(r2)
            r3 = -1
            r6 = 0
        L_0x01e1:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x1032
            r2 = r23
            long r3 = r0.getLong(r2)
            int r6 = r6 + 1
            r2 = r22
            java.lang.String r2 = r0.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x01e1
            r2 = r21
            int r2 = r0.getInt(r2)
            r14 = 11
            if (r2 != r14) goto L_0x01e1
            X.11G r7 = r1.A02
            boolean r2 = r7.A0H()
            if (r2 != 0) goto L_0x01e1
            java.lang.String r2 = "StatusStore/migrateStatusRowsForOldMeJid"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.String r13 = java.lang.String.valueOf(r3)
            X.14v r2 = r7.A01
            X.0tq r2 = r2.A01
            X.0tf r10 = r2.get()
            X.0tg r12 = r10.A02     // Catch:{ all -> 0x0d76 }
            java.lang.String r11 = "SELECT _id FROM jid WHERE raw_string = ? AND type = ?"
            r2 = 2
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ all -> 0x0d76 }
            r5 = 0
            X.1jg r2 = X.C34091jg.A00     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = r2.getRawString()     // Catch:{ all -> 0x0d76 }
            r8[r5] = r2     // Catch:{ all -> 0x0d76 }
            r5 = 1
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0d76 }
            r8[r5] = r2     // Catch:{ all -> 0x0d76 }
            android.database.Cursor r5 = r12.A08(r11, r8)     // Catch:{ all -> 0x0d76 }
            boolean r2 = r5.moveToNext()     // Catch:{ all -> 0x02e8 }
            if (r2 == 0) goto L_0x0248
            int r2 = r5.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x02e8 }
            long r11 = r5.getLong(r2)     // Catch:{ all -> 0x02e8 }
            goto L_0x024a
        L_0x0248:
            r11 = -1
        L_0x024a:
            r5.close()     // Catch:{ all -> 0x0d76 }
            r10.close()
            java.lang.String r14 = java.lang.String.valueOf(r11)
            X.0tq r2 = r7.A02
            X.0tf r10 = r2.A02()
            X.1cj r20 = r10.A00()     // Catch:{ all -> 0x0d76 }
            r12 = 1
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x02e3 }
            r11.<init>(r12)     // Catch:{ all -> 0x02e3 }
            java.lang.String r2 = "jid_row_id"
            r11.put(r2, r14)     // Catch:{ all -> 0x02e3 }
            r19 = 0
            X.0tg r15 = r10.A02     // Catch:{ SQLiteConstraintException -> 0x027b }
            java.lang.String r8 = "status"
            java.lang.String r5 = "jid_row_id=?"
            java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ SQLiteConstraintException -> 0x027b }
            r2[r19] = r13     // Catch:{ SQLiteConstraintException -> 0x027b }
            int r14 = r15.A00(r8, r11, r5, r2)     // Catch:{ SQLiteConstraintException -> 0x027b }
            goto L_0x02a1
        L_0x027b:
            r5 = move-exception
            java.lang.String r2 = "StatusStore/migrateStatusRowsForOldMeJid/"
            com.whatsapp.util.Log.e(r2, r5)     // Catch:{ all -> 0x02e3 }
            long r17 = r7.A04(r13)     // Catch:{ all -> 0x02e3 }
            long r15 = r7.A04(r14)     // Catch:{ all -> 0x02e3 }
            java.lang.String r8 = "jid_row_id=?"
            java.lang.String r7 = "status"
            int r2 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x02ac
            java.lang.String r2 = "StatusStore/migrateStatusRowsForOldMeJid/delete row with invalid me jid"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x02e3 }
            X.0tg r5 = r10.A02     // Catch:{ all -> 0x02e3 }
            java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ all -> 0x02e3 }
            r2[r19] = r13     // Catch:{ all -> 0x02e3 }
            int r14 = r5.A01(r7, r8, r2)     // Catch:{ all -> 0x02e3 }
        L_0x02a1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e3 }
            r5.<init>()     // Catch:{ all -> 0x02e3 }
            java.lang.String r2 = "StatusStore/migrateStatusRowsForOldMeJid/success/"
            r5.append(r2)     // Catch:{ all -> 0x02e3 }
            goto L_0x02cb
        L_0x02ac:
            java.lang.String r2 = "StatusStore/migrateStatusRowsForOldMeJid/delete row with valid me jid"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x02e3 }
            X.0tg r5 = r10.A02     // Catch:{ all -> 0x02e3 }
            java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ all -> 0x02e3 }
            r2[r19] = r14     // Catch:{ all -> 0x02e3 }
            int r14 = r5.A01(r7, r8, r2)     // Catch:{ all -> 0x02e3 }
            if (r14 <= 0) goto L_0x02a1
            java.lang.String r2 = "StatusStore/migrateStatusRowsForOldMeJid/update row with invalid me jid"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x02e3 }
            java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ all -> 0x02e3 }
            r2[r19] = r13     // Catch:{ all -> 0x02e3 }
            int r14 = r5.A00(r7, r11, r8, r2)     // Catch:{ all -> 0x02e3 }
            goto L_0x02a1
        L_0x02cb:
            if (r14 > 0) goto L_0x02ce
            r12 = 0
        L_0x02ce:
            r5.append(r12)     // Catch:{ all -> 0x02e3 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x02e3 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x02e3 }
            r20.A00()     // Catch:{ all -> 0x02e3 }
            r20.close()     // Catch:{ all -> 0x0d76 }
            r10.close()
            goto L_0x01e1
        L_0x02e3:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x02ee }
            goto L_0x02ee
        L_0x02e8:
            r0 = move-exception
            if (r5 == 0) goto L_0x02ee
            r5.close()     // Catch:{ all -> 0x02ee }
        L_0x02ee:
            throw r0     // Catch:{ all -> 0x0d76 }
        L_0x02ef:
            boolean r2 = r1 instanceof X.AnonymousClass2EO
            if (r2 == 0) goto L_0x0343
            X.2EO r1 = (X.AnonymousClass2EO) r1
            java.lang.String r2 = "_id"
            int r7 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_wa_type"
            int r6 = r0.getColumnIndexOrThrow(r2)
            r2 = -1
            r12 = 0
        L_0x0304:
            boolean r4 = r0.moveToNext()
            if (r4 == 0) goto L_0x11c6
            long r2 = r0.getLong(r7)
            int r5 = r0.getInt(r6)
            r4 = 4
            if (r5 != r4) goto L_0x032b
            java.lang.String r4 = "data"
            int r4 = r0.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r0.getString(r4)
            X.17m r5 = r1.A00
            java.util.List r4 = java.util.Collections.singletonList(r4)
            X.C223217m.A00(r5, r4, r2)
        L_0x0328:
            int r12 = r12 + 1
            goto L_0x0304
        L_0x032b:
            r4 = 14
            if (r5 != r4) goto L_0x0328
            java.lang.String r4 = "raw_data"
            int r4 = r0.getColumnIndexOrThrow(r4)
            byte[] r4 = r0.getBlob(r4)
            java.util.List r5 = X.C30311c8.A02(r4)
            X.17m r4 = r1.A00
            X.C223217m.A00(r4, r5, r2)
            goto L_0x0328
        L_0x0343:
            boolean r2 = r1 instanceof X.C46402Ed
            if (r2 == 0) goto L_0x03db
            X.2Ed r1 = (X.C46402Ed) r1
            java.lang.String r2 = "_id"
            int r10 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "thumbnail"
            int r8 = r0.getColumnIndexOrThrow(r2)
            r9 = 0
            r4 = -1
        L_0x0359:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x0fb3
            boolean r2 = r0.isNull(r10)
            if (r2 == 0) goto L_0x037e
            java.lang.String r2 = "DatabaseUtils/safeGetLong/the value in the cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r4 = -1
        L_0x036c:
            java.lang.String r3 = "ThumbnailMessageStore/processBatch/invalid row id, id="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x0359
        L_0x037e:
            long r4 = r0.getLong(r10)     // Catch:{ IllegalStateException -> 0x0383 }
            goto L_0x038d
        L_0x0383:
            r3 = move-exception
            java.lang.String r2 = "DatabaseUtils/safeGetLong/failed once"
            com.whatsapp.util.Log.e(r2, r3)
            long r4 = r0.getLong(r10)     // Catch:{ IllegalStateException -> 0x03d2 }
        L_0x038d:
            r6 = 1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x036c
            byte[] r3 = r0.getBlob(r8)
            if (r3 == 0) goto L_0x03cf
            int r2 = r3.length
            if (r2 <= 0) goto L_0x03cf
            X.0xN r11 = r1.A00
            r11.A07(r3, r4)
            java.lang.String r2 = "key_remote_jid"
            int r7 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "key_from_me"
            int r6 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "key_id"
            int r3 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r0.getString(r7)
            X.0rv r7 = X.C15830rv.A02(r2)
            int r2 = r0.getInt(r6)
            r6 = 1
            if (r2 == r6) goto L_0x03c3
            r6 = 0
        L_0x03c3:
            java.lang.String r3 = r0.getString(r3)
            X.1Vw r2 = new X.1Vw
            r2.<init>(r7, r3, r6)
            r11.A03(r2)
        L_0x03cf:
            int r9 = r9 + 1
            goto L_0x0359
        L_0x03d2:
            r3 = move-exception
            java.lang.String r2 = "DatabaseUtils/safeGetLong/failed twice, returning default value"
            com.whatsapp.util.Log.e(r2, r3)
            r4 = -1
            goto L_0x036c
        L_0x03db:
            boolean r2 = r1 instanceof X.AnonymousClass2EN
            if (r2 == 0) goto L_0x0525
            X.2EN r1 = (X.AnonymousClass2EN) r1
            java.lang.String r2 = "_id"
            int r23 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_name"
            int r22 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_caption"
            int r21 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_url"
            int r20 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "thumb_image"
            int r19 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r10 = "preview_type"
            int r18 = r0.getColumnIndexOrThrow(r10)
            java.lang.String r2 = "status"
            int r17 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_duration"
            int r9 = r0.getColumnIndexOrThrow(r2)
            X.0tq r2 = r1.A05
            X.0tf r8 = r2.A02()
            r2 = -1
            r7 = 0
            r6 = 0
        L_0x041d:
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x0fb9 }
            if (r4 == 0) goto L_0x0631
            r2 = r23
            long r2 = r0.getLong(r2)     // Catch:{ all -> 0x0fb9 }
            r4 = r17
            int r5 = r0.getInt(r4)     // Catch:{ all -> 0x0fb9 }
            r4 = 6
            if (r5 != r4) goto L_0x0435
            int r6 = r6 + 1
            goto L_0x041d
        L_0x0435:
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0fb9 }
            r11.<init>()     // Catch:{ all -> 0x0fb9 }
            java.lang.String r5 = "message_row_id"
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            r11.put(r5, r4)     // Catch:{ all -> 0x0fb9 }
            r4 = r22
            java.lang.String r12 = r0.getString(r4)     // Catch:{ all -> 0x0fb9 }
            boolean r5 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r4 = "description"
            if (r5 != 0) goto L_0x0457
            r11.put(r4, r12)     // Catch:{ all -> 0x0fb9 }
            r16 = 1
            goto L_0x045c
        L_0x0457:
            r11.putNull(r4)     // Catch:{ all -> 0x0fb9 }
            r16 = 0
        L_0x045c:
            r4 = r21
            java.lang.String r12 = r0.getString(r4)     // Catch:{ all -> 0x0fb9 }
            boolean r5 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r4 = "page_title"
            if (r5 != 0) goto L_0x0470
            r11.put(r4, r12)     // Catch:{ all -> 0x0fb9 }
            r16 = 1
            goto L_0x0473
        L_0x0470:
            r11.putNull(r4)     // Catch:{ all -> 0x0fb9 }
        L_0x0473:
            r4 = r20
            java.lang.String r12 = r0.getString(r4)     // Catch:{ all -> 0x0fb9 }
            boolean r5 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r4 = "url"
            if (r5 != 0) goto L_0x0488
            r11.put(r4, r12)     // Catch:{ all -> 0x0fb9 }
            r16 = 1
            goto L_0x048b
        L_0x0488:
            r11.putNull(r4)     // Catch:{ all -> 0x0fb9 }
        L_0x048b:
            r4 = r19
            byte[] r12 = r0.getBlob(r4)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r5 = "background_color"
            java.lang.String r14 = "text_color"
            java.lang.String r15 = "font_style"
            if (r12 != 0) goto L_0x04bf
            r11.putNull(r15)     // Catch:{ all -> 0x0fb9 }
            r11.putNull(r14)     // Catch:{ all -> 0x0fb9 }
            r11.putNull(r5)     // Catch:{ all -> 0x0fb9 }
        L_0x04a3:
            r4 = r18
            long r4 = r0.getLong(r4)     // Catch:{ all -> 0x0fb9 }
            int r12 = (int) r4     // Catch:{ all -> 0x0fb9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0fb9 }
            r11.put(r10, r4)     // Catch:{ all -> 0x0fb9 }
            int r4 = r0.getInt(r9)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r5 = "invite_link_group_type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0fb9 }
            r11.put(r5, r4)     // Catch:{ all -> 0x0fb9 }
            goto L_0x0516
        L_0x04bf:
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x04a3 }
            r4.<init>(r12)     // Catch:{ Exception -> 0x04a3 }
            java.io.ObjectInputStream r12 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x04a3 }
            r12.<init>(r4)     // Catch:{ Exception -> 0x04a3 }
            java.lang.Object r13 = r12.readObject()     // Catch:{ all -> 0x0511 }
            boolean r4 = r13 instanceof com.obwhatsapp.TextData     // Catch:{ all -> 0x0511 }
            if (r4 == 0) goto L_0x04fe
            com.obwhatsapp.TextData r13 = (com.obwhatsapp.TextData) r13     // Catch:{ all -> 0x0511 }
            int r4 = r13.fontStyle     // Catch:{ all -> 0x0511 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0511 }
            r11.put(r15, r4)     // Catch:{ all -> 0x0511 }
            int r4 = r13.textColor     // Catch:{ all -> 0x0511 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0511 }
            r11.put(r14, r4)     // Catch:{ all -> 0x0511 }
            int r4 = r13.backgroundColor     // Catch:{ all -> 0x0511 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0511 }
            r11.put(r5, r4)     // Catch:{ all -> 0x0511 }
            byte[] r13 = r13.thumbnail     // Catch:{ all -> 0x0511 }
            if (r13 == 0) goto L_0x04fb
            X.0xN r5 = r1.A02     // Catch:{ all -> 0x0511 }
            X.1Vw r4 = r1.A0U(r0)     // Catch:{ all -> 0x0511 }
            r5.A05(r4, r13, r2)     // Catch:{ all -> 0x0511 }
        L_0x04fb:
            r16 = 1
            goto L_0x050d
        L_0x04fe:
            boolean r4 = r13 instanceof byte[]     // Catch:{ all -> 0x0511 }
            if (r4 == 0) goto L_0x050d
            X.0xN r5 = r1.A02     // Catch:{ all -> 0x0511 }
            byte[] r13 = (byte[]) r13     // Catch:{ all -> 0x0511 }
            X.1Vw r4 = r1.A0U(r0)     // Catch:{ all -> 0x0511 }
            r5.A05(r4, r13, r2)     // Catch:{ all -> 0x0511 }
        L_0x050d:
            r12.close()     // Catch:{ Exception -> 0x04a3 }
            goto L_0x04a3
        L_0x0511:
            r4 = move-exception
            r12.close()     // Catch:{ all -> 0x0515 }
        L_0x0515:
            throw r4     // Catch:{ Exception -> 0x04a3 }
        L_0x0516:
            if (r16 != 0) goto L_0x051a
            if (r12 == 0) goto L_0x0521
        L_0x051a:
            X.0tg r5 = r8.A02     // Catch:{ all -> 0x0fb9 }
            java.lang.String r4 = "message_text"
            r5.A03(r11, r4)     // Catch:{ all -> 0x0fb9 }
        L_0x0521:
            int r7 = r7 + 1
            goto L_0x041d
        L_0x0525:
            boolean r2 = r1 instanceof X.AnonymousClass2ET
            if (r2 == 0) goto L_0x063a
            X.2ET r1 = (X.AnonymousClass2ET) r1
            java.lang.String r9 = "status"
            int r16 = r0.getColumnIndexOrThrow(r9)
            r7 = 0
            r2 = -1
            r6 = 0
        L_0x0536:
            boolean r4 = r0.moveToNext()
            if (r4 == 0) goto L_0x0634
            java.lang.String r2 = "_id"
            int r2 = r0.getColumnIndexOrThrow(r2)
            long r2 = r0.getLong(r2)
            r4 = r16
            int r4 = r0.getInt(r4)
            r15 = 6
            if (r4 == r15) goto L_0x0552
            int r6 = r6 + 1
            goto L_0x0536
        L_0x0552:
            X.1Hd r12 = r1.A00     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            java.lang.String r4 = "key_id"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            java.lang.String r8 = r0.getString(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            java.lang.String r4 = "key_from_me"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            int r4 = r0.getInt(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            r5 = 1
            if (r4 == r5) goto L_0x056c
            r5 = 0
        L_0x056c:
            java.lang.String r4 = "key_remote_jid"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            X.0rv r4 = X.C15830rv.A02(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            if (r4 != 0) goto L_0x057f
            r5 = 0
            goto L_0x05fe
        L_0x057f:
            X.1Vw r11 = new X.1Vw     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            r11.<init>(r4, r8, r5)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            java.lang.String r4 = "message_type"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            if (r4 >= 0) goto L_0x0592
            java.lang.String r4 = "media_wa_type"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
        L_0x0592:
            int r4 = r0.getInt(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            byte r13 = (byte) r4     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            java.lang.String r4 = "timestamp"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            long r4 = r0.getLong(r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            int r8 = r0.getColumnIndexOrThrow(r9)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            int r14 = r0.getInt(r8)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            java.lang.String r8 = "thumb_image"
            int r8 = r0.getColumnIndexOrThrow(r8)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            byte[] r10 = r0.getBlob(r8)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            if (r10 == 0) goto L_0x05d3
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x05cd }
            r8.<init>(r10)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x05cd }
            java.io.ObjectInputStream r10 = new java.io.ObjectInputStream     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x05cd }
            r10.<init>(r8)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x05cd }
            r10.readObject()     // Catch:{ all -> 0x05c8 }
            r10.close()     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x05cd }
            goto L_0x05d3
        L_0x05c8:
            r8 = move-exception
            r10.close()     // Catch:{ all -> 0x05cc }
        L_0x05cc:
            throw r8     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x05cd }
        L_0x05cd:
            r10 = move-exception
            java.lang.String r8 = "MessageStoreMessageUtils/readMessageFromCursor"
            com.whatsapp.util.Log.e(r8, r10)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
        L_0x05d3:
            if (r13 != 0) goto L_0x05d8
            if (r14 == r15) goto L_0x05e3
            goto L_0x05dc
        L_0x05d8:
            r8 = 7
            if (r13 != r8) goto L_0x05dc
            goto L_0x05e3
        L_0x05dc:
            X.17g r8 = r12.A02     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            X.0tZ r5 = r8.A01(r11, r13, r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            goto L_0x05f9
        L_0x05e3:
            java.lang.String r8 = "media_size"
            int r8 = r0.getColumnIndexOrThrow(r8)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            int r10 = r0.getInt(r8)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            r8 = 38
            if (r10 != r8) goto L_0x0603
            X.17g r10 = r12.A02     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            r8 = 33
            X.0tZ r5 = r10.A01(r11, r8, r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
        L_0x05f9:
            X.14v r4 = r12.A01     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            r5.A0a(r0, r4)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
        L_0x05fe:
            X.1WU r5 = (X.AnonymousClass1WU) r5     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            if (r5 == 0) goto L_0x0536
            goto L_0x0614
        L_0x0603:
            X.0so r8 = r12.A00     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            r19 = 0
            r21 = r4
            r17 = r8
            r18 = r11
            r20 = r10
            X.1WU r5 = X.AnonymousClass122.A00(r17, r18, r19, r20, r21)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x061d }
            goto L_0x05f9
        L_0x0614:
            X.17r r4 = r1.A01
            r4.A01(r5)
            int r7 = r7 + 1
            goto L_0x0536
        L_0x061d:
            r8 = move-exception
            java.lang.String r5 = "MissedCallsLogDatabaseMigration/processBatch/failed to read message with id = "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.whatsapp.util.Log.e(r4, r8)
            goto L_0x0536
        L_0x0631:
            r8.close()
        L_0x0634:
            X.2Tm r0 = new X.2Tm
            r0.<init>(r7, r2, r6)
            return r0
        L_0x063a:
            boolean r2 = r1 instanceof X.C46392Ec
            if (r2 == 0) goto L_0x0684
            java.lang.String r2 = "_id"
            int r11 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r10 = "send_count"
            int r7 = r0.getColumnIndexOrThrow(r10)
            X.0tq r1 = r1.A05
            X.0tf r8 = r1.A02()
            r4 = -1
            r9 = 0
        L_0x0654:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0fb9 }
            if (r1 == 0) goto L_0x0fb0
            long r4 = r0.getLong(r11)     // Catch:{ all -> 0x0fb9 }
            int r3 = r0.getInt(r7)     // Catch:{ all -> 0x0fb9 }
            if (r3 == 0) goto L_0x0654
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0fb9 }
            r6.<init>()     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "message_row_id"
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0fb9 }
            r6.put(r2, r1)     // Catch:{ all -> 0x0fb9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0fb9 }
            r6.put(r10, r1)     // Catch:{ all -> 0x0fb9 }
            X.0tg r3 = r8.A02     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "message_send_count"
            r1 = 5
            r3.A06(r6, r2, r1)     // Catch:{ all -> 0x0fb9 }
            int r9 = r9 + 1
            goto L_0x0654
        L_0x0684:
            boolean r2 = r1 instanceof X.AnonymousClass2EV
            if (r2 == 0) goto L_0x0702
            X.2EV r1 = (X.AnonymousClass2EV) r1
            java.lang.String r2 = "_id"
            int r11 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_name"
            int r9 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_caption"
            int r8 = r0.getColumnIndexOrThrow(r2)
            X.0tq r2 = r1.A05
            X.0tf r10 = r2.A02()
            r14 = -1
            r7 = 0
            r2 = -1
        L_0x06a7:
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x0d76 }
            if (r4 == 0) goto L_0x06f9
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0d76 }
            r6.<init>()     // Catch:{ all -> 0x0d76 }
            long r2 = r0.getLong(r11)     // Catch:{ all -> 0x0d76 }
            java.lang.String r5 = "message_row_id"
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d76 }
            r6.put(r5, r4)     // Catch:{ all -> 0x0d76 }
            java.lang.String r5 = "revoked_key_id"
            java.lang.String r4 = r0.getString(r9)     // Catch:{ all -> 0x0d76 }
            X.C38611r4.A04(r6, r5, r4)     // Catch:{ all -> 0x0d76 }
            java.lang.String r4 = r0.getString(r8)     // Catch:{ all -> 0x0d76 }
            com.whatsapp.jid.Jid r5 = com.whatsapp.jid.Jid.getNullable(r4)     // Catch:{ all -> 0x0d76 }
            if (r5 != 0) goto L_0x06d4
            goto L_0x06db
        L_0x06d4:
            X.14v r4 = r1.A00     // Catch:{ all -> 0x0d76 }
            long r12 = r4.A01(r5)     // Catch:{ all -> 0x0d76 }
            goto L_0x06dd
        L_0x06db:
            r12 = -1
        L_0x06dd:
            java.lang.String r5 = "admin_jid_row_id"
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x06e4
            goto L_0x06ec
        L_0x06e4:
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d76 }
            r6.put(r5, r4)     // Catch:{ all -> 0x0d76 }
            goto L_0x06ef
        L_0x06ec:
            r6.putNull(r5)     // Catch:{ all -> 0x0d76 }
        L_0x06ef:
            X.0tg r5 = r10.A02     // Catch:{ all -> 0x0d76 }
            java.lang.String r4 = "message_revoked"
            r5.A03(r6, r4)     // Catch:{ all -> 0x0d76 }
            int r7 = r7 + 1
            goto L_0x06a7
        L_0x06f9:
            r10.close()
            X.2Tm r0 = new X.2Tm
            r0.<init>(r2, r7)
            return r0
        L_0x0702:
            boolean r2 = r1 instanceof X.AnonymousClass2EM
            if (r2 == 0) goto L_0x0826
            X.2EM r1 = (X.AnonymousClass2EM) r1
            X.0tq r2 = r1.A05
            X.0tf r4 = r2.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x1151 }
            java.lang.String r2 = "INSERT OR IGNORE INTO receipt_user(message_row_id,receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp) VALUES (?, ?, ?, ?, ?)"
            X.1ou r2 = r3.A0A(r2)     // Catch:{ all -> 0x1151 }
            r4.close()
            r1.A00 = r2
            java.lang.String r2 = "_id"
            int r19 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "key_remote_jid"
            int r18 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "key_from_me"
            int r17 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "key_id"
            int r9 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "remote_resource"
            int r16 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "receipt_device_timestamp"
            int r12 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "read_device_timestamp"
            int r11 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "played_device_timestamp"
            int r10 = r0.getColumnIndexOrThrow(r2)
            r2 = -1
            r4 = 0
        L_0x074e:
            boolean r5 = r0.moveToNext()
            if (r5 == 0) goto L_0x0b7b
            r2 = r19
            long r2 = r0.getLong(r2)
            int r4 = r4 + 1
            r5 = r17
            long r13 = r0.getLong(r5)
            r6 = 1
            int r5 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x074e
            r5 = r18
            java.lang.String r5 = r0.getString(r5)
            X.0rv r13 = X.C15830rv.A02(r5)
            if (r13 == 0) goto L_0x074e
            boolean r5 = X.C16030sJ.A0L(r13)
            if (r5 != 0) goto L_0x07c6
            boolean r5 = X.C16030sJ.A0Q(r13)
            if (r5 != 0) goto L_0x07c6
            boolean r5 = r13 instanceof com.whatsapp.jid.UserJid
            if (r5 == 0) goto L_0x074e
            com.whatsapp.jid.UserJid r8 = com.whatsapp.jid.UserJid.of(r13)
            long r21 = r0.getLong(r12)
            long r23 = r0.getLong(r11)
            long r25 = r0.getLong(r10)
            X.21N r7 = new X.21N
            r20 = r7
            r20.<init>(r21, r23, r25)
            r1.A0U(r7, r8, r2)
            r5 = r16
            java.lang.String r5 = r0.getString(r5)
            X.0rv r15 = X.C15830rv.A02(r5)
            boolean r5 = X.C16030sJ.A0G(r15)
            if (r5 == 0) goto L_0x074e
            java.lang.String r14 = r0.getString(r9)
            X.0th r13 = r1.A02     // Catch:{ SQLiteException -> 0x07fc }
            r6 = 1
            X.1Vw r5 = new X.1Vw     // Catch:{ SQLiteException -> 0x07fc }
            r5.<init>(r15, r14, r6)     // Catch:{ SQLiteException -> 0x07fc }
            X.0tZ r5 = r13.A03(r5)     // Catch:{ SQLiteException -> 0x07fc }
            if (r5 == 0) goto L_0x074e
            long r5 = r5.A13
            r1.A0U(r7, r8, r5)
            goto L_0x074e
        L_0x07c6:
            r8 = 1
            java.lang.String r7 = r0.getString(r9)
            X.15t r6 = r1.A05
            X.1Vw r5 = new X.1Vw
            r5.<init>(r13, r7, r8)
            X.21M r5 = r6.A01(r5)
            java.util.concurrent.ConcurrentHashMap r5 = r5.A00
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r7 = r5.iterator()
        L_0x07e0:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x074e
            java.lang.Object r5 = r7.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r5.getValue()
            X.21N r5 = (X.AnonymousClass21N) r5
            r1.A0U(r5, r6, r2)
            goto L_0x07e0
        L_0x07fc:
            r5 = move-exception
            java.lang.String r0 = "receipt-user-db-migration/process-batch fail to read from message store, e="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = r5.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            long r3 = r1.A07()
            r1 = 20
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0825
            r3 = 0
            r1 = -1
            X.2Tm r0 = new X.2Tm
            r0.<init>(r1, r3)
            return r0
        L_0x0825:
            throw r5
        L_0x0826:
            boolean r2 = r1 instanceof X.AnonymousClass2ER
            if (r2 == 0) goto L_0x09c4
            X.2ER r1 = (X.AnonymousClass2ER) r1
            java.lang.String r2 = "parent_row_id"
            int r11 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "parent_key_remote_jid"
            int r9 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "_id"
            int r8 = r0.getColumnIndexOrThrow(r2)
            X.0tq r2 = r1.A05
            X.0tf r10 = r2.A02()
            r3 = -1
            r7 = 0
            r6 = 0
        L_0x0848:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x09bb
            long r3 = r0.getLong(r11)     // Catch:{ all -> 0x0d76 }
            boolean r2 = r0.isNull(r8)     // Catch:{ all -> 0x0d76 }
            if (r2 != 0) goto L_0x09b7
            long r14 = r0.getLong(r8)     // Catch:{ all -> 0x0d76 }
            r12 = 0
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x09b7
            java.lang.String r2 = r0.getString(r9)     // Catch:{ all -> 0x0d76 }
            X.0rv r5 = X.C15830rv.A02(r2)     // Catch:{ all -> 0x0d76 }
            if (r5 != 0) goto L_0x0881
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d76 }
            r5.<init>()     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = "QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing chatJid; rowId="
            r5.append(r2)     // Catch:{ all -> 0x0d76 }
            r5.append(r3)     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0d76 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d76 }
            goto L_0x0848
        L_0x0881:
            X.17G r2 = r1.A04     // Catch:{ all -> 0x0d76 }
            X.0tZ r12 = r2.A00(r0)     // Catch:{ all -> 0x0d76 }
            if (r12 != 0) goto L_0x089e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d76 }
            r5.<init>()     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = "QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing quotedMessage; rowId="
            r5.append(r2)     // Catch:{ all -> 0x0d76 }
            r5.append(r3)     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0d76 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d76 }
            goto L_0x0848
        L_0x089e:
            r2 = 2
            r12.A0X(r2)     // Catch:{ all -> 0x0d76 }
            X.17q r2 = r1.A0A     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x09a1 }
            r2.A04(r12, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x09a1 }
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x0d76 }
            android.content.ContentValues r13 = r2.A00(r5, r12, r3)     // Catch:{ all -> 0x0d76 }
            X.0tg r5 = r10.A02     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = "message_quoted"
            r5.A05(r13, r2)     // Catch:{ all -> 0x0d76 }
            X.0tm r2 = r12.A0F()     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x08ca
            X.0tm r5 = r12.A0F()     // Catch:{ all -> 0x0d76 }
            X.0tm r2 = r12.A0F()     // Catch:{ all -> 0x0d76 }
            byte[] r2 = r2.A06()     // Catch:{ all -> 0x0d76 }
            r5.A01(r2)     // Catch:{ all -> 0x0d76 }
        L_0x08ca:
            boolean r2 = r12 instanceof X.C38891ra     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x08d6
            X.17u r5 = r1.A09     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.1ra r2 = (X.C38891ra) r2     // Catch:{ all -> 0x0d76 }
            r5.A01(r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x08d6:
            boolean r2 = r12 instanceof X.C38981rj     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x08e2
            X.17t r5 = r1.A00     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.1rj r2 = (X.C38981rj) r2     // Catch:{ all -> 0x0d76 }
            r5.A01(r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x08e2:
            boolean r2 = r12 instanceof X.C30071bh     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x08ee
            X.185 r5 = r1.A01     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.1bh r2 = (X.C30071bh) r2     // Catch:{ all -> 0x0d76 }
            r5.A04(r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x08ee:
            boolean r2 = r12 instanceof X.C39021rn     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x08fa
            X.17l r5 = r1.A07     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.1rn r2 = (X.C39021rn) r2     // Catch:{ all -> 0x0d76 }
            r5.A02(r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x08fa:
            boolean r2 = r12 instanceof X.C16840tj     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0906
            X.0vM r5 = r1.A02     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.0tj r2 = (X.C16840tj) r2     // Catch:{ all -> 0x0d76 }
            r5.A0H(r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x0906:
            boolean r2 = r12.A0x()     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0919
            X.0vM r13 = r1.A02     // Catch:{ all -> 0x0d76 }
            X.1sA r2 = r12.A0E()     // Catch:{ all -> 0x0d76 }
            X.1sB r5 = r2.A00     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = "message_quoted_ui_elements"
            r13.A09(r5, r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x0919:
            boolean r2 = r12 instanceof X.C39041rp     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0925
            X.0vM r5 = r1.A02     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.1rp r2 = (X.C39041rp) r2     // Catch:{ all -> 0x0d76 }
            r5.A0E(r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x0925:
            boolean r2 = r12 instanceof X.C39051rq     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0933
            X.0vM r13 = r1.A02     // Catch:{ all -> 0x0d76 }
            r5 = r12
            X.1rq r5 = (X.C39051rq) r5     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = "message_quoted_ui_elements_reply"
            r13.A0C(r5, r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x0933:
            boolean r2 = r12 instanceof X.C30901d9     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x093f
            X.17x r5 = r1.A03     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.1d9 r2 = (X.C30901d9) r2     // Catch:{ all -> 0x0d76 }
            r5.A01(r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x093f:
            boolean r2 = r12 instanceof X.C16730tY     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x094b
            X.17I r5 = r1.A05     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.0tY r2 = (X.C16730tY) r2     // Catch:{ all -> 0x0d76 }
            r5.A08(r2, r3)     // Catch:{ all -> 0x0d76 }
        L_0x094b:
            boolean r2 = r12.A0y()     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0956
            X.17w r2 = r1.A06     // Catch:{ all -> 0x0d76 }
            r2.A01(r12, r3)     // Catch:{ all -> 0x0d76 }
        L_0x0956:
            boolean r2 = r12 instanceof X.C38741rL     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0990
            X.17m r13 = r1.A0C     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.1rL r2 = (X.C38741rL) r2     // Catch:{ all -> 0x0d76 }
            java.lang.String r5 = r2.A12()     // Catch:{ all -> 0x0d76 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d76 }
            if (r2 != 0) goto L_0x096c
            r13.A06(r5, r3)     // Catch:{ all -> 0x0d76 }
        L_0x096c:
            boolean r2 = r12 instanceof X.C30581cc     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0976
            X.17j r5 = r1.A0B     // Catch:{ all -> 0x0d76 }
            r2 = 0
            r5.A00(r12, r3, r2)     // Catch:{ all -> 0x0d76 }
        L_0x0976:
            boolean r2 = r12 instanceof X.C39061rr     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0984
            X.187 r13 = r1.A08     // Catch:{ all -> 0x0d76 }
            r5 = r12
            X.1rr r5 = (X.C39061rr) r5     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = "SELECT message_row_id, service, expiration_timestamp FROM message_quoted_payment_invite WHERE message_row_id = ?"
            r13.A00(r5, r2)     // Catch:{ all -> 0x0d76 }
        L_0x0984:
            boolean r2 = r12 instanceof X.C38651rC     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x099d
            X.190 r2 = r1.A0D     // Catch:{ all -> 0x0d76 }
            X.1rC r12 = (X.C38651rC) r12     // Catch:{ all -> 0x0d76 }
            r2.A00(r12, r3)     // Catch:{ all -> 0x0d76 }
            goto L_0x099d
        L_0x0990:
            boolean r2 = r12 instanceof X.C38811rS     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x096c
            X.17m r5 = r1.A0C     // Catch:{ all -> 0x0d76 }
            r2 = r12
            X.1rS r2 = (X.C38811rS) r2     // Catch:{ all -> 0x0d76 }
            r5.A04(r2, r3)     // Catch:{ all -> 0x0d76 }
            goto L_0x096c
        L_0x099d:
            int r7 = r7 + 1
            goto L_0x0848
        L_0x09a1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d76 }
            r5.<init>()     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = "QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing information, skipping; rowId="
            r5.append(r2)     // Catch:{ all -> 0x0d76 }
            r5.append(r3)     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0d76 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d76 }
            goto L_0x0848
        L_0x09b7:
            int r6 = r6 + 1
            goto L_0x0848
        L_0x09bb:
            r10.close()
            X.2Tm r0 = new X.2Tm
            r0.<init>(r7, r3, r6)
            return r0
        L_0x09c4:
            boolean r2 = r1 instanceof X.C46472Ek
            if (r2 == 0) goto L_0x0b8b
            java.lang.String r39 = "message_row_id"
            r2 = r39
            int r38 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r37 = "order_id"
            r2 = r37
            int r36 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r35 = "thumbnail"
            r2 = r35
            int r34 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r33 = "order_title"
            r2 = r33
            int r32 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r31 = "item_count"
            r2 = r31
            int r30 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r11 = "status"
            int r29 = r0.getColumnIndexOrThrow(r11)
            java.lang.String r10 = "surface"
            int r28 = r0.getColumnIndexOrThrow(r10)
            java.lang.String r9 = "message"
            int r27 = r0.getColumnIndexOrThrow(r9)
            java.lang.String r8 = "seller_jid"
            int r26 = r0.getColumnIndexOrThrow(r8)
            java.lang.String r7 = "token"
            int r25 = r0.getColumnIndexOrThrow(r7)
            java.lang.String r6 = "currency_code"
            int r24 = r0.getColumnIndexOrThrow(r6)
            java.lang.String r5 = "total_amount_1000"
            int r23 = r0.getColumnIndexOrThrow(r5)
            X.0tq r1 = r1.A05
            r40 = r1
            X.0tf r12 = r40.A02()
            X.1cj r22 = r12.A00()     // Catch:{ all -> 0x0b86 }
            r2 = -1
            r4 = 0
        L_0x0a2f:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0b81 }
            if (r1 == 0) goto L_0x0b72
            r1 = r38
            long r2 = r0.getLong(r1)     // Catch:{ all -> 0x0b81 }
            X.0tf r13 = r40.get()     // Catch:{ all -> 0x0b81 }
            X.0tg r15 = r13.A02     // Catch:{ all -> 0x0b6d }
            java.lang.String r14 = "SELECT _id, quoted_row_id FROM messages WHERE _id = ?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0b6d }
            r21 = 0
            java.lang.String r20 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0b6d }
            r1[r21] = r20     // Catch:{ all -> 0x0b6d }
            android.database.Cursor r1 = r15.A08(r14, r1)     // Catch:{ all -> 0x0b6d }
            boolean r14 = r1.moveToNext()     // Catch:{ all -> 0x0b66 }
            if (r14 == 0) goto L_0x0b40
            java.lang.String r14 = "quoted_row_id"
            int r14 = r1.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x0b66 }
            long r18 = r1.getLong(r14)     // Catch:{ all -> 0x0b66 }
            r1.close()     // Catch:{ all -> 0x0b6d }
            r13.close()     // Catch:{ all -> 0x0b81 }
            r13 = 0
            int r1 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0b4a
            X.0tf r17 = r40.get()     // Catch:{ all -> 0x0b81 }
            r1 = r17
            X.0tg r14 = r1.A02     // Catch:{ all -> 0x0b61 }
            java.lang.String r13 = "SELECT media_wa_type FROM messages_quotes WHERE _id = ?"
            r15 = 1
            java.lang.String[] r1 = new java.lang.String[r15]     // Catch:{ all -> 0x0b61 }
            java.lang.String r16 = java.lang.Long.toString(r18)     // Catch:{ all -> 0x0b61 }
            r1[r21] = r16     // Catch:{ all -> 0x0b61 }
            android.database.Cursor r14 = r14.A08(r13, r1)     // Catch:{ all -> 0x0b61 }
            boolean r1 = r14.moveToNext()     // Catch:{ all -> 0x0b5a }
            if (r1 == 0) goto L_0x0b3c
            java.lang.String r1 = "media_wa_type"
            int r1 = r14.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0b5a }
            int r13 = r14.getInt(r1)     // Catch:{ all -> 0x0b5a }
            r1 = 44
            if (r13 == r1) goto L_0x0a9a
            r15 = 0
        L_0x0a9a:
            r14.close()     // Catch:{ all -> 0x0b61 }
            r17.close()     // Catch:{ all -> 0x0b81 }
            if (r15 == 0) goto L_0x0b4a
            r1 = 12
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x0b81 }
            r13.<init>(r1)     // Catch:{ all -> 0x0b81 }
            java.lang.Long r14 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0b81 }
            r1 = r39
            r13.put(r1, r14)     // Catch:{ all -> 0x0b81 }
            r1 = r36
            java.lang.String r14 = r0.getString(r1)     // Catch:{ all -> 0x0b81 }
            r1 = r37
            r13.put(r1, r14)     // Catch:{ all -> 0x0b81 }
            r1 = r34
            byte[] r14 = r0.getBlob(r1)     // Catch:{ all -> 0x0b81 }
            r1 = r35
            r13.put(r1, r14)     // Catch:{ all -> 0x0b81 }
            r1 = r32
            java.lang.String r14 = r0.getString(r1)     // Catch:{ all -> 0x0b81 }
            r1 = r33
            r13.put(r1, r14)     // Catch:{ all -> 0x0b81 }
            r1 = r30
            long r14 = r0.getLong(r1)     // Catch:{ all -> 0x0b81 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b81 }
            r1 = r31
            r13.put(r1, r14)     // Catch:{ all -> 0x0b81 }
            r1 = r29
            long r14 = r0.getLong(r1)     // Catch:{ all -> 0x0b81 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b81 }
            r13.put(r11, r1)     // Catch:{ all -> 0x0b81 }
            r1 = r28
            long r14 = r0.getLong(r1)     // Catch:{ all -> 0x0b81 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b81 }
            r13.put(r10, r1)     // Catch:{ all -> 0x0b81 }
            r1 = r27
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0b81 }
            r13.put(r9, r1)     // Catch:{ all -> 0x0b81 }
            r1 = r26
            long r14 = r0.getLong(r1)     // Catch:{ all -> 0x0b81 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b81 }
            r13.put(r8, r1)     // Catch:{ all -> 0x0b81 }
            r1 = r25
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0b81 }
            r13.put(r7, r1)     // Catch:{ all -> 0x0b81 }
            r1 = r24
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0b81 }
            r13.put(r6, r1)     // Catch:{ all -> 0x0b81 }
            r1 = r23
            long r14 = r0.getLong(r1)     // Catch:{ all -> 0x0b81 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b81 }
            r13.put(r5, r1)     // Catch:{ all -> 0x0b81 }
            X.0tg r14 = r12.A02     // Catch:{ all -> 0x0b81 }
            java.lang.String r1 = "quoted_message_order"
            r14.A02(r13, r1)     // Catch:{ all -> 0x0b81 }
            int r4 = r4 + 1
            goto L_0x0a2f
        L_0x0b3c:
            r14.close()     // Catch:{ all -> 0x0b61 }
            goto L_0x0b47
        L_0x0b40:
            r1.close()     // Catch:{ all -> 0x0b6d }
            r13.close()     // Catch:{ all -> 0x0b81 }
            goto L_0x0b4a
        L_0x0b47:
            r17.close()     // Catch:{ all -> 0x0b81 }
        L_0x0b4a:
            X.0tg r15 = r12.A02     // Catch:{ all -> 0x0b81 }
            r1 = 1
            java.lang.String[] r14 = new java.lang.String[r1]     // Catch:{ all -> 0x0b81 }
            r14[r21] = r20     // Catch:{ all -> 0x0b81 }
            java.lang.String r13 = "message_quoted_order"
            java.lang.String r1 = "message_row_id = ?"
            r15.A01(r13, r1, r14)     // Catch:{ all -> 0x0b81 }
            goto L_0x0a2f
        L_0x0b5a:
            r0 = move-exception
            if (r14 == 0) goto L_0x0b60
            r14.close()     // Catch:{ all -> 0x0b60 }
        L_0x0b60:
            throw r0     // Catch:{ all -> 0x0b61 }
        L_0x0b61:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0b71 }
            goto L_0x0b71
        L_0x0b66:
            r0 = move-exception
            if (r1 == 0) goto L_0x0b6c
            r1.close()     // Catch:{ all -> 0x0b6c }
        L_0x0b6c:
            throw r0     // Catch:{ all -> 0x0b6d }
        L_0x0b6d:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0b71 }
        L_0x0b71:
            throw r0     // Catch:{ all -> 0x0b81 }
        L_0x0b72:
            r22.A00()     // Catch:{ all -> 0x0b81 }
            r22.close()     // Catch:{ all -> 0x0b86 }
            r12.close()
        L_0x0b7b:
            X.2Tm r0 = new X.2Tm
            r0.<init>(r2, r4)
            return r0
        L_0x0b81:
            r0 = move-exception
            r22.close()     // Catch:{ all -> 0x0b85 }
        L_0x0b85:
            throw r0     // Catch:{ all -> 0x0b86 }
        L_0x0b86:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x11d0 }
            throw r0
        L_0x0b8b:
            boolean r2 = r1 instanceof X.C46462Ej
            if (r2 == 0) goto L_0x0ca4
            java.lang.String r2 = "_id"
            int r32 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r31 = "order_id"
            r2 = r31
            int r30 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r29 = "thumbnail"
            r2 = r29
            int r28 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r13 = "order_title"
            int r27 = r0.getColumnIndexOrThrow(r13)
            java.lang.String r11 = "item_count"
            int r26 = r0.getColumnIndexOrThrow(r11)
            java.lang.String r10 = "status"
            int r25 = r0.getColumnIndexOrThrow(r10)
            java.lang.String r9 = "surface"
            int r24 = r0.getColumnIndexOrThrow(r9)
            java.lang.String r8 = "message"
            int r23 = r0.getColumnIndexOrThrow(r8)
            java.lang.String r7 = "seller_jid"
            int r22 = r0.getColumnIndexOrThrow(r7)
            java.lang.String r6 = "token"
            int r21 = r0.getColumnIndexOrThrow(r6)
            java.lang.String r5 = "currency_code"
            int r20 = r0.getColumnIndexOrThrow(r5)
            java.lang.String r4 = "total_amount_1000"
            int r19 = r0.getColumnIndexOrThrow(r4)
            X.0tq r1 = r1.A05
            X.0tf r18 = r1.A02()
            X.1cj r17 = r18.A00()     // Catch:{ all -> 0x0c9f }
            r2 = -1
            r12 = 0
        L_0x0bee:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0c9a }
            if (r1 == 0) goto L_0x0c92
            r1 = r32
            long r2 = r0.getLong(r1)     // Catch:{ all -> 0x0c9a }
            r1 = 12
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0c9a }
            r14.<init>(r1)     // Catch:{ all -> 0x0c9a }
            java.lang.String r15 = "message_row_id"
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0c9a }
            r14.put(r15, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r30
            java.lang.String r15 = r0.getString(r1)     // Catch:{ all -> 0x0c9a }
            r1 = r31
            r14.put(r1, r15)     // Catch:{ all -> 0x0c9a }
            r1 = r28
            byte[] r15 = r0.getBlob(r1)     // Catch:{ all -> 0x0c9a }
            r1 = r29
            r14.put(r1, r15)     // Catch:{ all -> 0x0c9a }
            r1 = r27
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0c9a }
            r14.put(r13, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r26
            long r15 = r0.getLong(r1)     // Catch:{ all -> 0x0c9a }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0c9a }
            r14.put(r11, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r25
            long r15 = r0.getLong(r1)     // Catch:{ all -> 0x0c9a }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0c9a }
            r14.put(r10, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r24
            long r15 = r0.getLong(r1)     // Catch:{ all -> 0x0c9a }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0c9a }
            r14.put(r9, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r23
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0c9a }
            r14.put(r8, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r22
            long r15 = r0.getLong(r1)     // Catch:{ all -> 0x0c9a }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0c9a }
            r14.put(r7, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r21
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0c9a }
            r14.put(r6, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r20
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0c9a }
            r14.put(r5, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r19
            long r15 = r0.getLong(r1)     // Catch:{ all -> 0x0c9a }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0c9a }
            r14.put(r4, r1)     // Catch:{ all -> 0x0c9a }
            r1 = r18
            X.0tg r15 = r1.A02     // Catch:{ all -> 0x0c9a }
            java.lang.String r1 = "message_quoted_order"
            r15.A02(r14, r1)     // Catch:{ all -> 0x0c9a }
            int r12 = r12 + 1
            goto L_0x0bee
        L_0x0c92:
            r17.A00()     // Catch:{ all -> 0x0c9a }
            r17.close()     // Catch:{ all -> 0x0c9f }
            goto L_0x11c3
        L_0x0c9a:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0c9e }
        L_0x0c9e:
            throw r0     // Catch:{ all -> 0x0c9f }
        L_0x0c9f:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x11d0 }
            throw r0
        L_0x0ca4:
            boolean r2 = r1 instanceof X.AnonymousClass2EQ
            if (r2 == 0) goto L_0x0cff
            X.2EQ r1 = (X.AnonymousClass2EQ) r1
            java.lang.String r2 = "_id"
            int r9 = r0.getColumnIndexOrThrow(r2)
            r8 = 0
            r3 = -1
            r7 = 0
        L_0x0cb4:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x0cf9
            long r3 = r0.getLong(r9)
            r10 = 0
            X.0th r6 = r1.A00     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x0ce4 }
            X.0tZ r5 = r6.A01(r0)     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x0ce4 }
            X.1rO r5 = (X.C38771rO) r5     // Catch:{ SQLException -> 0x0cf7, Exception -> 0x0ce4 }
            if (r5 == 0) goto L_0x0cb4
            X.17p r2 = r1.A02
            r2.A00(r5)
            r5.A0n(r10)
            X.17G r2 = r1.A01     // Catch:{ IOException -> 0x0cd7 }
            r2.A07(r5, r8)     // Catch:{ IOException -> 0x0cd7 }
            goto L_0x0cdc
        L_0x0cd7:
            java.lang.String r2 = "MissedCallsLogDatabaseMigration/processBatch/failed to update missed call message in main message store."
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0cdc:
            X.1Vw r2 = r5.A11
            r6.A05(r2)
            int r7 = r7 + 1
            goto L_0x0cb4
        L_0x0ce4:
            r6 = move-exception
            java.lang.String r5 = "MissedCallsLogDatabaseMigration/processBatch/failed to read message with id = "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.e(r2, r6)
            goto L_0x0cb4
        L_0x0cf7:
            r0 = move-exception
            throw r0
        L_0x0cf9:
            X.2Tm r0 = new X.2Tm
            r0.<init>(r3, r7)
            return r0
        L_0x0cff:
            boolean r2 = r1 instanceof X.AnonymousClass2EU
            if (r2 == 0) goto L_0x0d7b
            X.2EU r1 = (X.AnonymousClass2EU) r1
            java.lang.String r2 = "_id"
            int r12 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "mentioned_jids"
            int r11 = r0.getColumnIndexOrThrow(r2)
            X.0tq r2 = r1.A05
            X.0tf r10 = r2.A02()
            r9 = 0
            r3 = -1
            r8 = 0
        L_0x0d1b:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0d6d
            long r3 = r0.getLong(r12)     // Catch:{ all -> 0x0d76 }
            java.lang.String r2 = r0.getString(r11)     // Catch:{ all -> 0x0d76 }
            java.util.List r2 = X.C39501sa.A01(r2)     // Catch:{ all -> 0x0d76 }
            if (r2 != 0) goto L_0x0d32
            int r8 = r8 + 1
            goto L_0x0d1b
        L_0x0d32:
            java.util.Iterator r14 = r2.iterator()     // Catch:{ all -> 0x0d76 }
        L_0x0d36:
            boolean r2 = r14.hasNext()     // Catch:{ all -> 0x0d76 }
            if (r2 == 0) goto L_0x0d6a
            java.lang.Object r6 = r14.next()     // Catch:{ all -> 0x0d76 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x0d76 }
            if (r6 == 0) goto L_0x0d36
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0d76 }
            r7.<init>()     // Catch:{ all -> 0x0d76 }
            java.lang.String r5 = "message_row_id"
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0d76 }
            r7.put(r5, r2)     // Catch:{ all -> 0x0d76 }
            java.lang.String r13 = "jid_row_id"
            X.14v r2 = r1.A00     // Catch:{ all -> 0x0d76 }
            long r5 = r2.A01(r6)     // Catch:{ all -> 0x0d76 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d76 }
            r7.put(r13, r2)     // Catch:{ all -> 0x0d76 }
            X.0tg r6 = r10.A02     // Catch:{ all -> 0x0d76 }
            java.lang.String r5 = "message_mentions"
            r2 = 4
            r6.A06(r7, r5, r2)     // Catch:{ all -> 0x0d76 }
            goto L_0x0d36
        L_0x0d6a:
            int r9 = r9 + 1
            goto L_0x0d1b
        L_0x0d6d:
            r10.close()
            X.2Tm r0 = new X.2Tm
            r0.<init>(r9, r3, r8)
            return r0
        L_0x0d76:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x11d0 }
            throw r0
        L_0x0d7b:
            boolean r2 = r1 instanceof X.AnonymousClass2EL
            if (r2 == 0) goto L_0x0f09
            X.2EL r1 = (X.AnonymousClass2EL) r1
            java.lang.String r2 = "_id"
            int r12 = r0.getColumnIndexOrThrow(r2)
            X.0tq r2 = r1.A05
            X.0tf r8 = r2.A02()
            r17 = 0
            r4 = -1
            r9 = 0
            r16 = 0
        L_0x0d94:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0fb9 }
            if (r2 == 0) goto L_0x0fb0
            long r4 = r0.getLong(r12)     // Catch:{ all -> 0x0fb9 }
            X.17G r7 = r1.A02     // Catch:{ all -> 0x0fb9 }
            X.0tZ r6 = r7.A00(r0)     // Catch:{ all -> 0x0fb9 }
            if (r6 != 0) goto L_0x0dbb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0fb9 }
            r3.<init>()     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "MainMessageStore/MainMessageDatabaseMigration/processBatch/missing message; rowId="
            r3.append(r2)     // Catch:{ all -> 0x0fb9 }
            r3.append(r4)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0fb9 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0fb9 }
            goto L_0x0d94
        L_0x0dbb:
            r11 = 1
            if (r9 != 0) goto L_0x0de9
            if (r16 != 0) goto L_0x0deb
            X.0tg r14 = r8.A02     // Catch:{ all -> 0x0fb9 }
            java.lang.String r13 = "SELECT COUNT(1) AS count FROM message WHERE _id >= ? LIMIT 1"
            java.lang.String[] r10 = new java.lang.String[r11]     // Catch:{ all -> 0x0fb9 }
            long r2 = r6.A13     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            r10[r17] = r2     // Catch:{ all -> 0x0fb9 }
            android.database.Cursor r3 = r14.A08(r13, r10)     // Catch:{ all -> 0x0fb9 }
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0f02 }
            if (r2 == 0) goto L_0x0de6
            java.lang.String r2 = "count"
            int r2 = r3.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0f02 }
            int r2 = r3.getInt(r2)     // Catch:{ all -> 0x0f02 }
            if (r2 <= 0) goto L_0x0de6
            r16 = 1
        L_0x0de6:
            r3.close()     // Catch:{ all -> 0x0fb9 }
        L_0x0de9:
            if (r16 == 0) goto L_0x0eef
        L_0x0deb:
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0fb9 }
            r10.<init>()     // Catch:{ all -> 0x0fb9 }
            long r2 = r6.A14     // Catch:{ all -> 0x0fb9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "sort_id"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            X.0ts r3 = r7.A03     // Catch:{ all -> 0x0fb9 }
            X.1Vw r13 = r6.A11     // Catch:{ all -> 0x0fb9 }
            X.0rv r2 = r13.A00     // Catch:{ all -> 0x0fb9 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x0fb9 }
            long r2 = r3.A02(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "chat_row_id"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            boolean r3 = r13.A02     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "from_me"
            X.C38611r4.A05(r10, r2, r3)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r3 = r13.A01     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "key_id"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            int r2 = r6.A0C     // Catch:{ all -> 0x0fb9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "status"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            boolean r3 = r6.A0t     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "broadcast"
            X.C38611r4.A05(r10, r2, r3)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r3 = r6.A0P()     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "text_data"
            X.C38611r4.A04(r10, r2, r3)     // Catch:{ all -> 0x0fb9 }
            long r2 = r6.A0I     // Catch:{ all -> 0x0fb9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "timestamp"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            byte r2 = r6.A10     // Catch:{ all -> 0x0fb9 }
            java.lang.Byte r3 = java.lang.Byte.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "message_type"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            X.0rv r3 = r6.A0B()     // Catch:{ all -> 0x0fb9 }
            r14 = 0
            if (r3 != 0) goto L_0x0e5f
            r2 = 0
            goto L_0x0e65
        L_0x0e5f:
            X.14v r2 = r7.A04     // Catch:{ all -> 0x0fb9 }
            long r2 = r2.A01(r3)     // Catch:{ all -> 0x0fb9 }
        L_0x0e65:
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "sender_jid_row_id"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            long r2 = r6.A0G     // Catch:{ all -> 0x0fb9 }
            int r13 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x0e7b
            X.0t3 r2 = r7.A02     // Catch:{ all -> 0x0fb9 }
            long r2 = r2.A00()     // Catch:{ all -> 0x0fb9 }
        L_0x0e7b:
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "received_timestamp"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            long r2 = r6.A0H     // Catch:{ all -> 0x0fb9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "receipt_server_timestamp"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            int r2 = r6.A0A     // Catch:{ all -> 0x0fb9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "recipient_count"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r3 = r6.A0m     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "participant_hash"
            X.C38611r4.A04(r10, r2, r3)     // Catch:{ all -> 0x0fb9 }
            boolean r3 = r6.A0x     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "starred"
            X.C38611r4.A05(r10, r2, r3)     // Catch:{ all -> 0x0fb9 }
            int r2 = r6.A07()     // Catch:{ all -> 0x0fb9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "origination_flags"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            int r2 = r6.A08     // Catch:{ all -> 0x0fb9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "origin"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            long r2 = r6.A0A()     // Catch:{ all -> 0x0fb9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "lookup_tables"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            int r2 = r6.A07     // Catch:{ all -> 0x0fb9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "message_add_on_flags"
            r10.put(r2, r3)     // Catch:{ all -> 0x0fb9 }
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch:{ all -> 0x0fb9 }
            long r2 = r6.A13     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0fb9 }
            r13[r17] = r2     // Catch:{ all -> 0x0fb9 }
            X.0tg r11 = r8.A02     // Catch:{ all -> 0x0fb9 }
            java.lang.String r3 = "message"
            java.lang.String r2 = "_id = ?"
            int r2 = r11.A00(r3, r10, r2, r13)     // Catch:{ all -> 0x0fb9 }
            if (r2 != 0) goto L_0x0efe
        L_0x0eef:
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0fb9 }
            r10.<init>()     // Catch:{ all -> 0x0fb9 }
            r7.A03(r10, r6)     // Catch:{ all -> 0x0fb9 }
            X.0tg r3 = r8.A02     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "message"
            r3.A03(r10, r2)     // Catch:{ all -> 0x0fb9 }
        L_0x0efe:
            int r9 = r9 + 1
            goto L_0x0d94
        L_0x0f02:
            r0 = move-exception
            if (r3 == 0) goto L_0x0f08
            r3.close()     // Catch:{ all -> 0x0f08 }
        L_0x0f08:
            throw r0     // Catch:{ all -> 0x0fb9 }
        L_0x0f09:
            boolean r2 = r1 instanceof X.AnonymousClass2EK
            if (r2 == 0) goto L_0x0fbe
            java.lang.String r2 = "_id"
            int r14 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r13 = "chat_row_id"
            int r12 = r0.getColumnIndexOrThrow(r13)
            java.lang.String r2 = "data"
            int r11 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_caption"
            int r10 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "message_type"
            int r7 = r0.getColumnIndexOrThrow(r2)
            X.0tq r1 = r1.A05
            X.0tf r8 = r1.A02()
            r4 = -1
            r9 = 0
        L_0x0f34:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0fb9 }
            if (r1 == 0) goto L_0x0fb0
            int r2 = r0.getInt(r7)     // Catch:{ all -> 0x0fb9 }
            r3 = 0
            if (r2 == 0) goto L_0x0f60
            r1 = 1
            if (r2 == r1) goto L_0x0f65
            r1 = 3
            if (r2 == r1) goto L_0x0f65
            r1 = 13
            if (r2 == r1) goto L_0x0f65
            r1 = 23
            if (r2 == r1) goto L_0x0f65
            r1 = 25
            if (r2 == r1) goto L_0x0f65
            r1 = 37
            if (r2 == r1) goto L_0x0f65
            r1 = 28
            if (r2 == r1) goto L_0x0f65
            r1 = 29
            if (r2 == r1) goto L_0x0f65
            goto L_0x0f69
        L_0x0f60:
            java.lang.String r3 = r0.getString(r11)     // Catch:{ all -> 0x0fb9 }
            goto L_0x0f69
        L_0x0f65:
            java.lang.String r3 = r0.getString(r10)     // Catch:{ all -> 0x0fb9 }
        L_0x0f69:
            long r4 = r0.getLong(r14)     // Catch:{ all -> 0x0fb9 }
            java.util.ArrayList r18 = X.C30931dC.A04(r3)     // Catch:{ all -> 0x0fb9 }
            long r16 = r0.getLong(r12)     // Catch:{ all -> 0x0fb9 }
            r2 = 0
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0f34
            if (r18 == 0) goto L_0x0fad
            r15 = 0
        L_0x0f7e:
            int r1 = r18.size()     // Catch:{ all -> 0x0fb9 }
            if (r15 >= r1) goto L_0x0fad
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0fb9 }
            r6.<init>()     // Catch:{ all -> 0x0fb9 }
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0fb9 }
            r6.put(r13, r1)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "message_row_id"
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0fb9 }
            r6.put(r2, r1)     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "link_index"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0fb9 }
            r6.put(r2, r1)     // Catch:{ all -> 0x0fb9 }
            X.0tg r3 = r8.A02     // Catch:{ all -> 0x0fb9 }
            java.lang.String r2 = "message_link"
            r1 = 4
            r3.A06(r6, r2, r1)     // Catch:{ all -> 0x0fb9 }
            int r15 = r15 + 1
            goto L_0x0f7e
        L_0x0fad:
            int r9 = r9 + 1
            goto L_0x0f34
        L_0x0fb0:
            r8.close()
        L_0x0fb3:
            X.2Tm r0 = new X.2Tm
            r0.<init>(r4, r9)
            return r0
        L_0x0fb9:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x11d0 }
            throw r0
        L_0x0fbe:
            boolean r2 = r1 instanceof X.AnonymousClass2EH
            if (r2 == 0) goto L_0x103d
            X.2EH r1 = (X.AnonymousClass2EH) r1
            java.lang.String r2 = "_id"
            int r12 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r11 = "label_id"
            int r10 = r0.getColumnIndexOrThrow(r11)
            java.lang.String r2 = "jid"
            int r9 = r0.getColumnIndexOrThrow(r2)
            r3 = -1
            r6 = 0
        L_0x0fd9:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x1037
            long r3 = r0.getLong(r12)
            long r14 = r0.getLong(r10)
            java.lang.String r7 = r0.getString(r9)
            X.0rv r5 = X.C15830rv.A02(r7)
            if (r5 == 0) goto L_0x1020
            android.content.ContentValues r13 = new android.content.ContentValues
            r13.<init>()
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            r13.put(r11, r2)
            X.14v r2 = r1.A00
            long r7 = r2.A01(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.lang.String r2 = "jid_row_id"
            r13.put(r2, r5)
            X.0tq r2 = r1.A05
            X.0tf r7 = r2.A02()
            X.0tg r8 = r7.A02     // Catch:{ all -> 0x11cc }
            java.lang.String r5 = "labeled_jid"
            r2 = 5
            r8.A06(r13, r5, r2)     // Catch:{ all -> 0x11cc }
            r7.close()
            int r6 = r6 + 1
            goto L_0x0fd9
        L_0x1020:
            java.lang.String r5 = "LabelJidStore/processBatch/invalid jid in original table, jid="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x0fd9
        L_0x1032:
            java.lang.String r0 = "BlankMeJidDatabaseMigration/processBatch/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x1037:
            X.2Tm r0 = new X.2Tm
            r0.<init>(r3, r6)
            return r0
        L_0x103d:
            boolean r2 = r1 instanceof X.C46482El
            if (r2 == 0) goto L_0x1156
            java.lang.String r10 = "message_row_id"
            int r23 = r0.getColumnIndexOrThrow(r10)
            java.lang.String r9 = "element_type"
            int r22 = r0.getColumnIndexOrThrow(r9)
            java.lang.String r8 = "reply_values"
            int r7 = r0.getColumnIndexOrThrow(r8)
            java.lang.String r6 = "reply_description"
            int r5 = r0.getColumnIndexOrThrow(r6)
            X.0tq r1 = r1.A05
            r24 = r1
            X.0tf r4 = r24.A02()
            X.1cj r21 = r4.A00()     // Catch:{ all -> 0x1151 }
            r2 = -1
            r11 = 0
        L_0x1068:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x114c }
            if (r1 == 0) goto L_0x113d
            r1 = r23
            long r2 = r0.getLong(r1)     // Catch:{ all -> 0x114c }
            X.0tf r1 = r24.get()     // Catch:{ all -> 0x114c }
            X.0tg r14 = r1.A02     // Catch:{ all -> 0x1138 }
            java.lang.String r13 = "SELECT _id, quoted_row_id FROM messages WHERE _id = ?"
            r12 = 1
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ all -> 0x1138 }
            r15 = 0
            java.lang.String r20 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x1138 }
            r12[r15] = r20     // Catch:{ all -> 0x1138 }
            android.database.Cursor r12 = r14.A08(r13, r12)     // Catch:{ all -> 0x1138 }
            boolean r13 = r12.moveToNext()     // Catch:{ all -> 0x1131 }
            if (r13 == 0) goto L_0x1110
            java.lang.String r13 = "quoted_row_id"
            int r13 = r12.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x1131 }
            long r18 = r12.getLong(r13)     // Catch:{ all -> 0x1131 }
            r12.close()     // Catch:{ all -> 0x1138 }
            r1.close()     // Catch:{ all -> 0x114c }
            r12 = 0
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x1116
            X.0tf r13 = r24.get()     // Catch:{ all -> 0x114c }
            X.0tg r14 = r13.A02     // Catch:{ all -> 0x112c }
            java.lang.String r12 = "SELECT media_wa_type FROM messages_quotes WHERE _id = ?"
            r15 = 1
            java.lang.String[] r1 = new java.lang.String[r15]     // Catch:{ all -> 0x112c }
            java.lang.String r17 = java.lang.Long.toString(r18)     // Catch:{ all -> 0x112c }
            r16 = 0
            r1[r16] = r17     // Catch:{ all -> 0x112c }
            android.database.Cursor r14 = r14.A08(r12, r1)     // Catch:{ all -> 0x112c }
            boolean r1 = r14.moveToNext()     // Catch:{ all -> 0x1125 }
            if (r1 == 0) goto L_0x1109
            java.lang.String r1 = "media_wa_type"
            int r1 = r14.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x1125 }
            int r12 = r14.getInt(r1)     // Catch:{ all -> 0x1125 }
            r1 = 46
            if (r12 == r1) goto L_0x10d2
            r15 = 0
        L_0x10d2:
            r14.close()     // Catch:{ all -> 0x112c }
            r13.close()     // Catch:{ all -> 0x114c }
            if (r15 == 0) goto L_0x1116
            r1 = 4
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x114c }
            r13.<init>(r1)     // Catch:{ all -> 0x114c }
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x114c }
            r13.put(r10, r1)     // Catch:{ all -> 0x114c }
            r1 = r22
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x114c }
            r13.put(r9, r1)     // Catch:{ all -> 0x114c }
            byte[] r1 = r0.getBlob(r7)     // Catch:{ all -> 0x114c }
            r13.put(r8, r1)     // Catch:{ all -> 0x114c }
            java.lang.String r1 = r0.getString(r5)     // Catch:{ all -> 0x114c }
            r13.put(r6, r1)     // Catch:{ all -> 0x114c }
            X.0tg r12 = r4.A02     // Catch:{ all -> 0x114c }
            java.lang.String r1 = "message_quoted_ui_elements_reply_legacy"
            r12.A02(r13, r1)     // Catch:{ all -> 0x114c }
            int r11 = r11 + 1
            goto L_0x1068
        L_0x1109:
            r14.close()     // Catch:{ all -> 0x112c }
            r13.close()     // Catch:{ all -> 0x114c }
            goto L_0x1116
        L_0x1110:
            r12.close()     // Catch:{ all -> 0x1138 }
            r1.close()     // Catch:{ all -> 0x114c }
        L_0x1116:
            X.0tg r13 = r4.A02     // Catch:{ all -> 0x114c }
            r1 = 1
            java.lang.String[] r12 = new java.lang.String[r1]     // Catch:{ all -> 0x114c }
            r1 = 0
            r12[r1] = r20     // Catch:{ all -> 0x114c }
            java.lang.String r1 = "DELETE FROM message_quoted_ui_elements_reply WHERE message_row_id = ?"
            r13.A0C(r1, r12)     // Catch:{ all -> 0x114c }
            goto L_0x1068
        L_0x1125:
            r0 = move-exception
            if (r14 == 0) goto L_0x112b
            r14.close()     // Catch:{ all -> 0x112b }
        L_0x112b:
            throw r0     // Catch:{ all -> 0x112c }
        L_0x112c:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x113c }
            goto L_0x113c
        L_0x1131:
            r0 = move-exception
            if (r12 == 0) goto L_0x1137
            r12.close()     // Catch:{ all -> 0x1137 }
        L_0x1137:
            throw r0     // Catch:{ all -> 0x1138 }
        L_0x1138:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x113c }
        L_0x113c:
            throw r0     // Catch:{ all -> 0x114c }
        L_0x113d:
            r21.A00()     // Catch:{ all -> 0x114c }
            r21.close()     // Catch:{ all -> 0x1151 }
            r4.close()
            X.2Tm r0 = new X.2Tm
            r0.<init>(r2, r11)
            return r0
        L_0x114c:
            r0 = move-exception
            r21.close()     // Catch:{ all -> 0x1150 }
        L_0x1150:
            throw r0     // Catch:{ all -> 0x1151 }
        L_0x1151:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x11d0 }
            throw r0
        L_0x1156:
            boolean r2 = r1 instanceof X.AnonymousClass2EP
            if (r2 == 0) goto L_0x11d1
            java.lang.String r2 = "_id"
            int r10 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_duration"
            int r9 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "raw_data"
            int r8 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r6 = "future_message_type"
            int r5 = r0.getColumnIndexOrThrow(r6)
            X.0tq r1 = r1.A05
            X.0tf r7 = r1.A02()
            r2 = -1
            r12 = 0
        L_0x117b:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x11cc }
            if (r1 == 0) goto L_0x11bf
            long r2 = r0.getLong(r10)     // Catch:{ all -> 0x11cc }
            int r15 = r0.getInt(r9)     // Catch:{ all -> 0x11cc }
            byte[] r13 = r0.getBlob(r8)     // Catch:{ all -> 0x11cc }
            int r14 = r0.getInt(r5)     // Catch:{ all -> 0x11cc }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x11cc }
            r11.<init>()     // Catch:{ all -> 0x11cc }
            java.lang.String r4 = "message_row_id"
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x11cc }
            r11.put(r4, r1)     // Catch:{ all -> 0x11cc }
            java.lang.String r4 = "version"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x11cc }
            r11.put(r4, r1)     // Catch:{ all -> 0x11cc }
            java.lang.String r1 = "data"
            X.C38611r4.A06(r11, r1, r13)     // Catch:{ all -> 0x11cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x11cc }
            r11.put(r6, r1)     // Catch:{ all -> 0x11cc }
            X.0tg r4 = r7.A02     // Catch:{ all -> 0x11cc }
            java.lang.String r1 = "message_future"
            r4.A02(r11, r1)     // Catch:{ all -> 0x11cc }
            int r12 = r12 + 1
            goto L_0x117b
        L_0x11bf:
            r7.close()
            goto L_0x11c6
        L_0x11c3:
            r18.close()
        L_0x11c6:
            X.2Tm r0 = new X.2Tm
            r0.<init>(r2, r12)
            return r0
        L_0x11cc:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x11d0 }
        L_0x11d0:
            throw r0
        L_0x11d1:
            boolean r2 = r1 instanceof X.AnonymousClass2EJ
            if (r2 == 0) goto L_0x124a
            X.2EJ r1 = (X.AnonymousClass2EJ) r1
            r5 = 0
            int r3 = r0.getCount()     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x1242 }
            r2 = 1
            if (r3 == r2) goto L_0x11e0
            r2 = 0
        L_0x11e0:
            X.17F r8 = r1.A00     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            java.util.Map r10 = r1.A01     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            r11 = 5
            r1 = -5
            X.1xn r13 = X.C42441xn.A00(r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            java.lang.String r1 = "_id"
            int r3 = r0.getColumnIndexOrThrow(r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            java.lang.String r1 = "chat_row_id"
            int r4 = r0.getColumnIndexOrThrow(r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            r1 = 0
        L_0x11f8:
            boolean r6 = r0.moveToNext()     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            if (r6 == 0) goto L_0x1233
            X.0tZ r9 = r8.A0A(r0, r4, r3)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            if (r9 != 0) goto L_0x1213
            int r1 = r1 + 1
            long r17 = r0.getLong(r3)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            r15 = -9223372036854775808
            r14 = -6
            X.1xn r13 = new X.1xn     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            r13.<init>(r14, r15, r17)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            goto L_0x11f8
        L_0x1213:
            r13 = 1
            X.1xn r13 = r8.A07(r9, r10, r11, r13)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            int r7 = r13.A00     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            r6 = -6
            if (r7 != r6) goto L_0x1229
            long r15 = r9.A14     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            long r6 = r9.A13     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            X.1xn r13 = new X.1xn     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            r14 = 1
            r17 = r6
            r13.<init>(r14, r15, r17)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
        L_0x1229:
            X.0th r7 = r8.A06     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            X.1Vw r6 = r9.A11     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            r7.A05(r6)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            int r1 = r1 + 1
            goto L_0x11f8
        L_0x1233:
            long r6 = r13.A01     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            X.2Tm r3 = new X.2Tm     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            r3.<init>(r6, r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x123b }
            return r3
        L_0x123b:
            if (r2 == 0) goto L_0x1242
            java.lang.String r0 = "FtsDatabaseMigration/skipping single row"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x1242:
            r0 = -1
            X.2Tm r3 = new X.2Tm
            r3.<init>(r0, r5)
            return r3
        L_0x124a:
            boolean r2 = r1 instanceof X.AnonymousClass2EW
            if (r2 == 0) goto L_0x12dc
            X.2EW r1 = (X.AnonymousClass2EW) r1
            java.lang.String r2 = "_id"
            int r18 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "jid"
            int r17 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "type"
            int r16 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "message_count"
            int r13 = r0.getColumnIndexOrThrow(r2)
            r8 = -1
            r12 = 0
        L_0x126c:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x12d6
            X.17C r11 = r1.A02
            java.lang.String r2 = "INSERT INTO frequent(jid_row_id, type, message_count) VALUES (?, ?, ?)"
            X.1ou r10 = r11.A00(r2)
            r2 = r18
            long r8 = r0.getLong(r2)
            r2 = r17
            java.lang.String r14 = r0.getString(r2)
            r2 = r16
            long r6 = r0.getLong(r2)
            long r4 = r0.getLong(r13)
            X.0rv r3 = X.C15830rv.A02(r14)
            if (r3 == 0) goto L_0x12c4
            X.14v r2 = r1.A01
            long r2 = r2.A01(r3)
            r14 = 1
            r10.A01(r14, r2)
            r15 = 2
            r10.A01(r15, r6)
            r14 = 3
            r10.A01(r14, r4)
            android.database.sqlite.SQLiteStatement r10 = r10.A00     // Catch:{ SQLiteConstraintException -> 0x12ae }
            r10.executeInsert()     // Catch:{ SQLiteConstraintException -> 0x12ae }
            goto L_0x12c1
        L_0x12ae:
            java.lang.String r10 = "UPDATE frequent   SET message_count = ? WHERE jid_row_id = ? AND type = ?"
            X.1ou r10 = r11.A00(r10)
            r10.A01(r15, r2)
            r10.A01(r14, r6)
            r2 = 1
            r10.A01(r2, r4)
            r10.A00()
        L_0x12c1:
            int r12 = r12 + 1
            goto L_0x126c
        L_0x12c4:
            java.lang.String r3 = "FrequentMessageStore/processBatch/invalid jid in original table, jid="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x126c
        L_0x12d6:
            X.2Tm r0 = new X.2Tm
            r0.<init>(r8, r12)
            return r0
        L_0x12dc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x12e2:
            r2 = 0
            r1 = 0
            X.2Tm r0 = new X.2Tm
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30111bl.A09(android.database.Cursor):X.2Tm");
    }

    public String A0A() {
        if (this instanceof AnonymousClass2EO) {
            return "new_vcards_ready";
        }
        if (this instanceof C46402Ed) {
            return "thumbnail_ready";
        }
        if (this instanceof AnonymousClass2EN) {
            return "text_ready";
        }
        if (this instanceof AnonymousClass2ET) {
            return "system_message_ready";
        }
        if (this instanceof C46392Ec) {
            return "send_count_ready";
        }
        if (this instanceof AnonymousClass2EV) {
            return "revoked_ready";
        }
        if (this instanceof AnonymousClass2ER) {
            return "quoted_message_ready";
        }
        if (this instanceof C46412Ee) {
            return "new_pay_transaction_ready";
        }
        if (this instanceof C46472Ek) {
            return "quoted_order_message_v2_migration_ready";
        }
        if (this instanceof C46462Ej) {
            return "quoted_order_message_ready";
        }
        if (this instanceof AnonymousClass2EU) {
            return "mention_message_ready";
        }
        if (this instanceof AnonymousClass2EL) {
            return "main_message_ready";
        }
        if (this instanceof AnonymousClass2EX) {
            return "location_ready";
        }
        if (this instanceof AnonymousClass2EK) {
            return "links_ready";
        }
        if (this instanceof AnonymousClass2EH) {
            return "labeled_jids_ready";
        }
        if (this instanceof C46482El) {
            return "quoted_ui_elements_reply_message_migration_ready";
        }
        if (this instanceof AnonymousClass2EP) {
            return "future_ready";
        }
        if (this instanceof AnonymousClass2EW) {
            return "frequent_ready";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0C);
        sb.append("_complete");
        return sb.toString();
    }

    public String A0B() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0C);
        sb.append("_in_progress");
        return sb.toString();
    }

    public String A0C() {
        return this instanceof C46492Em ? "rename_deprecated_tables_retry_count" : this instanceof AnonymousClass2EY ? "migration_participant_user_retry" : this instanceof C46422Ef ? "migration_jid_store_retry_count" : this instanceof C46502En ? "drop_deprecated_tables_retry_count" : this instanceof C46432Eg ? "migration_chat_store_retry_count" : this instanceof AnonymousClass2EZ ? "migration_broadcast_me_jid_retry" : this instanceof C46442Eh ? "migration_blank_me_jid_retry" : this instanceof AnonymousClass2EO ? "migration_vcard_retry" : this instanceof C46402Ed ? "migration_message_thumbnail_retry" : this instanceof AnonymousClass2EN ? "migration_message_text_retry" : this instanceof AnonymousClass2ET ? "migration_message_system_retry" : this instanceof C46392Ec ? "migration_message_send_count_retry" : this instanceof AnonymousClass2EV ? "migration_message_revoked_retry" : this instanceof AnonymousClass2EM ? "migration_receipt_retry" : this instanceof AnonymousClass2ER ? "migration_message_quoted_retry" : this instanceof C46412Ee ? "migration_pay_transaction_retry" : this instanceof C46472Ek ? "quoted_order_message_v2_retry_count" : this instanceof C46462Ej ? "quoted_order_message_retry_count" : this instanceof AnonymousClass2EQ ? "migration_missed_calls_log_retry" : this instanceof AnonymousClass2ES ? "migration_receipt_device_retry" : this instanceof AnonymousClass2EU ? "migration_message_mention_retry" : this instanceof C46372Ea ? ((C46372Ea) this) instanceof C46382Eb ? "migration_message_media_fixer_retry" : "migration_message_media_retry" : this instanceof AnonymousClass2EL ? "migration_message_main_retry" : this instanceof AnonymousClass2EX ? "migration_message_location_retry" : this instanceof AnonymousClass2EK ? "migration_link_retry" : this instanceof AnonymousClass2EH ? "migration_labeled_jid_retry" : this instanceof C46482El ? "quoted_ui_elements_reply_message_retry_count" : this instanceof AnonymousClass2EP ? "migration_message_future_retry" : this instanceof AnonymousClass2EJ ? "migration_fts_retry" : this instanceof AnonymousClass2EW ? "migration_frequent_retry" : "call_log_retry_count";
    }

    public String A0D() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0C);
        sb.append("_retry_revision");
        return sb.toString();
    }

    public String A0E() {
        return this instanceof C46492Em ? "rename_deprecated_tables_start_index" : this instanceof AnonymousClass2EY ? "migration_participant_user_index" : this instanceof C46422Ef ? "migration_jid_store_start_index" : this instanceof C46502En ? "drop_deprecated_tables_start_index" : this instanceof C46432Eg ? "migration_chat_store_start_index" : this instanceof AnonymousClass2EZ ? "migration_broadcast_me_jid_index" : this instanceof C46442Eh ? "migration_blank_me_jid_index" : this instanceof AnonymousClass2EO ? "migration_vcard_index" : this instanceof C46402Ed ? "migration_message_thumbnail_index" : this instanceof AnonymousClass2EN ? "migration_message_text_index" : this instanceof AnonymousClass2ET ? "migration_message_system_index" : this instanceof C46392Ec ? "migration_message_send_count_index" : this instanceof AnonymousClass2EV ? "migration_message_revoked_index" : this instanceof AnonymousClass2EM ? "migration_receipt_index" : this instanceof AnonymousClass2ER ? "migration_message_quoted_index" : this instanceof C46412Ee ? "migration_pay_transaction_index" : this instanceof C46472Ek ? "quoted_order_message_v2_start_index" : this instanceof C46462Ej ? "quoted_order_message_start_index" : this instanceof AnonymousClass2EQ ? "migration_missed_calls_log_index" : this instanceof AnonymousClass2ES ? "migration_receipt_device_index" : this instanceof AnonymousClass2EU ? "migration_message_mention_index" : this instanceof C46372Ea ? ((C46372Ea) this) instanceof C46382Eb ? "migration_message_media_fixer_index" : "migration_message_media_index" : this instanceof AnonymousClass2EL ? "migration_message_main_index" : this instanceof AnonymousClass2EX ? "migration_message_location_index" : this instanceof AnonymousClass2EK ? "migration_link_index" : this instanceof AnonymousClass2EH ? "migration_labeled_jid_index" : this instanceof C46482El ? "quoted_ui_elements_reply_message_start_index" : this instanceof AnonymousClass2EP ? "migration_message_future_index" : this instanceof AnonymousClass2EJ ? "migration_fts_index" : this instanceof AnonymousClass2EW ? "migration_frequent_index" : "call_log_start_index";
    }

    public Set A0F() {
        HashSet hashSet;
        String str;
        if (this instanceof C46492Em) {
            hashSet = new HashSet();
            hashSet.add("message_main");
            hashSet.add("message_fts");
            hashSet.add("quoted_order_message_v2");
            hashSet.add("receipt_user");
            str = "receipt_device";
        } else if (this instanceof AnonymousClass2EY) {
            hashSet = new HashSet();
            hashSet.add("migration_jid_store");
            hashSet.add("migration_chat_store");
            str = "blank_me_jid";
        } else if (this instanceof C46502En) {
            hashSet = new HashSet();
            str = "rename_deprecated_tables";
        } else if (this instanceof C46432Eg) {
            return Collections.singleton("migration_jid_store");
        } else {
            if (this instanceof AnonymousClass2EZ) {
                hashSet = new HashSet();
                hashSet.add("migration_jid_store");
                hashSet.add("migration_chat_store");
                str = "participant_user";
            } else {
                if (!(this instanceof C46442Eh) && !(this instanceof AnonymousClass2EO) && !(this instanceof C46402Ed)) {
                    if (this instanceof AnonymousClass2EN) {
                        hashSet = new HashSet();
                        hashSet.add("migration_jid_store");
                        hashSet.add("migration_chat_store");
                        str = "message_thumbnail";
                    } else if (this instanceof AnonymousClass2ET) {
                        hashSet = new HashSet();
                        hashSet.add("migration_jid_store");
                        hashSet.add("migration_chat_store");
                        str = "message_quoted";
                    } else if (!(this instanceof C46392Ec) && !(this instanceof AnonymousClass2EV) && !(this instanceof AnonymousClass2EM) && !(this instanceof AnonymousClass2ER) && !(this instanceof C46412Ee)) {
                        if (this instanceof C46472Ek) {
                            hashSet = new HashSet();
                            str = "quoted_order_message";
                        } else if (!(this instanceof AnonymousClass2EQ) && !(this instanceof AnonymousClass2ES) && !(this instanceof AnonymousClass2EU) && !(this instanceof C46372Ea)) {
                            if (this instanceof AnonymousClass2EL) {
                                hashSet = new HashSet();
                                hashSet.add("migration_jid_store");
                                hashSet.add("migration_chat_store");
                                hashSet.add("message_frequent");
                                hashSet.add("message_future");
                                hashSet.add("labeled_jid");
                                hashSet.add("message_link");
                                hashSet.add("message_location");
                                hashSet.add("message_media");
                                hashSet.add("media_migration_fixer");
                                hashSet.add("message_mention");
                                hashSet.add("missed_calls");
                                hashSet.add("payment_transaction");
                                hashSet.add("message_quoted");
                                hashSet.add("message_revoked");
                                hashSet.add("message_send_count");
                                hashSet.add("message_system");
                                hashSet.add("message_text");
                                hashSet.add("message_thumbnail");
                                hashSet.add("message_vcard");
                                str = "call_log";
                            } else if (!(this instanceof AnonymousClass2EX) && !(this instanceof AnonymousClass2EK) && !(this instanceof AnonymousClass2EH) && !(this instanceof AnonymousClass2EP) && !(this instanceof AnonymousClass2EW)) {
                                return new HashSet();
                            }
                        }
                    }
                }
                hashSet = new HashSet();
                hashSet.add("migration_jid_store");
                str = "migration_chat_store";
            }
        }
        hashSet.add(str);
        return hashSet;
    }

    public void A0G() {
        AnonymousClass11I r2 = this.A06;
        r2.A03(A0E());
        r2.A03(A0C());
        r2.A03(A0D());
        int i2 = this.A00;
        if (Integer.MIN_VALUE != i2) {
            r2.A03(A0B());
            r2.A04(A0A(), i2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00bb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass2EI
            if (r0 != 0) goto L_0x000f
            X.0so r3 = r8.A01
            java.lang.String r2 = r8.A0C
            r1 = 0
            java.lang.String r0 = "db-rollbacks-not-supported"
            r3.AcB(r0, r2, r1)
            return
        L_0x000f:
            r5 = r8
            X.2EI r5 = (X.AnonymousClass2EI) r5
            r0 = 0
            X.1Zf r3 = new X.1Zf
            r3.<init>((boolean) r0)
            r3.A03()
            r5.ANa()     // Catch:{ all -> 0x00bc }
            X.0tq r0 = r8.A05     // Catch:{ all -> 0x00bc }
            X.0tf r7 = r0.A02()     // Catch:{ all -> 0x00bc }
            X.1cj r6 = r7.A00()     // Catch:{ all -> 0x00b7 }
            int r1 = r8.A00     // Catch:{ Exception -> 0x00a7 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x0048
            X.11I r4 = r8.A06     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r8.A0B()     // Catch:{ Exception -> 0x00a7 }
            r4.A03(r0)     // Catch:{ Exception -> 0x00a7 }
            boolean r0 = r8 instanceof X.AnonymousClass2EK     // Catch:{ Exception -> 0x00a7 }
            if (r0 == 0) goto L_0x003d
            r2 = 1
            goto L_0x003e
        L_0x003d:
            r2 = -1
        L_0x003e:
            r1 = -1
            java.lang.String r0 = r8.A0A()     // Catch:{ Exception -> 0x00a7 }
            if (r2 == r1) goto L_0x0073
            r4.A04(r0, r2)     // Catch:{ Exception -> 0x00a7 }
        L_0x0048:
            X.11I r2 = r8.A06     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r8.A0C()     // Catch:{ Exception -> 0x00a7 }
            r2.A03(r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r8.A0D()     // Catch:{ Exception -> 0x00a7 }
            r2.A03(r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r8.A0E()     // Catch:{ Exception -> 0x00a7 }
            r2.A03(r0)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r1 = "migration_stats_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r4 = r8.A0C     // Catch:{ Exception -> 0x00a7 }
            r0.append(r4)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a7 }
            r2.A03(r0)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x0077
        L_0x0073:
            r4.A03(r0)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x0048
        L_0x0077:
            r5.onRollback()     // Catch:{ Exception -> 0x009d }
            r6.A00()     // Catch:{ all -> 0x00b2 }
            r6.close()     // Catch:{ all -> 0x00b7 }
            r7.close()     // Catch:{ all -> 0x00bc }
            r5.AMJ()
            long r2 = r3.A01()
            X.2Tp r1 = new X.2Tp
            r1.<init>()
            r1.A01 = r4
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.0t9 r0 = r8.A0B
            r0.A06(r1)
            return
        L_0x009d:
            r3 = move-exception
            X.0so r1 = r8.A01     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "rollback"
            A01(r1, r4, r0, r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b1
        L_0x00a7:
            r3 = move-exception
            X.0so r2 = r8.A01     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r8.A0C     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "before-rollback"
            A01(r2, r1, r0, r3)     // Catch:{ all -> 0x00b2 }
        L_0x00b1:
            throw r3     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            r5.AMJ()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30111bl.A0H():void");
    }

    public final void A0I(C49502Tk r7) {
        String str;
        AnonymousClass11I r4 = this.A06;
        StringBuilder sb = new StringBuilder("migration_stats_");
        sb.append(this.A0C);
        String obj = sb.toString();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("row_processed", r7.A03);
            jSONObject.put("row_skipped", r7.A04);
            jSONObject.put("db_size_change", r7.A00);
            jSONObject.put("migration_time_spent", r7.A01);
            jSONObject.put("retry_count", r7.A02);
            str = jSONObject.toString();
        } catch (JSONException e2) {
            Log.e("Failed to save migration statistics to JSON object.", e2);
            str = null;
        }
        r4.A06(obj, str);
    }

    public boolean A0J() {
        long A022 = this.A03.A02();
        long A062 = A06();
        if (A022 > A062) {
            return true;
        }
        StringBuilder sb = new StringBuilder("DatabaseMigration/hasEnoughStorageForMigration/insufficient storage for migration; name=");
        sb.append(this.A0C);
        sb.append("; availableInternalPhoneStorage=");
        sb.append(A022);
        sb.append("; minInternalStorageRequired=");
        sb.append(A062);
        Log.w(sb.toString());
        return false;
    }

    public boolean A0K() {
        return this.A06.A01(A0E(), -1) >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00da A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C46492Em
            if (r0 == 0) goto L_0x001e
            X.0tq r0 = r10.A05
            X.0tf r2 = r0.get()
            r0.A04()     // Catch:{ all -> 0x0019 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.A0D(r2)     // Catch:{ all -> 0x0019 }
            r1 = r0 ^ 1
            r2.close()
            return r1
        L_0x0019:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x02c4 }
            throw r0
        L_0x001e:
            boolean r0 = r10 instanceof X.AnonymousClass2EY
            if (r0 == 0) goto L_0x0035
            r0 = r10
            X.2EY r0 = (X.AnonymousClass2EY) r0
            X.0us r0 = r0.A02
            X.11I r1 = r0.A0B
            java.lang.String r0 = "participant_user_ready"
        L_0x002b:
            r2 = 0
            int r1 = r1.A00(r0, r2)
            r0 = 2
        L_0x0031:
            if (r1 != r0) goto L_0x0034
            r2 = 1
        L_0x0034:
            return r2
        L_0x0035:
            boolean r0 = r10 instanceof X.C46422Ef
            if (r0 == 0) goto L_0x004d
            r1 = r10
            X.2Ef r1 = (X.C46422Ef) r1
            X.14v r0 = r1.A00
            boolean r0 = r0.A0C()
            r4 = 1
            if (r0 != 0) goto L_0x0245
            X.0tq r2 = r1.A05
            X.0tf r3 = r2.get()
            goto L_0x020d
        L_0x004d:
            boolean r0 = r10 instanceof X.C46502En
            if (r0 == 0) goto L_0x005c
            X.11I r1 = r10.A06
            java.lang.String r0 = "drop_deprecated_tables_status"
        L_0x0055:
            r2 = 0
            int r1 = r1.A00(r0, r2)
            r0 = 1
            goto L_0x0031
        L_0x005c:
            boolean r0 = r10 instanceof X.C46432Eg
            if (r0 == 0) goto L_0x0074
            r1 = r10
            X.2Eg r1 = (X.C46432Eg) r1
            X.0ts r0 = r1.A00
            boolean r0 = r0.A0H()
            r4 = 1
            if (r0 != 0) goto L_0x0245
            X.0tq r2 = r1.A05
            X.0tf r3 = r2.get()
            goto L_0x0224
        L_0x0074:
            boolean r0 = r10 instanceof X.AnonymousClass2EZ
            if (r0 == 0) goto L_0x007d
            X.11I r1 = r10.A06
            java.lang.String r0 = "broadcast_me_jid_ready"
            goto L_0x002b
        L_0x007d:
            boolean r0 = r10 instanceof X.C46442Eh
            if (r0 == 0) goto L_0x0086
            X.11I r1 = r10.A06
            java.lang.String r0 = "blank_me_jid_ready"
            goto L_0x0055
        L_0x0086:
            boolean r0 = r10 instanceof X.AnonymousClass2EO
            if (r0 == 0) goto L_0x0094
            r0 = r10
            X.2EO r0 = (X.AnonymousClass2EO) r0
            X.17m r0 = r0.A00
            boolean r1 = r0.A09()
        L_0x0093:
            return r1
        L_0x0094:
            boolean r0 = r10 instanceof X.C46402Ed
            if (r0 == 0) goto L_0x00a3
            r0 = r10
            X.2Ed r0 = (X.C46402Ed) r0
            X.0xN r0 = r0.A00
            X.11I r1 = r0.A03
            java.lang.String r0 = "thumbnail_ready"
            goto L_0x002b
        L_0x00a3:
            boolean r0 = r10 instanceof X.AnonymousClass2EN
            if (r0 == 0) goto L_0x00b1
            r0 = r10
            X.2EN r0 = (X.AnonymousClass2EN) r0
            X.17j r0 = r0.A01
            boolean r1 = r0.A03()
            return r1
        L_0x00b1:
            boolean r0 = r10 instanceof X.AnonymousClass2ET
            if (r0 == 0) goto L_0x00bf
            r0 = r10
            X.2ET r0 = (X.AnonymousClass2ET) r0
            X.17r r0 = r0.A01
            boolean r1 = r0.A02()
            return r1
        L_0x00bf:
            boolean r0 = r10 instanceof X.C46392Ec
            if (r0 == 0) goto L_0x00dc
            r0 = r10
            X.2Ec r0 = (X.C46392Ec) r0
            X.171 r0 = r0.A00
            X.11I r3 = r0.A01
            java.lang.String r2 = "send_count_ready"
        L_0x00cd:
            r0 = 0
            long r3 = r3.A01(r2, r0)
            r1 = 1
        L_0x00d5:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x0093
            r1 = 1
            return r1
        L_0x00dc:
            boolean r0 = r10 instanceof X.AnonymousClass2EV
            if (r0 == 0) goto L_0x00eb
            r0 = r10
            X.2EV r0 = (X.AnonymousClass2EV) r0
            X.17v r0 = r0.A01
            X.11I r3 = r0.A04
            java.lang.String r2 = "revoked_ready"
            goto L_0x00cd
        L_0x00eb:
            boolean r0 = r10 instanceof X.AnonymousClass2EM
            if (r0 == 0) goto L_0x00fa
            r0 = r10
            X.2EM r0 = (X.AnonymousClass2EM) r0
            X.1Pq r0 = r0.A04
            X.11I r1 = r0.A03
            java.lang.String r0 = "receipt_user_ready"
            goto L_0x002b
        L_0x00fa:
            boolean r0 = r10 instanceof X.AnonymousClass2ER
            if (r0 == 0) goto L_0x0108
            r0 = r10
            X.2ER r0 = (X.AnonymousClass2ER) r0
            X.17q r0 = r0.A0A
            boolean r1 = r0.A06()
            return r1
        L_0x0108:
            boolean r0 = r10 instanceof X.C46412Ee
            if (r0 == 0) goto L_0x0116
            r0 = r10
            X.2Ee r0 = (X.C46412Ee) r0
            X.16r r0 = r0.A01
            boolean r1 = r0.A0i()
            return r1
        L_0x0116:
            boolean r0 = r10 instanceof X.C46472Ek
            if (r0 == 0) goto L_0x0122
            X.0tq r0 = r10.A05
            X.0tf r5 = r0.get()
            goto L_0x0246
        L_0x0122:
            boolean r0 = r10 instanceof X.C46462Ej
            if (r0 == 0) goto L_0x012e
            X.0tq r0 = r10.A05
            X.0tf r7 = r0.get()
            goto L_0x0263
        L_0x012e:
            boolean r0 = r10 instanceof X.AnonymousClass2EQ
            if (r0 == 0) goto L_0x0138
            X.11I r1 = r10.A06
            java.lang.String r0 = "missed_calls_ready"
            goto L_0x0055
        L_0x0138:
            boolean r0 = r10 instanceof X.AnonymousClass2ES
            if (r0 == 0) goto L_0x0147
            r0 = r10
            X.2ES r0 = (X.AnonymousClass2ES) r0
            X.17B r0 = r0.A02
            X.11I r1 = r0.A02
            java.lang.String r0 = "receipt_device_migration_complete"
            goto L_0x0055
        L_0x0147:
            boolean r0 = r10 instanceof X.AnonymousClass2EU
            if (r0 == 0) goto L_0x0155
            r0 = r10
            X.2EU r0 = (X.AnonymousClass2EU) r0
            X.17w r0 = r0.A01
            boolean r1 = r0.A02()
            return r1
        L_0x0155:
            boolean r0 = r10 instanceof X.C46372Ea
            if (r0 == 0) goto L_0x016c
            r1 = r10
            X.2Ea r1 = (X.C46372Ea) r1
            boolean r0 = r1 instanceof X.C46382Eb
            if (r0 == 0) goto L_0x0297
            X.11I r1 = r1.A06
            java.lang.String r0 = "media_message_fixer_ready"
            r2 = 0
            int r1 = r1.A00(r0, r2)
            r0 = 3
            goto L_0x0031
        L_0x016c:
            boolean r0 = r10 instanceof X.AnonymousClass2EL
            if (r0 == 0) goto L_0x017a
            r0 = r10
            X.2EL r0 = (X.AnonymousClass2EL) r0
            X.17G r0 = r0.A02
            boolean r1 = r0.A09()
            return r1
        L_0x017a:
            boolean r0 = r10 instanceof X.AnonymousClass2EX
            if (r0 == 0) goto L_0x0188
            r0 = r10
            X.2EX r0 = (X.AnonymousClass2EX) r0
            X.17x r0 = r0.A01
            boolean r1 = r0.A02()
            return r1
        L_0x0188:
            boolean r0 = r10 instanceof X.AnonymousClass2EK
            if (r0 == 0) goto L_0x019f
            r0 = r10
            X.2EK r0 = (X.AnonymousClass2EK) r0
            X.17N r0 = r0.A00
            X.11I r3 = r0.A04
            java.lang.String r2 = "links_ready"
            r0 = 0
            long r3 = r3.A01(r2, r0)
            r1 = 2
            goto L_0x00d5
        L_0x019f:
            boolean r0 = r10 instanceof X.AnonymousClass2EH
            if (r0 == 0) goto L_0x01c3
            r0 = r10
            X.2EH r0 = (X.AnonymousClass2EH) r0
            X.0ws r1 = r0.A01
            X.14v r0 = r1.A01
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x01c1
            X.11I r3 = r1.A04
            r1 = 0
            java.lang.String r0 = "labeled_jids_ready"
            long r3 = r3.A01(r0, r1)
            r1 = 1
        L_0x01bc:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0093
        L_0x01c1:
            r1 = 0
            return r1
        L_0x01c3:
            boolean r0 = r10 instanceof X.C46482El
            if (r0 == 0) goto L_0x01cf
            X.0tq r0 = r10.A05
            X.0tf r5 = r0.get()
            goto L_0x029e
        L_0x01cf:
            boolean r0 = r10 instanceof X.AnonymousClass2EP
            if (r0 == 0) goto L_0x01de
            r0 = r10
            X.2EP r0 = (X.AnonymousClass2EP) r0
            X.17n r0 = r0.A00
            X.11I r3 = r0.A01
            java.lang.String r2 = "future_ready"
            goto L_0x00cd
        L_0x01de:
            boolean r0 = r10 instanceof X.AnonymousClass2EJ
            if (r0 == 0) goto L_0x01f4
            r0 = r10
            X.2EJ r0 = (X.AnonymousClass2EJ) r0
            X.17F r1 = r0.A00
            boolean r0 = r1.A0P()
            if (r0 == 0) goto L_0x01c1
            long r3 = r1.A04()
            r1 = 5
            goto L_0x01bc
        L_0x01f4:
            boolean r0 = r10 instanceof X.AnonymousClass2EW
            if (r0 == 0) goto L_0x0202
            r0 = r10
            X.2EW r0 = (X.AnonymousClass2EW) r0
            X.151 r0 = r0.A00
            boolean r1 = r0.A06()
            return r1
        L_0x0202:
            r0 = r10
            X.2Ei r0 = (X.C46452Ei) r0
            X.199 r0 = r0.A00
            X.11I r1 = r0.A04
            java.lang.String r0 = "call_log_ready"
            goto L_0x0055
        L_0x020d:
            r2.A04()     // Catch:{ all -> 0x0240 }
            X.1jC r1 = r2.A04     // Catch:{ all -> 0x0240 }
            X.0tg r0 = r3.A02     // Catch:{ all -> 0x0240 }
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x023c
            r2.A04()     // Catch:{ all -> 0x0240 }
            boolean r0 = r1.A0D(r3)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x023b
            goto L_0x023c
        L_0x0224:
            r2.A04()     // Catch:{ all -> 0x0240 }
            X.1jC r1 = r2.A04     // Catch:{ all -> 0x0240 }
            X.0tg r0 = r3.A02     // Catch:{ all -> 0x0240 }
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x023c
            r2.A04()     // Catch:{ all -> 0x0240 }
            boolean r0 = r1.A0D(r3)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x023b
            goto L_0x023c
        L_0x023b:
            r4 = 0
        L_0x023c:
            r3.close()
            return r4
        L_0x0240:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x02c4 }
            throw r0
        L_0x0245:
            return r4
        L_0x0246:
            r0.A04()     // Catch:{ all -> 0x02c0 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x02c0 }
            boolean r0 = r0.A0D(r5)     // Catch:{ all -> 0x02c0 }
            r6 = 1
            if (r0 == 0) goto L_0x02bc
            X.11I r3 = r10.A06     // Catch:{ all -> 0x02c0 }
            java.lang.String r2 = "quoted_order_message_v2_migration_ready"
            r0 = 0
            long r3 = r3.A01(r2, r0)     // Catch:{ all -> 0x02c0 }
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x02bb
            goto L_0x02bc
        L_0x0263:
            r0.A04()     // Catch:{ all -> 0x0292 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x0292 }
            boolean r0 = r0.A0D(r7)     // Catch:{ all -> 0x0292 }
            r9 = 1
            if (r0 == 0) goto L_0x028e
            X.11I r8 = r10.A06     // Catch:{ all -> 0x0292 }
            java.lang.String r0 = "quoted_order_message_ready"
            r3 = 0
            long r5 = r8.A01(r0, r3)     // Catch:{ all -> 0x0292 }
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x028e
            java.lang.String r2 = r10.A0E()     // Catch:{ all -> 0x0292 }
            r0 = -1
            long r1 = r8.A01(r2, r0)     // Catch:{ all -> 0x0292 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x028e
            r9 = 0
        L_0x028e:
            r7.close()
            return r9
        L_0x0292:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x02c4 }
            throw r0
        L_0x0297:
            X.17I r0 = r1.A01
            boolean r2 = r0.A09()
            return r2
        L_0x029e:
            r0.A04()     // Catch:{ all -> 0x02c0 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x02c0 }
            boolean r0 = r0.A0D(r5)     // Catch:{ all -> 0x02c0 }
            r6 = 1
            if (r0 == 0) goto L_0x02bc
            X.11I r3 = r10.A06     // Catch:{ all -> 0x02c0 }
            java.lang.String r2 = "quoted_ui_elements_reply_message_migration_ready"
            r0 = 0
            long r3 = r3.A01(r2, r0)     // Catch:{ all -> 0x02c0 }
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x02bb
            goto L_0x02bc
        L_0x02bb:
            r6 = 0
        L_0x02bc:
            r5.close()
            return r6
        L_0x02c0:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x02c4 }
        L_0x02c4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30111bl.A0L():boolean");
    }

    public boolean A0M() {
        if ((this instanceof AnonymousClass2EY) || (this instanceof C46422Ef) || (this instanceof C46432Eg) || (this instanceof C46442Eh)) {
            return true;
        }
        C24771Hf r1 = this.A0A;
        String str = this.A0C;
        if (!r1.A02.contains(str)) {
            return C24771Hf.A00(r1.A00.A06(C16620tM.A02, 242), str);
        }
        return true;
    }

    public boolean A0N() {
        C24781Hg r1 = this.A07;
        String str = this.A0C;
        return r1.A01.contains(str) || C24771Hf.A00(r1.A00.A00.A06(C16620tM.A02, 404), str);
    }

    public boolean A0O() {
        if ((A0L() || A0K()) && !A0Q()) {
            return true;
        }
        int i2 = this.A00;
        if (Integer.MIN_VALUE != i2) {
            AnonymousClass11I r3 = this.A06;
            int A002 = r3.A00(A0B(), -1);
            if (A0K() && A002 == -1) {
                return true;
            }
            if (A002 != -1 && A002 != i2) {
                return true;
            }
            int A003 = r3.A00(A0A(), -1);
            return A003 != -1 && (!(this instanceof AnonymousClass2EK) || 1 < A003) && A003 != i2;
        }
    }

    public boolean A0P() {
        return !(this instanceof C46422Ef) && !(this instanceof C46432Eg) && A07() > 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Q() {
        /*
            r5 = this;
            java.util.Set r0 = r5.A0F()
            java.util.Iterator r2 = r0.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            X.11D r0 = r5.A09
            X.0vs r0 = r0.A00()
            java.lang.Object r1 = r0.get(r4)
            X.1bl r1 = (X.C30111bl) r1
            r3 = 0
            if (r1 != 0) goto L_0x0046
            X.0so r2 = r5.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.A0C
            r1.append(r0)
            java.lang.String r0 = " depends on "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " (missing)"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "db-migration-missing-dep"
            r2.AcB(r0, r1, r3)
        L_0x0045:
            return r3
        L_0x0046:
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L_0x0045
            boolean r0 = r1.A0O()
            if (r0 == 0) goto L_0x0008
            return r3
        L_0x0053:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30111bl.A0Q():boolean");
    }

    public boolean A0R() {
        C16040sK r0;
        if (this instanceof AnonymousClass2EY) {
            r0 = ((AnonymousClass2EY) this).A00;
        } else if (this instanceof AnonymousClass2EZ) {
            r0 = ((AnonymousClass2EZ) this).A00;
        } else if (this instanceof C46442Eh) {
            r0 = ((C46442Eh) this).A00;
        } else if (this instanceof AnonymousClass2EM) {
            r0 = ((AnonymousClass2EM) this).A01;
        } else if (!(this instanceof AnonymousClass2ES)) {
            return !(this instanceof AnonymousClass2EL) || ((AnonymousClass2EL) this).A01.A04.A00("call_log_ready", 0) == 1;
        } else {
            r0 = ((AnonymousClass2ES) this).A00;
        }
        r0.A0B();
        return r0.A05 != null;
    }

    public boolean A0S(SQLException sQLException, int i2) {
        if (sQLException instanceof SQLiteDatabaseCorruptException) {
            return false;
        }
        boolean z2 = sQLException instanceof SQLiteBlobTooBigException;
        if (i2 != 1) {
            return z2 || (sQLException instanceof SQLiteOutOfMemoryException);
        }
        if (!z2) {
            return false;
        }
        StringBuilder sb = new StringBuilder("DatabaseMigration/shouldRetryWithSmallerBatch/error; name=");
        sb.append(this.A0C);
        sb.append("; BlobTooBigException - skipping row");
        Log.e(sb.toString());
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:231|232|233|234|235) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:266|269|270|271|272) */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x028a, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("DatabaseMigration/doMigration/conditions check requires to stop migration process; name = ");
        r1.append(r6);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0507, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("DatabaseMigration/doMigrationInSmallBatch/error; name=");
        r2.append(r6);
        r2.append("; failed preBatchWork; startIndex=");
        r2.append(r32.A04);
        r2.append("; batchSize=");
        r2.append(r8);
        com.whatsapp.util.Log.e(r2.toString(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05b7, code lost:
        if (r15 == null) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:?, code lost:
        r20 = A00(r38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x073b, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0765, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0766, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0768, code lost:
        r0 = new java.lang.StringBuilder("DatabaseMigration/doMigration/error; name=");
        r0.append(r6);
        com.whatsapp.util.Log.e(r0.toString(), r4);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x0249 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:219:0x04f0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:234:0x0506 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:271:0x05bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:276:0x05c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:301:0x063f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:303:0x0640 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:330:0x0742 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:339:0x074b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:348:0x0755 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:360:0x0762 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:404:0x0877 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:409:0x087c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:427:0x08c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x01f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01fc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0201 */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0284 A[Catch:{ Exception -> 0x0763 }] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x07c4 A[Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0807 A[SYNTHETIC, Splitter:B:385:0x0807] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0282 A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:427:0x08c0=Splitter:B:427:0x08c0, B:422:0x08b8=Splitter:B:422:0x08b8, B:380:0x07fc=Splitter:B:380:0x07fc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(X.C30101bk r38) {
        /*
            r37 = this;
            java.lang.String r25 = "DatabaseMigration/afterMigration/error; name="
            java.lang.String r23 = "; time spent="
            java.lang.String r21 = "; current_index="
            r7 = r37
            boolean r0 = r7.A0O()
            java.lang.String r3 = "DatabaseMigration/doMigration/begin; name="
            r2 = 0
            if (r0 == 0) goto L_0x0032
            X.0so r1 = r7.A01
            java.lang.String r4 = r7.A0C
            java.lang.String r0 = "db-migration-stale"
            r1.AcB(r0, r4, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = " is stale, should be rolled back first."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0032:
            X.11I r0 = r7.A06
            r36 = r0
            java.lang.String r1 = "migration_stats_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r6 = r7.A0C
            r0.append(r6)
            java.lang.String r1 = r0.toString()
            r0 = r36
            java.lang.String r4 = r0.A02(r1)
            java.lang.String r9 = "retry_count"
            java.lang.String r10 = "migration_time_spent"
            java.lang.String r11 = "db_size_change"
            java.lang.String r12 = "row_skipped"
            java.lang.String r1 = "row_processed"
            if (r4 != 0) goto L_0x00d3
            X.2Tk r5 = new X.2Tk
            r5.<init>()
        L_0x0060:
            long r0 = r5.A02
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x006e
            long r0 = r7.A07()
            r5.A02 = r0
        L_0x006e:
            X.0tq r0 = r7.A05
            r35 = r0
            r35.A04()
            java.io.File r0 = r0.A06
            r34 = r0
            long r16 = r34.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r6)
            java.lang.String r0 = "; before_size="
            r4.append(r0)
            r0 = r16
            r4.append(r0)
            java.lang.String r0 = "; start_index="
            r4.append(r0)
            java.lang.String r22 = r7.A0E()
            r9 = -1
            r1 = r36
            r0 = r22
            long r0 = r1.A01(r0, r9)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Zf r24 = new X.1Zf
            r0 = r24
            r0.<init>((boolean) r2)
            r24.A03()
            r4 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = "/before_migrate"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.1Zf r3 = new X.1Zf
            r3.<init>((java.lang.String) r0)
            r18 = 1
            goto L_0x0134
        L_0x00d3:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011b }
            r8.<init>(r4)     // Catch:{ JSONException -> 0x011b }
            X.2Tk r5 = new X.2Tk     // Catch:{ JSONException -> 0x011b }
            r5.<init>()     // Catch:{ JSONException -> 0x011b }
            boolean r0 = r8.has(r1)     // Catch:{ JSONException -> 0x011b }
            if (r0 == 0) goto L_0x00e9
            long r0 = r8.getLong(r1)     // Catch:{ JSONException -> 0x011b }
            r5.A03 = r0     // Catch:{ JSONException -> 0x011b }
        L_0x00e9:
            boolean r0 = r8.has(r12)     // Catch:{ JSONException -> 0x011b }
            if (r0 == 0) goto L_0x00f5
            long r0 = r8.getLong(r12)     // Catch:{ JSONException -> 0x011b }
            r5.A04 = r0     // Catch:{ JSONException -> 0x011b }
        L_0x00f5:
            boolean r0 = r8.has(r11)     // Catch:{ JSONException -> 0x011b }
            if (r0 == 0) goto L_0x0101
            long r0 = r8.getLong(r11)     // Catch:{ JSONException -> 0x011b }
            r5.A00 = r0     // Catch:{ JSONException -> 0x011b }
        L_0x0101:
            boolean r0 = r8.has(r10)     // Catch:{ JSONException -> 0x011b }
            if (r0 == 0) goto L_0x010d
            long r0 = r8.getLong(r10)     // Catch:{ JSONException -> 0x011b }
            r5.A01 = r0     // Catch:{ JSONException -> 0x011b }
        L_0x010d:
            boolean r0 = r8.has(r9)     // Catch:{ JSONException -> 0x011b }
            if (r0 == 0) goto L_0x0060
            long r0 = r8.getLong(r9)     // Catch:{ JSONException -> 0x011b }
            r5.A02 = r0     // Catch:{ JSONException -> 0x011b }
            goto L_0x0060
        L_0x011b:
            r5 = move-exception
            java.lang.String r1 = "Failed to read migration statistics from stored data; reset to default values. Data: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r5)
            X.2Tk r5 = new X.2Tk
            r5.<init>()
            goto L_0x0060
        L_0x0134:
            boolean r0 = r7.A0J()     // Catch:{ Exception -> 0x024f }
            if (r0 != 0) goto L_0x013c
            goto L_0x0271
        L_0x013c:
            boolean r0 = r38.A00()     // Catch:{ Exception -> 0x024f }
            if (r0 != 0) goto L_0x015c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024f }
            r1.<init>()     // Catch:{ Exception -> 0x024f }
            java.lang.String r0 = "DatabaseMigration/doMigration/conditions check requires to stop migration process; name="
            r1.append(r0)     // Catch:{ Exception -> 0x024f }
            r1.append(r6)     // Catch:{ Exception -> 0x024f }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x024f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x024f }
            int r20 = A00(r38)     // Catch:{ Exception -> 0x0253 }
            goto L_0x0273
        L_0x015c:
            int r2 = r7.A00     // Catch:{ Exception -> 0x024f }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x016b
            java.lang.String r1 = r7.A0B()     // Catch:{ Exception -> 0x024f }
            r0 = r36
            r0.A04(r1, r2)     // Catch:{ Exception -> 0x024f }
        L_0x016b:
            r0 = r36
            r1 = r22
            long r11 = r0.A01(r1, r9)     // Catch:{ Exception -> 0x024f }
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0180
            r2 = r36
            r8 = r22
            r2.A05(r8, r0)     // Catch:{ Exception -> 0x024f }
        L_0x0180:
            boolean r2 = r7 instanceof X.AnonymousClass2EY     // Catch:{ Exception -> 0x024f }
            if (r2 == 0) goto L_0x0209
            r2 = r7
            X.2EY r2 = (X.AnonymousClass2EY) r2     // Catch:{ Exception -> 0x024f }
            X.11I r11 = r2.A06     // Catch:{ Exception -> 0x024f }
            java.lang.String r8 = "participant_user_ready"
            r0 = 0
            int r1 = r11.A00(r8, r0)     // Catch:{ Exception -> 0x024f }
            r0 = 1
            if (r1 != r0) goto L_0x024a
            java.lang.String r0 = "ParticipantUserDatabaseMigration/resetMigration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x024f }
            X.0tq r0 = r2.A05     // Catch:{ SQLException -> 0x0202 }
            X.0tf r14 = r0.A02()     // Catch:{ SQLException -> 0x0202 }
            X.1cj r13 = r14.A00()     // Catch:{ all -> 0x01fd }
            X.0us r0 = r2.A02     // Catch:{ all -> 0x01f8 }
            X.0tq r0 = r0.A09     // Catch:{ all -> 0x01f8 }
            X.0tf r2 = r0.A02()     // Catch:{ all -> 0x01f8 }
            X.1cj r12 = r2.A00()     // Catch:{ all -> 0x01f3 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x01ee }
            java.lang.String r0 = "group_participant_user"
            r1.A01(r0, r4, r4)     // Catch:{ all -> 0x01ee }
            java.lang.String r0 = "group_participant_device"
            r1.A01(r0, r4, r4)     // Catch:{ all -> 0x01ee }
            r12.A00()     // Catch:{ all -> 0x01ee }
            r12.close()     // Catch:{ all -> 0x01f3 }
            r2.close()     // Catch:{ all -> 0x01f8 }
            r11.A03(r8)     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "migration_participant_user_index"
            r11.A03(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "migration_participant_user_retry"
            r11.A03(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "broadcast_me_jid_ready"
            r11.A03(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "migration_broadcast_me_jid_index"
            r11.A03(r0)     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "migration_broadcast_me_jid_retry"
            r11.A03(r0)     // Catch:{ all -> 0x01f8 }
            r13.A00()     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "ParticipantUserDatabaseMigration/resetMigration success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01f8 }
            r13.close()     // Catch:{ all -> 0x01fd }
            r14.close()     // Catch:{ SQLException -> 0x0202 }
            goto L_0x024a
        L_0x01ee:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x01f2 }
        L_0x01f2:
            throw r0     // Catch:{ all -> 0x01f3 }
        L_0x01f3:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x01f7 }
        L_0x01f7:
            throw r0     // Catch:{ all -> 0x01f8 }
        L_0x01f8:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x01fc }
        L_0x01fc:
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0201 }
        L_0x0201:
            throw r0     // Catch:{ SQLException -> 0x0202 }
        L_0x0202:
            r1 = move-exception
            java.lang.String r0 = "ParticipantUserDatabaseMigration/resetMigration failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x024f }
            goto L_0x024a
        L_0x0209:
            boolean r2 = r7 instanceof X.AnonymousClass2EL     // Catch:{ Exception -> 0x024f }
            if (r2 == 0) goto L_0x024a
            r11 = r7
            X.2EL r11 = (X.AnonymousClass2EL) r11     // Catch:{ Exception -> 0x024f }
            X.11I r8 = r11.A06     // Catch:{ Exception -> 0x024f }
            java.lang.String r2 = r11.A0E()     // Catch:{ Exception -> 0x024f }
            long r12 = r8.A01(r2, r9)     // Catch:{ Exception -> 0x024f }
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x024a
            X.0pd r2 = r11.A03     // Catch:{ Exception -> 0x024f }
            r1 = 1350(0x546, float:1.892E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ Exception -> 0x024f }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ Exception -> 0x024f }
            if (r0 == 0) goto L_0x024a
            X.0tq r0 = r11.A05     // Catch:{ Exception -> 0x024f }
            X.0tf r2 = r0.A02()     // Catch:{ Exception -> 0x024f }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)"
            r1.A0B(r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)"
            r1.A0B(r0)     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "MainMessageStore/MainMessageDatabaseMigration/onBeforeMigration/ Create chat sort_id index"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0245 }
            r2.close()     // Catch:{ Exception -> 0x024f }
            goto L_0x024a
        L_0x0245:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0249 }
        L_0x0249:
            throw r0     // Catch:{ Exception -> 0x024f }
        L_0x024a:
            r20 = 0
            r19 = 0
            goto L_0x0275
        L_0x024f:
            r4 = move-exception
            r19 = 0
            goto L_0x0256
        L_0x0253:
            r4 = move-exception
            r19 = 1
        L_0x0256:
            java.lang.String r1 = "DatabaseMigration/beforeMigration/error; name="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r4)
            X.0so r1 = r7.A01
            java.lang.String r0 = "before-migration"
            A01(r1, r6, r0, r4)
            r20 = 0
            goto L_0x0275
        L_0x0271:
            r20 = 2
        L_0x0273:
            r19 = 1
        L_0x0275:
            r3.A01()
            if (r4 != 0) goto L_0x08f6
            if (r19 != 0) goto L_0x08f6
        L_0x027c:
            boolean r0 = r7.A0J()     // Catch:{ Exception -> 0x0763 }
            if (r0 != 0) goto L_0x0284
            goto L_0x0739
        L_0x0284:
            boolean r0 = r38.A00()     // Catch:{ Exception -> 0x0763 }
            if (r0 != 0) goto L_0x02a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0763 }
            r1.<init>()     // Catch:{ Exception -> 0x0763 }
            java.lang.String r0 = "DatabaseMigration/doMigration/conditions check requires to stop migration process; name = "
            r1.append(r0)     // Catch:{ Exception -> 0x0763 }
            r1.append(r6)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0763 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0763 }
            goto L_0x0734
        L_0x02a0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0763 }
            r1.<init>()     // Catch:{ Exception -> 0x0763 }
            r1.append(r6)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r0 = "/doMigrationInSmallBatch/processBatch"
            r1.append(r0)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0763 }
            X.1Zf r26 = new X.1Zf     // Catch:{ Exception -> 0x0763 }
            r0 = r26
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x0763 }
            r26.A03()     // Catch:{ Exception -> 0x0763 }
            boolean r0 = r7 instanceof X.C46492Em     // Catch:{ Exception -> 0x0763 }
            if (r0 == 0) goto L_0x0359
            r35.A03()     // Catch:{ Exception -> 0x0763 }
            r35.A04()     // Catch:{ Exception -> 0x0763 }
            r0 = r35
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A07     // Catch:{ Exception -> 0x0763 }
            r30 = r0
            r30.lock()     // Catch:{ Exception -> 0x0763 }
            X.0tf r28 = r35.A02()     // Catch:{ all -> 0x074c }
            r0 = r28
            X.0tg r12 = r0.A02     // Catch:{ all -> 0x0747 }
            java.lang.String r0 = "DROP VIEW IF EXISTS message_view_old_schema"
            r12.A0B(r0)     // Catch:{ all -> 0x0747 }
            r35.A04()     // Catch:{ all -> 0x0747 }
            r0 = r35
            X.1jC r11 = r0.A04     // Catch:{ all -> 0x0747 }
            boolean r0 = r11.A0E(r12)     // Catch:{ all -> 0x0747 }
            if (r0 == 0) goto L_0x0354
            r0 = 1
            java.lang.String r3 = "write_to_old_schema_disabled"
            java.lang.String r2 = "DatabaseHelper"
            X.C33971jU.A02(r12, r3, r2, r0)     // Catch:{ all -> 0x0747 }
            r14 = 0
            r11.A0A = r14     // Catch:{ all -> 0x0747 }
            X.1cj r27 = r28.A00()     // Catch:{ all -> 0x0743 }
            java.lang.String[] r13 = X.C33811jC.A0B     // Catch:{ all -> 0x073e }
            int r0 = r13.length     // Catch:{ all -> 0x073e }
            r29 = r0
            r8 = 0
            r3 = 0
        L_0x0300:
            r0 = r29
            if (r3 >= r0) goto L_0x0345
            r15 = r13[r3]     // Catch:{ all -> 0x073e }
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C33961jT.A00(r12, r0, r15)     // Catch:{ all -> 0x073e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x073e }
            if (r0 != 0) goto L_0x0342
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x073e }
            r1.<init>()     // Catch:{ all -> 0x073e }
            r1.append(r15)     // Catch:{ all -> 0x073e }
            java.lang.String r0 = "_old"
            r1.append(r0)     // Catch:{ all -> 0x073e }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x073e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x073e }
            r1.<init>()     // Catch:{ all -> 0x073e }
            java.lang.String r0 = "ALTER TABLE "
            r1.append(r0)     // Catch:{ all -> 0x073e }
            r1.append(r15)     // Catch:{ all -> 0x073e }
            java.lang.String r0 = " RENAME TO "
            r1.append(r0)     // Catch:{ all -> 0x073e }
            r1.append(r2)     // Catch:{ all -> 0x073e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x073e }
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ all -> 0x073e }
            r12.A0C(r1, r0)     // Catch:{ all -> 0x073e }
        L_0x0342:
            int r3 = r3 + 1
            goto L_0x0300
        L_0x0345:
            r0 = 1
            r11.A0C(r12, r0, r8)     // Catch:{ all -> 0x073e }
            r27.A00()     // Catch:{ all -> 0x073e }
            r27.close()     // Catch:{ all -> 0x0743 }
            r11.A0A = r14     // Catch:{ all -> 0x0747 }
            r11.A04()     // Catch:{ all -> 0x0747 }
        L_0x0354:
            r28.close()     // Catch:{ all -> 0x074c }
            goto L_0x0684
        L_0x0359:
            boolean r0 = r7 instanceof X.C46502En     // Catch:{ Exception -> 0x0763 }
            if (r0 == 0) goto L_0x03bd
            X.2Tm r32 = new X.2Tm     // Catch:{ Exception -> 0x0763 }
            r32.<init>()     // Catch:{ Exception -> 0x0763 }
            r0 = 0
            r2 = r32
            r2.A04 = r0     // Catch:{ Exception -> 0x0763 }
            r15 = 0
            r2.A01 = r15     // Catch:{ Exception -> 0x0763 }
            X.0tf r14 = r35.A02()     // Catch:{ Exception -> 0x0763 }
            X.1cj r30 = r14.A00()     // Catch:{ all -> 0x0756 }
            java.lang.String[] r13 = X.C33811jC.A0B     // Catch:{ all -> 0x0751 }
            int r12 = r13.length     // Catch:{ all -> 0x0751 }
            r11 = 0
        L_0x0377:
            if (r11 >= r12) goto L_0x03b2
            r0 = r13[r11]     // Catch:{ all -> 0x0751 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0751 }
            r1.<init>()     // Catch:{ all -> 0x0751 }
            r1.append(r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = "_old"
            r1.append(r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x0751 }
            X.0tg r3 = r14.A02     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = "table"
            java.lang.String r29 = X.C33961jT.A00(r3, r0, r8)     // Catch:{ all -> 0x0751 }
            long r0 = r2.A04     // Catch:{ all -> 0x0751 }
            r27 = 1
            long r0 = r0 + r27
            r2.A04 = r0     // Catch:{ all -> 0x0751 }
            boolean r0 = android.text.TextUtils.isEmpty(r29)     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x03a6
            int r11 = r11 + 1
            goto L_0x0377
        L_0x03a6:
            java.lang.String r0 = X.C34031ja.A00(r8)     // Catch:{ all -> 0x0751 }
            java.lang.String[] r1 = new java.lang.String[r15]     // Catch:{ all -> 0x0751 }
            r3.A0C(r0, r1)     // Catch:{ all -> 0x0751 }
            r1 = 1
            r2.A01 = r1     // Catch:{ all -> 0x0751 }
        L_0x03b2:
            r30.A00()     // Catch:{ all -> 0x0751 }
            r30.close()     // Catch:{ all -> 0x0756 }
            r14.close()     // Catch:{ Exception -> 0x0763 }
            goto L_0x0695
        L_0x03bd:
            java.lang.String r31 = "; batchSize="
            java.lang.String r30 = "DatabaseMigration/doMigrationInSmallBatch/error; name="
            X.2Tm r32 = new X.2Tm     // Catch:{ Exception -> 0x0763 }
            r32.<init>()     // Catch:{ Exception -> 0x0763 }
            X.1Hf r0 = r7.A0A     // Catch:{ Exception -> 0x0763 }
            X.0pd r3 = r0.A00     // Catch:{ Exception -> 0x0763 }
            r0 = 607(0x25f, float:8.5E-43)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ Exception -> 0x0763 }
            int r2 = r3.A03(r1, r0)     // Catch:{ Exception -> 0x0763 }
            r35.A04()     // Catch:{ Exception -> 0x0763 }
            long r11 = r34.length()     // Catch:{ Exception -> 0x0763 }
            r0 = 780(0x30c, float:1.093E-42)
            int r0 = r3.A03(r1, r0)     // Catch:{ Exception -> 0x0763 }
            int r0 = r0 << 10
            int r0 = r0 << 10
            long r0 = (long) r0     // Catch:{ Exception -> 0x0763 }
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x03f3
            if (r2 <= 0) goto L_0x03f3
            int r0 = r7.A02()     // Catch:{ Exception -> 0x0763 }
            int r8 = java.lang.Math.min(r0, r2)     // Catch:{ Exception -> 0x0763 }
            goto L_0x03f7
        L_0x03f3:
            int r8 = r7.A02()     // Catch:{ Exception -> 0x0763 }
        L_0x03f7:
            r0 = r32
            r0.A02 = r8     // Catch:{ Exception -> 0x0763 }
            java.lang.String r12 = r7.A0E()     // Catch:{ Exception -> 0x0763 }
            r0 = r36
            long r2 = r0.A01(r12, r9)     // Catch:{ Exception -> 0x0763 }
            r0 = r32
            r0.A04 = r2     // Catch:{ Exception -> 0x0763 }
            r0 = 0
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x041c
            java.lang.String r2 = "DatabaseMigration/doMigrationInSmallBatch/start index was not set to 0."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x0763 }
            r2 = r32
            r2.A04 = r0     // Catch:{ Exception -> 0x0763 }
            r2 = r36
            r2.A05(r12, r0)     // Catch:{ Exception -> 0x0763 }
        L_0x041c:
            r0 = r32
            int r1 = r0.A01     // Catch:{ Exception -> 0x0763 }
            int r0 = r0.A03     // Catch:{ Exception -> 0x0763 }
            int r1 = r1 + r0
            r0 = r32
            int r0 = r0.A00     // Catch:{ Exception -> 0x0763 }
            int r1 = r1 + r0
            r0 = r32
            int r0 = r0.A02     // Catch:{ Exception -> 0x0763 }
            if (r1 >= r0) goto L_0x0695
            boolean r0 = r38.A00()     // Catch:{ Exception -> 0x0763 }
            if (r0 != 0) goto L_0x0447
            java.lang.String r1 = "DatabaseMigration/doMigrationInSmallBatch/conditions check requires to stop migration process; name="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0763 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0763 }
            r0.append(r6)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0763 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0763 }
            goto L_0x0695
        L_0x0447:
            r35.A04()     // Catch:{ Exception -> 0x0763 }
            r0 = r35
            X.1jC r0 = r0.A04     // Catch:{ Exception -> 0x0763 }
            X.0tg r0 = r0.AHC()     // Catch:{ Exception -> 0x0763 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ Exception -> 0x0763 }
            boolean r0 = r0.inTransaction()     // Catch:{ Exception -> 0x0763 }
            r1 = r0 ^ 1
            java.lang.String r0 = "Database migration shouldn't be wrapped to a transaction."
            X.AnonymousClass00B.A0B(r0, r1)     // Catch:{ Exception -> 0x0763 }
            X.0tf r28 = r35.get()     // Catch:{ Exception -> 0x0507 }
            r0 = r32
            long r0 = r0.A04     // Catch:{ all -> 0x0502 }
            boolean r2 = r7 instanceof X.AnonymousClass2EJ     // Catch:{ all -> 0x0502 }
            if (r2 == 0) goto L_0x04fe
            r2 = r7
            X.2EJ r2 = (X.AnonymousClass2EJ) r2     // Catch:{ all -> 0x0502 }
            r33 = r2
            java.util.Map r2 = r2.A01     // Catch:{ all -> 0x0502 }
            r29 = r2
            r29.clear()     // Catch:{ all -> 0x0502 }
            r2 = r28
            X.0tg r11 = r2.A02     // Catch:{ Exception -> 0x04f1 }
            java.lang.String r3 = X.C49532Tn.A00     // Catch:{ Exception -> 0x04f1 }
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x04f1 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04f1 }
            r13 = 0
            r2[r13] = r0     // Catch:{ Exception -> 0x04f1 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x04f1 }
            r2[r18] = r0     // Catch:{ Exception -> 0x04f1 }
            android.database.Cursor r11 = r11.A08(r3, r2)     // Catch:{ Exception -> 0x04f1 }
            java.lang.String r0 = "chat_row_id"
            int r27 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x04ea }
            java.lang.String r0 = "_id"
            int r3 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x04ea }
        L_0x049d:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x04ea }
            if (r0 == 0) goto L_0x04e6
            r0 = r33
            X.17F r2 = r0.A00     // Catch:{ Exception -> 0x04df }
            r0 = r27
            X.0tZ r14 = r2.A0A(r11, r0, r3)     // Catch:{ Exception -> 0x04df }
            if (r14 == 0) goto L_0x049d
            boolean r0 = X.AnonymousClass17F.A03(r14, r13)     // Catch:{ Exception -> 0x04df }
            if (r0 != 0) goto L_0x049d
            java.lang.String r1 = r2.A0E(r14)     // Catch:{ Exception -> 0x04df }
            int r15 = r1.length()     // Catch:{ Exception -> 0x04df }
            r0 = 4096(0x1000, float:5.74E-42)
            if (r15 >= r0) goto L_0x049d
            java.util.regex.Pattern r0 = X.C42471xq.A00     // Catch:{ Exception -> 0x04df }
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ Exception -> 0x04df }
            boolean r0 = r0.find()     // Catch:{ Exception -> 0x04df }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x049d
            java.lang.String r2 = r2.A0H(r1)     // Catch:{ Exception -> 0x04df }
            long r0 = r14.A14     // Catch:{ Exception -> 0x04df }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x04df }
            r0 = r29
            r0.put(r1, r2)     // Catch:{ Exception -> 0x04df }
            goto L_0x049d
        L_0x04df:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/single fail to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04ea }
            goto L_0x049d
        L_0x04e6:
            r11.close()     // Catch:{ Exception -> 0x04f1 }
            goto L_0x04fe
        L_0x04ea:
            r0 = move-exception
            if (r11 == 0) goto L_0x04f0
            r11.close()     // Catch:{ all -> 0x04f0 }
        L_0x04f0:
            throw r0     // Catch:{ Exception -> 0x04f1 }
        L_0x04f1:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/inner fail to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x04f8 }
            goto L_0x04fe
        L_0x04f8:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/failed to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0502 }
        L_0x04fe:
            r28.close()     // Catch:{ Exception -> 0x0507 }
            goto L_0x0530
        L_0x0502:
            r0 = move-exception
            r28.close()     // Catch:{ all -> 0x0506 }
        L_0x0506:
            throw r0     // Catch:{ Exception -> 0x0507 }
        L_0x0507:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0763 }
            r2.<init>()     // Catch:{ Exception -> 0x0763 }
            r0 = r30
            r2.append(r0)     // Catch:{ Exception -> 0x0763 }
            r2.append(r6)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r0 = "; failed preBatchWork; startIndex="
            r2.append(r0)     // Catch:{ Exception -> 0x0763 }
            r0 = r32
            long r0 = r0.A04     // Catch:{ Exception -> 0x0763 }
            r2.append(r0)     // Catch:{ Exception -> 0x0763 }
            r0 = r31
            r2.append(r0)     // Catch:{ Exception -> 0x0763 }
            r2.append(r8)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0763 }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ Exception -> 0x0763 }
        L_0x0530:
            X.0tf r11 = r35.A02()     // Catch:{ Exception -> 0x0763 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x075e }
            r2.<init>()     // Catch:{ all -> 0x075e }
            java.lang.String r0 = "DatabaseMigration/doMigrationInSmallBatch; name="
            r2.append(r0)     // Catch:{ all -> 0x075e }
            r2.append(r6)     // Catch:{ all -> 0x075e }
            java.lang.String r0 = "; startIndex="
            r2.append(r0)     // Catch:{ all -> 0x075e }
            r0 = r32
            long r0 = r0.A04     // Catch:{ all -> 0x075e }
            r2.append(r0)     // Catch:{ all -> 0x075e }
            r0 = r31
            r2.append(r0)     // Catch:{ all -> 0x075e }
            r2.append(r8)     // Catch:{ all -> 0x075e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x075e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x075e }
            r13 = 0
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x075e }
            r3.<init>(r13)     // Catch:{ all -> 0x075e }
            X.2Tm r2 = new X.2Tm     // Catch:{ all -> 0x075e }
            r2.<init>()     // Catch:{ all -> 0x075e }
            r0 = 2
            com.facebook.redex.IDxTListenerShape94S0200000_2_I0 r15 = new com.facebook.redex.IDxTListenerShape94S0200000_2_I0     // Catch:{ SQLException -> 0x05c2, AssertionError -> 0x075b }
            r15.<init>(r7, r0, r3)     // Catch:{ SQLException -> 0x05c2, AssertionError -> 0x075b }
            X.0tg r14 = r11.A02     // Catch:{ SQLException -> 0x05c2, AssertionError -> 0x075b }
            X.1jP r1 = r11.A01     // Catch:{ SQLException -> 0x05c2, AssertionError -> 0x075b }
            X.1cj r29 = new X.1cj     // Catch:{ SQLException -> 0x05c2, AssertionError -> 0x075b }
            r0 = r29
            r0.<init>(r15, r1, r14)     // Catch:{ SQLException -> 0x05c2, AssertionError -> 0x075b }
            r0 = r32
            long r0 = r0.A04     // Catch:{ all -> 0x05bd }
            android.database.Cursor r15 = r7.A08(r11, r8, r0)     // Catch:{ all -> 0x05bd }
            int r0 = r15.getCount()     // Catch:{ all -> 0x05b6 }
            int r8 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x05b6 }
            if (r8 != 0) goto L_0x0595
            r29.A00()     // Catch:{ all -> 0x05b6 }
            r15.close()     // Catch:{ all -> 0x05bd }
            r29.close()     // Catch:{ SQLException -> 0x05c2, AssertionError -> 0x075b }
            goto L_0x0680
        L_0x0595:
            X.2Tm r2 = r7.A09(r15)     // Catch:{ all -> 0x05b6 }
            long r0 = r2.A04     // Catch:{ all -> 0x05b4 }
            r27 = 0
            int r14 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r14 <= 0) goto L_0x05ad
            r14 = r36
            r14.A05(r12, r0)     // Catch:{ all -> 0x05b4 }
            r29.A00()     // Catch:{ all -> 0x05b4 }
            r0 = 1
            r3.set(r0)     // Catch:{ all -> 0x05b4 }
        L_0x05ad:
            r15.close()     // Catch:{ all -> 0x05bd }
            r29.close()     // Catch:{ SQLException -> 0x05c2, AssertionError -> 0x075b }
            goto L_0x05d0
        L_0x05b4:
            r0 = move-exception
            goto L_0x05b9
        L_0x05b6:
            r0 = move-exception
            if (r15 == 0) goto L_0x05bc
        L_0x05b9:
            r15.close()     // Catch:{ all -> 0x05bc }
        L_0x05bc:
            throw r0     // Catch:{ all -> 0x05bd }
        L_0x05bd:
            r0 = move-exception
            r29.close()     // Catch:{ all -> 0x05c1 }
        L_0x05c1:
            throw r0     // Catch:{ SQLException -> 0x05c2, AssertionError -> 0x075b }
        L_0x05c2:
            r0 = move-exception
            boolean r1 = r7.A0S(r0, r8)     // Catch:{ all -> 0x075e }
            if (r1 == 0) goto L_0x075d
            r3.set(r13)     // Catch:{ all -> 0x075e }
            r2.A04 = r9     // Catch:{ all -> 0x075e }
            r2.A01 = r13     // Catch:{ all -> 0x075e }
        L_0x05d0:
            boolean r0 = r3.get()     // Catch:{ all -> 0x075e }
            if (r0 == 0) goto L_0x060a
            long r0 = r2.A04     // Catch:{ all -> 0x075e }
            r3 = r32
            r3.A04 = r0     // Catch:{ all -> 0x075e }
            r3 = r36
            r3.A05(r12, r0)     // Catch:{ all -> 0x075e }
            r0 = r32
            int r13 = r0.A01     // Catch:{ all -> 0x075e }
            int r0 = r2.A01     // Catch:{ all -> 0x075e }
            int r13 = r13 + r0
            r0 = r32
            r0.A01 = r13     // Catch:{ all -> 0x075e }
            int r3 = r0.A03     // Catch:{ all -> 0x075e }
            int r0 = r2.A03     // Catch:{ all -> 0x075e }
            int r3 = r3 + r0
            r0 = r32
            r0.A03 = r3     // Catch:{ all -> 0x075e }
            int r1 = r0.A00     // Catch:{ all -> 0x075e }
            int r0 = r2.A00     // Catch:{ all -> 0x075e }
            int r1 = r1 + r0
            r0 = r32
            r0.A00 = r1     // Catch:{ all -> 0x075e }
            int r0 = r0.A02     // Catch:{ all -> 0x075e }
            int r0 = r0 - r13
            int r0 = r0 - r3
            int r0 = r0 - r1
            int r1 = r8 << 1
            int r8 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x075e }
            goto L_0x067b
        L_0x060a:
            r0 = 1
            if (r8 != r0) goto L_0x0679
            r0 = r32
            long r0 = r0.A04     // Catch:{ SQLException -> 0x0640 }
            r2 = 1
            android.database.Cursor r13 = r7.A08(r11, r2, r0)     // Catch:{ SQLException -> 0x0640 }
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0639 }
            if (r0 == 0) goto L_0x0635
            r0 = r32
            long r2 = r0.A04     // Catch:{ all -> 0x0639 }
            java.lang.String r0 = "_id"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0639 }
            int r0 = r13.getInt(r0)     // Catch:{ all -> 0x0639 }
            int r0 = r0 - r18
            long r0 = (long) r0     // Catch:{ all -> 0x0639 }
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0639 }
            r2 = r32
            r2.A04 = r0     // Catch:{ all -> 0x0639 }
        L_0x0635:
            r13.close()     // Catch:{ SQLException -> 0x0640 }
            goto L_0x0640
        L_0x0639:
            r0 = move-exception
            if (r13 == 0) goto L_0x063f
            r13.close()     // Catch:{ all -> 0x063f }
        L_0x063f:
            throw r0     // Catch:{ SQLException -> 0x0640 }
        L_0x0640:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x075e }
            r2.<init>()     // Catch:{ all -> 0x075e }
            r0 = r30
            r2.append(r0)     // Catch:{ all -> 0x075e }
            r2.append(r6)     // Catch:{ all -> 0x075e }
            java.lang.String r0 = "; failed record - skipping row; index="
            r2.append(r0)     // Catch:{ all -> 0x075e }
            r0 = r32
            long r0 = r0.A04     // Catch:{ all -> 0x075e }
            r2.append(r0)     // Catch:{ all -> 0x075e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x075e }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x075e }
            r0 = r32
            long r0 = r0.A04     // Catch:{ all -> 0x075e }
            r2 = 1
            long r0 = r0 + r2
            r2 = r32
            r2.A04 = r0     // Catch:{ all -> 0x075e }
            int r2 = r2.A03     // Catch:{ all -> 0x075e }
            int r3 = r2 + 1
            r2 = r32
            r2.A03 = r3     // Catch:{ all -> 0x075e }
            r2 = r36
            r2.A05(r12, r0)     // Catch:{ all -> 0x075e }
            goto L_0x067b
        L_0x0679:
            int r8 = r8 / 2
        L_0x067b:
            r11.close()     // Catch:{ Exception -> 0x0763 }
            goto L_0x041c
        L_0x0680:
            r11.close()     // Catch:{ Exception -> 0x0763 }
            goto L_0x0695
        L_0x0684:
            r30.unlock()     // Catch:{ Exception -> 0x0763 }
            X.2Tm r32 = new X.2Tm     // Catch:{ Exception -> 0x0763 }
            r32.<init>()     // Catch:{ Exception -> 0x0763 }
            r0 = 0
            r2 = r32
            r2.A04 = r0     // Catch:{ Exception -> 0x0763 }
            r1 = 0
            r2.A01 = r1     // Catch:{ Exception -> 0x0763 }
        L_0x0695:
            r0 = r32
            int r0 = r0.A01     // Catch:{ Exception -> 0x0763 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x0763 }
            long r0 = r5.A03     // Catch:{ Exception -> 0x0763 }
            long r0 = r0 + r2
            r5.A03 = r0     // Catch:{ Exception -> 0x0763 }
            r0 = r32
            int r0 = r0.A03     // Catch:{ Exception -> 0x0763 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x0763 }
            long r0 = r5.A04     // Catch:{ Exception -> 0x0763 }
            long r0 = r0 + r2
            r5.A04 = r0     // Catch:{ Exception -> 0x0763 }
            r7.A0I(r5)     // Catch:{ Exception -> 0x0763 }
            r0 = r32
            int r1 = r0.A01     // Catch:{ Exception -> 0x0763 }
            int r0 = r0.A03     // Catch:{ Exception -> 0x0763 }
            int r1 = r1 + r0
            r0 = r32
            int r0 = r0.A00     // Catch:{ Exception -> 0x0763 }
            int r1 = r1 + r0
            r2 = 0
            if (r1 <= 0) goto L_0x06bc
            r2 = 1
        L_0x06bc:
            r26.A01()     // Catch:{ Exception -> 0x0763 }
            r0 = r36
            r1 = r22
            r0.A01(r1, r9)     // Catch:{ Exception -> 0x0763 }
            r24.A00()     // Catch:{ Exception -> 0x0763 }
            if (r2 == 0) goto L_0x0779
            long r0 = r26.A00()     // Catch:{ Exception -> 0x0763 }
            X.1Hf r2 = r7.A0A     // Catch:{ Exception -> 0x0763 }
            X.0pd r11 = r2.A00     // Catch:{ Exception -> 0x0763 }
            r2 = 608(0x260, float:8.52E-43)
            X.0tM r8 = X.C16620tM.A02     // Catch:{ Exception -> 0x0763 }
            int r2 = r11.A03(r8, r2)     // Catch:{ Exception -> 0x0763 }
            int r2 = r2 * 1000
            if (r2 <= 0) goto L_0x027c
            long r2 = (long) r2     // Catch:{ Exception -> 0x0763 }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x027c
            r35.A04()     // Catch:{ Exception -> 0x0763 }
            long r13 = r34.length()     // Catch:{ Exception -> 0x0763 }
            r2 = 780(0x30c, float:1.093E-42)
            int r2 = r11.A03(r8, r2)     // Catch:{ Exception -> 0x0763 }
            int r2 = r2 << 10
            int r2 = r2 << 10
            long r2 = (long) r2     // Catch:{ Exception -> 0x0763 }
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x0708
            r0 = 779(0x30b, float:1.092E-42)
            int r0 = r11.A03(r8, r0)     // Catch:{ Exception -> 0x0763 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ Exception -> 0x0763 }
            android.os.SystemClock.sleep(r0)     // Catch:{ Exception -> 0x0763 }
            goto L_0x027c
        L_0x0708:
            X.0so r11 = r7.A01     // Catch:{ Exception -> 0x0763 }
            java.lang.String r3 = "db-long-running-process-batch/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0763 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0763 }
            r2.append(r6)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x0763 }
            java.lang.String r2 = "name="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0763 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0763 }
            r3.append(r6)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r2 = ", duration="
            r3.append(r2)     // Catch:{ Exception -> 0x0763 }
            r3.append(r0)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0763 }
            r0 = 0
            r11.AcB(r8, r1, r0)     // Catch:{ Exception -> 0x0763 }
            goto L_0x027c
        L_0x0734:
            int r20 = A00(r38)     // Catch:{ Exception -> 0x0765 }
            goto L_0x073b
        L_0x0739:
            r20 = 2
        L_0x073b:
            r19 = 1
            goto L_0x0779
        L_0x073e:
            r0 = move-exception
            r27.close()     // Catch:{ all -> 0x0742 }
        L_0x0742:
            throw r0     // Catch:{ all -> 0x0743 }
        L_0x0743:
            r0 = move-exception
            r11.A0A = r14     // Catch:{ all -> 0x0747 }
            throw r0     // Catch:{ all -> 0x0747 }
        L_0x0747:
            r0 = move-exception
            r28.close()     // Catch:{ all -> 0x074b }
        L_0x074b:
            throw r0     // Catch:{ all -> 0x074c }
        L_0x074c:
            r0 = move-exception
            r30.unlock()     // Catch:{ Exception -> 0x0763 }
            throw r0     // Catch:{ Exception -> 0x0763 }
        L_0x0751:
            r0 = move-exception
            r30.close()     // Catch:{ all -> 0x0755 }
        L_0x0755:
            throw r0     // Catch:{ all -> 0x0756 }
        L_0x0756:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0762 }
            goto L_0x0762
        L_0x075b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x075e }
        L_0x075d:
            throw r0     // Catch:{ all -> 0x075e }
        L_0x075e:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0762 }
        L_0x0762:
            throw r0     // Catch:{ Exception -> 0x0763 }
        L_0x0763:
            r4 = move-exception
            goto L_0x0768
        L_0x0765:
            r4 = move-exception
            r19 = 1
        L_0x0768:
            java.lang.String r1 = "DatabaseMigration/doMigration/error; name="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r4)
        L_0x0779:
            java.lang.String r0 = "DatabaseMigration/doMigration/migrated; name="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r6)
            r0 = r21
            r2.append(r0)
            r0 = r36
            r1 = r22
            long r0 = r0.A01(r1, r9)
            r2.append(r0)
            r0 = r23
            r2.append(r0)
            long r0 = r24.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 != 0) goto L_0x08f6
            if (r19 != 0) goto L_0x08f6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = "/after_migrate"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.1Zf r9 = new X.1Zf
            r9.<init>((java.lang.String) r0)
            boolean r0 = r7 instanceof X.C46442Eh     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            if (r0 == 0) goto L_0x0807
            r0 = r7
            X.2Eh r0 = (X.C46442Eh) r0     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            X.14v r10 = r0.A01     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            X.0tq r0 = r10.A01     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            X.0tf r8 = r0.A02()     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            X.0tg r3 = r8.A02     // Catch:{ all -> 0x0801 }
            java.lang.String r2 = "jid"
            java.lang.String r1 = "raw_string = ? AND type = ?"
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0801 }
            r12 = 0
            java.lang.String r11 = ""
            r0[r12] = r11     // Catch:{ all -> 0x0801 }
            r11 = 11
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0801 }
            r0[r18] = r11     // Catch:{ all -> 0x0801 }
            int r0 = r3.A01(r2, r1, r0)     // Catch:{ all -> 0x0801 }
            if (r0 <= 0) goto L_0x07fc
            java.util.Map r1 = r10.A03     // Catch:{ all -> 0x0801 }
            X.1jg r0 = X.C34091jg.A00     // Catch:{ all -> 0x0801 }
            java.lang.Object r1 = r1.remove(r0)     // Catch:{ all -> 0x0801 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0801 }
            if (r1 == 0) goto L_0x07fc
            java.util.Map r0 = r10.A04     // Catch:{ all -> 0x0801 }
            r0.remove(r1)     // Catch:{ all -> 0x0801 }
        L_0x07fc:
            r8.close()     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            goto L_0x08f3
        L_0x0801:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x08c0 }
            goto L_0x08c0
        L_0x0807:
            boolean r0 = r7 instanceof X.AnonymousClass2EL     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            if (r0 == 0) goto L_0x0882
            r35.A03()     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            r35.A04()     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            r0 = r35
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r0.A07     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            r8.lock()     // Catch:{ all -> 0x087d }
            X.0tf r3 = r35.A02()     // Catch:{ all -> 0x087d }
            r35.A04()     // Catch:{ all -> 0x0878 }
            X.1jC r11 = r0.A04     // Catch:{ all -> 0x0878 }
            java.lang.String r0 = "databasehelper/finalizeMigration"
            X.1Zf r10 = new X.1Zf     // Catch:{ all -> 0x0878 }
            r10.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0878 }
            X.1cj r14 = r3.A00()     // Catch:{ all -> 0x0878 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0873 }
            r0 = 1
            r11.A0A(r2, r0)     // Catch:{ all -> 0x0873 }
            java.lang.String r13 = "migration_completed"
            r0 = 1
            java.lang.String r12 = "DatabaseHelper"
            X.C33971jU.A02(r2, r13, r12, r0)     // Catch:{ all -> 0x0873 }
            boolean r1 = X.C33811jC.A03(r2)     // Catch:{ all -> 0x0873 }
            boolean r0 = r11.A0F(r2)     // Catch:{ all -> 0x0873 }
            r11.A0C(r2, r1, r0)     // Catch:{ all -> 0x0873 }
            r14.A00()     // Catch:{ all -> 0x0873 }
            r1 = 45
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x0873 }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x0873 }
            r3.A03(r0)     // Catch:{ all -> 0x0873 }
            r14.close()     // Catch:{ all -> 0x0878 }
            java.lang.String r0 = "databasehelper/finalizeMigration time spent:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0878 }
            r2.<init>(r0)     // Catch:{ all -> 0x0878 }
            long r0 = r10.A01()     // Catch:{ all -> 0x0878 }
            r2.append(r0)     // Catch:{ all -> 0x0878 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0878 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0878 }
            r3.close()     // Catch:{ all -> 0x087d }
            r8.unlock()     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            goto L_0x08f3
        L_0x0873:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0877 }
        L_0x0877:
            throw r0     // Catch:{ all -> 0x0878 }
        L_0x0878:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x087c }
        L_0x087c:
            throw r0     // Catch:{ all -> 0x087d }
        L_0x087d:
            r0 = move-exception
            r8.unlock()     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            throw r0     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
        L_0x0882:
            boolean r0 = r7 instanceof X.AnonymousClass2EJ     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            if (r0 == 0) goto L_0x08f3
            r0 = r7
            X.2EJ r0 = (X.AnonymousClass2EJ) r0     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            X.17F r0 = r0.A00     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            java.lang.String r8 = "messages_fts"
            X.0tq r0 = r0.A0D     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            X.0tf r3 = r0.A02()     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            r0.A04()     // Catch:{ all -> 0x08bc }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x08bc }
            boolean r0 = r0.A0D(r3)     // Catch:{ all -> 0x08bc }
            if (r0 == 0) goto L_0x08b8
            java.lang.String r0 = "FtsMessageStore/optimize"
            X.1Zf r2 = new X.1Zf     // Catch:{ all -> 0x08bc }
            r2.<init>((java.lang.String) r0)     // Catch:{ all -> 0x08bc }
            r0 = 1
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x08bc }
            r1.<init>(r0)     // Catch:{ all -> 0x08bc }
            java.lang.String r0 = "optimize"
            r1.put(r8, r0)     // Catch:{ all -> 0x08bc }
            X.0tg r0 = r3.A02     // Catch:{ all -> 0x08bc }
            r0.A02(r1, r8)     // Catch:{ all -> 0x08bc }
            r2.A01()     // Catch:{ all -> 0x08bc }
        L_0x08b8:
            r3.close()     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
            goto L_0x08f3
        L_0x08bc:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x08c0 }
        L_0x08c0:
            throw r0     // Catch:{ 2Tl -> 0x08c1, Exception -> 0x08d7 }
        L_0x08c1:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r25
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r4)
            goto L_0x08f3
        L_0x08d7:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r25
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r4)
            X.0so r1 = r7.A01
            java.lang.String r0 = "after-migration"
            A01(r1, r6, r0, r4)
        L_0x08f3:
            r9.A01()
        L_0x08f6:
            r35.A04()
            long r0 = r34.length()
            long r8 = r0 - r16
            long r2 = r5.A00
            long r2 = r2 + r8
            r5.A00 = r2
            r7.A0I(r5)
            java.lang.String r2 = "DatabaseMigration/doMigration; name="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r8.append(r6)
            java.lang.String r2 = "; db size:"
            r8.append(r2)
            r8.append(r0)
            java.lang.String r2 = " increase:"
            r8.append(r2)
            double r9 = (double) r0
            r0 = r16
            double r2 = (double) r0
            double r0 = r9 / r2
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r23 = 0
            if (r4 == 0) goto L_0x0934
            r23 = 1
        L_0x0934:
            long r21 = r24.A01()
            long r12 = r5.A03
            long r15 = r5.A04
            r17 = 0
            X.2EF r8 = new X.2EF
            r8.<init>()
            X.1Hj r14 = r7.A08
            long r0 = (long) r2
            java.util.List r11 = r14.A00
            long r0 = X.C24811Hj.A00(r11, r0)
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r8.A01 = r0
            long r0 = (long) r9
            long r0 = X.C24811Hj.A00(r11, r0)
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r8.A00 = r0
            r8.A09 = r6
            X.0pf r0 = r7.A03
            long r0 = r0.A02()
            double r2 = (double) r0
            long r0 = (long) r2
            long r0 = X.C24811Hj.A00(r11, r0)
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r8.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r21)
            r8.A05 = r0
            java.util.List r0 = r14.A02
            long r0 = X.C24811Hj.A00(r0, r12)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A07 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r8.A08 = r0
            long r0 = r7.A07()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A06 = r0
            r2 = 2
            if (r19 == 0) goto L_0x09dd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r8.A04 = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r8.A03 = r0
        L_0x09a5:
            int r1 = r1.intValue()
            X.0t9 r0 = r7.A0B
            if (r1 != r2) goto L_0x09d9
            r0.A05(r8)
        L_0x09b0:
            if (r4 != 0) goto L_0x09eb
            if (r19 != 0) goto L_0x0a34
            long r3 = r5.A04
            double r1 = (double) r3
            long r3 = r5.A03
            double r8 = (double) r3
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r8 = r8 * r3
            double r3 = java.lang.Math.floor(r8)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x09d5
            X.0so r2 = r7.A01
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "skipped"
            A01(r2, r6, r0, r1)
        L_0x09d5:
            r7.A0G()
            return r18
        L_0x09d9:
            r0.A06(r8)
            goto L_0x09b0
        L_0x09dd:
            if (r23 == 0) goto L_0x09e6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L_0x09e3:
            r8.A04 = r1
            goto L_0x09a5
        L_0x09e6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            goto L_0x09e3
        L_0x09eb:
            long r0 = r5.A02
            r8 = 1
            long r0 = r0 + r8
            r5.A02 = r0
            r7.A0I(r5)
            java.lang.String r3 = r7.A0C()
            long r1 = r7.A07()
            long r1 = r1 + r8
            r0 = r36
            r0.A05(r3, r1)
            java.lang.String r3 = r7.A0D()
            boolean r0 = r7 instanceof X.C46372Ea
            if (r0 == 0) goto L_0x0a40
            r1 = 1
        L_0x0a0d:
            r0 = r36
            r0.A05(r3, r1)
            java.lang.String r0 = "receipt_device"
            boolean r0 = r0.equals(r6)
            java.lang.String r3 = "stuck"
            if (r0 != 0) goto L_0x0a25
            java.lang.String r0 = "receipt_user"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0a35
        L_0x0a25:
            long r8 = r7.A07()
            r1 = 20
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0a35
        L_0x0a2f:
            X.0so r0 = r7.A01
            A01(r0, r6, r3, r4)
        L_0x0a34:
            return r17
        L_0x0a35:
            long r8 = r7.A07()
            r1 = 3
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a34
            goto L_0x0a2f
        L_0x0a40:
            r1 = 0
            goto L_0x0a0d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30111bl.A0T(X.1bk):boolean");
    }
}
