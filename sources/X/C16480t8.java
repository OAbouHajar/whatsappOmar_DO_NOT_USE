package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.0t8  reason: invalid class name and case insensitive filesystem */
public class C16480t8 {
    public static final String[] A0E = new String[0];
    public final C16300so A00;
    public final C16180sb A01;
    public final C16190sc A02;
    public final C16980tz A03;
    public final C16820th A04;
    public final C16920ts A05;
    public final C16460t6 A06;
    public final AnonymousClass17I A07;
    public final C002501a A08;
    public final AnonymousClass0y0 A09;
    public final C19650ym A0A;
    public final C16900tq A0B;
    public final AnonymousClass15B A0C;
    public final C17020u3 A0D;

    public C16480t8(C16300so r1, C16180sb r2, C16190sc r3, C16980tz r4, C16820th r5, C16920ts r6, C16460t6 r7, AnonymousClass17I r8, C002501a r9, AnonymousClass0y0 r10, C19650ym r11, C16900tq r12, AnonymousClass15B r13, C17020u3 r14) {
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A0C = r13;
        this.A02 = r3;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A09 = r10;
        this.A0B = r12;
        this.A07 = r8;
        this.A0D = r14;
        this.A0A = r11;
    }

    public static String A00(long j2, boolean z2, boolean z3, boolean z4) {
        StringBuilder sb;
        String str = " ORDER BY sort_id ASC";
        String str2 = "";
        if (!z3 || j2 <= 0) {
            sb = new StringBuilder();
            sb.append(C42951yy.A01);
            sb.append(z2 ? " AND chat_row_id = ?" : str2);
            if (j2 > 0) {
                str2 = " AND media_size > ?";
            }
            sb.append(str2);
        } else {
            sb = new StringBuilder();
            sb.append(C42951yy.A00);
            if (z2) {
                str2 = " AND message.chat_row_id = ?";
            }
            sb.append(str2);
            sb.append(" AND file_size > ?");
        }
        if (!z4) {
            str = " ORDER BY sort_id DESC";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b2 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x008c=Splitter:B:32:0x008c, B:42:0x00ad=Splitter:B:42:0x00ad} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x00b2=Splitter:B:47:0x00b2, B:34:0x008f=Splitter:B:34:0x008f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.C42891yr r9, X.C15830rv r10, int r11) {
        /*
            r8 = this;
            java.lang.String r1 = "mediamsgstore/getMediaMessagesCount:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 0
            X.1Zf r6 = new X.1Zf
            r6.<init>((boolean) r4)
            java.lang.String r0 = "mediamsgstore/getMediaMessagesCount/"
            r6.A04(r0)
            java.lang.String r7 = X.C42951yy.A06
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]
            X.0ts r0 = r8.A05
            long r0 = r0.A02(r10)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3 = 0
            r5[r4] = r0
            X.0tq r0 = r8.A0B     // Catch:{ SQLiteDiskIOException -> 0x00b3 }
            X.0tf r4 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x00b3 }
            X.0tg r0 = r4.A02     // Catch:{ all -> 0x00ae }
            android.database.Cursor r5 = r0.A08(r7, r5)     // Catch:{ all -> 0x00ae }
            if (r5 != 0) goto L_0x0042
            java.lang.String r0 = "mediamsgstore/getMediaMessagesCount/db/cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x008f
        L_0x0042:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x008c
            boolean r0 = r9.AfQ()     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x008c
            X.0th r1 = r8.A04     // Catch:{ all -> 0x00a7 }
            r0 = 0
            X.0tZ r7 = r1.A02(r5, r10, r0)     // Catch:{ all -> 0x00a7 }
            boolean r0 = r7 instanceof X.C16730tY     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0042
            r0 = r7
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ all -> 0x00a7 }
            X.0ta r1 = r0.A02     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x0042
            X.1Vw r0 = r7.A11     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x006a
            boolean r0 = r1.A0P     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0042
        L_0x006a:
            java.io.File r0 = r1.A0F     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0042
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = r0.getPath()     // Catch:{ all -> 0x00a7 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00a7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0042
            int r3 = r3 + 1
            if (r3 <= r11) goto L_0x0042
            r5.close()     // Catch:{ all -> 0x00ae }
            r4.close()     // Catch:{ SQLiteDiskIOException -> 0x00b3 }
            return r3
        L_0x008c:
            r5.close()     // Catch:{ all -> 0x00ae }
        L_0x008f:
            r4.close()     // Catch:{ SQLiteDiskIOException -> 0x00b3 }
            r6.A01()
            java.lang.String r1 = "mediamsgstore/getMediaMessagesCount/count:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r3
        L_0x00a7:
            r0 = move-exception
            if (r5 == 0) goto L_0x00ad
            r5.close()     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            X.0y0 r0 = r8.A09
            r0.A00(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16480t8.A01(X.1yr, X.0rv, int):int");
    }

    public Cursor A02(C15830rv r8, byte b2) {
        C16800tf A012 = this.A0B.get();
        try {
            Cursor A082 = A012.A02.A08(AnonymousClass1WW.A07, new String[]{String.valueOf(this.A05.A02(r8)), Byte.toString(b2)});
            A012.close();
            return A082;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Cursor A03(C15830rv r9, int i2, long j2) {
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaMessagesHeadCursor:");
        sb.append(r9);
        Log.i(sb.toString());
        C16800tf A012 = this.A0B.get();
        try {
            StringBuilder sb2 = new StringBuilder(C42951yy.A07);
            C224417y.A01(sb2, true);
            if (i2 > 0) {
                sb2.append(" LIMIT ");
                sb2.append(i2);
            }
            String obj = sb2.toString();
            Cursor A082 = A012.A02.A08(obj, new String[]{String.valueOf(this.A05.A02(r9)), String.valueOf(this.A0C.A03(j2))});
            A012.close();
            return A082;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Cursor A04(C15830rv r8, int i2, long j2) {
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaMessagesTailCursor:");
        sb.append(r8);
        Log.i(sb.toString());
        C16800tf A012 = this.A0B.get();
        try {
            StringBuilder sb2 = new StringBuilder(C42951yy.A07);
            C224417y.A01(sb2, false);
            if (i2 > 0) {
                sb2.append(" LIMIT ");
                sb2.append(i2);
            }
            String obj = sb2.toString();
            Cursor A082 = A012.A02.A08(obj, new String[]{String.valueOf(this.A05.A02(r8)), String.valueOf(this.A0C.A03(j2))});
            A012.close();
            return A082;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Cursor A05(C15830rv r8, long j2) {
        StringBuilder sb;
        String str;
        StringBuilder sb2 = new StringBuilder("mediamsgstore/getMediaMessagesOrderedBySizeCursor jid:");
        sb2.append(r8);
        sb2.append(", fileSize:");
        sb2.append(j2);
        Log.i(sb2.toString());
        C16800tf A012 = this.A0B.get();
        try {
            boolean A092 = this.A07.A09();
            boolean z2 = false;
            if (r8 != null) {
                z2 = true;
            }
            String str2 = "";
            if (A092) {
                sb = new StringBuilder();
                sb.append(C42951yy.A00);
                sb.append(z2 ? " AND message.chat_row_id = ?" : str2);
                if (j2 > 0) {
                    str2 = " AND file_size > ?";
                }
                sb.append(str2);
                str = " ORDER BY file_size DESC";
            } else {
                sb = new StringBuilder();
                sb.append(C42951yy.A01);
                sb.append(z2 ? " AND chat_row_id = ?" : str2);
                if (j2 > 0) {
                    str2 = " AND media_size > ?";
                }
                sb.append(str2);
                str = " ORDER BY media_size DESC";
            }
            sb.append(str);
            Cursor A082 = A012.A02.A08(sb.toString(), A0F(r8, j2));
            A012.close();
            return A082;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Cursor A06(C15830rv r5, long j2) {
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaMessagesOrderedByIDAscCursor jid:");
        sb.append(r5);
        sb.append(", fileSize:");
        sb.append(j2);
        Log.i(sb.toString());
        C16800tf A012 = this.A0B.get();
        try {
            boolean A092 = this.A07.A09();
            boolean z2 = false;
            if (r5 != null) {
                z2 = true;
            }
            Cursor A082 = A012.A02.A08(A00(j2, z2, A092, true), A0F(r5, j2));
            A012.close();
            return A082;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Cursor A07(C15830rv r5, long j2) {
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaAndDocMessagesOrderedByIDDescCursor jid:");
        sb.append(r5);
        sb.append(", fileSize:");
        sb.append(j2);
        Log.i(sb.toString());
        C16800tf A012 = this.A0B.get();
        try {
            boolean A092 = this.A07.A09();
            boolean z2 = false;
            if (r5 != null) {
                z2 = true;
            }
            Cursor A082 = A012.A02.A08(A00(j2, z2, A092, false), A0F(r5, j2));
            A012.close();
            return A082;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0108 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C31821f5 A08(java.lang.String r21, byte r22, boolean r23) {
        /*
            r20 = this;
            X.AnonymousClass00B.A00()
            r8 = r20
            X.0tq r0 = r8.A0B
            X.0tf r12 = r0.get()
            X.17I r11 = r8.A07     // Catch:{ all -> 0x0116 }
            boolean r13 = r11.A09()     // Catch:{ all -> 0x0116 }
            r0 = -1
            r4 = 0
            r3 = 1
            r9 = r21
            r5 = r22
            if (r5 == r0) goto L_0x0030
            if (r22 == 0) goto L_0x0030
            if (r13 == 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            java.lang.String r2 = "SELECT thumb_image, media_enc_hash, timestamp,media_hash,media_wa_type,media_url FROM messages AS messages INDEXED BY media_hash_index WHERE media_hash = ? AND media_enc_hash IS NOT NULL AND media_wa_type = ? AND _id NOT IN  (  SELECT _id FROM deleted_messages_ids_view ) ORDER BY _id DESC"
            goto L_0x0024
        L_0x0022:
            java.lang.String r2 = X.C42951yy.A08     // Catch:{ all -> 0x0116 }
        L_0x0024:
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0116 }
            r1[r4] = r21     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = java.lang.Byte.toString(r5)     // Catch:{ all -> 0x0116 }
            r1[r3] = r0     // Catch:{ all -> 0x0116 }
            goto L_0x003c
        L_0x0030:
            if (r13 == 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            java.lang.String r2 = "SELECT thumb_image, media_enc_hash, timestamp,media_hash,media_wa_type,media_url FROM legacy_available_messages_view WHERE media_hash=? AND  media_enc_hash IS NOT NULL AND media_wa_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' )  ORDER BY _id DESC"
            goto L_0x0038
        L_0x0036:
            java.lang.String r2 = X.C42951yy.A09     // Catch:{ all -> 0x0116 }
        L_0x0038:
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x0116 }
            r1[r4] = r21     // Catch:{ all -> 0x0116 }
        L_0x003c:
            X.0tg r0 = r12.A02     // Catch:{ SQLiteDiskIOException -> 0x010e }
            android.database.Cursor r7 = r0.A08(r2, r1)     // Catch:{ SQLiteDiskIOException -> 0x010e }
            if (r7 == 0) goto L_0x0109
            java.lang.String r1 = "media_url"
            java.lang.String r2 = "timestamp"
            if (r13 == 0) goto L_0x004c
            goto L_0x0067
        L_0x004c:
            java.lang.String r0 = "media_enc_hash"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0104 }
            int r5 = r7.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "media_hash"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "media_wa_type"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0104 }
            int r2 = r7.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0104 }
            goto L_0x0081
        L_0x0067:
            java.lang.String r0 = "enc_file_hash"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0104 }
            int r5 = r7.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "file_hash"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "message_type"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0104 }
            int r2 = r7.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0104 }
        L_0x0081:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0100
            if (r13 == 0) goto L_0x008e
            X.0ta r14 = r11.A02(r7)     // Catch:{ all -> 0x0104 }
            goto L_0x009f
        L_0x008e:
            java.lang.String r0 = "thumb_image"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0104 }
            byte[] r0 = r7.getBlob(r0)     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0081
            X.0ta r14 = X.AnonymousClass17I.A00(r9, r0)     // Catch:{ all -> 0x0104 }
        L_0x009f:
            if (r14 == 0) goto L_0x0081
            java.lang.String r15 = r7.getString(r6)     // Catch:{ all -> 0x0104 }
            long r18 = r7.getLong(r5)     // Catch:{ all -> 0x0104 }
            r7.getString(r4)     // Catch:{ all -> 0x0104 }
            long r0 = r7.getLong(r3)     // Catch:{ all -> 0x0104 }
            int r10 = (int) r0     // Catch:{ all -> 0x0104 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0104 }
            java.lang.String r16 = r7.getString(r2)     // Catch:{ all -> 0x0104 }
            java.io.File r0 = r14.A0F     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00f0
            r0.exists()     // Catch:{ all -> 0x0104 }
            byte[] r0 = r14.A0U     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0081
            int r1 = r0.length     // Catch:{ all -> 0x0104 }
            r0 = 32
            if (r1 != r0) goto L_0x0081
            boolean r0 = r14.A0P     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00f0
            java.io.File r0 = r14.A0F     // Catch:{ all -> 0x0104 }
            boolean r0 = r0.isAbsolute()     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x00e0
            X.0sc r1 = r8.A02     // Catch:{ all -> 0x0104 }
            java.io.File r0 = r14.A0F     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0104 }
            java.io.File r0 = r1.A07(r0)     // Catch:{ all -> 0x0104 }
            r14.A0F = r0     // Catch:{ all -> 0x0104 }
        L_0x00e0:
            java.io.File r0 = r14.A0F     // Catch:{ all -> 0x0104 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00f0
            X.1f5 r13 = new X.1f5     // Catch:{ all -> 0x0104 }
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0104 }
            goto L_0x00f9
        L_0x00f0:
            if (r23 != 0) goto L_0x0081
            X.1f5 r13 = new X.1f5     // Catch:{ all -> 0x0104 }
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0104 }
        L_0x00f9:
            r7.close()     // Catch:{ SQLiteDiskIOException -> 0x010e }
            r12.close()
            return r13
        L_0x0100:
            r7.close()     // Catch:{ SQLiteDiskIOException -> 0x010e }
            goto L_0x0109
        L_0x0104:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0108 }
        L_0x0108:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x010e }
        L_0x0109:
            r12.close()
            r13 = 0
            return r13
        L_0x010e:
            r2 = move-exception
            X.0y0 r1 = r8.A09     // Catch:{ all -> 0x0116 }
            r0 = 1
            r1.A00(r0)     // Catch:{ all -> 0x0116 }
            throw r2     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x011a }
        L_0x011a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16480t8.A08(java.lang.String, byte, boolean):X.1f5");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0127 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x0095=Splitter:B:38:0x0095, B:43:0x009d=Splitter:B:43:0x009d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28381Vw A09(java.lang.String r15, java.lang.String r16, byte[] r17, boolean r18) {
        /*
            r14 = this;
            X.17I r8 = r14.A07
            boolean r0 = r8.A09()
            r9 = r17
            if (r0 != 0) goto L_0x00ae
            X.AnonymousClass00B.A00()
            X.0tq r0 = r14.A0B
            X.0tf r4 = r0.get()
            r5 = 1
            X.0tg r3 = r4.A02     // Catch:{ SQLiteDiskIOException -> 0x00a2 }
            java.lang.String r2 = "SELECT key_remote_jid, key_from_me, key_id, thumb_image FROM legacy_available_messages_view WHERE media_hash=? AND media_enc_hash=? AND media_wa_type in ('3', '1' )  ORDER BY _id DESC LIMIT 10"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ SQLiteDiskIOException -> 0x00a2 }
            r0 = 0
            r1[r0] = r15     // Catch:{ SQLiteDiskIOException -> 0x00a2 }
            r1[r5] = r16     // Catch:{ SQLiteDiskIOException -> 0x00a2 }
            android.database.Cursor r8 = r3.A08(r2, r1)     // Catch:{ SQLiteDiskIOException -> 0x00a2 }
            r12 = 0
            if (r8 == 0) goto L_0x009e
            java.lang.String r0 = "key_remote_jid"
            int r10 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "key_from_me"
            int r7 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "key_id"
            int r6 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "thumb_image"
            int r3 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0099 }
            r13 = r12
        L_0x0041:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r8.getString(r10)     // Catch:{ all -> 0x0099 }
            X.0rv r11 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0099 }
            if (r11 != 0) goto L_0x0057
            java.lang.String r0 = "msgstore/getMediaMessageKeyByHashes/jid is null or invalid!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0099 }
            goto L_0x008b
        L_0x0057:
            X.1Vw r2 = new X.1Vw     // Catch:{ all -> 0x0099 }
            int r0 = r8.getInt(r7)     // Catch:{ all -> 0x0099 }
            r1 = 0
            if (r0 != r5) goto L_0x0061
            r1 = 1
        L_0x0061:
            java.lang.String r0 = r8.getString(r6)     // Catch:{ all -> 0x0099 }
            r2.<init>(r11, r0, r1)     // Catch:{ all -> 0x0099 }
            byte[] r0 = r8.getBlob(r3)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0095
            X.0ta r12 = X.AnonymousClass17I.A00(r15, r0)     // Catch:{ all -> 0x0099 }
            if (r12 == 0) goto L_0x008b
            byte[] r11 = r12.A0U     // Catch:{ all -> 0x0099 }
            if (r11 == 0) goto L_0x008b
            int r1 = r11.length     // Catch:{ all -> 0x0099 }
            r0 = 32
            if (r1 != r0) goto L_0x008b
            boolean r0 = r12.A0P     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x008b
            boolean r0 = java.util.Arrays.equals(r11, r9)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x008b
            if (r18 != 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            r13 = r2
        L_0x008b:
            r12 = 0
            goto L_0x0041
        L_0x008d:
            r8.close()     // Catch:{ SQLiteDiskIOException -> 0x00a2 }
            r4.close()
            return r2
        L_0x0094:
            r12 = r13
        L_0x0095:
            r8.close()     // Catch:{ SQLiteDiskIOException -> 0x00a2 }
            goto L_0x009e
        L_0x0099:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x009d }
        L_0x009d:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x00a2 }
        L_0x009e:
            r4.close()
            return r12
        L_0x00a2:
            r1 = move-exception
            X.0y0 r0 = r14.A09     // Catch:{ all -> 0x00a9 }
            r0.A00(r5)     // Catch:{ all -> 0x00a9 }
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0137 }
            throw r0
        L_0x00ae:
            r12 = 0
            X.AnonymousClass00B.A00()
            X.0tq r0 = r14.A0B
            X.0tf r6 = r0.get()
            r5 = 1
            X.0tg r3 = r6.A02     // Catch:{ SQLiteDiskIOException -> 0x012c }
            java.lang.String r2 = X.C42951yy.A0A     // Catch:{ SQLiteDiskIOException -> 0x012c }
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ SQLiteDiskIOException -> 0x012c }
            r0 = 0
            r1[r0] = r15     // Catch:{ SQLiteDiskIOException -> 0x012c }
            r1[r5] = r16     // Catch:{ SQLiteDiskIOException -> 0x012c }
            android.database.Cursor r10 = r3.A08(r2, r1)     // Catch:{ SQLiteDiskIOException -> 0x012c }
            if (r10 == 0) goto L_0x0128
            java.lang.String r0 = "from_me"
            int r11 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "key_id"
            int r7 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0123 }
        L_0x00d7:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x011f
            X.0ts r0 = r14.A05     // Catch:{ all -> 0x0123 }
            X.0rv r2 = r0.A06(r10)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00eb
            java.lang.String r0 = "msgstore/getMediaMessageKeyByHashes/jid is null or invalid!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0123 }
            goto L_0x00d7
        L_0x00eb:
            X.1Vw r4 = new X.1Vw     // Catch:{ all -> 0x0123 }
            int r0 = r10.getInt(r11)     // Catch:{ all -> 0x0123 }
            r1 = 0
            if (r0 != r5) goto L_0x00f5
            r1 = 1
        L_0x00f5:
            java.lang.String r0 = r10.getString(r7)     // Catch:{ all -> 0x0123 }
            r4.<init>(r2, r0, r1)     // Catch:{ all -> 0x0123 }
            X.0ta r3 = r8.A02(r10)     // Catch:{ all -> 0x0123 }
            byte[] r2 = r3.A0U     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x00d7
            int r1 = r2.length     // Catch:{ all -> 0x0123 }
            r0 = 32
            if (r1 != r0) goto L_0x00d7
            boolean r0 = r3.A0P     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00d7
            boolean r0 = java.util.Arrays.equals(r2, r9)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00d7
            if (r18 != 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r12 = r4
            goto L_0x00d7
        L_0x0118:
            r10.close()     // Catch:{ SQLiteDiskIOException -> 0x012c }
            r6.close()
            return r4
        L_0x011f:
            r10.close()     // Catch:{ SQLiteDiskIOException -> 0x012c }
            goto L_0x0128
        L_0x0123:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0127 }
        L_0x0127:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x012c }
        L_0x0128:
            r6.close()
            return r12
        L_0x012c:
            r1 = move-exception
            X.0y0 r0 = r14.A09     // Catch:{ all -> 0x0133 }
            r0.A00(r5)     // Catch:{ all -> 0x0133 }
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0137 }
        L_0x0137:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16480t8.A09(java.lang.String, java.lang.String, byte[], boolean):X.1Vw");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0044=Splitter:B:21:0x0044, B:16:0x003c=Splitter:B:16:0x003c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16730tY A0A(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x004e
            X.0tq r0 = r6.A0B
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video, media_caption FROM message_media WHERE original_file_hash = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x0049 }
            android.database.Cursor r3 = r3.A08(r2, r1)     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0045
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "message_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0040 }
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x0040 }
            X.0th r0 = r6.A04     // Catch:{ all -> 0x0040 }
            X.0tZ r1 = r0.A00(r1)     // Catch:{ all -> 0x0040 }
            boolean r0 = r1 instanceof X.C16730tY     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003c
            X.0tY r1 = (X.C16730tY) r1     // Catch:{ all -> 0x0040 }
            r3.close()     // Catch:{ all -> 0x0049 }
            r4.close()
            return r1
        L_0x003c:
            r3.close()     // Catch:{ all -> 0x0049 }
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0045:
            r4.close()
            return r5
        L_0x0049:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16480t8.A0A(java.lang.String):X.0tY");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00c9 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00a2=Splitter:B:35:0x00a2, B:48:0x00c9=Splitter:B:48:0x00c9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0B(X.C42891yr r10, X.C15830rv r11, int r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "mediamsgstore/getMediaMessages:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = " limit:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 0
            X.1Zf r6 = new X.1Zf
            r6.<init>((boolean) r7)
            java.lang.String r0 = "mediamsgstore/getMediaMessages/"
            r6.A04(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.0ts r0 = r9.A05
            long r0 = r0.A02(r11)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            r0 = 2
            if (r13 != r0) goto L_0x003a
            java.lang.String r4 = X.C42951yy.A05
        L_0x0038:
            r3 = 1
            goto L_0x003d
        L_0x003a:
            java.lang.String r4 = X.C42951yy.A06
            goto L_0x0038
        L_0x003d:
            X.0tq r0 = r9.A0B     // Catch:{ SQLiteDiskIOException -> 0x00ca }
            X.0tf r5 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x00ca }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x00c5 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x00c5 }
            r0[r7] = r8     // Catch:{ all -> 0x00c5 }
            android.database.Cursor r4 = r1.A08(r4, r0)     // Catch:{ all -> 0x00c5 }
            if (r4 != 0) goto L_0x0055
            java.lang.String r0 = "mediamsgstore/getMediaMessages/db/cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00be }
            goto L_0x009d
        L_0x0055:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x009d
            if (r10 == 0) goto L_0x0063
            boolean r0 = r10.AfQ()     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x009d
        L_0x0063:
            X.0th r0 = r9.A04     // Catch:{ all -> 0x00be }
            X.0tZ r8 = r0.A02(r4, r11, r7)     // Catch:{ all -> 0x00be }
            boolean r0 = r8 instanceof X.C16730tY     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0055
            X.0tY r8 = (X.C16730tY) r8     // Catch:{ all -> 0x00be }
            X.0ta r1 = r8.A02     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x0055
            X.1Vw r0 = r8.A11     // Catch:{ all -> 0x00be }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x007d
            boolean r0 = r1.A0P     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0055
        L_0x007d:
            java.io.File r0 = r1.A0F     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0055
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r0.getPath()     // Catch:{ all -> 0x00be }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00be }
            r0.<init>(r1)     // Catch:{ all -> 0x00be }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0055
            r2.add(r8)     // Catch:{ all -> 0x00be }
            int r0 = r2.size()     // Catch:{ all -> 0x00be }
            if (r0 < r12) goto L_0x0055
        L_0x009d:
            if (r4 == 0) goto L_0x00a2
            r4.close()     // Catch:{ all -> 0x00c5 }
        L_0x00a2:
            r5.close()     // Catch:{ SQLiteDiskIOException -> 0x00ca }
            r6.A01()
            java.lang.String r0 = "mediamsgstore/getMediaMessages/size:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x00be:
            r0 = move-exception
            if (r4 == 0) goto L_0x00c4
            r4.close()     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            X.0y0 r0 = r9.A09
            r0.A00(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16480t8.A0B(X.1yr, X.0rv, int, int):java.util.ArrayList");
    }

    public Collection A0C(AnonymousClass024 r5, File file, String str) {
        ArrayList arrayList = new ArrayList();
        for (C16730tY r1 : A0D(r5, str, (byte) -1)) {
            C16750ta r0 = r1.A02;
            if (r0 != null && file.equals(r0.A0F)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection A0D(X.AnonymousClass024 r7, java.lang.String r8, byte r9) {
        /*
            r6 = this;
            X.AnonymousClass00B.A00()
            r4 = 0
            r3 = 1
            r1 = -1
            X.17I r0 = r6.A07
            boolean r0 = r0.A09()
            if (r9 != r1) goto L_0x0025
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = X.C42951yy.A04
        L_0x0012:
            java.lang.String[] r1 = new java.lang.String[r3]
            r1[r4] = r8
        L_0x0016:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0tq r0 = r6.A0B
            X.0tf r4 = r0.get()
            goto L_0x0038
        L_0x0022:
            java.lang.String r2 = X.C34001jX.A02
            goto L_0x0012
        L_0x0025:
            if (r0 == 0) goto L_0x0035
            java.lang.String r2 = X.C42951yy.A03
        L_0x0029:
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r1[r4] = r8
            java.lang.String r0 = java.lang.Byte.toString(r9)
            r1[r3] = r0
            goto L_0x0016
        L_0x0035:
            java.lang.String r2 = X.C34001jX.A01
            goto L_0x0029
        L_0x0038:
            X.0tg r0 = r4.A02     // Catch:{ SQLiteDiskIOException -> 0x0065 }
            android.database.Cursor r2 = r0.A07(r7, r2, r1)     // Catch:{ SQLiteDiskIOException -> 0x0065 }
        L_0x003e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            if (r7 == 0) goto L_0x0049
            r7.A02()     // Catch:{ all -> 0x0060 }
        L_0x0049:
            X.0th r0 = r6.A04     // Catch:{ all -> 0x0060 }
            X.0tZ r1 = r0.A01(r2)     // Catch:{ all -> 0x0060 }
            boolean r0 = r1 instanceof X.C16730tY     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x003e
            X.0tY r1 = (X.C16730tY) r1     // Catch:{ all -> 0x0060 }
            r5.add(r1)     // Catch:{ all -> 0x0060 }
            goto L_0x003e
        L_0x0059:
            r2.close()     // Catch:{ SQLiteDiskIOException -> 0x0065 }
            r4.close()
            return r5
        L_0x0060:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            X.0y0 r0 = r6.A09     // Catch:{ all -> 0x006c }
            r0.A00(r3)     // Catch:{ all -> 0x006c }
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16480t8.A0D(X.024, java.lang.String, byte):java.util.Collection");
    }

    public Collection A0E(String str, byte b2) {
        File file;
        Collection<C16730tY> A0D2 = A0D((AnonymousClass024) null, str, b2);
        ArrayList arrayList = new ArrayList(A0D2.size());
        for (C16730tY r2 : A0D2) {
            C16750ta r1 = r2.A02;
            if (r1 != null && r1.A0P && (file = r1.A0F) != null && file.exists()) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    public final String[] A0F(C15830rv r5, long j2) {
        ArrayList arrayList = new ArrayList();
        if (r5 != null) {
            arrayList.add(String.valueOf(this.A05.A02(r5)));
        }
        if (j2 > 0) {
            arrayList.add(String.valueOf(j2));
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(A0E);
    }
}
