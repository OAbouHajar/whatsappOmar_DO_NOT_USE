package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.0ty  reason: invalid class name and case insensitive filesystem */
public class C16970ty extends C16780td {
    public final C16980tz A00;
    public final C206911f A01;
    public final AnonymousClass1UY A02 = new AnonymousClass1UY(new AnonymousClass01T(Collections.emptySet(), (AnonymousClass01J) null));
    public final String A03;

    public C16970ty(C16300so r10, C16980tz r11, C206911f r12, C14710pd r13, String str) {
        super(r11.A00, r10, r13, str, 1);
        this.A03 = str;
        this.A00 = r11;
        this.A01 = r12;
    }

    public void A04() {
        super.A04();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C40991v1) it.next()).A0C();
        }
    }

    public synchronized C16810tg A05() {
        C16810tg r0;
        try {
            r0 = C33931jQ.A01(A00(), this.A01);
        } catch (SQLiteDatabaseCorruptException e2) {
            Log.w("chat-settings-store/corrupt/removing", e2);
            A04();
            r0 = C33931jQ.A01(super.A00(), this.A01);
        } catch (SQLiteException e3) {
            if (e3.toString().contains("file is encrypted")) {
                Log.w("chat-settings-store/encrypted/removing", e3);
                A04();
                r0 = C33931jQ.A01(super.A00(), this.A01);
            } else {
                throw e3;
            }
        } catch (StackOverflowError e4) {
            Log.w("chat-settings-store/stackoverflowerror", e4);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                if (stackTrace[i2].getMethodName().equals("onCorruption")) {
                    Log.w("chat-settings-store/stackoverflowerror/corrupt/removing");
                    A04();
                    r0 = C33931jQ.A01(super.A00(), this.A01);
                } else {
                    i2++;
                }
            }
            throw e4;
        }
        return r0;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("chat-settings-store/create");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
        sQLiteDatabase.execSQL("CREATE TABLE settings (_id INTEGER PRIMARY KEY AUTOINCREMENT,jid TEXT,deleted INTEGER,mute_end INTEGER,muted_notifications BOOLEAN,use_custom_notifications BOOLEAN,message_tone TEXT,message_vibrate INTEGER,message_popup INTEGER,message_light INTEGER,call_tone TEXT,call_vibrate INTEGER,status_muted INTEGER,pinned BOOLEAN,pinned_time INTEGER,low_pri_notifications BOOLEAN,media_visibility INTEGER,mute_reactions INTEGER,wallpaper_light_type TEXT,wallpaper_light_value TEXT,wallpaper_dark_type TEXT,wallpaper_dark_value TEXT,wallpaper_dark_opacity INTEGER,notifications_auto_muted INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS jid_index ON settings(jid);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("chat-settings-store/downgrade from ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C16810tg A012 = C33931jQ.A01(sQLiteDatabase, this.A01);
        String A002 = C33961jT.A00(A012, "table", "settings");
        if (!TextUtils.isEmpty(A002)) {
            C33961jT.A02(A012, A002, "settings", "status_muted", "INTEGER", "ChatSettingsDatabaseHelper");
            C16810tg r8 = A012;
            String str = A002;
            String str2 = "settings";
            String str3 = "ChatSettingsDatabaseHelper";
            C33961jT.A02(r8, str, str2, "pinned", "BOOLEAN", str3);
            C33961jT.A02(A012, A002, "settings", "pinned_time", "INTEGER", "ChatSettingsDatabaseHelper");
            C33961jT.A02(r8, str, str2, "low_pri_notifications", "BOOLEAN", str3);
            C33961jT.A02(A012, A002, "settings", "media_visibility", "INTEGER", "ChatSettingsDatabaseHelper");
            C33961jT.A02(A012, A002, "settings", "mute_reactions", "INTEGER", "ChatSettingsDatabaseHelper");
            C33961jT.A02(r8, str, str2, "notifications_auto_muted", "INTEGER NOT NULL DEFAULT 0", str3);
            C33961jT.A02(r8, str, str2, "wallpaper_light_type", "TEXT", str3);
            C33961jT.A02(r8, str, str2, "wallpaper_light_value", "TEXT", str3);
            C33961jT.A02(r8, str, str2, "wallpaper_dark_type", "TEXT", str3);
            C33961jT.A02(r8, str, str2, "wallpaper_dark_value", "TEXT", str3);
            C33961jT.A02(A012, A002, "settings", "wallpaper_dark_opacity", "INTEGER", "ChatSettingsDatabaseHelper");
        }
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C40991v1) it.next()).A0I(A012);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("chat-settings-store/upgrade from ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }
}
