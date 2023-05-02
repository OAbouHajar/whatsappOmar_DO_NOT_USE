package e;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* compiled from: XFMFile */
public final class c0 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1622a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Looper looper, int i2) {
        super(looper);
        this.f1622a = i2;
    }

    public final void handleMessage(Message message) {
        switch (this.f1622a) {
            case 0:
                int i2 = message.what;
                if (i2 != 3) {
                    if (i2 == 8) {
                        List list = (List) message.obj;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            i iVar = (i) list.get(i3);
                            Picasso picasso = iVar.f1648b;
                            picasso.getClass();
                            b bVar = iVar.f1657k;
                            ArrayList arrayList = iVar.f1658l;
                            boolean z2 = true;
                            boolean z3 = arrayList != null && !arrayList.isEmpty();
                            if (bVar == null && !z3) {
                                z2 = false;
                            }
                            if (z2) {
                                Uri uri = iVar.f1653g.uri;
                                Exception exc = iVar.f1662p;
                                Bitmap bitmap = iVar.f1659m;
                                Picasso.LoadedFrom loadedFrom = iVar.f1661o;
                                if (bVar != null) {
                                    picasso.b(bitmap, loadedFrom, bVar, exc);
                                }
                                if (z3) {
                                    int size2 = arrayList.size();
                                    for (int i4 = 0; i4 < size2; i4++) {
                                        picasso.b(bitmap, loadedFrom, (b) arrayList.get(i4), exc);
                                    }
                                }
                                Picasso.Listener listener = picasso.f1536a;
                                if (!(listener == null || exc == null)) {
                                    listener.onImageLoadFailed(picasso, uri, exc);
                                }
                            }
                        }
                        return;
                    } else if (i2 == 13) {
                        List list2 = (List) message.obj;
                        int size3 = list2.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            b bVar2 = (b) list2.get(i5);
                            Picasso picasso2 = bVar2.f1605a;
                            picasso2.getClass();
                            Bitmap d2 = MemoryPolicy.a(bVar2.f1609e) ? picasso2.d(bVar2.f1613i) : null;
                            if (d2 != null) {
                                Picasso.LoadedFrom loadedFrom2 = Picasso.LoadedFrom.MEMORY;
                                picasso2.b(d2, loadedFrom2, bVar2, (Exception) null);
                                if (picasso2.f1549n) {
                                    String a2 = bVar2.f1606b.a();
                                    o0.f("Main", "completed", a2, "from " + loadedFrom2);
                                }
                            } else {
                                picasso2.c(bVar2);
                                if (picasso2.f1549n) {
                                    o0.e("Main", "resumed", bVar2.f1606b.a());
                                }
                            }
                        }
                        return;
                    } else {
                        throw new AssertionError("Unknown handler message received: " + message.what);
                    }
                } else {
                    b bVar3 = (b) message.obj;
                    if (bVar3.f1605a.f1549n) {
                        o0.f("Main", "canceled", bVar3.f1606b.a(), "target got garbage collected");
                    }
                    bVar3.f1605a.a(bVar3.d());
                    return;
                }
            default:
                sendMessageDelayed(obtainMessage(), 1000);
                return;
        }
    }
}
