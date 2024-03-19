public class Showroom02 {
    String merk;
    String tipe;
    int tahun;
    int top_acceleration;
    int top_power;

    public Showroom02(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public static int maxAcceleration(Showroom02[] mobil, int left, int right) {
        if (left == right) {
            return mobil[left].top_acceleration;
        }

        int mid = (left + right) / 2;
        int maxLeft = maxAcceleration(mobil, left, mid);
        int maxRight = maxAcceleration(mobil, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }

    public static int minAcceleration(Showroom02[] mobil, int left, int right) {
        if (left == right) {
            return mobil[left].top_acceleration;
        }

        int mid = (left + right) / 2;
        int minLeft = minAcceleration(mobil, left, mid);
        int minRight = minAcceleration(mobil, mid + 1, right);

        return Math.min(minLeft, minRight);
    }

    public static double averagePower(Showroom02[] mobil) {
        int totalPower = 0;
        for (Showroom02 car : mobil) {
            totalPower += car.top_power;
        }
        return (double) totalPower / mobil.length;
    }

    public static void main(String[] args) {
        Showroom02[] mobil = {
                new Showroom02("BMW", "M2 Coupe", 2016, 6816, 728),
                new Showroom02("Ford", "Fiesta ST", 2014, 3921, 575),
                new Showroom02("Nissan", "370Z", 2009, 4360, 657),
                new Showroom02("Subaru", "BRZ", 2014, 4058, 609),
                new Showroom02("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Showroom02("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Showroom02("Toyota", "86/GT86", 2014, 4180, 609),
                new Showroom02("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        int maxAcc = maxAcceleration(mobil, 0, mobil.length - 1);
        int minAcc = minAcceleration(mobil, 0, mobil.length - 1);
        double avgPower = averagePower(mobil);

        System.out.println("Top acceleration tertinggi: " + maxAcc);
        System.out.println("Top acceleration terendah: " + minAcc);
        System.out.println("Rata-rata top power: " + avgPower);
    }
}