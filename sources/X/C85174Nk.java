package X;

import android.content.Context;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;

/* renamed from: X.4Nk  reason: invalid class name and case insensitive filesystem */
public class C85174Nk {
    public boolean A00;
    public final C16180sb A01;
    public final AnonymousClass4E6 A02;
    public final C41681wN A03;
    public final C16320sq A04;
    public final WebPagePreviewView A05;

    public C85174Nk(Context context, C16180sb r5, AnonymousClass4E6 r6, C41681wN r7, C16320sq r8, boolean z2) {
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A01 = r5;
        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context);
        this.A05 = webPagePreviewView;
        this.A00 = z2;
        webPagePreviewView.setImageProgressBarVisibility(false);
        webPagePreviewView.setImageCancelClickListener(new ViewOnClickCListenerShape5S0100000_I1_1(this, 18));
        webPagePreviewView.setImageContentClickListener(new ViewOnClickCListenerShape5S0100000_I1_1(this, 19));
        webPagePreviewView.A01();
    }
}
