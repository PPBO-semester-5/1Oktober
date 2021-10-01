public class Main {
    public static void main (String[] args) {
        Luar l = new Luar();
        Luar.Dalam d = l.new Dalam();
        Luar.Dalam.Terdalam t = d.new Terdalam();

        l.cetakLuar();
        d.cetakDalam();
        t.cetakTerdalam();
    }
}

class Luar {
    int varLuar;
    void cetakLuar() {
        varTerdalam = 10;
        cetakTerdalam();
        System.out.println("cetak luar ...");
    }

    class Dalam {
        int varDalam;
        void cetakDalam() {
            varLuar = 10;
            cetakLuar();
            System.out.println("cetak dalam ...");
        }

        class Terdalam {
            int varTerdalam;
            void cetakTerdalam() {
                System.out.println("cetak terdalam ...");
            }
        }
    }
}
