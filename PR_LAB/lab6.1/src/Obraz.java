import  java.util.Random;


class Obraz {

    private int size_n;
    private int size_m;
    private char[][] tab;
    private int[] histogram;

    public void setHistogram(int histogram, int i) {
        this.histogram[i] = histogram;
    }

    public Obraz(int n, int m) {

        this.size_n = n;
        this.size_m = m;
        tab = new char[n][m];

        final Random random = new Random();

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                tab[i][j] = (char)(random.nextInt(94)+33);  // ascii 33-127
            }
        }

        histogram = new int[94];
        clear_histogram();
    }

    public char[][] getTab() {
        return tab;
    }

    public void setTab(char[][] tab) {
        this.tab = tab;
    }

    public void clear_histogram(){

        for(int i=0;i<94;i++) histogram[i]=0;

    }

    public void calculate_histogram(){

        for(int i=0;i<size_n;i++) {
            for(int j=0;j<size_m;j++) {

                for(int k=0;k<94;k++) {
                    if(tab[i][j] == (char)(k+33)) {
                        histogram[k]++;
                    }
                }

            }
        }

    }

    public void print_histogram(){
        for(int i = 0; i < this.size_n; i++)
        {
        for(int j=0;j<this.size_m;j++) {
            System.out.print(tab[i][j]+" ");
        }
        System.out.print("\n");
    }
        System.out.print("\n\n");


    }

}