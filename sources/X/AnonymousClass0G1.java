package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.0G1  reason: invalid class name */
public final class AnonymousClass0G1 extends AnonymousClass0PS {
    public final Context A00;

    public AnonymousClass0G1(Context context) {
        super(9, 10);
        this.A00 = context;
    }

    public void A00(C13620mg r15) {
        C18450wi.A0H(r15, 0);
        r15.A8n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.A00;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j2 = 0;
            long j3 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j2 = 1;
            }
            SQLiteDatabase sQLiteDatabase = ((C07700cK) r15).A00;
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j3)});
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            SQLiteDatabase sQLiteDatabase2 = ((C07700cK) r15).A00;
            sQLiteDatabase2.beginTransaction();
            try {
                Object[] objArr = new Object[2];
                objArr[0] = "next_job_scheduler_id";
                AnonymousClass000.A1M(objArr, i2, 1);
                sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
                Object[] objArr2 = new Object[2];
                objArr2[0] = "next_alarm_manager_id";
                AnonymousClass000.A1M(objArr2, i3, 1);
                sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr2);
                sharedPreferences2.edit().clear().apply();
                sQLiteDatabase2.setTransactionSuccessful();
            } finally {
                sQLiteDatabase2.endTransaction();
            }
        }
    }
}
