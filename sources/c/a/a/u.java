package c.a.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
/* loaded from: classes.dex */
class u implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    private final q f52a;

    /* renamed from: b  reason: collision with root package name */
    private final AlertDialog f53b;
    private static int[] az = {11547839, 88993052, 20132332, 28071020};
    private static int[] ay = {67766230, 77503766, 7883775, 90379073};

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(q qVar, AlertDialog alertDialog) {
        this.f52a = qVar;
        this.f53b = alertDialog;
    }

    private static String t(String str) {
        int i;
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i2 = 0; i2 < charArray.length; i2++) {
                switch (i2 % 4) {
                    case 0:
                        sb.append((char) (charArray[i2] ^ 13709));
                        int i3 = ay[1];
                        if (i3 >= 0 && i3 % (37847156 ^ i3) != 77503766) {
                        }
                        break;
                    case 1:
                        sb.append((char) (charArray[i2] ^ 19526));
                        int i4 = ay[2];
                        if (i4 >= 0 && i4 % (90369 ^ i4) == 0) {
                            break;
                        }
                        break;
                    case 2:
                        sb.append((char) (charArray[i2] ^ 16804));
                        int i5 = ay[3];
                        if (i5 >= 0) {
                            do {
                                i = i5 & (24981242 ^ i5);
                                i5 = 67244289;
                            } while (i != 67244289);
                        }
                    default:
                        sb.append((char) (charArray[i2] ^ 65535));
                        int i6 = ay[0];
                        if (i6 >= 0) {
                            do {
                            } while ((i6 & (65669480 ^ i6)) <= 0);
                        }
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8 A[LOOP:1: B:19:0x00a8->B:20:0x00af, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[ORIG_RETURN, RETURN] */
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
            android.app.AlertDialog r0 = r3.f53b
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            android.view.Window r0 = r0.getWindow()
            r1 = 2130968582(0x7f040006, float:1.7545822E38)
            r0.setBackgroundDrawableResource(r1)
            int[] r6 = c.a.a.u.az
            r7 = 0
            r7 = r6[r7]
            if (r7 < 0) goto L2b
            r6 = 4700265(0x47b869, float:6.586474E-39)
            r6 = r6 ^ r7
            int r6 = r7 % r6
            r7 = 11547839(0xb034bf, float:1.6181969E-38)
            if (r6 != r7) goto L2b
            goto L2b
        L2b:
            android.app.AlertDialog r0 = r3.f53b
            r1 = -1
            android.widget.Button r0 = r0.getButton(r1)
            c.a.a.q r1 = r3.f52a
            c.a.a.g r1 = c.a.a.q.a(r1)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            int[] r6 = c.a.a.u.az
            r7 = 1
            r7 = r6[r7]
            if (r7 < 0) goto L59
            r6 = 21147926(0x142b116, float:3.5759225E-38)
            r6 = r6 ^ r7
            int r6 = r7 % r6
            r7 = 20877586(0x13e9112, float:3.500157E-38)
            if (r6 != r7) goto L59
            goto L59
        L59:
            android.app.AlertDialog r0 = r3.f53b
            r1 = -2
            android.widget.Button r0 = r0.getButton(r1)
            c.a.a.q r1 = r3.f52a
            c.a.a.g r1 = c.a.a.q.a(r1)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            int[] r6 = c.a.a.u.az
            r7 = 2
            r7 = r6[r7]
            if (r7 < 0) goto L87
        L7a:
            r6 = 50705252(0x305b364, float:3.9291118E-37)
            r6 = r6 ^ r7
            r6 = r7 & r6
            r7 = 3276936(0x320088, float:4.591965E-39)
            if (r6 == r7) goto L87
            goto L7a
        L87:
            android.app.AlertDialog r0 = r3.f53b
            r1 = -3
            android.widget.Button r0 = r0.getButton(r1)
            c.a.a.q r1 = r3.f52a
            c.a.a.g r1 = c.a.a.q.a(r1)
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            int[] r6 = c.a.a.u.az
            r7 = 3
            r7 = r6[r7]
            if (r7 < 0) goto Lb2
        La8:
            r6 = 53666827(0x332e40b, float:5.257128E-37)
            r6 = r6 ^ r7
            int r6 = r7 % r6
            if (r6 > 0) goto Lb2
            goto La8
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.u.onShow(android.content.DialogInterface):void");
    }
}
