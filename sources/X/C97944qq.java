package X;

import android.os.Parcel;

/* renamed from: X.4qq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C97944qq implements C108405Nv {
    public final /* synthetic */ AnonymousClass3WU A00;

    public /* synthetic */ C97944qq(AnonymousClass3WU r1) {
        this.A00 = r1;
    }

    public final void A4O(Object obj, Object obj2) {
        C66263Yr r3 = new C66263Yr((C14370p3) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        obtain.writeStrongBinder(r3);
        ((C92064gx) ((C15770rp) obj).A01()).A00(2, obtain);
    }
}
