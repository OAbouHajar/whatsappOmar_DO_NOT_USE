package X;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/* renamed from: X.1r4  reason: invalid class name and case insensitive filesystem */
public class C38611r4 {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (com.whatsapp.MediaData) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.C16190sc r3, java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof com.whatsapp.MediaData
            if (r0 == 0) goto L_0x0054
            r2 = r4
            com.whatsapp.MediaData r2 = (com.whatsapp.MediaData) r2
            java.io.File r0 = r2.file
            if (r0 == 0) goto L_0x0054
            boolean r0 = r0.isAbsolute()
            if (r0 == 0) goto L_0x0054
            com.whatsapp.MediaData r4 = new com.whatsapp.MediaData
            r4.<init>(r2)
            boolean r0 = r2.autodownloadRetryEnabled
            r4.autodownloadRetryEnabled = r0
            long r0 = r2.progress
            r4.progress = r0
            boolean r0 = r2.A00
            r4.A00 = r0
            boolean r0 = r2.transcoded
            r4.transcoded = r0
            long r0 = r2.trimFrom
            r4.trimFrom = r0
            long r0 = r2.trimTo
            r4.trimTo = r0
            boolean r0 = r2.hasStreamingSidecar
            r4.hasStreamingSidecar = r0
        L_0x0032:
            java.io.File r2 = r4.file
            X.01D r0 = r3.A03
            java.lang.Object r0 = r0.get()
            java.io.File r0 = (java.io.File) r0
            java.net.URI r1 = r0.toURI()
            java.net.URI r0 = r2.toURI()
            java.net.URI r0 = r1.relativize(r0)
            java.lang.String r1 = r0.getPath()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r4.file = r0
        L_0x0053:
            return r4
        L_0x0054:
            boolean r0 = r4 instanceof X.C16750ta
            if (r0 == 0) goto L_0x0053
            r1 = r4
            X.0ta r1 = (X.C16750ta) r1
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x0053
            boolean r0 = r0.isAbsolute()
            if (r0 == 0) goto L_0x0053
            com.whatsapp.MediaData r4 = r1.A01()
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38611r4.A00(X.0sc, java.lang.Object):java.lang.Object");
    }

    public static void A01(ContentValues contentValues, C16190sc r4, C16740tZ r5) {
        C15830rv r0;
        String A03;
        UserJid userJid;
        C28381Vw r2 = r5.A11;
        contentValues.put("key_from_me", Integer.valueOf(r2.A02 ? 1 : 0));
        contentValues.put("key_id", r2.A01);
        contentValues.put("status", Integer.valueOf(r5.A0C));
        int i2 = 0;
        if (r5.A0t) {
            i2 = 2;
        }
        contentValues.put("needs_push", Integer.valueOf(i2));
        A02(contentValues, r5);
        contentValues.put("timestamp", Long.valueOf(r5.A0I));
        A04(contentValues, "media_url", r5.A0O());
        A04(contentValues, "media_mime_type", r5.A0M());
        contentValues.put("media_wa_type", Byte.valueOf(r5.A10));
        contentValues.put("media_size", Long.valueOf(r5.A09()));
        A04(contentValues, "media_name", r5.A0N());
        A04(contentValues, "media_caption", r5.A0J());
        A04(contentValues, "media_hash", r5.A0L());
        contentValues.put("media_duration", Integer.valueOf(r5.A04()));
        contentValues.put("origin", Integer.valueOf(r5.A08));
        boolean z2 = r5 instanceof C30901d9;
        contentValues.put("latitude", Double.valueOf(z2 ? ((C30901d9) r5).A00 : 0.0d));
        contentValues.put("longitude", Double.valueOf(z2 ? ((C30901d9) r5).A01 : 0.0d));
        A03(contentValues, A00(r4, r5.A0H()));
        if (r5 instanceof AnonymousClass1WU) {
            AnonymousClass1WU r22 = (AnonymousClass1WU) r5;
            if (r22 instanceof C39371sN) {
                A03 = ((C39371sN) r22).A01;
            } else if (r22 instanceof C39361sM) {
                A03 = ((C39351sL) r22).A03;
            } else if (r22 instanceof AnonymousClass1WT) {
                AnonymousClass1WT r23 = (AnonymousClass1WT) r22;
                A03 = (r23.A00 != 10 || (userJid = r23.A01) == null) ? null : userJid.getRawString();
            } else {
                r0 = r22.A0M;
                A03 = C16030sJ.A03(r0);
            }
        } else {
            List list = r5.A0r;
            if (list != null) {
                A03 = TextUtils.join(",", C16030sJ.A0T(list));
            } else {
                r0 = r5.A0M;
                A03 = C16030sJ.A03(r0);
            }
        }
        A04(contentValues, "remote_resource", A03);
        contentValues.put("received_timestamp", Long.valueOf(r5.A0G));
        contentValues.put("send_timestamp", -1);
        contentValues.put("receipt_server_timestamp", -1);
        contentValues.put("receipt_device_timestamp", -1);
        A04(contentValues, "participant_hash", r5.A0m);
        contentValues.put("recipient_count", Integer.valueOf(r5.A0A));
        contentValues.put("quoted_row_id", Long.valueOf(r5.A0F));
        A04(contentValues, "mentioned_jids", C39501sa.A00(r5.A0q));
        A04(contentValues, "multicast_id", r5 instanceof C16730tY ? ((C16730tY) r5).A09 : null);
        contentValues.put("edit_version", Integer.valueOf(r5.A01));
        A04(contentValues, "media_enc_hash", r5.A0K());
        A04(contentValues, "payment_transaction_id", r5.A0n);
        contentValues.put("forwarded", Integer.valueOf(r5.A07()));
        contentValues.put("preview_type", Integer.valueOf(r5.A05()));
        contentValues.put("lookup_tables", Long.valueOf(r5.A0A()));
        contentValues.put("future_message_type", Integer.valueOf(r5 instanceof C38791rQ ? ((C38791rQ) r5).A00 : 0));
        contentValues.put("message_add_on_flags", Integer.valueOf(r5.A07));
    }

    public static void A02(ContentValues contentValues, C16740tZ r10) {
        byte[] bArr;
        byte b2 = r10.A10;
        if (b2 == 1 || b2 == 5 || b2 == 3 || b2 == 2 || b2 == 9 || b2 == 13 || b2 == 14 || b2 == 12 || b2 == 16 || b2 == 19 || b2 == 20 || b2 == 23 || b2 == 37 || b2 == 24 || b2 == 25 || b2 == 26 || b2 == 30 || b2 == 28 || b2 == 29 || b2 == 44 || b2 == 42 || b2 == 43) {
            if (r10.A03() != 0 || r10.A0I() == null) {
                bArr = r10.A11();
            } else {
                byte[] bArr2 = null;
                try {
                    bArr = r10.A0I().length() != 0 ? Base64.decode(r10.A0I(), 0) : null;
                    try {
                        r10.A0k((String) null);
                        r10.A0v(bArr);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException e2) {
                        e = e2;
                        bArr2 = bArr;
                    }
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException e3) {
                    e = e3;
                    StringBuilder sb = new StringBuilder("bindMessageData/base64-decode/message.encoding:");
                    sb.append(r10.A03());
                    Log.e(sb.toString());
                    if (r10.A03() == 0 && r10.A0I() != null) {
                        StringBuilder sb2 = new StringBuilder("bindMessageData/base64-decode/message.data:");
                        sb2.append(r10.A0I().substring(0, Math.min(100, r10.A0I().length())));
                        Log.e(sb2.toString());
                    }
                    Log.e("bindMessageData/base64-decode/error", e);
                    bArr = bArr2;
                    A06(contentValues, "raw_data", bArr);
                    contentValues.putNull("data");
                    return;
                }
            }
            A06(contentValues, "raw_data", bArr);
            contentValues.putNull("data");
            return;
        }
        A04(contentValues, "data", r10.A0I());
        contentValues.putNull("raw_data");
    }

    public static void A03(ContentValues contentValues, Object obj) {
        if (obj == null) {
            contentValues.putNull("thumb_image");
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
        contentValues.put("thumb_image", byteArrayOutputStream.toByteArray());
    }

    public static void A04(ContentValues contentValues, String str, String str2) {
        if (str2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    public static void A05(ContentValues contentValues, String str, boolean z2) {
        contentValues.put(str, Long.valueOf(z2 ? 1 : 0));
    }

    public static void A06(ContentValues contentValues, String str, byte[] bArr) {
        if (bArr == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, bArr);
        }
    }
}
