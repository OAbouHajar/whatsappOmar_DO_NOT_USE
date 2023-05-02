package z;

import X.AnonymousClass01V;
import X.C1036352d;
import X.C16730tY;
import X.C16740tZ;
import X.C16820th;
import X.C17020u3;
import X.C17250um;
import X.C25791Ld;
import X.C30581cc;
import X.C30991dI;
import X.C56342nU;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.obwhatsapp.TextData;
import com.obwhatsapp.status.playback.MyStatusesActivity;
import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.obwhatsapp.yo.dep;
import com.obwhatsapp.yo.f0;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.views.l;
import com.whatsapp.MediaData;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import rc.whatsapp.dialog.DialogAdd;

/* compiled from: XFMFile */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static i f2848a;

    /* renamed from: b  reason: collision with root package name */
    public static long f2849b;

    /* renamed from: c  reason: collision with root package name */
    public static C17250um f2850c;

    /* renamed from: d  reason: collision with root package name */
    public static AnonymousClass01V f2851d;

    /* renamed from: e  reason: collision with root package name */
    public static C17020u3 f2852e;

    /* renamed from: f  reason: collision with root package name */
    public static C1036352d f2853f;

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f2854g = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f2855h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    public static long a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        try {
            return DatabaseUtils.queryNumEntries(sQLiteDatabase, "message", "chat_row_id=? AND sender_jid_row_id=? AND text_data IS NOT NULL", new String[]{String.valueOf(i2), String.valueOf(i3)});
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i3] & 255) >> 2];
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr3[i4] = bArr2[((bArr[i3] & 3) << 4) | ((bArr[i6] & 255) >> 4)];
            int i7 = i5 + 1;
            int i8 = i3 + 2;
            bArr3[i5] = bArr2[((bArr[i6] & 15) << 2) | ((bArr[i8] & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[bArr[i8] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i10] = 61;
            bArr3[i10 + 1] = 61;
        } else if (length2 == 2) {
            int i11 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            int i12 = i11 + 1;
            int i13 = length + 1;
            bArr3[i11] = bArr2[((bArr[i13] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i12] = bArr2[(bArr[i13] & 15) << 2];
            bArr3[i12 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public static Cursor c(SQLiteDatabase sQLiteDatabase, int i2, int i3, String str) {
        try {
            return sQLiteDatabase.query("message", new String[]{"_id", "text_data", "timestamp", "key_id"}, "chat_row_id=? AND sender_jid_row_id=? AND text_data IS NOT NULL", new String[]{String.valueOf(i2), String.valueOf(i3)}, (String) null, (String) null, (String) null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r1.isClosed() == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r1.isClosed() == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r1.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(android.database.sqlite.SQLiteDatabase r12, int r13) {
        /*
            java.lang.String r0 = "_id"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "jid_row_id"
            java.lang.String[] r6 = new java.lang.String[]{r0, r3}     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            java.lang.String r7 = "jid_row_id=?"
            r3 = 1
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            r8[r2] = r13     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            java.lang.String r5 = "chat"
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r12
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
        L_0x001f:
            int r12 = r1.getCount()     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            if (r12 <= 0) goto L_0x0034
            int r12 = r1.getPosition()     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            if (r12 != 0) goto L_0x0034
            int r12 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            int r12 = r1.getInt(r12)     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            r2 = r12
        L_0x0034:
            boolean r12 = r1.moveToNext()     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            if (r12 != 0) goto L_0x001f
            boolean r12 = r1.isClosed()
            if (r12 != 0) goto L_0x005b
            goto L_0x0058
        L_0x0041:
            goto L_0x0050
        L_0x0043:
            r12 = move-exception
            if (r1 == 0) goto L_0x004f
            boolean r13 = r1.isClosed()
            if (r13 != 0) goto L_0x004f
            r1.close()
        L_0x004f:
            throw r12
        L_0x0050:
            if (r1 == 0) goto L_0x005b
            boolean r12 = r1.isClosed()
            if (r12 != 0) goto L_0x005b
        L_0x0058:
            r1.close()
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.d(android.database.sqlite.SQLiteDatabase, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r1.isClosed() == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r1.isClosed() == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r1.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(android.database.sqlite.SQLiteDatabase r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "_id"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "raw_string"
            java.lang.String[] r6 = new java.lang.String[]{r0, r3}     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            java.lang.String r7 = "raw_string=?"
            r3 = 1
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            r8[r2] = r13     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            java.lang.String r5 = "jid"
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r12
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
        L_0x001f:
            int r12 = r1.getCount()     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            if (r12 <= 0) goto L_0x0034
            int r12 = r1.getPosition()     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            if (r12 != 0) goto L_0x0034
            int r12 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            int r12 = r1.getInt(r12)     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            r2 = r12
        L_0x0034:
            boolean r12 = r1.moveToNext()     // Catch:{ Exception -> 0x0041, all -> 0x0043 }
            if (r12 != 0) goto L_0x001f
            boolean r12 = r1.isClosed()
            if (r12 != 0) goto L_0x005b
            goto L_0x0058
        L_0x0041:
            goto L_0x0050
        L_0x0043:
            r12 = move-exception
            if (r1 == 0) goto L_0x004f
            boolean r13 = r1.isClosed()
            if (r13 != 0) goto L_0x004f
            r1.close()
        L_0x004f:
            throw r12
        L_0x0050:
            if (r1 == 0) goto L_0x005b
            boolean r12 = r1.isClosed()
            if (r12 != 0) goto L_0x005b
        L_0x0058:
            r1.close()
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.e(android.database.sqlite.SQLiteDatabase, java.lang.String):int");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r5 == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r3.isClosed() == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r3.close();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap f(android.database.sqlite.SQLiteDatabase r5, java.util.Set r6) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "SELECT _id, raw_string from jid WHERE _id in ("
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            java.lang.Object[] r6 = r6.toArray()     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            java.lang.String r6 = java.util.Arrays.toString(r6)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            java.lang.String r4 = "["
            java.lang.String r6 = r6.replace(r4, r0)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            java.lang.String r4 = "]"
            java.lang.String r6 = r6.replace(r4, r0)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            r0.append(r6)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            java.lang.String r6 = ")"
            r0.append(r6)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            android.database.Cursor r3 = r5.rawQuery(r6, r3)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            if (r3 == 0) goto L_0x005d
            int r5 = r3.getCount()     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            if (r5 > 0) goto L_0x003c
            goto L_0x005d
        L_0x003c:
            boolean r5 = r3.moveToNext()     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            if (r5 == 0) goto L_0x0054
            r5 = 0
            int r5 = r3.getInt(r5)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            r6 = 1
            java.lang.String r6 = r3.getString(r6)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x005b, all -> 0x0069 }
            goto L_0x003c
        L_0x0054:
            boolean r5 = r3.isClosed()
            if (r5 != 0) goto L_0x0081
            goto L_0x007e
        L_0x005b:
            goto L_0x0076
        L_0x005d:
            if (r3 == 0) goto L_0x0068
            boolean r5 = r3.isClosed()
            if (r5 != 0) goto L_0x0068
            r3.close()
        L_0x0068:
            return r2
        L_0x0069:
            r5 = move-exception
            if (r3 == 0) goto L_0x0075
            boolean r6 = r3.isClosed()
            if (r6 != 0) goto L_0x0075
            r3.close()
        L_0x0075:
            throw r5
        L_0x0076:
            if (r3 == 0) goto L_0x0081
            boolean r5 = r3.isClosed()
            if (r5 != 0) goto L_0x0081
        L_0x007e:
            r3.close()
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.f(android.database.sqlite.SQLiteDatabase, java.util.Set):java.util.HashMap");
    }

    public static boolean g(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = 'messages'", (String[]) null);
        if (rawQuery != null) {
            int count = rawQuery.getCount();
            rawQuery.close();
            if (count > 0) {
                return true;
            }
        }
        return false;
    }

    public static void h(ImageView imageView, String str, boolean z2) {
        if (z2) {
            File file = new File(yo.getCtx().getFilesDir().getAbsolutePath() + "/Avatars", "me.j");
            if (file.exists()) {
                imageView.setImageBitmap(BitmapFactory.decodeFile(file.getAbsolutePath()));
            } else {
                imageView.setImageResource(yo.getID("avatar_contact", "drawable"));
            }
            str = "me";
        } else {
            dep.loadCImage(str, imageView);
        }
        imageView.setTag(str);
    }

    public static void i(C16820th r9, C25791Ld r10, ImageView imageView, ViewGroup viewGroup, C30991dI r13) {
        try {
            C16740tZ r0 = r13.A08;
            if (r0 == null) {
                r13.A08 = r9.A00(r13.A04);
            }
            if (f2850c == null) {
                f2850c = C17250um.A21();
                f2851d = AnonymousClass01V.A21();
                f2852e = C17020u3.A21();
                f2853f = new C1036352d(yo.getCtx());
            }
            String str = yo.mpack;
            if (r0 instanceof C16730tY) {
                File file = ((MediaData) ((C16730tY) r0).A0H()).file;
                imageView.post(new l(file, r10, imageView, r13));
                if (file == null || !file.exists()) {
                    r10.A09(imageView, r13.A08, f2853f, (Object) null);
                } else {
                    r10.A07(imageView, r13.A08, f2853f);
                }
            } else {
                String A0I = r0.A0I();
                if (A0I.length() > 700) {
                    A0I = A0I.substring(0, 700);
                }
                String str2 = A0I;
                TextData textData = ((C30581cc) r0).A02;
                imageView.setImageDrawable(new C56342nU(yo.getCtx(), (Typeface) null, textData, f2851d, f2850c, f2852e, str2));
                View findViewWithTag = viewGroup.findViewWithTag("textBackground");
                if (findViewWithTag == null) {
                    return;
                }
                if (findViewWithTag instanceof CardView) {
                    ((CardView) findViewWithTag).setCardBackgroundColor(textData.backgroundColor);
                } else {
                    findViewWithTag.setBackgroundColor(textData.backgroundColor);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        if (r4.isClosed() == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r4.isClosed() == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        r4.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList j(android.database.sqlite.SQLiteDatabase r17, java.lang.String r18, java.lang.String r19) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r19
            int r2 = e(r0, r2)
            int r3 = e(r17, r18)
            int r3 = d(r0, r3)
            r4 = 0
            long r5 = a(r0, r3, r2)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r7 = 0
            r8 = 0
        L_0x001c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r9.<init>()     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r9.append(r8)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            java.lang.String r10 = ", "
            r9.append(r10)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r10 = 1000(0x3e8, float:1.401E-42)
            r9.append(r10)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            android.database.Cursor r4 = c(r0, r3, r2, r9)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            if (r4 != 0) goto L_0x0039
            goto L_0x006a
        L_0x0039:
            boolean r9 = r4.moveToNext()     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            if (r9 == 0) goto L_0x005d
            com.obwhatsapp.yo.f0 r9 = new com.obwhatsapp.yo.f0     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            int r10 = r4.getInt(r7)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            long r11 = (long) r10     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r10 = 1
            java.lang.String r13 = r4.getString(r10)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r10 = 2
            long r14 = r4.getLong(r10)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r10 = 3
            java.lang.String r16 = r4.getString(r10)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r10 = r9
            r10.<init>(r11, r13, r14, r16)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            r1.add(r9)     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            goto L_0x0039
        L_0x005d:
            int r9 = r4.getCount()     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            int r9 = r9 + r8
            long r9 = (long) r9     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 < 0) goto L_0x0073
            r4.close()     // Catch:{ Exception -> 0x0083, all -> 0x0076 }
        L_0x006a:
            if (r4 == 0) goto L_0x008f
            boolean r0 = r4.isClosed()
            if (r0 != 0) goto L_0x008f
            goto L_0x008c
        L_0x0073:
            int r8 = r8 + 1000
            goto L_0x001c
        L_0x0076:
            r0 = move-exception
            if (r4 == 0) goto L_0x0082
            boolean r1 = r4.isClosed()
            if (r1 != 0) goto L_0x0082
            r4.close()
        L_0x0082:
            throw r0
        L_0x0083:
            if (r4 == 0) goto L_0x008f
            boolean r0 = r4.isClosed()
            if (r0 != 0) goto L_0x008f
        L_0x008c:
            r4.close()
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.j(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList k(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor query;
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"_id", "data", "timestamp", "key_id"};
        String[] strArr2 = {str, str2};
        long queryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, "messages", "key_remote_jid=? AND remote_resource=? AND data !='null'", strArr2);
        if (queryNumEntries < 1) {
            return arrayList;
        }
        Cursor cursor = null;
        int i2 = 0;
        while (true) {
            try {
                int i3 = i2;
                query = sQLiteDatabase.query("messages", strArr, "key_remote_jid=? AND remote_resource=? AND data !='null'", strArr2, (String) null, (String) null, (String) null, i2 + ", " + 1000);
                if (query == null) {
                    break;
                }
                while (query.moveToNext()) {
                    try {
                        arrayList.add(new f0(query.getLong(0), query.getString(1), query.getLong(2), query.getString(3)));
                    } catch (Exception unused) {
                        cursor = query;
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                int i4 = i3;
                if (((long) (i4 + query.getCount())) >= queryNumEntries) {
                    query.close();
                    break;
                }
                i2 = i4 + 1000;
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                cursor = query;
            } catch (Exception unused2) {
                cursor.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursor.close();
                throw th;
            }
        }
        if (query != null && !query.isClosed()) {
            query.close();
        }
        return arrayList;
    }

    public static void l(Activity activity, String str, C30991dI r2, boolean z2) {
        if (!z2) {
            Intent intent = new Intent(activity, StatusPlaybackActivity.class);
            intent.putExtra("jid", str);
            activity.startActivity(intent);
        } else if (r2.A00 == 0) {
            new DialogAdd(activity).show();
        } else {
            activity.startActivity(new Intent(activity, MyStatusesActivity.class));
        }
    }

    public static void m(i iVar) {
        if (iVar.f2846f != null || iVar.f2847g != null) {
            throw new IllegalArgumentException();
        } else if (!iVar.f2844d) {
            synchronized (j.class) {
                long j2 = f2849b + 8192;
                if (j2 <= 65536) {
                    f2849b = j2;
                    iVar.f2846f = f2848a;
                    iVar.f2843c = 0;
                    iVar.f2842b = 0;
                    f2848a = iVar;
                }
            }
        }
    }

    public static i n() {
        synchronized (j.class) {
            i iVar = f2848a;
            if (iVar == null) {
                return new i();
            }
            f2848a = iVar.f2846f;
            iVar.f2846f = null;
            f2849b -= 8192;
            return iVar;
        }
    }
}
