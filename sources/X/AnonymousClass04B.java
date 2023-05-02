package X;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: X.04B  reason: invalid class name */
public abstract class AnonymousClass04B extends BaseAdapter implements AnonymousClass04C, Filterable {
    public int A00;
    public Context A01;
    public Cursor A02 = null;
    public DataSetObserver A03;
    public AnonymousClass0AM A04;
    public AnonymousClass0C7 A05;
    public boolean A06 = true;
    public boolean A07 = false;

    @Deprecated
    public AnonymousClass04B(Context context) {
        this.A01 = context;
        this.A00 = -1;
        this.A04 = new AnonymousClass0AM(this);
        this.A03 = new AnonymousClass0AO(this);
    }

    public AnonymousClass04B(Context context, Cursor cursor, boolean z2) {
        this.A01 = context;
        this.A00 = -1;
        this.A04 = new AnonymousClass0AM(this);
        this.A03 = new AnonymousClass0AO(this);
    }

    public Cursor A00(Cursor cursor) {
        Cursor cursor2 = this.A02;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            AnonymousClass0AM r0 = this.A04;
            if (r0 != null) {
                cursor2.unregisterContentObserver(r0);
            }
            DataSetObserver dataSetObserver = this.A03;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A02 = cursor;
        if (cursor != null) {
            AnonymousClass0AM r02 = this.A04;
            if (r02 != null) {
                cursor.registerContentObserver(r02);
            }
            DataSetObserver dataSetObserver2 = this.A03;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.A00 = cursor.getColumnIndexOrThrow("_id");
            this.A07 = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.A00 = -1;
        this.A07 = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public View A01(Context context, Cursor cursor, ViewGroup viewGroup) {
        return A02(context, cursor, viewGroup);
    }

    public abstract View A02(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void A03(View view, Context context, Cursor cursor);

    public void A65(Cursor cursor) {
        Cursor A002 = A00(cursor);
        if (A002 != null) {
            A002.close();
        }
    }

    public CharSequence A6k(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor Acr(CharSequence charSequence) {
        return this.A02;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.A07) {
            return null;
        }
        this.A02.moveToPosition(i2);
        if (view == null) {
            view = A01(this.A01, this.A02, viewGroup);
        }
        A03(view, this.A01, this.A02);
        return view;
    }

    public Filter getFilter() {
        AnonymousClass0C7 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0C7 r02 = new AnonymousClass0C7(this);
        this.A05 = r02;
        return r02;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.A02;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.A02.getLong(this.A00);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.A07) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.A02.moveToPosition(i2)) {
            if (view == null) {
                view = A02(this.A01, this.A02, viewGroup);
            }
            A03(view, this.A01, this.A02);
            return view;
        } else {
            StringBuilder sb = new StringBuilder("couldn't move cursor to position ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean hasStableIds() {
        return true;
    }
}
