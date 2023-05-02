package X;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.car.app.CarAppService;
import androidx.car.app.ICarHost;

/* renamed from: X.0ag  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C07140ag implements C12290k9 {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Configuration A01;
    public final /* synthetic */ CarAppService.AnonymousClass1 A02;
    public final /* synthetic */ ICarHost A03;

    public /* synthetic */ C07140ag(Intent intent, Configuration configuration, CarAppService.AnonymousClass1 r3, ICarHost iCarHost) {
        this.A02 = r3;
        this.A03 = iCarHost;
        this.A01 = configuration;
        this.A00 = intent;
    }

    public final Object A86() {
        throw AnonymousClass000.A0W("getCurrentSession");
    }
}
