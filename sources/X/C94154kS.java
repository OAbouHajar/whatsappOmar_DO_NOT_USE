package X;

import android.view.View;
import com.obwhatsapp.storage.StorageUsageMediaPreviewView;
import java.util.List;

/* renamed from: X.4kS  reason: invalid class name and case insensitive filesystem */
public class C94154kS implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ StorageUsageMediaPreviewView A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C94154kS(StorageUsageMediaPreviewView storageUsageMediaPreviewView, String str, List list, int i2) {
        this.A01 = storageUsageMediaPreviewView;
        this.A03 = list;
        this.A00 = i2;
        this.A02 = str;
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A01.setPreviewMediaItemsInternal(this.A03, this.A00, this.A02);
        view.removeOnLayoutChangeListener(this);
    }
}
