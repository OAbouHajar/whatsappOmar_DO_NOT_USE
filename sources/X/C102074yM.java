package X;

import android.database.ContentObserver;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4yM  reason: invalid class name and case insensitive filesystem */
public class C102074yM implements AnonymousClass2BC {
    public final AnonymousClass2BC A00;
    public final List A01;

    public C102074yM(AnonymousClass2BC r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public HashMap AAC() {
        return this.A00.AAC();
    }

    public AnonymousClass2BF ADR(int i2) {
        List list = this.A01;
        return i2 < list.size() ? (AnonymousClass2BF) list.get(i2) : this.A00.ADR(i2 - list.size());
    }

    public void AcE() {
        this.A00.AcE();
    }

    public void close() {
        this.A00.close();
    }

    public int getCount() {
        return this.A00.getCount() + this.A01.size();
    }

    public boolean isEmpty() {
        return this.A00.isEmpty() && this.A01.isEmpty();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.A00.registerContentObserver(contentObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.A00.unregisterContentObserver(contentObserver);
    }
}
