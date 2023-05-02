package c;

import X.C30011bb;
import X.C57012pj;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import com.cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.j;
import com.obwhatsapp.yo.mediapreviewbtn;
import com.obwhatsapp.yo.p0;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f179a;

    /* renamed from: b  reason: collision with root package name */
    public final KeyEvent.Callback f180b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f181c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f182d;

    public /* synthetic */ a(KeyEvent.Callback callback, Object obj, Object obj2, int i2) {
        this.f179a = i2;
        this.f180b = callback;
        this.f181c = obj;
        this.f182d = obj2;
    }

    public final void onClick(View view) {
        int i2 = this.f179a;
        Object obj = this.f182d;
        Object obj2 = this.f181c;
        KeyEvent.Callback callback = this.f180b;
        switch (i2) {
            case 0:
                DefaultErrorActivity defaultErrorActivity = (DefaultErrorActivity) callback;
                int i3 = DefaultErrorActivity.f219a;
                defaultErrorActivity.getClass();
                CustomActivityOnCrash.restartApplicationWithIntent(defaultErrorActivity, new Intent(defaultErrorActivity, (Class) obj2), (CustomActivityOnCrash.EventListener) obj);
                return;
            case 1:
                View.OnClickListener onClickListener = (View.OnClickListener) obj2;
                View view2 = (View) obj;
                try {
                    CustomAlertDialogBuilder title = new CustomAlertDialogBuilder((MediaComposerActivity) callback).setTitle((CharSequence) yo.getString(Deobfuscator$app$Custom.getString(-10383576628673L)));
                    title.setMessage((CharSequence) yo.getString(Deobfuscator$app$Custom.getString(-10469475974593L)) + Deobfuscator$app$Custom.getString(-10546785385921L)).setNegativeButton(17039360, (DialogInterface.OnClickListener) new x(4)).setPositiveButton((CharSequence) yo.getString(Deobfuscator$app$Custom.getString(-10555375320513L)), (DialogInterface.OnClickListener) new j(onClickListener, view2, 1)).show();
                    return;
                } catch (Exception e2) {
                    onClickListener.onClick(view2);
                    return;
                }
            case 2:
                p0.a((TextView) callback, (C57012pj) obj2, (Context) obj);
                return;
            default:
                mediapreviewbtn mediapreviewbtn = (mediapreviewbtn) callback;
                int i4 = mediapreviewbtn.f822a;
                mediapreviewbtn.getClass();
                ((C30011bb) obj2).prevon = true;
                ((View.OnClickListener) obj).onClick(mediapreviewbtn);
                return;
        }
    }
}
