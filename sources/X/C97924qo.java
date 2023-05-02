package X;

import android.os.Parcel;

/* renamed from: X.4qo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C97924qo implements C108405Nv {
    public final /* synthetic */ AnonymousClass3X5 A00;

    public /* synthetic */ C97924qo(AnonymousClass3X5 r1) {
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    public final void A4O(Object obj, Object obj2) {
        AnonymousClass3X5 r4 = this.A00;
        C14370p3 r7 = (C14370p3) obj2;
        C92094h0 r1 = (C92094h0) ((C15770rp) obj).A01();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r1.A01);
        obtain.writeInt(1);
        r4.writeToParcel(obtain, 0);
        try {
            r1.A00.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            r7.A01((Object) null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
