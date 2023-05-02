package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0Aj;
import X.AnonymousClass20I;
import X.AnonymousClass20R;
import X.AnonymousClass29Q;
import X.AnonymousClass2KC;
import X.AnonymousClass32I;
import X.AnonymousClass384;
import X.AnonymousClass4E6;
import X.AnonymousClass4MI;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14550pN;
import X.C25791Ld;
import X.C34771kq;
import X.C40651uT;
import X.C41911wr;
import X.C42821yj;
import X.C85174Nk;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class IDxFCallbackShape339S0100000_1_I1 implements AnonymousClass20R {
    public Object A00;
    public final int A01;

    public IDxFCallbackShape339S0100000_1_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AQu(Exception exc) {
        if (this.A01 == 0) {
            C85174Nk r2 = (C85174Nk) this.A00;
            WebPagePreviewView webPagePreviewView = r2.A05;
            webPagePreviewView.setImageProgressBarVisibility(false);
            webPagePreviewView.setImageThumbVisibility(true);
            AnonymousClass4E6 r1 = r2.A02;
            if (exc instanceof IOException) {
                ((C14550pN) r1.A00.A22).A05.A0A(R.string.str09b0, 0);
            }
        }
    }

    public void ARL(File file, String str, byte[] bArr) {
        String str2;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                C85174Nk r2 = (C85174Nk) obj;
                WebPagePreviewView webPagePreviewView = r2.A05;
                webPagePreviewView.setImageProgressBarVisibility(false);
                webPagePreviewView.setImageThumbVisibility(true);
                if (file == null) {
                    str2 = "ConversationShellWebPagePreviewController/onFileReceived/gif is null";
                    break;
                } else {
                    C42821yj r4 = r2.A02.A00;
                    r4.A22.Ag3(AnonymousClass384.A00((Activity) r4.A22, r4.A37, r4.A2C.A0D, file, Collections.singletonList(r4.A33)), 27);
                    return;
                }
            case 1:
                AnonymousClass32I r22 = (AnonymousClass32I) obj;
                r22.A01 = null;
                if (file == null) {
                    Log.w(C13680ns.A0h("gif/preview/holder file is null for ", str));
                    return;
                } else if (str.equals(r22.A02)) {
                    if (bArr != null) {
                        r22.A04.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, C25791Ld.A07));
                    }
                    AnonymousClass4MI r42 = r22.A09;
                    try {
                        C41911wr A012 = C41911wr.A01(ParcelFileDescriptor.open(C13700nu.A0D(file.getAbsolutePath()), 268435456), false);
                        r42.A01 = A012;
                        AnonymousClass0Aj A06 = A012.A06(r42.A02.getContext());
                        r42.A00 = A06;
                        A06.start();
                    } catch (IOException e2) {
                        Log.e("gif/loading/io-exception", e2);
                    }
                    r42.A03.setImageDrawable(r42.A00);
                    r22.A04.setVisibility(8);
                    return;
                } else {
                    return;
                }
            default:
                ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I0 = (ViewOnClickCListenerShape0S0200000_I0) obj;
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) viewOnClickCListenerShape0S0200000_I0.A00;
                textStatusComposerActivity.A0f.setImageProgressBarVisibility(false);
                ((View) viewOnClickCListenerShape0S0200000_I0.A01).setVisibility(0);
                if (file == null) {
                    str2 = "textstatus/gif-preview/file is null";
                    break;
                } else {
                    Uri fromFile = Uri.fromFile(C13700nu.A0D(file.getAbsolutePath()));
                    ArrayList A0u = AnonymousClass000.A0u();
                    A0u.add(fromFile);
                    String A05 = C40651uT.A05(textStatusComposerActivity.A0a.getStringText());
                    AnonymousClass20I r1 = new AnonymousClass20I(fromFile);
                    r1.A0D(A05);
                    r1.A0C((byte) 13);
                    AnonymousClass29Q r3 = new AnonymousClass29Q(r1);
                    AnonymousClass2KC r23 = new AnonymousClass2KC(textStatusComposerActivity);
                    r23.A0E = A0u;
                    r23.A0A = C34771kq.A00.getRawString();
                    r23.A02 = 9;
                    r23.A0I = true;
                    Bundle A0D = C13690nt.A0D();
                    r3.A02(A0D);
                    r23.A08 = A0D;
                    textStatusComposerActivity.Ag3(r23.A00(), 1);
                    return;
                }
        }
        Log.e(str2);
    }
}
