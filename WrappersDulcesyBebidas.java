abstract class Bebida{
    private int serie;

    public Bebida(int serie){
        super();
        this.serie=serie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String beber();
}

class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }
    public String beber(){
        String b="sprite";
        return b;
    }

}

class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    public String beber(){
        String b="cocacola";
        return b;
    }

}

class BebidaWrapper{
    private Bebida bebida;
    public BebidaWrapper(Bebida bebida) {
        this.bebida = bebida;
    }
    public int getSerie() {
        return bebida.getSerie();
    }
    public String beber() {
        return bebida.beber();
}
    abstract class Dulce{
        private int serie;

        public Dulce(int serie){
            super();
            this.serie=serie;
        }
        public int getSerie(){
            return serie;
        }
        public abstract String comer();
    }

    class Super8 extends Dulce {
        public Super8(int serie){
            super(serie);
        }

        public String comer() {
            String b = "super8";
            return b;
        }
    }
    class Snickers extends Dulce {
        public Snickers(int serie){
            super(serie);
        }

        public String comer(){
            String b = "snickers";
            return b;
        }
    }
    class DulceWrapper{
        private Dulce dulce;
        public DulceWrapper(Dulce dulce) {
            this.dulce = dulce;
        }
        public int getSerie() {
            return dulce.getSerie();
        }
        public String comer() {
            return dulce.comer();
        }