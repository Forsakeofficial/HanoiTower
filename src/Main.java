class Main {

    public static int count=0;

    public static int disk = 3;

    public static void main(String[] args) {
        hanoiTower(disk, "Wieży 1", "Wieży 2", "Wieży 3");
        count++;
        System.out.println("Liczba dysków:" + disk + "\nLiczba kroków: " +count);
    }

    public static void hanoiTower(int disk, String location_from, String location_middle, String location_to){

        if(disk==1){
            System.out.println("Dysk "+disk+" przeniesiony z "+location_from+" do "+location_to);
            return;
        }

        hanoiTower(disk-1,location_from,location_to,location_middle);
        count++;
        System.out.println("Dysk "+disk+" przeniesiony z "+location_from+" do "+location_to);
        hanoiTower(disk-1,location_middle,location_from,location_to);
        count++;

    }
}