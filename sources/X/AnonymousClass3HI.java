package X;

import android.content.res.Resources;
import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape0S2201000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.media.download.service.MediaDownloadService;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: X.3HI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HI implements AnonymousClass1WE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MediaDownloadService A01;

    public /* synthetic */ AnonymousClass3HI(MediaDownloadService mediaDownloadService, int i2) {
        this.A01 = mediaDownloadService;
        this.A00 = i2;
    }

    public final void accept(Object obj) {
        boolean z2;
        Resources resources;
        int i2;
        String quantityString;
        Resources resources2;
        int i3;
        int i4;
        Object[] objArr;
        MediaDownloadService mediaDownloadService = this.A01;
        int i5 = this.A00;
        AbstractList abstractList = (AbstractList) obj;
        if (!abstractList.isEmpty()) {
            if (abstractList.isEmpty()) {
                quantityString = null;
            } else {
                Object obj2 = abstractList.get(0);
                if (!abstractList.isEmpty()) {
                    byte b2 = ((C16740tZ) abstractList.get(0)).A10;
                    Iterator it = abstractList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C13680ns.A0V(it).A10 != b2) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (obj2 instanceof C38631rA) {
                        resources = mediaDownloadService.getResources();
                        i2 = R.plurals.plurals0041;
                    } else if (obj2 instanceof C38711rI) {
                        resources = mediaDownloadService.getResources();
                        i2 = R.plurals.plurals0043;
                    }
                    int size = abstractList.size();
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1M(objArr2, abstractList.size(), 0);
                    quantityString = resources.getQuantityString(i2, size, objArr2);
                }
                resources = mediaDownloadService.getResources();
                i2 = R.plurals.plurals0042;
                int size2 = abstractList.size();
                Object[] objArr22 = new Object[1];
                AnonymousClass000.A1M(objArr22, abstractList.size(), 0);
                quantityString = resources.getQuantityString(i2, size2, objArr22);
            }
            String str = null;
            if (!abstractList.isEmpty()) {
                C16730tY r7 = (C16730tY) abstractList.get(0);
                if (!(r7 instanceof C38631rA)) {
                    C15830rv r2 = r7.A11.A00;
                    if (r2 != null) {
                        String A03 = C40651uT.A03(mediaDownloadService.A01.A08(mediaDownloadService.A00.A0A(r2)));
                        if (abstractList.size() == 1) {
                            str = C13680ns.A0d(mediaDownloadService, A03, new Object[1], 0, R.string.str0e2e);
                        } else {
                            resources2 = mediaDownloadService.getResources();
                            i3 = R.plurals.plurals00ea;
                            i4 = abstractList.size() - 1;
                            objArr = new Object[2];
                            objArr[0] = A03;
                        }
                    }
                } else if (abstractList.size() == 1) {
                    str = r7.A14();
                } else {
                    resources2 = mediaDownloadService.getResources();
                    i3 = R.plurals.plurals00e9;
                    i4 = abstractList.size() - 1;
                    objArr = new Object[2];
                    objArr[0] = r7.A14();
                }
                AnonymousClass000.A1M(objArr, abstractList.size() - 1, 1);
                str = resources2.getQuantityString(i3, i4, objArr);
            }
            ((Handler) mediaDownloadService.A09.get()).post(new RunnableRunnableShape0S2201000_I0(mediaDownloadService, abstractList, quantityString, str, i5, 1));
            return;
        }
        mediaDownloadService.A01.A03(mediaDownloadService.A02.A00, C13700nu.A02("com.obwhatsapp.media.download.service.MediaDownloadService.DOWNLOADS_COMPLETED"), MediaDownloadService.class);
    }
}
