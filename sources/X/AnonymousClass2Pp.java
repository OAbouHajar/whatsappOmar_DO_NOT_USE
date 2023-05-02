package X;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.OperationCanceledException;

/* renamed from: X.2Pp  reason: invalid class name */
public class AnonymousClass2Pp extends CursorWrapper {
    public AnonymousClass2Pp(Cursor cursor) {
        super(cursor);
    }

    public static final RuntimeException A00(RuntimeException runtimeException) {
        return runtimeException instanceof OperationCanceledException ? new AnonymousClass057(runtimeException.getMessage()) : runtimeException;
    }

    public int getCount() {
        try {
            return super.getCount();
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean isAfterLast() {
        try {
            return super.isAfterLast();
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean isBeforeFirst() {
        try {
            return super.isBeforeFirst();
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean isFirst() {
        try {
            return super.isFirst();
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean isLast() {
        try {
            return super.isLast();
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean move(int i2) {
        try {
            return super.move(i2);
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean moveToFirst() {
        try {
            return super.moveToFirst();
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean moveToLast() {
        try {
            return super.moveToLast();
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean moveToNext() {
        try {
            return super.moveToNext();
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean moveToPosition(int i2) {
        try {
            return super.moveToPosition(i2);
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }

    public boolean moveToPrevious() {
        try {
            return super.moveToPrevious();
        } catch (RuntimeException e2) {
            throw A00(e2);
        }
    }
}
