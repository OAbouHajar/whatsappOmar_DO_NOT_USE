package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.AbstractMap;

/* renamed from: X.1jP  reason: invalid class name and case insensitive filesystem */
public class C33921jP implements SQLiteTransactionListener {
    public final String A00;
    public final ThreadLocal A01 = new C33951jS(this);
    public final ThreadLocal A02 = new C33941jR(this);

    public C33921jP(String str) {
        this.A00 = str;
    }

    public void onBegin() {
    }

    public void onCommit() {
        Object obj = this.A02.get();
        AnonymousClass00B.A06(obj);
        AbstractMap abstractMap = (AbstractMap) obj;
        try {
            for (SQLiteTransactionListener onCommit : abstractMap.values()) {
                onCommit.onCommit();
            }
        } finally {
            abstractMap.clear();
            this.A01.set(Boolean.FALSE);
        }
    }

    public void onRollback() {
        Object obj = this.A02.get();
        AnonymousClass00B.A06(obj);
        AbstractMap abstractMap = (AbstractMap) obj;
        try {
            for (SQLiteTransactionListener onRollback : abstractMap.values()) {
                onRollback.onRollback();
            }
        } finally {
            abstractMap.clear();
            this.A01.set(Boolean.FALSE);
        }
    }
}
