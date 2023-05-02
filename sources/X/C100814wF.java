package X;

import android.graphics.Bitmap;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.4wF  reason: invalid class name and case insensitive filesystem */
public final class C100814wF implements C109245Rg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BusinessDirectoryMapViewActivity A01;
    public final /* synthetic */ C93714je A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ Map A05;

    public C100814wF(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity, C93714je r2, String str, List list, Map map, int i2) {
        this.A05 = map;
        this.A03 = str;
        this.A01 = businessDirectoryMapViewActivity;
        this.A00 = i2;
        this.A02 = r2;
        this.A04 = list;
    }

    public void ANg() {
        Map map = this.A05;
        String str = this.A03;
        Bitmap bitmap = C43201zV.A07;
        C18450wi.A0D(bitmap);
        map.put(str, bitmap);
        this.A01.A3A(this.A02, this.A04, this.A00);
    }

    public void ANh(Bitmap bitmap) {
        this.A05.put(this.A03, bitmap);
        this.A01.A3A(this.A02, this.A04, this.A00);
    }
}
