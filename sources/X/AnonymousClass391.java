package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.391  reason: invalid class name */
public class AnonymousClass391 {
    public Uri A00;
    public C15830rv A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Long A0K;
    public Long A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public ArrayList A0Q;
    public ArrayList A0R;
    public List A0S;
    public List A0T;
    public final Context A0U;

    public AnonymousClass391(Context context) {
        this.A0U = context;
    }

    public Intent A00() {
        Intent A092 = C13680ns.A09();
        A092.setClassName(this.A0U.getPackageName(), "com.obwhatsapp.contact.picker.ContactPicker");
        Boolean bool = this.A0D;
        if (bool != null) {
            A092.putExtra("send", bool);
        }
        Boolean bool2 = this.A0F;
        if (bool2 != null) {
            A092.putExtra("skip_preview", bool2);
        }
        String str = this.A0N;
        if (str != null) {
            A092.putExtra("file_path", str);
        }
        ArrayList arrayList = this.A0R;
        if (arrayList != null) {
            A092.putExtra("message_types", arrayList);
        }
        Boolean bool3 = this.A02;
        if (bool3 != null) {
            A092.putExtra("block_contact", bool3);
        }
        ArrayList arrayList2 = this.A0Q;
        if (arrayList2 != null) {
            A092.putExtra("blocked_list", arrayList2);
        }
        String str2 = this.A0P;
        if (str2 != null) {
            A092.setType(str2);
        }
        String str3 = this.A0O;
        if (str3 != null) {
            A092.putExtra("android.intent.extra.TEXT", str3);
        }
        Boolean bool4 = this.A05;
        if (bool4 != null) {
            A092.putExtra("forward", bool4);
        }
        C15830rv r3 = this.A01;
        if (!(r3 == null && this.A0M == null)) {
            String str4 = this.A0M;
            if (str4 == null) {
                str4 = C16030sJ.A03(r3);
            }
            A092.putExtra("forward_jid", str4);
        }
        List list = this.A0T;
        if (list != null) {
            A092.putExtra("jids", C16030sJ.A06(list));
        }
        Long l2 = this.A0L;
        if (l2 != null) {
            A092.putExtra("forward_video_duration", l2);
        }
        Integer num = this.A0J;
        if (num != null) {
            A092.putExtra("forward_text_length", num);
        }
        Integer num2 = this.A0H;
        if (num2 != null) {
            A092.putExtra("forward_messages_becoming_frequently_forwarded", num2);
        }
        Boolean bool5 = this.A08;
        if (bool5 != null) {
            A092.putExtra("is_forwarded", bool5);
        }
        Boolean bool6 = this.A06;
        if (bool6 != null) {
            A092.putExtra("forward_ctwa", bool6);
        }
        Boolean bool7 = this.A07;
        if (bool7 != null) {
            A092.putExtra("forward_highly_forwarded", bool7);
        }
        Boolean bool8 = this.A09;
        if (bool8 != null) {
            A092.putExtra("is_voice_status_forward_allowed", bool8);
        }
        Boolean bool9 = this.A0E;
        if (bool9 != null) {
            A092.putExtra("set_group_icon", bool9);
        }
        Long l3 = this.A0K;
        if (l3 != null) {
            A092.putExtra("message_row_id", l3);
        }
        if (this.A0S != null) {
            Bundle A0D2 = C13690nt.A0D();
            AnonymousClass1yL.A0A(A0D2, this.A0S);
            A092.putExtra("message_keys", A0D2);
        }
        Boolean bool10 = this.A04;
        if (bool10 != null) {
            A092.putExtra("email_history", bool10);
        }
        Boolean bool11 = this.A03;
        if (bool11 != null) {
            A092.putExtra("call_picker", bool11);
        }
        Boolean bool12 = this.A0C;
        if (bool12 != null) {
            A092.putExtra("request_sync", bool12);
        }
        Boolean bool13 = this.A0B;
        if (bool13 != null) {
            A092.putExtra("request_out_contact_sync", bool13);
        }
        Uri uri = this.A00;
        if (uri != null) {
            A092.putExtra("android.intent.extra.STREAM", uri);
        }
        Boolean bool14 = this.A0G;
        if (bool14 != null) {
            A092.putExtra("status_chip_clicked", bool14);
        }
        Boolean bool15 = this.A0A;
        if (bool15 != null) {
            A092.putExtra("multi_select_ddm", bool15);
        }
        Integer num3 = this.A0I;
        if (num3 != null) {
            A092.putExtra("dm_duration", num3);
        }
        return A092;
    }
}
