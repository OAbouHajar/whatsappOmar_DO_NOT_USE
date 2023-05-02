package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass1yP;
import X.AnonymousClass1yV;
import X.AnonymousClass2F6;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14750ph;
import X.C15830rv;
import X.C16010sH;
import X.C204310c;
import X.C42821yj;
import X.C455529g;
import X.C54602hp;
import X.C56642oG;
import X.C88684av;
import X.C93524jL;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.RegisterPhone;
import com.obwhatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.util.Log;
import java.util.AbstractList;
import java.util.List;

public class IDxCListenerShape20S0300000_1_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape20S0300000_1_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str;
        if (this.A03 != 0) {
            SelectPhoneNumberDialog selectPhoneNumberDialog = (SelectPhoneNumberDialog) this.A00;
            Log.i("select-phone-number-dialog/use-clicked");
            C93524jL r4 = (C93524jL) ((AbstractList) this.A01).get(((C56642oG) this.A02).A00);
            AnonymousClass2F6 r3 = selectPhoneNumberDialog.A01;
            if (r3 != null) {
                RegisterPhone registerPhone = (RegisterPhone) r3;
                registerPhone.A0c.A02 = C13680ns.A0Y();
                registerPhone.A0R = r4.A00;
                String str2 = r4.A02;
                registerPhone.A0S = str2;
                registerPhone.A0E.A03.setText(str2);
                registerPhone.A0E.A02.setText(registerPhone.A0R);
                EditText editText = registerPhone.A0E.A03;
                String A0d = C13690nt.A0d(editText.getText());
                AnonymousClass00B.A06(A0d);
                editText.setSelection(A0d.length());
            }
            selectPhoneNumberDialog.A1C();
            return;
        }
        List list = (List) this.A01;
        C15830rv r2 = (C15830rv) this.A02;
        C001000l A0C = ((AnonymousClass01A) this.A00).A0C();
        if (A0C instanceof AnonymousClass1yP) {
            int i3 = ((C88684av) list.get(i2)).A00;
            C42821yj r42 = ((Conversation) ((AnonymousClass1yP) A0C)).A00;
            boolean z2 = false;
            if (i3 != R.id.menuitem_add_to_contacts && i3 != R.id.menuitem_add_to_existing_contact) {
                if (i3 == R.id.menuitem_view_business_profile) {
                    if (r2 != null) {
                        C16010sH A0A = C14530pL.A0K(r42).A07.A0A(r2);
                        AnonymousClass1yV r1 = r42.A22;
                        C455529g.A05((Activity) r1, r1.findViewById(R.id.transition_start), new C54602hp((Context) r42.A22).A00(R.string.str1dd7));
                        C14750ph.A0q().A0w((Context) r42.A22, A0A, C13680ns.A0a());
                    } else {
                        str = "conversation/view-business-profile/error no-resource";
                        Log.e(str);
                        return;
                    }
                } else if (i3 != R.id.menuitem_message_contact) {
                    String str3 = "conversation/call-contact/error no-resource";
                    if (i3 != R.id.button1) {
                        str3 = "conversation/call-contact/error no-resource";
                        if (i3 == R.id.menuitem_voice_call_contact) {
                            if (r2 != null) {
                                r42.A1R.A01((Context) r42.A22, C14530pL.A0K(r42).A07.A0A(r2), 8, false);
                                return;
                            }
                        } else if (i3 != R.id.menuitem_video_call_contact) {
                            return;
                        } else {
                            if (r2 != null) {
                                r42.A1R.A01((Context) r42.A22, C14530pL.A0K(r42).A07.A0A(r2), 8, true);
                                return;
                            }
                        }
                    } else if (r2 != null) {
                        C16010sH A0A2 = C14530pL.A0K(r42).A07.A0A(r2);
                        C204310c r12 = r42.A1R;
                        Context context = (Context) r42.A22;
                        com.obwhatsapp.yo.Conversation.showUserGrpMsgs(A0A2);
                        return;
                    }
                    Log.e(str3);
                    return;
                } else if (r2 != null) {
                    C16010sH A0A3 = C14530pL.A0K(r42).A07.A0A(r2);
                    AnonymousClass1yV r32 = r42.A22;
                    Context context2 = (Context) r32;
                    ((C14530pL) r32).A00.A08(context2, r42.A57.A0v(context2, A0A3), "Conversation:messageContact");
                } else {
                    str = "conversation/message-contact/error no-resource";
                    Log.e(str);
                    return;
                }
                r42.A22.finish();
            } else if (r2 != null) {
                C16010sH A08 = C14530pL.A0K(r42).A07.A08(r2);
                if (i3 == R.id.menuitem_add_to_contacts) {
                    z2 = true;
                }
                r42.A0c(A08, r2, z2);
            } else {
                Log.w("conversation/add-contact-failed");
                ((C14550pN) r42.A22).A05.A09(R.string.str0a29, 0);
            }
        }
    }
}
