package c.a.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
/* loaded from: classes.dex */
class af implements DialogInterface.OnShowListener {
    private static int[] o = {53471163, 83007379, 99673552, 22100130};
    private static int[] p = {32538948, 1367283, 2800220, 3987564};

    /* renamed from: a  reason: collision with root package name */
    private final aa f16a;

    /* renamed from: b  reason: collision with root package name */
    private final AlertDialog f17b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public af(aa aaVar, AlertDialog alertDialog) {
        this.f16a = aaVar;
        this.f17b = alertDialog;
    }

    private static String f(String str) {
        int i;
        int i2;
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i3 = 0; i3 < charArray.length; i3++) {
                switch (i3 % 4) {
                    case 0:
                        sb.append((char) (charArray[i3] ^ 5523));
                        int i4 = o[1];
                        if (i4 >= 0) {
                            do {
                                i = i4 % (87338332 ^ i4);
                                i4 = 23470581;
                            } while (i != 23470581);
                        }
                    case 1:
                        sb.append((char) (charArray[i3] ^ 12315));
                        int i5 = o[2];
                        if (i5 >= 0 && i5 % (61683011 ^ i5) != 99673552) {
                        }
                        break;
                    case 2:
                        sb.append((char) (charArray[i3] ^ 52395));
                        int i6 = o[3];
                        if (i6 >= 0 && (i6 & (42337270 ^ i6)) == 0) {
                            break;
                        }
                        break;
                    default:
                        sb.append((char) (charArray[i3] ^ 65535));
                        int i7 = o[0];
                        if (i7 >= 0) {
                            do {
                                i2 = i7 % (25936234 ^ i7);
                                i7 = 9158890;
                            } while (i2 != 9158890);
                        }
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[LOOP:2: B:14:0x007f->B:15:0x0086, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae A[LOOP:3: B:19:0x00ae->B:20:0x00b5, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050 A[LOOP:1: B:9:0x0050->B:10:0x0057, LOOP_START] */
    @Override // android.content.DialogInterface.OnShowListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onShow(android.content.DialogInterface r11) {
        /*
            r10 = this;
            r3 = r10
            r4 = r11
            r2 = 2130968583(0x7f040007, float:1.7545824E38)
            android.app.AlertDialog r0 = r3.f17b
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            android.view.Window r0 = r0.getWindow()
            r1 = 2130968582(0x7f040006, float:1.7545822E38)
            r0.setBackgroundDrawableResource(r1)
            int[] r6 = c.a.a.af.p
            r7 = 0
            r7 = r6[r7]
            if (r7 < 0) goto L2b
        L1e:
            r6 = 9244271(0x8d0e6f, float:1.2953983E-38)
            r6 = r6 ^ r7
            int r6 = r7 % r6
            r7 = 7533081(0x72f219, float:1.0556095E-38)
            if (r6 == r7) goto L2b
            goto L1e
        L2b:
            android.app.AlertDialog r0 = r3.f17b
            r1 = -1
            android.widget.Button r0 = r0.getButton(r1)
            c.a.a.aa r1 = r3.f16a
            c.a.a.z r1 = c.a.a.aa.a(r1)
            c.a.a.g r1 = c.a.a.z.a(r1)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            int[] r6 = c.a.a.af.p
            r7 = 1
            r7 = r6[r7]
            if (r7 < 0) goto L5a
        L50:
            r6 = 37696473(0x23f33d9, float:1.4047343E-37)
            r6 = r6 ^ r7
            int r6 = r7 % r6
            if (r6 > 0) goto L5a
            goto L50
        L5a:
            android.app.AlertDialog r0 = r3.f17b
            r1 = -2
            android.widget.Button r0 = r0.getButton(r1)
            c.a.a.aa r1 = r3.f16a
            c.a.a.z r1 = c.a.a.aa.a(r1)
            c.a.a.g r1 = c.a.a.z.a(r1)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            int[] r6 = c.a.a.af.p
            r7 = 2
            r7 = r6[r7]
            if (r7 < 0) goto L89
        L7f:
            r6 = 59764741(0x38ff005, float:8.45989E-37)
            r6 = r6 ^ r7
            r6 = r7 & r6
            if (r6 > 0) goto L89
            goto L7f
        L89:
            android.app.AlertDialog r0 = r3.f17b
            r1 = -3
            android.widget.Button r0 = r0.getButton(r1)
            c.a.a.aa r1 = r3.f16a
            c.a.a.z r1 = c.a.a.aa.a(r1)
            c.a.a.g r1 = c.a.a.z.a(r1)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            int[] r6 = c.a.a.af.p
            r7 = 3
            r7 = r6[r7]
            if (r7 < 0) goto Lb8
        Lae:
            r6 = 77988113(0x4a60111, float:3.902739E-36)
            r6 = r6 ^ r7
            int r6 = r7 % r6
            if (r6 > 0) goto Lb8
            goto Lae
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.af.onShow(android.content.DialogInterface):void");
    }
}
