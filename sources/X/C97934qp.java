package X;

import android.os.Parcel;

/* renamed from: X.4qp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C97934qp implements C108405Nv {
    public final /* synthetic */ AnonymousClass3WU A00;

    public /* synthetic */ C97934qp(AnonymousClass3WU r1) {
        this.A00 = r1;
    }

    public final void A4O(Object obj, Object obj2) {
        C66273Ys r3 = new C66273Ys((C14370p3) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        obtain.writeStrongBinder(r3);
        ((C92064gx) ((C15770rp) obj).A01()).A00(11, obtain);
    }
}
