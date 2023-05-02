package X;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import android.util.Log;

/* renamed from: X.0AA  reason: invalid class name */
public class AnonymousClass0AA extends AsyncQueryHandler {
    public final /* synthetic */ AnonymousClass0F3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0AA(ContentResolver contentResolver, AnonymousClass0F3 r2) {
        super(contentResolver);
        this.A00 = r2;
    }

    public void onQueryComplete(int i2, Object obj, Cursor cursor) {
        String str;
        if (cursor == null) {
            Log.w("CarApp.Conn", "Null response from content provider when checking connection to the car, treating as disconnected");
        } else {
            int columnIndex = cursor.getColumnIndex("CarConnectionState");
            if (columnIndex < 0) {
                str = "Connection to car response is missing the connection type, treating as disconnected";
            } else if (!cursor.moveToNext()) {
                str = "Connection to car response is empty, treating as disconnected";
            } else {
                this.A00.A09(Integer.valueOf(cursor.getInt(columnIndex)));
                return;
            }
            Log.e("CarApp.Conn", str);
        }
        this.A00.A09(0);
    }
}
