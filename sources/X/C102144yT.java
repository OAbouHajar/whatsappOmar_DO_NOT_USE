package X;

import android.graphics.Bitmap;
import com.obwhatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.4yT  reason: invalid class name and case insensitive filesystem */
public class C102144yT implements AnonymousClass2OV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2BE A01;
    public final /* synthetic */ StorageUsageMediaPreviewView A02;
    public final /* synthetic */ String A03;

    public C102144yT(AnonymousClass2BE r1, StorageUsageMediaPreviewView storageUsageMediaPreviewView, String str, int i2) {
        this.A02 = storageUsageMediaPreviewView;
        this.A01 = r1;
        this.A00 = i2;
        this.A03 = str;
    }

    public String AGT() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A01.A02);
        return AnonymousClass000.A0h(this.A03, A0o);
    }

    public Bitmap AKB() {
        Bitmap Agi = this.A01.Agi(this.A00);
        return Agi == null ? StorageUsageMediaPreviewView.A0B : Agi;
    }
}
