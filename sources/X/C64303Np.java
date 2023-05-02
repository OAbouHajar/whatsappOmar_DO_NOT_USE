package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.obwhatsapp.R;
import com.obwhatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.3Np  reason: invalid class name and case insensitive filesystem */
public class C64303Np extends CursorAdapter {
    public final C14550pN A00;
    public final /* synthetic */ AudioPickerActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64303Np(C14550pN r3, AudioPickerActivity audioPickerActivity) {
        super(r3, (Cursor) null, 0);
        this.A01 = audioPickerActivity;
        this.A00 = r3;
    }

    public final AnonymousClass38M A00(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new AnonymousClass38M(this.A01, cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getInt(0), cursor.getInt(4), cursor.getInt(5));
    }

    public void bindView(View view, Context context, Cursor cursor) {
        new C615739l(view, this.A01, cursor.getPosition()).A03(this.A00, A00(cursor));
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return C13680ns.A0H(this.A01.getLayoutInflater(), viewGroup, R.layout.layout007f);
    }
}
