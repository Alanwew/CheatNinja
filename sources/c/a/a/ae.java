package c.a.a;

import android.content.DialogInterface;
/* loaded from: classes.dex */
class ae implements DialogInterface.OnClickListener {
    private static int[] Z = {7079085, 49432334, 30112671, 57252851};

    /* renamed from: a  reason: collision with root package name */
    private final aa f15a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(aa aaVar) {
        this.f15a = aaVar;
    }

    private static String o(String str) {
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                switch (i % 4) {
                    case 0:
                        sb.append((char) (charArray[i] ^ 50875));
                        int i2 = Z[1];
                        if (i2 >= 0 && i2 % (79240835 ^ i2) == 0) {
                            break;
                        }
                        break;
                    case 1:
                        sb.append((char) (charArray[i] ^ 48466));
                        int i3 = Z[2];
                        if (i3 >= 0 && (i3 & (31048231 ^ i3)) != 145816) {
                        }
                        break;
                    case 2:
                        sb.append((char) (charArray[i] ^ 43921));
                        int i4 = Z[3];
                        if (i4 >= 0) {
                            do {
                            } while ((i4 & (72497991 ^ i4)) <= 0);
                        }
                    default:
                        sb.append((char) (charArray[i] ^ 65535));
                        int i5 = Z[0];
                        if (i5 >= 0 && (i5 & (15001048 ^ i5)) != 524325) {
                        }
                        break;
                }
            }
            return sb.toString();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
    }
}
